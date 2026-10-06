package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tshasep_impl extends GXDataArea
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
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_3( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_4") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
         n129BarCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
         n132BarCodReo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1013DibCli = httpContext.GetPar( "DibCli") ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1014DibInt = (int)(GXutil.lval( httpContext.GetPar( "DibInt"))) ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A1013DibCli, A252CliCod, A1014DibInt) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtshasep_level1item") == 0 )
      {
         gxnrgridtshasep_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Orden de Separación de Colores", ""), (short)(0)) ;
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

   public void gxnrgridtshasep_level1item_newrow_invoke( )
   {
      nRC_GXsfl_173 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_173"))) ;
      nGXsfl_173_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_173_idx"))) ;
      sGXsfl_173_idx = httpContext.GetPar( "sGXsfl_173_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtshasep_level1item_newrow( ) ;
      /* End function gxnrGridtshasep_level1item_newrow_invoke */
   }

   public tshasep_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tshasep_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tshasep_impl.class ));
   }

   public tshasep_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkOSSEst = UIFactory.getCheckbox(this);
      lstDibTipMaq = new HTMLChoice();
      chkOSSFac = UIFactory.getCheckbox(this);
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
      A7146OSSEst = ((GXutil.strcmp(GXutil.rtrim( A7146OSSEst), "S")==0) ? "S" : "N") ;
      n7146OSSEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7146OSSEst", A7146OSSEst);
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
         httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      }
      A7152OSSFac = ((GXutil.strcmp(GXutil.rtrim( A7152OSSFac), "S")==0) ? "S" : "N") ;
      n7152OSSFac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7152OSSFac", A7152OSSFac);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Orden de Separación de Colores", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TShaSep.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TShaSep.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSCod_Internalname, httpContext.getMessage( "Cod Ord Grab Shablon", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSCod_Internalname, GXutil.ltrim( localUtil.ntoc( A7145OSSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOSSCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7145OSSCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7145OSSCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkOSSEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkOSSEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkOSSEst.getInternalname(), A7146OSSEst, "", httpContext.getMessage( "Estado", ""), 1, chkOSSEst.getEnabled(), "S", httpContext.getMessage( "Realizada", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(49, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,49);\"");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibCli_Internalname, httpContext.getMessage( "Dibujo del Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibCli_Internalname, GXutil.rtrim( A1013DibCli), GXutil.rtrim( localUtil.format( A1013DibCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibCli_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibInt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibInt_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibInt_Internalname, GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibInt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1014DibInt), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibInt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibInt_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibDsc_Internalname, httpContext.getMessage( "Desc del Dibujo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibDsc_Internalname, GXutil.rtrim( A6841DibDsc), GXutil.rtrim( localUtil.format( A6841DibDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibMolCi2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibMolCi2_Internalname, httpContext.getMessage( "Numero Moldes cilindros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMolCi2_Internalname, GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMolCi2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2090DibMolCi2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2090DibMolCi2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMolCi2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibMolCi2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+lstDibTipMaq.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, lstDibTipMaq.getInternalname(), httpContext.getMessage( "Tipo Maquina  Plana,Rotativa,Digital", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ListBox */
      app.GxWebStd.gx_listbox_ctrl1( httpContext, lstDibTipMaq, lstDibTipMaq.getInternalname(), GXutil.rtrim( A1823DibTipMaq), 3, lstDibTipMaq.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, lstDibTipMaq.getEnabled(), 1, (short)(0), 0, "em", 0, "row", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_TShaSep.htm");
      lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDibMolCil_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDibMolCil_Internalname, httpContext.getMessage( "Numero de Moldes/Cilindros", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDibMolCil_Internalname, GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDibMolCil_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1019DibMolCil), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDibMolCil_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDibMolCil_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSUsuCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSUsuCre_Internalname, httpContext.getMessage( "Usuario que Crea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSUsuCre_Internalname, GXutil.rtrim( A7147OSSUsuCre), GXutil.rtrim( localUtil.format( A7147OSSUsuCre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSUsuCre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSUsuCre_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSFchCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSFchCre_Internalname, httpContext.getMessage( "Fecha de Creación", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOSSFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSFchCre_Internalname, localUtil.ttoc( A7148OSSFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A7148OSSFchCre, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSFchCre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOSSFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOSSFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TShaSep.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSUsuRea_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSUsuRea_Internalname, httpContext.getMessage( "Usuario que Realiza", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSUsuRea_Internalname, GXutil.rtrim( A7149OSSUsuRea), GXutil.rtrim( localUtil.format( A7149OSSUsuRea, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSUsuRea_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSUsuRea_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSFchRea_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSFchRea_Internalname, httpContext.getMessage( "Fecha de Realización", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtOSSFchRea_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSFchRea_Internalname, localUtil.ttoc( A7150OSSFchRea, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A7150OSSFchRea, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSFchRea_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSFchRea_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtOSSFchRea_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtOSSFchRea_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TShaSep.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSAnc_Internalname, httpContext.getMessage( "Ancho", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A7151OSSAnc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtOSSAnc_Enabled!=0) ? localUtil.format( A7151OSSAnc, "Z9.99") : localUtil.format( A7151OSSAnc, "Z9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSAnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSAnc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkOSSFac.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkOSSFac.getInternalname(), httpContext.getMessage( "Facturable", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkOSSFac.getInternalname(), A7152OSSFac, "", httpContext.getMessage( "Facturable", ""), 1, chkOSSFac.getEnabled(), "S", httpContext.getMessage( "Facturable", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(134, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,134);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSTpo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSTpo_Internalname, httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSTpo_Internalname, GXutil.rtrim( A7153OSSTpo), GXutil.rtrim( localUtil.format( A7153OSSTpo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSTpo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSTpo_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSMue_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSMue_Internalname, httpContext.getMessage( "Muestra", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSMue_Internalname, GXutil.rtrim( A7154OSSMue), GXutil.rtrim( localUtil.format( A7154OSSMue, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSMue_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSMue_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSDib_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSDib_Internalname, httpContext.getMessage( "Dibujante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSDib_Internalname, GXutil.rtrim( A7155OSSDib), GXutil.rtrim( localUtil.format( A7155OSSDib, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSDib_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSDib_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSImp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSImp_Internalname, httpContext.getMessage( "Impresora", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSImp_Internalname, GXutil.rtrim( A7156OSSImp), GXutil.rtrim( localUtil.format( A7156OSSImp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSImp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSImp_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSPrd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSPrd_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtOSSPrd_Internalname, GXutil.rtrim( A7157OSSPrd), GXutil.rtrim( localUtil.format( A7157OSSPrd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtOSSPrd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtOSSPrd_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtOSSObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtOSSObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtOSSObs_Internalname, A7158OSSObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,164);\"", (short)(0), 1, edtOSSObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "10240", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TShaSep.htm");
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Level1", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      gxdraw_gridtshasep_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 181,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TShaSep.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtshasep_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol173( ) ;
      nGXsfl_173_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1015 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1015 = (short)(1) ;
            scanStartYB1015( ) ;
            while ( RcdFound1015 != 0 )
            {
               init_level_properties1015( ) ;
               getByPrimaryKeyYB1015( ) ;
               addRowYB1015( ) ;
               scanNextYB1015( ) ;
            }
            scanEndYB1015( ) ;
            nBlankRcdCount1015 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalYB1015( ) ;
         standaloneModalYB1015( ) ;
         sMode1015 = Gx_mode ;
         while ( nGXsfl_173_idx < nRC_GXsfl_173 )
         {
            bGXsfl_173_Refreshing = true ;
            readRowYB1015( ) ;
            edtOSSShaOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OSSSHAORD_"+sGXsfl_173_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOSSShaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaOrd_Enabled), 5, 0), !bGXsfl_173_Refreshing);
            edtOSSShaCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OSSSHACOB_"+sGXsfl_173_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOSSShaCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaCob_Enabled), 5, 0), !bGXsfl_173_Refreshing);
            edtOSSShaCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OSSSHACOL_"+sGXsfl_173_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtOSSShaCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaCol_Enabled), 5, 0), !bGXsfl_173_Refreshing);
            if ( ( nRcdExists_1015 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalYB1015( ) ;
            }
            sendRowYB1015( ) ;
            bGXsfl_173_Refreshing = false ;
         }
         Gx_mode = sMode1015 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1015 = (short)(5) ;
         nRcdExists_1015 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartYB1015( ) ;
            while ( RcdFound1015 != 0 )
            {
               sGXsfl_173_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_173_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_1731015( ) ;
               init_level_properties1015( ) ;
               standaloneNotModalYB1015( ) ;
               getByPrimaryKeyYB1015( ) ;
               standaloneModalYB1015( ) ;
               addRowYB1015( ) ;
               scanNextYB1015( ) ;
            }
            scanEndYB1015( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode1015 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_173_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_173_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_1731015( ) ;
      initAllYB1015( ) ;
      init_level_properties1015( ) ;
      nRcdExists_1015 = (short)(0) ;
      nIsMod_1015 = (short)(0) ;
      nRcdDeleted_1015 = (short)(0) ;
      nBlankRcdCount1015 = (short)(nBlankRcdUsr1015+nBlankRcdCount1015) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount1015 > 0 )
      {
         standaloneNotModalYB1015( ) ;
         standaloneModalYB1015( ) ;
         addRowYB1015( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtOSSShaOrd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount1015 = (short)(nBlankRcdCount1015-1) ;
      }
      Gx_mode = sMode1015 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtshasep_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtshasep_level1item", Gridtshasep_level1itemContainer, subGridtshasep_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtshasep_level1itemContainerData", Gridtshasep_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtshasep_level1itemContainerData"+"V", Gridtshasep_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtshasep_level1itemContainerData"+"V"+"\" value='"+Gridtshasep_level1itemContainer.GridValuesHidden()+"'/>") ;
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
         Z7145OSSCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z7145OSSCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7146OSSEst = httpContext.cgiGet( "Z7146OSSEst") ;
         Z7147OSSUsuCre = httpContext.cgiGet( "Z7147OSSUsuCre") ;
         Z7148OSSFchCre = localUtil.ctot( httpContext.cgiGet( "Z7148OSSFchCre"), 0) ;
         Z7149OSSUsuRea = httpContext.cgiGet( "Z7149OSSUsuRea") ;
         Z7150OSSFchRea = localUtil.ctot( httpContext.cgiGet( "Z7150OSSFchRea"), 0) ;
         Z7151OSSAnc = localUtil.ctond( httpContext.cgiGet( "Z7151OSSAnc")) ;
         Z7152OSSFac = httpContext.cgiGet( "Z7152OSSFac") ;
         Z7153OSSTpo = httpContext.cgiGet( "Z7153OSSTpo") ;
         Z7154OSSMue = httpContext.cgiGet( "Z7154OSSMue") ;
         Z7155OSSDib = httpContext.cgiGet( "Z7155OSSDib") ;
         Z7156OSSImp = httpContext.cgiGet( "Z7156OSSImp") ;
         Z7157OSSPrd = httpContext.cgiGet( "Z7157OSSPrd") ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         nRC_GXsfl_173 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_173"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOSSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOSSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OSSCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOSSCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7145OSSCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
         }
         else
         {
            A7145OSSCod = (int)(localUtil.ctol( httpContext.cgiGet( edtOSSCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
         }
         A7146OSSEst = ((GXutil.strcmp(httpContext.cgiGet( chkOSSEst.getInternalname()), "S")==0) ? "S" : "N") ;
         n7146OSSEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7146OSSEst", A7146OSSEst);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A129BarCod = 0 ;
            n129BarCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         }
         else
         {
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n129BarCod = false ;
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
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         else
         {
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n132BarCodReo = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         }
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A1013DibCli = httpContext.cgiGet( edtDibCli_Internalname) ;
         n1013DibCli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = (int)(localUtil.ctol( httpContext.cgiGet( edtDibInt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1014DibInt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         A6841DibDsc = httpContext.cgiGet( edtDibDsc_Internalname) ;
         n6841DibDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6841DibDsc", A6841DibDsc);
         A2090DibMolCi2 = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCi2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n2090DibMolCi2 = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
         lstDibTipMaq.setName( lstDibTipMaq.getInternalname() );
         lstDibTipMaq.setValue( httpContext.cgiGet( lstDibTipMaq.getInternalname()) );
         A1823DibTipMaq = httpContext.cgiGet( lstDibTipMaq.getInternalname()) ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         A1019DibMolCil = (short)(localUtil.ctol( httpContext.cgiGet( edtDibMolCil_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1019DibMolCil = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         A7147OSSUsuCre = httpContext.cgiGet( edtOSSUsuCre_Internalname) ;
         n7147OSSUsuCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7147OSSUsuCre", A7147OSSUsuCre);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtOSSFchCre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "OSSFCHCRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOSSFchCre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7148OSSFchCre = GXutil.resetTime( GXutil.nullDate() );
            n7148OSSFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7148OSSFchCre", localUtil.ttoc( A7148OSSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A7148OSSFchCre = localUtil.ctot( httpContext.cgiGet( edtOSSFchCre_Internalname)) ;
            n7148OSSFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7148OSSFchCre", localUtil.ttoc( A7148OSSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A7149OSSUsuRea = httpContext.cgiGet( edtOSSUsuRea_Internalname) ;
         n7149OSSUsuRea = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7149OSSUsuRea", A7149OSSUsuRea);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtOSSFchRea_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "OSSFCHREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOSSFchRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
            n7150OSSFchRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7150OSSFchRea", localUtil.ttoc( A7150OSSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A7150OSSFchRea = localUtil.ctot( httpContext.cgiGet( edtOSSFchRea_Internalname)) ;
            n7150OSSFchRea = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7150OSSFchRea", localUtil.ttoc( A7150OSSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOSSAnc_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOSSAnc_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "OSSANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtOSSAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7151OSSAnc = DecimalUtil.ZERO ;
            n7151OSSAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7151OSSAnc", GXutil.ltrimstr( A7151OSSAnc, 5, 2));
         }
         else
         {
            A7151OSSAnc = localUtil.ctond( httpContext.cgiGet( edtOSSAnc_Internalname)) ;
            n7151OSSAnc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7151OSSAnc", GXutil.ltrimstr( A7151OSSAnc, 5, 2));
         }
         A7152OSSFac = ((GXutil.strcmp(httpContext.cgiGet( chkOSSFac.getInternalname()), "S")==0) ? "S" : "N") ;
         n7152OSSFac = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7152OSSFac", A7152OSSFac);
         A7153OSSTpo = httpContext.cgiGet( edtOSSTpo_Internalname) ;
         n7153OSSTpo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7153OSSTpo", A7153OSSTpo);
         A7154OSSMue = httpContext.cgiGet( edtOSSMue_Internalname) ;
         n7154OSSMue = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7154OSSMue", A7154OSSMue);
         A7155OSSDib = httpContext.cgiGet( edtOSSDib_Internalname) ;
         n7155OSSDib = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7155OSSDib", A7155OSSDib);
         A7156OSSImp = httpContext.cgiGet( edtOSSImp_Internalname) ;
         n7156OSSImp = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7156OSSImp", A7156OSSImp);
         A7157OSSPrd = httpContext.cgiGet( edtOSSPrd_Internalname) ;
         n7157OSSPrd = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7157OSSPrd", A7157OSSPrd);
         A7158OSSObs = httpContext.cgiGet( edtOSSObs_Internalname) ;
         n7158OSSObs = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7158OSSObs", A7158OSSObs);
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
            A7145OSSCod = (int)(GXutil.lval( httpContext.GetPar( "OSSCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
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
            initAllYB1014( ) ;
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
      disableAttributesYB1014( ) ;
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

   public void confirm_YB1015( )
   {
      nGXsfl_173_idx = 0 ;
      while ( nGXsfl_173_idx < nRC_GXsfl_173 )
      {
         readRowYB1015( ) ;
         if ( ( nRcdExists_1015 != 0 ) || ( nIsMod_1015 != 0 ) )
         {
            getKeyYB1015( ) ;
            if ( ( nRcdExists_1015 == 0 ) && ( nRcdDeleted_1015 == 0 ) )
            {
               if ( RcdFound1015 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateYB1015( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableYB1015( ) ;
                     closeExtendedTableCursorsYB1015( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "OSSSHAORD_" + sGXsfl_173_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtOSSShaOrd_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1015 != 0 )
               {
                  if ( nRcdDeleted_1015 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyYB1015( ) ;
                     loadYB1015( ) ;
                     beforeValidateYB1015( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsYB1015( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1015 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateYB1015( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableYB1015( ) ;
                           closeExtendedTableCursorsYB1015( ) ;
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
                  if ( nRcdDeleted_1015 == 0 )
                  {
                     GXCCtl = "OSSSHAORD_" + sGXsfl_173_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOSSShaOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOSSShaOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A7159OSSShaOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOSSShaCob_Internalname, GXutil.ltrim( localUtil.ntoc( A7160OSSShaCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOSSShaCol_Internalname, GXutil.rtrim( A7161OSSShaCol)) ;
         httpContext.changePostValue( "ZT_"+"Z7159OSSShaOrd_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( Z7159OSSShaOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7160OSSShaCob_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( Z7160OSSShaCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7161OSSShaCol_"+sGXsfl_173_idx, GXutil.rtrim( Z7161OSSShaCol)) ;
         httpContext.changePostValue( "nRcdDeleted_1015_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1015_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1015_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1015 != 0 )
         {
            httpContext.changePostValue( "OSSSHAORD_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OSSSHACOB_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OSSSHACOL_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionYB0( )
   {
   }

   public void zmYB1014( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7146OSSEst = T00YB5_A7146OSSEst[0] ;
            Z7147OSSUsuCre = T00YB5_A7147OSSUsuCre[0] ;
            Z7148OSSFchCre = T00YB5_A7148OSSFchCre[0] ;
            Z7149OSSUsuRea = T00YB5_A7149OSSUsuRea[0] ;
            Z7150OSSFchRea = T00YB5_A7150OSSFchRea[0] ;
            Z7151OSSAnc = T00YB5_A7151OSSAnc[0] ;
            Z7152OSSFac = T00YB5_A7152OSSFac[0] ;
            Z7153OSSTpo = T00YB5_A7153OSSTpo[0] ;
            Z7154OSSMue = T00YB5_A7154OSSMue[0] ;
            Z7155OSSDib = T00YB5_A7155OSSDib[0] ;
            Z7156OSSImp = T00YB5_A7156OSSImp[0] ;
            Z7157OSSPrd = T00YB5_A7157OSSPrd[0] ;
            Z129BarCod = T00YB5_A129BarCod[0] ;
            Z132BarCodReo = T00YB5_A132BarCodReo[0] ;
            Z130BarCodPar = T00YB5_A130BarCodPar[0] ;
         }
         else
         {
            Z7146OSSEst = A7146OSSEst ;
            Z7147OSSUsuCre = A7147OSSUsuCre ;
            Z7148OSSFchCre = A7148OSSFchCre ;
            Z7149OSSUsuRea = A7149OSSUsuRea ;
            Z7150OSSFchRea = A7150OSSFchRea ;
            Z7151OSSAnc = A7151OSSAnc ;
            Z7152OSSFac = A7152OSSFac ;
            Z7153OSSTpo = A7153OSSTpo ;
            Z7154OSSMue = A7154OSSMue ;
            Z7155OSSDib = A7155OSSDib ;
            Z7156OSSImp = A7156OSSImp ;
            Z7157OSSPrd = A7157OSSPrd ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z7145OSSCod = A7145OSSCod ;
         Z7146OSSEst = A7146OSSEst ;
         Z7147OSSUsuCre = A7147OSSUsuCre ;
         Z7148OSSFchCre = A7148OSSFchCre ;
         Z7149OSSUsuRea = A7149OSSUsuRea ;
         Z7150OSSFchRea = A7150OSSFchRea ;
         Z7151OSSAnc = A7151OSSAnc ;
         Z7152OSSFac = A7152OSSFac ;
         Z7153OSSTpo = A7153OSSTpo ;
         Z7154OSSMue = A7154OSSMue ;
         Z7155OSSDib = A7155OSSDib ;
         Z7156OSSImp = A7156OSSImp ;
         Z7157OSSPrd = A7157OSSPrd ;
         Z7158OSSObs = A7158OSSObs ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z407EmprNom = A407EmprNom ;
         Z361DisCod = A361DisCod ;
         Z252CliCod = A252CliCod ;
         Z1013DibCli = A1013DibCli ;
         Z1014DibInt = A1014DibInt ;
         Z279CliNom = A279CliNom ;
         Z6841DibDsc = A6841DibDsc ;
         Z2090DibMolCi2 = A2090DibMolCi2 ;
         Z1823DibTipMaq = A1823DibTipMaq ;
         Z1019DibMolCil = A1019DibMolCil ;
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

   public void loadYB1014( )
   {
      /* Using cursor T00YB11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A7145OSSCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1014 = (short)(1) ;
         A7158OSSObs = T00YB11_A7158OSSObs[0] ;
         n7158OSSObs = T00YB11_n7158OSSObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7158OSSObs", A7158OSSObs);
         A361DisCod = T00YB11_A361DisCod[0] ;
         A407EmprNom = T00YB11_A407EmprNom[0] ;
         n407EmprNom = T00YB11_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A7146OSSEst = T00YB11_A7146OSSEst[0] ;
         n7146OSSEst = T00YB11_n7146OSSEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7146OSSEst", A7146OSSEst);
         A279CliNom = T00YB11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A6841DibDsc = T00YB11_A6841DibDsc[0] ;
         n6841DibDsc = T00YB11_n6841DibDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6841DibDsc", A6841DibDsc);
         A2090DibMolCi2 = T00YB11_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = T00YB11_n2090DibMolCi2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
         A1823DibTipMaq = T00YB11_A1823DibTipMaq[0] ;
         n1823DibTipMaq = T00YB11_n1823DibTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         A1019DibMolCil = T00YB11_A1019DibMolCil[0] ;
         n1019DibMolCil = T00YB11_n1019DibMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         A7147OSSUsuCre = T00YB11_A7147OSSUsuCre[0] ;
         n7147OSSUsuCre = T00YB11_n7147OSSUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7147OSSUsuCre", A7147OSSUsuCre);
         A7148OSSFchCre = T00YB11_A7148OSSFchCre[0] ;
         n7148OSSFchCre = T00YB11_n7148OSSFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7148OSSFchCre", localUtil.ttoc( A7148OSSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7149OSSUsuRea = T00YB11_A7149OSSUsuRea[0] ;
         n7149OSSUsuRea = T00YB11_n7149OSSUsuRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7149OSSUsuRea", A7149OSSUsuRea);
         A7150OSSFchRea = T00YB11_A7150OSSFchRea[0] ;
         n7150OSSFchRea = T00YB11_n7150OSSFchRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7150OSSFchRea", localUtil.ttoc( A7150OSSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7151OSSAnc = T00YB11_A7151OSSAnc[0] ;
         n7151OSSAnc = T00YB11_n7151OSSAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7151OSSAnc", GXutil.ltrimstr( A7151OSSAnc, 5, 2));
         A7152OSSFac = T00YB11_A7152OSSFac[0] ;
         n7152OSSFac = T00YB11_n7152OSSFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7152OSSFac", A7152OSSFac);
         A7153OSSTpo = T00YB11_A7153OSSTpo[0] ;
         n7153OSSTpo = T00YB11_n7153OSSTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7153OSSTpo", A7153OSSTpo);
         A7154OSSMue = T00YB11_A7154OSSMue[0] ;
         n7154OSSMue = T00YB11_n7154OSSMue[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7154OSSMue", A7154OSSMue);
         A7155OSSDib = T00YB11_A7155OSSDib[0] ;
         n7155OSSDib = T00YB11_n7155OSSDib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7155OSSDib", A7155OSSDib);
         A7156OSSImp = T00YB11_A7156OSSImp[0] ;
         n7156OSSImp = T00YB11_n7156OSSImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7156OSSImp", A7156OSSImp);
         A7157OSSPrd = T00YB11_A7157OSSPrd[0] ;
         n7157OSSPrd = T00YB11_n7157OSSPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7157OSSPrd", A7157OSSPrd);
         A129BarCod = T00YB11_A129BarCod[0] ;
         n129BarCod = T00YB11_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00YB11_A132BarCodReo[0] ;
         n132BarCodReo = T00YB11_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00YB11_A130BarCodPar[0] ;
         n130BarCodPar = T00YB11_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A252CliCod = T00YB11_A252CliCod[0] ;
         n252CliCod = T00YB11_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A1013DibCli = T00YB11_A1013DibCli[0] ;
         n1013DibCli = T00YB11_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T00YB11_A1014DibInt[0] ;
         n1014DibInt = T00YB11_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         zmYB1014( -2) ;
      }
      pr_default.close(9);
      onLoadActionsYB1014( ) ;
   }

   public void onLoadActionsYB1014( )
   {
   }

   public void checkExtendedTableYB1014( )
   {
      nIsDirty_1014 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00YB6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00YB6_A407EmprNom[0] ;
      n407EmprNom = T00YB6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      /* Using cursor T00YB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T00YB7_A361DisCod[0] ;
      A252CliCod = T00YB7_A252CliCod[0] ;
      n252CliCod = T00YB7_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      pr_default.close(5);
      /* Using cursor T00YB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1013DibCli = T00YB8_A1013DibCli[0] ;
      n1013DibCli = T00YB8_n1013DibCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = T00YB8_A1014DibInt[0] ;
      n1014DibInt = T00YB8_n1014DibInt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      pr_default.close(6);
      /* Using cursor T00YB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T00YB9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T00YB10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1013DibCli)==0) || (0==A252CliCod) || (0==A1014DibInt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6841DibDsc = T00YB10_A6841DibDsc[0] ;
      n6841DibDsc = T00YB10_n6841DibDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6841DibDsc", A6841DibDsc);
      A2090DibMolCi2 = T00YB10_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T00YB10_n2090DibMolCi2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A1823DibTipMaq = T00YB10_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T00YB10_n1823DibTipMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = T00YB10_A1019DibMolCil[0] ;
      n1019DibMolCil = T00YB10_n1019DibMolCil[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      pr_default.close(8);
      if ( ! ( ( GXutil.strcmp(A7152OSSFac, "S") == 0 ) || ( GXutil.strcmp(A7152OSSFac, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Facturable", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "OSSFAC");
         AnyError = (short)(1) ;
         GX_FocusControl = chkOSSFac.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsYB1014( )
   {
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_3( String A396EmprCod )
   {
      /* Using cursor T00YB12 */
      pr_default.execute(10, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00YB12_A407EmprNom[0] ;
      n407EmprNom = T00YB12_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_4( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T00YB13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T00YB13_A361DisCod[0] ;
      A252CliCod = T00YB13_A252CliCod[0] ;
      n252CliCod = T00YB13_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_5( String A396EmprCod ,
                         int A361DisCod )
   {
      /* Using cursor T00YB14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1013DibCli = T00YB14_A1013DibCli[0] ;
      n1013DibCli = T00YB14_n1013DibCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = T00YB14_A1014DibInt[0] ;
      n1014DibInt = T00YB14_n1014DibInt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1013DibCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_6( String A396EmprCod ,
                         int A252CliCod )
   {
      /* Using cursor T00YB15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A279CliNom = T00YB15_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_7( String A396EmprCod ,
                         String A1013DibCli ,
                         int A252CliCod ,
                         int A1014DibInt )
   {
      /* Using cursor T00YB16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1013DibCli)==0) || (0==A252CliCod) || (0==A1014DibInt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6841DibDsc = T00YB16_A6841DibDsc[0] ;
      n6841DibDsc = T00YB16_n6841DibDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6841DibDsc", A6841DibDsc);
      A2090DibMolCi2 = T00YB16_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T00YB16_n2090DibMolCi2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A1823DibTipMaq = T00YB16_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T00YB16_n1823DibTipMaq[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = T00YB16_A1019DibMolCil[0] ;
      n1019DibMolCil = T00YB16_n1019DibMolCil[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6841DibDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1823DibTipMaq))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKeyYB1014( )
   {
      /* Using cursor T00YB17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1014 = (short)(1) ;
      }
      else
      {
         RcdFound1014 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00YB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmYB1014( 2) ;
         RcdFound1014 = (short)(1) ;
         A7158OSSObs = T00YB5_A7158OSSObs[0] ;
         n7158OSSObs = T00YB5_n7158OSSObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7158OSSObs", A7158OSSObs);
         A7145OSSCod = T00YB5_A7145OSSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
         A7146OSSEst = T00YB5_A7146OSSEst[0] ;
         n7146OSSEst = T00YB5_n7146OSSEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7146OSSEst", A7146OSSEst);
         A7147OSSUsuCre = T00YB5_A7147OSSUsuCre[0] ;
         n7147OSSUsuCre = T00YB5_n7147OSSUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7147OSSUsuCre", A7147OSSUsuCre);
         A7148OSSFchCre = T00YB5_A7148OSSFchCre[0] ;
         n7148OSSFchCre = T00YB5_n7148OSSFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7148OSSFchCre", localUtil.ttoc( A7148OSSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7149OSSUsuRea = T00YB5_A7149OSSUsuRea[0] ;
         n7149OSSUsuRea = T00YB5_n7149OSSUsuRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7149OSSUsuRea", A7149OSSUsuRea);
         A7150OSSFchRea = T00YB5_A7150OSSFchRea[0] ;
         n7150OSSFchRea = T00YB5_n7150OSSFchRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7150OSSFchRea", localUtil.ttoc( A7150OSSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A7151OSSAnc = T00YB5_A7151OSSAnc[0] ;
         n7151OSSAnc = T00YB5_n7151OSSAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7151OSSAnc", GXutil.ltrimstr( A7151OSSAnc, 5, 2));
         A7152OSSFac = T00YB5_A7152OSSFac[0] ;
         n7152OSSFac = T00YB5_n7152OSSFac[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7152OSSFac", A7152OSSFac);
         A7153OSSTpo = T00YB5_A7153OSSTpo[0] ;
         n7153OSSTpo = T00YB5_n7153OSSTpo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7153OSSTpo", A7153OSSTpo);
         A7154OSSMue = T00YB5_A7154OSSMue[0] ;
         n7154OSSMue = T00YB5_n7154OSSMue[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7154OSSMue", A7154OSSMue);
         A7155OSSDib = T00YB5_A7155OSSDib[0] ;
         n7155OSSDib = T00YB5_n7155OSSDib[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7155OSSDib", A7155OSSDib);
         A7156OSSImp = T00YB5_A7156OSSImp[0] ;
         n7156OSSImp = T00YB5_n7156OSSImp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7156OSSImp", A7156OSSImp);
         A7157OSSPrd = T00YB5_A7157OSSPrd[0] ;
         n7157OSSPrd = T00YB5_n7157OSSPrd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7157OSSPrd", A7157OSSPrd);
         A396EmprCod = T00YB5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T00YB5_A129BarCod[0] ;
         n129BarCod = T00YB5_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T00YB5_A132BarCodReo[0] ;
         n132BarCodReo = T00YB5_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T00YB5_A130BarCodPar[0] ;
         n130BarCodPar = T00YB5_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         Z396EmprCod = A396EmprCod ;
         Z7145OSSCod = A7145OSSCod ;
         sMode1014 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadYB1014( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1014 = (short)(0) ;
            initializeNonKeyYB1014( ) ;
         }
         Gx_mode = sMode1014 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1014 = (short)(0) ;
         initializeNonKeyYB1014( ) ;
         sMode1014 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1014 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyYB1014( ) ;
      if ( RcdFound1014 == 0 )
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
      RcdFound1014 = (short)(0) ;
      /* Using cursor T00YB18 */
      pr_default.execute(16, new Object[] {Integer.valueOf(A7145OSSCod), Integer.valueOf(A7145OSSCod), A396EmprCod});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( T00YB18_A7145OSSCod[0] < A7145OSSCod ) || ( T00YB18_A7145OSSCod[0] == A7145OSSCod ) && ( GXutil.strcmp(T00YB18_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( T00YB18_A7145OSSCod[0] > A7145OSSCod ) || ( T00YB18_A7145OSSCod[0] == A7145OSSCod ) && ( GXutil.strcmp(T00YB18_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            A7145OSSCod = T00YB18_A7145OSSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
            A396EmprCod = T00YB18_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound1014 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound1014 = (short)(0) ;
      /* Using cursor T00YB19 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A7145OSSCod), Integer.valueOf(A7145OSSCod), A396EmprCod});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( T00YB19_A7145OSSCod[0] > A7145OSSCod ) || ( T00YB19_A7145OSSCod[0] == A7145OSSCod ) && ( GXutil.strcmp(T00YB19_A396EmprCod[0], A396EmprCod) > 0 ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( T00YB19_A7145OSSCod[0] < A7145OSSCod ) || ( T00YB19_A7145OSSCod[0] == A7145OSSCod ) && ( GXutil.strcmp(T00YB19_A396EmprCod[0], A396EmprCod) < 0 ) ) )
         {
            A7145OSSCod = T00YB19_A7145OSSCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
            A396EmprCod = T00YB19_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            RcdFound1014 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyYB1014( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertYB1014( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1014 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7145OSSCod != Z7145OSSCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A7145OSSCod = Z7145OSSCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
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
               updateYB1014( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7145OSSCod != Z7145OSSCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertYB1014( ) ;
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
                  insertYB1014( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7145OSSCod != Z7145OSSCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7145OSSCod = Z7145OSSCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
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
      if ( RcdFound1014 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = chkOSSEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartYB1014( ) ;
      if ( RcdFound1014 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkOSSEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndYB1014( ) ;
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
      if ( RcdFound1014 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkOSSEst.getInternalname() ;
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
      if ( RcdFound1014 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkOSSEst.getInternalname() ;
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
      scanStartYB1014( ) ;
      if ( RcdFound1014 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound1014 != 0 )
         {
            scanNextYB1014( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = chkOSSEst.getInternalname() ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndYB1014( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyYB1014( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00YB4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPShaSep"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z7146OSSEst, T00YB4_A7146OSSEst[0]) != 0 ) || ( GXutil.strcmp(Z7147OSSUsuCre, T00YB4_A7147OSSUsuCre[0]) != 0 ) || !( GXutil.dateCompare(Z7148OSSFchCre, T00YB4_A7148OSSFchCre[0]) ) || ( GXutil.strcmp(Z7149OSSUsuRea, T00YB4_A7149OSSUsuRea[0]) != 0 ) || !( GXutil.dateCompare(Z7150OSSFchRea, T00YB4_A7150OSSFchRea[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z7151OSSAnc, T00YB4_A7151OSSAnc[0]) != 0 ) || ( GXutil.strcmp(Z7152OSSFac, T00YB4_A7152OSSFac[0]) != 0 ) || ( GXutil.strcmp(Z7153OSSTpo, T00YB4_A7153OSSTpo[0]) != 0 ) || ( GXutil.strcmp(Z7154OSSMue, T00YB4_A7154OSSMue[0]) != 0 ) || ( GXutil.strcmp(Z7155OSSDib, T00YB4_A7155OSSDib[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7156OSSImp, T00YB4_A7156OSSImp[0]) != 0 ) || ( GXutil.strcmp(Z7157OSSPrd, T00YB4_A7157OSSPrd[0]) != 0 ) || ( Z129BarCod != T00YB4_A129BarCod[0] ) || ( Z132BarCodReo != T00YB4_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T00YB4_A130BarCodPar[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z7146OSSEst, T00YB4_A7146OSSEst[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSEst");
               GXutil.writeLogRaw("Old: ",Z7146OSSEst);
               GXutil.writeLogRaw("Current: ",T00YB4_A7146OSSEst[0]);
            }
            if ( GXutil.strcmp(Z7147OSSUsuCre, T00YB4_A7147OSSUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSUsuCre");
               GXutil.writeLogRaw("Old: ",Z7147OSSUsuCre);
               GXutil.writeLogRaw("Current: ",T00YB4_A7147OSSUsuCre[0]);
            }
            if ( !( GXutil.dateCompare(Z7148OSSFchCre, T00YB4_A7148OSSFchCre[0]) ) )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSFchCre");
               GXutil.writeLogRaw("Old: ",Z7148OSSFchCre);
               GXutil.writeLogRaw("Current: ",T00YB4_A7148OSSFchCre[0]);
            }
            if ( GXutil.strcmp(Z7149OSSUsuRea, T00YB4_A7149OSSUsuRea[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSUsuRea");
               GXutil.writeLogRaw("Old: ",Z7149OSSUsuRea);
               GXutil.writeLogRaw("Current: ",T00YB4_A7149OSSUsuRea[0]);
            }
            if ( !( GXutil.dateCompare(Z7150OSSFchRea, T00YB4_A7150OSSFchRea[0]) ) )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSFchRea");
               GXutil.writeLogRaw("Old: ",Z7150OSSFchRea);
               GXutil.writeLogRaw("Current: ",T00YB4_A7150OSSFchRea[0]);
            }
            if ( DecimalUtil.compareTo(Z7151OSSAnc, T00YB4_A7151OSSAnc[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSAnc");
               GXutil.writeLogRaw("Old: ",Z7151OSSAnc);
               GXutil.writeLogRaw("Current: ",T00YB4_A7151OSSAnc[0]);
            }
            if ( GXutil.strcmp(Z7152OSSFac, T00YB4_A7152OSSFac[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSFac");
               GXutil.writeLogRaw("Old: ",Z7152OSSFac);
               GXutil.writeLogRaw("Current: ",T00YB4_A7152OSSFac[0]);
            }
            if ( GXutil.strcmp(Z7153OSSTpo, T00YB4_A7153OSSTpo[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSTpo");
               GXutil.writeLogRaw("Old: ",Z7153OSSTpo);
               GXutil.writeLogRaw("Current: ",T00YB4_A7153OSSTpo[0]);
            }
            if ( GXutil.strcmp(Z7154OSSMue, T00YB4_A7154OSSMue[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSMue");
               GXutil.writeLogRaw("Old: ",Z7154OSSMue);
               GXutil.writeLogRaw("Current: ",T00YB4_A7154OSSMue[0]);
            }
            if ( GXutil.strcmp(Z7155OSSDib, T00YB4_A7155OSSDib[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSDib");
               GXutil.writeLogRaw("Old: ",Z7155OSSDib);
               GXutil.writeLogRaw("Current: ",T00YB4_A7155OSSDib[0]);
            }
            if ( GXutil.strcmp(Z7156OSSImp, T00YB4_A7156OSSImp[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSImp");
               GXutil.writeLogRaw("Old: ",Z7156OSSImp);
               GXutil.writeLogRaw("Current: ",T00YB4_A7156OSSImp[0]);
            }
            if ( GXutil.strcmp(Z7157OSSPrd, T00YB4_A7157OSSPrd[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSPrd");
               GXutil.writeLogRaw("Old: ",Z7157OSSPrd);
               GXutil.writeLogRaw("Current: ",T00YB4_A7157OSSPrd[0]);
            }
            if ( Z129BarCod != T00YB4_A129BarCod[0] )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T00YB4_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T00YB4_A132BarCodReo[0] )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T00YB4_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T00YB4_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T00YB4_A130BarCodPar[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPShaSep"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertYB1014( )
   {
      beforeValidateYB1014( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableYB1014( ) ;
      }
      if ( AnyError == 0 )
      {
         zmYB1014( 0) ;
         checkOptimisticConcurrencyYB1014( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmYB1014( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertYB1014( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00YB20 */
                  pr_default.execute(18, new Object[] {Integer.valueOf(A7145OSSCod), Boolean.valueOf(n7146OSSEst), A7146OSSEst, Boolean.valueOf(n7147OSSUsuCre), A7147OSSUsuCre, Boolean.valueOf(n7148OSSFchCre), A7148OSSFchCre, Boolean.valueOf(n7149OSSUsuRea), A7149OSSUsuRea, Boolean.valueOf(n7150OSSFchRea), A7150OSSFchRea, Boolean.valueOf(n7151OSSAnc), A7151OSSAnc, Boolean.valueOf(n7152OSSFac), A7152OSSFac, Boolean.valueOf(n7153OSSTpo), A7153OSSTpo, Boolean.valueOf(n7154OSSMue), A7154OSSMue, Boolean.valueOf(n7155OSSDib), A7155OSSDib, Boolean.valueOf(n7156OSSImp), A7156OSSImp, Boolean.valueOf(n7157OSSPrd), A7157OSSPrd, Boolean.valueOf(n7158OSSObs), A7158OSSObs, A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaSep");
                  if ( (pr_default.getStatus(18) == 1) )
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
                        processLevelYB1014( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionYB0( ) ;
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
            loadYB1014( ) ;
         }
         endLevelYB1014( ) ;
      }
      closeExtendedTableCursorsYB1014( ) ;
   }

   public void updateYB1014( )
   {
      beforeValidateYB1014( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableYB1014( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyYB1014( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmYB1014( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateYB1014( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00YB21 */
                  pr_default.execute(19, new Object[] {Boolean.valueOf(n7146OSSEst), A7146OSSEst, Boolean.valueOf(n7147OSSUsuCre), A7147OSSUsuCre, Boolean.valueOf(n7148OSSFchCre), A7148OSSFchCre, Boolean.valueOf(n7149OSSUsuRea), A7149OSSUsuRea, Boolean.valueOf(n7150OSSFchRea), A7150OSSFchRea, Boolean.valueOf(n7151OSSAnc), A7151OSSAnc, Boolean.valueOf(n7152OSSFac), A7152OSSFac, Boolean.valueOf(n7153OSSTpo), A7153OSSTpo, Boolean.valueOf(n7154OSSMue), A7154OSSMue, Boolean.valueOf(n7155OSSDib), A7155OSSDib, Boolean.valueOf(n7156OSSImp), A7156OSSImp, Boolean.valueOf(n7157OSSPrd), A7157OSSPrd, Boolean.valueOf(n7158OSSObs), A7158OSSObs, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, A396EmprCod, Integer.valueOf(A7145OSSCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaSep");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPShaSep"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateYB1014( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelYB1014( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionYB0( ) ;
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
         endLevelYB1014( ) ;
      }
      closeExtendedTableCursorsYB1014( ) ;
   }

   public void deferredUpdateYB1014( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateYB1014( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyYB1014( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsYB1014( ) ;
         afterConfirmYB1014( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteYB1014( ) ;
            if ( AnyError == 0 )
            {
               scanStartYB1015( ) ;
               while ( RcdFound1015 != 0 )
               {
                  getByPrimaryKeyYB1015( ) ;
                  deleteYB1015( ) ;
                  scanNextYB1015( ) ;
               }
               scanEndYB1015( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00YB22 */
                  pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaSep");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound1014 == 0 )
                        {
                           initAllYB1014( ) ;
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
                        resetCaptionYB0( ) ;
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
      sMode1014 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelYB1014( ) ;
      Gx_mode = sMode1014 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsYB1014( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00YB23 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         A407EmprNom = T00YB23_A407EmprNom[0] ;
         n407EmprNom = T00YB23_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(21);
         /* Using cursor T00YB24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         A361DisCod = T00YB24_A361DisCod[0] ;
         A252CliCod = T00YB24_A252CliCod[0] ;
         n252CliCod = T00YB24_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         pr_default.close(22);
         /* Using cursor T00YB25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A1013DibCli = T00YB25_A1013DibCli[0] ;
         n1013DibCli = T00YB25_n1013DibCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
         A1014DibInt = T00YB25_A1014DibInt[0] ;
         n1014DibInt = T00YB25_n1014DibInt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
         pr_default.close(23);
         /* Using cursor T00YB26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T00YB26_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(24);
         /* Using cursor T00YB27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
         A6841DibDsc = T00YB27_A6841DibDsc[0] ;
         n6841DibDsc = T00YB27_n6841DibDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6841DibDsc", A6841DibDsc);
         A2090DibMolCi2 = T00YB27_A2090DibMolCi2[0] ;
         n2090DibMolCi2 = T00YB27_n2090DibMolCi2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
         A1823DibTipMaq = T00YB27_A1823DibTipMaq[0] ;
         n1823DibTipMaq = T00YB27_n1823DibTipMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
         A1019DibMolCil = T00YB27_A1019DibMolCil[0] ;
         n1019DibMolCil = T00YB27_n1019DibMolCil[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
         pr_default.close(25);
      }
   }

   public void processNestedLevelYB1015( )
   {
      nGXsfl_173_idx = 0 ;
      while ( nGXsfl_173_idx < nRC_GXsfl_173 )
      {
         readRowYB1015( ) ;
         if ( ( nRcdExists_1015 != 0 ) || ( nIsMod_1015 != 0 ) )
         {
            standaloneNotModalYB1015( ) ;
            getKeyYB1015( ) ;
            if ( ( nRcdExists_1015 == 0 ) && ( nRcdDeleted_1015 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertYB1015( ) ;
            }
            else
            {
               if ( RcdFound1015 != 0 )
               {
                  if ( ( nRcdDeleted_1015 != 0 ) && ( nRcdExists_1015 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteYB1015( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1015 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateYB1015( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1015 == 0 )
                  {
                     GXCCtl = "OSSSHAORD_" + sGXsfl_173_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtOSSShaOrd_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtOSSShaOrd_Internalname, GXutil.ltrim( localUtil.ntoc( A7159OSSShaOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOSSShaCob_Internalname, GXutil.ltrim( localUtil.ntoc( A7160OSSShaCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtOSSShaCol_Internalname, GXutil.rtrim( A7161OSSShaCol)) ;
         httpContext.changePostValue( "ZT_"+"Z7159OSSShaOrd_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( Z7159OSSShaOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7160OSSShaCob_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( Z7160OSSShaCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7161OSSShaCol_"+sGXsfl_173_idx, GXutil.rtrim( Z7161OSSShaCol)) ;
         httpContext.changePostValue( "nRcdDeleted_1015_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1015_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1015_"+sGXsfl_173_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1015 != 0 )
         {
            httpContext.changePostValue( "OSSSHAORD_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaOrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OSSSHACOB_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaCob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "OSSSHACOL_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaCol_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllYB1015( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1015 = (short)(0) ;
      nIsMod_1015 = (short)(0) ;
      nRcdDeleted_1015 = (short)(0) ;
   }

   public void processLevelYB1014( )
   {
      /* Save parent mode. */
      sMode1014 = Gx_mode ;
      processNestedLevelYB1015( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1014 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelYB1014( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteYB1014( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tshasep");
         if ( AnyError == 0 )
         {
            confirmValuesYB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tshasep");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartYB1014( )
   {
      /* Using cursor T00YB28 */
      pr_default.execute(26);
      RcdFound1014 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1014 = (short)(1) ;
         A396EmprCod = T00YB28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7145OSSCod = T00YB28_A7145OSSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextYB1014( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound1014 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound1014 = (short)(1) ;
         A396EmprCod = T00YB28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7145OSSCod = T00YB28_A7145OSSCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
      }
   }

   public void scanEndYB1014( )
   {
      pr_default.close(26);
   }

   public void afterConfirmYB1014( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertYB1014( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateYB1014( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteYB1014( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteYB1014( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateYB1014( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesYB1014( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtOSSCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSCod_Enabled), 5, 0), true);
      chkOSSEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkOSSEst.getInternalname(), "Enabled", GXutil.ltrimstr( chkOSSEst.getEnabled(), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDibCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibCli_Enabled), 5, 0), true);
      edtDibInt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibInt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibInt_Enabled), 5, 0), true);
      edtDibDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibDsc_Enabled), 5, 0), true);
      edtDibMolCi2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMolCi2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMolCi2_Enabled), 5, 0), true);
      lstDibTipMaq.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Enabled", GXutil.ltrimstr( lstDibTipMaq.getEnabled(), 5, 0), true);
      edtDibMolCil_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDibMolCil_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDibMolCil_Enabled), 5, 0), true);
      edtOSSUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSUsuCre_Enabled), 5, 0), true);
      edtOSSFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSFchCre_Enabled), 5, 0), true);
      edtOSSUsuRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSUsuRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSUsuRea_Enabled), 5, 0), true);
      edtOSSFchRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSFchRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSFchRea_Enabled), 5, 0), true);
      edtOSSAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSAnc_Enabled), 5, 0), true);
      chkOSSFac.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkOSSFac.getInternalname(), "Enabled", GXutil.ltrimstr( chkOSSFac.getEnabled(), 5, 0), true);
      edtOSSTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSTpo_Enabled), 5, 0), true);
      edtOSSMue_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSMue_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSMue_Enabled), 5, 0), true);
      edtOSSDib_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSDib_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSDib_Enabled), 5, 0), true);
      edtOSSImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSImp_Enabled), 5, 0), true);
      edtOSSPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSPrd_Enabled), 5, 0), true);
      edtOSSObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSObs_Enabled), 5, 0), true);
   }

   public void zmYB1015( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7160OSSShaCob = T00YB3_A7160OSSShaCob[0] ;
            Z7161OSSShaCol = T00YB3_A7161OSSShaCol[0] ;
         }
         else
         {
            Z7160OSSShaCob = A7160OSSShaCob ;
            Z7161OSSShaCol = A7161OSSShaCol ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z7145OSSCod = A7145OSSCod ;
         Z7159OSSShaOrd = A7159OSSShaOrd ;
         Z7160OSSShaCob = A7160OSSShaCob ;
         Z7161OSSShaCol = A7161OSSShaCol ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModalYB1015( )
   {
   }

   public void standaloneModalYB1015( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtOSSShaOrd_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOSSShaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaOrd_Enabled), 5, 0), !bGXsfl_173_Refreshing);
      }
      else
      {
         edtOSSShaOrd_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtOSSShaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaOrd_Enabled), 5, 0), !bGXsfl_173_Refreshing);
      }
   }

   public void loadYB1015( )
   {
      /* Using cursor T00YB29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod), Byte.valueOf(A7159OSSShaOrd)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound1015 = (short)(1) ;
         A7160OSSShaCob = T00YB29_A7160OSSShaCob[0] ;
         A7161OSSShaCol = T00YB29_A7161OSSShaCol[0] ;
         zmYB1015( -8) ;
      }
      pr_default.close(27);
      onLoadActionsYB1015( ) ;
   }

   public void onLoadActionsYB1015( )
   {
   }

   public void checkExtendedTableYB1015( )
   {
      nIsDirty_1015 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalYB1015( ) ;
   }

   public void closeExtendedTableCursorsYB1015( )
   {
   }

   public void enableDisableYB1015( )
   {
   }

   public void getKeyYB1015( )
   {
      /* Using cursor T00YB30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod), Byte.valueOf(A7159OSSShaOrd)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1015 = (short)(1) ;
      }
      else
      {
         RcdFound1015 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKeyYB1015( )
   {
      /* Using cursor T00YB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod), Byte.valueOf(A7159OSSShaOrd)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmYB1015( 8) ;
         RcdFound1015 = (short)(1) ;
         initializeNonKeyYB1015( ) ;
         A7159OSSShaOrd = T00YB3_A7159OSSShaOrd[0] ;
         A7160OSSShaCob = T00YB3_A7160OSSShaCob[0] ;
         A7161OSSShaCol = T00YB3_A7161OSSShaCol[0] ;
         Z396EmprCod = A396EmprCod ;
         Z7145OSSCod = A7145OSSCod ;
         Z7159OSSShaOrd = A7159OSSShaOrd ;
         sMode1015 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalYB1015( ) ;
         loadYB1015( ) ;
         Gx_mode = sMode1015 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1015 = (short)(0) ;
         initializeNonKeyYB1015( ) ;
         sMode1015 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalYB1015( ) ;
         Gx_mode = sMode1015 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesYB1015( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyYB1015( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00YB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod), Byte.valueOf(A7159OSSShaOrd)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPShaSe1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z7160OSSShaCob, T00YB2_A7160OSSShaCob[0]) != 0 ) || ( GXutil.strcmp(Z7161OSSShaCol, T00YB2_A7161OSSShaCol[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z7160OSSShaCob, T00YB2_A7160OSSShaCob[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSShaCob");
               GXutil.writeLogRaw("Old: ",Z7160OSSShaCob);
               GXutil.writeLogRaw("Current: ",T00YB2_A7160OSSShaCob[0]);
            }
            if ( GXutil.strcmp(Z7161OSSShaCol, T00YB2_A7161OSSShaCol[0]) != 0 )
            {
               GXutil.writeLogln("tshasep:[seudo value changed for attri]"+"OSSShaCol");
               GXutil.writeLogRaw("Old: ",Z7161OSSShaCol);
               GXutil.writeLogRaw("Current: ",T00YB2_A7161OSSShaCol[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPShaSe1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertYB1015( )
   {
      beforeValidateYB1015( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableYB1015( ) ;
      }
      if ( AnyError == 0 )
      {
         zmYB1015( 0) ;
         checkOptimisticConcurrencyYB1015( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmYB1015( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertYB1015( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00YB31 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A7145OSSCod), Byte.valueOf(A7159OSSShaOrd), A7160OSSShaCob, A7161OSSShaCol, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaSe1");
                  if ( (pr_default.getStatus(29) == 1) )
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
            loadYB1015( ) ;
         }
         endLevelYB1015( ) ;
      }
      closeExtendedTableCursorsYB1015( ) ;
   }

   public void updateYB1015( )
   {
      beforeValidateYB1015( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableYB1015( ) ;
      }
      if ( ( nIsMod_1015 != 0 ) || ( nIsDirty_1015 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyYB1015( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmYB1015( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateYB1015( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00YB32 */
                     pr_default.execute(30, new Object[] {A7160OSSShaCob, A7161OSSShaCol, A396EmprCod, Integer.valueOf(A7145OSSCod), Byte.valueOf(A7159OSSShaOrd)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaSe1");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPShaSe1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateYB1015( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyYB1015( ) ;
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
            endLevelYB1015( ) ;
         }
      }
      closeExtendedTableCursorsYB1015( ) ;
   }

   public void deferredUpdateYB1015( )
   {
   }

   public void deleteYB1015( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateYB1015( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyYB1015( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsYB1015( ) ;
         afterConfirmYB1015( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteYB1015( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00YB33 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod), Byte.valueOf(A7159OSSShaOrd)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPShaSe1");
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
      sMode1015 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelYB1015( ) ;
      Gx_mode = sMode1015 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsYB1015( )
   {
      standaloneModalYB1015( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelYB1015( )
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

   public void scanStartYB1015( )
   {
      /* Scan By routine */
      /* Using cursor T00YB34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A7145OSSCod)});
      RcdFound1015 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1015 = (short)(1) ;
         A7159OSSShaOrd = T00YB34_A7159OSSShaOrd[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextYB1015( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound1015 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound1015 = (short)(1) ;
         A7159OSSShaOrd = T00YB34_A7159OSSShaOrd[0] ;
      }
   }

   public void scanEndYB1015( )
   {
      pr_default.close(32);
   }

   public void afterConfirmYB1015( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertYB1015( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateYB1015( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteYB1015( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteYB1015( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateYB1015( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesYB1015( )
   {
      edtOSSShaOrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSShaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaOrd_Enabled), 5, 0), !bGXsfl_173_Refreshing);
      edtOSSShaCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSShaCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaCob_Enabled), 5, 0), !bGXsfl_173_Refreshing);
      edtOSSShaCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSShaCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaCol_Enabled), 5, 0), !bGXsfl_173_Refreshing);
   }

   public void send_integrity_lvl_hashesYB1015( )
   {
   }

   public void send_integrity_lvl_hashesYB1014( )
   {
   }

   public void subsflControlProps_1731015( )
   {
      edtOSSShaOrd_Internalname = "OSSSHAORD_"+sGXsfl_173_idx ;
      edtOSSShaCob_Internalname = "OSSSHACOB_"+sGXsfl_173_idx ;
      edtOSSShaCol_Internalname = "OSSSHACOL_"+sGXsfl_173_idx ;
   }

   public void subsflControlProps_fel_1731015( )
   {
      edtOSSShaOrd_Internalname = "OSSSHAORD_"+sGXsfl_173_fel_idx ;
      edtOSSShaCob_Internalname = "OSSSHACOB_"+sGXsfl_173_fel_idx ;
      edtOSSShaCol_Internalname = "OSSSHACOL_"+sGXsfl_173_fel_idx ;
   }

   public void addRowYB1015( )
   {
      nGXsfl_173_idx = (int)(nGXsfl_173_idx+1) ;
      sGXsfl_173_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_173_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1731015( ) ;
      sendRowYB1015( ) ;
   }

   public void sendRowYB1015( )
   {
      Gridtshasep_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtshasep_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtshasep_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtshasep_level1item_Class, "") != 0 )
         {
            subGridtshasep_level1item_Linesclass = subGridtshasep_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtshasep_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtshasep_level1item_Backstyle = (byte)(0) ;
         subGridtshasep_level1item_Backcolor = subGridtshasep_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtshasep_level1item_Class, "") != 0 )
         {
            subGridtshasep_level1item_Linesclass = subGridtshasep_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtshasep_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtshasep_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtshasep_level1item_Class, "") != 0 )
         {
            subGridtshasep_level1item_Linesclass = subGridtshasep_level1item_Class+"Odd" ;
         }
         subGridtshasep_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtshasep_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtshasep_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_173_idx) % (2))) == 0 )
         {
            subGridtshasep_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtshasep_level1item_Class, "") != 0 )
            {
               subGridtshasep_level1item_Linesclass = subGridtshasep_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtshasep_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtshasep_level1item_Class, "") != 0 )
            {
               subGridtshasep_level1item_Linesclass = subGridtshasep_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1015_" + sGXsfl_173_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_173_idx + "',173)\"" ;
      ROClassString = "Attribute" ;
      Gridtshasep_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOSSShaOrd_Internalname,GXutil.ltrim( localUtil.ntoc( A7159OSSShaOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7159OSSShaOrd), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOSSShaOrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOSSShaOrd_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(173),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1015_" + sGXsfl_173_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 175,'',false,'" + sGXsfl_173_idx + "',173)\"" ;
      ROClassString = "Attribute" ;
      Gridtshasep_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOSSShaCob_Internalname,GXutil.ltrim( localUtil.ntoc( A7160OSSShaCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtOSSShaCob_Enabled!=0) ? localUtil.format( A7160OSSShaCob, "Z9.99") : localUtil.format( A7160OSSShaCob, "Z9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,175);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOSSShaCob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOSSShaCob_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(173),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1015_" + sGXsfl_173_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 176,'',false,'" + sGXsfl_173_idx + "',173)\"" ;
      ROClassString = "Attribute" ;
      Gridtshasep_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOSSShaCol_Internalname,GXutil.rtrim( A7161OSSShaCol),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,176);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOSSShaCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtOSSShaCol_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(173),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtshasep_level1itemRow);
      send_integrity_lvl_hashesYB1015( ) ;
      GXCCtl = "Z7159OSSShaOrd_" + sGXsfl_173_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7159OSSShaOrd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7160OSSShaCob_" + sGXsfl_173_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7160OSSShaCob, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7161OSSShaCol_" + sGXsfl_173_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7161OSSShaCol));
      GXCCtl = "nRcdDeleted_1015_" + sGXsfl_173_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1015_" + sGXsfl_173_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1015_" + sGXsfl_173_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1015, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OSSSHAORD_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OSSSHACOB_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "OSSSHACOL_"+sGXsfl_173_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtshasep_level1itemContainer.AddRow(Gridtshasep_level1itemRow);
   }

   public void readRowYB1015( )
   {
      nGXsfl_173_idx = (int)(nGXsfl_173_idx+1) ;
      sGXsfl_173_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_173_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1731015( ) ;
      edtOSSShaOrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OSSSHAORD_"+sGXsfl_173_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOSSShaCob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OSSSHACOB_"+sGXsfl_173_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtOSSShaCol_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "OSSSHACOL_"+sGXsfl_173_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtOSSShaOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtOSSShaOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "OSSSHAORD_" + sGXsfl_173_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOSSShaOrd_Internalname ;
         wbErr = true ;
         A7159OSSShaOrd = (byte)(0) ;
      }
      else
      {
         A7159OSSShaOrd = (byte)(localUtil.ctol( httpContext.cgiGet( edtOSSShaOrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtOSSShaCob_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtOSSShaCob_Internalname)), DecimalUtil.stringToDec("99.99")) > 0 ) ) )
      {
         GXCCtl = "OSSSHACOB_" + sGXsfl_173_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtOSSShaCob_Internalname ;
         wbErr = true ;
         A7160OSSShaCob = DecimalUtil.ZERO ;
      }
      else
      {
         A7160OSSShaCob = localUtil.ctond( httpContext.cgiGet( edtOSSShaCob_Internalname)) ;
      }
      A7161OSSShaCol = httpContext.cgiGet( edtOSSShaCol_Internalname) ;
      GXCCtl = "Z7159OSSShaOrd_" + sGXsfl_173_idx ;
      Z7159OSSShaOrd = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7160OSSShaCob_" + sGXsfl_173_idx ;
      Z7160OSSShaCob = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z7161OSSShaCol_" + sGXsfl_173_idx ;
      Z7161OSSShaCol = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1015_" + sGXsfl_173_idx ;
      nRcdDeleted_1015 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1015_" + sGXsfl_173_idx ;
      nRcdExists_1015 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1015_" + sGXsfl_173_idx ;
      nIsMod_1015 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtOSSShaOrd_Enabled = edtOSSShaOrd_Enabled ;
   }

   public void confirmValuesYB0( )
   {
      nGXsfl_173_idx = 0 ;
      sGXsfl_173_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_173_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1731015( ) ;
      while ( nGXsfl_173_idx < nRC_GXsfl_173 )
      {
         nGXsfl_173_idx = (int)(nGXsfl_173_idx+1) ;
         sGXsfl_173_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_173_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1731015( ) ;
         httpContext.changePostValue( "Z7159OSSShaOrd_"+sGXsfl_173_idx, httpContext.cgiGet( "ZT_"+"Z7159OSSShaOrd_"+sGXsfl_173_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7159OSSShaOrd_"+sGXsfl_173_idx) ;
         httpContext.changePostValue( "Z7160OSSShaCob_"+sGXsfl_173_idx, httpContext.cgiGet( "ZT_"+"Z7160OSSShaCob_"+sGXsfl_173_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7160OSSShaCob_"+sGXsfl_173_idx) ;
         httpContext.changePostValue( "Z7161OSSShaCol_"+sGXsfl_173_idx, httpContext.cgiGet( "ZT_"+"Z7161OSSShaCol_"+sGXsfl_173_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7161OSSShaCol_"+sGXsfl_173_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tshasep", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z7145OSSCod", GXutil.ltrim( localUtil.ntoc( Z7145OSSCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7146OSSEst", GXutil.rtrim( Z7146OSSEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7147OSSUsuCre", GXutil.rtrim( Z7147OSSUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7148OSSFchCre", localUtil.ttoc( Z7148OSSFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7149OSSUsuRea", GXutil.rtrim( Z7149OSSUsuRea));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7150OSSFchRea", localUtil.ttoc( Z7150OSSFchRea, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7151OSSAnc", GXutil.ltrim( localUtil.ntoc( Z7151OSSAnc, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7152OSSFac", GXutil.rtrim( Z7152OSSFac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7153OSSTpo", GXutil.rtrim( Z7153OSSTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7154OSSMue", GXutil.rtrim( Z7154OSSMue));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7155OSSDib", GXutil.rtrim( Z7155OSSDib));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7156OSSImp", GXutil.rtrim( Z7156OSSImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7157OSSPrd", GXutil.rtrim( Z7157OSSPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_173", GXutil.ltrim( localUtil.ntoc( nGXsfl_173_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tshasep", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TShaSep" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Orden de Separación de Colores", "") ;
   }

   public void initializeNonKeyYB1014( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A7146OSSEst = "" ;
      n7146OSSEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7146OSSEst", A7146OSSEst);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A1013DibCli = "" ;
      n1013DibCli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", A1013DibCli);
      A1014DibInt = 0 ;
      n1014DibInt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1014DibInt), 8, 0));
      A6841DibDsc = "" ;
      n6841DibDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6841DibDsc", A6841DibDsc);
      A2090DibMolCi2 = (short)(0) ;
      n2090DibMolCi2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2090DibMolCi2), 4, 0));
      A1823DibTipMaq = "" ;
      n1823DibTipMaq = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      A1019DibMolCil = (short)(0) ;
      n1019DibMolCil = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1019DibMolCil), 4, 0));
      A7147OSSUsuCre = "" ;
      n7147OSSUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7147OSSUsuCre", A7147OSSUsuCre);
      A7148OSSFchCre = GXutil.resetTime( GXutil.nullDate() );
      n7148OSSFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7148OSSFchCre", localUtil.ttoc( A7148OSSFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A7149OSSUsuRea = "" ;
      n7149OSSUsuRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7149OSSUsuRea", A7149OSSUsuRea);
      A7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
      n7150OSSFchRea = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7150OSSFchRea", localUtil.ttoc( A7150OSSFchRea, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A7151OSSAnc = DecimalUtil.ZERO ;
      n7151OSSAnc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7151OSSAnc", GXutil.ltrimstr( A7151OSSAnc, 5, 2));
      A7152OSSFac = "" ;
      n7152OSSFac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7152OSSFac", A7152OSSFac);
      A7153OSSTpo = "" ;
      n7153OSSTpo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7153OSSTpo", A7153OSSTpo);
      A7154OSSMue = "" ;
      n7154OSSMue = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7154OSSMue", A7154OSSMue);
      A7155OSSDib = "" ;
      n7155OSSDib = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7155OSSDib", A7155OSSDib);
      A7156OSSImp = "" ;
      n7156OSSImp = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7156OSSImp", A7156OSSImp);
      A7157OSSPrd = "" ;
      n7157OSSPrd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7157OSSPrd", A7157OSSPrd);
      A7158OSSObs = "" ;
      n7158OSSObs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7158OSSObs", A7158OSSObs);
      Z7146OSSEst = "" ;
      Z7147OSSUsuCre = "" ;
      Z7148OSSFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z7149OSSUsuRea = "" ;
      Z7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
      Z7151OSSAnc = DecimalUtil.ZERO ;
      Z7152OSSFac = "" ;
      Z7153OSSTpo = "" ;
      Z7154OSSMue = "" ;
      Z7155OSSDib = "" ;
      Z7156OSSImp = "" ;
      Z7157OSSPrd = "" ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
   }

   public void initAllYB1014( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A7145OSSCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7145OSSCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7145OSSCod), 8, 0));
      initializeNonKeyYB1014( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyYB1015( )
   {
      A7160OSSShaCob = DecimalUtil.ZERO ;
      A7161OSSShaCol = "" ;
      Z7160OSSShaCob = DecimalUtil.ZERO ;
      Z7161OSSShaCol = "" ;
   }

   public void initAllYB1015( )
   {
      A7159OSSShaOrd = (byte)(0) ;
      initializeNonKeyYB1015( ) ;
   }

   public void standaloneModalInsertYB1015( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241533236", true, true);
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
      httpContext.AddJavascriptSource("tshasep.js", "?20268241533236", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1015( )
   {
      edtOSSShaOrd_Enabled = defedtOSSShaOrd_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtOSSShaOrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtOSSShaOrd_Enabled), 5, 0), !bGXsfl_173_Refreshing);
   }

   public void startgridcontrol173( )
   {
      Gridtshasep_level1itemContainer.AddObjectProperty("GridName", "Gridtshasep_level1item");
      Gridtshasep_level1itemContainer.AddObjectProperty("Header", subGridtshasep_level1item_Header);
      Gridtshasep_level1itemContainer.AddObjectProperty("Class", "Grid");
      Gridtshasep_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtshasep_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtshasep_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtshasep_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtshasep_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7159OSSShaOrd, (byte)(2), (byte)(0), ".", "")));
      Gridtshasep_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaOrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddColumnProperties(Gridtshasep_level1itemColumn);
      Gridtshasep_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtshasep_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7160OSSShaCob, (byte)(5), (byte)(2), ".", "")));
      Gridtshasep_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaCob_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddColumnProperties(Gridtshasep_level1itemColumn);
      Gridtshasep_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtshasep_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A7161OSSShaCol));
      Gridtshasep_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtOSSShaCol_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddColumnProperties(Gridtshasep_level1itemColumn);
      Gridtshasep_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtshasep_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtshasep_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtshasep_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtshasep_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtshasep_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtshasep_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtshasep_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtshasep_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtOSSCod_Internalname = "OSSCOD" ;
      chkOSSEst.setInternalname( "OSSEST" );
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDibCli_Internalname = "DIBCLI" ;
      edtDibInt_Internalname = "DIBINT" ;
      edtDibDsc_Internalname = "DIBDSC" ;
      edtDibMolCi2_Internalname = "DIBMOLCI2" ;
      lstDibTipMaq.setInternalname( "DIBTIPMAQ" );
      edtDibMolCil_Internalname = "DIBMOLCIL" ;
      edtOSSUsuCre_Internalname = "OSSUSUCRE" ;
      edtOSSFchCre_Internalname = "OSSFCHCRE" ;
      edtOSSUsuRea_Internalname = "OSSUSUREA" ;
      edtOSSFchRea_Internalname = "OSSFCHREA" ;
      edtOSSAnc_Internalname = "OSSANC" ;
      chkOSSFac.setInternalname( "OSSFAC" );
      edtOSSTpo_Internalname = "OSSTPO" ;
      edtOSSMue_Internalname = "OSSMUE" ;
      edtOSSDib_Internalname = "OSSDIB" ;
      edtOSSImp_Internalname = "OSSIMP" ;
      edtOSSPrd_Internalname = "OSSPRD" ;
      edtOSSObs_Internalname = "OSSOBS" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtOSSShaOrd_Internalname = "OSSSHAORD" ;
      edtOSSShaCob_Internalname = "OSSSHACOB" ;
      edtOSSShaCol_Internalname = "OSSSHACOL" ;
      divLevel1table_Internalname = "LEVEL1TABLE" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridtshasep_level1item_Internalname = "GRIDTSHASEP_LEVEL1ITEM" ;
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
      subGridtshasep_level1item_Allowcollapsing = (byte)(0) ;
      subGridtshasep_level1item_Allowselection = (byte)(0) ;
      subGridtshasep_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Orden de Separación de Colores", "") );
      edtOSSShaCol_Jsonclick = "" ;
      edtOSSShaCob_Jsonclick = "" ;
      edtOSSShaOrd_Jsonclick = "" ;
      subGridtshasep_level1item_Class = "Grid" ;
      subGridtshasep_level1item_Backcolorstyle = (byte)(0) ;
      edtOSSShaCol_Enabled = 1 ;
      edtOSSShaCob_Enabled = 1 ;
      edtOSSShaOrd_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtOSSObs_Enabled = 1 ;
      edtOSSPrd_Jsonclick = "" ;
      edtOSSPrd_Enabled = 1 ;
      edtOSSImp_Jsonclick = "" ;
      edtOSSImp_Enabled = 1 ;
      edtOSSDib_Jsonclick = "" ;
      edtOSSDib_Enabled = 1 ;
      edtOSSMue_Jsonclick = "" ;
      edtOSSMue_Enabled = 1 ;
      edtOSSTpo_Jsonclick = "" ;
      edtOSSTpo_Enabled = 1 ;
      chkOSSFac.setEnabled( 1 );
      edtOSSAnc_Jsonclick = "" ;
      edtOSSAnc_Enabled = 1 ;
      edtOSSFchRea_Jsonclick = "" ;
      edtOSSFchRea_Enabled = 1 ;
      edtOSSUsuRea_Jsonclick = "" ;
      edtOSSUsuRea_Enabled = 1 ;
      edtOSSFchCre_Jsonclick = "" ;
      edtOSSFchCre_Enabled = 1 ;
      edtOSSUsuCre_Jsonclick = "" ;
      edtOSSUsuCre_Enabled = 1 ;
      edtDibMolCil_Jsonclick = "" ;
      edtDibMolCil_Enabled = 0 ;
      lstDibTipMaq.setJsonclick( "" );
      lstDibTipMaq.setEnabled( 0 );
      edtDibMolCi2_Jsonclick = "" ;
      edtDibMolCi2_Enabled = 0 ;
      edtDibDsc_Jsonclick = "" ;
      edtDibDsc_Enabled = 0 ;
      edtDibInt_Jsonclick = "" ;
      edtDibInt_Enabled = 0 ;
      edtDibCli_Jsonclick = "" ;
      edtDibCli_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      chkOSSEst.setEnabled( 1 );
      edtOSSCod_Jsonclick = "" ;
      edtOSSCod_Enabled = 1 ;
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

   public void gxnrgridtshasep_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_1731015( ) ;
      while ( nGXsfl_173_idx <= nRC_GXsfl_173 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalYB1015( ) ;
         standaloneModalYB1015( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowYB1015( ) ;
         nGXsfl_173_idx = (int)(nGXsfl_173_idx+1) ;
         sGXsfl_173_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_173_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1731015( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtshasep_level1itemContainer)) ;
      /* End function gxnrGridtshasep_level1item_newrow */
   }

   public void init_web_controls( )
   {
      chkOSSEst.setName( "OSSEST" );
      chkOSSEst.setWebtags( "" );
      chkOSSEst.setCaption( httpContext.getMessage( "Realizada", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkOSSEst.getInternalname(), "TitleCaption", chkOSSEst.getCaption(), true);
      chkOSSEst.setCheckedValue( "N" );
      A7146OSSEst = ((GXutil.strcmp(GXutil.rtrim( A7146OSSEst), "S")==0) ? "S" : "N") ;
      n7146OSSEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7146OSSEst", A7146OSSEst);
      lstDibTipMaq.setName( "DIBTIPMAQ" );
      lstDibTipMaq.setWebtags( "" );
      lstDibTipMaq.addItem("R", httpContext.getMessage( "Rotativa", ""), (short)(0));
      lstDibTipMaq.addItem("P", httpContext.getMessage( "Plana", ""), (short)(0));
      lstDibTipMaq.addItem("D", httpContext.getMessage( "Digital", ""), (short)(0));
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", A1823DibTipMaq);
      }
      chkOSSFac.setName( "OSSFAC" );
      chkOSSFac.setWebtags( "" );
      chkOSSFac.setCaption( httpContext.getMessage( "Facturable", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkOSSFac.getInternalname(), "TitleCaption", chkOSSFac.getCaption(), true);
      chkOSSFac.setCheckedValue( "N" );
      A7152OSSFac = ((GXutil.strcmp(GXutil.rtrim( A7152OSSFac), "S")==0) ? "S" : "N") ;
      n7152OSSFac = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7152OSSFac", A7152OSSFac);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00YB23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00YB23_A407EmprNom[0] ;
      n407EmprNom = T00YB23_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(21);
      GX_FocusControl = chkOSSEst.getInternalname() ;
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
      /* Using cursor T00YB23 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00YB23_A407EmprNom[0] ;
      n407EmprNom = T00YB23_n407EmprNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Osscod( )
   {
      n1823DibTipMaq = false ;
      A1823DibTipMaq = lstDibTipMaq.getValue() ;
      n1823DibTipMaq = false ;
      lstDibTipMaq.setValue( A1823DibTipMaq );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A7146OSSEst = ((GXutil.strcmp(GXutil.rtrim( A7146OSSEst), "S")==0) ? "S" : "N") ;
      n7146OSSEst = false ;
      A7152OSSFac = ((GXutil.strcmp(GXutil.rtrim( A7152OSSFac), "S")==0) ? "S" : "N") ;
      n7152OSSFac = false ;
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         lstDibTipMaq.setValue( A1823DibTipMaq );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A7146OSSEst", GXutil.rtrim( A7146OSSEst));
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A7147OSSUsuCre", GXutil.rtrim( A7147OSSUsuCre));
      httpContext.ajax_rsp_assign_attri("", false, "A7148OSSFchCre", localUtil.ttoc( A7148OSSFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A7149OSSUsuRea", GXutil.rtrim( A7149OSSUsuRea));
      httpContext.ajax_rsp_assign_attri("", false, "A7150OSSFchRea", localUtil.ttoc( A7150OSSFchRea, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A7151OSSAnc", GXutil.ltrim( localUtil.ntoc( A7151OSSAnc, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7152OSSFac", GXutil.rtrim( A7152OSSFac));
      httpContext.ajax_rsp_assign_attri("", false, "A7153OSSTpo", GXutil.rtrim( A7153OSSTpo));
      httpContext.ajax_rsp_assign_attri("", false, "A7154OSSMue", GXutil.rtrim( A7154OSSMue));
      httpContext.ajax_rsp_assign_attri("", false, "A7155OSSDib", GXutil.rtrim( A7155OSSDib));
      httpContext.ajax_rsp_assign_attri("", false, "A7156OSSImp", GXutil.rtrim( A7156OSSImp));
      httpContext.ajax_rsp_assign_attri("", false, "A7157OSSPrd", GXutil.rtrim( A7157OSSPrd));
      httpContext.ajax_rsp_assign_attri("", false, "A7158OSSObs", A7158OSSObs);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", GXutil.rtrim( A1013DibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6841DibDsc", GXutil.rtrim( A6841DibDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", GXutil.rtrim( A1823DibTipMaq));
      lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7145OSSCod", GXutil.ltrim( localUtil.ntoc( Z7145OSSCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7146OSSEst", GXutil.rtrim( Z7146OSSEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7147OSSUsuCre", GXutil.rtrim( Z7147OSSUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7148OSSFchCre", localUtil.ttoc( Z7148OSSFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7149OSSUsuRea", GXutil.rtrim( Z7149OSSUsuRea));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7150OSSFchRea", localUtil.ttoc( Z7150OSSFchRea, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7151OSSAnc", GXutil.ltrim( localUtil.ntoc( Z7151OSSAnc, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7152OSSFac", GXutil.rtrim( Z7152OSSFac));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7153OSSTpo", GXutil.rtrim( Z7153OSSTpo));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7154OSSMue", GXutil.rtrim( Z7154OSSMue));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7155OSSDib", GXutil.rtrim( Z7155OSSDib));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7156OSSImp", GXutil.rtrim( Z7156OSSImp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7157OSSPrd", GXutil.rtrim( Z7157OSSPrd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7158OSSObs", Z7158OSSObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1013DibCli", GXutil.rtrim( Z1013DibCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1014DibInt", GXutil.ltrim( localUtil.ntoc( Z1014DibInt, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6841DibDsc", GXutil.rtrim( Z6841DibDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2090DibMolCi2", GXutil.ltrim( localUtil.ntoc( Z2090DibMolCi2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1823DibTipMaq", GXutil.rtrim( Z1823DibTipMaq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1019DibMolCil", GXutil.ltrim( localUtil.ntoc( Z1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      n252CliCod = false ;
      n1013DibCli = false ;
      n1014DibInt = false ;
      n6841DibDsc = false ;
      n2090DibMolCi2 = false ;
      n1823DibTipMaq = false ;
      A1823DibTipMaq = lstDibTipMaq.getValue() ;
      n1823DibTipMaq = false ;
      lstDibTipMaq.setValue( A1823DibTipMaq );
      n1019DibMolCil = false ;
      /* Using cursor T00YB24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(22) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A361DisCod = T00YB24_A361DisCod[0] ;
      A252CliCod = T00YB24_A252CliCod[0] ;
      n252CliCod = T00YB24_n252CliCod[0] ;
      pr_default.close(22);
      /* Using cursor T00YB25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1013DibCli = T00YB25_A1013DibCli[0] ;
      n1013DibCli = T00YB25_n1013DibCli[0] ;
      A1014DibInt = T00YB25_A1014DibInt[0] ;
      n1014DibInt = T00YB25_n1014DibInt[0] ;
      pr_default.close(23);
      /* Using cursor T00YB26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A252CliCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A279CliNom = T00YB26_A279CliNom[0] ;
      pr_default.close(24);
      /* Using cursor T00YB27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n1013DibCli), A1013DibCli, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n1014DibInt), Integer.valueOf(A1014DibInt)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A1013DibCli)==0) || (0==A252CliCod) || (0==A1014DibInt) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CDIBUJ", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DIBINT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A6841DibDsc = T00YB27_A6841DibDsc[0] ;
      n6841DibDsc = T00YB27_n6841DibDsc[0] ;
      A2090DibMolCi2 = T00YB27_A2090DibMolCi2[0] ;
      n2090DibMolCi2 = T00YB27_n2090DibMolCi2[0] ;
      A1823DibTipMaq = T00YB27_A1823DibTipMaq[0] ;
      n1823DibTipMaq = T00YB27_n1823DibTipMaq[0] ;
      lstDibTipMaq.setValue( A1823DibTipMaq );
      A1019DibMolCil = T00YB27_A1019DibMolCil[0] ;
      n1019DibMolCil = T00YB27_n1019DibMolCil[0] ;
      pr_default.close(25);
      dynload_actions( ) ;
      if ( lstDibTipMaq.getItemCount() > 0 )
      {
         A1823DibTipMaq = lstDibTipMaq.getValidValue(A1823DibTipMaq) ;
         n1823DibTipMaq = false ;
         lstDibTipMaq.setValue( A1823DibTipMaq );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1013DibCli", GXutil.rtrim( A1013DibCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1014DibInt", GXutil.ltrim( localUtil.ntoc( A1014DibInt, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A6841DibDsc", GXutil.rtrim( A6841DibDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A2090DibMolCi2", GXutil.ltrim( localUtil.ntoc( A2090DibMolCi2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1823DibTipMaq", GXutil.rtrim( A1823DibTipMaq));
      lstDibTipMaq.setValue( GXutil.rtrim( A1823DibTipMaq) );
      httpContext.ajax_rsp_assign_prop("", false, lstDibTipMaq.getInternalname(), "Values", lstDibTipMaq.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1019DibMolCil", GXutil.ltrim( localUtil.ntoc( A1019DibMolCil, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_OSSCOD","{handler:'valid_Osscod',iparms:[{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A7145OSSCod',fld:'OSSCOD',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_OSSCOD",",oparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A7147OSSUsuCre',fld:'OSSUSUCRE',pic:''},{av:'A7148OSSFchCre',fld:'OSSFCHCRE',pic:'99/99/99 99:99'},{av:'A7149OSSUsuRea',fld:'OSSUSUREA',pic:''},{av:'A7150OSSFchRea',fld:'OSSFCHREA',pic:'99/99/99 99:99'},{av:'A7151OSSAnc',fld:'OSSANC',pic:'Z9.99'},{av:'A7153OSSTpo',fld:'OSSTPO',pic:''},{av:'A7154OSSMue',fld:'OSSMUE',pic:''},{av:'A7155OSSDib',fld:'OSSDIB',pic:''},{av:'A7156OSSImp',fld:'OSSIMP',pic:''},{av:'A7157OSSPrd',fld:'OSSPRD',pic:''},{av:'A7158OSSObs',fld:'OSSOBS',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6841DibDsc',fld:'DIBDSC',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z7145OSSCod'},{av:'Z7146OSSEst'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z7147OSSUsuCre'},{av:'Z7148OSSFchCre'},{av:'Z7149OSSUsuRea'},{av:'Z7150OSSFchRea'},{av:'Z7151OSSAnc'},{av:'Z7152OSSFac'},{av:'Z7153OSSTpo'},{av:'Z7154OSSMue'},{av:'Z7155OSSDib'},{av:'Z7156OSSImp'},{av:'Z7157OSSPrd'},{av:'Z7158OSSObs'},{av:'Z407EmprNom'},{av:'Z361DisCod'},{av:'Z252CliCod'},{av:'Z1013DibCli'},{av:'Z1014DibInt'},{av:'Z279CliNom'},{av:'Z6841DibDsc'},{av:'Z2090DibMolCi2'},{av:'Z1823DibTipMaq'},{av:'Z1019DibMolCil'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6841DibDsc',fld:'DIBDSC',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A1013DibCli',fld:'DIBCLI',pic:''},{av:'A1014DibInt',fld:'DIBINT',pic:'ZZZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A6841DibDsc',fld:'DIBDSC',pic:''},{av:'A2090DibMolCi2',fld:'DIBMOLCI2',pic:'ZZZ9'},{av:'lstDibTipMaq'},{av:'A1823DibTipMaq',fld:'DIBTIPMAQ',pic:''},{av:'A1019DibMolCil',fld:'DIBMOLCIL',pic:'ZZZ9'},{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_DIBCLI","{handler:'valid_Dibcli',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_DIBCLI",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_DIBINT","{handler:'valid_Dibint',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_DIBINT",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_OSSFAC","{handler:'valid_Ossfac',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_OSSFAC",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("VALID_OSSSHAORD","{handler:'valid_Ossshaord',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("VALID_OSSSHAORD",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Ossshacol',iparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]");
      setEventMetadata("NULL",",oparms:[{av:'A7146OSSEst',fld:'OSSEST',pic:''C' 'R''},{av:'A7152OSSFac',fld:'OSSFAC',pic:''}]}");
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
      pr_default.close(22);
      pr_default.close(21);
      pr_default.close(23);
      pr_default.close(25);
      pr_default.close(24);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z7146OSSEst = "" ;
      Z7147OSSUsuCre = "" ;
      Z7148OSSFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z7149OSSUsuRea = "" ;
      Z7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
      Z7151OSSAnc = DecimalUtil.ZERO ;
      Z7152OSSFac = "" ;
      Z7153OSSTpo = "" ;
      Z7154OSSMue = "" ;
      Z7155OSSDib = "" ;
      Z7156OSSImp = "" ;
      Z7157OSSPrd = "" ;
      Z130BarCodPar = "" ;
      Z7160OSSShaCob = DecimalUtil.ZERO ;
      Z7161OSSShaCol = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A1013DibCli = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A7146OSSEst = "" ;
      A1823DibTipMaq = "" ;
      A7152OSSFac = "" ;
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
      A279CliNom = "" ;
      A6841DibDsc = "" ;
      A7147OSSUsuCre = "" ;
      A7148OSSFchCre = GXutil.resetTime( GXutil.nullDate() );
      A7149OSSUsuRea = "" ;
      A7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
      A7151OSSAnc = DecimalUtil.ZERO ;
      A7153OSSTpo = "" ;
      A7154OSSMue = "" ;
      A7155OSSDib = "" ;
      A7156OSSImp = "" ;
      A7157OSSPrd = "" ;
      A7158OSSObs = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtshasep_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1015 = "" ;
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A7160OSSShaCob = DecimalUtil.ZERO ;
      A7161OSSShaCol = "" ;
      Z7158OSSObs = "" ;
      Z407EmprNom = "" ;
      Z1013DibCli = "" ;
      Z279CliNom = "" ;
      Z6841DibDsc = "" ;
      Z1823DibTipMaq = "" ;
      T00YB11_A7158OSSObs = new String[] {""} ;
      T00YB11_n7158OSSObs = new boolean[] {false} ;
      T00YB11_A361DisCod = new int[1] ;
      T00YB11_A7145OSSCod = new int[1] ;
      T00YB11_A407EmprNom = new String[] {""} ;
      T00YB11_n407EmprNom = new boolean[] {false} ;
      T00YB11_A7146OSSEst = new String[] {""} ;
      T00YB11_n7146OSSEst = new boolean[] {false} ;
      T00YB11_A279CliNom = new String[] {""} ;
      T00YB11_A6841DibDsc = new String[] {""} ;
      T00YB11_n6841DibDsc = new boolean[] {false} ;
      T00YB11_A2090DibMolCi2 = new short[1] ;
      T00YB11_n2090DibMolCi2 = new boolean[] {false} ;
      T00YB11_A1823DibTipMaq = new String[] {""} ;
      T00YB11_n1823DibTipMaq = new boolean[] {false} ;
      T00YB11_A1019DibMolCil = new short[1] ;
      T00YB11_n1019DibMolCil = new boolean[] {false} ;
      T00YB11_A7147OSSUsuCre = new String[] {""} ;
      T00YB11_n7147OSSUsuCre = new boolean[] {false} ;
      T00YB11_A7148OSSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00YB11_n7148OSSFchCre = new boolean[] {false} ;
      T00YB11_A7149OSSUsuRea = new String[] {""} ;
      T00YB11_n7149OSSUsuRea = new boolean[] {false} ;
      T00YB11_A7150OSSFchRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00YB11_n7150OSSFchRea = new boolean[] {false} ;
      T00YB11_A7151OSSAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00YB11_n7151OSSAnc = new boolean[] {false} ;
      T00YB11_A7152OSSFac = new String[] {""} ;
      T00YB11_n7152OSSFac = new boolean[] {false} ;
      T00YB11_A7153OSSTpo = new String[] {""} ;
      T00YB11_n7153OSSTpo = new boolean[] {false} ;
      T00YB11_A7154OSSMue = new String[] {""} ;
      T00YB11_n7154OSSMue = new boolean[] {false} ;
      T00YB11_A7155OSSDib = new String[] {""} ;
      T00YB11_n7155OSSDib = new boolean[] {false} ;
      T00YB11_A7156OSSImp = new String[] {""} ;
      T00YB11_n7156OSSImp = new boolean[] {false} ;
      T00YB11_A7157OSSPrd = new String[] {""} ;
      T00YB11_n7157OSSPrd = new boolean[] {false} ;
      T00YB11_A396EmprCod = new String[] {""} ;
      T00YB11_A129BarCod = new int[1] ;
      T00YB11_n129BarCod = new boolean[] {false} ;
      T00YB11_A132BarCodReo = new byte[1] ;
      T00YB11_n132BarCodReo = new boolean[] {false} ;
      T00YB11_A130BarCodPar = new String[] {""} ;
      T00YB11_n130BarCodPar = new boolean[] {false} ;
      T00YB11_A252CliCod = new int[1] ;
      T00YB11_n252CliCod = new boolean[] {false} ;
      T00YB11_A1013DibCli = new String[] {""} ;
      T00YB11_n1013DibCli = new boolean[] {false} ;
      T00YB11_A1014DibInt = new int[1] ;
      T00YB11_n1014DibInt = new boolean[] {false} ;
      T00YB6_A407EmprNom = new String[] {""} ;
      T00YB6_n407EmprNom = new boolean[] {false} ;
      T00YB7_A361DisCod = new int[1] ;
      T00YB7_A252CliCod = new int[1] ;
      T00YB7_n252CliCod = new boolean[] {false} ;
      T00YB8_A1013DibCli = new String[] {""} ;
      T00YB8_n1013DibCli = new boolean[] {false} ;
      T00YB8_A1014DibInt = new int[1] ;
      T00YB8_n1014DibInt = new boolean[] {false} ;
      T00YB9_A279CliNom = new String[] {""} ;
      T00YB10_A6841DibDsc = new String[] {""} ;
      T00YB10_n6841DibDsc = new boolean[] {false} ;
      T00YB10_A2090DibMolCi2 = new short[1] ;
      T00YB10_n2090DibMolCi2 = new boolean[] {false} ;
      T00YB10_A1823DibTipMaq = new String[] {""} ;
      T00YB10_n1823DibTipMaq = new boolean[] {false} ;
      T00YB10_A1019DibMolCil = new short[1] ;
      T00YB10_n1019DibMolCil = new boolean[] {false} ;
      T00YB12_A407EmprNom = new String[] {""} ;
      T00YB12_n407EmprNom = new boolean[] {false} ;
      T00YB13_A361DisCod = new int[1] ;
      T00YB13_A252CliCod = new int[1] ;
      T00YB13_n252CliCod = new boolean[] {false} ;
      T00YB14_A1013DibCli = new String[] {""} ;
      T00YB14_n1013DibCli = new boolean[] {false} ;
      T00YB14_A1014DibInt = new int[1] ;
      T00YB14_n1014DibInt = new boolean[] {false} ;
      T00YB15_A279CliNom = new String[] {""} ;
      T00YB16_A6841DibDsc = new String[] {""} ;
      T00YB16_n6841DibDsc = new boolean[] {false} ;
      T00YB16_A2090DibMolCi2 = new short[1] ;
      T00YB16_n2090DibMolCi2 = new boolean[] {false} ;
      T00YB16_A1823DibTipMaq = new String[] {""} ;
      T00YB16_n1823DibTipMaq = new boolean[] {false} ;
      T00YB16_A1019DibMolCil = new short[1] ;
      T00YB16_n1019DibMolCil = new boolean[] {false} ;
      T00YB17_A396EmprCod = new String[] {""} ;
      T00YB17_A7145OSSCod = new int[1] ;
      T00YB5_A7158OSSObs = new String[] {""} ;
      T00YB5_n7158OSSObs = new boolean[] {false} ;
      T00YB5_A7145OSSCod = new int[1] ;
      T00YB5_A7146OSSEst = new String[] {""} ;
      T00YB5_n7146OSSEst = new boolean[] {false} ;
      T00YB5_A7147OSSUsuCre = new String[] {""} ;
      T00YB5_n7147OSSUsuCre = new boolean[] {false} ;
      T00YB5_A7148OSSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00YB5_n7148OSSFchCre = new boolean[] {false} ;
      T00YB5_A7149OSSUsuRea = new String[] {""} ;
      T00YB5_n7149OSSUsuRea = new boolean[] {false} ;
      T00YB5_A7150OSSFchRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00YB5_n7150OSSFchRea = new boolean[] {false} ;
      T00YB5_A7151OSSAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00YB5_n7151OSSAnc = new boolean[] {false} ;
      T00YB5_A7152OSSFac = new String[] {""} ;
      T00YB5_n7152OSSFac = new boolean[] {false} ;
      T00YB5_A7153OSSTpo = new String[] {""} ;
      T00YB5_n7153OSSTpo = new boolean[] {false} ;
      T00YB5_A7154OSSMue = new String[] {""} ;
      T00YB5_n7154OSSMue = new boolean[] {false} ;
      T00YB5_A7155OSSDib = new String[] {""} ;
      T00YB5_n7155OSSDib = new boolean[] {false} ;
      T00YB5_A7156OSSImp = new String[] {""} ;
      T00YB5_n7156OSSImp = new boolean[] {false} ;
      T00YB5_A7157OSSPrd = new String[] {""} ;
      T00YB5_n7157OSSPrd = new boolean[] {false} ;
      T00YB5_A396EmprCod = new String[] {""} ;
      T00YB5_A129BarCod = new int[1] ;
      T00YB5_n129BarCod = new boolean[] {false} ;
      T00YB5_A132BarCodReo = new byte[1] ;
      T00YB5_n132BarCodReo = new boolean[] {false} ;
      T00YB5_A130BarCodPar = new String[] {""} ;
      T00YB5_n130BarCodPar = new boolean[] {false} ;
      sMode1014 = "" ;
      T00YB18_A7145OSSCod = new int[1] ;
      T00YB18_A396EmprCod = new String[] {""} ;
      T00YB19_A7145OSSCod = new int[1] ;
      T00YB19_A396EmprCod = new String[] {""} ;
      T00YB4_A7158OSSObs = new String[] {""} ;
      T00YB4_n7158OSSObs = new boolean[] {false} ;
      T00YB4_A7145OSSCod = new int[1] ;
      T00YB4_A7146OSSEst = new String[] {""} ;
      T00YB4_n7146OSSEst = new boolean[] {false} ;
      T00YB4_A7147OSSUsuCre = new String[] {""} ;
      T00YB4_n7147OSSUsuCre = new boolean[] {false} ;
      T00YB4_A7148OSSFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T00YB4_n7148OSSFchCre = new boolean[] {false} ;
      T00YB4_A7149OSSUsuRea = new String[] {""} ;
      T00YB4_n7149OSSUsuRea = new boolean[] {false} ;
      T00YB4_A7150OSSFchRea = new java.util.Date[] {GXutil.nullDate()} ;
      T00YB4_n7150OSSFchRea = new boolean[] {false} ;
      T00YB4_A7151OSSAnc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00YB4_n7151OSSAnc = new boolean[] {false} ;
      T00YB4_A7152OSSFac = new String[] {""} ;
      T00YB4_n7152OSSFac = new boolean[] {false} ;
      T00YB4_A7153OSSTpo = new String[] {""} ;
      T00YB4_n7153OSSTpo = new boolean[] {false} ;
      T00YB4_A7154OSSMue = new String[] {""} ;
      T00YB4_n7154OSSMue = new boolean[] {false} ;
      T00YB4_A7155OSSDib = new String[] {""} ;
      T00YB4_n7155OSSDib = new boolean[] {false} ;
      T00YB4_A7156OSSImp = new String[] {""} ;
      T00YB4_n7156OSSImp = new boolean[] {false} ;
      T00YB4_A7157OSSPrd = new String[] {""} ;
      T00YB4_n7157OSSPrd = new boolean[] {false} ;
      T00YB4_A396EmprCod = new String[] {""} ;
      T00YB4_A129BarCod = new int[1] ;
      T00YB4_n129BarCod = new boolean[] {false} ;
      T00YB4_A132BarCodReo = new byte[1] ;
      T00YB4_n132BarCodReo = new boolean[] {false} ;
      T00YB4_A130BarCodPar = new String[] {""} ;
      T00YB4_n130BarCodPar = new boolean[] {false} ;
      T00YB23_A407EmprNom = new String[] {""} ;
      T00YB23_n407EmprNom = new boolean[] {false} ;
      T00YB24_A361DisCod = new int[1] ;
      T00YB24_A252CliCod = new int[1] ;
      T00YB24_n252CliCod = new boolean[] {false} ;
      T00YB25_A1013DibCli = new String[] {""} ;
      T00YB25_n1013DibCli = new boolean[] {false} ;
      T00YB25_A1014DibInt = new int[1] ;
      T00YB25_n1014DibInt = new boolean[] {false} ;
      T00YB26_A279CliNom = new String[] {""} ;
      T00YB27_A6841DibDsc = new String[] {""} ;
      T00YB27_n6841DibDsc = new boolean[] {false} ;
      T00YB27_A2090DibMolCi2 = new short[1] ;
      T00YB27_n2090DibMolCi2 = new boolean[] {false} ;
      T00YB27_A1823DibTipMaq = new String[] {""} ;
      T00YB27_n1823DibTipMaq = new boolean[] {false} ;
      T00YB27_A1019DibMolCil = new short[1] ;
      T00YB27_n1019DibMolCil = new boolean[] {false} ;
      T00YB28_A396EmprCod = new String[] {""} ;
      T00YB28_A7145OSSCod = new int[1] ;
      T00YB29_A7145OSSCod = new int[1] ;
      T00YB29_A7159OSSShaOrd = new byte[1] ;
      T00YB29_A7160OSSShaCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00YB29_A7161OSSShaCol = new String[] {""} ;
      T00YB29_A396EmprCod = new String[] {""} ;
      T00YB30_A396EmprCod = new String[] {""} ;
      T00YB30_A7145OSSCod = new int[1] ;
      T00YB30_A7159OSSShaOrd = new byte[1] ;
      T00YB3_A7145OSSCod = new int[1] ;
      T00YB3_A7159OSSShaOrd = new byte[1] ;
      T00YB3_A7160OSSShaCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00YB3_A7161OSSShaCol = new String[] {""} ;
      T00YB3_A396EmprCod = new String[] {""} ;
      T00YB2_A7145OSSCod = new int[1] ;
      T00YB2_A7159OSSShaOrd = new byte[1] ;
      T00YB2_A7160OSSShaCob = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00YB2_A7161OSSShaCol = new String[] {""} ;
      T00YB2_A396EmprCod = new String[] {""} ;
      T00YB34_A396EmprCod = new String[] {""} ;
      T00YB34_A7145OSSCod = new int[1] ;
      T00YB34_A7159OSSShaOrd = new byte[1] ;
      Gridtshasep_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtshasep_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridtshasep_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      ZZ396EmprCod = "" ;
      ZZ7146OSSEst = "" ;
      ZZ130BarCodPar = "" ;
      ZZ7147OSSUsuCre = "" ;
      ZZ7148OSSFchCre = GXutil.resetTime( GXutil.nullDate() );
      ZZ7149OSSUsuRea = "" ;
      ZZ7150OSSFchRea = GXutil.resetTime( GXutil.nullDate() );
      ZZ7151OSSAnc = DecimalUtil.ZERO ;
      ZZ7152OSSFac = "" ;
      ZZ7153OSSTpo = "" ;
      ZZ7154OSSMue = "" ;
      ZZ7155OSSDib = "" ;
      ZZ7156OSSImp = "" ;
      ZZ7157OSSPrd = "" ;
      ZZ7158OSSObs = "" ;
      ZZ407EmprNom = "" ;
      ZZ1013DibCli = "" ;
      ZZ279CliNom = "" ;
      ZZ6841DibDsc = "" ;
      ZZ1823DibTipMaq = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tshasep__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tshasep__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tshasep__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tshasep__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tshasep__default(),
         new Object[] {
             new Object[] {
            T00YB2_A7145OSSCod, T00YB2_A7159OSSShaOrd, T00YB2_A7160OSSShaCob, T00YB2_A7161OSSShaCol, T00YB2_A396EmprCod
            }
            , new Object[] {
            T00YB3_A7145OSSCod, T00YB3_A7159OSSShaOrd, T00YB3_A7160OSSShaCob, T00YB3_A7161OSSShaCol, T00YB3_A396EmprCod
            }
            , new Object[] {
            T00YB4_A7158OSSObs, T00YB4_n7158OSSObs, T00YB4_A7145OSSCod, T00YB4_A7146OSSEst, T00YB4_n7146OSSEst, T00YB4_A7147OSSUsuCre, T00YB4_n7147OSSUsuCre, T00YB4_A7148OSSFchCre, T00YB4_n7148OSSFchCre, T00YB4_A7149OSSUsuRea,
            T00YB4_n7149OSSUsuRea, T00YB4_A7150OSSFchRea, T00YB4_n7150OSSFchRea, T00YB4_A7151OSSAnc, T00YB4_n7151OSSAnc, T00YB4_A7152OSSFac, T00YB4_n7152OSSFac, T00YB4_A7153OSSTpo, T00YB4_n7153OSSTpo, T00YB4_A7154OSSMue,
            T00YB4_n7154OSSMue, T00YB4_A7155OSSDib, T00YB4_n7155OSSDib, T00YB4_A7156OSSImp, T00YB4_n7156OSSImp, T00YB4_A7157OSSPrd, T00YB4_n7157OSSPrd, T00YB4_A396EmprCod, T00YB4_A129BarCod, T00YB4_n129BarCod,
            T00YB4_A132BarCodReo, T00YB4_n132BarCodReo, T00YB4_A130BarCodPar, T00YB4_n130BarCodPar
            }
            , new Object[] {
            T00YB5_A7158OSSObs, T00YB5_n7158OSSObs, T00YB5_A7145OSSCod, T00YB5_A7146OSSEst, T00YB5_n7146OSSEst, T00YB5_A7147OSSUsuCre, T00YB5_n7147OSSUsuCre, T00YB5_A7148OSSFchCre, T00YB5_n7148OSSFchCre, T00YB5_A7149OSSUsuRea,
            T00YB5_n7149OSSUsuRea, T00YB5_A7150OSSFchRea, T00YB5_n7150OSSFchRea, T00YB5_A7151OSSAnc, T00YB5_n7151OSSAnc, T00YB5_A7152OSSFac, T00YB5_n7152OSSFac, T00YB5_A7153OSSTpo, T00YB5_n7153OSSTpo, T00YB5_A7154OSSMue,
            T00YB5_n7154OSSMue, T00YB5_A7155OSSDib, T00YB5_n7155OSSDib, T00YB5_A7156OSSImp, T00YB5_n7156OSSImp, T00YB5_A7157OSSPrd, T00YB5_n7157OSSPrd, T00YB5_A396EmprCod, T00YB5_A129BarCod, T00YB5_n129BarCod,
            T00YB5_A132BarCodReo, T00YB5_n132BarCodReo, T00YB5_A130BarCodPar, T00YB5_n130BarCodPar
            }
            , new Object[] {
            T00YB6_A407EmprNom, T00YB6_n407EmprNom
            }
            , new Object[] {
            T00YB7_A361DisCod, T00YB7_A252CliCod, T00YB7_n252CliCod
            }
            , new Object[] {
            T00YB8_A1013DibCli, T00YB8_n1013DibCli, T00YB8_A1014DibInt, T00YB8_n1014DibInt
            }
            , new Object[] {
            T00YB9_A279CliNom
            }
            , new Object[] {
            T00YB10_A6841DibDsc, T00YB10_n6841DibDsc, T00YB10_A2090DibMolCi2, T00YB10_n2090DibMolCi2, T00YB10_A1823DibTipMaq, T00YB10_n1823DibTipMaq, T00YB10_A1019DibMolCil, T00YB10_n1019DibMolCil
            }
            , new Object[] {
            T00YB11_A7158OSSObs, T00YB11_n7158OSSObs, T00YB11_A361DisCod, T00YB11_A7145OSSCod, T00YB11_A407EmprNom, T00YB11_n407EmprNom, T00YB11_A7146OSSEst, T00YB11_n7146OSSEst, T00YB11_A279CliNom, T00YB11_A6841DibDsc,
            T00YB11_n6841DibDsc, T00YB11_A2090DibMolCi2, T00YB11_n2090DibMolCi2, T00YB11_A1823DibTipMaq, T00YB11_n1823DibTipMaq, T00YB11_A1019DibMolCil, T00YB11_n1019DibMolCil, T00YB11_A7147OSSUsuCre, T00YB11_n7147OSSUsuCre, T00YB11_A7148OSSFchCre,
            T00YB11_n7148OSSFchCre, T00YB11_A7149OSSUsuRea, T00YB11_n7149OSSUsuRea, T00YB11_A7150OSSFchRea, T00YB11_n7150OSSFchRea, T00YB11_A7151OSSAnc, T00YB11_n7151OSSAnc, T00YB11_A7152OSSFac, T00YB11_n7152OSSFac, T00YB11_A7153OSSTpo,
            T00YB11_n7153OSSTpo, T00YB11_A7154OSSMue, T00YB11_n7154OSSMue, T00YB11_A7155OSSDib, T00YB11_n7155OSSDib, T00YB11_A7156OSSImp, T00YB11_n7156OSSImp, T00YB11_A7157OSSPrd, T00YB11_n7157OSSPrd, T00YB11_A396EmprCod,
            T00YB11_A129BarCod, T00YB11_n129BarCod, T00YB11_A132BarCodReo, T00YB11_n132BarCodReo, T00YB11_A130BarCodPar, T00YB11_n130BarCodPar, T00YB11_A252CliCod, T00YB11_n252CliCod, T00YB11_A1013DibCli, T00YB11_n1013DibCli,
            T00YB11_A1014DibInt, T00YB11_n1014DibInt
            }
            , new Object[] {
            T00YB12_A407EmprNom, T00YB12_n407EmprNom
            }
            , new Object[] {
            T00YB13_A361DisCod, T00YB13_A252CliCod, T00YB13_n252CliCod
            }
            , new Object[] {
            T00YB14_A1013DibCli, T00YB14_n1013DibCli, T00YB14_A1014DibInt, T00YB14_n1014DibInt
            }
            , new Object[] {
            T00YB15_A279CliNom
            }
            , new Object[] {
            T00YB16_A6841DibDsc, T00YB16_n6841DibDsc, T00YB16_A2090DibMolCi2, T00YB16_n2090DibMolCi2, T00YB16_A1823DibTipMaq, T00YB16_n1823DibTipMaq, T00YB16_A1019DibMolCil, T00YB16_n1019DibMolCil
            }
            , new Object[] {
            T00YB17_A396EmprCod, T00YB17_A7145OSSCod
            }
            , new Object[] {
            T00YB18_A7145OSSCod, T00YB18_A396EmprCod
            }
            , new Object[] {
            T00YB19_A7145OSSCod, T00YB19_A396EmprCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00YB23_A407EmprNom, T00YB23_n407EmprNom
            }
            , new Object[] {
            T00YB24_A361DisCod, T00YB24_A252CliCod, T00YB24_n252CliCod
            }
            , new Object[] {
            T00YB25_A1013DibCli, T00YB25_n1013DibCli, T00YB25_A1014DibInt, T00YB25_n1014DibInt
            }
            , new Object[] {
            T00YB26_A279CliNom
            }
            , new Object[] {
            T00YB27_A6841DibDsc, T00YB27_n6841DibDsc, T00YB27_A2090DibMolCi2, T00YB27_n2090DibMolCi2, T00YB27_A1823DibTipMaq, T00YB27_n1823DibTipMaq, T00YB27_A1019DibMolCil, T00YB27_n1019DibMolCil
            }
            , new Object[] {
            T00YB28_A396EmprCod, T00YB28_A7145OSSCod
            }
            , new Object[] {
            T00YB29_A7145OSSCod, T00YB29_A7159OSSShaOrd, T00YB29_A7160OSSShaCob, T00YB29_A7161OSSShaCol, T00YB29_A396EmprCod
            }
            , new Object[] {
            T00YB30_A396EmprCod, T00YB30_A7145OSSCod, T00YB30_A7159OSSShaOrd
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00YB34_A396EmprCod, T00YB34_A7145OSSCod, T00YB34_A7159OSSShaOrd
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z7159OSSShaOrd ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A7159OSSShaOrd ;
   private byte Gx_BScreen ;
   private byte subGridtshasep_level1item_Backcolorstyle ;
   private byte subGridtshasep_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridtshasep_level1item_Allowselection ;
   private byte subGridtshasep_level1item_Allowhovering ;
   private byte subGridtshasep_level1item_Allowcollapsing ;
   private byte subGridtshasep_level1item_Collapsed ;
   private byte ZZ132BarCodReo ;
   private short nRcdDeleted_1015 ;
   private short nRcdExists_1015 ;
   private short nIsMod_1015 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A2090DibMolCi2 ;
   private short A1019DibMolCil ;
   private short nBlankRcdCount1015 ;
   private short RcdFound1015 ;
   private short nBlankRcdUsr1015 ;
   private short Z2090DibMolCi2 ;
   private short Z1019DibMolCil ;
   private short RcdFound1014 ;
   private short nIsDirty_1014 ;
   private short nIsDirty_1015 ;
   private short ZZ2090DibMolCi2 ;
   private short ZZ1019DibMolCil ;
   private int Z7145OSSCod ;
   private int Z129BarCod ;
   private int nRC_GXsfl_173 ;
   private int nGXsfl_173_idx=1 ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A252CliCod ;
   private int A1014DibInt ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Enabled ;
   private int A7145OSSCod ;
   private int edtOSSCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDibCli_Enabled ;
   private int edtDibInt_Enabled ;
   private int edtDibDsc_Enabled ;
   private int edtDibMolCi2_Enabled ;
   private int edtDibMolCil_Enabled ;
   private int edtOSSUsuCre_Enabled ;
   private int edtOSSFchCre_Enabled ;
   private int edtOSSUsuRea_Enabled ;
   private int edtOSSFchRea_Enabled ;
   private int edtOSSAnc_Enabled ;
   private int edtOSSTpo_Enabled ;
   private int edtOSSMue_Enabled ;
   private int edtOSSDib_Enabled ;
   private int edtOSSImp_Enabled ;
   private int edtOSSPrd_Enabled ;
   private int edtOSSObs_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int edtOSSShaOrd_Enabled ;
   private int edtOSSShaCob_Enabled ;
   private int edtOSSShaCol_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int Z252CliCod ;
   private int Z1014DibInt ;
   private int subGridtshasep_level1item_Backcolor ;
   private int subGridtshasep_level1item_Allbackcolor ;
   private int defedtOSSShaOrd_Enabled ;
   private int idxLst ;
   private int subGridtshasep_level1item_Selectedindex ;
   private int subGridtshasep_level1item_Selectioncolor ;
   private int subGridtshasep_level1item_Hoveringcolor ;
   private int ZZ7145OSSCod ;
   private int ZZ129BarCod ;
   private int ZZ361DisCod ;
   private int ZZ252CliCod ;
   private int ZZ1014DibInt ;
   private long GRIDTSHASEP_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z7151OSSAnc ;
   private java.math.BigDecimal Z7160OSSShaCob ;
   private java.math.BigDecimal A7151OSSAnc ;
   private java.math.BigDecimal A7160OSSShaCob ;
   private java.math.BigDecimal ZZ7151OSSAnc ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z7146OSSEst ;
   private String Z7147OSSUsuCre ;
   private String Z7149OSSUsuRea ;
   private String Z7152OSSFac ;
   private String Z7153OSSTpo ;
   private String Z7154OSSMue ;
   private String Z7155OSSDib ;
   private String Z7156OSSImp ;
   private String Z7157OSSPrd ;
   private String Z130BarCodPar ;
   private String Z7161OSSShaCol ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A1013DibCli ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String sGXsfl_173_idx="0001" ;
   private String Gx_mode ;
   private String A7146OSSEst ;
   private String A1823DibTipMaq ;
   private String A7152OSSFac ;
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
   private String edtOSSCod_Internalname ;
   private String edtOSSCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtDibCli_Internalname ;
   private String edtDibCli_Jsonclick ;
   private String edtDibInt_Internalname ;
   private String edtDibInt_Jsonclick ;
   private String edtDibDsc_Internalname ;
   private String A6841DibDsc ;
   private String edtDibDsc_Jsonclick ;
   private String edtDibMolCi2_Internalname ;
   private String edtDibMolCi2_Jsonclick ;
   private String edtDibMolCil_Internalname ;
   private String edtDibMolCil_Jsonclick ;
   private String edtOSSUsuCre_Internalname ;
   private String A7147OSSUsuCre ;
   private String edtOSSUsuCre_Jsonclick ;
   private String edtOSSFchCre_Internalname ;
   private String edtOSSFchCre_Jsonclick ;
   private String edtOSSUsuRea_Internalname ;
   private String A7149OSSUsuRea ;
   private String edtOSSUsuRea_Jsonclick ;
   private String edtOSSFchRea_Internalname ;
   private String edtOSSFchRea_Jsonclick ;
   private String edtOSSAnc_Internalname ;
   private String edtOSSAnc_Jsonclick ;
   private String edtOSSTpo_Internalname ;
   private String A7153OSSTpo ;
   private String edtOSSTpo_Jsonclick ;
   private String edtOSSMue_Internalname ;
   private String A7154OSSMue ;
   private String edtOSSMue_Jsonclick ;
   private String edtOSSDib_Internalname ;
   private String A7155OSSDib ;
   private String edtOSSDib_Jsonclick ;
   private String edtOSSImp_Internalname ;
   private String A7156OSSImp ;
   private String edtOSSImp_Jsonclick ;
   private String edtOSSPrd_Internalname ;
   private String A7157OSSPrd ;
   private String edtOSSPrd_Jsonclick ;
   private String edtOSSObs_Internalname ;
   private String divLevel1table_Internalname ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode1015 ;
   private String edtOSSShaOrd_Internalname ;
   private String edtOSSShaCob_Internalname ;
   private String edtOSSShaCol_Internalname ;
   private String sStyleString ;
   private String subGridtshasep_level1item_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A7161OSSShaCol ;
   private String Z407EmprNom ;
   private String Z1013DibCli ;
   private String Z279CliNom ;
   private String Z6841DibDsc ;
   private String Z1823DibTipMaq ;
   private String sMode1014 ;
   private String sGXsfl_173_fel_idx="0001" ;
   private String subGridtshasep_level1item_Class ;
   private String subGridtshasep_level1item_Linesclass ;
   private String ROClassString ;
   private String edtOSSShaOrd_Jsonclick ;
   private String edtOSSShaCob_Jsonclick ;
   private String edtOSSShaCol_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtshasep_level1item_Header ;
   private String ZZ396EmprCod ;
   private String ZZ7146OSSEst ;
   private String ZZ130BarCodPar ;
   private String ZZ7147OSSUsuCre ;
   private String ZZ7149OSSUsuRea ;
   private String ZZ7152OSSFac ;
   private String ZZ7153OSSTpo ;
   private String ZZ7154OSSMue ;
   private String ZZ7155OSSDib ;
   private String ZZ7156OSSImp ;
   private String ZZ7157OSSPrd ;
   private String ZZ407EmprNom ;
   private String ZZ1013DibCli ;
   private String ZZ279CliNom ;
   private String ZZ6841DibDsc ;
   private String ZZ1823DibTipMaq ;
   private java.util.Date Z7148OSSFchCre ;
   private java.util.Date Z7150OSSFchRea ;
   private java.util.Date A7148OSSFchCre ;
   private java.util.Date A7150OSSFchRea ;
   private java.util.Date ZZ7148OSSFchCre ;
   private java.util.Date ZZ7150OSSFchRea ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n252CliCod ;
   private boolean n1013DibCli ;
   private boolean n1014DibInt ;
   private boolean wbErr ;
   private boolean n7146OSSEst ;
   private boolean n1823DibTipMaq ;
   private boolean n7152OSSFac ;
   private boolean bGXsfl_173_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n6841DibDsc ;
   private boolean n2090DibMolCi2 ;
   private boolean n1019DibMolCil ;
   private boolean n7147OSSUsuCre ;
   private boolean n7148OSSFchCre ;
   private boolean n7149OSSUsuRea ;
   private boolean n7150OSSFchRea ;
   private boolean n7151OSSAnc ;
   private boolean n7153OSSTpo ;
   private boolean n7154OSSMue ;
   private boolean n7155OSSDib ;
   private boolean n7156OSSImp ;
   private boolean n7157OSSPrd ;
   private boolean n7158OSSObs ;
   private boolean Gx_longc ;
   private String A7158OSSObs ;
   private String Z7158OSSObs ;
   private String ZZ7158OSSObs ;
   private com.genexus.webpanels.GXWebGrid Gridtshasep_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtshasep_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtshasep_level1itemColumn ;
   private ICheckbox chkOSSEst ;
   private HTMLChoice lstDibTipMaq ;
   private ICheckbox chkOSSFac ;
   private IDataStoreProvider pr_default ;
   private String[] T00YB11_A7158OSSObs ;
   private boolean[] T00YB11_n7158OSSObs ;
   private int[] T00YB11_A361DisCod ;
   private int[] T00YB11_A7145OSSCod ;
   private String[] T00YB11_A407EmprNom ;
   private boolean[] T00YB11_n407EmprNom ;
   private String[] T00YB11_A7146OSSEst ;
   private boolean[] T00YB11_n7146OSSEst ;
   private String[] T00YB11_A279CliNom ;
   private String[] T00YB11_A6841DibDsc ;
   private boolean[] T00YB11_n6841DibDsc ;
   private short[] T00YB11_A2090DibMolCi2 ;
   private boolean[] T00YB11_n2090DibMolCi2 ;
   private String[] T00YB11_A1823DibTipMaq ;
   private boolean[] T00YB11_n1823DibTipMaq ;
   private short[] T00YB11_A1019DibMolCil ;
   private boolean[] T00YB11_n1019DibMolCil ;
   private String[] T00YB11_A7147OSSUsuCre ;
   private boolean[] T00YB11_n7147OSSUsuCre ;
   private java.util.Date[] T00YB11_A7148OSSFchCre ;
   private boolean[] T00YB11_n7148OSSFchCre ;
   private String[] T00YB11_A7149OSSUsuRea ;
   private boolean[] T00YB11_n7149OSSUsuRea ;
   private java.util.Date[] T00YB11_A7150OSSFchRea ;
   private boolean[] T00YB11_n7150OSSFchRea ;
   private java.math.BigDecimal[] T00YB11_A7151OSSAnc ;
   private boolean[] T00YB11_n7151OSSAnc ;
   private String[] T00YB11_A7152OSSFac ;
   private boolean[] T00YB11_n7152OSSFac ;
   private String[] T00YB11_A7153OSSTpo ;
   private boolean[] T00YB11_n7153OSSTpo ;
   private String[] T00YB11_A7154OSSMue ;
   private boolean[] T00YB11_n7154OSSMue ;
   private String[] T00YB11_A7155OSSDib ;
   private boolean[] T00YB11_n7155OSSDib ;
   private String[] T00YB11_A7156OSSImp ;
   private boolean[] T00YB11_n7156OSSImp ;
   private String[] T00YB11_A7157OSSPrd ;
   private boolean[] T00YB11_n7157OSSPrd ;
   private String[] T00YB11_A396EmprCod ;
   private int[] T00YB11_A129BarCod ;
   private boolean[] T00YB11_n129BarCod ;
   private byte[] T00YB11_A132BarCodReo ;
   private boolean[] T00YB11_n132BarCodReo ;
   private String[] T00YB11_A130BarCodPar ;
   private boolean[] T00YB11_n130BarCodPar ;
   private int[] T00YB11_A252CliCod ;
   private boolean[] T00YB11_n252CliCod ;
   private String[] T00YB11_A1013DibCli ;
   private boolean[] T00YB11_n1013DibCli ;
   private int[] T00YB11_A1014DibInt ;
   private boolean[] T00YB11_n1014DibInt ;
   private String[] T00YB6_A407EmprNom ;
   private boolean[] T00YB6_n407EmprNom ;
   private int[] T00YB7_A361DisCod ;
   private int[] T00YB7_A252CliCod ;
   private boolean[] T00YB7_n252CliCod ;
   private String[] T00YB8_A1013DibCli ;
   private boolean[] T00YB8_n1013DibCli ;
   private int[] T00YB8_A1014DibInt ;
   private boolean[] T00YB8_n1014DibInt ;
   private String[] T00YB9_A279CliNom ;
   private String[] T00YB10_A6841DibDsc ;
   private boolean[] T00YB10_n6841DibDsc ;
   private short[] T00YB10_A2090DibMolCi2 ;
   private boolean[] T00YB10_n2090DibMolCi2 ;
   private String[] T00YB10_A1823DibTipMaq ;
   private boolean[] T00YB10_n1823DibTipMaq ;
   private short[] T00YB10_A1019DibMolCil ;
   private boolean[] T00YB10_n1019DibMolCil ;
   private String[] T00YB12_A407EmprNom ;
   private boolean[] T00YB12_n407EmprNom ;
   private int[] T00YB13_A361DisCod ;
   private int[] T00YB13_A252CliCod ;
   private boolean[] T00YB13_n252CliCod ;
   private String[] T00YB14_A1013DibCli ;
   private boolean[] T00YB14_n1013DibCli ;
   private int[] T00YB14_A1014DibInt ;
   private boolean[] T00YB14_n1014DibInt ;
   private String[] T00YB15_A279CliNom ;
   private String[] T00YB16_A6841DibDsc ;
   private boolean[] T00YB16_n6841DibDsc ;
   private short[] T00YB16_A2090DibMolCi2 ;
   private boolean[] T00YB16_n2090DibMolCi2 ;
   private String[] T00YB16_A1823DibTipMaq ;
   private boolean[] T00YB16_n1823DibTipMaq ;
   private short[] T00YB16_A1019DibMolCil ;
   private boolean[] T00YB16_n1019DibMolCil ;
   private String[] T00YB17_A396EmprCod ;
   private int[] T00YB17_A7145OSSCod ;
   private String[] T00YB5_A7158OSSObs ;
   private boolean[] T00YB5_n7158OSSObs ;
   private int[] T00YB5_A7145OSSCod ;
   private String[] T00YB5_A7146OSSEst ;
   private boolean[] T00YB5_n7146OSSEst ;
   private String[] T00YB5_A7147OSSUsuCre ;
   private boolean[] T00YB5_n7147OSSUsuCre ;
   private java.util.Date[] T00YB5_A7148OSSFchCre ;
   private boolean[] T00YB5_n7148OSSFchCre ;
   private String[] T00YB5_A7149OSSUsuRea ;
   private boolean[] T00YB5_n7149OSSUsuRea ;
   private java.util.Date[] T00YB5_A7150OSSFchRea ;
   private boolean[] T00YB5_n7150OSSFchRea ;
   private java.math.BigDecimal[] T00YB5_A7151OSSAnc ;
   private boolean[] T00YB5_n7151OSSAnc ;
   private String[] T00YB5_A7152OSSFac ;
   private boolean[] T00YB5_n7152OSSFac ;
   private String[] T00YB5_A7153OSSTpo ;
   private boolean[] T00YB5_n7153OSSTpo ;
   private String[] T00YB5_A7154OSSMue ;
   private boolean[] T00YB5_n7154OSSMue ;
   private String[] T00YB5_A7155OSSDib ;
   private boolean[] T00YB5_n7155OSSDib ;
   private String[] T00YB5_A7156OSSImp ;
   private boolean[] T00YB5_n7156OSSImp ;
   private String[] T00YB5_A7157OSSPrd ;
   private boolean[] T00YB5_n7157OSSPrd ;
   private String[] T00YB5_A396EmprCod ;
   private int[] T00YB5_A129BarCod ;
   private boolean[] T00YB5_n129BarCod ;
   private byte[] T00YB5_A132BarCodReo ;
   private boolean[] T00YB5_n132BarCodReo ;
   private String[] T00YB5_A130BarCodPar ;
   private boolean[] T00YB5_n130BarCodPar ;
   private int[] T00YB18_A7145OSSCod ;
   private String[] T00YB18_A396EmprCod ;
   private int[] T00YB19_A7145OSSCod ;
   private String[] T00YB19_A396EmprCod ;
   private String[] T00YB4_A7158OSSObs ;
   private boolean[] T00YB4_n7158OSSObs ;
   private int[] T00YB4_A7145OSSCod ;
   private String[] T00YB4_A7146OSSEst ;
   private boolean[] T00YB4_n7146OSSEst ;
   private String[] T00YB4_A7147OSSUsuCre ;
   private boolean[] T00YB4_n7147OSSUsuCre ;
   private java.util.Date[] T00YB4_A7148OSSFchCre ;
   private boolean[] T00YB4_n7148OSSFchCre ;
   private String[] T00YB4_A7149OSSUsuRea ;
   private boolean[] T00YB4_n7149OSSUsuRea ;
   private java.util.Date[] T00YB4_A7150OSSFchRea ;
   private boolean[] T00YB4_n7150OSSFchRea ;
   private java.math.BigDecimal[] T00YB4_A7151OSSAnc ;
   private boolean[] T00YB4_n7151OSSAnc ;
   private String[] T00YB4_A7152OSSFac ;
   private boolean[] T00YB4_n7152OSSFac ;
   private String[] T00YB4_A7153OSSTpo ;
   private boolean[] T00YB4_n7153OSSTpo ;
   private String[] T00YB4_A7154OSSMue ;
   private boolean[] T00YB4_n7154OSSMue ;
   private String[] T00YB4_A7155OSSDib ;
   private boolean[] T00YB4_n7155OSSDib ;
   private String[] T00YB4_A7156OSSImp ;
   private boolean[] T00YB4_n7156OSSImp ;
   private String[] T00YB4_A7157OSSPrd ;
   private boolean[] T00YB4_n7157OSSPrd ;
   private String[] T00YB4_A396EmprCod ;
   private int[] T00YB4_A129BarCod ;
   private boolean[] T00YB4_n129BarCod ;
   private byte[] T00YB4_A132BarCodReo ;
   private boolean[] T00YB4_n132BarCodReo ;
   private String[] T00YB4_A130BarCodPar ;
   private boolean[] T00YB4_n130BarCodPar ;
   private String[] T00YB23_A407EmprNom ;
   private boolean[] T00YB23_n407EmprNom ;
   private int[] T00YB24_A361DisCod ;
   private int[] T00YB24_A252CliCod ;
   private boolean[] T00YB24_n252CliCod ;
   private String[] T00YB25_A1013DibCli ;
   private boolean[] T00YB25_n1013DibCli ;
   private int[] T00YB25_A1014DibInt ;
   private boolean[] T00YB25_n1014DibInt ;
   private String[] T00YB26_A279CliNom ;
   private String[] T00YB27_A6841DibDsc ;
   private boolean[] T00YB27_n6841DibDsc ;
   private short[] T00YB27_A2090DibMolCi2 ;
   private boolean[] T00YB27_n2090DibMolCi2 ;
   private String[] T00YB27_A1823DibTipMaq ;
   private boolean[] T00YB27_n1823DibTipMaq ;
   private short[] T00YB27_A1019DibMolCil ;
   private boolean[] T00YB27_n1019DibMolCil ;
   private String[] T00YB28_A396EmprCod ;
   private int[] T00YB28_A7145OSSCod ;
   private int[] T00YB29_A7145OSSCod ;
   private byte[] T00YB29_A7159OSSShaOrd ;
   private java.math.BigDecimal[] T00YB29_A7160OSSShaCob ;
   private String[] T00YB29_A7161OSSShaCol ;
   private String[] T00YB29_A396EmprCod ;
   private String[] T00YB30_A396EmprCod ;
   private int[] T00YB30_A7145OSSCod ;
   private byte[] T00YB30_A7159OSSShaOrd ;
   private int[] T00YB3_A7145OSSCod ;
   private byte[] T00YB3_A7159OSSShaOrd ;
   private java.math.BigDecimal[] T00YB3_A7160OSSShaCob ;
   private String[] T00YB3_A7161OSSShaCol ;
   private String[] T00YB3_A396EmprCod ;
   private int[] T00YB2_A7145OSSCod ;
   private byte[] T00YB2_A7159OSSShaOrd ;
   private java.math.BigDecimal[] T00YB2_A7160OSSShaCob ;
   private String[] T00YB2_A7161OSSShaCol ;
   private String[] T00YB2_A396EmprCod ;
   private String[] T00YB34_A396EmprCod ;
   private int[] T00YB34_A7145OSSCod ;
   private byte[] T00YB34_A7159OSSShaOrd ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tshasep__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tshasep__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tshasep__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tshasep__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tshasep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00YB2", "SELECT OSSCod, OSSShaOrd, OSSShaCob, OSSShaCol, EmprCod FROM TXPShaSe1 WHERE EmprCod = ? AND OSSCod = ? AND OSSShaOrd = ?  FOR UPDATE OF OSSShaCob, OSSShaCol NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB3", "SELECT OSSCod, OSSShaOrd, OSSShaCob, OSSShaCol, EmprCod FROM TXPShaSe1 WHERE EmprCod = ? AND OSSCod = ? AND OSSShaOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB4", "SELECT OSSObs, OSSCod, OSSEst, OSSUsuCre, OSSFchCre, OSSUsuRea, OSSFchRea, OSSAnc, OSSFac, OSSTpo, OSSMue, OSSDib, OSSImp, OSSPrd, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPShaSep WHERE EmprCod = ? AND OSSCod = ?  FOR UPDATE OF OSSEst, OSSUsuCre, OSSFchCre, OSSUsuRea, OSSFchRea, OSSAnc, OSSFac, OSSTpo, OSSMue, OSSDib, OSSImp, OSSPrd, OSSObs, BarCod, BarCodReo, BarCodPar NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB5", "SELECT OSSObs, OSSCod, OSSEst, OSSUsuCre, OSSFchCre, OSSUsuRea, OSSFchRea, OSSAnc, OSSFac, OSSTpo, OSSMue, OSSDib, OSSImp, OSSPrd, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPShaSep WHERE EmprCod = ? AND OSSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB7", "SELECT DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB8", "SELECT DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB10", "SELECT DibDsc, DibMolCi2, DibTipMaq, DibMolCil FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB11", "SELECT /*+ FIRST_ROWS(100) */ TM1.OSSObs, T3.DisCod, TM1.OSSCod, T2.EmprNom, TM1.OSSEst, T5.CliNom, T6.DibDsc, T6.DibMolCi2, T6.DibTipMaq, T6.DibMolCil, TM1.OSSUsuCre, TM1.OSSFchCre, TM1.OSSUsuRea, TM1.OSSFchRea, TM1.OSSAnc, TM1.OSSFac, TM1.OSSTpo, TM1.OSSMue, TM1.OSSDib, TM1.OSSImp, TM1.OSSPrd, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, T3.CliCod, T4.DibCli, T4.DibInt FROM (((((TXPShaSep TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T4 ON T4.EmprCod = TM1.EmprCod AND T4.DisCod = T3.DisCod) LEFT JOIN TXPCDIBUJ T6 ON T6.EmprCod = TM1.EmprCod AND T6.DibCli = T4.DibCli AND T6.CliCod = T3.CliCod AND T6.DibInt = T4.DibInt) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = T3.CliCod) WHERE TM1.OSSCod = ? and TM1.EmprCod = ? ORDER BY TM1.EmprCod, TM1.OSSCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB12", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB13", "SELECT DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB14", "SELECT DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB15", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB16", "SELECT DibDsc, DibMolCi2, DibTipMaq, DibMolCil FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB17", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, OSSCod FROM TXPShaSep WHERE EmprCod = ? AND OSSCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB18", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OSSCod, EmprCod FROM TXPShaSep WHERE ( OSSCod > ? or OSSCod = ? and EmprCod > ?) ORDER BY EmprCod, OSSCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00YB19", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ OSSCod, EmprCod FROM TXPShaSep WHERE ( OSSCod < ? or OSSCod = ? and EmprCod < ?) ORDER BY EmprCod DESC, OSSCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00YB20", "INSERT INTO TXPShaSep(OSSCod, OSSEst, OSSUsuCre, OSSFchCre, OSSUsuRea, OSSFchRea, OSSAnc, OSSFac, OSSTpo, OSSMue, OSSDib, OSSImp, OSSPrd, OSSObs, EmprCod, BarCod, BarCodReo, BarCodPar) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPShaSep")
         ,new UpdateCursor("T00YB21", "UPDATE TXPShaSep SET OSSEst=?, OSSUsuCre=?, OSSFchCre=?, OSSUsuRea=?, OSSFchRea=?, OSSAnc=?, OSSFac=?, OSSTpo=?, OSSMue=?, OSSDib=?, OSSImp=?, OSSPrd=?, OSSObs=?, BarCod=?, BarCodReo=?, BarCodPar=?  WHERE EmprCod = ? AND OSSCod = ?", GX_NOMASK, "TXPShaSep")
         ,new UpdateCursor("T00YB22", "DELETE FROM TXPShaSep  WHERE EmprCod = ? AND OSSCod = ?", GX_NOMASK, "TXPShaSep")
         ,new ForEachCursor("T00YB23", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB24", "SELECT DisCod, CliCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB25", "SELECT DibCli, DibInt FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB26", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB27", "SELECT DibDsc, DibMolCi2, DibTipMaq, DibMolCil FROM TXPCDIBUJ WHERE EmprCod = ? AND DibCli = ? AND CliCod = ? AND DibInt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, OSSCod FROM TXPShaSep ORDER BY EmprCod, OSSCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB29", "SELECT OSSCod, OSSShaOrd, OSSShaCob, OSSShaCol, EmprCod FROM TXPShaSe1 WHERE EmprCod = ? and OSSCod = ? and OSSShaOrd = ? ORDER BY EmprCod, OSSCod, OSSShaOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00YB30", "SELECT EmprCod, OSSCod, OSSShaOrd FROM TXPShaSe1 WHERE EmprCod = ? AND OSSCod = ? AND OSSShaOrd = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00YB31", "INSERT INTO TXPShaSe1(OSSCod, OSSShaOrd, OSSShaCob, OSSShaCol, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPShaSe1")
         ,new UpdateCursor("T00YB32", "UPDATE TXPShaSe1 SET OSSShaCob=?, OSSShaCol=?  WHERE EmprCod = ? AND OSSCod = ? AND OSSShaOrd = ?", GX_NOMASK, "TXPShaSe1")
         ,new UpdateCursor("T00YB33", "DELETE FROM TXPShaSe1  WHERE EmprCod = ? AND OSSCod = ? AND OSSShaOrd = ?", GX_NOMASK, "TXPShaSe1")
         ,new ForEachCursor("T00YB34", "SELECT EmprCod, OSSCod, OSSShaOrd FROM TXPShaSe1 WHERE EmprCod = ? and OSSCod = ? ORDER BY EmprCod, OSSCod, OSSShaOrd ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 10);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 10);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[11])[0] = rslt.getGXDateTime(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(8,2);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 10);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(15, 3);
               ((int[]) buf[28])[0] = rslt.getInt(16);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((byte[]) buf[30])[0] = rslt.getByte(17);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getString(18, 1);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 30);
               ((String[]) buf[9])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(10);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 10);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 10);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(14);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(15,2);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 1);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 10);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(18, 10);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(19, 10);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(20, 10);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getString(21, 10);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(22, 3);
               ((int[]) buf[40])[0] = rslt.getInt(23);
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((byte[]) buf[42])[0] = rslt.getByte(24);
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((int[]) buf[46])[0] = rslt.getInt(26);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getString(27, 16);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(28);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 17 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((int[]) buf[2])[0] = rslt.getInt(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((short[]) buf[2])[0] = rslt.getShort(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 10);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 10);
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
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[16], 10);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[18], 10);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 10);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 10);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(13, (String)parms[24], 10);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(14, (String)parms[26]);
               }
               stmt.setString(15, (String)parms[27], 3);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[29]).intValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[31]).byteValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[33], 1);
               }
               return;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 10);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 10);
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
                  stmt.setNull( 6 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(6, (java.math.BigDecimal)parms[11], 2);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[15], 10);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[17], 10);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 10);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 10);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[23], 10);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.CLOB );
               }
               else
               {
                  stmt.setLongVarchar(13, (String)parms[25]);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[27]).intValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(16, (String)parms[31], 1);
               }
               stmt.setString(17, (String)parms[32], 3);
               stmt.setInt(18, ((Number) parms[33]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 16);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[6]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 3);
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 20);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

