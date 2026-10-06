package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mrec_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A14154MEnvMaqCod = httpContext.GetPar( "MEnvMaqCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A14154MEnvMaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
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
         gxload_7( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmrec_p") == 0 )
      {
         gxnrgridmrec_p_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recibir datos de las maquinas", ""), (short)(0)) ;
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

   public void gxnrgridmrec_p_newrow_invoke( )
   {
      nRC_GXsfl_108 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_108"))) ;
      nGXsfl_108_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_108_idx"))) ;
      sGXsfl_108_idx = httpContext.GetPar( "sGXsfl_108_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmrec_p_newrow( ) ;
      /* End function gxnrGridmrec_p_newrow_invoke */
   }

   public mrec_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mrec_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mrec_impl.class ));
   }

   public mrec_impl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMEnvEst = new HTMLChoice();
      chkMPRecEr = UIFactory.getCheckbox(this);
      cmbMPRecEst = new HTMLChoice();
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
      if ( cmbMEnvEst.getItemCount() > 0 )
      {
         A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValidValue(GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Values", cmbMEnvEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Recibir datos de las maquinas", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Ingenieria\\MRec.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvOrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvOrd_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEnvOrd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14152MEnvOrd), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvOrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEnvOrd_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion de Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvMaqCod_Internalname, httpContext.getMessage( "máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvMaqCod_Internalname, GXutil.rtrim( A14154MEnvMaqCod), GXutil.rtrim( localUtil.format( A14154MEnvMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEnvMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvMaqDsc_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvMaqDsc_Internalname, GXutil.rtrim( A14164MEnvMaqDsc), GXutil.rtrim( localUtil.format( A14164MEnvMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEnvMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvIni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvIni_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMEnvIni_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvIni_Internalname, localUtil.ttoc( A14158MEnvIni, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14158MEnvIni, "99/99/99 99:99:99.999"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvIni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEnvIni_Enabled, 0, "text", "", 21, "chr", 1, "row", 21, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMEnvIni_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMEnvIni_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvFin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvFin_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtMEnvFin_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvFin_Internalname, localUtil.ttoc( A14157MEnvFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A14157MEnvFin, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvFin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEnvFin_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtMEnvFin_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtMEnvFin_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Ingenieria\\MRec.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMEnvEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMEnvEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMEnvEst, cmbMEnvEst.getInternalname(), GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)), 1, cmbMEnvEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbMEnvEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_Ingenieria\\MRec.htm");
      cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Values", cmbMEnvEst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMEnvInt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMEnvInt_Internalname, httpContext.getMessage( "Seg.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMEnvInt_Internalname, GXutil.ltrim( localUtil.ntoc( A14162MEnvInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMEnvInt_Enabled!=0) ? localUtil.format( A14162MEnvInt, "ZZZZZZ9.99") : localUtil.format( A14162MEnvInt, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMEnvInt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMEnvInt_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRecHdr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRecHdr_Internalname, httpContext.getMessage( "Hdr Recibida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRecHdr_Internalname, GXutil.rtrim( A14686MRecHdr), GXutil.rtrim( localUtil.format( A14686MRecHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRecHdr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMRecHdr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Ingenieria\\Hdr", "left", true, "", "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divPtable_Internalname, 1, 0, "px", 0, "px", "LevelTable", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlep_Internalname, httpContext.getMessage( "Valores reportados de los parámetros", ""), "", "", lblTitlep_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridmrec_p( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Ingenieria\\MRec.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridmrec_p( )
   {
      /*  Grid Control  */
      startgridcontrol108( ) ;
      nGXsfl_108_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1895 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1895 = (short)(1) ;
            scanStart1TE1895( ) ;
            while ( RcdFound1895 != 0 )
            {
               init_level_properties1895( ) ;
               getByPrimaryKey1TE1895( ) ;
               addRow1TE1895( ) ;
               scanNext1TE1895( ) ;
            }
            scanEnd1TE1895( ) ;
            nBlankRcdCount1895 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1TE1895( ) ;
         standaloneModal1TE1895( ) ;
         sMode1895 = Gx_mode ;
         while ( nGXsfl_108_idx < nRC_GXsfl_108 )
         {
            bGXsfl_108_Refreshing = true ;
            readRow1TE1895( ) ;
            edtMRecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRECLIN_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECPLC_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecPLC_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECVAL_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecVal_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECFEC_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecFec_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            chkMPRecEr.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MPRECER_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkMPRecEr.getInternalname(), "Enabled", GXutil.ltrimstr( chkMPRecEr.getEnabled(), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecFecEv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECFECEV_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecFecEv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecFecEv_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            cmbMPRecEst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MPRECEST_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbMPRecEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMPRecEst.getEnabled(), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECINT_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecInt_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecValMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECVALMI_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecValMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecValMi_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecValMa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECVALMA_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecValMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecValMa_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecParFa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECPARFA_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecParFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecParFa_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            edtMPRecReg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECREG_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMPRecReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecReg_Enabled), 5, 0), !bGXsfl_108_Refreshing);
            if ( ( nRcdExists_1895 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1TE1895( ) ;
            }
            sendRow1TE1895( ) ;
            bGXsfl_108_Refreshing = false ;
         }
         Gx_mode = sMode1895 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1895 = (short)(5) ;
         nRcdExists_1895 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1TE1895( ) ;
            while ( RcdFound1895 != 0 )
            {
               sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1081895( ) ;
               init_level_properties1895( ) ;
               standaloneNotModal1TE1895( ) ;
               getByPrimaryKey1TE1895( ) ;
               standaloneModal1TE1895( ) ;
               addRow1TE1895( ) ;
               scanNext1TE1895( ) ;
            }
            scanEnd1TE1895( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1895 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1081895( ) ;
      initAll1TE1895( ) ;
      init_level_properties1895( ) ;
      nRcdExists_1895 = (short)(0) ;
      nIsMod_1895 = (short)(0) ;
      nRcdDeleted_1895 = (short)(0) ;
      nBlankRcdCount1895 = (short)(nBlankRcdUsr1895+nBlankRcdCount1895) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1895 > 0 )
      {
         standaloneNotModal1TE1895( ) ;
         standaloneModal1TE1895( ) ;
         addRow1TE1895( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtMRecLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1895 = (short)(nBlankRcdCount1895-1) ;
      }
      Gx_mode = sMode1895 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridmrec_pContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridmrec_p", Gridmrec_pContainer, subGridmrec_p_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_pContainerData", Gridmrec_pContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridmrec_pContainerData"+"V", Gridmrec_pContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridmrec_pContainerData"+"V"+"\" value='"+Gridmrec_pContainer.GridValuesHidden()+"'/>") ;
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
         Z14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( "Z14152MEnvOrd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14158MEnvIni = localUtil.ctot( httpContext.cgiGet( "Z14158MEnvIni"), 0) ;
         Z14157MEnvFin = localUtil.ctot( httpContext.cgiGet( "Z14157MEnvFin"), 0) ;
         Z14686MRecHdr = httpContext.cgiGet( "Z14686MRecHdr") ;
         Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
         Z14154MEnvMaqCod = httpContext.cgiGet( "Z14154MEnvMaqCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_108 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_108"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MENVORD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMEnvOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14152MEnvOrd = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         }
         else
         {
            A14152MEnvOrd = (short)(localUtil.ctol( httpContext.cgiGet( edtMEnvOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         }
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A14154MEnvMaqCod = httpContext.cgiGet( edtMEnvMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         A14164MEnvMaqDsc = httpContext.cgiGet( edtMEnvMaqDsc_Internalname) ;
         n14164MEnvMaqDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMEnvIni_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MENVINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMEnvIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14158MEnvIni = localUtil.ctot( httpContext.cgiGet( edtMEnvIni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdtime( httpContext.cgiGet( edtMEnvFin_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "MENVFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMEnvFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A14157MEnvFin = localUtil.ctot( httpContext.cgiGet( edtMEnvFin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         cmbMEnvEst.setName( cmbMEnvEst.getInternalname() );
         cmbMEnvEst.setValue( httpContext.cgiGet( cmbMEnvEst.getInternalname()) );
         A14156MEnvEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbMEnvEst.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
         A14162MEnvInt = localUtil.ctond( httpContext.cgiGet( edtMEnvInt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
         A14686MRecHdr = httpContext.cgiGet( edtMRecHdr_Internalname) ;
         n14686MRecHdr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14686MRecHdr", A14686MRecHdr);
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
            A14152MEnvOrd = (short)(GXutil.lval( httpContext.GetPar( "MEnvOrd"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
            initAll1TE1893( ) ;
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
      disableAttributes1TE1893( ) ;
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

   public void confirm_1TE1895( )
   {
      nGXsfl_108_idx = 0 ;
      while ( nGXsfl_108_idx < nRC_GXsfl_108 )
      {
         readRow1TE1895( ) ;
         if ( ( nRcdExists_1895 != 0 ) || ( nIsMod_1895 != 0 ) )
         {
            getKey1TE1895( ) ;
            if ( ( nRcdExists_1895 == 0 ) && ( nRcdDeleted_1895 == 0 ) )
            {
               if ( RcdFound1895 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1TE1895( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1TE1895( ) ;
                     closeExtendedTableCursors1TE1895( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MRECLIN_" + sGXsfl_108_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRecLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1895 != 0 )
               {
                  if ( nRcdDeleted_1895 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1TE1895( ) ;
                     load1TE1895( ) ;
                     beforeValidate1TE1895( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1TE1895( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1895 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1TE1895( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1TE1895( ) ;
                           closeExtendedTableCursors1TE1895( ) ;
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
                  if ( nRcdDeleted_1895 == 0 )
                  {
                     GXCCtl = "MRECLIN_" + sGXsfl_108_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRecLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMPRecPLC_Internalname, A14166MPRecPLC) ;
         httpContext.changePostValue( edtMPRecVal_Internalname, GXutil.rtrim( A14165MPRecVal)) ;
         httpContext.changePostValue( edtMPRecFec_Internalname, localUtil.ttoc( A14167MPRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( chkMPRecEr.getInternalname(), GXutil.booltostr( A14168MPRecEr)) ;
         httpContext.changePostValue( edtMPRecFecEv_Internalname, localUtil.ttoc( A14169MPRecFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( cmbMPRecEst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A14170MPRecEst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtMPRecInt_Internalname, GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMPRecValMi_Internalname, GXutil.rtrim( A14687MPRecValMi)) ;
         httpContext.changePostValue( edtMPRecValMa_Internalname, GXutil.rtrim( A14688MPRecValMa)) ;
         httpContext.changePostValue( edtMPRecParFa_Internalname, GXutil.ltrim( localUtil.ntoc( A14689MPRecParFa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMPRecReg_Internalname, localUtil.ttoc( A14690MPRecReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z14153MRecLin_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( Z14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14166MPRecPLC_"+sGXsfl_108_idx, Z14166MPRecPLC) ;
         httpContext.changePostValue( "ZT_"+"Z14165MPRecVal_"+sGXsfl_108_idx, GXutil.rtrim( Z14165MPRecVal)) ;
         httpContext.changePostValue( "ZT_"+"Z14167MPRecFec_"+sGXsfl_108_idx, localUtil.ttoc( Z14167MPRecFec, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z14168MPRecEr_"+sGXsfl_108_idx, GXutil.booltostr( Z14168MPRecEr)) ;
         httpContext.changePostValue( "ZT_"+"Z14169MPRecFecEv_"+sGXsfl_108_idx, localUtil.ttoc( Z14169MPRecFecEv, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z14687MPRecValMi_"+sGXsfl_108_idx, GXutil.rtrim( Z14687MPRecValMi)) ;
         httpContext.changePostValue( "ZT_"+"Z14688MPRecValMa_"+sGXsfl_108_idx, GXutil.rtrim( Z14688MPRecValMa)) ;
         httpContext.changePostValue( "ZT_"+"Z14689MPRecParFa_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( Z14689MPRecParFa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14690MPRecReg_"+sGXsfl_108_idx, localUtil.ttoc( Z14690MPRecReg, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1895_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1895_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1895_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1895 != 0 )
         {
            httpContext.changePostValue( "MRECLIN_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECPLC_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECVAL_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECFEC_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECER_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMPRecEr.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECFECEV_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFecEv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECEST_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMPRecEst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECINT_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECVALMI_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecValMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECVALMA_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecValMa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECPARFA_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecParFa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECREG_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecReg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1TE0( )
   {
   }

   public void zm1TE1893( int GX_JID )
   {
      if ( ( GX_JID == 5 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14158MEnvIni = T01TE5_A14158MEnvIni[0] ;
            Z14157MEnvFin = T01TE5_A14157MEnvFin[0] ;
            Z14686MRecHdr = T01TE5_A14686MRecHdr[0] ;
            Z457FasCod = T01TE5_A457FasCod[0] ;
            Z14154MEnvMaqCod = T01TE5_A14154MEnvMaqCod[0] ;
         }
         else
         {
            Z14158MEnvIni = A14158MEnvIni ;
            Z14157MEnvFin = A14157MEnvFin ;
            Z14686MRecHdr = A14686MRecHdr ;
            Z457FasCod = A457FasCod ;
            Z14154MEnvMaqCod = A14154MEnvMaqCod ;
         }
      }
      if ( GX_JID == -5 )
      {
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14158MEnvIni = A14158MEnvIni ;
         Z14157MEnvFin = A14157MEnvFin ;
         Z14686MRecHdr = A14686MRecHdr ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14154MEnvMaqCod = A14154MEnvMaqCod ;
         Z460FasDsc = A460FasDsc ;
         Z14164MEnvMaqDsc = A14164MEnvMaqDsc ;
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

   public void load1TE1893( )
   {
      /* Using cursor T01TE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A460FasDsc = T01TE9_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A14164MEnvMaqDsc = T01TE9_A14164MEnvMaqDsc[0] ;
         n14164MEnvMaqDsc = T01TE9_n14164MEnvMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
         A14158MEnvIni = T01TE9_A14158MEnvIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14157MEnvFin = T01TE9_A14157MEnvFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14686MRecHdr = T01TE9_A14686MRecHdr[0] ;
         n14686MRecHdr = T01TE9_n14686MRecHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14686MRecHdr", A14686MRecHdr);
         A457FasCod = T01TE9_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A14154MEnvMaqCod = T01TE9_A14154MEnvMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         zm1TE1893( -5) ;
      }
      pr_default.close(7);
      onLoadActions1TE1893( ) ;
   }

   public void onLoadActions1TE1893( )
   {
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      else
      {
         A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         A14156MEnvEst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      else
      {
         A14156MEnvEst = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
   }

   public void checkExtendedTable1TE1893( )
   {
      nIsDirty_1893 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01TE6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01TE6_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      pr_default.close(4);
      /* Using cursor T01TE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14164MEnvMaqDsc = T01TE8_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01TE8_n14164MEnvMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
      pr_default.close(6);
      /* Using cursor T01TE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(5);
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         nIsDirty_1893 = (short)(1) ;
         A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      else
      {
         nIsDirty_1893 = (short)(1) ;
         A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
      {
         nIsDirty_1893 = (short)(1) ;
         A14156MEnvEst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      else
      {
         nIsDirty_1893 = (short)(1) ;
         A14156MEnvEst = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
   }

   public void closeExtendedTableCursors1TE1893( )
   {
      pr_default.close(4);
      pr_default.close(6);
      pr_default.close(5);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( String A396EmprCod ,
                         String A457FasCod )
   {
      /* Using cursor T01TE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01TE10_A460FasDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_8( String A396EmprCod ,
                         String A14154MEnvMaqCod )
   {
      /* Using cursor T01TE11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A14164MEnvMaqDsc = T01TE11_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01TE11_n14164MEnvMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14164MEnvMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void gxload_7( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01TE12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void getKey1TE1893( )
   {
      /* Using cursor T01TE13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound1893 = (short)(1) ;
      }
      else
      {
         RcdFound1893 = (short)(0) ;
      }
      pr_default.close(11);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1TE1893( 5) ;
         RcdFound1893 = (short)(1) ;
         A14152MEnvOrd = T01TE5_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
         A14158MEnvIni = T01TE5_A14158MEnvIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14157MEnvFin = T01TE5_A14157MEnvFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A14686MRecHdr = T01TE5_A14686MRecHdr[0] ;
         n14686MRecHdr = T01TE5_n14686MRecHdr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14686MRecHdr", A14686MRecHdr);
         A396EmprCod = T01TE5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = T01TE5_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A129BarCod = T01TE5_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01TE5_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01TE5_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14154MEnvMaqCod = T01TE5_A14154MEnvMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         sMode1893 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1TE1893( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1893 = (short)(0) ;
            initializeNonKey1TE1893( ) ;
         }
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1893 = (short)(0) ;
         initializeNonKey1TE1893( ) ;
         sMode1893 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1893 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1TE1893( ) ;
      if ( RcdFound1893 == 0 )
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
      RcdFound1893 = (short)(0) ;
      /* Using cursor T01TE14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE14_A129BarCod[0] < A129BarCod ) || ( T01TE14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE14_A132BarCodReo[0] < A132BarCodReo ) || ( T01TE14_A132BarCodReo[0] == A132BarCodReo ) && ( T01TE14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TE14_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01TE14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01TE14_A132BarCodReo[0] == A132BarCodReo ) && ( T01TE14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE14_A14152MEnvOrd[0] < A14152MEnvOrd ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE14_A129BarCod[0] > A129BarCod ) || ( T01TE14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE14_A132BarCodReo[0] > A132BarCodReo ) || ( T01TE14_A132BarCodReo[0] == A132BarCodReo ) && ( T01TE14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TE14_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01TE14_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01TE14_A132BarCodReo[0] == A132BarCodReo ) && ( T01TE14_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE14_A14152MEnvOrd[0] > A14152MEnvOrd ) ) )
         {
            A396EmprCod = T01TE14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01TE14_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01TE14_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01TE14_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = T01TE14_A14152MEnvOrd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            RcdFound1893 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void move_previous( )
   {
      RcdFound1893 = (short)(0) ;
      /* Using cursor T01TE15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A14152MEnvOrd)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE15_A129BarCod[0] > A129BarCod ) || ( T01TE15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE15_A132BarCodReo[0] > A132BarCodReo ) || ( T01TE15_A132BarCodReo[0] == A132BarCodReo ) && ( T01TE15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TE15_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01TE15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01TE15_A132BarCodReo[0] == A132BarCodReo ) && ( T01TE15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE15_A14152MEnvOrd[0] > A14152MEnvOrd ) ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE15_A129BarCod[0] < A129BarCod ) || ( T01TE15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE15_A132BarCodReo[0] < A132BarCodReo ) || ( T01TE15_A132BarCodReo[0] == A132BarCodReo ) && ( T01TE15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01TE15_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01TE15_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01TE15_A132BarCodReo[0] == A132BarCodReo ) && ( T01TE15_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01TE15_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01TE15_A14152MEnvOrd[0] < A14152MEnvOrd ) ) )
         {
            A396EmprCod = T01TE15_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01TE15_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01TE15_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01TE15_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A14152MEnvOrd = T01TE15_A14152MEnvOrd[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
            RcdFound1893 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TE1893( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TE1893( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1893 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               A14152MEnvOrd = Z14152MEnvOrd ;
               httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
               update1TE1893( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TE1893( ) ;
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
                  insert1TE1893( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A14152MEnvOrd != Z14152MEnvOrd ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = Z14152MEnvOrd ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
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
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1TE1893( ) ;
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1TE1893( ) ;
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
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
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
      scanStart1TE1893( ) ;
      if ( RcdFound1893 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1893 != 0 )
         {
            scanNext1TE1893( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1TE1893( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1TE1893( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEnv"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || !( GXutil.dateCompare(Z14158MEnvIni, T01TE4_A14158MEnvIni[0]) ) || !( GXutil.dateCompare(Z14157MEnvFin, T01TE4_A14157MEnvFin[0]) ) || ( GXutil.strcmp(Z14686MRecHdr, T01TE4_A14686MRecHdr[0]) != 0 ) || ( GXutil.strcmp(Z457FasCod, T01TE4_A457FasCod[0]) != 0 ) || ( GXutil.strcmp(Z14154MEnvMaqCod, T01TE4_A14154MEnvMaqCod[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(Z14158MEnvIni, T01TE4_A14158MEnvIni[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MEnvIni");
               GXutil.writeLogRaw("Old: ",Z14158MEnvIni);
               GXutil.writeLogRaw("Current: ",T01TE4_A14158MEnvIni[0]);
            }
            if ( !( GXutil.dateCompare(Z14157MEnvFin, T01TE4_A14157MEnvFin[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MEnvFin");
               GXutil.writeLogRaw("Old: ",Z14157MEnvFin);
               GXutil.writeLogRaw("Current: ",T01TE4_A14157MEnvFin[0]);
            }
            if ( GXutil.strcmp(Z14686MRecHdr, T01TE4_A14686MRecHdr[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MRecHdr");
               GXutil.writeLogRaw("Old: ",Z14686MRecHdr);
               GXutil.writeLogRaw("Current: ",T01TE4_A14686MRecHdr[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01TE4_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01TE4_A457FasCod[0]);
            }
            if ( GXutil.strcmp(Z14154MEnvMaqCod, T01TE4_A14154MEnvMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MEnvMaqCod");
               GXutil.writeLogRaw("Old: ",Z14154MEnvMaqCod);
               GXutil.writeLogRaw("Current: ",T01TE4_A14154MEnvMaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMEnv"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TE1893( )
   {
      beforeValidate1TE1893( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TE1893( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TE1893( 0) ;
         checkOptimisticConcurrency1TE1893( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TE1893( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TE1893( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TE16 */
                  pr_default.execute(14, new Object[] {Short.valueOf(A14152MEnvOrd), A14158MEnvIni, A14157MEnvFin, Boolean.valueOf(n14686MRecHdr), A14686MRecHdr, A396EmprCod, A457FasCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, A14154MEnvMaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
                  if ( (pr_default.getStatus(14) == 1) )
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
                        processLevel1TE1893( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1TE0( ) ;
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
            load1TE1893( ) ;
         }
         endLevel1TE1893( ) ;
      }
      closeExtendedTableCursors1TE1893( ) ;
   }

   public void update1TE1893( )
   {
      beforeValidate1TE1893( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TE1893( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TE1893( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TE1893( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TE1893( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TE17 */
                  pr_default.execute(15, new Object[] {A14158MEnvIni, A14157MEnvFin, Boolean.valueOf(n14686MRecHdr), A14686MRecHdr, A457FasCod, A14154MEnvMaqCod, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
                  if ( (pr_default.getStatus(15) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMEnv"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TE1893( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1TE1893( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1TE0( ) ;
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
         endLevel1TE1893( ) ;
      }
      closeExtendedTableCursors1TE1893( ) ;
   }

   public void deferredUpdate1TE1893( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TE1893( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TE1893( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TE1893( ) ;
         afterConfirm1TE1893( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TE1893( ) ;
            if ( AnyError == 0 )
            {
               scanStart1TE1895( ) ;
               while ( RcdFound1895 != 0 )
               {
                  getByPrimaryKey1TE1895( ) ;
                  delete1TE1895( ) ;
                  scanNext1TE1895( ) ;
               }
               scanEnd1TE1895( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TE18 */
                  pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMEnv");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1893 == 0 )
                        {
                           initAll1TE1893( ) ;
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
                        resetCaption1TE0( ) ;
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
      sMode1893 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TE1893( ) ;
      Gx_mode = sMode1893 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TE1893( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01TE19 */
         pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01TE19_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         pr_default.close(17);
         /* Using cursor T01TE20 */
         pr_default.execute(18, new Object[] {A396EmprCod, A14154MEnvMaqCod});
         A14164MEnvMaqDsc = T01TE20_A14164MEnvMaqDsc[0] ;
         n14164MEnvMaqDsc = T01TE20_n14164MEnvMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
         pr_default.close(18);
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
         {
            A14162MEnvInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14157MEnvFin, A14158MEnvIni)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
         }
         else
         {
            A14162MEnvInt = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
         }
         if ( GXutil.dateCompare(GXutil.nullDate(), A14157MEnvFin) )
         {
            A14156MEnvEst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
         }
         else
         {
            A14156MEnvEst = (byte)(2) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TE21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MEPr", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01TE22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores de Parámetros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
      }
   }

   public void processNestedLevel1TE1895( )
   {
      nGXsfl_108_idx = 0 ;
      while ( nGXsfl_108_idx < nRC_GXsfl_108 )
      {
         readRow1TE1895( ) ;
         if ( ( nRcdExists_1895 != 0 ) || ( nIsMod_1895 != 0 ) )
         {
            standaloneNotModal1TE1895( ) ;
            getKey1TE1895( ) ;
            if ( ( nRcdExists_1895 == 0 ) && ( nRcdDeleted_1895 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1TE1895( ) ;
            }
            else
            {
               if ( RcdFound1895 != 0 )
               {
                  if ( ( nRcdDeleted_1895 != 0 ) && ( nRcdExists_1895 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1TE1895( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1895 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1TE1895( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1895 == 0 )
                  {
                     GXCCtl = "MRECLIN_" + sGXsfl_108_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRecLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMPRecPLC_Internalname, A14166MPRecPLC) ;
         httpContext.changePostValue( edtMPRecVal_Internalname, GXutil.rtrim( A14165MPRecVal)) ;
         httpContext.changePostValue( edtMPRecFec_Internalname, localUtil.ttoc( A14167MPRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( chkMPRecEr.getInternalname(), GXutil.booltostr( A14168MPRecEr)) ;
         httpContext.changePostValue( edtMPRecFecEv_Internalname, localUtil.ttoc( A14169MPRecFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( cmbMPRecEst.getInternalname(), GXutil.ltrim( localUtil.ntoc( A14170MPRecEst, (byte)(1), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtMPRecInt_Internalname, GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMPRecValMi_Internalname, GXutil.rtrim( A14687MPRecValMi)) ;
         httpContext.changePostValue( edtMPRecValMa_Internalname, GXutil.rtrim( A14688MPRecValMa)) ;
         httpContext.changePostValue( edtMPRecParFa_Internalname, GXutil.ltrim( localUtil.ntoc( A14689MPRecParFa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMPRecReg_Internalname, localUtil.ttoc( A14690MPRecReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z14153MRecLin_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( Z14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14166MPRecPLC_"+sGXsfl_108_idx, Z14166MPRecPLC) ;
         httpContext.changePostValue( "ZT_"+"Z14165MPRecVal_"+sGXsfl_108_idx, GXutil.rtrim( Z14165MPRecVal)) ;
         httpContext.changePostValue( "ZT_"+"Z14167MPRecFec_"+sGXsfl_108_idx, localUtil.ttoc( Z14167MPRecFec, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z14168MPRecEr_"+sGXsfl_108_idx, GXutil.booltostr( Z14168MPRecEr)) ;
         httpContext.changePostValue( "ZT_"+"Z14169MPRecFecEv_"+sGXsfl_108_idx, localUtil.ttoc( Z14169MPRecFecEv, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z14687MPRecValMi_"+sGXsfl_108_idx, GXutil.rtrim( Z14687MPRecValMi)) ;
         httpContext.changePostValue( "ZT_"+"Z14688MPRecValMa_"+sGXsfl_108_idx, GXutil.rtrim( Z14688MPRecValMa)) ;
         httpContext.changePostValue( "ZT_"+"Z14689MPRecParFa_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( Z14689MPRecParFa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14690MPRecReg_"+sGXsfl_108_idx, localUtil.ttoc( Z14690MPRecReg, 10, 12, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "nRcdDeleted_1895_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1895_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1895_"+sGXsfl_108_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1895 != 0 )
         {
            httpContext.changePostValue( "MRECLIN_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRecLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECPLC_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecPLC_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECVAL_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecVal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECFEC_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECER_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMPRecEr.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECFECEV_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFecEv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECEST_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMPRecEst.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECINT_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecInt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECVALMI_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecValMi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECVALMA_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecValMa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECPARFA_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecParFa_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MPRECREG_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecReg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1TE1895( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1895 = (short)(0) ;
      nIsMod_1895 = (short)(0) ;
      nRcdDeleted_1895 = (short)(0) ;
   }

   public void processLevel1TE1893( )
   {
      /* Save parent mode. */
      sMode1893 = Gx_mode ;
      processNestedLevel1TE1895( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1893 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1TE1893( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TE1893( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ingenieria.mrec");
         if ( AnyError == 0 )
         {
            confirmValues1TE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ingenieria.mrec");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TE1893( )
   {
      /* Using cursor T01TE23 */
      pr_default.execute(21);
      RcdFound1893 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A396EmprCod = T01TE23_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01TE23_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01TE23_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01TE23_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01TE23_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TE1893( )
   {
      /* Scan next routine */
      pr_default.readNext(21);
      RcdFound1893 = (short)(0) ;
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound1893 = (short)(1) ;
         A396EmprCod = T01TE23_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01TE23_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01TE23_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01TE23_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A14152MEnvOrd = T01TE23_A14152MEnvOrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      }
   }

   public void scanEnd1TE1893( )
   {
      pr_default.close(21);
   }

   public void afterConfirm1TE1893( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TE1893( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TE1893( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TE1893( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TE1893( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TE1893( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TE1893( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtMEnvOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvOrd_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtMEnvMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvMaqCod_Enabled), 5, 0), true);
      edtMEnvMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvMaqDsc_Enabled), 5, 0), true);
      edtMEnvIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvIni_Enabled), 5, 0), true);
      edtMEnvFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvFin_Enabled), 5, 0), true);
      cmbMEnvEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMEnvEst.getEnabled(), 5, 0), true);
      edtMEnvInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMEnvInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMEnvInt_Enabled), 5, 0), true);
      edtMRecHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRecHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecHdr_Enabled), 5, 0), true);
   }

   public void zm1TE1895( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z14166MPRecPLC = T01TE3_A14166MPRecPLC[0] ;
            Z14165MPRecVal = T01TE3_A14165MPRecVal[0] ;
            Z14167MPRecFec = T01TE3_A14167MPRecFec[0] ;
            Z14168MPRecEr = T01TE3_A14168MPRecEr[0] ;
            Z14169MPRecFecEv = T01TE3_A14169MPRecFecEv[0] ;
            Z14687MPRecValMi = T01TE3_A14687MPRecValMi[0] ;
            Z14688MPRecValMa = T01TE3_A14688MPRecValMa[0] ;
            Z14689MPRecParFa = T01TE3_A14689MPRecParFa[0] ;
            Z14690MPRecReg = T01TE3_A14690MPRecReg[0] ;
         }
         else
         {
            Z14166MPRecPLC = A14166MPRecPLC ;
            Z14165MPRecVal = A14165MPRecVal ;
            Z14167MPRecFec = A14167MPRecFec ;
            Z14168MPRecEr = A14168MPRecEr ;
            Z14169MPRecFecEv = A14169MPRecFecEv ;
            Z14687MPRecValMi = A14687MPRecValMi ;
            Z14688MPRecValMa = A14688MPRecValMa ;
            Z14689MPRecParFa = A14689MPRecParFa ;
            Z14690MPRecReg = A14690MPRecReg ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14153MRecLin = A14153MRecLin ;
         Z14166MPRecPLC = A14166MPRecPLC ;
         Z14165MPRecVal = A14165MPRecVal ;
         Z14167MPRecFec = A14167MPRecFec ;
         Z14168MPRecEr = A14168MPRecEr ;
         Z14169MPRecFecEv = A14169MPRecFecEv ;
         Z14687MPRecValMi = A14687MPRecValMi ;
         Z14688MPRecValMa = A14688MPRecValMa ;
         Z14689MPRecParFa = A14689MPRecParFa ;
         Z14690MPRecReg = A14690MPRecReg ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1TE1895( )
   {
   }

   public void standaloneModal1TE1895( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMRecLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      }
      else
      {
         edtMRecLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      }
   }

   public void load1TE1895( )
   {
      /* Using cursor T01TE24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1895 = (short)(1) ;
         A14166MPRecPLC = T01TE24_A14166MPRecPLC[0] ;
         A14165MPRecVal = T01TE24_A14165MPRecVal[0] ;
         A14167MPRecFec = T01TE24_A14167MPRecFec[0] ;
         A14168MPRecEr = T01TE24_A14168MPRecEr[0] ;
         A14169MPRecFecEv = T01TE24_A14169MPRecFecEv[0] ;
         A14687MPRecValMi = T01TE24_A14687MPRecValMi[0] ;
         n14687MPRecValMi = T01TE24_n14687MPRecValMi[0] ;
         A14688MPRecValMa = T01TE24_A14688MPRecValMa[0] ;
         n14688MPRecValMa = T01TE24_n14688MPRecValMa[0] ;
         A14689MPRecParFa = T01TE24_A14689MPRecParFa[0] ;
         n14689MPRecParFa = T01TE24_n14689MPRecParFa[0] ;
         A14690MPRecReg = T01TE24_A14690MPRecReg[0] ;
         n14690MPRecReg = T01TE24_n14690MPRecReg[0] ;
         zm1TE1895( -9) ;
      }
      pr_default.close(22);
      onLoadActions1TE1895( ) ;
   }

   public void onLoadActions1TE1895( )
   {
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         A14171MPRecInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14169MPRecFecEv, A14167MPRecFec)) ;
      }
      else
      {
         A14171MPRecInt = DecimalUtil.doubleToDec(0) ;
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         A14170MPRecEst = (byte)(1) ;
      }
      else
      {
         A14170MPRecEst = (byte)(2) ;
      }
   }

   public void checkExtendedTable1TE1895( )
   {
      nIsDirty_1895 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1TE1895( ) ;
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         nIsDirty_1895 = (short)(1) ;
         A14171MPRecInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14169MPRecFecEv, A14167MPRecFec)) ;
      }
      else
      {
         nIsDirty_1895 = (short)(1) ;
         A14171MPRecInt = DecimalUtil.doubleToDec(0) ;
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         nIsDirty_1895 = (short)(1) ;
         A14170MPRecEst = (byte)(1) ;
      }
      else
      {
         nIsDirty_1895 = (short)(1) ;
         A14170MPRecEst = (byte)(2) ;
      }
   }

   public void closeExtendedTableCursors1TE1895( )
   {
   }

   public void enableDisable1TE1895( )
   {
   }

   public void getKey1TE1895( )
   {
      /* Using cursor T01TE25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound1895 = (short)(1) ;
      }
      else
      {
         RcdFound1895 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey1TE1895( )
   {
      /* Using cursor T01TE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1TE1895( 9) ;
         RcdFound1895 = (short)(1) ;
         initializeNonKey1TE1895( ) ;
         A14153MRecLin = T01TE3_A14153MRecLin[0] ;
         A14166MPRecPLC = T01TE3_A14166MPRecPLC[0] ;
         A14165MPRecVal = T01TE3_A14165MPRecVal[0] ;
         A14167MPRecFec = T01TE3_A14167MPRecFec[0] ;
         A14168MPRecEr = T01TE3_A14168MPRecEr[0] ;
         A14169MPRecFecEv = T01TE3_A14169MPRecFecEv[0] ;
         A14687MPRecValMi = T01TE3_A14687MPRecValMi[0] ;
         n14687MPRecValMi = T01TE3_n14687MPRecValMi[0] ;
         A14688MPRecValMa = T01TE3_A14688MPRecValMa[0] ;
         n14688MPRecValMa = T01TE3_n14688MPRecValMa[0] ;
         A14689MPRecParFa = T01TE3_A14689MPRecParFa[0] ;
         n14689MPRecParFa = T01TE3_n14689MPRecParFa[0] ;
         A14690MPRecReg = T01TE3_A14690MPRecReg[0] ;
         n14690MPRecReg = T01TE3_n14690MPRecReg[0] ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z14152MEnvOrd = A14152MEnvOrd ;
         Z14153MRecLin = A14153MRecLin ;
         sMode1895 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TE1895( ) ;
         load1TE1895( ) ;
         Gx_mode = sMode1895 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1895 = (short)(0) ;
         initializeNonKey1TE1895( ) ;
         sMode1895 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1TE1895( ) ;
         Gx_mode = sMode1895 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1TE1895( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1TE1895( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPRec"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z14166MPRecPLC, T01TE2_A14166MPRecPLC[0]) != 0 ) || ( GXutil.strcmp(Z14165MPRecVal, T01TE2_A14165MPRecVal[0]) != 0 ) || !( GXutil.dateCompare(Z14167MPRecFec, T01TE2_A14167MPRecFec[0]) ) || ( Z14168MPRecEr != T01TE2_A14168MPRecEr[0] ) || !( GXutil.dateCompare(Z14169MPRecFecEv, T01TE2_A14169MPRecFecEv[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14687MPRecValMi, T01TE2_A14687MPRecValMi[0]) != 0 ) || ( GXutil.strcmp(Z14688MPRecValMa, T01TE2_A14688MPRecValMa[0]) != 0 ) || ( Z14689MPRecParFa != T01TE2_A14689MPRecParFa[0] ) || !( GXutil.dateCompare(Z14690MPRecReg, T01TE2_A14690MPRecReg[0]) ) )
         {
            if ( GXutil.strcmp(Z14166MPRecPLC, T01TE2_A14166MPRecPLC[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecPLC");
               GXutil.writeLogRaw("Old: ",Z14166MPRecPLC);
               GXutil.writeLogRaw("Current: ",T01TE2_A14166MPRecPLC[0]);
            }
            if ( GXutil.strcmp(Z14165MPRecVal, T01TE2_A14165MPRecVal[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecVal");
               GXutil.writeLogRaw("Old: ",Z14165MPRecVal);
               GXutil.writeLogRaw("Current: ",T01TE2_A14165MPRecVal[0]);
            }
            if ( !( GXutil.dateCompare(Z14167MPRecFec, T01TE2_A14167MPRecFec[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecFec");
               GXutil.writeLogRaw("Old: ",Z14167MPRecFec);
               GXutil.writeLogRaw("Current: ",T01TE2_A14167MPRecFec[0]);
            }
            if ( Z14168MPRecEr != T01TE2_A14168MPRecEr[0] )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecEr");
               GXutil.writeLogRaw("Old: ",Z14168MPRecEr);
               GXutil.writeLogRaw("Current: ",T01TE2_A14168MPRecEr[0]);
            }
            if ( !( GXutil.dateCompare(Z14169MPRecFecEv, T01TE2_A14169MPRecFecEv[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecFecEv");
               GXutil.writeLogRaw("Old: ",Z14169MPRecFecEv);
               GXutil.writeLogRaw("Current: ",T01TE2_A14169MPRecFecEv[0]);
            }
            if ( GXutil.strcmp(Z14687MPRecValMi, T01TE2_A14687MPRecValMi[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecValMi");
               GXutil.writeLogRaw("Old: ",Z14687MPRecValMi);
               GXutil.writeLogRaw("Current: ",T01TE2_A14687MPRecValMi[0]);
            }
            if ( GXutil.strcmp(Z14688MPRecValMa, T01TE2_A14688MPRecValMa[0]) != 0 )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecValMa");
               GXutil.writeLogRaw("Old: ",Z14688MPRecValMa);
               GXutil.writeLogRaw("Current: ",T01TE2_A14688MPRecValMa[0]);
            }
            if ( Z14689MPRecParFa != T01TE2_A14689MPRecParFa[0] )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecParFa");
               GXutil.writeLogRaw("Old: ",Z14689MPRecParFa);
               GXutil.writeLogRaw("Current: ",T01TE2_A14689MPRecParFa[0]);
            }
            if ( !( GXutil.dateCompare(Z14690MPRecReg, T01TE2_A14690MPRecReg[0]) ) )
            {
               GXutil.writeLogln("ingenieria.mrec:[seudo value changed for attri]"+"MPRecReg");
               GXutil.writeLogRaw("Old: ",Z14690MPRecReg);
               GXutil.writeLogRaw("Current: ",T01TE2_A14690MPRecReg[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMPRec"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TE1895( )
   {
      beforeValidate1TE1895( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TE1895( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TE1895( 0) ;
         checkOptimisticConcurrency1TE1895( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TE1895( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TE1895( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TE26 */
                  pr_default.execute(24, new Object[] {Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin), A14166MPRecPLC, A14165MPRecVal, A14167MPRecFec, Boolean.valueOf(A14168MPRecEr), A14169MPRecFecEv, Boolean.valueOf(n14687MPRecValMi), A14687MPRecValMi, Boolean.valueOf(n14688MPRecValMa), A14688MPRecValMa, Boolean.valueOf(n14689MPRecParFa), Short.valueOf(A14689MPRecParFa), Boolean.valueOf(n14690MPRecReg), A14690MPRecReg, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load1TE1895( ) ;
         }
         endLevel1TE1895( ) ;
      }
      closeExtendedTableCursors1TE1895( ) ;
   }

   public void update1TE1895( )
   {
      beforeValidate1TE1895( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TE1895( ) ;
      }
      if ( ( nIsMod_1895 != 0 ) || ( nIsDirty_1895 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1TE1895( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1TE1895( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1TE1895( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01TE27 */
                     pr_default.execute(25, new Object[] {A14166MPRecPLC, A14165MPRecVal, A14167MPRecFec, Boolean.valueOf(A14168MPRecEr), A14169MPRecFecEv, Boolean.valueOf(n14687MPRecValMi), A14687MPRecValMi, Boolean.valueOf(n14688MPRecValMa), A14688MPRecValMa, Boolean.valueOf(n14689MPRecParFa), Short.valueOf(A14689MPRecParFa), Boolean.valueOf(n14690MPRecReg), A14690MPRecReg, A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMPRec"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1TE1895( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1TE1895( ) ;
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
            endLevel1TE1895( ) ;
         }
      }
      closeExtendedTableCursors1TE1895( ) ;
   }

   public void deferredUpdate1TE1895( )
   {
   }

   public void delete1TE1895( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1TE1895( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TE1895( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TE1895( ) ;
         afterConfirm1TE1895( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TE1895( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TE28 */
               pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd), Long.valueOf(A14153MRecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPRec");
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
      sMode1895 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TE1895( ) ;
      Gx_mode = sMode1895 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TE1895( )
   {
      standaloneModal1TE1895( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ! GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
         {
            A14171MPRecInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14169MPRecFecEv, A14167MPRecFec)) ;
         }
         else
         {
            A14171MPRecInt = DecimalUtil.doubleToDec(0) ;
         }
         if ( GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
         {
            A14170MPRecEst = (byte)(1) ;
         }
         else
         {
            A14170MPRecEst = (byte)(2) ;
         }
      }
   }

   public void endLevel1TE1895( )
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

   public void scanStart1TE1895( )
   {
      /* Scan By routine */
      /* Using cursor T01TE29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A14152MEnvOrd)});
      RcdFound1895 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1895 = (short)(1) ;
         A14153MRecLin = T01TE29_A14153MRecLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TE1895( )
   {
      /* Scan next routine */
      pr_default.readNext(27);
      RcdFound1895 = (short)(0) ;
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1895 = (short)(1) ;
         A14153MRecLin = T01TE29_A14153MRecLin[0] ;
      }
   }

   public void scanEnd1TE1895( )
   {
      pr_default.close(27);
   }

   public void afterConfirm1TE1895( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1TE1895( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1TE1895( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1TE1895( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TE1895( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TE1895( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TE1895( )
   {
      edtMRecLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecPLC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecPLC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecPLC_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecVal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecVal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecVal_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecFec_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      chkMPRecEr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkMPRecEr.getInternalname(), "Enabled", GXutil.ltrimstr( chkMPRecEr.getEnabled(), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecFecEv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecFecEv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecFecEv_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      cmbMPRecEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMPRecEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMPRecEst.getEnabled(), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecInt_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecValMi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecValMi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecValMi_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecValMa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecValMa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecValMa_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecParFa_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecParFa_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecParFa_Enabled), 5, 0), !bGXsfl_108_Refreshing);
      edtMPRecReg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMPRecReg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMPRecReg_Enabled), 5, 0), !bGXsfl_108_Refreshing);
   }

   public void send_integrity_lvl_hashes1TE1895( )
   {
   }

   public void send_integrity_lvl_hashes1TE1893( )
   {
   }

   public void subsflControlProps_1081895( )
   {
      edtMRecLin_Internalname = "MRECLIN_"+sGXsfl_108_idx ;
      edtMPRecPLC_Internalname = "MPRECPLC_"+sGXsfl_108_idx ;
      edtMPRecVal_Internalname = "MPRECVAL_"+sGXsfl_108_idx ;
      edtMPRecFec_Internalname = "MPRECFEC_"+sGXsfl_108_idx ;
      chkMPRecEr.setInternalname( "MPRECER_"+sGXsfl_108_idx );
      edtMPRecFecEv_Internalname = "MPRECFECEV_"+sGXsfl_108_idx ;
      cmbMPRecEst.setInternalname( "MPRECEST_"+sGXsfl_108_idx );
      edtMPRecInt_Internalname = "MPRECINT_"+sGXsfl_108_idx ;
      edtMPRecValMi_Internalname = "MPRECVALMI_"+sGXsfl_108_idx ;
      edtMPRecValMa_Internalname = "MPRECVALMA_"+sGXsfl_108_idx ;
      edtMPRecParFa_Internalname = "MPRECPARFA_"+sGXsfl_108_idx ;
      edtMPRecReg_Internalname = "MPRECREG_"+sGXsfl_108_idx ;
   }

   public void subsflControlProps_fel_1081895( )
   {
      edtMRecLin_Internalname = "MRECLIN_"+sGXsfl_108_fel_idx ;
      edtMPRecPLC_Internalname = "MPRECPLC_"+sGXsfl_108_fel_idx ;
      edtMPRecVal_Internalname = "MPRECVAL_"+sGXsfl_108_fel_idx ;
      edtMPRecFec_Internalname = "MPRECFEC_"+sGXsfl_108_fel_idx ;
      chkMPRecEr.setInternalname( "MPRECER_"+sGXsfl_108_fel_idx );
      edtMPRecFecEv_Internalname = "MPRECFECEV_"+sGXsfl_108_fel_idx ;
      cmbMPRecEst.setInternalname( "MPRECEST_"+sGXsfl_108_fel_idx );
      edtMPRecInt_Internalname = "MPRECINT_"+sGXsfl_108_fel_idx ;
      edtMPRecValMi_Internalname = "MPRECVALMI_"+sGXsfl_108_fel_idx ;
      edtMPRecValMa_Internalname = "MPRECVALMA_"+sGXsfl_108_fel_idx ;
      edtMPRecParFa_Internalname = "MPRECPARFA_"+sGXsfl_108_fel_idx ;
      edtMPRecReg_Internalname = "MPRECREG_"+sGXsfl_108_fel_idx ;
   }

   public void addRow1TE1895( )
   {
      nGXsfl_108_idx = (int)(nGXsfl_108_idx+1) ;
      sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1081895( ) ;
      sendRow1TE1895( ) ;
   }

   public void sendRow1TE1895( )
   {
      Gridmrec_pRow = GXWebRow.GetNew(context) ;
      if ( subGridmrec_p_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridmrec_p_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridmrec_p_Class, "") != 0 )
         {
            subGridmrec_p_Linesclass = subGridmrec_p_Class+"Odd" ;
         }
      }
      else if ( subGridmrec_p_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridmrec_p_Backstyle = (byte)(0) ;
         subGridmrec_p_Backcolor = subGridmrec_p_Allbackcolor ;
         if ( GXutil.strcmp(subGridmrec_p_Class, "") != 0 )
         {
            subGridmrec_p_Linesclass = subGridmrec_p_Class+"Uniform" ;
         }
      }
      else if ( subGridmrec_p_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridmrec_p_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridmrec_p_Class, "") != 0 )
         {
            subGridmrec_p_Linesclass = subGridmrec_p_Class+"Odd" ;
         }
         subGridmrec_p_Backcolor = (int)(0x0) ;
      }
      else if ( subGridmrec_p_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridmrec_p_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_108_idx) % (2))) == 0 )
         {
            subGridmrec_p_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridmrec_p_Class, "") != 0 )
            {
               subGridmrec_p_Linesclass = subGridmrec_p_Class+"Even" ;
            }
         }
         else
         {
            subGridmrec_p_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridmrec_p_Class, "") != 0 )
            {
               subGridmrec_p_Linesclass = subGridmrec_p_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 109,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRecLin_Internalname,GXutil.ltrim( localUtil.ntoc( A14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14153MRecLin), "ZZZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRecLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMRecLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecPLC_Internalname,A14166MPRecPLC,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecPLC_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecPLC_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecVal_Internalname,GXutil.rtrim( A14165MPRecVal),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecVal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecVal_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecFec_Internalname,localUtil.ttoc( A14167MPRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14167MPRecFec, "99/99/99 99:99:99.999"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,112);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecFec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "MPRECER_" + sGXsfl_108_idx ;
      chkMPRecEr.setName( GXCCtl );
      chkMPRecEr.setWebtags( "" );
      chkMPRecEr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMPRecEr.getInternalname(), "TitleCaption", chkMPRecEr.getCaption(), !bGXsfl_108_Refreshing);
      chkMPRecEr.setCheckedValue( "false" );
      A14168MPRecEr = GXutil.strtobool( GXutil.booltostr( A14168MPRecEr)) ;
      Gridmrec_pRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkMPRecEr.getInternalname(),GXutil.booltostr( A14168MPRecEr),"","",Integer.valueOf(-1),Integer.valueOf(chkMPRecEr.getEnabled()),"true","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(113, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,113);\""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecFecEv_Internalname,localUtil.ttoc( A14169MPRecFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14169MPRecFecEv, "99/99/99 99:99:99.999"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecFecEv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecFecEv_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      GXCCtl = "MPRECEST_" + sGXsfl_108_idx ;
      cmbMPRecEst.setName( GXCCtl );
      cmbMPRecEst.setWebtags( "" );
      cmbMPRecEst.addItem("1", httpContext.getMessage( "A evaluar", ""), (short)(0));
      cmbMPRecEst.addItem("2", httpContext.getMessage( "Evaluado", ""), (short)(0));
      if ( cmbMPRecEst.getItemCount() > 0 )
      {
         A14170MPRecEst = (byte)(GXutil.lval( cmbMPRecEst.getValidValue(GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0))))) ;
      }
      /* ComboBox */
      Gridmrec_pRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMPRecEst,cmbMPRecEst.getInternalname(),GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0)),Integer.valueOf(1),cmbMPRecEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbMPRecEst.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","","","","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbMPRecEst.setValue( GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMPRecEst.getInternalname(), "Values", cmbMPRecEst.ToJavascriptSource(), !bGXsfl_108_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecInt_Internalname,GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMPRecInt_Enabled!=0) ? localUtil.format( A14171MPRecInt, "ZZZZZZ9.99") : localUtil.format( A14171MPRecInt, "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecInt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecInt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 117,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecValMi_Internalname,GXutil.rtrim( A14687MPRecValMi),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,117);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecValMi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecValMi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecValMa_Internalname,GXutil.rtrim( A14688MPRecValMa),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecValMa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecValMa_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 119,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecParFa_Internalname,GXutil.ltrim( localUtil.ntoc( A14689MPRecParFa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMPRecParFa_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14689MPRecParFa), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14689MPRecParFa), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecParFa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecParFa_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1895_" + sGXsfl_108_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_108_idx + "',108)\"" ;
      ROClassString = "Attribute" ;
      Gridmrec_pRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMPRecReg_Internalname,localUtil.ttoc( A14690MPRecReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14690MPRecReg, "99/99/99 99:99:99.999"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',12,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,120);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMPRecReg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtMPRecReg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(21),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(108),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridmrec_pRow);
      send_integrity_lvl_hashes1TE1895( ) ;
      GXCCtl = "Z14153MRecLin_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14153MRecLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14166MPRecPLC_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14166MPRecPLC);
      GXCCtl = "Z14165MPRecVal_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14165MPRecVal));
      GXCCtl = "Z14167MPRecFec_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z14167MPRecFec, 10, 12, 0, 0, "/", ":", " "));
      GXCCtl = "Z14168MPRecEr_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_boolean_hidden_field( httpContext, GXCCtl, Z14168MPRecEr);
      GXCCtl = "Z14169MPRecFecEv_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z14169MPRecFecEv, 10, 12, 0, 0, "/", ":", " "));
      GXCCtl = "Z14687MPRecValMi_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14687MPRecValMi));
      GXCCtl = "Z14688MPRecValMa_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14688MPRecValMa));
      GXCCtl = "Z14689MPRecParFa_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14689MPRecParFa, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14690MPRecReg_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z14690MPRecReg, 10, 12, 0, 0, "/", ":", " "));
      GXCCtl = "nRcdDeleted_1895_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1895_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1895_" + sGXsfl_108_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1895, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRECLIN_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECPLC_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECVAL_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECFEC_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECER_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMPRecEr.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECFECEV_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFecEv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECEST_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMPRecEst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECINT_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECVALMI_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecValMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECVALMA_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecValMa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECPARFA_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecParFa_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MPRECREG_"+sGXsfl_108_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecReg_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridmrec_pContainer.AddRow(Gridmrec_pRow);
   }

   public void readRow1TE1895( )
   {
      nGXsfl_108_idx = (int)(nGXsfl_108_idx+1) ;
      sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1081895( ) ;
      edtMRecLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRECLIN_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecPLC_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECPLC_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecVal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECVAL_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECFEC_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkMPRecEr.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MPRECER_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtMPRecFecEv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECFECEV_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbMPRecEst.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MPRECEST_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtMPRecInt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECINT_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecValMi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECVALMI_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecValMa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECVALMA_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecParFa_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECPARFA_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMPRecReg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MPRECREG_"+sGXsfl_108_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
      {
         GXCCtl = "MRECLIN_" + sGXsfl_108_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRecLin_Internalname ;
         wbErr = true ;
         A14153MRecLin = 0 ;
      }
      else
      {
         A14153MRecLin = localUtil.ctol( httpContext.cgiGet( edtMRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      A14166MPRecPLC = httpContext.cgiGet( edtMPRecPLC_Internalname) ;
      A14165MPRecVal = httpContext.cgiGet( edtMPRecVal_Internalname) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMPRecFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MPRECFEC_" + sGXsfl_108_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMPRecFec_Internalname ;
         wbErr = true ;
         A14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A14167MPRecFec = localUtil.ctot( httpContext.cgiGet( edtMPRecFec_Internalname)) ;
      }
      A14168MPRecEr = GXutil.strtobool( httpContext.cgiGet( chkMPRecEr.getInternalname())) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMPRecFecEv_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MPRECFECEV_" + sGXsfl_108_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMPRecFecEv_Internalname ;
         wbErr = true ;
         A14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A14169MPRecFecEv = localUtil.ctot( httpContext.cgiGet( edtMPRecFecEv_Internalname)) ;
      }
      cmbMPRecEst.setName( cmbMPRecEst.getInternalname() );
      cmbMPRecEst.setValue( httpContext.cgiGet( cmbMPRecEst.getInternalname()) );
      A14170MPRecEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbMPRecEst.getInternalname()))) ;
      A14171MPRecInt = localUtil.ctond( httpContext.cgiGet( edtMPRecInt_Internalname)) ;
      A14687MPRecValMi = httpContext.cgiGet( edtMPRecValMi_Internalname) ;
      n14687MPRecValMi = false ;
      A14688MPRecValMa = httpContext.cgiGet( edtMPRecValMa_Internalname) ;
      n14688MPRecValMa = false ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMPRecParFa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMPRecParFa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "MPRECPARFA_" + sGXsfl_108_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMPRecParFa_Internalname ;
         wbErr = true ;
         A14689MPRecParFa = (short)(0) ;
         n14689MPRecParFa = false ;
      }
      else
      {
         A14689MPRecParFa = (short)(localUtil.ctol( httpContext.cgiGet( edtMPRecParFa_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n14689MPRecParFa = false ;
      }
      if ( localUtil.vcdtime( httpContext.cgiGet( edtMPRecReg_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
      {
         GXCCtl = "MPRECREG_" + sGXsfl_108_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMPRecReg_Internalname ;
         wbErr = true ;
         A14690MPRecReg = GXutil.resetTime( GXutil.nullDate() );
         n14690MPRecReg = false ;
      }
      else
      {
         A14690MPRecReg = localUtil.ctot( httpContext.cgiGet( edtMPRecReg_Internalname)) ;
         n14690MPRecReg = false ;
      }
      GXCCtl = "Z14153MRecLin_" + sGXsfl_108_idx ;
      Z14153MRecLin = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z14166MPRecPLC_" + sGXsfl_108_idx ;
      Z14166MPRecPLC = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14165MPRecVal_" + sGXsfl_108_idx ;
      Z14165MPRecVal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14167MPRecFec_" + sGXsfl_108_idx ;
      Z14167MPRecFec = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z14168MPRecEr_" + sGXsfl_108_idx ;
      Z14168MPRecEr = GXutil.strtobool( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14169MPRecFecEv_" + sGXsfl_108_idx ;
      Z14169MPRecFecEv = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z14687MPRecValMi_" + sGXsfl_108_idx ;
      Z14687MPRecValMi = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14688MPRecValMa_" + sGXsfl_108_idx ;
      Z14688MPRecValMa = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14689MPRecParFa_" + sGXsfl_108_idx ;
      Z14689MPRecParFa = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14690MPRecReg_" + sGXsfl_108_idx ;
      Z14690MPRecReg = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "nRcdDeleted_1895_" + sGXsfl_108_idx ;
      nRcdDeleted_1895 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1895_" + sGXsfl_108_idx ;
      nRcdExists_1895 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1895_" + sGXsfl_108_idx ;
      nIsMod_1895 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMRecLin_Enabled = edtMRecLin_Enabled ;
   }

   public void confirmValues1TE0( )
   {
      nGXsfl_108_idx = 0 ;
      sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1081895( ) ;
      while ( nGXsfl_108_idx < nRC_GXsfl_108 )
      {
         nGXsfl_108_idx = (int)(nGXsfl_108_idx+1) ;
         sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1081895( ) ;
         httpContext.changePostValue( "Z14153MRecLin_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14153MRecLin_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14153MRecLin_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14166MPRecPLC_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14166MPRecPLC_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14166MPRecPLC_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14165MPRecVal_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14165MPRecVal_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14165MPRecVal_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14167MPRecFec_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14167MPRecFec_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14167MPRecFec_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14168MPRecEr_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14168MPRecEr_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14168MPRecEr_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14169MPRecFecEv_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14169MPRecFecEv_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14169MPRecFecEv_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14687MPRecValMi_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14687MPRecValMi_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14687MPRecValMi_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14688MPRecValMa_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14688MPRecValMa_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14688MPRecValMa_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14689MPRecParFa_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14689MPRecParFa_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14689MPRecParFa_"+sGXsfl_108_idx) ;
         httpContext.changePostValue( "Z14690MPRecReg_"+sGXsfl_108_idx, httpContext.cgiGet( "ZT_"+"Z14690MPRecReg_"+sGXsfl_108_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14690MPRecReg_"+sGXsfl_108_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ingenieria.mrec", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14158MEnvIni", localUtil.ttoc( Z14158MEnvIni, 10, 12, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14157MEnvFin", localUtil.ttoc( Z14157MEnvFin, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14686MRecHdr", GXutil.rtrim( Z14686MRecHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14154MEnvMaqCod", GXutil.rtrim( Z14154MEnvMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_108", GXutil.ltrim( localUtil.ntoc( nGXsfl_108_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ingenieria.mrec", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Ingenieria.MRec" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recibir datos de las maquinas", "") ;
   }

   public void initializeNonKey1TE1893( )
   {
      A14156MEnvEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      A14162MEnvInt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrimstr( A14162MEnvInt, 10, 2));
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A14154MEnvMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", A14154MEnvMaqCod);
      A14164MEnvMaqDsc = "" ;
      n14164MEnvMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", A14164MEnvMaqDsc);
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 8, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A14686MRecHdr = "" ;
      n14686MRecHdr = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14686MRecHdr", A14686MRecHdr);
      Z14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      Z14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      Z14686MRecHdr = "" ;
      Z457FasCod = "" ;
      Z14154MEnvMaqCod = "" ;
   }

   public void initAll1TE1893( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A14152MEnvOrd = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14152MEnvOrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14152MEnvOrd), 4, 0));
      initializeNonKey1TE1893( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1TE1895( )
   {
      A14170MPRecEst = (byte)(0) ;
      A14171MPRecInt = DecimalUtil.ZERO ;
      A14166MPRecPLC = "" ;
      A14165MPRecVal = "" ;
      A14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      A14168MPRecEr = false ;
      A14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14687MPRecValMi = "" ;
      n14687MPRecValMi = false ;
      A14688MPRecValMa = "" ;
      n14688MPRecValMa = false ;
      A14689MPRecParFa = (short)(0) ;
      n14689MPRecParFa = false ;
      A14690MPRecReg = GXutil.resetTime( GXutil.nullDate() );
      n14690MPRecReg = false ;
      Z14166MPRecPLC = "" ;
      Z14165MPRecVal = "" ;
      Z14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      Z14168MPRecEr = false ;
      Z14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14687MPRecValMi = "" ;
      Z14688MPRecValMa = "" ;
      Z14689MPRecParFa = (short)(0) ;
      Z14690MPRecReg = GXutil.resetTime( GXutil.nullDate() );
   }

   public void initAll1TE1895( )
   {
      A14153MRecLin = 0 ;
      initializeNonKey1TE1895( ) ;
   }

   public void standaloneModalInsert1TE1895( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671011102899", true, true);
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
      httpContext.AddJavascriptSource("ingenieria/mrec.js", "?202671011102899", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1895( )
   {
      edtMRecLin_Enabled = defedtMRecLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRecLin_Enabled), 5, 0), !bGXsfl_108_Refreshing);
   }

   public void startgridcontrol108( )
   {
      Gridmrec_pContainer.AddObjectProperty("GridName", "Gridmrec_p");
      Gridmrec_pContainer.AddObjectProperty("Header", subGridmrec_p_Header);
      Gridmrec_pContainer.AddObjectProperty("Class", "Grid");
      Gridmrec_pContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmrec_p_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("CmpContext", "");
      Gridmrec_pContainer.AddObjectProperty("InMasterPage", "false");
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14153MRecLin, (byte)(12), (byte)(0), ".", "")));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRecLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", A14166MPRecPLC);
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecPLC_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", GXutil.rtrim( A14165MPRecVal));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecVal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", localUtil.ttoc( A14167MPRecFec, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", GXutil.booltostr( A14168MPRecEr));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkMPRecEr.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", localUtil.ttoc( A14169MPRecFecEv, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecFecEv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14170MPRecEst, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbMPRecEst.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), ".", "")));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecInt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", GXutil.rtrim( A14687MPRecValMi));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecValMi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", GXutil.rtrim( A14688MPRecValMa));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecValMa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14689MPRecParFa, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecParFa_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridmrec_pColumn.AddObjectProperty("Value", localUtil.ttoc( A14690MPRecReg, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridmrec_pColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMPRecReg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddColumnProperties(Gridmrec_pColumn);
      Gridmrec_pContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmrec_p_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmrec_p_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_p_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmrec_p_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmrec_p_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmrec_p_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridmrec_pContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmrec_p_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtMEnvOrd_Internalname = "MENVORD" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMEnvMaqCod_Internalname = "MENVMAQCOD" ;
      edtMEnvMaqDsc_Internalname = "MENVMAQDSC" ;
      edtMEnvIni_Internalname = "MENVINI" ;
      edtMEnvFin_Internalname = "MENVFIN" ;
      cmbMEnvEst.setInternalname( "MENVEST" );
      edtMEnvInt_Internalname = "MENVINT" ;
      edtMRecHdr_Internalname = "MRECHDR" ;
      lblTitlep_Internalname = "TITLEP" ;
      edtMRecLin_Internalname = "MRECLIN" ;
      edtMPRecPLC_Internalname = "MPRECPLC" ;
      edtMPRecVal_Internalname = "MPRECVAL" ;
      edtMPRecFec_Internalname = "MPRECFEC" ;
      chkMPRecEr.setInternalname( "MPRECER" );
      edtMPRecFecEv_Internalname = "MPRECFECEV" ;
      cmbMPRecEst.setInternalname( "MPRECEST" );
      edtMPRecInt_Internalname = "MPRECINT" ;
      edtMPRecValMi_Internalname = "MPRECVALMI" ;
      edtMPRecValMa_Internalname = "MPRECVALMA" ;
      edtMPRecParFa_Internalname = "MPRECPARFA" ;
      edtMPRecReg_Internalname = "MPRECREG" ;
      divPtable_Internalname = "PTABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridmrec_p_Internalname = "GRIDMREC_P" ;
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
      subGridmrec_p_Allowcollapsing = (byte)(0) ;
      subGridmrec_p_Allowselection = (byte)(0) ;
      subGridmrec_p_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Recibir datos de las maquinas", "") );
      edtMPRecReg_Jsonclick = "" ;
      edtMPRecParFa_Jsonclick = "" ;
      edtMPRecValMa_Jsonclick = "" ;
      edtMPRecValMi_Jsonclick = "" ;
      edtMPRecInt_Jsonclick = "" ;
      cmbMPRecEst.setJsonclick( "" );
      edtMPRecFecEv_Jsonclick = "" ;
      chkMPRecEr.setCaption( "" );
      edtMPRecFec_Jsonclick = "" ;
      edtMPRecVal_Jsonclick = "" ;
      edtMPRecPLC_Jsonclick = "" ;
      edtMRecLin_Jsonclick = "" ;
      subGridmrec_p_Class = "Grid" ;
      subGridmrec_p_Backcolorstyle = (byte)(0) ;
      edtMPRecReg_Enabled = 1 ;
      edtMPRecParFa_Enabled = 1 ;
      edtMPRecValMa_Enabled = 1 ;
      edtMPRecValMi_Enabled = 1 ;
      edtMPRecInt_Enabled = 0 ;
      cmbMPRecEst.setEnabled( 0 );
      edtMPRecFecEv_Enabled = 1 ;
      chkMPRecEr.setEnabled( 1 );
      edtMPRecFec_Enabled = 1 ;
      edtMPRecVal_Enabled = 1 ;
      edtMPRecPLC_Enabled = 1 ;
      edtMRecLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtMRecHdr_Jsonclick = "" ;
      edtMRecHdr_Enabled = 1 ;
      edtMEnvInt_Jsonclick = "" ;
      edtMEnvInt_Enabled = 0 ;
      cmbMEnvEst.setJsonclick( "" );
      cmbMEnvEst.setEnabled( 0 );
      edtMEnvFin_Jsonclick = "" ;
      edtMEnvFin_Enabled = 1 ;
      edtMEnvIni_Jsonclick = "" ;
      edtMEnvIni_Enabled = 1 ;
      edtMEnvMaqDsc_Jsonclick = "" ;
      edtMEnvMaqDsc_Enabled = 0 ;
      edtMEnvMaqCod_Jsonclick = "" ;
      edtMEnvMaqCod_Enabled = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtMEnvOrd_Jsonclick = "" ;
      edtMEnvOrd_Enabled = 1 ;
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

   public void gxnrgridmrec_p_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1081895( ) ;
      while ( nGXsfl_108_idx <= nRC_GXsfl_108 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1TE1895( ) ;
         standaloneModal1TE1895( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1TE1895( ) ;
         nGXsfl_108_idx = (int)(nGXsfl_108_idx+1) ;
         sGXsfl_108_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_108_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1081895( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridmrec_pContainer)) ;
      /* End function gxnrGridmrec_p_newrow */
   }

   public void init_web_controls( )
   {
      cmbMEnvEst.setName( "MENVEST" );
      cmbMEnvEst.setWebtags( "" );
      cmbMEnvEst.addItem("1", httpContext.getMessage( "A procesar", ""), (short)(0));
      cmbMEnvEst.addItem("2", httpContext.getMessage( "Procesado", ""), (short)(0));
      if ( cmbMEnvEst.getItemCount() > 0 )
      {
         A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValidValue(GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.str( A14156MEnvEst, 1, 0));
      }
      GXCCtl = "MPRECER_" + sGXsfl_108_idx ;
      chkMPRecEr.setName( GXCCtl );
      chkMPRecEr.setWebtags( "" );
      chkMPRecEr.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMPRecEr.getInternalname(), "TitleCaption", chkMPRecEr.getCaption(), !bGXsfl_108_Refreshing);
      chkMPRecEr.setCheckedValue( "false" );
      A14168MPRecEr = GXutil.strtobool( GXutil.booltostr( A14168MPRecEr)) ;
      GXCCtl = "MPRECEST_" + sGXsfl_108_idx ;
      cmbMPRecEst.setName( GXCCtl );
      cmbMPRecEst.setWebtags( "" );
      cmbMPRecEst.addItem("1", httpContext.getMessage( "A evaluar", ""), (short)(0));
      cmbMPRecEst.addItem("2", httpContext.getMessage( "Evaluado", ""), (short)(0));
      if ( cmbMPRecEst.getItemCount() > 0 )
      {
         A14170MPRecEst = (byte)(GXutil.lval( cmbMPRecEst.getValidValue(GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0))))) ;
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01TE30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(28);
      GX_FocusControl = edtFasCod_Internalname ;
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

   public void valid_Barcodpar( )
   {
      /* Using cursor T01TE30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Menvord( )
   {
      A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValue())) ;
      cmbMEnvEst.setValue( GXutil.str( A14156MEnvEst, 1, 0) );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      if ( cmbMEnvEst.getItemCount() > 0 )
      {
         A14156MEnvEst = (byte)(GXutil.lval( cmbMEnvEst.getValidValue(GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0))))) ;
         cmbMEnvEst.setValue( GXutil.str( A14156MEnvEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", GXutil.rtrim( A457FasCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14154MEnvMaqCod", GXutil.rtrim( A14154MEnvMaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "A14158MEnvIni", localUtil.ttoc( A14158MEnvIni, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14157MEnvFin", localUtil.ttoc( A14157MEnvFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A14686MRecHdr", GXutil.rtrim( A14686MRecHdr));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", GXutil.rtrim( A14164MEnvMaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14162MEnvInt", GXutil.ltrim( localUtil.ntoc( A14162MEnvInt, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14156MEnvEst", GXutil.ltrim( localUtil.ntoc( A14156MEnvEst, (byte)(1), (byte)(0), ".", "")));
      cmbMEnvEst.setValue( GXutil.trim( GXutil.str( A14156MEnvEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMEnvEst.getInternalname(), "Values", cmbMEnvEst.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14152MEnvOrd", GXutil.ltrim( localUtil.ntoc( Z14152MEnvOrd, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14154MEnvMaqCod", GXutil.rtrim( Z14154MEnvMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14158MEnvIni", localUtil.ttoc( Z14158MEnvIni, 10, 12, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14157MEnvFin", localUtil.ttoc( Z14157MEnvFin, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14686MRecHdr", GXutil.rtrim( Z14686MRecHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14164MEnvMaqDsc", GXutil.rtrim( Z14164MEnvMaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14162MEnvInt", GXutil.ltrim( localUtil.ntoc( Z14162MEnvInt, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14156MEnvEst", GXutil.ltrim( localUtil.ntoc( Z14156MEnvEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Fascod( )
   {
      /* Using cursor T01TE19 */
      pr_default.execute(17, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A460FasDsc = T01TE19_A460FasDsc[0] ;
      pr_default.close(17);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
   }

   public void valid_Menvmaqcod( )
   {
      n14164MEnvMaqDsc = false ;
      /* Using cursor T01TE20 */
      pr_default.execute(18, new Object[] {A396EmprCod, A14154MEnvMaqCod});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Máquina", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MENVMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A14164MEnvMaqDsc = T01TE20_A14164MEnvMaqDsc[0] ;
      n14164MEnvMaqDsc = T01TE20_n14164MEnvMaqDsc[0] ;
      pr_default.close(18);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14164MEnvMaqDsc", GXutil.rtrim( A14164MEnvMaqDsc));
   }

   public void valid_Mprecfecev( )
   {
      A14170MPRecEst = (byte)(GXutil.lval( cmbMPRecEst.getValue())) ;
      cmbMPRecEst.setValue( GXutil.str( A14170MPRecEst, 1, 0) );
      if ( ! GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         A14171MPRecInt = DecimalUtil.doubleToDec(GXutil.dtdiffms( A14169MPRecFecEv, A14167MPRecFec)) ;
      }
      else
      {
         A14171MPRecInt = DecimalUtil.doubleToDec(0) ;
      }
      if ( GXutil.dateCompare(GXutil.nullDate(), A14169MPRecFecEv) )
      {
         A14170MPRecEst = (byte)(1) ;
         cmbMPRecEst.setValue( GXutil.str( A14170MPRecEst, 1, 0) );
      }
      else
      {
         A14170MPRecEst = (byte)(2) ;
         cmbMPRecEst.setValue( GXutil.str( A14170MPRecEst, 1, 0) );
      }
      dynload_actions( ) ;
      if ( cmbMPRecEst.getItemCount() > 0 )
      {
         A14170MPRecEst = (byte)(GXutil.lval( cmbMPRecEst.getValidValue(GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0))))) ;
         cmbMPRecEst.setValue( GXutil.str( A14170MPRecEst, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMPRecEst.setValue( GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0)) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14171MPRecInt", GXutil.ltrim( localUtil.ntoc( A14171MPRecInt, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14170MPRecEst", GXutil.ltrim( localUtil.ntoc( A14170MPRecEst, (byte)(1), (byte)(0), ".", "")));
      cmbMPRecEst.setValue( GXutil.trim( GXutil.str( A14170MPRecEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMPRecEst.getInternalname(), "Values", cmbMPRecEst.ToJavascriptSource(), true);
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
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_MENVORD","{handler:'valid_Menvord',iparms:[{av:'cmbMEnvEst'},{av:'A14156MEnvEst',fld:'MENVEST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A14152MEnvOrd',fld:'MENVORD',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_MENVORD",",oparms:[{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A14154MEnvMaqCod',fld:'MENVMAQCOD',pic:''},{av:'A14158MEnvIni',fld:'MENVINI',pic:'99/99/99 99:99:99.999'},{av:'A14157MEnvFin',fld:'MENVFIN',pic:'99/99/99 99:99'},{av:'A14686MRecHdr',fld:'MRECHDR',pic:''},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A14164MEnvMaqDsc',fld:'MENVMAQDSC',pic:''},{av:'A14162MEnvInt',fld:'MENVINT',pic:'ZZZZZZ9.99'},{av:'cmbMEnvEst'},{av:'A14156MEnvEst',fld:'MENVEST',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z14152MEnvOrd'},{av:'Z457FasCod'},{av:'Z14154MEnvMaqCod'},{av:'Z14158MEnvIni'},{av:'Z14157MEnvFin'},{av:'Z14686MRecHdr'},{av:'Z460FasDsc'},{av:'Z14164MEnvMaqDsc'},{av:'Z14162MEnvInt'},{av:'Z14156MEnvEst'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''}]}");
      setEventMetadata("VALID_MENVMAQCOD","{handler:'valid_Menvmaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14154MEnvMaqCod',fld:'MENVMAQCOD',pic:''},{av:'A14164MEnvMaqDsc',fld:'MENVMAQDSC',pic:''}]");
      setEventMetadata("VALID_MENVMAQCOD",",oparms:[{av:'A14164MEnvMaqDsc',fld:'MENVMAQDSC',pic:''}]}");
      setEventMetadata("VALID_MENVINI","{handler:'valid_Menvini',iparms:[]");
      setEventMetadata("VALID_MENVINI",",oparms:[]}");
      setEventMetadata("VALID_MENVFIN","{handler:'valid_Menvfin',iparms:[]");
      setEventMetadata("VALID_MENVFIN",",oparms:[]}");
      setEventMetadata("VALID_MRECLIN","{handler:'valid_Mreclin',iparms:[]");
      setEventMetadata("VALID_MRECLIN",",oparms:[]}");
      setEventMetadata("VALID_MPRECFEC","{handler:'valid_Mprecfec',iparms:[]");
      setEventMetadata("VALID_MPRECFEC",",oparms:[]}");
      setEventMetadata("VALID_MPRECFECEV","{handler:'valid_Mprecfecev',iparms:[{av:'A14169MPRecFecEv',fld:'MPRECFECEV',pic:'99/99/99 99:99:99.999'},{av:'A14167MPRecFec',fld:'MPRECFEC',pic:'99/99/99 99:99:99.999'},{av:'A14171MPRecInt',fld:'MPRECINT',pic:'ZZZZZZ9.99'},{av:'cmbMPRecEst'},{av:'A14170MPRecEst',fld:'MPRECEST',pic:'9'}]");
      setEventMetadata("VALID_MPRECFECEV",",oparms:[{av:'A14171MPRecInt',fld:'MPRECINT',pic:'ZZZZZZ9.99'},{av:'cmbMPRecEst'},{av:'A14170MPRecEst',fld:'MPRECEST',pic:'9'}]}");
      setEventMetadata("NULL","{handler:'valid_Mprecreg',iparms:[]");
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
      pr_default.close(17);
      pr_default.close(28);
      pr_default.close(18);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      Z14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      Z14686MRecHdr = "" ;
      Z457FasCod = "" ;
      Z14154MEnvMaqCod = "" ;
      Z14166MPRecPLC = "" ;
      Z14165MPRecVal = "" ;
      Z14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      Z14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      Z14687MPRecValMi = "" ;
      Z14688MPRecValMa = "" ;
      Z14690MPRecReg = GXutil.resetTime( GXutil.nullDate() );
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A14154MEnvMaqCod = "" ;
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
      A460FasDsc = "" ;
      A14164MEnvMaqDsc = "" ;
      A14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      A14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      A14162MEnvInt = DecimalUtil.ZERO ;
      A14686MRecHdr = "" ;
      lblTitlep_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridmrec_pContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1895 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A14166MPRecPLC = "" ;
      A14165MPRecVal = "" ;
      A14167MPRecFec = GXutil.resetTime( GXutil.nullDate() );
      A14169MPRecFecEv = GXutil.resetTime( GXutil.nullDate() );
      A14171MPRecInt = DecimalUtil.ZERO ;
      A14687MPRecValMi = "" ;
      A14688MPRecValMa = "" ;
      A14690MPRecReg = GXutil.resetTime( GXutil.nullDate() );
      Z460FasDsc = "" ;
      Z14164MEnvMaqDsc = "" ;
      T01TE9_A14152MEnvOrd = new short[1] ;
      T01TE9_A460FasDsc = new String[] {""} ;
      T01TE9_A14164MEnvMaqDsc = new String[] {""} ;
      T01TE9_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01TE9_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE9_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE9_A14686MRecHdr = new String[] {""} ;
      T01TE9_n14686MRecHdr = new boolean[] {false} ;
      T01TE9_A396EmprCod = new String[] {""} ;
      T01TE9_A457FasCod = new String[] {""} ;
      T01TE9_A129BarCod = new int[1] ;
      T01TE9_A132BarCodReo = new byte[1] ;
      T01TE9_A130BarCodPar = new String[] {""} ;
      T01TE9_A14154MEnvMaqCod = new String[] {""} ;
      T01TE6_A460FasDsc = new String[] {""} ;
      T01TE8_A14164MEnvMaqDsc = new String[] {""} ;
      T01TE8_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01TE7_A396EmprCod = new String[] {""} ;
      T01TE10_A460FasDsc = new String[] {""} ;
      T01TE11_A14164MEnvMaqDsc = new String[] {""} ;
      T01TE11_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01TE12_A396EmprCod = new String[] {""} ;
      T01TE13_A396EmprCod = new String[] {""} ;
      T01TE13_A129BarCod = new int[1] ;
      T01TE13_A132BarCodReo = new byte[1] ;
      T01TE13_A130BarCodPar = new String[] {""} ;
      T01TE13_A14152MEnvOrd = new short[1] ;
      T01TE5_A14152MEnvOrd = new short[1] ;
      T01TE5_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE5_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE5_A14686MRecHdr = new String[] {""} ;
      T01TE5_n14686MRecHdr = new boolean[] {false} ;
      T01TE5_A396EmprCod = new String[] {""} ;
      T01TE5_A457FasCod = new String[] {""} ;
      T01TE5_A129BarCod = new int[1] ;
      T01TE5_A132BarCodReo = new byte[1] ;
      T01TE5_A130BarCodPar = new String[] {""} ;
      T01TE5_A14154MEnvMaqCod = new String[] {""} ;
      sMode1893 = "" ;
      T01TE14_A396EmprCod = new String[] {""} ;
      T01TE14_A129BarCod = new int[1] ;
      T01TE14_A132BarCodReo = new byte[1] ;
      T01TE14_A130BarCodPar = new String[] {""} ;
      T01TE14_A14152MEnvOrd = new short[1] ;
      T01TE15_A396EmprCod = new String[] {""} ;
      T01TE15_A129BarCod = new int[1] ;
      T01TE15_A132BarCodReo = new byte[1] ;
      T01TE15_A130BarCodPar = new String[] {""} ;
      T01TE15_A14152MEnvOrd = new short[1] ;
      T01TE4_A14152MEnvOrd = new short[1] ;
      T01TE4_A14158MEnvIni = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE4_A14157MEnvFin = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE4_A14686MRecHdr = new String[] {""} ;
      T01TE4_n14686MRecHdr = new boolean[] {false} ;
      T01TE4_A396EmprCod = new String[] {""} ;
      T01TE4_A457FasCod = new String[] {""} ;
      T01TE4_A129BarCod = new int[1] ;
      T01TE4_A132BarCodReo = new byte[1] ;
      T01TE4_A130BarCodPar = new String[] {""} ;
      T01TE4_A14154MEnvMaqCod = new String[] {""} ;
      T01TE19_A460FasDsc = new String[] {""} ;
      T01TE20_A14164MEnvMaqDsc = new String[] {""} ;
      T01TE20_n14164MEnvMaqDsc = new boolean[] {false} ;
      T01TE21_A14674MEPrId = new long[1] ;
      T01TE22_A396EmprCod = new String[] {""} ;
      T01TE22_A129BarCod = new int[1] ;
      T01TE22_A132BarCodReo = new byte[1] ;
      T01TE22_A130BarCodPar = new String[] {""} ;
      T01TE22_A14152MEnvOrd = new short[1] ;
      T01TE22_A1664ParFasCod = new short[1] ;
      T01TE23_A396EmprCod = new String[] {""} ;
      T01TE23_A129BarCod = new int[1] ;
      T01TE23_A132BarCodReo = new byte[1] ;
      T01TE23_A130BarCodPar = new String[] {""} ;
      T01TE23_A14152MEnvOrd = new short[1] ;
      T01TE24_A129BarCod = new int[1] ;
      T01TE24_A132BarCodReo = new byte[1] ;
      T01TE24_A130BarCodPar = new String[] {""} ;
      T01TE24_A14152MEnvOrd = new short[1] ;
      T01TE24_A14153MRecLin = new long[1] ;
      T01TE24_A14166MPRecPLC = new String[] {""} ;
      T01TE24_A14165MPRecVal = new String[] {""} ;
      T01TE24_A14167MPRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE24_A14168MPRecEr = new boolean[] {false} ;
      T01TE24_A14169MPRecFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE24_A14687MPRecValMi = new String[] {""} ;
      T01TE24_n14687MPRecValMi = new boolean[] {false} ;
      T01TE24_A14688MPRecValMa = new String[] {""} ;
      T01TE24_n14688MPRecValMa = new boolean[] {false} ;
      T01TE24_A14689MPRecParFa = new short[1] ;
      T01TE24_n14689MPRecParFa = new boolean[] {false} ;
      T01TE24_A14690MPRecReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE24_n14690MPRecReg = new boolean[] {false} ;
      T01TE24_A396EmprCod = new String[] {""} ;
      T01TE25_A396EmprCod = new String[] {""} ;
      T01TE25_A129BarCod = new int[1] ;
      T01TE25_A132BarCodReo = new byte[1] ;
      T01TE25_A130BarCodPar = new String[] {""} ;
      T01TE25_A14152MEnvOrd = new short[1] ;
      T01TE25_A14153MRecLin = new long[1] ;
      T01TE3_A129BarCod = new int[1] ;
      T01TE3_A132BarCodReo = new byte[1] ;
      T01TE3_A130BarCodPar = new String[] {""} ;
      T01TE3_A14152MEnvOrd = new short[1] ;
      T01TE3_A14153MRecLin = new long[1] ;
      T01TE3_A14166MPRecPLC = new String[] {""} ;
      T01TE3_A14165MPRecVal = new String[] {""} ;
      T01TE3_A14167MPRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE3_A14168MPRecEr = new boolean[] {false} ;
      T01TE3_A14169MPRecFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE3_A14687MPRecValMi = new String[] {""} ;
      T01TE3_n14687MPRecValMi = new boolean[] {false} ;
      T01TE3_A14688MPRecValMa = new String[] {""} ;
      T01TE3_n14688MPRecValMa = new boolean[] {false} ;
      T01TE3_A14689MPRecParFa = new short[1] ;
      T01TE3_n14689MPRecParFa = new boolean[] {false} ;
      T01TE3_A14690MPRecReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE3_n14690MPRecReg = new boolean[] {false} ;
      T01TE3_A396EmprCod = new String[] {""} ;
      T01TE2_A129BarCod = new int[1] ;
      T01TE2_A132BarCodReo = new byte[1] ;
      T01TE2_A130BarCodPar = new String[] {""} ;
      T01TE2_A14152MEnvOrd = new short[1] ;
      T01TE2_A14153MRecLin = new long[1] ;
      T01TE2_A14166MPRecPLC = new String[] {""} ;
      T01TE2_A14165MPRecVal = new String[] {""} ;
      T01TE2_A14167MPRecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE2_A14168MPRecEr = new boolean[] {false} ;
      T01TE2_A14169MPRecFecEv = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE2_A14687MPRecValMi = new String[] {""} ;
      T01TE2_n14687MPRecValMi = new boolean[] {false} ;
      T01TE2_A14688MPRecValMa = new String[] {""} ;
      T01TE2_n14688MPRecValMa = new boolean[] {false} ;
      T01TE2_A14689MPRecParFa = new short[1] ;
      T01TE2_n14689MPRecParFa = new boolean[] {false} ;
      T01TE2_A14690MPRecReg = new java.util.Date[] {GXutil.nullDate()} ;
      T01TE2_n14690MPRecReg = new boolean[] {false} ;
      T01TE2_A396EmprCod = new String[] {""} ;
      T01TE29_A396EmprCod = new String[] {""} ;
      T01TE29_A129BarCod = new int[1] ;
      T01TE29_A132BarCodReo = new byte[1] ;
      T01TE29_A130BarCodPar = new String[] {""} ;
      T01TE29_A14152MEnvOrd = new short[1] ;
      T01TE29_A14153MRecLin = new long[1] ;
      Gridmrec_pRow = new com.genexus.webpanels.GXWebRow();
      subGridmrec_p_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridmrec_pColumn = new com.genexus.webpanels.GXWebColumn();
      T01TE30_A396EmprCod = new String[] {""} ;
      Z14162MEnvInt = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ457FasCod = "" ;
      ZZ14154MEnvMaqCod = "" ;
      ZZ14158MEnvIni = GXutil.resetTime( GXutil.nullDate() );
      ZZ14157MEnvFin = GXutil.resetTime( GXutil.nullDate() );
      ZZ14686MRecHdr = "" ;
      ZZ460FasDsc = "" ;
      ZZ14164MEnvMaqDsc = "" ;
      ZZ14162MEnvInt = DecimalUtil.ZERO ;
      Z14171MPRecInt = DecimalUtil.ZERO ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ingenieria.mrec__default(),
         new Object[] {
             new Object[] {
            T01TE2_A129BarCod, T01TE2_A132BarCodReo, T01TE2_A130BarCodPar, T01TE2_A14152MEnvOrd, T01TE2_A14153MRecLin, T01TE2_A14166MPRecPLC, T01TE2_A14165MPRecVal, T01TE2_A14167MPRecFec, T01TE2_A14168MPRecEr, T01TE2_A14169MPRecFecEv,
            T01TE2_A14687MPRecValMi, T01TE2_n14687MPRecValMi, T01TE2_A14688MPRecValMa, T01TE2_n14688MPRecValMa, T01TE2_A14689MPRecParFa, T01TE2_n14689MPRecParFa, T01TE2_A14690MPRecReg, T01TE2_n14690MPRecReg, T01TE2_A396EmprCod
            }
            , new Object[] {
            T01TE3_A129BarCod, T01TE3_A132BarCodReo, T01TE3_A130BarCodPar, T01TE3_A14152MEnvOrd, T01TE3_A14153MRecLin, T01TE3_A14166MPRecPLC, T01TE3_A14165MPRecVal, T01TE3_A14167MPRecFec, T01TE3_A14168MPRecEr, T01TE3_A14169MPRecFecEv,
            T01TE3_A14687MPRecValMi, T01TE3_n14687MPRecValMi, T01TE3_A14688MPRecValMa, T01TE3_n14688MPRecValMa, T01TE3_A14689MPRecParFa, T01TE3_n14689MPRecParFa, T01TE3_A14690MPRecReg, T01TE3_n14690MPRecReg, T01TE3_A396EmprCod
            }
            , new Object[] {
            T01TE4_A14152MEnvOrd, T01TE4_A14158MEnvIni, T01TE4_A14157MEnvFin, T01TE4_A14686MRecHdr, T01TE4_n14686MRecHdr, T01TE4_A396EmprCod, T01TE4_A457FasCod, T01TE4_A129BarCod, T01TE4_A132BarCodReo, T01TE4_A130BarCodPar,
            T01TE4_A14154MEnvMaqCod
            }
            , new Object[] {
            T01TE5_A14152MEnvOrd, T01TE5_A14158MEnvIni, T01TE5_A14157MEnvFin, T01TE5_A14686MRecHdr, T01TE5_n14686MRecHdr, T01TE5_A396EmprCod, T01TE5_A457FasCod, T01TE5_A129BarCod, T01TE5_A132BarCodReo, T01TE5_A130BarCodPar,
            T01TE5_A14154MEnvMaqCod
            }
            , new Object[] {
            T01TE6_A460FasDsc
            }
            , new Object[] {
            T01TE7_A396EmprCod
            }
            , new Object[] {
            T01TE8_A14164MEnvMaqDsc, T01TE8_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01TE9_A14152MEnvOrd, T01TE9_A460FasDsc, T01TE9_A14164MEnvMaqDsc, T01TE9_n14164MEnvMaqDsc, T01TE9_A14158MEnvIni, T01TE9_A14157MEnvFin, T01TE9_A14686MRecHdr, T01TE9_n14686MRecHdr, T01TE9_A396EmprCod, T01TE9_A457FasCod,
            T01TE9_A129BarCod, T01TE9_A132BarCodReo, T01TE9_A130BarCodPar, T01TE9_A14154MEnvMaqCod
            }
            , new Object[] {
            T01TE10_A460FasDsc
            }
            , new Object[] {
            T01TE11_A14164MEnvMaqDsc, T01TE11_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01TE12_A396EmprCod
            }
            , new Object[] {
            T01TE13_A396EmprCod, T01TE13_A129BarCod, T01TE13_A132BarCodReo, T01TE13_A130BarCodPar, T01TE13_A14152MEnvOrd
            }
            , new Object[] {
            T01TE14_A396EmprCod, T01TE14_A129BarCod, T01TE14_A132BarCodReo, T01TE14_A130BarCodPar, T01TE14_A14152MEnvOrd
            }
            , new Object[] {
            T01TE15_A396EmprCod, T01TE15_A129BarCod, T01TE15_A132BarCodReo, T01TE15_A130BarCodPar, T01TE15_A14152MEnvOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TE19_A460FasDsc
            }
            , new Object[] {
            T01TE20_A14164MEnvMaqDsc, T01TE20_n14164MEnvMaqDsc
            }
            , new Object[] {
            T01TE21_A14674MEPrId
            }
            , new Object[] {
            T01TE22_A396EmprCod, T01TE22_A129BarCod, T01TE22_A132BarCodReo, T01TE22_A130BarCodPar, T01TE22_A14152MEnvOrd, T01TE22_A1664ParFasCod
            }
            , new Object[] {
            T01TE23_A396EmprCod, T01TE23_A129BarCod, T01TE23_A132BarCodReo, T01TE23_A130BarCodPar, T01TE23_A14152MEnvOrd
            }
            , new Object[] {
            T01TE24_A129BarCod, T01TE24_A132BarCodReo, T01TE24_A130BarCodPar, T01TE24_A14152MEnvOrd, T01TE24_A14153MRecLin, T01TE24_A14166MPRecPLC, T01TE24_A14165MPRecVal, T01TE24_A14167MPRecFec, T01TE24_A14168MPRecEr, T01TE24_A14169MPRecFecEv,
            T01TE24_A14687MPRecValMi, T01TE24_n14687MPRecValMi, T01TE24_A14688MPRecValMa, T01TE24_n14688MPRecValMa, T01TE24_A14689MPRecParFa, T01TE24_n14689MPRecParFa, T01TE24_A14690MPRecReg, T01TE24_n14690MPRecReg, T01TE24_A396EmprCod
            }
            , new Object[] {
            T01TE25_A396EmprCod, T01TE25_A129BarCod, T01TE25_A132BarCodReo, T01TE25_A130BarCodPar, T01TE25_A14152MEnvOrd, T01TE25_A14153MRecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TE29_A396EmprCod, T01TE29_A129BarCod, T01TE29_A132BarCodReo, T01TE29_A130BarCodPar, T01TE29_A14152MEnvOrd, T01TE29_A14153MRecLin
            }
            , new Object[] {
            T01TE30_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A14156MEnvEst ;
   private byte A14170MPRecEst ;
   private byte Gx_BScreen ;
   private byte subGridmrec_p_Backcolorstyle ;
   private byte subGridmrec_p_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridmrec_p_Allowselection ;
   private byte subGridmrec_p_Allowhovering ;
   private byte subGridmrec_p_Allowcollapsing ;
   private byte subGridmrec_p_Collapsed ;
   private byte Z14156MEnvEst ;
   private byte ZZ132BarCodReo ;
   private byte ZZ14156MEnvEst ;
   private byte Z14170MPRecEst ;
   private short Z14152MEnvOrd ;
   private short Z14689MPRecParFa ;
   private short nRcdDeleted_1895 ;
   private short nRcdExists_1895 ;
   private short nIsMod_1895 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14152MEnvOrd ;
   private short nBlankRcdCount1895 ;
   private short RcdFound1895 ;
   private short nBlankRcdUsr1895 ;
   private short A14689MPRecParFa ;
   private short RcdFound1893 ;
   private short nIsDirty_1893 ;
   private short nIsDirty_1895 ;
   private short ZZ14152MEnvOrd ;
   private int Z129BarCod ;
   private int nRC_GXsfl_108 ;
   private int nGXsfl_108_idx=1 ;
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
   private int edtMEnvOrd_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int edtMEnvMaqCod_Enabled ;
   private int edtMEnvMaqDsc_Enabled ;
   private int edtMEnvIni_Enabled ;
   private int edtMEnvFin_Enabled ;
   private int edtMEnvInt_Enabled ;
   private int edtMRecHdr_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtMRecLin_Enabled ;
   private int edtMPRecPLC_Enabled ;
   private int edtMPRecVal_Enabled ;
   private int edtMPRecFec_Enabled ;
   private int edtMPRecFecEv_Enabled ;
   private int edtMPRecInt_Enabled ;
   private int edtMPRecValMi_Enabled ;
   private int edtMPRecValMa_Enabled ;
   private int edtMPRecParFa_Enabled ;
   private int edtMPRecReg_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridmrec_p_Backcolor ;
   private int subGridmrec_p_Allbackcolor ;
   private int defedtMRecLin_Enabled ;
   private int idxLst ;
   private int subGridmrec_p_Selectedindex ;
   private int subGridmrec_p_Selectioncolor ;
   private int subGridmrec_p_Hoveringcolor ;
   private int ZZ129BarCod ;
   private long Z14153MRecLin ;
   private long GRIDMREC_P_nFirstRecordOnPage ;
   private long A14153MRecLin ;
   private java.math.BigDecimal A14162MEnvInt ;
   private java.math.BigDecimal A14171MPRecInt ;
   private java.math.BigDecimal Z14162MEnvInt ;
   private java.math.BigDecimal ZZ14162MEnvInt ;
   private java.math.BigDecimal Z14171MPRecInt ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z14686MRecHdr ;
   private String Z457FasCod ;
   private String Z14154MEnvMaqCod ;
   private String Z14165MPRecVal ;
   private String Z14687MPRecValMi ;
   private String Z14688MPRecValMa ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A14154MEnvMaqCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_108_idx="0001" ;
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
   private String edtMEnvOrd_Internalname ;
   private String edtMEnvOrd_Jsonclick ;
   private String edtFasCod_Internalname ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String edtMEnvMaqCod_Internalname ;
   private String edtMEnvMaqCod_Jsonclick ;
   private String edtMEnvMaqDsc_Internalname ;
   private String A14164MEnvMaqDsc ;
   private String edtMEnvMaqDsc_Jsonclick ;
   private String edtMEnvIni_Internalname ;
   private String edtMEnvIni_Jsonclick ;
   private String edtMEnvFin_Internalname ;
   private String edtMEnvFin_Jsonclick ;
   private String edtMEnvInt_Internalname ;
   private String edtMEnvInt_Jsonclick ;
   private String edtMRecHdr_Internalname ;
   private String A14686MRecHdr ;
   private String edtMRecHdr_Jsonclick ;
   private String divPtable_Internalname ;
   private String lblTitlep_Internalname ;
   private String lblTitlep_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1895 ;
   private String edtMRecLin_Internalname ;
   private String edtMPRecPLC_Internalname ;
   private String edtMPRecVal_Internalname ;
   private String edtMPRecFec_Internalname ;
   private String edtMPRecFecEv_Internalname ;
   private String edtMPRecInt_Internalname ;
   private String edtMPRecValMi_Internalname ;
   private String edtMPRecValMa_Internalname ;
   private String edtMPRecParFa_Internalname ;
   private String edtMPRecReg_Internalname ;
   private String sStyleString ;
   private String subGridmrec_p_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A14165MPRecVal ;
   private String A14687MPRecValMi ;
   private String A14688MPRecValMa ;
   private String Z460FasDsc ;
   private String Z14164MEnvMaqDsc ;
   private String sMode1893 ;
   private String sGXsfl_108_fel_idx="0001" ;
   private String subGridmrec_p_Class ;
   private String subGridmrec_p_Linesclass ;
   private String ROClassString ;
   private String edtMRecLin_Jsonclick ;
   private String edtMPRecPLC_Jsonclick ;
   private String edtMPRecVal_Jsonclick ;
   private String edtMPRecFec_Jsonclick ;
   private String edtMPRecFecEv_Jsonclick ;
   private String edtMPRecInt_Jsonclick ;
   private String edtMPRecValMi_Jsonclick ;
   private String edtMPRecValMa_Jsonclick ;
   private String edtMPRecParFa_Jsonclick ;
   private String edtMPRecReg_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridmrec_p_Header ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ457FasCod ;
   private String ZZ14154MEnvMaqCod ;
   private String ZZ14686MRecHdr ;
   private String ZZ460FasDsc ;
   private String ZZ14164MEnvMaqDsc ;
   private java.util.Date Z14158MEnvIni ;
   private java.util.Date Z14157MEnvFin ;
   private java.util.Date Z14167MPRecFec ;
   private java.util.Date Z14169MPRecFecEv ;
   private java.util.Date Z14690MPRecReg ;
   private java.util.Date A14158MEnvIni ;
   private java.util.Date A14157MEnvFin ;
   private java.util.Date A14167MPRecFec ;
   private java.util.Date A14169MPRecFecEv ;
   private java.util.Date A14690MPRecReg ;
   private java.util.Date ZZ14158MEnvIni ;
   private java.util.Date ZZ14157MEnvFin ;
   private boolean Z14168MPRecEr ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_108_Refreshing=false ;
   private boolean n14164MEnvMaqDsc ;
   private boolean n14686MRecHdr ;
   private boolean A14168MPRecEr ;
   private boolean n14687MPRecValMi ;
   private boolean n14688MPRecValMa ;
   private boolean n14689MPRecParFa ;
   private boolean n14690MPRecReg ;
   private boolean Gx_longc ;
   private String Z14166MPRecPLC ;
   private String A14166MPRecPLC ;
   private com.genexus.webpanels.GXWebGrid Gridmrec_pContainer ;
   private com.genexus.webpanels.GXWebRow Gridmrec_pRow ;
   private com.genexus.webpanels.GXWebColumn Gridmrec_pColumn ;
   private HTMLChoice cmbMEnvEst ;
   private ICheckbox chkMPRecEr ;
   private HTMLChoice cmbMPRecEst ;
   private IDataStoreProvider pr_default ;
   private short[] T01TE9_A14152MEnvOrd ;
   private String[] T01TE9_A460FasDsc ;
   private String[] T01TE9_A14164MEnvMaqDsc ;
   private boolean[] T01TE9_n14164MEnvMaqDsc ;
   private java.util.Date[] T01TE9_A14158MEnvIni ;
   private java.util.Date[] T01TE9_A14157MEnvFin ;
   private String[] T01TE9_A14686MRecHdr ;
   private boolean[] T01TE9_n14686MRecHdr ;
   private String[] T01TE9_A396EmprCod ;
   private String[] T01TE9_A457FasCod ;
   private int[] T01TE9_A129BarCod ;
   private byte[] T01TE9_A132BarCodReo ;
   private String[] T01TE9_A130BarCodPar ;
   private String[] T01TE9_A14154MEnvMaqCod ;
   private String[] T01TE6_A460FasDsc ;
   private String[] T01TE8_A14164MEnvMaqDsc ;
   private boolean[] T01TE8_n14164MEnvMaqDsc ;
   private String[] T01TE7_A396EmprCod ;
   private String[] T01TE10_A460FasDsc ;
   private String[] T01TE11_A14164MEnvMaqDsc ;
   private boolean[] T01TE11_n14164MEnvMaqDsc ;
   private String[] T01TE12_A396EmprCod ;
   private String[] T01TE13_A396EmprCod ;
   private int[] T01TE13_A129BarCod ;
   private byte[] T01TE13_A132BarCodReo ;
   private String[] T01TE13_A130BarCodPar ;
   private short[] T01TE13_A14152MEnvOrd ;
   private short[] T01TE5_A14152MEnvOrd ;
   private java.util.Date[] T01TE5_A14158MEnvIni ;
   private java.util.Date[] T01TE5_A14157MEnvFin ;
   private String[] T01TE5_A14686MRecHdr ;
   private boolean[] T01TE5_n14686MRecHdr ;
   private String[] T01TE5_A396EmprCod ;
   private String[] T01TE5_A457FasCod ;
   private int[] T01TE5_A129BarCod ;
   private byte[] T01TE5_A132BarCodReo ;
   private String[] T01TE5_A130BarCodPar ;
   private String[] T01TE5_A14154MEnvMaqCod ;
   private String[] T01TE14_A396EmprCod ;
   private int[] T01TE14_A129BarCod ;
   private byte[] T01TE14_A132BarCodReo ;
   private String[] T01TE14_A130BarCodPar ;
   private short[] T01TE14_A14152MEnvOrd ;
   private String[] T01TE15_A396EmprCod ;
   private int[] T01TE15_A129BarCod ;
   private byte[] T01TE15_A132BarCodReo ;
   private String[] T01TE15_A130BarCodPar ;
   private short[] T01TE15_A14152MEnvOrd ;
   private short[] T01TE4_A14152MEnvOrd ;
   private java.util.Date[] T01TE4_A14158MEnvIni ;
   private java.util.Date[] T01TE4_A14157MEnvFin ;
   private String[] T01TE4_A14686MRecHdr ;
   private boolean[] T01TE4_n14686MRecHdr ;
   private String[] T01TE4_A396EmprCod ;
   private String[] T01TE4_A457FasCod ;
   private int[] T01TE4_A129BarCod ;
   private byte[] T01TE4_A132BarCodReo ;
   private String[] T01TE4_A130BarCodPar ;
   private String[] T01TE4_A14154MEnvMaqCod ;
   private String[] T01TE19_A460FasDsc ;
   private String[] T01TE20_A14164MEnvMaqDsc ;
   private boolean[] T01TE20_n14164MEnvMaqDsc ;
   private long[] T01TE21_A14674MEPrId ;
   private String[] T01TE22_A396EmprCod ;
   private int[] T01TE22_A129BarCod ;
   private byte[] T01TE22_A132BarCodReo ;
   private String[] T01TE22_A130BarCodPar ;
   private short[] T01TE22_A14152MEnvOrd ;
   private short[] T01TE22_A1664ParFasCod ;
   private String[] T01TE23_A396EmprCod ;
   private int[] T01TE23_A129BarCod ;
   private byte[] T01TE23_A132BarCodReo ;
   private String[] T01TE23_A130BarCodPar ;
   private short[] T01TE23_A14152MEnvOrd ;
   private int[] T01TE24_A129BarCod ;
   private byte[] T01TE24_A132BarCodReo ;
   private String[] T01TE24_A130BarCodPar ;
   private short[] T01TE24_A14152MEnvOrd ;
   private long[] T01TE24_A14153MRecLin ;
   private String[] T01TE24_A14166MPRecPLC ;
   private String[] T01TE24_A14165MPRecVal ;
   private java.util.Date[] T01TE24_A14167MPRecFec ;
   private boolean[] T01TE24_A14168MPRecEr ;
   private java.util.Date[] T01TE24_A14169MPRecFecEv ;
   private String[] T01TE24_A14687MPRecValMi ;
   private boolean[] T01TE24_n14687MPRecValMi ;
   private String[] T01TE24_A14688MPRecValMa ;
   private boolean[] T01TE24_n14688MPRecValMa ;
   private short[] T01TE24_A14689MPRecParFa ;
   private boolean[] T01TE24_n14689MPRecParFa ;
   private java.util.Date[] T01TE24_A14690MPRecReg ;
   private boolean[] T01TE24_n14690MPRecReg ;
   private String[] T01TE24_A396EmprCod ;
   private String[] T01TE25_A396EmprCod ;
   private int[] T01TE25_A129BarCod ;
   private byte[] T01TE25_A132BarCodReo ;
   private String[] T01TE25_A130BarCodPar ;
   private short[] T01TE25_A14152MEnvOrd ;
   private long[] T01TE25_A14153MRecLin ;
   private int[] T01TE3_A129BarCod ;
   private byte[] T01TE3_A132BarCodReo ;
   private String[] T01TE3_A130BarCodPar ;
   private short[] T01TE3_A14152MEnvOrd ;
   private long[] T01TE3_A14153MRecLin ;
   private String[] T01TE3_A14166MPRecPLC ;
   private String[] T01TE3_A14165MPRecVal ;
   private java.util.Date[] T01TE3_A14167MPRecFec ;
   private boolean[] T01TE3_A14168MPRecEr ;
   private java.util.Date[] T01TE3_A14169MPRecFecEv ;
   private String[] T01TE3_A14687MPRecValMi ;
   private boolean[] T01TE3_n14687MPRecValMi ;
   private String[] T01TE3_A14688MPRecValMa ;
   private boolean[] T01TE3_n14688MPRecValMa ;
   private short[] T01TE3_A14689MPRecParFa ;
   private boolean[] T01TE3_n14689MPRecParFa ;
   private java.util.Date[] T01TE3_A14690MPRecReg ;
   private boolean[] T01TE3_n14690MPRecReg ;
   private String[] T01TE3_A396EmprCod ;
   private int[] T01TE2_A129BarCod ;
   private byte[] T01TE2_A132BarCodReo ;
   private String[] T01TE2_A130BarCodPar ;
   private short[] T01TE2_A14152MEnvOrd ;
   private long[] T01TE2_A14153MRecLin ;
   private String[] T01TE2_A14166MPRecPLC ;
   private String[] T01TE2_A14165MPRecVal ;
   private java.util.Date[] T01TE2_A14167MPRecFec ;
   private boolean[] T01TE2_A14168MPRecEr ;
   private java.util.Date[] T01TE2_A14169MPRecFecEv ;
   private String[] T01TE2_A14687MPRecValMi ;
   private boolean[] T01TE2_n14687MPRecValMi ;
   private String[] T01TE2_A14688MPRecValMa ;
   private boolean[] T01TE2_n14688MPRecValMa ;
   private short[] T01TE2_A14689MPRecParFa ;
   private boolean[] T01TE2_n14689MPRecParFa ;
   private java.util.Date[] T01TE2_A14690MPRecReg ;
   private boolean[] T01TE2_n14690MPRecReg ;
   private String[] T01TE2_A396EmprCod ;
   private String[] T01TE29_A396EmprCod ;
   private int[] T01TE29_A129BarCod ;
   private byte[] T01TE29_A132BarCodReo ;
   private String[] T01TE29_A130BarCodPar ;
   private short[] T01TE29_A14152MEnvOrd ;
   private long[] T01TE29_A14153MRecLin ;
   private String[] T01TE30_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class mrec__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mrec__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TE2", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa, MPRecReg, EmprCod FROM TXPMPRec WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ?  FOR UPDATE OF MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa, MPRecReg NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE3", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa, MPRecReg, EmprCod FROM TXPMPRec WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE4", "SELECT MEnvOrd, MEnvIni, MEnvFin, MRecHdr, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?  FOR UPDATE OF MEnvIni, MEnvFin, MRecHdr, FasCod, MEnvMaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE5", "SELECT MEnvOrd, MEnvIni, MEnvFin, MRecHdr, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE6", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE7", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE8", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE9", "SELECT /*+ FIRST_ROWS(100) */ TM1.MEnvOrd, T2.FasDsc, T3.MaqDsc AS MEnvMaqDsc, TM1.MEnvIni, TM1.MEnvFin, TM1.MRecHdr, TM1.EmprCod, TM1.FasCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MEnvMaqCod AS MEnvMaqCod FROM ((TXPMEnv TM1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = TM1.EmprCod AND T2.FasCod = TM1.FasCod) INNER JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.MEnvMaqCod) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.MEnvOrd = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.MEnvOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE10", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE11", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE12", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE13", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and MEnvOrd > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TE15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and MEnvOrd < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, MEnvOrd DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TE16", "INSERT INTO TXPMEnv(MEnvOrd, MEnvIni, MEnvFin, MRecHdr, EmprCod, FasCod, BarCod, BarCodReo, BarCodPar, MEnvMaqCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMEnv")
         ,new UpdateCursor("T01TE17", "UPDATE TXPMEnv SET MEnvIni=?, MEnvFin=?, MRecHdr=?, FasCod=?, MEnvMaqCod=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?", GX_NOMASK, "TXPMEnv")
         ,new UpdateCursor("T01TE18", "DELETE FROM TXPMEnv  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?", GX_NOMASK, "TXPMEnv")
         ,new ForEachCursor("T01TE19", "SELECT FasDsc FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE20", "SELECT MaqDsc AS MEnvMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE21", "SELECT * FROM (SELECT MEPrId FROM MEPr WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TE22", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TE23", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE24", "SELECT BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa, MPRecReg, EmprCod FROM TXPMPRec WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? and MRecLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE25", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin FROM TXPMPRec WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01TE26", "INSERT INTO TXPMPRec(BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin, MPRecPLC, MPRecVal, MPRecFec, MPRecEr, MPRecFecEv, MPRecValMi, MPRecValMa, MPRecParFa, MPRecReg, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMPRec")
         ,new UpdateCursor("T01TE27", "UPDATE TXPMPRec SET MPRecPLC=?, MPRecVal=?, MPRecFec=?, MPRecEr=?, MPRecFecEv=?, MPRecValMi=?, MPRecValMa=?, MPRecParFa=?, MPRecReg=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ?", GX_NOMASK, "TXPMPRec")
         ,new UpdateCursor("T01TE28", "DELETE FROM TXPMPRec  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND MEnvOrd = ? AND MRecLin = ?", GX_NOMASK, "TXPMPRec")
         ,new ForEachCursor("T01TE29", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin FROM TXPMPRec WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and MEnvOrd = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, MRecLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TE30", "SELECT EmprCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8, true);
               ((boolean[]) buf[8])[0] = rslt.getBoolean(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10, true);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(14, true);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8, true);
               ((boolean[]) buf[8])[0] = rslt.getBoolean(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10, true);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(14, true);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2, true);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4, true);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 3);
               ((String[]) buf[9])[0] = rslt.getString(8, 8);
               ((int[]) buf[10])[0] = rslt.getInt(9);
               ((byte[]) buf[11])[0] = rslt.getByte(10);
               ((String[]) buf[12])[0] = rslt.getString(11, 1);
               ((String[]) buf[13])[0] = rslt.getString(12, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8, true);
               ((boolean[]) buf[8])[0] = rslt.getBoolean(9);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDateTime(10, true);
               ((String[]) buf[10])[0] = rslt.getString(11, 12);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(12, 12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(13);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(14, true);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(15, 3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((long[]) buf[5])[0] = rslt.getLong(6);
               return;
            case 28 :
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
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
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
            case 13 :
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
            case 14 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setDateTime(2, (java.util.Date)parms[1], false, true);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 10);
               }
               stmt.setString(5, (String)parms[5], 3);
               stmt.setString(6, (String)parms[6], 8);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 1);
               stmt.setString(10, (String)parms[10], 6);
               return;
            case 15 :
               stmt.setDateTime(1, (java.util.Date)parms[0], false, true);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 10);
               }
               stmt.setString(4, (String)parms[4], 8);
               stmt.setString(5, (String)parms[5], 6);
               stmt.setString(6, (String)parms[6], 3);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 1);
               stmt.setShort(10, ((Number) parms[10]).shortValue());
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
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 19 :
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
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 24 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 100, false);
               stmt.setString(7, (String)parms[6], 12);
               stmt.setDateTime(8, (java.util.Date)parms[7], false, true);
               stmt.setBoolean(9, ((Boolean) parms[8]).booleanValue());
               stmt.setDateTime(10, (java.util.Date)parms[9], false, true);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[11], 12);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[13], 12);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[17], false, true);
               }
               stmt.setString(15, (String)parms[18], 3);
               return;
            case 25 :
               stmt.setVarchar(1, (String)parms[0], 100, false);
               stmt.setString(2, (String)parms[1], 12);
               stmt.setDateTime(3, (java.util.Date)parms[2], false, true);
               stmt.setBoolean(4, ((Boolean) parms[3]).booleanValue());
               stmt.setDateTime(5, (java.util.Date)parms[4], false, true);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 12);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 12);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[12], false, true);
               }
               stmt.setString(10, (String)parms[13], 3);
               stmt.setInt(11, ((Number) parms[14]).intValue());
               stmt.setByte(12, ((Number) parms[15]).byteValue());
               stmt.setString(13, (String)parms[16], 1);
               stmt.setShort(14, ((Number) parms[17]).shortValue());
               stmt.setLong(15, ((Number) parms[18]).longValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setLong(6, ((Number) parms[5]).longValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

