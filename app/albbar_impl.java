package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albbar_impl extends GXDataArea
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
         A1206TubCod = (short)(GXutil.lval( httpContext.GetPar( "TubCod"))) ;
         n1206TubCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_4( A396EmprCod, A1206TubCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A3153CodCod = httpContext.GetPar( "CodCod") ;
         n3153CodCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", A3153CodCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod, A3153CodCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A30AlbProCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
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
         gxload_7( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
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
         gxload_8( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
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
         gxload_9( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ALBBAR", ""), (short)(0)) ;
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

   public albbar_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albbar_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albbar_impl.class ));
   }

   public albbar_impl( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbAlbProVal = new HTMLChoice();
      chkBarTipCor = UIFactory.getCheckbox(this);
      chkBarAcc = UIFactory.getCheckbox(this);
      cmbBarEstReo = new HTMLChoice();
      chkDisDes = UIFactory.getCheckbox(this);
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
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), true);
      }
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
      }
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "ALBBAR", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ALBBAR.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_ALBBAR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Numero Albaran Produccion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProCod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbSer_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbSer_Internalname, GXutil.rtrim( A3391AlbSer), GXutil.rtrim( localUtil.format( A3391AlbSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbSerD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbSerD_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbSerD_Internalname, GXutil.rtrim( A8879AlbSerD), GXutil.rtrim( localUtil.format( A8879AlbSerD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbSerD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbSerD_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColNom_Internalname, GXutil.rtrim( A3392AlbColNom), GXutil.rtrim( localUtil.format( A3392AlbColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNomCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNomCli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNomCli_Internalname, GXutil.rtrim( A12232AlbNomCli), GXutil.rtrim( localUtil.format( A12232AlbNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNomCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbColNum_Internalname, httpContext.getMessage( "Numero Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3393AlbColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCodCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCodCod_Internalname, httpContext.getMessage( "Codigo Factura", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodCod_Internalname, GXutil.rtrim( A3153CodCod), GXutil.rtrim( localUtil.format( A3153CodCod, "XXXXXX")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCodCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbKgmE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbKgmE_Internalname, httpContext.getMessage( "Kilos Entregados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbKgmE_Internalname, GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbKgmE_Enabled!=0) ? localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( A1261BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbKgmE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAlbKgmE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPreKgm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPreKgm_Internalname, httpContext.getMessage( "Precio Kilo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPreKgm_Enabled!=0) ? localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999") : localUtil.format( A1262BarPreKgm, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPreKgm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPreKgm_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrAnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrAnc_Internalname, httpContext.getMessage( "AlbHdrAnc", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrAnc_Internalname, GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrAnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3271AlbHdrAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrAnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbHdrAnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrgm2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrgm2_Internalname, httpContext.getMessage( "Grm2 salida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrgm2_Internalname, GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrgm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5019AlbHdrgm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrgm2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbHdrgm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbMtrE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbMtrE_Internalname, httpContext.getMessage( "Metros Entregados H. Ruta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbMtrE_Internalname, GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbMtrE_Enabled!=0) ? localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( A1263BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbMtrE_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAlbMtrE_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPreMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPreMtr_Internalname, httpContext.getMessage( "Precio Metro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPreMtr_Enabled!=0) ? localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999") : localUtil.format( A1264BarPreMtr, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPreMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPreMtr_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbPie_Internalname, httpContext.getMessage( "Total Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbPie_Internalname, GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1265BarAlbPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAlbPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTubCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTubCod_Internalname, httpContext.getMessage( "Tubo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTubCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTubCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1206TubCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTubCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTubCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbTub_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbTub_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbTub_Internalname, GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbTub_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1266BarAlbTub), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbTub_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAlbTub_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPlasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPlasCod_Internalname, httpContext.getMessage( "Codigo Plastico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPlasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPlasCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6466PlasCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPlasCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPlasCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbPlas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbPlas_Internalname, httpContext.getMessage( "Cantidad de plasticos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbPlas_Internalname, GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbPlas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6467BarAlbPlas), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbPlas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAlbPlas_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrObs_Internalname, httpContext.getMessage( "Observ.de las HRs en ALBARAN", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrObs_Internalname, GXutil.rtrim( A2441AlbHdrObs), GXutil.rtrim( localUtil.format( A2441AlbHdrObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrObs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbHdrObs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbProVal.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbProVal.getInternalname(), httpContext.getMessage( "Valorar", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbProVal, cmbAlbProVal.getInternalname(), GXutil.rtrim( A2839AlbProVal), 1, cmbAlbProVal.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbProVal.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "", true, (byte)(0), "HLP_ALBBAR.htm");
      cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTipEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTipEnt_Internalname, httpContext.getMessage( "Parcial_Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipEnt_Internalname, GXutil.rtrim( A1095AlbTipEnt), GXutil.rtrim( localUtil.format( A1095AlbTipEnt, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbTipEnt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTipArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTipArt_Internalname, httpContext.getMessage( "Tipo articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12234AlbTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12234AlbTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipArt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipArt_Internalname, httpContext.getMessage( "Codigo Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipArt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbNumcli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbNumcli_Internalname, httpContext.getMessage( "Numero Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbNumcli_Internalname, GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbNumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12233AlbNumcli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12233AlbNumcli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbNumcli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbNumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNumCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNumCli_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNumCli_Internalname, GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarNumCli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1235BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNumCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNumCli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNomCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarNomCli_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbUnd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbUnd_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbUnd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12195BarAlbUnd), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12195BarAlbUnd), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbUnd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAlbUnd_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPreUnd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPreUnd_Internalname, httpContext.getMessage( "Precio Unidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPreUnd_Internalname, GXutil.ltrim( localUtil.ntoc( A12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPreUnd_Enabled!=0) ? localUtil.format( A12196BarPreUnd, "ZZZZZZ9.99999") : localUtil.format( A12196BarPreUnd, "ZZZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPreUnd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPreUnd_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarEstTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarEstTip_Internalname, httpContext.getMessage( "Tipo Diseño(Plan,Rot.)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEstTip_Internalname, GXutil.rtrim( A5034BarEstTip), GXutil.rtrim( localUtil.format( A5034BarEstTip, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEstTip_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarEstTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCliCod_Internalname, httpContext.getMessage( "AlbCliCod", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3886AlbCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A3886AlbCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols1( ) ;
   }

   public void drawcontrols1( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMetULi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMetULi_Internalname, httpContext.getMessage( "Ult.Linea Metraje", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMetULi_Internalname, GXutil.ltrim( localUtil.ntoc( A6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbMetULi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6645AlbMetULi), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6645AlbMetULi), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMetULi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbMetULi_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarFasExt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarFasExt_Internalname, httpContext.getMessage( "Codigo Fase Externa", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFasExt_Internalname, GXutil.rtrim( A2398BarFasExt), GXutil.rtrim( localUtil.format( A2398BarFasExt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFasExt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarFasExt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkBarTipCor.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkBarTipCor.getInternalname(), httpContext.getMessage( "CL,RL,CO", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkBarTipCor.getInternalname(), A5291BarTipCor, "", httpContext.getMessage( "CL,RL,CO", ""), 1, chkBarTipCor.getEnabled(), "SI", "", StyleString, ClassString, "", "", "");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarGraCob_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarGraCob_Internalname, httpContext.getMessage( "Grado de Cobertura", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraCob_Internalname, GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraCob_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5027BarGraCob), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A5027BarGraCob), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraCob_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarGraCob_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipDis_Internalname, httpContext.getMessage( "Tipod Disposicion,C,M,etc", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipDis_Internalname, GXutil.rtrim( A2010BarTipDis), GXutil.rtrim( localUtil.format( A2010BarTipDis, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipDis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbPN_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbPN_Internalname, httpContext.getMessage( "Peso Neto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbPN_Internalname, GXutil.ltrim( localUtil.ntoc( A1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbPN_Enabled!=0) ? localUtil.format( A1461BarAlbPN, "ZZZZZ9.99") : localUtil.format( A1461BarAlbPN, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbPN_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAlbPN_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCtrPdas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCtrPdas_Internalname, httpContext.getMessage( "Control Creacion Partidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCtrPdas_Internalname, GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCtrPdas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4937BarCtrPdas), "9") : localUtil.format( DecimalUtil.doubleToDec(A4937BarCtrPdas), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCtrPdas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCtrPdas_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDto_Internalname, httpContext.getMessage( "Descuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbDto_Enabled!=0) ? localUtil.format( A7994AlbDto, "Z9.999") : localUtil.format( A7994AlbDto, "Z9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDto_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDto_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbMqTj_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbMqTj_Internalname, httpContext.getMessage( "Maquina tejido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbMqTj_Internalname, GXutil.rtrim( A7993AlbMqTj), GXutil.rtrim( localUtil.format( A7993AlbMqTj, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbMqTj_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbMqTj_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDf3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDf3_Internalname, httpContext.getMessage( "Defecto 3", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDf3_Internalname, GXutil.rtrim( A7992AlbDf3), GXutil.rtrim( localUtil.format( A7992AlbDf3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDf3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDf3_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDf2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDf2_Internalname, httpContext.getMessage( "Defecto 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDf2_Internalname, GXutil.rtrim( A7991AlbDf2), GXutil.rtrim( localUtil.format( A7991AlbDf2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDf2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDf2_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbDf1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbDf1_Internalname, httpContext.getMessage( "Defecto 1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbDf1_Internalname, GXutil.rtrim( A7990AlbDf1), GXutil.rtrim( localUtil.format( A7990AlbDf1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbDf1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbDf1_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCald_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCald_Internalname, httpContext.getMessage( "Calidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCald_Internalname, GXutil.rtrim( A7989AlbCald), GXutil.rtrim( localUtil.format( A7989AlbCald, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCald_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbCald_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbEncA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbEncA_Internalname, httpContext.getMessage( "Encogimiento Ancho", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbEncA_Internalname, GXutil.ltrim( localUtil.ntoc( A7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbEncA_Enabled!=0) ? localUtil.format( A7104AlbEncA, "ZZZ9.99") : localUtil.format( A7104AlbEncA, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbEncA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbEncA_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbEncL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbEncL_Internalname, httpContext.getMessage( "Encogimiento Largo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbEncL_Internalname, GXutil.ltrim( localUtil.ntoc( A7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbEncL_Enabled!=0) ? localUtil.format( A7103AlbEncL, "ZZZ9.99") : localUtil.format( A7103AlbEncL, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbEncL_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbEncL_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbObsM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbObsM_Internalname, httpContext.getMessage( "AlbObsM", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtAlbObsM_Internalname, A6814AlbObsM, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,279);\"", (short)(0), 1, edtAlbObsM_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbBarRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbBarRec_Internalname, httpContext.getMessage( "Recargo por Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbBarRec_Internalname, GXutil.ltrim( localUtil.ntoc( A2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbBarRec_Enabled!=0) ? localUtil.format( A2761AlbBarRec, "ZZ9.99") : localUtil.format( A2761AlbBarRec, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,284);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbBarRec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbBarRec_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkBarAcc.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkBarAcc.getInternalname(), httpContext.getMessage( "Accesorios Metalicos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkBarAcc.getInternalname(), A5253BarAcc, "", httpContext.getMessage( "Accesorios Metalicos", ""), 1, chkBarAcc.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbImpMan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbImpMan_Internalname, httpContext.getMessage( "Importe Linea Albaran Manual", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbImpMan_Internalname, GXutil.ltrim( localUtil.ntoc( A5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbImpMan_Enabled!=0) ? localUtil.format( A5354AlbImpMan, "ZZZZZZZ9.99") : localUtil.format( A5354AlbImpMan, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,294);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbImpMan_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbImpMan_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbBarEstReo.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbBarEstReo.getInternalname(), httpContext.getMessage( "Estado Reop", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbBarEstReo, cmbBarEstReo.getInternalname(), GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)), 1, cmbBarEstReo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbBarEstReo.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_ALBBAR.htm");
      cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarDisNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarDisNum_Internalname, httpContext.getMessage( "Disposicion Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarDisNum_Internalname, GXutil.rtrim( A143BarDisNum), GXutil.rtrim( localUtil.format( A143BarDisNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarDisNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarDisNum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarGraAca_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarGraAca_Internalname, httpContext.getMessage( "Gramaje Acabado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarGraAca_Internalname, GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarGraAca_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1909BarGraAca), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarGraAca_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarGraAca_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbEncCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbEncCli_Internalname, httpContext.getMessage( "Disposicion Cliente nueva", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbEncCli_Internalname, GXutil.rtrim( A4815AlbEncCli), GXutil.rtrim( localUtil.format( A4815AlbEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbEncCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarEncCli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarEncCli_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli), GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSerDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSerDsc_Internalname, httpContext.getMessage( "Descripción Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarTipCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarTipCol_Internalname, httpContext.getMessage( "Codigo TC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A218BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarTipCol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNum_Internalname, httpContext.getMessage( "Numero del Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarColNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbTipCol_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbTipCol_Internalname, httpContext.getMessage( "Tipo Colorante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 344,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbTipCol_Internalname, GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbTipCol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3394AlbTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3394AlbTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,344);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbTipCol_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbTipCol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPart_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPart_Internalname, httpContext.getMessage( "Nº Partida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPart_Internalname, GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1503BarPart), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPart_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPart_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAlbBul_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAlbBul_Internalname, httpContext.getMessage( "Bultos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAlbBul_Internalname, GXutil.ltrim( localUtil.ntoc( A1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAlbBul_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1458BarAlbBul), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1458BarAlbBul), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,354);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAlbBul_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAlbBul_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkDisDes.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkDisDes.getInternalname(), httpContext.getMessage( "Desglose", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkDisDes.getInternalname(), A365DisDes, "", httpContext.getMessage( "Desglose", ""), 1, chkDisDes.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProRec_Internalname, httpContext.getMessage( "Recargo Albaran", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 364,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProRec_Internalname, GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProRec_Enabled!=0) ? localUtil.format( A40AlbProRec, "ZZZZZZ9.99") : localUtil.format( A40AlbProRec, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,364);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProRec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProRec_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProEsp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProEsp_Internalname, httpContext.getMessage( "Albaran Pendiente Confirmacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 369,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProEsp_Internalname, GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProEsp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99") : localUtil.format( DecimalUtil.doubleToDec(A32AlbProEsp), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,369);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProEsp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbProEsp_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarKla_Internalname, httpContext.getMessage( "Kilos Lanzados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKla_Internalname, GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKla_Enabled!=0) ? localUtil.format( A1279BarKla, "ZZZZZ9.99") : localUtil.format( A1279BarKla, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarKla_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarMla_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarMla_Internalname, httpContext.getMessage( "Metros Lanzados", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMla_Internalname, GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMla_Enabled!=0) ? localUtil.format( A1280BarMla, "ZZZZZ9.99") : localUtil.format( A1280BarMla, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarMla_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPlz_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPlz_Internalname, httpContext.getMessage( "Piezas lanzadas (no desglose)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPlz_Internalname, GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPlz_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1292BarPlz), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1292BarPlz), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPlz_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPlz_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarPie_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarPie_Internalname, GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarPie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarFecSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarFecSal_Internalname, httpContext.getMessage( "Fecha Salida en Albaran", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtBarFecSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarFecSal_Internalname, localUtil.format(A161BarFecSal, "99/99/99"), localUtil.format( A161BarFecSal, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarFecSal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarFecSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtBarFecSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtBarFecSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ALBBAR.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAncAca1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAncAca1_Internalname, httpContext.getMessage( "Ancho Acabado 1", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAncAca1_Internalname, GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAncAca1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A125BarAncAca1), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAncAca1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAncAca1_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      drawcontrols2( ) ;
   }

   public void drawcontrols2( )
   {
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSit_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSit_Internalname, httpContext.getMessage( "Situacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSit_Internalname, GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSit_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGuiFasULin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGuiFasULin_Internalname, httpContext.getMessage( "Ultima Linea Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 419,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtGuiFasULin_Internalname, GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGuiFasULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1248GuiFasULin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,419);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGuiFasULin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGuiFasULin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbHdrUlin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbHdrUlin_Internalname, httpContext.getMessage( "Ultima Linea Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 424,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbHdrUlin_Internalname, GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbHdrUlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2763AlbHdrUlin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2763AlbHdrUlin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,424);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbHdrUlin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbHdrUlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarAcaAnh_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarAcaAnh_Internalname, httpContext.getMessage( "Caderno encargos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarAcaAnh_Internalname, GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarAcaAnh_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarAcaAnh_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarAcaAnh_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbCadEnc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbCadEnc_Internalname, httpContext.getMessage( "Caderno encargos", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 434,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbCadEnc_Internalname, GXutil.ltrim( localUtil.ntoc( A12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbCadEnc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A12905AlbCadEnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A12905AlbCadEnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,434);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbCadEnc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbCadEnc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipAcaCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipAcaCod_Internalname, httpContext.getMessage( "Codigo Tipo de Acabado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 439,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipAcaCod_Internalname, GXutil.ltrim( localUtil.ntoc( A5051TipAcaCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipAcaCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5051TipAcaCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5051TipAcaCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,439);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipAcaCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipAcaCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ALBBAR.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 444,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 446,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBBAR.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 448,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ALBBAR.htm");
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
         Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z3391AlbSer = httpContext.cgiGet( "Z3391AlbSer") ;
         Z8879AlbSerD = httpContext.cgiGet( "Z8879AlbSerD") ;
         Z3392AlbColNom = httpContext.cgiGet( "Z3392AlbColNom") ;
         Z12232AlbNomCli = httpContext.cgiGet( "Z12232AlbNomCli") ;
         Z3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z3393AlbColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( "Z1261BarAlbKgmE")) ;
         Z1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( "Z1262BarPreKgm")) ;
         Z3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z3271AlbHdrAnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z5019AlbHdrgm2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( "Z1263BarAlbMtrE")) ;
         Z1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( "Z1264BarPreMtr")) ;
         Z1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( "Z1265BarAlbPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( "Z1266BarAlbTub"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z6466PlasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( "Z6467BarAlbPlas"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2441AlbHdrObs = httpContext.cgiGet( "Z2441AlbHdrObs") ;
         Z2839AlbProVal = httpContext.cgiGet( "Z2839AlbProVal") ;
         Z1095AlbTipEnt = httpContext.cgiGet( "Z1095AlbTipEnt") ;
         Z12234AlbTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z12234AlbTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12233AlbNumcli = (int)(localUtil.ctol( httpContext.cgiGet( "Z12233AlbNumcli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12195BarAlbUnd = (int)(localUtil.ctol( httpContext.cgiGet( "Z12195BarAlbUnd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12196BarPreUnd = localUtil.ctond( httpContext.cgiGet( "Z12196BarPreUnd")) ;
         Z3886AlbCliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z3886AlbCliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6645AlbMetULi = (short)(localUtil.ctol( httpContext.cgiGet( "Z6645AlbMetULi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2398BarFasExt = httpContext.cgiGet( "Z2398BarFasExt") ;
         Z1461BarAlbPN = localUtil.ctond( httpContext.cgiGet( "Z1461BarAlbPN")) ;
         Z7994AlbDto = localUtil.ctond( httpContext.cgiGet( "Z7994AlbDto")) ;
         Z7993AlbMqTj = httpContext.cgiGet( "Z7993AlbMqTj") ;
         Z7992AlbDf3 = httpContext.cgiGet( "Z7992AlbDf3") ;
         Z7991AlbDf2 = httpContext.cgiGet( "Z7991AlbDf2") ;
         Z7990AlbDf1 = httpContext.cgiGet( "Z7990AlbDf1") ;
         Z7989AlbCald = httpContext.cgiGet( "Z7989AlbCald") ;
         Z7104AlbEncA = localUtil.ctond( httpContext.cgiGet( "Z7104AlbEncA")) ;
         Z7103AlbEncL = localUtil.ctond( httpContext.cgiGet( "Z7103AlbEncL")) ;
         Z6814AlbObsM = httpContext.cgiGet( "Z6814AlbObsM") ;
         Z2761AlbBarRec = localUtil.ctond( httpContext.cgiGet( "Z2761AlbBarRec")) ;
         Z5354AlbImpMan = localUtil.ctond( httpContext.cgiGet( "Z5354AlbImpMan")) ;
         Z4815AlbEncCli = httpContext.cgiGet( "Z4815AlbEncCli") ;
         Z3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3394AlbTipCol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1458BarAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( "Z1458BarAlbBul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z40AlbProRec = localUtil.ctond( httpContext.cgiGet( "Z40AlbProRec")) ;
         Z32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z32AlbProEsp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( "Z1248GuiFasULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( "Z2763AlbHdrUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z12905AlbCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( "Z12905AlbCadEnc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5051TipAcaCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z5051TipAcaCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1206TubCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3153CodCod = httpContext.cgiGet( "Z3153CodCod") ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A898BarPieNDes = (int)(localUtil.ctol( httpContext.cgiGet( "BARPIENDES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A199BarPie1 = (short)(localUtil.ctol( httpContext.cgiGet( "BARPIE1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbProCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A30AlbProCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         }
         else
         {
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         }
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
         A3391AlbSer = httpContext.cgiGet( edtAlbSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
         A8879AlbSerD = httpContext.cgiGet( edtAlbSerD_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
         A3392AlbColNom = httpContext.cgiGet( edtAlbColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
         A12232AlbNomCli = httpContext.cgiGet( edtAlbNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCOLNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbColNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3393AlbColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
         }
         else
         {
            A3393AlbColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
         }
         A3153CodCod = httpContext.cgiGet( edtCodCod_Internalname) ;
         n3153CodCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", A3153CodCod);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBKGME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAlbKgmE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1261BarAlbKgmE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         }
         else
         {
            A1261BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtBarAlbKgmE_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPREKGM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPreKgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1262BarPreKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
         }
         else
         {
            A1262BarPreKgm = localUtil.ctond( httpContext.cgiGet( edtBarPreKgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRANC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbHdrAnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3271AlbHdrAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
         }
         else
         {
            A3271AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrAnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRGM2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbHdrgm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5019AlbHdrgm2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
         }
         else
         {
            A5019AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBMTRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAlbMtrE_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1263BarAlbMtrE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         }
         else
         {
            A1263BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtBarAlbMtrE_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPREMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPreMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1264BarPreMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrimstr( A1264BarPreMtr, 13, 5));
         }
         else
         {
            A1264BarPreMtr = localUtil.ctond( httpContext.cgiGet( edtBarPreMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrimstr( A1264BarPreMtr, 13, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBPIE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAlbPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1265BarAlbPie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         }
         else
         {
            A1265BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TUBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTubCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1206TubCod = (short)(0) ;
            n1206TubCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         }
         else
         {
            A1206TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTubCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1206TubCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBTUB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAlbTub_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1266BarAlbTub = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
         }
         else
         {
            A1266BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbTub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PLASCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPlasCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6466PlasCod = (short)(0) ;
            n6466PlasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
         }
         else
         {
            A6466PlasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtPlasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6466PlasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBPLAS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAlbPlas_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6467BarAlbPlas = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
         }
         else
         {
            A6467BarAlbPlas = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbPlas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
         }
         A2441AlbHdrObs = httpContext.cgiGet( edtAlbHdrObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", A2441AlbHdrObs);
         cmbAlbProVal.setValue( httpContext.cgiGet( cmbAlbProVal.getInternalname()) );
         A2839AlbProVal = httpContext.cgiGet( cmbAlbProVal.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
         A1095AlbTipEnt = GXutil.upper( httpContext.cgiGet( edtAlbTipEnt_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1095AlbTipEnt", A1095AlbTipEnt);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTIPART");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbTipArt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12234AlbTipArt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
         }
         else
         {
            A12234AlbTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
         }
         A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n217BarTipArt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbNumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBNUMCLI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbNumcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12233AlbNumcli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
         }
         else
         {
            A12233AlbNumcli = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbNumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
         }
         A1235BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtBarNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBUND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAlbUnd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12195BarAlbUnd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A12195BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12195BarAlbUnd), 6, 0));
         }
         else
         {
            A12195BarAlbUnd = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbUnd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12195BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12195BarAlbUnd), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarPreUnd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarPreUnd_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARPREUND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarPreUnd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12196BarPreUnd = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A12196BarPreUnd", GXutil.ltrimstr( A12196BarPreUnd, 13, 5));
         }
         else
         {
            A12196BarPreUnd = localUtil.ctond( httpContext.cgiGet( edtBarPreUnd_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12196BarPreUnd", GXutil.ltrimstr( A12196BarPreUnd, 13, 5));
         }
         A5034BarEstTip = httpContext.cgiGet( edtBarEstTip_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", A5034BarEstTip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCLICOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbCliCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3886AlbCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
         }
         else
         {
            A3886AlbCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbMetULi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbMetULi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBMETULI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbMetULi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6645AlbMetULi = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6645AlbMetULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6645AlbMetULi), 4, 0));
         }
         else
         {
            A6645AlbMetULi = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbMetULi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6645AlbMetULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6645AlbMetULi), 4, 0));
         }
         A2398BarFasExt = httpContext.cgiGet( edtBarFasExt_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
         A5291BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkBarTipCor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
         A5027BarGraCob = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarGraCob_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5027BarGraCob), 2, 0));
         A2010BarTipDis = GXutil.upper( httpContext.cgiGet( edtBarTipDis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtBarAlbPN_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtBarAlbPN_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBPN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAlbPN_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1461BarAlbPN = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1461BarAlbPN", GXutil.ltrimstr( A1461BarAlbPN, 9, 2));
         }
         else
         {
            A1461BarAlbPN = localUtil.ctond( httpContext.cgiGet( edtBarAlbPN_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1461BarAlbPN", GXutil.ltrimstr( A1461BarAlbPN, 9, 2));
         }
         A4937BarCtrPdas = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCtrPdas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n4937BarCtrPdas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.str( A4937BarCtrPdas, 1, 0));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbDto_Internalname)), DecimalUtil.stringToDec("99.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBDTO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbDto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7994AlbDto = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A7994AlbDto", GXutil.ltrimstr( A7994AlbDto, 6, 3));
         }
         else
         {
            A7994AlbDto = localUtil.ctond( httpContext.cgiGet( edtAlbDto_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7994AlbDto", GXutil.ltrimstr( A7994AlbDto, 6, 3));
         }
         A7993AlbMqTj = httpContext.cgiGet( edtAlbMqTj_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7993AlbMqTj", A7993AlbMqTj);
         A7992AlbDf3 = httpContext.cgiGet( edtAlbDf3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7992AlbDf3", A7992AlbDf3);
         A7991AlbDf2 = httpContext.cgiGet( edtAlbDf2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7991AlbDf2", A7991AlbDf2);
         A7990AlbDf1 = httpContext.cgiGet( edtAlbDf1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7990AlbDf1", A7990AlbDf1);
         A7989AlbCald = httpContext.cgiGet( edtAlbCald_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7989AlbCald", A7989AlbCald);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbEncA_Internalname)), DecimalUtil.stringToDec("-999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbEncA_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBENCA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbEncA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7104AlbEncA = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A7104AlbEncA", GXutil.ltrimstr( A7104AlbEncA, 7, 2));
         }
         else
         {
            A7104AlbEncA = localUtil.ctond( httpContext.cgiGet( edtAlbEncA_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7104AlbEncA", GXutil.ltrimstr( A7104AlbEncA, 7, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbEncL_Internalname)), DecimalUtil.stringToDec("-999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbEncL_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBENCL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbEncL_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7103AlbEncL = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A7103AlbEncL", GXutil.ltrimstr( A7103AlbEncL, 7, 2));
         }
         else
         {
            A7103AlbEncL = localUtil.ctond( httpContext.cgiGet( edtAlbEncL_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7103AlbEncL", GXutil.ltrimstr( A7103AlbEncL, 7, 2));
         }
         A6814AlbObsM = httpContext.cgiGet( edtAlbObsM_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6814AlbObsM", A6814AlbObsM);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbBarRec_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbBarRec_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBBARREC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbBarRec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2761AlbBarRec = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A2761AlbBarRec", GXutil.ltrimstr( A2761AlbBarRec, 6, 2));
         }
         else
         {
            A2761AlbBarRec = localUtil.ctond( httpContext.cgiGet( edtAlbBarRec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2761AlbBarRec", GXutil.ltrimstr( A2761AlbBarRec, 6, 2));
         }
         A5253BarAcc = ((GXutil.strcmp(httpContext.cgiGet( chkBarAcc.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbImpMan_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbImpMan_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBIMPMAN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbImpMan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5354AlbImpMan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5354AlbImpMan", GXutil.ltrimstr( A5354AlbImpMan, 11, 2));
         }
         else
         {
            A5354AlbImpMan = localUtil.ctond( httpContext.cgiGet( edtAlbImpMan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5354AlbImpMan", GXutil.ltrimstr( A5354AlbImpMan, 11, 2));
         }
         cmbBarEstReo.setValue( httpContext.cgiGet( cmbBarEstReo.getInternalname()) );
         A148BarEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbBarEstReo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
         A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A1909BarGraAca = (short)(localUtil.ctol( httpContext.cgiGet( edtBarGraAca_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A4815AlbEncCli = httpContext.cgiGet( edtAlbEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
         A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A218BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBTIPCOL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbTipCol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3394AlbTipCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
         }
         else
         {
            A3394AlbTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
         }
         A1503BarPart = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1503BarPart), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbBul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarAlbBul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARALBBUL");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarAlbBul_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1458BarAlbBul = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1458BarAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1458BarAlbBul), 4, 0));
         }
         else
         {
            A1458BarAlbBul = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAlbBul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1458BarAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1458BarAlbBul), 4, 0));
         }
         A365DisDes = ((GXutil.strcmp(httpContext.cgiGet( chkDisDes.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)), DecimalUtil.stringToDec("9999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROREC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbProRec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A40AlbProRec = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrimstr( A40AlbProRec, 13, 5));
         }
         else
         {
            A40AlbProRec = localUtil.ctond( httpContext.cgiGet( edtAlbProRec_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrimstr( A40AlbProRec, 13, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROESP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbProEsp_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A32AlbProEsp = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32AlbProEsp), 2, 0));
         }
         else
         {
            A32AlbProEsp = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEsp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32AlbProEsp), 2, 0));
         }
         A1279BarKla = localUtil.ctond( httpContext.cgiGet( edtBarKla_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A1280BarMla = localUtil.ctond( httpContext.cgiGet( edtBarMla_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1292BarPlz = (short)(localUtil.ctol( httpContext.cgiGet( edtBarPlz_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
         A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         A161BarFecSal = localUtil.ctod( httpContext.cgiGet( edtBarFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
         A125BarAncAca1 = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAncAca1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGuiFasULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "GUIFASULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtGuiFasULin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1248GuiFasULin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         }
         else
         {
            A1248GuiFasULin = (short)(localUtil.ctol( httpContext.cgiGet( edtGuiFasULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbHdrUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBHDRULIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbHdrUlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2763AlbHdrUlin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         }
         else
         {
            A2763AlbHdrUlin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbHdrUlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         }
         A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbCadEnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbCadEnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBCADENC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtAlbCadEnc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A12905AlbCadEnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12905AlbCadEnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12905AlbCadEnc), 4, 0));
         }
         else
         {
            A12905AlbCadEnc = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbCadEnc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12905AlbCadEnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12905AlbCadEnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipAcaCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipAcaCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPACACOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipAcaCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5051TipAcaCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5051TipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5051TipAcaCod), 4, 0));
         }
         else
         {
            A5051TipAcaCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipAcaCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5051TipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5051TipAcaCod), 4, 0));
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
            A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
            initAll1Q6195( ) ;
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
      disableAttributes1Q6195( ) ;
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

   public void resetCaption1Q60( )
   {
   }

   public void zm1Q6195( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3391AlbSer = T01Q63_A3391AlbSer[0] ;
            Z8879AlbSerD = T01Q63_A8879AlbSerD[0] ;
            Z3392AlbColNom = T01Q63_A3392AlbColNom[0] ;
            Z12232AlbNomCli = T01Q63_A12232AlbNomCli[0] ;
            Z3393AlbColNum = T01Q63_A3393AlbColNum[0] ;
            Z1261BarAlbKgmE = T01Q63_A1261BarAlbKgmE[0] ;
            Z1262BarPreKgm = T01Q63_A1262BarPreKgm[0] ;
            Z3271AlbHdrAnc = T01Q63_A3271AlbHdrAnc[0] ;
            Z5019AlbHdrgm2 = T01Q63_A5019AlbHdrgm2[0] ;
            Z1263BarAlbMtrE = T01Q63_A1263BarAlbMtrE[0] ;
            Z1264BarPreMtr = T01Q63_A1264BarPreMtr[0] ;
            Z1265BarAlbPie = T01Q63_A1265BarAlbPie[0] ;
            Z1266BarAlbTub = T01Q63_A1266BarAlbTub[0] ;
            Z6466PlasCod = T01Q63_A6466PlasCod[0] ;
            Z6467BarAlbPlas = T01Q63_A6467BarAlbPlas[0] ;
            Z2441AlbHdrObs = T01Q63_A2441AlbHdrObs[0] ;
            Z2839AlbProVal = T01Q63_A2839AlbProVal[0] ;
            Z1095AlbTipEnt = T01Q63_A1095AlbTipEnt[0] ;
            Z12234AlbTipArt = T01Q63_A12234AlbTipArt[0] ;
            Z12233AlbNumcli = T01Q63_A12233AlbNumcli[0] ;
            Z12195BarAlbUnd = T01Q63_A12195BarAlbUnd[0] ;
            Z12196BarPreUnd = T01Q63_A12196BarPreUnd[0] ;
            Z3886AlbCliCod = T01Q63_A3886AlbCliCod[0] ;
            Z6645AlbMetULi = T01Q63_A6645AlbMetULi[0] ;
            Z2398BarFasExt = T01Q63_A2398BarFasExt[0] ;
            Z1461BarAlbPN = T01Q63_A1461BarAlbPN[0] ;
            Z7994AlbDto = T01Q63_A7994AlbDto[0] ;
            Z7993AlbMqTj = T01Q63_A7993AlbMqTj[0] ;
            Z7992AlbDf3 = T01Q63_A7992AlbDf3[0] ;
            Z7991AlbDf2 = T01Q63_A7991AlbDf2[0] ;
            Z7990AlbDf1 = T01Q63_A7990AlbDf1[0] ;
            Z7989AlbCald = T01Q63_A7989AlbCald[0] ;
            Z7104AlbEncA = T01Q63_A7104AlbEncA[0] ;
            Z7103AlbEncL = T01Q63_A7103AlbEncL[0] ;
            Z6814AlbObsM = T01Q63_A6814AlbObsM[0] ;
            Z2761AlbBarRec = T01Q63_A2761AlbBarRec[0] ;
            Z5354AlbImpMan = T01Q63_A5354AlbImpMan[0] ;
            Z4815AlbEncCli = T01Q63_A4815AlbEncCli[0] ;
            Z3394AlbTipCol = T01Q63_A3394AlbTipCol[0] ;
            Z1458BarAlbBul = T01Q63_A1458BarAlbBul[0] ;
            Z40AlbProRec = T01Q63_A40AlbProRec[0] ;
            Z32AlbProEsp = T01Q63_A32AlbProEsp[0] ;
            Z1248GuiFasULin = T01Q63_A1248GuiFasULin[0] ;
            Z2763AlbHdrUlin = T01Q63_A2763AlbHdrUlin[0] ;
            Z12905AlbCadEnc = T01Q63_A12905AlbCadEnc[0] ;
            Z5051TipAcaCod = T01Q63_A5051TipAcaCod[0] ;
            Z1206TubCod = T01Q63_A1206TubCod[0] ;
            Z3153CodCod = T01Q63_A3153CodCod[0] ;
         }
         else
         {
            Z3391AlbSer = A3391AlbSer ;
            Z8879AlbSerD = A8879AlbSerD ;
            Z3392AlbColNom = A3392AlbColNom ;
            Z12232AlbNomCli = A12232AlbNomCli ;
            Z3393AlbColNum = A3393AlbColNum ;
            Z1261BarAlbKgmE = A1261BarAlbKgmE ;
            Z1262BarPreKgm = A1262BarPreKgm ;
            Z3271AlbHdrAnc = A3271AlbHdrAnc ;
            Z5019AlbHdrgm2 = A5019AlbHdrgm2 ;
            Z1263BarAlbMtrE = A1263BarAlbMtrE ;
            Z1264BarPreMtr = A1264BarPreMtr ;
            Z1265BarAlbPie = A1265BarAlbPie ;
            Z1266BarAlbTub = A1266BarAlbTub ;
            Z6466PlasCod = A6466PlasCod ;
            Z6467BarAlbPlas = A6467BarAlbPlas ;
            Z2441AlbHdrObs = A2441AlbHdrObs ;
            Z2839AlbProVal = A2839AlbProVal ;
            Z1095AlbTipEnt = A1095AlbTipEnt ;
            Z12234AlbTipArt = A12234AlbTipArt ;
            Z12233AlbNumcli = A12233AlbNumcli ;
            Z12195BarAlbUnd = A12195BarAlbUnd ;
            Z12196BarPreUnd = A12196BarPreUnd ;
            Z3886AlbCliCod = A3886AlbCliCod ;
            Z6645AlbMetULi = A6645AlbMetULi ;
            Z2398BarFasExt = A2398BarFasExt ;
            Z1461BarAlbPN = A1461BarAlbPN ;
            Z7994AlbDto = A7994AlbDto ;
            Z7993AlbMqTj = A7993AlbMqTj ;
            Z7992AlbDf3 = A7992AlbDf3 ;
            Z7991AlbDf2 = A7991AlbDf2 ;
            Z7990AlbDf1 = A7990AlbDf1 ;
            Z7989AlbCald = A7989AlbCald ;
            Z7104AlbEncA = A7104AlbEncA ;
            Z7103AlbEncL = A7103AlbEncL ;
            Z6814AlbObsM = A6814AlbObsM ;
            Z2761AlbBarRec = A2761AlbBarRec ;
            Z5354AlbImpMan = A5354AlbImpMan ;
            Z4815AlbEncCli = A4815AlbEncCli ;
            Z3394AlbTipCol = A3394AlbTipCol ;
            Z1458BarAlbBul = A1458BarAlbBul ;
            Z40AlbProRec = A40AlbProRec ;
            Z32AlbProEsp = A32AlbProEsp ;
            Z1248GuiFasULin = A1248GuiFasULin ;
            Z2763AlbHdrUlin = A2763AlbHdrUlin ;
            Z12905AlbCadEnc = A12905AlbCadEnc ;
            Z5051TipAcaCod = A5051TipAcaCod ;
            Z1206TubCod = A1206TubCod ;
            Z3153CodCod = A3153CodCod ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z3391AlbSer = A3391AlbSer ;
         Z8879AlbSerD = A8879AlbSerD ;
         Z3392AlbColNom = A3392AlbColNom ;
         Z12232AlbNomCli = A12232AlbNomCli ;
         Z3393AlbColNum = A3393AlbColNum ;
         Z1261BarAlbKgmE = A1261BarAlbKgmE ;
         Z1262BarPreKgm = A1262BarPreKgm ;
         Z3271AlbHdrAnc = A3271AlbHdrAnc ;
         Z5019AlbHdrgm2 = A5019AlbHdrgm2 ;
         Z1263BarAlbMtrE = A1263BarAlbMtrE ;
         Z1264BarPreMtr = A1264BarPreMtr ;
         Z1265BarAlbPie = A1265BarAlbPie ;
         Z1266BarAlbTub = A1266BarAlbTub ;
         Z6466PlasCod = A6466PlasCod ;
         Z6467BarAlbPlas = A6467BarAlbPlas ;
         Z2441AlbHdrObs = A2441AlbHdrObs ;
         Z2839AlbProVal = A2839AlbProVal ;
         Z1095AlbTipEnt = A1095AlbTipEnt ;
         Z12234AlbTipArt = A12234AlbTipArt ;
         Z12233AlbNumcli = A12233AlbNumcli ;
         Z12195BarAlbUnd = A12195BarAlbUnd ;
         Z12196BarPreUnd = A12196BarPreUnd ;
         Z3886AlbCliCod = A3886AlbCliCod ;
         Z6645AlbMetULi = A6645AlbMetULi ;
         Z2398BarFasExt = A2398BarFasExt ;
         Z1461BarAlbPN = A1461BarAlbPN ;
         Z7994AlbDto = A7994AlbDto ;
         Z7993AlbMqTj = A7993AlbMqTj ;
         Z7992AlbDf3 = A7992AlbDf3 ;
         Z7991AlbDf2 = A7991AlbDf2 ;
         Z7990AlbDf1 = A7990AlbDf1 ;
         Z7989AlbCald = A7989AlbCald ;
         Z7104AlbEncA = A7104AlbEncA ;
         Z7103AlbEncL = A7103AlbEncL ;
         Z6814AlbObsM = A6814AlbObsM ;
         Z2761AlbBarRec = A2761AlbBarRec ;
         Z5354AlbImpMan = A5354AlbImpMan ;
         Z4815AlbEncCli = A4815AlbEncCli ;
         Z3394AlbTipCol = A3394AlbTipCol ;
         Z1458BarAlbBul = A1458BarAlbBul ;
         Z40AlbProRec = A40AlbProRec ;
         Z32AlbProEsp = A32AlbProEsp ;
         Z1248GuiFasULin = A1248GuiFasULin ;
         Z2763AlbHdrUlin = A2763AlbHdrUlin ;
         Z12905AlbCadEnc = A12905AlbCadEnc ;
         Z5051TipAcaCod = A5051TipAcaCod ;
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z1206TubCod = A1206TubCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z3153CodCod = A3153CodCod ;
         Z361DisCod = A361DisCod ;
         Z1235BarNumCli = A1235BarNumCli ;
         Z1234BarNomCli = A1234BarNomCli ;
         Z5034BarEstTip = A5034BarEstTip ;
         Z5291BarTipCor = A5291BarTipCor ;
         Z5027BarGraCob = A5027BarGraCob ;
         Z2010BarTipDis = A2010BarTipDis ;
         Z4937BarCtrPdas = A4937BarCtrPdas ;
         Z5253BarAcc = A5253BarAcc ;
         Z148BarEstReo = A148BarEstReo ;
         Z143BarDisNum = A143BarDisNum ;
         Z1909BarGraAca = A1909BarGraAca ;
         Z4812BarEncCli = A4812BarEncCli ;
         Z1652BarSerDsc = A1652BarSerDsc ;
         Z218BarTipCol = A218BarTipCol ;
         Z136BarColNum = A136BarColNum ;
         Z135BarColNom = A135BarColNom ;
         Z1503BarPart = A1503BarPart ;
         Z161BarFecSal = A161BarFecSal ;
         Z125BarAncAca1 = A125BarAncAca1 ;
         Z213BarSit = A213BarSit ;
         Z212BarSer = A212BarSer ;
         Z4466BarAcaAnh = A4466BarAcaAnh ;
         Z252CliCod = A252CliCod ;
         Z217BarTipArt = A217BarTipArt ;
         Z365DisDes = A365DisDes ;
         Z1279BarKla = A1279BarKla ;
         Z1280BarMla = A1280BarMla ;
         Z1292BarPlz = A1292BarPlz ;
         Z898BarPieNDes = A898BarPieNDes ;
         Z199BarPie1 = A199BarPie1 ;
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

   public void load1Q6195( )
   {
      /* Using cursor T01Q615 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A361DisCod = T01Q615_A361DisCod[0] ;
         A3391AlbSer = T01Q615_A3391AlbSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
         A8879AlbSerD = T01Q615_A8879AlbSerD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
         A3392AlbColNom = T01Q615_A3392AlbColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
         A12232AlbNomCli = T01Q615_A12232AlbNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
         A3393AlbColNum = T01Q615_A3393AlbColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
         A1261BarAlbKgmE = T01Q615_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1262BarPreKgm = T01Q615_A1262BarPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
         A3271AlbHdrAnc = T01Q615_A3271AlbHdrAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
         A5019AlbHdrgm2 = T01Q615_A5019AlbHdrgm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
         A1263BarAlbMtrE = T01Q615_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A1264BarPreMtr = T01Q615_A1264BarPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrimstr( A1264BarPreMtr, 13, 5));
         A1265BarAlbPie = T01Q615_A1265BarAlbPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         A1266BarAlbTub = T01Q615_A1266BarAlbTub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
         A6466PlasCod = T01Q615_A6466PlasCod[0] ;
         n6466PlasCod = T01Q615_n6466PlasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
         A6467BarAlbPlas = T01Q615_A6467BarAlbPlas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
         A2441AlbHdrObs = T01Q615_A2441AlbHdrObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", A2441AlbHdrObs);
         A2839AlbProVal = T01Q615_A2839AlbProVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
         A1095AlbTipEnt = T01Q615_A1095AlbTipEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1095AlbTipEnt", A1095AlbTipEnt);
         A12234AlbTipArt = T01Q615_A12234AlbTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
         A12233AlbNumcli = T01Q615_A12233AlbNumcli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
         A1235BarNumCli = T01Q615_A1235BarNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         A1234BarNomCli = T01Q615_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A12195BarAlbUnd = T01Q615_A12195BarAlbUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12195BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12195BarAlbUnd), 6, 0));
         A12196BarPreUnd = T01Q615_A12196BarPreUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12196BarPreUnd", GXutil.ltrimstr( A12196BarPreUnd, 13, 5));
         A5034BarEstTip = T01Q615_A5034BarEstTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", A5034BarEstTip);
         A3886AlbCliCod = T01Q615_A3886AlbCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
         A6645AlbMetULi = T01Q615_A6645AlbMetULi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6645AlbMetULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6645AlbMetULi), 4, 0));
         A2398BarFasExt = T01Q615_A2398BarFasExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
         A5291BarTipCor = T01Q615_A5291BarTipCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
         A5027BarGraCob = T01Q615_A5027BarGraCob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5027BarGraCob), 2, 0));
         A2010BarTipDis = T01Q615_A2010BarTipDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
         A1461BarAlbPN = T01Q615_A1461BarAlbPN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1461BarAlbPN", GXutil.ltrimstr( A1461BarAlbPN, 9, 2));
         A4937BarCtrPdas = T01Q615_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = T01Q615_n4937BarCtrPdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.str( A4937BarCtrPdas, 1, 0));
         A7994AlbDto = T01Q615_A7994AlbDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7994AlbDto", GXutil.ltrimstr( A7994AlbDto, 6, 3));
         A7993AlbMqTj = T01Q615_A7993AlbMqTj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7993AlbMqTj", A7993AlbMqTj);
         A7992AlbDf3 = T01Q615_A7992AlbDf3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7992AlbDf3", A7992AlbDf3);
         A7991AlbDf2 = T01Q615_A7991AlbDf2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7991AlbDf2", A7991AlbDf2);
         A7990AlbDf1 = T01Q615_A7990AlbDf1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7990AlbDf1", A7990AlbDf1);
         A7989AlbCald = T01Q615_A7989AlbCald[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7989AlbCald", A7989AlbCald);
         A7104AlbEncA = T01Q615_A7104AlbEncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7104AlbEncA", GXutil.ltrimstr( A7104AlbEncA, 7, 2));
         A7103AlbEncL = T01Q615_A7103AlbEncL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7103AlbEncL", GXutil.ltrimstr( A7103AlbEncL, 7, 2));
         A6814AlbObsM = T01Q615_A6814AlbObsM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6814AlbObsM", A6814AlbObsM);
         A2761AlbBarRec = T01Q615_A2761AlbBarRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2761AlbBarRec", GXutil.ltrimstr( A2761AlbBarRec, 6, 2));
         A5253BarAcc = T01Q615_A5253BarAcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
         A5354AlbImpMan = T01Q615_A5354AlbImpMan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5354AlbImpMan", GXutil.ltrimstr( A5354AlbImpMan, 11, 2));
         A148BarEstReo = T01Q615_A148BarEstReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
         A143BarDisNum = T01Q615_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A1909BarGraAca = T01Q615_A1909BarGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A4815AlbEncCli = T01Q615_A4815AlbEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
         A4812BarEncCli = T01Q615_A4812BarEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A1652BarSerDsc = T01Q615_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A218BarTipCol = T01Q615_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A136BarColNum = T01Q615_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A135BarColNom = T01Q615_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A3394AlbTipCol = T01Q615_A3394AlbTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
         A1503BarPart = T01Q615_A1503BarPart[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1503BarPart), 4, 0));
         A1458BarAlbBul = T01Q615_A1458BarAlbBul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1458BarAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1458BarAlbBul), 4, 0));
         A365DisDes = T01Q615_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         A40AlbProRec = T01Q615_A40AlbProRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrimstr( A40AlbProRec, 13, 5));
         A32AlbProEsp = T01Q615_A32AlbProEsp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32AlbProEsp), 2, 0));
         A161BarFecSal = T01Q615_A161BarFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
         A125BarAncAca1 = T01Q615_A125BarAncAca1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A213BarSit = T01Q615_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A212BarSer = T01Q615_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1248GuiFasULin = T01Q615_A1248GuiFasULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         A2763AlbHdrUlin = T01Q615_A2763AlbHdrUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         A4466BarAcaAnh = T01Q615_A4466BarAcaAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         A12905AlbCadEnc = T01Q615_A12905AlbCadEnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12905AlbCadEnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12905AlbCadEnc), 4, 0));
         A5051TipAcaCod = T01Q615_A5051TipAcaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5051TipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5051TipAcaCod), 4, 0));
         A1206TubCod = T01Q615_A1206TubCod[0] ;
         n1206TubCod = T01Q615_n1206TubCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         A3153CodCod = T01Q615_A3153CodCod[0] ;
         n3153CodCod = T01Q615_n3153CodCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", A3153CodCod);
         A252CliCod = T01Q615_A252CliCod[0] ;
         n252CliCod = T01Q615_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A217BarTipArt = T01Q615_A217BarTipArt[0] ;
         n217BarTipArt = T01Q615_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         A1279BarKla = T01Q615_A1279BarKla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A1280BarMla = T01Q615_A1280BarMla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1292BarPlz = T01Q615_A1292BarPlz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
         A898BarPieNDes = T01Q615_A898BarPieNDes[0] ;
         A199BarPie1 = T01Q615_A199BarPie1[0] ;
         zm1Q6195( -2) ;
      }
      pr_default.close(9);
      onLoadActions1Q6195( ) ;
   }

   public void onLoadActions1Q6195( )
   {
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
   }

   public void checkExtendedTable1Q6195( )
   {
      nIsDirty_195 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01Q65 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TUBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(3);
      /* Using cursor T01Q67 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3153CodCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(5);
      /* Using cursor T01Q66 */
      pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(4);
      /* Using cursor T01Q64 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01Q64_A361DisCod[0] ;
      A1235BarNumCli = T01Q64_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A1234BarNomCli = T01Q64_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A5034BarEstTip = T01Q64_A5034BarEstTip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", A5034BarEstTip);
      A5291BarTipCor = T01Q64_A5291BarTipCor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      A5027BarGraCob = T01Q64_A5027BarGraCob[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5027BarGraCob), 2, 0));
      A2010BarTipDis = T01Q64_A2010BarTipDis[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
      A4937BarCtrPdas = T01Q64_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01Q64_n4937BarCtrPdas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.str( A4937BarCtrPdas, 1, 0));
      A5253BarAcc = T01Q64_A5253BarAcc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
      A148BarEstReo = T01Q64_A148BarEstReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      A143BarDisNum = T01Q64_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A1909BarGraAca = T01Q64_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A4812BarEncCli = T01Q64_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A1652BarSerDsc = T01Q64_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A218BarTipCol = T01Q64_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A136BarColNum = T01Q64_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A135BarColNom = T01Q64_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A1503BarPart = T01Q64_A1503BarPart[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1503BarPart), 4, 0));
      A161BarFecSal = T01Q64_A161BarFecSal[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
      A125BarAncAca1 = T01Q64_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A213BarSit = T01Q64_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A212BarSer = T01Q64_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A4466BarAcaAnh = T01Q64_A4466BarAcaAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A252CliCod = T01Q64_A252CliCod[0] ;
      n252CliCod = T01Q64_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A217BarTipArt = T01Q64_A217BarTipArt[0] ;
      n217BarTipArt = T01Q64_n217BarTipArt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      pr_default.close(2);
      /* Using cursor T01Q68 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A365DisDes = T01Q68_A365DisDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      pr_default.close(6);
      /* Using cursor T01Q610 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A1279BarKla = T01Q610_A1279BarKla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A1280BarMla = T01Q610_A1280BarMla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1292BarPlz = T01Q610_A1292BarPlz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         nIsDirty_195 = (short)(1) ;
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         nIsDirty_195 = (short)(1) ;
         A1292BarPlz = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      }
      pr_default.close(7);
      /* Using cursor T01Q612 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A898BarPieNDes = T01Q612_A898BarPieNDes[0] ;
         A199BarPie1 = T01Q612_A199BarPie1[0] ;
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         nIsDirty_195 = (short)(1) ;
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(8);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         nIsDirty_195 = (short)(1) ;
         A198BarPie = A898BarPieNDes ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
      else
      {
         nIsDirty_195 = (short)(1) ;
         A198BarPie = A199BarPie1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      }
   }

   public void closeExtendedTableCursors1Q6195( )
   {
      pr_default.close(3);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_4( String A396EmprCod ,
                         short A1206TubCod )
   {
      /* Using cursor T01Q616 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TUBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
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

   public void gxload_6( String A396EmprCod ,
                         String A3153CodCod )
   {
      /* Using cursor T01Q617 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3153CodCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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
                         long A30AlbProCod )
   {
      /* Using cursor T01Q618 */
      pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_3( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01Q619 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01Q619_A361DisCod[0] ;
      A1235BarNumCli = T01Q619_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A1234BarNomCli = T01Q619_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A5034BarEstTip = T01Q619_A5034BarEstTip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", A5034BarEstTip);
      A5291BarTipCor = T01Q619_A5291BarTipCor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      A5027BarGraCob = T01Q619_A5027BarGraCob[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5027BarGraCob), 2, 0));
      A2010BarTipDis = T01Q619_A2010BarTipDis[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
      A4937BarCtrPdas = T01Q619_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01Q619_n4937BarCtrPdas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.str( A4937BarCtrPdas, 1, 0));
      A5253BarAcc = T01Q619_A5253BarAcc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
      A148BarEstReo = T01Q619_A148BarEstReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      A143BarDisNum = T01Q619_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A1909BarGraAca = T01Q619_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A4812BarEncCli = T01Q619_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A1652BarSerDsc = T01Q619_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A218BarTipCol = T01Q619_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A136BarColNum = T01Q619_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A135BarColNom = T01Q619_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A1503BarPart = T01Q619_A1503BarPart[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1503BarPart), 4, 0));
      A161BarFecSal = T01Q619_A161BarFecSal[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
      A125BarAncAca1 = T01Q619_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A213BarSit = T01Q619_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A212BarSer = T01Q619_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A4466BarAcaAnh = T01Q619_A4466BarAcaAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A252CliCod = T01Q619_A252CliCod[0] ;
      n252CliCod = T01Q619_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A217BarTipArt = T01Q619_A217BarTipArt[0] ;
      n217BarTipArt = T01Q619_n217BarTipArt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1234BarNomCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5034BarEstTip))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5291BarTipCor))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2010BarTipDis))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5253BarAcc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A143BarDisNum))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4812BarEncCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1652BarSerDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A135BarColNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( localUtil.format(A161BarFecSal, "99/99/99"))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A212BarSer))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
                         int A361DisCod )
   {
      /* Using cursor T01Q620 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A365DisDes = T01Q620_A365DisDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A365DisDes))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_8( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01Q622 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A1279BarKla = T01Q622_A1279BarKla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A1280BarMla = T01Q622_A1280BarMla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1292BarPlz = T01Q622_A1292BarPlz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      }
      else
      {
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1292BarPlz = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_9( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar )
   {
      /* Using cursor T01Q624 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(16) != 101) )
      {
         A898BarPieNDes = T01Q624_A898BarPieNDes[0] ;
         A199BarPie1 = T01Q624_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKey1Q6195( )
   {
      /* Using cursor T01Q625 */
      pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound195 = (short)(1) ;
      }
      else
      {
         RcdFound195 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01Q63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1Q6195( 2) ;
         RcdFound195 = (short)(1) ;
         A3391AlbSer = T01Q63_A3391AlbSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
         A8879AlbSerD = T01Q63_A8879AlbSerD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
         A3392AlbColNom = T01Q63_A3392AlbColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
         A12232AlbNomCli = T01Q63_A12232AlbNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
         A3393AlbColNum = T01Q63_A3393AlbColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
         A1261BarAlbKgmE = T01Q63_A1261BarAlbKgmE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
         A1262BarPreKgm = T01Q63_A1262BarPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
         A3271AlbHdrAnc = T01Q63_A3271AlbHdrAnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
         A5019AlbHdrgm2 = T01Q63_A5019AlbHdrgm2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
         A1263BarAlbMtrE = T01Q63_A1263BarAlbMtrE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
         A1264BarPreMtr = T01Q63_A1264BarPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrimstr( A1264BarPreMtr, 13, 5));
         A1265BarAlbPie = T01Q63_A1265BarAlbPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
         A1266BarAlbTub = T01Q63_A1266BarAlbTub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
         A6466PlasCod = T01Q63_A6466PlasCod[0] ;
         n6466PlasCod = T01Q63_n6466PlasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
         A6467BarAlbPlas = T01Q63_A6467BarAlbPlas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
         A2441AlbHdrObs = T01Q63_A2441AlbHdrObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", A2441AlbHdrObs);
         A2839AlbProVal = T01Q63_A2839AlbProVal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
         A1095AlbTipEnt = T01Q63_A1095AlbTipEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1095AlbTipEnt", A1095AlbTipEnt);
         A12234AlbTipArt = T01Q63_A12234AlbTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
         A12233AlbNumcli = T01Q63_A12233AlbNumcli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
         A12195BarAlbUnd = T01Q63_A12195BarAlbUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12195BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12195BarAlbUnd), 6, 0));
         A12196BarPreUnd = T01Q63_A12196BarPreUnd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12196BarPreUnd", GXutil.ltrimstr( A12196BarPreUnd, 13, 5));
         A3886AlbCliCod = T01Q63_A3886AlbCliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
         A6645AlbMetULi = T01Q63_A6645AlbMetULi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6645AlbMetULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6645AlbMetULi), 4, 0));
         A2398BarFasExt = T01Q63_A2398BarFasExt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
         A1461BarAlbPN = T01Q63_A1461BarAlbPN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1461BarAlbPN", GXutil.ltrimstr( A1461BarAlbPN, 9, 2));
         A7994AlbDto = T01Q63_A7994AlbDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7994AlbDto", GXutil.ltrimstr( A7994AlbDto, 6, 3));
         A7993AlbMqTj = T01Q63_A7993AlbMqTj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7993AlbMqTj", A7993AlbMqTj);
         A7992AlbDf3 = T01Q63_A7992AlbDf3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7992AlbDf3", A7992AlbDf3);
         A7991AlbDf2 = T01Q63_A7991AlbDf2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7991AlbDf2", A7991AlbDf2);
         A7990AlbDf1 = T01Q63_A7990AlbDf1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7990AlbDf1", A7990AlbDf1);
         A7989AlbCald = T01Q63_A7989AlbCald[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7989AlbCald", A7989AlbCald);
         A7104AlbEncA = T01Q63_A7104AlbEncA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7104AlbEncA", GXutil.ltrimstr( A7104AlbEncA, 7, 2));
         A7103AlbEncL = T01Q63_A7103AlbEncL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7103AlbEncL", GXutil.ltrimstr( A7103AlbEncL, 7, 2));
         A6814AlbObsM = T01Q63_A6814AlbObsM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6814AlbObsM", A6814AlbObsM);
         A2761AlbBarRec = T01Q63_A2761AlbBarRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2761AlbBarRec", GXutil.ltrimstr( A2761AlbBarRec, 6, 2));
         A5354AlbImpMan = T01Q63_A5354AlbImpMan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5354AlbImpMan", GXutil.ltrimstr( A5354AlbImpMan, 11, 2));
         A4815AlbEncCli = T01Q63_A4815AlbEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
         A3394AlbTipCol = T01Q63_A3394AlbTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
         A1458BarAlbBul = T01Q63_A1458BarAlbBul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1458BarAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1458BarAlbBul), 4, 0));
         A40AlbProRec = T01Q63_A40AlbProRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrimstr( A40AlbProRec, 13, 5));
         A32AlbProEsp = T01Q63_A32AlbProEsp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32AlbProEsp), 2, 0));
         A1248GuiFasULin = T01Q63_A1248GuiFasULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
         A2763AlbHdrUlin = T01Q63_A2763AlbHdrUlin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
         A12905AlbCadEnc = T01Q63_A12905AlbCadEnc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12905AlbCadEnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12905AlbCadEnc), 4, 0));
         A5051TipAcaCod = T01Q63_A5051TipAcaCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5051TipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5051TipAcaCod), 4, 0));
         A396EmprCod = T01Q63_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01Q63_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01Q63_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01Q63_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A1206TubCod = T01Q63_A1206TubCod[0] ;
         n1206TubCod = T01Q63_n1206TubCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
         A30AlbProCod = T01Q63_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A3153CodCod = T01Q63_A3153CodCod[0] ;
         n3153CodCod = T01Q63_n3153CodCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", A3153CodCod);
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1Q6195( ) ;
         if ( AnyError == 1 )
         {
            RcdFound195 = (short)(0) ;
            initializeNonKey1Q6195( ) ;
         }
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound195 = (short)(0) ;
         initializeNonKey1Q6195( ) ;
         sMode195 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode195 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1Q6195( ) ;
      if ( RcdFound195 == 0 )
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
      RcdFound195 = (short)(0) ;
      /* Using cursor T01Q626 */
      pr_default.execute(18, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         while ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q626_A129BarCod[0] < A129BarCod ) || ( T01Q626_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q626_A132BarCodReo[0] < A132BarCodReo ) || ( T01Q626_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q626_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q626_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01Q626_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q626_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q626_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q626_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(18);
         }
         if ( (pr_default.getStatus(18) != 101) && ( ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q626_A129BarCod[0] > A129BarCod ) || ( T01Q626_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q626_A132BarCodReo[0] > A132BarCodReo ) || ( T01Q626_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q626_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q626_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01Q626_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q626_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q626_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q626_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q626_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A396EmprCod = T01Q626_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01Q626_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01Q626_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01Q626_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01Q626_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(18);
   }

   public void move_previous( )
   {
      RcdFound195 = (short)(0) ;
      /* Using cursor T01Q627 */
      pr_default.execute(19, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q627_A129BarCod[0] > A129BarCod ) || ( T01Q627_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q627_A132BarCodReo[0] > A132BarCodReo ) || ( T01Q627_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q627_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q627_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01Q627_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q627_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q627_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q627_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q627_A129BarCod[0] < A129BarCod ) || ( T01Q627_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q627_A132BarCodReo[0] < A132BarCodReo ) || ( T01Q627_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q627_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01Q627_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01Q627_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01Q627_A132BarCodReo[0] == A132BarCodReo ) && ( T01Q627_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01Q627_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01Q627_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A396EmprCod = T01Q627_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01Q627_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01Q627_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01Q627_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A30AlbProCod = T01Q627_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound195 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1Q6195( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1Q6195( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound195 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               A129BarCod = Z129BarCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = Z132BarCodReo ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = Z130BarCodPar ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
               update1Q6195( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1Q6195( ) ;
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
                  insert1Q6195( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = Z129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = Z132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = Z130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
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
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtAlbSer_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1Q6195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbSer_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1Q6195( ) ;
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
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbSer_Internalname ;
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
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbSer_Internalname ;
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
      scanStart1Q6195( ) ;
      if ( RcdFound195 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound195 != 0 )
         {
            scanNext1Q6195( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbSer_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1Q6195( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1Q6195( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01Q62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3391AlbSer, T01Q62_A3391AlbSer[0]) != 0 ) || ( GXutil.strcmp(Z8879AlbSerD, T01Q62_A8879AlbSerD[0]) != 0 ) || ( GXutil.strcmp(Z3392AlbColNom, T01Q62_A3392AlbColNom[0]) != 0 ) || ( GXutil.strcmp(Z12232AlbNomCli, T01Q62_A12232AlbNomCli[0]) != 0 ) || ( Z3393AlbColNum != T01Q62_A3393AlbColNum[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01Q62_A1261BarAlbKgmE[0]) != 0 ) || ( DecimalUtil.compareTo(Z1262BarPreKgm, T01Q62_A1262BarPreKgm[0]) != 0 ) || ( Z3271AlbHdrAnc != T01Q62_A3271AlbHdrAnc[0] ) || ( Z5019AlbHdrgm2 != T01Q62_A5019AlbHdrgm2[0] ) || ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01Q62_A1263BarAlbMtrE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1264BarPreMtr, T01Q62_A1264BarPreMtr[0]) != 0 ) || ( Z1265BarAlbPie != T01Q62_A1265BarAlbPie[0] ) || ( Z1266BarAlbTub != T01Q62_A1266BarAlbTub[0] ) || ( Z6466PlasCod != T01Q62_A6466PlasCod[0] ) || ( Z6467BarAlbPlas != T01Q62_A6467BarAlbPlas[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2441AlbHdrObs, T01Q62_A2441AlbHdrObs[0]) != 0 ) || ( GXutil.strcmp(Z2839AlbProVal, T01Q62_A2839AlbProVal[0]) != 0 ) || ( GXutil.strcmp(Z1095AlbTipEnt, T01Q62_A1095AlbTipEnt[0]) != 0 ) || ( Z12234AlbTipArt != T01Q62_A12234AlbTipArt[0] ) || ( Z12233AlbNumcli != T01Q62_A12233AlbNumcli[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z12195BarAlbUnd != T01Q62_A12195BarAlbUnd[0] ) || ( DecimalUtil.compareTo(Z12196BarPreUnd, T01Q62_A12196BarPreUnd[0]) != 0 ) || ( Z3886AlbCliCod != T01Q62_A3886AlbCliCod[0] ) || ( Z6645AlbMetULi != T01Q62_A6645AlbMetULi[0] ) || ( GXutil.strcmp(Z2398BarFasExt, T01Q62_A2398BarFasExt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z1461BarAlbPN, T01Q62_A1461BarAlbPN[0]) != 0 ) || ( DecimalUtil.compareTo(Z7994AlbDto, T01Q62_A7994AlbDto[0]) != 0 ) || ( GXutil.strcmp(Z7993AlbMqTj, T01Q62_A7993AlbMqTj[0]) != 0 ) || ( GXutil.strcmp(Z7992AlbDf3, T01Q62_A7992AlbDf3[0]) != 0 ) || ( GXutil.strcmp(Z7991AlbDf2, T01Q62_A7991AlbDf2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7990AlbDf1, T01Q62_A7990AlbDf1[0]) != 0 ) || ( GXutil.strcmp(Z7989AlbCald, T01Q62_A7989AlbCald[0]) != 0 ) || ( DecimalUtil.compareTo(Z7104AlbEncA, T01Q62_A7104AlbEncA[0]) != 0 ) || ( DecimalUtil.compareTo(Z7103AlbEncL, T01Q62_A7103AlbEncL[0]) != 0 ) || ( GXutil.strcmp(Z6814AlbObsM, T01Q62_A6814AlbObsM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z2761AlbBarRec, T01Q62_A2761AlbBarRec[0]) != 0 ) || ( DecimalUtil.compareTo(Z5354AlbImpMan, T01Q62_A5354AlbImpMan[0]) != 0 ) || ( GXutil.strcmp(Z4815AlbEncCli, T01Q62_A4815AlbEncCli[0]) != 0 ) || ( Z3394AlbTipCol != T01Q62_A3394AlbTipCol[0] ) || ( Z1458BarAlbBul != T01Q62_A1458BarAlbBul[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z40AlbProRec, T01Q62_A40AlbProRec[0]) != 0 ) || ( Z32AlbProEsp != T01Q62_A32AlbProEsp[0] ) || ( Z1248GuiFasULin != T01Q62_A1248GuiFasULin[0] ) || ( Z2763AlbHdrUlin != T01Q62_A2763AlbHdrUlin[0] ) || ( Z12905AlbCadEnc != T01Q62_A12905AlbCadEnc[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5051TipAcaCod != T01Q62_A5051TipAcaCod[0] ) || ( Z1206TubCod != T01Q62_A1206TubCod[0] ) || ( GXutil.strcmp(Z3153CodCod, T01Q62_A3153CodCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3391AlbSer, T01Q62_A3391AlbSer[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbSer");
               GXutil.writeLogRaw("Old: ",Z3391AlbSer);
               GXutil.writeLogRaw("Current: ",T01Q62_A3391AlbSer[0]);
            }
            if ( GXutil.strcmp(Z8879AlbSerD, T01Q62_A8879AlbSerD[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbSerD");
               GXutil.writeLogRaw("Old: ",Z8879AlbSerD);
               GXutil.writeLogRaw("Current: ",T01Q62_A8879AlbSerD[0]);
            }
            if ( GXutil.strcmp(Z3392AlbColNom, T01Q62_A3392AlbColNom[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbColNom");
               GXutil.writeLogRaw("Old: ",Z3392AlbColNom);
               GXutil.writeLogRaw("Current: ",T01Q62_A3392AlbColNom[0]);
            }
            if ( GXutil.strcmp(Z12232AlbNomCli, T01Q62_A12232AlbNomCli[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbNomCli");
               GXutil.writeLogRaw("Old: ",Z12232AlbNomCli);
               GXutil.writeLogRaw("Current: ",T01Q62_A12232AlbNomCli[0]);
            }
            if ( Z3393AlbColNum != T01Q62_A3393AlbColNum[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbColNum");
               GXutil.writeLogRaw("Old: ",Z3393AlbColNum);
               GXutil.writeLogRaw("Current: ",T01Q62_A3393AlbColNum[0]);
            }
            if ( DecimalUtil.compareTo(Z1261BarAlbKgmE, T01Q62_A1261BarAlbKgmE[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarAlbKgmE");
               GXutil.writeLogRaw("Old: ",Z1261BarAlbKgmE);
               GXutil.writeLogRaw("Current: ",T01Q62_A1261BarAlbKgmE[0]);
            }
            if ( DecimalUtil.compareTo(Z1262BarPreKgm, T01Q62_A1262BarPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarPreKgm");
               GXutil.writeLogRaw("Old: ",Z1262BarPreKgm);
               GXutil.writeLogRaw("Current: ",T01Q62_A1262BarPreKgm[0]);
            }
            if ( Z3271AlbHdrAnc != T01Q62_A3271AlbHdrAnc[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbHdrAnc");
               GXutil.writeLogRaw("Old: ",Z3271AlbHdrAnc);
               GXutil.writeLogRaw("Current: ",T01Q62_A3271AlbHdrAnc[0]);
            }
            if ( Z5019AlbHdrgm2 != T01Q62_A5019AlbHdrgm2[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbHdrgm2");
               GXutil.writeLogRaw("Old: ",Z5019AlbHdrgm2);
               GXutil.writeLogRaw("Current: ",T01Q62_A5019AlbHdrgm2[0]);
            }
            if ( DecimalUtil.compareTo(Z1263BarAlbMtrE, T01Q62_A1263BarAlbMtrE[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarAlbMtrE");
               GXutil.writeLogRaw("Old: ",Z1263BarAlbMtrE);
               GXutil.writeLogRaw("Current: ",T01Q62_A1263BarAlbMtrE[0]);
            }
            if ( DecimalUtil.compareTo(Z1264BarPreMtr, T01Q62_A1264BarPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarPreMtr");
               GXutil.writeLogRaw("Old: ",Z1264BarPreMtr);
               GXutil.writeLogRaw("Current: ",T01Q62_A1264BarPreMtr[0]);
            }
            if ( Z1265BarAlbPie != T01Q62_A1265BarAlbPie[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarAlbPie");
               GXutil.writeLogRaw("Old: ",Z1265BarAlbPie);
               GXutil.writeLogRaw("Current: ",T01Q62_A1265BarAlbPie[0]);
            }
            if ( Z1266BarAlbTub != T01Q62_A1266BarAlbTub[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarAlbTub");
               GXutil.writeLogRaw("Old: ",Z1266BarAlbTub);
               GXutil.writeLogRaw("Current: ",T01Q62_A1266BarAlbTub[0]);
            }
            if ( Z6466PlasCod != T01Q62_A6466PlasCod[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"PlasCod");
               GXutil.writeLogRaw("Old: ",Z6466PlasCod);
               GXutil.writeLogRaw("Current: ",T01Q62_A6466PlasCod[0]);
            }
            if ( Z6467BarAlbPlas != T01Q62_A6467BarAlbPlas[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarAlbPlas");
               GXutil.writeLogRaw("Old: ",Z6467BarAlbPlas);
               GXutil.writeLogRaw("Current: ",T01Q62_A6467BarAlbPlas[0]);
            }
            if ( GXutil.strcmp(Z2441AlbHdrObs, T01Q62_A2441AlbHdrObs[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbHdrObs");
               GXutil.writeLogRaw("Old: ",Z2441AlbHdrObs);
               GXutil.writeLogRaw("Current: ",T01Q62_A2441AlbHdrObs[0]);
            }
            if ( GXutil.strcmp(Z2839AlbProVal, T01Q62_A2839AlbProVal[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbProVal");
               GXutil.writeLogRaw("Old: ",Z2839AlbProVal);
               GXutil.writeLogRaw("Current: ",T01Q62_A2839AlbProVal[0]);
            }
            if ( GXutil.strcmp(Z1095AlbTipEnt, T01Q62_A1095AlbTipEnt[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbTipEnt");
               GXutil.writeLogRaw("Old: ",Z1095AlbTipEnt);
               GXutil.writeLogRaw("Current: ",T01Q62_A1095AlbTipEnt[0]);
            }
            if ( Z12234AlbTipArt != T01Q62_A12234AlbTipArt[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbTipArt");
               GXutil.writeLogRaw("Old: ",Z12234AlbTipArt);
               GXutil.writeLogRaw("Current: ",T01Q62_A12234AlbTipArt[0]);
            }
            if ( Z12233AlbNumcli != T01Q62_A12233AlbNumcli[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbNumcli");
               GXutil.writeLogRaw("Old: ",Z12233AlbNumcli);
               GXutil.writeLogRaw("Current: ",T01Q62_A12233AlbNumcli[0]);
            }
            if ( Z12195BarAlbUnd != T01Q62_A12195BarAlbUnd[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarAlbUnd");
               GXutil.writeLogRaw("Old: ",Z12195BarAlbUnd);
               GXutil.writeLogRaw("Current: ",T01Q62_A12195BarAlbUnd[0]);
            }
            if ( DecimalUtil.compareTo(Z12196BarPreUnd, T01Q62_A12196BarPreUnd[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarPreUnd");
               GXutil.writeLogRaw("Old: ",Z12196BarPreUnd);
               GXutil.writeLogRaw("Current: ",T01Q62_A12196BarPreUnd[0]);
            }
            if ( Z3886AlbCliCod != T01Q62_A3886AlbCliCod[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbCliCod");
               GXutil.writeLogRaw("Old: ",Z3886AlbCliCod);
               GXutil.writeLogRaw("Current: ",T01Q62_A3886AlbCliCod[0]);
            }
            if ( Z6645AlbMetULi != T01Q62_A6645AlbMetULi[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbMetULi");
               GXutil.writeLogRaw("Old: ",Z6645AlbMetULi);
               GXutil.writeLogRaw("Current: ",T01Q62_A6645AlbMetULi[0]);
            }
            if ( GXutil.strcmp(Z2398BarFasExt, T01Q62_A2398BarFasExt[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarFasExt");
               GXutil.writeLogRaw("Old: ",Z2398BarFasExt);
               GXutil.writeLogRaw("Current: ",T01Q62_A2398BarFasExt[0]);
            }
            if ( DecimalUtil.compareTo(Z1461BarAlbPN, T01Q62_A1461BarAlbPN[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarAlbPN");
               GXutil.writeLogRaw("Old: ",Z1461BarAlbPN);
               GXutil.writeLogRaw("Current: ",T01Q62_A1461BarAlbPN[0]);
            }
            if ( DecimalUtil.compareTo(Z7994AlbDto, T01Q62_A7994AlbDto[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbDto");
               GXutil.writeLogRaw("Old: ",Z7994AlbDto);
               GXutil.writeLogRaw("Current: ",T01Q62_A7994AlbDto[0]);
            }
            if ( GXutil.strcmp(Z7993AlbMqTj, T01Q62_A7993AlbMqTj[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbMqTj");
               GXutil.writeLogRaw("Old: ",Z7993AlbMqTj);
               GXutil.writeLogRaw("Current: ",T01Q62_A7993AlbMqTj[0]);
            }
            if ( GXutil.strcmp(Z7992AlbDf3, T01Q62_A7992AlbDf3[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbDf3");
               GXutil.writeLogRaw("Old: ",Z7992AlbDf3);
               GXutil.writeLogRaw("Current: ",T01Q62_A7992AlbDf3[0]);
            }
            if ( GXutil.strcmp(Z7991AlbDf2, T01Q62_A7991AlbDf2[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbDf2");
               GXutil.writeLogRaw("Old: ",Z7991AlbDf2);
               GXutil.writeLogRaw("Current: ",T01Q62_A7991AlbDf2[0]);
            }
            if ( GXutil.strcmp(Z7990AlbDf1, T01Q62_A7990AlbDf1[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbDf1");
               GXutil.writeLogRaw("Old: ",Z7990AlbDf1);
               GXutil.writeLogRaw("Current: ",T01Q62_A7990AlbDf1[0]);
            }
            if ( GXutil.strcmp(Z7989AlbCald, T01Q62_A7989AlbCald[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbCald");
               GXutil.writeLogRaw("Old: ",Z7989AlbCald);
               GXutil.writeLogRaw("Current: ",T01Q62_A7989AlbCald[0]);
            }
            if ( DecimalUtil.compareTo(Z7104AlbEncA, T01Q62_A7104AlbEncA[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbEncA");
               GXutil.writeLogRaw("Old: ",Z7104AlbEncA);
               GXutil.writeLogRaw("Current: ",T01Q62_A7104AlbEncA[0]);
            }
            if ( DecimalUtil.compareTo(Z7103AlbEncL, T01Q62_A7103AlbEncL[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbEncL");
               GXutil.writeLogRaw("Old: ",Z7103AlbEncL);
               GXutil.writeLogRaw("Current: ",T01Q62_A7103AlbEncL[0]);
            }
            if ( GXutil.strcmp(Z6814AlbObsM, T01Q62_A6814AlbObsM[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbObsM");
               GXutil.writeLogRaw("Old: ",Z6814AlbObsM);
               GXutil.writeLogRaw("Current: ",T01Q62_A6814AlbObsM[0]);
            }
            if ( DecimalUtil.compareTo(Z2761AlbBarRec, T01Q62_A2761AlbBarRec[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbBarRec");
               GXutil.writeLogRaw("Old: ",Z2761AlbBarRec);
               GXutil.writeLogRaw("Current: ",T01Q62_A2761AlbBarRec[0]);
            }
            if ( DecimalUtil.compareTo(Z5354AlbImpMan, T01Q62_A5354AlbImpMan[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbImpMan");
               GXutil.writeLogRaw("Old: ",Z5354AlbImpMan);
               GXutil.writeLogRaw("Current: ",T01Q62_A5354AlbImpMan[0]);
            }
            if ( GXutil.strcmp(Z4815AlbEncCli, T01Q62_A4815AlbEncCli[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbEncCli");
               GXutil.writeLogRaw("Old: ",Z4815AlbEncCli);
               GXutil.writeLogRaw("Current: ",T01Q62_A4815AlbEncCli[0]);
            }
            if ( Z3394AlbTipCol != T01Q62_A3394AlbTipCol[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbTipCol");
               GXutil.writeLogRaw("Old: ",Z3394AlbTipCol);
               GXutil.writeLogRaw("Current: ",T01Q62_A3394AlbTipCol[0]);
            }
            if ( Z1458BarAlbBul != T01Q62_A1458BarAlbBul[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"BarAlbBul");
               GXutil.writeLogRaw("Old: ",Z1458BarAlbBul);
               GXutil.writeLogRaw("Current: ",T01Q62_A1458BarAlbBul[0]);
            }
            if ( DecimalUtil.compareTo(Z40AlbProRec, T01Q62_A40AlbProRec[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbProRec");
               GXutil.writeLogRaw("Old: ",Z40AlbProRec);
               GXutil.writeLogRaw("Current: ",T01Q62_A40AlbProRec[0]);
            }
            if ( Z32AlbProEsp != T01Q62_A32AlbProEsp[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbProEsp");
               GXutil.writeLogRaw("Old: ",Z32AlbProEsp);
               GXutil.writeLogRaw("Current: ",T01Q62_A32AlbProEsp[0]);
            }
            if ( Z1248GuiFasULin != T01Q62_A1248GuiFasULin[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"GuiFasULin");
               GXutil.writeLogRaw("Old: ",Z1248GuiFasULin);
               GXutil.writeLogRaw("Current: ",T01Q62_A1248GuiFasULin[0]);
            }
            if ( Z2763AlbHdrUlin != T01Q62_A2763AlbHdrUlin[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbHdrUlin");
               GXutil.writeLogRaw("Old: ",Z2763AlbHdrUlin);
               GXutil.writeLogRaw("Current: ",T01Q62_A2763AlbHdrUlin[0]);
            }
            if ( Z12905AlbCadEnc != T01Q62_A12905AlbCadEnc[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"AlbCadEnc");
               GXutil.writeLogRaw("Old: ",Z12905AlbCadEnc);
               GXutil.writeLogRaw("Current: ",T01Q62_A12905AlbCadEnc[0]);
            }
            if ( Z5051TipAcaCod != T01Q62_A5051TipAcaCod[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"TipAcaCod");
               GXutil.writeLogRaw("Old: ",Z5051TipAcaCod);
               GXutil.writeLogRaw("Current: ",T01Q62_A5051TipAcaCod[0]);
            }
            if ( Z1206TubCod != T01Q62_A1206TubCod[0] )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"TubCod");
               GXutil.writeLogRaw("Old: ",Z1206TubCod);
               GXutil.writeLogRaw("Current: ",T01Q62_A1206TubCod[0]);
            }
            if ( GXutil.strcmp(Z3153CodCod, T01Q62_A3153CodCod[0]) != 0 )
            {
               GXutil.writeLogln("albbar:[seudo value changed for attri]"+"CodCod");
               GXutil.writeLogRaw("Old: ",Z3153CodCod);
               GXutil.writeLogRaw("Current: ",T01Q62_A3153CodCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBBAR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1Q6195( )
   {
      beforeValidate1Q6195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q6195( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1Q6195( 0) ;
         checkOptimisticConcurrency1Q6195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q6195( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1Q6195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q628 */
                  pr_default.execute(20, new Object[] {A3391AlbSer, A8879AlbSerD, A3392AlbColNom, A12232AlbNomCli, Integer.valueOf(A3393AlbColNum), A1261BarAlbKgmE, A1262BarPreKgm, Short.valueOf(A3271AlbHdrAnc), Short.valueOf(A5019AlbHdrgm2), A1263BarAlbMtrE, A1264BarPreMtr, Integer.valueOf(A1265BarAlbPie), Integer.valueOf(A1266BarAlbTub), Boolean.valueOf(n6466PlasCod), Short.valueOf(A6466PlasCod), Short.valueOf(A6467BarAlbPlas), A2441AlbHdrObs, A2839AlbProVal, A1095AlbTipEnt, Short.valueOf(A12234AlbTipArt), Integer.valueOf(A12233AlbNumcli), Integer.valueOf(A12195BarAlbUnd), A12196BarPreUnd, Integer.valueOf(A3886AlbCliCod), Short.valueOf(A6645AlbMetULi), A2398BarFasExt, A1461BarAlbPN, A7994AlbDto, A7993AlbMqTj, A7992AlbDf3, A7991AlbDf2, A7990AlbDf1, A7989AlbCald, A7104AlbEncA, A7103AlbEncL, A6814AlbObsM, A2761AlbBarRec, A5354AlbImpMan, A4815AlbEncCli, Byte.valueOf(A3394AlbTipCol), Short.valueOf(A1458BarAlbBul), A40AlbProRec, Byte.valueOf(A32AlbProEsp), Short.valueOf(A1248GuiFasULin), Short.valueOf(A2763AlbHdrUlin), Short.valueOf(A12905AlbCadEnc), Short.valueOf(A5051TipAcaCod), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), Long.valueOf(A30AlbProCod), Boolean.valueOf(n3153CodCod), A3153CodCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(20) == 1) )
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
                        resetCaption1Q60( ) ;
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
            load1Q6195( ) ;
         }
         endLevel1Q6195( ) ;
      }
      closeExtendedTableCursors1Q6195( ) ;
   }

   public void update1Q6195( )
   {
      beforeValidate1Q6195( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1Q6195( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q6195( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1Q6195( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1Q6195( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01Q629 */
                  pr_default.execute(21, new Object[] {A3391AlbSer, A8879AlbSerD, A3392AlbColNom, A12232AlbNomCli, Integer.valueOf(A3393AlbColNum), A1261BarAlbKgmE, A1262BarPreKgm, Short.valueOf(A3271AlbHdrAnc), Short.valueOf(A5019AlbHdrgm2), A1263BarAlbMtrE, A1264BarPreMtr, Integer.valueOf(A1265BarAlbPie), Integer.valueOf(A1266BarAlbTub), Boolean.valueOf(n6466PlasCod), Short.valueOf(A6466PlasCod), Short.valueOf(A6467BarAlbPlas), A2441AlbHdrObs, A2839AlbProVal, A1095AlbTipEnt, Short.valueOf(A12234AlbTipArt), Integer.valueOf(A12233AlbNumcli), Integer.valueOf(A12195BarAlbUnd), A12196BarPreUnd, Integer.valueOf(A3886AlbCliCod), Short.valueOf(A6645AlbMetULi), A2398BarFasExt, A1461BarAlbPN, A7994AlbDto, A7993AlbMqTj, A7992AlbDf3, A7991AlbDf2, A7990AlbDf1, A7989AlbCald, A7104AlbEncA, A7103AlbEncL, A6814AlbObsM, A2761AlbBarRec, A5354AlbImpMan, A4815AlbEncCli, Byte.valueOf(A3394AlbTipCol), Short.valueOf(A1458BarAlbBul), A40AlbProRec, Byte.valueOf(A32AlbProEsp), Short.valueOf(A1248GuiFasULin), Short.valueOf(A2763AlbHdrUlin), Short.valueOf(A12905AlbCadEnc), Short.valueOf(A5051TipAcaCod), Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod), Boolean.valueOf(n3153CodCod), A3153CodCod, A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
                  if ( (pr_default.getStatus(21) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBBAR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1Q6195( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1Q60( ) ;
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
         endLevel1Q6195( ) ;
      }
      closeExtendedTableCursors1Q6195( ) ;
   }

   public void deferredUpdate1Q6195( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1Q6195( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1Q6195( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1Q6195( ) ;
         afterConfirm1Q6195( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1Q6195( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01Q630 */
               pr_default.execute(22, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBBAR");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound195 == 0 )
                     {
                        initAll1Q6195( ) ;
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
                     resetCaption1Q60( ) ;
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
      sMode195 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1Q6195( ) ;
      Gx_mode = sMode195 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1Q6195( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01Q631 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         A361DisCod = T01Q631_A361DisCod[0] ;
         A1235BarNumCli = T01Q631_A1235BarNumCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
         A1234BarNomCli = T01Q631_A1234BarNomCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A5034BarEstTip = T01Q631_A5034BarEstTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", A5034BarEstTip);
         A5291BarTipCor = T01Q631_A5291BarTipCor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
         A5027BarGraCob = T01Q631_A5027BarGraCob[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5027BarGraCob), 2, 0));
         A2010BarTipDis = T01Q631_A2010BarTipDis[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
         A4937BarCtrPdas = T01Q631_A4937BarCtrPdas[0] ;
         n4937BarCtrPdas = T01Q631_n4937BarCtrPdas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.str( A4937BarCtrPdas, 1, 0));
         A5253BarAcc = T01Q631_A5253BarAcc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
         A148BarEstReo = T01Q631_A148BarEstReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
         A143BarDisNum = T01Q631_A143BarDisNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
         A1909BarGraAca = T01Q631_A1909BarGraAca[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
         A4812BarEncCli = T01Q631_A4812BarEncCli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A1652BarSerDsc = T01Q631_A1652BarSerDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A218BarTipCol = T01Q631_A218BarTipCol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
         A136BarColNum = T01Q631_A136BarColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
         A135BarColNom = T01Q631_A135BarColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A1503BarPart = T01Q631_A1503BarPart[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1503BarPart), 4, 0));
         A161BarFecSal = T01Q631_A161BarFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
         A125BarAncAca1 = T01Q631_A125BarAncAca1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
         A213BarSit = T01Q631_A213BarSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
         A212BarSer = T01Q631_A212BarSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A4466BarAcaAnh = T01Q631_A4466BarAcaAnh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
         A252CliCod = T01Q631_A252CliCod[0] ;
         n252CliCod = T01Q631_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A217BarTipArt = T01Q631_A217BarTipArt[0] ;
         n217BarTipArt = T01Q631_n217BarTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
         pr_default.close(23);
         /* Using cursor T01Q632 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A365DisDes = T01Q632_A365DisDes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
         pr_default.close(24);
         /* Using cursor T01Q634 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A1279BarKla = T01Q634_A1279BarKla[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
            A1280BarMla = T01Q634_A1280BarMla[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
            A1292BarPlz = T01Q634_A1292BarPlz[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
         }
         else
         {
            A1279BarKla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
            A1280BarMla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
            A1292BarPlz = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
         }
         pr_default.close(25);
         /* Using cursor T01Q636 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(26) != 101) )
         {
            A898BarPieNDes = T01Q636_A898BarPieNDes[0] ;
            A199BarPie1 = T01Q636_A199BarPie1[0] ;
         }
         else
         {
            A898BarPieNDes = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
            A199BarPie1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
         }
         pr_default.close(26);
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01Q637 */
         pr_default.execute(27, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "METCAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01Q638 */
         pr_default.execute(28, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EDIETI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01Q639 */
         pr_default.execute(29, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREPg", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01Q640 */
         pr_default.execute(30, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBQUI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01Q641 */
         pr_default.execute(31, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01Q642 */
         pr_default.execute(32, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01Q643 */
         pr_default.execute(33, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPCK", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01Q644 */
         pr_default.execute(34, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01Q645 */
         pr_default.execute(35, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01Q646 */
         pr_default.execute(36, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01Q647 */
         pr_default.execute(37, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
      }
   }

   public void endLevel1Q6195( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1Q6195( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "albbar");
         if ( AnyError == 0 )
         {
            confirmValues1Q60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "albbar");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1Q6195( )
   {
      /* Using cursor T01Q648 */
      pr_default.execute(38);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A396EmprCod = T01Q648_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01Q648_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01Q648_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01Q648_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01Q648_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1Q6195( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound195 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound195 = (short)(1) ;
         A396EmprCod = T01Q648_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01Q648_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A129BarCod = T01Q648_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01Q648_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01Q648_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
   }

   public void scanEnd1Q6195( )
   {
      pr_default.close(38);
   }

   public void afterConfirm1Q6195( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1Q6195( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1Q6195( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1Q6195( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1Q6195( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1Q6195( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1Q6195( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtAlbSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSer_Enabled), 5, 0), true);
      edtAlbSerD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbSerD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbSerD_Enabled), 5, 0), true);
      edtAlbColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNom_Enabled), 5, 0), true);
      edtAlbNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNomCli_Enabled), 5, 0), true);
      edtAlbColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbColNum_Enabled), 5, 0), true);
      edtCodCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodCod_Enabled), 5, 0), true);
      edtBarAlbKgmE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbKgmE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbKgmE_Enabled), 5, 0), true);
      edtBarPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreKgm_Enabled), 5, 0), true);
      edtAlbHdrAnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrAnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrAnc_Enabled), 5, 0), true);
      edtAlbHdrgm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrgm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrgm2_Enabled), 5, 0), true);
      edtBarAlbMtrE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbMtrE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbMtrE_Enabled), 5, 0), true);
      edtBarPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreMtr_Enabled), 5, 0), true);
      edtBarAlbPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPie_Enabled), 5, 0), true);
      edtTubCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTubCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTubCod_Enabled), 5, 0), true);
      edtBarAlbTub_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbTub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbTub_Enabled), 5, 0), true);
      edtPlasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPlasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPlasCod_Enabled), 5, 0), true);
      edtBarAlbPlas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPlas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPlas_Enabled), 5, 0), true);
      edtAlbHdrObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrObs_Enabled), 5, 0), true);
      cmbAlbProVal.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbProVal.getEnabled(), 5, 0), true);
      edtAlbTipEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipEnt_Enabled), 5, 0), true);
      edtAlbTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipArt_Enabled), 5, 0), true);
      edtBarTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipArt_Enabled), 5, 0), true);
      edtAlbNumcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbNumcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbNumcli_Enabled), 5, 0), true);
      edtBarNumCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNumCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNumCli_Enabled), 5, 0), true);
      edtBarNomCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNomCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNomCli_Enabled), 5, 0), true);
      edtBarAlbUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbUnd_Enabled), 5, 0), true);
      edtBarPreUnd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPreUnd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPreUnd_Enabled), 5, 0), true);
      edtBarEstTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEstTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEstTip_Enabled), 5, 0), true);
      edtAlbCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCliCod_Enabled), 5, 0), true);
      edtAlbMetULi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMetULi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMetULi_Enabled), 5, 0), true);
      edtBarFasExt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFasExt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFasExt_Enabled), 5, 0), true);
      chkBarTipCor.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarTipCor.getEnabled(), 5, 0), true);
      edtBarGraCob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraCob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraCob_Enabled), 5, 0), true);
      edtBarTipDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipDis_Enabled), 5, 0), true);
      edtBarAlbPN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbPN_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbPN_Enabled), 5, 0), true);
      edtBarCtrPdas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCtrPdas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCtrPdas_Enabled), 5, 0), true);
      edtAlbDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDto_Enabled), 5, 0), true);
      edtAlbMqTj_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbMqTj_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbMqTj_Enabled), 5, 0), true);
      edtAlbDf3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf3_Enabled), 5, 0), true);
      edtAlbDf2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf2_Enabled), 5, 0), true);
      edtAlbDf1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbDf1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbDf1_Enabled), 5, 0), true);
      edtAlbCald_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCald_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCald_Enabled), 5, 0), true);
      edtAlbEncA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncA_Enabled), 5, 0), true);
      edtAlbEncL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncL_Enabled), 5, 0), true);
      edtAlbObsM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbObsM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbObsM_Enabled), 5, 0), true);
      edtAlbBarRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbBarRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbBarRec_Enabled), 5, 0), true);
      chkBarAcc.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "Enabled", GXutil.ltrimstr( chkBarAcc.getEnabled(), 5, 0), true);
      edtAlbImpMan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbImpMan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbImpMan_Enabled), 5, 0), true);
      cmbBarEstReo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbBarEstReo.getEnabled(), 5, 0), true);
      edtBarDisNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarDisNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarDisNum_Enabled), 5, 0), true);
      edtBarGraAca_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarGraAca_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarGraAca_Enabled), 5, 0), true);
      edtAlbEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbEncCli_Enabled), 5, 0), true);
      edtBarEncCli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarEncCli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarEncCli_Enabled), 5, 0), true);
      edtBarSerDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSerDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSerDsc_Enabled), 5, 0), true);
      edtBarTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarTipCol_Enabled), 5, 0), true);
      edtBarColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNum_Enabled), 5, 0), true);
      edtBarColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarColNom_Enabled), 5, 0), true);
      edtAlbTipCol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbTipCol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbTipCol_Enabled), 5, 0), true);
      edtBarPart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPart_Enabled), 5, 0), true);
      edtBarAlbBul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAlbBul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAlbBul_Enabled), 5, 0), true);
      chkDisDes.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "Enabled", GXutil.ltrimstr( chkDisDes.getEnabled(), 5, 0), true);
      edtAlbProRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProRec_Enabled), 5, 0), true);
      edtAlbProEsp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEsp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEsp_Enabled), 5, 0), true);
      edtBarKla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKla_Enabled), 5, 0), true);
      edtBarMla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMla_Enabled), 5, 0), true);
      edtBarPlz_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPlz_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPlz_Enabled), 5, 0), true);
      edtBarPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarPie_Enabled), 5, 0), true);
      edtBarFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarFecSal_Enabled), 5, 0), true);
      edtBarAncAca1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAncAca1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAncAca1_Enabled), 5, 0), true);
      edtBarSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSit_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtBarSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarSer_Enabled), 5, 0), true);
      edtGuiFasULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiFasULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiFasULin_Enabled), 5, 0), true);
      edtAlbHdrUlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHdrUlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbHdrUlin_Enabled), 5, 0), true);
      edtBarAcaAnh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Enabled), 5, 0), true);
      edtAlbCadEnc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbCadEnc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbCadEnc_Enabled), 5, 0), true);
      edtTipAcaCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipAcaCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipAcaCod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1Q6195( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1Q60( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albbar", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3391AlbSer", GXutil.rtrim( Z3391AlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8879AlbSerD", GXutil.rtrim( Z8879AlbSerD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3392AlbColNom", GXutil.rtrim( Z3392AlbColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12232AlbNomCli", GXutil.rtrim( Z12232AlbNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3393AlbColNum", GXutil.ltrim( localUtil.ntoc( Z3393AlbColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1262BarPreKgm", GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3271AlbHdrAnc", GXutil.ltrim( localUtil.ntoc( Z3271AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5019AlbHdrgm2", GXutil.ltrim( localUtil.ntoc( Z5019AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1264BarPreMtr", GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1265BarAlbPie", GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1266BarAlbTub", GXutil.ltrim( localUtil.ntoc( Z1266BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6466PlasCod", GXutil.ltrim( localUtil.ntoc( Z6466PlasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6467BarAlbPlas", GXutil.ltrim( localUtil.ntoc( Z6467BarAlbPlas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2441AlbHdrObs", GXutil.rtrim( Z2441AlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2839AlbProVal", GXutil.rtrim( Z2839AlbProVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1095AlbTipEnt", GXutil.rtrim( Z1095AlbTipEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12234AlbTipArt", GXutil.ltrim( localUtil.ntoc( Z12234AlbTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12233AlbNumcli", GXutil.ltrim( localUtil.ntoc( Z12233AlbNumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12195BarAlbUnd", GXutil.ltrim( localUtil.ntoc( Z12195BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12196BarPreUnd", GXutil.ltrim( localUtil.ntoc( Z12196BarPreUnd, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3886AlbCliCod", GXutil.ltrim( localUtil.ntoc( Z3886AlbCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6645AlbMetULi", GXutil.ltrim( localUtil.ntoc( Z6645AlbMetULi, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2398BarFasExt", GXutil.rtrim( Z2398BarFasExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1461BarAlbPN", GXutil.ltrim( localUtil.ntoc( Z1461BarAlbPN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7994AlbDto", GXutil.ltrim( localUtil.ntoc( Z7994AlbDto, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7993AlbMqTj", GXutil.rtrim( Z7993AlbMqTj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7992AlbDf3", GXutil.rtrim( Z7992AlbDf3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7991AlbDf2", GXutil.rtrim( Z7991AlbDf2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7990AlbDf1", GXutil.rtrim( Z7990AlbDf1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7989AlbCald", GXutil.rtrim( Z7989AlbCald));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7104AlbEncA", GXutil.ltrim( localUtil.ntoc( Z7104AlbEncA, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7103AlbEncL", GXutil.ltrim( localUtil.ntoc( Z7103AlbEncL, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6814AlbObsM", Z6814AlbObsM);
      app.GxWebStd.gx_hidden_field( httpContext, "Z2761AlbBarRec", GXutil.ltrim( localUtil.ntoc( Z2761AlbBarRec, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5354AlbImpMan", GXutil.ltrim( localUtil.ntoc( Z5354AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4815AlbEncCli", GXutil.rtrim( Z4815AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3394AlbTipCol", GXutil.ltrim( localUtil.ntoc( Z3394AlbTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1458BarAlbBul", GXutil.ltrim( localUtil.ntoc( Z1458BarAlbBul, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z40AlbProRec", GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z32AlbProEsp", GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2763AlbHdrUlin", GXutil.ltrim( localUtil.ntoc( Z2763AlbHdrUlin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12905AlbCadEnc", GXutil.ltrim( localUtil.ntoc( Z12905AlbCadEnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5051TipAcaCod", GXutil.ltrim( localUtil.ntoc( Z5051TipAcaCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1206TubCod", GXutil.ltrim( localUtil.ntoc( Z1206TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3153CodCod", GXutil.rtrim( Z3153CodCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.albbar", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ALBBAR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ALBBAR", "") ;
   }

   public void initializeNonKey1Q6195( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A198BarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
      A3391AlbSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", A3391AlbSer);
      A8879AlbSerD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", A8879AlbSerD);
      A3392AlbColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", A3392AlbColNom);
      A12232AlbNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", A12232AlbNomCli);
      A3393AlbColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3393AlbColNum), 6, 0));
      A3153CodCod = "" ;
      n3153CodCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", A3153CodCod);
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrimstr( A1261BarAlbKgmE, 9, 2));
      A1262BarPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrimstr( A1262BarPreKgm, 13, 5));
      A3271AlbHdrAnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3271AlbHdrAnc), 4, 0));
      A5019AlbHdrgm2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5019AlbHdrgm2), 4, 0));
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrimstr( A1263BarAlbMtrE, 9, 2));
      A1264BarPreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrimstr( A1264BarPreMtr, 13, 5));
      A1265BarAlbPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1265BarAlbPie), 6, 0));
      A1206TubCod = (short)(0) ;
      n1206TubCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1206TubCod), 4, 0));
      A1266BarAlbTub = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1266BarAlbTub), 6, 0));
      A6466PlasCod = (short)(0) ;
      n6466PlasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6466PlasCod), 4, 0));
      A6467BarAlbPlas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6467BarAlbPlas), 4, 0));
      A2441AlbHdrObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", A2441AlbHdrObs);
      A2839AlbProVal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
      A1095AlbTipEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1095AlbTipEnt", A1095AlbTipEnt);
      A12234AlbTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12234AlbTipArt), 4, 0));
      A217BarTipArt = (short)(0) ;
      n217BarTipArt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      A12233AlbNumcli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12233AlbNumcli), 6, 0));
      A1235BarNumCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A1234BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A12195BarAlbUnd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12195BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12195BarAlbUnd), 6, 0));
      A12196BarPreUnd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12196BarPreUnd", GXutil.ltrimstr( A12196BarPreUnd, 13, 5));
      A5034BarEstTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", A5034BarEstTip);
      A3886AlbCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3886AlbCliCod), 6, 0));
      A6645AlbMetULi = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6645AlbMetULi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6645AlbMetULi), 4, 0));
      A2398BarFasExt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", A2398BarFasExt);
      A5291BarTipCor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      A5027BarGraCob = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5027BarGraCob), 2, 0));
      A2010BarTipDis = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
      A1461BarAlbPN = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1461BarAlbPN", GXutil.ltrimstr( A1461BarAlbPN, 9, 2));
      A4937BarCtrPdas = (byte)(0) ;
      n4937BarCtrPdas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.str( A4937BarCtrPdas, 1, 0));
      A7994AlbDto = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7994AlbDto", GXutil.ltrimstr( A7994AlbDto, 6, 3));
      A7993AlbMqTj = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7993AlbMqTj", A7993AlbMqTj);
      A7992AlbDf3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7992AlbDf3", A7992AlbDf3);
      A7991AlbDf2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7991AlbDf2", A7991AlbDf2);
      A7990AlbDf1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7990AlbDf1", A7990AlbDf1);
      A7989AlbCald = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7989AlbCald", A7989AlbCald);
      A7104AlbEncA = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7104AlbEncA", GXutil.ltrimstr( A7104AlbEncA, 7, 2));
      A7103AlbEncL = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7103AlbEncL", GXutil.ltrimstr( A7103AlbEncL, 7, 2));
      A6814AlbObsM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6814AlbObsM", A6814AlbObsM);
      A2761AlbBarRec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A2761AlbBarRec", GXutil.ltrimstr( A2761AlbBarRec, 6, 2));
      A5253BarAcc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
      A5354AlbImpMan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5354AlbImpMan", GXutil.ltrimstr( A5354AlbImpMan, 11, 2));
      A148BarEstReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      A143BarDisNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A1909BarGraAca = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A4815AlbEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", A4815AlbEncCli);
      A4812BarEncCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A1652BarSerDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A218BarTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A136BarColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A135BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A3394AlbTipCol = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3394AlbTipCol), 2, 0));
      A1503BarPart = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1503BarPart), 4, 0));
      A1458BarAlbBul = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1458BarAlbBul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1458BarAlbBul), 4, 0));
      A365DisDes = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      A40AlbProRec = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrimstr( A40AlbProRec, 13, 5));
      A32AlbProEsp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrimstr( DecimalUtil.doubleToDec(A32AlbProEsp), 2, 0));
      A1279BarKla = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
      A1280BarMla = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
      A1292BarPlz = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      A161BarFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
      A125BarAncAca1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A213BarSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A212BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1248GuiFasULin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1248GuiFasULin), 4, 0));
      A2763AlbHdrUlin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2763AlbHdrUlin), 4, 0));
      A4466BarAcaAnh = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A12905AlbCadEnc = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12905AlbCadEnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12905AlbCadEnc), 4, 0));
      A5051TipAcaCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5051TipAcaCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5051TipAcaCod), 4, 0));
      A898BarPieNDes = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
      A199BarPie1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      Z3391AlbSer = "" ;
      Z8879AlbSerD = "" ;
      Z3392AlbColNom = "" ;
      Z12232AlbNomCli = "" ;
      Z3393AlbColNum = 0 ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1262BarPreKgm = DecimalUtil.ZERO ;
      Z3271AlbHdrAnc = (short)(0) ;
      Z5019AlbHdrgm2 = (short)(0) ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z1265BarAlbPie = 0 ;
      Z1266BarAlbTub = 0 ;
      Z6466PlasCod = (short)(0) ;
      Z6467BarAlbPlas = (short)(0) ;
      Z2441AlbHdrObs = "" ;
      Z2839AlbProVal = "" ;
      Z1095AlbTipEnt = "" ;
      Z12234AlbTipArt = (short)(0) ;
      Z12233AlbNumcli = 0 ;
      Z12195BarAlbUnd = 0 ;
      Z12196BarPreUnd = DecimalUtil.ZERO ;
      Z3886AlbCliCod = 0 ;
      Z6645AlbMetULi = (short)(0) ;
      Z2398BarFasExt = "" ;
      Z1461BarAlbPN = DecimalUtil.ZERO ;
      Z7994AlbDto = DecimalUtil.ZERO ;
      Z7993AlbMqTj = "" ;
      Z7992AlbDf3 = "" ;
      Z7991AlbDf2 = "" ;
      Z7990AlbDf1 = "" ;
      Z7989AlbCald = "" ;
      Z7104AlbEncA = DecimalUtil.ZERO ;
      Z7103AlbEncL = DecimalUtil.ZERO ;
      Z6814AlbObsM = "" ;
      Z2761AlbBarRec = DecimalUtil.ZERO ;
      Z5354AlbImpMan = DecimalUtil.ZERO ;
      Z4815AlbEncCli = "" ;
      Z3394AlbTipCol = (byte)(0) ;
      Z1458BarAlbBul = (short)(0) ;
      Z40AlbProRec = DecimalUtil.ZERO ;
      Z32AlbProEsp = (byte)(0) ;
      Z1248GuiFasULin = (short)(0) ;
      Z2763AlbHdrUlin = (short)(0) ;
      Z12905AlbCadEnc = (short)(0) ;
      Z5051TipAcaCod = (short)(0) ;
      Z1206TubCod = (short)(0) ;
      Z3153CodCod = "" ;
   }

   public void initAll1Q6195( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      A129BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      initializeNonKey1Q6195( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026761349783", true, true);
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
      httpContext.AddJavascriptSource("albbar.js", "?2026761349783", false, true);
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
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtAlbSer_Internalname = "ALBSER" ;
      edtAlbSerD_Internalname = "ALBSERD" ;
      edtAlbColNom_Internalname = "ALBCOLNOM" ;
      edtAlbNomCli_Internalname = "ALBNOMCLI" ;
      edtAlbColNum_Internalname = "ALBCOLNUM" ;
      edtCodCod_Internalname = "CODCOD" ;
      edtBarAlbKgmE_Internalname = "BARALBKGME" ;
      edtBarPreKgm_Internalname = "BARPREKGM" ;
      edtAlbHdrAnc_Internalname = "ALBHDRANC" ;
      edtAlbHdrgm2_Internalname = "ALBHDRGM2" ;
      edtBarAlbMtrE_Internalname = "BARALBMTRE" ;
      edtBarPreMtr_Internalname = "BARPREMTR" ;
      edtBarAlbPie_Internalname = "BARALBPIE" ;
      edtTubCod_Internalname = "TUBCOD" ;
      edtBarAlbTub_Internalname = "BARALBTUB" ;
      edtPlasCod_Internalname = "PLASCOD" ;
      edtBarAlbPlas_Internalname = "BARALBPLAS" ;
      edtAlbHdrObs_Internalname = "ALBHDROBS" ;
      cmbAlbProVal.setInternalname( "ALBPROVAL" );
      edtAlbTipEnt_Internalname = "ALBTIPENT" ;
      edtAlbTipArt_Internalname = "ALBTIPART" ;
      edtBarTipArt_Internalname = "BARTIPART" ;
      edtAlbNumcli_Internalname = "ALBNUMCLI" ;
      edtBarNumCli_Internalname = "BARNUMCLI" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarAlbUnd_Internalname = "BARALBUND" ;
      edtBarPreUnd_Internalname = "BARPREUND" ;
      edtBarEstTip_Internalname = "BARESTTIP" ;
      edtAlbCliCod_Internalname = "ALBCLICOD" ;
      edtAlbMetULi_Internalname = "ALBMETULI" ;
      edtBarFasExt_Internalname = "BARFASEXT" ;
      chkBarTipCor.setInternalname( "BARTIPCOR" );
      edtBarGraCob_Internalname = "BARGRACOB" ;
      edtBarTipDis_Internalname = "BARTIPDIS" ;
      edtBarAlbPN_Internalname = "BARALBPN" ;
      edtBarCtrPdas_Internalname = "BARCTRPDAS" ;
      edtAlbDto_Internalname = "ALBDTO" ;
      edtAlbMqTj_Internalname = "ALBMQTJ" ;
      edtAlbDf3_Internalname = "ALBDF3" ;
      edtAlbDf2_Internalname = "ALBDF2" ;
      edtAlbDf1_Internalname = "ALBDF1" ;
      edtAlbCald_Internalname = "ALBCALD" ;
      edtAlbEncA_Internalname = "ALBENCA" ;
      edtAlbEncL_Internalname = "ALBENCL" ;
      edtAlbObsM_Internalname = "ALBOBSM" ;
      edtAlbBarRec_Internalname = "ALBBARREC" ;
      chkBarAcc.setInternalname( "BARACC" );
      edtAlbImpMan_Internalname = "ALBIMPMAN" ;
      cmbBarEstReo.setInternalname( "BARESTREO" );
      edtBarDisNum_Internalname = "BARDISNUM" ;
      edtBarGraAca_Internalname = "BARGRAACA" ;
      edtAlbEncCli_Internalname = "ALBENCCLI" ;
      edtBarEncCli_Internalname = "BARENCCLI" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarTipCol_Internalname = "BARTIPCOL" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtAlbTipCol_Internalname = "ALBTIPCOL" ;
      edtBarPart_Internalname = "BARPART" ;
      edtBarAlbBul_Internalname = "BARALBBUL" ;
      chkDisDes.setInternalname( "DISDES" );
      edtAlbProRec_Internalname = "ALBPROREC" ;
      edtAlbProEsp_Internalname = "ALBPROESP" ;
      edtBarKla_Internalname = "BARKLA" ;
      edtBarMla_Internalname = "BARMLA" ;
      edtBarPlz_Internalname = "BARPLZ" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarFecSal_Internalname = "BARFECSAL" ;
      edtBarAncAca1_Internalname = "BARANCACA1" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarSer_Internalname = "BARSER" ;
      edtGuiFasULin_Internalname = "GUIFASULIN" ;
      edtAlbHdrUlin_Internalname = "ALBHDRULIN" ;
      edtBarAcaAnh_Internalname = "BARACAANH" ;
      edtAlbCadEnc_Internalname = "ALBCADENC" ;
      edtTipAcaCod_Internalname = "TIPACACOD" ;
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
      Form.setCaption( httpContext.getMessage( "ALBBAR", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTipAcaCod_Jsonclick = "" ;
      edtTipAcaCod_Enabled = 1 ;
      edtAlbCadEnc_Jsonclick = "" ;
      edtAlbCadEnc_Enabled = 1 ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtBarAcaAnh_Enabled = 0 ;
      edtAlbHdrUlin_Jsonclick = "" ;
      edtAlbHdrUlin_Enabled = 1 ;
      edtGuiFasULin_Jsonclick = "" ;
      edtGuiFasULin_Enabled = 1 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtBarSit_Jsonclick = "" ;
      edtBarSit_Enabled = 0 ;
      edtBarAncAca1_Jsonclick = "" ;
      edtBarAncAca1_Enabled = 0 ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarFecSal_Enabled = 0 ;
      edtBarPie_Jsonclick = "" ;
      edtBarPie_Enabled = 0 ;
      edtBarPlz_Jsonclick = "" ;
      edtBarPlz_Enabled = 0 ;
      edtBarMla_Jsonclick = "" ;
      edtBarMla_Enabled = 0 ;
      edtBarKla_Jsonclick = "" ;
      edtBarKla_Enabled = 0 ;
      edtAlbProEsp_Jsonclick = "" ;
      edtAlbProEsp_Enabled = 1 ;
      edtAlbProRec_Jsonclick = "" ;
      edtAlbProRec_Enabled = 1 ;
      chkDisDes.setEnabled( 0 );
      edtBarAlbBul_Jsonclick = "" ;
      edtBarAlbBul_Enabled = 1 ;
      edtBarPart_Jsonclick = "" ;
      edtBarPart_Enabled = 0 ;
      edtAlbTipCol_Jsonclick = "" ;
      edtAlbTipCol_Enabled = 1 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNum_Enabled = 0 ;
      edtBarTipCol_Jsonclick = "" ;
      edtBarTipCol_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarEncCli_Jsonclick = "" ;
      edtBarEncCli_Enabled = 0 ;
      edtAlbEncCli_Jsonclick = "" ;
      edtAlbEncCli_Enabled = 1 ;
      edtBarGraAca_Jsonclick = "" ;
      edtBarGraAca_Enabled = 0 ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarDisNum_Enabled = 0 ;
      cmbBarEstReo.setJsonclick( "" );
      cmbBarEstReo.setEnabled( 0 );
      edtAlbImpMan_Jsonclick = "" ;
      edtAlbImpMan_Enabled = 1 ;
      chkBarAcc.setEnabled( 0 );
      edtAlbBarRec_Jsonclick = "" ;
      edtAlbBarRec_Enabled = 1 ;
      edtAlbObsM_Enabled = 1 ;
      edtAlbEncL_Jsonclick = "" ;
      edtAlbEncL_Enabled = 1 ;
      edtAlbEncA_Jsonclick = "" ;
      edtAlbEncA_Enabled = 1 ;
      edtAlbCald_Jsonclick = "" ;
      edtAlbCald_Enabled = 1 ;
      edtAlbDf1_Jsonclick = "" ;
      edtAlbDf1_Enabled = 1 ;
      edtAlbDf2_Jsonclick = "" ;
      edtAlbDf2_Enabled = 1 ;
      edtAlbDf3_Jsonclick = "" ;
      edtAlbDf3_Enabled = 1 ;
      edtAlbMqTj_Jsonclick = "" ;
      edtAlbMqTj_Enabled = 1 ;
      edtAlbDto_Jsonclick = "" ;
      edtAlbDto_Enabled = 1 ;
      edtBarCtrPdas_Jsonclick = "" ;
      edtBarCtrPdas_Enabled = 0 ;
      edtBarAlbPN_Jsonclick = "" ;
      edtBarAlbPN_Enabled = 1 ;
      edtBarTipDis_Jsonclick = "" ;
      edtBarTipDis_Enabled = 0 ;
      edtBarGraCob_Jsonclick = "" ;
      edtBarGraCob_Enabled = 0 ;
      chkBarTipCor.setEnabled( 0 );
      edtBarFasExt_Jsonclick = "" ;
      edtBarFasExt_Enabled = 1 ;
      edtAlbMetULi_Jsonclick = "" ;
      edtAlbMetULi_Enabled = 1 ;
      edtAlbCliCod_Jsonclick = "" ;
      edtAlbCliCod_Enabled = 1 ;
      edtBarEstTip_Jsonclick = "" ;
      edtBarEstTip_Enabled = 0 ;
      edtBarPreUnd_Jsonclick = "" ;
      edtBarPreUnd_Enabled = 1 ;
      edtBarAlbUnd_Jsonclick = "" ;
      edtBarAlbUnd_Enabled = 1 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Enabled = 0 ;
      edtBarNumCli_Jsonclick = "" ;
      edtBarNumCli_Enabled = 0 ;
      edtAlbNumcli_Jsonclick = "" ;
      edtAlbNumcli_Enabled = 1 ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarTipArt_Enabled = 0 ;
      edtAlbTipArt_Jsonclick = "" ;
      edtAlbTipArt_Enabled = 1 ;
      edtAlbTipEnt_Jsonclick = "" ;
      edtAlbTipEnt_Enabled = 1 ;
      cmbAlbProVal.setJsonclick( "" );
      cmbAlbProVal.setEnabled( 1 );
      edtAlbHdrObs_Jsonclick = "" ;
      edtAlbHdrObs_Enabled = 1 ;
      edtBarAlbPlas_Jsonclick = "" ;
      edtBarAlbPlas_Enabled = 1 ;
      edtPlasCod_Jsonclick = "" ;
      edtPlasCod_Enabled = 1 ;
      edtBarAlbTub_Jsonclick = "" ;
      edtBarAlbTub_Enabled = 1 ;
      edtTubCod_Jsonclick = "" ;
      edtTubCod_Enabled = 1 ;
      edtBarAlbPie_Jsonclick = "" ;
      edtBarAlbPie_Enabled = 1 ;
      edtBarPreMtr_Jsonclick = "" ;
      edtBarPreMtr_Enabled = 1 ;
      edtBarAlbMtrE_Jsonclick = "" ;
      edtBarAlbMtrE_Enabled = 1 ;
      edtAlbHdrgm2_Jsonclick = "" ;
      edtAlbHdrgm2_Enabled = 1 ;
      edtAlbHdrAnc_Jsonclick = "" ;
      edtAlbHdrAnc_Enabled = 1 ;
      edtBarPreKgm_Jsonclick = "" ;
      edtBarPreKgm_Enabled = 1 ;
      edtBarAlbKgmE_Jsonclick = "" ;
      edtBarAlbKgmE_Enabled = 1 ;
      edtCodCod_Jsonclick = "" ;
      edtCodCod_Enabled = 1 ;
      edtAlbColNum_Jsonclick = "" ;
      edtAlbColNum_Enabled = 1 ;
      edtAlbNomCli_Jsonclick = "" ;
      edtAlbNomCli_Enabled = 1 ;
      edtAlbColNom_Jsonclick = "" ;
      edtAlbColNom_Enabled = 1 ;
      edtAlbSerD_Jsonclick = "" ;
      edtAlbSerD_Enabled = 1 ;
      edtAlbSer_Jsonclick = "" ;
      edtAlbSer_Enabled = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 1 ;
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
      cmbAlbProVal.setName( "ALBPROVAL" );
      cmbAlbProVal.setWebtags( "" );
      cmbAlbProVal.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbAlbProVal.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", A2839AlbProVal);
      }
      chkBarTipCor.setName( "BARTIPCOR" );
      chkBarTipCor.setWebtags( "" );
      chkBarTipCor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarTipCor.getInternalname(), "TitleCaption", chkBarTipCor.getCaption(), true);
      chkBarTipCor.setCheckedValue( "NO" );
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      chkBarAcc.setName( "BARACC" );
      chkBarAcc.setWebtags( "" );
      chkBarAcc.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkBarAcc.getInternalname(), "TitleCaption", chkBarAcc.getCaption(), true);
      chkBarAcc.setCheckedValue( "N" );
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
      cmbBarEstReo.setName( "BARESTREO" );
      cmbBarEstReo.setWebtags( "" );
      cmbBarEstReo.addItem("0", httpContext.getMessage( "Normal", ""), (short)(0));
      cmbBarEstReo.addItem("1", httpContext.getMessage( "No Conformidad", ""), (short)(0));
      cmbBarEstReo.addItem("2", httpContext.getMessage( "Reclamacion", ""), (short)(0));
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      }
      chkDisDes.setName( "DISDES" );
      chkDisDes.setWebtags( "" );
      chkDisDes.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkDisDes.getInternalname(), "TitleCaption", chkDisDes.getCaption(), true);
      chkDisDes.setCheckedValue( "N" );
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01Q649 */
      pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(39);
      /* Using cursor T01Q631 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01Q631_A361DisCod[0] ;
      A1235BarNumCli = T01Q631_A1235BarNumCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1235BarNumCli), 6, 0));
      A1234BarNomCli = T01Q631_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      A5034BarEstTip = T01Q631_A5034BarEstTip[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", A5034BarEstTip);
      A5291BarTipCor = T01Q631_A5291BarTipCor[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", A5291BarTipCor);
      A5027BarGraCob = T01Q631_A5027BarGraCob[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5027BarGraCob), 2, 0));
      A2010BarTipDis = T01Q631_A2010BarTipDis[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", A2010BarTipDis);
      A4937BarCtrPdas = T01Q631_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01Q631_n4937BarCtrPdas[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.str( A4937BarCtrPdas, 1, 0));
      A5253BarAcc = T01Q631_A5253BarAcc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", A5253BarAcc);
      A148BarEstReo = T01Q631_A148BarEstReo[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.str( A148BarEstReo, 1, 0));
      A143BarDisNum = T01Q631_A143BarDisNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", A143BarDisNum);
      A1909BarGraAca = T01Q631_A1909BarGraAca[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1909BarGraAca), 4, 0));
      A4812BarEncCli = T01Q631_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A1652BarSerDsc = T01Q631_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A218BarTipCol = T01Q631_A218BarTipCol[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A218BarTipCol), 2, 0));
      A136BarColNum = T01Q631_A136BarColNum[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A136BarColNum), 6, 0));
      A135BarColNom = T01Q631_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A1503BarPart = T01Q631_A1503BarPart[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1503BarPart), 4, 0));
      A161BarFecSal = T01Q631_A161BarFecSal[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
      A125BarAncAca1 = T01Q631_A125BarAncAca1[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A125BarAncAca1), 3, 0));
      A213BarSit = T01Q631_A213BarSit[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(A213BarSit), 2, 0));
      A212BarSer = T01Q631_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A4466BarAcaAnh = T01Q631_A4466BarAcaAnh[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4466BarAcaAnh), 4, 0));
      A252CliCod = T01Q631_A252CliCod[0] ;
      n252CliCod = T01Q631_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A217BarTipArt = T01Q631_A217BarTipArt[0] ;
      n217BarTipArt = T01Q631_n217BarTipArt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A217BarTipArt), 4, 0));
      pr_default.close(23);
      /* Using cursor T01Q632 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A365DisDes = T01Q632_A365DisDes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", A365DisDes);
      pr_default.close(24);
      /* Using cursor T01Q634 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A1279BarKla = T01Q634_A1279BarKla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A1280BarMla = T01Q634_A1280BarMla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1292BarPlz = T01Q634_A1292BarPlz[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      }
      else
      {
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1292BarPlz = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1292BarPlz), 4, 0));
      }
      pr_default.close(25);
      /* Using cursor T01Q636 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A898BarPieNDes = T01Q636_A898BarPieNDes[0] ;
         A199BarPie1 = T01Q636_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(A898BarPieNDes), 6, 0));
         A199BarPie1 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrimstr( DecimalUtil.doubleToDec(A199BarPie1), 4, 0));
      }
      pr_default.close(26);
      GX_FocusControl = edtAlbSer_Internalname ;
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

   public void valid_Albprocod( )
   {
      /* Using cursor T01Q649 */
      pr_default.execute(39, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CALPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBPROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(39);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Barcodpar( )
   {
      A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValue())) ;
      cmbBarEstReo.setValue( GXutil.str( A148BarEstReo, 1, 0) );
      A2839AlbProVal = cmbAlbProVal.getValue() ;
      cmbAlbProVal.setValue( A2839AlbProVal );
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01Q631 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A361DisCod = T01Q631_A361DisCod[0] ;
      A1235BarNumCli = T01Q631_A1235BarNumCli[0] ;
      A1234BarNomCli = T01Q631_A1234BarNomCli[0] ;
      A5034BarEstTip = T01Q631_A5034BarEstTip[0] ;
      A5291BarTipCor = T01Q631_A5291BarTipCor[0] ;
      A5027BarGraCob = T01Q631_A5027BarGraCob[0] ;
      A2010BarTipDis = T01Q631_A2010BarTipDis[0] ;
      A4937BarCtrPdas = T01Q631_A4937BarCtrPdas[0] ;
      n4937BarCtrPdas = T01Q631_n4937BarCtrPdas[0] ;
      A5253BarAcc = T01Q631_A5253BarAcc[0] ;
      A148BarEstReo = T01Q631_A148BarEstReo[0] ;
      cmbBarEstReo.setValue( GXutil.str( A148BarEstReo, 1, 0) );
      A143BarDisNum = T01Q631_A143BarDisNum[0] ;
      A1909BarGraAca = T01Q631_A1909BarGraAca[0] ;
      A4812BarEncCli = T01Q631_A4812BarEncCli[0] ;
      A1652BarSerDsc = T01Q631_A1652BarSerDsc[0] ;
      A218BarTipCol = T01Q631_A218BarTipCol[0] ;
      A136BarColNum = T01Q631_A136BarColNum[0] ;
      A135BarColNom = T01Q631_A135BarColNom[0] ;
      A1503BarPart = T01Q631_A1503BarPart[0] ;
      A161BarFecSal = T01Q631_A161BarFecSal[0] ;
      A125BarAncAca1 = T01Q631_A125BarAncAca1[0] ;
      A213BarSit = T01Q631_A213BarSit[0] ;
      A212BarSer = T01Q631_A212BarSer[0] ;
      A4466BarAcaAnh = T01Q631_A4466BarAcaAnh[0] ;
      A252CliCod = T01Q631_A252CliCod[0] ;
      n252CliCod = T01Q631_n252CliCod[0] ;
      A217BarTipArt = T01Q631_A217BarTipArt[0] ;
      n217BarTipArt = T01Q631_n217BarTipArt[0] ;
      pr_default.close(23);
      /* Using cursor T01Q632 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(24) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A365DisDes = T01Q632_A365DisDes[0] ;
      pr_default.close(24);
      /* Using cursor T01Q634 */
      pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A1279BarKla = T01Q634_A1279BarKla[0] ;
         A1280BarMla = T01Q634_A1280BarMla[0] ;
         A1292BarPlz = T01Q634_A1292BarPlz[0] ;
      }
      else
      {
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         A1292BarPlz = (short)(0) ;
      }
      pr_default.close(25);
      /* Using cursor T01Q636 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(26) != 101) )
      {
         A898BarPieNDes = T01Q636_A898BarPieNDes[0] ;
         A199BarPie1 = T01Q636_A199BarPie1[0] ;
      }
      else
      {
         A898BarPieNDes = 0 ;
         A199BarPie1 = (short)(0) ;
      }
      pr_default.close(26);
      if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
      {
         A198BarPie = A898BarPieNDes ;
      }
      else
      {
         A198BarPie = A199BarPie1 ;
      }
      dynload_actions( ) ;
      if ( cmbAlbProVal.getItemCount() > 0 )
      {
         A2839AlbProVal = cmbAlbProVal.getValidValue(A2839AlbProVal) ;
         cmbAlbProVal.setValue( A2839AlbProVal );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
      }
      A5291BarTipCor = ((GXutil.strcmp(GXutil.rtrim( A5291BarTipCor), "SI")==0) ? "SI" : "NO") ;
      A5253BarAcc = ((GXutil.strcmp(GXutil.rtrim( A5253BarAcc), "S")==0) ? "S" : "N") ;
      if ( cmbBarEstReo.getItemCount() > 0 )
      {
         A148BarEstReo = (byte)(GXutil.lval( cmbBarEstReo.getValidValue(GXutil.trim( GXutil.str( A148BarEstReo, 1, 0))))) ;
         cmbBarEstReo.setValue( GXutil.str( A148BarEstReo, 1, 0) );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      }
      A365DisDes = ((GXutil.strcmp(GXutil.rtrim( A365DisDes), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A3391AlbSer", GXutil.rtrim( A3391AlbSer));
      httpContext.ajax_rsp_assign_attri("", false, "A8879AlbSerD", GXutil.rtrim( A8879AlbSerD));
      httpContext.ajax_rsp_assign_attri("", false, "A3392AlbColNom", GXutil.rtrim( A3392AlbColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A12232AlbNomCli", GXutil.rtrim( A12232AlbNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A3393AlbColNum", GXutil.ltrim( localUtil.ntoc( A3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3153CodCod", GXutil.rtrim( A3153CodCod));
      httpContext.ajax_rsp_assign_attri("", false, "A1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( A1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1262BarPreKgm", GXutil.ltrim( localUtil.ntoc( A1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3271AlbHdrAnc", GXutil.ltrim( localUtil.ntoc( A3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5019AlbHdrgm2", GXutil.ltrim( localUtil.ntoc( A5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( A1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1264BarPreMtr", GXutil.ltrim( localUtil.ntoc( A1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1265BarAlbPie", GXutil.ltrim( localUtil.ntoc( A1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1206TubCod", GXutil.ltrim( localUtil.ntoc( A1206TubCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1266BarAlbTub", GXutil.ltrim( localUtil.ntoc( A1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6466PlasCod", GXutil.ltrim( localUtil.ntoc( A6466PlasCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6467BarAlbPlas", GXutil.ltrim( localUtil.ntoc( A6467BarAlbPlas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2441AlbHdrObs", GXutil.rtrim( A2441AlbHdrObs));
      httpContext.ajax_rsp_assign_attri("", false, "A2839AlbProVal", GXutil.rtrim( A2839AlbProVal));
      cmbAlbProVal.setValue( GXutil.rtrim( A2839AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProVal.getInternalname(), "Values", cmbAlbProVal.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A1095AlbTipEnt", GXutil.rtrim( A1095AlbTipEnt));
      httpContext.ajax_rsp_assign_attri("", false, "A12234AlbTipArt", GXutil.ltrim( localUtil.ntoc( A12234AlbTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12233AlbNumcli", GXutil.ltrim( localUtil.ntoc( A12233AlbNumcli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12195BarAlbUnd", GXutil.ltrim( localUtil.ntoc( A12195BarAlbUnd, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12196BarPreUnd", GXutil.ltrim( localUtil.ntoc( A12196BarPreUnd, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3886AlbCliCod", GXutil.ltrim( localUtil.ntoc( A3886AlbCliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6645AlbMetULi", GXutil.ltrim( localUtil.ntoc( A6645AlbMetULi, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2398BarFasExt", GXutil.rtrim( A2398BarFasExt));
      httpContext.ajax_rsp_assign_attri("", false, "A1461BarAlbPN", GXutil.ltrim( localUtil.ntoc( A1461BarAlbPN, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7994AlbDto", GXutil.ltrim( localUtil.ntoc( A7994AlbDto, (byte)(6), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7993AlbMqTj", GXutil.rtrim( A7993AlbMqTj));
      httpContext.ajax_rsp_assign_attri("", false, "A7992AlbDf3", GXutil.rtrim( A7992AlbDf3));
      httpContext.ajax_rsp_assign_attri("", false, "A7991AlbDf2", GXutil.rtrim( A7991AlbDf2));
      httpContext.ajax_rsp_assign_attri("", false, "A7990AlbDf1", GXutil.rtrim( A7990AlbDf1));
      httpContext.ajax_rsp_assign_attri("", false, "A7989AlbCald", GXutil.rtrim( A7989AlbCald));
      httpContext.ajax_rsp_assign_attri("", false, "A7104AlbEncA", GXutil.ltrim( localUtil.ntoc( A7104AlbEncA, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7103AlbEncL", GXutil.ltrim( localUtil.ntoc( A7103AlbEncL, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6814AlbObsM", A6814AlbObsM);
      httpContext.ajax_rsp_assign_attri("", false, "A2761AlbBarRec", GXutil.ltrim( localUtil.ntoc( A2761AlbBarRec, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5354AlbImpMan", GXutil.ltrim( localUtil.ntoc( A5354AlbImpMan, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4815AlbEncCli", GXutil.rtrim( A4815AlbEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A3394AlbTipCol", GXutil.ltrim( localUtil.ntoc( A3394AlbTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1458BarAlbBul", GXutil.ltrim( localUtil.ntoc( A1458BarAlbBul, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A40AlbProRec", GXutil.ltrim( localUtil.ntoc( A40AlbProRec, (byte)(13), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A32AlbProEsp", GXutil.ltrim( localUtil.ntoc( A32AlbProEsp, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( A1248GuiFasULin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2763AlbHdrUlin", GXutil.ltrim( localUtil.ntoc( A2763AlbHdrUlin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12905AlbCadEnc", GXutil.ltrim( localUtil.ntoc( A12905AlbCadEnc, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5051TipAcaCod", GXutil.ltrim( localUtil.ntoc( A5051TipAcaCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1235BarNumCli", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", GXutil.rtrim( A1234BarNomCli));
      httpContext.ajax_rsp_assign_attri("", false, "A5034BarEstTip", GXutil.rtrim( A5034BarEstTip));
      httpContext.ajax_rsp_assign_attri("", false, "A5291BarTipCor", GXutil.rtrim( A5291BarTipCor));
      httpContext.ajax_rsp_assign_attri("", false, "A5027BarGraCob", GXutil.ltrim( localUtil.ntoc( A5027BarGraCob, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2010BarTipDis", GXutil.rtrim( A2010BarTipDis));
      httpContext.ajax_rsp_assign_attri("", false, "A4937BarCtrPdas", GXutil.ltrim( localUtil.ntoc( A4937BarCtrPdas, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5253BarAcc", GXutil.rtrim( A5253BarAcc));
      httpContext.ajax_rsp_assign_attri("", false, "A148BarEstReo", GXutil.ltrim( localUtil.ntoc( A148BarEstReo, (byte)(1), (byte)(0), ".", "")));
      cmbBarEstReo.setValue( GXutil.trim( GXutil.str( A148BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbBarEstReo.getInternalname(), "Values", cmbBarEstReo.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A143BarDisNum", GXutil.rtrim( A143BarDisNum));
      httpContext.ajax_rsp_assign_attri("", false, "A1909BarGraAca", GXutil.ltrim( localUtil.ntoc( A1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", GXutil.rtrim( A4812BarEncCli));
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", GXutil.rtrim( A1652BarSerDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A218BarTipCol", GXutil.ltrim( localUtil.ntoc( A218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A136BarColNum", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", GXutil.rtrim( A135BarColNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1503BarPart", GXutil.ltrim( localUtil.ntoc( A1503BarPart, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A161BarFecSal", localUtil.format(A161BarFecSal, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A125BarAncAca1", GXutil.ltrim( localUtil.ntoc( A125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A213BarSit", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", GXutil.rtrim( A212BarSer));
      httpContext.ajax_rsp_assign_attri("", false, "A4466BarAcaAnh", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A217BarTipArt", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A365DisDes", GXutil.rtrim( A365DisDes));
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1292BarPlz", GXutil.ltrim( localUtil.ntoc( A1292BarPlz, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A898BarPieNDes", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A199BarPie1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3391AlbSer", GXutil.rtrim( Z3391AlbSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8879AlbSerD", GXutil.rtrim( Z8879AlbSerD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3392AlbColNom", GXutil.rtrim( Z3392AlbColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12232AlbNomCli", GXutil.rtrim( Z12232AlbNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3393AlbColNum", GXutil.ltrim( localUtil.ntoc( Z3393AlbColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3153CodCod", GXutil.rtrim( Z3153CodCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1261BarAlbKgmE", GXutil.ltrim( localUtil.ntoc( Z1261BarAlbKgmE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1262BarPreKgm", GXutil.ltrim( localUtil.ntoc( Z1262BarPreKgm, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3271AlbHdrAnc", GXutil.ltrim( localUtil.ntoc( Z3271AlbHdrAnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5019AlbHdrgm2", GXutil.ltrim( localUtil.ntoc( Z5019AlbHdrgm2, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1263BarAlbMtrE", GXutil.ltrim( localUtil.ntoc( Z1263BarAlbMtrE, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1264BarPreMtr", GXutil.ltrim( localUtil.ntoc( Z1264BarPreMtr, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1265BarAlbPie", GXutil.ltrim( localUtil.ntoc( Z1265BarAlbPie, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1206TubCod", GXutil.ltrim( localUtil.ntoc( Z1206TubCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1266BarAlbTub", GXutil.ltrim( localUtil.ntoc( Z1266BarAlbTub, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6466PlasCod", GXutil.ltrim( localUtil.ntoc( Z6466PlasCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6467BarAlbPlas", GXutil.ltrim( localUtil.ntoc( Z6467BarAlbPlas, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2441AlbHdrObs", GXutil.rtrim( Z2441AlbHdrObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2839AlbProVal", GXutil.rtrim( Z2839AlbProVal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1095AlbTipEnt", GXutil.rtrim( Z1095AlbTipEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12234AlbTipArt", GXutil.ltrim( localUtil.ntoc( Z12234AlbTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12233AlbNumcli", GXutil.ltrim( localUtil.ntoc( Z12233AlbNumcli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12195BarAlbUnd", GXutil.ltrim( localUtil.ntoc( Z12195BarAlbUnd, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12196BarPreUnd", GXutil.ltrim( localUtil.ntoc( Z12196BarPreUnd, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3886AlbCliCod", GXutil.ltrim( localUtil.ntoc( Z3886AlbCliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6645AlbMetULi", GXutil.ltrim( localUtil.ntoc( Z6645AlbMetULi, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2398BarFasExt", GXutil.rtrim( Z2398BarFasExt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1461BarAlbPN", GXutil.ltrim( localUtil.ntoc( Z1461BarAlbPN, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7994AlbDto", GXutil.ltrim( localUtil.ntoc( Z7994AlbDto, (byte)(6), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7993AlbMqTj", GXutil.rtrim( Z7993AlbMqTj));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7992AlbDf3", GXutil.rtrim( Z7992AlbDf3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7991AlbDf2", GXutil.rtrim( Z7991AlbDf2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7990AlbDf1", GXutil.rtrim( Z7990AlbDf1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7989AlbCald", GXutil.rtrim( Z7989AlbCald));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7104AlbEncA", GXutil.ltrim( localUtil.ntoc( Z7104AlbEncA, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7103AlbEncL", GXutil.ltrim( localUtil.ntoc( Z7103AlbEncL, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6814AlbObsM", Z6814AlbObsM);
      app.GxWebStd.gx_hidden_field( httpContext, "Z2761AlbBarRec", GXutil.ltrim( localUtil.ntoc( Z2761AlbBarRec, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5354AlbImpMan", GXutil.ltrim( localUtil.ntoc( Z5354AlbImpMan, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4815AlbEncCli", GXutil.rtrim( Z4815AlbEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3394AlbTipCol", GXutil.ltrim( localUtil.ntoc( Z3394AlbTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1458BarAlbBul", GXutil.ltrim( localUtil.ntoc( Z1458BarAlbBul, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z40AlbProRec", GXutil.ltrim( localUtil.ntoc( Z40AlbProRec, (byte)(13), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z32AlbProEsp", GXutil.ltrim( localUtil.ntoc( Z32AlbProEsp, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1248GuiFasULin", GXutil.ltrim( localUtil.ntoc( Z1248GuiFasULin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2763AlbHdrUlin", GXutil.ltrim( localUtil.ntoc( Z2763AlbHdrUlin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12905AlbCadEnc", GXutil.ltrim( localUtil.ntoc( Z12905AlbCadEnc, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5051TipAcaCod", GXutil.ltrim( localUtil.ntoc( Z5051TipAcaCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1235BarNumCli", GXutil.ltrim( localUtil.ntoc( Z1235BarNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1234BarNomCli", GXutil.rtrim( Z1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5034BarEstTip", GXutil.rtrim( Z5034BarEstTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5291BarTipCor", GXutil.rtrim( Z5291BarTipCor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5027BarGraCob", GXutil.ltrim( localUtil.ntoc( Z5027BarGraCob, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2010BarTipDis", GXutil.rtrim( Z2010BarTipDis));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4937BarCtrPdas", GXutil.ltrim( localUtil.ntoc( Z4937BarCtrPdas, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5253BarAcc", GXutil.rtrim( Z5253BarAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z148BarEstReo", GXutil.ltrim( localUtil.ntoc( Z148BarEstReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z143BarDisNum", GXutil.rtrim( Z143BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1909BarGraAca", GXutil.ltrim( localUtil.ntoc( Z1909BarGraAca, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4812BarEncCli", GXutil.rtrim( Z4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1652BarSerDsc", GXutil.rtrim( Z1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z218BarTipCol", GXutil.ltrim( localUtil.ntoc( Z218BarTipCol, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z136BarColNum", GXutil.ltrim( localUtil.ntoc( Z136BarColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z135BarColNom", GXutil.rtrim( Z135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1503BarPart", GXutil.ltrim( localUtil.ntoc( Z1503BarPart, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z161BarFecSal", localUtil.format(Z161BarFecSal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z125BarAncAca1", GXutil.ltrim( localUtil.ntoc( Z125BarAncAca1, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z213BarSit", GXutil.ltrim( localUtil.ntoc( Z213BarSit, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z212BarSer", GXutil.rtrim( Z212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4466BarAcaAnh", GXutil.ltrim( localUtil.ntoc( Z4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z217BarTipArt", GXutil.ltrim( localUtil.ntoc( Z217BarTipArt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z365DisDes", GXutil.rtrim( Z365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1279BarKla", GXutil.ltrim( localUtil.ntoc( Z1279BarKla, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1280BarMla", GXutil.ltrim( localUtil.ntoc( Z1280BarMla, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1292BarPlz", GXutil.ltrim( localUtil.ntoc( Z1292BarPlz, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z898BarPieNDes", GXutil.ltrim( localUtil.ntoc( Z898BarPieNDes, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z199BarPie1", GXutil.ltrim( localUtil.ntoc( Z199BarPie1, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z198BarPie", GXutil.ltrim( localUtil.ntoc( Z198BarPie, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Codcod( )
   {
      n3153CodCod = false ;
      /* Using cursor T01Q650 */
      pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n3153CodCod), A3153CodCod});
      if ( (pr_default.getStatus(40) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A3153CodCod)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODFAC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CODCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(40);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Tubcod( )
   {
      n1206TubCod = false ;
      /* Using cursor T01Q651 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n1206TubCod), Short.valueOf(A1206TubCod)});
      if ( (pr_default.getStatus(41) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A1206TubCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TUBOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TUBCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(41);
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_BARCOD",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_BARCODREO",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'cmbBarEstReo'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'cmbAlbProVal'},{av:'A2839AlbProVal',fld:'ALBPROVAL',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A3391AlbSer',fld:'ALBSER',pic:''},{av:'A8879AlbSerD',fld:'ALBSERD',pic:''},{av:'A3392AlbColNom',fld:'ALBCOLNOM',pic:''},{av:'A12232AlbNomCli',fld:'ALBNOMCLI',pic:''},{av:'A3393AlbColNum',fld:'ALBCOLNUM',pic:'ZZZZZ9'},{av:'A3153CodCod',fld:'CODCOD',pic:'XXXXXX'},{av:'A1261BarAlbKgmE',fld:'BARALBKGME',pic:'ZZZZZ9.99'},{av:'A1262BarPreKgm',fld:'BARPREKGM',pic:'ZZZZZZ9.999'},{av:'A3271AlbHdrAnc',fld:'ALBHDRANC',pic:'ZZZ9'},{av:'A5019AlbHdrgm2',fld:'ALBHDRGM2',pic:'ZZZ9'},{av:'A1263BarAlbMtrE',fld:'BARALBMTRE',pic:'ZZZZZ9.99'},{av:'A1264BarPreMtr',fld:'BARPREMTR',pic:'ZZZZZZ9.999'},{av:'A1265BarAlbPie',fld:'BARALBPIE',pic:'ZZZZZ9'},{av:'A1206TubCod',fld:'TUBCOD',pic:'ZZZ9'},{av:'A1266BarAlbTub',fld:'BARALBTUB',pic:'ZZZ9'},{av:'A6466PlasCod',fld:'PLASCOD',pic:'ZZZ9'},{av:'A6467BarAlbPlas',fld:'BARALBPLAS',pic:'ZZZ9'},{av:'A2441AlbHdrObs',fld:'ALBHDROBS',pic:''},{av:'cmbAlbProVal'},{av:'A2839AlbProVal',fld:'ALBPROVAL',pic:'@!'},{av:'A1095AlbTipEnt',fld:'ALBTIPENT',pic:'@!'},{av:'A12234AlbTipArt',fld:'ALBTIPART',pic:'ZZZ9'},{av:'A12233AlbNumcli',fld:'ALBNUMCLI',pic:'ZZZZZ9'},{av:'A12195BarAlbUnd',fld:'BARALBUND',pic:'ZZZZZ9'},{av:'A12196BarPreUnd',fld:'BARPREUND',pic:'ZZZZZZ9.99999'},{av:'A3886AlbCliCod',fld:'ALBCLICOD',pic:'ZZZZZ9'},{av:'A6645AlbMetULi',fld:'ALBMETULI',pic:'ZZZ9'},{av:'A2398BarFasExt',fld:'BARFASEXT',pic:''},{av:'A1461BarAlbPN',fld:'BARALBPN',pic:'ZZZZZ9.99'},{av:'A7994AlbDto',fld:'ALBDTO',pic:'Z9.999'},{av:'A7993AlbMqTj',fld:'ALBMQTJ',pic:''},{av:'A7992AlbDf3',fld:'ALBDF3',pic:''},{av:'A7991AlbDf2',fld:'ALBDF2',pic:''},{av:'A7990AlbDf1',fld:'ALBDF1',pic:''},{av:'A7989AlbCald',fld:'ALBCALD',pic:''},{av:'A7104AlbEncA',fld:'ALBENCA',pic:'ZZZ9.99'},{av:'A7103AlbEncL',fld:'ALBENCL',pic:'ZZZ9.99'},{av:'A6814AlbObsM',fld:'ALBOBSM',pic:''},{av:'A2761AlbBarRec',fld:'ALBBARREC',pic:'ZZ9.99'},{av:'A5354AlbImpMan',fld:'ALBIMPMAN',pic:'ZZZZZZZ9.99'},{av:'A4815AlbEncCli',fld:'ALBENCCLI',pic:''},{av:'A3394AlbTipCol',fld:'ALBTIPCOL',pic:'Z9'},{av:'A1458BarAlbBul',fld:'BARALBBUL',pic:'ZZZ9'},{av:'A40AlbProRec',fld:'ALBPROREC',pic:'ZZZZZZ9.99'},{av:'A32AlbProEsp',fld:'ALBPROESP',pic:'99'},{av:'A1248GuiFasULin',fld:'GUIFASULIN',pic:'ZZZ9'},{av:'A2763AlbHdrUlin',fld:'ALBHDRULIN',pic:'ZZZ9'},{av:'A12905AlbCadEnc',fld:'ALBCADENC',pic:'ZZZ9'},{av:'A5051TipAcaCod',fld:'TIPACACOD',pic:'ZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A5034BarEstTip',fld:'BARESTTIP',pic:''},{av:'A5027BarGraCob',fld:'BARGRACOB',pic:'Z9'},{av:'A2010BarTipDis',fld:'BARTIPDIS',pic:'@!'},{av:'A4937BarCtrPdas',fld:'BARCTRPDAS',pic:'9'},{av:'cmbBarEstReo'},{av:'A148BarEstReo',fld:'BARESTREO',pic:'9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A1909BarGraAca',fld:'BARGRAACA',pic:'ZZZ9'},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A218BarTipCol',fld:'BARTIPCOL',pic:'Z9'},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A1503BarPart',fld:'BARPART',pic:'ZZZ9'},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A125BarAncAca1',fld:'BARANCACA1',pic:'ZZ9'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A4466BarAcaAnh',fld:'BARACAANH',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1292BarPlz',fld:'BARPLZ',pic:'ZZZ9'},{av:'A898BarPieNDes',fld:'BARPIENDES',pic:'ZZZZZ9'},{av:'A199BarPie1',fld:'BARPIE1',pic:'ZZZ9'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z30AlbProCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z3391AlbSer'},{av:'Z8879AlbSerD'},{av:'Z3392AlbColNom'},{av:'Z12232AlbNomCli'},{av:'Z3393AlbColNum'},{av:'Z3153CodCod'},{av:'Z1261BarAlbKgmE'},{av:'Z1262BarPreKgm'},{av:'Z3271AlbHdrAnc'},{av:'Z5019AlbHdrgm2'},{av:'Z1263BarAlbMtrE'},{av:'Z1264BarPreMtr'},{av:'Z1265BarAlbPie'},{av:'Z1206TubCod'},{av:'Z1266BarAlbTub'},{av:'Z6466PlasCod'},{av:'Z6467BarAlbPlas'},{av:'Z2441AlbHdrObs'},{av:'Z2839AlbProVal'},{av:'Z1095AlbTipEnt'},{av:'Z12234AlbTipArt'},{av:'Z12233AlbNumcli'},{av:'Z12195BarAlbUnd'},{av:'Z12196BarPreUnd'},{av:'Z3886AlbCliCod'},{av:'Z6645AlbMetULi'},{av:'Z2398BarFasExt'},{av:'Z1461BarAlbPN'},{av:'Z7994AlbDto'},{av:'Z7993AlbMqTj'},{av:'Z7992AlbDf3'},{av:'Z7991AlbDf2'},{av:'Z7990AlbDf1'},{av:'Z7989AlbCald'},{av:'Z7104AlbEncA'},{av:'Z7103AlbEncL'},{av:'Z6814AlbObsM'},{av:'Z2761AlbBarRec'},{av:'Z5354AlbImpMan'},{av:'Z4815AlbEncCli'},{av:'Z3394AlbTipCol'},{av:'Z1458BarAlbBul'},{av:'Z40AlbProRec'},{av:'Z32AlbProEsp'},{av:'Z1248GuiFasULin'},{av:'Z2763AlbHdrUlin'},{av:'Z12905AlbCadEnc'},{av:'Z5051TipAcaCod'},{av:'Z361DisCod'},{av:'Z1235BarNumCli'},{av:'Z1234BarNomCli'},{av:'Z5034BarEstTip'},{av:'Z5291BarTipCor'},{av:'Z5027BarGraCob'},{av:'Z2010BarTipDis'},{av:'Z4937BarCtrPdas'},{av:'Z5253BarAcc'},{av:'Z148BarEstReo'},{av:'Z143BarDisNum'},{av:'Z1909BarGraAca'},{av:'Z4812BarEncCli'},{av:'Z1652BarSerDsc'},{av:'Z218BarTipCol'},{av:'Z136BarColNum'},{av:'Z135BarColNom'},{av:'Z1503BarPart'},{av:'Z161BarFecSal'},{av:'Z125BarAncAca1'},{av:'Z213BarSit'},{av:'Z212BarSer'},{av:'Z4466BarAcaAnh'},{av:'Z252CliCod'},{av:'Z217BarTipArt'},{av:'Z365DisDes'},{av:'Z1279BarKla'},{av:'Z1280BarMla'},{av:'Z1292BarPlz'},{av:'Z898BarPieNDes'},{av:'Z199BarPie1'},{av:'Z198BarPie'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_CODCOD","{handler:'valid_Codcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A3153CodCod',fld:'CODCOD',pic:'XXXXXX'},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_CODCOD",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_TUBCOD","{handler:'valid_Tubcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1206TubCod',fld:'TUBCOD',pic:'ZZZ9'},{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_TUBCOD",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
      setEventMetadata("VALID_DISDES","{handler:'valid_Disdes',iparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]");
      setEventMetadata("VALID_DISDES",",oparms:[{av:'A5291BarTipCor',fld:'BARTIPCOR',pic:''},{av:'A5253BarAcc',fld:'BARACC',pic:'@!'},{av:'A365DisDes',fld:'DISDES',pic:'@!'}]}");
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
      pr_default.close(23);
      pr_default.close(41);
      pr_default.close(39);
      pr_default.close(40);
      pr_default.close(24);
      pr_default.close(25);
      pr_default.close(26);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z3391AlbSer = "" ;
      Z8879AlbSerD = "" ;
      Z3392AlbColNom = "" ;
      Z12232AlbNomCli = "" ;
      Z1261BarAlbKgmE = DecimalUtil.ZERO ;
      Z1262BarPreKgm = DecimalUtil.ZERO ;
      Z1263BarAlbMtrE = DecimalUtil.ZERO ;
      Z1264BarPreMtr = DecimalUtil.ZERO ;
      Z2441AlbHdrObs = "" ;
      Z2839AlbProVal = "" ;
      Z1095AlbTipEnt = "" ;
      Z12196BarPreUnd = DecimalUtil.ZERO ;
      Z2398BarFasExt = "" ;
      Z1461BarAlbPN = DecimalUtil.ZERO ;
      Z7994AlbDto = DecimalUtil.ZERO ;
      Z7993AlbMqTj = "" ;
      Z7992AlbDf3 = "" ;
      Z7991AlbDf2 = "" ;
      Z7990AlbDf1 = "" ;
      Z7989AlbCald = "" ;
      Z7104AlbEncA = DecimalUtil.ZERO ;
      Z7103AlbEncL = DecimalUtil.ZERO ;
      Z6814AlbObsM = "" ;
      Z2761AlbBarRec = DecimalUtil.ZERO ;
      Z5354AlbImpMan = DecimalUtil.ZERO ;
      Z4815AlbEncCli = "" ;
      Z40AlbProRec = DecimalUtil.ZERO ;
      Z3153CodCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A3153CodCod = "" ;
      A130BarCodPar = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A2839AlbProVal = "" ;
      A5291BarTipCor = "" ;
      A5253BarAcc = "" ;
      A365DisDes = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A3391AlbSer = "" ;
      A8879AlbSerD = "" ;
      A3392AlbColNom = "" ;
      A12232AlbNomCli = "" ;
      A1261BarAlbKgmE = DecimalUtil.ZERO ;
      A1262BarPreKgm = DecimalUtil.ZERO ;
      A1263BarAlbMtrE = DecimalUtil.ZERO ;
      A1264BarPreMtr = DecimalUtil.ZERO ;
      A2441AlbHdrObs = "" ;
      A1095AlbTipEnt = "" ;
      A1234BarNomCli = "" ;
      A12196BarPreUnd = DecimalUtil.ZERO ;
      A5034BarEstTip = "" ;
      A2398BarFasExt = "" ;
      A2010BarTipDis = "" ;
      A1461BarAlbPN = DecimalUtil.ZERO ;
      A7994AlbDto = DecimalUtil.ZERO ;
      A7993AlbMqTj = "" ;
      A7992AlbDf3 = "" ;
      A7991AlbDf2 = "" ;
      A7990AlbDf1 = "" ;
      A7989AlbCald = "" ;
      A7104AlbEncA = DecimalUtil.ZERO ;
      A7103AlbEncL = DecimalUtil.ZERO ;
      A6814AlbObsM = "" ;
      A2761AlbBarRec = DecimalUtil.ZERO ;
      A5354AlbImpMan = DecimalUtil.ZERO ;
      A143BarDisNum = "" ;
      A4815AlbEncCli = "" ;
      A4812BarEncCli = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A40AlbProRec = DecimalUtil.ZERO ;
      A1279BarKla = DecimalUtil.ZERO ;
      A1280BarMla = DecimalUtil.ZERO ;
      A161BarFecSal = GXutil.nullDate() ;
      A212BarSer = "" ;
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
      Z1234BarNomCli = "" ;
      Z5034BarEstTip = "" ;
      Z5291BarTipCor = "" ;
      Z2010BarTipDis = "" ;
      Z5253BarAcc = "" ;
      Z143BarDisNum = "" ;
      Z4812BarEncCli = "" ;
      Z1652BarSerDsc = "" ;
      Z135BarColNom = "" ;
      Z161BarFecSal = GXutil.nullDate() ;
      Z212BarSer = "" ;
      Z365DisDes = "" ;
      Z1279BarKla = DecimalUtil.ZERO ;
      Z1280BarMla = DecimalUtil.ZERO ;
      T01Q615_A361DisCod = new int[1] ;
      T01Q615_A3391AlbSer = new String[] {""} ;
      T01Q615_A8879AlbSerD = new String[] {""} ;
      T01Q615_A3392AlbColNom = new String[] {""} ;
      T01Q615_A12232AlbNomCli = new String[] {""} ;
      T01Q615_A3393AlbColNum = new int[1] ;
      T01Q615_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A3271AlbHdrAnc = new short[1] ;
      T01Q615_A5019AlbHdrgm2 = new short[1] ;
      T01Q615_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A1265BarAlbPie = new int[1] ;
      T01Q615_A1266BarAlbTub = new int[1] ;
      T01Q615_A6466PlasCod = new short[1] ;
      T01Q615_n6466PlasCod = new boolean[] {false} ;
      T01Q615_A6467BarAlbPlas = new short[1] ;
      T01Q615_A2441AlbHdrObs = new String[] {""} ;
      T01Q615_A2839AlbProVal = new String[] {""} ;
      T01Q615_A1095AlbTipEnt = new String[] {""} ;
      T01Q615_A12234AlbTipArt = new short[1] ;
      T01Q615_A12233AlbNumcli = new int[1] ;
      T01Q615_A1235BarNumCli = new int[1] ;
      T01Q615_A1234BarNomCli = new String[] {""} ;
      T01Q615_A12195BarAlbUnd = new int[1] ;
      T01Q615_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A5034BarEstTip = new String[] {""} ;
      T01Q615_A3886AlbCliCod = new int[1] ;
      T01Q615_A6645AlbMetULi = new short[1] ;
      T01Q615_A2398BarFasExt = new String[] {""} ;
      T01Q615_A5291BarTipCor = new String[] {""} ;
      T01Q615_A5027BarGraCob = new byte[1] ;
      T01Q615_A2010BarTipDis = new String[] {""} ;
      T01Q615_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A4937BarCtrPdas = new byte[1] ;
      T01Q615_n4937BarCtrPdas = new boolean[] {false} ;
      T01Q615_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A7993AlbMqTj = new String[] {""} ;
      T01Q615_A7992AlbDf3 = new String[] {""} ;
      T01Q615_A7991AlbDf2 = new String[] {""} ;
      T01Q615_A7990AlbDf1 = new String[] {""} ;
      T01Q615_A7989AlbCald = new String[] {""} ;
      T01Q615_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A6814AlbObsM = new String[] {""} ;
      T01Q615_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A5253BarAcc = new String[] {""} ;
      T01Q615_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A148BarEstReo = new byte[1] ;
      T01Q615_A143BarDisNum = new String[] {""} ;
      T01Q615_A1909BarGraAca = new short[1] ;
      T01Q615_A4815AlbEncCli = new String[] {""} ;
      T01Q615_A4812BarEncCli = new String[] {""} ;
      T01Q615_A1652BarSerDsc = new String[] {""} ;
      T01Q615_A218BarTipCol = new byte[1] ;
      T01Q615_A136BarColNum = new int[1] ;
      T01Q615_A135BarColNom = new String[] {""} ;
      T01Q615_A3394AlbTipCol = new byte[1] ;
      T01Q615_A1503BarPart = new short[1] ;
      T01Q615_A1458BarAlbBul = new short[1] ;
      T01Q615_A365DisDes = new String[] {""} ;
      T01Q615_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A32AlbProEsp = new byte[1] ;
      T01Q615_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q615_A125BarAncAca1 = new short[1] ;
      T01Q615_A213BarSit = new byte[1] ;
      T01Q615_A212BarSer = new String[] {""} ;
      T01Q615_A1248GuiFasULin = new short[1] ;
      T01Q615_A2763AlbHdrUlin = new short[1] ;
      T01Q615_A4466BarAcaAnh = new short[1] ;
      T01Q615_A12905AlbCadEnc = new short[1] ;
      T01Q615_A5051TipAcaCod = new short[1] ;
      T01Q615_A396EmprCod = new String[] {""} ;
      T01Q615_A129BarCod = new int[1] ;
      T01Q615_A132BarCodReo = new byte[1] ;
      T01Q615_A130BarCodPar = new String[] {""} ;
      T01Q615_A1206TubCod = new short[1] ;
      T01Q615_n1206TubCod = new boolean[] {false} ;
      T01Q615_A30AlbProCod = new long[1] ;
      T01Q615_A3153CodCod = new String[] {""} ;
      T01Q615_n3153CodCod = new boolean[] {false} ;
      T01Q615_A252CliCod = new int[1] ;
      T01Q615_n252CliCod = new boolean[] {false} ;
      T01Q615_A217BarTipArt = new short[1] ;
      T01Q615_n217BarTipArt = new boolean[] {false} ;
      T01Q615_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q615_A1292BarPlz = new short[1] ;
      T01Q615_A898BarPieNDes = new int[1] ;
      T01Q615_A199BarPie1 = new short[1] ;
      T01Q65_A396EmprCod = new String[] {""} ;
      T01Q67_A396EmprCod = new String[] {""} ;
      T01Q66_A396EmprCod = new String[] {""} ;
      T01Q64_A361DisCod = new int[1] ;
      T01Q64_A1235BarNumCli = new int[1] ;
      T01Q64_A1234BarNomCli = new String[] {""} ;
      T01Q64_A5034BarEstTip = new String[] {""} ;
      T01Q64_A5291BarTipCor = new String[] {""} ;
      T01Q64_A5027BarGraCob = new byte[1] ;
      T01Q64_A2010BarTipDis = new String[] {""} ;
      T01Q64_A4937BarCtrPdas = new byte[1] ;
      T01Q64_n4937BarCtrPdas = new boolean[] {false} ;
      T01Q64_A5253BarAcc = new String[] {""} ;
      T01Q64_A148BarEstReo = new byte[1] ;
      T01Q64_A143BarDisNum = new String[] {""} ;
      T01Q64_A1909BarGraAca = new short[1] ;
      T01Q64_A4812BarEncCli = new String[] {""} ;
      T01Q64_A1652BarSerDsc = new String[] {""} ;
      T01Q64_A218BarTipCol = new byte[1] ;
      T01Q64_A136BarColNum = new int[1] ;
      T01Q64_A135BarColNom = new String[] {""} ;
      T01Q64_A1503BarPart = new short[1] ;
      T01Q64_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q64_A125BarAncAca1 = new short[1] ;
      T01Q64_A213BarSit = new byte[1] ;
      T01Q64_A212BarSer = new String[] {""} ;
      T01Q64_A4466BarAcaAnh = new short[1] ;
      T01Q64_A252CliCod = new int[1] ;
      T01Q64_n252CliCod = new boolean[] {false} ;
      T01Q64_A217BarTipArt = new short[1] ;
      T01Q64_n217BarTipArt = new boolean[] {false} ;
      T01Q68_A365DisDes = new String[] {""} ;
      T01Q610_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q610_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q610_A1292BarPlz = new short[1] ;
      T01Q612_A898BarPieNDes = new int[1] ;
      T01Q612_A199BarPie1 = new short[1] ;
      T01Q616_A396EmprCod = new String[] {""} ;
      T01Q617_A396EmprCod = new String[] {""} ;
      T01Q618_A396EmprCod = new String[] {""} ;
      T01Q619_A361DisCod = new int[1] ;
      T01Q619_A1235BarNumCli = new int[1] ;
      T01Q619_A1234BarNomCli = new String[] {""} ;
      T01Q619_A5034BarEstTip = new String[] {""} ;
      T01Q619_A5291BarTipCor = new String[] {""} ;
      T01Q619_A5027BarGraCob = new byte[1] ;
      T01Q619_A2010BarTipDis = new String[] {""} ;
      T01Q619_A4937BarCtrPdas = new byte[1] ;
      T01Q619_n4937BarCtrPdas = new boolean[] {false} ;
      T01Q619_A5253BarAcc = new String[] {""} ;
      T01Q619_A148BarEstReo = new byte[1] ;
      T01Q619_A143BarDisNum = new String[] {""} ;
      T01Q619_A1909BarGraAca = new short[1] ;
      T01Q619_A4812BarEncCli = new String[] {""} ;
      T01Q619_A1652BarSerDsc = new String[] {""} ;
      T01Q619_A218BarTipCol = new byte[1] ;
      T01Q619_A136BarColNum = new int[1] ;
      T01Q619_A135BarColNom = new String[] {""} ;
      T01Q619_A1503BarPart = new short[1] ;
      T01Q619_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q619_A125BarAncAca1 = new short[1] ;
      T01Q619_A213BarSit = new byte[1] ;
      T01Q619_A212BarSer = new String[] {""} ;
      T01Q619_A4466BarAcaAnh = new short[1] ;
      T01Q619_A252CliCod = new int[1] ;
      T01Q619_n252CliCod = new boolean[] {false} ;
      T01Q619_A217BarTipArt = new short[1] ;
      T01Q619_n217BarTipArt = new boolean[] {false} ;
      T01Q620_A365DisDes = new String[] {""} ;
      T01Q622_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q622_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q622_A1292BarPlz = new short[1] ;
      T01Q624_A898BarPieNDes = new int[1] ;
      T01Q624_A199BarPie1 = new short[1] ;
      T01Q625_A396EmprCod = new String[] {""} ;
      T01Q625_A30AlbProCod = new long[1] ;
      T01Q625_A129BarCod = new int[1] ;
      T01Q625_A132BarCodReo = new byte[1] ;
      T01Q625_A130BarCodPar = new String[] {""} ;
      T01Q63_A3391AlbSer = new String[] {""} ;
      T01Q63_A8879AlbSerD = new String[] {""} ;
      T01Q63_A3392AlbColNom = new String[] {""} ;
      T01Q63_A12232AlbNomCli = new String[] {""} ;
      T01Q63_A3393AlbColNum = new int[1] ;
      T01Q63_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A3271AlbHdrAnc = new short[1] ;
      T01Q63_A5019AlbHdrgm2 = new short[1] ;
      T01Q63_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A1265BarAlbPie = new int[1] ;
      T01Q63_A1266BarAlbTub = new int[1] ;
      T01Q63_A6466PlasCod = new short[1] ;
      T01Q63_n6466PlasCod = new boolean[] {false} ;
      T01Q63_A6467BarAlbPlas = new short[1] ;
      T01Q63_A2441AlbHdrObs = new String[] {""} ;
      T01Q63_A2839AlbProVal = new String[] {""} ;
      T01Q63_A1095AlbTipEnt = new String[] {""} ;
      T01Q63_A12234AlbTipArt = new short[1] ;
      T01Q63_A12233AlbNumcli = new int[1] ;
      T01Q63_A12195BarAlbUnd = new int[1] ;
      T01Q63_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A3886AlbCliCod = new int[1] ;
      T01Q63_A6645AlbMetULi = new short[1] ;
      T01Q63_A2398BarFasExt = new String[] {""} ;
      T01Q63_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A7993AlbMqTj = new String[] {""} ;
      T01Q63_A7992AlbDf3 = new String[] {""} ;
      T01Q63_A7991AlbDf2 = new String[] {""} ;
      T01Q63_A7990AlbDf1 = new String[] {""} ;
      T01Q63_A7989AlbCald = new String[] {""} ;
      T01Q63_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A6814AlbObsM = new String[] {""} ;
      T01Q63_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A4815AlbEncCli = new String[] {""} ;
      T01Q63_A3394AlbTipCol = new byte[1] ;
      T01Q63_A1458BarAlbBul = new short[1] ;
      T01Q63_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q63_A32AlbProEsp = new byte[1] ;
      T01Q63_A1248GuiFasULin = new short[1] ;
      T01Q63_A2763AlbHdrUlin = new short[1] ;
      T01Q63_A12905AlbCadEnc = new short[1] ;
      T01Q63_A5051TipAcaCod = new short[1] ;
      T01Q63_A396EmprCod = new String[] {""} ;
      T01Q63_A129BarCod = new int[1] ;
      T01Q63_A132BarCodReo = new byte[1] ;
      T01Q63_A130BarCodPar = new String[] {""} ;
      T01Q63_A1206TubCod = new short[1] ;
      T01Q63_n1206TubCod = new boolean[] {false} ;
      T01Q63_A30AlbProCod = new long[1] ;
      T01Q63_A3153CodCod = new String[] {""} ;
      T01Q63_n3153CodCod = new boolean[] {false} ;
      sMode195 = "" ;
      T01Q626_A396EmprCod = new String[] {""} ;
      T01Q626_A129BarCod = new int[1] ;
      T01Q626_A132BarCodReo = new byte[1] ;
      T01Q626_A130BarCodPar = new String[] {""} ;
      T01Q626_A30AlbProCod = new long[1] ;
      T01Q627_A396EmprCod = new String[] {""} ;
      T01Q627_A129BarCod = new int[1] ;
      T01Q627_A132BarCodReo = new byte[1] ;
      T01Q627_A130BarCodPar = new String[] {""} ;
      T01Q627_A30AlbProCod = new long[1] ;
      T01Q62_A3391AlbSer = new String[] {""} ;
      T01Q62_A8879AlbSerD = new String[] {""} ;
      T01Q62_A3392AlbColNom = new String[] {""} ;
      T01Q62_A12232AlbNomCli = new String[] {""} ;
      T01Q62_A3393AlbColNum = new int[1] ;
      T01Q62_A1261BarAlbKgmE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A1262BarPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A3271AlbHdrAnc = new short[1] ;
      T01Q62_A5019AlbHdrgm2 = new short[1] ;
      T01Q62_A1263BarAlbMtrE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A1264BarPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A1265BarAlbPie = new int[1] ;
      T01Q62_A1266BarAlbTub = new int[1] ;
      T01Q62_A6466PlasCod = new short[1] ;
      T01Q62_n6466PlasCod = new boolean[] {false} ;
      T01Q62_A6467BarAlbPlas = new short[1] ;
      T01Q62_A2441AlbHdrObs = new String[] {""} ;
      T01Q62_A2839AlbProVal = new String[] {""} ;
      T01Q62_A1095AlbTipEnt = new String[] {""} ;
      T01Q62_A12234AlbTipArt = new short[1] ;
      T01Q62_A12233AlbNumcli = new int[1] ;
      T01Q62_A12195BarAlbUnd = new int[1] ;
      T01Q62_A12196BarPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A3886AlbCliCod = new int[1] ;
      T01Q62_A6645AlbMetULi = new short[1] ;
      T01Q62_A2398BarFasExt = new String[] {""} ;
      T01Q62_A1461BarAlbPN = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A7994AlbDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A7993AlbMqTj = new String[] {""} ;
      T01Q62_A7992AlbDf3 = new String[] {""} ;
      T01Q62_A7991AlbDf2 = new String[] {""} ;
      T01Q62_A7990AlbDf1 = new String[] {""} ;
      T01Q62_A7989AlbCald = new String[] {""} ;
      T01Q62_A7104AlbEncA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A7103AlbEncL = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A6814AlbObsM = new String[] {""} ;
      T01Q62_A2761AlbBarRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A5354AlbImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A4815AlbEncCli = new String[] {""} ;
      T01Q62_A3394AlbTipCol = new byte[1] ;
      T01Q62_A1458BarAlbBul = new short[1] ;
      T01Q62_A40AlbProRec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q62_A32AlbProEsp = new byte[1] ;
      T01Q62_A1248GuiFasULin = new short[1] ;
      T01Q62_A2763AlbHdrUlin = new short[1] ;
      T01Q62_A12905AlbCadEnc = new short[1] ;
      T01Q62_A5051TipAcaCod = new short[1] ;
      T01Q62_A396EmprCod = new String[] {""} ;
      T01Q62_A129BarCod = new int[1] ;
      T01Q62_A132BarCodReo = new byte[1] ;
      T01Q62_A130BarCodPar = new String[] {""} ;
      T01Q62_A1206TubCod = new short[1] ;
      T01Q62_n1206TubCod = new boolean[] {false} ;
      T01Q62_A30AlbProCod = new long[1] ;
      T01Q62_A3153CodCod = new String[] {""} ;
      T01Q62_n3153CodCod = new boolean[] {false} ;
      T01Q631_A361DisCod = new int[1] ;
      T01Q631_A1235BarNumCli = new int[1] ;
      T01Q631_A1234BarNomCli = new String[] {""} ;
      T01Q631_A5034BarEstTip = new String[] {""} ;
      T01Q631_A5291BarTipCor = new String[] {""} ;
      T01Q631_A5027BarGraCob = new byte[1] ;
      T01Q631_A2010BarTipDis = new String[] {""} ;
      T01Q631_A4937BarCtrPdas = new byte[1] ;
      T01Q631_n4937BarCtrPdas = new boolean[] {false} ;
      T01Q631_A5253BarAcc = new String[] {""} ;
      T01Q631_A148BarEstReo = new byte[1] ;
      T01Q631_A143BarDisNum = new String[] {""} ;
      T01Q631_A1909BarGraAca = new short[1] ;
      T01Q631_A4812BarEncCli = new String[] {""} ;
      T01Q631_A1652BarSerDsc = new String[] {""} ;
      T01Q631_A218BarTipCol = new byte[1] ;
      T01Q631_A136BarColNum = new int[1] ;
      T01Q631_A135BarColNom = new String[] {""} ;
      T01Q631_A1503BarPart = new short[1] ;
      T01Q631_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01Q631_A125BarAncAca1 = new short[1] ;
      T01Q631_A213BarSit = new byte[1] ;
      T01Q631_A212BarSer = new String[] {""} ;
      T01Q631_A4466BarAcaAnh = new short[1] ;
      T01Q631_A252CliCod = new int[1] ;
      T01Q631_n252CliCod = new boolean[] {false} ;
      T01Q631_A217BarTipArt = new short[1] ;
      T01Q631_n217BarTipArt = new boolean[] {false} ;
      T01Q632_A365DisDes = new String[] {""} ;
      T01Q634_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q634_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01Q634_A1292BarPlz = new short[1] ;
      T01Q636_A898BarPieNDes = new int[1] ;
      T01Q636_A199BarPie1 = new short[1] ;
      T01Q637_A396EmprCod = new String[] {""} ;
      T01Q637_A30AlbProCod = new long[1] ;
      T01Q637_A129BarCod = new int[1] ;
      T01Q637_A132BarCodReo = new byte[1] ;
      T01Q637_A130BarCodPar = new String[] {""} ;
      T01Q637_A6648AlbMetLin = new short[1] ;
      T01Q638_A396EmprCod = new String[] {""} ;
      T01Q638_A30AlbProCod = new long[1] ;
      T01Q638_A129BarCod = new int[1] ;
      T01Q638_A132BarCodReo = new byte[1] ;
      T01Q638_A130BarCodPar = new String[] {""} ;
      T01Q638_A9639Et_Numero = new short[1] ;
      T01Q639_A396EmprCod = new String[] {""} ;
      T01Q639_A30AlbProCod = new long[1] ;
      T01Q639_A129BarCod = new int[1] ;
      T01Q639_A132BarCodReo = new byte[1] ;
      T01Q639_A130BarCodPar = new String[] {""} ;
      T01Q639_A6622AlbHdRLn = new short[1] ;
      T01Q640_A396EmprCod = new String[] {""} ;
      T01Q640_A30AlbProCod = new long[1] ;
      T01Q640_A129BarCod = new int[1] ;
      T01Q640_A132BarCodReo = new byte[1] ;
      T01Q640_A130BarCodPar = new String[] {""} ;
      T01Q640_A5456P_ForLin = new short[1] ;
      T01Q641_A396EmprCod = new String[] {""} ;
      T01Q641_A30AlbProCod = new long[1] ;
      T01Q641_A129BarCod = new int[1] ;
      T01Q641_A132BarCodReo = new byte[1] ;
      T01Q641_A130BarCodPar = new String[] {""} ;
      T01Q641_A2524DisComLin = new byte[1] ;
      T01Q641_A1056DisComCod = new String[] {""} ;
      T01Q641_A1032FonCod = new String[] {""} ;
      T01Q642_A396EmprCod = new String[] {""} ;
      T01Q642_A3617AlbTrnCod = new long[1] ;
      T01Q642_A30AlbProCod = new long[1] ;
      T01Q642_A129BarCod = new int[1] ;
      T01Q642_A132BarCodReo = new byte[1] ;
      T01Q642_A130BarCodPar = new String[] {""} ;
      T01Q643_A396EmprCod = new String[] {""} ;
      T01Q643_A30AlbProCod = new long[1] ;
      T01Q643_A129BarCod = new int[1] ;
      T01Q643_A132BarCodReo = new byte[1] ;
      T01Q643_A130BarCodPar = new String[] {""} ;
      T01Q643_A3621AlbPckLin = new short[1] ;
      T01Q644_A396EmprCod = new String[] {""} ;
      T01Q644_A30AlbProCod = new long[1] ;
      T01Q644_A129BarCod = new int[1] ;
      T01Q644_A132BarCodReo = new byte[1] ;
      T01Q644_A130BarCodPar = new String[] {""} ;
      T01Q644_A2764AlbHdrLin = new short[1] ;
      T01Q645_A396EmprCod = new String[] {""} ;
      T01Q645_A30AlbProCod = new long[1] ;
      T01Q645_A129BarCod = new int[1] ;
      T01Q645_A132BarCodReo = new byte[1] ;
      T01Q645_A130BarCodPar = new String[] {""} ;
      T01Q645_A1468AlbPrdLin = new short[1] ;
      T01Q646_A396EmprCod = new String[] {""} ;
      T01Q646_A30AlbProCod = new long[1] ;
      T01Q646_A129BarCod = new int[1] ;
      T01Q646_A132BarCodReo = new byte[1] ;
      T01Q646_A130BarCodPar = new String[] {""} ;
      T01Q646_A200BarPieCod = new String[] {""} ;
      T01Q647_A396EmprCod = new String[] {""} ;
      T01Q647_A30AlbProCod = new long[1] ;
      T01Q647_A129BarCod = new int[1] ;
      T01Q647_A132BarCodReo = new byte[1] ;
      T01Q647_A130BarCodPar = new String[] {""} ;
      T01Q647_A1240GuiFasLin = new short[1] ;
      T01Q648_A396EmprCod = new String[] {""} ;
      T01Q648_A30AlbProCod = new long[1] ;
      T01Q648_A129BarCod = new int[1] ;
      T01Q648_A132BarCodReo = new byte[1] ;
      T01Q648_A130BarCodPar = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01Q649_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ3391AlbSer = "" ;
      ZZ8879AlbSerD = "" ;
      ZZ3392AlbColNom = "" ;
      ZZ12232AlbNomCli = "" ;
      ZZ3153CodCod = "" ;
      ZZ1261BarAlbKgmE = DecimalUtil.ZERO ;
      ZZ1262BarPreKgm = DecimalUtil.ZERO ;
      ZZ1263BarAlbMtrE = DecimalUtil.ZERO ;
      ZZ1264BarPreMtr = DecimalUtil.ZERO ;
      ZZ2441AlbHdrObs = "" ;
      ZZ2839AlbProVal = "" ;
      ZZ1095AlbTipEnt = "" ;
      ZZ12196BarPreUnd = DecimalUtil.ZERO ;
      ZZ2398BarFasExt = "" ;
      ZZ1461BarAlbPN = DecimalUtil.ZERO ;
      ZZ7994AlbDto = DecimalUtil.ZERO ;
      ZZ7993AlbMqTj = "" ;
      ZZ7992AlbDf3 = "" ;
      ZZ7991AlbDf2 = "" ;
      ZZ7990AlbDf1 = "" ;
      ZZ7989AlbCald = "" ;
      ZZ7104AlbEncA = DecimalUtil.ZERO ;
      ZZ7103AlbEncL = DecimalUtil.ZERO ;
      ZZ6814AlbObsM = "" ;
      ZZ2761AlbBarRec = DecimalUtil.ZERO ;
      ZZ5354AlbImpMan = DecimalUtil.ZERO ;
      ZZ4815AlbEncCli = "" ;
      ZZ40AlbProRec = DecimalUtil.ZERO ;
      ZZ1234BarNomCli = "" ;
      ZZ5034BarEstTip = "" ;
      ZZ5291BarTipCor = "" ;
      ZZ2010BarTipDis = "" ;
      ZZ5253BarAcc = "" ;
      ZZ143BarDisNum = "" ;
      ZZ4812BarEncCli = "" ;
      ZZ1652BarSerDsc = "" ;
      ZZ135BarColNom = "" ;
      ZZ161BarFecSal = GXutil.nullDate() ;
      ZZ212BarSer = "" ;
      ZZ365DisDes = "" ;
      ZZ1279BarKla = DecimalUtil.ZERO ;
      ZZ1280BarMla = DecimalUtil.ZERO ;
      T01Q650_A396EmprCod = new String[] {""} ;
      T01Q651_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.albbar__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.albbar__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.albbar__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albbar__default(),
         new Object[] {
             new Object[] {
            T01Q62_A3391AlbSer, T01Q62_A8879AlbSerD, T01Q62_A3392AlbColNom, T01Q62_A12232AlbNomCli, T01Q62_A3393AlbColNum, T01Q62_A1261BarAlbKgmE, T01Q62_A1262BarPreKgm, T01Q62_A3271AlbHdrAnc, T01Q62_A5019AlbHdrgm2, T01Q62_A1263BarAlbMtrE,
            T01Q62_A1264BarPreMtr, T01Q62_A1265BarAlbPie, T01Q62_A1266BarAlbTub, T01Q62_A6466PlasCod, T01Q62_n6466PlasCod, T01Q62_A6467BarAlbPlas, T01Q62_A2441AlbHdrObs, T01Q62_A2839AlbProVal, T01Q62_A1095AlbTipEnt, T01Q62_A12234AlbTipArt,
            T01Q62_A12233AlbNumcli, T01Q62_A12195BarAlbUnd, T01Q62_A12196BarPreUnd, T01Q62_A3886AlbCliCod, T01Q62_A6645AlbMetULi, T01Q62_A2398BarFasExt, T01Q62_A1461BarAlbPN, T01Q62_A7994AlbDto, T01Q62_A7993AlbMqTj, T01Q62_A7992AlbDf3,
            T01Q62_A7991AlbDf2, T01Q62_A7990AlbDf1, T01Q62_A7989AlbCald, T01Q62_A7104AlbEncA, T01Q62_A7103AlbEncL, T01Q62_A6814AlbObsM, T01Q62_A2761AlbBarRec, T01Q62_A5354AlbImpMan, T01Q62_A4815AlbEncCli, T01Q62_A3394AlbTipCol,
            T01Q62_A1458BarAlbBul, T01Q62_A40AlbProRec, T01Q62_A32AlbProEsp, T01Q62_A1248GuiFasULin, T01Q62_A2763AlbHdrUlin, T01Q62_A12905AlbCadEnc, T01Q62_A5051TipAcaCod, T01Q62_A396EmprCod, T01Q62_A129BarCod, T01Q62_A132BarCodReo,
            T01Q62_A130BarCodPar, T01Q62_A1206TubCod, T01Q62_n1206TubCod, T01Q62_A30AlbProCod, T01Q62_A3153CodCod, T01Q62_n3153CodCod
            }
            , new Object[] {
            T01Q63_A3391AlbSer, T01Q63_A8879AlbSerD, T01Q63_A3392AlbColNom, T01Q63_A12232AlbNomCli, T01Q63_A3393AlbColNum, T01Q63_A1261BarAlbKgmE, T01Q63_A1262BarPreKgm, T01Q63_A3271AlbHdrAnc, T01Q63_A5019AlbHdrgm2, T01Q63_A1263BarAlbMtrE,
            T01Q63_A1264BarPreMtr, T01Q63_A1265BarAlbPie, T01Q63_A1266BarAlbTub, T01Q63_A6466PlasCod, T01Q63_n6466PlasCod, T01Q63_A6467BarAlbPlas, T01Q63_A2441AlbHdrObs, T01Q63_A2839AlbProVal, T01Q63_A1095AlbTipEnt, T01Q63_A12234AlbTipArt,
            T01Q63_A12233AlbNumcli, T01Q63_A12195BarAlbUnd, T01Q63_A12196BarPreUnd, T01Q63_A3886AlbCliCod, T01Q63_A6645AlbMetULi, T01Q63_A2398BarFasExt, T01Q63_A1461BarAlbPN, T01Q63_A7994AlbDto, T01Q63_A7993AlbMqTj, T01Q63_A7992AlbDf3,
            T01Q63_A7991AlbDf2, T01Q63_A7990AlbDf1, T01Q63_A7989AlbCald, T01Q63_A7104AlbEncA, T01Q63_A7103AlbEncL, T01Q63_A6814AlbObsM, T01Q63_A2761AlbBarRec, T01Q63_A5354AlbImpMan, T01Q63_A4815AlbEncCli, T01Q63_A3394AlbTipCol,
            T01Q63_A1458BarAlbBul, T01Q63_A40AlbProRec, T01Q63_A32AlbProEsp, T01Q63_A1248GuiFasULin, T01Q63_A2763AlbHdrUlin, T01Q63_A12905AlbCadEnc, T01Q63_A5051TipAcaCod, T01Q63_A396EmprCod, T01Q63_A129BarCod, T01Q63_A132BarCodReo,
            T01Q63_A130BarCodPar, T01Q63_A1206TubCod, T01Q63_n1206TubCod, T01Q63_A30AlbProCod, T01Q63_A3153CodCod, T01Q63_n3153CodCod
            }
            , new Object[] {
            T01Q64_A361DisCod, T01Q64_A1235BarNumCli, T01Q64_A1234BarNomCli, T01Q64_A5034BarEstTip, T01Q64_A5291BarTipCor, T01Q64_A5027BarGraCob, T01Q64_A2010BarTipDis, T01Q64_A4937BarCtrPdas, T01Q64_n4937BarCtrPdas, T01Q64_A5253BarAcc,
            T01Q64_A148BarEstReo, T01Q64_A143BarDisNum, T01Q64_A1909BarGraAca, T01Q64_A4812BarEncCli, T01Q64_A1652BarSerDsc, T01Q64_A218BarTipCol, T01Q64_A136BarColNum, T01Q64_A135BarColNom, T01Q64_A1503BarPart, T01Q64_A161BarFecSal,
            T01Q64_A125BarAncAca1, T01Q64_A213BarSit, T01Q64_A212BarSer, T01Q64_A4466BarAcaAnh, T01Q64_A252CliCod, T01Q64_n252CliCod, T01Q64_A217BarTipArt, T01Q64_n217BarTipArt
            }
            , new Object[] {
            T01Q65_A396EmprCod
            }
            , new Object[] {
            T01Q66_A396EmprCod
            }
            , new Object[] {
            T01Q67_A396EmprCod
            }
            , new Object[] {
            T01Q68_A365DisDes
            }
            , new Object[] {
            T01Q610_A1279BarKla, T01Q610_A1280BarMla, T01Q610_A1292BarPlz
            }
            , new Object[] {
            T01Q612_A898BarPieNDes, T01Q612_A199BarPie1
            }
            , new Object[] {
            T01Q615_A361DisCod, T01Q615_A3391AlbSer, T01Q615_A8879AlbSerD, T01Q615_A3392AlbColNom, T01Q615_A12232AlbNomCli, T01Q615_A3393AlbColNum, T01Q615_A1261BarAlbKgmE, T01Q615_A1262BarPreKgm, T01Q615_A3271AlbHdrAnc, T01Q615_A5019AlbHdrgm2,
            T01Q615_A1263BarAlbMtrE, T01Q615_A1264BarPreMtr, T01Q615_A1265BarAlbPie, T01Q615_A1266BarAlbTub, T01Q615_A6466PlasCod, T01Q615_n6466PlasCod, T01Q615_A6467BarAlbPlas, T01Q615_A2441AlbHdrObs, T01Q615_A2839AlbProVal, T01Q615_A1095AlbTipEnt,
            T01Q615_A12234AlbTipArt, T01Q615_A12233AlbNumcli, T01Q615_A1235BarNumCli, T01Q615_A1234BarNomCli, T01Q615_A12195BarAlbUnd, T01Q615_A12196BarPreUnd, T01Q615_A5034BarEstTip, T01Q615_A3886AlbCliCod, T01Q615_A6645AlbMetULi, T01Q615_A2398BarFasExt,
            T01Q615_A5291BarTipCor, T01Q615_A5027BarGraCob, T01Q615_A2010BarTipDis, T01Q615_A1461BarAlbPN, T01Q615_A4937BarCtrPdas, T01Q615_n4937BarCtrPdas, T01Q615_A7994AlbDto, T01Q615_A7993AlbMqTj, T01Q615_A7992AlbDf3, T01Q615_A7991AlbDf2,
            T01Q615_A7990AlbDf1, T01Q615_A7989AlbCald, T01Q615_A7104AlbEncA, T01Q615_A7103AlbEncL, T01Q615_A6814AlbObsM, T01Q615_A2761AlbBarRec, T01Q615_A5253BarAcc, T01Q615_A5354AlbImpMan, T01Q615_A148BarEstReo, T01Q615_A143BarDisNum,
            T01Q615_A1909BarGraAca, T01Q615_A4815AlbEncCli, T01Q615_A4812BarEncCli, T01Q615_A1652BarSerDsc, T01Q615_A218BarTipCol, T01Q615_A136BarColNum, T01Q615_A135BarColNom, T01Q615_A3394AlbTipCol, T01Q615_A1503BarPart, T01Q615_A1458BarAlbBul,
            T01Q615_A365DisDes, T01Q615_A40AlbProRec, T01Q615_A32AlbProEsp, T01Q615_A161BarFecSal, T01Q615_A125BarAncAca1, T01Q615_A213BarSit, T01Q615_A212BarSer, T01Q615_A1248GuiFasULin, T01Q615_A2763AlbHdrUlin, T01Q615_A4466BarAcaAnh,
            T01Q615_A12905AlbCadEnc, T01Q615_A5051TipAcaCod, T01Q615_A396EmprCod, T01Q615_A129BarCod, T01Q615_A132BarCodReo, T01Q615_A130BarCodPar, T01Q615_A1206TubCod, T01Q615_n1206TubCod, T01Q615_A30AlbProCod, T01Q615_A3153CodCod,
            T01Q615_n3153CodCod, T01Q615_A252CliCod, T01Q615_n252CliCod, T01Q615_A217BarTipArt, T01Q615_n217BarTipArt, T01Q615_A1279BarKla, T01Q615_A1280BarMla, T01Q615_A1292BarPlz, T01Q615_A898BarPieNDes, T01Q615_A199BarPie1
            }
            , new Object[] {
            T01Q616_A396EmprCod
            }
            , new Object[] {
            T01Q617_A396EmprCod
            }
            , new Object[] {
            T01Q618_A396EmprCod
            }
            , new Object[] {
            T01Q619_A361DisCod, T01Q619_A1235BarNumCli, T01Q619_A1234BarNomCli, T01Q619_A5034BarEstTip, T01Q619_A5291BarTipCor, T01Q619_A5027BarGraCob, T01Q619_A2010BarTipDis, T01Q619_A4937BarCtrPdas, T01Q619_n4937BarCtrPdas, T01Q619_A5253BarAcc,
            T01Q619_A148BarEstReo, T01Q619_A143BarDisNum, T01Q619_A1909BarGraAca, T01Q619_A4812BarEncCli, T01Q619_A1652BarSerDsc, T01Q619_A218BarTipCol, T01Q619_A136BarColNum, T01Q619_A135BarColNom, T01Q619_A1503BarPart, T01Q619_A161BarFecSal,
            T01Q619_A125BarAncAca1, T01Q619_A213BarSit, T01Q619_A212BarSer, T01Q619_A4466BarAcaAnh, T01Q619_A252CliCod, T01Q619_n252CliCod, T01Q619_A217BarTipArt, T01Q619_n217BarTipArt
            }
            , new Object[] {
            T01Q620_A365DisDes
            }
            , new Object[] {
            T01Q622_A1279BarKla, T01Q622_A1280BarMla, T01Q622_A1292BarPlz
            }
            , new Object[] {
            T01Q624_A898BarPieNDes, T01Q624_A199BarPie1
            }
            , new Object[] {
            T01Q625_A396EmprCod, T01Q625_A30AlbProCod, T01Q625_A129BarCod, T01Q625_A132BarCodReo, T01Q625_A130BarCodPar
            }
            , new Object[] {
            T01Q626_A396EmprCod, T01Q626_A129BarCod, T01Q626_A132BarCodReo, T01Q626_A130BarCodPar, T01Q626_A30AlbProCod
            }
            , new Object[] {
            T01Q627_A396EmprCod, T01Q627_A129BarCod, T01Q627_A132BarCodReo, T01Q627_A130BarCodPar, T01Q627_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01Q631_A361DisCod, T01Q631_A1235BarNumCli, T01Q631_A1234BarNomCli, T01Q631_A5034BarEstTip, T01Q631_A5291BarTipCor, T01Q631_A5027BarGraCob, T01Q631_A2010BarTipDis, T01Q631_A4937BarCtrPdas, T01Q631_n4937BarCtrPdas, T01Q631_A5253BarAcc,
            T01Q631_A148BarEstReo, T01Q631_A143BarDisNum, T01Q631_A1909BarGraAca, T01Q631_A4812BarEncCli, T01Q631_A1652BarSerDsc, T01Q631_A218BarTipCol, T01Q631_A136BarColNum, T01Q631_A135BarColNom, T01Q631_A1503BarPart, T01Q631_A161BarFecSal,
            T01Q631_A125BarAncAca1, T01Q631_A213BarSit, T01Q631_A212BarSer, T01Q631_A4466BarAcaAnh, T01Q631_A252CliCod, T01Q631_n252CliCod, T01Q631_A217BarTipArt, T01Q631_n217BarTipArt
            }
            , new Object[] {
            T01Q632_A365DisDes
            }
            , new Object[] {
            T01Q634_A1279BarKla, T01Q634_A1280BarMla, T01Q634_A1292BarPlz
            }
            , new Object[] {
            T01Q636_A898BarPieNDes, T01Q636_A199BarPie1
            }
            , new Object[] {
            T01Q637_A396EmprCod, T01Q637_A30AlbProCod, T01Q637_A129BarCod, T01Q637_A132BarCodReo, T01Q637_A130BarCodPar, T01Q637_A6648AlbMetLin
            }
            , new Object[] {
            T01Q638_A396EmprCod, T01Q638_A30AlbProCod, T01Q638_A129BarCod, T01Q638_A132BarCodReo, T01Q638_A130BarCodPar, T01Q638_A9639Et_Numero
            }
            , new Object[] {
            T01Q639_A396EmprCod, T01Q639_A30AlbProCod, T01Q639_A129BarCod, T01Q639_A132BarCodReo, T01Q639_A130BarCodPar, T01Q639_A6622AlbHdRLn
            }
            , new Object[] {
            T01Q640_A396EmprCod, T01Q640_A30AlbProCod, T01Q640_A129BarCod, T01Q640_A132BarCodReo, T01Q640_A130BarCodPar, T01Q640_A5456P_ForLin
            }
            , new Object[] {
            T01Q641_A396EmprCod, T01Q641_A30AlbProCod, T01Q641_A129BarCod, T01Q641_A132BarCodReo, T01Q641_A130BarCodPar, T01Q641_A2524DisComLin, T01Q641_A1056DisComCod, T01Q641_A1032FonCod
            }
            , new Object[] {
            T01Q642_A396EmprCod, T01Q642_A3617AlbTrnCod, T01Q642_A30AlbProCod, T01Q642_A129BarCod, T01Q642_A132BarCodReo, T01Q642_A130BarCodPar
            }
            , new Object[] {
            T01Q643_A396EmprCod, T01Q643_A30AlbProCod, T01Q643_A129BarCod, T01Q643_A132BarCodReo, T01Q643_A130BarCodPar, T01Q643_A3621AlbPckLin
            }
            , new Object[] {
            T01Q644_A396EmprCod, T01Q644_A30AlbProCod, T01Q644_A129BarCod, T01Q644_A132BarCodReo, T01Q644_A130BarCodPar, T01Q644_A2764AlbHdrLin
            }
            , new Object[] {
            T01Q645_A396EmprCod, T01Q645_A30AlbProCod, T01Q645_A129BarCod, T01Q645_A132BarCodReo, T01Q645_A130BarCodPar, T01Q645_A1468AlbPrdLin
            }
            , new Object[] {
            T01Q646_A396EmprCod, T01Q646_A30AlbProCod, T01Q646_A129BarCod, T01Q646_A132BarCodReo, T01Q646_A130BarCodPar, T01Q646_A200BarPieCod
            }
            , new Object[] {
            T01Q647_A396EmprCod, T01Q647_A30AlbProCod, T01Q647_A129BarCod, T01Q647_A132BarCodReo, T01Q647_A130BarCodPar, T01Q647_A1240GuiFasLin
            }
            , new Object[] {
            T01Q648_A396EmprCod, T01Q648_A30AlbProCod, T01Q648_A129BarCod, T01Q648_A132BarCodReo, T01Q648_A130BarCodPar
            }
            , new Object[] {
            T01Q649_A396EmprCod
            }
            , new Object[] {
            T01Q650_A396EmprCod
            }
            , new Object[] {
            T01Q651_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z3394AlbTipCol ;
   private byte Z32AlbProEsp ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte nKeyPressed ;
   private byte A148BarEstReo ;
   private byte A5027BarGraCob ;
   private byte A4937BarCtrPdas ;
   private byte A218BarTipCol ;
   private byte A3394AlbTipCol ;
   private byte A32AlbProEsp ;
   private byte A213BarSit ;
   private byte Z5027BarGraCob ;
   private byte Z4937BarCtrPdas ;
   private byte Z148BarEstReo ;
   private byte Z218BarTipCol ;
   private byte Z213BarSit ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ3394AlbTipCol ;
   private byte ZZ32AlbProEsp ;
   private byte ZZ5027BarGraCob ;
   private byte ZZ4937BarCtrPdas ;
   private byte ZZ148BarEstReo ;
   private byte ZZ218BarTipCol ;
   private byte ZZ213BarSit ;
   private short Z3271AlbHdrAnc ;
   private short Z5019AlbHdrgm2 ;
   private short Z6466PlasCod ;
   private short Z6467BarAlbPlas ;
   private short Z12234AlbTipArt ;
   private short Z6645AlbMetULi ;
   private short Z1458BarAlbBul ;
   private short Z1248GuiFasULin ;
   private short Z2763AlbHdrUlin ;
   private short Z12905AlbCadEnc ;
   private short Z5051TipAcaCod ;
   private short Z1206TubCod ;
   private short A1206TubCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A3271AlbHdrAnc ;
   private short A5019AlbHdrgm2 ;
   private short A6466PlasCod ;
   private short A6467BarAlbPlas ;
   private short A12234AlbTipArt ;
   private short A217BarTipArt ;
   private short A6645AlbMetULi ;
   private short A1909BarGraAca ;
   private short A1503BarPart ;
   private short A1458BarAlbBul ;
   private short A1292BarPlz ;
   private short A125BarAncAca1 ;
   private short A1248GuiFasULin ;
   private short A2763AlbHdrUlin ;
   private short A4466BarAcaAnh ;
   private short A12905AlbCadEnc ;
   private short A5051TipAcaCod ;
   private short A199BarPie1 ;
   private short Z1909BarGraAca ;
   private short Z1503BarPart ;
   private short Z125BarAncAca1 ;
   private short Z4466BarAcaAnh ;
   private short Z217BarTipArt ;
   private short Z1292BarPlz ;
   private short Z199BarPie1 ;
   private short RcdFound195 ;
   private short nIsDirty_195 ;
   private short ZZ3271AlbHdrAnc ;
   private short ZZ5019AlbHdrgm2 ;
   private short ZZ1206TubCod ;
   private short ZZ6466PlasCod ;
   private short ZZ6467BarAlbPlas ;
   private short ZZ12234AlbTipArt ;
   private short ZZ6645AlbMetULi ;
   private short ZZ1458BarAlbBul ;
   private short ZZ1248GuiFasULin ;
   private short ZZ2763AlbHdrUlin ;
   private short ZZ12905AlbCadEnc ;
   private short ZZ5051TipAcaCod ;
   private short ZZ1909BarGraAca ;
   private short ZZ1503BarPart ;
   private short ZZ125BarAncAca1 ;
   private short ZZ4466BarAcaAnh ;
   private short ZZ217BarTipArt ;
   private short ZZ1292BarPlz ;
   private short ZZ199BarPie1 ;
   private int Z129BarCod ;
   private int Z3393AlbColNum ;
   private int Z1265BarAlbPie ;
   private int Z1266BarAlbTub ;
   private int Z12233AlbNumcli ;
   private int Z12195BarAlbUnd ;
   private int Z3886AlbCliCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtAlbProCod_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtAlbSer_Enabled ;
   private int edtAlbSerD_Enabled ;
   private int edtAlbColNom_Enabled ;
   private int edtAlbNomCli_Enabled ;
   private int A3393AlbColNum ;
   private int edtAlbColNum_Enabled ;
   private int edtCodCod_Enabled ;
   private int edtBarAlbKgmE_Enabled ;
   private int edtBarPreKgm_Enabled ;
   private int edtAlbHdrAnc_Enabled ;
   private int edtAlbHdrgm2_Enabled ;
   private int edtBarAlbMtrE_Enabled ;
   private int edtBarPreMtr_Enabled ;
   private int A1265BarAlbPie ;
   private int edtBarAlbPie_Enabled ;
   private int edtTubCod_Enabled ;
   private int A1266BarAlbTub ;
   private int edtBarAlbTub_Enabled ;
   private int edtPlasCod_Enabled ;
   private int edtBarAlbPlas_Enabled ;
   private int edtAlbHdrObs_Enabled ;
   private int edtAlbTipEnt_Enabled ;
   private int edtAlbTipArt_Enabled ;
   private int edtBarTipArt_Enabled ;
   private int A12233AlbNumcli ;
   private int edtAlbNumcli_Enabled ;
   private int A1235BarNumCli ;
   private int edtBarNumCli_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int A12195BarAlbUnd ;
   private int edtBarAlbUnd_Enabled ;
   private int edtBarPreUnd_Enabled ;
   private int edtBarEstTip_Enabled ;
   private int A3886AlbCliCod ;
   private int edtAlbCliCod_Enabled ;
   private int edtAlbMetULi_Enabled ;
   private int edtBarFasExt_Enabled ;
   private int edtBarGraCob_Enabled ;
   private int edtBarTipDis_Enabled ;
   private int edtBarAlbPN_Enabled ;
   private int edtBarCtrPdas_Enabled ;
   private int edtAlbDto_Enabled ;
   private int edtAlbMqTj_Enabled ;
   private int edtAlbDf3_Enabled ;
   private int edtAlbDf2_Enabled ;
   private int edtAlbDf1_Enabled ;
   private int edtAlbCald_Enabled ;
   private int edtAlbEncA_Enabled ;
   private int edtAlbEncL_Enabled ;
   private int edtAlbObsM_Enabled ;
   private int edtAlbBarRec_Enabled ;
   private int edtAlbImpMan_Enabled ;
   private int edtBarDisNum_Enabled ;
   private int edtBarGraAca_Enabled ;
   private int edtAlbEncCli_Enabled ;
   private int edtBarEncCli_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarTipCol_Enabled ;
   private int A136BarColNum ;
   private int edtBarColNum_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtAlbTipCol_Enabled ;
   private int edtBarPart_Enabled ;
   private int edtBarAlbBul_Enabled ;
   private int edtAlbProRec_Enabled ;
   private int edtAlbProEsp_Enabled ;
   private int edtBarKla_Enabled ;
   private int edtBarMla_Enabled ;
   private int edtBarPlz_Enabled ;
   private int A198BarPie ;
   private int edtBarPie_Enabled ;
   private int edtBarFecSal_Enabled ;
   private int edtBarAncAca1_Enabled ;
   private int edtBarSit_Enabled ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtGuiFasULin_Enabled ;
   private int edtAlbHdrUlin_Enabled ;
   private int edtBarAcaAnh_Enabled ;
   private int edtAlbCadEnc_Enabled ;
   private int edtTipAcaCod_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int A898BarPieNDes ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int Z1235BarNumCli ;
   private int Z136BarColNum ;
   private int Z252CliCod ;
   private int Z898BarPieNDes ;
   private int idxLst ;
   private int Z198BarPie ;
   private int ZZ129BarCod ;
   private int ZZ3393AlbColNum ;
   private int ZZ1265BarAlbPie ;
   private int ZZ1266BarAlbTub ;
   private int ZZ12233AlbNumcli ;
   private int ZZ12195BarAlbUnd ;
   private int ZZ3886AlbCliCod ;
   private int ZZ361DisCod ;
   private int ZZ1235BarNumCli ;
   private int ZZ136BarColNum ;
   private int ZZ252CliCod ;
   private int ZZ898BarPieNDes ;
   private int ZZ198BarPie ;
   private long Z30AlbProCod ;
   private long A30AlbProCod ;
   private long ZZ30AlbProCod ;
   private java.math.BigDecimal Z1261BarAlbKgmE ;
   private java.math.BigDecimal Z1262BarPreKgm ;
   private java.math.BigDecimal Z1263BarAlbMtrE ;
   private java.math.BigDecimal Z1264BarPreMtr ;
   private java.math.BigDecimal Z12196BarPreUnd ;
   private java.math.BigDecimal Z1461BarAlbPN ;
   private java.math.BigDecimal Z7994AlbDto ;
   private java.math.BigDecimal Z7104AlbEncA ;
   private java.math.BigDecimal Z7103AlbEncL ;
   private java.math.BigDecimal Z2761AlbBarRec ;
   private java.math.BigDecimal Z5354AlbImpMan ;
   private java.math.BigDecimal Z40AlbProRec ;
   private java.math.BigDecimal A1261BarAlbKgmE ;
   private java.math.BigDecimal A1262BarPreKgm ;
   private java.math.BigDecimal A1263BarAlbMtrE ;
   private java.math.BigDecimal A1264BarPreMtr ;
   private java.math.BigDecimal A12196BarPreUnd ;
   private java.math.BigDecimal A1461BarAlbPN ;
   private java.math.BigDecimal A7994AlbDto ;
   private java.math.BigDecimal A7104AlbEncA ;
   private java.math.BigDecimal A7103AlbEncL ;
   private java.math.BigDecimal A2761AlbBarRec ;
   private java.math.BigDecimal A5354AlbImpMan ;
   private java.math.BigDecimal A40AlbProRec ;
   private java.math.BigDecimal A1279BarKla ;
   private java.math.BigDecimal A1280BarMla ;
   private java.math.BigDecimal Z1279BarKla ;
   private java.math.BigDecimal Z1280BarMla ;
   private java.math.BigDecimal ZZ1261BarAlbKgmE ;
   private java.math.BigDecimal ZZ1262BarPreKgm ;
   private java.math.BigDecimal ZZ1263BarAlbMtrE ;
   private java.math.BigDecimal ZZ1264BarPreMtr ;
   private java.math.BigDecimal ZZ12196BarPreUnd ;
   private java.math.BigDecimal ZZ1461BarAlbPN ;
   private java.math.BigDecimal ZZ7994AlbDto ;
   private java.math.BigDecimal ZZ7104AlbEncA ;
   private java.math.BigDecimal ZZ7103AlbEncL ;
   private java.math.BigDecimal ZZ2761AlbBarRec ;
   private java.math.BigDecimal ZZ5354AlbImpMan ;
   private java.math.BigDecimal ZZ40AlbProRec ;
   private java.math.BigDecimal ZZ1279BarKla ;
   private java.math.BigDecimal ZZ1280BarMla ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z3391AlbSer ;
   private String Z8879AlbSerD ;
   private String Z3392AlbColNom ;
   private String Z12232AlbNomCli ;
   private String Z2441AlbHdrObs ;
   private String Z2839AlbProVal ;
   private String Z1095AlbTipEnt ;
   private String Z2398BarFasExt ;
   private String Z7993AlbMqTj ;
   private String Z7992AlbDf3 ;
   private String Z7991AlbDf2 ;
   private String Z7990AlbDf1 ;
   private String Z7989AlbCald ;
   private String Z4815AlbEncCli ;
   private String Z3153CodCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A3153CodCod ;
   private String A130BarCodPar ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A2839AlbProVal ;
   private String A5291BarTipCor ;
   private String A5253BarAcc ;
   private String A365DisDes ;
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
   private String edtAlbProCod_Internalname ;
   private String edtAlbProCod_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtAlbSer_Internalname ;
   private String A3391AlbSer ;
   private String edtAlbSer_Jsonclick ;
   private String edtAlbSerD_Internalname ;
   private String A8879AlbSerD ;
   private String edtAlbSerD_Jsonclick ;
   private String edtAlbColNom_Internalname ;
   private String A3392AlbColNom ;
   private String edtAlbColNom_Jsonclick ;
   private String edtAlbNomCli_Internalname ;
   private String A12232AlbNomCli ;
   private String edtAlbNomCli_Jsonclick ;
   private String edtAlbColNum_Internalname ;
   private String edtAlbColNum_Jsonclick ;
   private String edtCodCod_Internalname ;
   private String edtCodCod_Jsonclick ;
   private String edtBarAlbKgmE_Internalname ;
   private String edtBarAlbKgmE_Jsonclick ;
   private String edtBarPreKgm_Internalname ;
   private String edtBarPreKgm_Jsonclick ;
   private String edtAlbHdrAnc_Internalname ;
   private String edtAlbHdrAnc_Jsonclick ;
   private String edtAlbHdrgm2_Internalname ;
   private String edtAlbHdrgm2_Jsonclick ;
   private String edtBarAlbMtrE_Internalname ;
   private String edtBarAlbMtrE_Jsonclick ;
   private String edtBarPreMtr_Internalname ;
   private String edtBarPreMtr_Jsonclick ;
   private String edtBarAlbPie_Internalname ;
   private String edtBarAlbPie_Jsonclick ;
   private String edtTubCod_Internalname ;
   private String edtTubCod_Jsonclick ;
   private String edtBarAlbTub_Internalname ;
   private String edtBarAlbTub_Jsonclick ;
   private String edtPlasCod_Internalname ;
   private String edtPlasCod_Jsonclick ;
   private String edtBarAlbPlas_Internalname ;
   private String edtBarAlbPlas_Jsonclick ;
   private String edtAlbHdrObs_Internalname ;
   private String A2441AlbHdrObs ;
   private String edtAlbHdrObs_Jsonclick ;
   private String edtAlbTipEnt_Internalname ;
   private String A1095AlbTipEnt ;
   private String edtAlbTipEnt_Jsonclick ;
   private String edtAlbTipArt_Internalname ;
   private String edtAlbTipArt_Jsonclick ;
   private String edtBarTipArt_Internalname ;
   private String edtBarTipArt_Jsonclick ;
   private String edtAlbNumcli_Internalname ;
   private String edtAlbNumcli_Jsonclick ;
   private String edtBarNumCli_Internalname ;
   private String edtBarNumCli_Jsonclick ;
   private String edtBarNomCli_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarAlbUnd_Internalname ;
   private String edtBarAlbUnd_Jsonclick ;
   private String edtBarPreUnd_Internalname ;
   private String edtBarPreUnd_Jsonclick ;
   private String edtBarEstTip_Internalname ;
   private String A5034BarEstTip ;
   private String edtBarEstTip_Jsonclick ;
   private String edtAlbCliCod_Internalname ;
   private String edtAlbCliCod_Jsonclick ;
   private String edtAlbMetULi_Internalname ;
   private String edtAlbMetULi_Jsonclick ;
   private String edtBarFasExt_Internalname ;
   private String A2398BarFasExt ;
   private String edtBarFasExt_Jsonclick ;
   private String edtBarGraCob_Internalname ;
   private String edtBarGraCob_Jsonclick ;
   private String edtBarTipDis_Internalname ;
   private String A2010BarTipDis ;
   private String edtBarTipDis_Jsonclick ;
   private String edtBarAlbPN_Internalname ;
   private String edtBarAlbPN_Jsonclick ;
   private String edtBarCtrPdas_Internalname ;
   private String edtBarCtrPdas_Jsonclick ;
   private String edtAlbDto_Internalname ;
   private String edtAlbDto_Jsonclick ;
   private String edtAlbMqTj_Internalname ;
   private String A7993AlbMqTj ;
   private String edtAlbMqTj_Jsonclick ;
   private String edtAlbDf3_Internalname ;
   private String A7992AlbDf3 ;
   private String edtAlbDf3_Jsonclick ;
   private String edtAlbDf2_Internalname ;
   private String A7991AlbDf2 ;
   private String edtAlbDf2_Jsonclick ;
   private String edtAlbDf1_Internalname ;
   private String A7990AlbDf1 ;
   private String edtAlbDf1_Jsonclick ;
   private String edtAlbCald_Internalname ;
   private String A7989AlbCald ;
   private String edtAlbCald_Jsonclick ;
   private String edtAlbEncA_Internalname ;
   private String edtAlbEncA_Jsonclick ;
   private String edtAlbEncL_Internalname ;
   private String edtAlbEncL_Jsonclick ;
   private String edtAlbObsM_Internalname ;
   private String edtAlbBarRec_Internalname ;
   private String edtAlbBarRec_Jsonclick ;
   private String edtAlbImpMan_Internalname ;
   private String edtAlbImpMan_Jsonclick ;
   private String edtBarDisNum_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Jsonclick ;
   private String edtBarGraAca_Internalname ;
   private String edtBarGraAca_Jsonclick ;
   private String edtAlbEncCli_Internalname ;
   private String A4815AlbEncCli ;
   private String edtAlbEncCli_Jsonclick ;
   private String edtBarEncCli_Internalname ;
   private String A4812BarEncCli ;
   private String edtBarEncCli_Jsonclick ;
   private String edtBarSerDsc_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipCol_Internalname ;
   private String edtBarTipCol_Jsonclick ;
   private String edtBarColNum_Internalname ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarColNom_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Jsonclick ;
   private String edtAlbTipCol_Internalname ;
   private String edtAlbTipCol_Jsonclick ;
   private String edtBarPart_Internalname ;
   private String edtBarPart_Jsonclick ;
   private String edtBarAlbBul_Internalname ;
   private String edtBarAlbBul_Jsonclick ;
   private String edtAlbProRec_Internalname ;
   private String edtAlbProRec_Jsonclick ;
   private String edtAlbProEsp_Internalname ;
   private String edtAlbProEsp_Jsonclick ;
   private String edtBarKla_Internalname ;
   private String edtBarKla_Jsonclick ;
   private String edtBarMla_Internalname ;
   private String edtBarMla_Jsonclick ;
   private String edtBarPlz_Internalname ;
   private String edtBarPlz_Jsonclick ;
   private String edtBarPie_Internalname ;
   private String edtBarPie_Jsonclick ;
   private String edtBarFecSal_Internalname ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarAncAca1_Internalname ;
   private String edtBarAncAca1_Jsonclick ;
   private String edtBarSit_Internalname ;
   private String edtBarSit_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtBarSer_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Jsonclick ;
   private String edtGuiFasULin_Internalname ;
   private String edtGuiFasULin_Jsonclick ;
   private String edtAlbHdrUlin_Internalname ;
   private String edtAlbHdrUlin_Jsonclick ;
   private String edtBarAcaAnh_Internalname ;
   private String edtBarAcaAnh_Jsonclick ;
   private String edtAlbCadEnc_Internalname ;
   private String edtAlbCadEnc_Jsonclick ;
   private String edtTipAcaCod_Internalname ;
   private String edtTipAcaCod_Jsonclick ;
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
   private String Z1234BarNomCli ;
   private String Z5034BarEstTip ;
   private String Z5291BarTipCor ;
   private String Z2010BarTipDis ;
   private String Z5253BarAcc ;
   private String Z143BarDisNum ;
   private String Z4812BarEncCli ;
   private String Z1652BarSerDsc ;
   private String Z135BarColNom ;
   private String Z212BarSer ;
   private String Z365DisDes ;
   private String sMode195 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ3391AlbSer ;
   private String ZZ8879AlbSerD ;
   private String ZZ3392AlbColNom ;
   private String ZZ12232AlbNomCli ;
   private String ZZ3153CodCod ;
   private String ZZ2441AlbHdrObs ;
   private String ZZ2839AlbProVal ;
   private String ZZ1095AlbTipEnt ;
   private String ZZ2398BarFasExt ;
   private String ZZ7993AlbMqTj ;
   private String ZZ7992AlbDf3 ;
   private String ZZ7991AlbDf2 ;
   private String ZZ7990AlbDf1 ;
   private String ZZ7989AlbCald ;
   private String ZZ4815AlbEncCli ;
   private String ZZ1234BarNomCli ;
   private String ZZ5034BarEstTip ;
   private String ZZ5291BarTipCor ;
   private String ZZ2010BarTipDis ;
   private String ZZ5253BarAcc ;
   private String ZZ143BarDisNum ;
   private String ZZ4812BarEncCli ;
   private String ZZ1652BarSerDsc ;
   private String ZZ135BarColNom ;
   private String ZZ212BarSer ;
   private String ZZ365DisDes ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date Z161BarFecSal ;
   private java.util.Date ZZ161BarFecSal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n1206TubCod ;
   private boolean n3153CodCod ;
   private boolean wbErr ;
   private boolean n6466PlasCod ;
   private boolean n217BarTipArt ;
   private boolean n4937BarCtrPdas ;
   private boolean n252CliCod ;
   private boolean Gx_longc ;
   private String Z6814AlbObsM ;
   private String A6814AlbObsM ;
   private String ZZ6814AlbObsM ;
   private HTMLChoice cmbAlbProVal ;
   private ICheckbox chkBarTipCor ;
   private ICheckbox chkBarAcc ;
   private HTMLChoice cmbBarEstReo ;
   private ICheckbox chkDisDes ;
   private IDataStoreProvider pr_default ;
   private int[] T01Q615_A361DisCod ;
   private String[] T01Q615_A3391AlbSer ;
   private String[] T01Q615_A8879AlbSerD ;
   private String[] T01Q615_A3392AlbColNom ;
   private String[] T01Q615_A12232AlbNomCli ;
   private int[] T01Q615_A3393AlbColNum ;
   private java.math.BigDecimal[] T01Q615_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01Q615_A1262BarPreKgm ;
   private short[] T01Q615_A3271AlbHdrAnc ;
   private short[] T01Q615_A5019AlbHdrgm2 ;
   private java.math.BigDecimal[] T01Q615_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01Q615_A1264BarPreMtr ;
   private int[] T01Q615_A1265BarAlbPie ;
   private int[] T01Q615_A1266BarAlbTub ;
   private short[] T01Q615_A6466PlasCod ;
   private boolean[] T01Q615_n6466PlasCod ;
   private short[] T01Q615_A6467BarAlbPlas ;
   private String[] T01Q615_A2441AlbHdrObs ;
   private String[] T01Q615_A2839AlbProVal ;
   private String[] T01Q615_A1095AlbTipEnt ;
   private short[] T01Q615_A12234AlbTipArt ;
   private int[] T01Q615_A12233AlbNumcli ;
   private int[] T01Q615_A1235BarNumCli ;
   private String[] T01Q615_A1234BarNomCli ;
   private int[] T01Q615_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01Q615_A12196BarPreUnd ;
   private String[] T01Q615_A5034BarEstTip ;
   private int[] T01Q615_A3886AlbCliCod ;
   private short[] T01Q615_A6645AlbMetULi ;
   private String[] T01Q615_A2398BarFasExt ;
   private String[] T01Q615_A5291BarTipCor ;
   private byte[] T01Q615_A5027BarGraCob ;
   private String[] T01Q615_A2010BarTipDis ;
   private java.math.BigDecimal[] T01Q615_A1461BarAlbPN ;
   private byte[] T01Q615_A4937BarCtrPdas ;
   private boolean[] T01Q615_n4937BarCtrPdas ;
   private java.math.BigDecimal[] T01Q615_A7994AlbDto ;
   private String[] T01Q615_A7993AlbMqTj ;
   private String[] T01Q615_A7992AlbDf3 ;
   private String[] T01Q615_A7991AlbDf2 ;
   private String[] T01Q615_A7990AlbDf1 ;
   private String[] T01Q615_A7989AlbCald ;
   private java.math.BigDecimal[] T01Q615_A7104AlbEncA ;
   private java.math.BigDecimal[] T01Q615_A7103AlbEncL ;
   private String[] T01Q615_A6814AlbObsM ;
   private java.math.BigDecimal[] T01Q615_A2761AlbBarRec ;
   private String[] T01Q615_A5253BarAcc ;
   private java.math.BigDecimal[] T01Q615_A5354AlbImpMan ;
   private byte[] T01Q615_A148BarEstReo ;
   private String[] T01Q615_A143BarDisNum ;
   private short[] T01Q615_A1909BarGraAca ;
   private String[] T01Q615_A4815AlbEncCli ;
   private String[] T01Q615_A4812BarEncCli ;
   private String[] T01Q615_A1652BarSerDsc ;
   private byte[] T01Q615_A218BarTipCol ;
   private int[] T01Q615_A136BarColNum ;
   private String[] T01Q615_A135BarColNom ;
   private byte[] T01Q615_A3394AlbTipCol ;
   private short[] T01Q615_A1503BarPart ;
   private short[] T01Q615_A1458BarAlbBul ;
   private String[] T01Q615_A365DisDes ;
   private java.math.BigDecimal[] T01Q615_A40AlbProRec ;
   private byte[] T01Q615_A32AlbProEsp ;
   private java.util.Date[] T01Q615_A161BarFecSal ;
   private short[] T01Q615_A125BarAncAca1 ;
   private byte[] T01Q615_A213BarSit ;
   private String[] T01Q615_A212BarSer ;
   private short[] T01Q615_A1248GuiFasULin ;
   private short[] T01Q615_A2763AlbHdrUlin ;
   private short[] T01Q615_A4466BarAcaAnh ;
   private short[] T01Q615_A12905AlbCadEnc ;
   private short[] T01Q615_A5051TipAcaCod ;
   private String[] T01Q615_A396EmprCod ;
   private int[] T01Q615_A129BarCod ;
   private byte[] T01Q615_A132BarCodReo ;
   private String[] T01Q615_A130BarCodPar ;
   private short[] T01Q615_A1206TubCod ;
   private boolean[] T01Q615_n1206TubCod ;
   private long[] T01Q615_A30AlbProCod ;
   private String[] T01Q615_A3153CodCod ;
   private boolean[] T01Q615_n3153CodCod ;
   private int[] T01Q615_A252CliCod ;
   private boolean[] T01Q615_n252CliCod ;
   private short[] T01Q615_A217BarTipArt ;
   private boolean[] T01Q615_n217BarTipArt ;
   private java.math.BigDecimal[] T01Q615_A1279BarKla ;
   private java.math.BigDecimal[] T01Q615_A1280BarMla ;
   private short[] T01Q615_A1292BarPlz ;
   private int[] T01Q615_A898BarPieNDes ;
   private short[] T01Q615_A199BarPie1 ;
   private String[] T01Q65_A396EmprCod ;
   private String[] T01Q67_A396EmprCod ;
   private String[] T01Q66_A396EmprCod ;
   private int[] T01Q64_A361DisCod ;
   private int[] T01Q64_A1235BarNumCli ;
   private String[] T01Q64_A1234BarNomCli ;
   private String[] T01Q64_A5034BarEstTip ;
   private String[] T01Q64_A5291BarTipCor ;
   private byte[] T01Q64_A5027BarGraCob ;
   private String[] T01Q64_A2010BarTipDis ;
   private byte[] T01Q64_A4937BarCtrPdas ;
   private boolean[] T01Q64_n4937BarCtrPdas ;
   private String[] T01Q64_A5253BarAcc ;
   private byte[] T01Q64_A148BarEstReo ;
   private String[] T01Q64_A143BarDisNum ;
   private short[] T01Q64_A1909BarGraAca ;
   private String[] T01Q64_A4812BarEncCli ;
   private String[] T01Q64_A1652BarSerDsc ;
   private byte[] T01Q64_A218BarTipCol ;
   private int[] T01Q64_A136BarColNum ;
   private String[] T01Q64_A135BarColNom ;
   private short[] T01Q64_A1503BarPart ;
   private java.util.Date[] T01Q64_A161BarFecSal ;
   private short[] T01Q64_A125BarAncAca1 ;
   private byte[] T01Q64_A213BarSit ;
   private String[] T01Q64_A212BarSer ;
   private short[] T01Q64_A4466BarAcaAnh ;
   private int[] T01Q64_A252CliCod ;
   private boolean[] T01Q64_n252CliCod ;
   private short[] T01Q64_A217BarTipArt ;
   private boolean[] T01Q64_n217BarTipArt ;
   private String[] T01Q68_A365DisDes ;
   private java.math.BigDecimal[] T01Q610_A1279BarKla ;
   private java.math.BigDecimal[] T01Q610_A1280BarMla ;
   private short[] T01Q610_A1292BarPlz ;
   private int[] T01Q612_A898BarPieNDes ;
   private short[] T01Q612_A199BarPie1 ;
   private String[] T01Q616_A396EmprCod ;
   private String[] T01Q617_A396EmprCod ;
   private String[] T01Q618_A396EmprCod ;
   private int[] T01Q619_A361DisCod ;
   private int[] T01Q619_A1235BarNumCli ;
   private String[] T01Q619_A1234BarNomCli ;
   private String[] T01Q619_A5034BarEstTip ;
   private String[] T01Q619_A5291BarTipCor ;
   private byte[] T01Q619_A5027BarGraCob ;
   private String[] T01Q619_A2010BarTipDis ;
   private byte[] T01Q619_A4937BarCtrPdas ;
   private boolean[] T01Q619_n4937BarCtrPdas ;
   private String[] T01Q619_A5253BarAcc ;
   private byte[] T01Q619_A148BarEstReo ;
   private String[] T01Q619_A143BarDisNum ;
   private short[] T01Q619_A1909BarGraAca ;
   private String[] T01Q619_A4812BarEncCli ;
   private String[] T01Q619_A1652BarSerDsc ;
   private byte[] T01Q619_A218BarTipCol ;
   private int[] T01Q619_A136BarColNum ;
   private String[] T01Q619_A135BarColNom ;
   private short[] T01Q619_A1503BarPart ;
   private java.util.Date[] T01Q619_A161BarFecSal ;
   private short[] T01Q619_A125BarAncAca1 ;
   private byte[] T01Q619_A213BarSit ;
   private String[] T01Q619_A212BarSer ;
   private short[] T01Q619_A4466BarAcaAnh ;
   private int[] T01Q619_A252CliCod ;
   private boolean[] T01Q619_n252CliCod ;
   private short[] T01Q619_A217BarTipArt ;
   private boolean[] T01Q619_n217BarTipArt ;
   private String[] T01Q620_A365DisDes ;
   private java.math.BigDecimal[] T01Q622_A1279BarKla ;
   private java.math.BigDecimal[] T01Q622_A1280BarMla ;
   private short[] T01Q622_A1292BarPlz ;
   private int[] T01Q624_A898BarPieNDes ;
   private short[] T01Q624_A199BarPie1 ;
   private String[] T01Q625_A396EmprCod ;
   private long[] T01Q625_A30AlbProCod ;
   private int[] T01Q625_A129BarCod ;
   private byte[] T01Q625_A132BarCodReo ;
   private String[] T01Q625_A130BarCodPar ;
   private String[] T01Q63_A3391AlbSer ;
   private String[] T01Q63_A8879AlbSerD ;
   private String[] T01Q63_A3392AlbColNom ;
   private String[] T01Q63_A12232AlbNomCli ;
   private int[] T01Q63_A3393AlbColNum ;
   private java.math.BigDecimal[] T01Q63_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01Q63_A1262BarPreKgm ;
   private short[] T01Q63_A3271AlbHdrAnc ;
   private short[] T01Q63_A5019AlbHdrgm2 ;
   private java.math.BigDecimal[] T01Q63_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01Q63_A1264BarPreMtr ;
   private int[] T01Q63_A1265BarAlbPie ;
   private int[] T01Q63_A1266BarAlbTub ;
   private short[] T01Q63_A6466PlasCod ;
   private boolean[] T01Q63_n6466PlasCod ;
   private short[] T01Q63_A6467BarAlbPlas ;
   private String[] T01Q63_A2441AlbHdrObs ;
   private String[] T01Q63_A2839AlbProVal ;
   private String[] T01Q63_A1095AlbTipEnt ;
   private short[] T01Q63_A12234AlbTipArt ;
   private int[] T01Q63_A12233AlbNumcli ;
   private int[] T01Q63_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01Q63_A12196BarPreUnd ;
   private int[] T01Q63_A3886AlbCliCod ;
   private short[] T01Q63_A6645AlbMetULi ;
   private String[] T01Q63_A2398BarFasExt ;
   private java.math.BigDecimal[] T01Q63_A1461BarAlbPN ;
   private java.math.BigDecimal[] T01Q63_A7994AlbDto ;
   private String[] T01Q63_A7993AlbMqTj ;
   private String[] T01Q63_A7992AlbDf3 ;
   private String[] T01Q63_A7991AlbDf2 ;
   private String[] T01Q63_A7990AlbDf1 ;
   private String[] T01Q63_A7989AlbCald ;
   private java.math.BigDecimal[] T01Q63_A7104AlbEncA ;
   private java.math.BigDecimal[] T01Q63_A7103AlbEncL ;
   private String[] T01Q63_A6814AlbObsM ;
   private java.math.BigDecimal[] T01Q63_A2761AlbBarRec ;
   private java.math.BigDecimal[] T01Q63_A5354AlbImpMan ;
   private String[] T01Q63_A4815AlbEncCli ;
   private byte[] T01Q63_A3394AlbTipCol ;
   private short[] T01Q63_A1458BarAlbBul ;
   private java.math.BigDecimal[] T01Q63_A40AlbProRec ;
   private byte[] T01Q63_A32AlbProEsp ;
   private short[] T01Q63_A1248GuiFasULin ;
   private short[] T01Q63_A2763AlbHdrUlin ;
   private short[] T01Q63_A12905AlbCadEnc ;
   private short[] T01Q63_A5051TipAcaCod ;
   private String[] T01Q63_A396EmprCod ;
   private int[] T01Q63_A129BarCod ;
   private byte[] T01Q63_A132BarCodReo ;
   private String[] T01Q63_A130BarCodPar ;
   private short[] T01Q63_A1206TubCod ;
   private boolean[] T01Q63_n1206TubCod ;
   private long[] T01Q63_A30AlbProCod ;
   private String[] T01Q63_A3153CodCod ;
   private boolean[] T01Q63_n3153CodCod ;
   private String[] T01Q626_A396EmprCod ;
   private int[] T01Q626_A129BarCod ;
   private byte[] T01Q626_A132BarCodReo ;
   private String[] T01Q626_A130BarCodPar ;
   private long[] T01Q626_A30AlbProCod ;
   private String[] T01Q627_A396EmprCod ;
   private int[] T01Q627_A129BarCod ;
   private byte[] T01Q627_A132BarCodReo ;
   private String[] T01Q627_A130BarCodPar ;
   private long[] T01Q627_A30AlbProCod ;
   private String[] T01Q62_A3391AlbSer ;
   private String[] T01Q62_A8879AlbSerD ;
   private String[] T01Q62_A3392AlbColNom ;
   private String[] T01Q62_A12232AlbNomCli ;
   private int[] T01Q62_A3393AlbColNum ;
   private java.math.BigDecimal[] T01Q62_A1261BarAlbKgmE ;
   private java.math.BigDecimal[] T01Q62_A1262BarPreKgm ;
   private short[] T01Q62_A3271AlbHdrAnc ;
   private short[] T01Q62_A5019AlbHdrgm2 ;
   private java.math.BigDecimal[] T01Q62_A1263BarAlbMtrE ;
   private java.math.BigDecimal[] T01Q62_A1264BarPreMtr ;
   private int[] T01Q62_A1265BarAlbPie ;
   private int[] T01Q62_A1266BarAlbTub ;
   private short[] T01Q62_A6466PlasCod ;
   private boolean[] T01Q62_n6466PlasCod ;
   private short[] T01Q62_A6467BarAlbPlas ;
   private String[] T01Q62_A2441AlbHdrObs ;
   private String[] T01Q62_A2839AlbProVal ;
   private String[] T01Q62_A1095AlbTipEnt ;
   private short[] T01Q62_A12234AlbTipArt ;
   private int[] T01Q62_A12233AlbNumcli ;
   private int[] T01Q62_A12195BarAlbUnd ;
   private java.math.BigDecimal[] T01Q62_A12196BarPreUnd ;
   private int[] T01Q62_A3886AlbCliCod ;
   private short[] T01Q62_A6645AlbMetULi ;
   private String[] T01Q62_A2398BarFasExt ;
   private java.math.BigDecimal[] T01Q62_A1461BarAlbPN ;
   private java.math.BigDecimal[] T01Q62_A7994AlbDto ;
   private String[] T01Q62_A7993AlbMqTj ;
   private String[] T01Q62_A7992AlbDf3 ;
   private String[] T01Q62_A7991AlbDf2 ;
   private String[] T01Q62_A7990AlbDf1 ;
   private String[] T01Q62_A7989AlbCald ;
   private java.math.BigDecimal[] T01Q62_A7104AlbEncA ;
   private java.math.BigDecimal[] T01Q62_A7103AlbEncL ;
   private String[] T01Q62_A6814AlbObsM ;
   private java.math.BigDecimal[] T01Q62_A2761AlbBarRec ;
   private java.math.BigDecimal[] T01Q62_A5354AlbImpMan ;
   private String[] T01Q62_A4815AlbEncCli ;
   private byte[] T01Q62_A3394AlbTipCol ;
   private short[] T01Q62_A1458BarAlbBul ;
   private java.math.BigDecimal[] T01Q62_A40AlbProRec ;
   private byte[] T01Q62_A32AlbProEsp ;
   private short[] T01Q62_A1248GuiFasULin ;
   private short[] T01Q62_A2763AlbHdrUlin ;
   private short[] T01Q62_A12905AlbCadEnc ;
   private short[] T01Q62_A5051TipAcaCod ;
   private String[] T01Q62_A396EmprCod ;
   private int[] T01Q62_A129BarCod ;
   private byte[] T01Q62_A132BarCodReo ;
   private String[] T01Q62_A130BarCodPar ;
   private short[] T01Q62_A1206TubCod ;
   private boolean[] T01Q62_n1206TubCod ;
   private long[] T01Q62_A30AlbProCod ;
   private String[] T01Q62_A3153CodCod ;
   private boolean[] T01Q62_n3153CodCod ;
   private int[] T01Q631_A361DisCod ;
   private int[] T01Q631_A1235BarNumCli ;
   private String[] T01Q631_A1234BarNomCli ;
   private String[] T01Q631_A5034BarEstTip ;
   private String[] T01Q631_A5291BarTipCor ;
   private byte[] T01Q631_A5027BarGraCob ;
   private String[] T01Q631_A2010BarTipDis ;
   private byte[] T01Q631_A4937BarCtrPdas ;
   private boolean[] T01Q631_n4937BarCtrPdas ;
   private String[] T01Q631_A5253BarAcc ;
   private byte[] T01Q631_A148BarEstReo ;
   private String[] T01Q631_A143BarDisNum ;
   private short[] T01Q631_A1909BarGraAca ;
   private String[] T01Q631_A4812BarEncCli ;
   private String[] T01Q631_A1652BarSerDsc ;
   private byte[] T01Q631_A218BarTipCol ;
   private int[] T01Q631_A136BarColNum ;
   private String[] T01Q631_A135BarColNom ;
   private short[] T01Q631_A1503BarPart ;
   private java.util.Date[] T01Q631_A161BarFecSal ;
   private short[] T01Q631_A125BarAncAca1 ;
   private byte[] T01Q631_A213BarSit ;
   private String[] T01Q631_A212BarSer ;
   private short[] T01Q631_A4466BarAcaAnh ;
   private int[] T01Q631_A252CliCod ;
   private boolean[] T01Q631_n252CliCod ;
   private short[] T01Q631_A217BarTipArt ;
   private boolean[] T01Q631_n217BarTipArt ;
   private String[] T01Q632_A365DisDes ;
   private java.math.BigDecimal[] T01Q634_A1279BarKla ;
   private java.math.BigDecimal[] T01Q634_A1280BarMla ;
   private short[] T01Q634_A1292BarPlz ;
   private int[] T01Q636_A898BarPieNDes ;
   private short[] T01Q636_A199BarPie1 ;
   private String[] T01Q637_A396EmprCod ;
   private long[] T01Q637_A30AlbProCod ;
   private int[] T01Q637_A129BarCod ;
   private byte[] T01Q637_A132BarCodReo ;
   private String[] T01Q637_A130BarCodPar ;
   private short[] T01Q637_A6648AlbMetLin ;
   private String[] T01Q638_A396EmprCod ;
   private long[] T01Q638_A30AlbProCod ;
   private int[] T01Q638_A129BarCod ;
   private byte[] T01Q638_A132BarCodReo ;
   private String[] T01Q638_A130BarCodPar ;
   private short[] T01Q638_A9639Et_Numero ;
   private String[] T01Q639_A396EmprCod ;
   private long[] T01Q639_A30AlbProCod ;
   private int[] T01Q639_A129BarCod ;
   private byte[] T01Q639_A132BarCodReo ;
   private String[] T01Q639_A130BarCodPar ;
   private short[] T01Q639_A6622AlbHdRLn ;
   private String[] T01Q640_A396EmprCod ;
   private long[] T01Q640_A30AlbProCod ;
   private int[] T01Q640_A129BarCod ;
   private byte[] T01Q640_A132BarCodReo ;
   private String[] T01Q640_A130BarCodPar ;
   private short[] T01Q640_A5456P_ForLin ;
   private String[] T01Q641_A396EmprCod ;
   private long[] T01Q641_A30AlbProCod ;
   private int[] T01Q641_A129BarCod ;
   private byte[] T01Q641_A132BarCodReo ;
   private String[] T01Q641_A130BarCodPar ;
   private byte[] T01Q641_A2524DisComLin ;
   private String[] T01Q641_A1056DisComCod ;
   private String[] T01Q641_A1032FonCod ;
   private String[] T01Q642_A396EmprCod ;
   private long[] T01Q642_A3617AlbTrnCod ;
   private long[] T01Q642_A30AlbProCod ;
   private int[] T01Q642_A129BarCod ;
   private byte[] T01Q642_A132BarCodReo ;
   private String[] T01Q642_A130BarCodPar ;
   private String[] T01Q643_A396EmprCod ;
   private long[] T01Q643_A30AlbProCod ;
   private int[] T01Q643_A129BarCod ;
   private byte[] T01Q643_A132BarCodReo ;
   private String[] T01Q643_A130BarCodPar ;
   private short[] T01Q643_A3621AlbPckLin ;
   private String[] T01Q644_A396EmprCod ;
   private long[] T01Q644_A30AlbProCod ;
   private int[] T01Q644_A129BarCod ;
   private byte[] T01Q644_A132BarCodReo ;
   private String[] T01Q644_A130BarCodPar ;
   private short[] T01Q644_A2764AlbHdrLin ;
   private String[] T01Q645_A396EmprCod ;
   private long[] T01Q645_A30AlbProCod ;
   private int[] T01Q645_A129BarCod ;
   private byte[] T01Q645_A132BarCodReo ;
   private String[] T01Q645_A130BarCodPar ;
   private short[] T01Q645_A1468AlbPrdLin ;
   private String[] T01Q646_A396EmprCod ;
   private long[] T01Q646_A30AlbProCod ;
   private int[] T01Q646_A129BarCod ;
   private byte[] T01Q646_A132BarCodReo ;
   private String[] T01Q646_A130BarCodPar ;
   private String[] T01Q646_A200BarPieCod ;
   private String[] T01Q647_A396EmprCod ;
   private long[] T01Q647_A30AlbProCod ;
   private int[] T01Q647_A129BarCod ;
   private byte[] T01Q647_A132BarCodReo ;
   private String[] T01Q647_A130BarCodPar ;
   private short[] T01Q647_A1240GuiFasLin ;
   private String[] T01Q648_A396EmprCod ;
   private long[] T01Q648_A30AlbProCod ;
   private int[] T01Q648_A129BarCod ;
   private byte[] T01Q648_A132BarCodReo ;
   private String[] T01Q648_A130BarCodPar ;
   private String[] T01Q649_A396EmprCod ;
   private String[] T01Q650_A396EmprCod ;
   private String[] T01Q651_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class albbar__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albbar__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albbar__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class albbar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01Q62", "SELECT AlbSer, AlbSerD, AlbColNom, AlbNomCli, AlbColNum, BarAlbKgmE, BarPreKgm, AlbHdrAnc, AlbHdrgm2, BarAlbMtrE, BarPreMtr, BarAlbPie, BarAlbTub, PlasCod, BarAlbPlas, AlbHdrObs, AlbProVal, AlbTipEnt, AlbTipArt, AlbNumcli, BarAlbUnd, BarPreUnd, AlbCliCod, AlbMetULi, BarFasExt, BarAlbPN, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, AlbObsM, AlbBarRec, AlbImpMan, AlbEncCli, AlbTipCol, BarAlbBul, AlbProRec, AlbProEsp, GuiFasULin, AlbHdrUlin, AlbCadEnc, TipAcaCod, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, AlbProCod, CodCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?  FOR UPDATE OF AlbSer, AlbSerD, AlbColNom, AlbNomCli, AlbColNum, BarAlbKgmE, BarPreKgm, AlbHdrAnc, AlbHdrgm2, BarAlbMtrE, BarPreMtr, BarAlbPie, BarAlbTub, PlasCod, BarAlbPlas, AlbHdrObs, AlbProVal, AlbTipEnt, AlbTipArt, AlbNumcli, BarAlbUnd, BarPreUnd, AlbCliCod, AlbMetULi, BarFasExt, BarAlbPN, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, AlbObsM, AlbBarRec, AlbImpMan, AlbEncCli, AlbTipCol, BarAlbBul, AlbProRec, AlbProEsp, GuiFasULin, AlbHdrUlin, AlbCadEnc, TipAcaCod, TubCod, CodCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q63", "SELECT AlbSer, AlbSerD, AlbColNom, AlbNomCli, AlbColNum, BarAlbKgmE, BarPreKgm, AlbHdrAnc, AlbHdrgm2, BarAlbMtrE, BarPreMtr, BarAlbPie, BarAlbTub, PlasCod, BarAlbPlas, AlbHdrObs, AlbProVal, AlbTipEnt, AlbTipArt, AlbNumcli, BarAlbUnd, BarPreUnd, AlbCliCod, AlbMetULi, BarFasExt, BarAlbPN, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, AlbObsM, AlbBarRec, AlbImpMan, AlbEncCli, AlbTipCol, BarAlbBul, AlbProRec, AlbProEsp, GuiFasULin, AlbHdrUlin, AlbCadEnc, TipAcaCod, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, AlbProCod, CodCod FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q64", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q65", "SELECT EmprCod FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q66", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q67", "SELECT EmprCod FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q68", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q610", "SELECT COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q612", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q615", "SELECT /*+ FIRST_ROWS(100) */ T2.DisCod, TM1.AlbSer, TM1.AlbSerD, TM1.AlbColNom, TM1.AlbNomCli, TM1.AlbColNum, TM1.BarAlbKgmE, TM1.BarPreKgm, TM1.AlbHdrAnc, TM1.AlbHdrgm2, TM1.BarAlbMtrE, TM1.BarPreMtr, TM1.BarAlbPie, TM1.BarAlbTub, TM1.PlasCod, TM1.BarAlbPlas, TM1.AlbHdrObs, TM1.AlbProVal, TM1.AlbTipEnt, TM1.AlbTipArt, TM1.AlbNumcli, T2.BarNumCli, T2.BarNomCli, TM1.BarAlbUnd, TM1.BarPreUnd, T2.BarEstTip, TM1.AlbCliCod, TM1.AlbMetULi, TM1.BarFasExt, T2.BarTipCor, T2.BarGraCob, T2.BarTipDis, TM1.BarAlbPN, T2.BarCtrPdas, TM1.AlbDto, TM1.AlbMqTj, TM1.AlbDf3, TM1.AlbDf2, TM1.AlbDf1, TM1.AlbCald, TM1.AlbEncA, TM1.AlbEncL, TM1.AlbObsM, TM1.AlbBarRec, T2.BarAcc, TM1.AlbImpMan, T2.BarEstReo, T2.BarDisNum, T2.BarGraAca, TM1.AlbEncCli, T2.BarEncCli, T2.BarSerDsc, T2.BarTipCol, T2.BarColNum, T2.BarColNom, TM1.AlbTipCol, T2.BarPart, TM1.BarAlbBul, T3.DisDes, TM1.AlbProRec, TM1.AlbProEsp, T2.BarFecSal, T2.BarAncAca1, T2.BarSit, T2.BarSer, TM1.GuiFasULin, TM1.AlbHdrUlin, T2.BarAcaAnh, TM1.AlbCadEnc, TM1.TipAcaCod, TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.TubCod, TM1.AlbProCod, TM1.CodCod, T2.CliCod, T2.BarTipArt, COALESCE( T4.BarKla, 0) AS BarKla, COALESCE( T4.BarMla, 0) AS BarMla, COALESCE( T4.BarPlz, 0) AS BarPlz, COALESCE( T5.BarPieNDes, 0) AS BarPieNDes, COALESCE( T5.BarPie1, 0) AS BarPie1 FROM ((((TXPALBBAR TM1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = TM1.EmprCod AND T2.BarCod = TM1.BarCod AND T2.BarCodReo = TM1.BarCodReo AND T2.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = T2.DisCod) LEFT JOIN (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = TM1.EmprCod AND T5.BarCod = TM1.BarCod AND T5.BarCodReo = TM1.BarCodReo AND T5.BarCodPar = TM1.BarCodPar) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q616", "SELECT EmprCod FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q617", "SELECT EmprCod FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q618", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q619", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q620", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q622", "SELECT COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q624", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q625", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q626", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q627", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, AlbProCod FROM TXPALBBAR WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01Q628", "INSERT INTO TXPALBBAR(AlbSer, AlbSerD, AlbColNom, AlbNomCli, AlbColNum, BarAlbKgmE, BarPreKgm, AlbHdrAnc, AlbHdrgm2, BarAlbMtrE, BarPreMtr, BarAlbPie, BarAlbTub, PlasCod, BarAlbPlas, AlbHdrObs, AlbProVal, AlbTipEnt, AlbTipArt, AlbNumcli, BarAlbUnd, BarPreUnd, AlbCliCod, AlbMetULi, BarFasExt, BarAlbPN, AlbDto, AlbMqTj, AlbDf3, AlbDf2, AlbDf1, AlbCald, AlbEncA, AlbEncL, AlbObsM, AlbBarRec, AlbImpMan, AlbEncCli, AlbTipCol, BarAlbBul, AlbProRec, AlbProEsp, GuiFasULin, AlbHdrUlin, AlbCadEnc, TipAcaCod, EmprCod, BarCod, BarCodReo, BarCodPar, TubCod, AlbProCod, CodCod, AlbPConPie, BarAlbTar, BarAlbFor, BarAlbTip, AlbPrdULin, IntCod, BarAlbPbr, ManCod, BarFasExtD, BarAlbObs, BarAlbExt, BarAlbTin, AlbBarDto, AlbTipCon, AlbPckUlin, P_ForULin, AlbHdRUl, BarPreFKg, BarPreFMt, BarPreTKg, BarPreTMt, Et_UltNum, BarKgsCli, AlbTiras, AlbTirasKg, AlbSinTest) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01Q629", "UPDATE TXPALBBAR SET AlbSer=?, AlbSerD=?, AlbColNom=?, AlbNomCli=?, AlbColNum=?, BarAlbKgmE=?, BarPreKgm=?, AlbHdrAnc=?, AlbHdrgm2=?, BarAlbMtrE=?, BarPreMtr=?, BarAlbPie=?, BarAlbTub=?, PlasCod=?, BarAlbPlas=?, AlbHdrObs=?, AlbProVal=?, AlbTipEnt=?, AlbTipArt=?, AlbNumcli=?, BarAlbUnd=?, BarPreUnd=?, AlbCliCod=?, AlbMetULi=?, BarFasExt=?, BarAlbPN=?, AlbDto=?, AlbMqTj=?, AlbDf3=?, AlbDf2=?, AlbDf1=?, AlbCald=?, AlbEncA=?, AlbEncL=?, AlbObsM=?, AlbBarRec=?, AlbImpMan=?, AlbEncCli=?, AlbTipCol=?, BarAlbBul=?, AlbProRec=?, AlbProEsp=?, GuiFasULin=?, AlbHdrUlin=?, AlbCadEnc=?, TipAcaCod=?, TubCod=?, CodCod=?  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new UpdateCursor("T01Q630", "DELETE FROM TXPALBBAR  WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?", GX_NOMASK, "TXPALBBAR")
         ,new ForEachCursor("T01Q631", "SELECT DisCod, BarNumCli, BarNomCli, BarEstTip, BarTipCor, BarGraCob, BarTipDis, BarCtrPdas, BarAcc, BarEstReo, BarDisNum, BarGraAca, BarEncCli, BarSerDsc, BarTipCol, BarColNum, BarColNom, BarPart, BarFecSal, BarAncAca1, BarSit, BarSer, BarAcaAnh, CliCod, BarTipArt FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q632", "SELECT DisDes FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q634", "SELECT COALESCE( T1.BarKla, 0) AS BarKla, COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarPlz, 0) AS BarPlz FROM (SELECT SUM(BarKilLan) AS BarKla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarMetLan) AS BarMla, SUM(BarPieLzd) AS BarPlz FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q636", "SELECT COALESCE( T1.BarPieNDes, 0) AS BarPieNDes, COALESCE( T1.BarPie1, 0) AS BarPie1 FROM (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q637", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbMetLin FROM TXPMETCAL WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q638", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, Et_Numero FROM TXPEDIETI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q639", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdRLn FROM TXPALBREP WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q640", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, P_ForLin FROM TXPALBQUI WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q641", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod FROM TXPALBEST WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q642", "SELECT * FROM (SELECT EmprCod, AlbTrnCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPLALBTR WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q643", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPckLin FROM TXPALBPCK WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q644", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbHdrLin FROM TXPALBTXT WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q645", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, AlbPrdLin FROM TXPALBPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q646", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, BarPieCod FROM TXPLALPRD WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q647", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND AlbProCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01Q648", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR ORDER BY EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q649", "SELECT EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q650", "SELECT EmprCod FROM TXPCODFAC WHERE EmprCod = ? AND CodCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01Q651", "SELECT EmprCod FROM TXPTUBOS WHERE EmprCod = ? AND TubCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 60);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((short[]) buf[24])[0] = rslt.getShort(24);
               ((String[]) buf[25])[0] = rslt.getString(25, 8);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,3);
               ((String[]) buf[28])[0] = rslt.getString(28, 16);
               ((String[]) buf[29])[0] = rslt.getString(29, 50);
               ((String[]) buf[30])[0] = rslt.getString(30, 50);
               ((String[]) buf[31])[0] = rslt.getString(31, 50);
               ((String[]) buf[32])[0] = rslt.getString(32, 12);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(34,2);
               ((String[]) buf[35])[0] = rslt.getVarchar(35);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,2);
               ((String[]) buf[38])[0] = rslt.getString(38, 20);
               ((byte[]) buf[39])[0] = rslt.getByte(39);
               ((short[]) buf[40])[0] = rslt.getShort(40);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(41,5);
               ((byte[]) buf[42])[0] = rslt.getByte(42);
               ((short[]) buf[43])[0] = rslt.getShort(43);
               ((short[]) buf[44])[0] = rslt.getShort(44);
               ((short[]) buf[45])[0] = rslt.getShort(45);
               ((short[]) buf[46])[0] = rslt.getShort(46);
               ((String[]) buf[47])[0] = rslt.getString(47, 3);
               ((int[]) buf[48])[0] = rslt.getInt(48);
               ((byte[]) buf[49])[0] = rslt.getByte(49);
               ((String[]) buf[50])[0] = rslt.getString(50, 1);
               ((short[]) buf[51])[0] = rslt.getShort(51);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(52);
               ((String[]) buf[54])[0] = rslt.getString(53, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 60);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((short[]) buf[19])[0] = rslt.getShort(19);
               ((int[]) buf[20])[0] = rslt.getInt(20);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(22,5);
               ((int[]) buf[23])[0] = rslt.getInt(23);
               ((short[]) buf[24])[0] = rslt.getShort(24);
               ((String[]) buf[25])[0] = rslt.getString(25, 8);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(27,3);
               ((String[]) buf[28])[0] = rslt.getString(28, 16);
               ((String[]) buf[29])[0] = rslt.getString(29, 50);
               ((String[]) buf[30])[0] = rslt.getString(30, 50);
               ((String[]) buf[31])[0] = rslt.getString(31, 50);
               ((String[]) buf[32])[0] = rslt.getString(32, 12);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(34,2);
               ((String[]) buf[35])[0] = rslt.getVarchar(35);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(36,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(37,2);
               ((String[]) buf[38])[0] = rslt.getString(38, 20);
               ((byte[]) buf[39])[0] = rslt.getByte(39);
               ((short[]) buf[40])[0] = rslt.getShort(40);
               ((java.math.BigDecimal[]) buf[41])[0] = rslt.getBigDecimal(41,5);
               ((byte[]) buf[42])[0] = rslt.getByte(42);
               ((short[]) buf[43])[0] = rslt.getShort(43);
               ((short[]) buf[44])[0] = rslt.getShort(44);
               ((short[]) buf[45])[0] = rslt.getShort(45);
               ((short[]) buf[46])[0] = rslt.getShort(46);
               ((String[]) buf[47])[0] = rslt.getString(47, 3);
               ((int[]) buf[48])[0] = rslt.getInt(48);
               ((byte[]) buf[49])[0] = rslt.getByte(49);
               ((String[]) buf[50])[0] = rslt.getString(50, 1);
               ((short[]) buf[51])[0] = rslt.getShort(51);
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(52);
               ((String[]) buf[54])[0] = rslt.getString(53, 6);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 16);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 7 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((String[]) buf[4])[0] = rslt.getString(5, 13);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 60);
               ((String[]) buf[18])[0] = rslt.getString(18, 1);
               ((String[]) buf[19])[0] = rslt.getString(19, 1);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((int[]) buf[21])[0] = rslt.getInt(21);
               ((int[]) buf[22])[0] = rslt.getInt(22);
               ((String[]) buf[23])[0] = rslt.getString(23, 13);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((java.math.BigDecimal[]) buf[25])[0] = rslt.getBigDecimal(25,5);
               ((String[]) buf[26])[0] = rslt.getString(26, 1);
               ((int[]) buf[27])[0] = rslt.getInt(27);
               ((short[]) buf[28])[0] = rslt.getShort(28);
               ((String[]) buf[29])[0] = rslt.getString(29, 8);
               ((String[]) buf[30])[0] = rslt.getString(30, 2);
               ((byte[]) buf[31])[0] = rslt.getByte(31);
               ((String[]) buf[32])[0] = rslt.getString(32, 1);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(33,2);
               ((byte[]) buf[34])[0] = rslt.getByte(34);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(35,3);
               ((String[]) buf[37])[0] = rslt.getString(36, 16);
               ((String[]) buf[38])[0] = rslt.getString(37, 50);
               ((String[]) buf[39])[0] = rslt.getString(38, 50);
               ((String[]) buf[40])[0] = rslt.getString(39, 50);
               ((String[]) buf[41])[0] = rslt.getString(40, 12);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(42,2);
               ((String[]) buf[44])[0] = rslt.getVarchar(43);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(44,2);
               ((String[]) buf[46])[0] = rslt.getString(45, 1);
               ((java.math.BigDecimal[]) buf[47])[0] = rslt.getBigDecimal(46,2);
               ((byte[]) buf[48])[0] = rslt.getByte(47);
               ((String[]) buf[49])[0] = rslt.getString(48, 8);
               ((short[]) buf[50])[0] = rslt.getShort(49);
               ((String[]) buf[51])[0] = rslt.getString(50, 20);
               ((String[]) buf[52])[0] = rslt.getString(51, 20);
               ((String[]) buf[53])[0] = rslt.getString(52, 26);
               ((byte[]) buf[54])[0] = rslt.getByte(53);
               ((int[]) buf[55])[0] = rslt.getInt(54);
               ((String[]) buf[56])[0] = rslt.getString(55, 13);
               ((byte[]) buf[57])[0] = rslt.getByte(56);
               ((short[]) buf[58])[0] = rslt.getShort(57);
               ((short[]) buf[59])[0] = rslt.getShort(58);
               ((String[]) buf[60])[0] = rslt.getString(59, 1);
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(60,5);
               ((byte[]) buf[62])[0] = rslt.getByte(61);
               ((java.util.Date[]) buf[63])[0] = rslt.getGXDate(62);
               ((short[]) buf[64])[0] = rslt.getShort(63);
               ((byte[]) buf[65])[0] = rslt.getByte(64);
               ((String[]) buf[66])[0] = rslt.getString(65, 16);
               ((short[]) buf[67])[0] = rslt.getShort(66);
               ((short[]) buf[68])[0] = rslt.getShort(67);
               ((short[]) buf[69])[0] = rslt.getShort(68);
               ((short[]) buf[70])[0] = rslt.getShort(69);
               ((short[]) buf[71])[0] = rslt.getShort(70);
               ((String[]) buf[72])[0] = rslt.getString(71, 3);
               ((int[]) buf[73])[0] = rslt.getInt(72);
               ((byte[]) buf[74])[0] = rslt.getByte(73);
               ((String[]) buf[75])[0] = rslt.getString(74, 1);
               ((short[]) buf[76])[0] = rslt.getShort(75);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((long[]) buf[78])[0] = rslt.getLong(76);
               ((String[]) buf[79])[0] = rslt.getString(77, 6);
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((int[]) buf[81])[0] = rslt.getInt(78);
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((short[]) buf[83])[0] = rslt.getShort(79);
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[85])[0] = rslt.getBigDecimal(80,2);
               ((java.math.BigDecimal[]) buf[86])[0] = rslt.getBigDecimal(81,2);
               ((short[]) buf[87])[0] = rslt.getShort(82);
               ((int[]) buf[88])[0] = rslt.getInt(83);
               ((short[]) buf[89])[0] = rslt.getShort(84);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 16);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               return;
            case 23 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 20);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 13);
               ((short[]) buf[18])[0] = rslt.getShort(18);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(19);
               ((short[]) buf[20])[0] = rslt.getShort(20);
               ((byte[]) buf[21])[0] = rslt.getByte(21);
               ((String[]) buf[22])[0] = rslt.getString(22, 16);
               ((short[]) buf[23])[0] = rslt.getShort(23);
               ((int[]) buf[24])[0] = rslt.getInt(24);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((short[]) buf[26])[0] = rslt.getShort(25);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 25 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 41 :
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
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
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
               stmt.setLong(5, ((Number) parms[4]).longValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 18 :
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
               stmt.setLong(15, ((Number) parms[14]).longValue());
               return;
            case 19 :
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
               stmt.setLong(15, ((Number) parms[14]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[14]).shortValue());
               }
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               stmt.setString(16, (String)parms[16], 60);
               stmt.setString(17, (String)parms[17], 1);
               stmt.setString(18, (String)parms[18], 1);
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setInt(20, ((Number) parms[20]).intValue());
               stmt.setInt(21, ((Number) parms[21]).intValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 5);
               stmt.setInt(23, ((Number) parms[23]).intValue());
               stmt.setShort(24, ((Number) parms[24]).shortValue());
               stmt.setString(25, (String)parms[25], 8);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[26], 2);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[27], 3);
               stmt.setString(28, (String)parms[28], 16);
               stmt.setString(29, (String)parms[29], 50);
               stmt.setString(30, (String)parms[30], 50);
               stmt.setString(31, (String)parms[31], 50);
               stmt.setString(32, (String)parms[32], 12);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[33], 2);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[34], 2);
               stmt.setVarchar(35, (String)parms[35], 2000, false);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[36], 2);
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[37], 2);
               stmt.setString(38, (String)parms[38], 20);
               stmt.setByte(39, ((Number) parms[39]).byteValue());
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[41], 5);
               stmt.setByte(42, ((Number) parms[42]).byteValue());
               stmt.setShort(43, ((Number) parms[43]).shortValue());
               stmt.setShort(44, ((Number) parms[44]).shortValue());
               stmt.setShort(45, ((Number) parms[45]).shortValue());
               stmt.setShort(46, ((Number) parms[46]).shortValue());
               stmt.setString(47, (String)parms[47], 3);
               stmt.setInt(48, ((Number) parms[48]).intValue());
               stmt.setByte(49, ((Number) parms[49]).byteValue());
               stmt.setString(50, (String)parms[50], 1);
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 51 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(51, ((Number) parms[52]).shortValue());
               }
               stmt.setLong(52, ((Number) parms[53]).longValue());
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 53 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(53, (String)parms[55], 6);
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 16);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setString(3, (String)parms[2], 13);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 2);
               stmt.setBigDecimal(7, (java.math.BigDecimal)parms[6], 5);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[14]).shortValue());
               }
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               stmt.setString(16, (String)parms[16], 60);
               stmt.setString(17, (String)parms[17], 1);
               stmt.setString(18, (String)parms[18], 1);
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setInt(20, ((Number) parms[20]).intValue());
               stmt.setInt(21, ((Number) parms[21]).intValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 5);
               stmt.setInt(23, ((Number) parms[23]).intValue());
               stmt.setShort(24, ((Number) parms[24]).shortValue());
               stmt.setString(25, (String)parms[25], 8);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[26], 2);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[27], 3);
               stmt.setString(28, (String)parms[28], 16);
               stmt.setString(29, (String)parms[29], 50);
               stmt.setString(30, (String)parms[30], 50);
               stmt.setString(31, (String)parms[31], 50);
               stmt.setString(32, (String)parms[32], 12);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[33], 2);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[34], 2);
               stmt.setVarchar(35, (String)parms[35], 2000, false);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[36], 2);
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[37], 2);
               stmt.setString(38, (String)parms[38], 20);
               stmt.setByte(39, ((Number) parms[39]).byteValue());
               stmt.setShort(40, ((Number) parms[40]).shortValue());
               stmt.setBigDecimal(41, (java.math.BigDecimal)parms[41], 5);
               stmt.setByte(42, ((Number) parms[42]).byteValue());
               stmt.setShort(43, ((Number) parms[43]).shortValue());
               stmt.setShort(44, ((Number) parms[44]).shortValue());
               stmt.setShort(45, ((Number) parms[45]).shortValue());
               stmt.setShort(46, ((Number) parms[46]).shortValue());
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(47, ((Number) parms[48]).shortValue());
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 48 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(48, (String)parms[50], 6);
               }
               stmt.setString(49, (String)parms[51], 3);
               stmt.setLong(50, ((Number) parms[52]).longValue());
               stmt.setInt(51, ((Number) parms[53]).intValue());
               stmt.setByte(52, ((Number) parms[54]).byteValue());
               stmt.setString(53, (String)parms[55], 1);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
      }
   }

}

