package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lrecet_impl extends GXDataArea
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
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_6( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_7") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_7( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_8") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A490ForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "ForPrdUMe"))) ;
         n490ForPrdUMe = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_8( A396EmprCod, A490ForPrdUMe) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A872RecPrdNum) ;
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
         A2804RecLinMaq = (short)(GXutil.lval( httpContext.GetPar( "RecLinMaq"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_5") == 0 )
      {
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
         A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A811RecLin = (short)(GXutil.lval( httpContext.GetPar( "RecLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
         A874RecPrdFind = httpContext.GetPar( "RecPrdFind") ;
         n874RecPrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A795PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
         n795PrvNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
         A704PrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiAlm"), ".") ;
         n704PrdExiAlm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A856ValCod = (byte)(GXutil.lval( httpContext.GetPar( "ValCod"))) ;
         n856ValCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
         A705PrdExiCC = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiCC"), ".") ;
         n705PrdExiCC = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
         A706PrdExiCCP = CommonUtil.decimalVal( httpContext.GetPar( "PrdExiCCP"), ".") ;
         n706PrdExiCCP = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
         A707PrdFacCon = CommonUtil.decimalVal( httpContext.GetPar( "PrdFacCon"), ".") ;
         n707PrdFacCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A685PrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "PrdCanRes"), ".") ;
         n685PrdCanRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A5418PrdSalM = httpContext.GetPar( "PrdSalM") ;
         n5418PrdSalM = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
         A10881PrdLote = httpContext.GetPar( "PrdLote") ;
         n10881PrdLote = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
         A13232PrdRGB = GXutil.lval( httpContext.GetPar( "PrdRGB")) ;
         n13232PrdRGB = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
         A872RecPrdNum = httpContext.GetPar( "RecPrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_5( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A2804RecLinMaq, A1273RecLinPro, A811RecLin, A874RecPrdFind, A719PrdNum, A795PrvNum, A704PrdExiAlm, A856ValCod, A705PrdExiCC, A706PrdExiCCP, A707PrdFacCon, A685PrdCanRes, A5418PrdSalM, A10881PrdLote, A13232PrdRGB, A872RecPrdNum) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tabla LRECET", ""), (short)(0)) ;
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

   public lrecet_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lrecet_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lrecet_impl.class ));
   }

   public lrecet_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Tabla LRECET", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_LRECET.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_LRECET.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LRECET.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LRECET.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecLinMaq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2804RecLinMaq), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinMaq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecLinMaq_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecLinPro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecLinPro_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLinPro_Internalname, GXutil.ltrim( localUtil.ntoc( A1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecLinPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A1273RecLinPro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLinPro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecLinPro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecLin_Internalname, httpContext.getMessage( "Linea Receta", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLin_Internalname, GXutil.ltrim( localUtil.ntoc( A811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A811RecLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrdNum_Internalname, httpContext.getMessage( "Codigo Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrdNum_Internalname, GXutil.rtrim( A872RecPrdNum), GXutil.rtrim( localUtil.format( A872RecPrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrdNum_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrdDsc_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrdDsc_Internalname, GXutil.rtrim( A875RecPrdDsc), GXutil.rtrim( localUtil.format( A875RecPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrdDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecPrdDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LRECET.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdFacCon_Enabled!=0) ? localUtil.format( A707PrdFacCon, "Z9.9999") : localUtil.format( A707PrdFacCon, "Z9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdFacCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdFacCon_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCant_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCant_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCant_Internalname, GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCant_Enabled!=0) ? localUtil.format( A686PrdCant, "ZZZZZZ9.999") : localUtil.format( A686PrdCant, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCant_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCant_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanAny_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanAny_Internalname, httpContext.getMessage( "Añadidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanAny_Internalname, GXutil.ltrim( localUtil.ntoc( A1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanAny_Enabled!=0) ? localUtil.format( A1797PrdCanAny, "ZZZZZZ9.999") : localUtil.format( A1797PrdCanAny, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanAny_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCanAny_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdCanFin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdCanFin_Internalname, httpContext.getMessage( "Cantidad Final", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanFin_Internalname, GXutil.ltrim( localUtil.ntoc( A683PrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanFin_Enabled!=0) ? localUtil.format( A683PrdCanFin, "ZZZZZZ9.999") : localUtil.format( A683PrdCanFin, "ZZZZZZ9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanFin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCanFin_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdUMe_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdUMe_Internalname, httpContext.getMessage( "Unidad Medida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdUMe_Internalname, GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtForPrdUMe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9") : localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdUMe_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForPrdUMe_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtForPrdDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtForPrdDsc_Internalname, httpContext.getMessage( "Descripcion Unidades Medida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtForPrdDsc_Internalname, GXutil.rtrim( A488ForPrdDsc), GXutil.rtrim( localUtil.format( A488ForPrdDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForPrdDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtForPrdDsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecForNro_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecForNro_Internalname, httpContext.getMessage( "Nº Llamada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecForNro_Internalname, GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecForNro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A2394RecForNro), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecForNro_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecForNro_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecPrdTnq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecPrdTnq_Internalname, httpContext.getMessage( "Tq", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecPrdTnq_Internalname, GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecPrdTnq_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3274RecPrdTnq), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecPrdTnq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecPrdTnq_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecMar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecMar_Internalname, httpContext.getMessage( "M", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecMar_Internalname, GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecMar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9") : localUtil.format( DecimalUtil.doubleToDec(A4024RecMar), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecMar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecMar_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRecLote_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRecLote_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRecLote_Internalname, GXutil.rtrim( A5725RecLote), GXutil.rtrim( localUtil.format( A5725RecLote, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecLote_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtRecLote_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LRECET.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdExiAlm_Internalname, GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdExiAlm_Enabled!=0) ? localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999") : localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdExiAlm_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdExiAlm_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdCanRes_Internalname, GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtPrdCanRes_Enabled!=0) ? localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999") : localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdCanRes_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtPrdCanRes_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacCon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacCon_Internalname, httpContext.getMessage( "Factor", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacCon_Internalname, GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFacCon_Enabled!=0) ? localUtil.format( A431FacCon, "ZZZZ9.99999") : localUtil.format( A431FacCon, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacCon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFacCon_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LRECET.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LRECET.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LRECET.htm");
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
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z2804RecLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( "Z2804RecLinMaq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1273RecLinPro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z811RecLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z872RecPrdNum = httpContext.cgiGet( "Z872RecPrdNum") ;
         Z875RecPrdDsc = httpContext.cgiGet( "Z875RecPrdDsc") ;
         Z686PrdCant = localUtil.ctond( httpContext.cgiGet( "Z686PrdCant")) ;
         Z1797PrdCanAny = localUtil.ctond( httpContext.cgiGet( "Z1797PrdCanAny")) ;
         Z683PrdCanFin = localUtil.ctond( httpContext.cgiGet( "Z683PrdCanFin")) ;
         Z2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2394RecForNro"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3274RecPrdTnq"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( "Z4024RecMar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5725RecLote = httpContext.cgiGet( "Z5725RecLote") ;
         Z431FacCon = localUtil.ctond( httpContext.cgiGet( "Z431FacCon")) ;
         Z3938RecCanEns = localUtil.ctond( httpContext.cgiGet( "Z3938RecCanEns")) ;
         Z5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( "Z5422RecSalMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( "Z5467RecSalVol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5527RecLinRea = httpContext.cgiGet( "Z5527RecLinRea") ;
         Z8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8934RecPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z8937RecAcc = httpContext.cgiGet( "Z8937RecAcc") ;
         Z9813FacCon1 = localUtil.ctond( httpContext.cgiGet( "Z9813FacCon1")) ;
         Z3804RecFecMov = localUtil.ctod( httpContext.cgiGet( "Z3804RecFecMov"), 0) ;
         Z3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( "Z3805RecAnyTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3806RecUltAny = localUtil.ctond( httpContext.cgiGet( "Z3806RecUltAny")) ;
         Z3807RecPorAny = localUtil.ctond( httpContext.cgiGet( "Z3807RecPorAny")) ;
         Z4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( "Z4900PrdCanMac")) ;
         Z11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( "Z11708RecProv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4576RecLinUsr = httpContext.cgiGet( "Z4576RecLinUsr") ;
         Z4577RecPesFec = localUtil.ctot( httpContext.cgiGet( "Z4577RecPesFec"), 0) ;
         Z12641RecPrdDc2 = httpContext.cgiGet( "Z12641RecPrdDc2") ;
         Z12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( "Z12710PrdCantOrg")) ;
         Z12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12717RecFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( "Z13938RecLoteFch"), 0) ;
         Z13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "Z13937RecLotAlm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14055RecManAut = httpContext.cgiGet( "Z14055RecManAut") ;
         Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         Z490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( "Z490ForPrdUMe"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3938RecCanEns = localUtil.ctond( httpContext.cgiGet( "Z3938RecCanEns")) ;
         A5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( "Z5422RecSalMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( "Z5467RecSalVol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5527RecLinRea = httpContext.cgiGet( "Z5527RecLinRea") ;
         A8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8934RecPes"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A8937RecAcc = httpContext.cgiGet( "Z8937RecAcc") ;
         A9813FacCon1 = localUtil.ctond( httpContext.cgiGet( "Z9813FacCon1")) ;
         A3804RecFecMov = localUtil.ctod( httpContext.cgiGet( "Z3804RecFecMov"), 0) ;
         A3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( "Z3805RecAnyTie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3806RecUltAny = localUtil.ctond( httpContext.cgiGet( "Z3806RecUltAny")) ;
         A3807RecPorAny = localUtil.ctond( httpContext.cgiGet( "Z3807RecPorAny")) ;
         A4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( "Z4900PrdCanMac")) ;
         A11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( "Z11708RecProv"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4576RecLinUsr = httpContext.cgiGet( "Z4576RecLinUsr") ;
         A4577RecPesFec = localUtil.ctot( httpContext.cgiGet( "Z4577RecPesFec"), 0) ;
         A12641RecPrdDc2 = httpContext.cgiGet( "Z12641RecPrdDc2") ;
         A12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( "Z12710PrdCantOrg")) ;
         A12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( "Z12717RecFabId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( "Z13938RecLoteFch"), 0) ;
         A13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "Z13937RecLotAlm"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14055RecManAut = httpContext.cgiGet( "Z14055RecManAut") ;
         A719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
         n719PrdNum = false ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A13832CantProduc = localUtil.ctond( httpContext.cgiGet( "CANTPRODUC")) ;
         A238CanRes = localUtil.ctond( httpContext.cgiGet( "CANRES")) ;
         A3938RecCanEns = localUtil.ctond( httpContext.cgiGet( "RECCANENS")) ;
         A5422RecSalMP = (short)(localUtil.ctol( httpContext.cgiGet( "RECSALMP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5467RecSalVol = (int)(localUtil.ctol( httpContext.cgiGet( "RECSALVOL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5527RecLinRea = httpContext.cgiGet( "RECLINREA") ;
         A8934RecPes = (byte)(localUtil.ctol( httpContext.cgiGet( "RECPES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A8937RecAcc = httpContext.cgiGet( "RECACC") ;
         A9813FacCon1 = localUtil.ctond( httpContext.cgiGet( "FACCON1")) ;
         A3804RecFecMov = localUtil.ctod( httpContext.cgiGet( "RECFECMOV"), 0) ;
         A3805RecAnyTie = (short)(localUtil.ctol( httpContext.cgiGet( "RECANYTIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3806RecUltAny = localUtil.ctond( httpContext.cgiGet( "RECULTANY")) ;
         A3807RecPorAny = localUtil.ctond( httpContext.cgiGet( "RECPORANY")) ;
         A4900PrdCanMac = localUtil.ctond( httpContext.cgiGet( "PRDCANMAC")) ;
         A11708RecProv = (int)(localUtil.ctol( httpContext.cgiGet( "RECPROV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4576RecLinUsr = httpContext.cgiGet( "RECLINUSR") ;
         A4577RecPesFec = localUtil.ctot( httpContext.cgiGet( "RECPESFEC"), 0) ;
         A12641RecPrdDc2 = httpContext.cgiGet( "RECPRDDC2") ;
         A12710PrdCantOrg = localUtil.ctond( httpContext.cgiGet( "PRDCANTORG")) ;
         A12717RecFabId = (int)(localUtil.ctol( httpContext.cgiGet( "RECFABID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13938RecLoteFch = localUtil.ctod( httpContext.cgiGet( "RECLOTEFCH"), 0) ;
         A13937RecLotAlm = (short)(localUtil.ctol( httpContext.cgiGet( "RECLOTALM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14055RecManAut = httpContext.cgiGet( "RECMANAUT") ;
         A719PrdNum = httpContext.cgiGet( "PRDNUM") ;
         A874RecPrdFind = httpContext.cgiGet( "RECPRDFIND") ;
         A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( "PRVNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A705PrdExiCC = localUtil.ctond( httpContext.cgiGet( "PRDEXICC")) ;
         A706PrdExiCCP = localUtil.ctond( httpContext.cgiGet( "PRDEXICCP")) ;
         A5418PrdSalM = httpContext.cgiGet( "PRDSALM") ;
         A10881PrdLote = httpContext.cgiGet( "PRDLOTE") ;
         A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( "PRDRGB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A873RecPrdNom = httpContext.cgiGet( "RECPRDNOM") ;
         n873RecPrdNom = false ;
         A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
         n407EmprNom = false ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLINPRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecLinPro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1273RecLinPro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         }
         else
         {
            A1273RecLinPro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecLinPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A811RecLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
         }
         else
         {
            A811RecLin = (short)(localUtil.ctol( httpContext.cgiGet( edtRecLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
         }
         A872RecPrdNum = httpContext.cgiGet( edtRecPrdNum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A875RecPrdDsc = httpContext.cgiGet( edtRecPrdDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
         A707PrdFacCon = localUtil.ctond( httpContext.cgiGet( edtPrdFacCon_Internalname)) ;
         n707PrdFacCon = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdCant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A686PrdCant = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         }
         else
         {
            A686PrdCant = localUtil.ctond( httpContext.cgiGet( edtPrdCant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdCanAny_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanAny_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANANY");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdCanAny_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1797PrdCanAny = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1797PrdCanAny", GXutil.ltrimstr( A1797PrdCanAny, 11, 3));
         }
         else
         {
            A1797PrdCanAny = localUtil.ctond( httpContext.cgiGet( edtPrdCanAny_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1797PrdCanAny", GXutil.ltrimstr( A1797PrdCanAny, 11, 3));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdCanFin_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdCanFin_Internalname)), DecimalUtil.stringToDec("9999999.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PRDCANFIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtPrdCanFin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A683PrdCanFin = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A683PrdCanFin", GXutil.ltrimstr( A683PrdCanFin, 11, 3));
         }
         else
         {
            A683PrdCanFin = localUtil.ctond( httpContext.cgiGet( edtPrdCanFin_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A683PrdCanFin", GXutil.ltrimstr( A683PrdCanFin, 11, 3));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtForPrdUMe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A490ForPrdUMe = (byte)(0) ;
            n490ForPrdUMe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
         else
         {
            A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n490ForPrdUMe = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         }
         A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
         n488ForPrdDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECFORNRO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecForNro_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2394RecForNro = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
         }
         else
         {
            A2394RecForNro = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecForNro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECPRDTNQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecPrdTnq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3274RecPrdTnq = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
         }
         else
         {
            A3274RecPrdTnq = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecPrdTnq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RECMAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtRecMar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4024RecMar = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
         }
         else
         {
            A4024RecMar = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
         }
         A5725RecLote = httpContext.cgiGet( edtRecLote_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         n704PrdExiAlm = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
         n685PrdCanRes = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACCON");
            AnyError = (short)(1) ;
            GX_FocusControl = edtFacCon_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A431FacCon = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         }
         else
         {
            A431FacCon = localUtil.ctond( httpContext.cgiGet( edtFacCon_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"LRECET");
         forbiddenHiddens.add("RecCanEns", localUtil.format( A3938RecCanEns, "ZZZ9.99999"));
         forbiddenHiddens.add("RecSalMP", localUtil.format( DecimalUtil.doubleToDec(A5422RecSalMP), "ZZ9"));
         forbiddenHiddens.add("RecSalVol", localUtil.format( DecimalUtil.doubleToDec(A5467RecSalVol), "ZZZZ9"));
         forbiddenHiddens.add("RecLinRea", GXutil.rtrim( localUtil.format( A5527RecLinRea, "")));
         forbiddenHiddens.add("RecPes", localUtil.format( DecimalUtil.doubleToDec(A8934RecPes), "9"));
         forbiddenHiddens.add("RecAcc", GXutil.rtrim( localUtil.format( A8937RecAcc, "")));
         forbiddenHiddens.add("FacCon1", localUtil.format( A9813FacCon1, "ZZZZ9.99999"));
         forbiddenHiddens.add("RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
         forbiddenHiddens.add("RecAnyTie", localUtil.format( DecimalUtil.doubleToDec(A3805RecAnyTie), "ZZZ9"));
         forbiddenHiddens.add("RecUltAny", localUtil.format( A3806RecUltAny, "ZZZZZZ9.999"));
         forbiddenHiddens.add("RecPorAny", localUtil.format( A3807RecPorAny, "ZZ9.99"));
         forbiddenHiddens.add("PrdCanMac", localUtil.format( A4900PrdCanMac, "ZZZZZZ9.999"));
         forbiddenHiddens.add("RecProv", localUtil.format( DecimalUtil.doubleToDec(A11708RecProv), "ZZZZZ9"));
         forbiddenHiddens.add("RecLinUsr", GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!")));
         forbiddenHiddens.add("RecPesFec", localUtil.format( A4577RecPesFec, "99/99/99 99:99"));
         forbiddenHiddens.add("RecPrdDc2", GXutil.rtrim( localUtil.format( A12641RecPrdDc2, "")));
         forbiddenHiddens.add("PrdCantOrg", localUtil.format( A12710PrdCantOrg, "ZZZZZZ9.999"));
         forbiddenHiddens.add("RecFabId", localUtil.format( DecimalUtil.doubleToDec(A12717RecFabId), "ZZZZZ9"));
         forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
         forbiddenHiddens.add("RecLoteFch", localUtil.format(A13938RecLoteFch, "99/99/99"));
         forbiddenHiddens.add("RecLotAlm", localUtil.format( DecimalUtil.doubleToDec(A13937RecLotAlm), "ZZZ9"));
         forbiddenHiddens.add("RecManAut", GXutil.rtrim( localUtil.format( A14055RecManAut, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) || ( A811RecLin != Z811RecLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("lrecet:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            AnyError = (short)(1) ;
            return  ;
         }
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
            A1273RecLinPro = (byte)(GXutil.lval( httpContext.GetPar( "RecLinPro"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            A811RecLin = (short)(GXutil.lval( httpContext.GetPar( "RecLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
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
            initAll1QE410( ) ;
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
      disableAttributes1QE410( ) ;
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

   public void resetCaption1QE0( )
   {
   }

   public void zm1QE410( int GX_JID )
   {
      if ( ( GX_JID == 4 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z872RecPrdNum = T01QE3_A872RecPrdNum[0] ;
            Z875RecPrdDsc = T01QE3_A875RecPrdDsc[0] ;
            Z686PrdCant = T01QE3_A686PrdCant[0] ;
            Z1797PrdCanAny = T01QE3_A1797PrdCanAny[0] ;
            Z683PrdCanFin = T01QE3_A683PrdCanFin[0] ;
            Z2394RecForNro = T01QE3_A2394RecForNro[0] ;
            Z3274RecPrdTnq = T01QE3_A3274RecPrdTnq[0] ;
            Z4024RecMar = T01QE3_A4024RecMar[0] ;
            Z5725RecLote = T01QE3_A5725RecLote[0] ;
            Z431FacCon = T01QE3_A431FacCon[0] ;
            Z3938RecCanEns = T01QE3_A3938RecCanEns[0] ;
            Z5422RecSalMP = T01QE3_A5422RecSalMP[0] ;
            Z5467RecSalVol = T01QE3_A5467RecSalVol[0] ;
            Z5527RecLinRea = T01QE3_A5527RecLinRea[0] ;
            Z8934RecPes = T01QE3_A8934RecPes[0] ;
            Z8937RecAcc = T01QE3_A8937RecAcc[0] ;
            Z9813FacCon1 = T01QE3_A9813FacCon1[0] ;
            Z3804RecFecMov = T01QE3_A3804RecFecMov[0] ;
            Z3805RecAnyTie = T01QE3_A3805RecAnyTie[0] ;
            Z3806RecUltAny = T01QE3_A3806RecUltAny[0] ;
            Z3807RecPorAny = T01QE3_A3807RecPorAny[0] ;
            Z4900PrdCanMac = T01QE3_A4900PrdCanMac[0] ;
            Z11708RecProv = T01QE3_A11708RecProv[0] ;
            Z4576RecLinUsr = T01QE3_A4576RecLinUsr[0] ;
            Z4577RecPesFec = T01QE3_A4577RecPesFec[0] ;
            Z12641RecPrdDc2 = T01QE3_A12641RecPrdDc2[0] ;
            Z12710PrdCantOrg = T01QE3_A12710PrdCantOrg[0] ;
            Z12717RecFabId = T01QE3_A12717RecFabId[0] ;
            Z13938RecLoteFch = T01QE3_A13938RecLoteFch[0] ;
            Z13937RecLotAlm = T01QE3_A13937RecLotAlm[0] ;
            Z14055RecManAut = T01QE3_A14055RecManAut[0] ;
            Z719PrdNum = T01QE3_A719PrdNum[0] ;
            Z490ForPrdUMe = T01QE3_A490ForPrdUMe[0] ;
         }
         else
         {
            Z872RecPrdNum = A872RecPrdNum ;
            Z875RecPrdDsc = A875RecPrdDsc ;
            Z686PrdCant = A686PrdCant ;
            Z1797PrdCanAny = A1797PrdCanAny ;
            Z683PrdCanFin = A683PrdCanFin ;
            Z2394RecForNro = A2394RecForNro ;
            Z3274RecPrdTnq = A3274RecPrdTnq ;
            Z4024RecMar = A4024RecMar ;
            Z5725RecLote = A5725RecLote ;
            Z431FacCon = A431FacCon ;
            Z3938RecCanEns = A3938RecCanEns ;
            Z5422RecSalMP = A5422RecSalMP ;
            Z5467RecSalVol = A5467RecSalVol ;
            Z5527RecLinRea = A5527RecLinRea ;
            Z8934RecPes = A8934RecPes ;
            Z8937RecAcc = A8937RecAcc ;
            Z9813FacCon1 = A9813FacCon1 ;
            Z3804RecFecMov = A3804RecFecMov ;
            Z3805RecAnyTie = A3805RecAnyTie ;
            Z3806RecUltAny = A3806RecUltAny ;
            Z3807RecPorAny = A3807RecPorAny ;
            Z4900PrdCanMac = A4900PrdCanMac ;
            Z11708RecProv = A11708RecProv ;
            Z4576RecLinUsr = A4576RecLinUsr ;
            Z4577RecPesFec = A4577RecPesFec ;
            Z12641RecPrdDc2 = A12641RecPrdDc2 ;
            Z12710PrdCantOrg = A12710PrdCantOrg ;
            Z12717RecFabId = A12717RecFabId ;
            Z13938RecLoteFch = A13938RecLoteFch ;
            Z13937RecLotAlm = A13937RecLotAlm ;
            Z14055RecManAut = A14055RecManAut ;
            Z719PrdNum = A719PrdNum ;
            Z490ForPrdUMe = A490ForPrdUMe ;
         }
      }
      if ( GX_JID == -4 )
      {
         Z811RecLin = A811RecLin ;
         Z872RecPrdNum = A872RecPrdNum ;
         Z875RecPrdDsc = A875RecPrdDsc ;
         Z686PrdCant = A686PrdCant ;
         Z1797PrdCanAny = A1797PrdCanAny ;
         Z683PrdCanFin = A683PrdCanFin ;
         Z2394RecForNro = A2394RecForNro ;
         Z3274RecPrdTnq = A3274RecPrdTnq ;
         Z4024RecMar = A4024RecMar ;
         Z5725RecLote = A5725RecLote ;
         Z431FacCon = A431FacCon ;
         Z3938RecCanEns = A3938RecCanEns ;
         Z5422RecSalMP = A5422RecSalMP ;
         Z5467RecSalVol = A5467RecSalVol ;
         Z5527RecLinRea = A5527RecLinRea ;
         Z8934RecPes = A8934RecPes ;
         Z8937RecAcc = A8937RecAcc ;
         Z9813FacCon1 = A9813FacCon1 ;
         Z3804RecFecMov = A3804RecFecMov ;
         Z3805RecAnyTie = A3805RecAnyTie ;
         Z3806RecUltAny = A3806RecUltAny ;
         Z3807RecPorAny = A3807RecPorAny ;
         Z4900PrdCanMac = A4900PrdCanMac ;
         Z11708RecProv = A11708RecProv ;
         Z4576RecLinUsr = A4576RecLinUsr ;
         Z4577RecPesFec = A4577RecPesFec ;
         Z12641RecPrdDc2 = A12641RecPrdDc2 ;
         Z12710PrdCantOrg = A12710PrdCantOrg ;
         Z12717RecFabId = A12717RecFabId ;
         Z13938RecLoteFch = A13938RecLoteFch ;
         Z13937RecLotAlm = A13937RecLotAlm ;
         Z14055RecManAut = A14055RecManAut ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z490ForPrdUMe = A490ForPrdUMe ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         Z407EmprNom = A407EmprNom ;
         Z707PrdFacCon = A707PrdFacCon ;
         Z704PrdExiAlm = A704PrdExiAlm ;
         Z685PrdCanRes = A685PrdCanRes ;
         Z705PrdExiCC = A705PrdExiCC ;
         Z706PrdExiCCP = A706PrdExiCCP ;
         Z5418PrdSalM = A5418PrdSalM ;
         Z10881PrdLote = A10881PrdLote ;
         Z13232PrdRGB = A13232PrdRGB ;
         Z795PrvNum = A795PrvNum ;
         Z856ValCod = A856ValCod ;
         Z874RecPrdFind = A874RecPrdFind ;
         Z488ForPrdDsc = A488ForPrdDsc ;
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

   public void load1QE410( )
   {
      /* Using cursor T01QE12 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A872RecPrdNum = T01QE12_A872RecPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A875RecPrdDsc = T01QE12_A875RecPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
         A707PrdFacCon = T01QE12_A707PrdFacCon[0] ;
         n707PrdFacCon = T01QE12_n707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A686PrdCant = T01QE12_A686PrdCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         A1797PrdCanAny = T01QE12_A1797PrdCanAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1797PrdCanAny", GXutil.ltrimstr( A1797PrdCanAny, 11, 3));
         A683PrdCanFin = T01QE12_A683PrdCanFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A683PrdCanFin", GXutil.ltrimstr( A683PrdCanFin, 11, 3));
         A488ForPrdDsc = T01QE12_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01QE12_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         A2394RecForNro = T01QE12_A2394RecForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
         A3274RecPrdTnq = T01QE12_A3274RecPrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
         A4024RecMar = T01QE12_A4024RecMar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
         A5725RecLote = T01QE12_A5725RecLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
         A704PrdExiAlm = T01QE12_A704PrdExiAlm[0] ;
         n704PrdExiAlm = T01QE12_n704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A685PrdCanRes = T01QE12_A685PrdCanRes[0] ;
         n685PrdCanRes = T01QE12_n685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A431FacCon = T01QE12_A431FacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         A705PrdExiCC = T01QE12_A705PrdExiCC[0] ;
         n705PrdExiCC = T01QE12_n705PrdExiCC[0] ;
         A706PrdExiCCP = T01QE12_A706PrdExiCCP[0] ;
         n706PrdExiCCP = T01QE12_n706PrdExiCCP[0] ;
         A407EmprNom = T01QE12_A407EmprNom[0] ;
         n407EmprNom = T01QE12_n407EmprNom[0] ;
         A3938RecCanEns = T01QE12_A3938RecCanEns[0] ;
         A5422RecSalMP = T01QE12_A5422RecSalMP[0] ;
         A5418PrdSalM = T01QE12_A5418PrdSalM[0] ;
         n5418PrdSalM = T01QE12_n5418PrdSalM[0] ;
         A5467RecSalVol = T01QE12_A5467RecSalVol[0] ;
         A5527RecLinRea = T01QE12_A5527RecLinRea[0] ;
         A8934RecPes = T01QE12_A8934RecPes[0] ;
         A8937RecAcc = T01QE12_A8937RecAcc[0] ;
         A9813FacCon1 = T01QE12_A9813FacCon1[0] ;
         A3804RecFecMov = T01QE12_A3804RecFecMov[0] ;
         A3805RecAnyTie = T01QE12_A3805RecAnyTie[0] ;
         A3806RecUltAny = T01QE12_A3806RecUltAny[0] ;
         A3807RecPorAny = T01QE12_A3807RecPorAny[0] ;
         A4900PrdCanMac = T01QE12_A4900PrdCanMac[0] ;
         A11708RecProv = T01QE12_A11708RecProv[0] ;
         A10881PrdLote = T01QE12_A10881PrdLote[0] ;
         n10881PrdLote = T01QE12_n10881PrdLote[0] ;
         A4576RecLinUsr = T01QE12_A4576RecLinUsr[0] ;
         A4577RecPesFec = T01QE12_A4577RecPesFec[0] ;
         A12641RecPrdDc2 = T01QE12_A12641RecPrdDc2[0] ;
         A12710PrdCantOrg = T01QE12_A12710PrdCantOrg[0] ;
         A12717RecFabId = T01QE12_A12717RecFabId[0] ;
         A13232PrdRGB = T01QE12_A13232PrdRGB[0] ;
         n13232PrdRGB = T01QE12_n13232PrdRGB[0] ;
         A13938RecLoteFch = T01QE12_A13938RecLoteFch[0] ;
         A13937RecLotAlm = T01QE12_A13937RecLotAlm[0] ;
         A14055RecManAut = T01QE12_A14055RecManAut[0] ;
         A719PrdNum = T01QE12_A719PrdNum[0] ;
         n719PrdNum = T01QE12_n719PrdNum[0] ;
         A490ForPrdUMe = T01QE12_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01QE12_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A795PrvNum = T01QE12_A795PrvNum[0] ;
         n795PrvNum = T01QE12_n795PrvNum[0] ;
         A856ValCod = T01QE12_A856ValCod[0] ;
         n856ValCod = T01QE12_n856ValCod[0] ;
         A874RecPrdFind = T01QE12_A874RecPrdFind[0] ;
         n874RecPrdFind = T01QE12_n874RecPrdFind[0] ;
         zm1QE410( -4) ;
      }
      pr_default.close(8);
      onLoadActions1QE410( ) ;
   }

   public void onLoadActions1QE410( )
   {
      A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
      /* Using cursor T01QE6 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n874RecPrdFind), A874RecPrdFind, A872RecPrdNum, A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A873RecPrdNom = T01QE6_A873RecPrdNom[0] ;
         n873RecPrdNom = T01QE6_n873RecPrdNom[0] ;
      }
      else
      {
         A873RecPrdNom = "" ;
         n873RecPrdNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", A873RecPrdNom);
      }
      pr_default.close(2);
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
   }

   public void checkExtendedTable1QE410( )
   {
      nIsDirty_410 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QE7 */
      pr_default.execute(3, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QE7_A407EmprNom[0] ;
      n407EmprNom = T01QE7_n407EmprNom[0] ;
      pr_default.close(3);
      /* Using cursor T01QE8 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A707PrdFacCon = T01QE8_A707PrdFacCon[0] ;
      n707PrdFacCon = T01QE8_n707PrdFacCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A704PrdExiAlm = T01QE8_A704PrdExiAlm[0] ;
      n704PrdExiAlm = T01QE8_n704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A685PrdCanRes = T01QE8_A685PrdCanRes[0] ;
      n685PrdCanRes = T01QE8_n685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A705PrdExiCC = T01QE8_A705PrdExiCC[0] ;
      n705PrdExiCC = T01QE8_n705PrdExiCC[0] ;
      A706PrdExiCCP = T01QE8_A706PrdExiCCP[0] ;
      n706PrdExiCCP = T01QE8_n706PrdExiCCP[0] ;
      A5418PrdSalM = T01QE8_A5418PrdSalM[0] ;
      n5418PrdSalM = T01QE8_n5418PrdSalM[0] ;
      A10881PrdLote = T01QE8_A10881PrdLote[0] ;
      n10881PrdLote = T01QE8_n10881PrdLote[0] ;
      A13232PrdRGB = T01QE8_A13232PrdRGB[0] ;
      n13232PrdRGB = T01QE8_n13232PrdRGB[0] ;
      A795PrvNum = T01QE8_A795PrvNum[0] ;
      n795PrvNum = T01QE8_n795PrvNum[0] ;
      A856ValCod = T01QE8_A856ValCod[0] ;
      n856ValCod = T01QE8_n856ValCod[0] ;
      pr_default.close(4);
      nIsDirty_410 = (short)(1) ;
      A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
      /* Using cursor T01QE9 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A490ForPrdUMe) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A488ForPrdDsc = T01QE9_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01QE9_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      pr_default.close(5);
      /* Using cursor T01QE11 */
      pr_default.execute(7, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A874RecPrdFind = T01QE11_A874RecPrdFind[0] ;
         n874RecPrdFind = T01QE11_n874RecPrdFind[0] ;
      }
      else
      {
         nIsDirty_410 = (short)(1) ;
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
      }
      pr_default.close(7);
      /* Using cursor T01QE10 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRECET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(6);
      /* Using cursor T01QE6 */
      pr_default.execute(2, new Object[] {Boolean.valueOf(n874RecPrdFind), A874RecPrdFind, A872RecPrdNum, A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A873RecPrdNom = T01QE6_A873RecPrdNom[0] ;
         n873RecPrdNom = T01QE6_n873RecPrdNom[0] ;
      }
      else
      {
         nIsDirty_410 = (short)(1) ;
         A873RecPrdNom = "" ;
         n873RecPrdNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", A873RecPrdNom);
      }
      pr_default.close(2);
      nIsDirty_410 = (short)(1) ;
      A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) || (0==A490ForPrdUMe) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1QE410( )
   {
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(6);
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_6( String A396EmprCod )
   {
      /* Using cursor T01QE13 */
      pr_default.execute(9, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QE13_A407EmprNom[0] ;
      n407EmprNom = T01QE13_n407EmprNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
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
                         String A719PrdNum )
   {
      /* Using cursor T01QE14 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(10) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A707PrdFacCon = T01QE14_A707PrdFacCon[0] ;
      n707PrdFacCon = T01QE14_n707PrdFacCon[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A704PrdExiAlm = T01QE14_A704PrdExiAlm[0] ;
      n704PrdExiAlm = T01QE14_n704PrdExiAlm[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A685PrdCanRes = T01QE14_A685PrdCanRes[0] ;
      n685PrdCanRes = T01QE14_n685PrdCanRes[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A705PrdExiCC = T01QE14_A705PrdExiCC[0] ;
      n705PrdExiCC = T01QE14_n705PrdExiCC[0] ;
      A706PrdExiCCP = T01QE14_A706PrdExiCCP[0] ;
      n706PrdExiCCP = T01QE14_n706PrdExiCCP[0] ;
      A5418PrdSalM = T01QE14_A5418PrdSalM[0] ;
      n5418PrdSalM = T01QE14_n5418PrdSalM[0] ;
      A10881PrdLote = T01QE14_A10881PrdLote[0] ;
      n10881PrdLote = T01QE14_n10881PrdLote[0] ;
      A13232PrdRGB = T01QE14_A13232PrdRGB[0] ;
      n13232PrdRGB = T01QE14_n13232PrdRGB[0] ;
      A795PrvNum = T01QE14_A795PrvNum[0] ;
      n795PrvNum = T01QE14_n795PrvNum[0] ;
      A856ValCod = T01QE14_A856ValCod[0] ;
      n856ValCod = T01QE14_n856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A5418PrdSalM))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A10881PrdLote))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_8( String A396EmprCod ,
                         byte A490ForPrdUMe )
   {
      /* Using cursor T01QE15 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A490ForPrdUMe) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A488ForPrdDsc = T01QE15_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01QE15_n488ForPrdDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A488ForPrdDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void gxload_10( String A396EmprCod ,
                          String A872RecPrdNum )
   {
      /* Using cursor T01QE16 */
      pr_default.execute(12, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A874RecPrdFind = T01QE16_A874RecPrdFind[0] ;
         n874RecPrdFind = T01QE16_n874RecPrdFind[0] ;
      }
      else
      {
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A874RecPrdFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_9( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         short A2804RecLinMaq ,
                         byte A1273RecLinPro )
   {
      /* Using cursor T01QE17 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRECET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(13) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(13);
   }

   public void gxload_5( String A396EmprCod ,
                         int A129BarCod ,
                         byte A132BarCodReo ,
                         String A130BarCodPar ,
                         short A2804RecLinMaq ,
                         byte A1273RecLinPro ,
                         short A811RecLin ,
                         String A874RecPrdFind ,
                         String A719PrdNum ,
                         int A795PrvNum ,
                         java.math.BigDecimal A704PrdExiAlm ,
                         byte A856ValCod ,
                         java.math.BigDecimal A705PrdExiCC ,
                         java.math.BigDecimal A706PrdExiCCP ,
                         java.math.BigDecimal A707PrdFacCon ,
                         java.math.BigDecimal A685PrdCanRes ,
                         String A5418PrdSalM ,
                         String A10881PrdLote ,
                         long A13232PrdRGB ,
                         String A872RecPrdNum )
   {
      /* Using cursor T01QE20 */
      pr_default.execute(14, new Object[] {Boolean.valueOf(n874RecPrdFind), A874RecPrdFind, A872RecPrdNum, A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(14) != 101) )
      {
         A873RecPrdNom = T01QE20_A873RecPrdNom[0] ;
         n873RecPrdNom = T01QE20_n873RecPrdNom[0] ;
      }
      else
      {
         A873RecPrdNom = "" ;
         n873RecPrdNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", A873RecPrdNom);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A873RecPrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKey1QE410( )
   {
      /* Using cursor T01QE21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound410 = (short)(1) ;
      }
      else
      {
         RcdFound410 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QE410( 4) ;
         RcdFound410 = (short)(1) ;
         A811RecLin = T01QE3_A811RecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
         A872RecPrdNum = T01QE3_A872RecPrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
         A875RecPrdDsc = T01QE3_A875RecPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
         A686PrdCant = T01QE3_A686PrdCant[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
         A1797PrdCanAny = T01QE3_A1797PrdCanAny[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1797PrdCanAny", GXutil.ltrimstr( A1797PrdCanAny, 11, 3));
         A683PrdCanFin = T01QE3_A683PrdCanFin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A683PrdCanFin", GXutil.ltrimstr( A683PrdCanFin, 11, 3));
         A2394RecForNro = T01QE3_A2394RecForNro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
         A3274RecPrdTnq = T01QE3_A3274RecPrdTnq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
         A4024RecMar = T01QE3_A4024RecMar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
         A5725RecLote = T01QE3_A5725RecLote[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
         A431FacCon = T01QE3_A431FacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
         A3938RecCanEns = T01QE3_A3938RecCanEns[0] ;
         A5422RecSalMP = T01QE3_A5422RecSalMP[0] ;
         A5467RecSalVol = T01QE3_A5467RecSalVol[0] ;
         A5527RecLinRea = T01QE3_A5527RecLinRea[0] ;
         A8934RecPes = T01QE3_A8934RecPes[0] ;
         A8937RecAcc = T01QE3_A8937RecAcc[0] ;
         A9813FacCon1 = T01QE3_A9813FacCon1[0] ;
         A3804RecFecMov = T01QE3_A3804RecFecMov[0] ;
         A3805RecAnyTie = T01QE3_A3805RecAnyTie[0] ;
         A3806RecUltAny = T01QE3_A3806RecUltAny[0] ;
         A3807RecPorAny = T01QE3_A3807RecPorAny[0] ;
         A4900PrdCanMac = T01QE3_A4900PrdCanMac[0] ;
         A11708RecProv = T01QE3_A11708RecProv[0] ;
         A4576RecLinUsr = T01QE3_A4576RecLinUsr[0] ;
         A4577RecPesFec = T01QE3_A4577RecPesFec[0] ;
         A12641RecPrdDc2 = T01QE3_A12641RecPrdDc2[0] ;
         A12710PrdCantOrg = T01QE3_A12710PrdCantOrg[0] ;
         A12717RecFabId = T01QE3_A12717RecFabId[0] ;
         A13938RecLoteFch = T01QE3_A13938RecLoteFch[0] ;
         A13937RecLotAlm = T01QE3_A13937RecLotAlm[0] ;
         A14055RecManAut = T01QE3_A14055RecManAut[0] ;
         A396EmprCod = T01QE3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = T01QE3_A719PrdNum[0] ;
         n719PrdNum = T01QE3_n719PrdNum[0] ;
         A490ForPrdUMe = T01QE3_A490ForPrdUMe[0] ;
         n490ForPrdUMe = T01QE3_n490ForPrdUMe[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
         A129BarCod = T01QE3_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QE3_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QE3_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01QE3_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01QE3_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z2804RecLinMaq = A2804RecLinMaq ;
         Z1273RecLinPro = A1273RecLinPro ;
         Z811RecLin = A811RecLin ;
         sMode410 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QE410( ) ;
         if ( AnyError == 1 )
         {
            RcdFound410 = (short)(0) ;
            initializeNonKey1QE410( ) ;
         }
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound410 = (short)(0) ;
         initializeNonKey1QE410( ) ;
         sMode410 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode410 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QE410( ) ;
      if ( RcdFound410 == 0 )
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
      RcdFound410 = (short)(0) ;
      /* Using cursor T01QE22 */
      pr_default.execute(16, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1273RecLinPro), Byte.valueOf(A1273RecLinPro), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         while ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A129BarCod[0] < A129BarCod ) || ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A132BarCodReo[0] < A132BarCodReo ) || ( T01QE22_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QE22_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01QE22_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE22_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A2804RecLinMaq[0] < A2804RecLinMaq ) || ( T01QE22_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01QE22_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE22_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A1273RecLinPro[0] < A1273RecLinPro ) || ( T01QE22_A1273RecLinPro[0] == A1273RecLinPro ) && ( T01QE22_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01QE22_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE22_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A811RecLin[0] < A811RecLin ) ) )
         {
            pr_default.readNext(16);
         }
         if ( (pr_default.getStatus(16) != 101) && ( ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A129BarCod[0] > A129BarCod ) || ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A132BarCodReo[0] > A132BarCodReo ) || ( T01QE22_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QE22_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01QE22_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE22_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A2804RecLinMaq[0] > A2804RecLinMaq ) || ( T01QE22_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01QE22_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE22_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A1273RecLinPro[0] > A1273RecLinPro ) || ( T01QE22_A1273RecLinPro[0] == A1273RecLinPro ) && ( T01QE22_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01QE22_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE22_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE22_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE22_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE22_A811RecLin[0] > A811RecLin ) ) )
         {
            A396EmprCod = T01QE22_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01QE22_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01QE22_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01QE22_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01QE22_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A1273RecLinPro = T01QE22_A1273RecLinPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            A811RecLin = T01QE22_A811RecLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
            RcdFound410 = (short)(1) ;
         }
      }
      pr_default.close(16);
   }

   public void move_previous( )
   {
      RcdFound410 = (short)(0) ;
      /* Using cursor T01QE23 */
      pr_default.execute(17, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A129BarCod), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A132BarCodReo), Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, A130BarCodPar, A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A2804RecLinMaq), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Byte.valueOf(A1273RecLinPro), Byte.valueOf(A1273RecLinPro), Short.valueOf(A2804RecLinMaq), A130BarCodPar, Byte.valueOf(A132BarCodReo), Integer.valueOf(A129BarCod), A396EmprCod, Short.valueOf(A811RecLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         while ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A129BarCod[0] > A129BarCod ) || ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A132BarCodReo[0] > A132BarCodReo ) || ( T01QE23_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QE23_A130BarCodPar[0], A130BarCodPar) > 0 ) || ( GXutil.strcmp(T01QE23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE23_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A2804RecLinMaq[0] > A2804RecLinMaq ) || ( T01QE23_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01QE23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE23_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A1273RecLinPro[0] > A1273RecLinPro ) || ( T01QE23_A1273RecLinPro[0] == A1273RecLinPro ) && ( T01QE23_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01QE23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE23_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A811RecLin[0] > A811RecLin ) ) )
         {
            pr_default.readNext(17);
         }
         if ( (pr_default.getStatus(17) != 101) && ( ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A129BarCod[0] < A129BarCod ) || ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A132BarCodReo[0] < A132BarCodReo ) || ( T01QE23_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QE23_A130BarCodPar[0], A130BarCodPar) < 0 ) || ( GXutil.strcmp(T01QE23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE23_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A2804RecLinMaq[0] < A2804RecLinMaq ) || ( T01QE23_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01QE23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE23_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A1273RecLinPro[0] < A1273RecLinPro ) || ( T01QE23_A1273RecLinPro[0] == A1273RecLinPro ) && ( T01QE23_A2804RecLinMaq[0] == A2804RecLinMaq ) && ( GXutil.strcmp(T01QE23_A130BarCodPar[0], A130BarCodPar) == 0 ) && ( T01QE23_A132BarCodReo[0] == A132BarCodReo ) && ( T01QE23_A129BarCod[0] == A129BarCod ) && ( GXutil.strcmp(T01QE23_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QE23_A811RecLin[0] < A811RecLin ) ) )
         {
            A396EmprCod = T01QE23_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A129BarCod = T01QE23_A129BarCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
            A132BarCodReo = T01QE23_A132BarCodReo[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
            A130BarCodPar = T01QE23_A130BarCodPar[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
            A2804RecLinMaq = T01QE23_A2804RecLinMaq[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
            A1273RecLinPro = T01QE23_A1273RecLinPro[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
            A811RecLin = T01QE23_A811RecLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
            RcdFound410 = (short)(1) ;
         }
      }
      pr_default.close(17);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QE410( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QE410( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound410 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) || ( A811RecLin != Z811RecLin ) )
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
               A1273RecLinPro = Z1273RecLinPro ;
               httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
               A811RecLin = Z811RecLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
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
               update1QE410( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) || ( A811RecLin != Z811RecLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QE410( ) ;
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
                  insert1QE410( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A129BarCod != Z129BarCod ) || ( A132BarCodReo != Z132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, Z130BarCodPar) != 0 ) || ( A2804RecLinMaq != Z2804RecLinMaq ) || ( A1273RecLinPro != Z1273RecLinPro ) || ( A811RecLin != Z811RecLin ) )
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
         A1273RecLinPro = Z1273RecLinPro ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A811RecLin = Z811RecLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
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
      if ( RcdFound410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtRecPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QE410( ) ;
      if ( RcdFound410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QE410( ) ;
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
      if ( RcdFound410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecPrdNum_Internalname ;
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
      if ( RcdFound410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecPrdNum_Internalname ;
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
      scanStart1QE410( ) ;
      if ( RcdFound410 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound410 != 0 )
         {
            scanNext1QE410( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtRecPrdNum_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QE410( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QE410( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECET"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z872RecPrdNum, T01QE2_A872RecPrdNum[0]) != 0 ) || ( GXutil.strcmp(Z875RecPrdDsc, T01QE2_A875RecPrdDsc[0]) != 0 ) || ( DecimalUtil.compareTo(Z686PrdCant, T01QE2_A686PrdCant[0]) != 0 ) || ( DecimalUtil.compareTo(Z1797PrdCanAny, T01QE2_A1797PrdCanAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z683PrdCanFin, T01QE2_A683PrdCanFin[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z2394RecForNro != T01QE2_A2394RecForNro[0] ) || ( Z3274RecPrdTnq != T01QE2_A3274RecPrdTnq[0] ) || ( Z4024RecMar != T01QE2_A4024RecMar[0] ) || ( GXutil.strcmp(Z5725RecLote, T01QE2_A5725RecLote[0]) != 0 ) || ( DecimalUtil.compareTo(Z431FacCon, T01QE2_A431FacCon[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3938RecCanEns, T01QE2_A3938RecCanEns[0]) != 0 ) || ( Z5422RecSalMP != T01QE2_A5422RecSalMP[0] ) || ( Z5467RecSalVol != T01QE2_A5467RecSalVol[0] ) || ( GXutil.strcmp(Z5527RecLinRea, T01QE2_A5527RecLinRea[0]) != 0 ) || ( Z8934RecPes != T01QE2_A8934RecPes[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z8937RecAcc, T01QE2_A8937RecAcc[0]) != 0 ) || ( DecimalUtil.compareTo(Z9813FacCon1, T01QE2_A9813FacCon1[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z3804RecFecMov), GXutil.resetTime(T01QE2_A3804RecFecMov[0])) ) || ( Z3805RecAnyTie != T01QE2_A3805RecAnyTie[0] ) || ( DecimalUtil.compareTo(Z3806RecUltAny, T01QE2_A3806RecUltAny[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z3807RecPorAny, T01QE2_A3807RecPorAny[0]) != 0 ) || ( DecimalUtil.compareTo(Z4900PrdCanMac, T01QE2_A4900PrdCanMac[0]) != 0 ) || ( Z11708RecProv != T01QE2_A11708RecProv[0] ) || ( GXutil.strcmp(Z4576RecLinUsr, T01QE2_A4576RecLinUsr[0]) != 0 ) || !( GXutil.dateCompare(Z4577RecPesFec, T01QE2_A4577RecPesFec[0]) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12641RecPrdDc2, T01QE2_A12641RecPrdDc2[0]) != 0 ) || ( DecimalUtil.compareTo(Z12710PrdCantOrg, T01QE2_A12710PrdCantOrg[0]) != 0 ) || ( Z12717RecFabId != T01QE2_A12717RecFabId[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z13938RecLoteFch), GXutil.resetTime(T01QE2_A13938RecLoteFch[0])) ) || ( Z13937RecLotAlm != T01QE2_A13937RecLotAlm[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14055RecManAut, T01QE2_A14055RecManAut[0]) != 0 ) || ( GXutil.strcmp(Z719PrdNum, T01QE2_A719PrdNum[0]) != 0 ) || ( Z490ForPrdUMe != T01QE2_A490ForPrdUMe[0] ) )
         {
            if ( GXutil.strcmp(Z872RecPrdNum, T01QE2_A872RecPrdNum[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecPrdNum");
               GXutil.writeLogRaw("Old: ",Z872RecPrdNum);
               GXutil.writeLogRaw("Current: ",T01QE2_A872RecPrdNum[0]);
            }
            if ( GXutil.strcmp(Z875RecPrdDsc, T01QE2_A875RecPrdDsc[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecPrdDsc");
               GXutil.writeLogRaw("Old: ",Z875RecPrdDsc);
               GXutil.writeLogRaw("Current: ",T01QE2_A875RecPrdDsc[0]);
            }
            if ( DecimalUtil.compareTo(Z686PrdCant, T01QE2_A686PrdCant[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"PrdCant");
               GXutil.writeLogRaw("Old: ",Z686PrdCant);
               GXutil.writeLogRaw("Current: ",T01QE2_A686PrdCant[0]);
            }
            if ( DecimalUtil.compareTo(Z1797PrdCanAny, T01QE2_A1797PrdCanAny[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"PrdCanAny");
               GXutil.writeLogRaw("Old: ",Z1797PrdCanAny);
               GXutil.writeLogRaw("Current: ",T01QE2_A1797PrdCanAny[0]);
            }
            if ( DecimalUtil.compareTo(Z683PrdCanFin, T01QE2_A683PrdCanFin[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"PrdCanFin");
               GXutil.writeLogRaw("Old: ",Z683PrdCanFin);
               GXutil.writeLogRaw("Current: ",T01QE2_A683PrdCanFin[0]);
            }
            if ( Z2394RecForNro != T01QE2_A2394RecForNro[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecForNro");
               GXutil.writeLogRaw("Old: ",Z2394RecForNro);
               GXutil.writeLogRaw("Current: ",T01QE2_A2394RecForNro[0]);
            }
            if ( Z3274RecPrdTnq != T01QE2_A3274RecPrdTnq[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecPrdTnq");
               GXutil.writeLogRaw("Old: ",Z3274RecPrdTnq);
               GXutil.writeLogRaw("Current: ",T01QE2_A3274RecPrdTnq[0]);
            }
            if ( Z4024RecMar != T01QE2_A4024RecMar[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecMar");
               GXutil.writeLogRaw("Old: ",Z4024RecMar);
               GXutil.writeLogRaw("Current: ",T01QE2_A4024RecMar[0]);
            }
            if ( GXutil.strcmp(Z5725RecLote, T01QE2_A5725RecLote[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecLote");
               GXutil.writeLogRaw("Old: ",Z5725RecLote);
               GXutil.writeLogRaw("Current: ",T01QE2_A5725RecLote[0]);
            }
            if ( DecimalUtil.compareTo(Z431FacCon, T01QE2_A431FacCon[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"FacCon");
               GXutil.writeLogRaw("Old: ",Z431FacCon);
               GXutil.writeLogRaw("Current: ",T01QE2_A431FacCon[0]);
            }
            if ( DecimalUtil.compareTo(Z3938RecCanEns, T01QE2_A3938RecCanEns[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecCanEns");
               GXutil.writeLogRaw("Old: ",Z3938RecCanEns);
               GXutil.writeLogRaw("Current: ",T01QE2_A3938RecCanEns[0]);
            }
            if ( Z5422RecSalMP != T01QE2_A5422RecSalMP[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecSalMP");
               GXutil.writeLogRaw("Old: ",Z5422RecSalMP);
               GXutil.writeLogRaw("Current: ",T01QE2_A5422RecSalMP[0]);
            }
            if ( Z5467RecSalVol != T01QE2_A5467RecSalVol[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecSalVol");
               GXutil.writeLogRaw("Old: ",Z5467RecSalVol);
               GXutil.writeLogRaw("Current: ",T01QE2_A5467RecSalVol[0]);
            }
            if ( GXutil.strcmp(Z5527RecLinRea, T01QE2_A5527RecLinRea[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecLinRea");
               GXutil.writeLogRaw("Old: ",Z5527RecLinRea);
               GXutil.writeLogRaw("Current: ",T01QE2_A5527RecLinRea[0]);
            }
            if ( Z8934RecPes != T01QE2_A8934RecPes[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecPes");
               GXutil.writeLogRaw("Old: ",Z8934RecPes);
               GXutil.writeLogRaw("Current: ",T01QE2_A8934RecPes[0]);
            }
            if ( GXutil.strcmp(Z8937RecAcc, T01QE2_A8937RecAcc[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecAcc");
               GXutil.writeLogRaw("Old: ",Z8937RecAcc);
               GXutil.writeLogRaw("Current: ",T01QE2_A8937RecAcc[0]);
            }
            if ( DecimalUtil.compareTo(Z9813FacCon1, T01QE2_A9813FacCon1[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"FacCon1");
               GXutil.writeLogRaw("Old: ",Z9813FacCon1);
               GXutil.writeLogRaw("Current: ",T01QE2_A9813FacCon1[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z3804RecFecMov), GXutil.resetTime(T01QE2_A3804RecFecMov[0])) ) )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecFecMov");
               GXutil.writeLogRaw("Old: ",Z3804RecFecMov);
               GXutil.writeLogRaw("Current: ",T01QE2_A3804RecFecMov[0]);
            }
            if ( Z3805RecAnyTie != T01QE2_A3805RecAnyTie[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecAnyTie");
               GXutil.writeLogRaw("Old: ",Z3805RecAnyTie);
               GXutil.writeLogRaw("Current: ",T01QE2_A3805RecAnyTie[0]);
            }
            if ( DecimalUtil.compareTo(Z3806RecUltAny, T01QE2_A3806RecUltAny[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecUltAny");
               GXutil.writeLogRaw("Old: ",Z3806RecUltAny);
               GXutil.writeLogRaw("Current: ",T01QE2_A3806RecUltAny[0]);
            }
            if ( DecimalUtil.compareTo(Z3807RecPorAny, T01QE2_A3807RecPorAny[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecPorAny");
               GXutil.writeLogRaw("Old: ",Z3807RecPorAny);
               GXutil.writeLogRaw("Current: ",T01QE2_A3807RecPorAny[0]);
            }
            if ( DecimalUtil.compareTo(Z4900PrdCanMac, T01QE2_A4900PrdCanMac[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"PrdCanMac");
               GXutil.writeLogRaw("Old: ",Z4900PrdCanMac);
               GXutil.writeLogRaw("Current: ",T01QE2_A4900PrdCanMac[0]);
            }
            if ( Z11708RecProv != T01QE2_A11708RecProv[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecProv");
               GXutil.writeLogRaw("Old: ",Z11708RecProv);
               GXutil.writeLogRaw("Current: ",T01QE2_A11708RecProv[0]);
            }
            if ( GXutil.strcmp(Z4576RecLinUsr, T01QE2_A4576RecLinUsr[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecLinUsr");
               GXutil.writeLogRaw("Old: ",Z4576RecLinUsr);
               GXutil.writeLogRaw("Current: ",T01QE2_A4576RecLinUsr[0]);
            }
            if ( !( GXutil.dateCompare(Z4577RecPesFec, T01QE2_A4577RecPesFec[0]) ) )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecPesFec");
               GXutil.writeLogRaw("Old: ",Z4577RecPesFec);
               GXutil.writeLogRaw("Current: ",T01QE2_A4577RecPesFec[0]);
            }
            if ( GXutil.strcmp(Z12641RecPrdDc2, T01QE2_A12641RecPrdDc2[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecPrdDc2");
               GXutil.writeLogRaw("Old: ",Z12641RecPrdDc2);
               GXutil.writeLogRaw("Current: ",T01QE2_A12641RecPrdDc2[0]);
            }
            if ( DecimalUtil.compareTo(Z12710PrdCantOrg, T01QE2_A12710PrdCantOrg[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"PrdCantOrg");
               GXutil.writeLogRaw("Old: ",Z12710PrdCantOrg);
               GXutil.writeLogRaw("Current: ",T01QE2_A12710PrdCantOrg[0]);
            }
            if ( Z12717RecFabId != T01QE2_A12717RecFabId[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecFabId");
               GXutil.writeLogRaw("Old: ",Z12717RecFabId);
               GXutil.writeLogRaw("Current: ",T01QE2_A12717RecFabId[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z13938RecLoteFch), GXutil.resetTime(T01QE2_A13938RecLoteFch[0])) ) )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecLoteFch");
               GXutil.writeLogRaw("Old: ",Z13938RecLoteFch);
               GXutil.writeLogRaw("Current: ",T01QE2_A13938RecLoteFch[0]);
            }
            if ( Z13937RecLotAlm != T01QE2_A13937RecLotAlm[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecLotAlm");
               GXutil.writeLogRaw("Old: ",Z13937RecLotAlm);
               GXutil.writeLogRaw("Current: ",T01QE2_A13937RecLotAlm[0]);
            }
            if ( GXutil.strcmp(Z14055RecManAut, T01QE2_A14055RecManAut[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"RecManAut");
               GXutil.writeLogRaw("Old: ",Z14055RecManAut);
               GXutil.writeLogRaw("Current: ",T01QE2_A14055RecManAut[0]);
            }
            if ( GXutil.strcmp(Z719PrdNum, T01QE2_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T01QE2_A719PrdNum[0]);
            }
            if ( Z490ForPrdUMe != T01QE2_A490ForPrdUMe[0] )
            {
               GXutil.writeLogln("lrecet:[seudo value changed for attri]"+"ForPrdUMe");
               GXutil.writeLogRaw("Old: ",Z490ForPrdUMe);
               GXutil.writeLogRaw("Current: ",T01QE2_A490ForPrdUMe[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLRECET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QE410( )
   {
      beforeValidate1QE410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QE410( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QE410( 0) ;
         checkOptimisticConcurrency1QE410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QE410( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QE410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QE24 */
                  pr_default.execute(18, new Object[] {Short.valueOf(A811RecLin), A872RecPrdNum, A875RecPrdDsc, A686PrdCant, A1797PrdCanAny, A683PrdCanFin, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), Byte.valueOf(A4024RecMar), A5725RecLote, A431FacCon, A3938RecCanEns, Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, Byte.valueOf(A8934RecPes), A8937RecAcc, A9813FacCon1, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A4576RecLinUsr, A4577RecPesFec, A12641RecPrdDc2, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId), A13938RecLoteFch, Short.valueOf(A13937RecLotAlm), A14055RecManAut, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1QE0( ) ;
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
            load1QE410( ) ;
         }
         endLevel1QE410( ) ;
      }
      closeExtendedTableCursors1QE410( ) ;
   }

   public void update1QE410( )
   {
      beforeValidate1QE410( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QE410( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QE410( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QE410( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QE410( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QE25 */
                  pr_default.execute(19, new Object[] {A872RecPrdNum, A875RecPrdDsc, A686PrdCant, A1797PrdCanAny, A683PrdCanFin, Byte.valueOf(A2394RecForNro), Byte.valueOf(A3274RecPrdTnq), Byte.valueOf(A4024RecMar), A5725RecLote, A431FacCon, A3938RecCanEns, Short.valueOf(A5422RecSalMP), Integer.valueOf(A5467RecSalVol), A5527RecLinRea, Byte.valueOf(A8934RecPes), A8937RecAcc, A9813FacCon1, A3804RecFecMov, Short.valueOf(A3805RecAnyTie), A3806RecUltAny, A3807RecPorAny, A4900PrdCanMac, Integer.valueOf(A11708RecProv), A4576RecLinUsr, A4577RecPesFec, A12641RecPrdDc2, A12710PrdCantOrg, Integer.valueOf(A12717RecFabId), A13938RecLoteFch, Short.valueOf(A13937RecLotAlm), A14055RecManAut, Boolean.valueOf(n719PrdNum), A719PrdNum, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe), A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
                  if ( (pr_default.getStatus(19) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLRECET"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QE410( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QE0( ) ;
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
         endLevel1QE410( ) ;
      }
      closeExtendedTableCursors1QE410( ) ;
   }

   public void deferredUpdate1QE410( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QE410( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QE410( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QE410( ) ;
         afterConfirm1QE410( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QE410( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QE26 */
               pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro), Short.valueOf(A811RecLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLRECET");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound410 == 0 )
                     {
                        initAll1QE410( ) ;
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
                     resetCaption1QE0( ) ;
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
      sMode410 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QE410( ) ;
      Gx_mode = sMode410 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QE410( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QE27 */
         pr_default.execute(21, new Object[] {A396EmprCod});
         A407EmprNom = T01QE27_A407EmprNom[0] ;
         n407EmprNom = T01QE27_n407EmprNom[0] ;
         pr_default.close(21);
         /* Using cursor T01QE28 */
         pr_default.execute(22, new Object[] {A396EmprCod, A872RecPrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            A874RecPrdFind = T01QE28_A874RecPrdFind[0] ;
            n874RecPrdFind = T01QE28_n874RecPrdFind[0] ;
         }
         else
         {
            A874RecPrdFind = "xxxxxx" ;
            n874RecPrdFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
         }
         pr_default.close(22);
         A238CanRes = A686PrdCant.divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
         /* Using cursor T01QE29 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
         A488ForPrdDsc = T01QE29_A488ForPrdDsc[0] ;
         n488ForPrdDsc = T01QE29_n488ForPrdDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
         pr_default.close(23);
         /* Using cursor T01QE30 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         A707PrdFacCon = T01QE30_A707PrdFacCon[0] ;
         n707PrdFacCon = T01QE30_n707PrdFacCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
         A704PrdExiAlm = T01QE30_A704PrdExiAlm[0] ;
         n704PrdExiAlm = T01QE30_n704PrdExiAlm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
         A685PrdCanRes = T01QE30_A685PrdCanRes[0] ;
         n685PrdCanRes = T01QE30_n685PrdCanRes[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
         A705PrdExiCC = T01QE30_A705PrdExiCC[0] ;
         n705PrdExiCC = T01QE30_n705PrdExiCC[0] ;
         A706PrdExiCCP = T01QE30_A706PrdExiCCP[0] ;
         n706PrdExiCCP = T01QE30_n706PrdExiCCP[0] ;
         A5418PrdSalM = T01QE30_A5418PrdSalM[0] ;
         n5418PrdSalM = T01QE30_n5418PrdSalM[0] ;
         A10881PrdLote = T01QE30_A10881PrdLote[0] ;
         n10881PrdLote = T01QE30_n10881PrdLote[0] ;
         A13232PrdRGB = T01QE30_A13232PrdRGB[0] ;
         n13232PrdRGB = T01QE30_n13232PrdRGB[0] ;
         A795PrvNum = T01QE30_A795PrvNum[0] ;
         n795PrvNum = T01QE30_n795PrvNum[0] ;
         A856ValCod = T01QE30_A856ValCod[0] ;
         n856ValCod = T01QE30_n856ValCod[0] ;
         pr_default.close(24);
         A13832CantProduc = (A686PrdCant.multiply(A707PrdFacCon)).divide(DecimalUtil.doubleToDec(1000), 18, java.math.RoundingMode.DOWN) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
         /* Using cursor T01QE33 */
         pr_default.execute(25, new Object[] {Boolean.valueOf(n874RecPrdFind), A874RecPrdFind, A872RecPrdNum, A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A873RecPrdNom = T01QE33_A873RecPrdNom[0] ;
            n873RecPrdNom = T01QE33_n873RecPrdNom[0] ;
         }
         else
         {
            A873RecPrdNom = "" ;
            n873RecPrdNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", A873RecPrdNom);
         }
         pr_default.close(25);
      }
   }

   public void endLevel1QE410( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QE410( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lrecet");
         if ( AnyError == 0 )
         {
            confirmValues1QE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lrecet");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QE410( )
   {
      /* Using cursor T01QE34 */
      pr_default.execute(26);
      RcdFound410 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A396EmprCod = T01QE34_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01QE34_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QE34_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QE34_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01QE34_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01QE34_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A811RecLin = T01QE34_A811RecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QE410( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound410 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound410 = (short)(1) ;
         A396EmprCod = T01QE34_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A129BarCod = T01QE34_A129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QE34_A132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QE34_A130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A2804RecLinMaq = T01QE34_A2804RecLinMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2804RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2804RecLinMaq), 4, 0));
         A1273RecLinPro = T01QE34_A1273RecLinPro[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
         A811RecLin = T01QE34_A811RecLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
      }
   }

   public void scanEnd1QE410( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1QE410( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QE410( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QE410( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QE410( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QE410( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QE410( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QE410( )
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
      edtRecLinPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLinPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLinPro_Enabled), 5, 0), true);
      edtRecLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLin_Enabled), 5, 0), true);
      edtRecPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdNum_Enabled), 5, 0), true);
      edtRecPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdDsc_Enabled), 5, 0), true);
      edtPrdFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdFacCon_Enabled), 5, 0), true);
      edtPrdCant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCant_Enabled), 5, 0), true);
      edtPrdCanAny_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanAny_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanAny_Enabled), 5, 0), true);
      edtPrdCanFin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanFin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanFin_Enabled), 5, 0), true);
      edtForPrdUMe_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdUMe_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdUMe_Enabled), 5, 0), true);
      edtForPrdDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForPrdDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForPrdDsc_Enabled), 5, 0), true);
      edtRecForNro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecForNro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecForNro_Enabled), 5, 0), true);
      edtRecPrdTnq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecPrdTnq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecPrdTnq_Enabled), 5, 0), true);
      edtRecMar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecMar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecMar_Enabled), 5, 0), true);
      edtRecLote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecLote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecLote_Enabled), 5, 0), true);
      edtPrdExiAlm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdExiAlm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Enabled), 5, 0), true);
      edtPrdCanRes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdCanRes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdCanRes_Enabled), 5, 0), true);
      edtFacCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCon_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QE410( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QE0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lrecet", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"LRECET");
      forbiddenHiddens.add("RecCanEns", localUtil.format( A3938RecCanEns, "ZZZ9.99999"));
      forbiddenHiddens.add("RecSalMP", localUtil.format( DecimalUtil.doubleToDec(A5422RecSalMP), "ZZ9"));
      forbiddenHiddens.add("RecSalVol", localUtil.format( DecimalUtil.doubleToDec(A5467RecSalVol), "ZZZZ9"));
      forbiddenHiddens.add("RecLinRea", GXutil.rtrim( localUtil.format( A5527RecLinRea, "")));
      forbiddenHiddens.add("RecPes", localUtil.format( DecimalUtil.doubleToDec(A8934RecPes), "9"));
      forbiddenHiddens.add("RecAcc", GXutil.rtrim( localUtil.format( A8937RecAcc, "")));
      forbiddenHiddens.add("FacCon1", localUtil.format( A9813FacCon1, "ZZZZ9.99999"));
      forbiddenHiddens.add("RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
      forbiddenHiddens.add("RecAnyTie", localUtil.format( DecimalUtil.doubleToDec(A3805RecAnyTie), "ZZZ9"));
      forbiddenHiddens.add("RecUltAny", localUtil.format( A3806RecUltAny, "ZZZZZZ9.999"));
      forbiddenHiddens.add("RecPorAny", localUtil.format( A3807RecPorAny, "ZZ9.99"));
      forbiddenHiddens.add("PrdCanMac", localUtil.format( A4900PrdCanMac, "ZZZZZZ9.999"));
      forbiddenHiddens.add("RecProv", localUtil.format( DecimalUtil.doubleToDec(A11708RecProv), "ZZZZZ9"));
      forbiddenHiddens.add("RecLinUsr", GXutil.rtrim( localUtil.format( A4576RecLinUsr, "@!")));
      forbiddenHiddens.add("RecPesFec", localUtil.format( A4577RecPesFec, "99/99/99 99:99"));
      forbiddenHiddens.add("RecPrdDc2", GXutil.rtrim( localUtil.format( A12641RecPrdDc2, "")));
      forbiddenHiddens.add("PrdCantOrg", localUtil.format( A12710PrdCantOrg, "ZZZZZZ9.999"));
      forbiddenHiddens.add("RecFabId", localUtil.format( DecimalUtil.doubleToDec(A12717RecFabId), "ZZZZZ9"));
      forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
      forbiddenHiddens.add("RecLoteFch", localUtil.format(A13938RecLoteFch, "99/99/99"));
      forbiddenHiddens.add("RecLotAlm", localUtil.format( DecimalUtil.doubleToDec(A13937RecLotAlm), "ZZZ9"));
      forbiddenHiddens.add("RecManAut", GXutil.rtrim( localUtil.format( A14055RecManAut, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lrecet:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z1273RecLinPro", GXutil.ltrim( localUtil.ntoc( Z1273RecLinPro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z811RecLin", GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z872RecPrdNum", GXutil.rtrim( Z872RecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z875RecPrdDsc", GXutil.rtrim( Z875RecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z686PrdCant", GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1797PrdCanAny", GXutil.ltrim( localUtil.ntoc( Z1797PrdCanAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z683PrdCanFin", GXutil.ltrim( localUtil.ntoc( Z683PrdCanFin, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2394RecForNro", GXutil.ltrim( localUtil.ntoc( Z2394RecForNro, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3274RecPrdTnq", GXutil.ltrim( localUtil.ntoc( Z3274RecPrdTnq, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4024RecMar", GXutil.ltrim( localUtil.ntoc( Z4024RecMar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5725RecLote", GXutil.rtrim( Z5725RecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z431FacCon", GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3938RecCanEns", GXutil.ltrim( localUtil.ntoc( Z3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5422RecSalMP", GXutil.ltrim( localUtil.ntoc( Z5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5467RecSalVol", GXutil.ltrim( localUtil.ntoc( Z5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5527RecLinRea", GXutil.rtrim( Z5527RecLinRea));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8934RecPes", GXutil.ltrim( localUtil.ntoc( Z8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8937RecAcc", GXutil.rtrim( Z8937RecAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9813FacCon1", GXutil.ltrim( localUtil.ntoc( Z9813FacCon1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3804RecFecMov", localUtil.dtoc( Z3804RecFecMov, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3805RecAnyTie", GXutil.ltrim( localUtil.ntoc( Z3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3806RecUltAny", GXutil.ltrim( localUtil.ntoc( Z3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3807RecPorAny", GXutil.ltrim( localUtil.ntoc( Z3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4900PrdCanMac", GXutil.ltrim( localUtil.ntoc( Z4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11708RecProv", GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4576RecLinUsr", GXutil.rtrim( Z4576RecLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4577RecPesFec", localUtil.ttoc( Z4577RecPesFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12641RecPrdDc2", GXutil.rtrim( Z12641RecPrdDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12710PrdCantOrg", GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12717RecFabId", GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13938RecLoteFch", localUtil.dtoc( Z13938RecLoteFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13937RecLotAlm", GXutil.ltrim( localUtil.ntoc( Z13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14055RecManAut", GXutil.rtrim( Z14055RecManAut));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "CANTPRODUC", GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CANRES", GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECCANENS", GXutil.ltrim( localUtil.ntoc( A3938RecCanEns, (byte)(10), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECSALMP", GXutil.ltrim( localUtil.ntoc( A5422RecSalMP, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECSALVOL", GXutil.ltrim( localUtil.ntoc( A5467RecSalVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINREA", GXutil.rtrim( A5527RecLinRea));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPES", GXutil.ltrim( localUtil.ntoc( A8934RecPes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECACC", GXutil.rtrim( A8937RecAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "FACCON1", GXutil.ltrim( localUtil.ntoc( A9813FacCon1, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFECMOV", localUtil.dtoc( A3804RecFecMov, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "RECANYTIE", GXutil.ltrim( localUtil.ntoc( A3805RecAnyTie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECULTANY", GXutil.ltrim( localUtil.ntoc( A3806RecUltAny, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPORANY", GXutil.ltrim( localUtil.ntoc( A3807RecPorAny, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANMAC", GXutil.ltrim( localUtil.ntoc( A4900PrdCanMac, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPROV", GXutil.ltrim( localUtil.ntoc( A11708RecProv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINUSR", GXutil.rtrim( A4576RecLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPESFEC", localUtil.ttoc( A4577RecPesFec, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDDC2", GXutil.rtrim( A12641RecPrdDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDCANTORG", GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECFABID", GXutil.ltrim( localUtil.ntoc( A12717RecFabId, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOTEFCH", localUtil.dtoc( A13938RecLoteFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOTALM", GXutil.ltrim( localUtil.ntoc( A13937RecLotAlm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECMANAUT", GXutil.rtrim( A14055RecManAut));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM", GXutil.rtrim( A719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDFIND", GXutil.rtrim( A874RecPrdFind));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDEXICCP", GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDSALM", GXutil.rtrim( A5418PrdSalM));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLOTE", GXutil.rtrim( A10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECPRDNOM", GXutil.rtrim( A873RecPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      return formatLink("app.lrecet", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LRECET" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tabla LRECET", "") ;
   }

   public void initializeNonKey1QE410( )
   {
      A238CanRes = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrimstr( A238CanRes, 8, 2));
      A13832CantProduc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrimstr( A13832CantProduc, 12, 2));
      A873RecPrdNom = "" ;
      n873RecPrdNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", A873RecPrdNom);
      A874RecPrdFind = "" ;
      n874RecPrdFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", A874RecPrdFind);
      A872RecPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", A872RecPrdNum);
      A875RecPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", A875RecPrdDsc);
      A707PrdFacCon = DecimalUtil.ZERO ;
      n707PrdFacCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrimstr( A707PrdFacCon, 7, 4));
      A686PrdCant = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrimstr( A686PrdCant, 11, 3));
      A1797PrdCanAny = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1797PrdCanAny", GXutil.ltrimstr( A1797PrdCanAny, 11, 3));
      A683PrdCanFin = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A683PrdCanFin", GXutil.ltrimstr( A683PrdCanFin, 11, 3));
      A490ForPrdUMe = (byte)(0) ;
      n490ForPrdUMe = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.str( A490ForPrdUMe, 1, 0));
      A488ForPrdDsc = "" ;
      n488ForPrdDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", A488ForPrdDsc);
      A2394RecForNro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2394RecForNro), 2, 0));
      A3274RecPrdTnq = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3274RecPrdTnq), 2, 0));
      A4024RecMar = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.str( A4024RecMar, 1, 0));
      A5725RecLote = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", A5725RecLote);
      A704PrdExiAlm = DecimalUtil.ZERO ;
      n704PrdExiAlm = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrimstr( A704PrdExiAlm, 12, 4));
      A685PrdCanRes = DecimalUtil.ZERO ;
      n685PrdCanRes = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrimstr( A685PrdCanRes, 12, 4));
      A431FacCon = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrimstr( A431FacCon, 11, 5));
      A856ValCod = (byte)(0) ;
      n856ValCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      A705PrdExiCC = DecimalUtil.ZERO ;
      n705PrdExiCC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrimstr( A705PrdExiCC, 12, 4));
      A706PrdExiCCP = DecimalUtil.ZERO ;
      n706PrdExiCCP = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrimstr( A706PrdExiCCP, 8, 2));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A3938RecCanEns = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3938RecCanEns", GXutil.ltrimstr( A3938RecCanEns, 10, 5));
      A5422RecSalMP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5422RecSalMP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5422RecSalMP), 3, 0));
      A5418PrdSalM = "" ;
      n5418PrdSalM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", A5418PrdSalM);
      A5467RecSalVol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A5467RecSalVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5467RecSalVol), 5, 0));
      A5527RecLinRea = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5527RecLinRea", A5527RecLinRea);
      A8934RecPes = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8934RecPes", GXutil.str( A8934RecPes, 1, 0));
      A8937RecAcc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8937RecAcc", A8937RecAcc);
      A9813FacCon1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A9813FacCon1", GXutil.ltrimstr( A9813FacCon1, 11, 5));
      A3804RecFecMov = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A3804RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
      A3805RecAnyTie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3805RecAnyTie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3805RecAnyTie), 4, 0));
      A3806RecUltAny = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3806RecUltAny", GXutil.ltrimstr( A3806RecUltAny, 11, 3));
      A3807RecPorAny = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3807RecPorAny", GXutil.ltrimstr( A3807RecPorAny, 6, 2));
      A4900PrdCanMac = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4900PrdCanMac", GXutil.ltrimstr( A4900PrdCanMac, 11, 3));
      A11708RecProv = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11708RecProv", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11708RecProv), 6, 0));
      A10881PrdLote = "" ;
      n10881PrdLote = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", A10881PrdLote);
      A4576RecLinUsr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4576RecLinUsr", A4576RecLinUsr);
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A4577RecPesFec", localUtil.ttoc( A4577RecPesFec, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A12641RecPrdDc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12641RecPrdDc2", A12641RecPrdDc2);
      A795PrvNum = 0 ;
      n795PrvNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A795PrvNum), 6, 0));
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrimstr( A12710PrdCantOrg, 11, 3));
      A12717RecFabId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A12717RecFabId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12717RecFabId), 6, 0));
      A13232PrdRGB = 0 ;
      n13232PrdRGB = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13232PrdRGB), 10, 0));
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A13938RecLoteFch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A13938RecLoteFch", localUtil.format(A13938RecLoteFch, "99/99/99"));
      A13937RecLotAlm = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13937RecLotAlm", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13937RecLotAlm), 4, 0));
      A14055RecManAut = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14055RecManAut", A14055RecManAut);
      Z872RecPrdNum = "" ;
      Z875RecPrdDsc = "" ;
      Z686PrdCant = DecimalUtil.ZERO ;
      Z1797PrdCanAny = DecimalUtil.ZERO ;
      Z683PrdCanFin = DecimalUtil.ZERO ;
      Z2394RecForNro = (byte)(0) ;
      Z3274RecPrdTnq = (byte)(0) ;
      Z4024RecMar = (byte)(0) ;
      Z5725RecLote = "" ;
      Z431FacCon = DecimalUtil.ZERO ;
      Z3938RecCanEns = DecimalUtil.ZERO ;
      Z5422RecSalMP = (short)(0) ;
      Z5467RecSalVol = 0 ;
      Z5527RecLinRea = "" ;
      Z8934RecPes = (byte)(0) ;
      Z8937RecAcc = "" ;
      Z9813FacCon1 = DecimalUtil.ZERO ;
      Z3804RecFecMov = GXutil.nullDate() ;
      Z3805RecAnyTie = (short)(0) ;
      Z3806RecUltAny = DecimalUtil.ZERO ;
      Z3807RecPorAny = DecimalUtil.ZERO ;
      Z4900PrdCanMac = DecimalUtil.ZERO ;
      Z11708RecProv = 0 ;
      Z4576RecLinUsr = "" ;
      Z4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      Z12641RecPrdDc2 = "" ;
      Z12710PrdCantOrg = DecimalUtil.ZERO ;
      Z12717RecFabId = 0 ;
      Z13938RecLoteFch = GXutil.nullDate() ;
      Z13937RecLotAlm = (short)(0) ;
      Z14055RecManAut = "" ;
      Z719PrdNum = "" ;
      Z490ForPrdUMe = (byte)(0) ;
   }

   public void initAll1QE410( )
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
      A1273RecLinPro = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1273RecLinPro", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1273RecLinPro), 2, 0));
      A811RecLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A811RecLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A811RecLin), 4, 0));
      initializeNonKey1QE410( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415111098", true, true);
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
      httpContext.AddJavascriptSource("lrecet.js", "?202682415111099", false, true);
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
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtRecLinMaq_Internalname = "RECLINMAQ" ;
      edtRecLinPro_Internalname = "RECLINPRO" ;
      edtRecLin_Internalname = "RECLIN" ;
      edtRecPrdNum_Internalname = "RECPRDNUM" ;
      edtRecPrdDsc_Internalname = "RECPRDDSC" ;
      edtPrdFacCon_Internalname = "PRDFACCON" ;
      edtPrdCant_Internalname = "PRDCANT" ;
      edtPrdCanAny_Internalname = "PRDCANANY" ;
      edtPrdCanFin_Internalname = "PRDCANFIN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtRecForNro_Internalname = "RECFORNRO" ;
      edtRecPrdTnq_Internalname = "RECPRDTNQ" ;
      edtRecMar_Internalname = "RECMAR" ;
      edtRecLote_Internalname = "RECLOTE" ;
      edtPrdExiAlm_Internalname = "PRDEXIALM" ;
      edtPrdCanRes_Internalname = "PRDCANRES" ;
      edtFacCon_Internalname = "FACCON" ;
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
      Form.setCaption( httpContext.getMessage( "Tabla LRECET", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtFacCon_Jsonclick = "" ;
      edtFacCon_Enabled = 1 ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdCanRes_Enabled = 0 ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdExiAlm_Enabled = 0 ;
      edtRecLote_Jsonclick = "" ;
      edtRecLote_Enabled = 1 ;
      edtRecMar_Jsonclick = "" ;
      edtRecMar_Enabled = 1 ;
      edtRecPrdTnq_Jsonclick = "" ;
      edtRecPrdTnq_Enabled = 1 ;
      edtRecForNro_Jsonclick = "" ;
      edtRecForNro_Enabled = 1 ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdDsc_Enabled = 0 ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdUMe_Enabled = 1 ;
      edtPrdCanFin_Jsonclick = "" ;
      edtPrdCanFin_Enabled = 1 ;
      edtPrdCanAny_Jsonclick = "" ;
      edtPrdCanAny_Enabled = 1 ;
      edtPrdCant_Jsonclick = "" ;
      edtPrdCant_Enabled = 1 ;
      edtPrdFacCon_Jsonclick = "" ;
      edtPrdFacCon_Enabled = 0 ;
      edtRecPrdDsc_Jsonclick = "" ;
      edtRecPrdDsc_Enabled = 1 ;
      edtRecPrdNum_Jsonclick = "" ;
      edtRecPrdNum_Enabled = 1 ;
      edtRecLin_Jsonclick = "" ;
      edtRecLin_Enabled = 1 ;
      edtRecLinPro_Jsonclick = "" ;
      edtRecLinPro_Enabled = 1 ;
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

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01QE27 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01QE27_A407EmprNom[0] ;
      n407EmprNom = T01QE27_n407EmprNom[0] ;
      pr_default.close(21);
      /* Using cursor T01QE35 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRECET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(27);
      GX_FocusControl = edtRecPrdNum_Internalname ;
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
      n719PrdNum = false ;
      n407EmprNom = false ;
      n707PrdFacCon = false ;
      n704PrdExiAlm = false ;
      n685PrdCanRes = false ;
      n705PrdExiCC = false ;
      n706PrdExiCCP = false ;
      n5418PrdSalM = false ;
      n10881PrdLote = false ;
      n13232PrdRGB = false ;
      n795PrvNum = false ;
      n856ValCod = false ;
      /* Using cursor T01QE27 */
      pr_default.execute(21, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01QE27_A407EmprNom[0] ;
      n407EmprNom = T01QE27_n407EmprNom[0] ;
      pr_default.close(21);
      /* Using cursor T01QE30 */
      pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(24) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (GXutil.strcmp("", A719PrdNum)==0) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A707PrdFacCon = T01QE30_A707PrdFacCon[0] ;
      n707PrdFacCon = T01QE30_n707PrdFacCon[0] ;
      A704PrdExiAlm = T01QE30_A704PrdExiAlm[0] ;
      n704PrdExiAlm = T01QE30_n704PrdExiAlm[0] ;
      A685PrdCanRes = T01QE30_A685PrdCanRes[0] ;
      n685PrdCanRes = T01QE30_n685PrdCanRes[0] ;
      A705PrdExiCC = T01QE30_A705PrdExiCC[0] ;
      n705PrdExiCC = T01QE30_n705PrdExiCC[0] ;
      A706PrdExiCCP = T01QE30_A706PrdExiCCP[0] ;
      n706PrdExiCCP = T01QE30_n706PrdExiCCP[0] ;
      A5418PrdSalM = T01QE30_A5418PrdSalM[0] ;
      n5418PrdSalM = T01QE30_n5418PrdSalM[0] ;
      A10881PrdLote = T01QE30_A10881PrdLote[0] ;
      n10881PrdLote = T01QE30_n10881PrdLote[0] ;
      A13232PrdRGB = T01QE30_A13232PrdRGB[0] ;
      n13232PrdRGB = T01QE30_n13232PrdRGB[0] ;
      A795PrvNum = T01QE30_A795PrvNum[0] ;
      n795PrvNum = T01QE30_n795PrvNum[0] ;
      A856ValCod = T01QE30_A856ValCod[0] ;
      n856ValCod = T01QE30_n856ValCod[0] ;
      pr_default.close(24);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", GXutil.rtrim( A5418PrdSalM));
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", GXutil.rtrim( A10881PrdLote));
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Reclinpro( )
   {
      /* Using cursor T01QE35 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Short.valueOf(A2804RecLinMaq), Byte.valueOf(A1273RecLinPro)});
      if ( (pr_default.getStatus(27) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CRECET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "RECLINPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(27);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Reclin( )
   {
      n719PrdNum = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A872RecPrdNum", GXutil.rtrim( A872RecPrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A875RecPrdDsc", GXutil.rtrim( A875RecPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A686PrdCant", GXutil.ltrim( localUtil.ntoc( A686PrdCant, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1797PrdCanAny", GXutil.ltrim( localUtil.ntoc( A1797PrdCanAny, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A683PrdCanFin", GXutil.ltrim( localUtil.ntoc( A683PrdCanFin, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2394RecForNro", GXutil.ltrim( localUtil.ntoc( A2394RecForNro, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3274RecPrdTnq", GXutil.ltrim( localUtil.ntoc( A3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4024RecMar", GXutil.ltrim( localUtil.ntoc( A4024RecMar, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5725RecLote", GXutil.rtrim( A5725RecLote));
      httpContext.ajax_rsp_assign_attri("", false, "A431FacCon", GXutil.ltrim( localUtil.ntoc( A431FacCon, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3938RecCanEns", GXutil.ltrim( localUtil.ntoc( A3938RecCanEns, (byte)(10), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5422RecSalMP", GXutil.ltrim( localUtil.ntoc( A5422RecSalMP, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5467RecSalVol", GXutil.ltrim( localUtil.ntoc( A5467RecSalVol, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5527RecLinRea", GXutil.rtrim( A5527RecLinRea));
      httpContext.ajax_rsp_assign_attri("", false, "A8934RecPes", GXutil.ltrim( localUtil.ntoc( A8934RecPes, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A8937RecAcc", GXutil.rtrim( A8937RecAcc));
      httpContext.ajax_rsp_assign_attri("", false, "A9813FacCon1", GXutil.ltrim( localUtil.ntoc( A9813FacCon1, (byte)(11), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3804RecFecMov", localUtil.format(A3804RecFecMov, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A3805RecAnyTie", GXutil.ltrim( localUtil.ntoc( A3805RecAnyTie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3806RecUltAny", GXutil.ltrim( localUtil.ntoc( A3806RecUltAny, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3807RecPorAny", GXutil.ltrim( localUtil.ntoc( A3807RecPorAny, (byte)(6), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4900PrdCanMac", GXutil.ltrim( localUtil.ntoc( A4900PrdCanMac, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A11708RecProv", GXutil.ltrim( localUtil.ntoc( A11708RecProv, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4576RecLinUsr", GXutil.rtrim( A4576RecLinUsr));
      httpContext.ajax_rsp_assign_attri("", false, "A4577RecPesFec", localUtil.ttoc( A4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A12641RecPrdDc2", GXutil.rtrim( A12641RecPrdDc2));
      httpContext.ajax_rsp_assign_attri("", false, "A12710PrdCantOrg", GXutil.ltrim( localUtil.ntoc( A12710PrdCantOrg, (byte)(11), (byte)(3), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A12717RecFabId", GXutil.ltrim( localUtil.ntoc( A12717RecFabId, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", GXutil.rtrim( A719PrdNum));
      httpContext.ajax_rsp_assign_attri("", false, "A13938RecLoteFch", localUtil.format(A13938RecLoteFch, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13937RecLotAlm", GXutil.ltrim( localUtil.ntoc( A13937RecLotAlm, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14055RecManAut", GXutil.rtrim( A14055RecManAut));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A707PrdFacCon", GXutil.ltrim( localUtil.ntoc( A707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A685PrdCanRes", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A705PrdExiCC", GXutil.ltrim( localUtil.ntoc( A705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( A706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5418PrdSalM", GXutil.rtrim( A5418PrdSalM));
      httpContext.ajax_rsp_assign_attri("", false, "A10881PrdLote", GXutil.rtrim( A10881PrdLote));
      httpContext.ajax_rsp_assign_attri("", false, "A13232PrdRGB", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A795PrvNum", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13832CantProduc", GXutil.ltrim( localUtil.ntoc( A13832CantProduc, (byte)(12), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", GXutil.rtrim( A874RecPrdFind));
      httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", GXutil.rtrim( A873RecPrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A238CanRes", GXutil.ltrim( localUtil.ntoc( A238CanRes, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2804RecLinMaq", GXutil.ltrim( localUtil.ntoc( Z2804RecLinMaq, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1273RecLinPro", GXutil.ltrim( localUtil.ntoc( Z1273RecLinPro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z811RecLin", GXutil.ltrim( localUtil.ntoc( Z811RecLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z872RecPrdNum", GXutil.rtrim( Z872RecPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z875RecPrdDsc", GXutil.rtrim( Z875RecPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z686PrdCant", GXutil.ltrim( localUtil.ntoc( Z686PrdCant, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1797PrdCanAny", GXutil.ltrim( localUtil.ntoc( Z1797PrdCanAny, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z683PrdCanFin", GXutil.ltrim( localUtil.ntoc( Z683PrdCanFin, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z490ForPrdUMe", GXutil.ltrim( localUtil.ntoc( Z490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2394RecForNro", GXutil.ltrim( localUtil.ntoc( Z2394RecForNro, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3274RecPrdTnq", GXutil.ltrim( localUtil.ntoc( Z3274RecPrdTnq, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4024RecMar", GXutil.ltrim( localUtil.ntoc( Z4024RecMar, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5725RecLote", GXutil.rtrim( Z5725RecLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z431FacCon", GXutil.ltrim( localUtil.ntoc( Z431FacCon, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3938RecCanEns", GXutil.ltrim( localUtil.ntoc( Z3938RecCanEns, (byte)(10), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5422RecSalMP", GXutil.ltrim( localUtil.ntoc( Z5422RecSalMP, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5467RecSalVol", GXutil.ltrim( localUtil.ntoc( Z5467RecSalVol, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5527RecLinRea", GXutil.rtrim( Z5527RecLinRea));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8934RecPes", GXutil.ltrim( localUtil.ntoc( Z8934RecPes, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8937RecAcc", GXutil.rtrim( Z8937RecAcc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9813FacCon1", GXutil.ltrim( localUtil.ntoc( Z9813FacCon1, (byte)(11), (byte)(5), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3804RecFecMov", localUtil.format(Z3804RecFecMov, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3805RecAnyTie", GXutil.ltrim( localUtil.ntoc( Z3805RecAnyTie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3806RecUltAny", GXutil.ltrim( localUtil.ntoc( Z3806RecUltAny, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3807RecPorAny", GXutil.ltrim( localUtil.ntoc( Z3807RecPorAny, (byte)(6), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4900PrdCanMac", GXutil.ltrim( localUtil.ntoc( Z4900PrdCanMac, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11708RecProv", GXutil.ltrim( localUtil.ntoc( Z11708RecProv, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4576RecLinUsr", GXutil.rtrim( Z4576RecLinUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4577RecPesFec", localUtil.ttoc( Z4577RecPesFec, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12641RecPrdDc2", GXutil.rtrim( Z12641RecPrdDc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12710PrdCantOrg", GXutil.ltrim( localUtil.ntoc( Z12710PrdCantOrg, (byte)(11), (byte)(3), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12717RecFabId", GXutil.ltrim( localUtil.ntoc( Z12717RecFabId, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13938RecLoteFch", localUtil.format(Z13938RecLoteFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13937RecLotAlm", GXutil.ltrim( localUtil.ntoc( Z13937RecLotAlm, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14055RecManAut", GXutil.rtrim( Z14055RecManAut));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z707PrdFacCon", GXutil.ltrim( localUtil.ntoc( Z707PrdFacCon, (byte)(7), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z704PrdExiAlm", GXutil.ltrim( localUtil.ntoc( Z704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z685PrdCanRes", GXutil.ltrim( localUtil.ntoc( Z685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z705PrdExiCC", GXutil.ltrim( localUtil.ntoc( Z705PrdExiCC, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z706PrdExiCCP", GXutil.ltrim( localUtil.ntoc( Z706PrdExiCCP, (byte)(8), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5418PrdSalM", GXutil.rtrim( Z5418PrdSalM));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10881PrdLote", GXutil.rtrim( Z10881PrdLote));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13232PrdRGB", GXutil.ltrim( localUtil.ntoc( Z13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z795PrvNum", GXutil.ltrim( localUtil.ntoc( Z795PrvNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z856ValCod", GXutil.ltrim( localUtil.ntoc( Z856ValCod, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13832CantProduc", GXutil.ltrim( localUtil.ntoc( Z13832CantProduc, (byte)(12), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z488ForPrdDsc", GXutil.rtrim( Z488ForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z874RecPrdFind", GXutil.rtrim( Z874RecPrdFind));
      app.GxWebStd.gx_hidden_field( httpContext, "Z873RecPrdNom", GXutil.rtrim( Z873RecPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z238CanRes", GXutil.ltrim( localUtil.ntoc( Z238CanRes, (byte)(8), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Recprdnum( )
   {
      n874RecPrdFind = false ;
      n719PrdNum = false ;
      n795PrvNum = false ;
      n704PrdExiAlm = false ;
      n856ValCod = false ;
      n705PrdExiCC = false ;
      n706PrdExiCCP = false ;
      n707PrdFacCon = false ;
      n685PrdCanRes = false ;
      n5418PrdSalM = false ;
      n10881PrdLote = false ;
      n13232PrdRGB = false ;
      n873RecPrdNom = false ;
      /* Using cursor T01QE28 */
      pr_default.execute(22, new Object[] {A396EmprCod, A872RecPrdNum});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A874RecPrdFind = T01QE28_A874RecPrdFind[0] ;
         n874RecPrdFind = T01QE28_n874RecPrdFind[0] ;
      }
      else
      {
         A874RecPrdFind = "xxxxxx" ;
         n874RecPrdFind = false ;
      }
      pr_default.close(22);
      /* Using cursor T01QE33 */
      pr_default.execute(25, new Object[] {Boolean.valueOf(n874RecPrdFind), A874RecPrdFind, A872RecPrdNum, A396EmprCod, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(25) != 101) )
      {
         A873RecPrdNom = T01QE33_A873RecPrdNom[0] ;
         n873RecPrdNom = T01QE33_n873RecPrdNom[0] ;
      }
      else
      {
         A873RecPrdNom = "" ;
         n873RecPrdNom = false ;
      }
      pr_default.close(25);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A874RecPrdFind", GXutil.rtrim( A874RecPrdFind));
      httpContext.ajax_rsp_assign_attri("", false, "A873RecPrdNom", GXutil.rtrim( A873RecPrdNom));
   }

   public void valid_Forprdume( )
   {
      n490ForPrdUMe = false ;
      n488ForPrdDsc = false ;
      /* Using cursor T01QE29 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n490ForPrdUMe), Byte.valueOf(A490ForPrdUMe)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A490ForPrdUMe) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNMEPR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FORPRDUME");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A488ForPrdDsc = T01QE29_A488ForPrdDsc[0] ;
      n488ForPrdDsc = T01QE29_n488ForPrdDsc[0] ;
      pr_default.close(23);
      if ( ! ( ( A490ForPrdUMe == 0 ) || ( A490ForPrdUMe == 1 ) || ( A490ForPrdUMe == 2 ) || ( A490ForPrdUMe == 3 ) || (0==A490ForPrdUMe) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Unidad Medida", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "FORPRDUME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtForPrdUMe_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A488ForPrdDsc", GXutil.rtrim( A488ForPrdDsc));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A3938RecCanEns',fld:'RECCANENS',pic:'ZZZ9.99999'},{av:'A5422RecSalMP',fld:'RECSALMP',pic:'ZZ9'},{av:'A5467RecSalVol',fld:'RECSALVOL',pic:'ZZZZ9'},{av:'A5527RecLinRea',fld:'RECLINREA',pic:''},{av:'A8934RecPes',fld:'RECPES',pic:'9'},{av:'A8937RecAcc',fld:'RECACC',pic:''},{av:'A9813FacCon1',fld:'FACCON1',pic:'ZZZZ9.99999'},{av:'A3804RecFecMov',fld:'RECFECMOV',pic:''},{av:'A3805RecAnyTie',fld:'RECANYTIE',pic:'ZZZ9'},{av:'A3806RecUltAny',fld:'RECULTANY',pic:'ZZZZZZ9.999'},{av:'A3807RecPorAny',fld:'RECPORANY',pic:'ZZ9.99'},{av:'A4900PrdCanMac',fld:'PRDCANMAC',pic:'ZZZZZZ9.999'},{av:'A11708RecProv',fld:'RECPROV',pic:'ZZZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A4577RecPesFec',fld:'RECPESFEC',pic:'99/99/99 99:99'},{av:'A12641RecPrdDc2',fld:'RECPRDDC2',pic:''},{av:'A12710PrdCantOrg',fld:'PRDCANTORG',pic:'ZZZZZZ9.999'},{av:'A12717RecFabId',fld:'RECFABID',pic:'ZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A13938RecLoteFch',fld:'RECLOTEFCH',pic:''},{av:'A13937RecLotAlm',fld:'RECLOTALM',pic:'ZZZ9'},{av:'A14055RecManAut',fld:'RECMANAUT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A706PrdExiCCP',fld:'PRDEXICCP',pic:'ZZZZ9.99'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A706PrdExiCCP',fld:'PRDEXICCP',pic:'ZZZZ9.99'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_RECLINMAQ","{handler:'valid_Reclinmaq',iparms:[]");
      setEventMetadata("VALID_RECLINMAQ",",oparms:[]}");
      setEventMetadata("VALID_RECLINPRO","{handler:'valid_Reclinpro',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'}]");
      setEventMetadata("VALID_RECLINPRO",",oparms:[]}");
      setEventMetadata("VALID_RECLIN","{handler:'valid_Reclin',iparms:[{av:'A14055RecManAut',fld:'RECMANAUT',pic:''},{av:'A13937RecLotAlm',fld:'RECLOTALM',pic:'ZZZ9'},{av:'A13938RecLoteFch',fld:'RECLOTEFCH',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A12717RecFabId',fld:'RECFABID',pic:'ZZZZZ9'},{av:'A12710PrdCantOrg',fld:'PRDCANTORG',pic:'ZZZZZZ9.999'},{av:'A12641RecPrdDc2',fld:'RECPRDDC2',pic:''},{av:'A4577RecPesFec',fld:'RECPESFEC',pic:'99/99/99 99:99'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A11708RecProv',fld:'RECPROV',pic:'ZZZZZ9'},{av:'A4900PrdCanMac',fld:'PRDCANMAC',pic:'ZZZZZZ9.999'},{av:'A3807RecPorAny',fld:'RECPORANY',pic:'ZZ9.99'},{av:'A3806RecUltAny',fld:'RECULTANY',pic:'ZZZZZZ9.999'},{av:'A3805RecAnyTie',fld:'RECANYTIE',pic:'ZZZ9'},{av:'A3804RecFecMov',fld:'RECFECMOV',pic:''},{av:'A9813FacCon1',fld:'FACCON1',pic:'ZZZZ9.99999'},{av:'A8937RecAcc',fld:'RECACC',pic:''},{av:'A8934RecPes',fld:'RECPES',pic:'9'},{av:'A5527RecLinRea',fld:'RECLINREA',pic:''},{av:'A5467RecSalVol',fld:'RECSALVOL',pic:'ZZZZ9'},{av:'A5422RecSalMP',fld:'RECSALMP',pic:'ZZ9'},{av:'A3938RecCanEns',fld:'RECCANENS',pic:'ZZZ9.99999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_RECLIN",",oparms:[{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A875RecPrdDsc',fld:'RECPRDDSC',pic:''},{av:'A686PrdCant',fld:'PRDCANT',pic:'ZZZZZZ9.999'},{av:'A1797PrdCanAny',fld:'PRDCANANY',pic:'ZZZZZZ9.999'},{av:'A683PrdCanFin',fld:'PRDCANFIN',pic:'ZZZZZZ9.999'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A2394RecForNro',fld:'RECFORNRO',pic:'Z9'},{av:'A3274RecPrdTnq',fld:'RECPRDTNQ',pic:'Z9'},{av:'A4024RecMar',fld:'RECMAR',pic:'9'},{av:'A5725RecLote',fld:'RECLOTE',pic:''},{av:'A431FacCon',fld:'FACCON',pic:'ZZZZ9.99999'},{av:'A3938RecCanEns',fld:'RECCANENS',pic:'ZZZ9.99999'},{av:'A5422RecSalMP',fld:'RECSALMP',pic:'ZZ9'},{av:'A5467RecSalVol',fld:'RECSALVOL',pic:'ZZZZ9'},{av:'A5527RecLinRea',fld:'RECLINREA',pic:''},{av:'A8934RecPes',fld:'RECPES',pic:'9'},{av:'A8937RecAcc',fld:'RECACC',pic:''},{av:'A9813FacCon1',fld:'FACCON1',pic:'ZZZZ9.99999'},{av:'A3804RecFecMov',fld:'RECFECMOV',pic:''},{av:'A3805RecAnyTie',fld:'RECANYTIE',pic:'ZZZ9'},{av:'A3806RecUltAny',fld:'RECULTANY',pic:'ZZZZZZ9.999'},{av:'A3807RecPorAny',fld:'RECPORANY',pic:'ZZ9.99'},{av:'A4900PrdCanMac',fld:'PRDCANMAC',pic:'ZZZZZZ9.999'},{av:'A11708RecProv',fld:'RECPROV',pic:'ZZZZZ9'},{av:'A4576RecLinUsr',fld:'RECLINUSR',pic:'@!'},{av:'A4577RecPesFec',fld:'RECPESFEC',pic:'99/99/99 99:99'},{av:'A12641RecPrdDc2',fld:'RECPRDDC2',pic:''},{av:'A12710PrdCantOrg',fld:'PRDCANTORG',pic:'ZZZZZZ9.999'},{av:'A12717RecFabId',fld:'RECFABID',pic:'ZZZZZ9'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A13938RecLoteFch',fld:'RECLOTEFCH',pic:''},{av:'A13937RecLotAlm',fld:'RECLOTALM',pic:'ZZZ9'},{av:'A14055RecManAut',fld:'RECMANAUT',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A706PrdExiCCP',fld:'PRDEXICCP',pic:'ZZZZ9.99'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A13832CantProduc',fld:'CANTPRODUC',pic:'ZZZZZZZZ9.99'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''},{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'A873RecPrdNom',fld:'RECPRDNOM',pic:''},{av:'A238CanRes',fld:'CANRES',pic:'ZZZZ9.99'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z2804RecLinMaq'},{av:'Z1273RecLinPro'},{av:'Z811RecLin'},{av:'Z872RecPrdNum'},{av:'Z875RecPrdDsc'},{av:'Z686PrdCant'},{av:'Z1797PrdCanAny'},{av:'Z683PrdCanFin'},{av:'Z490ForPrdUMe'},{av:'Z2394RecForNro'},{av:'Z3274RecPrdTnq'},{av:'Z4024RecMar'},{av:'Z5725RecLote'},{av:'Z431FacCon'},{av:'Z3938RecCanEns'},{av:'Z5422RecSalMP'},{av:'Z5467RecSalVol'},{av:'Z5527RecLinRea'},{av:'Z8934RecPes'},{av:'Z8937RecAcc'},{av:'Z9813FacCon1'},{av:'Z3804RecFecMov'},{av:'Z3805RecAnyTie'},{av:'Z3806RecUltAny'},{av:'Z3807RecPorAny'},{av:'Z4900PrdCanMac'},{av:'Z11708RecProv'},{av:'Z4576RecLinUsr'},{av:'Z4577RecPesFec'},{av:'Z12641RecPrdDc2'},{av:'Z12710PrdCantOrg'},{av:'Z12717RecFabId'},{av:'Z719PrdNum'},{av:'Z13938RecLoteFch'},{av:'Z13937RecLotAlm'},{av:'Z14055RecManAut'},{av:'Z407EmprNom'},{av:'Z707PrdFacCon'},{av:'Z704PrdExiAlm'},{av:'Z685PrdCanRes'},{av:'Z705PrdExiCC'},{av:'Z706PrdExiCCP'},{av:'Z5418PrdSalM'},{av:'Z10881PrdLote'},{av:'Z13232PrdRGB'},{av:'Z795PrvNum'},{av:'Z856ValCod'},{av:'Z13832CantProduc'},{av:'Z488ForPrdDsc'},{av:'Z874RecPrdFind'},{av:'Z873RecPrdNom'},{av:'Z238CanRes'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_RECPRDNUM","{handler:'valid_Recprdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A872RecPrdNum',fld:'RECPRDNUM',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A1273RecLinPro',fld:'RECLINPRO',pic:'Z9'},{av:'A811RecLin',fld:'RECLIN',pic:'ZZZ9'},{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A856ValCod',fld:'VALCOD',pic:'9'},{av:'A705PrdExiCC',fld:'PRDEXICC',pic:'ZZZZZZ9.9999'},{av:'A706PrdExiCCP',fld:'PRDEXICCP',pic:'ZZZZ9.99'},{av:'A707PrdFacCon',fld:'PRDFACCON',pic:'Z9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A5418PrdSalM',fld:'PRDSALM',pic:''},{av:'A10881PrdLote',fld:'PRDLOTE',pic:''},{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'},{av:'A873RecPrdNom',fld:'RECPRDNOM',pic:''}]");
      setEventMetadata("VALID_RECPRDNUM",",oparms:[{av:'A874RecPrdFind',fld:'RECPRDFIND',pic:''},{av:'A873RecPrdNom',fld:'RECPRDNOM',pic:''}]}");
      setEventMetadata("VALID_PRDFACCON","{handler:'valid_Prdfaccon',iparms:[]");
      setEventMetadata("VALID_PRDFACCON",",oparms:[]}");
      setEventMetadata("VALID_PRDCANT","{handler:'valid_Prdcant',iparms:[]");
      setEventMetadata("VALID_PRDCANT",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A490ForPrdUMe',fld:'FORPRDUME',pic:'9'},{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[{av:'A488ForPrdDsc',fld:'FORPRDDSC',pic:''}]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDCANRES","{handler:'valid_Prdcanres',iparms:[]");
      setEventMetadata("VALID_PRDCANRES",",oparms:[]}");
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
      pr_default.close(21);
      pr_default.close(24);
      pr_default.close(23);
      pr_default.close(27);
      pr_default.close(25);
      pr_default.close(22);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z130BarCodPar = "" ;
      Z872RecPrdNum = "" ;
      Z875RecPrdDsc = "" ;
      Z686PrdCant = DecimalUtil.ZERO ;
      Z1797PrdCanAny = DecimalUtil.ZERO ;
      Z683PrdCanFin = DecimalUtil.ZERO ;
      Z5725RecLote = "" ;
      Z431FacCon = DecimalUtil.ZERO ;
      Z3938RecCanEns = DecimalUtil.ZERO ;
      Z5527RecLinRea = "" ;
      Z8937RecAcc = "" ;
      Z9813FacCon1 = DecimalUtil.ZERO ;
      Z3804RecFecMov = GXutil.nullDate() ;
      Z3806RecUltAny = DecimalUtil.ZERO ;
      Z3807RecPorAny = DecimalUtil.ZERO ;
      Z4900PrdCanMac = DecimalUtil.ZERO ;
      Z4576RecLinUsr = "" ;
      Z4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      Z12641RecPrdDc2 = "" ;
      Z12710PrdCantOrg = DecimalUtil.ZERO ;
      Z13938RecLoteFch = GXutil.nullDate() ;
      Z14055RecManAut = "" ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A872RecPrdNum = "" ;
      A130BarCodPar = "" ;
      A874RecPrdFind = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A705PrdExiCC = DecimalUtil.ZERO ;
      A706PrdExiCCP = DecimalUtil.ZERO ;
      A707PrdFacCon = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A5418PrdSalM = "" ;
      A10881PrdLote = "" ;
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
      A875RecPrdDsc = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      A1797PrdCanAny = DecimalUtil.ZERO ;
      A683PrdCanFin = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A5725RecLote = "" ;
      A431FacCon = DecimalUtil.ZERO ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A3938RecCanEns = DecimalUtil.ZERO ;
      A5527RecLinRea = "" ;
      A8937RecAcc = "" ;
      A9813FacCon1 = DecimalUtil.ZERO ;
      A3804RecFecMov = GXutil.nullDate() ;
      A3806RecUltAny = DecimalUtil.ZERO ;
      A3807RecPorAny = DecimalUtil.ZERO ;
      A4900PrdCanMac = DecimalUtil.ZERO ;
      A4576RecLinUsr = "" ;
      A4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      A12641RecPrdDc2 = "" ;
      A12710PrdCantOrg = DecimalUtil.ZERO ;
      A13938RecLoteFch = GXutil.nullDate() ;
      A14055RecManAut = "" ;
      Gx_mode = "" ;
      A13832CantProduc = DecimalUtil.ZERO ;
      A238CanRes = DecimalUtil.ZERO ;
      A873RecPrdNom = "" ;
      A407EmprNom = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z707PrdFacCon = DecimalUtil.ZERO ;
      Z704PrdExiAlm = DecimalUtil.ZERO ;
      Z685PrdCanRes = DecimalUtil.ZERO ;
      Z705PrdExiCC = DecimalUtil.ZERO ;
      Z706PrdExiCCP = DecimalUtil.ZERO ;
      Z5418PrdSalM = "" ;
      Z10881PrdLote = "" ;
      Z874RecPrdFind = "" ;
      Z488ForPrdDsc = "" ;
      T01QE12_A811RecLin = new short[1] ;
      T01QE12_A872RecPrdNum = new String[] {""} ;
      T01QE12_A875RecPrdDsc = new String[] {""} ;
      T01QE12_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_n707PrdFacCon = new boolean[] {false} ;
      T01QE12_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A488ForPrdDsc = new String[] {""} ;
      T01QE12_n488ForPrdDsc = new boolean[] {false} ;
      T01QE12_A2394RecForNro = new byte[1] ;
      T01QE12_A3274RecPrdTnq = new byte[1] ;
      T01QE12_A4024RecMar = new byte[1] ;
      T01QE12_A5725RecLote = new String[] {""} ;
      T01QE12_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_n704PrdExiAlm = new boolean[] {false} ;
      T01QE12_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_n685PrdCanRes = new boolean[] {false} ;
      T01QE12_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_n705PrdExiCC = new boolean[] {false} ;
      T01QE12_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_n706PrdExiCCP = new boolean[] {false} ;
      T01QE12_A407EmprNom = new String[] {""} ;
      T01QE12_n407EmprNom = new boolean[] {false} ;
      T01QE12_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A5422RecSalMP = new short[1] ;
      T01QE12_A5418PrdSalM = new String[] {""} ;
      T01QE12_n5418PrdSalM = new boolean[] {false} ;
      T01QE12_A5467RecSalVol = new int[1] ;
      T01QE12_A5527RecLinRea = new String[] {""} ;
      T01QE12_A8934RecPes = new byte[1] ;
      T01QE12_A8937RecAcc = new String[] {""} ;
      T01QE12_A9813FacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE12_A3805RecAnyTie = new short[1] ;
      T01QE12_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A11708RecProv = new int[1] ;
      T01QE12_A10881PrdLote = new String[] {""} ;
      T01QE12_n10881PrdLote = new boolean[] {false} ;
      T01QE12_A4576RecLinUsr = new String[] {""} ;
      T01QE12_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE12_A12641RecPrdDc2 = new String[] {""} ;
      T01QE12_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE12_A12717RecFabId = new int[1] ;
      T01QE12_A13232PrdRGB = new long[1] ;
      T01QE12_n13232PrdRGB = new boolean[] {false} ;
      T01QE12_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE12_A13937RecLotAlm = new short[1] ;
      T01QE12_A14055RecManAut = new String[] {""} ;
      T01QE12_A396EmprCod = new String[] {""} ;
      T01QE12_A719PrdNum = new String[] {""} ;
      T01QE12_n719PrdNum = new boolean[] {false} ;
      T01QE12_A490ForPrdUMe = new byte[1] ;
      T01QE12_n490ForPrdUMe = new boolean[] {false} ;
      T01QE12_A129BarCod = new int[1] ;
      T01QE12_A132BarCodReo = new byte[1] ;
      T01QE12_A130BarCodPar = new String[] {""} ;
      T01QE12_A2804RecLinMaq = new short[1] ;
      T01QE12_A1273RecLinPro = new byte[1] ;
      T01QE12_A795PrvNum = new int[1] ;
      T01QE12_n795PrvNum = new boolean[] {false} ;
      T01QE12_A856ValCod = new byte[1] ;
      T01QE12_n856ValCod = new boolean[] {false} ;
      T01QE12_A874RecPrdFind = new String[] {""} ;
      T01QE12_n874RecPrdFind = new boolean[] {false} ;
      T01QE6_A873RecPrdNom = new String[] {""} ;
      T01QE6_n873RecPrdNom = new boolean[] {false} ;
      T01QE7_A407EmprNom = new String[] {""} ;
      T01QE7_n407EmprNom = new boolean[] {false} ;
      T01QE8_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE8_n707PrdFacCon = new boolean[] {false} ;
      T01QE8_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE8_n704PrdExiAlm = new boolean[] {false} ;
      T01QE8_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE8_n685PrdCanRes = new boolean[] {false} ;
      T01QE8_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE8_n705PrdExiCC = new boolean[] {false} ;
      T01QE8_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE8_n706PrdExiCCP = new boolean[] {false} ;
      T01QE8_A5418PrdSalM = new String[] {""} ;
      T01QE8_n5418PrdSalM = new boolean[] {false} ;
      T01QE8_A10881PrdLote = new String[] {""} ;
      T01QE8_n10881PrdLote = new boolean[] {false} ;
      T01QE8_A13232PrdRGB = new long[1] ;
      T01QE8_n13232PrdRGB = new boolean[] {false} ;
      T01QE8_A795PrvNum = new int[1] ;
      T01QE8_n795PrvNum = new boolean[] {false} ;
      T01QE8_A856ValCod = new byte[1] ;
      T01QE8_n856ValCod = new boolean[] {false} ;
      T01QE9_A488ForPrdDsc = new String[] {""} ;
      T01QE9_n488ForPrdDsc = new boolean[] {false} ;
      T01QE11_A874RecPrdFind = new String[] {""} ;
      T01QE11_n874RecPrdFind = new boolean[] {false} ;
      T01QE10_A396EmprCod = new String[] {""} ;
      T01QE13_A407EmprNom = new String[] {""} ;
      T01QE13_n407EmprNom = new boolean[] {false} ;
      T01QE14_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE14_n707PrdFacCon = new boolean[] {false} ;
      T01QE14_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE14_n704PrdExiAlm = new boolean[] {false} ;
      T01QE14_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE14_n685PrdCanRes = new boolean[] {false} ;
      T01QE14_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE14_n705PrdExiCC = new boolean[] {false} ;
      T01QE14_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE14_n706PrdExiCCP = new boolean[] {false} ;
      T01QE14_A5418PrdSalM = new String[] {""} ;
      T01QE14_n5418PrdSalM = new boolean[] {false} ;
      T01QE14_A10881PrdLote = new String[] {""} ;
      T01QE14_n10881PrdLote = new boolean[] {false} ;
      T01QE14_A13232PrdRGB = new long[1] ;
      T01QE14_n13232PrdRGB = new boolean[] {false} ;
      T01QE14_A795PrvNum = new int[1] ;
      T01QE14_n795PrvNum = new boolean[] {false} ;
      T01QE14_A856ValCod = new byte[1] ;
      T01QE14_n856ValCod = new boolean[] {false} ;
      T01QE15_A488ForPrdDsc = new String[] {""} ;
      T01QE15_n488ForPrdDsc = new boolean[] {false} ;
      T01QE16_A874RecPrdFind = new String[] {""} ;
      T01QE16_n874RecPrdFind = new boolean[] {false} ;
      T01QE17_A396EmprCod = new String[] {""} ;
      T01QE20_A873RecPrdNom = new String[] {""} ;
      T01QE20_n873RecPrdNom = new boolean[] {false} ;
      T01QE21_A396EmprCod = new String[] {""} ;
      T01QE21_A129BarCod = new int[1] ;
      T01QE21_A132BarCodReo = new byte[1] ;
      T01QE21_A130BarCodPar = new String[] {""} ;
      T01QE21_A2804RecLinMaq = new short[1] ;
      T01QE21_A1273RecLinPro = new byte[1] ;
      T01QE21_A811RecLin = new short[1] ;
      T01QE3_A811RecLin = new short[1] ;
      T01QE3_A872RecPrdNum = new String[] {""} ;
      T01QE3_A875RecPrdDsc = new String[] {""} ;
      T01QE3_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A2394RecForNro = new byte[1] ;
      T01QE3_A3274RecPrdTnq = new byte[1] ;
      T01QE3_A4024RecMar = new byte[1] ;
      T01QE3_A5725RecLote = new String[] {""} ;
      T01QE3_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A5422RecSalMP = new short[1] ;
      T01QE3_A5467RecSalVol = new int[1] ;
      T01QE3_A5527RecLinRea = new String[] {""} ;
      T01QE3_A8934RecPes = new byte[1] ;
      T01QE3_A8937RecAcc = new String[] {""} ;
      T01QE3_A9813FacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE3_A3805RecAnyTie = new short[1] ;
      T01QE3_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A11708RecProv = new int[1] ;
      T01QE3_A4576RecLinUsr = new String[] {""} ;
      T01QE3_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE3_A12641RecPrdDc2 = new String[] {""} ;
      T01QE3_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE3_A12717RecFabId = new int[1] ;
      T01QE3_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE3_A13937RecLotAlm = new short[1] ;
      T01QE3_A14055RecManAut = new String[] {""} ;
      T01QE3_A396EmprCod = new String[] {""} ;
      T01QE3_A719PrdNum = new String[] {""} ;
      T01QE3_n719PrdNum = new boolean[] {false} ;
      T01QE3_A490ForPrdUMe = new byte[1] ;
      T01QE3_n490ForPrdUMe = new boolean[] {false} ;
      T01QE3_A129BarCod = new int[1] ;
      T01QE3_A132BarCodReo = new byte[1] ;
      T01QE3_A130BarCodPar = new String[] {""} ;
      T01QE3_A2804RecLinMaq = new short[1] ;
      T01QE3_A1273RecLinPro = new byte[1] ;
      sMode410 = "" ;
      T01QE22_A396EmprCod = new String[] {""} ;
      T01QE22_A129BarCod = new int[1] ;
      T01QE22_A132BarCodReo = new byte[1] ;
      T01QE22_A130BarCodPar = new String[] {""} ;
      T01QE22_A2804RecLinMaq = new short[1] ;
      T01QE22_A1273RecLinPro = new byte[1] ;
      T01QE22_A811RecLin = new short[1] ;
      T01QE23_A396EmprCod = new String[] {""} ;
      T01QE23_A129BarCod = new int[1] ;
      T01QE23_A132BarCodReo = new byte[1] ;
      T01QE23_A130BarCodPar = new String[] {""} ;
      T01QE23_A2804RecLinMaq = new short[1] ;
      T01QE23_A1273RecLinPro = new byte[1] ;
      T01QE23_A811RecLin = new short[1] ;
      T01QE2_A811RecLin = new short[1] ;
      T01QE2_A872RecPrdNum = new String[] {""} ;
      T01QE2_A875RecPrdDsc = new String[] {""} ;
      T01QE2_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A1797PrdCanAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A683PrdCanFin = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A2394RecForNro = new byte[1] ;
      T01QE2_A3274RecPrdTnq = new byte[1] ;
      T01QE2_A4024RecMar = new byte[1] ;
      T01QE2_A5725RecLote = new String[] {""} ;
      T01QE2_A431FacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A3938RecCanEns = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A5422RecSalMP = new short[1] ;
      T01QE2_A5467RecSalVol = new int[1] ;
      T01QE2_A5527RecLinRea = new String[] {""} ;
      T01QE2_A8934RecPes = new byte[1] ;
      T01QE2_A8937RecAcc = new String[] {""} ;
      T01QE2_A9813FacCon1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A3804RecFecMov = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE2_A3805RecAnyTie = new short[1] ;
      T01QE2_A3806RecUltAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A3807RecPorAny = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A4900PrdCanMac = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A11708RecProv = new int[1] ;
      T01QE2_A4576RecLinUsr = new String[] {""} ;
      T01QE2_A4577RecPesFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE2_A12641RecPrdDc2 = new String[] {""} ;
      T01QE2_A12710PrdCantOrg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE2_A12717RecFabId = new int[1] ;
      T01QE2_A13938RecLoteFch = new java.util.Date[] {GXutil.nullDate()} ;
      T01QE2_A13937RecLotAlm = new short[1] ;
      T01QE2_A14055RecManAut = new String[] {""} ;
      T01QE2_A396EmprCod = new String[] {""} ;
      T01QE2_A719PrdNum = new String[] {""} ;
      T01QE2_n719PrdNum = new boolean[] {false} ;
      T01QE2_A490ForPrdUMe = new byte[1] ;
      T01QE2_n490ForPrdUMe = new boolean[] {false} ;
      T01QE2_A129BarCod = new int[1] ;
      T01QE2_A132BarCodReo = new byte[1] ;
      T01QE2_A130BarCodPar = new String[] {""} ;
      T01QE2_A2804RecLinMaq = new short[1] ;
      T01QE2_A1273RecLinPro = new byte[1] ;
      T01QE27_A407EmprNom = new String[] {""} ;
      T01QE27_n407EmprNom = new boolean[] {false} ;
      T01QE28_A874RecPrdFind = new String[] {""} ;
      T01QE28_n874RecPrdFind = new boolean[] {false} ;
      T01QE29_A488ForPrdDsc = new String[] {""} ;
      T01QE29_n488ForPrdDsc = new boolean[] {false} ;
      T01QE30_A707PrdFacCon = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE30_n707PrdFacCon = new boolean[] {false} ;
      T01QE30_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE30_n704PrdExiAlm = new boolean[] {false} ;
      T01QE30_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE30_n685PrdCanRes = new boolean[] {false} ;
      T01QE30_A705PrdExiCC = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE30_n705PrdExiCC = new boolean[] {false} ;
      T01QE30_A706PrdExiCCP = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QE30_n706PrdExiCCP = new boolean[] {false} ;
      T01QE30_A5418PrdSalM = new String[] {""} ;
      T01QE30_n5418PrdSalM = new boolean[] {false} ;
      T01QE30_A10881PrdLote = new String[] {""} ;
      T01QE30_n10881PrdLote = new boolean[] {false} ;
      T01QE30_A13232PrdRGB = new long[1] ;
      T01QE30_n13232PrdRGB = new boolean[] {false} ;
      T01QE30_A795PrvNum = new int[1] ;
      T01QE30_n795PrvNum = new boolean[] {false} ;
      T01QE30_A856ValCod = new byte[1] ;
      T01QE30_n856ValCod = new boolean[] {false} ;
      T01QE33_A873RecPrdNom = new String[] {""} ;
      T01QE33_n873RecPrdNom = new boolean[] {false} ;
      T01QE34_A396EmprCod = new String[] {""} ;
      T01QE34_A129BarCod = new int[1] ;
      T01QE34_A132BarCodReo = new byte[1] ;
      T01QE34_A130BarCodPar = new String[] {""} ;
      T01QE34_A2804RecLinMaq = new short[1] ;
      T01QE34_A1273RecLinPro = new byte[1] ;
      T01QE34_A811RecLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QE35_A396EmprCod = new String[] {""} ;
      Z13832CantProduc = DecimalUtil.ZERO ;
      Z873RecPrdNom = "" ;
      Z238CanRes = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ130BarCodPar = "" ;
      ZZ872RecPrdNum = "" ;
      ZZ875RecPrdDsc = "" ;
      ZZ686PrdCant = DecimalUtil.ZERO ;
      ZZ1797PrdCanAny = DecimalUtil.ZERO ;
      ZZ683PrdCanFin = DecimalUtil.ZERO ;
      ZZ5725RecLote = "" ;
      ZZ431FacCon = DecimalUtil.ZERO ;
      ZZ3938RecCanEns = DecimalUtil.ZERO ;
      ZZ5527RecLinRea = "" ;
      ZZ8937RecAcc = "" ;
      ZZ9813FacCon1 = DecimalUtil.ZERO ;
      ZZ3804RecFecMov = GXutil.nullDate() ;
      ZZ3806RecUltAny = DecimalUtil.ZERO ;
      ZZ3807RecPorAny = DecimalUtil.ZERO ;
      ZZ4900PrdCanMac = DecimalUtil.ZERO ;
      ZZ4576RecLinUsr = "" ;
      ZZ4577RecPesFec = GXutil.resetTime( GXutil.nullDate() );
      ZZ12641RecPrdDc2 = "" ;
      ZZ12710PrdCantOrg = DecimalUtil.ZERO ;
      ZZ719PrdNum = "" ;
      ZZ13938RecLoteFch = GXutil.nullDate() ;
      ZZ14055RecManAut = "" ;
      ZZ407EmprNom = "" ;
      ZZ707PrdFacCon = DecimalUtil.ZERO ;
      ZZ704PrdExiAlm = DecimalUtil.ZERO ;
      ZZ685PrdCanRes = DecimalUtil.ZERO ;
      ZZ705PrdExiCC = DecimalUtil.ZERO ;
      ZZ706PrdExiCCP = DecimalUtil.ZERO ;
      ZZ5418PrdSalM = "" ;
      ZZ10881PrdLote = "" ;
      ZZ13832CantProduc = DecimalUtil.ZERO ;
      ZZ488ForPrdDsc = "" ;
      ZZ874RecPrdFind = "" ;
      ZZ873RecPrdNom = "" ;
      ZZ238CanRes = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.lrecet__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lrecet__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lrecet__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lrecet__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lrecet__default(),
         new Object[] {
             new Object[] {
            T01QE2_A811RecLin, T01QE2_A872RecPrdNum, T01QE2_A875RecPrdDsc, T01QE2_A686PrdCant, T01QE2_A1797PrdCanAny, T01QE2_A683PrdCanFin, T01QE2_A2394RecForNro, T01QE2_A3274RecPrdTnq, T01QE2_A4024RecMar, T01QE2_A5725RecLote,
            T01QE2_A431FacCon, T01QE2_A3938RecCanEns, T01QE2_A5422RecSalMP, T01QE2_A5467RecSalVol, T01QE2_A5527RecLinRea, T01QE2_A8934RecPes, T01QE2_A8937RecAcc, T01QE2_A9813FacCon1, T01QE2_A3804RecFecMov, T01QE2_A3805RecAnyTie,
            T01QE2_A3806RecUltAny, T01QE2_A3807RecPorAny, T01QE2_A4900PrdCanMac, T01QE2_A11708RecProv, T01QE2_A4576RecLinUsr, T01QE2_A4577RecPesFec, T01QE2_A12641RecPrdDc2, T01QE2_A12710PrdCantOrg, T01QE2_A12717RecFabId, T01QE2_A13938RecLoteFch,
            T01QE2_A13937RecLotAlm, T01QE2_A14055RecManAut, T01QE2_A396EmprCod, T01QE2_A719PrdNum, T01QE2_n719PrdNum, T01QE2_A490ForPrdUMe, T01QE2_n490ForPrdUMe, T01QE2_A129BarCod, T01QE2_A132BarCodReo, T01QE2_A130BarCodPar,
            T01QE2_A2804RecLinMaq, T01QE2_A1273RecLinPro
            }
            , new Object[] {
            T01QE3_A811RecLin, T01QE3_A872RecPrdNum, T01QE3_A875RecPrdDsc, T01QE3_A686PrdCant, T01QE3_A1797PrdCanAny, T01QE3_A683PrdCanFin, T01QE3_A2394RecForNro, T01QE3_A3274RecPrdTnq, T01QE3_A4024RecMar, T01QE3_A5725RecLote,
            T01QE3_A431FacCon, T01QE3_A3938RecCanEns, T01QE3_A5422RecSalMP, T01QE3_A5467RecSalVol, T01QE3_A5527RecLinRea, T01QE3_A8934RecPes, T01QE3_A8937RecAcc, T01QE3_A9813FacCon1, T01QE3_A3804RecFecMov, T01QE3_A3805RecAnyTie,
            T01QE3_A3806RecUltAny, T01QE3_A3807RecPorAny, T01QE3_A4900PrdCanMac, T01QE3_A11708RecProv, T01QE3_A4576RecLinUsr, T01QE3_A4577RecPesFec, T01QE3_A12641RecPrdDc2, T01QE3_A12710PrdCantOrg, T01QE3_A12717RecFabId, T01QE3_A13938RecLoteFch,
            T01QE3_A13937RecLotAlm, T01QE3_A14055RecManAut, T01QE3_A396EmprCod, T01QE3_A719PrdNum, T01QE3_n719PrdNum, T01QE3_A490ForPrdUMe, T01QE3_n490ForPrdUMe, T01QE3_A129BarCod, T01QE3_A132BarCodReo, T01QE3_A130BarCodPar,
            T01QE3_A2804RecLinMaq, T01QE3_A1273RecLinPro
            }
            , new Object[] {
            T01QE6_A873RecPrdNom, T01QE6_n873RecPrdNom
            }
            , new Object[] {
            T01QE7_A407EmprNom, T01QE7_n407EmprNom
            }
            , new Object[] {
            T01QE8_A707PrdFacCon, T01QE8_A704PrdExiAlm, T01QE8_A685PrdCanRes, T01QE8_A705PrdExiCC, T01QE8_A706PrdExiCCP, T01QE8_A5418PrdSalM, T01QE8_A10881PrdLote, T01QE8_A13232PrdRGB, T01QE8_A795PrvNum, T01QE8_A856ValCod
            }
            , new Object[] {
            T01QE9_A488ForPrdDsc, T01QE9_n488ForPrdDsc
            }
            , new Object[] {
            T01QE10_A396EmprCod
            }
            , new Object[] {
            T01QE11_A874RecPrdFind, T01QE11_n874RecPrdFind
            }
            , new Object[] {
            T01QE12_A811RecLin, T01QE12_A872RecPrdNum, T01QE12_A875RecPrdDsc, T01QE12_A707PrdFacCon, T01QE12_A686PrdCant, T01QE12_A1797PrdCanAny, T01QE12_A683PrdCanFin, T01QE12_A488ForPrdDsc, T01QE12_n488ForPrdDsc, T01QE12_A2394RecForNro,
            T01QE12_A3274RecPrdTnq, T01QE12_A4024RecMar, T01QE12_A5725RecLote, T01QE12_A704PrdExiAlm, T01QE12_A685PrdCanRes, T01QE12_A431FacCon, T01QE12_A705PrdExiCC, T01QE12_A706PrdExiCCP, T01QE12_A407EmprNom, T01QE12_n407EmprNom,
            T01QE12_A3938RecCanEns, T01QE12_A5422RecSalMP, T01QE12_A5418PrdSalM, T01QE12_A5467RecSalVol, T01QE12_A5527RecLinRea, T01QE12_A8934RecPes, T01QE12_A8937RecAcc, T01QE12_A9813FacCon1, T01QE12_A3804RecFecMov, T01QE12_A3805RecAnyTie,
            T01QE12_A3806RecUltAny, T01QE12_A3807RecPorAny, T01QE12_A4900PrdCanMac, T01QE12_A11708RecProv, T01QE12_A10881PrdLote, T01QE12_A4576RecLinUsr, T01QE12_A4577RecPesFec, T01QE12_A12641RecPrdDc2, T01QE12_A12710PrdCantOrg, T01QE12_A12717RecFabId,
            T01QE12_A13232PrdRGB, T01QE12_A13938RecLoteFch, T01QE12_A13937RecLotAlm, T01QE12_A14055RecManAut, T01QE12_A396EmprCod, T01QE12_A719PrdNum, T01QE12_n719PrdNum, T01QE12_A490ForPrdUMe, T01QE12_n490ForPrdUMe, T01QE12_A129BarCod,
            T01QE12_A132BarCodReo, T01QE12_A130BarCodPar, T01QE12_A2804RecLinMaq, T01QE12_A1273RecLinPro, T01QE12_A795PrvNum, T01QE12_A856ValCod, T01QE12_A874RecPrdFind, T01QE12_n874RecPrdFind
            }
            , new Object[] {
            T01QE13_A407EmprNom, T01QE13_n407EmprNom
            }
            , new Object[] {
            T01QE14_A707PrdFacCon, T01QE14_A704PrdExiAlm, T01QE14_A685PrdCanRes, T01QE14_A705PrdExiCC, T01QE14_A706PrdExiCCP, T01QE14_A5418PrdSalM, T01QE14_A10881PrdLote, T01QE14_A13232PrdRGB, T01QE14_A795PrvNum, T01QE14_A856ValCod
            }
            , new Object[] {
            T01QE15_A488ForPrdDsc, T01QE15_n488ForPrdDsc
            }
            , new Object[] {
            T01QE16_A874RecPrdFind, T01QE16_n874RecPrdFind
            }
            , new Object[] {
            T01QE17_A396EmprCod
            }
            , new Object[] {
            T01QE20_A873RecPrdNom, T01QE20_n873RecPrdNom
            }
            , new Object[] {
            T01QE21_A396EmprCod, T01QE21_A129BarCod, T01QE21_A132BarCodReo, T01QE21_A130BarCodPar, T01QE21_A2804RecLinMaq, T01QE21_A1273RecLinPro, T01QE21_A811RecLin
            }
            , new Object[] {
            T01QE22_A396EmprCod, T01QE22_A129BarCod, T01QE22_A132BarCodReo, T01QE22_A130BarCodPar, T01QE22_A2804RecLinMaq, T01QE22_A1273RecLinPro, T01QE22_A811RecLin
            }
            , new Object[] {
            T01QE23_A396EmprCod, T01QE23_A129BarCod, T01QE23_A132BarCodReo, T01QE23_A130BarCodPar, T01QE23_A2804RecLinMaq, T01QE23_A1273RecLinPro, T01QE23_A811RecLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QE27_A407EmprNom, T01QE27_n407EmprNom
            }
            , new Object[] {
            T01QE28_A874RecPrdFind, T01QE28_n874RecPrdFind
            }
            , new Object[] {
            T01QE29_A488ForPrdDsc, T01QE29_n488ForPrdDsc
            }
            , new Object[] {
            T01QE30_A707PrdFacCon, T01QE30_A704PrdExiAlm, T01QE30_A685PrdCanRes, T01QE30_A705PrdExiCC, T01QE30_A706PrdExiCCP, T01QE30_A5418PrdSalM, T01QE30_A10881PrdLote, T01QE30_A13232PrdRGB, T01QE30_A795PrvNum, T01QE30_A856ValCod
            }
            , new Object[] {
            T01QE33_A873RecPrdNom, T01QE33_n873RecPrdNom
            }
            , new Object[] {
            T01QE34_A396EmprCod, T01QE34_A129BarCod, T01QE34_A132BarCodReo, T01QE34_A130BarCodPar, T01QE34_A2804RecLinMaq, T01QE34_A1273RecLinPro, T01QE34_A811RecLin
            }
            , new Object[] {
            T01QE35_A396EmprCod
            }
         }
      );
   }

   private byte Z132BarCodReo ;
   private byte Z1273RecLinPro ;
   private byte Z2394RecForNro ;
   private byte Z3274RecPrdTnq ;
   private byte Z4024RecMar ;
   private byte Z8934RecPes ;
   private byte Z490ForPrdUMe ;
   private byte GxWebError ;
   private byte A490ForPrdUMe ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte A856ValCod ;
   private byte nKeyPressed ;
   private byte A2394RecForNro ;
   private byte A3274RecPrdTnq ;
   private byte A4024RecMar ;
   private byte A8934RecPes ;
   private byte Z856ValCod ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte ZZ132BarCodReo ;
   private byte ZZ1273RecLinPro ;
   private byte ZZ490ForPrdUMe ;
   private byte ZZ2394RecForNro ;
   private byte ZZ3274RecPrdTnq ;
   private byte ZZ4024RecMar ;
   private byte ZZ8934RecPes ;
   private byte ZZ856ValCod ;
   private short Z2804RecLinMaq ;
   private short Z811RecLin ;
   private short Z5422RecSalMP ;
   private short Z3805RecAnyTie ;
   private short Z13937RecLotAlm ;
   private short A2804RecLinMaq ;
   private short A811RecLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5422RecSalMP ;
   private short A3805RecAnyTie ;
   private short A13937RecLotAlm ;
   private short RcdFound410 ;
   private short nIsDirty_410 ;
   private short ZZ2804RecLinMaq ;
   private short ZZ811RecLin ;
   private short ZZ5422RecSalMP ;
   private short ZZ3805RecAnyTie ;
   private short ZZ13937RecLotAlm ;
   private int Z129BarCod ;
   private int Z5467RecSalVol ;
   private int Z11708RecProv ;
   private int Z12717RecFabId ;
   private int A129BarCod ;
   private int A795PrvNum ;
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
   private int edtRecLinPro_Enabled ;
   private int edtRecLin_Enabled ;
   private int edtRecPrdNum_Enabled ;
   private int edtRecPrdDsc_Enabled ;
   private int edtPrdFacCon_Enabled ;
   private int edtPrdCant_Enabled ;
   private int edtPrdCanAny_Enabled ;
   private int edtPrdCanFin_Enabled ;
   private int edtForPrdUMe_Enabled ;
   private int edtForPrdDsc_Enabled ;
   private int edtRecForNro_Enabled ;
   private int edtRecPrdTnq_Enabled ;
   private int edtRecMar_Enabled ;
   private int edtRecLote_Enabled ;
   private int edtPrdExiAlm_Enabled ;
   private int edtPrdCanRes_Enabled ;
   private int edtFacCon_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int A5467RecSalVol ;
   private int A11708RecProv ;
   private int A12717RecFabId ;
   private int GX_JID ;
   private int Z795PrvNum ;
   private int idxLst ;
   private int ZZ129BarCod ;
   private int ZZ5467RecSalVol ;
   private int ZZ11708RecProv ;
   private int ZZ12717RecFabId ;
   private int ZZ795PrvNum ;
   private long A13232PrdRGB ;
   private long Z13232PrdRGB ;
   private long ZZ13232PrdRGB ;
   private java.math.BigDecimal Z686PrdCant ;
   private java.math.BigDecimal Z1797PrdCanAny ;
   private java.math.BigDecimal Z683PrdCanFin ;
   private java.math.BigDecimal Z431FacCon ;
   private java.math.BigDecimal Z3938RecCanEns ;
   private java.math.BigDecimal Z9813FacCon1 ;
   private java.math.BigDecimal Z3806RecUltAny ;
   private java.math.BigDecimal Z3807RecPorAny ;
   private java.math.BigDecimal Z4900PrdCanMac ;
   private java.math.BigDecimal Z12710PrdCantOrg ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A705PrdExiCC ;
   private java.math.BigDecimal A706PrdExiCCP ;
   private java.math.BigDecimal A707PrdFacCon ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A686PrdCant ;
   private java.math.BigDecimal A1797PrdCanAny ;
   private java.math.BigDecimal A683PrdCanFin ;
   private java.math.BigDecimal A431FacCon ;
   private java.math.BigDecimal A3938RecCanEns ;
   private java.math.BigDecimal A9813FacCon1 ;
   private java.math.BigDecimal A3806RecUltAny ;
   private java.math.BigDecimal A3807RecPorAny ;
   private java.math.BigDecimal A4900PrdCanMac ;
   private java.math.BigDecimal A12710PrdCantOrg ;
   private java.math.BigDecimal A13832CantProduc ;
   private java.math.BigDecimal A238CanRes ;
   private java.math.BigDecimal Z707PrdFacCon ;
   private java.math.BigDecimal Z704PrdExiAlm ;
   private java.math.BigDecimal Z685PrdCanRes ;
   private java.math.BigDecimal Z705PrdExiCC ;
   private java.math.BigDecimal Z706PrdExiCCP ;
   private java.math.BigDecimal Z13832CantProduc ;
   private java.math.BigDecimal Z238CanRes ;
   private java.math.BigDecimal ZZ686PrdCant ;
   private java.math.BigDecimal ZZ1797PrdCanAny ;
   private java.math.BigDecimal ZZ683PrdCanFin ;
   private java.math.BigDecimal ZZ431FacCon ;
   private java.math.BigDecimal ZZ3938RecCanEns ;
   private java.math.BigDecimal ZZ9813FacCon1 ;
   private java.math.BigDecimal ZZ3806RecUltAny ;
   private java.math.BigDecimal ZZ3807RecPorAny ;
   private java.math.BigDecimal ZZ4900PrdCanMac ;
   private java.math.BigDecimal ZZ12710PrdCantOrg ;
   private java.math.BigDecimal ZZ707PrdFacCon ;
   private java.math.BigDecimal ZZ704PrdExiAlm ;
   private java.math.BigDecimal ZZ685PrdCanRes ;
   private java.math.BigDecimal ZZ705PrdExiCC ;
   private java.math.BigDecimal ZZ706PrdExiCCP ;
   private java.math.BigDecimal ZZ13832CantProduc ;
   private java.math.BigDecimal ZZ238CanRes ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z130BarCodPar ;
   private String Z872RecPrdNum ;
   private String Z875RecPrdDsc ;
   private String Z5725RecLote ;
   private String Z5527RecLinRea ;
   private String Z8937RecAcc ;
   private String Z4576RecLinUsr ;
   private String Z12641RecPrdDc2 ;
   private String Z14055RecManAut ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A872RecPrdNum ;
   private String A130BarCodPar ;
   private String A874RecPrdFind ;
   private String A5418PrdSalM ;
   private String A10881PrdLote ;
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
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtRecLinMaq_Internalname ;
   private String edtRecLinMaq_Jsonclick ;
   private String edtRecLinPro_Internalname ;
   private String edtRecLinPro_Jsonclick ;
   private String edtRecLin_Internalname ;
   private String edtRecLin_Jsonclick ;
   private String edtRecPrdNum_Internalname ;
   private String edtRecPrdNum_Jsonclick ;
   private String edtRecPrdDsc_Internalname ;
   private String A875RecPrdDsc ;
   private String edtRecPrdDsc_Jsonclick ;
   private String edtPrdFacCon_Internalname ;
   private String edtPrdFacCon_Jsonclick ;
   private String edtPrdCant_Internalname ;
   private String edtPrdCant_Jsonclick ;
   private String edtPrdCanAny_Internalname ;
   private String edtPrdCanAny_Jsonclick ;
   private String edtPrdCanFin_Internalname ;
   private String edtPrdCanFin_Jsonclick ;
   private String edtForPrdUMe_Internalname ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtRecForNro_Internalname ;
   private String edtRecForNro_Jsonclick ;
   private String edtRecPrdTnq_Internalname ;
   private String edtRecPrdTnq_Jsonclick ;
   private String edtRecMar_Internalname ;
   private String edtRecMar_Jsonclick ;
   private String edtRecLote_Internalname ;
   private String A5725RecLote ;
   private String edtRecLote_Jsonclick ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtFacCon_Internalname ;
   private String edtFacCon_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String A5527RecLinRea ;
   private String A8937RecAcc ;
   private String A4576RecLinUsr ;
   private String A12641RecPrdDc2 ;
   private String A14055RecManAut ;
   private String Gx_mode ;
   private String A873RecPrdNom ;
   private String A407EmprNom ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z5418PrdSalM ;
   private String Z10881PrdLote ;
   private String Z874RecPrdFind ;
   private String Z488ForPrdDsc ;
   private String sMode410 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z873RecPrdNom ;
   private String ZZ396EmprCod ;
   private String ZZ130BarCodPar ;
   private String ZZ872RecPrdNum ;
   private String ZZ875RecPrdDsc ;
   private String ZZ5725RecLote ;
   private String ZZ5527RecLinRea ;
   private String ZZ8937RecAcc ;
   private String ZZ4576RecLinUsr ;
   private String ZZ12641RecPrdDc2 ;
   private String ZZ719PrdNum ;
   private String ZZ14055RecManAut ;
   private String ZZ407EmprNom ;
   private String ZZ5418PrdSalM ;
   private String ZZ10881PrdLote ;
   private String ZZ488ForPrdDsc ;
   private String ZZ874RecPrdFind ;
   private String ZZ873RecPrdNom ;
   private java.util.Date Z4577RecPesFec ;
   private java.util.Date A4577RecPesFec ;
   private java.util.Date ZZ4577RecPesFec ;
   private java.util.Date Z3804RecFecMov ;
   private java.util.Date Z13938RecLoteFch ;
   private java.util.Date A3804RecFecMov ;
   private java.util.Date A13938RecLoteFch ;
   private java.util.Date ZZ3804RecFecMov ;
   private java.util.Date ZZ13938RecLoteFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
   private boolean n490ForPrdUMe ;
   private boolean n874RecPrdFind ;
   private boolean n795PrvNum ;
   private boolean n704PrdExiAlm ;
   private boolean n856ValCod ;
   private boolean n705PrdExiCC ;
   private boolean n706PrdExiCCP ;
   private boolean n707PrdFacCon ;
   private boolean n685PrdCanRes ;
   private boolean n5418PrdSalM ;
   private boolean n10881PrdLote ;
   private boolean n13232PrdRGB ;
   private boolean wbErr ;
   private boolean n873RecPrdNom ;
   private boolean n407EmprNom ;
   private boolean n488ForPrdDsc ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private short[] T01QE12_A811RecLin ;
   private String[] T01QE12_A872RecPrdNum ;
   private String[] T01QE12_A875RecPrdDsc ;
   private java.math.BigDecimal[] T01QE12_A707PrdFacCon ;
   private boolean[] T01QE12_n707PrdFacCon ;
   private java.math.BigDecimal[] T01QE12_A686PrdCant ;
   private java.math.BigDecimal[] T01QE12_A1797PrdCanAny ;
   private java.math.BigDecimal[] T01QE12_A683PrdCanFin ;
   private String[] T01QE12_A488ForPrdDsc ;
   private boolean[] T01QE12_n488ForPrdDsc ;
   private byte[] T01QE12_A2394RecForNro ;
   private byte[] T01QE12_A3274RecPrdTnq ;
   private byte[] T01QE12_A4024RecMar ;
   private String[] T01QE12_A5725RecLote ;
   private java.math.BigDecimal[] T01QE12_A704PrdExiAlm ;
   private boolean[] T01QE12_n704PrdExiAlm ;
   private java.math.BigDecimal[] T01QE12_A685PrdCanRes ;
   private boolean[] T01QE12_n685PrdCanRes ;
   private java.math.BigDecimal[] T01QE12_A431FacCon ;
   private java.math.BigDecimal[] T01QE12_A705PrdExiCC ;
   private boolean[] T01QE12_n705PrdExiCC ;
   private java.math.BigDecimal[] T01QE12_A706PrdExiCCP ;
   private boolean[] T01QE12_n706PrdExiCCP ;
   private String[] T01QE12_A407EmprNom ;
   private boolean[] T01QE12_n407EmprNom ;
   private java.math.BigDecimal[] T01QE12_A3938RecCanEns ;
   private short[] T01QE12_A5422RecSalMP ;
   private String[] T01QE12_A5418PrdSalM ;
   private boolean[] T01QE12_n5418PrdSalM ;
   private int[] T01QE12_A5467RecSalVol ;
   private String[] T01QE12_A5527RecLinRea ;
   private byte[] T01QE12_A8934RecPes ;
   private String[] T01QE12_A8937RecAcc ;
   private java.math.BigDecimal[] T01QE12_A9813FacCon1 ;
   private java.util.Date[] T01QE12_A3804RecFecMov ;
   private short[] T01QE12_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01QE12_A3806RecUltAny ;
   private java.math.BigDecimal[] T01QE12_A3807RecPorAny ;
   private java.math.BigDecimal[] T01QE12_A4900PrdCanMac ;
   private int[] T01QE12_A11708RecProv ;
   private String[] T01QE12_A10881PrdLote ;
   private boolean[] T01QE12_n10881PrdLote ;
   private String[] T01QE12_A4576RecLinUsr ;
   private java.util.Date[] T01QE12_A4577RecPesFec ;
   private String[] T01QE12_A12641RecPrdDc2 ;
   private java.math.BigDecimal[] T01QE12_A12710PrdCantOrg ;
   private int[] T01QE12_A12717RecFabId ;
   private long[] T01QE12_A13232PrdRGB ;
   private boolean[] T01QE12_n13232PrdRGB ;
   private java.util.Date[] T01QE12_A13938RecLoteFch ;
   private short[] T01QE12_A13937RecLotAlm ;
   private String[] T01QE12_A14055RecManAut ;
   private String[] T01QE12_A396EmprCod ;
   private String[] T01QE12_A719PrdNum ;
   private boolean[] T01QE12_n719PrdNum ;
   private byte[] T01QE12_A490ForPrdUMe ;
   private boolean[] T01QE12_n490ForPrdUMe ;
   private int[] T01QE12_A129BarCod ;
   private byte[] T01QE12_A132BarCodReo ;
   private String[] T01QE12_A130BarCodPar ;
   private short[] T01QE12_A2804RecLinMaq ;
   private byte[] T01QE12_A1273RecLinPro ;
   private int[] T01QE12_A795PrvNum ;
   private boolean[] T01QE12_n795PrvNum ;
   private byte[] T01QE12_A856ValCod ;
   private boolean[] T01QE12_n856ValCod ;
   private String[] T01QE12_A874RecPrdFind ;
   private boolean[] T01QE12_n874RecPrdFind ;
   private String[] T01QE6_A873RecPrdNom ;
   private boolean[] T01QE6_n873RecPrdNom ;
   private String[] T01QE7_A407EmprNom ;
   private boolean[] T01QE7_n407EmprNom ;
   private java.math.BigDecimal[] T01QE8_A707PrdFacCon ;
   private boolean[] T01QE8_n707PrdFacCon ;
   private java.math.BigDecimal[] T01QE8_A704PrdExiAlm ;
   private boolean[] T01QE8_n704PrdExiAlm ;
   private java.math.BigDecimal[] T01QE8_A685PrdCanRes ;
   private boolean[] T01QE8_n685PrdCanRes ;
   private java.math.BigDecimal[] T01QE8_A705PrdExiCC ;
   private boolean[] T01QE8_n705PrdExiCC ;
   private java.math.BigDecimal[] T01QE8_A706PrdExiCCP ;
   private boolean[] T01QE8_n706PrdExiCCP ;
   private String[] T01QE8_A5418PrdSalM ;
   private boolean[] T01QE8_n5418PrdSalM ;
   private String[] T01QE8_A10881PrdLote ;
   private boolean[] T01QE8_n10881PrdLote ;
   private long[] T01QE8_A13232PrdRGB ;
   private boolean[] T01QE8_n13232PrdRGB ;
   private int[] T01QE8_A795PrvNum ;
   private boolean[] T01QE8_n795PrvNum ;
   private byte[] T01QE8_A856ValCod ;
   private boolean[] T01QE8_n856ValCod ;
   private String[] T01QE9_A488ForPrdDsc ;
   private boolean[] T01QE9_n488ForPrdDsc ;
   private String[] T01QE11_A874RecPrdFind ;
   private boolean[] T01QE11_n874RecPrdFind ;
   private String[] T01QE10_A396EmprCod ;
   private String[] T01QE13_A407EmprNom ;
   private boolean[] T01QE13_n407EmprNom ;
   private java.math.BigDecimal[] T01QE14_A707PrdFacCon ;
   private boolean[] T01QE14_n707PrdFacCon ;
   private java.math.BigDecimal[] T01QE14_A704PrdExiAlm ;
   private boolean[] T01QE14_n704PrdExiAlm ;
   private java.math.BigDecimal[] T01QE14_A685PrdCanRes ;
   private boolean[] T01QE14_n685PrdCanRes ;
   private java.math.BigDecimal[] T01QE14_A705PrdExiCC ;
   private boolean[] T01QE14_n705PrdExiCC ;
   private java.math.BigDecimal[] T01QE14_A706PrdExiCCP ;
   private boolean[] T01QE14_n706PrdExiCCP ;
   private String[] T01QE14_A5418PrdSalM ;
   private boolean[] T01QE14_n5418PrdSalM ;
   private String[] T01QE14_A10881PrdLote ;
   private boolean[] T01QE14_n10881PrdLote ;
   private long[] T01QE14_A13232PrdRGB ;
   private boolean[] T01QE14_n13232PrdRGB ;
   private int[] T01QE14_A795PrvNum ;
   private boolean[] T01QE14_n795PrvNum ;
   private byte[] T01QE14_A856ValCod ;
   private boolean[] T01QE14_n856ValCod ;
   private String[] T01QE15_A488ForPrdDsc ;
   private boolean[] T01QE15_n488ForPrdDsc ;
   private String[] T01QE16_A874RecPrdFind ;
   private boolean[] T01QE16_n874RecPrdFind ;
   private String[] T01QE17_A396EmprCod ;
   private String[] T01QE20_A873RecPrdNom ;
   private boolean[] T01QE20_n873RecPrdNom ;
   private String[] T01QE21_A396EmprCod ;
   private int[] T01QE21_A129BarCod ;
   private byte[] T01QE21_A132BarCodReo ;
   private String[] T01QE21_A130BarCodPar ;
   private short[] T01QE21_A2804RecLinMaq ;
   private byte[] T01QE21_A1273RecLinPro ;
   private short[] T01QE21_A811RecLin ;
   private short[] T01QE3_A811RecLin ;
   private String[] T01QE3_A872RecPrdNum ;
   private String[] T01QE3_A875RecPrdDsc ;
   private java.math.BigDecimal[] T01QE3_A686PrdCant ;
   private java.math.BigDecimal[] T01QE3_A1797PrdCanAny ;
   private java.math.BigDecimal[] T01QE3_A683PrdCanFin ;
   private byte[] T01QE3_A2394RecForNro ;
   private byte[] T01QE3_A3274RecPrdTnq ;
   private byte[] T01QE3_A4024RecMar ;
   private String[] T01QE3_A5725RecLote ;
   private java.math.BigDecimal[] T01QE3_A431FacCon ;
   private java.math.BigDecimal[] T01QE3_A3938RecCanEns ;
   private short[] T01QE3_A5422RecSalMP ;
   private int[] T01QE3_A5467RecSalVol ;
   private String[] T01QE3_A5527RecLinRea ;
   private byte[] T01QE3_A8934RecPes ;
   private String[] T01QE3_A8937RecAcc ;
   private java.math.BigDecimal[] T01QE3_A9813FacCon1 ;
   private java.util.Date[] T01QE3_A3804RecFecMov ;
   private short[] T01QE3_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01QE3_A3806RecUltAny ;
   private java.math.BigDecimal[] T01QE3_A3807RecPorAny ;
   private java.math.BigDecimal[] T01QE3_A4900PrdCanMac ;
   private int[] T01QE3_A11708RecProv ;
   private String[] T01QE3_A4576RecLinUsr ;
   private java.util.Date[] T01QE3_A4577RecPesFec ;
   private String[] T01QE3_A12641RecPrdDc2 ;
   private java.math.BigDecimal[] T01QE3_A12710PrdCantOrg ;
   private int[] T01QE3_A12717RecFabId ;
   private java.util.Date[] T01QE3_A13938RecLoteFch ;
   private short[] T01QE3_A13937RecLotAlm ;
   private String[] T01QE3_A14055RecManAut ;
   private String[] T01QE3_A396EmprCod ;
   private String[] T01QE3_A719PrdNum ;
   private boolean[] T01QE3_n719PrdNum ;
   private byte[] T01QE3_A490ForPrdUMe ;
   private boolean[] T01QE3_n490ForPrdUMe ;
   private int[] T01QE3_A129BarCod ;
   private byte[] T01QE3_A132BarCodReo ;
   private String[] T01QE3_A130BarCodPar ;
   private short[] T01QE3_A2804RecLinMaq ;
   private byte[] T01QE3_A1273RecLinPro ;
   private String[] T01QE22_A396EmprCod ;
   private int[] T01QE22_A129BarCod ;
   private byte[] T01QE22_A132BarCodReo ;
   private String[] T01QE22_A130BarCodPar ;
   private short[] T01QE22_A2804RecLinMaq ;
   private byte[] T01QE22_A1273RecLinPro ;
   private short[] T01QE22_A811RecLin ;
   private String[] T01QE23_A396EmprCod ;
   private int[] T01QE23_A129BarCod ;
   private byte[] T01QE23_A132BarCodReo ;
   private String[] T01QE23_A130BarCodPar ;
   private short[] T01QE23_A2804RecLinMaq ;
   private byte[] T01QE23_A1273RecLinPro ;
   private short[] T01QE23_A811RecLin ;
   private short[] T01QE2_A811RecLin ;
   private String[] T01QE2_A872RecPrdNum ;
   private String[] T01QE2_A875RecPrdDsc ;
   private java.math.BigDecimal[] T01QE2_A686PrdCant ;
   private java.math.BigDecimal[] T01QE2_A1797PrdCanAny ;
   private java.math.BigDecimal[] T01QE2_A683PrdCanFin ;
   private byte[] T01QE2_A2394RecForNro ;
   private byte[] T01QE2_A3274RecPrdTnq ;
   private byte[] T01QE2_A4024RecMar ;
   private String[] T01QE2_A5725RecLote ;
   private java.math.BigDecimal[] T01QE2_A431FacCon ;
   private java.math.BigDecimal[] T01QE2_A3938RecCanEns ;
   private short[] T01QE2_A5422RecSalMP ;
   private int[] T01QE2_A5467RecSalVol ;
   private String[] T01QE2_A5527RecLinRea ;
   private byte[] T01QE2_A8934RecPes ;
   private String[] T01QE2_A8937RecAcc ;
   private java.math.BigDecimal[] T01QE2_A9813FacCon1 ;
   private java.util.Date[] T01QE2_A3804RecFecMov ;
   private short[] T01QE2_A3805RecAnyTie ;
   private java.math.BigDecimal[] T01QE2_A3806RecUltAny ;
   private java.math.BigDecimal[] T01QE2_A3807RecPorAny ;
   private java.math.BigDecimal[] T01QE2_A4900PrdCanMac ;
   private int[] T01QE2_A11708RecProv ;
   private String[] T01QE2_A4576RecLinUsr ;
   private java.util.Date[] T01QE2_A4577RecPesFec ;
   private String[] T01QE2_A12641RecPrdDc2 ;
   private java.math.BigDecimal[] T01QE2_A12710PrdCantOrg ;
   private int[] T01QE2_A12717RecFabId ;
   private java.util.Date[] T01QE2_A13938RecLoteFch ;
   private short[] T01QE2_A13937RecLotAlm ;
   private String[] T01QE2_A14055RecManAut ;
   private String[] T01QE2_A396EmprCod ;
   private String[] T01QE2_A719PrdNum ;
   private boolean[] T01QE2_n719PrdNum ;
   private byte[] T01QE2_A490ForPrdUMe ;
   private boolean[] T01QE2_n490ForPrdUMe ;
   private int[] T01QE2_A129BarCod ;
   private byte[] T01QE2_A132BarCodReo ;
   private String[] T01QE2_A130BarCodPar ;
   private short[] T01QE2_A2804RecLinMaq ;
   private byte[] T01QE2_A1273RecLinPro ;
   private String[] T01QE27_A407EmprNom ;
   private boolean[] T01QE27_n407EmprNom ;
   private String[] T01QE28_A874RecPrdFind ;
   private boolean[] T01QE28_n874RecPrdFind ;
   private String[] T01QE29_A488ForPrdDsc ;
   private boolean[] T01QE29_n488ForPrdDsc ;
   private java.math.BigDecimal[] T01QE30_A707PrdFacCon ;
   private boolean[] T01QE30_n707PrdFacCon ;
   private java.math.BigDecimal[] T01QE30_A704PrdExiAlm ;
   private boolean[] T01QE30_n704PrdExiAlm ;
   private java.math.BigDecimal[] T01QE30_A685PrdCanRes ;
   private boolean[] T01QE30_n685PrdCanRes ;
   private java.math.BigDecimal[] T01QE30_A705PrdExiCC ;
   private boolean[] T01QE30_n705PrdExiCC ;
   private java.math.BigDecimal[] T01QE30_A706PrdExiCCP ;
   private boolean[] T01QE30_n706PrdExiCCP ;
   private String[] T01QE30_A5418PrdSalM ;
   private boolean[] T01QE30_n5418PrdSalM ;
   private String[] T01QE30_A10881PrdLote ;
   private boolean[] T01QE30_n10881PrdLote ;
   private long[] T01QE30_A13232PrdRGB ;
   private boolean[] T01QE30_n13232PrdRGB ;
   private int[] T01QE30_A795PrvNum ;
   private boolean[] T01QE30_n795PrvNum ;
   private byte[] T01QE30_A856ValCod ;
   private boolean[] T01QE30_n856ValCod ;
   private String[] T01QE33_A873RecPrdNom ;
   private boolean[] T01QE33_n873RecPrdNom ;
   private String[] T01QE34_A396EmprCod ;
   private int[] T01QE34_A129BarCod ;
   private byte[] T01QE34_A132BarCodReo ;
   private String[] T01QE34_A130BarCodPar ;
   private short[] T01QE34_A2804RecLinMaq ;
   private byte[] T01QE34_A1273RecLinPro ;
   private short[] T01QE34_A811RecLin ;
   private String[] T01QE35_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lrecet__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lrecet__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lrecet__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lrecet__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lrecet__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QE2", "SELECT RecLin, RecPrdNum, RecPrdDsc, PrdCant, PrdCanAny, PrdCanFin, RecForNro, RecPrdTnq, RecMar, RecLote, FacCon, RecCanEns, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, RecPrdDc2, PrdCantOrg, RecFabId, RecLoteFch, RecLotAlm, RecManAut, EmprCod, PrdNum, ForPrdUMe, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?  FOR UPDATE OF RecPrdNum, RecPrdDsc, PrdCant, PrdCanAny, PrdCanFin, RecForNro, RecPrdTnq, RecMar, RecLote, FacCon, RecCanEns, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, RecPrdDc2, PrdCantOrg, RecFabId, RecLoteFch, RecLotAlm, RecManAut, PrdNum, ForPrdUMe NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE3", "SELECT RecLin, RecPrdNum, RecPrdDsc, PrdCant, PrdCanAny, PrdCanFin, RecForNro, RecPrdTnq, RecMar, RecLote, FacCon, RecCanEns, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, RecPrdDc2, PrdCantOrg, RecFabId, RecLoteFch, RecLotAlm, RecManAut, EmprCod, PrdNum, ForPrdUMe, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE6", "SELECT COALESCE( T1.RecPrdNom, '') AS RecPrdNom FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdNom, ' ') END AS RecPrdNom FROM (SELECT PrdNom, EmprCod, PrvNum, PrdExiAlm, ValCod, PrdExiCC, PrdExiCCP, PrdFacCon, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2, TXPPRODUC T3 WHERE T2.EmprCod = ? AND T2.PrvNum = T3.PrvNum AND T2.PrdExiAlm = T3.PrdExiAlm AND T2.ValCod = T3.ValCod AND T2.PrdExiCC = T3.PrdExiCC AND T2.PrdExiCCP = T3.PrdExiCCP AND T2.PrdFacCon = T3.PrdFacCon AND T2.PrdCanRes = T3.PrdCanRes AND T2.PrdSalM = T3.PrdSalM AND T2.PrdLote = T3.PrdLote AND T2.PrdRGB = T3.PrdRGB AND T3.EmprCod = ? AND T3.PrdNum = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE8", "SELECT PrdFacCon, PrdExiAlm, PrdCanRes, PrdExiCC, PrdExiCCP, PrdSalM, PrdLote, PrdRGB, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE9", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE10", "SELECT EmprCod FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE11", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE12", "SELECT /*+ FIRST_ROWS(100) */ TM1.RecLin, TM1.RecPrdNum, TM1.RecPrdDsc, T3.PrdFacCon, TM1.PrdCant, TM1.PrdCanAny, TM1.PrdCanFin, T5.ForPrdDsc, TM1.RecForNro, TM1.RecPrdTnq, TM1.RecMar, TM1.RecLote, T3.PrdExiAlm, T3.PrdCanRes, TM1.FacCon, T3.PrdExiCC, T3.PrdExiCCP, T2.EmprNom, TM1.RecCanEns, TM1.RecSalMP, T3.PrdSalM, TM1.RecSalVol, TM1.RecLinRea, TM1.RecPes, TM1.RecAcc, TM1.FacCon1, TM1.RecFecMov, TM1.RecAnyTie, TM1.RecUltAny, TM1.RecPorAny, TM1.PrdCanMac, TM1.RecProv, T3.PrdLote, TM1.RecLinUsr, TM1.RecPesFec, TM1.RecPrdDc2, TM1.PrdCantOrg, TM1.RecFabId, T3.PrdRGB, TM1.RecLoteFch, TM1.RecLotAlm, TM1.RecManAut, TM1.EmprCod, TM1.PrdNum, TM1.ForPrdUMe, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq, TM1.RecLinPro, T3.PrvNum, T3.ValCod, COALESCE( T4.PrdNum, 'xxxxxx') AS RecPrdFind FROM ((((TXPLRECET TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) LEFT JOIN TXPPRODUC T4 ON T4.EmprCod = TM1.EmprCod AND T4.PrdNum = TM1.RecPrdNum) LEFT JOIN TXPUNMEPR T5 ON T5.EmprCod = TM1.EmprCod AND T5.ForPrdUMe = TM1.ForPrdUMe) WHERE TM1.EmprCod = ? and TM1.BarCod = ? and TM1.BarCodReo = ? and TM1.BarCodPar = ? and TM1.RecLinMaq = ? and TM1.RecLinPro = ? and TM1.RecLin = ? ORDER BY TM1.EmprCod, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.RecLinMaq, TM1.RecLinPro, TM1.RecLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE14", "SELECT PrdFacCon, PrdExiAlm, PrdCanRes, PrdExiCC, PrdExiCCP, PrdSalM, PrdLote, PrdRGB, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE15", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE16", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE17", "SELECT EmprCod FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE20", "SELECT COALESCE( T1.RecPrdNom, '') AS RecPrdNom FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdNom, ' ') END AS RecPrdNom FROM (SELECT PrdNom, EmprCod, PrvNum, PrdExiAlm, ValCod, PrdExiCC, PrdExiCCP, PrdFacCon, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2, TXPPRODUC T3 WHERE T2.EmprCod = ? AND T2.PrvNum = T3.PrvNum AND T2.PrdExiAlm = T3.PrdExiAlm AND T2.ValCod = T3.ValCod AND T2.PrdExiCC = T3.PrdExiCC AND T2.PrdExiCCP = T3.PrdExiCCP AND T2.PrdFacCon = T3.PrdFacCon AND T2.PrdCanRes = T3.PrdCanRes AND T2.PrdSalM = T3.PrdSalM AND T2.PrdLote = T3.PrdLote AND T2.PrdRGB = T3.PrdRGB AND T3.EmprCod = ? AND T3.PrdNum = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE21", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE22", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE ( EmprCod > ? or EmprCod = ? and BarCod > ? or BarCod = ? and EmprCod = ? and BarCodReo > ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar > ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq > ? or RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinPro > ? or RecLinPro = ? and RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLin > ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QE23", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE ( EmprCod < ? or EmprCod = ? and BarCod < ? or BarCod = ? and EmprCod = ? and BarCodReo < ? or BarCodReo = ? and BarCod = ? and EmprCod = ? and BarCodPar < ? or BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinMaq < ? or RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLinPro < ? or RecLinPro = ? and RecLinMaq = ? and BarCodPar = ? and BarCodReo = ? and BarCod = ? and EmprCod = ? and RecLin < ?) ORDER BY EmprCod DESC, BarCod DESC, BarCodReo DESC, BarCodPar DESC, RecLinMaq DESC, RecLinPro DESC, RecLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QE24", "INSERT INTO TXPLRECET(RecLin, RecPrdNum, RecPrdDsc, PrdCant, PrdCanAny, PrdCanFin, RecForNro, RecPrdTnq, RecMar, RecLote, FacCon, RecCanEns, RecSalMP, RecSalVol, RecLinRea, RecPes, RecAcc, FacCon1, RecFecMov, RecAnyTie, RecUltAny, RecPorAny, PrdCanMac, RecProv, RecLinUsr, RecPesFec, RecPrdDc2, PrdCantOrg, RecFabId, RecLoteFch, RecLotAlm, RecManAut, EmprCod, PrdNum, ForPrdUMe, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLRECET")
         ,new UpdateCursor("T01QE25", "UPDATE TXPLRECET SET RecPrdNum=?, RecPrdDsc=?, PrdCant=?, PrdCanAny=?, PrdCanFin=?, RecForNro=?, RecPrdTnq=?, RecMar=?, RecLote=?, FacCon=?, RecCanEns=?, RecSalMP=?, RecSalVol=?, RecLinRea=?, RecPes=?, RecAcc=?, FacCon1=?, RecFecMov=?, RecAnyTie=?, RecUltAny=?, RecPorAny=?, PrdCanMac=?, RecProv=?, RecLinUsr=?, RecPesFec=?, RecPrdDc2=?, PrdCantOrg=?, RecFabId=?, RecLoteFch=?, RecLotAlm=?, RecManAut=?, PrdNum=?, ForPrdUMe=?  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK, "TXPLRECET")
         ,new UpdateCursor("T01QE26", "DELETE FROM TXPLRECET  WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? AND RecLin = ?", GX_NOMASK, "TXPLRECET")
         ,new ForEachCursor("T01QE27", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE28", "SELECT COALESCE( PrdNum, 'xxxxxx') AS RecPrdFind FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE29", "SELECT ForPrdDsc FROM TXPUNMEPR WHERE EmprCod = ? AND ForPrdUMe = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE30", "SELECT PrdFacCon, PrdExiAlm, PrdCanRes, PrdExiCC, PrdExiCCP, PrdSalM, PrdLote, PrdRGB, PrvNum, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE33", "SELECT COALESCE( T1.RecPrdNom, '') AS RecPrdNom FROM (SELECT CASE  WHEN ? <> 'xxxxxx' THEN COALESCE( T2.PrdNom, ' ') END AS RecPrdNom FROM (SELECT PrdNom, EmprCod, PrvNum, PrdExiAlm, ValCod, PrdExiCC, PrdExiCCP, PrdFacCon, PrdCanRes, PrdSalM, PrdLote, PrdRGB, PrdNum FROM TXPPRODUC WHERE PrdNum = ? ) T2, TXPPRODUC T3 WHERE T2.EmprCod = ? AND T2.PrvNum = T3.PrvNum AND T2.PrdExiAlm = T3.PrdExiAlm AND T2.ValCod = T3.ValCod AND T2.PrdExiCC = T3.PrdExiCC AND T2.PrdExiCCP = T3.PrdExiCCP AND T2.PrdFacCon = T3.PrdFacCon AND T2.PrdCanRes = T3.PrdCanRes AND T2.PrdSalM = T3.PrdSalM AND T2.PrdLote = T3.PrdLote AND T2.PrdRGB = T3.PrdRGB AND T3.EmprCod = ? AND T3.PrdNum = ? ) T1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE34", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QE35", "SELECT EmprCod FROM TXPCRECET WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? AND RecLinMaq = ? AND RecLinPro = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 40);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,3);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 8);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 40);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,3);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(30);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((String[]) buf[31])[0] = rslt.getString(32, 1);
               ((String[]) buf[32])[0] = rslt.getString(33, 3);
               ((String[]) buf[33])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(35);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(36);
               ((byte[]) buf[38])[0] = rslt.getByte(37);
               ((String[]) buf[39])[0] = rslt.getString(38, 1);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((byte[]) buf[41])[0] = rslt.getByte(40);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,3);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,5);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 40);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(18,5);
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDate(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,3);
               ((java.math.BigDecimal[]) buf[21])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(23,3);
               ((int[]) buf[23])[0] = rslt.getInt(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 8);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 40);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(28,3);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(30);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((String[]) buf[31])[0] = rslt.getString(32, 1);
               ((String[]) buf[32])[0] = rslt.getString(33, 3);
               ((String[]) buf[33])[0] = rslt.getString(34, 6);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(35);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(36);
               ((byte[]) buf[38])[0] = rslt.getByte(37);
               ((String[]) buf[39])[0] = rslt.getString(38, 1);
               ((short[]) buf[40])[0] = rslt.getShort(39);
               ((byte[]) buf[41])[0] = rslt.getByte(40);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,3);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((String[]) buf[7])[0] = rslt.getString(8, 5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(13,4);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,4);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,5);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,4);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((String[]) buf[18])[0] = rslt.getString(18, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(19,5);
               ((short[]) buf[21])[0] = rslt.getShort(20);
               ((String[]) buf[22])[0] = rslt.getString(21, 1);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((String[]) buf[24])[0] = rslt.getString(23, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 40);
               ((java.math.BigDecimal[]) buf[27])[0] = rslt.getBigDecimal(26,5);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDate(27);
               ((short[]) buf[29])[0] = rslt.getShort(28);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(29,3);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(30,2);
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(31,3);
               ((int[]) buf[33])[0] = rslt.getInt(32);
               ((String[]) buf[34])[0] = rslt.getString(33, 26);
               ((String[]) buf[35])[0] = rslt.getString(34, 8);
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(35);
               ((String[]) buf[37])[0] = rslt.getString(36, 40);
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(37,3);
               ((int[]) buf[39])[0] = rslt.getInt(38);
               ((long[]) buf[40])[0] = rslt.getLong(39);
               ((java.util.Date[]) buf[41])[0] = rslt.getGXDate(40);
               ((short[]) buf[42])[0] = rslt.getShort(41);
               ((String[]) buf[43])[0] = rslt.getString(42, 1);
               ((String[]) buf[44])[0] = rslt.getString(43, 3);
               ((String[]) buf[45])[0] = rslt.getString(44, 6);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((byte[]) buf[47])[0] = rslt.getByte(45);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((int[]) buf[49])[0] = rslt.getInt(46);
               ((byte[]) buf[50])[0] = rslt.getByte(47);
               ((String[]) buf[51])[0] = rslt.getString(48, 1);
               ((short[]) buf[52])[0] = rslt.getShort(49);
               ((byte[]) buf[53])[0] = rslt.getByte(50);
               ((int[]) buf[54])[0] = rslt.getInt(51);
               ((byte[]) buf[55])[0] = rslt.getByte(52);
               ((String[]) buf[56])[0] = rslt.getString(53, 6);
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 5);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,4);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,4);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((long[]) buf[7])[0] = rslt.getLong(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 27 :
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
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 10 :
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
            case 11 :
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
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 16 :
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
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 17 :
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
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 1);
               stmt.setByte(25, ((Number) parms[24]).byteValue());
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 18 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 26);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setBigDecimal(6, (java.math.BigDecimal)parms[5], 3);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 26);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 5);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setInt(14, ((Number) parms[13]).intValue());
               stmt.setString(15, (String)parms[14], 1);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 40);
               stmt.setBigDecimal(18, (java.math.BigDecimal)parms[17], 5);
               stmt.setDate(19, (java.util.Date)parms[18]);
               stmt.setShort(20, ((Number) parms[19]).shortValue());
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 3);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 2);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 3);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setString(25, (String)parms[24], 8);
               stmt.setDateTime(26, (java.util.Date)parms[25], false);
               stmt.setString(27, (String)parms[26], 40);
               stmt.setBigDecimal(28, (java.math.BigDecimal)parms[27], 3);
               stmt.setInt(29, ((Number) parms[28]).intValue());
               stmt.setDate(30, (java.util.Date)parms[29]);
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setString(32, (String)parms[31], 1);
               stmt.setString(33, (String)parms[32], 3);
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(34, (String)parms[34], 6);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(35, ((Number) parms[36]).byteValue());
               }
               stmt.setInt(36, ((Number) parms[37]).intValue());
               stmt.setByte(37, ((Number) parms[38]).byteValue());
               stmt.setString(38, (String)parms[39], 1);
               stmt.setShort(39, ((Number) parms[40]).shortValue());
               stmt.setByte(40, ((Number) parms[41]).byteValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 26);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 3);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               stmt.setBigDecimal(5, (java.math.BigDecimal)parms[4], 3);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 26);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 5);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[10], 5);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 1);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setString(16, (String)parms[15], 40);
               stmt.setBigDecimal(17, (java.math.BigDecimal)parms[16], 5);
               stmt.setDate(18, (java.util.Date)parms[17]);
               stmt.setShort(19, ((Number) parms[18]).shortValue());
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 3);
               stmt.setBigDecimal(21, (java.math.BigDecimal)parms[20], 2);
               stmt.setBigDecimal(22, (java.math.BigDecimal)parms[21], 3);
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 8);
               stmt.setDateTime(25, (java.util.Date)parms[24], false);
               stmt.setString(26, (String)parms[25], 40);
               stmt.setBigDecimal(27, (java.math.BigDecimal)parms[26], 3);
               stmt.setInt(28, ((Number) parms[27]).intValue());
               stmt.setDate(29, (java.util.Date)parms[28]);
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setString(31, (String)parms[30], 1);
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(32, (String)parms[32], 6);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(33, ((Number) parms[34]).byteValue());
               }
               stmt.setString(34, (String)parms[35], 3);
               stmt.setInt(35, ((Number) parms[36]).intValue());
               stmt.setByte(36, ((Number) parms[37]).byteValue());
               stmt.setString(37, (String)parms[38], 1);
               stmt.setShort(38, ((Number) parms[39]).shortValue());
               stmt.setByte(39, ((Number) parms[40]).byteValue());
               stmt.setShort(40, ((Number) parms[41]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 23 :
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
            case 24 :
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
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 6);
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 6);
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
      }
   }

}

