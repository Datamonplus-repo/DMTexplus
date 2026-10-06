package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tprdger_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A629MetCod = (byte)(GXutil.lval( httpContext.GetPar( "MetCod"))) ;
         n629MetCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A629MetCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A795PrvNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A835TipDtoCod = (byte)(GXutil.lval( httpContext.GetPar( "TipDtoCod"))) ;
         n835TipDtoCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A835TipDtoCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A742PrdUniCom = (byte)(GXutil.lval( httpContext.GetPar( "PrdUniCom"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A742PrdUniCom) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A743PrdUniCon = (byte)(GXutil.lval( httpContext.GetPar( "PrdUniCon"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A743PrdUniCon) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A856ValCod = (byte)(GXutil.lval( httpContext.GetPar( "ValCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A856ValCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6301TipPrdCod = (short)(GXutil.lval( httpContext.GetPar( "TipPrdCod"))) ;
         n6301TipPrdCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A6301TipPrdCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9609SubFamCod = (byte)(GXutil.lval( httpContext.GetPar( "SubFamCod"))) ;
         n9609SubFamCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A9609SubFamCod) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MANTENIMIENTO PRODUCTOS", ""), (short)(0)) ;
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

   public tprdger_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tprdger_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tprdger_impl.class ));
   }

   public tprdger_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkPrdSalM = UIFactory.getCheckbox(this);
      chkPrdPesCon = UIFactory.getCheckbox(this);
      dynPrdPesTerm = new HTMLChoice();
      chkPrdSal = UIFactory.getCheckbox(this);
      cmbPrdOkotex = new HTMLChoice();
      cmbPrdList = new HTMLChoice();
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
      A5418PrdSalM = ((GXutil.strcmp(GXutil.rtrim( A5418PrdSalM), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
      A8896PrdPesCon = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
      if ( dynPrdPesTerm.getItemCount() > 0 )
      {
         A8897PrdPesTerm = dynPrdPesTerm.getValidValue(A8897PrdPesTerm) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynPrdPesTerm.setValue( GXutil.rtrim( A8897PrdPesTerm) );
         httpContext.ajax_rsp_assign_prop("", false, dynPrdPesTerm.getInternalname(), "Values", dynPrdPesTerm.ToJavascriptSource(), true);
      }
      A8936PrdSal = ((GXutil.strcmp(GXutil.rtrim( A8936PrdSal), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A8936PrdSal", A8936PrdSal);
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
         A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5888PrdOkotex", A5888PrdOkotex);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), true);
      }
      if ( cmbPrdList.getItemCount() > 0 )
      {
         A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11687PrdList", A11687PrdList);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
         httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "MANTENIMIENTO PRODUCTOS", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDscTec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdDscTec_Internalname, httpContext.getMessage( "Descripcion Tecnica", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDscTec_Internalname, GXutil.rtrim( A703PrdDscTec), GXutil.rtrim( localUtil.format( A703PrdDscTec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDscTec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDscTec_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUniCom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUniCom_Internalname, httpContext.getMessage( "Unidad de Compra", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUniCom_Internalname, GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUniCom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9") : localUtil.format( DecimalUtil.doubleToDec(A742PrdUniCom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUniCom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUniCom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUcpDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUcpDsc_Internalname, httpContext.getMessage( "Descripcion Unidad de Compra", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUcpDsc_Internalname, GXutil.rtrim( A737PrdUcpDsc), GXutil.rtrim( localUtil.format( A737PrdUcpDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUcpDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUcpDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUniCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUniCon_Internalname, httpContext.getMessage( "Unidad de Consumo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUniCon_Internalname, GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUniCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9") : localUtil.format( DecimalUtil.doubleToDec(A743PrdUniCon), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUniCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUniCon_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUcoDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUcoDsc_Internalname, httpContext.getMessage( "Descripcion Unidad Consumo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUcoDsc_Internalname, GXutil.rtrim( A736PrdUcoDsc), GXutil.rtrim( localUtil.format( A736PrdUcoDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUcoDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUcoDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFacCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFacCon_Internalname, httpContext.getMessage( "Factor de Conversion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFacCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFacCon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNum_Internalname, httpContext.getMessage( "Codigo Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNum_Internalname, GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrvNum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrvNum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrvNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrvNom_Internalname, httpContext.getMessage( "Nombre Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrvNom_Internalname, GXutil.rtrim( A794PrvNom), GXutil.rtrim( localUtil.format( A794PrvNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrvNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrvNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRefPrv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdRefPrv_Internalname, httpContext.getMessage( "Referencia Proveedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRefPrv_Internalname, GXutil.rtrim( A728PrdRefPrv), GXutil.rtrim( localUtil.format( A728PrdRefPrv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRefPrv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdRefPrv_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEmpCodSus_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEmpCodSus_Internalname, httpContext.getMessage( "Empresa Producto Sustituto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmpCodSus_Internalname, GXutil.rtrim( A394EmpCodSus), GXutil.rtrim( localUtil.format( A394EmpCodSus, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmpCodSus_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmpCodSus_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSus_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdSus_Internalname, httpContext.getMessage( "Producto Sustituto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSus_Internalname, GXutil.rtrim( A734PrdSus), GXutil.rtrim( localUtil.format( A734PrdSus, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSus_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdSus_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSusNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdSusNom_Internalname, httpContext.getMessage( "PrdSusNom", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSusNom_Internalname, GXutil.rtrim( A735PrdSusNom), GXutil.rtrim( localUtil.format( A735PrdSusNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSusNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdSusNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtValCod_Internalname, httpContext.getMessage( "Validez", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtValCod_Internalname, GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtValCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A856ValCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtValCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtValDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtValDsc_Internalname, httpContext.getMessage( "Validez", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtValDsc_Internalname, GXutil.rtrim( A857ValDsc), GXutil.rtrim( localUtil.format( A857ValDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtValDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtValDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdRec_Internalname, httpContext.getMessage( "Control en Recuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRec_Internalname, GXutil.rtrim( A727PrdRec), GXutil.rtrim( localUtil.format( A727PrdRec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdRec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCalNec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCalNec_Internalname, httpContext.getMessage( "Calculo Necesidades", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCalNec_Internalname, GXutil.rtrim( A682PrdCalNec), GXutil.rtrim( localUtil.format( A682PrdCalNec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCalNec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCalNec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDetPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdDetPar_Internalname, httpContext.getMessage( "Detalle Partidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDetPar_Internalname, GXutil.rtrim( A698PrdDetPar), GXutil.rtrim( localUtil.format( A698PrdDetPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDetPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDetPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSit_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdSit_Internalname, httpContext.getMessage( "Situacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSit_Internalname, GXutil.ltrim( localUtil.ntoc( A730PrdSit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdSit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A730PrdSit), "9") : localUtil.format( DecimalUtil.doubleToDec(A730PrdSit), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSit_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdSit_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRotRea_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdRotRea_Internalname, httpContext.getMessage( "Rotacion Real", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRotRea_Internalname, GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdRotRea_Enabled!=0) ? localUtil.format( A729PrdRotRea, "ZZZZZ9.999") : localUtil.format( A729PrdRotRea, "ZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRotRea_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdRotRea_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipDtoCod_Internalname, httpContext.getMessage( "Tipo Descuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoCod_Internalname, GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDtoCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A835TipDtoCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A835TipDtoCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipDtoCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipDtoDto_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipDtoDto_Internalname, httpContext.getMessage( "Descuento", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipDtoDto_Internalname, GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipDtoDto_Enabled!=0) ? localUtil.format( A837TipDtoDto, "Z9.99") : localUtil.format( A837TipDtoDto, "Z9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipDtoDto_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipDtoDto_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPreAct_Internalname, httpContext.getMessage( "Precio Actual", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAct_Internalname, GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAct_Enabled!=0) ? localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999") : localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAct_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFecPre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFecPre_Internalname, httpContext.getMessage( "Fecha Ultimo Precio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFecPre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFecPre_Internalname, localUtil.format(A709PrdFecPre, "99/99/99"), localUtil.format( A709PrdFecPre, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFecPre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFecPre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFecPre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFecPre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPreAnt_Internalname, httpContext.getMessage( "Precio Anterior", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAnt_Internalname, GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAnt_Enabled!=0) ? localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999") : localUtil.format( A725PrdPreAnt, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAnt_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPreMed_Internalname, httpContext.getMessage( "Precio Medio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreMed_Internalname, GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreMed_Enabled!=0) ? localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999") : localUtil.format( A726PrdPreMed, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreMed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreMed_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConDia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdConDia_Internalname, httpContext.getMessage( "Unidades Consumo por Dia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConDia_Internalname, GXutil.ltrim( localUtil.ntoc( A696PrdConDia, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConDia_Enabled!=0) ? localUtil.format( A696PrdConDia, "ZZZ9.99") : localUtil.format( A696PrdConDia, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConDia_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdConDia_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdStkMinD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdStkMinD_Internalname, httpContext.getMessage( "Stock Minimo en Dias", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdStkMinD_Internalname, GXutil.ltrim( localUtil.ntoc( A731PrdStkMinD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdStkMinD_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A731PrdStkMinD), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A731PrdStkMinD), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdStkMinD_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdStkMinD_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdStkMinU_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdStkMinU_Internalname, httpContext.getMessage( "Unidades Stock Minimo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdStkMinU_Internalname, GXutil.ltrim( localUtil.ntoc( A732PrdStkMinU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdStkMinU_Enabled!=0) ? localUtil.format( A732PrdStkMinU, "ZZZZ9.99") : localUtil.format( A732PrdStkMinU, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdStkMinU_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdStkMinU_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDiaRot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdDiaRot_Internalname, httpContext.getMessage( "Dias de Rotacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDiaRot_Internalname, GXutil.ltrim( localUtil.ntoc( A699PrdDiaRot, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDiaRot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A699PrdDiaRot), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A699PrdDiaRot), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDiaRot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDiaRot_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPlaEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPlaEnt_Internalname, httpContext.getMessage( "Plazo Entrega Segurid.en Dias", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPlaEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A722PrdPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPlaEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A722PrdPlaEnt), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A722PrdPlaEnt), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPlaEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPlaEnt_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetCod_Internalname, httpContext.getMessage( "Codigo Metodo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetCod_Internalname, GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtMetCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9") : localUtil.format( DecimalUtil.doubleToDec(A629MetCod), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetCod_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMetDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMetDsc_Internalname, httpContext.getMessage( "Descripcion Metodo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMetDsc_Internalname, GXutil.rtrim( A630MetDsc), GXutil.rtrim( localUtil.format( A630MetDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMetDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMetDsc_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdLotMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdLotMin_Internalname, httpContext.getMessage( "Lote Minimo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLotMin_Internalname, GXutil.ltrim( localUtil.ntoc( A716PrdLotMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdLotMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A716PrdLotMin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLotMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdLotMin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumUco_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNumUco_Internalname, httpContext.getMessage( "Unidades por Contenedor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumUco_Internalname, GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumUco_Enabled!=0) ? localUtil.format( A721PrdNumUco, "ZZZ9.99") : localUtil.format( A721PrdNumUco, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumUco_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNumUco_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlm_Internalname, httpContext.getMessage( "Existencias Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiCC_Internalname, httpContext.getMessage( "Existencia Cuarto Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCC_Internalname, GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCC_Enabled!=0) ? localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999") : localUtil.format( A705PrdExiCC, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiCC_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanRes_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanRes_Internalname, httpContext.getMessage( "Cantidad Reservada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanRes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCanRes_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanPen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanPen_Internalname, httpContext.getMessage( "Cantidad Pendiente Recibir", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanPen_Internalname, GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanPen_Enabled!=0) ? localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999") : localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanPen_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCanPen_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFulEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFulEnt_Internalname, httpContext.getMessage( "Fecha Ultima Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFulEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulEnt_Internalname, localUtil.format(A713PrdFulEnt, "99/99/99"), localUtil.format( A713PrdFulEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFulEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFulEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFulPed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFulPed_Internalname, httpContext.getMessage( "Fecha Ultimo Pedido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFulPed_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulPed_Internalname, localUtil.format(A714PrdFulPed, "99/99/99"), localUtil.format( A714PrdFulPed, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulPed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFulPed_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFulPed_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulPed_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFulCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFulCC_Internalname, httpContext.getMessage( "Fecha Ultima Entrega a C.Color", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFulCC_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFulCC_Internalname, localUtil.format(A712PrdFulCC, "99/99/99"), localUtil.format( A712PrdFulCC, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFulCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFulCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFulCC_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFulCC_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiCCP_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiCCP_Internalname, httpContext.getMessage( "Probabilidad existencia en CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiCCP_Internalname, GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiCCP_Enabled!=0) ? localUtil.format( A706PrdExiCCP, "ZZZZ9.99") : localUtil.format( A706PrdExiCCP, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiCCP_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiCCP_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltECC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUltECC_Internalname, httpContext.getMessage( "Ultima Cantidad Entregada a CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltECC_Internalname, GXutil.ltrim( localUtil.ntoc( A740PrdUltECC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltECC_Enabled!=0) ? localUtil.format( A740PrdUltECC, "ZZZZ9.99") : localUtil.format( A740PrdUltECC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltECC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUltECC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltCCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUltCCC_Internalname, httpContext.getMessage( "Ultimo No.Contenedores Ent.CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltCCC_Internalname, GXutil.ltrim( localUtil.ntoc( A738PrdUltCCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltCCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A738PrdUltCCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A738PrdUltCCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltCCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUltCCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUltDCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUltDCC_Internalname, httpContext.getMessage( "Ultima Diferencia en CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUltDCC_Internalname, GXutil.ltrim( localUtil.ntoc( A739PrdUltDCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUltDCC_Enabled!=0) ? localUtil.format( A739PrdUltDCC, "ZZZZ9.99") : localUtil.format( A739PrdUltDCC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUltDCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUltDCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDifCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdDifCC_Internalname, httpContext.getMessage( "Diferencia Acumulada en CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDifCC_Internalname, GXutil.ltrim( localUtil.ntoc( A700PrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDifCC_Enabled!=0) ? localUtil.format( A700PrdDifCC, "ZZZZ9.99") : localUtil.format( A700PrdDifCC, "ZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDifCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDifCC_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConCC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdConCC_Internalname, httpContext.getMessage( "Contenedores Acumulados en CC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 284,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConCC_Internalname, GXutil.ltrim( localUtil.ntoc( A695PrdConCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConCC_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A695PrdConCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A695PrdConCC), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,284);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConCC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdConCC_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdValStk_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdValStk_Internalname, httpContext.getMessage( "Valor Almacen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 289,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdValStk_Enabled!=0) ? localUtil.format( A750PrdValStk, "ZZZZZZZ9.99") : localUtil.format( A750PrdValStk, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,289);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdValStk_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdValStk_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDifValStk_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDifValStk_Internalname, httpContext.getMessage( "orden ascendente valor stock", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 294,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDifValStk_Internalname, GXutil.ltrim( localUtil.ntoc( A332DifValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDifValStk_Enabled!=0) ? localUtil.format( A332DifValStk, "ZZZZZZZ9.99") : localUtil.format( A332DifValStk, "ZZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,294);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDifValStk_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDifValStk_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFecEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFecEnt_Internalname, httpContext.getMessage( "Fecha Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 299,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFecEnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFecEnt_Internalname, localUtil.format(A708PrdFecEnt, "99/99/99"), localUtil.format( A708PrdFecEnt, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,299);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFecEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFecEnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFecEnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFecEnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPosX_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPosX_Internalname, httpContext.getMessage( "Estante / Pratelera", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPosX_Internalname, GXutil.ltrim( localUtil.ntoc( A1193PrdPosX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPosX_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1193PrdPosX), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1193PrdPosX), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,304);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPosX_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPosX_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPosY_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPosY_Internalname, httpContext.getMessage( "Posición en el Estante/Pratel.", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPosY_Internalname, GXutil.ltrim( localUtil.ntoc( A1194PrdPosY, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPosY_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1194PrdPosY), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1194PrdPosY), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,309);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPosY_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPosY_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdTip_Internalname, httpContext.getMessage( "Tipo de Producto,Manual,Autom", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 314,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTip_Internalname, GXutil.rtrim( A1643PrdTip), GXutil.rtrim( localUtil.format( A1643PrdTip, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,314);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTip_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdTip_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDqo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdDqo_Internalname, httpContext.getMessage( "Demanda Quimica Oxigeno", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 319,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDqo_Internalname, GXutil.ltrim( localUtil.ntoc( A1644PrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDqo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1644PrdDqo), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,319);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDqo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDqo_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRev_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdRev_Internalname, httpContext.getMessage( "Revision", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 324,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRev_Internalname, GXutil.rtrim( A3004PrdRev), GXutil.rtrim( localUtil.format( A3004PrdRev, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,324);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRev_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdRev_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdTnq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdTnq_Internalname, httpContext.getMessage( "Tanque", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 329,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3273PrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3273PrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,329);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdTnq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom2_Internalname, httpContext.getMessage( "Nombre Producto 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 334,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom2_Internalname, GXutil.rtrim( A4692PrdNom2), GXutil.rtrim( localUtil.format( A4692PrdNom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,334);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNom2_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum2_Internalname, httpContext.getMessage( "Codigo Producto Auxiliar", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 339,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum2_Internalname, GXutil.rtrim( A4693PrdNum2), GXutil.rtrim( localUtil.format( A4693PrdNum2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,339);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNum2_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 344,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPrdObs_Internalname, A4694PrdObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,344);\"", (short)(0), 1, edtPrdObs_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "1024", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdUMeFo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdUMeFo_Internalname, httpContext.getMessage( "Unid.Medida Prod. en Formula", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 349,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdUMeFo_Internalname, GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdUMeFo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9") : localUtil.format( DecimalUtil.doubleToDec(A4338PrdUMeFo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,349);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdUMeFo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdUMeFo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdPreAc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdPreAc2_Internalname, httpContext.getMessage( "Precio Actual_2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdPreAc2_Internalname, GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdPreAc2_Enabled!=0) ? localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999") : localUtil.format( A5255PrdPreAc2, "ZZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,354);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdPreAc2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdPreAc2_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdDensS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdDensS_Internalname, httpContext.getMessage( "Densidad Sal Muera (g/l)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 359,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdDensS_Internalname, GXutil.ltrim( localUtil.ntoc( A5416PrdDensS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdDensS_Enabled!=0) ? localUtil.format( A5416PrdDensS, "ZZ9.999") : localUtil.format( A5416PrdDensS, "ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,359);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdDensS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdDensS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConcS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdConcS_Internalname, httpContext.getMessage( "Conentracion Sal Muera (g/l)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 364,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConcS_Internalname, GXutil.ltrim( localUtil.ntoc( A5417PrdConcS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConcS_Enabled!=0) ? localUtil.format( A5417PrdConcS, "ZZ9.999") : localUtil.format( A5417PrdConcS, "ZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,364);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConcS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdConcS_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdSalM.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkPrdSalM.getInternalname(), httpContext.getMessage( "Sal Muera (S/N)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 369,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdSalM.getInternalname(), A5418PrdSalM, "", httpContext.getMessage( "Sal Muera (S/N)", ""), 1, chkPrdSalM.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(369, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,369);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdSolub_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdSolub_Internalname, httpContext.getMessage( "Solubilidad del producto(gr/l)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 374,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdSolub_Internalname, GXutil.ltrim( localUtil.ntoc( A5590PrdSolub, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdSolub_Enabled!=0) ? localUtil.format( A5590PrdSolub, "ZZZ9.99") : localUtil.format( A5590PrdSolub, "ZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,374);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdSolub_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdSolub_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipPrdCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipPrdCod_Internalname, httpContext.getMessage( "Tipo Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 379,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipPrdCod_Internalname, GXutil.ltrim( localUtil.ntoc( A6301TipPrdCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtTipPrdCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6301TipPrdCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6301TipPrdCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,379);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipPrdCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipPrdCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipPrdDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipPrdDsc_Internalname, GXutil.rtrim( A6302TipPrdDsc), GXutil.rtrim( localUtil.format( A6302TipPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipPrdDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTipPrdDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumCent_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNumCent_Internalname, httpContext.getMessage( "PrdNumCentra", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 389,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumCent_Internalname, GXutil.rtrim( A6191PrdNumCent), GXutil.rtrim( localUtil.format( A6191PrdNumCent, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,389);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumCent_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNumCent_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumct1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNumct1_Internalname, httpContext.getMessage( "Cte %", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 394,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumct1_Internalname, GXutil.ltrim( localUtil.ntoc( A7226PrdNumct1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumct1_Enabled!=0) ? localUtil.format( A7226PrdNumct1, "ZZ9.99") : localUtil.format( A7226PrdNumct1, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,394);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumct1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNumct1_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNumct2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNumct2_Internalname, httpContext.getMessage( "Cte 2", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 399,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNumct2_Internalname, GXutil.ltrim( localUtil.ntoc( A7227PrdNumct2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdNumct2_Enabled!=0) ? localUtil.format( A7227PrdNumct2, "ZZ9.99") : localUtil.format( A7227PrdNumct2, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,399);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNumct2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNumct2_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHorMad_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdHorMad_Internalname, httpContext.getMessage( "Horas Maduracion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 404,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHorMad_Internalname, GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdHorMad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7260PrdHorMad), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A7260PrdHorMad), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,404);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHorMad_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdHorMad_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdExiAlmc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdExiAlmc_Internalname, httpContext.getMessage( "Existencias Almacen en Consgin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 409,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlmc_Internalname, GXutil.ltrim( localUtil.ntoc( A8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlmc_Enabled!=0) ? localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999") : localUtil.format( A8659PrdExiAlmc, "ZZZZZZ9.9999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,409);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlmc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiAlmc_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdPesCon.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkPrdPesCon.getInternalname(), httpContext.getMessage( "Controlar Pesaje", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 414,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdPesCon.getInternalname(), GXutil.str( A8896PrdPesCon, 1, 0), "", httpContext.getMessage( "Controlar Pesaje", ""), 1, chkPrdPesCon.getEnabled(), "1", httpContext.getMessage( "Controlar", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(414, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,414);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynPrdPesTerm.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynPrdPesTerm.getInternalname(), httpContext.getMessage( "Código del Terminal", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 419,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynPrdPesTerm, dynPrdPesTerm.getInternalname(), GXutil.rtrim( A8897PrdPesTerm), 1, dynPrdPesTerm.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynPrdPesTerm.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,419);\"", "", true, (byte)(0), "HLP_TPRDGER.htm");
      dynPrdPesTerm.setValue( GXutil.rtrim( A8897PrdPesTerm) );
      httpContext.ajax_rsp_assign_prop("", false, dynPrdPesTerm.getInternalname(), "Values", dynPrdPesTerm.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkPrdSal.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkPrdSal.getInternalname(), httpContext.getMessage( "Sal Comun", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 424,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkPrdSal.getInternalname(), A8936PrdSal, "", httpContext.getMessage( "Sal Comun", ""), 1, chkPrdSal.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(424, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,424);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSubFamCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSubFamCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 429,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSubFamCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9609SubFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSubFamCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9609SubFamCod), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A9609SubFamCod), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,429);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSubFamCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSubFamCod_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSubFamDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSubFamDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSubFamDsc_Internalname, GXutil.rtrim( A9610SubFamDsc), GXutil.rtrim( localUtil.format( A9610SubFamDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSubFamDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtSubFamDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdInc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdInc_Internalname, httpContext.getMessage( "Incidencia (ISO)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 439,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdInc_Internalname, GXutil.rtrim( A9731PrdInc), GXutil.rtrim( localUtil.format( A9731PrdInc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,439);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdInc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdInc_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdComp_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdComp_Internalname, httpContext.getMessage( "Compejidad (ISO)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 444,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdComp_Internalname, GXutil.rtrim( A9732PrdComp), GXutil.rtrim( localUtil.format( A9732PrdComp, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,444);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdComp_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdComp_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdAox_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdAox_Internalname, httpContext.getMessage( "AOX (adsorbable organic halogens)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 449,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdAox_Internalname, GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdAox_Enabled!=0) ? localUtil.format( A9733PrdAox, "ZZ9.99") : localUtil.format( A9733PrdAox, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,449);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdAox_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdAox_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNCAS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNCAS_Internalname, httpContext.getMessage( "Ubicacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 454,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNCAS_Internalname, GXutil.rtrim( A9734PrdNCAS), GXutil.rtrim( localUtil.format( A9734PrdNCAS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,454);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNCAS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNCAS_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFT_Internalname, httpContext.getMessage( "Ficha Tecnica?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 459,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFT_Internalname, GXutil.rtrim( A9739PrdFT), GXutil.rtrim( localUtil.format( A9739PrdFT, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,459);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFFT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFFT_Internalname, httpContext.getMessage( "Fecha Ficha Tecnica", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 464,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFFT_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFFT_Internalname, localUtil.format(A9740PrdFFT, "99/99/99"), localUtil.format( A9740PrdFFT, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,464);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFFT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFFT_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFFT_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFFT_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdHS_Internalname, httpContext.getMessage( "Hoja Seguridad?", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 469,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHS_Internalname, GXutil.rtrim( A9741PrdHS), GXutil.rtrim( localUtil.format( A9741PrdHS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,469);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdHS_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFHS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFHS_Internalname, httpContext.getMessage( "Fecha Hoja Seguridad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 474,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtPrdFHS_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFHS_Internalname, localUtil.format(A9742PrdFHS, "99/99/99"), localUtil.format( A9742PrdFHS, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,474);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFHS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFHS_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtPrdFHS_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtPrdFHS_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TPRDGER.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdReach_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdReach_Internalname, httpContext.getMessage( "REACH", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 479,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdReach_Internalname, GXutil.rtrim( A5887PrdReach), GXutil.rtrim( localUtil.format( A5887PrdReach, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,479);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdReach_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdReach_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdOkotex.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbPrdOkotex.getInternalname(), httpContext.getMessage( "OEKO-TEX", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 484,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdOkotex, cmbPrdOkotex.getInternalname(), GXutil.rtrim( A5888PrdOkotex), 1, cmbPrdOkotex.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdOkotex.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,484);\"", "", true, (byte)(0), "HLP_TPRDGER.htm");
      cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdColIdx_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdColIdx_Internalname, httpContext.getMessage( "Color Index", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 489,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdColIdx_Internalname, GXutil.rtrim( A10119PrdColIdx), GXutil.rtrim( localUtil.format( A10119PrdColIdx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,489);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdColIdx_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdColIdx_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 494,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdLote_Internalname, GXutil.rtrim( A10881PrdLote), GXutil.rtrim( localUtil.format( A10881PrdLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,494);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdLote_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdRTM_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdRTM_Internalname, httpContext.getMessage( "Manual RTM (Requirement Tracability Matrix)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 499,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdRTM_Internalname, GXutil.rtrim( A10935PrdRTM), GXutil.rtrim( localUtil.format( A10935PrdRTM, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,499);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdRTM_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdRTM_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw1_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCtw1_Internalname, httpContext.getMessage( "Formaldeido", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 504,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw1_Internalname, GXutil.rtrim( A10936PrdCtw1), GXutil.rtrim( localUtil.format( A10936PrdCtw1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,504);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw1_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCtw1_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCtw2_Internalname, httpContext.getMessage( "Airlaminas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 509,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw2_Internalname, GXutil.rtrim( A10937PrdCtw2), GXutil.rtrim( localUtil.format( A10937PrdCtw2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,509);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw2_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCtw2_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw3_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCtw3_Internalname, httpContext.getMessage( "Apeo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 514,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw3_Internalname, GXutil.rtrim( A10938PrdCtw3), GXutil.rtrim( localUtil.format( A10938PrdCtw3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,514);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw3_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCtw3_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCtw4_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCtw4_Internalname, httpContext.getMessage( "PFC", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 519,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCtw4_Internalname, GXutil.rtrim( A11663PrdCtw4), GXutil.rtrim( localUtil.format( A11663PrdCtw4, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,519);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCtw4_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCtw4_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNroCAS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNroCAS_Internalname, httpContext.getMessage( "Numero de CAS (Chemical Abstracts Service)", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 524,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNroCAS_Internalname, GXutil.rtrim( A11196PrdNroCAS), GXutil.rtrim( localUtil.format( A11196PrdNroCAS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,524);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNroCAS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdNroCAS_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdGots_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdGots_Internalname, httpContext.getMessage( "GOTS", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 529,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdGots_Internalname, GXutil.rtrim( A11363PrdGots), GXutil.rtrim( localUtil.format( A11363PrdGots, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,529);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdGots_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdGots_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdHm_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdHm_Internalname, httpContext.getMessage( "H&M", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 534,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdHm_Internalname, GXutil.rtrim( A11364PrdHm), GXutil.rtrim( localUtil.format( A11364PrdHm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,534);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdHm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdHm_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdConct_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdConct_Internalname, httpContext.getMessage( "Concentracion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 539,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdConct_Internalname, GXutil.ltrim( localUtil.ntoc( A11470PrdConct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdConct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11470PrdConct), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11470PrdConct), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,539);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdConct_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdConct_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdEINECS_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdEINECS_Internalname, httpContext.getMessage( "N EINECS", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 544,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdEINECS_Internalname, GXutil.rtrim( A11614PrdEINECS), GXutil.rtrim( localUtil.format( A11614PrdEINECS, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,544);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdEINECS_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdEINECS_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdFuncion_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdFuncion_Internalname, httpContext.getMessage( "Funcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 549,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFuncion_Internalname, GXutil.rtrim( A11615PrdFuncion), GXutil.rtrim( localUtil.format( A11615PrdFuncion, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,549);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFuncion_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFuncion_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNmQu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNmQu_Internalname, httpContext.getMessage( "Nombre Substancia Quimica", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 554,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtPrdNmQu_Internalname, A11616PrdNmQu, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,554);\"", (short)(0), 1, edtPrdNmQu_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbPrdList.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbPrdList.getInternalname(), httpContext.getMessage( "List by Inditex ", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 559,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbPrdList, cmbPrdList.getInternalname(), GXutil.rtrim( A11687PrdList), 1, cmbPrdList.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbPrdList.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,559);\"", "", true, (byte)(0), "HLP_TPRDGER.htm");
      cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), true);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 564,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 566,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGER.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 568,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TPRDGER.htm");
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
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
         Z703PrdDscTec = httpContext.cgiGet( "Z703PrdDscTec") ;
         Z707PrdFacCon = localUtil.ctond( httpContext.cgiGet( "Z707PrdFacCon")) ;
         Z728PrdRefPrv = httpContext.cgiGet( "Z728PrdRefPrv") ;
         Z734PrdSus = httpContext.cgiGet( "Z734PrdSus") ;
         Z727PrdRec = httpContext.cgiGet( "Z727PrdRec") ;
         Z682PrdCalNec = httpContext.cgiGet( "Z682PrdCalNec") ;
         Z698PrdDetPar = httpContext.cgiGet( "Z698PrdDetPar") ;
         Z730PrdSit = (byte)(localUtil.ctol( httpContext.cgiGet( "Z730PrdSit"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z729PrdRotRea = localUtil.ctond( httpContext.cgiGet( "Z729PrdRotRea")) ;
         Z724PrdPreAct = localUtil.ctond( httpContext.cgiGet( "Z724PrdPreAct")) ;
         Z709PrdFecPre = localUtil.ctod( httpContext.cgiGet( "Z709PrdFecPre"), 0) ;
         Z725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( "Z725PrdPreAnt")) ;
         Z726PrdPreMed = localUtil.ctond( httpContext.cgiGet( "Z726PrdPreMed")) ;
         Z696PrdConDia = localUtil.ctond( httpContext.cgiGet( "Z696PrdConDia")) ;
         Z731PrdStkMinD = (short)(localUtil.ctol( httpContext.cgiGet( "Z731PrdStkMinD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z732PrdStkMinU = localUtil.ctond( httpContext.cgiGet( "Z732PrdStkMinU")) ;
         Z699PrdDiaRot = (short)(localUtil.ctol( httpContext.cgiGet( "Z699PrdDiaRot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z722PrdPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( "Z722PrdPlaEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z716PrdLotMin = (short)(localUtil.ctol( httpContext.cgiGet( "Z716PrdLotMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z721PrdNumUco = localUtil.ctond( httpContext.cgiGet( "Z721PrdNumUco")) ;
         Z704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( "Z704PrdExiAlm")) ;
         Z705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "Z705PrdExiCC")) ;
         Z685PrdCanRes = localUtil.ctond( httpContext.cgiGet( "Z685PrdCanRes")) ;
         Z684PrdCanPen = localUtil.ctond( httpContext.cgiGet( "Z684PrdCanPen")) ;
         Z713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( "Z713PrdFulEnt"), 0) ;
         Z714PrdFulPed = localUtil.ctod( httpContext.cgiGet( "Z714PrdFulPed"), 0) ;
         Z712PrdFulCC = localUtil.ctod( httpContext.cgiGet( "Z712PrdFulCC"), 0) ;
         Z706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( "Z706PrdExiCCP")) ;
         Z740PrdUltECC = localUtil.ctond( httpContext.cgiGet( "Z740PrdUltECC")) ;
         Z738PrdUltCCC = (short)(localUtil.ctol( httpContext.cgiGet( "Z738PrdUltCCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z739PrdUltDCC = localUtil.ctond( httpContext.cgiGet( "Z739PrdUltDCC")) ;
         Z700PrdDifCC = localUtil.ctond( httpContext.cgiGet( "Z700PrdDifCC")) ;
         Z695PrdConCC = (short)(localUtil.ctol( httpContext.cgiGet( "Z695PrdConCC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z750PrdValStk = localUtil.ctond( httpContext.cgiGet( "Z750PrdValStk")) ;
         Z332DifValStk = localUtil.ctond( httpContext.cgiGet( "Z332DifValStk")) ;
         Z708PrdFecEnt = localUtil.ctod( httpContext.cgiGet( "Z708PrdFecEnt"), 0) ;
         Z1193PrdPosX = (short)(localUtil.ctol( httpContext.cgiGet( "Z1193PrdPosX"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1194PrdPosY = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1194PrdPosY"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1643PrdTip = httpContext.cgiGet( "Z1643PrdTip") ;
         Z1644PrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( "Z1644PrdDqo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3004PrdRev = httpContext.cgiGet( "Z3004PrdRev") ;
         Z3273PrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3273PrdTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4692PrdNom2 = httpContext.cgiGet( "Z4692PrdNom2") ;
         Z4693PrdNum2 = httpContext.cgiGet( "Z4693PrdNum2") ;
         Z4694PrdObs = httpContext.cgiGet( "Z4694PrdObs") ;
         Z4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4338PrdUMeFo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( "Z5255PrdPreAc2")) ;
         Z5416PrdDensS = localUtil.ctond( httpContext.cgiGet( "Z5416PrdDensS")) ;
         Z5417PrdConcS = localUtil.ctond( httpContext.cgiGet( "Z5417PrdConcS")) ;
         Z5418PrdSalM = httpContext.cgiGet( "Z5418PrdSalM") ;
         Z5590PrdSolub = localUtil.ctond( httpContext.cgiGet( "Z5590PrdSolub")) ;
         Z6191PrdNumCent = httpContext.cgiGet( "Z6191PrdNumCent") ;
         Z7226PrdNumct1 = localUtil.ctond( httpContext.cgiGet( "Z7226PrdNumct1")) ;
         Z7227PrdNumct2 = localUtil.ctond( httpContext.cgiGet( "Z7227PrdNumct2")) ;
         Z7260PrdHorMad = (byte)(localUtil.ctol( httpContext.cgiGet( "Z7260PrdHorMad"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( "Z8659PrdExiAlmc")) ;
         Z8896PrdPesCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8896PrdPesCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8897PrdPesTerm = httpContext.cgiGet( "Z8897PrdPesTerm") ;
         Z8936PrdSal = httpContext.cgiGet( "Z8936PrdSal") ;
         Z9731PrdInc = httpContext.cgiGet( "Z9731PrdInc") ;
         Z9732PrdComp = httpContext.cgiGet( "Z9732PrdComp") ;
         Z9733PrdAox = localUtil.ctond( httpContext.cgiGet( "Z9733PrdAox")) ;
         Z9734PrdNCAS = httpContext.cgiGet( "Z9734PrdNCAS") ;
         Z9739PrdFT = httpContext.cgiGet( "Z9739PrdFT") ;
         Z9740PrdFFT = localUtil.ctod( httpContext.cgiGet( "Z9740PrdFFT"), 0) ;
         Z9741PrdHS = httpContext.cgiGet( "Z9741PrdHS") ;
         Z9742PrdFHS = localUtil.ctod( httpContext.cgiGet( "Z9742PrdFHS"), 0) ;
         Z5887PrdReach = httpContext.cgiGet( "Z5887PrdReach") ;
         Z5888PrdOkotex = httpContext.cgiGet( "Z5888PrdOkotex") ;
         Z10119PrdColIdx = httpContext.cgiGet( "Z10119PrdColIdx") ;
         Z10881PrdLote = httpContext.cgiGet( "Z10881PrdLote") ;
         Z10935PrdRTM = httpContext.cgiGet( "Z10935PrdRTM") ;
         Z10936PrdCtw1 = httpContext.cgiGet( "Z10936PrdCtw1") ;
         Z10937PrdCtw2 = httpContext.cgiGet( "Z10937PrdCtw2") ;
         Z10938PrdCtw3 = httpContext.cgiGet( "Z10938PrdCtw3") ;
         Z11663PrdCtw4 = httpContext.cgiGet( "Z11663PrdCtw4") ;
         Z11196PrdNroCAS = httpContext.cgiGet( "Z11196PrdNroCAS") ;
         Z11363PrdGots = httpContext.cgiGet( "Z11363PrdGots") ;
         Z11364PrdHm = httpContext.cgiGet( "Z11364PrdHm") ;
         Z11470PrdConct = (short)(localUtil.ctol( httpContext.cgiGet( "Z11470PrdConct"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z11614PrdEINECS = httpContext.cgiGet( "Z11614PrdEINECS") ;
         Z11615PrdFuncion = httpContext.cgiGet( "Z11615PrdFuncion") ;
         Z11616PrdNmQu = httpContext.cgiGet( "Z11616PrdNmQu") ;
         Z11687PrdList = httpContext.cgiGet( "Z11687PrdList") ;
         Z629MetCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z629MetCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z795PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z835TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z835TipDtoCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z742PrdUniCom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z743PrdUniCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z743PrdUniCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z856ValCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6301TipPrdCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z6301TipPrdCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z9609SubFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9609SubFamCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A703PrdDscTec = httpContext.cgiGet( edtPrdDscTec_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", A703PrdDscTec);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUNICOM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUniCom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A742PrdUniCom = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         }
         else
         {
            A742PrdUniCom = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         }
         A737PrdUcpDsc = httpContext.cgiGet( edtPrdUcpDsc_Internalname) ;
         n737PrdUcpDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUNICON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUniCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A743PrdUniCon = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         }
         else
         {
            A743PrdUniCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUniCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         }
         A736PrdUcoDsc = httpContext.cgiGet( edtPrdUcoDsc_Internalname) ;
         n736PrdUcoDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)), DecimalUtil.stringToDec("99.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDFACCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFacCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A707PrdFacCon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         }
         else
         {
            A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRVNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrvNum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A795PrvNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         else
         {
            A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         }
         A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
         n794PrvNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A728PrdRefPrv = httpContext.cgiGet( edtPrdRefPrv_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", A728PrdRefPrv);
         A394EmpCodSus = GXutil.upper( httpContext.cgiGet( edtEmpCodSus_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A394EmpCodSus", A394EmpCodSus);
         A734PrdSus = httpContext.cgiGet( edtPrdSus_Internalname) ;
         n734PrdSus = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", A734PrdSus);
         A735PrdSusNom = httpContext.cgiGet( edtPrdSusNom_Internalname) ;
         n735PrdSusNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A735PrdSusNom", A735PrdSusNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "VALCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtValCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A856ValCod = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         }
         else
         {
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtValCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         }
         A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
         n857ValDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
         A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A682PrdCalNec = httpContext.cgiGet( edtPrdCalNec_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", A682PrdCalNec);
         A698PrdDetPar = httpContext.cgiGet( edtPrdDetPar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDSIT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdSit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A730PrdSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         }
         else
         {
            A730PrdSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)), DecimalUtil.stringToDec("999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDROTREA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdRotRea_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A729PrdRotRea = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         }
         else
         {
            A729PrdRotRea = localUtil.ctond( httpContext.cgiGet( edtPrdRotRea_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipDtoCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A835TipDtoCod = (byte)(0) ;
            n835TipDtoCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         }
         else
         {
            A835TipDtoCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipDtoCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n835TipDtoCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         }
         A837TipDtoDto = localUtil.ctond( httpContext.cgiGet( edtTipDtoDto_Internalname)) ;
         n837TipDtoDto = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREACT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreAct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A724PrdPreAct = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         }
         else
         {
            A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFecPre_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFECPRE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFecPre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A709PrdFecPre = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         }
         else
         {
            A709PrdFecPre = localUtil.ctod( httpContext.cgiGet( edtPrdFecPre_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreAnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A725PrdPreAnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         }
         else
         {
            A725PrdPreAnt = localUtil.ctond( httpContext.cgiGet( edtPrdPreAnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREMED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreMed_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A726PrdPreMed = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         else
         {
            A726PrdPreMed = localUtil.ctond( httpContext.cgiGet( edtPrdPreMed_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdConDia_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdConDia_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCONDIA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdConDia_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A696PrdConDia = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         }
         else
         {
            A696PrdConDia = localUtil.ctond( httpContext.cgiGet( edtPrdConDia_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdStkMinD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdStkMinD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDSTKMIND");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdStkMinD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A731PrdStkMinD = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         }
         else
         {
            A731PrdStkMinD = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdStkMinD_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDSTKMINU");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdStkMinU_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A732PrdStkMinU = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         }
         else
         {
            A732PrdStkMinU = localUtil.ctond( httpContext.cgiGet( edtPrdStkMinU_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdDiaRot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdDiaRot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDDIAROT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdDiaRot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A699PrdDiaRot = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         }
         else
         {
            A699PrdDiaRot = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDiaRot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPLAENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPlaEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A722PrdPlaEnt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         }
         else
         {
            A722PrdPlaEnt = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdPlaEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "METCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtMetCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A629MetCod = (byte)(0) ;
            n629MetCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         }
         else
         {
            A629MetCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtMetCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n629MetCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         }
         A630MetDsc = httpContext.cgiGet( edtMetDsc_Internalname) ;
         n630MetDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdLotMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdLotMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDLOTMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdLotMin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A716PrdLotMin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         }
         else
         {
            A716PrdLotMin = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdLotMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDNUMUCO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNumUco_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A721PrdNumUco = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         }
         else
         {
            A721PrdNumUco = localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXIALM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiAlm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A704PrdExiAlm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
         else
         {
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A705PrdExiCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         }
         else
         {
            A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( edtPrdExiCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANRES");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdCanRes_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A685PrdCanRes = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         }
         else
         {
            A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANPEN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdCanPen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A684PrdCanPen = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         else
         {
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFulEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFULENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFulEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A713PrdFulEnt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         }
         else
         {
            A713PrdFulEnt = localUtil.ctod( httpContext.cgiGet( edtPrdFulEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFulPed_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFULPED");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFulPed_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A714PrdFulPed = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         }
         else
         {
            A714PrdFulPed = localUtil.ctod( httpContext.cgiGet( edtPrdFulPed_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFulCC_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFULCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFulCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A712PrdFulCC = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         }
         else
         {
            A712PrdFulCC = localUtil.ctod( httpContext.cgiGet( edtPrdFulCC_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXICCP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiCCP_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A706PrdExiCCP = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         }
         else
         {
            A706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( edtPrdExiCCP_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTECC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltECC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A740PrdUltECC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         }
         else
         {
            A740PrdUltECC = localUtil.ctond( httpContext.cgiGet( edtPrdUltECC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTCCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltCCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A738PrdUltCCC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         }
         else
         {
            A738PrdUltCCC = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdUltCCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDULTDCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUltDCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A739PrdUltDCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         }
         else
         {
            A739PrdUltDCC = localUtil.ctond( httpContext.cgiGet( edtPrdUltDCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)), DecimalUtil.stringToDec("99999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDDIFCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdDifCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A700PrdDifCC = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         }
         else
         {
            A700PrdDifCC = localUtil.ctond( httpContext.cgiGet( edtPrdDifCC_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCONCC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdConCC_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A695PrdConCC = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         }
         else
         {
            A695PrdConCC = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdConCC_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDVALSTK");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdValStk_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A750PrdValStk = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         else
         {
            A750PrdValStk = localUtil.ctond( httpContext.cgiGet( edtPrdValStk_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDifValStk_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDifValStk_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DIFVALSTK");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDifValStk_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A332DifValStk = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         }
         else
         {
            A332DifValStk = localUtil.ctond( httpContext.cgiGet( edtDifValStk_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFecEnt_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFECENT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFecEnt_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A708PrdFecEnt = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         }
         else
         {
            A708PrdFecEnt = localUtil.ctod( httpContext.cgiGet( edtPrdFecEnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPOSX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPosX_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1193PrdPosX = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         }
         else
         {
            A1193PrdPosX = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdPosX_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPOSY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPosY_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1194PrdPosY = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         }
         else
         {
            A1194PrdPosY = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdPosY_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         }
         A1643PrdTip = GXutil.upper( httpContext.cgiGet( edtPrdTip_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", A1643PrdTip);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDDQO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdDqo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1644PrdDqo = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         }
         else
         {
            A1644PrdDqo = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDqo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         }
         A3004PrdRev = GXutil.upper( httpContext.cgiGet( edtPrdRev_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", A3004PrdRev);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDTNQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdTnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3273PrdTnq = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         }
         else
         {
            A3273PrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         }
         A4692PrdNom2 = httpContext.cgiGet( edtPrdNom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4692PrdNom2", A4692PrdNom2);
         A4693PrdNum2 = httpContext.cgiGet( edtPrdNum2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4693PrdNum2", A4693PrdNum2);
         A4694PrdObs = httpContext.cgiGet( edtPrdObs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4694PrdObs", A4694PrdObs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDUMEFO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdUMeFo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4338PrdUMeFo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         }
         else
         {
            A4338PrdUMeFo = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdUMeFo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPREAC2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdPreAc2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5255PrdPreAc2 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         }
         else
         {
            A5255PrdPreAc2 = localUtil.ctond( httpContext.cgiGet( edtPrdPreAc2_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdDensS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdDensS_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDDENSS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdDensS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5416PrdDensS = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
         }
         else
         {
            A5416PrdDensS = localUtil.ctond( httpContext.cgiGet( edtPrdDensS_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdConcS_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdConcS_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCONCS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdConcS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5417PrdConcS = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
         }
         else
         {
            A5417PrdConcS = localUtil.ctond( httpContext.cgiGet( edtPrdConcS_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
         }
         A5418PrdSalM = ((GXutil.strcmp(httpContext.cgiGet( chkPrdSalM.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdSolub_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdSolub_Internalname)), DecimalUtil.stringToDec("9999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDSOLUB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdSolub_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5590PrdSolub = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         }
         else
         {
            A5590PrdSolub = localUtil.ctond( httpContext.cgiGet( edtPrdSolub_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipPrdCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipPrdCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPPRDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTipPrdCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6301TipPrdCod = (short)(0) ;
            n6301TipPrdCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         }
         else
         {
            A6301TipPrdCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipPrdCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n6301TipPrdCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         }
         A6302TipPrdDsc = httpContext.cgiGet( edtTipPrdDsc_Internalname) ;
         n6302TipPrdDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6302TipPrdDsc", A6302TipPrdDsc);
         A6191PrdNumCent = httpContext.cgiGet( edtPrdNumCent_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", A6191PrdNumCent);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdNumct1_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdNumct1_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDNUMCT1");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNumct1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7226PrdNumct1 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
         }
         else
         {
            A7226PrdNumct1 = localUtil.ctond( httpContext.cgiGet( edtPrdNumct1_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdNumct2_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdNumct2_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDNUMCT2");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdNumct2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7227PrdNumct2 = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
         }
         else
         {
            A7227PrdNumct2 = localUtil.ctond( httpContext.cgiGet( edtPrdNumct2_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdHorMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdHorMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDHORMAD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdHorMad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A7260PrdHorMad = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
         }
         else
         {
            A7260PrdHorMad = (byte)(localUtil.ctol( httpContext.cgiGet( edtPrdHorMad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDEXIALMC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdExiAlmc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8659PrdExiAlmc = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         }
         else
         {
            A8659PrdExiAlmc = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlmc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrdPesCon.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkPrdPesCon.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDPESCON");
            AnyError = (short)(1) ;
            GX_FocusControl = chkPrdPesCon.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8896PrdPesCon = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         }
         else
         {
            A8896PrdPesCon = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkPrdPesCon.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         }
         dynPrdPesTerm.setValue( httpContext.cgiGet( dynPrdPesTerm.getInternalname()) );
         A8897PrdPesTerm = httpContext.cgiGet( dynPrdPesTerm.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
         A8936PrdSal = ((GXutil.strcmp(httpContext.cgiGet( chkPrdSal.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "A8936PrdSal", A8936PrdSal);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSubFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSubFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SUBFAMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtSubFamCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9609SubFamCod = (byte)(0) ;
            n9609SubFamCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
         }
         else
         {
            A9609SubFamCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtSubFamCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9609SubFamCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
         }
         A9610SubFamDsc = httpContext.cgiGet( edtSubFamDsc_Internalname) ;
         n9610SubFamDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9610SubFamDsc", A9610SubFamDsc);
         A9731PrdInc = httpContext.cgiGet( edtPrdInc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9731PrdInc", A9731PrdInc);
         A9732PrdComp = httpContext.cgiGet( edtPrdComp_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9732PrdComp", A9732PrdComp);
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdAox_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdAox_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDAOX");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdAox_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9733PrdAox = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
         }
         else
         {
            A9733PrdAox = localUtil.ctond( httpContext.cgiGet( edtPrdAox_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
         }
         A9734PrdNCAS = httpContext.cgiGet( edtPrdNCAS_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", A9734PrdNCAS);
         A9739PrdFT = httpContext.cgiGet( edtPrdFT_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9739PrdFT", A9739PrdFT);
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFFT_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFFT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFFT_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9740PrdFFT = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
         }
         else
         {
            A9740PrdFFT = localUtil.ctod( httpContext.cgiGet( edtPrdFFT_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
         }
         A9741PrdHS = httpContext.cgiGet( edtPrdHS_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A9741PrdHS", A9741PrdHS);
         if ( localUtil.vcdate( httpContext.cgiGet( edtPrdFHS_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "PRDFHS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdFHS_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A9742PrdFHS = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
         }
         else
         {
            A9742PrdFHS = localUtil.ctod( httpContext.cgiGet( edtPrdFHS_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
         }
         A5887PrdReach = httpContext.cgiGet( edtPrdReach_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5887PrdReach", A5887PrdReach);
         cmbPrdOkotex.setValue( httpContext.cgiGet( cmbPrdOkotex.getInternalname()) );
         A5888PrdOkotex = httpContext.cgiGet( cmbPrdOkotex.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5888PrdOkotex", A5888PrdOkotex);
         A10119PrdColIdx = httpContext.cgiGet( edtPrdColIdx_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10119PrdColIdx", A10119PrdColIdx);
         A10881PrdLote = httpContext.cgiGet( edtPrdLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         A10935PrdRTM = httpContext.cgiGet( edtPrdRTM_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10935PrdRTM", A10935PrdRTM);
         A10936PrdCtw1 = httpContext.cgiGet( edtPrdCtw1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
         A10937PrdCtw2 = httpContext.cgiGet( edtPrdCtw2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
         A10938PrdCtw3 = httpContext.cgiGet( edtPrdCtw3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
         A11663PrdCtw4 = httpContext.cgiGet( edtPrdCtw4_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
         A11196PrdNroCAS = httpContext.cgiGet( edtPrdNroCAS_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11196PrdNroCAS", A11196PrdNroCAS);
         A11363PrdGots = httpContext.cgiGet( edtPrdGots_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
         A11364PrdHm = httpContext.cgiGet( edtPrdHm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11364PrdHm", A11364PrdHm);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdConct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdConct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCONCT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdConct_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A11470PrdConct = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
         }
         else
         {
            A11470PrdConct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdConct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
         }
         A11614PrdEINECS = httpContext.cgiGet( edtPrdEINECS_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11614PrdEINECS", A11614PrdEINECS);
         A11615PrdFuncion = httpContext.cgiGet( edtPrdFuncion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11615PrdFuncion", A11615PrdFuncion);
         A11616PrdNmQu = httpContext.cgiGet( edtPrdNmQu_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11616PrdNmQu", A11616PrdNmQu);
         cmbPrdList.setValue( httpContext.cgiGet( cmbPrdList.getInternalname()) );
         A11687PrdList = httpContext.cgiGet( cmbPrdList.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11687PrdList", A11687PrdList);
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
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
            initAllM829( ) ;
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
      disableAttributesM829( ) ;
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

   public void resetCaptionM80( )
   {
   }

   public void zmM829( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T00M83_A718PrdNom[0] ;
            Z703PrdDscTec = T00M83_A703PrdDscTec[0] ;
            Z707PrdFacCon = T00M83_A707PrdFacCon[0] ;
            Z728PrdRefPrv = T00M83_A728PrdRefPrv[0] ;
            Z734PrdSus = T00M83_A734PrdSus[0] ;
            Z727PrdRec = T00M83_A727PrdRec[0] ;
            Z682PrdCalNec = T00M83_A682PrdCalNec[0] ;
            Z698PrdDetPar = T00M83_A698PrdDetPar[0] ;
            Z730PrdSit = T00M83_A730PrdSit[0] ;
            Z729PrdRotRea = T00M83_A729PrdRotRea[0] ;
            Z724PrdPreAct = T00M83_A724PrdPreAct[0] ;
            Z709PrdFecPre = T00M83_A709PrdFecPre[0] ;
            Z725PrdPreAnt = T00M83_A725PrdPreAnt[0] ;
            Z726PrdPreMed = T00M83_A726PrdPreMed[0] ;
            Z696PrdConDia = T00M83_A696PrdConDia[0] ;
            Z731PrdStkMinD = T00M83_A731PrdStkMinD[0] ;
            Z732PrdStkMinU = T00M83_A732PrdStkMinU[0] ;
            Z699PrdDiaRot = T00M83_A699PrdDiaRot[0] ;
            Z722PrdPlaEnt = T00M83_A722PrdPlaEnt[0] ;
            Z716PrdLotMin = T00M83_A716PrdLotMin[0] ;
            Z721PrdNumUco = T00M83_A721PrdNumUco[0] ;
            Z704PrdExiAlm = T00M83_A704PrdExiAlm[0] ;
            Z705PrdExiCC = T00M83_A705PrdExiCC[0] ;
            Z685PrdCanRes = T00M83_A685PrdCanRes[0] ;
            Z684PrdCanPen = T00M83_A684PrdCanPen[0] ;
            Z713PrdFulEnt = T00M83_A713PrdFulEnt[0] ;
            Z714PrdFulPed = T00M83_A714PrdFulPed[0] ;
            Z712PrdFulCC = T00M83_A712PrdFulCC[0] ;
            Z706PrdExiCCP = T00M83_A706PrdExiCCP[0] ;
            Z740PrdUltECC = T00M83_A740PrdUltECC[0] ;
            Z738PrdUltCCC = T00M83_A738PrdUltCCC[0] ;
            Z739PrdUltDCC = T00M83_A739PrdUltDCC[0] ;
            Z700PrdDifCC = T00M83_A700PrdDifCC[0] ;
            Z695PrdConCC = T00M83_A695PrdConCC[0] ;
            Z750PrdValStk = T00M83_A750PrdValStk[0] ;
            Z332DifValStk = T00M83_A332DifValStk[0] ;
            Z708PrdFecEnt = T00M83_A708PrdFecEnt[0] ;
            Z1193PrdPosX = T00M83_A1193PrdPosX[0] ;
            Z1194PrdPosY = T00M83_A1194PrdPosY[0] ;
            Z1643PrdTip = T00M83_A1643PrdTip[0] ;
            Z1644PrdDqo = T00M83_A1644PrdDqo[0] ;
            Z3004PrdRev = T00M83_A3004PrdRev[0] ;
            Z3273PrdTnq = T00M83_A3273PrdTnq[0] ;
            Z4692PrdNom2 = T00M83_A4692PrdNom2[0] ;
            Z4693PrdNum2 = T00M83_A4693PrdNum2[0] ;
            Z4694PrdObs = T00M83_A4694PrdObs[0] ;
            Z4338PrdUMeFo = T00M83_A4338PrdUMeFo[0] ;
            Z5255PrdPreAc2 = T00M83_A5255PrdPreAc2[0] ;
            Z5416PrdDensS = T00M83_A5416PrdDensS[0] ;
            Z5417PrdConcS = T00M83_A5417PrdConcS[0] ;
            Z5418PrdSalM = T00M83_A5418PrdSalM[0] ;
            Z5590PrdSolub = T00M83_A5590PrdSolub[0] ;
            Z6191PrdNumCent = T00M83_A6191PrdNumCent[0] ;
            Z7226PrdNumct1 = T00M83_A7226PrdNumct1[0] ;
            Z7227PrdNumct2 = T00M83_A7227PrdNumct2[0] ;
            Z7260PrdHorMad = T00M83_A7260PrdHorMad[0] ;
            Z8659PrdExiAlmc = T00M83_A8659PrdExiAlmc[0] ;
            Z8896PrdPesCon = T00M83_A8896PrdPesCon[0] ;
            Z8897PrdPesTerm = T00M83_A8897PrdPesTerm[0] ;
            Z8936PrdSal = T00M83_A8936PrdSal[0] ;
            Z9731PrdInc = T00M83_A9731PrdInc[0] ;
            Z9732PrdComp = T00M83_A9732PrdComp[0] ;
            Z9733PrdAox = T00M83_A9733PrdAox[0] ;
            Z9734PrdNCAS = T00M83_A9734PrdNCAS[0] ;
            Z9739PrdFT = T00M83_A9739PrdFT[0] ;
            Z9740PrdFFT = T00M83_A9740PrdFFT[0] ;
            Z9741PrdHS = T00M83_A9741PrdHS[0] ;
            Z9742PrdFHS = T00M83_A9742PrdFHS[0] ;
            Z5887PrdReach = T00M83_A5887PrdReach[0] ;
            Z5888PrdOkotex = T00M83_A5888PrdOkotex[0] ;
            Z10119PrdColIdx = T00M83_A10119PrdColIdx[0] ;
            Z10881PrdLote = T00M83_A10881PrdLote[0] ;
            Z10935PrdRTM = T00M83_A10935PrdRTM[0] ;
            Z10936PrdCtw1 = T00M83_A10936PrdCtw1[0] ;
            Z10937PrdCtw2 = T00M83_A10937PrdCtw2[0] ;
            Z10938PrdCtw3 = T00M83_A10938PrdCtw3[0] ;
            Z11663PrdCtw4 = T00M83_A11663PrdCtw4[0] ;
            Z11196PrdNroCAS = T00M83_A11196PrdNroCAS[0] ;
            Z11363PrdGots = T00M83_A11363PrdGots[0] ;
            Z11364PrdHm = T00M83_A11364PrdHm[0] ;
            Z11470PrdConct = T00M83_A11470PrdConct[0] ;
            Z11614PrdEINECS = T00M83_A11614PrdEINECS[0] ;
            Z11615PrdFuncion = T00M83_A11615PrdFuncion[0] ;
            Z11616PrdNmQu = T00M83_A11616PrdNmQu[0] ;
            Z11687PrdList = T00M83_A11687PrdList[0] ;
            Z629MetCod = T00M83_A629MetCod[0] ;
            Z795PrvNum = T00M83_A795PrvNum[0] ;
            Z835TipDtoCod = T00M83_A835TipDtoCod[0] ;
            Z742PrdUniCom = T00M83_A742PrdUniCom[0] ;
            Z743PrdUniCon = T00M83_A743PrdUniCon[0] ;
            Z856ValCod = T00M83_A856ValCod[0] ;
            Z6301TipPrdCod = T00M83_A6301TipPrdCod[0] ;
            Z9609SubFamCod = T00M83_A9609SubFamCod[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
            Z703PrdDscTec = A703PrdDscTec ;
            Z707PrdFacCon = A707PrdFacCon ;
            Z728PrdRefPrv = A728PrdRefPrv ;
            Z734PrdSus = A734PrdSus ;
            Z727PrdRec = A727PrdRec ;
            Z682PrdCalNec = A682PrdCalNec ;
            Z698PrdDetPar = A698PrdDetPar ;
            Z730PrdSit = A730PrdSit ;
            Z729PrdRotRea = A729PrdRotRea ;
            Z724PrdPreAct = A724PrdPreAct ;
            Z709PrdFecPre = A709PrdFecPre ;
            Z725PrdPreAnt = A725PrdPreAnt ;
            Z726PrdPreMed = A726PrdPreMed ;
            Z696PrdConDia = A696PrdConDia ;
            Z731PrdStkMinD = A731PrdStkMinD ;
            Z732PrdStkMinU = A732PrdStkMinU ;
            Z699PrdDiaRot = A699PrdDiaRot ;
            Z722PrdPlaEnt = A722PrdPlaEnt ;
            Z716PrdLotMin = A716PrdLotMin ;
            Z721PrdNumUco = A721PrdNumUco ;
            Z704PrdExiAlm = A704PrdExiAlm ;
            Z705PrdExiCC = A705PrdExiCC ;
            Z685PrdCanRes = A685PrdCanRes ;
            Z684PrdCanPen = A684PrdCanPen ;
            Z713PrdFulEnt = A713PrdFulEnt ;
            Z714PrdFulPed = A714PrdFulPed ;
            Z712PrdFulCC = A712PrdFulCC ;
            Z706PrdExiCCP = A706PrdExiCCP ;
            Z740PrdUltECC = A740PrdUltECC ;
            Z738PrdUltCCC = A738PrdUltCCC ;
            Z739PrdUltDCC = A739PrdUltDCC ;
            Z700PrdDifCC = A700PrdDifCC ;
            Z695PrdConCC = A695PrdConCC ;
            Z750PrdValStk = A750PrdValStk ;
            Z332DifValStk = A332DifValStk ;
            Z708PrdFecEnt = A708PrdFecEnt ;
            Z1193PrdPosX = A1193PrdPosX ;
            Z1194PrdPosY = A1194PrdPosY ;
            Z1643PrdTip = A1643PrdTip ;
            Z1644PrdDqo = A1644PrdDqo ;
            Z3004PrdRev = A3004PrdRev ;
            Z3273PrdTnq = A3273PrdTnq ;
            Z4692PrdNom2 = A4692PrdNom2 ;
            Z4693PrdNum2 = A4693PrdNum2 ;
            Z4694PrdObs = A4694PrdObs ;
            Z4338PrdUMeFo = A4338PrdUMeFo ;
            Z5255PrdPreAc2 = A5255PrdPreAc2 ;
            Z5416PrdDensS = A5416PrdDensS ;
            Z5417PrdConcS = A5417PrdConcS ;
            Z5418PrdSalM = A5418PrdSalM ;
            Z5590PrdSolub = A5590PrdSolub ;
            Z6191PrdNumCent = A6191PrdNumCent ;
            Z7226PrdNumct1 = A7226PrdNumct1 ;
            Z7227PrdNumct2 = A7227PrdNumct2 ;
            Z7260PrdHorMad = A7260PrdHorMad ;
            Z8659PrdExiAlmc = A8659PrdExiAlmc ;
            Z8896PrdPesCon = A8896PrdPesCon ;
            Z8897PrdPesTerm = A8897PrdPesTerm ;
            Z8936PrdSal = A8936PrdSal ;
            Z9731PrdInc = A9731PrdInc ;
            Z9732PrdComp = A9732PrdComp ;
            Z9733PrdAox = A9733PrdAox ;
            Z9734PrdNCAS = A9734PrdNCAS ;
            Z9739PrdFT = A9739PrdFT ;
            Z9740PrdFFT = A9740PrdFFT ;
            Z9741PrdHS = A9741PrdHS ;
            Z9742PrdFHS = A9742PrdFHS ;
            Z5887PrdReach = A5887PrdReach ;
            Z5888PrdOkotex = A5888PrdOkotex ;
            Z10119PrdColIdx = A10119PrdColIdx ;
            Z10881PrdLote = A10881PrdLote ;
            Z10935PrdRTM = A10935PrdRTM ;
            Z10936PrdCtw1 = A10936PrdCtw1 ;
            Z10937PrdCtw2 = A10937PrdCtw2 ;
            Z10938PrdCtw3 = A10938PrdCtw3 ;
            Z11663PrdCtw4 = A11663PrdCtw4 ;
            Z11196PrdNroCAS = A11196PrdNroCAS ;
            Z11363PrdGots = A11363PrdGots ;
            Z11364PrdHm = A11364PrdHm ;
            Z11470PrdConct = A11470PrdConct ;
            Z11614PrdEINECS = A11614PrdEINECS ;
            Z11615PrdFuncion = A11615PrdFuncion ;
            Z11616PrdNmQu = A11616PrdNmQu ;
            Z11687PrdList = A11687PrdList ;
            Z629MetCod = A629MetCod ;
            Z795PrvNum = A795PrvNum ;
            Z835TipDtoCod = A835TipDtoCod ;
            Z742PrdUniCom = A742PrdUniCom ;
            Z743PrdUniCon = A743PrdUniCon ;
            Z856ValCod = A856ValCod ;
            Z6301TipPrdCod = A6301TipPrdCod ;
            Z9609SubFamCod = A9609SubFamCod ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z743PrdUniCon = A743PrdUniCon ;
         Z856ValCod = A856ValCod ;
         Z6301TipPrdCod = A6301TipPrdCod ;
         Z9609SubFamCod = A9609SubFamCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z703PrdDscTec = A703PrdDscTec ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z728PrdRefPrv = A728PrdRefPrv ;
         Z734PrdSus = A734PrdSus ;
         Z727PrdRec = A727PrdRec ;
         Z682PrdCalNec = A682PrdCalNec ;
         Z698PrdDetPar = A698PrdDetPar ;
         Z730PrdSit = A730PrdSit ;
         Z729PrdRotRea = A729PrdRotRea ;
         Z724PrdPreAct = A724PrdPreAct ;
         Z709PrdFecPre = A709PrdFecPre ;
         Z725PrdPreAnt = A725PrdPreAnt ;
         Z726PrdPreMed = A726PrdPreMed ;
         Z696PrdConDia = A696PrdConDia ;
         Z731PrdStkMinD = A731PrdStkMinD ;
         Z732PrdStkMinU = A732PrdStkMinU ;
         Z699PrdDiaRot = A699PrdDiaRot ;
         Z722PrdPlaEnt = A722PrdPlaEnt ;
         Z716PrdLotMin = A716PrdLotMin ;
         Z721PrdNumUco = A721PrdNumUco ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z684PrdCanPen = A684PrdCanPen ;
         Z713PrdFulEnt = A713PrdFulEnt ;
         Z714PrdFulPed = A714PrdFulPed ;
         Z712PrdFulCC = A712PrdFulCC ;
         Z706PrdExiCCP = A706PrdExiCCP ;
         Z740PrdUltECC = A740PrdUltECC ;
         Z738PrdUltCCC = A738PrdUltCCC ;
         Z739PrdUltDCC = A739PrdUltDCC ;
         Z700PrdDifCC = A700PrdDifCC ;
         Z695PrdConCC = A695PrdConCC ;
         Z750PrdValStk = A750PrdValStk ;
         Z332DifValStk = A332DifValStk ;
         Z708PrdFecEnt = A708PrdFecEnt ;
         Z1193PrdPosX = A1193PrdPosX ;
         Z1194PrdPosY = A1194PrdPosY ;
         Z1643PrdTip = A1643PrdTip ;
         Z1644PrdDqo = A1644PrdDqo ;
         Z3004PrdRev = A3004PrdRev ;
         Z3273PrdTnq = A3273PrdTnq ;
         Z4692PrdNom2 = A4692PrdNom2 ;
         Z4693PrdNum2 = A4693PrdNum2 ;
         Z4694PrdObs = A4694PrdObs ;
         Z4338PrdUMeFo = A4338PrdUMeFo ;
         Z5255PrdPreAc2 = A5255PrdPreAc2 ;
         Z5416PrdDensS = A5416PrdDensS ;
         Z5417PrdConcS = A5417PrdConcS ;
         Z5418PrdSalM = A5418PrdSalM ;
         Z5590PrdSolub = A5590PrdSolub ;
         Z6191PrdNumCent = A6191PrdNumCent ;
         Z7226PrdNumct1 = A7226PrdNumct1 ;
         Z7227PrdNumct2 = A7227PrdNumct2 ;
         Z7260PrdHorMad = A7260PrdHorMad ;
         Z8659PrdExiAlmc = A8659PrdExiAlmc ;
         Z8896PrdPesCon = A8896PrdPesCon ;
         Z8897PrdPesTerm = A8897PrdPesTerm ;
         Z8936PrdSal = A8936PrdSal ;
         Z9731PrdInc = A9731PrdInc ;
         Z9732PrdComp = A9732PrdComp ;
         Z9733PrdAox = A9733PrdAox ;
         Z9734PrdNCAS = A9734PrdNCAS ;
         Z9739PrdFT = A9739PrdFT ;
         Z9740PrdFFT = A9740PrdFFT ;
         Z9741PrdHS = A9741PrdHS ;
         Z9742PrdFHS = A9742PrdFHS ;
         Z5887PrdReach = A5887PrdReach ;
         Z5888PrdOkotex = A5888PrdOkotex ;
         Z10119PrdColIdx = A10119PrdColIdx ;
         Z10881PrdLote = A10881PrdLote ;
         Z10935PrdRTM = A10935PrdRTM ;
         Z10936PrdCtw1 = A10936PrdCtw1 ;
         Z10937PrdCtw2 = A10937PrdCtw2 ;
         Z10938PrdCtw3 = A10938PrdCtw3 ;
         Z11663PrdCtw4 = A11663PrdCtw4 ;
         Z11196PrdNroCAS = A11196PrdNroCAS ;
         Z11363PrdGots = A11363PrdGots ;
         Z11364PrdHm = A11364PrdHm ;
         Z11470PrdConct = A11470PrdConct ;
         Z11614PrdEINECS = A11614PrdEINECS ;
         Z11615PrdFuncion = A11615PrdFuncion ;
         Z11616PrdNmQu = A11616PrdNmQu ;
         Z11687PrdList = A11687PrdList ;
         Z396EmprCod = A396EmprCod ;
         Z629MetCod = A629MetCod ;
         Z795PrvNum = A795PrvNum ;
         Z835TipDtoCod = A835TipDtoCod ;
         Z742PrdUniCom = A742PrdUniCom ;
         Z407EmprNom = A407EmprNom ;
         Z737PrdUcpDsc = A737PrdUcpDsc ;
         Z736PrdUcoDsc = A736PrdUcoDsc ;
         Z794PrvNom = A794PrvNom ;
         Z857ValDsc = A857ValDsc ;
         Z837TipDtoDto = A837TipDtoDto ;
         Z630MetDsc = A630MetDsc ;
         Z6302TipPrdDsc = A6302TipPrdDsc ;
         Z9610SubFamDsc = A9610SubFamDsc ;
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

   public void loadM829( )
   {
      /* Using cursor T00M814 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A743PrdUniCon = T00M814_A743PrdUniCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         A856ValCod = T00M814_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         A6301TipPrdCod = T00M814_A6301TipPrdCod[0] ;
         n6301TipPrdCod = T00M814_n6301TipPrdCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         A9609SubFamCod = T00M814_A9609SubFamCod[0] ;
         n9609SubFamCod = T00M814_n9609SubFamCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
         A407EmprNom = T00M814_A407EmprNom[0] ;
         n407EmprNom = T00M814_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A718PrdNom = T00M814_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A703PrdDscTec = T00M814_A703PrdDscTec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", A703PrdDscTec);
         A737PrdUcpDsc = T00M814_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = T00M814_n737PrdUcpDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
         A736PrdUcoDsc = T00M814_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = T00M814_n736PrdUcoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
         A707PrdFacCon = T00M814_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A794PrvNom = T00M814_A794PrvNom[0] ;
         n794PrvNom = T00M814_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         A728PrdRefPrv = T00M814_A728PrdRefPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", A728PrdRefPrv);
         A734PrdSus = T00M814_A734PrdSus[0] ;
         n734PrdSus = T00M814_n734PrdSus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", A734PrdSus);
         A857ValDsc = T00M814_A857ValDsc[0] ;
         n857ValDsc = T00M814_n857ValDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
         A727PrdRec = T00M814_A727PrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A682PrdCalNec = T00M814_A682PrdCalNec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", A682PrdCalNec);
         A698PrdDetPar = T00M814_A698PrdDetPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         A730PrdSit = T00M814_A730PrdSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         A729PrdRotRea = T00M814_A729PrdRotRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         A837TipDtoDto = T00M814_A837TipDtoDto[0] ;
         n837TipDtoDto = T00M814_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         A724PrdPreAct = T00M814_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A709PrdFecPre = T00M814_A709PrdFecPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A725PrdPreAnt = T00M814_A725PrdPreAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         A726PrdPreMed = T00M814_A726PrdPreMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A696PrdConDia = T00M814_A696PrdConDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         A731PrdStkMinD = T00M814_A731PrdStkMinD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         A732PrdStkMinU = T00M814_A732PrdStkMinU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         A699PrdDiaRot = T00M814_A699PrdDiaRot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         A722PrdPlaEnt = T00M814_A722PrdPlaEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         A630MetDsc = T00M814_A630MetDsc[0] ;
         n630MetDsc = T00M814_n630MetDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
         A716PrdLotMin = T00M814_A716PrdLotMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         A721PrdNumUco = T00M814_A721PrdNumUco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         A704PrdExiAlm = T00M814_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = T00M814_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A685PrdCanRes = T00M814_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A684PrdCanPen = T00M814_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A713PrdFulEnt = T00M814_A713PrdFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A714PrdFulPed = T00M814_A714PrdFulPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         A712PrdFulCC = T00M814_A712PrdFulCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         A706PrdExiCCP = T00M814_A706PrdExiCCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         A740PrdUltECC = T00M814_A740PrdUltECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         A738PrdUltCCC = T00M814_A738PrdUltCCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         A739PrdUltDCC = T00M814_A739PrdUltDCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         A700PrdDifCC = T00M814_A700PrdDifCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         A695PrdConCC = T00M814_A695PrdConCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         A750PrdValStk = T00M814_A750PrdValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A332DifValStk = T00M814_A332DifValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         A708PrdFecEnt = T00M814_A708PrdFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         A1193PrdPosX = T00M814_A1193PrdPosX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         A1194PrdPosY = T00M814_A1194PrdPosY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         A1643PrdTip = T00M814_A1643PrdTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", A1643PrdTip);
         A1644PrdDqo = T00M814_A1644PrdDqo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         A3004PrdRev = T00M814_A3004PrdRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", A3004PrdRev);
         A3273PrdTnq = T00M814_A3273PrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         A4692PrdNom2 = T00M814_A4692PrdNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4692PrdNom2", A4692PrdNom2);
         A4693PrdNum2 = T00M814_A4693PrdNum2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4693PrdNum2", A4693PrdNum2);
         A4694PrdObs = T00M814_A4694PrdObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4694PrdObs", A4694PrdObs);
         A4338PrdUMeFo = T00M814_A4338PrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         A5255PrdPreAc2 = T00M814_A5255PrdPreAc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         A5416PrdDensS = T00M814_A5416PrdDensS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
         A5417PrdConcS = T00M814_A5417PrdConcS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
         A5418PrdSalM = T00M814_A5418PrdSalM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
         A5590PrdSolub = T00M814_A5590PrdSolub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         A6302TipPrdDsc = T00M814_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = T00M814_n6302TipPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6302TipPrdDsc", A6302TipPrdDsc);
         A6191PrdNumCent = T00M814_A6191PrdNumCent[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", A6191PrdNumCent);
         A7226PrdNumct1 = T00M814_A7226PrdNumct1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
         A7227PrdNumct2 = T00M814_A7227PrdNumct2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
         A7260PrdHorMad = T00M814_A7260PrdHorMad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
         A8659PrdExiAlmc = T00M814_A8659PrdExiAlmc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         A8896PrdPesCon = T00M814_A8896PrdPesCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         A8897PrdPesTerm = T00M814_A8897PrdPesTerm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
         A8936PrdSal = T00M814_A8936PrdSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8936PrdSal", A8936PrdSal);
         A9610SubFamDsc = T00M814_A9610SubFamDsc[0] ;
         n9610SubFamDsc = T00M814_n9610SubFamDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9610SubFamDsc", A9610SubFamDsc);
         A9731PrdInc = T00M814_A9731PrdInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9731PrdInc", A9731PrdInc);
         A9732PrdComp = T00M814_A9732PrdComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9732PrdComp", A9732PrdComp);
         A9733PrdAox = T00M814_A9733PrdAox[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
         A9734PrdNCAS = T00M814_A9734PrdNCAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", A9734PrdNCAS);
         A9739PrdFT = T00M814_A9739PrdFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9739PrdFT", A9739PrdFT);
         A9740PrdFFT = T00M814_A9740PrdFFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
         A9741PrdHS = T00M814_A9741PrdHS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9741PrdHS", A9741PrdHS);
         A9742PrdFHS = T00M814_A9742PrdFHS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
         A5887PrdReach = T00M814_A5887PrdReach[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5887PrdReach", A5887PrdReach);
         A5888PrdOkotex = T00M814_A5888PrdOkotex[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5888PrdOkotex", A5888PrdOkotex);
         A10119PrdColIdx = T00M814_A10119PrdColIdx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10119PrdColIdx", A10119PrdColIdx);
         A10881PrdLote = T00M814_A10881PrdLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         A10935PrdRTM = T00M814_A10935PrdRTM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10935PrdRTM", A10935PrdRTM);
         A10936PrdCtw1 = T00M814_A10936PrdCtw1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
         A10937PrdCtw2 = T00M814_A10937PrdCtw2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
         A10938PrdCtw3 = T00M814_A10938PrdCtw3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
         A11663PrdCtw4 = T00M814_A11663PrdCtw4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
         A11196PrdNroCAS = T00M814_A11196PrdNroCAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11196PrdNroCAS", A11196PrdNroCAS);
         A11363PrdGots = T00M814_A11363PrdGots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
         A11364PrdHm = T00M814_A11364PrdHm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11364PrdHm", A11364PrdHm);
         A11470PrdConct = T00M814_A11470PrdConct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
         A11614PrdEINECS = T00M814_A11614PrdEINECS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11614PrdEINECS", A11614PrdEINECS);
         A11615PrdFuncion = T00M814_A11615PrdFuncion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11615PrdFuncion", A11615PrdFuncion);
         A11616PrdNmQu = T00M814_A11616PrdNmQu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11616PrdNmQu", A11616PrdNmQu);
         A11687PrdList = T00M814_A11687PrdList[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11687PrdList", A11687PrdList);
         A629MetCod = T00M814_A629MetCod[0] ;
         n629MetCod = T00M814_n629MetCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         A795PrvNum = T00M814_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A835TipDtoCod = T00M814_A835TipDtoCod[0] ;
         n835TipDtoCod = T00M814_n835TipDtoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         A742PrdUniCom = T00M814_A742PrdUniCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         zmM829( -7) ;
      }
      pr_default.close(12);
      onLoadActionsM829( ) ;
   }

   public void onLoadActionsM829( )
   {
   }

   public void checkExtendedTableM829( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00M84 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00M84_A407EmprNom[0] ;
      n407EmprNom = T00M84_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T00M85 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A629MetCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "METPED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A630MetDsc = T00M85_A630MetDsc[0] ;
      n630MetDsc = T00M85_n630MetDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
      pr_default.close(3);
      /* Using cursor T00M86 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T00M86_A794PrvNom[0] ;
      n794PrvNom = T00M86_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      pr_default.close(4);
      /* Using cursor T00M87 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A837TipDtoDto = T00M87_A837TipDtoDto[0] ;
      n837TipDtoDto = T00M87_n837TipDtoDto[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      pr_default.close(5);
      /* Using cursor T00M88 */
      pr_default.execute(6, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A737PrdUcpDsc = T00M88_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T00M88_n737PrdUcpDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
      pr_default.close(6);
      /* Using cursor T00M89 */
      pr_default.execute(7, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A736PrdUcoDsc = T00M89_A736PrdUcoDsc[0] ;
      n736PrdUcoDsc = T00M89_n736PrdUcoDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
      pr_default.close(7);
      /* Using cursor T00M810 */
      pr_default.execute(8, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A857ValDsc = T00M810_A857ValDsc[0] ;
      n857ValDsc = T00M810_n857ValDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
      pr_default.close(8);
      /* Using cursor T00M811 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6301TipPrdCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPPRDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6302TipPrdDsc = T00M811_A6302TipPrdDsc[0] ;
      n6302TipPrdDsc = T00M811_n6302TipPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6302TipPrdDsc", A6302TipPrdDsc);
      pr_default.close(9);
      /* Using cursor T00M812 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9609SubFamCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SUBFSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SUBFAMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9610SubFamDsc = T00M812_A9610SubFamDsc[0] ;
      n9610SubFamDsc = T00M812_n9610SubFamDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9610SubFamDsc", A9610SubFamDsc);
      pr_default.close(10);
      if ( ! ( ( GXutil.strcmp(A727PrdRec, "S") == 0 ) || ( GXutil.strcmp(A727PrdRec, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Control en Recuento", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDREC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdRec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A682PrdCalNec, "S") == 0 ) || ( GXutil.strcmp(A682PrdCalNec, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Calculo Necesidades", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDCALNEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdCalNec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A698PrdDetPar, "S") == 0 ) || ( GXutil.strcmp(A698PrdDetPar, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Detalle Partidas", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDDETPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdDetPar_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A1643PrdTip, "A") == 0 ) || ( GXutil.strcmp(A1643PrdTip, "M") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo de Producto,Manual,Autom", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A3004PrdRev, "S") == 0 ) || ( GXutil.strcmp(A3004PrdRev, "N") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Revision", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PRDREV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdRev_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsM829( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_8( String A396EmprCod )
   {
      /* Using cursor T00M815 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00M815_A407EmprNom[0] ;
      n407EmprNom = T00M815_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_9( String A396EmprCod ,
                         byte A629MetCod )
   {
      /* Using cursor T00M816 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A629MetCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "METPED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A630MetDsc = T00M816_A630MetDsc[0] ;
      n630MetDsc = T00M816_n630MetDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A630MetDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_10( String A396EmprCod ,
                          int A795PrvNum )
   {
      /* Using cursor T00M817 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A794PrvNom = T00M817_A794PrvNom[0] ;
      n794PrvNom = T00M817_n794PrvNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A794PrvNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_11( String A396EmprCod ,
                          byte A835TipDtoCod )
   {
      /* Using cursor T00M818 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A837TipDtoDto = T00M818_A837TipDtoDto[0] ;
      n837TipDtoDto = T00M818_n837TipDtoDto[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_12( String A396EmprCod ,
                          byte A742PrdUniCom )
   {
      /* Using cursor T00M819 */
      pr_default.execute(17, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A737PrdUcpDsc = T00M819_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T00M819_n737PrdUcpDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A737PrdUcpDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_13( String A396EmprCod ,
                          byte A743PrdUniCon )
   {
      /* Using cursor T00M820 */
      pr_default.execute(18, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
      if ( (pr_default.getStatus(18) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A736PrdUcoDsc = T00M820_A736PrdUcoDsc[0] ;
      n736PrdUcoDsc = T00M820_n736PrdUcoDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A736PrdUcoDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_14( String A396EmprCod ,
                          byte A856ValCod )
   {
      /* Using cursor T00M821 */
      pr_default.execute(19, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A857ValDsc = T00M821_A857ValDsc[0] ;
      n857ValDsc = T00M821_n857ValDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A857ValDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_15( String A396EmprCod ,
                          short A6301TipPrdCod )
   {
      /* Using cursor T00M822 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6301TipPrdCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPPRDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A6302TipPrdDsc = T00M822_A6302TipPrdDsc[0] ;
      n6302TipPrdDsc = T00M822_n6302TipPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A6302TipPrdDsc", A6302TipPrdDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6302TipPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_16( String A396EmprCod ,
                          byte A9609SubFamCod )
   {
      /* Using cursor T00M823 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9609SubFamCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SUBFSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SUBFAMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A9610SubFamDsc = T00M823_A9610SubFamDsc[0] ;
      n9610SubFamDsc = T00M823_n9610SubFamDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9610SubFamDsc", A9610SubFamDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9610SubFamDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKeyM829( )
   {
      /* Using cursor T00M824 */
      pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00M83 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmM829( 7) ;
         RcdFound29 = (short)(1) ;
         A743PrdUniCon = T00M83_A743PrdUniCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
         A856ValCod = T00M83_A856ValCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         A6301TipPrdCod = T00M83_A6301TipPrdCod[0] ;
         n6301TipPrdCod = T00M83_n6301TipPrdCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
         A9609SubFamCod = T00M83_A9609SubFamCod[0] ;
         n9609SubFamCod = T00M83_n9609SubFamCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
         A719PrdNum = T00M83_A719PrdNum[0] ;
         n719PrdNum = T00M83_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T00M83_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         A703PrdDscTec = T00M83_A703PrdDscTec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", A703PrdDscTec);
         A707PrdFacCon = T00M83_A707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A728PrdRefPrv = T00M83_A728PrdRefPrv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", A728PrdRefPrv);
         A734PrdSus = T00M83_A734PrdSus[0] ;
         n734PrdSus = T00M83_n734PrdSus[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", A734PrdSus);
         A727PrdRec = T00M83_A727PrdRec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
         A682PrdCalNec = T00M83_A682PrdCalNec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", A682PrdCalNec);
         A698PrdDetPar = T00M83_A698PrdDetPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
         A730PrdSit = T00M83_A730PrdSit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
         A729PrdRotRea = T00M83_A729PrdRotRea[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
         A724PrdPreAct = T00M83_A724PrdPreAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
         A709PrdFecPre = T00M83_A709PrdFecPre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
         A725PrdPreAnt = T00M83_A725PrdPreAnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
         A726PrdPreMed = T00M83_A726PrdPreMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
         A696PrdConDia = T00M83_A696PrdConDia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
         A731PrdStkMinD = T00M83_A731PrdStkMinD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
         A732PrdStkMinU = T00M83_A732PrdStkMinU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
         A699PrdDiaRot = T00M83_A699PrdDiaRot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
         A722PrdPlaEnt = T00M83_A722PrdPlaEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
         A716PrdLotMin = T00M83_A716PrdLotMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
         A721PrdNumUco = T00M83_A721PrdNumUco[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
         A704PrdExiAlm = T00M83_A704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A705PrdExiCC = T00M83_A705PrdExiCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A685PrdCanRes = T00M83_A685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A684PrdCanPen = T00M83_A684PrdCanPen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
         A713PrdFulEnt = T00M83_A713PrdFulEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
         A714PrdFulPed = T00M83_A714PrdFulPed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
         A712PrdFulCC = T00M83_A712PrdFulCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
         A706PrdExiCCP = T00M83_A706PrdExiCCP[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         A740PrdUltECC = T00M83_A740PrdUltECC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
         A738PrdUltCCC = T00M83_A738PrdUltCCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
         A739PrdUltDCC = T00M83_A739PrdUltDCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
         A700PrdDifCC = T00M83_A700PrdDifCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
         A695PrdConCC = T00M83_A695PrdConCC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
         A750PrdValStk = T00M83_A750PrdValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
         A332DifValStk = T00M83_A332DifValStk[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
         A708PrdFecEnt = T00M83_A708PrdFecEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
         A1193PrdPosX = T00M83_A1193PrdPosX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
         A1194PrdPosY = T00M83_A1194PrdPosY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
         A1643PrdTip = T00M83_A1643PrdTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", A1643PrdTip);
         A1644PrdDqo = T00M83_A1644PrdDqo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
         A3004PrdRev = T00M83_A3004PrdRev[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", A3004PrdRev);
         A3273PrdTnq = T00M83_A3273PrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
         A4692PrdNom2 = T00M83_A4692PrdNom2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4692PrdNom2", A4692PrdNom2);
         A4693PrdNum2 = T00M83_A4693PrdNum2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4693PrdNum2", A4693PrdNum2);
         A4694PrdObs = T00M83_A4694PrdObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4694PrdObs", A4694PrdObs);
         A4338PrdUMeFo = T00M83_A4338PrdUMeFo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
         A5255PrdPreAc2 = T00M83_A5255PrdPreAc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
         A5416PrdDensS = T00M83_A5416PrdDensS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
         A5417PrdConcS = T00M83_A5417PrdConcS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
         A5418PrdSalM = T00M83_A5418PrdSalM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
         A5590PrdSolub = T00M83_A5590PrdSolub[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
         A6191PrdNumCent = T00M83_A6191PrdNumCent[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", A6191PrdNumCent);
         A7226PrdNumct1 = T00M83_A7226PrdNumct1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
         A7227PrdNumct2 = T00M83_A7227PrdNumct2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
         A7260PrdHorMad = T00M83_A7260PrdHorMad[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
         A8659PrdExiAlmc = T00M83_A8659PrdExiAlmc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
         A8896PrdPesCon = T00M83_A8896PrdPesCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
         A8897PrdPesTerm = T00M83_A8897PrdPesTerm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
         A8936PrdSal = T00M83_A8936PrdSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8936PrdSal", A8936PrdSal);
         A9731PrdInc = T00M83_A9731PrdInc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9731PrdInc", A9731PrdInc);
         A9732PrdComp = T00M83_A9732PrdComp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9732PrdComp", A9732PrdComp);
         A9733PrdAox = T00M83_A9733PrdAox[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
         A9734PrdNCAS = T00M83_A9734PrdNCAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", A9734PrdNCAS);
         A9739PrdFT = T00M83_A9739PrdFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9739PrdFT", A9739PrdFT);
         A9740PrdFFT = T00M83_A9740PrdFFT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
         A9741PrdHS = T00M83_A9741PrdHS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9741PrdHS", A9741PrdHS);
         A9742PrdFHS = T00M83_A9742PrdFHS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
         A5887PrdReach = T00M83_A5887PrdReach[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5887PrdReach", A5887PrdReach);
         A5888PrdOkotex = T00M83_A5888PrdOkotex[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5888PrdOkotex", A5888PrdOkotex);
         A10119PrdColIdx = T00M83_A10119PrdColIdx[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10119PrdColIdx", A10119PrdColIdx);
         A10881PrdLote = T00M83_A10881PrdLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         A10935PrdRTM = T00M83_A10935PrdRTM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10935PrdRTM", A10935PrdRTM);
         A10936PrdCtw1 = T00M83_A10936PrdCtw1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
         A10937PrdCtw2 = T00M83_A10937PrdCtw2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
         A10938PrdCtw3 = T00M83_A10938PrdCtw3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
         A11663PrdCtw4 = T00M83_A11663PrdCtw4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
         A11196PrdNroCAS = T00M83_A11196PrdNroCAS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11196PrdNroCAS", A11196PrdNroCAS);
         A11363PrdGots = T00M83_A11363PrdGots[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
         A11364PrdHm = T00M83_A11364PrdHm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11364PrdHm", A11364PrdHm);
         A11470PrdConct = T00M83_A11470PrdConct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
         A11614PrdEINECS = T00M83_A11614PrdEINECS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11614PrdEINECS", A11614PrdEINECS);
         A11615PrdFuncion = T00M83_A11615PrdFuncion[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11615PrdFuncion", A11615PrdFuncion);
         A11616PrdNmQu = T00M83_A11616PrdNmQu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11616PrdNmQu", A11616PrdNmQu);
         A11687PrdList = T00M83_A11687PrdList[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11687PrdList", A11687PrdList);
         A396EmprCod = T00M83_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A629MetCod = T00M83_A629MetCod[0] ;
         n629MetCod = T00M83_n629MetCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
         A795PrvNum = T00M83_A795PrvNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A835TipDtoCod = T00M83_A835TipDtoCod[0] ;
         n835TipDtoCod = T00M83_n835TipDtoCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
         A742PrdUniCom = T00M83_A742PrdUniCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadM829( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKeyM829( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKeyM829( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyM829( ) ;
      if ( RcdFound29 == 0 )
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
      RcdFound29 = (short)(0) ;
      /* Using cursor T00M825 */
      pr_default.execute(23, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(23) != 101) )
      {
         while ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T00M825_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00M825_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00M825_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            pr_default.readNext(23);
         }
         if ( (pr_default.getStatus(23) != 101) && ( ( GXutil.strcmp(T00M825_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00M825_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00M825_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            A396EmprCod = T00M825_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T00M825_A719PrdNum[0] ;
            n719PrdNum = T00M825_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(23);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T00M826 */
      pr_default.execute(24, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( GXutil.strcmp(T00M826_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00M826_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00M826_A719PrdNum[0], A719PrdNum) > 0 ) ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( GXutil.strcmp(T00M826_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00M826_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00M826_A719PrdNum[0], A719PrdNum) < 0 ) ) )
         {
            A396EmprCod = T00M826_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A719PrdNum = T00M826_A719PrdNum[0] ;
            n719PrdNum = T00M826_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyM829( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertM829( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
               updateM829( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertM829( ) ;
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
                  insertM829( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartM829( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndM829( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
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
      scanStartM829( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNextM829( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtPrdNom_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndM829( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyM829( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00M82 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z718PrdNom, T00M82_A718PrdNom[0]) != 0 ) || ( GXutil.strcmp(Z703PrdDscTec, T00M82_A703PrdDscTec[0]) != 0 ) || ( DecimalUtil.compareTo(Z707PrdFacCon, T00M82_A707PrdFacCon[0]) != 0 ) || ( GXutil.strcmp(Z728PrdRefPrv, T00M82_A728PrdRefPrv[0]) != 0 ) || ( GXutil.strcmp(Z734PrdSus, T00M82_A734PrdSus[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z727PrdRec, T00M82_A727PrdRec[0]) != 0 ) || ( GXutil.strcmp(Z682PrdCalNec, T00M82_A682PrdCalNec[0]) != 0 ) || ( GXutil.strcmp(Z698PrdDetPar, T00M82_A698PrdDetPar[0]) != 0 ) || ( Z730PrdSit != T00M82_A730PrdSit[0] ) || ( DecimalUtil.compareTo(Z729PrdRotRea, T00M82_A729PrdRotRea[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z724PrdPreAct, T00M82_A724PrdPreAct[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T00M82_A709PrdFecPre[0])) ) || ( DecimalUtil.compareTo(Z725PrdPreAnt, T00M82_A725PrdPreAnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z726PrdPreMed, T00M82_A726PrdPreMed[0]) != 0 ) || ( DecimalUtil.compareTo(Z696PrdConDia, T00M82_A696PrdConDia[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z731PrdStkMinD != T00M82_A731PrdStkMinD[0] ) || ( DecimalUtil.compareTo(Z732PrdStkMinU, T00M82_A732PrdStkMinU[0]) != 0 ) || ( Z699PrdDiaRot != T00M82_A699PrdDiaRot[0] ) || ( Z722PrdPlaEnt != T00M82_A722PrdPlaEnt[0] ) || ( Z716PrdLotMin != T00M82_A716PrdLotMin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z721PrdNumUco, T00M82_A721PrdNumUco[0]) != 0 ) || ( DecimalUtil.compareTo(Z704PrdExiAlm, T00M82_A704PrdExiAlm[0]) != 0 ) || ( DecimalUtil.compareTo(Z705PrdExiCC, T00M82_A705PrdExiCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z685PrdCanRes, T00M82_A685PrdCanRes[0]) != 0 ) || ( DecimalUtil.compareTo(Z684PrdCanPen, T00M82_A684PrdCanPen[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T00M82_A713PrdFulEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z714PrdFulPed), GXutil.resetTime(T00M82_A714PrdFulPed[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z712PrdFulCC), GXutil.resetTime(T00M82_A712PrdFulCC[0])) ) || ( DecimalUtil.compareTo(Z706PrdExiCCP, T00M82_A706PrdExiCCP[0]) != 0 ) || ( DecimalUtil.compareTo(Z740PrdUltECC, T00M82_A740PrdUltECC[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z738PrdUltCCC != T00M82_A738PrdUltCCC[0] ) || ( DecimalUtil.compareTo(Z739PrdUltDCC, T00M82_A739PrdUltDCC[0]) != 0 ) || ( DecimalUtil.compareTo(Z700PrdDifCC, T00M82_A700PrdDifCC[0]) != 0 ) || ( Z695PrdConCC != T00M82_A695PrdConCC[0] ) || ( DecimalUtil.compareTo(Z750PrdValStk, T00M82_A750PrdValStk[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z332DifValStk, T00M82_A332DifValStk[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z708PrdFecEnt), GXutil.resetTime(T00M82_A708PrdFecEnt[0])) ) || ( Z1193PrdPosX != T00M82_A1193PrdPosX[0] ) || ( Z1194PrdPosY != T00M82_A1194PrdPosY[0] ) || ( GXutil.strcmp(Z1643PrdTip, T00M82_A1643PrdTip[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1644PrdDqo != T00M82_A1644PrdDqo[0] ) || ( GXutil.strcmp(Z3004PrdRev, T00M82_A3004PrdRev[0]) != 0 ) || ( Z3273PrdTnq != T00M82_A3273PrdTnq[0] ) || ( GXutil.strcmp(Z4692PrdNom2, T00M82_A4692PrdNom2[0]) != 0 ) || ( GXutil.strcmp(Z4693PrdNum2, T00M82_A4693PrdNum2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4694PrdObs, T00M82_A4694PrdObs[0]) != 0 ) || ( Z4338PrdUMeFo != T00M82_A4338PrdUMeFo[0] ) || ( DecimalUtil.compareTo(Z5255PrdPreAc2, T00M82_A5255PrdPreAc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z5416PrdDensS, T00M82_A5416PrdDensS[0]) != 0 ) || ( DecimalUtil.compareTo(Z5417PrdConcS, T00M82_A5417PrdConcS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z5418PrdSalM, T00M82_A5418PrdSalM[0]) != 0 ) || ( DecimalUtil.compareTo(Z5590PrdSolub, T00M82_A5590PrdSolub[0]) != 0 ) || ( GXutil.strcmp(Z6191PrdNumCent, T00M82_A6191PrdNumCent[0]) != 0 ) || ( DecimalUtil.compareTo(Z7226PrdNumct1, T00M82_A7226PrdNumct1[0]) != 0 ) || ( DecimalUtil.compareTo(Z7227PrdNumct2, T00M82_A7227PrdNumct2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7260PrdHorMad != T00M82_A7260PrdHorMad[0] ) || ( DecimalUtil.compareTo(Z8659PrdExiAlmc, T00M82_A8659PrdExiAlmc[0]) != 0 ) || ( Z8896PrdPesCon != T00M82_A8896PrdPesCon[0] ) || ( GXutil.strcmp(Z8897PrdPesTerm, T00M82_A8897PrdPesTerm[0]) != 0 ) || ( GXutil.strcmp(Z8936PrdSal, T00M82_A8936PrdSal[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z9731PrdInc, T00M82_A9731PrdInc[0]) != 0 ) || ( GXutil.strcmp(Z9732PrdComp, T00M82_A9732PrdComp[0]) != 0 ) || ( DecimalUtil.compareTo(Z9733PrdAox, T00M82_A9733PrdAox[0]) != 0 ) || ( GXutil.strcmp(Z9734PrdNCAS, T00M82_A9734PrdNCAS[0]) != 0 ) || ( GXutil.strcmp(Z9739PrdFT, T00M82_A9739PrdFT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z9740PrdFFT), GXutil.resetTime(T00M82_A9740PrdFFT[0])) ) || ( GXutil.strcmp(Z9741PrdHS, T00M82_A9741PrdHS[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z9742PrdFHS), GXutil.resetTime(T00M82_A9742PrdFHS[0])) ) || ( GXutil.strcmp(Z5887PrdReach, T00M82_A5887PrdReach[0]) != 0 ) || ( GXutil.strcmp(Z5888PrdOkotex, T00M82_A5888PrdOkotex[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10119PrdColIdx, T00M82_A10119PrdColIdx[0]) != 0 ) || ( GXutil.strcmp(Z10881PrdLote, T00M82_A10881PrdLote[0]) != 0 ) || ( GXutil.strcmp(Z10935PrdRTM, T00M82_A10935PrdRTM[0]) != 0 ) || ( GXutil.strcmp(Z10936PrdCtw1, T00M82_A10936PrdCtw1[0]) != 0 ) || ( GXutil.strcmp(Z10937PrdCtw2, T00M82_A10937PrdCtw2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10938PrdCtw3, T00M82_A10938PrdCtw3[0]) != 0 ) || ( GXutil.strcmp(Z11663PrdCtw4, T00M82_A11663PrdCtw4[0]) != 0 ) || ( GXutil.strcmp(Z11196PrdNroCAS, T00M82_A11196PrdNroCAS[0]) != 0 ) || ( GXutil.strcmp(Z11363PrdGots, T00M82_A11363PrdGots[0]) != 0 ) || ( GXutil.strcmp(Z11364PrdHm, T00M82_A11364PrdHm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z11470PrdConct != T00M82_A11470PrdConct[0] ) || ( GXutil.strcmp(Z11614PrdEINECS, T00M82_A11614PrdEINECS[0]) != 0 ) || ( GXutil.strcmp(Z11615PrdFuncion, T00M82_A11615PrdFuncion[0]) != 0 ) || ( GXutil.strcmp(Z11616PrdNmQu, T00M82_A11616PrdNmQu[0]) != 0 ) || ( GXutil.strcmp(Z11687PrdList, T00M82_A11687PrdList[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z629MetCod != T00M82_A629MetCod[0] ) || ( Z795PrvNum != T00M82_A795PrvNum[0] ) || ( Z835TipDtoCod != T00M82_A835TipDtoCod[0] ) || ( Z742PrdUniCom != T00M82_A742PrdUniCom[0] ) || ( Z743PrdUniCon != T00M82_A743PrdUniCon[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z856ValCod != T00M82_A856ValCod[0] ) || ( Z6301TipPrdCod != T00M82_A6301TipPrdCod[0] ) || ( Z9609SubFamCod != T00M82_A9609SubFamCod[0] ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T00M82_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T00M82_A718PrdNom[0]);
            }
            if ( GXutil.strcmp(Z703PrdDscTec, T00M82_A703PrdDscTec[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdDscTec");
               GXutil.writeLogRaw("Old: ",Z703PrdDscTec);
               GXutil.writeLogRaw("Current: ",T00M82_A703PrdDscTec[0]);
            }
            if ( DecimalUtil.compareTo(Z707PrdFacCon, T00M82_A707PrdFacCon[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFacCon");
               GXutil.writeLogRaw("Old: ",Z707PrdFacCon);
               GXutil.writeLogRaw("Current: ",T00M82_A707PrdFacCon[0]);
            }
            if ( GXutil.strcmp(Z728PrdRefPrv, T00M82_A728PrdRefPrv[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdRefPrv");
               GXutil.writeLogRaw("Old: ",Z728PrdRefPrv);
               GXutil.writeLogRaw("Current: ",T00M82_A728PrdRefPrv[0]);
            }
            if ( GXutil.strcmp(Z734PrdSus, T00M82_A734PrdSus[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdSus");
               GXutil.writeLogRaw("Old: ",Z734PrdSus);
               GXutil.writeLogRaw("Current: ",T00M82_A734PrdSus[0]);
            }
            if ( GXutil.strcmp(Z727PrdRec, T00M82_A727PrdRec[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdRec");
               GXutil.writeLogRaw("Old: ",Z727PrdRec);
               GXutil.writeLogRaw("Current: ",T00M82_A727PrdRec[0]);
            }
            if ( GXutil.strcmp(Z682PrdCalNec, T00M82_A682PrdCalNec[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdCalNec");
               GXutil.writeLogRaw("Old: ",Z682PrdCalNec);
               GXutil.writeLogRaw("Current: ",T00M82_A682PrdCalNec[0]);
            }
            if ( GXutil.strcmp(Z698PrdDetPar, T00M82_A698PrdDetPar[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdDetPar");
               GXutil.writeLogRaw("Old: ",Z698PrdDetPar);
               GXutil.writeLogRaw("Current: ",T00M82_A698PrdDetPar[0]);
            }
            if ( Z730PrdSit != T00M82_A730PrdSit[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdSit");
               GXutil.writeLogRaw("Old: ",Z730PrdSit);
               GXutil.writeLogRaw("Current: ",T00M82_A730PrdSit[0]);
            }
            if ( DecimalUtil.compareTo(Z729PrdRotRea, T00M82_A729PrdRotRea[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdRotRea");
               GXutil.writeLogRaw("Old: ",Z729PrdRotRea);
               GXutil.writeLogRaw("Current: ",T00M82_A729PrdRotRea[0]);
            }
            if ( DecimalUtil.compareTo(Z724PrdPreAct, T00M82_A724PrdPreAct[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPreAct");
               GXutil.writeLogRaw("Old: ",Z724PrdPreAct);
               GXutil.writeLogRaw("Current: ",T00M82_A724PrdPreAct[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z709PrdFecPre), GXutil.resetTime(T00M82_A709PrdFecPre[0])) ) )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFecPre");
               GXutil.writeLogRaw("Old: ",Z709PrdFecPre);
               GXutil.writeLogRaw("Current: ",T00M82_A709PrdFecPre[0]);
            }
            if ( DecimalUtil.compareTo(Z725PrdPreAnt, T00M82_A725PrdPreAnt[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPreAnt");
               GXutil.writeLogRaw("Old: ",Z725PrdPreAnt);
               GXutil.writeLogRaw("Current: ",T00M82_A725PrdPreAnt[0]);
            }
            if ( DecimalUtil.compareTo(Z726PrdPreMed, T00M82_A726PrdPreMed[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPreMed");
               GXutil.writeLogRaw("Old: ",Z726PrdPreMed);
               GXutil.writeLogRaw("Current: ",T00M82_A726PrdPreMed[0]);
            }
            if ( DecimalUtil.compareTo(Z696PrdConDia, T00M82_A696PrdConDia[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdConDia");
               GXutil.writeLogRaw("Old: ",Z696PrdConDia);
               GXutil.writeLogRaw("Current: ",T00M82_A696PrdConDia[0]);
            }
            if ( Z731PrdStkMinD != T00M82_A731PrdStkMinD[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdStkMinD");
               GXutil.writeLogRaw("Old: ",Z731PrdStkMinD);
               GXutil.writeLogRaw("Current: ",T00M82_A731PrdStkMinD[0]);
            }
            if ( DecimalUtil.compareTo(Z732PrdStkMinU, T00M82_A732PrdStkMinU[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdStkMinU");
               GXutil.writeLogRaw("Old: ",Z732PrdStkMinU);
               GXutil.writeLogRaw("Current: ",T00M82_A732PrdStkMinU[0]);
            }
            if ( Z699PrdDiaRot != T00M82_A699PrdDiaRot[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdDiaRot");
               GXutil.writeLogRaw("Old: ",Z699PrdDiaRot);
               GXutil.writeLogRaw("Current: ",T00M82_A699PrdDiaRot[0]);
            }
            if ( Z722PrdPlaEnt != T00M82_A722PrdPlaEnt[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPlaEnt");
               GXutil.writeLogRaw("Old: ",Z722PrdPlaEnt);
               GXutil.writeLogRaw("Current: ",T00M82_A722PrdPlaEnt[0]);
            }
            if ( Z716PrdLotMin != T00M82_A716PrdLotMin[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdLotMin");
               GXutil.writeLogRaw("Old: ",Z716PrdLotMin);
               GXutil.writeLogRaw("Current: ",T00M82_A716PrdLotMin[0]);
            }
            if ( DecimalUtil.compareTo(Z721PrdNumUco, T00M82_A721PrdNumUco[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNumUco");
               GXutil.writeLogRaw("Old: ",Z721PrdNumUco);
               GXutil.writeLogRaw("Current: ",T00M82_A721PrdNumUco[0]);
            }
            if ( DecimalUtil.compareTo(Z704PrdExiAlm, T00M82_A704PrdExiAlm[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdExiAlm");
               GXutil.writeLogRaw("Old: ",Z704PrdExiAlm);
               GXutil.writeLogRaw("Current: ",T00M82_A704PrdExiAlm[0]);
            }
            if ( DecimalUtil.compareTo(Z705PrdExiCC, T00M82_A705PrdExiCC[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdExiCC");
               GXutil.writeLogRaw("Old: ",Z705PrdExiCC);
               GXutil.writeLogRaw("Current: ",T00M82_A705PrdExiCC[0]);
            }
            if ( DecimalUtil.compareTo(Z685PrdCanRes, T00M82_A685PrdCanRes[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdCanRes");
               GXutil.writeLogRaw("Old: ",Z685PrdCanRes);
               GXutil.writeLogRaw("Current: ",T00M82_A685PrdCanRes[0]);
            }
            if ( DecimalUtil.compareTo(Z684PrdCanPen, T00M82_A684PrdCanPen[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdCanPen");
               GXutil.writeLogRaw("Old: ",Z684PrdCanPen);
               GXutil.writeLogRaw("Current: ",T00M82_A684PrdCanPen[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z713PrdFulEnt), GXutil.resetTime(T00M82_A713PrdFulEnt[0])) ) )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFulEnt");
               GXutil.writeLogRaw("Old: ",Z713PrdFulEnt);
               GXutil.writeLogRaw("Current: ",T00M82_A713PrdFulEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z714PrdFulPed), GXutil.resetTime(T00M82_A714PrdFulPed[0])) ) )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFulPed");
               GXutil.writeLogRaw("Old: ",Z714PrdFulPed);
               GXutil.writeLogRaw("Current: ",T00M82_A714PrdFulPed[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z712PrdFulCC), GXutil.resetTime(T00M82_A712PrdFulCC[0])) ) )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFulCC");
               GXutil.writeLogRaw("Old: ",Z712PrdFulCC);
               GXutil.writeLogRaw("Current: ",T00M82_A712PrdFulCC[0]);
            }
            if ( DecimalUtil.compareTo(Z706PrdExiCCP, T00M82_A706PrdExiCCP[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdExiCCP");
               GXutil.writeLogRaw("Old: ",Z706PrdExiCCP);
               GXutil.writeLogRaw("Current: ",T00M82_A706PrdExiCCP[0]);
            }
            if ( DecimalUtil.compareTo(Z740PrdUltECC, T00M82_A740PrdUltECC[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdUltECC");
               GXutil.writeLogRaw("Old: ",Z740PrdUltECC);
               GXutil.writeLogRaw("Current: ",T00M82_A740PrdUltECC[0]);
            }
            if ( Z738PrdUltCCC != T00M82_A738PrdUltCCC[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdUltCCC");
               GXutil.writeLogRaw("Old: ",Z738PrdUltCCC);
               GXutil.writeLogRaw("Current: ",T00M82_A738PrdUltCCC[0]);
            }
            if ( DecimalUtil.compareTo(Z739PrdUltDCC, T00M82_A739PrdUltDCC[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdUltDCC");
               GXutil.writeLogRaw("Old: ",Z739PrdUltDCC);
               GXutil.writeLogRaw("Current: ",T00M82_A739PrdUltDCC[0]);
            }
            if ( DecimalUtil.compareTo(Z700PrdDifCC, T00M82_A700PrdDifCC[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdDifCC");
               GXutil.writeLogRaw("Old: ",Z700PrdDifCC);
               GXutil.writeLogRaw("Current: ",T00M82_A700PrdDifCC[0]);
            }
            if ( Z695PrdConCC != T00M82_A695PrdConCC[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdConCC");
               GXutil.writeLogRaw("Old: ",Z695PrdConCC);
               GXutil.writeLogRaw("Current: ",T00M82_A695PrdConCC[0]);
            }
            if ( DecimalUtil.compareTo(Z750PrdValStk, T00M82_A750PrdValStk[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdValStk");
               GXutil.writeLogRaw("Old: ",Z750PrdValStk);
               GXutil.writeLogRaw("Current: ",T00M82_A750PrdValStk[0]);
            }
            if ( DecimalUtil.compareTo(Z332DifValStk, T00M82_A332DifValStk[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"DifValStk");
               GXutil.writeLogRaw("Old: ",Z332DifValStk);
               GXutil.writeLogRaw("Current: ",T00M82_A332DifValStk[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z708PrdFecEnt), GXutil.resetTime(T00M82_A708PrdFecEnt[0])) ) )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFecEnt");
               GXutil.writeLogRaw("Old: ",Z708PrdFecEnt);
               GXutil.writeLogRaw("Current: ",T00M82_A708PrdFecEnt[0]);
            }
            if ( Z1193PrdPosX != T00M82_A1193PrdPosX[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPosX");
               GXutil.writeLogRaw("Old: ",Z1193PrdPosX);
               GXutil.writeLogRaw("Current: ",T00M82_A1193PrdPosX[0]);
            }
            if ( Z1194PrdPosY != T00M82_A1194PrdPosY[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPosY");
               GXutil.writeLogRaw("Old: ",Z1194PrdPosY);
               GXutil.writeLogRaw("Current: ",T00M82_A1194PrdPosY[0]);
            }
            if ( GXutil.strcmp(Z1643PrdTip, T00M82_A1643PrdTip[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdTip");
               GXutil.writeLogRaw("Old: ",Z1643PrdTip);
               GXutil.writeLogRaw("Current: ",T00M82_A1643PrdTip[0]);
            }
            if ( Z1644PrdDqo != T00M82_A1644PrdDqo[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdDqo");
               GXutil.writeLogRaw("Old: ",Z1644PrdDqo);
               GXutil.writeLogRaw("Current: ",T00M82_A1644PrdDqo[0]);
            }
            if ( GXutil.strcmp(Z3004PrdRev, T00M82_A3004PrdRev[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdRev");
               GXutil.writeLogRaw("Old: ",Z3004PrdRev);
               GXutil.writeLogRaw("Current: ",T00M82_A3004PrdRev[0]);
            }
            if ( Z3273PrdTnq != T00M82_A3273PrdTnq[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdTnq");
               GXutil.writeLogRaw("Old: ",Z3273PrdTnq);
               GXutil.writeLogRaw("Current: ",T00M82_A3273PrdTnq[0]);
            }
            if ( GXutil.strcmp(Z4692PrdNom2, T00M82_A4692PrdNom2[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNom2");
               GXutil.writeLogRaw("Old: ",Z4692PrdNom2);
               GXutil.writeLogRaw("Current: ",T00M82_A4692PrdNom2[0]);
            }
            if ( GXutil.strcmp(Z4693PrdNum2, T00M82_A4693PrdNum2[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNum2");
               GXutil.writeLogRaw("Old: ",Z4693PrdNum2);
               GXutil.writeLogRaw("Current: ",T00M82_A4693PrdNum2[0]);
            }
            if ( GXutil.strcmp(Z4694PrdObs, T00M82_A4694PrdObs[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdObs");
               GXutil.writeLogRaw("Old: ",Z4694PrdObs);
               GXutil.writeLogRaw("Current: ",T00M82_A4694PrdObs[0]);
            }
            if ( Z4338PrdUMeFo != T00M82_A4338PrdUMeFo[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdUMeFo");
               GXutil.writeLogRaw("Old: ",Z4338PrdUMeFo);
               GXutil.writeLogRaw("Current: ",T00M82_A4338PrdUMeFo[0]);
            }
            if ( DecimalUtil.compareTo(Z5255PrdPreAc2, T00M82_A5255PrdPreAc2[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPreAc2");
               GXutil.writeLogRaw("Old: ",Z5255PrdPreAc2);
               GXutil.writeLogRaw("Current: ",T00M82_A5255PrdPreAc2[0]);
            }
            if ( DecimalUtil.compareTo(Z5416PrdDensS, T00M82_A5416PrdDensS[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdDensS");
               GXutil.writeLogRaw("Old: ",Z5416PrdDensS);
               GXutil.writeLogRaw("Current: ",T00M82_A5416PrdDensS[0]);
            }
            if ( DecimalUtil.compareTo(Z5417PrdConcS, T00M82_A5417PrdConcS[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdConcS");
               GXutil.writeLogRaw("Old: ",Z5417PrdConcS);
               GXutil.writeLogRaw("Current: ",T00M82_A5417PrdConcS[0]);
            }
            if ( GXutil.strcmp(Z5418PrdSalM, T00M82_A5418PrdSalM[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdSalM");
               GXutil.writeLogRaw("Old: ",Z5418PrdSalM);
               GXutil.writeLogRaw("Current: ",T00M82_A5418PrdSalM[0]);
            }
            if ( DecimalUtil.compareTo(Z5590PrdSolub, T00M82_A5590PrdSolub[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdSolub");
               GXutil.writeLogRaw("Old: ",Z5590PrdSolub);
               GXutil.writeLogRaw("Current: ",T00M82_A5590PrdSolub[0]);
            }
            if ( GXutil.strcmp(Z6191PrdNumCent, T00M82_A6191PrdNumCent[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNumCent");
               GXutil.writeLogRaw("Old: ",Z6191PrdNumCent);
               GXutil.writeLogRaw("Current: ",T00M82_A6191PrdNumCent[0]);
            }
            if ( DecimalUtil.compareTo(Z7226PrdNumct1, T00M82_A7226PrdNumct1[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNumct1");
               GXutil.writeLogRaw("Old: ",Z7226PrdNumct1);
               GXutil.writeLogRaw("Current: ",T00M82_A7226PrdNumct1[0]);
            }
            if ( DecimalUtil.compareTo(Z7227PrdNumct2, T00M82_A7227PrdNumct2[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNumct2");
               GXutil.writeLogRaw("Old: ",Z7227PrdNumct2);
               GXutil.writeLogRaw("Current: ",T00M82_A7227PrdNumct2[0]);
            }
            if ( Z7260PrdHorMad != T00M82_A7260PrdHorMad[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdHorMad");
               GXutil.writeLogRaw("Old: ",Z7260PrdHorMad);
               GXutil.writeLogRaw("Current: ",T00M82_A7260PrdHorMad[0]);
            }
            if ( DecimalUtil.compareTo(Z8659PrdExiAlmc, T00M82_A8659PrdExiAlmc[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdExiAlmc");
               GXutil.writeLogRaw("Old: ",Z8659PrdExiAlmc);
               GXutil.writeLogRaw("Current: ",T00M82_A8659PrdExiAlmc[0]);
            }
            if ( Z8896PrdPesCon != T00M82_A8896PrdPesCon[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPesCon");
               GXutil.writeLogRaw("Old: ",Z8896PrdPesCon);
               GXutil.writeLogRaw("Current: ",T00M82_A8896PrdPesCon[0]);
            }
            if ( GXutil.strcmp(Z8897PrdPesTerm, T00M82_A8897PrdPesTerm[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdPesTerm");
               GXutil.writeLogRaw("Old: ",Z8897PrdPesTerm);
               GXutil.writeLogRaw("Current: ",T00M82_A8897PrdPesTerm[0]);
            }
            if ( GXutil.strcmp(Z8936PrdSal, T00M82_A8936PrdSal[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdSal");
               GXutil.writeLogRaw("Old: ",Z8936PrdSal);
               GXutil.writeLogRaw("Current: ",T00M82_A8936PrdSal[0]);
            }
            if ( GXutil.strcmp(Z9731PrdInc, T00M82_A9731PrdInc[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdInc");
               GXutil.writeLogRaw("Old: ",Z9731PrdInc);
               GXutil.writeLogRaw("Current: ",T00M82_A9731PrdInc[0]);
            }
            if ( GXutil.strcmp(Z9732PrdComp, T00M82_A9732PrdComp[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdComp");
               GXutil.writeLogRaw("Old: ",Z9732PrdComp);
               GXutil.writeLogRaw("Current: ",T00M82_A9732PrdComp[0]);
            }
            if ( DecimalUtil.compareTo(Z9733PrdAox, T00M82_A9733PrdAox[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdAox");
               GXutil.writeLogRaw("Old: ",Z9733PrdAox);
               GXutil.writeLogRaw("Current: ",T00M82_A9733PrdAox[0]);
            }
            if ( GXutil.strcmp(Z9734PrdNCAS, T00M82_A9734PrdNCAS[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNCAS");
               GXutil.writeLogRaw("Old: ",Z9734PrdNCAS);
               GXutil.writeLogRaw("Current: ",T00M82_A9734PrdNCAS[0]);
            }
            if ( GXutil.strcmp(Z9739PrdFT, T00M82_A9739PrdFT[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFT");
               GXutil.writeLogRaw("Old: ",Z9739PrdFT);
               GXutil.writeLogRaw("Current: ",T00M82_A9739PrdFT[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9740PrdFFT), GXutil.resetTime(T00M82_A9740PrdFFT[0])) ) )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFFT");
               GXutil.writeLogRaw("Old: ",Z9740PrdFFT);
               GXutil.writeLogRaw("Current: ",T00M82_A9740PrdFFT[0]);
            }
            if ( GXutil.strcmp(Z9741PrdHS, T00M82_A9741PrdHS[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdHS");
               GXutil.writeLogRaw("Old: ",Z9741PrdHS);
               GXutil.writeLogRaw("Current: ",T00M82_A9741PrdHS[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z9742PrdFHS), GXutil.resetTime(T00M82_A9742PrdFHS[0])) ) )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFHS");
               GXutil.writeLogRaw("Old: ",Z9742PrdFHS);
               GXutil.writeLogRaw("Current: ",T00M82_A9742PrdFHS[0]);
            }
            if ( GXutil.strcmp(Z5887PrdReach, T00M82_A5887PrdReach[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdReach");
               GXutil.writeLogRaw("Old: ",Z5887PrdReach);
               GXutil.writeLogRaw("Current: ",T00M82_A5887PrdReach[0]);
            }
            if ( GXutil.strcmp(Z5888PrdOkotex, T00M82_A5888PrdOkotex[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdOkotex");
               GXutil.writeLogRaw("Old: ",Z5888PrdOkotex);
               GXutil.writeLogRaw("Current: ",T00M82_A5888PrdOkotex[0]);
            }
            if ( GXutil.strcmp(Z10119PrdColIdx, T00M82_A10119PrdColIdx[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdColIdx");
               GXutil.writeLogRaw("Old: ",Z10119PrdColIdx);
               GXutil.writeLogRaw("Current: ",T00M82_A10119PrdColIdx[0]);
            }
            if ( GXutil.strcmp(Z10881PrdLote, T00M82_A10881PrdLote[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdLote");
               GXutil.writeLogRaw("Old: ",Z10881PrdLote);
               GXutil.writeLogRaw("Current: ",T00M82_A10881PrdLote[0]);
            }
            if ( GXutil.strcmp(Z10935PrdRTM, T00M82_A10935PrdRTM[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdRTM");
               GXutil.writeLogRaw("Old: ",Z10935PrdRTM);
               GXutil.writeLogRaw("Current: ",T00M82_A10935PrdRTM[0]);
            }
            if ( GXutil.strcmp(Z10936PrdCtw1, T00M82_A10936PrdCtw1[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdCtw1");
               GXutil.writeLogRaw("Old: ",Z10936PrdCtw1);
               GXutil.writeLogRaw("Current: ",T00M82_A10936PrdCtw1[0]);
            }
            if ( GXutil.strcmp(Z10937PrdCtw2, T00M82_A10937PrdCtw2[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdCtw2");
               GXutil.writeLogRaw("Old: ",Z10937PrdCtw2);
               GXutil.writeLogRaw("Current: ",T00M82_A10937PrdCtw2[0]);
            }
            if ( GXutil.strcmp(Z10938PrdCtw3, T00M82_A10938PrdCtw3[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdCtw3");
               GXutil.writeLogRaw("Old: ",Z10938PrdCtw3);
               GXutil.writeLogRaw("Current: ",T00M82_A10938PrdCtw3[0]);
            }
            if ( GXutil.strcmp(Z11663PrdCtw4, T00M82_A11663PrdCtw4[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdCtw4");
               GXutil.writeLogRaw("Old: ",Z11663PrdCtw4);
               GXutil.writeLogRaw("Current: ",T00M82_A11663PrdCtw4[0]);
            }
            if ( GXutil.strcmp(Z11196PrdNroCAS, T00M82_A11196PrdNroCAS[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNroCAS");
               GXutil.writeLogRaw("Old: ",Z11196PrdNroCAS);
               GXutil.writeLogRaw("Current: ",T00M82_A11196PrdNroCAS[0]);
            }
            if ( GXutil.strcmp(Z11363PrdGots, T00M82_A11363PrdGots[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdGots");
               GXutil.writeLogRaw("Old: ",Z11363PrdGots);
               GXutil.writeLogRaw("Current: ",T00M82_A11363PrdGots[0]);
            }
            if ( GXutil.strcmp(Z11364PrdHm, T00M82_A11364PrdHm[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdHm");
               GXutil.writeLogRaw("Old: ",Z11364PrdHm);
               GXutil.writeLogRaw("Current: ",T00M82_A11364PrdHm[0]);
            }
            if ( Z11470PrdConct != T00M82_A11470PrdConct[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdConct");
               GXutil.writeLogRaw("Old: ",Z11470PrdConct);
               GXutil.writeLogRaw("Current: ",T00M82_A11470PrdConct[0]);
            }
            if ( GXutil.strcmp(Z11614PrdEINECS, T00M82_A11614PrdEINECS[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdEINECS");
               GXutil.writeLogRaw("Old: ",Z11614PrdEINECS);
               GXutil.writeLogRaw("Current: ",T00M82_A11614PrdEINECS[0]);
            }
            if ( GXutil.strcmp(Z11615PrdFuncion, T00M82_A11615PrdFuncion[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdFuncion");
               GXutil.writeLogRaw("Old: ",Z11615PrdFuncion);
               GXutil.writeLogRaw("Current: ",T00M82_A11615PrdFuncion[0]);
            }
            if ( GXutil.strcmp(Z11616PrdNmQu, T00M82_A11616PrdNmQu[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdNmQu");
               GXutil.writeLogRaw("Old: ",Z11616PrdNmQu);
               GXutil.writeLogRaw("Current: ",T00M82_A11616PrdNmQu[0]);
            }
            if ( GXutil.strcmp(Z11687PrdList, T00M82_A11687PrdList[0]) != 0 )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdList");
               GXutil.writeLogRaw("Old: ",Z11687PrdList);
               GXutil.writeLogRaw("Current: ",T00M82_A11687PrdList[0]);
            }
            if ( Z629MetCod != T00M82_A629MetCod[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"MetCod");
               GXutil.writeLogRaw("Old: ",Z629MetCod);
               GXutil.writeLogRaw("Current: ",T00M82_A629MetCod[0]);
            }
            if ( Z795PrvNum != T00M82_A795PrvNum[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrvNum");
               GXutil.writeLogRaw("Old: ",Z795PrvNum);
               GXutil.writeLogRaw("Current: ",T00M82_A795PrvNum[0]);
            }
            if ( Z835TipDtoCod != T00M82_A835TipDtoCod[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"TipDtoCod");
               GXutil.writeLogRaw("Old: ",Z835TipDtoCod);
               GXutil.writeLogRaw("Current: ",T00M82_A835TipDtoCod[0]);
            }
            if ( Z742PrdUniCom != T00M82_A742PrdUniCom[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdUniCom");
               GXutil.writeLogRaw("Old: ",Z742PrdUniCom);
               GXutil.writeLogRaw("Current: ",T00M82_A742PrdUniCom[0]);
            }
            if ( Z743PrdUniCon != T00M82_A743PrdUniCon[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"PrdUniCon");
               GXutil.writeLogRaw("Old: ",Z743PrdUniCon);
               GXutil.writeLogRaw("Current: ",T00M82_A743PrdUniCon[0]);
            }
            if ( Z856ValCod != T00M82_A856ValCod[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"ValCod");
               GXutil.writeLogRaw("Old: ",Z856ValCod);
               GXutil.writeLogRaw("Current: ",T00M82_A856ValCod[0]);
            }
            if ( Z6301TipPrdCod != T00M82_A6301TipPrdCod[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"TipPrdCod");
               GXutil.writeLogRaw("Old: ",Z6301TipPrdCod);
               GXutil.writeLogRaw("Current: ",T00M82_A6301TipPrdCod[0]);
            }
            if ( Z9609SubFamCod != T00M82_A9609SubFamCod[0] )
            {
               GXutil.writeLogln("tprdger:[seudo value changed for attri]"+"SubFamCod");
               GXutil.writeLogRaw("Old: ",Z9609SubFamCod);
               GXutil.writeLogRaw("Current: ",T00M82_A9609SubFamCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertM829( )
   {
      beforeValidateM829( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM829( ) ;
      }
      if ( AnyError == 0 )
      {
         zmM829( 0) ;
         checkOptimisticConcurrencyM829( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM829( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertM829( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M827 */
                  pr_default.execute(25, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A703PrdDscTec, A707PrdFacCon, A728PrdRefPrv, Boolean.valueOf(n734PrdSus), A734PrdSus, A727PrdRec, A682PrdCalNec, A698PrdDetPar, Byte.valueOf(A730PrdSit), A729PrdRotRea, A724PrdPreAct, A709PrdFecPre, A725PrdPreAnt, A726PrdPreMed, A696PrdConDia, Short.valueOf(A731PrdStkMinD), A732PrdStkMinU, Short.valueOf(A699PrdDiaRot), Short.valueOf(A722PrdPlaEnt), Short.valueOf(A716PrdLotMin), A721PrdNumUco, A704PrdExiAlm, A705PrdExiCC, A685PrdCanRes, A684PrdCanPen, A713PrdFulEnt, A714PrdFulPed, A712PrdFulCC, A706PrdExiCCP, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A739PrdUltDCC, A700PrdDifCC, Short.valueOf(A695PrdConCC), A750PrdValStk, A332DifValStk, A708PrdFecEnt, Short.valueOf(A1193PrdPosX), Byte.valueOf(A1194PrdPosY), A1643PrdTip, Short.valueOf(A1644PrdDqo), A3004PrdRev, Byte.valueOf(A3273PrdTnq), A4692PrdNom2, A4693PrdNum2, A4694PrdObs, Byte.valueOf(A4338PrdUMeFo), A5255PrdPreAc2, A5416PrdDensS, A5417PrdConcS, A5418PrdSalM, A5590PrdSolub, A6191PrdNumCent, A7226PrdNumct1, A7227PrdNumct2, Byte.valueOf(A7260PrdHorMad), A8659PrdExiAlmc, Byte.valueOf(A8896PrdPesCon), A8897PrdPesTerm, A8936PrdSal, A9731PrdInc, A9732PrdComp, A9733PrdAox, A9734PrdNCAS, A9739PrdFT, A9740PrdFFT, A9741PrdHS, A9742PrdFHS, A5887PrdReach, A5888PrdOkotex, A10119PrdColIdx, A10881PrdLote, A10935PrdRTM, A10936PrdCtw1, A10937PrdCtw2, A10938PrdCtw3, A11663PrdCtw4, A11196PrdNroCAS, A11363PrdGots, A11364PrdHm, Short.valueOf(A11470PrdConct), A11614PrdEINECS, A11615PrdFuncion, A11616PrdNmQu, A11687PrdList, A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod), Integer.valueOf(A795PrvNum), Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), Byte.valueOf(A742PrdUniCom), Byte.valueOf(A743PrdUniCon), Byte.valueOf(A856ValCod), Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod), Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(25) == 1) )
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
                        resetCaptionM80( ) ;
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
            loadM829( ) ;
         }
         endLevelM829( ) ;
      }
      closeExtendedTableCursorsM829( ) ;
   }

   public void updateM829( )
   {
      beforeValidateM829( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableM829( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM829( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmM829( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateM829( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00M828 */
                  pr_default.execute(26, new Object[] {A718PrdNom, A703PrdDscTec, A707PrdFacCon, A728PrdRefPrv, Boolean.valueOf(n734PrdSus), A734PrdSus, A727PrdRec, A682PrdCalNec, A698PrdDetPar, Byte.valueOf(A730PrdSit), A729PrdRotRea, A724PrdPreAct, A709PrdFecPre, A725PrdPreAnt, A726PrdPreMed, A696PrdConDia, Short.valueOf(A731PrdStkMinD), A732PrdStkMinU, Short.valueOf(A699PrdDiaRot), Short.valueOf(A722PrdPlaEnt), Short.valueOf(A716PrdLotMin), A721PrdNumUco, A704PrdExiAlm, A705PrdExiCC, A685PrdCanRes, A684PrdCanPen, A713PrdFulEnt, A714PrdFulPed, A712PrdFulCC, A706PrdExiCCP, A740PrdUltECC, Short.valueOf(A738PrdUltCCC), A739PrdUltDCC, A700PrdDifCC, Short.valueOf(A695PrdConCC), A750PrdValStk, A332DifValStk, A708PrdFecEnt, Short.valueOf(A1193PrdPosX), Byte.valueOf(A1194PrdPosY), A1643PrdTip, Short.valueOf(A1644PrdDqo), A3004PrdRev, Byte.valueOf(A3273PrdTnq), A4692PrdNom2, A4693PrdNum2, A4694PrdObs, Byte.valueOf(A4338PrdUMeFo), A5255PrdPreAc2, A5416PrdDensS, A5417PrdConcS, A5418PrdSalM, A5590PrdSolub, A6191PrdNumCent, A7226PrdNumct1, A7227PrdNumct2, Byte.valueOf(A7260PrdHorMad), A8659PrdExiAlmc, Byte.valueOf(A8896PrdPesCon), A8897PrdPesTerm, A8936PrdSal, A9731PrdInc, A9732PrdComp, A9733PrdAox, A9734PrdNCAS, A9739PrdFT, A9740PrdFFT, A9741PrdHS, A9742PrdFHS, A5887PrdReach, A5888PrdOkotex, A10119PrdColIdx, A10881PrdLote, A10935PrdRTM, A10936PrdCtw1, A10937PrdCtw2, A10938PrdCtw3, A11663PrdCtw4, A11196PrdNroCAS, A11363PrdGots, A11364PrdHm, Short.valueOf(A11470PrdConct), A11614PrdEINECS, A11615PrdFuncion, A11616PrdNmQu, A11687PrdList, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod), Integer.valueOf(A795PrvNum), Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod), Byte.valueOf(A742PrdUniCom), Byte.valueOf(A743PrdUniCon), Byte.valueOf(A856ValCod), Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod), Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod), A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(26) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateM829( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaptionM80( ) ;
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
         endLevelM829( ) ;
      }
      closeExtendedTableCursorsM829( ) ;
   }

   public void deferredUpdateM829( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateM829( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyM829( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsM829( ) ;
         afterConfirmM829( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteM829( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00M829 */
               pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound29 == 0 )
                     {
                        initAllM829( ) ;
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
                     resetCaptionM80( ) ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelM829( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsM829( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00M830 */
         pr_default.execute(28, new Object[] {A396EmprCod});
         A407EmprNom = T00M830_A407EmprNom[0] ;
         n407EmprNom = T00M830_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(28);
         /* Using cursor T00M831 */
         pr_default.execute(29, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
         A737PrdUcpDsc = T00M831_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = T00M831_n737PrdUcpDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
         pr_default.close(29);
         /* Using cursor T00M832 */
         pr_default.execute(30, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
         A736PrdUcoDsc = T00M832_A736PrdUcoDsc[0] ;
         n736PrdUcoDsc = T00M832_n736PrdUcoDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
         pr_default.close(30);
         /* Using cursor T00M833 */
         pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
         A794PrvNom = T00M833_A794PrvNom[0] ;
         n794PrvNom = T00M833_n794PrvNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
         pr_default.close(31);
         /* Using cursor T00M834 */
         pr_default.execute(32, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
         A857ValDsc = T00M834_A857ValDsc[0] ;
         n857ValDsc = T00M834_n857ValDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
         pr_default.close(32);
         /* Using cursor T00M835 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
         A837TipDtoDto = T00M835_A837TipDtoDto[0] ;
         n837TipDtoDto = T00M835_n837TipDtoDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
         pr_default.close(33);
         /* Using cursor T00M836 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
         A630MetDsc = T00M836_A630MetDsc[0] ;
         n630MetDsc = T00M836_n630MetDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
         pr_default.close(34);
         /* Using cursor T00M837 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod)});
         A6302TipPrdDsc = T00M837_A6302TipPrdDsc[0] ;
         n6302TipPrdDsc = T00M837_n6302TipPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6302TipPrdDsc", A6302TipPrdDsc);
         pr_default.close(35);
         /* Using cursor T00M838 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod)});
         A9610SubFamDsc = T00M838_A9610SubFamDsc[0] ;
         n9610SubFamDsc = T00M838_n9610SubFamDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9610SubFamDsc", A9610SubFamDsc);
         pr_default.close(36);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00M839 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00M840 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T00M841 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T00M842 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T00M843 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T00M844 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T00M845 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T00M846 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T00M847 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T00M848 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T00M849 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T00M850 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T00M851 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T00M852 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T00M853 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T00M854 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T00M855 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T00M856 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T00M857 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T00M858 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T00M859 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T00M860 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T00M861 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T00M862 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T00M863 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T00M864 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T00M865 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T00M866 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T00M867 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T00M868 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T00M869 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T00M870 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T00M871 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T00M872 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T00M873 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T00M874 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T00M875 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T00M876 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T00M877 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T00M878 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T00M879 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T00M880 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T00M881 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T00M882 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T00M883 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T00M884 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T00M885 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T00M886 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T00M887 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
         /* Using cursor T00M888 */
         pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(86) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(86);
         /* Using cursor T00M889 */
         pr_default.execute(87, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(87) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(87);
         /* Using cursor T00M890 */
         pr_default.execute(88, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(88) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(88);
         /* Using cursor T00M891 */
         pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(89) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(89);
         /* Using cursor T00M892 */
         pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(90) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(90);
         /* Using cursor T00M893 */
         pr_default.execute(91, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(91) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(91);
         /* Using cursor T00M894 */
         pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(92) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(92);
         /* Using cursor T00M895 */
         pr_default.execute(93, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(93) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(93);
         /* Using cursor T00M896 */
         pr_default.execute(94, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(94) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(94);
         /* Using cursor T00M897 */
         pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(95) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(95);
         /* Using cursor T00M898 */
         pr_default.execute(96, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(96) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(96);
         /* Using cursor T00M899 */
         pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(97) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(97);
         /* Using cursor T00M8100 */
         pr_default.execute(98, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(98) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(98);
         /* Using cursor T00M8101 */
         pr_default.execute(99, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(99) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(99);
         /* Using cursor T00M8102 */
         pr_default.execute(100, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(100) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(100);
         /* Using cursor T00M8103 */
         pr_default.execute(101, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(101) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(101);
         /* Using cursor T00M8104 */
         pr_default.execute(102, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(102) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(102);
         /* Using cursor T00M8105 */
         pr_default.execute(103, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(103) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(103);
         /* Using cursor T00M8106 */
         pr_default.execute(104, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(104) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(104);
         /* Using cursor T00M8107 */
         pr_default.execute(105, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(105) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(105);
         /* Using cursor T00M8108 */
         pr_default.execute(106, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(106) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(106);
         /* Using cursor T00M8109 */
         pr_default.execute(107, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(107) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(107);
         /* Using cursor T00M8110 */
         pr_default.execute(108, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(108) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(108);
         /* Using cursor T00M8111 */
         pr_default.execute(109, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(109) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(109);
      }
   }

   public void endLevelM829( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteM829( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tprdger");
         if ( AnyError == 0 )
         {
            confirmValuesM80( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tprdger");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartM829( )
   {
      /* Using cursor T00M8112 */
      pr_default.execute(110);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(110) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T00M8112_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T00M8112_A719PrdNum[0] ;
         n719PrdNum = T00M8112_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextM829( )
   {
      /* Scan next routine */
      pr_default.readNext(110);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(110) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A396EmprCod = T00M8112_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T00M8112_A719PrdNum[0] ;
         n719PrdNum = T00M8112_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEndM829( )
   {
      pr_default.close(110);
   }

   public void afterConfirmM829( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertM829( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateM829( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteM829( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteM829( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateM829( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesM829( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtPrdDscTec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDscTec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDscTec_Enabled), 5, 0), true);
      edtPrdUniCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCom_Enabled), 5, 0), true);
      edtPrdUcpDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUcpDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcpDsc_Enabled), 5, 0), true);
      edtPrdUniCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUniCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUniCon_Enabled), 5, 0), true);
      edtPrdUcoDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUcoDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcoDsc_Enabled), 5, 0), true);
      edtPrdFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Enabled), 5, 0), true);
      edtPrvNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Enabled), 5, 0), true);
      edtPrvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Enabled), 5, 0), true);
      edtPrdRefPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRefPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRefPrv_Enabled), 5, 0), true);
      edtEmpCodSus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmpCodSus_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmpCodSus_Enabled), 5, 0), true);
      edtPrdSus_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSus_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSus_Enabled), 5, 0), true);
      edtPrdSusNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSusNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSusNom_Enabled), 5, 0), true);
      edtValCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValCod_Enabled), 5, 0), true);
      edtValDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtValDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtValDsc_Enabled), 5, 0), true);
      edtPrdRec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRec_Enabled), 5, 0), true);
      edtPrdCalNec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCalNec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCalNec_Enabled), 5, 0), true);
      edtPrdDetPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDetPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDetPar_Enabled), 5, 0), true);
      edtPrdSit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSit_Enabled), 5, 0), true);
      edtPrdRotRea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRotRea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRotRea_Enabled), 5, 0), true);
      edtTipDtoCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoCod_Enabled), 5, 0), true);
      edtTipDtoDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipDtoDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipDtoDto_Enabled), 5, 0), true);
      edtPrdPreAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Enabled), 5, 0), true);
      edtPrdFecPre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFecPre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFecPre_Enabled), 5, 0), true);
      edtPrdPreAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAnt_Enabled), 5, 0), true);
      edtPrdPreMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreMed_Enabled), 5, 0), true);
      edtPrdConDia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdConDia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdConDia_Enabled), 5, 0), true);
      edtPrdStkMinD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdStkMinD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdStkMinD_Enabled), 5, 0), true);
      edtPrdStkMinU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdStkMinU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdStkMinU_Enabled), 5, 0), true);
      edtPrdDiaRot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDiaRot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDiaRot_Enabled), 5, 0), true);
      edtPrdPlaEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPlaEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPlaEnt_Enabled), 5, 0), true);
      edtMetCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetCod_Enabled), 5, 0), true);
      edtMetDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMetDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMetDsc_Enabled), 5, 0), true);
      edtPrdLotMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLotMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLotMin_Enabled), 5, 0), true);
      edtPrdNumUco_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumUco_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumUco_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdExiCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCC_Enabled), 5, 0), true);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), true);
      edtPrdCanPen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanPen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanPen_Enabled), 5, 0), true);
      edtPrdFulEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFulEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFulEnt_Enabled), 5, 0), true);
      edtPrdFulPed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFulPed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFulPed_Enabled), 5, 0), true);
      edtPrdFulCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFulCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFulCC_Enabled), 5, 0), true);
      edtPrdExiCCP_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiCCP_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiCCP_Enabled), 5, 0), true);
      edtPrdUltECC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltECC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltECC_Enabled), 5, 0), true);
      edtPrdUltCCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltCCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltCCC_Enabled), 5, 0), true);
      edtPrdUltDCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUltDCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUltDCC_Enabled), 5, 0), true);
      edtPrdDifCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDifCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDifCC_Enabled), 5, 0), true);
      edtPrdConCC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdConCC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdConCC_Enabled), 5, 0), true);
      edtPrdValStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdValStk_Enabled), 5, 0), true);
      edtDifValStk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDifValStk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDifValStk_Enabled), 5, 0), true);
      edtPrdFecEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFecEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFecEnt_Enabled), 5, 0), true);
      edtPrdPosX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPosX_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPosX_Enabled), 5, 0), true);
      edtPrdPosY_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPosY_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPosY_Enabled), 5, 0), true);
      edtPrdTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTip_Enabled), 5, 0), true);
      edtPrdDqo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDqo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDqo_Enabled), 5, 0), true);
      edtPrdRev_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRev_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRev_Enabled), 5, 0), true);
      edtPrdTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdTnq_Enabled), 5, 0), true);
      edtPrdNom2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom2_Enabled), 5, 0), true);
      edtPrdNum2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum2_Enabled), 5, 0), true);
      edtPrdObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdObs_Enabled), 5, 0), true);
      edtPrdUMeFo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdUMeFo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUMeFo_Enabled), 5, 0), true);
      edtPrdPreAc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPreAc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAc2_Enabled), 5, 0), true);
      edtPrdDensS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdDensS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDensS_Enabled), 5, 0), true);
      edtPrdConcS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdConcS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdConcS_Enabled), 5, 0), true);
      chkPrdSalM.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSalM.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdSalM.getEnabled(), 5, 0), true);
      edtPrdSolub_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdSolub_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdSolub_Enabled), 5, 0), true);
      edtTipPrdCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipPrdCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPrdCod_Enabled), 5, 0), true);
      edtTipPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipPrdDsc_Enabled), 5, 0), true);
      edtPrdNumCent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumCent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumCent_Enabled), 5, 0), true);
      edtPrdNumct1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumct1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumct1_Enabled), 5, 0), true);
      edtPrdNumct2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNumct2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNumct2_Enabled), 5, 0), true);
      edtPrdHorMad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHorMad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHorMad_Enabled), 5, 0), true);
      edtPrdExiAlmc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlmc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlmc_Enabled), 5, 0), true);
      chkPrdPesCon.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdPesCon.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdPesCon.getEnabled(), 5, 0), true);
      dynPrdPesTerm.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynPrdPesTerm.getInternalname(), "Enabled", GXutil.ltrimstr( dynPrdPesTerm.getEnabled(), 5, 0), true);
      chkPrdSal.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSal.getInternalname(), "Enabled", GXutil.ltrimstr( chkPrdSal.getEnabled(), 5, 0), true);
      edtSubFamCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSubFamCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSubFamCod_Enabled), 5, 0), true);
      edtSubFamDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSubFamDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSubFamDsc_Enabled), 5, 0), true);
      edtPrdInc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdInc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdInc_Enabled), 5, 0), true);
      edtPrdComp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdComp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdComp_Enabled), 5, 0), true);
      edtPrdAox_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdAox_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdAox_Enabled), 5, 0), true);
      edtPrdNCAS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNCAS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNCAS_Enabled), 5, 0), true);
      edtPrdFT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFT_Enabled), 5, 0), true);
      edtPrdFFT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFFT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFFT_Enabled), 5, 0), true);
      edtPrdHS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHS_Enabled), 5, 0), true);
      edtPrdFHS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFHS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFHS_Enabled), 5, 0), true);
      edtPrdReach_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdReach_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdReach_Enabled), 5, 0), true);
      cmbPrdOkotex.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrdOkotex.getEnabled(), 5, 0), true);
      edtPrdColIdx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdColIdx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdColIdx_Enabled), 5, 0), true);
      edtPrdLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLote_Enabled), 5, 0), true);
      edtPrdRTM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRTM_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRTM_Enabled), 5, 0), true);
      edtPrdCtw1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw1_Enabled), 5, 0), true);
      edtPrdCtw2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw2_Enabled), 5, 0), true);
      edtPrdCtw3_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw3_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw3_Enabled), 5, 0), true);
      edtPrdCtw4_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCtw4_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCtw4_Enabled), 5, 0), true);
      edtPrdNroCAS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNroCAS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNroCAS_Enabled), 5, 0), true);
      edtPrdGots_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdGots_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdGots_Enabled), 5, 0), true);
      edtPrdHm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdHm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdHm_Enabled), 5, 0), true);
      edtPrdConct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdConct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdConct_Enabled), 5, 0), true);
      edtPrdEINECS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdEINECS_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdEINECS_Enabled), 5, 0), true);
      edtPrdFuncion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFuncion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFuncion_Enabled), 5, 0), true);
      edtPrdNmQu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNmQu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNmQu_Enabled), 5, 0), true);
      cmbPrdList.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Enabled", GXutil.ltrimstr( cmbPrdList.getEnabled(), 5, 0), true);
   }

   public void send_integrity_lvl_hashesM829( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesM80( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tprdger", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z703PrdDscTec", GXutil.rtrim( Z703PrdDscTec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z728PrdRefPrv", GXutil.rtrim( Z728PrdRefPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z734PrdSus", GXutil.rtrim( Z734PrdSus));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z682PrdCalNec", GXutil.rtrim( Z682PrdCalNec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z730PrdSit", GXutil.ltrim( localUtil.ntoc( Z730PrdSit, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.dtoc( Z709PrdFecPre, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z696PrdConDia", GXutil.ltrim( localUtil.ntoc( Z696PrdConDia, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z731PrdStkMinD", GXutil.ltrim( localUtil.ntoc( Z731PrdStkMinD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z732PrdStkMinU", GXutil.ltrim( localUtil.ntoc( Z732PrdStkMinU, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z699PrdDiaRot", GXutil.ltrim( localUtil.ntoc( Z699PrdDiaRot, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z722PrdPlaEnt", GXutil.ltrim( localUtil.ntoc( Z722PrdPlaEnt, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z716PrdLotMin", GXutil.ltrim( localUtil.ntoc( Z716PrdLotMin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z721PrdNumUco", GXutil.ltrim( localUtil.ntoc( Z721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z685PrdCanRes", GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.dtoc( Z713PrdFulEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z714PrdFulPed", localUtil.dtoc( Z714PrdFulPed, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z712PrdFulCC", localUtil.dtoc( Z712PrdFulCC, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z740PrdUltECC", GXutil.ltrim( localUtil.ntoc( Z740PrdUltECC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( Z738PrdUltCCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( Z739PrdUltDCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z700PrdDifCC", GXutil.ltrim( localUtil.ntoc( Z700PrdDifCC, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z695PrdConCC", GXutil.ltrim( localUtil.ntoc( Z695PrdConCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z750PrdValStk", GXutil.ltrim( localUtil.ntoc( Z750PrdValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z332DifValStk", GXutil.ltrim( localUtil.ntoc( Z332DifValStk, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z708PrdFecEnt", localUtil.dtoc( Z708PrdFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1193PrdPosX", GXutil.ltrim( localUtil.ntoc( Z1193PrdPosX, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1194PrdPosY", GXutil.ltrim( localUtil.ntoc( Z1194PrdPosY, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1643PrdTip", GXutil.rtrim( Z1643PrdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1644PrdDqo", GXutil.ltrim( localUtil.ntoc( Z1644PrdDqo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3004PrdRev", GXutil.rtrim( Z3004PrdRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3273PrdTnq", GXutil.ltrim( localUtil.ntoc( Z3273PrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4692PrdNom2", GXutil.rtrim( Z4692PrdNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4693PrdNum2", GXutil.rtrim( Z4693PrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4694PrdObs", Z4694PrdObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( Z4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( Z5255PrdPreAc2, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5416PrdDensS", GXutil.ltrim( localUtil.ntoc( Z5416PrdDensS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5417PrdConcS", GXutil.ltrim( localUtil.ntoc( Z5417PrdConcS, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5418PrdSalM", GXutil.rtrim( Z5418PrdSalM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5590PrdSolub", GXutil.ltrim( localUtil.ntoc( Z5590PrdSolub, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6191PrdNumCent", GXutil.rtrim( Z6191PrdNumCent));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7226PrdNumct1", GXutil.ltrim( localUtil.ntoc( Z7226PrdNumct1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7227PrdNumct2", GXutil.ltrim( localUtil.ntoc( Z7227PrdNumct2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7260PrdHorMad", GXutil.ltrim( localUtil.ntoc( Z7260PrdHorMad, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( Z8659PrdExiAlmc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8896PrdPesCon", GXutil.ltrim( localUtil.ntoc( Z8896PrdPesCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8897PrdPesTerm", GXutil.rtrim( Z8897PrdPesTerm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8936PrdSal", GXutil.rtrim( Z8936PrdSal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9731PrdInc", GXutil.rtrim( Z9731PrdInc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9732PrdComp", GXutil.rtrim( Z9732PrdComp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9733PrdAox", GXutil.ltrim( localUtil.ntoc( Z9733PrdAox, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9734PrdNCAS", GXutil.rtrim( Z9734PrdNCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9739PrdFT", GXutil.rtrim( Z9739PrdFT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9740PrdFFT", localUtil.dtoc( Z9740PrdFFT, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9741PrdHS", GXutil.rtrim( Z9741PrdHS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9742PrdFHS", localUtil.dtoc( Z9742PrdFHS, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5887PrdReach", GXutil.rtrim( Z5887PrdReach));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5888PrdOkotex", GXutil.rtrim( Z5888PrdOkotex));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10119PrdColIdx", GXutil.rtrim( Z10119PrdColIdx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10881PrdLote", GXutil.rtrim( Z10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10935PrdRTM", GXutil.rtrim( Z10935PrdRTM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10936PrdCtw1", GXutil.rtrim( Z10936PrdCtw1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10937PrdCtw2", GXutil.rtrim( Z10937PrdCtw2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10938PrdCtw3", GXutil.rtrim( Z10938PrdCtw3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11663PrdCtw4", GXutil.rtrim( Z11663PrdCtw4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11196PrdNroCAS", GXutil.rtrim( Z11196PrdNroCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11363PrdGots", GXutil.rtrim( Z11363PrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11364PrdHm", GXutil.rtrim( Z11364PrdHm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11470PrdConct", GXutil.ltrim( localUtil.ntoc( Z11470PrdConct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11614PrdEINECS", GXutil.rtrim( Z11614PrdEINECS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11615PrdFuncion", GXutil.rtrim( Z11615PrdFuncion));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11616PrdNmQu", Z11616PrdNmQu);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11687PrdList", GXutil.rtrim( Z11687PrdList));
      app.GxWebStd.gx_hidden_field( httpContext, "Z629MetCod", GXutil.ltrim( localUtil.ntoc( Z629MetCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z835TipDtoCod", GXutil.ltrim( localUtil.ntoc( Z835TipDtoCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z742PrdUniCom", GXutil.ltrim( localUtil.ntoc( Z742PrdUniCom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z743PrdUniCon", GXutil.ltrim( localUtil.ntoc( Z743PrdUniCon, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6301TipPrdCod", GXutil.ltrim( localUtil.ntoc( Z6301TipPrdCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9609SubFamCod", GXutil.ltrim( localUtil.ntoc( Z9609SubFamCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tprdger", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TPRDGER" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MANTENIMIENTO PRODUCTOS", "") ;
   }

   public void initializeNonKeyM829( )
   {
      A394EmpCodSus = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A394EmpCodSus", A394EmpCodSus);
      A735PrdSusNom = "" ;
      n735PrdSusNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A735PrdSusNom", A735PrdSusNom);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A703PrdDscTec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", A703PrdDscTec);
      A742PrdUniCom = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.str( A742PrdUniCom, 1, 0));
      A737PrdUcpDsc = "" ;
      n737PrdUcpDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", A737PrdUcpDsc);
      A743PrdUniCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.str( A743PrdUniCon, 1, 0));
      A736PrdUcoDsc = "" ;
      n736PrdUcoDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", A736PrdUcoDsc);
      A707PrdFacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A795PrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A794PrvNom = "" ;
      n794PrvNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", A794PrvNom);
      A728PrdRefPrv = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", A728PrdRefPrv);
      A734PrdSus = "" ;
      n734PrdSus = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", A734PrdSus);
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A857ValDsc = "" ;
      n857ValDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", A857ValDsc);
      A727PrdRec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", A727PrdRec);
      A682PrdCalNec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", A682PrdCalNec);
      A698PrdDetPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", A698PrdDetPar);
      A730PrdSit = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.str( A730PrdSit, 1, 0));
      A729PrdRotRea = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrimstr( A729PrdRotRea, 12, 5));
      A835TipDtoCod = (byte)(0) ;
      n835TipDtoCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A835TipDtoCod), 2, 0));
      A837TipDtoDto = DecimalUtil.ZERO ;
      n837TipDtoDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrimstr( A837TipDtoDto, 5, 2));
      A724PrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrimstr( A724PrdPreAct, 14, 5));
      A709PrdFecPre = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      A725PrdPreAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrimstr( A725PrdPreAnt, 14, 5));
      A726PrdPreMed = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrimstr( A726PrdPreMed, 14, 5));
      A696PrdConDia = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrimstr( A696PrdConDia, 7, 2));
      A731PrdStkMinD = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrimstr( DecimalUtil.doubleToDec(A731PrdStkMinD), 4, 0));
      A732PrdStkMinU = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrimstr( A732PrdStkMinU, 8, 2));
      A699PrdDiaRot = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A699PrdDiaRot), 3, 0));
      A722PrdPlaEnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A722PrdPlaEnt), 3, 0));
      A629MetCod = (byte)(0) ;
      n629MetCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.str( A629MetCod, 1, 0));
      A630MetDsc = "" ;
      n630MetDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", A630MetDsc);
      A716PrdLotMin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A716PrdLotMin), 4, 0));
      A721PrdNumUco = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrimstr( A721PrdNumUco, 7, 2));
      A704PrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A705PrdExiCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A685PrdCanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A684PrdCanPen = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrimstr( A684PrdCanPen, 12, 4));
      A713PrdFulEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      A714PrdFulPed = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
      A712PrdFulCC = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
      A706PrdExiCCP = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
      A740PrdUltECC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrimstr( A740PrdUltECC, 8, 2));
      A738PrdUltCCC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A738PrdUltCCC), 4, 0));
      A739PrdUltDCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrimstr( A739PrdUltDCC, 8, 2));
      A700PrdDifCC = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrimstr( A700PrdDifCC, 8, 2));
      A695PrdConCC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A695PrdConCC), 4, 0));
      A750PrdValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrimstr( A750PrdValStk, 11, 2));
      A332DifValStk = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrimstr( A332DifValStk, 11, 2));
      A708PrdFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
      A1193PrdPosX = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1193PrdPosX), 4, 0));
      A1194PrdPosY = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1194PrdPosY), 2, 0));
      A1643PrdTip = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", A1643PrdTip);
      A1644PrdDqo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1644PrdDqo), 4, 0));
      A3004PrdRev = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", A3004PrdRev);
      A3273PrdTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3273PrdTnq), 2, 0));
      A4692PrdNom2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4692PrdNom2", A4692PrdNom2);
      A4693PrdNum2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4693PrdNum2", A4693PrdNum2);
      A4694PrdObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4694PrdObs", A4694PrdObs);
      A4338PrdUMeFo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.str( A4338PrdUMeFo, 1, 0));
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrimstr( A5255PrdPreAc2, 14, 5));
      A5416PrdDensS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5416PrdDensS", GXutil.ltrimstr( A5416PrdDensS, 7, 3));
      A5417PrdConcS = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5417PrdConcS", GXutil.ltrimstr( A5417PrdConcS, 7, 3));
      A5418PrdSalM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
      A5590PrdSolub = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrimstr( A5590PrdSolub, 7, 2));
      A6301TipPrdCod = (short)(0) ;
      n6301TipPrdCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6301TipPrdCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6301TipPrdCod), 4, 0));
      A6302TipPrdDsc = "" ;
      n6302TipPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6302TipPrdDsc", A6302TipPrdDsc);
      A6191PrdNumCent = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", A6191PrdNumCent);
      A7226PrdNumct1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7226PrdNumct1", GXutil.ltrimstr( A7226PrdNumct1, 6, 2));
      A7227PrdNumct2 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A7227PrdNumct2", GXutil.ltrimstr( A7227PrdNumct2, 6, 2));
      A7260PrdHorMad = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7260PrdHorMad), 2, 0));
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrimstr( A8659PrdExiAlmc, 12, 4));
      A8896PrdPesCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
      A8897PrdPesTerm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
      A8936PrdSal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8936PrdSal", A8936PrdSal);
      A9609SubFamCod = (byte)(0) ;
      n9609SubFamCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9609SubFamCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9609SubFamCod), 2, 0));
      A9610SubFamDsc = "" ;
      n9610SubFamDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9610SubFamDsc", A9610SubFamDsc);
      A9731PrdInc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9731PrdInc", A9731PrdInc);
      A9732PrdComp = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9732PrdComp", A9732PrdComp);
      A9733PrdAox = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9733PrdAox", GXutil.ltrimstr( A9733PrdAox, 6, 2));
      A9734PrdNCAS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", A9734PrdNCAS);
      A9739PrdFT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9739PrdFT", A9739PrdFT);
      A9740PrdFFT = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
      A9741PrdHS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9741PrdHS", A9741PrdHS);
      A9742PrdFHS = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
      A5887PrdReach = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5887PrdReach", A5887PrdReach);
      A5888PrdOkotex = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5888PrdOkotex", A5888PrdOkotex);
      A10119PrdColIdx = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10119PrdColIdx", A10119PrdColIdx);
      A10881PrdLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      A10935PrdRTM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10935PrdRTM", A10935PrdRTM);
      A10936PrdCtw1 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", A10936PrdCtw1);
      A10937PrdCtw2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", A10937PrdCtw2);
      A10938PrdCtw3 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", A10938PrdCtw3);
      A11663PrdCtw4 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", A11663PrdCtw4);
      A11196PrdNroCAS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11196PrdNroCAS", A11196PrdNroCAS);
      A11363PrdGots = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", A11363PrdGots);
      A11364PrdHm = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11364PrdHm", A11364PrdHm);
      A11470PrdConct = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11470PrdConct", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11470PrdConct), 3, 0));
      A11614PrdEINECS = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11614PrdEINECS", A11614PrdEINECS);
      A11615PrdFuncion = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11615PrdFuncion", A11615PrdFuncion);
      A11616PrdNmQu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11616PrdNmQu", A11616PrdNmQu);
      A11687PrdList = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11687PrdList", A11687PrdList);
      Z718PrdNom = "" ;
      Z703PrdDscTec = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z728PrdRefPrv = "" ;
      Z734PrdSus = "" ;
      Z727PrdRec = "" ;
      Z682PrdCalNec = "" ;
      Z698PrdDetPar = "" ;
      Z730PrdSit = (byte)(0) ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z696PrdConDia = DecimalUtil.ZERO ;
      Z731PrdStkMinD = (short)(0) ;
      Z732PrdStkMinU = DecimalUtil.ZERO ;
      Z699PrdDiaRot = (short)(0) ;
      Z722PrdPlaEnt = (short)(0) ;
      Z716PrdLotMin = (short)(0) ;
      Z721PrdNumUco = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z714PrdFulPed = GXutil.nullDate() ;
      Z712PrdFulCC = GXutil.nullDate() ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z740PrdUltECC = DecimalUtil.ZERO ;
      Z738PrdUltCCC = (short)(0) ;
      Z739PrdUltDCC = DecimalUtil.ZERO ;
      Z700PrdDifCC = DecimalUtil.ZERO ;
      Z695PrdConCC = (short)(0) ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z332DifValStk = DecimalUtil.ZERO ;
      Z708PrdFecEnt = GXutil.nullDate() ;
      Z1193PrdPosX = (short)(0) ;
      Z1194PrdPosY = (byte)(0) ;
      Z1643PrdTip = "" ;
      Z1644PrdDqo = (short)(0) ;
      Z3004PrdRev = "" ;
      Z3273PrdTnq = (byte)(0) ;
      Z4692PrdNom2 = "" ;
      Z4693PrdNum2 = "" ;
      Z4694PrdObs = "" ;
      Z4338PrdUMeFo = (byte)(0) ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z5416PrdDensS = DecimalUtil.ZERO ;
      Z5417PrdConcS = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      Z5590PrdSolub = DecimalUtil.ZERO ;
      Z6191PrdNumCent = "" ;
      Z7226PrdNumct1 = DecimalUtil.ZERO ;
      Z7227PrdNumct2 = DecimalUtil.ZERO ;
      Z7260PrdHorMad = (byte)(0) ;
      Z8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z8896PrdPesCon = (byte)(0) ;
      Z8897PrdPesTerm = "" ;
      Z8936PrdSal = "" ;
      Z9731PrdInc = "" ;
      Z9732PrdComp = "" ;
      Z9733PrdAox = DecimalUtil.ZERO ;
      Z9734PrdNCAS = "" ;
      Z9739PrdFT = "" ;
      Z9740PrdFFT = GXutil.nullDate() ;
      Z9741PrdHS = "" ;
      Z9742PrdFHS = GXutil.nullDate() ;
      Z5887PrdReach = "" ;
      Z5888PrdOkotex = "" ;
      Z10119PrdColIdx = "" ;
      Z10881PrdLote = "" ;
      Z10935PrdRTM = "" ;
      Z10936PrdCtw1 = "" ;
      Z10937PrdCtw2 = "" ;
      Z10938PrdCtw3 = "" ;
      Z11663PrdCtw4 = "" ;
      Z11196PrdNroCAS = "" ;
      Z11363PrdGots = "" ;
      Z11364PrdHm = "" ;
      Z11470PrdConct = (short)(0) ;
      Z11614PrdEINECS = "" ;
      Z11615PrdFuncion = "" ;
      Z11616PrdNmQu = "" ;
      Z11687PrdList = "" ;
      Z629MetCod = (byte)(0) ;
      Z795PrvNum = 0 ;
      Z835TipDtoCod = (byte)(0) ;
      Z742PrdUniCom = (byte)(0) ;
      Z743PrdUniCon = (byte)(0) ;
      Z856ValCod = (byte)(0) ;
      Z6301TipPrdCod = (short)(0) ;
      Z9609SubFamCod = (byte)(0) ;
   }

   public void initAllM829( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKeyM829( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241524231", true, true);
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
      httpContext.AddJavascriptSource("tprdger.js", "?20268241524231", false, true);
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
      edtPrdNum_Internalname = "PRDNUM" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtPrdDscTec_Internalname = "PRDDSCTEC" ;
      edtPrdUniCom_Internalname = "PRDUNICOM" ;
      edtPrdUcpDsc_Internalname = "PRDUCPDSC" ;
      edtPrdUniCon_Internalname = "PRDUNICON" ;
      edtPrdUcoDsc_Internalname = "PRDUCODSC" ;
      edtPrdFacCon_Internalname = "PRDFACCON" ;
      edtPrvNum_Internalname = "PRVNUM" ;
      edtPrvNom_Internalname = "PRVNOM" ;
      edtPrdRefPrv_Internalname = "PRDREFPRV" ;
      edtEmpCodSus_Internalname = "EMPCODSUS" ;
      edtPrdSus_Internalname = "PRDSUS" ;
      edtPrdSusNom_Internalname = "PRDSUSNOM" ;
      edtValCod_Internalname = "VALCOD" ;
      edtValDsc_Internalname = "VALDSC" ;
      edtPrdRec_Internalname = "PRDREC" ;
      edtPrdCalNec_Internalname = "PRDCALNEC" ;
      edtPrdDetPar_Internalname = "PRDDETPAR" ;
      edtPrdSit_Internalname = "PRDSIT" ;
      edtPrdRotRea_Internalname = "PRDROTREA" ;
      edtTipDtoCod_Internalname = "TIPDTOCOD" ;
      edtTipDtoDto_Internalname = "TIPDTODTO" ;
      edtPrdPreAct_Internalname = "PRDPREACT" ;
      edtPrdFecPre_Internalname = "PRDFECPRE" ;
      edtPrdPreAnt_Internalname = "PRDPREANT" ;
      edtPrdPreMed_Internalname = "PRDPREMED" ;
      edtPrdConDia_Internalname = "PRDCONDIA" ;
      edtPrdStkMinD_Internalname = "PRDSTKMIND" ;
      edtPrdStkMinU_Internalname = "PRDSTKMINU" ;
      edtPrdDiaRot_Internalname = "PRDDIAROT" ;
      edtPrdPlaEnt_Internalname = "PRDPLAENT" ;
      edtMetCod_Internalname = "METCOD" ;
      edtMetDsc_Internalname = "METDSC" ;
      edtPrdLotMin_Internalname = "PRDLOTMIN" ;
      edtPrdNumUco_Internalname = "PRDNUMUCO" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdExiCC_Internalname = "PRDEXICC" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtPrdCanPen_Internalname = "PRDCANPEN" ;
      edtPrdFulEnt_Internalname = "PRDFULENT" ;
      edtPrdFulPed_Internalname = "PRDFULPED" ;
      edtPrdFulCC_Internalname = "PRDFULCC" ;
      edtPrdExiCCP_Internalname = "PRDEXICCP" ;
      edtPrdUltECC_Internalname = "PRDULTECC" ;
      edtPrdUltCCC_Internalname = "PRDULTCCC" ;
      edtPrdUltDCC_Internalname = "PRDULTDCC" ;
      edtPrdDifCC_Internalname = "PRDDIFCC" ;
      edtPrdConCC_Internalname = "PRDCONCC" ;
      edtPrdValStk_Internalname = "PRDVALSTK" ;
      edtDifValStk_Internalname = "DIFVALSTK" ;
      edtPrdFecEnt_Internalname = "PRDFECENT" ;
      edtPrdPosX_Internalname = "PRDPOSX" ;
      edtPrdPosY_Internalname = "PRDPOSY" ;
      edtPrdTip_Internalname = "PRDTIP" ;
      edtPrdDqo_Internalname = "PRDDQO" ;
      edtPrdRev_Internalname = "PRDREV" ;
      edtPrdTnq_Internalname = "PRDTNQ" ;
      edtPrdNom2_Internalname = "PRDNOM2" ;
      edtPrdNum2_Internalname = "PRDNUM2" ;
      edtPrdObs_Internalname = "PRDOBS" ;
      edtPrdUMeFo_Internalname = "PRDUMEFO" ;
      edtPrdPreAc2_Internalname = "PRDPREAC2" ;
      edtPrdDensS_Internalname = "PRDDENSS" ;
      edtPrdConcS_Internalname = "PRDCONCS" ;
      chkPrdSalM.setInternalname( "PRDSALM" );
      edtPrdSolub_Internalname = "PRDSOLUB" ;
      edtTipPrdCod_Internalname = "TIPPRDCOD" ;
      edtTipPrdDsc_Internalname = "TIPPRDDSC" ;
      edtPrdNumCent_Internalname = "PRDNUMCENT" ;
      edtPrdNumct1_Internalname = "PRDNUMCT1" ;
      edtPrdNumct2_Internalname = "PRDNUMCT2" ;
      edtPrdHorMad_Internalname = "PRDHORMAD" ;
      edtPrdExiAlmc_Internalname = "PRDEXIALMC" ;
      chkPrdPesCon.setInternalname( "PRDPESCON" );
      dynPrdPesTerm.setInternalname( "PRDPESTERM" );
      chkPrdSal.setInternalname( "PRDSAL" );
      edtSubFamCod_Internalname = "SUBFAMCOD" ;
      edtSubFamDsc_Internalname = "SUBFAMDSC" ;
      edtPrdInc_Internalname = "PRDINC" ;
      edtPrdComp_Internalname = "PRDCOMP" ;
      edtPrdAox_Internalname = "PRDAOX" ;
      edtPrdNCAS_Internalname = "PRDNCAS" ;
      edtPrdFT_Internalname = "PRDFT" ;
      edtPrdFFT_Internalname = "PRDFFT" ;
      edtPrdHS_Internalname = "PRDHS" ;
      edtPrdFHS_Internalname = "PRDFHS" ;
      edtPrdReach_Internalname = "PRDREACH" ;
      cmbPrdOkotex.setInternalname( "PRDOKOTEX" );
      edtPrdColIdx_Internalname = "PRDCOLIDX" ;
      edtPrdLote_Internalname = "PRDLOTE" ;
      edtPrdRTM_Internalname = "PRDRTM" ;
      edtPrdCtw1_Internalname = "PRDCTW1" ;
      edtPrdCtw2_Internalname = "PRDCTW2" ;
      edtPrdCtw3_Internalname = "PRDCTW3" ;
      edtPrdCtw4_Internalname = "PRDCTW4" ;
      edtPrdNroCAS_Internalname = "PRDNROCAS" ;
      edtPrdGots_Internalname = "PRDGOTS" ;
      edtPrdHm_Internalname = "PRDHM" ;
      edtPrdConct_Internalname = "PRDCONCT" ;
      edtPrdEINECS_Internalname = "PRDEINECS" ;
      edtPrdFuncion_Internalname = "PRDFUNCION" ;
      edtPrdNmQu_Internalname = "PRDNMQU" ;
      cmbPrdList.setInternalname( "PRDLIST" );
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
      Form.setCaption( httpContext.getMessage( "MANTENIMIENTO PRODUCTOS", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      cmbPrdList.setJsonclick( "" );
      cmbPrdList.setEnabled( 1 );
      edtPrdNmQu_Enabled = 1 ;
      edtPrdFuncion_Jsonclick = "" ;
      edtPrdFuncion_Enabled = 1 ;
      edtPrdEINECS_Jsonclick = "" ;
      edtPrdEINECS_Enabled = 1 ;
      edtPrdConct_Jsonclick = "" ;
      edtPrdConct_Enabled = 1 ;
      edtPrdHm_Jsonclick = "" ;
      edtPrdHm_Enabled = 1 ;
      edtPrdGots_Jsonclick = "" ;
      edtPrdGots_Enabled = 1 ;
      edtPrdNroCAS_Jsonclick = "" ;
      edtPrdNroCAS_Enabled = 1 ;
      edtPrdCtw4_Jsonclick = "" ;
      edtPrdCtw4_Enabled = 1 ;
      edtPrdCtw3_Jsonclick = "" ;
      edtPrdCtw3_Enabled = 1 ;
      edtPrdCtw2_Jsonclick = "" ;
      edtPrdCtw2_Enabled = 1 ;
      edtPrdCtw1_Jsonclick = "" ;
      edtPrdCtw1_Enabled = 1 ;
      edtPrdRTM_Jsonclick = "" ;
      edtPrdRTM_Enabled = 1 ;
      edtPrdLote_Jsonclick = "" ;
      edtPrdLote_Enabled = 1 ;
      edtPrdColIdx_Jsonclick = "" ;
      edtPrdColIdx_Enabled = 1 ;
      cmbPrdOkotex.setJsonclick( "" );
      cmbPrdOkotex.setEnabled( 1 );
      edtPrdReach_Jsonclick = "" ;
      edtPrdReach_Enabled = 1 ;
      edtPrdFHS_Jsonclick = "" ;
      edtPrdFHS_Enabled = 1 ;
      edtPrdHS_Jsonclick = "" ;
      edtPrdHS_Enabled = 1 ;
      edtPrdFFT_Jsonclick = "" ;
      edtPrdFFT_Enabled = 1 ;
      edtPrdFT_Jsonclick = "" ;
      edtPrdFT_Enabled = 1 ;
      edtPrdNCAS_Jsonclick = "" ;
      edtPrdNCAS_Enabled = 1 ;
      edtPrdAox_Jsonclick = "" ;
      edtPrdAox_Enabled = 1 ;
      edtPrdComp_Jsonclick = "" ;
      edtPrdComp_Enabled = 1 ;
      edtPrdInc_Jsonclick = "" ;
      edtPrdInc_Enabled = 1 ;
      edtSubFamDsc_Jsonclick = "" ;
      edtSubFamDsc_Enabled = 0 ;
      edtSubFamCod_Jsonclick = "" ;
      edtSubFamCod_Enabled = 1 ;
      chkPrdSal.setEnabled( 1 );
      dynPrdPesTerm.setJsonclick( "" );
      dynPrdPesTerm.setEnabled( 1 );
      chkPrdPesCon.setEnabled( 1 );
      edtPrdExiAlmc_Jsonclick = "" ;
      edtPrdExiAlmc_Enabled = 1 ;
      edtPrdHorMad_Jsonclick = "" ;
      edtPrdHorMad_Enabled = 1 ;
      edtPrdNumct2_Jsonclick = "" ;
      edtPrdNumct2_Enabled = 1 ;
      edtPrdNumct1_Jsonclick = "" ;
      edtPrdNumct1_Enabled = 1 ;
      edtPrdNumCent_Jsonclick = "" ;
      edtPrdNumCent_Enabled = 1 ;
      edtTipPrdDsc_Jsonclick = "" ;
      edtTipPrdDsc_Enabled = 0 ;
      edtTipPrdCod_Jsonclick = "" ;
      edtTipPrdCod_Enabled = 1 ;
      edtPrdSolub_Jsonclick = "" ;
      edtPrdSolub_Enabled = 1 ;
      chkPrdSalM.setEnabled( 1 );
      edtPrdConcS_Jsonclick = "" ;
      edtPrdConcS_Enabled = 1 ;
      edtPrdDensS_Jsonclick = "" ;
      edtPrdDensS_Enabled = 1 ;
      edtPrdPreAc2_Jsonclick = "" ;
      edtPrdPreAc2_Enabled = 1 ;
      edtPrdUMeFo_Jsonclick = "" ;
      edtPrdUMeFo_Enabled = 1 ;
      edtPrdObs_Enabled = 1 ;
      edtPrdNum2_Jsonclick = "" ;
      edtPrdNum2_Enabled = 1 ;
      edtPrdNom2_Jsonclick = "" ;
      edtPrdNom2_Enabled = 1 ;
      edtPrdTnq_Jsonclick = "" ;
      edtPrdTnq_Enabled = 1 ;
      edtPrdRev_Jsonclick = "" ;
      edtPrdRev_Enabled = 1 ;
      edtPrdDqo_Jsonclick = "" ;
      edtPrdDqo_Enabled = 1 ;
      edtPrdTip_Jsonclick = "" ;
      edtPrdTip_Enabled = 1 ;
      edtPrdPosY_Jsonclick = "" ;
      edtPrdPosY_Enabled = 1 ;
      edtPrdPosX_Jsonclick = "" ;
      edtPrdPosX_Enabled = 1 ;
      edtPrdFecEnt_Jsonclick = "" ;
      edtPrdFecEnt_Enabled = 1 ;
      edtDifValStk_Jsonclick = "" ;
      edtDifValStk_Enabled = 1 ;
      edtPrdValStk_Jsonclick = "" ;
      edtPrdValStk_Enabled = 1 ;
      edtPrdConCC_Jsonclick = "" ;
      edtPrdConCC_Enabled = 1 ;
      edtPrdDifCC_Jsonclick = "" ;
      edtPrdDifCC_Enabled = 1 ;
      edtPrdUltDCC_Jsonclick = "" ;
      edtPrdUltDCC_Enabled = 1 ;
      edtPrdUltCCC_Jsonclick = "" ;
      edtPrdUltCCC_Enabled = 1 ;
      edtPrdUltECC_Jsonclick = "" ;
      edtPrdUltECC_Enabled = 1 ;
      edtPrdExiCCP_Jsonclick = "" ;
      edtPrdExiCCP_Enabled = 1 ;
      edtPrdFulCC_Jsonclick = "" ;
      edtPrdFulCC_Enabled = 1 ;
      edtPrdFulPed_Jsonclick = "" ;
      edtPrdFulPed_Enabled = 1 ;
      edtPrdFulEnt_Jsonclick = "" ;
      edtPrdFulEnt_Enabled = 1 ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdCanPen_Enabled = 1 ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdCanRes_Enabled = 1 ;
      edtPrdExiCC_Jsonclick = "" ;
      edtPrdExiCC_Enabled = 1 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 1 ;
      edtPrdNumUco_Jsonclick = "" ;
      edtPrdNumUco_Enabled = 1 ;
      edtPrdLotMin_Jsonclick = "" ;
      edtPrdLotMin_Enabled = 1 ;
      edtMetDsc_Jsonclick = "" ;
      edtMetDsc_Enabled = 0 ;
      edtMetCod_Jsonclick = "" ;
      edtMetCod_Enabled = 1 ;
      edtPrdPlaEnt_Jsonclick = "" ;
      edtPrdPlaEnt_Enabled = 1 ;
      edtPrdDiaRot_Jsonclick = "" ;
      edtPrdDiaRot_Enabled = 1 ;
      edtPrdStkMinU_Jsonclick = "" ;
      edtPrdStkMinU_Enabled = 1 ;
      edtPrdStkMinD_Jsonclick = "" ;
      edtPrdStkMinD_Enabled = 1 ;
      edtPrdConDia_Jsonclick = "" ;
      edtPrdConDia_Enabled = 1 ;
      edtPrdPreMed_Jsonclick = "" ;
      edtPrdPreMed_Enabled = 1 ;
      edtPrdPreAnt_Jsonclick = "" ;
      edtPrdPreAnt_Enabled = 1 ;
      edtPrdFecPre_Jsonclick = "" ;
      edtPrdFecPre_Enabled = 1 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdPreAct_Enabled = 1 ;
      edtTipDtoDto_Jsonclick = "" ;
      edtTipDtoDto_Enabled = 0 ;
      edtTipDtoCod_Jsonclick = "" ;
      edtTipDtoCod_Enabled = 1 ;
      edtPrdRotRea_Jsonclick = "" ;
      edtPrdRotRea_Enabled = 1 ;
      edtPrdSit_Jsonclick = "" ;
      edtPrdSit_Enabled = 1 ;
      edtPrdDetPar_Jsonclick = "" ;
      edtPrdDetPar_Enabled = 1 ;
      edtPrdCalNec_Jsonclick = "" ;
      edtPrdCalNec_Enabled = 1 ;
      edtPrdRec_Jsonclick = "" ;
      edtPrdRec_Enabled = 1 ;
      edtValDsc_Jsonclick = "" ;
      edtValDsc_Enabled = 0 ;
      edtValCod_Jsonclick = "" ;
      edtValCod_Enabled = 1 ;
      edtPrdSusNom_Jsonclick = "" ;
      edtPrdSusNom_Enabled = 0 ;
      edtPrdSus_Jsonclick = "" ;
      edtPrdSus_Enabled = 1 ;
      edtEmpCodSus_Jsonclick = "" ;
      edtEmpCodSus_Enabled = 0 ;
      edtPrdRefPrv_Jsonclick = "" ;
      edtPrdRefPrv_Enabled = 1 ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNom_Enabled = 0 ;
      edtPrvNum_Jsonclick = "" ;
      edtPrvNum_Enabled = 1 ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdFacCon_Enabled = 1 ;
      edtPrdUcoDsc_Jsonclick = "" ;
      edtPrdUcoDsc_Enabled = 0 ;
      edtPrdUniCon_Jsonclick = "" ;
      edtPrdUniCon_Enabled = 1 ;
      edtPrdUcpDsc_Jsonclick = "" ;
      edtPrdUcpDsc_Enabled = 0 ;
      edtPrdUniCom_Jsonclick = "" ;
      edtPrdUniCom_Enabled = 1 ;
      edtPrdDscTec_Jsonclick = "" ;
      edtPrdDscTec_Enabled = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 1 ;
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

   public void gxdlaprdpestermM81( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlaprdpesterm_dataM81( ) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   public void gxaprdpesterm_htmlM81( )
   {
      String gxdynajaxvalue;
      gxdlaprdpesterm_dataM81( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynPrdPesTerm.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynPrdPesTerm.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlaprdpesterm_dataM81( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T00M8113 */
      pr_default.execute(111);
      while ( (pr_default.getStatus(111) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T00M8113_A942TermCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T00M8113_A942TermCod[0]));
         pr_default.readNext(111);
      }
      pr_default.close(111);
   }

   public void init_web_controls( )
   {
      chkPrdSalM.setName( "PRDSALM" );
      chkPrdSalM.setWebtags( "" );
      chkPrdSalM.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSalM.getInternalname(), "TitleCaption", chkPrdSalM.getCaption(), true);
      chkPrdSalM.setCheckedValue( "N" );
      A5418PrdSalM = ((GXutil.strcmp(GXutil.rtrim( A5418PrdSalM), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
      chkPrdPesCon.setName( "PRDPESCON" );
      chkPrdPesCon.setWebtags( "" );
      chkPrdPesCon.setCaption( httpContext.getMessage( "Controlar", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdPesCon.getInternalname(), "TitleCaption", chkPrdPesCon.getCaption(), true);
      chkPrdPesCon.setCheckedValue( "0" );
      A8896PrdPesCon = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.str( A8896PrdPesCon, 1, 0));
      dynPrdPesTerm.setName( "PRDPESTERM" );
      dynPrdPesTerm.setWebtags( "" );
      dynPrdPesTerm.removeAllItems();
      /* Using cursor T00M8114 */
      pr_default.execute(112);
      while ( (pr_default.getStatus(112) != 101) )
      {
         dynPrdPesTerm.addItem(T00M8114_A942TermCod[0], T00M8114_A942TermCod[0], (short)(0));
         pr_default.readNext(112);
      }
      pr_default.close(112);
      if ( dynPrdPesTerm.getItemCount() > 0 )
      {
         A8897PrdPesTerm = dynPrdPesTerm.getValidValue(A8897PrdPesTerm) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", A8897PrdPesTerm);
      }
      chkPrdSal.setName( "PRDSAL" );
      chkPrdSal.setWebtags( "" );
      chkPrdSal.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkPrdSal.getInternalname(), "TitleCaption", chkPrdSal.getCaption(), true);
      chkPrdSal.setCheckedValue( "N" );
      A8936PrdSal = ((GXutil.strcmp(GXutil.rtrim( A8936PrdSal), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A8936PrdSal", A8936PrdSal);
      cmbPrdOkotex.setName( "PRDOKOTEX" );
      cmbPrdOkotex.setWebtags( "" );
      cmbPrdOkotex.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbPrdOkotex.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
         A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5888PrdOkotex", A5888PrdOkotex);
      }
      cmbPrdList.setName( "PRDLIST" );
      cmbPrdList.setWebtags( "" );
      cmbPrdList.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbPrdList.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbPrdList.getItemCount() > 0 )
      {
         A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11687PrdList", A11687PrdList);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00M830 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T00M830_A407EmprNom[0] ;
      n407EmprNom = T00M830_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(28);
      GX_FocusControl = edtPrdNom_Internalname ;
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
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n407EmprNom = false ;
      /* Using cursor T00M830 */
      pr_default.execute(28, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(28) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T00M830_A407EmprNom[0] ;
      n407EmprNom = T00M830_n407EmprNom[0] ;
      pr_default.close(28);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Prdnum( )
   {
      A11687PrdList = cmbPrdList.getValue() ;
      cmbPrdList.setValue( A11687PrdList );
      A5888PrdOkotex = cmbPrdOkotex.getValue() ;
      cmbPrdOkotex.setValue( A5888PrdOkotex );
      n719PrdNum = false ;
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      A5418PrdSalM = ((GXutil.strcmp(GXutil.rtrim( A5418PrdSalM), "S")==0) ? "S" : "N") ;
      A8896PrdPesCon = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      if ( dynPrdPesTerm.getItemCount() > 0 )
      {
         A8897PrdPesTerm = dynPrdPesTerm.getValidValue(A8897PrdPesTerm) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynPrdPesTerm.setValue( GXutil.rtrim( A8897PrdPesTerm) );
      }
      A8936PrdSal = ((GXutil.strcmp(GXutil.rtrim( A8936PrdSal), "S")==0) ? "S" : "N") ;
      if ( cmbPrdOkotex.getItemCount() > 0 )
      {
         A5888PrdOkotex = cmbPrdOkotex.getValidValue(A5888PrdOkotex) ;
         cmbPrdOkotex.setValue( A5888PrdOkotex );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
      }
      if ( cmbPrdList.getItemCount() > 0 )
      {
         A11687PrdList = cmbPrdList.getValidValue(A11687PrdList) ;
         cmbPrdList.setValue( A11687PrdList );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A394EmpCodSus", GXutil.rtrim( A394EmpCodSus));
      httpContext.ajax_rsp_assign_attri("", false, "A735PrdSusNom", GXutil.rtrim( A735PrdSusNom));
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A703PrdDscTec", GXutil.rtrim( A703PrdDscTec));
      httpContext.ajax_rsp_assign_attri("", false, "A742PrdUniCom", GXutil.ltrim( localUtil.ntoc( A742PrdUniCom, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A743PrdUniCon", GXutil.ltrim( localUtil.ntoc( A743PrdUniCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A728PrdRefPrv", GXutil.rtrim( A728PrdRefPrv));
      httpContext.ajax_rsp_assign_attri("", false, "A734PrdSus", GXutil.rtrim( A734PrdSus));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A727PrdRec", GXutil.rtrim( A727PrdRec));
      httpContext.ajax_rsp_assign_attri("", false, "A682PrdCalNec", GXutil.rtrim( A682PrdCalNec));
      httpContext.ajax_rsp_assign_attri("", false, "A698PrdDetPar", GXutil.rtrim( A698PrdDetPar));
      httpContext.ajax_rsp_assign_attri("", false, "A730PrdSit", GXutil.ltrim( localUtil.ntoc( A730PrdSit, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A729PrdRotRea", GXutil.ltrim( localUtil.ntoc( A729PrdRotRea, (byte)(12), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A835TipDtoCod", GXutil.ltrim( localUtil.ntoc( A835TipDtoCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A709PrdFecPre", localUtil.format(A709PrdFecPre, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( A725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A696PrdConDia", GXutil.ltrim( localUtil.ntoc( A696PrdConDia, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A731PrdStkMinD", GXutil.ltrim( localUtil.ntoc( A731PrdStkMinD, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A732PrdStkMinU", GXutil.ltrim( localUtil.ntoc( A732PrdStkMinU, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A699PrdDiaRot", GXutil.ltrim( localUtil.ntoc( A699PrdDiaRot, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A722PrdPlaEnt", GXutil.ltrim( localUtil.ntoc( A722PrdPlaEnt, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A629MetCod", GXutil.ltrim( localUtil.ntoc( A629MetCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A716PrdLotMin", GXutil.ltrim( localUtil.ntoc( A716PrdLotMin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A721PrdNumUco", GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A684PrdCanPen", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A713PrdFulEnt", localUtil.format(A713PrdFulEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A714PrdFulPed", localUtil.format(A714PrdFulPed, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A712PrdFulCC", localUtil.format(A712PrdFulCC, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A740PrdUltECC", GXutil.ltrim( localUtil.ntoc( A740PrdUltECC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( A738PrdUltCCC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( A739PrdUltDCC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A700PrdDifCC", GXutil.ltrim( localUtil.ntoc( A700PrdDifCC, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A695PrdConCC", GXutil.ltrim( localUtil.ntoc( A695PrdConCC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A750PrdValStk", GXutil.ltrim( localUtil.ntoc( A750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A332DifValStk", GXutil.ltrim( localUtil.ntoc( A332DifValStk, (byte)(11), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A708PrdFecEnt", localUtil.format(A708PrdFecEnt, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A1193PrdPosX", GXutil.ltrim( localUtil.ntoc( A1193PrdPosX, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1194PrdPosY", GXutil.ltrim( localUtil.ntoc( A1194PrdPosY, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1643PrdTip", GXutil.rtrim( A1643PrdTip));
      httpContext.ajax_rsp_assign_attri("", false, "A1644PrdDqo", GXutil.ltrim( localUtil.ntoc( A1644PrdDqo, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3004PrdRev", GXutil.rtrim( A3004PrdRev));
      httpContext.ajax_rsp_assign_attri("", false, "A3273PrdTnq", GXutil.ltrim( localUtil.ntoc( A3273PrdTnq, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4692PrdNom2", GXutil.rtrim( A4692PrdNom2));
      httpContext.ajax_rsp_assign_attri("", false, "A4693PrdNum2", GXutil.rtrim( A4693PrdNum2));
      httpContext.ajax_rsp_assign_attri("", false, "A4694PrdObs", A4694PrdObs);
      httpContext.ajax_rsp_assign_attri("", false, "A4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( A5255PrdPreAc2, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5416PrdDensS", GXutil.ltrim( localUtil.ntoc( A5416PrdDensS, (byte)(7), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5417PrdConcS", GXutil.ltrim( localUtil.ntoc( A5417PrdConcS, (byte)(7), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", GXutil.rtrim( A5418PrdSalM));
      httpContext.ajax_rsp_assign_attri("", false, "A5590PrdSolub", GXutil.ltrim( localUtil.ntoc( A5590PrdSolub, (byte)(7), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6301TipPrdCod", GXutil.ltrim( localUtil.ntoc( A6301TipPrdCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6191PrdNumCent", GXutil.rtrim( A6191PrdNumCent));
      httpContext.ajax_rsp_assign_attri("", false, "A7226PrdNumct1", GXutil.ltrim( localUtil.ntoc( A7226PrdNumct1, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7227PrdNumct2", GXutil.ltrim( localUtil.ntoc( A7227PrdNumct2, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7260PrdHorMad", GXutil.ltrim( localUtil.ntoc( A7260PrdHorMad, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( A8659PrdExiAlmc, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8896PrdPesCon", GXutil.ltrim( localUtil.ntoc( A8896PrdPesCon, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8897PrdPesTerm", GXutil.rtrim( A8897PrdPesTerm));
      dynPrdPesTerm.setValue( GXutil.rtrim( A8897PrdPesTerm) );
      httpContext.ajax_rsp_assign_prop("", false, dynPrdPesTerm.getInternalname(), "Values", dynPrdPesTerm.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A8936PrdSal", GXutil.rtrim( A8936PrdSal));
      httpContext.ajax_rsp_assign_attri("", false, "A9609SubFamCod", GXutil.ltrim( localUtil.ntoc( A9609SubFamCod, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9731PrdInc", GXutil.rtrim( A9731PrdInc));
      httpContext.ajax_rsp_assign_attri("", false, "A9732PrdComp", GXutil.rtrim( A9732PrdComp));
      httpContext.ajax_rsp_assign_attri("", false, "A9733PrdAox", GXutil.ltrim( localUtil.ntoc( A9733PrdAox, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9734PrdNCAS", GXutil.rtrim( A9734PrdNCAS));
      httpContext.ajax_rsp_assign_attri("", false, "A9739PrdFT", GXutil.rtrim( A9739PrdFT));
      httpContext.ajax_rsp_assign_attri("", false, "A9740PrdFFT", localUtil.format(A9740PrdFFT, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A9741PrdHS", GXutil.rtrim( A9741PrdHS));
      httpContext.ajax_rsp_assign_attri("", false, "A9742PrdFHS", localUtil.format(A9742PrdFHS, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5887PrdReach", GXutil.rtrim( A5887PrdReach));
      httpContext.ajax_rsp_assign_attri("", false, "A5888PrdOkotex", GXutil.rtrim( A5888PrdOkotex));
      cmbPrdOkotex.setValue( GXutil.rtrim( A5888PrdOkotex) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdOkotex.getInternalname(), "Values", cmbPrdOkotex.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A10119PrdColIdx", GXutil.rtrim( A10119PrdColIdx));
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", GXutil.rtrim( A10881PrdLote));
      httpContext.ajax_rsp_assign_attri("", false, "A10935PrdRTM", GXutil.rtrim( A10935PrdRTM));
      httpContext.ajax_rsp_assign_attri("", false, "A10936PrdCtw1", GXutil.rtrim( A10936PrdCtw1));
      httpContext.ajax_rsp_assign_attri("", false, "A10937PrdCtw2", GXutil.rtrim( A10937PrdCtw2));
      httpContext.ajax_rsp_assign_attri("", false, "A10938PrdCtw3", GXutil.rtrim( A10938PrdCtw3));
      httpContext.ajax_rsp_assign_attri("", false, "A11663PrdCtw4", GXutil.rtrim( A11663PrdCtw4));
      httpContext.ajax_rsp_assign_attri("", false, "A11196PrdNroCAS", GXutil.rtrim( A11196PrdNroCAS));
      httpContext.ajax_rsp_assign_attri("", false, "A11363PrdGots", GXutil.rtrim( A11363PrdGots));
      httpContext.ajax_rsp_assign_attri("", false, "A11364PrdHm", GXutil.rtrim( A11364PrdHm));
      httpContext.ajax_rsp_assign_attri("", false, "A11470PrdConct", GXutil.ltrim( localUtil.ntoc( A11470PrdConct, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11614PrdEINECS", GXutil.rtrim( A11614PrdEINECS));
      httpContext.ajax_rsp_assign_attri("", false, "A11615PrdFuncion", GXutil.rtrim( A11615PrdFuncion));
      httpContext.ajax_rsp_assign_attri("", false, "A11616PrdNmQu", A11616PrdNmQu);
      httpContext.ajax_rsp_assign_attri("", false, "A11687PrdList", GXutil.rtrim( A11687PrdList));
      cmbPrdList.setValue( GXutil.rtrim( A11687PrdList) );
      httpContext.ajax_rsp_assign_prop("", false, cmbPrdList.getInternalname(), "Values", cmbPrdList.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", GXutil.rtrim( A630MetDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", GXutil.rtrim( A737PrdUcpDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", GXutil.rtrim( A736PrdUcoDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", GXutil.rtrim( A857ValDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A6302TipPrdDsc", GXutil.rtrim( A6302TipPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A9610SubFamDsc", GXutil.rtrim( A9610SubFamDsc));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z394EmpCodSus", GXutil.rtrim( Z394EmpCodSus));
      app.GxWebStd.gx_hidden_field( httpContext, "Z735PrdSusNom", GXutil.rtrim( Z735PrdSusNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z703PrdDscTec", GXutil.rtrim( Z703PrdDscTec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z742PrdUniCom", GXutil.ltrim( localUtil.ntoc( Z742PrdUniCom, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z743PrdUniCon", GXutil.ltrim( localUtil.ntoc( Z743PrdUniCon, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z728PrdRefPrv", GXutil.rtrim( Z728PrdRefPrv));
      app.GxWebStd.gx_hidden_field( httpContext, "Z734PrdSus", GXutil.rtrim( Z734PrdSus));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z727PrdRec", GXutil.rtrim( Z727PrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z682PrdCalNec", GXutil.rtrim( Z682PrdCalNec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z698PrdDetPar", GXutil.rtrim( Z698PrdDetPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z730PrdSit", GXutil.ltrim( localUtil.ntoc( Z730PrdSit, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z729PrdRotRea", GXutil.ltrim( localUtil.ntoc( Z729PrdRotRea, (byte)(12), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z835TipDtoCod", GXutil.ltrim( localUtil.ntoc( Z835TipDtoCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z724PrdPreAct", GXutil.ltrim( localUtil.ntoc( Z724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z709PrdFecPre", localUtil.format(Z709PrdFecPre, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z725PrdPreAnt", GXutil.ltrim( localUtil.ntoc( Z725PrdPreAnt, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z726PrdPreMed", GXutil.ltrim( localUtil.ntoc( Z726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z696PrdConDia", GXutil.ltrim( localUtil.ntoc( Z696PrdConDia, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z731PrdStkMinD", GXutil.ltrim( localUtil.ntoc( Z731PrdStkMinD, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z732PrdStkMinU", GXutil.ltrim( localUtil.ntoc( Z732PrdStkMinU, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z699PrdDiaRot", GXutil.ltrim( localUtil.ntoc( Z699PrdDiaRot, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z722PrdPlaEnt", GXutil.ltrim( localUtil.ntoc( Z722PrdPlaEnt, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z629MetCod", GXutil.ltrim( localUtil.ntoc( Z629MetCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z716PrdLotMin", GXutil.ltrim( localUtil.ntoc( Z716PrdLotMin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z721PrdNumUco", GXutil.ltrim( localUtil.ntoc( Z721PrdNumUco, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z685PrdCanRes", GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z684PrdCanPen", GXutil.ltrim( localUtil.ntoc( Z684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z713PrdFulEnt", localUtil.format(Z713PrdFulEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z714PrdFulPed", localUtil.format(Z714PrdFulPed, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z712PrdFulCC", localUtil.format(Z712PrdFulCC, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z740PrdUltECC", GXutil.ltrim( localUtil.ntoc( Z740PrdUltECC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z738PrdUltCCC", GXutil.ltrim( localUtil.ntoc( Z738PrdUltCCC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z739PrdUltDCC", GXutil.ltrim( localUtil.ntoc( Z739PrdUltDCC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z700PrdDifCC", GXutil.ltrim( localUtil.ntoc( Z700PrdDifCC, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z695PrdConCC", GXutil.ltrim( localUtil.ntoc( Z695PrdConCC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z750PrdValStk", GXutil.ltrim( localUtil.ntoc( Z750PrdValStk, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z332DifValStk", GXutil.ltrim( localUtil.ntoc( Z332DifValStk, (byte)(11), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z708PrdFecEnt", localUtil.format(Z708PrdFecEnt, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1193PrdPosX", GXutil.ltrim( localUtil.ntoc( Z1193PrdPosX, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1194PrdPosY", GXutil.ltrim( localUtil.ntoc( Z1194PrdPosY, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1643PrdTip", GXutil.rtrim( Z1643PrdTip));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1644PrdDqo", GXutil.ltrim( localUtil.ntoc( Z1644PrdDqo, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3004PrdRev", GXutil.rtrim( Z3004PrdRev));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3273PrdTnq", GXutil.ltrim( localUtil.ntoc( Z3273PrdTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4692PrdNom2", GXutil.rtrim( Z4692PrdNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4693PrdNum2", GXutil.rtrim( Z4693PrdNum2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4694PrdObs", Z4694PrdObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z4338PrdUMeFo", GXutil.ltrim( localUtil.ntoc( Z4338PrdUMeFo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5255PrdPreAc2", GXutil.ltrim( localUtil.ntoc( Z5255PrdPreAc2, (byte)(14), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5416PrdDensS", GXutil.ltrim( localUtil.ntoc( Z5416PrdDensS, (byte)(7), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5417PrdConcS", GXutil.ltrim( localUtil.ntoc( Z5417PrdConcS, (byte)(7), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5418PrdSalM", GXutil.rtrim( Z5418PrdSalM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5590PrdSolub", GXutil.ltrim( localUtil.ntoc( Z5590PrdSolub, (byte)(7), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6301TipPrdCod", GXutil.ltrim( localUtil.ntoc( Z6301TipPrdCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6191PrdNumCent", GXutil.rtrim( Z6191PrdNumCent));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7226PrdNumct1", GXutil.ltrim( localUtil.ntoc( Z7226PrdNumct1, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7227PrdNumct2", GXutil.ltrim( localUtil.ntoc( Z7227PrdNumct2, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7260PrdHorMad", GXutil.ltrim( localUtil.ntoc( Z7260PrdHorMad, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8659PrdExiAlmc", GXutil.ltrim( localUtil.ntoc( Z8659PrdExiAlmc, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8896PrdPesCon", GXutil.ltrim( localUtil.ntoc( Z8896PrdPesCon, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8897PrdPesTerm", GXutil.rtrim( Z8897PrdPesTerm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8936PrdSal", GXutil.rtrim( Z8936PrdSal));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9609SubFamCod", GXutil.ltrim( localUtil.ntoc( Z9609SubFamCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9731PrdInc", GXutil.rtrim( Z9731PrdInc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9732PrdComp", GXutil.rtrim( Z9732PrdComp));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9733PrdAox", GXutil.ltrim( localUtil.ntoc( Z9733PrdAox, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9734PrdNCAS", GXutil.rtrim( Z9734PrdNCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9739PrdFT", GXutil.rtrim( Z9739PrdFT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9740PrdFFT", localUtil.format(Z9740PrdFFT, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9741PrdHS", GXutil.rtrim( Z9741PrdHS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9742PrdFHS", localUtil.format(Z9742PrdFHS, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5887PrdReach", GXutil.rtrim( Z5887PrdReach));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5888PrdOkotex", GXutil.rtrim( Z5888PrdOkotex));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10119PrdColIdx", GXutil.rtrim( Z10119PrdColIdx));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10881PrdLote", GXutil.rtrim( Z10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10935PrdRTM", GXutil.rtrim( Z10935PrdRTM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10936PrdCtw1", GXutil.rtrim( Z10936PrdCtw1));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10937PrdCtw2", GXutil.rtrim( Z10937PrdCtw2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10938PrdCtw3", GXutil.rtrim( Z10938PrdCtw3));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11663PrdCtw4", GXutil.rtrim( Z11663PrdCtw4));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11196PrdNroCAS", GXutil.rtrim( Z11196PrdNroCAS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11363PrdGots", GXutil.rtrim( Z11363PrdGots));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11364PrdHm", GXutil.rtrim( Z11364PrdHm));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11470PrdConct", GXutil.ltrim( localUtil.ntoc( Z11470PrdConct, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11614PrdEINECS", GXutil.rtrim( Z11614PrdEINECS));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11615PrdFuncion", GXutil.rtrim( Z11615PrdFuncion));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11616PrdNmQu", Z11616PrdNmQu);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11687PrdList", GXutil.rtrim( Z11687PrdList));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z630MetDsc", GXutil.rtrim( Z630MetDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z794PrvNom", GXutil.rtrim( Z794PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z837TipDtoDto", GXutil.ltrim( localUtil.ntoc( Z837TipDtoDto, (byte)(5), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z737PrdUcpDsc", GXutil.rtrim( Z737PrdUcpDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z736PrdUcoDsc", GXutil.rtrim( Z736PrdUcoDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z857ValDsc", GXutil.rtrim( Z857ValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6302TipPrdDsc", GXutil.rtrim( Z6302TipPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9610SubFamDsc", GXutil.rtrim( Z9610SubFamDsc));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Prdunicom( )
   {
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n737PrdUcpDsc = false ;
      /* Using cursor T00M831 */
      pr_default.execute(29, new Object[] {A396EmprCod, Byte.valueOf(A742PrdUniCom)});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A737PrdUcpDsc = T00M831_A737PrdUcpDsc[0] ;
      n737PrdUcpDsc = T00M831_n737PrdUcpDsc[0] ;
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A737PrdUcpDsc", GXutil.rtrim( A737PrdUcpDsc));
   }

   public void valid_Prdunicon( )
   {
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n736PrdUcoDsc = false ;
      /* Using cursor T00M832 */
      pr_default.execute(30, new Object[] {A396EmprCod, Byte.valueOf(A743PrdUniCon)});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Producto", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDUNICON");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A736PrdUcoDsc = T00M832_A736PrdUcoDsc[0] ;
      n736PrdUcoDsc = T00M832_n736PrdUcoDsc[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A736PrdUcoDsc", GXutil.rtrim( A736PrdUcoDsc));
   }

   public void valid_Prvnum( )
   {
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n794PrvNom = false ;
      /* Using cursor T00M833 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A795PrvNum)});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRVGEN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRVNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A794PrvNom = T00M833_A794PrvNom[0] ;
      n794PrvNom = T00M833_n794PrvNom[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A794PrvNom", GXutil.rtrim( A794PrvNom));
   }

   public void valid_Prdsus( )
   {
      n734PrdSus = false ;
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n735PrdSusNom = false ;
      /* Using cursor T00M813 */
      pr_default.execute(11, new Object[] {A394EmpCodSus, Boolean.valueOf(n734PrdSus), A734PrdSus});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A735PrdSusNom = T00M813_A735PrdSusNom[0] ;
         n735PrdSusNom = T00M813_n735PrdSusNom[0] ;
      }
      else
      {
         A735PrdSusNom = "" ;
         n735PrdSusNom = false ;
      }
      pr_default.close(11);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A735PrdSusNom", GXutil.rtrim( A735PrdSusNom));
   }

   public void valid_Valcod( )
   {
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n857ValDsc = false ;
      /* Using cursor T00M834 */
      pr_default.execute(32, new Object[] {A396EmprCod, Byte.valueOf(A856ValCod)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPVAL", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "VALCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A857ValDsc = T00M834_A857ValDsc[0] ;
      n857ValDsc = T00M834_n857ValDsc[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A857ValDsc", GXutil.rtrim( A857ValDsc));
   }

   public void valid_Tipdtocod( )
   {
      n835TipDtoCod = false ;
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n837TipDtoDto = false ;
      /* Using cursor T00M835 */
      pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n835TipDtoCod), Byte.valueOf(A835TipDtoCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A835TipDtoCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPDTO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPDTOCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A837TipDtoDto = T00M835_A837TipDtoDto[0] ;
      n837TipDtoDto = T00M835_n837TipDtoDto[0] ;
      pr_default.close(33);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A837TipDtoDto", GXutil.ltrim( localUtil.ntoc( A837TipDtoDto, (byte)(5), (byte)(2), ".", "")));
   }

   public void valid_Metcod( )
   {
      n629MetCod = false ;
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n630MetDsc = false ;
      /* Using cursor T00M836 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n629MetCod), Byte.valueOf(A629MetCod)});
      if ( (pr_default.getStatus(34) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A629MetCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "METPED", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "METCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A630MetDsc = T00M836_A630MetDsc[0] ;
      n630MetDsc = T00M836_n630MetDsc[0] ;
      pr_default.close(34);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A630MetDsc", GXutil.rtrim( A630MetDsc));
   }

   public void valid_Tipprdcod( )
   {
      n6301TipPrdCod = false ;
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n6302TipPrdDsc = false ;
      /* Using cursor T00M837 */
      pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n6301TipPrdCod), Short.valueOf(A6301TipPrdCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A6301TipPrdCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPPRD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPPRDCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A6302TipPrdDsc = T00M837_A6302TipPrdDsc[0] ;
      n6302TipPrdDsc = T00M837_n6302TipPrdDsc[0] ;
      pr_default.close(35);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6302TipPrdDsc", GXutil.rtrim( A6302TipPrdDsc));
   }

   public void valid_Subfamcod( )
   {
      n9609SubFamCod = false ;
      A8897PrdPesTerm = dynPrdPesTerm.getValue() ;
      n9610SubFamDsc = false ;
      /* Using cursor T00M838 */
      pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n9609SubFamCod), Byte.valueOf(A9609SubFamCod)});
      if ( (pr_default.getStatus(36) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A9609SubFamCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "SUBFSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SUBFAMCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A9610SubFamDsc = T00M838_A9610SubFamDsc[0] ;
      n9610SubFamDsc = T00M838_n9610SubFamDsc[0] ;
      pr_default.close(36);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9610SubFamDsc", GXutil.rtrim( A9610SubFamDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("ENTER",",oparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'cmbPrdList'},{av:'A11687PrdList',fld:'PRDLIST',pic:''},{av:'cmbPrdOkotex'},{av:'A5888PrdOkotex',fld:'PRDOKOTEX',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A394EmpCodSus',fld:'EMPCODSUS',pic:'@!'},{av:'A735PrdSusNom',fld:'PRDSUSNOM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A703PrdDscTec',fld:'PRDDSCTEC',pic:''},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A728PrdRefPrv',fld:'PRDREFPRV',pic:''},{av:'A734PrdSus',fld:'PRDSUS',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A682PrdCalNec',fld:'PRDCALNEC',pic:''},{av:'A698PrdDetPar',fld:'PRDDETPAR',pic:''},{av:'A730PrdSit',fld:'PRDSIT',pic:'9'},{av:'A729PrdRotRea',fld:'PRDROTREA',pic:'ZZZZZ9.999'},{av:'A835TipDtoCod',fld:'TIPDTOCOD',pic:'Z9'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A709PrdFecPre',fld:'PRDFECPRE',pic:''},{av:'A725PrdPreAnt',fld:'PRDPREANT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A696PrdConDia',fld:'PRDCONDIA',pic:'ZZZ9.99'},{av:'A731PrdStkMinD',fld:'PRDSTKMIND',pic:'ZZZ9'},{av:'A732PrdStkMinU',fld:'PRDSTKMINU',pic:'ZZZZ9.99'},{av:'A699PrdDiaRot',fld:'PRDDIAROT',pic:'ZZ9'},{av:'A722PrdPlaEnt',fld:'PRDPLAENT',pic:'ZZ9'},{av:'A629MetCod',fld:'METCOD',pic:'9'},{av:'A716PrdLotMin',fld:'PRDLOTMIN',pic:'ZZZ9'},{av:'A721PrdNumUco',fld:'PRDNUMUCO',pic:'ZZZ9.99'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A684PrdCanPen',fld:'PRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'A713PrdFulEnt',fld:'PRDFULENT',pic:''},{av:'A714PrdFulPed',fld:'PRDFULPED',pic:''},{av:'A712PrdFulCC',fld:'PRDFULCC',pic:''},{av:'A706PrdExiCCP',fld:'PRDEXICCP',pic:'ZZZZ9.99'},{av:'A740PrdUltECC',fld:'PRDULTECC',pic:'ZZZZ9.99'},{av:'A738PrdUltCCC',fld:'PRDULTCCC',pic:'ZZZ9'},{av:'A739PrdUltDCC',fld:'PRDULTDCC',pic:'ZZZZ9.99'},{av:'A700PrdDifCC',fld:'PRDDIFCC',pic:'ZZZZ9.99'},{av:'A695PrdConCC',fld:'PRDCONCC',pic:'ZZZ9'},{av:'A750PrdValStk',fld:'PRDVALSTK',pic:'ZZZZZZZ9.99'},{av:'A332DifValStk',fld:'DIFVALSTK',pic:'ZZZZZZZ9.99'},{av:'A708PrdFecEnt',fld:'PRDFECENT',pic:''},{av:'A1193PrdPosX',fld:'PRDPOSX',pic:'ZZZ9'},{av:'A1194PrdPosY',fld:'PRDPOSY',pic:'Z9'},{av:'A1643PrdTip',fld:'PRDTIP',pic:'@!'},{av:'A1644PrdDqo',fld:'PRDDQO',pic:'ZZZ9'},{av:'A3004PrdRev',fld:'PRDREV',pic:'@!'},{av:'A3273PrdTnq',fld:'PRDTNQ',pic:'Z9'},{av:'A4692PrdNom2',fld:'PRDNOM2',pic:''},{av:'A4693PrdNum2',fld:'PRDNUM2',pic:''},{av:'A4694PrdObs',fld:'PRDOBS',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'},{av:'A5255PrdPreAc2',fld:'PRDPREAC2',pic:'ZZZZZZZ9.999'},{av:'A5416PrdDensS',fld:'PRDDENSS',pic:'ZZ9.999'},{av:'A5417PrdConcS',fld:'PRDCONCS',pic:'ZZ9.999'},{av:'A5590PrdSolub',fld:'PRDSOLUB',pic:'ZZZ9.99'},{av:'A6301TipPrdCod',fld:'TIPPRDCOD',pic:'ZZZ9'},{av:'A6191PrdNumCent',fld:'PRDNUMCENT',pic:''},{av:'A7226PrdNumct1',fld:'PRDNUMCT1',pic:'ZZ9.99'},{av:'A7227PrdNumct2',fld:'PRDNUMCT2',pic:'ZZ9.99'},{av:'A7260PrdHorMad',fld:'PRDHORMAD',pic:'Z9'},{av:'A8659PrdExiAlmc',fld:'PRDEXIALMC',pic:'ZZZZZZ9.9999'},{av:'A9609SubFamCod',fld:'SUBFAMCOD',pic:'Z9'},{av:'A9731PrdInc',fld:'PRDINC',pic:''},{av:'A9732PrdComp',fld:'PRDCOMP',pic:''},{av:'A9733PrdAox',fld:'PRDAOX',pic:'ZZ9.99'},{av:'A9734PrdNCAS',fld:'PRDNCAS',pic:''},{av:'A9739PrdFT',fld:'PRDFT',pic:''},{av:'A9740PrdFFT',fld:'PRDFFT',pic:''},{av:'A9741PrdHS',fld:'PRDHS',pic:''},{av:'A9742PrdFHS',fld:'PRDFHS',pic:''},{av:'A5887PrdReach',fld:'PRDREACH',pic:''},{av:'cmbPrdOkotex'},{av:'A5888PrdOkotex',fld:'PRDOKOTEX',pic:''},{av:'A10119PrdColIdx',fld:'PRDCOLIDX',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A10935PrdRTM',fld:'PRDRTM',pic:''},{av:'A10936PrdCtw1',fld:'PRDCTW1',pic:''},{av:'A10937PrdCtw2',fld:'PRDCTW2',pic:''},{av:'A10938PrdCtw3',fld:'PRDCTW3',pic:''},{av:'A11663PrdCtw4',fld:'PRDCTW4',pic:''},{av:'A11196PrdNroCAS',fld:'PRDNROCAS',pic:''},{av:'A11363PrdGots',fld:'PRDGOTS',pic:''},{av:'A11364PrdHm',fld:'PRDHM',pic:''},{av:'A11470PrdConct',fld:'PRDCONCT',pic:'ZZ9'},{av:'A11614PrdEINECS',fld:'PRDEINECS',pic:''},{av:'A11615PrdFuncion',fld:'PRDFUNCION',pic:''},{av:'A11616PrdNmQu',fld:'PRDNMQU',pic:''},{av:'cmbPrdList'},{av:'A11687PrdList',fld:'PRDLIST',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A630MetDsc',fld:'METDSC',pic:''},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'A837TipDtoDto',fld:'TIPDTODTO',pic:'Z9.99'},{av:'A737PrdUcpDsc',fld:'PRDUCPDSC',pic:''},{av:'A736PrdUcoDsc',fld:'PRDUCODSC',pic:''},{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'A6302TipPrdDsc',fld:'TIPPRDDSC',pic:''},{av:'A9610SubFamDsc',fld:'SUBFAMDSC',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z719PrdNum'},{av:'Z394EmpCodSus'},{av:'Z735PrdSusNom'},{av:'Z718PrdNom'},{av:'Z703PrdDscTec'},{av:'Z742PrdUniCom'},{av:'Z743PrdUniCon'},{av:'Z707PrdFacCon'},{av:'Z795PrvNum'},{av:'Z728PrdRefPrv'},{av:'Z734PrdSus'},{av:'Z856ValCod'},{av:'Z727PrdRec'},{av:'Z682PrdCalNec'},{av:'Z698PrdDetPar'},{av:'Z730PrdSit'},{av:'Z729PrdRotRea'},{av:'Z835TipDtoCod'},{av:'Z724PrdPreAct'},{av:'Z709PrdFecPre'},{av:'Z725PrdPreAnt'},{av:'Z726PrdPreMed'},{av:'Z696PrdConDia'},{av:'Z731PrdStkMinD'},{av:'Z732PrdStkMinU'},{av:'Z699PrdDiaRot'},{av:'Z722PrdPlaEnt'},{av:'Z629MetCod'},{av:'Z716PrdLotMin'},{av:'Z721PrdNumUco'},{av:'Z704PrdExiAlm'},{av:'Z705PrdExiCC'},{av:'Z685PrdCanRes'},{av:'Z684PrdCanPen'},{av:'Z713PrdFulEnt'},{av:'Z714PrdFulPed'},{av:'Z712PrdFulCC'},{av:'Z706PrdExiCCP'},{av:'Z740PrdUltECC'},{av:'Z738PrdUltCCC'},{av:'Z739PrdUltDCC'},{av:'Z700PrdDifCC'},{av:'Z695PrdConCC'},{av:'Z750PrdValStk'},{av:'Z332DifValStk'},{av:'Z708PrdFecEnt'},{av:'Z1193PrdPosX'},{av:'Z1194PrdPosY'},{av:'Z1643PrdTip'},{av:'Z1644PrdDqo'},{av:'Z3004PrdRev'},{av:'Z3273PrdTnq'},{av:'Z4692PrdNom2'},{av:'Z4693PrdNum2'},{av:'Z4694PrdObs'},{av:'Z4338PrdUMeFo'},{av:'Z5255PrdPreAc2'},{av:'Z5416PrdDensS'},{av:'Z5417PrdConcS'},{av:'Z5418PrdSalM'},{av:'Z5590PrdSolub'},{av:'Z6301TipPrdCod'},{av:'Z6191PrdNumCent'},{av:'Z7226PrdNumct1'},{av:'Z7227PrdNumct2'},{av:'Z7260PrdHorMad'},{av:'Z8659PrdExiAlmc'},{av:'Z8896PrdPesCon'},{av:'Z8897PrdPesTerm'},{av:'Z8936PrdSal'},{av:'Z9609SubFamCod'},{av:'Z9731PrdInc'},{av:'Z9732PrdComp'},{av:'Z9733PrdAox'},{av:'Z9734PrdNCAS'},{av:'Z9739PrdFT'},{av:'Z9740PrdFFT'},{av:'Z9741PrdHS'},{av:'Z9742PrdFHS'},{av:'Z5887PrdReach'},{av:'Z5888PrdOkotex'},{av:'Z10119PrdColIdx'},{av:'Z10881PrdLote'},{av:'Z10935PrdRTM'},{av:'Z10936PrdCtw1'},{av:'Z10937PrdCtw2'},{av:'Z10938PrdCtw3'},{av:'Z11663PrdCtw4'},{av:'Z11196PrdNroCAS'},{av:'Z11363PrdGots'},{av:'Z11364PrdHm'},{av:'Z11470PrdConct'},{av:'Z11614PrdEINECS'},{av:'Z11615PrdFuncion'},{av:'Z11616PrdNmQu'},{av:'Z11687PrdList'},{av:'Z407EmprNom'},{av:'Z630MetDsc'},{av:'Z794PrvNom'},{av:'Z837TipDtoDto'},{av:'Z737PrdUcpDsc'},{av:'Z736PrdUcoDsc'},{av:'Z857ValDsc'},{av:'Z6302TipPrdDsc'},{av:'Z9610SubFamDsc'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDUNICOM","{handler:'valid_Prdunicom',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A742PrdUniCom',fld:'PRDUNICOM',pic:'9'},{av:'A737PrdUcpDsc',fld:'PRDUCPDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDUNICOM",",oparms:[{av:'A737PrdUcpDsc',fld:'PRDUCPDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDUNICON","{handler:'valid_Prdunicon',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A743PrdUniCon',fld:'PRDUNICON',pic:'9'},{av:'A736PrdUcoDsc',fld:'PRDUCODSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDUNICON",",oparms:[{av:'A736PrdUcoDsc',fld:'PRDUCODSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRVNUM",",oparms:[{av:'A794PrvNom',fld:'PRVNOM',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_EMPCODSUS","{handler:'valid_Empcodsus',iparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_EMPCODSUS",",oparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDSUS","{handler:'valid_Prdsus',iparms:[{av:'A394EmpCodSus',fld:'EMPCODSUS',pic:'@!'},{av:'A734PrdSus',fld:'PRDSUS',pic:''},{av:'A735PrdSusNom',fld:'PRDSUSNOM',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDSUS",",oparms:[{av:'A735PrdSusNom',fld:'PRDSUSNOM',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_VALCOD","{handler:'valid_Valcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_VALCOD",",oparms:[{av:'A857ValDsc',fld:'VALDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDREC","{handler:'valid_Prdrec',iparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDREC",",oparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDCALNEC","{handler:'valid_Prdcalnec',iparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDCALNEC",",oparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDDETPAR","{handler:'valid_Prddetpar',iparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDDETPAR",",oparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_TIPDTOCOD","{handler:'valid_Tipdtocod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A835TipDtoCod',fld:'TIPDTOCOD',pic:'Z9'},{av:'A837TipDtoDto',fld:'TIPDTODTO',pic:'Z9.99'},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_TIPDTOCOD",",oparms:[{av:'A837TipDtoDto',fld:'TIPDTODTO',pic:'Z9.99'},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_METCOD","{handler:'valid_Metcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A629MetCod',fld:'METCOD',pic:'9'},{av:'A630MetDsc',fld:'METDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_METCOD",",oparms:[{av:'A630MetDsc',fld:'METDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDTIP","{handler:'valid_Prdtip',iparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDTIP",",oparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_PRDREV","{handler:'valid_Prdrev',iparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_PRDREV",",oparms:[{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_TIPPRDCOD","{handler:'valid_Tipprdcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6301TipPrdCod',fld:'TIPPRDCOD',pic:'ZZZ9'},{av:'A6302TipPrdDsc',fld:'TIPPRDDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_TIPPRDCOD",",oparms:[{av:'A6302TipPrdDsc',fld:'TIPPRDDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
      setEventMetadata("VALID_SUBFAMCOD","{handler:'valid_Subfamcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9609SubFamCod',fld:'SUBFAMCOD',pic:'Z9'},{av:'A9610SubFamDsc',fld:'SUBFAMDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]");
      setEventMetadata("VALID_SUBFAMCOD",",oparms:[{av:'A9610SubFamDsc',fld:'SUBFAMDSC',pic:''},{av:'dynPrdPesTerm'},{av:'A8897PrdPesTerm',fld:'PRDPESTERM',pic:''},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A8896PrdPesCon',fld:'PRDPESCON',pic:'9'},{av:'A8936PrdSal',fld:'PRDSAL',pic:''}]}");
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
      pr_default.close(28);
      pr_default.close(34);
      pr_default.close(31);
      pr_default.close(33);
      pr_default.close(29);
      pr_default.close(30);
      pr_default.close(32);
      pr_default.close(35);
      pr_default.close(36);
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z703PrdDscTec = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z728PrdRefPrv = "" ;
      Z734PrdSus = "" ;
      Z727PrdRec = "" ;
      Z682PrdCalNec = "" ;
      Z698PrdDetPar = "" ;
      Z729PrdRotRea = DecimalUtil.ZERO ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z709PrdFecPre = GXutil.nullDate() ;
      Z725PrdPreAnt = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z696PrdConDia = DecimalUtil.ZERO ;
      Z732PrdStkMinU = DecimalUtil.ZERO ;
      Z721PrdNumUco = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z684PrdCanPen = DecimalUtil.ZERO ;
      Z713PrdFulEnt = GXutil.nullDate() ;
      Z714PrdFulPed = GXutil.nullDate() ;
      Z712PrdFulCC = GXutil.nullDate() ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z740PrdUltECC = DecimalUtil.ZERO ;
      Z739PrdUltDCC = DecimalUtil.ZERO ;
      Z700PrdDifCC = DecimalUtil.ZERO ;
      Z750PrdValStk = DecimalUtil.ZERO ;
      Z332DifValStk = DecimalUtil.ZERO ;
      Z708PrdFecEnt = GXutil.nullDate() ;
      Z1643PrdTip = "" ;
      Z3004PrdRev = "" ;
      Z4692PrdNom2 = "" ;
      Z4693PrdNum2 = "" ;
      Z4694PrdObs = "" ;
      Z5255PrdPreAc2 = DecimalUtil.ZERO ;
      Z5416PrdDensS = DecimalUtil.ZERO ;
      Z5417PrdConcS = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      Z5590PrdSolub = DecimalUtil.ZERO ;
      Z6191PrdNumCent = "" ;
      Z7226PrdNumct1 = DecimalUtil.ZERO ;
      Z7227PrdNumct2 = DecimalUtil.ZERO ;
      Z8659PrdExiAlmc = DecimalUtil.ZERO ;
      Z8897PrdPesTerm = "" ;
      Z8936PrdSal = "" ;
      Z9731PrdInc = "" ;
      Z9732PrdComp = "" ;
      Z9733PrdAox = DecimalUtil.ZERO ;
      Z9734PrdNCAS = "" ;
      Z9739PrdFT = "" ;
      Z9740PrdFFT = GXutil.nullDate() ;
      Z9741PrdHS = "" ;
      Z9742PrdFHS = GXutil.nullDate() ;
      Z5887PrdReach = "" ;
      Z5888PrdOkotex = "" ;
      Z10119PrdColIdx = "" ;
      Z10881PrdLote = "" ;
      Z10935PrdRTM = "" ;
      Z10936PrdCtw1 = "" ;
      Z10937PrdCtw2 = "" ;
      Z10938PrdCtw3 = "" ;
      Z11663PrdCtw4 = "" ;
      Z11196PrdNroCAS = "" ;
      Z11363PrdGots = "" ;
      Z11364PrdHm = "" ;
      Z11614PrdEINECS = "" ;
      Z11615PrdFuncion = "" ;
      Z11616PrdNmQu = "" ;
      Z11687PrdList = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A5418PrdSalM = "" ;
      A8897PrdPesTerm = "" ;
      A8936PrdSal = "" ;
      A5888PrdOkotex = "" ;
      A11687PrdList = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A719PrdNum = "" ;
      A407EmprNom = "" ;
      A718PrdNom = "" ;
      A703PrdDscTec = "" ;
      A737PrdUcpDsc = "" ;
      A736PrdUcoDsc = "" ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A794PrvNom = "" ;
      A728PrdRefPrv = "" ;
      A394EmpCodSus = "" ;
      A734PrdSus = "" ;
      A735PrdSusNom = "" ;
      A857ValDsc = "" ;
      A727PrdRec = "" ;
      A682PrdCalNec = "" ;
      A698PrdDetPar = "" ;
      A729PrdRotRea = DecimalUtil.ZERO ;
      A837TipDtoDto = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      A709PrdFecPre = GXutil.nullDate() ;
      A725PrdPreAnt = DecimalUtil.ZERO ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A696PrdConDia = DecimalUtil.ZERO ;
      A732PrdStkMinU = DecimalUtil.ZERO ;
      A630MetDsc = "" ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      A713PrdFulEnt = GXutil.nullDate() ;
      A714PrdFulPed = GXutil.nullDate() ;
      A712PrdFulCC = GXutil.nullDate() ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      A740PrdUltECC = DecimalUtil.ZERO ;
      A739PrdUltDCC = DecimalUtil.ZERO ;
      A700PrdDifCC = DecimalUtil.ZERO ;
      A750PrdValStk = DecimalUtil.ZERO ;
      A332DifValStk = DecimalUtil.ZERO ;
      A708PrdFecEnt = GXutil.nullDate() ;
      A1643PrdTip = "" ;
      A3004PrdRev = "" ;
      A4692PrdNom2 = "" ;
      A4693PrdNum2 = "" ;
      A4694PrdObs = "" ;
      A5255PrdPreAc2 = DecimalUtil.ZERO ;
      A5416PrdDensS = DecimalUtil.ZERO ;
      A5417PrdConcS = DecimalUtil.ZERO ;
      A5590PrdSolub = DecimalUtil.ZERO ;
      A6302TipPrdDsc = "" ;
      A6191PrdNumCent = "" ;
      A7226PrdNumct1 = DecimalUtil.ZERO ;
      A7227PrdNumct2 = DecimalUtil.ZERO ;
      A8659PrdExiAlmc = DecimalUtil.ZERO ;
      A9610SubFamDsc = "" ;
      A9731PrdInc = "" ;
      A9732PrdComp = "" ;
      A9733PrdAox = DecimalUtil.ZERO ;
      A9734PrdNCAS = "" ;
      A9739PrdFT = "" ;
      A9740PrdFFT = GXutil.nullDate() ;
      A9741PrdHS = "" ;
      A9742PrdFHS = GXutil.nullDate() ;
      A5887PrdReach = "" ;
      A10119PrdColIdx = "" ;
      A10881PrdLote = "" ;
      A10935PrdRTM = "" ;
      A10936PrdCtw1 = "" ;
      A10937PrdCtw2 = "" ;
      A10938PrdCtw3 = "" ;
      A11663PrdCtw4 = "" ;
      A11196PrdNroCAS = "" ;
      A11363PrdGots = "" ;
      A11364PrdHm = "" ;
      A11614PrdEINECS = "" ;
      A11615PrdFuncion = "" ;
      A11616PrdNmQu = "" ;
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
      Z737PrdUcpDsc = "" ;
      Z736PrdUcoDsc = "" ;
      Z794PrvNom = "" ;
      Z857ValDsc = "" ;
      Z837TipDtoDto = DecimalUtil.ZERO ;
      Z630MetDsc = "" ;
      Z6302TipPrdDsc = "" ;
      Z9610SubFamDsc = "" ;
      T00M814_A743PrdUniCon = new byte[1] ;
      T00M814_A856ValCod = new byte[1] ;
      T00M814_A6301TipPrdCod = new short[1] ;
      T00M814_n6301TipPrdCod = new boolean[] {false} ;
      T00M814_A9609SubFamCod = new byte[1] ;
      T00M814_n9609SubFamCod = new boolean[] {false} ;
      T00M814_A719PrdNum = new String[] {""} ;
      T00M814_n719PrdNum = new boolean[] {false} ;
      T00M814_A407EmprNom = new String[] {""} ;
      T00M814_n407EmprNom = new boolean[] {false} ;
      T00M814_A718PrdNom = new String[] {""} ;
      T00M814_A703PrdDscTec = new String[] {""} ;
      T00M814_A737PrdUcpDsc = new String[] {""} ;
      T00M814_n737PrdUcpDsc = new boolean[] {false} ;
      T00M814_A736PrdUcoDsc = new String[] {""} ;
      T00M814_n736PrdUcoDsc = new boolean[] {false} ;
      T00M814_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A794PrvNom = new String[] {""} ;
      T00M814_n794PrvNom = new boolean[] {false} ;
      T00M814_A728PrdRefPrv = new String[] {""} ;
      T00M814_A734PrdSus = new String[] {""} ;
      T00M814_n734PrdSus = new boolean[] {false} ;
      T00M814_A857ValDsc = new String[] {""} ;
      T00M814_n857ValDsc = new boolean[] {false} ;
      T00M814_A727PrdRec = new String[] {""} ;
      T00M814_A682PrdCalNec = new String[] {""} ;
      T00M814_A698PrdDetPar = new String[] {""} ;
      T00M814_A730PrdSit = new byte[1] ;
      T00M814_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_n837TipDtoDto = new boolean[] {false} ;
      T00M814_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T00M814_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A731PrdStkMinD = new short[1] ;
      T00M814_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A699PrdDiaRot = new short[1] ;
      T00M814_A722PrdPlaEnt = new short[1] ;
      T00M814_A630MetDsc = new String[] {""} ;
      T00M814_n630MetDsc = new boolean[] {false} ;
      T00M814_A716PrdLotMin = new short[1] ;
      T00M814_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00M814_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      T00M814_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T00M814_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A738PrdUltCCC = new short[1] ;
      T00M814_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A695PrdConCC = new short[1] ;
      T00M814_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00M814_A1193PrdPosX = new short[1] ;
      T00M814_A1194PrdPosY = new byte[1] ;
      T00M814_A1643PrdTip = new String[] {""} ;
      T00M814_A1644PrdDqo = new short[1] ;
      T00M814_A3004PrdRev = new String[] {""} ;
      T00M814_A3273PrdTnq = new byte[1] ;
      T00M814_A4692PrdNom2 = new String[] {""} ;
      T00M814_A4693PrdNum2 = new String[] {""} ;
      T00M814_A4694PrdObs = new String[] {""} ;
      T00M814_A4338PrdUMeFo = new byte[1] ;
      T00M814_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A5418PrdSalM = new String[] {""} ;
      T00M814_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A6302TipPrdDsc = new String[] {""} ;
      T00M814_n6302TipPrdDsc = new boolean[] {false} ;
      T00M814_A6191PrdNumCent = new String[] {""} ;
      T00M814_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A7260PrdHorMad = new byte[1] ;
      T00M814_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A8896PrdPesCon = new byte[1] ;
      T00M814_A8897PrdPesTerm = new String[] {""} ;
      T00M814_A8936PrdSal = new String[] {""} ;
      T00M814_A9610SubFamDsc = new String[] {""} ;
      T00M814_n9610SubFamDsc = new boolean[] {false} ;
      T00M814_A9731PrdInc = new String[] {""} ;
      T00M814_A9732PrdComp = new String[] {""} ;
      T00M814_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M814_A9734PrdNCAS = new String[] {""} ;
      T00M814_A9739PrdFT = new String[] {""} ;
      T00M814_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      T00M814_A9741PrdHS = new String[] {""} ;
      T00M814_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      T00M814_A5887PrdReach = new String[] {""} ;
      T00M814_A5888PrdOkotex = new String[] {""} ;
      T00M814_A10119PrdColIdx = new String[] {""} ;
      T00M814_A10881PrdLote = new String[] {""} ;
      T00M814_A10935PrdRTM = new String[] {""} ;
      T00M814_A10936PrdCtw1 = new String[] {""} ;
      T00M814_A10937PrdCtw2 = new String[] {""} ;
      T00M814_A10938PrdCtw3 = new String[] {""} ;
      T00M814_A11663PrdCtw4 = new String[] {""} ;
      T00M814_A11196PrdNroCAS = new String[] {""} ;
      T00M814_A11363PrdGots = new String[] {""} ;
      T00M814_A11364PrdHm = new String[] {""} ;
      T00M814_A11470PrdConct = new short[1] ;
      T00M814_A11614PrdEINECS = new String[] {""} ;
      T00M814_A11615PrdFuncion = new String[] {""} ;
      T00M814_A11616PrdNmQu = new String[] {""} ;
      T00M814_A11687PrdList = new String[] {""} ;
      T00M814_A396EmprCod = new String[] {""} ;
      T00M814_A629MetCod = new byte[1] ;
      T00M814_n629MetCod = new boolean[] {false} ;
      T00M814_A795PrvNum = new int[1] ;
      T00M814_A835TipDtoCod = new byte[1] ;
      T00M814_n835TipDtoCod = new boolean[] {false} ;
      T00M814_A742PrdUniCom = new byte[1] ;
      T00M84_A407EmprNom = new String[] {""} ;
      T00M84_n407EmprNom = new boolean[] {false} ;
      T00M85_A630MetDsc = new String[] {""} ;
      T00M85_n630MetDsc = new boolean[] {false} ;
      T00M86_A794PrvNom = new String[] {""} ;
      T00M86_n794PrvNom = new boolean[] {false} ;
      T00M87_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M87_n837TipDtoDto = new boolean[] {false} ;
      T00M88_A737PrdUcpDsc = new String[] {""} ;
      T00M88_n737PrdUcpDsc = new boolean[] {false} ;
      T00M89_A736PrdUcoDsc = new String[] {""} ;
      T00M89_n736PrdUcoDsc = new boolean[] {false} ;
      T00M810_A857ValDsc = new String[] {""} ;
      T00M810_n857ValDsc = new boolean[] {false} ;
      T00M811_A6302TipPrdDsc = new String[] {""} ;
      T00M811_n6302TipPrdDsc = new boolean[] {false} ;
      T00M812_A9610SubFamDsc = new String[] {""} ;
      T00M812_n9610SubFamDsc = new boolean[] {false} ;
      T00M815_A407EmprNom = new String[] {""} ;
      T00M815_n407EmprNom = new boolean[] {false} ;
      T00M816_A630MetDsc = new String[] {""} ;
      T00M816_n630MetDsc = new boolean[] {false} ;
      T00M817_A794PrvNom = new String[] {""} ;
      T00M817_n794PrvNom = new boolean[] {false} ;
      T00M818_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M818_n837TipDtoDto = new boolean[] {false} ;
      T00M819_A737PrdUcpDsc = new String[] {""} ;
      T00M819_n737PrdUcpDsc = new boolean[] {false} ;
      T00M820_A736PrdUcoDsc = new String[] {""} ;
      T00M820_n736PrdUcoDsc = new boolean[] {false} ;
      T00M821_A857ValDsc = new String[] {""} ;
      T00M821_n857ValDsc = new boolean[] {false} ;
      T00M822_A6302TipPrdDsc = new String[] {""} ;
      T00M822_n6302TipPrdDsc = new boolean[] {false} ;
      T00M823_A9610SubFamDsc = new String[] {""} ;
      T00M823_n9610SubFamDsc = new boolean[] {false} ;
      T00M824_A396EmprCod = new String[] {""} ;
      T00M824_A719PrdNum = new String[] {""} ;
      T00M824_n719PrdNum = new boolean[] {false} ;
      T00M83_A743PrdUniCon = new byte[1] ;
      T00M83_A856ValCod = new byte[1] ;
      T00M83_A6301TipPrdCod = new short[1] ;
      T00M83_n6301TipPrdCod = new boolean[] {false} ;
      T00M83_A9609SubFamCod = new byte[1] ;
      T00M83_n9609SubFamCod = new boolean[] {false} ;
      T00M83_A719PrdNum = new String[] {""} ;
      T00M83_n719PrdNum = new boolean[] {false} ;
      T00M83_A718PrdNom = new String[] {""} ;
      T00M83_A703PrdDscTec = new String[] {""} ;
      T00M83_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A728PrdRefPrv = new String[] {""} ;
      T00M83_A734PrdSus = new String[] {""} ;
      T00M83_n734PrdSus = new boolean[] {false} ;
      T00M83_A727PrdRec = new String[] {""} ;
      T00M83_A682PrdCalNec = new String[] {""} ;
      T00M83_A698PrdDetPar = new String[] {""} ;
      T00M83_A730PrdSit = new byte[1] ;
      T00M83_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T00M83_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A731PrdStkMinD = new short[1] ;
      T00M83_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A699PrdDiaRot = new short[1] ;
      T00M83_A722PrdPlaEnt = new short[1] ;
      T00M83_A716PrdLotMin = new short[1] ;
      T00M83_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00M83_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      T00M83_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T00M83_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A738PrdUltCCC = new short[1] ;
      T00M83_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A695PrdConCC = new short[1] ;
      T00M83_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00M83_A1193PrdPosX = new short[1] ;
      T00M83_A1194PrdPosY = new byte[1] ;
      T00M83_A1643PrdTip = new String[] {""} ;
      T00M83_A1644PrdDqo = new short[1] ;
      T00M83_A3004PrdRev = new String[] {""} ;
      T00M83_A3273PrdTnq = new byte[1] ;
      T00M83_A4692PrdNom2 = new String[] {""} ;
      T00M83_A4693PrdNum2 = new String[] {""} ;
      T00M83_A4694PrdObs = new String[] {""} ;
      T00M83_A4338PrdUMeFo = new byte[1] ;
      T00M83_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A5418PrdSalM = new String[] {""} ;
      T00M83_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A6191PrdNumCent = new String[] {""} ;
      T00M83_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A7260PrdHorMad = new byte[1] ;
      T00M83_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A8896PrdPesCon = new byte[1] ;
      T00M83_A8897PrdPesTerm = new String[] {""} ;
      T00M83_A8936PrdSal = new String[] {""} ;
      T00M83_A9731PrdInc = new String[] {""} ;
      T00M83_A9732PrdComp = new String[] {""} ;
      T00M83_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M83_A9734PrdNCAS = new String[] {""} ;
      T00M83_A9739PrdFT = new String[] {""} ;
      T00M83_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      T00M83_A9741PrdHS = new String[] {""} ;
      T00M83_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      T00M83_A5887PrdReach = new String[] {""} ;
      T00M83_A5888PrdOkotex = new String[] {""} ;
      T00M83_A10119PrdColIdx = new String[] {""} ;
      T00M83_A10881PrdLote = new String[] {""} ;
      T00M83_A10935PrdRTM = new String[] {""} ;
      T00M83_A10936PrdCtw1 = new String[] {""} ;
      T00M83_A10937PrdCtw2 = new String[] {""} ;
      T00M83_A10938PrdCtw3 = new String[] {""} ;
      T00M83_A11663PrdCtw4 = new String[] {""} ;
      T00M83_A11196PrdNroCAS = new String[] {""} ;
      T00M83_A11363PrdGots = new String[] {""} ;
      T00M83_A11364PrdHm = new String[] {""} ;
      T00M83_A11470PrdConct = new short[1] ;
      T00M83_A11614PrdEINECS = new String[] {""} ;
      T00M83_A11615PrdFuncion = new String[] {""} ;
      T00M83_A11616PrdNmQu = new String[] {""} ;
      T00M83_A11687PrdList = new String[] {""} ;
      T00M83_A396EmprCod = new String[] {""} ;
      T00M83_A629MetCod = new byte[1] ;
      T00M83_n629MetCod = new boolean[] {false} ;
      T00M83_A795PrvNum = new int[1] ;
      T00M83_A835TipDtoCod = new byte[1] ;
      T00M83_n835TipDtoCod = new boolean[] {false} ;
      T00M83_A742PrdUniCom = new byte[1] ;
      sMode29 = "" ;
      T00M825_A396EmprCod = new String[] {""} ;
      T00M825_A719PrdNum = new String[] {""} ;
      T00M825_n719PrdNum = new boolean[] {false} ;
      T00M826_A396EmprCod = new String[] {""} ;
      T00M826_A719PrdNum = new String[] {""} ;
      T00M826_n719PrdNum = new boolean[] {false} ;
      T00M82_A743PrdUniCon = new byte[1] ;
      T00M82_A856ValCod = new byte[1] ;
      T00M82_A6301TipPrdCod = new short[1] ;
      T00M82_n6301TipPrdCod = new boolean[] {false} ;
      T00M82_A9609SubFamCod = new byte[1] ;
      T00M82_n9609SubFamCod = new boolean[] {false} ;
      T00M82_A719PrdNum = new String[] {""} ;
      T00M82_n719PrdNum = new boolean[] {false} ;
      T00M82_A718PrdNom = new String[] {""} ;
      T00M82_A703PrdDscTec = new String[] {""} ;
      T00M82_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A728PrdRefPrv = new String[] {""} ;
      T00M82_A734PrdSus = new String[] {""} ;
      T00M82_n734PrdSus = new boolean[] {false} ;
      T00M82_A727PrdRec = new String[] {""} ;
      T00M82_A682PrdCalNec = new String[] {""} ;
      T00M82_A698PrdDetPar = new String[] {""} ;
      T00M82_A730PrdSit = new byte[1] ;
      T00M82_A729PrdRotRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A709PrdFecPre = new java.util.Date[] {GXutil.nullDate()} ;
      T00M82_A725PrdPreAnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A696PrdConDia = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A731PrdStkMinD = new short[1] ;
      T00M82_A732PrdStkMinU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A699PrdDiaRot = new short[1] ;
      T00M82_A722PrdPlaEnt = new short[1] ;
      T00M82_A716PrdLotMin = new short[1] ;
      T00M82_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A713PrdFulEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00M82_A714PrdFulPed = new java.util.Date[] {GXutil.nullDate()} ;
      T00M82_A712PrdFulCC = new java.util.Date[] {GXutil.nullDate()} ;
      T00M82_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A740PrdUltECC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A738PrdUltCCC = new short[1] ;
      T00M82_A739PrdUltDCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A700PrdDifCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A695PrdConCC = new short[1] ;
      T00M82_A750PrdValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A332DifValStk = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A708PrdFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T00M82_A1193PrdPosX = new short[1] ;
      T00M82_A1194PrdPosY = new byte[1] ;
      T00M82_A1643PrdTip = new String[] {""} ;
      T00M82_A1644PrdDqo = new short[1] ;
      T00M82_A3004PrdRev = new String[] {""} ;
      T00M82_A3273PrdTnq = new byte[1] ;
      T00M82_A4692PrdNom2 = new String[] {""} ;
      T00M82_A4693PrdNum2 = new String[] {""} ;
      T00M82_A4694PrdObs = new String[] {""} ;
      T00M82_A4338PrdUMeFo = new byte[1] ;
      T00M82_A5255PrdPreAc2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A5416PrdDensS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A5417PrdConcS = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A5418PrdSalM = new String[] {""} ;
      T00M82_A5590PrdSolub = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A6191PrdNumCent = new String[] {""} ;
      T00M82_A7226PrdNumct1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A7227PrdNumct2 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A7260PrdHorMad = new byte[1] ;
      T00M82_A8659PrdExiAlmc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A8896PrdPesCon = new byte[1] ;
      T00M82_A8897PrdPesTerm = new String[] {""} ;
      T00M82_A8936PrdSal = new String[] {""} ;
      T00M82_A9731PrdInc = new String[] {""} ;
      T00M82_A9732PrdComp = new String[] {""} ;
      T00M82_A9733PrdAox = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M82_A9734PrdNCAS = new String[] {""} ;
      T00M82_A9739PrdFT = new String[] {""} ;
      T00M82_A9740PrdFFT = new java.util.Date[] {GXutil.nullDate()} ;
      T00M82_A9741PrdHS = new String[] {""} ;
      T00M82_A9742PrdFHS = new java.util.Date[] {GXutil.nullDate()} ;
      T00M82_A5887PrdReach = new String[] {""} ;
      T00M82_A5888PrdOkotex = new String[] {""} ;
      T00M82_A10119PrdColIdx = new String[] {""} ;
      T00M82_A10881PrdLote = new String[] {""} ;
      T00M82_A10935PrdRTM = new String[] {""} ;
      T00M82_A10936PrdCtw1 = new String[] {""} ;
      T00M82_A10937PrdCtw2 = new String[] {""} ;
      T00M82_A10938PrdCtw3 = new String[] {""} ;
      T00M82_A11663PrdCtw4 = new String[] {""} ;
      T00M82_A11196PrdNroCAS = new String[] {""} ;
      T00M82_A11363PrdGots = new String[] {""} ;
      T00M82_A11364PrdHm = new String[] {""} ;
      T00M82_A11470PrdConct = new short[1] ;
      T00M82_A11614PrdEINECS = new String[] {""} ;
      T00M82_A11615PrdFuncion = new String[] {""} ;
      T00M82_A11616PrdNmQu = new String[] {""} ;
      T00M82_A11687PrdList = new String[] {""} ;
      T00M82_A396EmprCod = new String[] {""} ;
      T00M82_A629MetCod = new byte[1] ;
      T00M82_n629MetCod = new boolean[] {false} ;
      T00M82_A795PrvNum = new int[1] ;
      T00M82_A835TipDtoCod = new byte[1] ;
      T00M82_n835TipDtoCod = new boolean[] {false} ;
      T00M82_A742PrdUniCom = new byte[1] ;
      T00M830_A407EmprNom = new String[] {""} ;
      T00M830_n407EmprNom = new boolean[] {false} ;
      T00M831_A737PrdUcpDsc = new String[] {""} ;
      T00M831_n737PrdUcpDsc = new boolean[] {false} ;
      T00M832_A736PrdUcoDsc = new String[] {""} ;
      T00M832_n736PrdUcoDsc = new boolean[] {false} ;
      T00M833_A794PrvNom = new String[] {""} ;
      T00M833_n794PrvNom = new boolean[] {false} ;
      T00M834_A857ValDsc = new String[] {""} ;
      T00M834_n857ValDsc = new boolean[] {false} ;
      T00M835_A837TipDtoDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00M835_n837TipDtoDto = new boolean[] {false} ;
      T00M836_A630MetDsc = new String[] {""} ;
      T00M836_n630MetDsc = new boolean[] {false} ;
      T00M837_A6302TipPrdDsc = new String[] {""} ;
      T00M837_n6302TipPrdDsc = new boolean[] {false} ;
      T00M838_A9610SubFamDsc = new String[] {""} ;
      T00M838_n9610SubFamDsc = new boolean[] {false} ;
      T00M839_A396EmprCod = new String[] {""} ;
      T00M839_A719PrdNum = new String[] {""} ;
      T00M839_n719PrdNum = new boolean[] {false} ;
      T00M839_A13217NormaID = new String[] {""} ;
      T00M840_A396EmprCod = new String[] {""} ;
      T00M840_A719PrdNum = new String[] {""} ;
      T00M840_n719PrdNum = new boolean[] {false} ;
      T00M840_A13586TheList = new String[] {""} ;
      T00M841_A396EmprCod = new String[] {""} ;
      T00M841_A5532Lb_numero = new int[1] ;
      T00M841_A5555Lb_opcion = new String[] {""} ;
      T00M841_A13460Lb_linCP = new short[1] ;
      T00M841_A13458Lb_TipCP = new String[] {""} ;
      T00M842_A396EmprCod = new String[] {""} ;
      T00M842_A13418AlbProID = new int[1] ;
      T00M842_A13442AlbProLine = new short[1] ;
      T00M843_A396EmprCod = new String[] {""} ;
      T00M843_A13324LDESID = new int[1] ;
      T00M843_A13333LDESNPeque = new String[] {""} ;
      T00M843_A13337LDESComb = new String[] {""} ;
      T00M843_A13339LDESFondo = new String[] {""} ;
      T00M843_A13342LDESLinea = new short[1] ;
      T00M844_A396EmprCod = new String[] {""} ;
      T00M844_A13312Lb_NLab = new int[1] ;
      T00M844_A13305Lb_IDVeces = new short[1] ;
      T00M844_A13306Lb_LinID = new short[1] ;
      T00M845_A396EmprCod = new String[] {""} ;
      T00M845_A12673LavMqId = new int[1] ;
      T00M845_A12692LavMqLnPq = new short[1] ;
      T00M845_A12681LavMqLn = new short[1] ;
      T00M846_A396EmprCod = new String[] {""} ;
      T00M846_A719PrdNum = new String[] {""} ;
      T00M846_n719PrdNum = new boolean[] {false} ;
      T00M846_A9713Tb1_Cod = new short[1] ;
      T00M847_A396EmprCod = new String[] {""} ;
      T00M847_A12236PrdNumD = new String[] {""} ;
      T00M847_A719PrdNum = new String[] {""} ;
      T00M847_n719PrdNum = new boolean[] {false} ;
      T00M848_A396EmprCod = new String[] {""} ;
      T00M848_A12225DocDisID = new long[1] ;
      T00M848_A12226LinDisID = new short[1] ;
      T00M849_A396EmprCod = new String[] {""} ;
      T00M849_A12225DocDisID = new long[1] ;
      T00M850_A396EmprCod = new String[] {""} ;
      T00M850_A12205OrdenCID = new long[1] ;
      T00M850_A12206OrdenCLnId = new short[1] ;
      T00M851_A396EmprCod = new String[] {""} ;
      T00M851_A719PrdNum = new String[] {""} ;
      T00M851_n719PrdNum = new boolean[] {false} ;
      T00M851_A11664LoteID = new String[] {""} ;
      T00M851_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00M852_A396EmprCod = new String[] {""} ;
      T00M852_A4850DevComCod = new int[1] ;
      T00M852_A719PrdNum = new String[] {""} ;
      T00M852_n719PrdNum = new boolean[] {false} ;
      T00M853_A396EmprCod = new String[] {""} ;
      T00M853_A252CliCod = new int[1] ;
      T00M853_A494ForSer = new String[] {""} ;
      T00M853_A482ForColNom = new String[] {""} ;
      T00M853_A483ForColNum = new int[1] ;
      T00M853_A831TipColCod = new byte[1] ;
      T00M853_A3571EnsCod = new String[] {""} ;
      T00M853_A3582EnsLin = new short[1] ;
      T00M854_A396EmprCod = new String[] {""} ;
      T00M854_A129BarCod = new int[1] ;
      T00M854_A132BarCodReo = new byte[1] ;
      T00M854_A130BarCodPar = new String[] {""} ;
      T00M854_A4075recestncol = new byte[1] ;
      T00M854_A4076recestnpro = new byte[1] ;
      T00M854_A4108recestlin = new short[1] ;
      T00M855_A396EmprCod = new String[] {""} ;
      T00M855_A4052EstNumFor = new int[1] ;
      T00M855_A4053EstNumCol = new byte[1] ;
      T00M855_A4090EstEspLin = new byte[1] ;
      T00M856_A396EmprCod = new String[] {""} ;
      T00M856_A4052EstNumFor = new int[1] ;
      T00M856_A4053EstNumCol = new byte[1] ;
      T00M856_A4084EstProLin = new byte[1] ;
      T00M857_A396EmprCod = new String[] {""} ;
      T00M857_A11644TransferId = new long[1] ;
      T00M857_A11653TransferLn = new int[1] ;
      T00M858_A396EmprCod = new String[] {""} ;
      T00M858_A11634TaesId = new String[] {""} ;
      T00M858_A11637TaesLn = new short[1] ;
      T00M858_A11641TaesLnP = new short[1] ;
      T00M859_A396EmprCod = new String[] {""} ;
      T00M859_A719PrdNum = new String[] {""} ;
      T00M859_n719PrdNum = new boolean[] {false} ;
      T00M859_A11329H_stklin = new long[1] ;
      T00M860_A396EmprCod = new String[] {""} ;
      T00M860_A11270Pot_num = new int[1] ;
      T00M860_A11271Pot_lin = new short[1] ;
      T00M861_A396EmprCod = new String[] {""} ;
      T00M861_A719PrdNum = new String[] {""} ;
      T00M861_n719PrdNum = new boolean[] {false} ;
      T00M861_A11199PrdNcasC = new String[] {""} ;
      T00M862_A396EmprCod = new String[] {""} ;
      T00M862_A719PrdNum = new String[] {""} ;
      T00M862_n719PrdNum = new boolean[] {false} ;
      T00M862_A11197CFraseR = new String[] {""} ;
      T00M863_A396EmprCod = new String[] {""} ;
      T00M863_A10243Jt_codigo = new short[1] ;
      T00M863_A10246Jt_ord = new short[1] ;
      T00M864_A396EmprCod = new String[] {""} ;
      T00M864_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00M864_A10238Bny_lin = new short[1] ;
      T00M865_A396EmprCod = new String[] {""} ;
      T00M865_A129BarCod = new int[1] ;
      T00M865_A132BarCodReo = new byte[1] ;
      T00M865_A130BarCodPar = new String[] {""} ;
      T00M865_A758ProCod = new String[] {""} ;
      T00M865_A194BarOrdLin = new short[1] ;
      T00M865_A719PrdNum = new String[] {""} ;
      T00M865_n719PrdNum = new boolean[] {false} ;
      T00M866_A396EmprCod = new String[] {""} ;
      T00M866_A719PrdNum = new String[] {""} ;
      T00M866_n719PrdNum = new boolean[] {false} ;
      T00M866_A9735Cod_Rgo = new String[] {""} ;
      T00M867_A396EmprCod = new String[] {""} ;
      T00M867_A719PrdNum = new String[] {""} ;
      T00M867_n719PrdNum = new boolean[] {false} ;
      T00M867_A9711Ct_codigo = new short[1] ;
      T00M868_A396EmprCod = new String[] {""} ;
      T00M868_A9652OeNum = new long[1] ;
      T00M868_A9653OeHdr = new int[1] ;
      T00M868_A9654OeHdrr = new byte[1] ;
      T00M868_A9655OeHdrp = new String[] {""} ;
      T00M868_A9656OeLinC = new byte[1] ;
      T00M868_A9657OeComb = new String[] {""} ;
      T00M868_A9658Oefondo = new String[] {""} ;
      T00M868_A9659OeMolCil = new byte[1] ;
      T00M868_A9686OePasLin = new short[1] ;
      T00M868_A9694OePasPLi = new short[1] ;
      T00M869_A396EmprCod = new String[] {""} ;
      T00M869_A9652OeNum = new long[1] ;
      T00M869_A9653OeHdr = new int[1] ;
      T00M869_A9654OeHdrr = new byte[1] ;
      T00M869_A9655OeHdrp = new String[] {""} ;
      T00M869_A9656OeLinC = new byte[1] ;
      T00M869_A9657OeComb = new String[] {""} ;
      T00M869_A9658Oefondo = new String[] {""} ;
      T00M869_A9659OeMolCil = new byte[1] ;
      T00M869_A9677OeMolLin = new byte[1] ;
      T00M870_A396EmprCod = new String[] {""} ;
      T00M870_A9578Pas_Num = new int[1] ;
      T00M870_A719PrdNum = new String[] {""} ;
      T00M870_n719PrdNum = new boolean[] {false} ;
      T00M871_A396EmprCod = new String[] {""} ;
      T00M871_A719PrdNum = new String[] {""} ;
      T00M871_n719PrdNum = new boolean[] {false} ;
      T00M871_A8908CC_AlmCod = new byte[1] ;
      T00M872_A396EmprCod = new String[] {""} ;
      T00M872_A719PrdNum = new String[] {""} ;
      T00M872_n719PrdNum = new boolean[] {false} ;
      T00M872_A8661Almc_Ln = new int[1] ;
      T00M873_A396EmprCod = new String[] {""} ;
      T00M873_A719PrdNum = new String[] {""} ;
      T00M873_n719PrdNum = new boolean[] {false} ;
      T00M873_A8648Mat_PrdN = new String[] {""} ;
      T00M874_A396EmprCod = new String[] {""} ;
      T00M874_A8585Pet_cod = new long[1] ;
      T00M874_A719PrdNum = new String[] {""} ;
      T00M874_n719PrdNum = new boolean[] {false} ;
      T00M875_A396EmprCod = new String[] {""} ;
      T00M875_A719PrdNum = new String[] {""} ;
      T00M875_n719PrdNum = new boolean[] {false} ;
      T00M875_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T00M876_A396EmprCod = new String[] {""} ;
      T00M876_A719PrdNum = new String[] {""} ;
      T00M876_n719PrdNum = new boolean[] {false} ;
      T00M876_A8366PrdAnyo = new short[1] ;
      T00M876_A8360PrdProv = new int[1] ;
      T00M877_A396EmprCod = new String[] {""} ;
      T00M877_A252CliCod = new int[1] ;
      T00M877_A494ForSer = new String[] {""} ;
      T00M877_A482ForColNom = new String[] {""} ;
      T00M877_A483ForColNum = new int[1] ;
      T00M877_A831TipColCod = new byte[1] ;
      T00M877_A7797Sim_lin = new short[1] ;
      T00M878_A396EmprCod = new String[] {""} ;
      T00M878_A7163Vir_Codigo = new int[1] ;
      T00M878_A719PrdNum = new String[] {""} ;
      T00M878_n719PrdNum = new boolean[] {false} ;
      T00M879_A396EmprCod = new String[] {""} ;
      T00M879_A6310Lb_TaAuxC = new String[] {""} ;
      T00M879_A6313lb_TaAuxL = new short[1] ;
      T00M879_A6378Lb_TauxLP = new short[1] ;
      T00M880_A396EmprCod = new String[] {""} ;
      T00M880_A6290PreCoNum = new int[1] ;
      T00M880_A719PrdNum = new String[] {""} ;
      T00M880_n719PrdNum = new boolean[] {false} ;
      T00M881_A396EmprCod = new String[] {""} ;
      T00M881_A719PrdNum = new String[] {""} ;
      T00M881_n719PrdNum = new boolean[] {false} ;
      T00M881_A6158PrdPrv = new int[1] ;
      T00M882_A396EmprCod = new String[] {""} ;
      T00M882_A719PrdNum = new String[] {""} ;
      T00M882_n719PrdNum = new boolean[] {false} ;
      T00M882_A5973PrdSusNum = new String[] {""} ;
      T00M883_A396EmprCod = new String[] {""} ;
      T00M883_A5612Lb_CodGru = new String[] {""} ;
      T00M883_A5615Lb_LinGru = new short[1] ;
      T00M884_A396EmprCod = new String[] {""} ;
      T00M884_A5532Lb_numero = new int[1] ;
      T00M884_A5555Lb_opcion = new String[] {""} ;
      T00M884_A5560Lb_LineaPr = new short[1] ;
      T00M885_A396EmprCod = new String[] {""} ;
      T00M885_A5532Lb_numero = new int[1] ;
      T00M885_A5555Lb_opcion = new String[] {""} ;
      T00M885_A5557Lb_LineaC = new short[1] ;
      T00M886_A396EmprCod = new String[] {""} ;
      T00M886_A5145SobCod = new int[1] ;
      T00M886_A719PrdNum = new String[] {""} ;
      T00M886_n719PrdNum = new boolean[] {false} ;
      T00M887_A396EmprCod = new String[] {""} ;
      T00M887_A4744RecPreCod = new int[1] ;
      T00M887_A4762RecPreLin = new short[1] ;
      T00M887_A4763RecPreNli = new short[1] ;
      T00M888_A396EmprCod = new String[] {""} ;
      T00M888_A4492HreBarCod = new int[1] ;
      T00M888_A4493HreBarReo = new byte[1] ;
      T00M888_A4494HreBarPar = new String[] {""} ;
      T00M888_A4495HreNumCie = new byte[1] ;
      T00M888_A4545HreLinMaq = new short[1] ;
      T00M888_A4550HreLinPro = new byte[1] ;
      T00M888_A4557HreRecLin = new short[1] ;
      T00M889_A396EmprCod = new String[] {""} ;
      T00M889_A4492HreBarCod = new int[1] ;
      T00M889_A4493HreBarReo = new byte[1] ;
      T00M889_A4494HreBarPar = new String[] {""} ;
      T00M889_A4495HreNumCie = new byte[1] ;
      T00M889_A4508HreLinMAL = new short[1] ;
      T00M889_A4509HreNumAny = new byte[1] ;
      T00M889_A719PrdNum = new String[] {""} ;
      T00M889_n719PrdNum = new boolean[] {false} ;
      T00M890_A396EmprCod = new String[] {""} ;
      T00M890_A252CliCod = new int[1] ;
      T00M890_A4415EstCol = new String[] {""} ;
      T00M890_A4416EstColLin = new short[1] ;
      T00M891_A396EmprCod = new String[] {""} ;
      T00M891_A129BarCod = new int[1] ;
      T00M891_A132BarCodReo = new byte[1] ;
      T00M891_A130BarCodPar = new String[] {""} ;
      T00M891_A2524DisComLin = new byte[1] ;
      T00M891_A1056DisComCod = new String[] {""} ;
      T00M891_A1032FonCod = new String[] {""} ;
      T00M891_A2124RecMolCod = new byte[1] ;
      T00M891_A2672RecPasLin = new short[1] ;
      T00M891_A2675RecPasPLi = new short[1] ;
      T00M892_A396EmprCod = new String[] {""} ;
      T00M892_A129BarCod = new int[1] ;
      T00M892_A132BarCodReo = new byte[1] ;
      T00M892_A130BarCodPar = new String[] {""} ;
      T00M892_A2524DisComLin = new byte[1] ;
      T00M892_A1056DisComCod = new String[] {""} ;
      T00M892_A1032FonCod = new String[] {""} ;
      T00M892_A2124RecMolCod = new byte[1] ;
      T00M892_A2126RecMolLin = new byte[1] ;
      T00M893_A396EmprCod = new String[] {""} ;
      T00M893_A2107PasCod = new String[] {""} ;
      T00M893_A719PrdNum = new String[] {""} ;
      T00M893_n719PrdNum = new boolean[] {false} ;
      T00M894_A396EmprCod = new String[] {""} ;
      T00M894_A2637HisEstHRu = new int[1] ;
      T00M894_A2636HisEstHRe = new byte[1] ;
      T00M894_A2635HisEstHPa = new String[] {""} ;
      T00M894_A2638HisEstLCo = new byte[1] ;
      T00M894_A2630HisEstCom = new String[] {""} ;
      T00M894_A2634HisEstFon = new String[] {""} ;
      T00M894_A719PrdNum = new String[] {""} ;
      T00M894_n719PrdNum = new boolean[] {false} ;
      T00M895_A396EmprCod = new String[] {""} ;
      T00M895_A252CliCod = new int[1] ;
      T00M895_A2141SerEst = new String[] {""} ;
      T00M895_A1013DibCli = new String[] {""} ;
      T00M895_A1014DibInt = new int[1] ;
      T00M895_A2074ColCom = new String[] {""} ;
      T00M895_A2078ColFon = new String[] {""} ;
      T00M895_A2098MolCod = new byte[1] ;
      T00M895_A2535ForPrdLin = new short[1] ;
      T00M896_A396EmprCod = new String[] {""} ;
      T00M896_A719PrdNum = new String[] {""} ;
      T00M896_n719PrdNum = new boolean[] {false} ;
      T00M896_A3342CCStkLin = new long[1] ;
      T00M897_A396EmprCod = new String[] {""} ;
      T00M897_A252CliCod = new int[1] ;
      T00M897_A2891HMaForSer = new String[] {""} ;
      T00M897_A2892HMaForCNom = new String[] {""} ;
      T00M897_A2893HMaForCNum = new int[1] ;
      T00M897_A2894HMaTipCCod = new byte[1] ;
      T00M897_A2895HMaForNumC = new int[1] ;
      T00M897_A2897HMaColLin = new short[1] ;
      T00M897_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00M897_A2907HmaLin = new short[1] ;
      T00M898_A396EmprCod = new String[] {""} ;
      T00M898_A129BarCod = new int[1] ;
      T00M898_A132BarCodReo = new byte[1] ;
      T00M898_A130BarCodPar = new String[] {""} ;
      T00M898_A2808RecLinMAL = new short[1] ;
      T00M898_A1377RecNumAny = new byte[1] ;
      T00M898_A719PrdNum = new String[] {""} ;
      T00M898_n719PrdNum = new boolean[] {false} ;
      T00M899_A396EmprCod = new String[] {""} ;
      T00M899_A129BarCod = new int[1] ;
      T00M899_A132BarCodReo = new byte[1] ;
      T00M899_A130BarCodPar = new String[] {""} ;
      T00M899_A2804RecLinMaq = new short[1] ;
      T00M899_A1273RecLinPro = new byte[1] ;
      T00M899_A811RecLin = new short[1] ;
      T00M8100_A396EmprCod = new String[] {""} ;
      T00M8100_A129BarCod = new int[1] ;
      T00M8100_A132BarCodReo = new byte[1] ;
      T00M8100_A130BarCodPar = new String[] {""} ;
      T00M8100_A2494BarDosPro = new String[] {""} ;
      T00M8100_A719PrdNum = new String[] {""} ;
      T00M8100_n719PrdNum = new boolean[] {false} ;
      T00M8101_A396EmprCod = new String[] {""} ;
      T00M8101_A1314EnsLabCod = new int[1] ;
      T00M8101_A1317EnsLabLin = new short[1] ;
      T00M8102_A396EmprCod = new String[] {""} ;
      T00M8102_A910Workstat = new String[] {""} ;
      T00M8102_A887EscMLin = new int[1] ;
      T00M8103_A396EmprCod = new String[] {""} ;
      T00M8103_A859CumCodCont = new int[1] ;
      T00M8103_A719PrdNum = new String[] {""} ;
      T00M8103_n719PrdNum = new boolean[] {false} ;
      T00M8104_A396EmprCod = new String[] {""} ;
      T00M8104_A719PrdNum = new String[] {""} ;
      T00M8104_n719PrdNum = new boolean[] {false} ;
      T00M8104_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T00M8105_A396EmprCod = new String[] {""} ;
      T00M8105_A486ForNumCol = new int[1] ;
      T00M8105_A715PrdLin = new short[1] ;
      T00M8106_A396EmprCod = new String[] {""} ;
      T00M8106_A719PrdNum = new String[] {""} ;
      T00M8106_n719PrdNum = new boolean[] {false} ;
      T00M8106_A681PrdAny = new short[1] ;
      T00M8107_A396EmprCod = new String[] {""} ;
      T00M8107_A719PrdNum = new String[] {""} ;
      T00M8107_n719PrdNum = new boolean[] {false} ;
      T00M8107_A688PrdComCod = new String[] {""} ;
      T00M8108_A396EmprCod = new String[] {""} ;
      T00M8108_A719PrdNum = new String[] {""} ;
      T00M8108_n719PrdNum = new boolean[] {false} ;
      T00M8108_A680PrdAltNum = new String[] {""} ;
      T00M8109_A396EmprCod = new String[] {""} ;
      T00M8109_A658PedCod = new int[1] ;
      T00M8109_A719PrdNum = new String[] {""} ;
      T00M8109_n719PrdNum = new boolean[] {false} ;
      T00M8110_A396EmprCod = new String[] {""} ;
      T00M8110_A486ForNumCol = new int[1] ;
      T00M8110_A309ColLin = new short[1] ;
      T00M8111_A396EmprCod = new String[] {""} ;
      T00M8111_A719PrdNum = new String[] {""} ;
      T00M8111_n719PrdNum = new boolean[] {false} ;
      T00M8111_A647NumCon = new int[1] ;
      T00M8112_A396EmprCod = new String[] {""} ;
      T00M8112_A719PrdNum = new String[] {""} ;
      T00M8112_n719PrdNum = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T00M8113_A942TermCod = new String[] {""} ;
      T00M8114_A942TermCod = new String[] {""} ;
      Z394EmpCodSus = "" ;
      Z735PrdSusNom = "" ;
      ZZ396EmprCod = "" ;
      ZZ719PrdNum = "" ;
      ZZ394EmpCodSus = "" ;
      ZZ735PrdSusNom = "" ;
      ZZ718PrdNom = "" ;
      ZZ703PrdDscTec = "" ;
      ZZ707PrdFacCon = DecimalUtil.ZERO ;
      ZZ728PrdRefPrv = "" ;
      ZZ734PrdSus = "" ;
      ZZ727PrdRec = "" ;
      ZZ682PrdCalNec = "" ;
      ZZ698PrdDetPar = "" ;
      ZZ729PrdRotRea = DecimalUtil.ZERO ;
      ZZ724PrdPreAct = DecimalUtil.ZERO ;
      ZZ709PrdFecPre = GXutil.nullDate() ;
      ZZ725PrdPreAnt = DecimalUtil.ZERO ;
      ZZ726PrdPreMed = DecimalUtil.ZERO ;
      ZZ696PrdConDia = DecimalUtil.ZERO ;
      ZZ732PrdStkMinU = DecimalUtil.ZERO ;
      ZZ721PrdNumUco = DecimalUtil.ZERO ;
      ZZ704PrdExiAlm = DecimalUtil.ZERO ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      ZZ685PrdCanRes = DecimalUtil.ZERO ;
      ZZ684PrdCanPen = DecimalUtil.ZERO ;
      ZZ713PrdFulEnt = GXutil.nullDate() ;
      ZZ714PrdFulPed = GXutil.nullDate() ;
      ZZ712PrdFulCC = GXutil.nullDate() ;
      ZZ706PrdExiCCP = DecimalUtil.ZERO ;
      ZZ740PrdUltECC = DecimalUtil.ZERO ;
      ZZ739PrdUltDCC = DecimalUtil.ZERO ;
      ZZ700PrdDifCC = DecimalUtil.ZERO ;
      ZZ750PrdValStk = DecimalUtil.ZERO ;
      ZZ332DifValStk = DecimalUtil.ZERO ;
      ZZ708PrdFecEnt = GXutil.nullDate() ;
      ZZ1643PrdTip = "" ;
      ZZ3004PrdRev = "" ;
      ZZ4692PrdNom2 = "" ;
      ZZ4693PrdNum2 = "" ;
      ZZ4694PrdObs = "" ;
      ZZ5255PrdPreAc2 = DecimalUtil.ZERO ;
      ZZ5416PrdDensS = DecimalUtil.ZERO ;
      ZZ5417PrdConcS = DecimalUtil.ZERO ;
      ZZ5418PrdSalM = "" ;
      ZZ5590PrdSolub = DecimalUtil.ZERO ;
      ZZ6191PrdNumCent = "" ;
      ZZ7226PrdNumct1 = DecimalUtil.ZERO ;
      ZZ7227PrdNumct2 = DecimalUtil.ZERO ;
      ZZ8659PrdExiAlmc = DecimalUtil.ZERO ;
      ZZ8897PrdPesTerm = "" ;
      ZZ8936PrdSal = "" ;
      ZZ9731PrdInc = "" ;
      ZZ9732PrdComp = "" ;
      ZZ9733PrdAox = DecimalUtil.ZERO ;
      ZZ9734PrdNCAS = "" ;
      ZZ9739PrdFT = "" ;
      ZZ9740PrdFFT = GXutil.nullDate() ;
      ZZ9741PrdHS = "" ;
      ZZ9742PrdFHS = GXutil.nullDate() ;
      ZZ5887PrdReach = "" ;
      ZZ5888PrdOkotex = "" ;
      ZZ10119PrdColIdx = "" ;
      ZZ10881PrdLote = "" ;
      ZZ10935PrdRTM = "" ;
      ZZ10936PrdCtw1 = "" ;
      ZZ10937PrdCtw2 = "" ;
      ZZ10938PrdCtw3 = "" ;
      ZZ11663PrdCtw4 = "" ;
      ZZ11196PrdNroCAS = "" ;
      ZZ11363PrdGots = "" ;
      ZZ11364PrdHm = "" ;
      ZZ11614PrdEINECS = "" ;
      ZZ11615PrdFuncion = "" ;
      ZZ11616PrdNmQu = "" ;
      ZZ11687PrdList = "" ;
      ZZ407EmprNom = "" ;
      ZZ630MetDsc = "" ;
      ZZ794PrvNom = "" ;
      ZZ837TipDtoDto = DecimalUtil.ZERO ;
      ZZ737PrdUcpDsc = "" ;
      ZZ736PrdUcoDsc = "" ;
      ZZ857ValDsc = "" ;
      ZZ6302TipPrdDsc = "" ;
      ZZ9610SubFamDsc = "" ;
      T00M813_A735PrdSusNom = new String[] {""} ;
      T00M813_n735PrdSusNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tprdger__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tprdger__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tprdger__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tprdger__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tprdger__default(),
         new Object[] {
             new Object[] {
            T00M82_A743PrdUniCon, T00M82_A856ValCod, T00M82_A6301TipPrdCod, T00M82_n6301TipPrdCod, T00M82_A9609SubFamCod, T00M82_n9609SubFamCod, T00M82_A719PrdNum, T00M82_A718PrdNom, T00M82_A703PrdDscTec, T00M82_A707PrdFacCon,
            T00M82_A728PrdRefPrv, T00M82_A734PrdSus, T00M82_n734PrdSus, T00M82_A727PrdRec, T00M82_A682PrdCalNec, T00M82_A698PrdDetPar, T00M82_A730PrdSit, T00M82_A729PrdRotRea, T00M82_A724PrdPreAct, T00M82_A709PrdFecPre,
            T00M82_A725PrdPreAnt, T00M82_A726PrdPreMed, T00M82_A696PrdConDia, T00M82_A731PrdStkMinD, T00M82_A732PrdStkMinU, T00M82_A699PrdDiaRot, T00M82_A722PrdPlaEnt, T00M82_A716PrdLotMin, T00M82_A721PrdNumUco, T00M82_A704PrdExiAlm,
            T00M82_A705PrdExiCC, T00M82_A685PrdCanRes, T00M82_A684PrdCanPen, T00M82_A713PrdFulEnt, T00M82_A714PrdFulPed, T00M82_A712PrdFulCC, T00M82_A706PrdExiCCP, T00M82_A740PrdUltECC, T00M82_A738PrdUltCCC, T00M82_A739PrdUltDCC,
            T00M82_A700PrdDifCC, T00M82_A695PrdConCC, T00M82_A750PrdValStk, T00M82_A332DifValStk, T00M82_A708PrdFecEnt, T00M82_A1193PrdPosX, T00M82_A1194PrdPosY, T00M82_A1643PrdTip, T00M82_A1644PrdDqo, T00M82_A3004PrdRev,
            T00M82_A3273PrdTnq, T00M82_A4692PrdNom2, T00M82_A4693PrdNum2, T00M82_A4694PrdObs, T00M82_A4338PrdUMeFo, T00M82_A5255PrdPreAc2, T00M82_A5416PrdDensS, T00M82_A5417PrdConcS, T00M82_A5418PrdSalM, T00M82_A5590PrdSolub,
            T00M82_A6191PrdNumCent, T00M82_A7226PrdNumct1, T00M82_A7227PrdNumct2, T00M82_A7260PrdHorMad, T00M82_A8659PrdExiAlmc, T00M82_A8896PrdPesCon, T00M82_A8897PrdPesTerm, T00M82_A8936PrdSal, T00M82_A9731PrdInc, T00M82_A9732PrdComp,
            T00M82_A9733PrdAox, T00M82_A9734PrdNCAS, T00M82_A9739PrdFT, T00M82_A9740PrdFFT, T00M82_A9741PrdHS, T00M82_A9742PrdFHS, T00M82_A5887PrdReach, T00M82_A5888PrdOkotex, T00M82_A10119PrdColIdx, T00M82_A10881PrdLote,
            T00M82_A10935PrdRTM, T00M82_A10936PrdCtw1, T00M82_A10937PrdCtw2, T00M82_A10938PrdCtw3, T00M82_A11663PrdCtw4, T00M82_A11196PrdNroCAS, T00M82_A11363PrdGots, T00M82_A11364PrdHm, T00M82_A11470PrdConct, T00M82_A11614PrdEINECS,
            T00M82_A11615PrdFuncion, T00M82_A11616PrdNmQu, T00M82_A11687PrdList, T00M82_A396EmprCod, T00M82_A629MetCod, T00M82_n629MetCod, T00M82_A795PrvNum, T00M82_A835TipDtoCod, T00M82_n835TipDtoCod, T00M82_A742PrdUniCom
            }
            , new Object[] {
            T00M83_A743PrdUniCon, T00M83_A856ValCod, T00M83_A6301TipPrdCod, T00M83_n6301TipPrdCod, T00M83_A9609SubFamCod, T00M83_n9609SubFamCod, T00M83_A719PrdNum, T00M83_A718PrdNom, T00M83_A703PrdDscTec, T00M83_A707PrdFacCon,
            T00M83_A728PrdRefPrv, T00M83_A734PrdSus, T00M83_n734PrdSus, T00M83_A727PrdRec, T00M83_A682PrdCalNec, T00M83_A698PrdDetPar, T00M83_A730PrdSit, T00M83_A729PrdRotRea, T00M83_A724PrdPreAct, T00M83_A709PrdFecPre,
            T00M83_A725PrdPreAnt, T00M83_A726PrdPreMed, T00M83_A696PrdConDia, T00M83_A731PrdStkMinD, T00M83_A732PrdStkMinU, T00M83_A699PrdDiaRot, T00M83_A722PrdPlaEnt, T00M83_A716PrdLotMin, T00M83_A721PrdNumUco, T00M83_A704PrdExiAlm,
            T00M83_A705PrdExiCC, T00M83_A685PrdCanRes, T00M83_A684PrdCanPen, T00M83_A713PrdFulEnt, T00M83_A714PrdFulPed, T00M83_A712PrdFulCC, T00M83_A706PrdExiCCP, T00M83_A740PrdUltECC, T00M83_A738PrdUltCCC, T00M83_A739PrdUltDCC,
            T00M83_A700PrdDifCC, T00M83_A695PrdConCC, T00M83_A750PrdValStk, T00M83_A332DifValStk, T00M83_A708PrdFecEnt, T00M83_A1193PrdPosX, T00M83_A1194PrdPosY, T00M83_A1643PrdTip, T00M83_A1644PrdDqo, T00M83_A3004PrdRev,
            T00M83_A3273PrdTnq, T00M83_A4692PrdNom2, T00M83_A4693PrdNum2, T00M83_A4694PrdObs, T00M83_A4338PrdUMeFo, T00M83_A5255PrdPreAc2, T00M83_A5416PrdDensS, T00M83_A5417PrdConcS, T00M83_A5418PrdSalM, T00M83_A5590PrdSolub,
            T00M83_A6191PrdNumCent, T00M83_A7226PrdNumct1, T00M83_A7227PrdNumct2, T00M83_A7260PrdHorMad, T00M83_A8659PrdExiAlmc, T00M83_A8896PrdPesCon, T00M83_A8897PrdPesTerm, T00M83_A8936PrdSal, T00M83_A9731PrdInc, T00M83_A9732PrdComp,
            T00M83_A9733PrdAox, T00M83_A9734PrdNCAS, T00M83_A9739PrdFT, T00M83_A9740PrdFFT, T00M83_A9741PrdHS, T00M83_A9742PrdFHS, T00M83_A5887PrdReach, T00M83_A5888PrdOkotex, T00M83_A10119PrdColIdx, T00M83_A10881PrdLote,
            T00M83_A10935PrdRTM, T00M83_A10936PrdCtw1, T00M83_A10937PrdCtw2, T00M83_A10938PrdCtw3, T00M83_A11663PrdCtw4, T00M83_A11196PrdNroCAS, T00M83_A11363PrdGots, T00M83_A11364PrdHm, T00M83_A11470PrdConct, T00M83_A11614PrdEINECS,
            T00M83_A11615PrdFuncion, T00M83_A11616PrdNmQu, T00M83_A11687PrdList, T00M83_A396EmprCod, T00M83_A629MetCod, T00M83_n629MetCod, T00M83_A795PrvNum, T00M83_A835TipDtoCod, T00M83_n835TipDtoCod, T00M83_A742PrdUniCom
            }
            , new Object[] {
            T00M84_A407EmprNom, T00M84_n407EmprNom
            }
            , new Object[] {
            T00M85_A630MetDsc, T00M85_n630MetDsc
            }
            , new Object[] {
            T00M86_A794PrvNom, T00M86_n794PrvNom
            }
            , new Object[] {
            T00M87_A837TipDtoDto, T00M87_n837TipDtoDto
            }
            , new Object[] {
            T00M88_A737PrdUcpDsc, T00M88_n737PrdUcpDsc
            }
            , new Object[] {
            T00M89_A736PrdUcoDsc, T00M89_n736PrdUcoDsc
            }
            , new Object[] {
            T00M810_A857ValDsc, T00M810_n857ValDsc
            }
            , new Object[] {
            T00M811_A6302TipPrdDsc, T00M811_n6302TipPrdDsc
            }
            , new Object[] {
            T00M812_A9610SubFamDsc, T00M812_n9610SubFamDsc
            }
            , new Object[] {
            T00M813_A735PrdSusNom, T00M813_n735PrdSusNom
            }
            , new Object[] {
            T00M814_A743PrdUniCon, T00M814_A856ValCod, T00M814_A6301TipPrdCod, T00M814_n6301TipPrdCod, T00M814_A9609SubFamCod, T00M814_n9609SubFamCod, T00M814_A719PrdNum, T00M814_A407EmprNom, T00M814_n407EmprNom, T00M814_A718PrdNom,
            T00M814_A703PrdDscTec, T00M814_A737PrdUcpDsc, T00M814_n737PrdUcpDsc, T00M814_A736PrdUcoDsc, T00M814_n736PrdUcoDsc, T00M814_A707PrdFacCon, T00M814_A794PrvNom, T00M814_n794PrvNom, T00M814_A728PrdRefPrv, T00M814_A734PrdSus,
            T00M814_n734PrdSus, T00M814_A857ValDsc, T00M814_n857ValDsc, T00M814_A727PrdRec, T00M814_A682PrdCalNec, T00M814_A698PrdDetPar, T00M814_A730PrdSit, T00M814_A729PrdRotRea, T00M814_A837TipDtoDto, T00M814_n837TipDtoDto,
            T00M814_A724PrdPreAct, T00M814_A709PrdFecPre, T00M814_A725PrdPreAnt, T00M814_A726PrdPreMed, T00M814_A696PrdConDia, T00M814_A731PrdStkMinD, T00M814_A732PrdStkMinU, T00M814_A699PrdDiaRot, T00M814_A722PrdPlaEnt, T00M814_A630MetDsc,
            T00M814_n630MetDsc, T00M814_A716PrdLotMin, T00M814_A721PrdNumUco, T00M814_A704PrdExiAlm, T00M814_A705PrdExiCC, T00M814_A685PrdCanRes, T00M814_A684PrdCanPen, T00M814_A713PrdFulEnt, T00M814_A714PrdFulPed, T00M814_A712PrdFulCC,
            T00M814_A706PrdExiCCP, T00M814_A740PrdUltECC, T00M814_A738PrdUltCCC, T00M814_A739PrdUltDCC, T00M814_A700PrdDifCC, T00M814_A695PrdConCC, T00M814_A750PrdValStk, T00M814_A332DifValStk, T00M814_A708PrdFecEnt, T00M814_A1193PrdPosX,
            T00M814_A1194PrdPosY, T00M814_A1643PrdTip, T00M814_A1644PrdDqo, T00M814_A3004PrdRev, T00M814_A3273PrdTnq, T00M814_A4692PrdNom2, T00M814_A4693PrdNum2, T00M814_A4694PrdObs, T00M814_A4338PrdUMeFo, T00M814_A5255PrdPreAc2,
            T00M814_A5416PrdDensS, T00M814_A5417PrdConcS, T00M814_A5418PrdSalM, T00M814_A5590PrdSolub, T00M814_A6302TipPrdDsc, T00M814_n6302TipPrdDsc, T00M814_A6191PrdNumCent, T00M814_A7226PrdNumct1, T00M814_A7227PrdNumct2, T00M814_A7260PrdHorMad,
            T00M814_A8659PrdExiAlmc, T00M814_A8896PrdPesCon, T00M814_A8897PrdPesTerm, T00M814_A8936PrdSal, T00M814_A9610SubFamDsc, T00M814_n9610SubFamDsc, T00M814_A9731PrdInc, T00M814_A9732PrdComp, T00M814_A9733PrdAox, T00M814_A9734PrdNCAS,
            T00M814_A9739PrdFT, T00M814_A9740PrdFFT, T00M814_A9741PrdHS, T00M814_A9742PrdFHS, T00M814_A5887PrdReach, T00M814_A5888PrdOkotex, T00M814_A10119PrdColIdx, T00M814_A10881PrdLote, T00M814_A10935PrdRTM, T00M814_A10936PrdCtw1,
            T00M814_A10937PrdCtw2, T00M814_A10938PrdCtw3, T00M814_A11663PrdCtw4, T00M814_A11196PrdNroCAS, T00M814_A11363PrdGots, T00M814_A11364PrdHm, T00M814_A11470PrdConct, T00M814_A11614PrdEINECS, T00M814_A11615PrdFuncion, T00M814_A11616PrdNmQu,
            T00M814_A11687PrdList, T00M814_A396EmprCod, T00M814_A629MetCod, T00M814_n629MetCod, T00M814_A795PrvNum, T00M814_A835TipDtoCod, T00M814_n835TipDtoCod, T00M814_A742PrdUniCom
            }
            , new Object[] {
            T00M815_A407EmprNom, T00M815_n407EmprNom
            }
            , new Object[] {
            T00M816_A630MetDsc, T00M816_n630MetDsc
            }
            , new Object[] {
            T00M817_A794PrvNom, T00M817_n794PrvNom
            }
            , new Object[] {
            T00M818_A837TipDtoDto, T00M818_n837TipDtoDto
            }
            , new Object[] {
            T00M819_A737PrdUcpDsc, T00M819_n737PrdUcpDsc
            }
            , new Object[] {
            T00M820_A736PrdUcoDsc, T00M820_n736PrdUcoDsc
            }
            , new Object[] {
            T00M821_A857ValDsc, T00M821_n857ValDsc
            }
            , new Object[] {
            T00M822_A6302TipPrdDsc, T00M822_n6302TipPrdDsc
            }
            , new Object[] {
            T00M823_A9610SubFamDsc, T00M823_n9610SubFamDsc
            }
            , new Object[] {
            T00M824_A396EmprCod, T00M824_A719PrdNum
            }
            , new Object[] {
            T00M825_A396EmprCod, T00M825_A719PrdNum
            }
            , new Object[] {
            T00M826_A396EmprCod, T00M826_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00M830_A407EmprNom, T00M830_n407EmprNom
            }
            , new Object[] {
            T00M831_A737PrdUcpDsc, T00M831_n737PrdUcpDsc
            }
            , new Object[] {
            T00M832_A736PrdUcoDsc, T00M832_n736PrdUcoDsc
            }
            , new Object[] {
            T00M833_A794PrvNom, T00M833_n794PrvNom
            }
            , new Object[] {
            T00M834_A857ValDsc, T00M834_n857ValDsc
            }
            , new Object[] {
            T00M835_A837TipDtoDto, T00M835_n837TipDtoDto
            }
            , new Object[] {
            T00M836_A630MetDsc, T00M836_n630MetDsc
            }
            , new Object[] {
            T00M837_A6302TipPrdDsc, T00M837_n6302TipPrdDsc
            }
            , new Object[] {
            T00M838_A9610SubFamDsc, T00M838_n9610SubFamDsc
            }
            , new Object[] {
            T00M839_A396EmprCod, T00M839_A719PrdNum, T00M839_A13217NormaID
            }
            , new Object[] {
            T00M840_A396EmprCod, T00M840_A719PrdNum, T00M840_A13586TheList
            }
            , new Object[] {
            T00M841_A396EmprCod, T00M841_A5532Lb_numero, T00M841_A5555Lb_opcion, T00M841_A13460Lb_linCP, T00M841_A13458Lb_TipCP
            }
            , new Object[] {
            T00M842_A396EmprCod, T00M842_A13418AlbProID, T00M842_A13442AlbProLine
            }
            , new Object[] {
            T00M843_A396EmprCod, T00M843_A13324LDESID, T00M843_A13333LDESNPeque, T00M843_A13337LDESComb, T00M843_A13339LDESFondo, T00M843_A13342LDESLinea
            }
            , new Object[] {
            T00M844_A396EmprCod, T00M844_A13312Lb_NLab, T00M844_A13305Lb_IDVeces, T00M844_A13306Lb_LinID
            }
            , new Object[] {
            T00M845_A396EmprCod, T00M845_A12673LavMqId, T00M845_A12692LavMqLnPq, T00M845_A12681LavMqLn
            }
            , new Object[] {
            T00M846_A396EmprCod, T00M846_A719PrdNum, T00M846_A9713Tb1_Cod
            }
            , new Object[] {
            T00M847_A396EmprCod, T00M847_A12236PrdNumD, T00M847_A719PrdNum
            }
            , new Object[] {
            T00M848_A396EmprCod, T00M848_A12225DocDisID, T00M848_A12226LinDisID
            }
            , new Object[] {
            T00M849_A396EmprCod, T00M849_A12225DocDisID
            }
            , new Object[] {
            T00M850_A396EmprCod, T00M850_A12205OrdenCID, T00M850_A12206OrdenCLnId
            }
            , new Object[] {
            T00M851_A396EmprCod, T00M851_A719PrdNum, T00M851_A11664LoteID, T00M851_A11665LoteFec
            }
            , new Object[] {
            T00M852_A396EmprCod, T00M852_A4850DevComCod, T00M852_A719PrdNum
            }
            , new Object[] {
            T00M853_A396EmprCod, T00M853_A252CliCod, T00M853_A494ForSer, T00M853_A482ForColNom, T00M853_A483ForColNum, T00M853_A831TipColCod, T00M853_A3571EnsCod, T00M853_A3582EnsLin
            }
            , new Object[] {
            T00M854_A396EmprCod, T00M854_A129BarCod, T00M854_A132BarCodReo, T00M854_A130BarCodPar, T00M854_A4075recestncol, T00M854_A4076recestnpro, T00M854_A4108recestlin
            }
            , new Object[] {
            T00M855_A396EmprCod, T00M855_A4052EstNumFor, T00M855_A4053EstNumCol, T00M855_A4090EstEspLin
            }
            , new Object[] {
            T00M856_A396EmprCod, T00M856_A4052EstNumFor, T00M856_A4053EstNumCol, T00M856_A4084EstProLin
            }
            , new Object[] {
            T00M857_A396EmprCod, T00M857_A11644TransferId, T00M857_A11653TransferLn
            }
            , new Object[] {
            T00M858_A396EmprCod, T00M858_A11634TaesId, T00M858_A11637TaesLn, T00M858_A11641TaesLnP
            }
            , new Object[] {
            T00M859_A396EmprCod, T00M859_A719PrdNum, T00M859_A11329H_stklin
            }
            , new Object[] {
            T00M860_A396EmprCod, T00M860_A11270Pot_num, T00M860_A11271Pot_lin
            }
            , new Object[] {
            T00M861_A396EmprCod, T00M861_A719PrdNum, T00M861_A11199PrdNcasC
            }
            , new Object[] {
            T00M862_A396EmprCod, T00M862_A719PrdNum, T00M862_A11197CFraseR
            }
            , new Object[] {
            T00M863_A396EmprCod, T00M863_A10243Jt_codigo, T00M863_A10246Jt_ord
            }
            , new Object[] {
            T00M864_A396EmprCod, T00M864_A10236Bny_dia, T00M864_A10238Bny_lin
            }
            , new Object[] {
            T00M865_A396EmprCod, T00M865_A129BarCod, T00M865_A132BarCodReo, T00M865_A130BarCodPar, T00M865_A758ProCod, T00M865_A194BarOrdLin, T00M865_A719PrdNum
            }
            , new Object[] {
            T00M866_A396EmprCod, T00M866_A719PrdNum, T00M866_A9735Cod_Rgo
            }
            , new Object[] {
            T00M867_A396EmprCod, T00M867_A719PrdNum, T00M867_A9711Ct_codigo
            }
            , new Object[] {
            T00M868_A396EmprCod, T00M868_A9652OeNum, T00M868_A9653OeHdr, T00M868_A9654OeHdrr, T00M868_A9655OeHdrp, T00M868_A9656OeLinC, T00M868_A9657OeComb, T00M868_A9658Oefondo, T00M868_A9659OeMolCil, T00M868_A9686OePasLin,
            T00M868_A9694OePasPLi
            }
            , new Object[] {
            T00M869_A396EmprCod, T00M869_A9652OeNum, T00M869_A9653OeHdr, T00M869_A9654OeHdrr, T00M869_A9655OeHdrp, T00M869_A9656OeLinC, T00M869_A9657OeComb, T00M869_A9658Oefondo, T00M869_A9659OeMolCil, T00M869_A9677OeMolLin
            }
            , new Object[] {
            T00M870_A396EmprCod, T00M870_A9578Pas_Num, T00M870_A719PrdNum
            }
            , new Object[] {
            T00M871_A396EmprCod, T00M871_A719PrdNum, T00M871_A8908CC_AlmCod
            }
            , new Object[] {
            T00M872_A396EmprCod, T00M872_A719PrdNum, T00M872_A8661Almc_Ln
            }
            , new Object[] {
            T00M873_A396EmprCod, T00M873_A719PrdNum, T00M873_A8648Mat_PrdN
            }
            , new Object[] {
            T00M874_A396EmprCod, T00M874_A8585Pet_cod, T00M874_A719PrdNum
            }
            , new Object[] {
            T00M875_A396EmprCod, T00M875_A719PrdNum, T00M875_A8577RecFecHr
            }
            , new Object[] {
            T00M876_A396EmprCod, T00M876_A719PrdNum, T00M876_A8366PrdAnyo, T00M876_A8360PrdProv
            }
            , new Object[] {
            T00M877_A396EmprCod, T00M877_A252CliCod, T00M877_A494ForSer, T00M877_A482ForColNom, T00M877_A483ForColNum, T00M877_A831TipColCod, T00M877_A7797Sim_lin
            }
            , new Object[] {
            T00M878_A396EmprCod, T00M878_A7163Vir_Codigo, T00M878_A719PrdNum
            }
            , new Object[] {
            T00M879_A396EmprCod, T00M879_A6310Lb_TaAuxC, T00M879_A6313lb_TaAuxL, T00M879_A6378Lb_TauxLP
            }
            , new Object[] {
            T00M880_A396EmprCod, T00M880_A6290PreCoNum, T00M880_A719PrdNum
            }
            , new Object[] {
            T00M881_A396EmprCod, T00M881_A719PrdNum, T00M881_A6158PrdPrv
            }
            , new Object[] {
            T00M882_A396EmprCod, T00M882_A719PrdNum, T00M882_A5973PrdSusNum
            }
            , new Object[] {
            T00M883_A396EmprCod, T00M883_A5612Lb_CodGru, T00M883_A5615Lb_LinGru
            }
            , new Object[] {
            T00M884_A396EmprCod, T00M884_A5532Lb_numero, T00M884_A5555Lb_opcion, T00M884_A5560Lb_LineaPr
            }
            , new Object[] {
            T00M885_A396EmprCod, T00M885_A5532Lb_numero, T00M885_A5555Lb_opcion, T00M885_A5557Lb_LineaC
            }
            , new Object[] {
            T00M886_A396EmprCod, T00M886_A5145SobCod, T00M886_A719PrdNum
            }
            , new Object[] {
            T00M887_A396EmprCod, T00M887_A4744RecPreCod, T00M887_A4762RecPreLin, T00M887_A4763RecPreNli
            }
            , new Object[] {
            T00M888_A396EmprCod, T00M888_A4492HreBarCod, T00M888_A4493HreBarReo, T00M888_A4494HreBarPar, T00M888_A4495HreNumCie, T00M888_A4545HreLinMaq, T00M888_A4550HreLinPro, T00M888_A4557HreRecLin
            }
            , new Object[] {
            T00M889_A396EmprCod, T00M889_A4492HreBarCod, T00M889_A4493HreBarReo, T00M889_A4494HreBarPar, T00M889_A4495HreNumCie, T00M889_A4508HreLinMAL, T00M889_A4509HreNumAny, T00M889_A719PrdNum
            }
            , new Object[] {
            T00M890_A396EmprCod, T00M890_A252CliCod, T00M890_A4415EstCol, T00M890_A4416EstColLin
            }
            , new Object[] {
            T00M891_A396EmprCod, T00M891_A129BarCod, T00M891_A132BarCodReo, T00M891_A130BarCodPar, T00M891_A2524DisComLin, T00M891_A1056DisComCod, T00M891_A1032FonCod, T00M891_A2124RecMolCod, T00M891_A2672RecPasLin, T00M891_A2675RecPasPLi
            }
            , new Object[] {
            T00M892_A396EmprCod, T00M892_A129BarCod, T00M892_A132BarCodReo, T00M892_A130BarCodPar, T00M892_A2524DisComLin, T00M892_A1056DisComCod, T00M892_A1032FonCod, T00M892_A2124RecMolCod, T00M892_A2126RecMolLin
            }
            , new Object[] {
            T00M893_A396EmprCod, T00M893_A2107PasCod, T00M893_A719PrdNum
            }
            , new Object[] {
            T00M894_A396EmprCod, T00M894_A2637HisEstHRu, T00M894_A2636HisEstHRe, T00M894_A2635HisEstHPa, T00M894_A2638HisEstLCo, T00M894_A2630HisEstCom, T00M894_A2634HisEstFon, T00M894_A719PrdNum
            }
            , new Object[] {
            T00M895_A396EmprCod, T00M895_A252CliCod, T00M895_A2141SerEst, T00M895_A1013DibCli, T00M895_A1014DibInt, T00M895_A2074ColCom, T00M895_A2078ColFon, T00M895_A2098MolCod, T00M895_A2535ForPrdLin
            }
            , new Object[] {
            T00M896_A396EmprCod, T00M896_A719PrdNum, T00M896_A3342CCStkLin
            }
            , new Object[] {
            T00M897_A396EmprCod, T00M897_A252CliCod, T00M897_A2891HMaForSer, T00M897_A2892HMaForCNom, T00M897_A2893HMaForCNum, T00M897_A2894HMaTipCCod, T00M897_A2895HMaForNumC, T00M897_A2897HMaColLin, T00M897_A2896HMaFec, T00M897_A2907HmaLin
            }
            , new Object[] {
            T00M898_A396EmprCod, T00M898_A129BarCod, T00M898_A132BarCodReo, T00M898_A130BarCodPar, T00M898_A2808RecLinMAL, T00M898_A1377RecNumAny, T00M898_A719PrdNum
            }
            , new Object[] {
            T00M899_A396EmprCod, T00M899_A129BarCod, T00M899_A132BarCodReo, T00M899_A130BarCodPar, T00M899_A2804RecLinMaq, T00M899_A1273RecLinPro, T00M899_A811RecLin
            }
            , new Object[] {
            T00M8100_A396EmprCod, T00M8100_A129BarCod, T00M8100_A132BarCodReo, T00M8100_A130BarCodPar, T00M8100_A2494BarDosPro, T00M8100_A719PrdNum
            }
            , new Object[] {
            T00M8101_A396EmprCod, T00M8101_A1314EnsLabCod, T00M8101_A1317EnsLabLin
            }
            , new Object[] {
            T00M8102_A396EmprCod, T00M8102_A910Workstat, T00M8102_A887EscMLin
            }
            , new Object[] {
            T00M8103_A396EmprCod, T00M8103_A859CumCodCont, T00M8103_A719PrdNum
            }
            , new Object[] {
            T00M8104_A396EmprCod, T00M8104_A719PrdNum, T00M8104_A810RecFec
            }
            , new Object[] {
            T00M8105_A396EmprCod, T00M8105_A486ForNumCol, T00M8105_A715PrdLin
            }
            , new Object[] {
            T00M8106_A396EmprCod, T00M8106_A719PrdNum, T00M8106_A681PrdAny
            }
            , new Object[] {
            T00M8107_A396EmprCod, T00M8107_A719PrdNum, T00M8107_A688PrdComCod
            }
            , new Object[] {
            T00M8108_A396EmprCod, T00M8108_A719PrdNum, T00M8108_A680PrdAltNum
            }
            , new Object[] {
            T00M8109_A396EmprCod, T00M8109_A658PedCod, T00M8109_A719PrdNum
            }
            , new Object[] {
            T00M8110_A396EmprCod, T00M8110_A486ForNumCol, T00M8110_A309ColLin
            }
            , new Object[] {
            T00M8111_A396EmprCod, T00M8111_A719PrdNum, T00M8111_A647NumCon
            }
            , new Object[] {
            T00M8112_A396EmprCod, T00M8112_A719PrdNum
            }
            , new Object[] {
            T00M8113_A942TermCod
            }
            , new Object[] {
            T00M8114_A942TermCod
            }
         }
      );
   }

   private byte Z730PrdSit ;
   private byte Z1194PrdPosY ;
   private byte Z3273PrdTnq ;
   private byte Z4338PrdUMeFo ;
   private byte Z7260PrdHorMad ;
   private byte Z8896PrdPesCon ;
   private byte Z629MetCod ;
   private byte Z835TipDtoCod ;
   private byte Z742PrdUniCom ;
   private byte Z743PrdUniCon ;
   private byte Z856ValCod ;
   private byte Z9609SubFamCod ;
   private byte GxWebError ;
   private byte A629MetCod ;
   private byte A835TipDtoCod ;
   private byte A742PrdUniCom ;
   private byte A743PrdUniCon ;
   private byte A856ValCod ;
   private byte A9609SubFamCod ;
   private byte nKeyPressed ;
   private byte A8896PrdPesCon ;
   private byte A730PrdSit ;
   private byte A1194PrdPosY ;
   private byte A3273PrdTnq ;
   private byte A4338PrdUMeFo ;
   private byte A7260PrdHorMad ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ742PrdUniCom ;
   private byte ZZ743PrdUniCon ;
   private byte ZZ856ValCod ;
   private byte ZZ730PrdSit ;
   private byte ZZ835TipDtoCod ;
   private byte ZZ629MetCod ;
   private byte ZZ1194PrdPosY ;
   private byte ZZ3273PrdTnq ;
   private byte ZZ4338PrdUMeFo ;
   private byte ZZ7260PrdHorMad ;
   private byte ZZ8896PrdPesCon ;
   private byte ZZ9609SubFamCod ;
   private short Z731PrdStkMinD ;
   private short Z699PrdDiaRot ;
   private short Z722PrdPlaEnt ;
   private short Z716PrdLotMin ;
   private short Z738PrdUltCCC ;
   private short Z695PrdConCC ;
   private short Z1193PrdPosX ;
   private short Z1644PrdDqo ;
   private short Z11470PrdConct ;
   private short Z6301TipPrdCod ;
   private short A6301TipPrdCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A731PrdStkMinD ;
   private short A699PrdDiaRot ;
   private short A722PrdPlaEnt ;
   private short A716PrdLotMin ;
   private short A738PrdUltCCC ;
   private short A695PrdConCC ;
   private short A1193PrdPosX ;
   private short A1644PrdDqo ;
   private short A11470PrdConct ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short ZZ731PrdStkMinD ;
   private short ZZ699PrdDiaRot ;
   private short ZZ722PrdPlaEnt ;
   private short ZZ716PrdLotMin ;
   private short ZZ738PrdUltCCC ;
   private short ZZ695PrdConCC ;
   private short ZZ1193PrdPosX ;
   private short ZZ1644PrdDqo ;
   private short ZZ6301TipPrdCod ;
   private short ZZ11470PrdConct ;
   private int Z795PrvNum ;
   private int A795PrvNum ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtPrdNum_Enabled ;
   private int edtEmprNom_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtPrdDscTec_Enabled ;
   private int edtPrdUniCom_Enabled ;
   private int edtPrdUcpDsc_Enabled ;
   private int edtPrdUniCon_Enabled ;
   private int edtPrdUcoDsc_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int edtPrvNum_Enabled ;
   private int edtPrvNom_Enabled ;
   private int edtPrdRefPrv_Enabled ;
   private int edtEmpCodSus_Enabled ;
   private int edtPrdSus_Enabled ;
   private int edtPrdSusNom_Enabled ;
   private int edtValCod_Enabled ;
   private int edtValDsc_Enabled ;
   private int edtPrdRec_Enabled ;
   private int edtPrdCalNec_Enabled ;
   private int edtPrdDetPar_Enabled ;
   private int edtPrdSit_Enabled ;
   private int edtPrdRotRea_Enabled ;
   private int edtTipDtoCod_Enabled ;
   private int edtTipDtoDto_Enabled ;
   private int edtPrdPreAct_Enabled ;
   private int edtPrdFecPre_Enabled ;
   private int edtPrdPreAnt_Enabled ;
   private int edtPrdPreMed_Enabled ;
   private int edtPrdConDia_Enabled ;
   private int edtPrdStkMinD_Enabled ;
   private int edtPrdStkMinU_Enabled ;
   private int edtPrdDiaRot_Enabled ;
   private int edtPrdPlaEnt_Enabled ;
   private int edtMetCod_Enabled ;
   private int edtMetDsc_Enabled ;
   private int edtPrdLotMin_Enabled ;
   private int edtPrdNumUco_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdExiCC_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int edtPrdCanPen_Enabled ;
   private int edtPrdFulEnt_Enabled ;
   private int edtPrdFulPed_Enabled ;
   private int edtPrdFulCC_Enabled ;
   private int edtPrdExiCCP_Enabled ;
   private int edtPrdUltECC_Enabled ;
   private int edtPrdUltCCC_Enabled ;
   private int edtPrdUltDCC_Enabled ;
   private int edtPrdDifCC_Enabled ;
   private int edtPrdConCC_Enabled ;
   private int edtPrdValStk_Enabled ;
   private int edtDifValStk_Enabled ;
   private int edtPrdFecEnt_Enabled ;
   private int edtPrdPosX_Enabled ;
   private int edtPrdPosY_Enabled ;
   private int edtPrdTip_Enabled ;
   private int edtPrdDqo_Enabled ;
   private int edtPrdRev_Enabled ;
   private int edtPrdTnq_Enabled ;
   private int edtPrdNom2_Enabled ;
   private int edtPrdNum2_Enabled ;
   private int edtPrdObs_Enabled ;
   private int edtPrdUMeFo_Enabled ;
   private int edtPrdPreAc2_Enabled ;
   private int edtPrdDensS_Enabled ;
   private int edtPrdConcS_Enabled ;
   private int edtPrdSolub_Enabled ;
   private int edtTipPrdCod_Enabled ;
   private int edtTipPrdDsc_Enabled ;
   private int edtPrdNumCent_Enabled ;
   private int edtPrdNumct1_Enabled ;
   private int edtPrdNumct2_Enabled ;
   private int edtPrdHorMad_Enabled ;
   private int edtPrdExiAlmc_Enabled ;
   private int edtSubFamCod_Enabled ;
   private int edtSubFamDsc_Enabled ;
   private int edtPrdInc_Enabled ;
   private int edtPrdComp_Enabled ;
   private int edtPrdAox_Enabled ;
   private int edtPrdNCAS_Enabled ;
   private int edtPrdFT_Enabled ;
   private int edtPrdFFT_Enabled ;
   private int edtPrdHS_Enabled ;
   private int edtPrdFHS_Enabled ;
   private int edtPrdReach_Enabled ;
   private int edtPrdColIdx_Enabled ;
   private int edtPrdLote_Enabled ;
   private int edtPrdRTM_Enabled ;
   private int edtPrdCtw1_Enabled ;
   private int edtPrdCtw2_Enabled ;
   private int edtPrdCtw3_Enabled ;
   private int edtPrdCtw4_Enabled ;
   private int edtPrdNroCAS_Enabled ;
   private int edtPrdGots_Enabled ;
   private int edtPrdHm_Enabled ;
   private int edtPrdConct_Enabled ;
   private int edtPrdEINECS_Enabled ;
   private int edtPrdFuncion_Enabled ;
   private int edtPrdNmQu_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private int ZZ795PrvNum ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal Z729PrdRotRea ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z725PrdPreAnt ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private java.math.BigDecimal Z696PrdConDia ;
   private java.math.BigDecimal Z732PrdStkMinU ;
   private java.math.BigDecimal Z721PrdNumUco ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal Z684PrdCanPen ;
   private java.math.BigDecimal Z706PrdExiCCP ;
   private java.math.BigDecimal Z740PrdUltECC ;
   private java.math.BigDecimal Z739PrdUltDCC ;
   private java.math.BigDecimal Z700PrdDifCC ;
   private java.math.BigDecimal Z750PrdValStk ;
   private java.math.BigDecimal Z332DifValStk ;
   private java.math.BigDecimal Z5255PrdPreAc2 ;
   private java.math.BigDecimal Z5416PrdDensS ;
   private java.math.BigDecimal Z5417PrdConcS ;
   private java.math.BigDecimal Z5590PrdSolub ;
   private java.math.BigDecimal Z7226PrdNumct1 ;
   private java.math.BigDecimal Z7227PrdNumct2 ;
   private java.math.BigDecimal Z8659PrdExiAlmc ;
   private java.math.BigDecimal Z9733PrdAox ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A729PrdRotRea ;
   private java.math.BigDecimal A837TipDtoDto ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A725PrdPreAnt ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A696PrdConDia ;
   private java.math.BigDecimal A732PrdStkMinU ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal A706PrdExiCCP ;
   private java.math.BigDecimal A740PrdUltECC ;
   private java.math.BigDecimal A739PrdUltDCC ;
   private java.math.BigDecimal A700PrdDifCC ;
   private java.math.BigDecimal A750PrdValStk ;
   private java.math.BigDecimal A332DifValStk ;
   private java.math.BigDecimal A5255PrdPreAc2 ;
   private java.math.BigDecimal A5416PrdDensS ;
   private java.math.BigDecimal A5417PrdConcS ;
   private java.math.BigDecimal A5590PrdSolub ;
   private java.math.BigDecimal A7226PrdNumct1 ;
   private java.math.BigDecimal A7227PrdNumct2 ;
   private java.math.BigDecimal A8659PrdExiAlmc ;
   private java.math.BigDecimal A9733PrdAox ;
   private java.math.BigDecimal Z837TipDtoDto ;
   private java.math.BigDecimal ZZ707PrdFacCon ;
   private java.math.BigDecimal ZZ729PrdRotRea ;
   private java.math.BigDecimal ZZ724PrdPreAct ;
   private java.math.BigDecimal ZZ725PrdPreAnt ;
   private java.math.BigDecimal ZZ726PrdPreMed ;
   private java.math.BigDecimal ZZ696PrdConDia ;
   private java.math.BigDecimal ZZ732PrdStkMinU ;
   private java.math.BigDecimal ZZ721PrdNumUco ;
   private java.math.BigDecimal ZZ704PrdExiAlm ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private java.math.BigDecimal ZZ685PrdCanRes ;
   private java.math.BigDecimal ZZ684PrdCanPen ;
   private java.math.BigDecimal ZZ706PrdExiCCP ;
   private java.math.BigDecimal ZZ740PrdUltECC ;
   private java.math.BigDecimal ZZ739PrdUltDCC ;
   private java.math.BigDecimal ZZ700PrdDifCC ;
   private java.math.BigDecimal ZZ750PrdValStk ;
   private java.math.BigDecimal ZZ332DifValStk ;
   private java.math.BigDecimal ZZ5255PrdPreAc2 ;
   private java.math.BigDecimal ZZ5416PrdDensS ;
   private java.math.BigDecimal ZZ5417PrdConcS ;
   private java.math.BigDecimal ZZ5590PrdSolub ;
   private java.math.BigDecimal ZZ7226PrdNumct1 ;
   private java.math.BigDecimal ZZ7227PrdNumct2 ;
   private java.math.BigDecimal ZZ8659PrdExiAlmc ;
   private java.math.BigDecimal ZZ9733PrdAox ;
   private java.math.BigDecimal ZZ837TipDtoDto ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z703PrdDscTec ;
   private String Z728PrdRefPrv ;
   private String Z734PrdSus ;
   private String Z727PrdRec ;
   private String Z682PrdCalNec ;
   private String Z698PrdDetPar ;
   private String Z1643PrdTip ;
   private String Z3004PrdRev ;
   private String Z4692PrdNom2 ;
   private String Z4693PrdNum2 ;
   private String Z5418PrdSalM ;
   private String Z6191PrdNumCent ;
   private String Z8897PrdPesTerm ;
   private String Z8936PrdSal ;
   private String Z9731PrdInc ;
   private String Z9732PrdComp ;
   private String Z9734PrdNCAS ;
   private String Z9739PrdFT ;
   private String Z9741PrdHS ;
   private String Z5887PrdReach ;
   private String Z5888PrdOkotex ;
   private String Z10119PrdColIdx ;
   private String Z10881PrdLote ;
   private String Z10935PrdRTM ;
   private String Z10936PrdCtw1 ;
   private String Z10937PrdCtw2 ;
   private String Z10938PrdCtw3 ;
   private String Z11663PrdCtw4 ;
   private String Z11196PrdNroCAS ;
   private String Z11363PrdGots ;
   private String Z11364PrdHm ;
   private String Z11614PrdEINECS ;
   private String Z11615PrdFuncion ;
   private String Z11687PrdList ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
   private String A5418PrdSalM ;
   private String A8897PrdPesTerm ;
   private String A8936PrdSal ;
   private String A5888PrdOkotex ;
   private String A11687PrdList ;
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
   private String edtPrdNum_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdDscTec_Internalname ;
   private String A703PrdDscTec ;
   private String edtPrdDscTec_Jsonclick ;
   private String edtPrdUniCom_Internalname ;
   private String edtPrdUniCom_Jsonclick ;
   private String edtPrdUcpDsc_Internalname ;
   private String A737PrdUcpDsc ;
   private String edtPrdUcpDsc_Jsonclick ;
   private String edtPrdUniCon_Internalname ;
   private String edtPrdUniCon_Jsonclick ;
   private String edtPrdUcoDsc_Internalname ;
   private String A736PrdUcoDsc ;
   private String edtPrdUcoDsc_Jsonclick ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtPrvNum_Internalname ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrdRefPrv_Internalname ;
   private String A728PrdRefPrv ;
   private String edtPrdRefPrv_Jsonclick ;
   private String edtEmpCodSus_Internalname ;
   private String A394EmpCodSus ;
   private String edtEmpCodSus_Jsonclick ;
   private String edtPrdSus_Internalname ;
   private String A734PrdSus ;
   private String edtPrdSus_Jsonclick ;
   private String edtPrdSusNom_Internalname ;
   private String A735PrdSusNom ;
   private String edtPrdSusNom_Jsonclick ;
   private String edtValCod_Internalname ;
   private String edtValCod_Jsonclick ;
   private String edtValDsc_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Jsonclick ;
   private String edtPrdRec_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Jsonclick ;
   private String edtPrdCalNec_Internalname ;
   private String A682PrdCalNec ;
   private String edtPrdCalNec_Jsonclick ;
   private String edtPrdDetPar_Internalname ;
   private String A698PrdDetPar ;
   private String edtPrdDetPar_Jsonclick ;
   private String edtPrdSit_Internalname ;
   private String edtPrdSit_Jsonclick ;
   private String edtPrdRotRea_Internalname ;
   private String edtPrdRotRea_Jsonclick ;
   private String edtTipDtoCod_Internalname ;
   private String edtTipDtoCod_Jsonclick ;
   private String edtTipDtoDto_Internalname ;
   private String edtTipDtoDto_Jsonclick ;
   private String edtPrdPreAct_Internalname ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtPrdFecPre_Internalname ;
   private String edtPrdFecPre_Jsonclick ;
   private String edtPrdPreAnt_Internalname ;
   private String edtPrdPreAnt_Jsonclick ;
   private String edtPrdPreMed_Internalname ;
   private String edtPrdPreMed_Jsonclick ;
   private String edtPrdConDia_Internalname ;
   private String edtPrdConDia_Jsonclick ;
   private String edtPrdStkMinD_Internalname ;
   private String edtPrdStkMinD_Jsonclick ;
   private String edtPrdStkMinU_Internalname ;
   private String edtPrdStkMinU_Jsonclick ;
   private String edtPrdDiaRot_Internalname ;
   private String edtPrdDiaRot_Jsonclick ;
   private String edtPrdPlaEnt_Internalname ;
   private String edtPrdPlaEnt_Jsonclick ;
   private String edtMetCod_Internalname ;
   private String edtMetCod_Jsonclick ;
   private String edtMetDsc_Internalname ;
   private String A630MetDsc ;
   private String edtMetDsc_Jsonclick ;
   private String edtPrdLotMin_Internalname ;
   private String edtPrdLotMin_Jsonclick ;
   private String edtPrdNumUco_Internalname ;
   private String edtPrdNumUco_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdExiCC_Internalname ;
   private String edtPrdExiCC_Jsonclick ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdCanPen_Internalname ;
   private String edtPrdCanPen_Jsonclick ;
   private String edtPrdFulEnt_Internalname ;
   private String edtPrdFulEnt_Jsonclick ;
   private String edtPrdFulPed_Internalname ;
   private String edtPrdFulPed_Jsonclick ;
   private String edtPrdFulCC_Internalname ;
   private String edtPrdFulCC_Jsonclick ;
   private String edtPrdExiCCP_Internalname ;
   private String edtPrdExiCCP_Jsonclick ;
   private String edtPrdUltECC_Internalname ;
   private String edtPrdUltECC_Jsonclick ;
   private String edtPrdUltCCC_Internalname ;
   private String edtPrdUltCCC_Jsonclick ;
   private String edtPrdUltDCC_Internalname ;
   private String edtPrdUltDCC_Jsonclick ;
   private String edtPrdDifCC_Internalname ;
   private String edtPrdDifCC_Jsonclick ;
   private String edtPrdConCC_Internalname ;
   private String edtPrdConCC_Jsonclick ;
   private String edtPrdValStk_Internalname ;
   private String edtPrdValStk_Jsonclick ;
   private String edtDifValStk_Internalname ;
   private String edtDifValStk_Jsonclick ;
   private String edtPrdFecEnt_Internalname ;
   private String edtPrdFecEnt_Jsonclick ;
   private String edtPrdPosX_Internalname ;
   private String edtPrdPosX_Jsonclick ;
   private String edtPrdPosY_Internalname ;
   private String edtPrdPosY_Jsonclick ;
   private String edtPrdTip_Internalname ;
   private String A1643PrdTip ;
   private String edtPrdTip_Jsonclick ;
   private String edtPrdDqo_Internalname ;
   private String edtPrdDqo_Jsonclick ;
   private String edtPrdRev_Internalname ;
   private String A3004PrdRev ;
   private String edtPrdRev_Jsonclick ;
   private String edtPrdTnq_Internalname ;
   private String edtPrdTnq_Jsonclick ;
   private String edtPrdNom2_Internalname ;
   private String A4692PrdNom2 ;
   private String edtPrdNom2_Jsonclick ;
   private String edtPrdNum2_Internalname ;
   private String A4693PrdNum2 ;
   private String edtPrdNum2_Jsonclick ;
   private String edtPrdObs_Internalname ;
   private String edtPrdUMeFo_Internalname ;
   private String edtPrdUMeFo_Jsonclick ;
   private String edtPrdPreAc2_Internalname ;
   private String edtPrdPreAc2_Jsonclick ;
   private String edtPrdDensS_Internalname ;
   private String edtPrdDensS_Jsonclick ;
   private String edtPrdConcS_Internalname ;
   private String edtPrdConcS_Jsonclick ;
   private String edtPrdSolub_Internalname ;
   private String edtPrdSolub_Jsonclick ;
   private String edtTipPrdCod_Internalname ;
   private String edtTipPrdCod_Jsonclick ;
   private String edtTipPrdDsc_Internalname ;
   private String A6302TipPrdDsc ;
   private String edtTipPrdDsc_Jsonclick ;
   private String edtPrdNumCent_Internalname ;
   private String A6191PrdNumCent ;
   private String edtPrdNumCent_Jsonclick ;
   private String edtPrdNumct1_Internalname ;
   private String edtPrdNumct1_Jsonclick ;
   private String edtPrdNumct2_Internalname ;
   private String edtPrdNumct2_Jsonclick ;
   private String edtPrdHorMad_Internalname ;
   private String edtPrdHorMad_Jsonclick ;
   private String edtPrdExiAlmc_Internalname ;
   private String edtPrdExiAlmc_Jsonclick ;
   private String edtSubFamCod_Internalname ;
   private String edtSubFamCod_Jsonclick ;
   private String edtSubFamDsc_Internalname ;
   private String A9610SubFamDsc ;
   private String edtSubFamDsc_Jsonclick ;
   private String edtPrdInc_Internalname ;
   private String A9731PrdInc ;
   private String edtPrdInc_Jsonclick ;
   private String edtPrdComp_Internalname ;
   private String A9732PrdComp ;
   private String edtPrdComp_Jsonclick ;
   private String edtPrdAox_Internalname ;
   private String edtPrdAox_Jsonclick ;
   private String edtPrdNCAS_Internalname ;
   private String A9734PrdNCAS ;
   private String edtPrdNCAS_Jsonclick ;
   private String edtPrdFT_Internalname ;
   private String A9739PrdFT ;
   private String edtPrdFT_Jsonclick ;
   private String edtPrdFFT_Internalname ;
   private String edtPrdFFT_Jsonclick ;
   private String edtPrdHS_Internalname ;
   private String A9741PrdHS ;
   private String edtPrdHS_Jsonclick ;
   private String edtPrdFHS_Internalname ;
   private String edtPrdFHS_Jsonclick ;
   private String edtPrdReach_Internalname ;
   private String A5887PrdReach ;
   private String edtPrdReach_Jsonclick ;
   private String edtPrdColIdx_Internalname ;
   private String A10119PrdColIdx ;
   private String edtPrdColIdx_Jsonclick ;
   private String edtPrdLote_Internalname ;
   private String A10881PrdLote ;
   private String edtPrdLote_Jsonclick ;
   private String edtPrdRTM_Internalname ;
   private String A10935PrdRTM ;
   private String edtPrdRTM_Jsonclick ;
   private String edtPrdCtw1_Internalname ;
   private String A10936PrdCtw1 ;
   private String edtPrdCtw1_Jsonclick ;
   private String edtPrdCtw2_Internalname ;
   private String A10937PrdCtw2 ;
   private String edtPrdCtw2_Jsonclick ;
   private String edtPrdCtw3_Internalname ;
   private String A10938PrdCtw3 ;
   private String edtPrdCtw3_Jsonclick ;
   private String edtPrdCtw4_Internalname ;
   private String A11663PrdCtw4 ;
   private String edtPrdCtw4_Jsonclick ;
   private String edtPrdNroCAS_Internalname ;
   private String A11196PrdNroCAS ;
   private String edtPrdNroCAS_Jsonclick ;
   private String edtPrdGots_Internalname ;
   private String A11363PrdGots ;
   private String edtPrdGots_Jsonclick ;
   private String edtPrdHm_Internalname ;
   private String A11364PrdHm ;
   private String edtPrdHm_Jsonclick ;
   private String edtPrdConct_Internalname ;
   private String edtPrdConct_Jsonclick ;
   private String edtPrdEINECS_Internalname ;
   private String A11614PrdEINECS ;
   private String edtPrdEINECS_Jsonclick ;
   private String edtPrdFuncion_Internalname ;
   private String A11615PrdFuncion ;
   private String edtPrdFuncion_Jsonclick ;
   private String edtPrdNmQu_Internalname ;
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
   private String Z737PrdUcpDsc ;
   private String Z736PrdUcoDsc ;
   private String Z794PrvNom ;
   private String Z857ValDsc ;
   private String Z630MetDsc ;
   private String Z6302TipPrdDsc ;
   private String Z9610SubFamDsc ;
   private String sMode29 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String gxwrpcisep ;
   private String Z394EmpCodSus ;
   private String Z735PrdSusNom ;
   private String ZZ396EmprCod ;
   private String ZZ719PrdNum ;
   private String ZZ394EmpCodSus ;
   private String ZZ735PrdSusNom ;
   private String ZZ718PrdNom ;
   private String ZZ703PrdDscTec ;
   private String ZZ728PrdRefPrv ;
   private String ZZ734PrdSus ;
   private String ZZ727PrdRec ;
   private String ZZ682PrdCalNec ;
   private String ZZ698PrdDetPar ;
   private String ZZ1643PrdTip ;
   private String ZZ3004PrdRev ;
   private String ZZ4692PrdNom2 ;
   private String ZZ4693PrdNum2 ;
   private String ZZ5418PrdSalM ;
   private String ZZ6191PrdNumCent ;
   private String ZZ8897PrdPesTerm ;
   private String ZZ8936PrdSal ;
   private String ZZ9731PrdInc ;
   private String ZZ9732PrdComp ;
   private String ZZ9734PrdNCAS ;
   private String ZZ9739PrdFT ;
   private String ZZ9741PrdHS ;
   private String ZZ5887PrdReach ;
   private String ZZ5888PrdOkotex ;
   private String ZZ10119PrdColIdx ;
   private String ZZ10881PrdLote ;
   private String ZZ10935PrdRTM ;
   private String ZZ10936PrdCtw1 ;
   private String ZZ10937PrdCtw2 ;
   private String ZZ10938PrdCtw3 ;
   private String ZZ11663PrdCtw4 ;
   private String ZZ11196PrdNroCAS ;
   private String ZZ11363PrdGots ;
   private String ZZ11364PrdHm ;
   private String ZZ11614PrdEINECS ;
   private String ZZ11615PrdFuncion ;
   private String ZZ11687PrdList ;
   private String ZZ407EmprNom ;
   private String ZZ630MetDsc ;
   private String ZZ794PrvNom ;
   private String ZZ737PrdUcpDsc ;
   private String ZZ736PrdUcoDsc ;
   private String ZZ857ValDsc ;
   private String ZZ6302TipPrdDsc ;
   private String ZZ9610SubFamDsc ;
   private java.util.Date Z709PrdFecPre ;
   private java.util.Date Z713PrdFulEnt ;
   private java.util.Date Z714PrdFulPed ;
   private java.util.Date Z712PrdFulCC ;
   private java.util.Date Z708PrdFecEnt ;
   private java.util.Date Z9740PrdFFT ;
   private java.util.Date Z9742PrdFHS ;
   private java.util.Date A709PrdFecPre ;
   private java.util.Date A713PrdFulEnt ;
   private java.util.Date A714PrdFulPed ;
   private java.util.Date A712PrdFulCC ;
   private java.util.Date A708PrdFecEnt ;
   private java.util.Date A9740PrdFFT ;
   private java.util.Date A9742PrdFHS ;
   private java.util.Date ZZ709PrdFecPre ;
   private java.util.Date ZZ713PrdFulEnt ;
   private java.util.Date ZZ714PrdFulPed ;
   private java.util.Date ZZ712PrdFulCC ;
   private java.util.Date ZZ708PrdFecEnt ;
   private java.util.Date ZZ9740PrdFFT ;
   private java.util.Date ZZ9742PrdFHS ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n629MetCod ;
   private boolean n835TipDtoCod ;
   private boolean n6301TipPrdCod ;
   private boolean n9609SubFamCod ;
   private boolean wbErr ;
   private boolean n719PrdNum ;
   private boolean n407EmprNom ;
   private boolean n737PrdUcpDsc ;
   private boolean n736PrdUcoDsc ;
   private boolean n794PrvNom ;
   private boolean n734PrdSus ;
   private boolean n735PrdSusNom ;
   private boolean n857ValDsc ;
   private boolean n837TipDtoDto ;
   private boolean n630MetDsc ;
   private boolean n6302TipPrdDsc ;
   private boolean n9610SubFamDsc ;
   private boolean Gx_longc ;
   private boolean gxdyncontrolsrefreshing ;
   private String Z4694PrdObs ;
   private String Z11616PrdNmQu ;
   private String A4694PrdObs ;
   private String A11616PrdNmQu ;
   private String ZZ4694PrdObs ;
   private String ZZ11616PrdNmQu ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private ICheckbox chkPrdSalM ;
   private ICheckbox chkPrdPesCon ;
   private HTMLChoice dynPrdPesTerm ;
   private ICheckbox chkPrdSal ;
   private HTMLChoice cmbPrdOkotex ;
   private HTMLChoice cmbPrdList ;
   private IDataStoreProvider pr_default ;
   private byte[] T00M814_A743PrdUniCon ;
   private byte[] T00M814_A856ValCod ;
   private short[] T00M814_A6301TipPrdCod ;
   private boolean[] T00M814_n6301TipPrdCod ;
   private byte[] T00M814_A9609SubFamCod ;
   private boolean[] T00M814_n9609SubFamCod ;
   private String[] T00M814_A719PrdNum ;
   private boolean[] T00M814_n719PrdNum ;
   private String[] T00M814_A407EmprNom ;
   private boolean[] T00M814_n407EmprNom ;
   private String[] T00M814_A718PrdNom ;
   private String[] T00M814_A703PrdDscTec ;
   private String[] T00M814_A737PrdUcpDsc ;
   private boolean[] T00M814_n737PrdUcpDsc ;
   private String[] T00M814_A736PrdUcoDsc ;
   private boolean[] T00M814_n736PrdUcoDsc ;
   private java.math.BigDecimal[] T00M814_A707PrdFacCon ;
   private String[] T00M814_A794PrvNom ;
   private boolean[] T00M814_n794PrvNom ;
   private String[] T00M814_A728PrdRefPrv ;
   private String[] T00M814_A734PrdSus ;
   private boolean[] T00M814_n734PrdSus ;
   private String[] T00M814_A857ValDsc ;
   private boolean[] T00M814_n857ValDsc ;
   private String[] T00M814_A727PrdRec ;
   private String[] T00M814_A682PrdCalNec ;
   private String[] T00M814_A698PrdDetPar ;
   private byte[] T00M814_A730PrdSit ;
   private java.math.BigDecimal[] T00M814_A729PrdRotRea ;
   private java.math.BigDecimal[] T00M814_A837TipDtoDto ;
   private boolean[] T00M814_n837TipDtoDto ;
   private java.math.BigDecimal[] T00M814_A724PrdPreAct ;
   private java.util.Date[] T00M814_A709PrdFecPre ;
   private java.math.BigDecimal[] T00M814_A725PrdPreAnt ;
   private java.math.BigDecimal[] T00M814_A726PrdPreMed ;
   private java.math.BigDecimal[] T00M814_A696PrdConDia ;
   private short[] T00M814_A731PrdStkMinD ;
   private java.math.BigDecimal[] T00M814_A732PrdStkMinU ;
   private short[] T00M814_A699PrdDiaRot ;
   private short[] T00M814_A722PrdPlaEnt ;
   private String[] T00M814_A630MetDsc ;
   private boolean[] T00M814_n630MetDsc ;
   private short[] T00M814_A716PrdLotMin ;
   private java.math.BigDecimal[] T00M814_A721PrdNumUco ;
   private java.math.BigDecimal[] T00M814_A704PrdExiAlm ;
   private java.math.BigDecimal[] T00M814_A705PrdExiCC ;
   private java.math.BigDecimal[] T00M814_A685PrdCanRes ;
   private java.math.BigDecimal[] T00M814_A684PrdCanPen ;
   private java.util.Date[] T00M814_A713PrdFulEnt ;
   private java.util.Date[] T00M814_A714PrdFulPed ;
   private java.util.Date[] T00M814_A712PrdFulCC ;
   private java.math.BigDecimal[] T00M814_A706PrdExiCCP ;
   private java.math.BigDecimal[] T00M814_A740PrdUltECC ;
   private short[] T00M814_A738PrdUltCCC ;
   private java.math.BigDecimal[] T00M814_A739PrdUltDCC ;
   private java.math.BigDecimal[] T00M814_A700PrdDifCC ;
   private short[] T00M814_A695PrdConCC ;
   private java.math.BigDecimal[] T00M814_A750PrdValStk ;
   private java.math.BigDecimal[] T00M814_A332DifValStk ;
   private java.util.Date[] T00M814_A708PrdFecEnt ;
   private short[] T00M814_A1193PrdPosX ;
   private byte[] T00M814_A1194PrdPosY ;
   private String[] T00M814_A1643PrdTip ;
   private short[] T00M814_A1644PrdDqo ;
   private String[] T00M814_A3004PrdRev ;
   private byte[] T00M814_A3273PrdTnq ;
   private String[] T00M814_A4692PrdNom2 ;
   private String[] T00M814_A4693PrdNum2 ;
   private String[] T00M814_A4694PrdObs ;
   private byte[] T00M814_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T00M814_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T00M814_A5416PrdDensS ;
   private java.math.BigDecimal[] T00M814_A5417PrdConcS ;
   private String[] T00M814_A5418PrdSalM ;
   private java.math.BigDecimal[] T00M814_A5590PrdSolub ;
   private String[] T00M814_A6302TipPrdDsc ;
   private boolean[] T00M814_n6302TipPrdDsc ;
   private String[] T00M814_A6191PrdNumCent ;
   private java.math.BigDecimal[] T00M814_A7226PrdNumct1 ;
   private java.math.BigDecimal[] T00M814_A7227PrdNumct2 ;
   private byte[] T00M814_A7260PrdHorMad ;
   private java.math.BigDecimal[] T00M814_A8659PrdExiAlmc ;
   private byte[] T00M814_A8896PrdPesCon ;
   private String[] T00M814_A8897PrdPesTerm ;
   private String[] T00M814_A8936PrdSal ;
   private String[] T00M814_A9610SubFamDsc ;
   private boolean[] T00M814_n9610SubFamDsc ;
   private String[] T00M814_A9731PrdInc ;
   private String[] T00M814_A9732PrdComp ;
   private java.math.BigDecimal[] T00M814_A9733PrdAox ;
   private String[] T00M814_A9734PrdNCAS ;
   private String[] T00M814_A9739PrdFT ;
   private java.util.Date[] T00M814_A9740PrdFFT ;
   private String[] T00M814_A9741PrdHS ;
   private java.util.Date[] T00M814_A9742PrdFHS ;
   private String[] T00M814_A5887PrdReach ;
   private String[] T00M814_A5888PrdOkotex ;
   private String[] T00M814_A10119PrdColIdx ;
   private String[] T00M814_A10881PrdLote ;
   private String[] T00M814_A10935PrdRTM ;
   private String[] T00M814_A10936PrdCtw1 ;
   private String[] T00M814_A10937PrdCtw2 ;
   private String[] T00M814_A10938PrdCtw3 ;
   private String[] T00M814_A11663PrdCtw4 ;
   private String[] T00M814_A11196PrdNroCAS ;
   private String[] T00M814_A11363PrdGots ;
   private String[] T00M814_A11364PrdHm ;
   private short[] T00M814_A11470PrdConct ;
   private String[] T00M814_A11614PrdEINECS ;
   private String[] T00M814_A11615PrdFuncion ;
   private String[] T00M814_A11616PrdNmQu ;
   private String[] T00M814_A11687PrdList ;
   private String[] T00M814_A396EmprCod ;
   private byte[] T00M814_A629MetCod ;
   private boolean[] T00M814_n629MetCod ;
   private int[] T00M814_A795PrvNum ;
   private byte[] T00M814_A835TipDtoCod ;
   private boolean[] T00M814_n835TipDtoCod ;
   private byte[] T00M814_A742PrdUniCom ;
   private String[] T00M84_A407EmprNom ;
   private boolean[] T00M84_n407EmprNom ;
   private String[] T00M85_A630MetDsc ;
   private boolean[] T00M85_n630MetDsc ;
   private String[] T00M86_A794PrvNom ;
   private boolean[] T00M86_n794PrvNom ;
   private java.math.BigDecimal[] T00M87_A837TipDtoDto ;
   private boolean[] T00M87_n837TipDtoDto ;
   private String[] T00M88_A737PrdUcpDsc ;
   private boolean[] T00M88_n737PrdUcpDsc ;
   private String[] T00M89_A736PrdUcoDsc ;
   private boolean[] T00M89_n736PrdUcoDsc ;
   private String[] T00M810_A857ValDsc ;
   private boolean[] T00M810_n857ValDsc ;
   private String[] T00M811_A6302TipPrdDsc ;
   private boolean[] T00M811_n6302TipPrdDsc ;
   private String[] T00M812_A9610SubFamDsc ;
   private boolean[] T00M812_n9610SubFamDsc ;
   private String[] T00M815_A407EmprNom ;
   private boolean[] T00M815_n407EmprNom ;
   private String[] T00M816_A630MetDsc ;
   private boolean[] T00M816_n630MetDsc ;
   private String[] T00M817_A794PrvNom ;
   private boolean[] T00M817_n794PrvNom ;
   private java.math.BigDecimal[] T00M818_A837TipDtoDto ;
   private boolean[] T00M818_n837TipDtoDto ;
   private String[] T00M819_A737PrdUcpDsc ;
   private boolean[] T00M819_n737PrdUcpDsc ;
   private String[] T00M820_A736PrdUcoDsc ;
   private boolean[] T00M820_n736PrdUcoDsc ;
   private String[] T00M821_A857ValDsc ;
   private boolean[] T00M821_n857ValDsc ;
   private String[] T00M822_A6302TipPrdDsc ;
   private boolean[] T00M822_n6302TipPrdDsc ;
   private String[] T00M823_A9610SubFamDsc ;
   private boolean[] T00M823_n9610SubFamDsc ;
   private String[] T00M824_A396EmprCod ;
   private String[] T00M824_A719PrdNum ;
   private boolean[] T00M824_n719PrdNum ;
   private byte[] T00M83_A743PrdUniCon ;
   private byte[] T00M83_A856ValCod ;
   private short[] T00M83_A6301TipPrdCod ;
   private boolean[] T00M83_n6301TipPrdCod ;
   private byte[] T00M83_A9609SubFamCod ;
   private boolean[] T00M83_n9609SubFamCod ;
   private String[] T00M83_A719PrdNum ;
   private boolean[] T00M83_n719PrdNum ;
   private String[] T00M83_A718PrdNom ;
   private String[] T00M83_A703PrdDscTec ;
   private java.math.BigDecimal[] T00M83_A707PrdFacCon ;
   private String[] T00M83_A728PrdRefPrv ;
   private String[] T00M83_A734PrdSus ;
   private boolean[] T00M83_n734PrdSus ;
   private String[] T00M83_A727PrdRec ;
   private String[] T00M83_A682PrdCalNec ;
   private String[] T00M83_A698PrdDetPar ;
   private byte[] T00M83_A730PrdSit ;
   private java.math.BigDecimal[] T00M83_A729PrdRotRea ;
   private java.math.BigDecimal[] T00M83_A724PrdPreAct ;
   private java.util.Date[] T00M83_A709PrdFecPre ;
   private java.math.BigDecimal[] T00M83_A725PrdPreAnt ;
   private java.math.BigDecimal[] T00M83_A726PrdPreMed ;
   private java.math.BigDecimal[] T00M83_A696PrdConDia ;
   private short[] T00M83_A731PrdStkMinD ;
   private java.math.BigDecimal[] T00M83_A732PrdStkMinU ;
   private short[] T00M83_A699PrdDiaRot ;
   private short[] T00M83_A722PrdPlaEnt ;
   private short[] T00M83_A716PrdLotMin ;
   private java.math.BigDecimal[] T00M83_A721PrdNumUco ;
   private java.math.BigDecimal[] T00M83_A704PrdExiAlm ;
   private java.math.BigDecimal[] T00M83_A705PrdExiCC ;
   private java.math.BigDecimal[] T00M83_A685PrdCanRes ;
   private java.math.BigDecimal[] T00M83_A684PrdCanPen ;
   private java.util.Date[] T00M83_A713PrdFulEnt ;
   private java.util.Date[] T00M83_A714PrdFulPed ;
   private java.util.Date[] T00M83_A712PrdFulCC ;
   private java.math.BigDecimal[] T00M83_A706PrdExiCCP ;
   private java.math.BigDecimal[] T00M83_A740PrdUltECC ;
   private short[] T00M83_A738PrdUltCCC ;
   private java.math.BigDecimal[] T00M83_A739PrdUltDCC ;
   private java.math.BigDecimal[] T00M83_A700PrdDifCC ;
   private short[] T00M83_A695PrdConCC ;
   private java.math.BigDecimal[] T00M83_A750PrdValStk ;
   private java.math.BigDecimal[] T00M83_A332DifValStk ;
   private java.util.Date[] T00M83_A708PrdFecEnt ;
   private short[] T00M83_A1193PrdPosX ;
   private byte[] T00M83_A1194PrdPosY ;
   private String[] T00M83_A1643PrdTip ;
   private short[] T00M83_A1644PrdDqo ;
   private String[] T00M83_A3004PrdRev ;
   private byte[] T00M83_A3273PrdTnq ;
   private String[] T00M83_A4692PrdNom2 ;
   private String[] T00M83_A4693PrdNum2 ;
   private String[] T00M83_A4694PrdObs ;
   private byte[] T00M83_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T00M83_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T00M83_A5416PrdDensS ;
   private java.math.BigDecimal[] T00M83_A5417PrdConcS ;
   private String[] T00M83_A5418PrdSalM ;
   private java.math.BigDecimal[] T00M83_A5590PrdSolub ;
   private String[] T00M83_A6191PrdNumCent ;
   private java.math.BigDecimal[] T00M83_A7226PrdNumct1 ;
   private java.math.BigDecimal[] T00M83_A7227PrdNumct2 ;
   private byte[] T00M83_A7260PrdHorMad ;
   private java.math.BigDecimal[] T00M83_A8659PrdExiAlmc ;
   private byte[] T00M83_A8896PrdPesCon ;
   private String[] T00M83_A8897PrdPesTerm ;
   private String[] T00M83_A8936PrdSal ;
   private String[] T00M83_A9731PrdInc ;
   private String[] T00M83_A9732PrdComp ;
   private java.math.BigDecimal[] T00M83_A9733PrdAox ;
   private String[] T00M83_A9734PrdNCAS ;
   private String[] T00M83_A9739PrdFT ;
   private java.util.Date[] T00M83_A9740PrdFFT ;
   private String[] T00M83_A9741PrdHS ;
   private java.util.Date[] T00M83_A9742PrdFHS ;
   private String[] T00M83_A5887PrdReach ;
   private String[] T00M83_A5888PrdOkotex ;
   private String[] T00M83_A10119PrdColIdx ;
   private String[] T00M83_A10881PrdLote ;
   private String[] T00M83_A10935PrdRTM ;
   private String[] T00M83_A10936PrdCtw1 ;
   private String[] T00M83_A10937PrdCtw2 ;
   private String[] T00M83_A10938PrdCtw3 ;
   private String[] T00M83_A11663PrdCtw4 ;
   private String[] T00M83_A11196PrdNroCAS ;
   private String[] T00M83_A11363PrdGots ;
   private String[] T00M83_A11364PrdHm ;
   private short[] T00M83_A11470PrdConct ;
   private String[] T00M83_A11614PrdEINECS ;
   private String[] T00M83_A11615PrdFuncion ;
   private String[] T00M83_A11616PrdNmQu ;
   private String[] T00M83_A11687PrdList ;
   private String[] T00M83_A396EmprCod ;
   private byte[] T00M83_A629MetCod ;
   private boolean[] T00M83_n629MetCod ;
   private int[] T00M83_A795PrvNum ;
   private byte[] T00M83_A835TipDtoCod ;
   private boolean[] T00M83_n835TipDtoCod ;
   private byte[] T00M83_A742PrdUniCom ;
   private String[] T00M825_A396EmprCod ;
   private String[] T00M825_A719PrdNum ;
   private boolean[] T00M825_n719PrdNum ;
   private String[] T00M826_A396EmprCod ;
   private String[] T00M826_A719PrdNum ;
   private boolean[] T00M826_n719PrdNum ;
   private byte[] T00M82_A743PrdUniCon ;
   private byte[] T00M82_A856ValCod ;
   private short[] T00M82_A6301TipPrdCod ;
   private boolean[] T00M82_n6301TipPrdCod ;
   private byte[] T00M82_A9609SubFamCod ;
   private boolean[] T00M82_n9609SubFamCod ;
   private String[] T00M82_A719PrdNum ;
   private boolean[] T00M82_n719PrdNum ;
   private String[] T00M82_A718PrdNom ;
   private String[] T00M82_A703PrdDscTec ;
   private java.math.BigDecimal[] T00M82_A707PrdFacCon ;
   private String[] T00M82_A728PrdRefPrv ;
   private String[] T00M82_A734PrdSus ;
   private boolean[] T00M82_n734PrdSus ;
   private String[] T00M82_A727PrdRec ;
   private String[] T00M82_A682PrdCalNec ;
   private String[] T00M82_A698PrdDetPar ;
   private byte[] T00M82_A730PrdSit ;
   private java.math.BigDecimal[] T00M82_A729PrdRotRea ;
   private java.math.BigDecimal[] T00M82_A724PrdPreAct ;
   private java.util.Date[] T00M82_A709PrdFecPre ;
   private java.math.BigDecimal[] T00M82_A725PrdPreAnt ;
   private java.math.BigDecimal[] T00M82_A726PrdPreMed ;
   private java.math.BigDecimal[] T00M82_A696PrdConDia ;
   private short[] T00M82_A731PrdStkMinD ;
   private java.math.BigDecimal[] T00M82_A732PrdStkMinU ;
   private short[] T00M82_A699PrdDiaRot ;
   private short[] T00M82_A722PrdPlaEnt ;
   private short[] T00M82_A716PrdLotMin ;
   private java.math.BigDecimal[] T00M82_A721PrdNumUco ;
   private java.math.BigDecimal[] T00M82_A704PrdExiAlm ;
   private java.math.BigDecimal[] T00M82_A705PrdExiCC ;
   private java.math.BigDecimal[] T00M82_A685PrdCanRes ;
   private java.math.BigDecimal[] T00M82_A684PrdCanPen ;
   private java.util.Date[] T00M82_A713PrdFulEnt ;
   private java.util.Date[] T00M82_A714PrdFulPed ;
   private java.util.Date[] T00M82_A712PrdFulCC ;
   private java.math.BigDecimal[] T00M82_A706PrdExiCCP ;
   private java.math.BigDecimal[] T00M82_A740PrdUltECC ;
   private short[] T00M82_A738PrdUltCCC ;
   private java.math.BigDecimal[] T00M82_A739PrdUltDCC ;
   private java.math.BigDecimal[] T00M82_A700PrdDifCC ;
   private short[] T00M82_A695PrdConCC ;
   private java.math.BigDecimal[] T00M82_A750PrdValStk ;
   private java.math.BigDecimal[] T00M82_A332DifValStk ;
   private java.util.Date[] T00M82_A708PrdFecEnt ;
   private short[] T00M82_A1193PrdPosX ;
   private byte[] T00M82_A1194PrdPosY ;
   private String[] T00M82_A1643PrdTip ;
   private short[] T00M82_A1644PrdDqo ;
   private String[] T00M82_A3004PrdRev ;
   private byte[] T00M82_A3273PrdTnq ;
   private String[] T00M82_A4692PrdNom2 ;
   private String[] T00M82_A4693PrdNum2 ;
   private String[] T00M82_A4694PrdObs ;
   private byte[] T00M82_A4338PrdUMeFo ;
   private java.math.BigDecimal[] T00M82_A5255PrdPreAc2 ;
   private java.math.BigDecimal[] T00M82_A5416PrdDensS ;
   private java.math.BigDecimal[] T00M82_A5417PrdConcS ;
   private String[] T00M82_A5418PrdSalM ;
   private java.math.BigDecimal[] T00M82_A5590PrdSolub ;
   private String[] T00M82_A6191PrdNumCent ;
   private java.math.BigDecimal[] T00M82_A7226PrdNumct1 ;
   private java.math.BigDecimal[] T00M82_A7227PrdNumct2 ;
   private byte[] T00M82_A7260PrdHorMad ;
   private java.math.BigDecimal[] T00M82_A8659PrdExiAlmc ;
   private byte[] T00M82_A8896PrdPesCon ;
   private String[] T00M82_A8897PrdPesTerm ;
   private String[] T00M82_A8936PrdSal ;
   private String[] T00M82_A9731PrdInc ;
   private String[] T00M82_A9732PrdComp ;
   private java.math.BigDecimal[] T00M82_A9733PrdAox ;
   private String[] T00M82_A9734PrdNCAS ;
   private String[] T00M82_A9739PrdFT ;
   private java.util.Date[] T00M82_A9740PrdFFT ;
   private String[] T00M82_A9741PrdHS ;
   private java.util.Date[] T00M82_A9742PrdFHS ;
   private String[] T00M82_A5887PrdReach ;
   private String[] T00M82_A5888PrdOkotex ;
   private String[] T00M82_A10119PrdColIdx ;
   private String[] T00M82_A10881PrdLote ;
   private String[] T00M82_A10935PrdRTM ;
   private String[] T00M82_A10936PrdCtw1 ;
   private String[] T00M82_A10937PrdCtw2 ;
   private String[] T00M82_A10938PrdCtw3 ;
   private String[] T00M82_A11663PrdCtw4 ;
   private String[] T00M82_A11196PrdNroCAS ;
   private String[] T00M82_A11363PrdGots ;
   private String[] T00M82_A11364PrdHm ;
   private short[] T00M82_A11470PrdConct ;
   private String[] T00M82_A11614PrdEINECS ;
   private String[] T00M82_A11615PrdFuncion ;
   private String[] T00M82_A11616PrdNmQu ;
   private String[] T00M82_A11687PrdList ;
   private String[] T00M82_A396EmprCod ;
   private byte[] T00M82_A629MetCod ;
   private boolean[] T00M82_n629MetCod ;
   private int[] T00M82_A795PrvNum ;
   private byte[] T00M82_A835TipDtoCod ;
   private boolean[] T00M82_n835TipDtoCod ;
   private byte[] T00M82_A742PrdUniCom ;
   private String[] T00M830_A407EmprNom ;
   private boolean[] T00M830_n407EmprNom ;
   private String[] T00M831_A737PrdUcpDsc ;
   private boolean[] T00M831_n737PrdUcpDsc ;
   private String[] T00M832_A736PrdUcoDsc ;
   private boolean[] T00M832_n736PrdUcoDsc ;
   private String[] T00M833_A794PrvNom ;
   private boolean[] T00M833_n794PrvNom ;
   private String[] T00M834_A857ValDsc ;
   private boolean[] T00M834_n857ValDsc ;
   private java.math.BigDecimal[] T00M835_A837TipDtoDto ;
   private boolean[] T00M835_n837TipDtoDto ;
   private String[] T00M836_A630MetDsc ;
   private boolean[] T00M836_n630MetDsc ;
   private String[] T00M837_A6302TipPrdDsc ;
   private boolean[] T00M837_n6302TipPrdDsc ;
   private String[] T00M838_A9610SubFamDsc ;
   private boolean[] T00M838_n9610SubFamDsc ;
   private String[] T00M839_A396EmprCod ;
   private String[] T00M839_A719PrdNum ;
   private boolean[] T00M839_n719PrdNum ;
   private String[] T00M839_A13217NormaID ;
   private String[] T00M840_A396EmprCod ;
   private String[] T00M840_A719PrdNum ;
   private boolean[] T00M840_n719PrdNum ;
   private String[] T00M840_A13586TheList ;
   private String[] T00M841_A396EmprCod ;
   private int[] T00M841_A5532Lb_numero ;
   private String[] T00M841_A5555Lb_opcion ;
   private short[] T00M841_A13460Lb_linCP ;
   private String[] T00M841_A13458Lb_TipCP ;
   private String[] T00M842_A396EmprCod ;
   private int[] T00M842_A13418AlbProID ;
   private short[] T00M842_A13442AlbProLine ;
   private String[] T00M843_A396EmprCod ;
   private int[] T00M843_A13324LDESID ;
   private String[] T00M843_A13333LDESNPeque ;
   private String[] T00M843_A13337LDESComb ;
   private String[] T00M843_A13339LDESFondo ;
   private short[] T00M843_A13342LDESLinea ;
   private String[] T00M844_A396EmprCod ;
   private int[] T00M844_A13312Lb_NLab ;
   private short[] T00M844_A13305Lb_IDVeces ;
   private short[] T00M844_A13306Lb_LinID ;
   private String[] T00M845_A396EmprCod ;
   private int[] T00M845_A12673LavMqId ;
   private short[] T00M845_A12692LavMqLnPq ;
   private short[] T00M845_A12681LavMqLn ;
   private String[] T00M846_A396EmprCod ;
   private String[] T00M846_A719PrdNum ;
   private boolean[] T00M846_n719PrdNum ;
   private short[] T00M846_A9713Tb1_Cod ;
   private String[] T00M847_A396EmprCod ;
   private String[] T00M847_A12236PrdNumD ;
   private String[] T00M847_A719PrdNum ;
   private boolean[] T00M847_n719PrdNum ;
   private String[] T00M848_A396EmprCod ;
   private long[] T00M848_A12225DocDisID ;
   private short[] T00M848_A12226LinDisID ;
   private String[] T00M849_A396EmprCod ;
   private long[] T00M849_A12225DocDisID ;
   private String[] T00M850_A396EmprCod ;
   private long[] T00M850_A12205OrdenCID ;
   private short[] T00M850_A12206OrdenCLnId ;
   private String[] T00M851_A396EmprCod ;
   private String[] T00M851_A719PrdNum ;
   private boolean[] T00M851_n719PrdNum ;
   private String[] T00M851_A11664LoteID ;
   private java.util.Date[] T00M851_A11665LoteFec ;
   private String[] T00M852_A396EmprCod ;
   private int[] T00M852_A4850DevComCod ;
   private String[] T00M852_A719PrdNum ;
   private boolean[] T00M852_n719PrdNum ;
   private String[] T00M853_A396EmprCod ;
   private int[] T00M853_A252CliCod ;
   private String[] T00M853_A494ForSer ;
   private String[] T00M853_A482ForColNom ;
   private int[] T00M853_A483ForColNum ;
   private byte[] T00M853_A831TipColCod ;
   private String[] T00M853_A3571EnsCod ;
   private short[] T00M853_A3582EnsLin ;
   private String[] T00M854_A396EmprCod ;
   private int[] T00M854_A129BarCod ;
   private byte[] T00M854_A132BarCodReo ;
   private String[] T00M854_A130BarCodPar ;
   private byte[] T00M854_A4075recestncol ;
   private byte[] T00M854_A4076recestnpro ;
   private short[] T00M854_A4108recestlin ;
   private String[] T00M855_A396EmprCod ;
   private int[] T00M855_A4052EstNumFor ;
   private byte[] T00M855_A4053EstNumCol ;
   private byte[] T00M855_A4090EstEspLin ;
   private String[] T00M856_A396EmprCod ;
   private int[] T00M856_A4052EstNumFor ;
   private byte[] T00M856_A4053EstNumCol ;
   private byte[] T00M856_A4084EstProLin ;
   private String[] T00M857_A396EmprCod ;
   private long[] T00M857_A11644TransferId ;
   private int[] T00M857_A11653TransferLn ;
   private String[] T00M858_A396EmprCod ;
   private String[] T00M858_A11634TaesId ;
   private short[] T00M858_A11637TaesLn ;
   private short[] T00M858_A11641TaesLnP ;
   private String[] T00M859_A396EmprCod ;
   private String[] T00M859_A719PrdNum ;
   private boolean[] T00M859_n719PrdNum ;
   private long[] T00M859_A11329H_stklin ;
   private String[] T00M860_A396EmprCod ;
   private int[] T00M860_A11270Pot_num ;
   private short[] T00M860_A11271Pot_lin ;
   private String[] T00M861_A396EmprCod ;
   private String[] T00M861_A719PrdNum ;
   private boolean[] T00M861_n719PrdNum ;
   private String[] T00M861_A11199PrdNcasC ;
   private String[] T00M862_A396EmprCod ;
   private String[] T00M862_A719PrdNum ;
   private boolean[] T00M862_n719PrdNum ;
   private String[] T00M862_A11197CFraseR ;
   private String[] T00M863_A396EmprCod ;
   private short[] T00M863_A10243Jt_codigo ;
   private short[] T00M863_A10246Jt_ord ;
   private String[] T00M864_A396EmprCod ;
   private java.util.Date[] T00M864_A10236Bny_dia ;
   private short[] T00M864_A10238Bny_lin ;
   private String[] T00M865_A396EmprCod ;
   private int[] T00M865_A129BarCod ;
   private byte[] T00M865_A132BarCodReo ;
   private String[] T00M865_A130BarCodPar ;
   private String[] T00M865_A758ProCod ;
   private short[] T00M865_A194BarOrdLin ;
   private String[] T00M865_A719PrdNum ;
   private boolean[] T00M865_n719PrdNum ;
   private String[] T00M866_A396EmprCod ;
   private String[] T00M866_A719PrdNum ;
   private boolean[] T00M866_n719PrdNum ;
   private String[] T00M866_A9735Cod_Rgo ;
   private String[] T00M867_A396EmprCod ;
   private String[] T00M867_A719PrdNum ;
   private boolean[] T00M867_n719PrdNum ;
   private short[] T00M867_A9711Ct_codigo ;
   private String[] T00M868_A396EmprCod ;
   private long[] T00M868_A9652OeNum ;
   private int[] T00M868_A9653OeHdr ;
   private byte[] T00M868_A9654OeHdrr ;
   private String[] T00M868_A9655OeHdrp ;
   private byte[] T00M868_A9656OeLinC ;
   private String[] T00M868_A9657OeComb ;
   private String[] T00M868_A9658Oefondo ;
   private byte[] T00M868_A9659OeMolCil ;
   private short[] T00M868_A9686OePasLin ;
   private short[] T00M868_A9694OePasPLi ;
   private String[] T00M869_A396EmprCod ;
   private long[] T00M869_A9652OeNum ;
   private int[] T00M869_A9653OeHdr ;
   private byte[] T00M869_A9654OeHdrr ;
   private String[] T00M869_A9655OeHdrp ;
   private byte[] T00M869_A9656OeLinC ;
   private String[] T00M869_A9657OeComb ;
   private String[] T00M869_A9658Oefondo ;
   private byte[] T00M869_A9659OeMolCil ;
   private byte[] T00M869_A9677OeMolLin ;
   private String[] T00M870_A396EmprCod ;
   private int[] T00M870_A9578Pas_Num ;
   private String[] T00M870_A719PrdNum ;
   private boolean[] T00M870_n719PrdNum ;
   private String[] T00M871_A396EmprCod ;
   private String[] T00M871_A719PrdNum ;
   private boolean[] T00M871_n719PrdNum ;
   private byte[] T00M871_A8908CC_AlmCod ;
   private String[] T00M872_A396EmprCod ;
   private String[] T00M872_A719PrdNum ;
   private boolean[] T00M872_n719PrdNum ;
   private int[] T00M872_A8661Almc_Ln ;
   private String[] T00M873_A396EmprCod ;
   private String[] T00M873_A719PrdNum ;
   private boolean[] T00M873_n719PrdNum ;
   private String[] T00M873_A8648Mat_PrdN ;
   private String[] T00M874_A396EmprCod ;
   private long[] T00M874_A8585Pet_cod ;
   private String[] T00M874_A719PrdNum ;
   private boolean[] T00M874_n719PrdNum ;
   private String[] T00M875_A396EmprCod ;
   private String[] T00M875_A719PrdNum ;
   private boolean[] T00M875_n719PrdNum ;
   private java.util.Date[] T00M875_A8577RecFecHr ;
   private String[] T00M876_A396EmprCod ;
   private String[] T00M876_A719PrdNum ;
   private boolean[] T00M876_n719PrdNum ;
   private short[] T00M876_A8366PrdAnyo ;
   private int[] T00M876_A8360PrdProv ;
   private String[] T00M877_A396EmprCod ;
   private int[] T00M877_A252CliCod ;
   private String[] T00M877_A494ForSer ;
   private String[] T00M877_A482ForColNom ;
   private int[] T00M877_A483ForColNum ;
   private byte[] T00M877_A831TipColCod ;
   private short[] T00M877_A7797Sim_lin ;
   private String[] T00M878_A396EmprCod ;
   private int[] T00M878_A7163Vir_Codigo ;
   private String[] T00M878_A719PrdNum ;
   private boolean[] T00M878_n719PrdNum ;
   private String[] T00M879_A396EmprCod ;
   private String[] T00M879_A6310Lb_TaAuxC ;
   private short[] T00M879_A6313lb_TaAuxL ;
   private short[] T00M879_A6378Lb_TauxLP ;
   private String[] T00M880_A396EmprCod ;
   private int[] T00M880_A6290PreCoNum ;
   private String[] T00M880_A719PrdNum ;
   private boolean[] T00M880_n719PrdNum ;
   private String[] T00M881_A396EmprCod ;
   private String[] T00M881_A719PrdNum ;
   private boolean[] T00M881_n719PrdNum ;
   private int[] T00M881_A6158PrdPrv ;
   private String[] T00M882_A396EmprCod ;
   private String[] T00M882_A719PrdNum ;
   private boolean[] T00M882_n719PrdNum ;
   private String[] T00M882_A5973PrdSusNum ;
   private String[] T00M883_A396EmprCod ;
   private String[] T00M883_A5612Lb_CodGru ;
   private short[] T00M883_A5615Lb_LinGru ;
   private String[] T00M884_A396EmprCod ;
   private int[] T00M884_A5532Lb_numero ;
   private String[] T00M884_A5555Lb_opcion ;
   private short[] T00M884_A5560Lb_LineaPr ;
   private String[] T00M885_A396EmprCod ;
   private int[] T00M885_A5532Lb_numero ;
   private String[] T00M885_A5555Lb_opcion ;
   private short[] T00M885_A5557Lb_LineaC ;
   private String[] T00M886_A396EmprCod ;
   private int[] T00M886_A5145SobCod ;
   private String[] T00M886_A719PrdNum ;
   private boolean[] T00M886_n719PrdNum ;
   private String[] T00M887_A396EmprCod ;
   private int[] T00M887_A4744RecPreCod ;
   private short[] T00M887_A4762RecPreLin ;
   private short[] T00M887_A4763RecPreNli ;
   private String[] T00M888_A396EmprCod ;
   private int[] T00M888_A4492HreBarCod ;
   private byte[] T00M888_A4493HreBarReo ;
   private String[] T00M888_A4494HreBarPar ;
   private byte[] T00M888_A4495HreNumCie ;
   private short[] T00M888_A4545HreLinMaq ;
   private byte[] T00M888_A4550HreLinPro ;
   private short[] T00M888_A4557HreRecLin ;
   private String[] T00M889_A396EmprCod ;
   private int[] T00M889_A4492HreBarCod ;
   private byte[] T00M889_A4493HreBarReo ;
   private String[] T00M889_A4494HreBarPar ;
   private byte[] T00M889_A4495HreNumCie ;
   private short[] T00M889_A4508HreLinMAL ;
   private byte[] T00M889_A4509HreNumAny ;
   private String[] T00M889_A719PrdNum ;
   private boolean[] T00M889_n719PrdNum ;
   private String[] T00M890_A396EmprCod ;
   private int[] T00M890_A252CliCod ;
   private String[] T00M890_A4415EstCol ;
   private short[] T00M890_A4416EstColLin ;
   private String[] T00M891_A396EmprCod ;
   private int[] T00M891_A129BarCod ;
   private byte[] T00M891_A132BarCodReo ;
   private String[] T00M891_A130BarCodPar ;
   private byte[] T00M891_A2524DisComLin ;
   private String[] T00M891_A1056DisComCod ;
   private String[] T00M891_A1032FonCod ;
   private byte[] T00M891_A2124RecMolCod ;
   private short[] T00M891_A2672RecPasLin ;
   private short[] T00M891_A2675RecPasPLi ;
   private String[] T00M892_A396EmprCod ;
   private int[] T00M892_A129BarCod ;
   private byte[] T00M892_A132BarCodReo ;
   private String[] T00M892_A130BarCodPar ;
   private byte[] T00M892_A2524DisComLin ;
   private String[] T00M892_A1056DisComCod ;
   private String[] T00M892_A1032FonCod ;
   private byte[] T00M892_A2124RecMolCod ;
   private byte[] T00M892_A2126RecMolLin ;
   private String[] T00M893_A396EmprCod ;
   private String[] T00M893_A2107PasCod ;
   private String[] T00M893_A719PrdNum ;
   private boolean[] T00M893_n719PrdNum ;
   private String[] T00M894_A396EmprCod ;
   private int[] T00M894_A2637HisEstHRu ;
   private byte[] T00M894_A2636HisEstHRe ;
   private String[] T00M894_A2635HisEstHPa ;
   private byte[] T00M894_A2638HisEstLCo ;
   private String[] T00M894_A2630HisEstCom ;
   private String[] T00M894_A2634HisEstFon ;
   private String[] T00M894_A719PrdNum ;
   private boolean[] T00M894_n719PrdNum ;
   private String[] T00M895_A396EmprCod ;
   private int[] T00M895_A252CliCod ;
   private String[] T00M895_A2141SerEst ;
   private String[] T00M895_A1013DibCli ;
   private int[] T00M895_A1014DibInt ;
   private String[] T00M895_A2074ColCom ;
   private String[] T00M895_A2078ColFon ;
   private byte[] T00M895_A2098MolCod ;
   private short[] T00M895_A2535ForPrdLin ;
   private String[] T00M896_A396EmprCod ;
   private String[] T00M896_A719PrdNum ;
   private boolean[] T00M896_n719PrdNum ;
   private long[] T00M896_A3342CCStkLin ;
   private String[] T00M897_A396EmprCod ;
   private int[] T00M897_A252CliCod ;
   private String[] T00M897_A2891HMaForSer ;
   private String[] T00M897_A2892HMaForCNom ;
   private int[] T00M897_A2893HMaForCNum ;
   private byte[] T00M897_A2894HMaTipCCod ;
   private int[] T00M897_A2895HMaForNumC ;
   private short[] T00M897_A2897HMaColLin ;
   private java.util.Date[] T00M897_A2896HMaFec ;
   private short[] T00M897_A2907HmaLin ;
   private String[] T00M898_A396EmprCod ;
   private int[] T00M898_A129BarCod ;
   private byte[] T00M898_A132BarCodReo ;
   private String[] T00M898_A130BarCodPar ;
   private short[] T00M898_A2808RecLinMAL ;
   private byte[] T00M898_A1377RecNumAny ;
   private String[] T00M898_A719PrdNum ;
   private boolean[] T00M898_n719PrdNum ;
   private String[] T00M899_A396EmprCod ;
   private int[] T00M899_A129BarCod ;
   private byte[] T00M899_A132BarCodReo ;
   private String[] T00M899_A130BarCodPar ;
   private short[] T00M899_A2804RecLinMaq ;
   private byte[] T00M899_A1273RecLinPro ;
   private short[] T00M899_A811RecLin ;
   private String[] T00M8100_A396EmprCod ;
   private int[] T00M8100_A129BarCod ;
   private byte[] T00M8100_A132BarCodReo ;
   private String[] T00M8100_A130BarCodPar ;
   private String[] T00M8100_A2494BarDosPro ;
   private String[] T00M8100_A719PrdNum ;
   private boolean[] T00M8100_n719PrdNum ;
   private String[] T00M8101_A396EmprCod ;
   private int[] T00M8101_A1314EnsLabCod ;
   private short[] T00M8101_A1317EnsLabLin ;
   private String[] T00M8102_A396EmprCod ;
   private String[] T00M8102_A910Workstat ;
   private int[] T00M8102_A887EscMLin ;
   private String[] T00M8103_A396EmprCod ;
   private int[] T00M8103_A859CumCodCont ;
   private String[] T00M8103_A719PrdNum ;
   private boolean[] T00M8103_n719PrdNum ;
   private String[] T00M8104_A396EmprCod ;
   private String[] T00M8104_A719PrdNum ;
   private boolean[] T00M8104_n719PrdNum ;
   private java.util.Date[] T00M8104_A810RecFec ;
   private String[] T00M8105_A396EmprCod ;
   private int[] T00M8105_A486ForNumCol ;
   private short[] T00M8105_A715PrdLin ;
   private String[] T00M8106_A396EmprCod ;
   private String[] T00M8106_A719PrdNum ;
   private boolean[] T00M8106_n719PrdNum ;
   private short[] T00M8106_A681PrdAny ;
   private String[] T00M8107_A396EmprCod ;
   private String[] T00M8107_A719PrdNum ;
   private boolean[] T00M8107_n719PrdNum ;
   private String[] T00M8107_A688PrdComCod ;
   private String[] T00M8108_A396EmprCod ;
   private String[] T00M8108_A719PrdNum ;
   private boolean[] T00M8108_n719PrdNum ;
   private String[] T00M8108_A680PrdAltNum ;
   private String[] T00M8109_A396EmprCod ;
   private int[] T00M8109_A658PedCod ;
   private String[] T00M8109_A719PrdNum ;
   private boolean[] T00M8109_n719PrdNum ;
   private String[] T00M8110_A396EmprCod ;
   private int[] T00M8110_A486ForNumCol ;
   private short[] T00M8110_A309ColLin ;
   private String[] T00M8111_A396EmprCod ;
   private String[] T00M8111_A719PrdNum ;
   private boolean[] T00M8111_n719PrdNum ;
   private int[] T00M8111_A647NumCon ;
   private String[] T00M8112_A396EmprCod ;
   private String[] T00M8112_A719PrdNum ;
   private boolean[] T00M8112_n719PrdNum ;
   private String[] T00M8113_A942TermCod ;
   private String[] T00M8114_A942TermCod ;
   private String[] T00M813_A735PrdSusNom ;
   private boolean[] T00M813_n735PrdSusNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tprdger__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdger__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdger__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdger__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tprdger__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00M82", "SELECT PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdNum, PrdNom, PrdDscTec, PrdFacCon, PrdRefPrv, PrdSus, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdFecPre, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdPesCon, PrdPesTerm, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, EmprCod, MetCod, PrvNum, TipDtoCod, PrdUniCom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom, PrdDscTec, PrdFacCon, PrdRefPrv, PrdSus, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdFecPre, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdPesCon, PrdPesTerm, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M83", "SELECT PrdUniCon, ValCod, TipPrdCod, SubFamCod, PrdNum, PrdNom, PrdDscTec, PrdFacCon, PrdRefPrv, PrdSus, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdFecPre, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdPesCon, PrdPesTerm, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, EmprCod, MetCod, PrvNum, TipDtoCod, PrdUniCom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M84", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M85", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M86", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M87", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M88", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M89", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M810", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M811", "SELECT TipPrdDsc FROM TXPTIPPRD WHERE EmprCod = ? AND TipPrdCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M812", "SELECT SubFamDsc FROM TXPSUBFSP WHERE EmprCod = ? AND SubFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M813", "SELECT COALESCE( PrdNum, '') AS PrdSusNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M814", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdUniCon AS PrdUniCon, TM1.ValCod, TM1.TipPrdCod, TM1.SubFamCod, TM1.PrdNum, T2.EmprNom, TM1.PrdNom, TM1.PrdDscTec, T3.UniDsc AS PrdUcpDsc, T4.UniDsc AS PrdUcoDsc, TM1.PrdFacCon, T5.PrvNom, TM1.PrdRefPrv, TM1.PrdSus, T6.ValDsc, TM1.PrdRec, TM1.PrdCalNec, TM1.PrdDetPar, TM1.PrdSit, TM1.PrdRotRea, T7.TipDtoDto, TM1.PrdPreAct, TM1.PrdFecPre, TM1.PrdPreAnt, TM1.PrdPreMed, TM1.PrdConDia, TM1.PrdStkMinD, TM1.PrdStkMinU, TM1.PrdDiaRot, TM1.PrdPlaEnt, T8.MetDsc, TM1.PrdLotMin, TM1.PrdNumUco, TM1.PrdExiAlm, TM1.PrdExiCC, TM1.PrdCanRes, TM1.PrdCanPen, TM1.PrdFulEnt, TM1.PrdFulPed, TM1.PrdFulCC, TM1.PrdExiCCP, TM1.PrdUltECC, TM1.PrdUltCCC, TM1.PrdUltDCC, TM1.PrdDifCC, TM1.PrdConCC, TM1.PrdValStk, TM1.DifValStk, TM1.PrdFecEnt, TM1.PrdPosX, TM1.PrdPosY, TM1.PrdTip, TM1.PrdDqo, TM1.PrdRev, TM1.PrdTnq, TM1.PrdNom2, TM1.PrdNum2, TM1.PrdObs, TM1.PrdUMeFo, TM1.PrdPreAc2, TM1.PrdDensS, TM1.PrdConcS, TM1.PrdSalM, TM1.PrdSolub, T9.TipPrdDsc, TM1.PrdNumCent, TM1.PrdNumct1, TM1.PrdNumct2, TM1.PrdHorMad, TM1.PrdExiAlmc, TM1.PrdPesCon, TM1.PrdPesTerm, TM1.PrdSal, T10.SubFamDsc, TM1.PrdInc, TM1.PrdComp, TM1.PrdAox, TM1.PrdNCAS, TM1.PrdFT, TM1.PrdFFT, TM1.PrdHS, TM1.PrdFHS, TM1.PrdReach, TM1.PrdOkotex, TM1.PrdColIdx, TM1.PrdLote, TM1.PrdRTM, TM1.PrdCtw1, TM1.PrdCtw2, TM1.PrdCtw3, TM1.PrdCtw4, TM1.PrdNroCAS, TM1.PrdGots, TM1.PrdHm, TM1.PrdConct, TM1.PrdEINECS, TM1.PrdFuncion, TM1.PrdNmQu, TM1.PrdList, TM1.EmprCod, TM1.MetCod, TM1.PrvNum, TM1.TipDtoCod, TM1.PrdUniCom AS PrdUniCom FROM (((((((((TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = TM1.EmprCod AND T3.UniCod = TM1.PrdUniCom) INNER JOIN TXPTIPUNI T4 ON T4.EmprCod = TM1.EmprCod AND T4.UniCod = TM1.PrdUniCon) INNER JOIN TXPPRVGEN T5 ON T5.EmprCod = TM1.EmprCod AND T5.PrvNum = TM1.PrvNum) INNER JOIN TXPTIPVAL T6 ON T6.EmprCod = TM1.EmprCod AND T6.ValCod = TM1.ValCod) LEFT JOIN TXPTIPDTO T7 ON T7.EmprCod = TM1.EmprCod AND T7.TipDtoCod = TM1.TipDtoCod) LEFT JOIN TXPMETPED T8 ON T8.EmprCod = TM1.EmprCod AND T8.MetCod = TM1.MetCod) LEFT JOIN TXPTIPPRD T9 ON T9.EmprCod = TM1.EmprCod AND T9.TipPrdCod = TM1.TipPrdCod) LEFT JOIN TXPSUBFSP T10 ON T10.EmprCod = TM1.EmprCod AND T10.SubFamCod = TM1.SubFamCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M815", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M816", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M817", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M818", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M819", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M820", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M821", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M822", "SELECT TipPrdDsc FROM TXPTIPPRD WHERE EmprCod = ? AND TipPrdCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M823", "SELECT SubFamDsc FROM TXPSUBFSP WHERE EmprCod = ? AND SubFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M824", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M825", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ?) ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M826", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ?) ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00M827", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, PrdDscTec, PrdFacCon, PrdRefPrv, PrdSus, PrdRec, PrdCalNec, PrdDetPar, PrdSit, PrdRotRea, PrdPreAct, PrdFecPre, PrdPreAnt, PrdPreMed, PrdConDia, PrdStkMinD, PrdStkMinU, PrdDiaRot, PrdPlaEnt, PrdLotMin, PrdNumUco, PrdExiAlm, PrdExiCC, PrdCanRes, PrdCanPen, PrdFulEnt, PrdFulPed, PrdFulCC, PrdExiCCP, PrdUltECC, PrdUltCCC, PrdUltDCC, PrdDifCC, PrdConCC, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, PrdNom2, PrdNum2, PrdObs, PrdUMeFo, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, PrdNumct1, PrdNumct2, PrdHorMad, PrdExiAlmc, PrdPesCon, PrdPesTerm, PrdSal, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdCtw4, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdList, EmprCod, MetCod, PrvNum, TipDtoCod, PrdUniCom, PrdUniCon, ValCod, TipPrdCod, SubFamCod, MovEspULin, CCStKULin, PrdPreRef, Mat_Lts, Almc_Ult, PrdAltAct, CC_Ultln, PrdEqLP, PrdConc, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T00M828", "UPDATE TXPPRODUC SET PrdNom=?, PrdDscTec=?, PrdFacCon=?, PrdRefPrv=?, PrdSus=?, PrdRec=?, PrdCalNec=?, PrdDetPar=?, PrdSit=?, PrdRotRea=?, PrdPreAct=?, PrdFecPre=?, PrdPreAnt=?, PrdPreMed=?, PrdConDia=?, PrdStkMinD=?, PrdStkMinU=?, PrdDiaRot=?, PrdPlaEnt=?, PrdLotMin=?, PrdNumUco=?, PrdExiAlm=?, PrdExiCC=?, PrdCanRes=?, PrdCanPen=?, PrdFulEnt=?, PrdFulPed=?, PrdFulCC=?, PrdExiCCP=?, PrdUltECC=?, PrdUltCCC=?, PrdUltDCC=?, PrdDifCC=?, PrdConCC=?, PrdValStk=?, DifValStk=?, PrdFecEnt=?, PrdPosX=?, PrdPosY=?, PrdTip=?, PrdDqo=?, PrdRev=?, PrdTnq=?, PrdNom2=?, PrdNum2=?, PrdObs=?, PrdUMeFo=?, PrdPreAc2=?, PrdDensS=?, PrdConcS=?, PrdSalM=?, PrdSolub=?, PrdNumCent=?, PrdNumct1=?, PrdNumct2=?, PrdHorMad=?, PrdExiAlmc=?, PrdPesCon=?, PrdPesTerm=?, PrdSal=?, PrdInc=?, PrdComp=?, PrdAox=?, PrdNCAS=?, PrdFT=?, PrdFFT=?, PrdHS=?, PrdFHS=?, PrdReach=?, PrdOkotex=?, PrdColIdx=?, PrdLote=?, PrdRTM=?, PrdCtw1=?, PrdCtw2=?, PrdCtw3=?, PrdCtw4=?, PrdNroCAS=?, PrdGots=?, PrdHm=?, PrdConct=?, PrdEINECS=?, PrdFuncion=?, PrdNmQu=?, PrdList=?, MetCod=?, PrvNum=?, TipDtoCod=?, PrdUniCom=?, PrdUniCon=?, ValCod=?, TipPrdCod=?, SubFamCod=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T00M829", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T00M830", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M831", "SELECT UniDsc AS PrdUcpDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M832", "SELECT UniDsc AS PrdUcoDsc FROM TXPTIPUNI WHERE EmprCod = ? AND UniCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M833", "SELECT PrvNom FROM TXPPRVGEN WHERE EmprCod = ? AND PrvNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M834", "SELECT ValDsc FROM TXPTIPVAL WHERE EmprCod = ? AND ValCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M835", "SELECT TipDtoDto FROM TXPTIPDTO WHERE EmprCod = ? AND TipDtoCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M836", "SELECT MetDsc FROM TXPMETPED WHERE EmprCod = ? AND MetCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M837", "SELECT TipPrdDsc FROM TXPTIPPRD WHERE EmprCod = ? AND TipPrdCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M838", "SELECT SubFamDsc FROM TXPSUBFSP WHERE EmprCod = ? AND SubFamCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M839", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M840", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M841", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M842", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M843", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M844", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M845", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M846", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M847", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M848", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M849", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M850", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M851", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M852", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M853", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M854", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M855", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M856", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M857", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M858", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M859", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M860", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M861", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M862", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M863", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M864", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M865", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M866", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M867", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M868", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M869", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M870", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M871", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M872", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M873", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M874", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M875", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M876", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M877", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M878", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M879", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M880", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M881", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M882", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M883", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M884", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M885", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M886", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M887", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M888", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M889", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M890", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M891", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M892", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M893", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M894", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M895", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M896", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M897", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M898", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M899", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8100", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8101", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8102", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8103", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8104", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8105", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8106", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8107", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8108", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8109", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8110", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8111", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00M8112", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M8113", "SELECT TermCod FROM TXPTERMIN ORDER BY TermCod ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00M8114", "SELECT TermCod FROM TXPTERMIN ORDER BY TermCod ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,5);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(17);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[23])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(27,4);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(28,4);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(29,4);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(30,4);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(31);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(32);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(33);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[38])[0] = rslt.getShort(36);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[41])[0] = rslt.getShort(39);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(40,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(41,2);
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(42);
               ((short[]) buf[45])[0] = rslt.getShort(43);
               ((byte[]) buf[46])[0] = rslt.getByte(44);
               ((String[]) buf[47])[0] = rslt.getString(45, 1);
               ((short[]) buf[48])[0] = rslt.getShort(46);
               ((String[]) buf[49])[0] = rslt.getString(47, 1);
               ((byte[]) buf[50])[0] = rslt.getByte(48);
               ((String[]) buf[51])[0] = rslt.getString(49, 40);
               ((String[]) buf[52])[0] = rslt.getString(50, 16);
               ((String[]) buf[53])[0] = rslt.getVarchar(51);
               ((byte[]) buf[54])[0] = rslt.getByte(52);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(53,5);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(54,3);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(55,3);
               ((String[]) buf[58])[0] = rslt.getString(56, 1);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(57,2);
               ((String[]) buf[60])[0] = rslt.getString(58, 6);
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(59,2);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(60,2);
               ((byte[]) buf[63])[0] = rslt.getByte(61);
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(62,4);
               ((byte[]) buf[65])[0] = rslt.getByte(63);
               ((String[]) buf[66])[0] = rslt.getString(64, 10);
               ((String[]) buf[67])[0] = rslt.getString(65, 1);
               ((String[]) buf[68])[0] = rslt.getString(66, 2);
               ((String[]) buf[69])[0] = rslt.getString(67, 2);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(68,2);
               ((String[]) buf[71])[0] = rslt.getString(69, 30);
               ((String[]) buf[72])[0] = rslt.getString(70, 1);
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDate(71);
               ((String[]) buf[74])[0] = rslt.getString(72, 1);
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDate(73);
               ((String[]) buf[76])[0] = rslt.getString(74, 1);
               ((String[]) buf[77])[0] = rslt.getString(75, 1);
               ((String[]) buf[78])[0] = rslt.getString(76, 10);
               ((String[]) buf[79])[0] = rslt.getString(77, 26);
               ((String[]) buf[80])[0] = rslt.getString(78, 10);
               ((String[]) buf[81])[0] = rslt.getString(79, 3);
               ((String[]) buf[82])[0] = rslt.getString(80, 20);
               ((String[]) buf[83])[0] = rslt.getString(81, 3);
               ((String[]) buf[84])[0] = rslt.getString(82, 3);
               ((String[]) buf[85])[0] = rslt.getString(83, 40);
               ((String[]) buf[86])[0] = rslt.getString(84, 1);
               ((String[]) buf[87])[0] = rslt.getString(85, 1);
               ((short[]) buf[88])[0] = rslt.getShort(86);
               ((String[]) buf[89])[0] = rslt.getString(87, 40);
               ((String[]) buf[90])[0] = rslt.getString(88, 50);
               ((String[]) buf[91])[0] = rslt.getVarchar(89);
               ((String[]) buf[92])[0] = rslt.getString(90, 1);
               ((String[]) buf[93])[0] = rslt.getString(91, 3);
               ((byte[]) buf[94])[0] = rslt.getByte(92);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((int[]) buf[96])[0] = rslt.getInt(93);
               ((byte[]) buf[97])[0] = rslt.getByte(94);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((byte[]) buf[99])[0] = rslt.getByte(95);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((String[]) buf[7])[0] = rslt.getString(6, 26);
               ((String[]) buf[8])[0] = rslt.getString(7, 4);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[10])[0] = rslt.getString(9, 30);
               ((String[]) buf[11])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(11, 1);
               ((String[]) buf[14])[0] = rslt.getString(12, 1);
               ((String[]) buf[15])[0] = rslt.getString(13, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(16,5);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(17);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(18,5);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(19,5);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[23])[0] = rslt.getShort(21);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[25])[0] = rslt.getShort(23);
               ((short[]) buf[26])[0] = rslt.getShort(24);
               ((short[]) buf[27])[0] = rslt.getShort(25);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(27,4);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(28,4);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(29,4);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(30,4);
               ((java.util.Date[]) buf[33])[0] = rslt.getGXDate(31);
               ((java.util.Date[]) buf[34])[0] = rslt.getGXDate(32);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(33);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(34,2);
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(35,2);
               ((short[]) buf[38])[0] = rslt.getShort(36);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(37,2);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(38,2);
               ((short[]) buf[41])[0] = rslt.getShort(39);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(40,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(41,2);
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDate(42);
               ((short[]) buf[45])[0] = rslt.getShort(43);
               ((byte[]) buf[46])[0] = rslt.getByte(44);
               ((String[]) buf[47])[0] = rslt.getString(45, 1);
               ((short[]) buf[48])[0] = rslt.getShort(46);
               ((String[]) buf[49])[0] = rslt.getString(47, 1);
               ((byte[]) buf[50])[0] = rslt.getByte(48);
               ((String[]) buf[51])[0] = rslt.getString(49, 40);
               ((String[]) buf[52])[0] = rslt.getString(50, 16);
               ((String[]) buf[53])[0] = rslt.getVarchar(51);
               ((byte[]) buf[54])[0] = rslt.getByte(52);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(53,5);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(54,3);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(55,3);
               ((String[]) buf[58])[0] = rslt.getString(56, 1);
               ((java.math.BigDecimal[]) buf[59])[0] = rslt.getBigDecimal(57,2);
               ((String[]) buf[60])[0] = rslt.getString(58, 6);
               ((java.math.BigDecimal[]) buf[61])[0] = rslt.getBigDecimal(59,2);
               ((java.math.BigDecimal[]) buf[62])[0] = rslt.getBigDecimal(60,2);
               ((byte[]) buf[63])[0] = rslt.getByte(61);
               ((java.math.BigDecimal[]) buf[64])[0] = rslt.getBigDecimal(62,4);
               ((byte[]) buf[65])[0] = rslt.getByte(63);
               ((String[]) buf[66])[0] = rslt.getString(64, 10);
               ((String[]) buf[67])[0] = rslt.getString(65, 1);
               ((String[]) buf[68])[0] = rslt.getString(66, 2);
               ((String[]) buf[69])[0] = rslt.getString(67, 2);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(68,2);
               ((String[]) buf[71])[0] = rslt.getString(69, 30);
               ((String[]) buf[72])[0] = rslt.getString(70, 1);
               ((java.util.Date[]) buf[73])[0] = rslt.getGXDate(71);
               ((String[]) buf[74])[0] = rslt.getString(72, 1);
               ((java.util.Date[]) buf[75])[0] = rslt.getGXDate(73);
               ((String[]) buf[76])[0] = rslt.getString(74, 1);
               ((String[]) buf[77])[0] = rslt.getString(75, 1);
               ((String[]) buf[78])[0] = rslt.getString(76, 10);
               ((String[]) buf[79])[0] = rslt.getString(77, 26);
               ((String[]) buf[80])[0] = rslt.getString(78, 10);
               ((String[]) buf[81])[0] = rslt.getString(79, 3);
               ((String[]) buf[82])[0] = rslt.getString(80, 20);
               ((String[]) buf[83])[0] = rslt.getString(81, 3);
               ((String[]) buf[84])[0] = rslt.getString(82, 3);
               ((String[]) buf[85])[0] = rslt.getString(83, 40);
               ((String[]) buf[86])[0] = rslt.getString(84, 1);
               ((String[]) buf[87])[0] = rslt.getString(85, 1);
               ((short[]) buf[88])[0] = rslt.getShort(86);
               ((String[]) buf[89])[0] = rslt.getString(87, 40);
               ((String[]) buf[90])[0] = rslt.getString(88, 50);
               ((String[]) buf[91])[0] = rslt.getVarchar(89);
               ((String[]) buf[92])[0] = rslt.getString(90, 1);
               ((String[]) buf[93])[0] = rslt.getString(91, 3);
               ((byte[]) buf[94])[0] = rslt.getByte(92);
               ((boolean[]) buf[95])[0] = rslt.wasNull();
               ((int[]) buf[96])[0] = rslt.getInt(93);
               ((byte[]) buf[97])[0] = rslt.getByte(94);
               ((boolean[]) buf[98])[0] = rslt.wasNull();
               ((byte[]) buf[99])[0] = rslt.getByte(95);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 6);
               ((String[]) buf[7])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 26);
               ((String[]) buf[10])[0] = rslt.getString(8, 4);
               ((String[]) buf[11])[0] = rslt.getString(9, 8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(10, 8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[16])[0] = rslt.getString(12, 30);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((String[]) buf[19])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 16);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(16, 1);
               ((String[]) buf[24])[0] = rslt.getString(17, 1);
               ((String[]) buf[25])[0] = rslt.getString(18, 1);
               ((byte[]) buf[26])[0] = rslt.getByte(19);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(20,5);
               ((java.math.BigDecimal[]) buf[28])[0] = rslt.getBigDecimal(21,2);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(22,5);
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDate(23);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(24,5);
               ((java.math.BigDecimal[]) buf[33])[0] = rslt.getBigDecimal(25,5);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(26,2);
               ((short[]) buf[35])[0] = rslt.getShort(27);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(28,2);
               ((short[]) buf[37])[0] = rslt.getShort(29);
               ((short[]) buf[38])[0] = rslt.getShort(30);
               ((String[]) buf[39])[0] = rslt.getString(31, 8);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((short[]) buf[41])[0] = rslt.getShort(32);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(33,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(34,4);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(35,4);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(36,4);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(37,4);
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(38);
               ((java.util.Date[]) buf[48])[0] = rslt.getGXDate(39);
               ((java.util.Date[]) buf[49])[0] = rslt.getGXDate(40);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[51])[0] = rslt.getBigDecimal(42,2);
               ((short[]) buf[52])[0] = rslt.getShort(43);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(44,2);
               ((java.math.BigDecimal[]) buf[54])[0] = rslt.getBigDecimal(45,2);
               ((short[]) buf[55])[0] = rslt.getShort(46);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(47,2);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(48,2);
               ((java.util.Date[]) buf[58])[0] = rslt.getGXDate(49);
               ((short[]) buf[59])[0] = rslt.getShort(50);
               ((byte[]) buf[60])[0] = rslt.getByte(51);
               ((String[]) buf[61])[0] = rslt.getString(52, 1);
               ((short[]) buf[62])[0] = rslt.getShort(53);
               ((String[]) buf[63])[0] = rslt.getString(54, 1);
               ((byte[]) buf[64])[0] = rslt.getByte(55);
               ((String[]) buf[65])[0] = rslt.getString(56, 40);
               ((String[]) buf[66])[0] = rslt.getString(57, 16);
               ((String[]) buf[67])[0] = rslt.getVarchar(58);
               ((byte[]) buf[68])[0] = rslt.getByte(59);
               ((java.math.BigDecimal[]) buf[69])[0] = rslt.getBigDecimal(60,5);
               ((java.math.BigDecimal[]) buf[70])[0] = rslt.getBigDecimal(61,3);
               ((java.math.BigDecimal[]) buf[71])[0] = rslt.getBigDecimal(62,3);
               ((String[]) buf[72])[0] = rslt.getString(63, 1);
               ((java.math.BigDecimal[]) buf[73])[0] = rslt.getBigDecimal(64,2);
               ((String[]) buf[74])[0] = rslt.getString(65, 40);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(66, 6);
               ((java.math.BigDecimal[]) buf[77])[0] = rslt.getBigDecimal(67,2);
               ((java.math.BigDecimal[]) buf[78])[0] = rslt.getBigDecimal(68,2);
               ((byte[]) buf[79])[0] = rslt.getByte(69);
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(70,4);
               ((byte[]) buf[81])[0] = rslt.getByte(71);
               ((String[]) buf[82])[0] = rslt.getString(72, 10);
               ((String[]) buf[83])[0] = rslt.getString(73, 1);
               ((String[]) buf[84])[0] = rslt.getString(74, 40);
               ((boolean[]) buf[85])[0] = rslt.wasNull();
               ((String[]) buf[86])[0] = rslt.getString(75, 2);
               ((String[]) buf[87])[0] = rslt.getString(76, 2);
               ((java.math.BigDecimal[]) buf[88])[0] = rslt.getBigDecimal(77,2);
               ((String[]) buf[89])[0] = rslt.getString(78, 30);
               ((String[]) buf[90])[0] = rslt.getString(79, 1);
               ((java.util.Date[]) buf[91])[0] = rslt.getGXDate(80);
               ((String[]) buf[92])[0] = rslt.getString(81, 1);
               ((java.util.Date[]) buf[93])[0] = rslt.getGXDate(82);
               ((String[]) buf[94])[0] = rslt.getString(83, 1);
               ((String[]) buf[95])[0] = rslt.getString(84, 1);
               ((String[]) buf[96])[0] = rslt.getString(85, 10);
               ((String[]) buf[97])[0] = rslt.getString(86, 26);
               ((String[]) buf[98])[0] = rslt.getString(87, 10);
               ((String[]) buf[99])[0] = rslt.getString(88, 3);
               ((String[]) buf[100])[0] = rslt.getString(89, 20);
               ((String[]) buf[101])[0] = rslt.getString(90, 3);
               ((String[]) buf[102])[0] = rslt.getString(91, 3);
               ((String[]) buf[103])[0] = rslt.getString(92, 40);
               ((String[]) buf[104])[0] = rslt.getString(93, 1);
               ((String[]) buf[105])[0] = rslt.getString(94, 1);
               ((short[]) buf[106])[0] = rslt.getShort(95);
               ((String[]) buf[107])[0] = rslt.getString(96, 40);
               ((String[]) buf[108])[0] = rslt.getString(97, 50);
               ((String[]) buf[109])[0] = rslt.getVarchar(98);
               ((String[]) buf[110])[0] = rslt.getString(99, 1);
               ((String[]) buf[111])[0] = rslt.getString(100, 3);
               ((byte[]) buf[112])[0] = rslt.getByte(101);
               ((boolean[]) buf[113])[0] = rslt.wasNull();
               ((int[]) buf[114])[0] = rslt.getInt(102);
               ((byte[]) buf[115])[0] = rslt.getByte(103);
               ((boolean[]) buf[116])[0] = rslt.wasNull();
               ((byte[]) buf[117])[0] = rslt.getByte(104);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 33 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
      }
      getresults60( cursor, rslt, buf) ;
   }

   public void getresults60( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 94 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 95 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 102 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 103 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 104 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 105 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 106 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 107 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 108 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 109 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 110 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 111 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
               return;
            case 112 :
               ((String[]) buf[0])[0] = rslt.getString(1, 10);
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 1 :
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
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 20 :
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
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 22 :
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
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               stmt.setString(3, (String)parms[3], 4);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 4);
               stmt.setString(5, (String)parms[5], 30);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[7], 6);
               }
               stmt.setString(7, (String)parms[8], 1);
               stmt.setString(8, (String)parms[9], 1);
               stmt.setString(9, (String)parms[10], 1);
               stmt.setByte(10, ((Number) parms[11]).byteValue());
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[12], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[13], 5);
               stmt.setDate(13, (java.util.Date)parms[14]);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[15], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[16], 5);
               stmt.setBigDecimal(16, (java.math.BigDecimal)parms[17], 2);
               stmt.setShort(17, ((Number) parms[18]).shortValue());
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[19], 2);
               stmt.setShort(19, ((Number) parms[20]).shortValue());
               stmt.setShort(20, ((Number) parms[21]).shortValue());
               stmt.setShort(21, ((Number) parms[22]).shortValue());
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[23], 2);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[24], 4);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[25], 4);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[26], 4);
               stmt.setBigDecimal(26, (java.math.BigDecimal)parms[27], 4);
               stmt.setDate(27, (java.util.Date)parms[28]);
               stmt.setDate(28, (java.util.Date)parms[29]);
               stmt.setDate(29, (java.util.Date)parms[30]);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[31], 2);
               stmt.setBigDecimal(31, (java.math.BigDecimal)parms[32], 2);
               stmt.setShort(32, ((Number) parms[33]).shortValue());
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[35], 2);
               stmt.setShort(35, ((Number) parms[36]).shortValue());
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[37], 2);
               stmt.setBigDecimal(37, (java.math.BigDecimal)parms[38], 2);
               stmt.setDate(38, (java.util.Date)parms[39]);
               stmt.setShort(39, ((Number) parms[40]).shortValue());
               stmt.setByte(40, ((Number) parms[41]).byteValue());
               stmt.setString(41, (String)parms[42], 1);
               stmt.setShort(42, ((Number) parms[43]).shortValue());
               stmt.setString(43, (String)parms[44], 1);
               stmt.setByte(44, ((Number) parms[45]).byteValue());
               stmt.setString(45, (String)parms[46], 40);
               stmt.setString(46, (String)parms[47], 16);
               stmt.setVarchar(47, (String)parms[48], 1024, false);
               stmt.setByte(48, ((Number) parms[49]).byteValue());
               stmt.setBigDecimal(49, (java.math.BigDecimal)parms[50], 5);
               stmt.setBigDecimal(50, (java.math.BigDecimal)parms[51], 3);
               stmt.setBigDecimal(51, (java.math.BigDecimal)parms[52], 3);
               stmt.setString(52, (String)parms[53], 1);
               stmt.setBigDecimal(53, (java.math.BigDecimal)parms[54], 2);
               stmt.setString(54, (String)parms[55], 6);
               stmt.setBigDecimal(55, (java.math.BigDecimal)parms[56], 2);
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[57], 2);
               stmt.setByte(57, ((Number) parms[58]).byteValue());
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[59], 4);
               stmt.setByte(59, ((Number) parms[60]).byteValue());
               stmt.setString(60, (String)parms[61], 10);
               stmt.setString(61, (String)parms[62], 1);
               stmt.setString(62, (String)parms[63], 2);
               stmt.setString(63, (String)parms[64], 2);
               stmt.setBigDecimal(64, (java.math.BigDecimal)parms[65], 2);
               stmt.setString(65, (String)parms[66], 30);
               stmt.setString(66, (String)parms[67], 1);
               stmt.setDate(67, (java.util.Date)parms[68]);
               stmt.setString(68, (String)parms[69], 1);
               stmt.setDate(69, (java.util.Date)parms[70]);
               stmt.setString(70, (String)parms[71], 1);
               stmt.setString(71, (String)parms[72], 1);
               stmt.setString(72, (String)parms[73], 10);
               stmt.setString(73, (String)parms[74], 26);
               stmt.setString(74, (String)parms[75], 10);
               stmt.setString(75, (String)parms[76], 3);
               stmt.setString(76, (String)parms[77], 20);
               stmt.setString(77, (String)parms[78], 3);
               stmt.setString(78, (String)parms[79], 3);
               stmt.setString(79, (String)parms[80], 40);
               stmt.setString(80, (String)parms[81], 1);
               stmt.setString(81, (String)parms[82], 1);
               stmt.setShort(82, ((Number) parms[83]).shortValue());
               stmt.setString(83, (String)parms[84], 40);
               stmt.setString(84, (String)parms[85], 50);
               stmt.setVarchar(85, (String)parms[86], 200, false);
               stmt.setString(86, (String)parms[87], 1);
               stmt.setString(87, (String)parms[88], 3);
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(88, ((Number) parms[90]).byteValue());
               }
               stmt.setInt(89, ((Number) parms[91]).intValue());
               if ( ((Boolean) parms[92]).booleanValue() )
               {
                  stmt.setNull( 90 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(90, ((Number) parms[93]).byteValue());
               }
               stmt.setByte(91, ((Number) parms[94]).byteValue());
               stmt.setByte(92, ((Number) parms[95]).byteValue());
               stmt.setByte(93, ((Number) parms[96]).byteValue());
               if ( ((Boolean) parms[97]).booleanValue() )
               {
                  stmt.setNull( 94 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(94, ((Number) parms[98]).shortValue());
               }
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(95, ((Number) parms[100]).byteValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 4);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 4);
               stmt.setString(4, (String)parms[3], 30);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 1);
               stmt.setString(8, (String)parms[8], 1);
               stmt.setByte(9, ((Number) parms[9]).byteValue());
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 5);
               stmt.setDate(12, (java.util.Date)parms[12]);
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[13], 5);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 5);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[15], 2);
               stmt.setShort(16, ((Number) parms[16]).shortValue());
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[17], 2);
               stmt.setShort(18, ((Number) parms[18]).shortValue());
               stmt.setShort(19, ((Number) parms[19]).shortValue());
               stmt.setShort(20, ((Number) parms[20]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[21], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[22], 4);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[23], 4);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[24], 4);
               stmt.setBigDecimal(25, (java.math.BigDecimal)parms[25], 4);
               stmt.setDate(26, (java.util.Date)parms[26]);
               stmt.setDate(27, (java.util.Date)parms[27]);
               stmt.setDate(28, (java.util.Date)parms[28]);
               stmt.setBigDecimal(29, (java.math.BigDecimal)parms[29], 2);
               stmt.setBigDecimal(30, (java.math.BigDecimal)parms[30], 2);
               stmt.setShort(31, ((Number) parms[31]).shortValue());
               stmt.setBigDecimal(32, (java.math.BigDecimal)parms[32], 2);
               stmt.setBigDecimal(33, (java.math.BigDecimal)parms[33], 2);
               stmt.setShort(34, ((Number) parms[34]).shortValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[35], 2);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[36], 2);
               stmt.setDate(37, (java.util.Date)parms[37]);
               stmt.setShort(38, ((Number) parms[38]).shortValue());
               stmt.setByte(39, ((Number) parms[39]).byteValue());
               stmt.setString(40, (String)parms[40], 1);
               stmt.setShort(41, ((Number) parms[41]).shortValue());
               stmt.setString(42, (String)parms[42], 1);
               stmt.setByte(43, ((Number) parms[43]).byteValue());
               stmt.setString(44, (String)parms[44], 40);
               stmt.setString(45, (String)parms[45], 16);
               stmt.setVarchar(46, (String)parms[46], 1024, false);
               stmt.setByte(47, ((Number) parms[47]).byteValue());
               stmt.setBigDecimal(48, (java.math.BigDecimal)parms[48], 5);
               stmt.setBigDecimal(49, (java.math.BigDecimal)parms[49], 3);
               stmt.setBigDecimal(50, (java.math.BigDecimal)parms[50], 3);
               stmt.setString(51, (String)parms[51], 1);
               stmt.setBigDecimal(52, (java.math.BigDecimal)parms[52], 2);
               stmt.setString(53, (String)parms[53], 6);
               stmt.setBigDecimal(54, (java.math.BigDecimal)parms[54], 2);
               stmt.setBigDecimal(55, (java.math.BigDecimal)parms[55], 2);
               stmt.setByte(56, ((Number) parms[56]).byteValue());
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[57], 4);
               stmt.setByte(58, ((Number) parms[58]).byteValue());
               stmt.setString(59, (String)parms[59], 10);
               stmt.setString(60, (String)parms[60], 1);
               stmt.setString(61, (String)parms[61], 2);
               stmt.setString(62, (String)parms[62], 2);
               stmt.setBigDecimal(63, (java.math.BigDecimal)parms[63], 2);
               stmt.setString(64, (String)parms[64], 30);
               stmt.setString(65, (String)parms[65], 1);
               stmt.setDate(66, (java.util.Date)parms[66]);
               stmt.setString(67, (String)parms[67], 1);
               stmt.setDate(68, (java.util.Date)parms[68]);
               stmt.setString(69, (String)parms[69], 1);
               stmt.setString(70, (String)parms[70], 1);
               stmt.setString(71, (String)parms[71], 10);
               stmt.setString(72, (String)parms[72], 26);
               stmt.setString(73, (String)parms[73], 10);
               stmt.setString(74, (String)parms[74], 3);
               stmt.setString(75, (String)parms[75], 20);
               stmt.setString(76, (String)parms[76], 3);
               stmt.setString(77, (String)parms[77], 3);
               stmt.setString(78, (String)parms[78], 40);
               stmt.setString(79, (String)parms[79], 1);
               stmt.setString(80, (String)parms[80], 1);
               stmt.setShort(81, ((Number) parms[81]).shortValue());
               stmt.setString(82, (String)parms[82], 40);
               stmt.setString(83, (String)parms[83], 50);
               stmt.setVarchar(84, (String)parms[84], 200, false);
               stmt.setString(85, (String)parms[85], 1);
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 86 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(86, ((Number) parms[87]).byteValue());
               }
               stmt.setInt(87, ((Number) parms[88]).intValue());
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 88 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(88, ((Number) parms[90]).byteValue());
               }
               stmt.setByte(89, ((Number) parms[91]).byteValue());
               stmt.setByte(90, ((Number) parms[92]).byteValue());
               stmt.setByte(91, ((Number) parms[93]).byteValue());
               if ( ((Boolean) parms[94]).booleanValue() )
               {
                  stmt.setNull( 92 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(92, ((Number) parms[95]).shortValue());
               }
               if ( ((Boolean) parms[96]).booleanValue() )
               {
                  stmt.setNull( 93 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(93, ((Number) parms[97]).byteValue());
               }
               stmt.setString(94, (String)parms[98], 3);
               if ( ((Boolean) parms[99]).booleanValue() )
               {
                  stmt.setNull( 95 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(95, (String)parms[100], 6);
               }
               return;
            case 27 :
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
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 35 :
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
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               return;
            case 37 :
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
            case 38 :
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
            case 39 :
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 42 :
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
            case 43 :
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
            case 44 :
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
            case 45 :
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
            case 46 :
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
            case 47 :
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
            case 48 :
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
            case 49 :
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
            case 50 :
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
            case 51 :
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
            case 52 :
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
            case 53 :
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
            case 54 :
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
            case 55 :
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
            case 56 :
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
            case 57 :
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
            case 58 :
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
            case 59 :
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
      }
      setparameters60( cursor, stmt, parms) ;
   }

   public void setparameters60( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 60 :
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
            case 61 :
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
            case 62 :
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
            case 63 :
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
            case 64 :
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
            case 65 :
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
            case 66 :
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
            case 67 :
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
            case 68 :
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
            case 69 :
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
            case 70 :
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
            case 71 :
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
            case 72 :
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
            case 73 :
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
            case 74 :
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
            case 75 :
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
            case 76 :
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
            case 77 :
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
            case 78 :
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
            case 79 :
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
            case 80 :
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
            case 81 :
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
            case 82 :
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
            case 83 :
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
            case 84 :
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
            case 85 :
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
            case 86 :
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
            case 87 :
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
            case 88 :
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
            case 89 :
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
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
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
            case 91 :
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
            case 92 :
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
            case 93 :
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
            case 94 :
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
            case 95 :
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
            case 96 :
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
            case 97 :
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
            case 98 :
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
            case 99 :
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
            case 100 :
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
            case 101 :
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
            case 102 :
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
            case 103 :
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
            case 104 :
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
            case 105 :
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
            case 106 :
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
            case 107 :
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
            case 108 :
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
            case 109 :
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
      }
   }

}

