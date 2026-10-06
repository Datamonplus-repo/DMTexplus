package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lhipro_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"FASEDESCRI") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A461Fase = httpContext.GetPar( "Fase") ;
         httpContext.ajax_rsp_assign_attri("", false, "A461Fase", A461Fase);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asafasedescri1QI59( A396EmprCod, A461Fase) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"GRUOPECODN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx8asagruopecodn1QI59( A396EmprCod, A503GruOpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = (int)(GXutil.lval( httpContext.GetPar( "GruOpeCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A503GruOpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
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
         gxload_17( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A656ParCod = (short)(GXutil.lval( httpContext.GetPar( "ParCod"))) ;
         n656ParCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A656ParCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_19") == 0 )
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
         gxload_19( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
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
         gxload_22( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A602MaqCod, A558HisProFec) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
         A134BarCodVir = (int)(GXutil.lval( httpContext.GetPar( "BarCodVir"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrimstr( DecimalUtil.doubleToDec(A134BarCodVir), 9, 0));
         A133BarCodReoV = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.str( A133BarCodReoV, 1, 0));
         A131BarCodParV = httpContext.GetPar( "BarCodParV") ;
         httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", A131BarCodParV);
         A195BarOrdLinV = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLinV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A195BarOrdLinV), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A602MaqCod, A558HisProFec, A561HisProLin, A134BarCodVir, A133BarCodReoV, A131BarCodParV, A195BarOrdLinV) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
         A134BarCodVir = (int)(GXutil.lval( httpContext.GetPar( "BarCodVir"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrimstr( DecimalUtil.doubleToDec(A134BarCodVir), 9, 0));
         A133BarCodReoV = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.str( A133BarCodReoV, 1, 0));
         A131BarCodParV = httpContext.GetPar( "BarCodParV") ;
         httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", A131BarCodParV);
         A195BarOrdLinV = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLinV"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A195BarOrdLinV), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A602MaqCod, A558HisProFec, A561HisProLin, A134BarCodVir, A133BarCodReoV, A131BarCodParV, A195BarOrdLinV) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Table LHIPRO", ""), (short)(0)) ;
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

   public lhipro_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lhipro_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lhipro_impl.class ));
   }

   public lhipro_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Table LHIPRO", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_LHIPRO.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_LHIPRO.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProFec_Internalname, httpContext.getMessage( "Fecha", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProFec_Internalname, localUtil.format(A558HisProFec, "99/99/99"), localUtil.format( A558HisProFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_LHIPRO.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProLin_Internalname, httpContext.getMessage( "Linea Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProLin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodVir_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodVir_Internalname, httpContext.getMessage( "BarCodVir", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodVir_Internalname, GXutil.ltrim( localUtil.ntoc( A134BarCodVir, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodVir_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A134BarCodVir), "ZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A134BarCodVir), "ZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodVir_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodVir_Enabled, 0, "text", "1", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodReoV_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodReoV_Internalname, httpContext.getMessage( "BarCodReoVir", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReoV_Internalname, GXutil.ltrim( localUtil.ntoc( A133BarCodReoV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReoV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A133BarCodReoV), "9") : localUtil.format( DecimalUtil.doubleToDec(A133BarCodReoV), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReoV_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodReoV_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarCodParV_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarCodParV_Internalname, httpContext.getMessage( "BarCodParVir", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodParV_Internalname, GXutil.rtrim( A131BarCodParV), GXutil.rtrim( localUtil.format( A131BarCodParV, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodParV_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarCodParV_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarOrdLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarOrdLin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLin_Internalname, GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarOrdLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtBarOrdLinV_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtBarOrdLinV_Internalname, httpContext.getMessage( "BarOrdLinVir", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarOrdLinV_Internalname, GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarOrdLinV_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A195BarOrdLinV), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A195BarOrdLinV), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarOrdLinV_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarOrdLinV_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasEst_Internalname, httpContext.getMessage( "FasEst", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasEst_Internalname, GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtFasEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A462FasEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A462FasEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFasEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCodFas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCodFas_Internalname, httpContext.getMessage( "CodFas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCodFas_Internalname, GXutil.rtrim( A307CodFas), GXutil.rtrim( localUtil.format( A307CodFas, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCodFas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCodFas_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFase_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFase_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFase_Internalname, GXutil.rtrim( A461Fase), GXutil.rtrim( localUtil.format( A461Fase, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFase_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFase_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProUni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProUni_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProUni_Internalname, GXutil.ltrim( localUtil.ntoc( A568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProUni_Enabled!=0) ? localUtil.format( A568HisProUni, "ZZZZZ9.99") : localUtil.format( A568HisProUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProUni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProTur_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProTur_Internalname, httpContext.getMessage( "Turno", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProTur_Internalname, GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProTur_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9") : localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProTur_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProTur_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProHin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProHin_Internalname, httpContext.getMessage( "Hh Inicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProHin_Internalname, GXutil.ltrim( localUtil.ntoc( A560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProHin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProHin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProHin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProMin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProMin_Internalname, httpContext.getMessage( "Mm Inicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProMin_Internalname, GXutil.ltrim( localUtil.ntoc( A563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProMin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99") : localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProMin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProMin_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProHfi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProHfi_Internalname, httpContext.getMessage( "Hh Fin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProHfi_Internalname, GXutil.ltrim( localUtil.ntoc( A559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProHfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProHfi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProHfi_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProMfi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProMfi_Internalname, httpContext.getMessage( "Mm Fin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProMfi_Internalname, GXutil.ltrim( localUtil.ntoc( A562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProMfi_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99") : localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProMfi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProMfi_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProF_Internalname, httpContext.getMessage( "HisProF", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProF_Internalname, GXutil.rtrim( A557HisProF), GXutil.rtrim( localUtil.format( A557HisProF, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProF_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProF_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParCod_Internalname, httpContext.getMessage( "Paro", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParCod_Internalname, GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtParCod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProTre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProTre_Internalname, httpContext.getMessage( "Tiempo Real", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProTre_Internalname, GXutil.ltrim( localUtil.ntoc( A564HisProTre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProTre_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A564HisProTre), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A564HisProTre), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProTre_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProTre_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProTte_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProTte_Internalname, httpContext.getMessage( "Tiempo Teorico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProTte_Internalname, GXutil.ltrim( localUtil.ntoc( A565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProTte_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A565HisProTte), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A565HisProTte), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProTte_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProTte_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisBarTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisBarTip_Internalname, httpContext.getMessage( "Tipo Barcada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisBarTip_Internalname, GXutil.ltrim( localUtil.ntoc( A543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisBarTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A543HisBarTip), "9") : localUtil.format( DecimalUtil.doubleToDec(A543HisBarTip), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisBarTip_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisBarTip_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProEst_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProEst_Internalname, httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProEst_Internalname, GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A556HisProEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A556HisProEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProEst_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProKgr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProKgr_Internalname, httpContext.getMessage( "HisProKgr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProKgr_Internalname, GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProKgr_Enabled!=0) ? localUtil.format( A1525HisProKgr, "ZZZZZ9.99") : localUtil.format( A1525HisProKgr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProKgr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProKgr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProMtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProMtr_Internalname, httpContext.getMessage( "HisProMtr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProMtr_Enabled!=0) ? localUtil.format( A1526HisProMtr, "ZZZZZ9.99") : localUtil.format( A1526HisProMtr, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProMtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProMtr_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProTip_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProTip_Internalname, httpContext.getMessage( "Tipo Articulo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProTip_Internalname, GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProTip_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A2247HisProTip), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A2247HisProTip), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProTip_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProTip_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProCod_Internalname, httpContext.getMessage( "Codigo Proceso", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProCod_Internalname, GXutil.rtrim( A2504HisProCod), GXutil.rtrim( localUtil.format( A2504HisProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarMla_Internalname, GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarMla_Enabled!=0) ? localUtil.format( A1280BarMla, "ZZZZZ9.99") : localUtil.format( A1280BarMla, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarMla_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtBarKla_Internalname, GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKla_Enabled!=0) ? localUtil.format( A1279BarKla, "ZZZZZ9.99") : localUtil.format( A1279BarKla, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKla_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtBarKla_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProLot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProLot_Internalname, httpContext.getMessage( "Lote", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProLot_Internalname, GXutil.rtrim( A3610HisProLot), GXutil.rtrim( localUtil.format( A3610HisProLot, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProLot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProLot_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProTc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProTc_Internalname, httpContext.getMessage( "Colorante", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProTc_Internalname, GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProTc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3611HisProTc), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A3611HisProTc), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProTc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProTc_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProReo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProReo_Internalname, httpContext.getMessage( "Tipo Reoperado", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProReo_Internalname, GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A3612HisProReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A3612HisProReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProReo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProBot_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProBot_Internalname, httpContext.getMessage( "Bota", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProBot_Internalname, GXutil.ltrim( localUtil.ntoc( A4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProBot_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4439HisProBot), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4439HisProBot), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProBot_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProBot_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProNPar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProNPar_Internalname, httpContext.getMessage( "Numero Partida p/fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProNPar_Internalname, GXutil.ltrim( localUtil.ntoc( A4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProNPar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4704HisProNPar), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4704HisProNPar), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,219);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProNPar_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProNPar_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProNpzs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProNpzs_Internalname, httpContext.getMessage( "Numero de Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProNpzs_Internalname, GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProNpzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProNpzs_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProNpzs_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisUniMed_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisUniMed_Internalname, httpContext.getMessage( "Unidades Medida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisUniMed_Internalname, GXutil.rtrim( A392DisUniMed), GXutil.rtrim( localUtil.format( A392DisUniMed, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisUniMed_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDisUniMed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProBan_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProBan_Internalname, httpContext.getMessage( "Codigo de Baño", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProBan_Internalname, GXutil.rtrim( A5339HisProBan), GXutil.rtrim( localUtil.format( A5339HisProBan, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProBan_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProBan_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LHIPRO.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LHIPRO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 243,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LHIPRO.htm");
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
         Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
         Z558HisProFec = localUtil.ctod( httpContext.cgiGet( "Z558HisProFec"), 0) ;
         Z561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( "Z561HisProLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z461Fase = httpContext.cgiGet( "Z461Fase") ;
         Z568HisProUni = localUtil.ctond( httpContext.cgiGet( "Z568HisProUni")) ;
         Z566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( "Z566HisProTur"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z560HisProHin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z560HisProHin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z563HisProMin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z563HisProMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z559HisProHfi = (byte)(localUtil.ctol( httpContext.cgiGet( "Z559HisProHfi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z562HisProMfi = (byte)(localUtil.ctol( httpContext.cgiGet( "Z562HisProMfi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z557HisProF = httpContext.cgiGet( "Z557HisProF") ;
         Z565HisProTte = (short)(localUtil.ctol( httpContext.cgiGet( "Z565HisProTte"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z543HisBarTip = (byte)(localUtil.ctol( httpContext.cgiGet( "Z543HisBarTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z556HisProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z556HisProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z1525HisProKgr = localUtil.ctond( httpContext.cgiGet( "Z1525HisProKgr")) ;
         Z1526HisProMtr = localUtil.ctond( httpContext.cgiGet( "Z1526HisProMtr")) ;
         Z2247HisProTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z2247HisProTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z2504HisProCod = httpContext.cgiGet( "Z2504HisProCod") ;
         Z3610HisProLot = httpContext.cgiGet( "Z3610HisProLot") ;
         Z3611HisProTc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3611HisProTc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z3612HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3612HisProReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4439HisProBot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4439HisProBot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4704HisProNPar = (int)(localUtil.ctol( httpContext.cgiGet( "Z4704HisProNPar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( "Z4714HisProNpzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z5339HisProBan = httpContext.cgiGet( "Z5339HisProBan") ;
         Z503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z503GruOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z656ParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z503GruOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A13893FaseDescri = httpContext.cgiGet( "FASEDESCRI") ;
         A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "GRUOPECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A13892GruOpeCodN = httpContext.cgiGet( "GRUOPECODN") ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisProFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HISPROFEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProFec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A558HisProFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         }
         else
         {
            A558HisProFec = localUtil.ctod( httpContext.cgiGet( edtHisProFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A561HisProLin = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
         }
         else
         {
            A561HisProLin = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
         }
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
         A134BarCodVir = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCodVir_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrimstr( DecimalUtil.doubleToDec(A134BarCodVir), 9, 0));
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
         A133BarCodReoV = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReoV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.str( A133BarCodReoV, 1, 0));
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         n130BarCodPar = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A131BarCodParV = httpContext.cgiGet( edtBarCodParV_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", A131BarCodParV);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "BARORDLIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtBarOrdLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A194BarOrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         }
         else
         {
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         }
         A195BarOrdLinV = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLinV_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A195BarOrdLinV), 4, 0));
         A462FasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n462FasEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
         A307CodFas = httpContext.cgiGet( edtCodFas_Internalname) ;
         n307CodFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
         A461Fase = httpContext.cgiGet( edtFase_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A461Fase", A461Fase);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROUNI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProUni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A568HisProUni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A568HisProUni", GXutil.ltrimstr( A568HisProUni, 9, 2));
         }
         else
         {
            A568HisProUni = localUtil.ctond( httpContext.cgiGet( edtHisProUni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A568HisProUni", GXutil.ltrimstr( A568HisProUni, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROTUR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProTur_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A566HisProTur = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A566HisProTur", GXutil.str( A566HisProTur, 1, 0));
         }
         else
         {
            A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTur_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A566HisProTur", GXutil.str( A566HisProTur, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROHIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProHin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A560HisProHin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A560HisProHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A560HisProHin), 2, 0));
         }
         else
         {
            A560HisProHin = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProHin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A560HisProHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A560HisProHin), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROMIN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProMin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A563HisProMin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A563HisProMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A563HisProMin), 2, 0));
         }
         else
         {
            A563HisProMin = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProMin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A563HisProMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A563HisProMin), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROHFI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProHfi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A559HisProHfi = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A559HisProHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A559HisProHfi), 2, 0));
         }
         else
         {
            A559HisProHfi = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProHfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A559HisProHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A559HisProHfi), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROMFI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProMfi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A562HisProMfi = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A562HisProMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A562HisProMfi), 2, 0));
         }
         else
         {
            A562HisProMfi = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProMfi_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A562HisProMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A562HisProMfi), 2, 0));
         }
         A557HisProF = GXutil.upper( httpContext.cgiGet( edtHisProF_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A557HisProF", A557HisProF);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A656ParCod = (short)(0) ;
            n656ParCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
         }
         else
         {
            A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n656ParCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
         }
         A564HisProTre = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTre_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A564HisProTre), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTte_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTte_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROTTE");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProTte_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A565HisProTte = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A565HisProTte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A565HisProTte), 4, 0));
         }
         else
         {
            A565HisProTte = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTte_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A565HisProTte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A565HisProTte), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISBARTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisBarTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A543HisBarTip = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A543HisBarTip", GXutil.str( A543HisBarTip, 1, 0));
         }
         else
         {
            A543HisBarTip = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisBarTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A543HisBarTip", GXutil.str( A543HisBarTip, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROEST");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProEst_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A556HisProEst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A556HisProEst", GXutil.str( A556HisProEst, 1, 0));
         }
         else
         {
            A556HisProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A556HisProEst", GXutil.str( A556HisProEst, 1, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROKGR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProKgr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1525HisProKgr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1525HisProKgr", GXutil.ltrimstr( A1525HisProKgr, 9, 2));
         }
         else
         {
            A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( edtHisProKgr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1525HisProKgr", GXutil.ltrimstr( A1525HisProKgr, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROMTR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProMtr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1526HisProMtr = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1526HisProMtr", GXutil.ltrimstr( A1526HisProMtr, 9, 2));
         }
         else
         {
            A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( edtHisProMtr_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1526HisProMtr", GXutil.ltrimstr( A1526HisProMtr, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROTIP");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProTip_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A2247HisProTip = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2247HisProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2247HisProTip), 4, 0));
         }
         else
         {
            A2247HisProTip = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProTip_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2247HisProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2247HisProTip), 4, 0));
         }
         A2504HisProCod = httpContext.cgiGet( edtHisProCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2504HisProCod", A2504HisProCod);
         A1280BarMla = localUtil.ctond( httpContext.cgiGet( edtBarMla_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1279BarKla = localUtil.ctond( httpContext.cgiGet( edtBarKla_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         A3610HisProLot = httpContext.cgiGet( edtHisProLot_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3610HisProLot", A3610HisProLot);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROTC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProTc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3611HisProTc = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3611HisProTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3611HisProTc), 2, 0));
         }
         else
         {
            A3611HisProTc = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProTc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3611HisProTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3611HisProTc), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROREO");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProReo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A3612HisProReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3612HisProReo", GXutil.str( A3612HisProReo, 1, 0));
         }
         else
         {
            A3612HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3612HisProReo", GXutil.str( A3612HisProReo, 1, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROBOT");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProBot_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4439HisProBot = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4439HisProBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4439HisProBot), 6, 0));
         }
         else
         {
            A4439HisProBot = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProBot_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4439HisProBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4439HisProBot), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPRONPAR");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProNPar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4704HisProNPar = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A4704HisProNPar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4704HisProNPar), 6, 0));
         }
         else
         {
            A4704HisProNPar = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProNPar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4704HisProNPar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4704HisProNPar), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPRONPZS");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProNpzs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4714HisProNpzs = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4714HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4714HisProNpzs), 4, 0));
         }
         else
         {
            A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProNpzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4714HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4714HisProNpzs), 4, 0));
         }
         A392DisUniMed = GXutil.upper( httpContext.cgiGet( edtDisUniMed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A5339HisProBan = httpContext.cgiGet( edtHisProBan_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5339HisProBan", A5339HisProBan);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"LHIPRO");
         forbiddenHiddens.add("GruOpeCod", localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("lhipro:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            A602MaqCod = httpContext.GetPar( "MaqCod") ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = localUtil.parseDateParm( httpContext.GetPar( "HisProFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            A561HisProLin = (int)(GXutil.lval( httpContext.GetPar( "HisProLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
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
            initAll1QI59( ) ;
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
      disableAttributes1QI59( ) ;
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

   public void resetCaption1QI0( )
   {
   }

   public void zm1QI59( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z194BarOrdLin = T01QI3_A194BarOrdLin[0] ;
            Z461Fase = T01QI3_A461Fase[0] ;
            Z568HisProUni = T01QI3_A568HisProUni[0] ;
            Z566HisProTur = T01QI3_A566HisProTur[0] ;
            Z560HisProHin = T01QI3_A560HisProHin[0] ;
            Z563HisProMin = T01QI3_A563HisProMin[0] ;
            Z559HisProHfi = T01QI3_A559HisProHfi[0] ;
            Z562HisProMfi = T01QI3_A562HisProMfi[0] ;
            Z557HisProF = T01QI3_A557HisProF[0] ;
            Z565HisProTte = T01QI3_A565HisProTte[0] ;
            Z543HisBarTip = T01QI3_A543HisBarTip[0] ;
            Z556HisProEst = T01QI3_A556HisProEst[0] ;
            Z1525HisProKgr = T01QI3_A1525HisProKgr[0] ;
            Z1526HisProMtr = T01QI3_A1526HisProMtr[0] ;
            Z2247HisProTip = T01QI3_A2247HisProTip[0] ;
            Z2504HisProCod = T01QI3_A2504HisProCod[0] ;
            Z3610HisProLot = T01QI3_A3610HisProLot[0] ;
            Z3611HisProTc = T01QI3_A3611HisProTc[0] ;
            Z3612HisProReo = T01QI3_A3612HisProReo[0] ;
            Z4439HisProBot = T01QI3_A4439HisProBot[0] ;
            Z4704HisProNPar = T01QI3_A4704HisProNPar[0] ;
            Z4714HisProNpzs = T01QI3_A4714HisProNpzs[0] ;
            Z5339HisProBan = T01QI3_A5339HisProBan[0] ;
            Z503GruOpeCod = T01QI3_A503GruOpeCod[0] ;
            Z129BarCod = T01QI3_A129BarCod[0] ;
            Z132BarCodReo = T01QI3_A132BarCodReo[0] ;
            Z130BarCodPar = T01QI3_A130BarCodPar[0] ;
            Z656ParCod = T01QI3_A656ParCod[0] ;
         }
         else
         {
            Z194BarOrdLin = A194BarOrdLin ;
            Z461Fase = A461Fase ;
            Z568HisProUni = A568HisProUni ;
            Z566HisProTur = A566HisProTur ;
            Z560HisProHin = A560HisProHin ;
            Z563HisProMin = A563HisProMin ;
            Z559HisProHfi = A559HisProHfi ;
            Z562HisProMfi = A562HisProMfi ;
            Z557HisProF = A557HisProF ;
            Z565HisProTte = A565HisProTte ;
            Z543HisBarTip = A543HisBarTip ;
            Z556HisProEst = A556HisProEst ;
            Z1525HisProKgr = A1525HisProKgr ;
            Z1526HisProMtr = A1526HisProMtr ;
            Z2247HisProTip = A2247HisProTip ;
            Z2504HisProCod = A2504HisProCod ;
            Z3610HisProLot = A3610HisProLot ;
            Z3611HisProTc = A3611HisProTc ;
            Z3612HisProReo = A3612HisProReo ;
            Z4439HisProBot = A4439HisProBot ;
            Z4704HisProNPar = A4704HisProNPar ;
            Z4714HisProNpzs = A4714HisProNpzs ;
            Z5339HisProBan = A5339HisProBan ;
            Z503GruOpeCod = A503GruOpeCod ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z656ParCod = A656ParCod ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z561HisProLin = A561HisProLin ;
         Z194BarOrdLin = A194BarOrdLin ;
         Z461Fase = A461Fase ;
         Z568HisProUni = A568HisProUni ;
         Z566HisProTur = A566HisProTur ;
         Z560HisProHin = A560HisProHin ;
         Z563HisProMin = A563HisProMin ;
         Z559HisProHfi = A559HisProHfi ;
         Z562HisProMfi = A562HisProMfi ;
         Z557HisProF = A557HisProF ;
         Z565HisProTte = A565HisProTte ;
         Z543HisBarTip = A543HisBarTip ;
         Z556HisProEst = A556HisProEst ;
         Z1525HisProKgr = A1525HisProKgr ;
         Z1526HisProMtr = A1526HisProMtr ;
         Z2247HisProTip = A2247HisProTip ;
         Z2504HisProCod = A2504HisProCod ;
         Z3610HisProLot = A3610HisProLot ;
         Z3611HisProTc = A3611HisProTc ;
         Z3612HisProReo = A3612HisProReo ;
         Z4439HisProBot = A4439HisProBot ;
         Z4704HisProNPar = A4704HisProNPar ;
         Z4714HisProNpzs = A4714HisProNpzs ;
         Z5339HisProBan = A5339HisProBan ;
         Z396EmprCod = A396EmprCod ;
         Z503GruOpeCod = A503GruOpeCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z656ParCod = A656ParCod ;
         Z361DisCod = A361DisCod ;
         Z392DisUniMed = A392DisUniMed ;
         Z1280BarMla = A1280BarMla ;
         Z1279BarKla = A1279BarKla ;
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

   public void load1QI59( )
   {
      /* Using cursor T01QI16 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A561HisProLin), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A361DisCod = T01QI16_A361DisCod[0] ;
         A194BarOrdLin = T01QI16_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A461Fase = T01QI16_A461Fase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A461Fase", A461Fase);
         A568HisProUni = T01QI16_A568HisProUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A568HisProUni", GXutil.ltrimstr( A568HisProUni, 9, 2));
         A566HisProTur = T01QI16_A566HisProTur[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A566HisProTur", GXutil.str( A566HisProTur, 1, 0));
         A560HisProHin = T01QI16_A560HisProHin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A560HisProHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A560HisProHin), 2, 0));
         A563HisProMin = T01QI16_A563HisProMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A563HisProMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A563HisProMin), 2, 0));
         A559HisProHfi = T01QI16_A559HisProHfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A559HisProHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A559HisProHfi), 2, 0));
         A562HisProMfi = T01QI16_A562HisProMfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A562HisProMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A562HisProMfi), 2, 0));
         A557HisProF = T01QI16_A557HisProF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557HisProF", A557HisProF);
         A565HisProTte = T01QI16_A565HisProTte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A565HisProTte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A565HisProTte), 4, 0));
         A543HisBarTip = T01QI16_A543HisBarTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A543HisBarTip", GXutil.str( A543HisBarTip, 1, 0));
         A556HisProEst = T01QI16_A556HisProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A556HisProEst", GXutil.str( A556HisProEst, 1, 0));
         A1525HisProKgr = T01QI16_A1525HisProKgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1525HisProKgr", GXutil.ltrimstr( A1525HisProKgr, 9, 2));
         A1526HisProMtr = T01QI16_A1526HisProMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1526HisProMtr", GXutil.ltrimstr( A1526HisProMtr, 9, 2));
         A2247HisProTip = T01QI16_A2247HisProTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2247HisProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2247HisProTip), 4, 0));
         A2504HisProCod = T01QI16_A2504HisProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2504HisProCod", A2504HisProCod);
         A3610HisProLot = T01QI16_A3610HisProLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3610HisProLot", A3610HisProLot);
         A3611HisProTc = T01QI16_A3611HisProTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3611HisProTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3611HisProTc), 2, 0));
         A3612HisProReo = T01QI16_A3612HisProReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3612HisProReo", GXutil.str( A3612HisProReo, 1, 0));
         A4439HisProBot = T01QI16_A4439HisProBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4439HisProBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4439HisProBot), 6, 0));
         A4704HisProNPar = T01QI16_A4704HisProNPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4704HisProNPar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4704HisProNPar), 6, 0));
         A4714HisProNpzs = T01QI16_A4714HisProNpzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4714HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4714HisProNpzs), 4, 0));
         A392DisUniMed = T01QI16_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         A5339HisProBan = T01QI16_A5339HisProBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5339HisProBan", A5339HisProBan);
         A503GruOpeCod = T01QI16_A503GruOpeCod[0] ;
         A129BarCod = T01QI16_A129BarCod[0] ;
         n129BarCod = T01QI16_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QI16_A132BarCodReo[0] ;
         n132BarCodReo = T01QI16_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QI16_A130BarCodPar[0] ;
         n130BarCodPar = T01QI16_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A656ParCod = T01QI16_A656ParCod[0] ;
         n656ParCod = T01QI16_n656ParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
         A1280BarMla = T01QI16_A1280BarMla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1279BarKla = T01QI16_A1279BarKla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         zm1QI59( -14) ;
      }
      pr_default.close(10);
      onLoadActions1QI59( ) ;
   }

   public void onLoadActions1QI59( )
   {
      GXt_char1 = A13893FaseDescri ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
      lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      A13893FaseDescri = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13893FaseDescri", A13893FaseDescri);
      GXt_char1 = A13892GruOpeCodN ;
      GXv_char2[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
      lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      A13892GruOpeCodN = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13892GruOpeCodN", A13892GruOpeCodN);
      A134BarCodVir = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrimstr( DecimalUtil.doubleToDec(A134BarCodVir), 9, 0));
      A133BarCodReoV = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.str( A133BarCodReoV, 1, 0));
      A131BarCodParV = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", A131BarCodParV);
      A195BarOrdLinV = A194BarOrdLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A195BarOrdLinV), 4, 0));
      /* Using cursor T01QI10 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A307CodFas = T01QI10_A307CodFas[0] ;
         n307CodFas = T01QI10_n307CodFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      }
      else
      {
         A307CodFas = "" ;
         n307CodFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      }
      pr_default.close(7);
      /* Using cursor T01QI12 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A462FasEst = T01QI12_A462FasEst[0] ;
         n462FasEst = T01QI12_n462FasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      }
      else
      {
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      }
      pr_default.close(8);
      if ( A560HisProHin <= A559HisProHfi )
      {
         A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A564HisProTre), 4, 0));
      }
      else
      {
         A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A564HisProTre), 4, 0));
      }
   }

   public void checkExtendedTable1QI59( )
   {
      nIsDirty_59 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QI4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T01QI6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01QI6_A361DisCod[0] ;
      pr_default.close(4);
      /* Using cursor T01QI7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(5);
      /* Using cursor T01QI8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T01QI8_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      pr_default.close(6);
      /* Using cursor T01QI14 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A1280BarMla = T01QI14_A1280BarMla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1279BarKla = T01QI14_A1279BarKla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         nIsDirty_59 = (short)(1) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
      }
      pr_default.close(9);
      nIsDirty_59 = (short)(1) ;
      GXt_char1 = A13893FaseDescri ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
      lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      A13893FaseDescri = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13893FaseDescri", A13893FaseDescri);
      nIsDirty_59 = (short)(1) ;
      GXt_char1 = A13892GruOpeCodN ;
      GXv_char2[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
      lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      A13892GruOpeCodN = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13892GruOpeCodN", A13892GruOpeCodN);
      /* Using cursor T01QI5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      nIsDirty_59 = (short)(1) ;
      A134BarCodVir = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrimstr( DecimalUtil.doubleToDec(A134BarCodVir), 9, 0));
      nIsDirty_59 = (short)(1) ;
      A133BarCodReoV = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.str( A133BarCodReoV, 1, 0));
      nIsDirty_59 = (short)(1) ;
      A131BarCodParV = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", A131BarCodParV);
      nIsDirty_59 = (short)(1) ;
      A195BarOrdLinV = A194BarOrdLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A195BarOrdLinV), 4, 0));
      /* Using cursor T01QI10 */
      pr_default.execute(7, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         A307CodFas = T01QI10_A307CodFas[0] ;
         n307CodFas = T01QI10_n307CodFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A307CodFas = "" ;
         n307CodFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      }
      pr_default.close(7);
      /* Using cursor T01QI12 */
      pr_default.execute(8, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A462FasEst = T01QI12_A462FasEst[0] ;
         n462FasEst = T01QI12_n462FasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      }
      pr_default.close(8);
      if ( ! ( ( ( A560HisProHin >= 0 ) && ( A560HisProHin <= 23 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hh Inicio", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "HISPROHIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProHin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( A560HisProHin <= A559HisProHfi )
      {
         nIsDirty_59 = (short)(1) ;
         A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A564HisProTre), 4, 0));
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A564HisProTre), 4, 0));
      }
      if ( ! ( ( ( A563HisProMin >= 0 ) && ( A563HisProMin <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Mm Inicio", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "HISPROMIN");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A559HisProHfi >= 0 ) && ( A559HisProHfi <= 23 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Hh Fin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "HISPROHFI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProHfi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( ( A562HisProMfi >= 0 ) && ( A562HisProMfi <= 59 ) ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Mm Fin", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "HISPROMFI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProMfi_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A557HisProF, "N") == 0 ) || ( GXutil.strcmp(A557HisProF, "S") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "HisProF", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "HISPROF");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisProF_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( A543HisBarTip == 0 ) || ( A543HisBarTip == 1 ) || ( A543HisBarTip == 2 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Tipo Barcada", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "HISBARTIP");
         AnyError = (short)(1) ;
         GX_FocusControl = edtHisBarTip_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1QI59( )
   {
      pr_default.close(2);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(6);
      pr_default.close(9);
      pr_default.close(3);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          int A503GruOpeCod )
   {
      /* Using cursor T01QI17 */
      pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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

   public void gxload_17( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01QI18 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01QI18_A361DisCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(12) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(12);
   }

   public void gxload_18( String A396EmprCod ,
                          short A656ParCod )
   {
      /* Using cursor T01QI19 */
      pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
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

   public void gxload_19( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01QI20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T01QI20_A392DisUniMed[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A392DisUniMed))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_22( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01QI22 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A1280BarMla = T01QI22_A1280BarMla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1279BarKla = T01QI22_A1279BarKla[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
      }
      else
      {
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_16( String A396EmprCod ,
                          String A602MaqCod ,
                          java.util.Date A558HisProFec )
   {
      /* Using cursor T01QI23 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_20( String A602MaqCod ,
                          java.util.Date A558HisProFec ,
                          int A561HisProLin ,
                          int A134BarCodVir ,
                          byte A133BarCodReoV ,
                          String A131BarCodParV ,
                          short A195BarOrdLinV )
   {
      /* Using cursor T01QI25 */
      pr_default.execute(17, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A307CodFas = T01QI25_A307CodFas[0] ;
         n307CodFas = T01QI25_n307CodFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      }
      else
      {
         A307CodFas = "" ;
         n307CodFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A307CodFas))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_21( String A602MaqCod ,
                          java.util.Date A558HisProFec ,
                          int A561HisProLin ,
                          int A134BarCodVir ,
                          byte A133BarCodReoV ,
                          String A131BarCodParV ,
                          short A195BarOrdLinV )
   {
      /* Using cursor T01QI27 */
      pr_default.execute(18, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A462FasEst = T01QI27_A462FasEst[0] ;
         n462FasEst = T01QI27_n462FasEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      }
      else
      {
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void getKey1QI59( )
   {
      /* Using cursor T01QI28 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound59 = (short)(1) ;
      }
      else
      {
         RcdFound59 = (short)(0) ;
      }
      pr_default.close(19);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QI59( 14) ;
         RcdFound59 = (short)(1) ;
         A561HisProLin = T01QI3_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
         A194BarOrdLin = T01QI3_A194BarOrdLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
         A461Fase = T01QI3_A461Fase[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A461Fase", A461Fase);
         A568HisProUni = T01QI3_A568HisProUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A568HisProUni", GXutil.ltrimstr( A568HisProUni, 9, 2));
         A566HisProTur = T01QI3_A566HisProTur[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A566HisProTur", GXutil.str( A566HisProTur, 1, 0));
         A560HisProHin = T01QI3_A560HisProHin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A560HisProHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A560HisProHin), 2, 0));
         A563HisProMin = T01QI3_A563HisProMin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A563HisProMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A563HisProMin), 2, 0));
         A559HisProHfi = T01QI3_A559HisProHfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A559HisProHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A559HisProHfi), 2, 0));
         A562HisProMfi = T01QI3_A562HisProMfi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A562HisProMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A562HisProMfi), 2, 0));
         A557HisProF = T01QI3_A557HisProF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557HisProF", A557HisProF);
         A565HisProTte = T01QI3_A565HisProTte[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A565HisProTte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A565HisProTte), 4, 0));
         A543HisBarTip = T01QI3_A543HisBarTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A543HisBarTip", GXutil.str( A543HisBarTip, 1, 0));
         A556HisProEst = T01QI3_A556HisProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A556HisProEst", GXutil.str( A556HisProEst, 1, 0));
         A1525HisProKgr = T01QI3_A1525HisProKgr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1525HisProKgr", GXutil.ltrimstr( A1525HisProKgr, 9, 2));
         A1526HisProMtr = T01QI3_A1526HisProMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1526HisProMtr", GXutil.ltrimstr( A1526HisProMtr, 9, 2));
         A2247HisProTip = T01QI3_A2247HisProTip[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2247HisProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2247HisProTip), 4, 0));
         A2504HisProCod = T01QI3_A2504HisProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2504HisProCod", A2504HisProCod);
         A3610HisProLot = T01QI3_A3610HisProLot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3610HisProLot", A3610HisProLot);
         A3611HisProTc = T01QI3_A3611HisProTc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3611HisProTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3611HisProTc), 2, 0));
         A3612HisProReo = T01QI3_A3612HisProReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3612HisProReo", GXutil.str( A3612HisProReo, 1, 0));
         A4439HisProBot = T01QI3_A4439HisProBot[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4439HisProBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4439HisProBot), 6, 0));
         A4704HisProNPar = T01QI3_A4704HisProNPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4704HisProNPar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4704HisProNPar), 6, 0));
         A4714HisProNpzs = T01QI3_A4714HisProNpzs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4714HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4714HisProNpzs), 4, 0));
         A5339HisProBan = T01QI3_A5339HisProBan[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5339HisProBan", A5339HisProBan);
         A396EmprCod = T01QI3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = T01QI3_A503GruOpeCod[0] ;
         A602MaqCod = T01QI3_A602MaqCod[0] ;
         n602MaqCod = T01QI3_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T01QI3_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A129BarCod = T01QI3_A129BarCod[0] ;
         n129BarCod = T01QI3_n129BarCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = T01QI3_A132BarCodReo[0] ;
         n132BarCodReo = T01QI3_n132BarCodReo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = T01QI3_A130BarCodPar[0] ;
         n130BarCodPar = T01QI3_n130BarCodPar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         A656ParCod = T01QI3_A656ParCod[0] ;
         n656ParCod = T01QI3_n656ParCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1QI59( ) ;
         if ( AnyError == 1 )
         {
            RcdFound59 = (short)(0) ;
            initializeNonKey1QI59( ) ;
         }
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound59 = (short)(0) ;
         initializeNonKey1QI59( ) ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QI59( ) ;
      if ( RcdFound59 == 0 )
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
      RcdFound59 = (short)(0) ;
      /* Using cursor T01QI29 */
      pr_default.execute(20, new Object[] {Integer.valueOf(A561HisProLin), Integer.valueOf(A561HisProLin), A396EmprCod, A396EmprCod, Integer.valueOf(A561HisProLin), Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod, Integer.valueOf(A561HisProLin), A558HisProFec});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( T01QI29_A561HisProLin[0] < A561HisProLin ) || ( T01QI29_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01QI29_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QI29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QI29_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01QI29_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01QI29_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01QI29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QI29_A561HisProLin[0] == A561HisProLin ) && GXutil.resetTime(T01QI29_A558HisProFec[0]).before( GXutil.resetTime( A558HisProFec )) ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( T01QI29_A561HisProLin[0] > A561HisProLin ) || ( T01QI29_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01QI29_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QI29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QI29_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01QI29_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01QI29_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01QI29_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QI29_A561HisProLin[0] == A561HisProLin ) && GXutil.resetTime(T01QI29_A558HisProFec[0]).after( GXutil.resetTime( A558HisProFec )) ) )
         {
            A561HisProLin = T01QI29_A561HisProLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            A396EmprCod = T01QI29_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01QI29_A602MaqCod[0] ;
            n602MaqCod = T01QI29_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = T01QI29_A558HisProFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            RcdFound59 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void move_previous( )
   {
      RcdFound59 = (short)(0) ;
      /* Using cursor T01QI30 */
      pr_default.execute(21, new Object[] {Integer.valueOf(A561HisProLin), Integer.valueOf(A561HisProLin), A396EmprCod, A396EmprCod, Integer.valueOf(A561HisProLin), Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod, Integer.valueOf(A561HisProLin), A558HisProFec});
      if ( (pr_default.getStatus(21) != 101) )
      {
         while ( (pr_default.getStatus(21) != 101) && ( ( T01QI30_A561HisProLin[0] > A561HisProLin ) || ( T01QI30_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01QI30_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QI30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QI30_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01QI30_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01QI30_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01QI30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QI30_A561HisProLin[0] == A561HisProLin ) && GXutil.resetTime(T01QI30_A558HisProFec[0]).after( GXutil.resetTime( A558HisProFec )) ) )
         {
            pr_default.readNext(21);
         }
         if ( (pr_default.getStatus(21) != 101) && ( ( T01QI30_A561HisProLin[0] < A561HisProLin ) || ( T01QI30_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01QI30_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QI30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QI30_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01QI30_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01QI30_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01QI30_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QI30_A561HisProLin[0] == A561HisProLin ) && GXutil.resetTime(T01QI30_A558HisProFec[0]).before( GXutil.resetTime( A558HisProFec )) ) )
         {
            A561HisProLin = T01QI30_A561HisProLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            A396EmprCod = T01QI30_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01QI30_A602MaqCod[0] ;
            n602MaqCod = T01QI30_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = T01QI30_A558HisProFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            RcdFound59 = (short)(1) ;
         }
      }
      pr_default.close(21);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QI59( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QI59( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound59 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A602MaqCod = Z602MaqCod ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               A558HisProFec = Z558HisProFec ;
               httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
               A561HisProLin = Z561HisProLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
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
               update1QI59( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QI59( ) ;
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
                  insert1QI59( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = Z602MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = Z558HisProFec ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = Z561HisProLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
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
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1QI59( ) ;
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QI59( ) ;
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
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
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
      scanStart1QI59( ) ;
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound59 != 0 )
         {
            scanNext1QI59( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtBarCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1QI59( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1QI59( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z194BarOrdLin != T01QI2_A194BarOrdLin[0] ) || ( GXutil.strcmp(Z461Fase, T01QI2_A461Fase[0]) != 0 ) || ( DecimalUtil.compareTo(Z568HisProUni, T01QI2_A568HisProUni[0]) != 0 ) || ( Z566HisProTur != T01QI2_A566HisProTur[0] ) || ( Z560HisProHin != T01QI2_A560HisProHin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z563HisProMin != T01QI2_A563HisProMin[0] ) || ( Z559HisProHfi != T01QI2_A559HisProHfi[0] ) || ( Z562HisProMfi != T01QI2_A562HisProMfi[0] ) || ( GXutil.strcmp(Z557HisProF, T01QI2_A557HisProF[0]) != 0 ) || ( Z565HisProTte != T01QI2_A565HisProTte[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z543HisBarTip != T01QI2_A543HisBarTip[0] ) || ( Z556HisProEst != T01QI2_A556HisProEst[0] ) || ( DecimalUtil.compareTo(Z1525HisProKgr, T01QI2_A1525HisProKgr[0]) != 0 ) || ( DecimalUtil.compareTo(Z1526HisProMtr, T01QI2_A1526HisProMtr[0]) != 0 ) || ( Z2247HisProTip != T01QI2_A2247HisProTip[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2504HisProCod, T01QI2_A2504HisProCod[0]) != 0 ) || ( GXutil.strcmp(Z3610HisProLot, T01QI2_A3610HisProLot[0]) != 0 ) || ( Z3611HisProTc != T01QI2_A3611HisProTc[0] ) || ( Z3612HisProReo != T01QI2_A3612HisProReo[0] ) || ( Z4439HisProBot != T01QI2_A4439HisProBot[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4704HisProNPar != T01QI2_A4704HisProNPar[0] ) || ( Z4714HisProNpzs != T01QI2_A4714HisProNpzs[0] ) || ( GXutil.strcmp(Z5339HisProBan, T01QI2_A5339HisProBan[0]) != 0 ) || ( Z503GruOpeCod != T01QI2_A503GruOpeCod[0] ) || ( Z129BarCod != T01QI2_A129BarCod[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z132BarCodReo != T01QI2_A132BarCodReo[0] ) || ( GXutil.strcmp(Z130BarCodPar, T01QI2_A130BarCodPar[0]) != 0 ) || ( Z656ParCod != T01QI2_A656ParCod[0] ) )
         {
            if ( Z194BarOrdLin != T01QI2_A194BarOrdLin[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"BarOrdLin");
               GXutil.writeLogRaw("Old: ",Z194BarOrdLin);
               GXutil.writeLogRaw("Current: ",T01QI2_A194BarOrdLin[0]);
            }
            if ( GXutil.strcmp(Z461Fase, T01QI2_A461Fase[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"Fase");
               GXutil.writeLogRaw("Old: ",Z461Fase);
               GXutil.writeLogRaw("Current: ",T01QI2_A461Fase[0]);
            }
            if ( DecimalUtil.compareTo(Z568HisProUni, T01QI2_A568HisProUni[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProUni");
               GXutil.writeLogRaw("Old: ",Z568HisProUni);
               GXutil.writeLogRaw("Current: ",T01QI2_A568HisProUni[0]);
            }
            if ( Z566HisProTur != T01QI2_A566HisProTur[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProTur");
               GXutil.writeLogRaw("Old: ",Z566HisProTur);
               GXutil.writeLogRaw("Current: ",T01QI2_A566HisProTur[0]);
            }
            if ( Z560HisProHin != T01QI2_A560HisProHin[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProHin");
               GXutil.writeLogRaw("Old: ",Z560HisProHin);
               GXutil.writeLogRaw("Current: ",T01QI2_A560HisProHin[0]);
            }
            if ( Z563HisProMin != T01QI2_A563HisProMin[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProMin");
               GXutil.writeLogRaw("Old: ",Z563HisProMin);
               GXutil.writeLogRaw("Current: ",T01QI2_A563HisProMin[0]);
            }
            if ( Z559HisProHfi != T01QI2_A559HisProHfi[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProHfi");
               GXutil.writeLogRaw("Old: ",Z559HisProHfi);
               GXutil.writeLogRaw("Current: ",T01QI2_A559HisProHfi[0]);
            }
            if ( Z562HisProMfi != T01QI2_A562HisProMfi[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProMfi");
               GXutil.writeLogRaw("Old: ",Z562HisProMfi);
               GXutil.writeLogRaw("Current: ",T01QI2_A562HisProMfi[0]);
            }
            if ( GXutil.strcmp(Z557HisProF, T01QI2_A557HisProF[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProF");
               GXutil.writeLogRaw("Old: ",Z557HisProF);
               GXutil.writeLogRaw("Current: ",T01QI2_A557HisProF[0]);
            }
            if ( Z565HisProTte != T01QI2_A565HisProTte[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProTte");
               GXutil.writeLogRaw("Old: ",Z565HisProTte);
               GXutil.writeLogRaw("Current: ",T01QI2_A565HisProTte[0]);
            }
            if ( Z543HisBarTip != T01QI2_A543HisBarTip[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisBarTip");
               GXutil.writeLogRaw("Old: ",Z543HisBarTip);
               GXutil.writeLogRaw("Current: ",T01QI2_A543HisBarTip[0]);
            }
            if ( Z556HisProEst != T01QI2_A556HisProEst[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProEst");
               GXutil.writeLogRaw("Old: ",Z556HisProEst);
               GXutil.writeLogRaw("Current: ",T01QI2_A556HisProEst[0]);
            }
            if ( DecimalUtil.compareTo(Z1525HisProKgr, T01QI2_A1525HisProKgr[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProKgr");
               GXutil.writeLogRaw("Old: ",Z1525HisProKgr);
               GXutil.writeLogRaw("Current: ",T01QI2_A1525HisProKgr[0]);
            }
            if ( DecimalUtil.compareTo(Z1526HisProMtr, T01QI2_A1526HisProMtr[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProMtr");
               GXutil.writeLogRaw("Old: ",Z1526HisProMtr);
               GXutil.writeLogRaw("Current: ",T01QI2_A1526HisProMtr[0]);
            }
            if ( Z2247HisProTip != T01QI2_A2247HisProTip[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProTip");
               GXutil.writeLogRaw("Old: ",Z2247HisProTip);
               GXutil.writeLogRaw("Current: ",T01QI2_A2247HisProTip[0]);
            }
            if ( GXutil.strcmp(Z2504HisProCod, T01QI2_A2504HisProCod[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProCod");
               GXutil.writeLogRaw("Old: ",Z2504HisProCod);
               GXutil.writeLogRaw("Current: ",T01QI2_A2504HisProCod[0]);
            }
            if ( GXutil.strcmp(Z3610HisProLot, T01QI2_A3610HisProLot[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProLot");
               GXutil.writeLogRaw("Old: ",Z3610HisProLot);
               GXutil.writeLogRaw("Current: ",T01QI2_A3610HisProLot[0]);
            }
            if ( Z3611HisProTc != T01QI2_A3611HisProTc[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProTc");
               GXutil.writeLogRaw("Old: ",Z3611HisProTc);
               GXutil.writeLogRaw("Current: ",T01QI2_A3611HisProTc[0]);
            }
            if ( Z3612HisProReo != T01QI2_A3612HisProReo[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProReo");
               GXutil.writeLogRaw("Old: ",Z3612HisProReo);
               GXutil.writeLogRaw("Current: ",T01QI2_A3612HisProReo[0]);
            }
            if ( Z4439HisProBot != T01QI2_A4439HisProBot[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProBot");
               GXutil.writeLogRaw("Old: ",Z4439HisProBot);
               GXutil.writeLogRaw("Current: ",T01QI2_A4439HisProBot[0]);
            }
            if ( Z4704HisProNPar != T01QI2_A4704HisProNPar[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProNPar");
               GXutil.writeLogRaw("Old: ",Z4704HisProNPar);
               GXutil.writeLogRaw("Current: ",T01QI2_A4704HisProNPar[0]);
            }
            if ( Z4714HisProNpzs != T01QI2_A4714HisProNpzs[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProNpzs");
               GXutil.writeLogRaw("Old: ",Z4714HisProNpzs);
               GXutil.writeLogRaw("Current: ",T01QI2_A4714HisProNpzs[0]);
            }
            if ( GXutil.strcmp(Z5339HisProBan, T01QI2_A5339HisProBan[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"HisProBan");
               GXutil.writeLogRaw("Old: ",Z5339HisProBan);
               GXutil.writeLogRaw("Current: ",T01QI2_A5339HisProBan[0]);
            }
            if ( Z503GruOpeCod != T01QI2_A503GruOpeCod[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"GruOpeCod");
               GXutil.writeLogRaw("Old: ",Z503GruOpeCod);
               GXutil.writeLogRaw("Current: ",T01QI2_A503GruOpeCod[0]);
            }
            if ( Z129BarCod != T01QI2_A129BarCod[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01QI2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01QI2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01QI2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01QI2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01QI2_A130BarCodPar[0]);
            }
            if ( Z656ParCod != T01QI2_A656ParCod[0] )
            {
               GXutil.writeLogln("lhipro:[seudo value changed for attri]"+"ParCod");
               GXutil.writeLogRaw("Old: ",Z656ParCod);
               GXutil.writeLogRaw("Current: ",T01QI2_A656ParCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLHIPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QI59( )
   {
      beforeValidate1QI59( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QI59( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QI59( 0) ;
         checkOptimisticConcurrency1QI59( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QI59( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QI59( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QI31 */
                  pr_default.execute(22, new Object[] {Integer.valueOf(A561HisProLin), Short.valueOf(A194BarOrdLin), A461Fase, A568HisProUni, Byte.valueOf(A566HisProTur), Byte.valueOf(A560HisProHin), Byte.valueOf(A563HisProMin), Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), A557HisProF, Short.valueOf(A565HisProTte), Byte.valueOf(A543HisBarTip), Byte.valueOf(A556HisProEst), A1525HisProKgr, A1526HisProMtr, Short.valueOf(A2247HisProTip), A2504HisProCod, A3610HisProLot, Byte.valueOf(A3611HisProTc), Byte.valueOf(A3612HisProReo), Integer.valueOf(A4439HisProBot), Integer.valueOf(A4704HisProNPar), Short.valueOf(A4714HisProNpzs), A5339HisProBan, A396EmprCod, Integer.valueOf(A503GruOpeCod), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1QI0( ) ;
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
            load1QI59( ) ;
         }
         endLevel1QI59( ) ;
      }
      closeExtendedTableCursors1QI59( ) ;
   }

   public void update1QI59( )
   {
      beforeValidate1QI59( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QI59( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QI59( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QI59( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QI59( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QI32 */
                  pr_default.execute(23, new Object[] {Short.valueOf(A194BarOrdLin), A461Fase, A568HisProUni, Byte.valueOf(A566HisProTur), Byte.valueOf(A560HisProHin), Byte.valueOf(A563HisProMin), Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), A557HisProF, Short.valueOf(A565HisProTte), Byte.valueOf(A543HisBarTip), Byte.valueOf(A556HisProEst), A1525HisProKgr, A1526HisProMtr, Short.valueOf(A2247HisProTip), A2504HisProCod, A3610HisProLot, Byte.valueOf(A3611HisProTc), Byte.valueOf(A3612HisProReo), Integer.valueOf(A4439HisProBot), Integer.valueOf(A4704HisProNPar), Short.valueOf(A4714HisProNpzs), A5339HisProBan, Integer.valueOf(A503GruOpeCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QI59( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1QI0( ) ;
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
         endLevel1QI59( ) ;
      }
      closeExtendedTableCursors1QI59( ) ;
   }

   public void deferredUpdate1QI59( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1QI59( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QI59( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QI59( ) ;
         afterConfirm1QI59( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QI59( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QI33 */
               pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound59 == 0 )
                     {
                        initAll1QI59( ) ;
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
                     resetCaption1QI0( ) ;
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
      sMode59 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QI59( ) ;
      Gx_mode = sMode59 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QI59( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A134BarCodVir = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrimstr( DecimalUtil.doubleToDec(A134BarCodVir), 9, 0));
         A133BarCodReoV = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.str( A133BarCodReoV, 1, 0));
         /* Using cursor T01QI34 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         A361DisCod = T01QI34_A361DisCod[0] ;
         pr_default.close(25);
         /* Using cursor T01QI35 */
         pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A392DisUniMed = T01QI35_A392DisUniMed[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
         pr_default.close(26);
         /* Using cursor T01QI37 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(27) != 101) )
         {
            A1280BarMla = T01QI37_A1280BarMla[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
            A1279BarKla = T01QI37_A1279BarKla[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         }
         else
         {
            A1280BarMla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
            A1279BarKla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         }
         pr_default.close(27);
         A131BarCodParV = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", A131BarCodParV);
         A195BarOrdLinV = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A195BarOrdLinV), 4, 0));
         /* Using cursor T01QI39 */
         pr_default.execute(28, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            A307CodFas = T01QI39_A307CodFas[0] ;
            n307CodFas = T01QI39_n307CodFas[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
         }
         else
         {
            A307CodFas = "" ;
            n307CodFas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
         }
         pr_default.close(28);
         /* Using cursor T01QI41 */
         pr_default.execute(29, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            A462FasEst = T01QI41_A462FasEst[0] ;
            n462FasEst = T01QI41_n462FasEst[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
         }
         else
         {
            A462FasEst = (byte)(3) ;
            n462FasEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
         }
         pr_default.close(29);
         GXt_char1 = A13893FaseDescri ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
         lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
         A13893FaseDescri = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13893FaseDescri", A13893FaseDescri);
         if ( A560HisProHin <= A559HisProHfi )
         {
            A564HisProTre = (short)(((A559HisProHfi*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A564HisProTre), 4, 0));
         }
         else
         {
            A564HisProTre = (short)((((A559HisProHfi+24)*60)+A562HisProMfi)-((A560HisProHin)*60+A563HisProMin)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A564HisProTre), 4, 0));
         }
         GXt_char1 = A13892GruOpeCodN ;
         GXv_char2[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
         lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
         A13892GruOpeCodN = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A13892GruOpeCodN", A13892GruOpeCodN);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01QI42 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURAR PARAMETROS PERCHAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01QI43 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA PARAMETROS EMPAQUETAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01QI44 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA PARAMETROS CALANDRAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01QI45 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA DATOS ABRIR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01QI46 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01QI47 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Histórico de parámetros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
      }
   }

   public void endLevel1QI59( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QI59( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lhipro");
         if ( AnyError == 0 )
         {
            confirmValues1QI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lhipro");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QI59( )
   {
      /* Using cursor T01QI48 */
      pr_default.execute(36);
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A396EmprCod = T01QI48_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01QI48_A602MaqCod[0] ;
         n602MaqCod = T01QI48_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T01QI48_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = T01QI48_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QI59( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A396EmprCod = T01QI48_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01QI48_A602MaqCod[0] ;
         n602MaqCod = T01QI48_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T01QI48_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = T01QI48_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      }
   }

   public void scanEnd1QI59( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1QI59( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QI59( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QI59( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QI59( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QI59( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QI59( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QI59( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtHisProFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Enabled), 5, 0), true);
      edtHisProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), true);
      edtBarCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCod_Enabled), 5, 0), true);
      edtBarCodVir_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodVir_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodVir_Enabled), 5, 0), true);
      edtBarCodReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReo_Enabled), 5, 0), true);
      edtBarCodReoV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodReoV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodReoV_Enabled), 5, 0), true);
      edtBarCodPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodPar_Enabled), 5, 0), true);
      edtBarCodParV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCodParV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCodParV_Enabled), 5, 0), true);
      edtBarOrdLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLin_Enabled), 5, 0), true);
      edtBarOrdLinV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarOrdLinV_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarOrdLinV_Enabled), 5, 0), true);
      edtFasEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasEst_Enabled), 5, 0), true);
      edtCodFas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCodFas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCodFas_Enabled), 5, 0), true);
      edtFase_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFase_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Enabled), 5, 0), true);
      edtHisProUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProUni_Enabled), 5, 0), true);
      edtHisProTur_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTur_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTur_Enabled), 5, 0), true);
      edtHisProHin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProHin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProHin_Enabled), 5, 0), true);
      edtHisProMin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMin_Enabled), 5, 0), true);
      edtHisProHfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProHfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProHfi_Enabled), 5, 0), true);
      edtHisProMfi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMfi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMfi_Enabled), 5, 0), true);
      edtHisProF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProF_Enabled), 5, 0), true);
      edtParCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCod_Enabled), 5, 0), true);
      edtHisProTre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTre_Enabled), 5, 0), true);
      edtHisProTte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTte_Enabled), 5, 0), true);
      edtHisBarTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisBarTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisBarTip_Enabled), 5, 0), true);
      edtHisProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProEst_Enabled), 5, 0), true);
      edtHisProKgr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProKgr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgr_Enabled), 5, 0), true);
      edtHisProMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtr_Enabled), 5, 0), true);
      edtHisProTip_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTip_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTip_Enabled), 5, 0), true);
      edtHisProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCod_Enabled), 5, 0), true);
      edtBarMla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarMla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarMla_Enabled), 5, 0), true);
      edtBarKla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarKla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarKla_Enabled), 5, 0), true);
      edtHisProLot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLot_Enabled), 5, 0), true);
      edtHisProTc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProTc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProTc_Enabled), 5, 0), true);
      edtHisProReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProReo_Enabled), 5, 0), true);
      edtHisProBot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProBot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProBot_Enabled), 5, 0), true);
      edtHisProNPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProNPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNPar_Enabled), 5, 0), true);
      edtHisProNpzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProNpzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProNpzs_Enabled), 5, 0), true);
      edtDisUniMed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisUniMed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisUniMed_Enabled), 5, 0), true);
      edtHisProBan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProBan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProBan_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QI59( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QI0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lhipro", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"LHIPRO");
      forbiddenHiddens.add("GruOpeCod", localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lhipro:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.dtoc( Z558HisProFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z561HisProLin", GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z461Fase", GXutil.rtrim( Z461Fase));
      app.GxWebStd.gx_hidden_field( httpContext, "Z568HisProUni", GXutil.ltrim( localUtil.ntoc( Z568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z566HisProTur", GXutil.ltrim( localUtil.ntoc( Z566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z560HisProHin", GXutil.ltrim( localUtil.ntoc( Z560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z563HisProMin", GXutil.ltrim( localUtil.ntoc( Z563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z559HisProHfi", GXutil.ltrim( localUtil.ntoc( Z559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z562HisProMfi", GXutil.ltrim( localUtil.ntoc( Z562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z557HisProF", GXutil.rtrim( Z557HisProF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z565HisProTte", GXutil.ltrim( localUtil.ntoc( Z565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z543HisBarTip", GXutil.ltrim( localUtil.ntoc( Z543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z556HisProEst", GXutil.ltrim( localUtil.ntoc( Z556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1525HisProKgr", GXutil.ltrim( localUtil.ntoc( Z1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1526HisProMtr", GXutil.ltrim( localUtil.ntoc( Z1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2247HisProTip", GXutil.ltrim( localUtil.ntoc( Z2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2504HisProCod", GXutil.rtrim( Z2504HisProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3610HisProLot", GXutil.rtrim( Z3610HisProLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3611HisProTc", GXutil.ltrim( localUtil.ntoc( Z3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3612HisProReo", GXutil.ltrim( localUtil.ntoc( Z3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4439HisProBot", GXutil.ltrim( localUtil.ntoc( Z4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4704HisProNPar", GXutil.ltrim( localUtil.ntoc( Z4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4714HisProNpzs", GXutil.ltrim( localUtil.ntoc( Z4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5339HisProBan", GXutil.rtrim( Z5339HisProBan));
      app.GxWebStd.gx_hidden_field( httpContext, "Z503GruOpeCod", GXutil.ltrim( localUtil.ntoc( Z503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z656ParCod", GXutil.ltrim( localUtil.ntoc( Z656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "FASEDESCRI", GXutil.rtrim( A13893FaseDescri));
      app.GxWebStd.gx_hidden_field( httpContext, "GRUOPECOD", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRUOPECODN", GXutil.rtrim( A13892GruOpeCodN));
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
      return formatLink("app.lhipro", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "LHIPRO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Table LHIPRO", "") ;
   }

   public void initializeNonKey1QI59( )
   {
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      A564HisProTre = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrimstr( DecimalUtil.doubleToDec(A564HisProTre), 4, 0));
      A195BarOrdLinV = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A195BarOrdLinV), 4, 0));
      A131BarCodParV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", A131BarCodParV);
      A133BarCodReoV = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.str( A133BarCodReoV, 1, 0));
      A134BarCodVir = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrimstr( DecimalUtil.doubleToDec(A134BarCodVir), 9, 0));
      A307CodFas = "" ;
      n307CodFas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      A462FasEst = (byte)(0) ;
      n462FasEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      A13892GruOpeCodN = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13892GruOpeCodN", A13892GruOpeCodN);
      A13893FaseDescri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13893FaseDescri", A13893FaseDescri);
      A129BarCod = 0 ;
      n129BarCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = (byte)(0) ;
      n132BarCodReo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = "" ;
      n130BarCodPar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      A503GruOpeCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A503GruOpeCod), 6, 0));
      A194BarOrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A194BarOrdLin), 4, 0));
      A461Fase = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A461Fase", A461Fase);
      A568HisProUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A568HisProUni", GXutil.ltrimstr( A568HisProUni, 9, 2));
      A566HisProTur = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A566HisProTur", GXutil.str( A566HisProTur, 1, 0));
      A560HisProHin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A560HisProHin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A560HisProHin), 2, 0));
      A563HisProMin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A563HisProMin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A563HisProMin), 2, 0));
      A559HisProHfi = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A559HisProHfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A559HisProHfi), 2, 0));
      A562HisProMfi = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A562HisProMfi", GXutil.ltrimstr( DecimalUtil.doubleToDec(A562HisProMfi), 2, 0));
      A557HisProF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A557HisProF", A557HisProF);
      A656ParCod = (short)(0) ;
      n656ParCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A656ParCod), 4, 0));
      A565HisProTte = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A565HisProTte", GXutil.ltrimstr( DecimalUtil.doubleToDec(A565HisProTte), 4, 0));
      A543HisBarTip = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A543HisBarTip", GXutil.str( A543HisBarTip, 1, 0));
      A556HisProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A556HisProEst", GXutil.str( A556HisProEst, 1, 0));
      A1525HisProKgr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1525HisProKgr", GXutil.ltrimstr( A1525HisProKgr, 9, 2));
      A1526HisProMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1526HisProMtr", GXutil.ltrimstr( A1526HisProMtr, 9, 2));
      A2247HisProTip = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2247HisProTip", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2247HisProTip), 4, 0));
      A2504HisProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2504HisProCod", A2504HisProCod);
      A1280BarMla = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
      A1279BarKla = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
      A3610HisProLot = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3610HisProLot", A3610HisProLot);
      A3611HisProTc = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3611HisProTc", GXutil.ltrimstr( DecimalUtil.doubleToDec(A3611HisProTc), 2, 0));
      A3612HisProReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A3612HisProReo", GXutil.str( A3612HisProReo, 1, 0));
      A4439HisProBot = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4439HisProBot", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4439HisProBot), 6, 0));
      A4704HisProNPar = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4704HisProNPar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4704HisProNPar), 6, 0));
      A4714HisProNpzs = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4714HisProNpzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4714HisProNpzs), 4, 0));
      A392DisUniMed = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", A392DisUniMed);
      A5339HisProBan = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5339HisProBan", A5339HisProBan);
      Z194BarOrdLin = (short)(0) ;
      Z461Fase = "" ;
      Z568HisProUni = DecimalUtil.ZERO ;
      Z566HisProTur = (byte)(0) ;
      Z560HisProHin = (byte)(0) ;
      Z563HisProMin = (byte)(0) ;
      Z559HisProHfi = (byte)(0) ;
      Z562HisProMfi = (byte)(0) ;
      Z557HisProF = "" ;
      Z565HisProTte = (short)(0) ;
      Z543HisBarTip = (byte)(0) ;
      Z556HisProEst = (byte)(0) ;
      Z1525HisProKgr = DecimalUtil.ZERO ;
      Z1526HisProMtr = DecimalUtil.ZERO ;
      Z2247HisProTip = (short)(0) ;
      Z2504HisProCod = "" ;
      Z3610HisProLot = "" ;
      Z3611HisProTc = (byte)(0) ;
      Z3612HisProReo = (byte)(0) ;
      Z4439HisProBot = 0 ;
      Z4704HisProNPar = 0 ;
      Z4714HisProNpzs = (short)(0) ;
      Z5339HisProBan = "" ;
      Z503GruOpeCod = 0 ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z656ParCod = (short)(0) ;
   }

   public void initAll1QI59( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A558HisProFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
      A561HisProLin = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      initializeNonKey1QI59( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026617123857", true, true);
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
      httpContext.AddJavascriptSource("lhipro.js", "?2026617123857", false, true);
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
      edtMaqCod_Internalname = "MAQCOD" ;
      edtHisProFec_Internalname = "HISPROFEC" ;
      edtHisProLin_Internalname = "HISPROLIN" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodVir_Internalname = "BARCODVIR" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodReoV_Internalname = "BARCODREOV" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarCodParV_Internalname = "BARCODPARV" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtBarOrdLinV_Internalname = "BARORDLINV" ;
      edtFasEst_Internalname = "FASEST" ;
      edtCodFas_Internalname = "CODFAS" ;
      edtFase_Internalname = "FASE" ;
      edtHisProUni_Internalname = "HISPROUNI" ;
      edtHisProTur_Internalname = "HISPROTUR" ;
      edtHisProHin_Internalname = "HISPROHIN" ;
      edtHisProMin_Internalname = "HISPROMIN" ;
      edtHisProHfi_Internalname = "HISPROHFI" ;
      edtHisProMfi_Internalname = "HISPROMFI" ;
      edtHisProF_Internalname = "HISPROF" ;
      edtParCod_Internalname = "PARCOD" ;
      edtHisProTre_Internalname = "HISPROTRE" ;
      edtHisProTte_Internalname = "HISPROTTE" ;
      edtHisBarTip_Internalname = "HISBARTIP" ;
      edtHisProEst_Internalname = "HISPROEST" ;
      edtHisProKgr_Internalname = "HISPROKGR" ;
      edtHisProMtr_Internalname = "HISPROMTR" ;
      edtHisProTip_Internalname = "HISPROTIP" ;
      edtHisProCod_Internalname = "HISPROCOD" ;
      edtBarMla_Internalname = "BARMLA" ;
      edtBarKla_Internalname = "BARKLA" ;
      edtHisProLot_Internalname = "HISPROLOT" ;
      edtHisProTc_Internalname = "HISPROTC" ;
      edtHisProReo_Internalname = "HISPROREO" ;
      edtHisProBot_Internalname = "HISPROBOT" ;
      edtHisProNPar_Internalname = "HISPRONPAR" ;
      edtHisProNpzs_Internalname = "HISPRONPZS" ;
      edtDisUniMed_Internalname = "DISUNIMED" ;
      edtHisProBan_Internalname = "HISPROBAN" ;
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
      Form.setCaption( httpContext.getMessage( "Table LHIPRO", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHisProBan_Jsonclick = "" ;
      edtHisProBan_Enabled = 1 ;
      edtDisUniMed_Jsonclick = "" ;
      edtDisUniMed_Enabled = 0 ;
      edtHisProNpzs_Jsonclick = "" ;
      edtHisProNpzs_Enabled = 1 ;
      edtHisProNPar_Jsonclick = "" ;
      edtHisProNPar_Enabled = 1 ;
      edtHisProBot_Jsonclick = "" ;
      edtHisProBot_Enabled = 1 ;
      edtHisProReo_Jsonclick = "" ;
      edtHisProReo_Enabled = 1 ;
      edtHisProTc_Jsonclick = "" ;
      edtHisProTc_Enabled = 1 ;
      edtHisProLot_Jsonclick = "" ;
      edtHisProLot_Enabled = 1 ;
      edtBarKla_Jsonclick = "" ;
      edtBarKla_Enabled = 0 ;
      edtBarMla_Jsonclick = "" ;
      edtBarMla_Enabled = 0 ;
      edtHisProCod_Jsonclick = "" ;
      edtHisProCod_Enabled = 1 ;
      edtHisProTip_Jsonclick = "" ;
      edtHisProTip_Enabled = 1 ;
      edtHisProMtr_Jsonclick = "" ;
      edtHisProMtr_Enabled = 1 ;
      edtHisProKgr_Jsonclick = "" ;
      edtHisProKgr_Enabled = 1 ;
      edtHisProEst_Jsonclick = "" ;
      edtHisProEst_Enabled = 1 ;
      edtHisBarTip_Jsonclick = "" ;
      edtHisBarTip_Enabled = 1 ;
      edtHisProTte_Jsonclick = "" ;
      edtHisProTte_Enabled = 1 ;
      edtHisProTre_Jsonclick = "" ;
      edtHisProTre_Enabled = 0 ;
      edtParCod_Jsonclick = "" ;
      edtParCod_Enabled = 1 ;
      edtHisProF_Jsonclick = "" ;
      edtHisProF_Enabled = 1 ;
      edtHisProMfi_Jsonclick = "" ;
      edtHisProMfi_Enabled = 1 ;
      edtHisProHfi_Jsonclick = "" ;
      edtHisProHfi_Enabled = 1 ;
      edtHisProMin_Jsonclick = "" ;
      edtHisProMin_Enabled = 1 ;
      edtHisProHin_Jsonclick = "" ;
      edtHisProHin_Enabled = 1 ;
      edtHisProTur_Jsonclick = "" ;
      edtHisProTur_Enabled = 1 ;
      edtHisProUni_Jsonclick = "" ;
      edtHisProUni_Enabled = 1 ;
      edtFase_Jsonclick = "" ;
      edtFase_Enabled = 1 ;
      edtCodFas_Jsonclick = "" ;
      edtCodFas_Enabled = 0 ;
      edtFasEst_Jsonclick = "" ;
      edtFasEst_Enabled = 0 ;
      edtBarOrdLinV_Jsonclick = "" ;
      edtBarOrdLinV_Enabled = 0 ;
      edtBarOrdLin_Jsonclick = "" ;
      edtBarOrdLin_Enabled = 1 ;
      edtBarCodParV_Jsonclick = "" ;
      edtBarCodParV_Enabled = 0 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 1 ;
      edtBarCodReoV_Jsonclick = "" ;
      edtBarCodReoV_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 1 ;
      edtBarCodVir_Jsonclick = "" ;
      edtBarCodVir_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 1 ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProLin_Enabled = 1 ;
      edtHisProFec_Jsonclick = "" ;
      edtHisProFec_Enabled = 1 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 1 ;
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

   public void gx7asafasedescri1QI59( String A396EmprCod ,
                                      String A461Fase )
   {
      GXt_char1 = A13893FaseDescri ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
      lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      A13893FaseDescri = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13893FaseDescri", A13893FaseDescri);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13893FaseDescri))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx8asagruopecodn1QI59( String A396EmprCod ,
                                      int A503GruOpeCod )
   {
      GXt_char1 = A13892GruOpeCodN ;
      GXv_char2[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
      lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      A13892GruOpeCodN = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13892GruOpeCodN", A13892GruOpeCodN);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13892GruOpeCodN))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      /* Using cursor T01QI49 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(37);
      GX_FocusControl = edtBarCod_Internalname ;
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
      /* Using cursor T01QI50 */
      pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(38) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(38);
      GXt_char1 = A13892GruOpeCodN ;
      GXv_char2[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
      lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      A13892GruOpeCodN = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13892GruOpeCodN", GXutil.rtrim( A13892GruOpeCodN));
   }

   public void valid_Hisprofec( )
   {
      n602MaqCod = false ;
      /* Using cursor T01QI49 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(37) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
   }

   public void valid_Hisprolin( )
   {
      n602MaqCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", GXutil.rtrim( A130BarCodPar));
      httpContext.ajax_rsp_assign_attri("", false, "A503GruOpeCod", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A194BarOrdLin", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A461Fase", GXutil.rtrim( A461Fase));
      httpContext.ajax_rsp_assign_attri("", false, "A568HisProUni", GXutil.ltrim( localUtil.ntoc( A568HisProUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A566HisProTur", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A560HisProHin", GXutil.ltrim( localUtil.ntoc( A560HisProHin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A563HisProMin", GXutil.ltrim( localUtil.ntoc( A563HisProMin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A559HisProHfi", GXutil.ltrim( localUtil.ntoc( A559HisProHfi, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A562HisProMfi", GXutil.ltrim( localUtil.ntoc( A562HisProMfi, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A557HisProF", GXutil.rtrim( A557HisProF));
      httpContext.ajax_rsp_assign_attri("", false, "A656ParCod", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A565HisProTte", GXutil.ltrim( localUtil.ntoc( A565HisProTte, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A543HisBarTip", GXutil.ltrim( localUtil.ntoc( A543HisBarTip, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A556HisProEst", GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1525HisProKgr", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1526HisProMtr", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2247HisProTip", GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2504HisProCod", GXutil.rtrim( A2504HisProCod));
      httpContext.ajax_rsp_assign_attri("", false, "A3610HisProLot", GXutil.rtrim( A3610HisProLot));
      httpContext.ajax_rsp_assign_attri("", false, "A3611HisProTc", GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3612HisProReo", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4439HisProBot", GXutil.ltrim( localUtil.ntoc( A4439HisProBot, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4704HisProNPar", GXutil.ltrim( localUtil.ntoc( A4704HisProNPar, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4714HisProNpzs", GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5339HisProBan", GXutil.rtrim( A5339HisProBan));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13893FaseDescri", GXutil.rtrim( A13893FaseDescri));
      httpContext.ajax_rsp_assign_attri("", false, "A13892GruOpeCodN", GXutil.rtrim( A13892GruOpeCodN));
      httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrim( localUtil.ntoc( A134BarCodVir, (byte)(9), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.ltrim( localUtil.ntoc( A133BarCodReoV, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", GXutil.rtrim( A131BarCodParV));
      httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", GXutil.rtrim( A307CodFas));
      httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrim( localUtil.ntoc( A564HisProTre, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.format(Z558HisProFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z561HisProLin", GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z503GruOpeCod", GXutil.ltrim( localUtil.ntoc( Z503GruOpeCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z194BarOrdLin", GXutil.ltrim( localUtil.ntoc( Z194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z461Fase", GXutil.rtrim( Z461Fase));
      app.GxWebStd.gx_hidden_field( httpContext, "Z568HisProUni", GXutil.ltrim( localUtil.ntoc( Z568HisProUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z566HisProTur", GXutil.ltrim( localUtil.ntoc( Z566HisProTur, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z560HisProHin", GXutil.ltrim( localUtil.ntoc( Z560HisProHin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z563HisProMin", GXutil.ltrim( localUtil.ntoc( Z563HisProMin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z559HisProHfi", GXutil.ltrim( localUtil.ntoc( Z559HisProHfi, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z562HisProMfi", GXutil.ltrim( localUtil.ntoc( Z562HisProMfi, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z557HisProF", GXutil.rtrim( Z557HisProF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z656ParCod", GXutil.ltrim( localUtil.ntoc( Z656ParCod, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z565HisProTte", GXutil.ltrim( localUtil.ntoc( Z565HisProTte, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z543HisBarTip", GXutil.ltrim( localUtil.ntoc( Z543HisBarTip, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z556HisProEst", GXutil.ltrim( localUtil.ntoc( Z556HisProEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1525HisProKgr", GXutil.ltrim( localUtil.ntoc( Z1525HisProKgr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1526HisProMtr", GXutil.ltrim( localUtil.ntoc( Z1526HisProMtr, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2247HisProTip", GXutil.ltrim( localUtil.ntoc( Z2247HisProTip, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2504HisProCod", GXutil.rtrim( Z2504HisProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3610HisProLot", GXutil.rtrim( Z3610HisProLot));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3611HisProTc", GXutil.ltrim( localUtil.ntoc( Z3611HisProTc, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3612HisProReo", GXutil.ltrim( localUtil.ntoc( Z3612HisProReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4439HisProBot", GXutil.ltrim( localUtil.ntoc( Z4439HisProBot, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4704HisProNPar", GXutil.ltrim( localUtil.ntoc( Z4704HisProNPar, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4714HisProNpzs", GXutil.ltrim( localUtil.ntoc( Z4714HisProNpzs, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5339HisProBan", GXutil.rtrim( Z5339HisProBan));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1280BarMla", GXutil.ltrim( localUtil.ntoc( Z1280BarMla, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1279BarKla", GXutil.ltrim( localUtil.ntoc( Z1279BarKla, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13893FaseDescri", GXutil.rtrim( Z13893FaseDescri));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13892GruOpeCodN", GXutil.rtrim( Z13892GruOpeCodN));
      app.GxWebStd.gx_hidden_field( httpContext, "Z134BarCodVir", GXutil.ltrim( localUtil.ntoc( Z134BarCodVir, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z133BarCodReoV", GXutil.ltrim( localUtil.ntoc( Z133BarCodReoV, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z131BarCodParV", GXutil.rtrim( Z131BarCodParV));
      app.GxWebStd.gx_hidden_field( httpContext, "Z195BarOrdLinV", GXutil.ltrim( localUtil.ntoc( Z195BarOrdLinV, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z307CodFas", GXutil.rtrim( Z307CodFas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z462FasEst", GXutil.ltrim( localUtil.ntoc( Z462FasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z564HisProTre", GXutil.ltrim( localUtil.ntoc( Z564HisProTre, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Barcodpar( )
   {
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      /* Using cursor T01QI34 */
      pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A361DisCod = T01QI34_A361DisCod[0] ;
      pr_default.close(25);
      /* Using cursor T01QI35 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(26) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A392DisUniMed = T01QI35_A392DisUniMed[0] ;
      pr_default.close(26);
      /* Using cursor T01QI37 */
      pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(27) != 101) )
      {
         A1280BarMla = T01QI37_A1280BarMla[0] ;
         A1279BarKla = T01QI37_A1279BarKla[0] ;
      }
      else
      {
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(27);
      A131BarCodParV = A130BarCodPar ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", GXutil.rtrim( A131BarCodParV));
   }

   public void valid_Barordlin( )
   {
      n602MaqCod = false ;
      n307CodFas = false ;
      n462FasEst = false ;
      A195BarOrdLinV = A194BarOrdLin ;
      /* Using cursor T01QI39 */
      pr_default.execute(28, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         A307CodFas = T01QI39_A307CodFas[0] ;
         n307CodFas = T01QI39_n307CodFas[0] ;
      }
      else
      {
         A307CodFas = "" ;
         n307CodFas = false ;
      }
      pr_default.close(28);
      /* Using cursor T01QI41 */
      pr_default.execute(29, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         A462FasEst = T01QI41_A462FasEst[0] ;
         n462FasEst = T01QI41_n462FasEst[0] ;
      }
      else
      {
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
      }
      pr_default.close(29);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", GXutil.rtrim( A307CodFas));
      httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), ".", "")));
   }

   public void valid_Fase( )
   {
      GXt_char1 = A13893FaseDescri ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
      lhipro_impl.this.GXt_char1 = GXv_char2[0] ;
      A13893FaseDescri = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13893FaseDescri", GXutil.rtrim( A13893FaseDescri));
   }

   public void valid_Parcod( )
   {
      n656ParCod = false ;
      /* Using cursor T01QI51 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(39) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      pr_default.close(39);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A13892GruOpeCodN',fld:'GRUOPECODN',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A13892GruOpeCodN',fld:'GRUOPECODN',pic:''}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_HISPROFEC","{handler:'valid_Hisprofec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''}]");
      setEventMetadata("VALID_HISPROFEC",",oparms:[]}");
      setEventMetadata("VALID_HISPROLIN","{handler:'valid_Hisprolin',iparms:[{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HISPROLIN",",oparms:[{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A568HisProUni',fld:'HISPROUNI',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A560HisProHin',fld:'HISPROHIN',pic:'Z9'},{av:'A563HisProMin',fld:'HISPROMIN',pic:'99'},{av:'A559HisProHfi',fld:'HISPROHFI',pic:'Z9'},{av:'A562HisProMfi',fld:'HISPROMFI',pic:'99'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A565HisProTte',fld:'HISPROTTE',pic:'ZZZ9'},{av:'A543HisBarTip',fld:'HISBARTIP',pic:'9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A2504HisProCod',fld:'HISPROCOD',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A4439HisProBot',fld:'HISPROBOT',pic:'ZZZZZ9'},{av:'A4704HisProNPar',fld:'HISPRONPAR',pic:'ZZZZZ9'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A5339HisProBan',fld:'HISPROBAN',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A13893FaseDescri',fld:'FASEDESCRI',pic:''},{av:'A13892GruOpeCodN',fld:'GRUOPECODN',pic:''},{av:'A134BarCodVir',fld:'BARCODVIR',pic:'ZZZZZZZZ9'},{av:'A133BarCodReoV',fld:'BARCODREOV',pic:'9'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''},{av:'A195BarOrdLinV',fld:'BARORDLINV',pic:'ZZZ9'},{av:'A307CodFas',fld:'CODFAS',pic:''},{av:'A462FasEst',fld:'FASEST',pic:'9'},{av:'A564HisProTre',fld:'HISPROTRE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z558HisProFec'},{av:'Z561HisProLin'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z503GruOpeCod'},{av:'Z194BarOrdLin'},{av:'Z461Fase'},{av:'Z568HisProUni'},{av:'Z566HisProTur'},{av:'Z560HisProHin'},{av:'Z563HisProMin'},{av:'Z559HisProHfi'},{av:'Z562HisProMfi'},{av:'Z557HisProF'},{av:'Z656ParCod'},{av:'Z565HisProTte'},{av:'Z543HisBarTip'},{av:'Z556HisProEst'},{av:'Z1525HisProKgr'},{av:'Z1526HisProMtr'},{av:'Z2247HisProTip'},{av:'Z2504HisProCod'},{av:'Z3610HisProLot'},{av:'Z3611HisProTc'},{av:'Z3612HisProReo'},{av:'Z4439HisProBot'},{av:'Z4704HisProNPar'},{av:'Z4714HisProNpzs'},{av:'Z5339HisProBan'},{av:'Z361DisCod'},{av:'Z392DisUniMed'},{av:'Z1280BarMla'},{av:'Z1279BarKla'},{av:'Z13893FaseDescri'},{av:'Z13892GruOpeCodN'},{av:'Z134BarCodVir'},{av:'Z133BarCodReoV'},{av:'Z131BarCodParV'},{av:'Z195BarOrdLinV'},{av:'Z307CodFas'},{av:'Z462FasEst'},{av:'Z564HisProTre'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODVIR","{handler:'valid_Barcodvir',iparms:[]");
      setEventMetadata("VALID_BARCODVIR",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODREOV","{handler:'valid_Barcodreov',iparms:[]");
      setEventMetadata("VALID_BARCODREOV",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''}]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''}]}");
      setEventMetadata("VALID_BARCODPARV","{handler:'valid_Barcodparv',iparms:[]");
      setEventMetadata("VALID_BARCODPARV",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A134BarCodVir',fld:'BARCODVIR',pic:'ZZZZZZZZ9'},{av:'A133BarCodReoV',fld:'BARCODREOV',pic:'9'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''},{av:'A195BarOrdLinV',fld:'BARORDLINV',pic:'ZZZ9'},{av:'A307CodFas',fld:'CODFAS',pic:''},{av:'A462FasEst',fld:'FASEST',pic:'9'}]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[{av:'A195BarOrdLinV',fld:'BARORDLINV',pic:'ZZZ9'},{av:'A307CodFas',fld:'CODFAS',pic:''},{av:'A462FasEst',fld:'FASEST',pic:'9'}]}");
      setEventMetadata("VALID_BARORDLINV","{handler:'valid_Barordlinv',iparms:[]");
      setEventMetadata("VALID_BARORDLINV",",oparms:[]}");
      setEventMetadata("VALID_FASE","{handler:'valid_Fase',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A13893FaseDescri',fld:'FASEDESCRI',pic:''}]");
      setEventMetadata("VALID_FASE",",oparms:[{av:'A13893FaseDescri',fld:'FASEDESCRI',pic:''}]}");
      setEventMetadata("VALID_HISPROHIN","{handler:'valid_Hisprohin',iparms:[]");
      setEventMetadata("VALID_HISPROHIN",",oparms:[]}");
      setEventMetadata("VALID_HISPROMIN","{handler:'valid_Hispromin',iparms:[]");
      setEventMetadata("VALID_HISPROMIN",",oparms:[]}");
      setEventMetadata("VALID_HISPROHFI","{handler:'valid_Hisprohfi',iparms:[]");
      setEventMetadata("VALID_HISPROHFI",",oparms:[]}");
      setEventMetadata("VALID_HISPROMFI","{handler:'valid_Hispromfi',iparms:[]");
      setEventMetadata("VALID_HISPROMFI",",oparms:[]}");
      setEventMetadata("VALID_HISPROF","{handler:'valid_Hisprof',iparms:[]");
      setEventMetadata("VALID_HISPROF",",oparms:[]}");
      setEventMetadata("VALID_PARCOD","{handler:'valid_Parcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PARCOD",",oparms:[]}");
      setEventMetadata("VALID_HISBARTIP","{handler:'valid_Hisbartip',iparms:[]");
      setEventMetadata("VALID_HISBARTIP",",oparms:[]}");
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
      pr_default.close(38);
      pr_default.close(37);
      pr_default.close(25);
      pr_default.close(39);
      pr_default.close(26);
      pr_default.close(28);
      pr_default.close(29);
      pr_default.close(27);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z558HisProFec = GXutil.nullDate() ;
      Z461Fase = "" ;
      Z568HisProUni = DecimalUtil.ZERO ;
      Z557HisProF = "" ;
      Z1525HisProKgr = DecimalUtil.ZERO ;
      Z1526HisProMtr = DecimalUtil.ZERO ;
      Z2504HisProCod = "" ;
      Z3610HisProLot = "" ;
      Z5339HisProBan = "" ;
      Z130BarCodPar = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A461Fase = "" ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      A558HisProFec = GXutil.nullDate() ;
      A131BarCodParV = "" ;
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
      A307CodFas = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A2504HisProCod = "" ;
      A1280BarMla = DecimalUtil.ZERO ;
      A1279BarKla = DecimalUtil.ZERO ;
      A3610HisProLot = "" ;
      A392DisUniMed = "" ;
      A5339HisProBan = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      A13893FaseDescri = "" ;
      A13892GruOpeCodN = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z392DisUniMed = "" ;
      Z1280BarMla = DecimalUtil.ZERO ;
      Z1279BarKla = DecimalUtil.ZERO ;
      T01QI16_A361DisCod = new int[1] ;
      T01QI16_A561HisProLin = new int[1] ;
      T01QI16_A194BarOrdLin = new short[1] ;
      T01QI16_A461Fase = new String[] {""} ;
      T01QI16_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI16_A566HisProTur = new byte[1] ;
      T01QI16_A560HisProHin = new byte[1] ;
      T01QI16_A563HisProMin = new byte[1] ;
      T01QI16_A559HisProHfi = new byte[1] ;
      T01QI16_A562HisProMfi = new byte[1] ;
      T01QI16_A557HisProF = new String[] {""} ;
      T01QI16_A565HisProTte = new short[1] ;
      T01QI16_A543HisBarTip = new byte[1] ;
      T01QI16_A556HisProEst = new byte[1] ;
      T01QI16_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI16_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI16_A2247HisProTip = new short[1] ;
      T01QI16_A2504HisProCod = new String[] {""} ;
      T01QI16_A3610HisProLot = new String[] {""} ;
      T01QI16_A3611HisProTc = new byte[1] ;
      T01QI16_A3612HisProReo = new byte[1] ;
      T01QI16_A4439HisProBot = new int[1] ;
      T01QI16_A4704HisProNPar = new int[1] ;
      T01QI16_A4714HisProNpzs = new short[1] ;
      T01QI16_A392DisUniMed = new String[] {""} ;
      T01QI16_A5339HisProBan = new String[] {""} ;
      T01QI16_A396EmprCod = new String[] {""} ;
      T01QI16_A503GruOpeCod = new int[1] ;
      T01QI16_A602MaqCod = new String[] {""} ;
      T01QI16_n602MaqCod = new boolean[] {false} ;
      T01QI16_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI16_A129BarCod = new int[1] ;
      T01QI16_n129BarCod = new boolean[] {false} ;
      T01QI16_A132BarCodReo = new byte[1] ;
      T01QI16_n132BarCodReo = new boolean[] {false} ;
      T01QI16_A130BarCodPar = new String[] {""} ;
      T01QI16_n130BarCodPar = new boolean[] {false} ;
      T01QI16_A656ParCod = new short[1] ;
      T01QI16_n656ParCod = new boolean[] {false} ;
      T01QI16_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI16_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI10_A307CodFas = new String[] {""} ;
      T01QI10_n307CodFas = new boolean[] {false} ;
      T01QI12_A462FasEst = new byte[1] ;
      T01QI12_n462FasEst = new boolean[] {false} ;
      T01QI4_A396EmprCod = new String[] {""} ;
      T01QI6_A361DisCod = new int[1] ;
      T01QI7_A396EmprCod = new String[] {""} ;
      T01QI8_A392DisUniMed = new String[] {""} ;
      T01QI14_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI14_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI5_A396EmprCod = new String[] {""} ;
      T01QI17_A396EmprCod = new String[] {""} ;
      T01QI18_A361DisCod = new int[1] ;
      T01QI19_A396EmprCod = new String[] {""} ;
      T01QI20_A392DisUniMed = new String[] {""} ;
      T01QI22_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI22_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI23_A396EmprCod = new String[] {""} ;
      T01QI25_A307CodFas = new String[] {""} ;
      T01QI25_n307CodFas = new boolean[] {false} ;
      T01QI27_A462FasEst = new byte[1] ;
      T01QI27_n462FasEst = new boolean[] {false} ;
      T01QI28_A396EmprCod = new String[] {""} ;
      T01QI28_A602MaqCod = new String[] {""} ;
      T01QI28_n602MaqCod = new boolean[] {false} ;
      T01QI28_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI28_A561HisProLin = new int[1] ;
      T01QI3_A561HisProLin = new int[1] ;
      T01QI3_A194BarOrdLin = new short[1] ;
      T01QI3_A461Fase = new String[] {""} ;
      T01QI3_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI3_A566HisProTur = new byte[1] ;
      T01QI3_A560HisProHin = new byte[1] ;
      T01QI3_A563HisProMin = new byte[1] ;
      T01QI3_A559HisProHfi = new byte[1] ;
      T01QI3_A562HisProMfi = new byte[1] ;
      T01QI3_A557HisProF = new String[] {""} ;
      T01QI3_A565HisProTte = new short[1] ;
      T01QI3_A543HisBarTip = new byte[1] ;
      T01QI3_A556HisProEst = new byte[1] ;
      T01QI3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI3_A2247HisProTip = new short[1] ;
      T01QI3_A2504HisProCod = new String[] {""} ;
      T01QI3_A3610HisProLot = new String[] {""} ;
      T01QI3_A3611HisProTc = new byte[1] ;
      T01QI3_A3612HisProReo = new byte[1] ;
      T01QI3_A4439HisProBot = new int[1] ;
      T01QI3_A4704HisProNPar = new int[1] ;
      T01QI3_A4714HisProNpzs = new short[1] ;
      T01QI3_A5339HisProBan = new String[] {""} ;
      T01QI3_A396EmprCod = new String[] {""} ;
      T01QI3_A503GruOpeCod = new int[1] ;
      T01QI3_A602MaqCod = new String[] {""} ;
      T01QI3_n602MaqCod = new boolean[] {false} ;
      T01QI3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI3_A129BarCod = new int[1] ;
      T01QI3_n129BarCod = new boolean[] {false} ;
      T01QI3_A132BarCodReo = new byte[1] ;
      T01QI3_n132BarCodReo = new boolean[] {false} ;
      T01QI3_A130BarCodPar = new String[] {""} ;
      T01QI3_n130BarCodPar = new boolean[] {false} ;
      T01QI3_A656ParCod = new short[1] ;
      T01QI3_n656ParCod = new boolean[] {false} ;
      sMode59 = "" ;
      T01QI29_A561HisProLin = new int[1] ;
      T01QI29_A396EmprCod = new String[] {""} ;
      T01QI29_A602MaqCod = new String[] {""} ;
      T01QI29_n602MaqCod = new boolean[] {false} ;
      T01QI29_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI30_A561HisProLin = new int[1] ;
      T01QI30_A396EmprCod = new String[] {""} ;
      T01QI30_A602MaqCod = new String[] {""} ;
      T01QI30_n602MaqCod = new boolean[] {false} ;
      T01QI30_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI2_A561HisProLin = new int[1] ;
      T01QI2_A194BarOrdLin = new short[1] ;
      T01QI2_A461Fase = new String[] {""} ;
      T01QI2_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI2_A566HisProTur = new byte[1] ;
      T01QI2_A560HisProHin = new byte[1] ;
      T01QI2_A563HisProMin = new byte[1] ;
      T01QI2_A559HisProHfi = new byte[1] ;
      T01QI2_A562HisProMfi = new byte[1] ;
      T01QI2_A557HisProF = new String[] {""} ;
      T01QI2_A565HisProTte = new short[1] ;
      T01QI2_A543HisBarTip = new byte[1] ;
      T01QI2_A556HisProEst = new byte[1] ;
      T01QI2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI2_A2247HisProTip = new short[1] ;
      T01QI2_A2504HisProCod = new String[] {""} ;
      T01QI2_A3610HisProLot = new String[] {""} ;
      T01QI2_A3611HisProTc = new byte[1] ;
      T01QI2_A3612HisProReo = new byte[1] ;
      T01QI2_A4439HisProBot = new int[1] ;
      T01QI2_A4704HisProNPar = new int[1] ;
      T01QI2_A4714HisProNpzs = new short[1] ;
      T01QI2_A5339HisProBan = new String[] {""} ;
      T01QI2_A396EmprCod = new String[] {""} ;
      T01QI2_A503GruOpeCod = new int[1] ;
      T01QI2_A602MaqCod = new String[] {""} ;
      T01QI2_n602MaqCod = new boolean[] {false} ;
      T01QI2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI2_A129BarCod = new int[1] ;
      T01QI2_n129BarCod = new boolean[] {false} ;
      T01QI2_A132BarCodReo = new byte[1] ;
      T01QI2_n132BarCodReo = new boolean[] {false} ;
      T01QI2_A130BarCodPar = new String[] {""} ;
      T01QI2_n130BarCodPar = new boolean[] {false} ;
      T01QI2_A656ParCod = new short[1] ;
      T01QI2_n656ParCod = new boolean[] {false} ;
      T01QI34_A361DisCod = new int[1] ;
      T01QI35_A392DisUniMed = new String[] {""} ;
      T01QI37_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI37_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QI39_A307CodFas = new String[] {""} ;
      T01QI39_n307CodFas = new boolean[] {false} ;
      T01QI41_A462FasEst = new byte[1] ;
      T01QI41_n462FasEst = new boolean[] {false} ;
      T01QI42_A396EmprCod = new String[] {""} ;
      T01QI42_A602MaqCod = new String[] {""} ;
      T01QI42_n602MaqCod = new boolean[] {false} ;
      T01QI42_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI42_A561HisProLin = new int[1] ;
      T01QI42_A10501Peh_cod = new String[] {""} ;
      T01QI43_A396EmprCod = new String[] {""} ;
      T01QI43_A602MaqCod = new String[] {""} ;
      T01QI43_n602MaqCod = new boolean[] {false} ;
      T01QI43_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI43_A561HisProLin = new int[1] ;
      T01QI43_A10495Emh_cod = new String[] {""} ;
      T01QI44_A396EmprCod = new String[] {""} ;
      T01QI44_A602MaqCod = new String[] {""} ;
      T01QI44_n602MaqCod = new boolean[] {false} ;
      T01QI44_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI44_A561HisProLin = new int[1] ;
      T01QI44_A10487Cah_cod = new String[] {""} ;
      T01QI45_A396EmprCod = new String[] {""} ;
      T01QI45_A602MaqCod = new String[] {""} ;
      T01QI45_n602MaqCod = new boolean[] {false} ;
      T01QI45_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI45_A561HisProLin = new int[1] ;
      T01QI45_A10486Abh_cod = new String[] {""} ;
      T01QI46_A396EmprCod = new String[] {""} ;
      T01QI46_A602MaqCod = new String[] {""} ;
      T01QI46_n602MaqCod = new boolean[] {false} ;
      T01QI46_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI46_A561HisProLin = new int[1] ;
      T01QI46_A10090HisProCP = new String[] {""} ;
      T01QI47_A396EmprCod = new String[] {""} ;
      T01QI47_A602MaqCod = new String[] {""} ;
      T01QI47_n602MaqCod = new boolean[] {false} ;
      T01QI47_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI47_A561HisProLin = new int[1] ;
      T01QI47_A3047LOParId = new String[] {""} ;
      T01QI48_A396EmprCod = new String[] {""} ;
      T01QI48_A602MaqCod = new String[] {""} ;
      T01QI48_n602MaqCod = new boolean[] {false} ;
      T01QI48_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01QI48_A561HisProLin = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      T01QI49_A396EmprCod = new String[] {""} ;
      Z13893FaseDescri = "" ;
      Z13892GruOpeCodN = "" ;
      Z131BarCodParV = "" ;
      Z307CodFas = "" ;
      T01QI50_A396EmprCod = new String[] {""} ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ558HisProFec = GXutil.nullDate() ;
      ZZ130BarCodPar = "" ;
      ZZ461Fase = "" ;
      ZZ568HisProUni = DecimalUtil.ZERO ;
      ZZ557HisProF = "" ;
      ZZ1525HisProKgr = DecimalUtil.ZERO ;
      ZZ1526HisProMtr = DecimalUtil.ZERO ;
      ZZ2504HisProCod = "" ;
      ZZ3610HisProLot = "" ;
      ZZ5339HisProBan = "" ;
      ZZ392DisUniMed = "" ;
      ZZ1280BarMla = DecimalUtil.ZERO ;
      ZZ1279BarKla = DecimalUtil.ZERO ;
      ZZ13893FaseDescri = "" ;
      ZZ13892GruOpeCodN = "" ;
      ZZ131BarCodParV = "" ;
      ZZ307CodFas = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      T01QI51_A396EmprCod = new String[] {""} ;
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lhipro__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lhipro__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lhipro__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lhipro__default(),
         new Object[] {
             new Object[] {
            T01QI2_A561HisProLin, T01QI2_A194BarOrdLin, T01QI2_A461Fase, T01QI2_A568HisProUni, T01QI2_A566HisProTur, T01QI2_A560HisProHin, T01QI2_A563HisProMin, T01QI2_A559HisProHfi, T01QI2_A562HisProMfi, T01QI2_A557HisProF,
            T01QI2_A565HisProTte, T01QI2_A543HisBarTip, T01QI2_A556HisProEst, T01QI2_A1525HisProKgr, T01QI2_A1526HisProMtr, T01QI2_A2247HisProTip, T01QI2_A2504HisProCod, T01QI2_A3610HisProLot, T01QI2_A3611HisProTc, T01QI2_A3612HisProReo,
            T01QI2_A4439HisProBot, T01QI2_A4704HisProNPar, T01QI2_A4714HisProNpzs, T01QI2_A5339HisProBan, T01QI2_A396EmprCod, T01QI2_A503GruOpeCod, T01QI2_A602MaqCod, T01QI2_A558HisProFec, T01QI2_A129BarCod, T01QI2_A132BarCodReo,
            T01QI2_A130BarCodPar, T01QI2_A656ParCod, T01QI2_n656ParCod
            }
            , new Object[] {
            T01QI3_A561HisProLin, T01QI3_A194BarOrdLin, T01QI3_A461Fase, T01QI3_A568HisProUni, T01QI3_A566HisProTur, T01QI3_A560HisProHin, T01QI3_A563HisProMin, T01QI3_A559HisProHfi, T01QI3_A562HisProMfi, T01QI3_A557HisProF,
            T01QI3_A565HisProTte, T01QI3_A543HisBarTip, T01QI3_A556HisProEst, T01QI3_A1525HisProKgr, T01QI3_A1526HisProMtr, T01QI3_A2247HisProTip, T01QI3_A2504HisProCod, T01QI3_A3610HisProLot, T01QI3_A3611HisProTc, T01QI3_A3612HisProReo,
            T01QI3_A4439HisProBot, T01QI3_A4704HisProNPar, T01QI3_A4714HisProNpzs, T01QI3_A5339HisProBan, T01QI3_A396EmprCod, T01QI3_A503GruOpeCod, T01QI3_A602MaqCod, T01QI3_A558HisProFec, T01QI3_A129BarCod, T01QI3_A132BarCodReo,
            T01QI3_A130BarCodPar, T01QI3_A656ParCod, T01QI3_n656ParCod
            }
            , new Object[] {
            T01QI4_A396EmprCod
            }
            , new Object[] {
            T01QI5_A396EmprCod
            }
            , new Object[] {
            T01QI6_A361DisCod
            }
            , new Object[] {
            T01QI7_A396EmprCod
            }
            , new Object[] {
            T01QI8_A392DisUniMed
            }
            , new Object[] {
            T01QI10_A307CodFas, T01QI10_n307CodFas
            }
            , new Object[] {
            T01QI12_A462FasEst, T01QI12_n462FasEst
            }
            , new Object[] {
            T01QI14_A1280BarMla, T01QI14_A1279BarKla
            }
            , new Object[] {
            T01QI16_A361DisCod, T01QI16_A561HisProLin, T01QI16_A194BarOrdLin, T01QI16_A461Fase, T01QI16_A568HisProUni, T01QI16_A566HisProTur, T01QI16_A560HisProHin, T01QI16_A563HisProMin, T01QI16_A559HisProHfi, T01QI16_A562HisProMfi,
            T01QI16_A557HisProF, T01QI16_A565HisProTte, T01QI16_A543HisBarTip, T01QI16_A556HisProEst, T01QI16_A1525HisProKgr, T01QI16_A1526HisProMtr, T01QI16_A2247HisProTip, T01QI16_A2504HisProCod, T01QI16_A3610HisProLot, T01QI16_A3611HisProTc,
            T01QI16_A3612HisProReo, T01QI16_A4439HisProBot, T01QI16_A4704HisProNPar, T01QI16_A4714HisProNpzs, T01QI16_A392DisUniMed, T01QI16_A5339HisProBan, T01QI16_A396EmprCod, T01QI16_A503GruOpeCod, T01QI16_A602MaqCod, T01QI16_A558HisProFec,
            T01QI16_A129BarCod, T01QI16_n129BarCod, T01QI16_A132BarCodReo, T01QI16_n132BarCodReo, T01QI16_A130BarCodPar, T01QI16_n130BarCodPar, T01QI16_A656ParCod, T01QI16_n656ParCod, T01QI16_A1280BarMla, T01QI16_A1279BarKla
            }
            , new Object[] {
            T01QI17_A396EmprCod
            }
            , new Object[] {
            T01QI18_A361DisCod
            }
            , new Object[] {
            T01QI19_A396EmprCod
            }
            , new Object[] {
            T01QI20_A392DisUniMed
            }
            , new Object[] {
            T01QI22_A1280BarMla, T01QI22_A1279BarKla
            }
            , new Object[] {
            T01QI23_A396EmprCod
            }
            , new Object[] {
            T01QI25_A307CodFas, T01QI25_n307CodFas
            }
            , new Object[] {
            T01QI27_A462FasEst, T01QI27_n462FasEst
            }
            , new Object[] {
            T01QI28_A396EmprCod, T01QI28_A602MaqCod, T01QI28_A558HisProFec, T01QI28_A561HisProLin
            }
            , new Object[] {
            T01QI29_A561HisProLin, T01QI29_A396EmprCod, T01QI29_A602MaqCod, T01QI29_A558HisProFec
            }
            , new Object[] {
            T01QI30_A561HisProLin, T01QI30_A396EmprCod, T01QI30_A602MaqCod, T01QI30_A558HisProFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QI34_A361DisCod
            }
            , new Object[] {
            T01QI35_A392DisUniMed
            }
            , new Object[] {
            T01QI37_A1280BarMla, T01QI37_A1279BarKla
            }
            , new Object[] {
            T01QI39_A307CodFas, T01QI39_n307CodFas
            }
            , new Object[] {
            T01QI41_A462FasEst, T01QI41_n462FasEst
            }
            , new Object[] {
            T01QI42_A396EmprCod, T01QI42_A602MaqCod, T01QI42_A558HisProFec, T01QI42_A561HisProLin, T01QI42_A10501Peh_cod
            }
            , new Object[] {
            T01QI43_A396EmprCod, T01QI43_A602MaqCod, T01QI43_A558HisProFec, T01QI43_A561HisProLin, T01QI43_A10495Emh_cod
            }
            , new Object[] {
            T01QI44_A396EmprCod, T01QI44_A602MaqCod, T01QI44_A558HisProFec, T01QI44_A561HisProLin, T01QI44_A10487Cah_cod
            }
            , new Object[] {
            T01QI45_A396EmprCod, T01QI45_A602MaqCod, T01QI45_A558HisProFec, T01QI45_A561HisProLin, T01QI45_A10486Abh_cod
            }
            , new Object[] {
            T01QI46_A396EmprCod, T01QI46_A602MaqCod, T01QI46_A558HisProFec, T01QI46_A561HisProLin, T01QI46_A10090HisProCP
            }
            , new Object[] {
            T01QI47_A396EmprCod, T01QI47_A602MaqCod, T01QI47_A558HisProFec, T01QI47_A561HisProLin, T01QI47_A3047LOParId
            }
            , new Object[] {
            T01QI48_A396EmprCod, T01QI48_A602MaqCod, T01QI48_A558HisProFec, T01QI48_A561HisProLin
            }
            , new Object[] {
            T01QI49_A396EmprCod
            }
            , new Object[] {
            T01QI50_A396EmprCod
            }
            , new Object[] {
            T01QI51_A396EmprCod
            }
         }
      );
   }

   private byte Z566HisProTur ;
   private byte Z560HisProHin ;
   private byte Z563HisProMin ;
   private byte Z559HisProHfi ;
   private byte Z562HisProMfi ;
   private byte Z543HisBarTip ;
   private byte Z556HisProEst ;
   private byte Z3611HisProTc ;
   private byte Z3612HisProReo ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A133BarCodReoV ;
   private byte nKeyPressed ;
   private byte A462FasEst ;
   private byte A566HisProTur ;
   private byte A560HisProHin ;
   private byte A563HisProMin ;
   private byte A559HisProHfi ;
   private byte A562HisProMfi ;
   private byte A543HisBarTip ;
   private byte A556HisProEst ;
   private byte A3611HisProTc ;
   private byte A3612HisProReo ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte Z133BarCodReoV ;
   private byte Z462FasEst ;
   private byte ZZ132BarCodReo ;
   private byte ZZ566HisProTur ;
   private byte ZZ560HisProHin ;
   private byte ZZ563HisProMin ;
   private byte ZZ559HisProHfi ;
   private byte ZZ562HisProMfi ;
   private byte ZZ543HisBarTip ;
   private byte ZZ556HisProEst ;
   private byte ZZ3611HisProTc ;
   private byte ZZ3612HisProReo ;
   private byte ZZ133BarCodReoV ;
   private byte ZZ462FasEst ;
   private short Z194BarOrdLin ;
   private short Z565HisProTte ;
   private short Z2247HisProTip ;
   private short Z4714HisProNpzs ;
   private short Z656ParCod ;
   private short A656ParCod ;
   private short A195BarOrdLinV ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A194BarOrdLin ;
   private short A564HisProTre ;
   private short A565HisProTte ;
   private short A2247HisProTip ;
   private short A4714HisProNpzs ;
   private short RcdFound59 ;
   private short nIsDirty_59 ;
   private short Z195BarOrdLinV ;
   private short Z564HisProTre ;
   private short ZZ194BarOrdLin ;
   private short ZZ656ParCod ;
   private short ZZ565HisProTte ;
   private short ZZ2247HisProTip ;
   private short ZZ4714HisProNpzs ;
   private short ZZ195BarOrdLinV ;
   private short ZZ564HisProTre ;
   private int Z561HisProLin ;
   private int Z4439HisProBot ;
   private int Z4704HisProNPar ;
   private int Z503GruOpeCod ;
   private int Z129BarCod ;
   private int A503GruOpeCod ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A561HisProLin ;
   private int A134BarCodVir ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtHisProFec_Enabled ;
   private int edtHisProLin_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodVir_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodReoV_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarCodParV_Enabled ;
   private int edtBarOrdLin_Enabled ;
   private int edtBarOrdLinV_Enabled ;
   private int edtFasEst_Enabled ;
   private int edtCodFas_Enabled ;
   private int edtFase_Enabled ;
   private int edtHisProUni_Enabled ;
   private int edtHisProTur_Enabled ;
   private int edtHisProHin_Enabled ;
   private int edtHisProMin_Enabled ;
   private int edtHisProHfi_Enabled ;
   private int edtHisProMfi_Enabled ;
   private int edtHisProF_Enabled ;
   private int edtParCod_Enabled ;
   private int edtHisProTre_Enabled ;
   private int edtHisProTte_Enabled ;
   private int edtHisBarTip_Enabled ;
   private int edtHisProEst_Enabled ;
   private int edtHisProKgr_Enabled ;
   private int edtHisProMtr_Enabled ;
   private int edtHisProTip_Enabled ;
   private int edtHisProCod_Enabled ;
   private int edtBarMla_Enabled ;
   private int edtBarKla_Enabled ;
   private int edtHisProLot_Enabled ;
   private int edtHisProTc_Enabled ;
   private int edtHisProReo_Enabled ;
   private int A4439HisProBot ;
   private int edtHisProBot_Enabled ;
   private int A4704HisProNPar ;
   private int edtHisProNPar_Enabled ;
   private int edtHisProNpzs_Enabled ;
   private int edtDisUniMed_Enabled ;
   private int edtHisProBan_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int idxLst ;
   private int Z134BarCodVir ;
   private int ZZ561HisProLin ;
   private int ZZ129BarCod ;
   private int ZZ503GruOpeCod ;
   private int ZZ4439HisProBot ;
   private int ZZ4704HisProNPar ;
   private int ZZ361DisCod ;
   private int ZZ134BarCodVir ;
   private java.math.BigDecimal Z568HisProUni ;
   private java.math.BigDecimal Z1525HisProKgr ;
   private java.math.BigDecimal Z1526HisProMtr ;
   private java.math.BigDecimal A568HisProUni ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A1280BarMla ;
   private java.math.BigDecimal A1279BarKla ;
   private java.math.BigDecimal Z1280BarMla ;
   private java.math.BigDecimal Z1279BarKla ;
   private java.math.BigDecimal ZZ568HisProUni ;
   private java.math.BigDecimal ZZ1525HisProKgr ;
   private java.math.BigDecimal ZZ1526HisProMtr ;
   private java.math.BigDecimal ZZ1280BarMla ;
   private java.math.BigDecimal ZZ1279BarKla ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z461Fase ;
   private String Z557HisProF ;
   private String Z2504HisProCod ;
   private String Z3610HisProLot ;
   private String Z5339HisProBan ;
   private String Z130BarCodPar ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A461Fase ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A131BarCodParV ;
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
   private String edtMaqCod_Internalname ;
   private String edtMaqCod_Jsonclick ;
   private String edtHisProFec_Internalname ;
   private String edtHisProFec_Jsonclick ;
   private String edtHisProLin_Internalname ;
   private String edtHisProLin_Jsonclick ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodVir_Internalname ;
   private String edtBarCodVir_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodReoV_Internalname ;
   private String edtBarCodReoV_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarCodParV_Internalname ;
   private String edtBarCodParV_Jsonclick ;
   private String edtBarOrdLin_Internalname ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtBarOrdLinV_Internalname ;
   private String edtBarOrdLinV_Jsonclick ;
   private String edtFasEst_Internalname ;
   private String edtFasEst_Jsonclick ;
   private String edtCodFas_Internalname ;
   private String A307CodFas ;
   private String edtCodFas_Jsonclick ;
   private String edtFase_Internalname ;
   private String edtFase_Jsonclick ;
   private String edtHisProUni_Internalname ;
   private String edtHisProUni_Jsonclick ;
   private String edtHisProTur_Internalname ;
   private String edtHisProTur_Jsonclick ;
   private String edtHisProHin_Internalname ;
   private String edtHisProHin_Jsonclick ;
   private String edtHisProMin_Internalname ;
   private String edtHisProMin_Jsonclick ;
   private String edtHisProHfi_Internalname ;
   private String edtHisProHfi_Jsonclick ;
   private String edtHisProMfi_Internalname ;
   private String edtHisProMfi_Jsonclick ;
   private String edtHisProF_Internalname ;
   private String A557HisProF ;
   private String edtHisProF_Jsonclick ;
   private String edtParCod_Internalname ;
   private String edtParCod_Jsonclick ;
   private String edtHisProTre_Internalname ;
   private String edtHisProTre_Jsonclick ;
   private String edtHisProTte_Internalname ;
   private String edtHisProTte_Jsonclick ;
   private String edtHisBarTip_Internalname ;
   private String edtHisBarTip_Jsonclick ;
   private String edtHisProEst_Internalname ;
   private String edtHisProEst_Jsonclick ;
   private String edtHisProKgr_Internalname ;
   private String edtHisProKgr_Jsonclick ;
   private String edtHisProMtr_Internalname ;
   private String edtHisProMtr_Jsonclick ;
   private String edtHisProTip_Internalname ;
   private String edtHisProTip_Jsonclick ;
   private String edtHisProCod_Internalname ;
   private String A2504HisProCod ;
   private String edtHisProCod_Jsonclick ;
   private String edtBarMla_Internalname ;
   private String edtBarMla_Jsonclick ;
   private String edtBarKla_Internalname ;
   private String edtBarKla_Jsonclick ;
   private String edtHisProLot_Internalname ;
   private String A3610HisProLot ;
   private String edtHisProLot_Jsonclick ;
   private String edtHisProTc_Internalname ;
   private String edtHisProTc_Jsonclick ;
   private String edtHisProReo_Internalname ;
   private String edtHisProReo_Jsonclick ;
   private String edtHisProBot_Internalname ;
   private String edtHisProBot_Jsonclick ;
   private String edtHisProNPar_Internalname ;
   private String edtHisProNPar_Jsonclick ;
   private String edtHisProNpzs_Internalname ;
   private String edtHisProNpzs_Jsonclick ;
   private String edtDisUniMed_Internalname ;
   private String A392DisUniMed ;
   private String edtDisUniMed_Jsonclick ;
   private String edtHisProBan_Internalname ;
   private String A5339HisProBan ;
   private String edtHisProBan_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String A13893FaseDescri ;
   private String A13892GruOpeCodN ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z392DisUniMed ;
   private String sMode59 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z13893FaseDescri ;
   private String Z13892GruOpeCodN ;
   private String Z131BarCodParV ;
   private String Z307CodFas ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ130BarCodPar ;
   private String ZZ461Fase ;
   private String ZZ557HisProF ;
   private String ZZ2504HisProCod ;
   private String ZZ3610HisProLot ;
   private String ZZ5339HisProBan ;
   private String ZZ392DisUniMed ;
   private String ZZ13893FaseDescri ;
   private String ZZ13892GruOpeCodN ;
   private String ZZ131BarCodParV ;
   private String ZZ307CodFas ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private java.util.Date Z558HisProFec ;
   private java.util.Date A558HisProFec ;
   private java.util.Date ZZ558HisProFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n656ParCod ;
   private boolean n602MaqCod ;
   private boolean wbErr ;
   private boolean n462FasEst ;
   private boolean n307CodFas ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] T01QI16_A361DisCod ;
   private int[] T01QI16_A561HisProLin ;
   private short[] T01QI16_A194BarOrdLin ;
   private String[] T01QI16_A461Fase ;
   private java.math.BigDecimal[] T01QI16_A568HisProUni ;
   private byte[] T01QI16_A566HisProTur ;
   private byte[] T01QI16_A560HisProHin ;
   private byte[] T01QI16_A563HisProMin ;
   private byte[] T01QI16_A559HisProHfi ;
   private byte[] T01QI16_A562HisProMfi ;
   private String[] T01QI16_A557HisProF ;
   private short[] T01QI16_A565HisProTte ;
   private byte[] T01QI16_A543HisBarTip ;
   private byte[] T01QI16_A556HisProEst ;
   private java.math.BigDecimal[] T01QI16_A1525HisProKgr ;
   private java.math.BigDecimal[] T01QI16_A1526HisProMtr ;
   private short[] T01QI16_A2247HisProTip ;
   private String[] T01QI16_A2504HisProCod ;
   private String[] T01QI16_A3610HisProLot ;
   private byte[] T01QI16_A3611HisProTc ;
   private byte[] T01QI16_A3612HisProReo ;
   private int[] T01QI16_A4439HisProBot ;
   private int[] T01QI16_A4704HisProNPar ;
   private short[] T01QI16_A4714HisProNpzs ;
   private String[] T01QI16_A392DisUniMed ;
   private String[] T01QI16_A5339HisProBan ;
   private String[] T01QI16_A396EmprCod ;
   private int[] T01QI16_A503GruOpeCod ;
   private String[] T01QI16_A602MaqCod ;
   private boolean[] T01QI16_n602MaqCod ;
   private java.util.Date[] T01QI16_A558HisProFec ;
   private int[] T01QI16_A129BarCod ;
   private boolean[] T01QI16_n129BarCod ;
   private byte[] T01QI16_A132BarCodReo ;
   private boolean[] T01QI16_n132BarCodReo ;
   private String[] T01QI16_A130BarCodPar ;
   private boolean[] T01QI16_n130BarCodPar ;
   private short[] T01QI16_A656ParCod ;
   private boolean[] T01QI16_n656ParCod ;
   private java.math.BigDecimal[] T01QI16_A1280BarMla ;
   private java.math.BigDecimal[] T01QI16_A1279BarKla ;
   private String[] T01QI10_A307CodFas ;
   private boolean[] T01QI10_n307CodFas ;
   private byte[] T01QI12_A462FasEst ;
   private boolean[] T01QI12_n462FasEst ;
   private String[] T01QI4_A396EmprCod ;
   private int[] T01QI6_A361DisCod ;
   private String[] T01QI7_A396EmprCod ;
   private String[] T01QI8_A392DisUniMed ;
   private java.math.BigDecimal[] T01QI14_A1280BarMla ;
   private java.math.BigDecimal[] T01QI14_A1279BarKla ;
   private String[] T01QI5_A396EmprCod ;
   private String[] T01QI17_A396EmprCod ;
   private int[] T01QI18_A361DisCod ;
   private String[] T01QI19_A396EmprCod ;
   private String[] T01QI20_A392DisUniMed ;
   private java.math.BigDecimal[] T01QI22_A1280BarMla ;
   private java.math.BigDecimal[] T01QI22_A1279BarKla ;
   private String[] T01QI23_A396EmprCod ;
   private String[] T01QI25_A307CodFas ;
   private boolean[] T01QI25_n307CodFas ;
   private byte[] T01QI27_A462FasEst ;
   private boolean[] T01QI27_n462FasEst ;
   private String[] T01QI28_A396EmprCod ;
   private String[] T01QI28_A602MaqCod ;
   private boolean[] T01QI28_n602MaqCod ;
   private java.util.Date[] T01QI28_A558HisProFec ;
   private int[] T01QI28_A561HisProLin ;
   private int[] T01QI3_A561HisProLin ;
   private short[] T01QI3_A194BarOrdLin ;
   private String[] T01QI3_A461Fase ;
   private java.math.BigDecimal[] T01QI3_A568HisProUni ;
   private byte[] T01QI3_A566HisProTur ;
   private byte[] T01QI3_A560HisProHin ;
   private byte[] T01QI3_A563HisProMin ;
   private byte[] T01QI3_A559HisProHfi ;
   private byte[] T01QI3_A562HisProMfi ;
   private String[] T01QI3_A557HisProF ;
   private short[] T01QI3_A565HisProTte ;
   private byte[] T01QI3_A543HisBarTip ;
   private byte[] T01QI3_A556HisProEst ;
   private java.math.BigDecimal[] T01QI3_A1525HisProKgr ;
   private java.math.BigDecimal[] T01QI3_A1526HisProMtr ;
   private short[] T01QI3_A2247HisProTip ;
   private String[] T01QI3_A2504HisProCod ;
   private String[] T01QI3_A3610HisProLot ;
   private byte[] T01QI3_A3611HisProTc ;
   private byte[] T01QI3_A3612HisProReo ;
   private int[] T01QI3_A4439HisProBot ;
   private int[] T01QI3_A4704HisProNPar ;
   private short[] T01QI3_A4714HisProNpzs ;
   private String[] T01QI3_A5339HisProBan ;
   private String[] T01QI3_A396EmprCod ;
   private int[] T01QI3_A503GruOpeCod ;
   private String[] T01QI3_A602MaqCod ;
   private boolean[] T01QI3_n602MaqCod ;
   private java.util.Date[] T01QI3_A558HisProFec ;
   private int[] T01QI3_A129BarCod ;
   private boolean[] T01QI3_n129BarCod ;
   private byte[] T01QI3_A132BarCodReo ;
   private boolean[] T01QI3_n132BarCodReo ;
   private String[] T01QI3_A130BarCodPar ;
   private boolean[] T01QI3_n130BarCodPar ;
   private short[] T01QI3_A656ParCod ;
   private boolean[] T01QI3_n656ParCod ;
   private int[] T01QI29_A561HisProLin ;
   private String[] T01QI29_A396EmprCod ;
   private String[] T01QI29_A602MaqCod ;
   private boolean[] T01QI29_n602MaqCod ;
   private java.util.Date[] T01QI29_A558HisProFec ;
   private int[] T01QI30_A561HisProLin ;
   private String[] T01QI30_A396EmprCod ;
   private String[] T01QI30_A602MaqCod ;
   private boolean[] T01QI30_n602MaqCod ;
   private java.util.Date[] T01QI30_A558HisProFec ;
   private int[] T01QI2_A561HisProLin ;
   private short[] T01QI2_A194BarOrdLin ;
   private String[] T01QI2_A461Fase ;
   private java.math.BigDecimal[] T01QI2_A568HisProUni ;
   private byte[] T01QI2_A566HisProTur ;
   private byte[] T01QI2_A560HisProHin ;
   private byte[] T01QI2_A563HisProMin ;
   private byte[] T01QI2_A559HisProHfi ;
   private byte[] T01QI2_A562HisProMfi ;
   private String[] T01QI2_A557HisProF ;
   private short[] T01QI2_A565HisProTte ;
   private byte[] T01QI2_A543HisBarTip ;
   private byte[] T01QI2_A556HisProEst ;
   private java.math.BigDecimal[] T01QI2_A1525HisProKgr ;
   private java.math.BigDecimal[] T01QI2_A1526HisProMtr ;
   private short[] T01QI2_A2247HisProTip ;
   private String[] T01QI2_A2504HisProCod ;
   private String[] T01QI2_A3610HisProLot ;
   private byte[] T01QI2_A3611HisProTc ;
   private byte[] T01QI2_A3612HisProReo ;
   private int[] T01QI2_A4439HisProBot ;
   private int[] T01QI2_A4704HisProNPar ;
   private short[] T01QI2_A4714HisProNpzs ;
   private String[] T01QI2_A5339HisProBan ;
   private String[] T01QI2_A396EmprCod ;
   private int[] T01QI2_A503GruOpeCod ;
   private String[] T01QI2_A602MaqCod ;
   private boolean[] T01QI2_n602MaqCod ;
   private java.util.Date[] T01QI2_A558HisProFec ;
   private int[] T01QI2_A129BarCod ;
   private boolean[] T01QI2_n129BarCod ;
   private byte[] T01QI2_A132BarCodReo ;
   private boolean[] T01QI2_n132BarCodReo ;
   private String[] T01QI2_A130BarCodPar ;
   private boolean[] T01QI2_n130BarCodPar ;
   private short[] T01QI2_A656ParCod ;
   private boolean[] T01QI2_n656ParCod ;
   private int[] T01QI34_A361DisCod ;
   private String[] T01QI35_A392DisUniMed ;
   private java.math.BigDecimal[] T01QI37_A1280BarMla ;
   private java.math.BigDecimal[] T01QI37_A1279BarKla ;
   private String[] T01QI39_A307CodFas ;
   private boolean[] T01QI39_n307CodFas ;
   private byte[] T01QI41_A462FasEst ;
   private boolean[] T01QI41_n462FasEst ;
   private String[] T01QI42_A396EmprCod ;
   private String[] T01QI42_A602MaqCod ;
   private boolean[] T01QI42_n602MaqCod ;
   private java.util.Date[] T01QI42_A558HisProFec ;
   private int[] T01QI42_A561HisProLin ;
   private String[] T01QI42_A10501Peh_cod ;
   private String[] T01QI43_A396EmprCod ;
   private String[] T01QI43_A602MaqCod ;
   private boolean[] T01QI43_n602MaqCod ;
   private java.util.Date[] T01QI43_A558HisProFec ;
   private int[] T01QI43_A561HisProLin ;
   private String[] T01QI43_A10495Emh_cod ;
   private String[] T01QI44_A396EmprCod ;
   private String[] T01QI44_A602MaqCod ;
   private boolean[] T01QI44_n602MaqCod ;
   private java.util.Date[] T01QI44_A558HisProFec ;
   private int[] T01QI44_A561HisProLin ;
   private String[] T01QI44_A10487Cah_cod ;
   private String[] T01QI45_A396EmprCod ;
   private String[] T01QI45_A602MaqCod ;
   private boolean[] T01QI45_n602MaqCod ;
   private java.util.Date[] T01QI45_A558HisProFec ;
   private int[] T01QI45_A561HisProLin ;
   private String[] T01QI45_A10486Abh_cod ;
   private String[] T01QI46_A396EmprCod ;
   private String[] T01QI46_A602MaqCod ;
   private boolean[] T01QI46_n602MaqCod ;
   private java.util.Date[] T01QI46_A558HisProFec ;
   private int[] T01QI46_A561HisProLin ;
   private String[] T01QI46_A10090HisProCP ;
   private String[] T01QI47_A396EmprCod ;
   private String[] T01QI47_A602MaqCod ;
   private boolean[] T01QI47_n602MaqCod ;
   private java.util.Date[] T01QI47_A558HisProFec ;
   private int[] T01QI47_A561HisProLin ;
   private String[] T01QI47_A3047LOParId ;
   private String[] T01QI48_A396EmprCod ;
   private String[] T01QI48_A602MaqCod ;
   private boolean[] T01QI48_n602MaqCod ;
   private java.util.Date[] T01QI48_A558HisProFec ;
   private int[] T01QI48_A561HisProLin ;
   private String[] T01QI49_A396EmprCod ;
   private String[] T01QI50_A396EmprCod ;
   private String[] T01QI51_A396EmprCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class lhipro__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lhipro__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lhipro__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lhipro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QI2", "SELECT HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, EmprCod, GruOpeCod, MaqCod, HisProFec, BarCod, BarCodReo, BarCodPar, ParCod FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?  FOR UPDATE OF BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, GruOpeCod, BarCod, BarCodReo, BarCodPar, ParCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI3", "SELECT HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, EmprCod, GruOpeCod, MaqCod, HisProFec, BarCod, BarCodReo, BarCodPar, ParCod FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI4", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI5", "SELECT EmprCod FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI6", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI7", "SELECT EmprCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI8", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI10", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM ((TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) LEFT JOIN TXPCHIPRO T4 ON T4.EmprCod = T2.EmprCod AND T4.MaqCod = T2.MaqCod AND T4.HisProFec = T3.HisProFec) WHERE (T2.EmprCod = T4.EmprCod) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI12", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod, T4.HisProFec, T4.HisProLin FROM (((TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) LEFT JOIN TXPLHIPRO T4 ON T4.MaqCod = T3.MaqCod) LEFT JOIN TXPCHIPRO T5 ON T5.EmprCod = T2.EmprCod AND T5.MaqCod = T3.MaqCod AND T5.HisProFec = T4.HisProFec) WHERE (T2.EmprCod = T5.EmprCod) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod, T4.HisProFec, T4.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI14", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI16", "SELECT /*+ FIRST_ROWS(100) */ T2.DisCod, TM1.HisProLin, TM1.BarOrdLin, TM1.Fase, TM1.HisProUni, TM1.HisProTur, TM1.HisProHin, TM1.HisProMin, TM1.HisProHfi, TM1.HisProMfi, TM1.HisProF, TM1.HisProTte, TM1.HisBarTip, TM1.HisProEst, TM1.HisProKgr, TM1.HisProMtr, TM1.HisProTip, TM1.HisProCod, TM1.HisProLot, TM1.HisProTc, TM1.HisProReo, TM1.HisProBot, TM1.HisProNPar, TM1.HisProNpzs, T3.DisUniMed, TM1.HisProBan, TM1.EmprCod, TM1.GruOpeCod, TM1.MaqCod, TM1.HisProFec, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ParCod, COALESCE( T4.BarMla, 0) AS BarMla, COALESCE( T4.BarKla, 0) AS BarKla FROM (((TXPLHIPRO TM1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = TM1.EmprCod AND T2.BarCod = TM1.BarCod AND T2.BarCodReo = TM1.BarCodReo AND T2.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T3 ON T3.EmprCod = TM1.EmprCod AND T3.DisCod = T2.DisCod) LEFT JOIN (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = TM1.EmprCod AND T4.BarCod = TM1.BarCod AND T4.BarCodReo = TM1.BarCodReo AND T4.BarCodPar = TM1.BarCodPar) WHERE TM1.HisProLin = ? and TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.HisProFec = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.HisProFec, TM1.HisProLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI17", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI18", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI19", "SELECT EmprCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI20", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI22", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI23", "SELECT EmprCod FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI25", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM ((TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) LEFT JOIN TXPCHIPRO T4 ON T4.EmprCod = T2.EmprCod AND T4.MaqCod = T2.MaqCod AND T4.HisProFec = T3.HisProFec) WHERE (T2.EmprCod = T4.EmprCod) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI27", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod, T4.HisProFec, T4.HisProLin FROM (((TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) LEFT JOIN TXPLHIPRO T4 ON T4.MaqCod = T3.MaqCod) LEFT JOIN TXPCHIPRO T5 ON T5.EmprCod = T2.EmprCod AND T5.MaqCod = T3.MaqCod AND T5.HisProFec = T4.HisProFec) WHERE (T2.EmprCod = T5.EmprCod) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod, T4.HisProFec, T4.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI28", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI29", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ HisProLin, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE ( HisProLin > ? or HisProLin = ? and EmprCod > ? or EmprCod = ? and HisProLin = ? and MaqCod > ? or MaqCod = ? and EmprCod = ? and HisProLin = ? and HisProFec > ?) ORDER BY EmprCod, MaqCod, HisProFec, HisProLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QI30", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ HisProLin, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE ( HisProLin < ? or HisProLin = ? and EmprCod < ? or EmprCod = ? and HisProLin = ? and MaqCod < ? or MaqCod = ? and EmprCod = ? and HisProLin = ? and HisProFec < ?) ORDER BY EmprCod DESC, MaqCod DESC, HisProFec DESC, HisProLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QI31", "INSERT INTO TXPLHIPRO(HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, EmprCod, GruOpeCod, MaqCod, HisProFec, BarCod, BarCodReo, BarCodPar, ParCod, HisProDTI, HisProDTF, HisProDR, HisProDi, HisProHi, HisProDf, HisProHf, EstPecas, HisproTdab, HisproNPd, HisProCtr, HisproGf, HisHhMaq, HisHhIni, HisProMq, HisProFd, HisProDibC, HisProDibI, HisProCom, HisProFon, HisProMtHd, HisProKgHd, HisProPzHd, Hisprosec, HisproMtsI, HisProAncI, HisProMtsF, HisProAncF, HisProResi, HisProResA, HisProNFus, HisproFuso, HisProNSup, HisProPsop, HisProTipC, HisproTara) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0)", GX_NOMASK, "TXPLHIPRO")
         ,new UpdateCursor("T01QI32", "UPDATE TXPLHIPRO SET BarOrdLin=?, Fase=?, HisProUni=?, HisProTur=?, HisProHin=?, HisProMin=?, HisProHfi=?, HisProMfi=?, HisProF=?, HisProTte=?, HisBarTip=?, HisProEst=?, HisProKgr=?, HisProMtr=?, HisProTip=?, HisProCod=?, HisProLot=?, HisProTc=?, HisProReo=?, HisProBot=?, HisProNPar=?, HisProNpzs=?, HisProBan=?, GruOpeCod=?, BarCod=?, BarCodReo=?, BarCodPar=?, ParCod=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK, "TXPLHIPRO")
         ,new UpdateCursor("T01QI33", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK, "TXPLHIPRO")
         ,new ForEachCursor("T01QI34", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI35", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI37", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI39", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM ((TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) LEFT JOIN TXPCHIPRO T4 ON T4.EmprCod = T2.EmprCod AND T4.MaqCod = T2.MaqCod AND T4.HisProFec = T3.HisProFec) WHERE (T2.EmprCod = T4.EmprCod) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI41", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod, T4.HisProFec, T4.HisProLin FROM (((TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) LEFT JOIN TXPLHIPRO T4 ON T4.MaqCod = T3.MaqCod) LEFT JOIN TXPCHIPRO T5 ON T5.EmprCod = T2.EmprCod AND T5.MaqCod = T3.MaqCod AND T5.HisProFec = T4.HisProFec) WHERE (T2.EmprCod = T5.EmprCod) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod, T4.HisProFec, T4.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI42", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Peh_cod FROM TXPCAPE00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QI43", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Emh_cod FROM TXPCAEM00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QI44", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Cah_cod FROM TXPCALA00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QI45", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod FROM TXPCAAB00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QI46", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, HisProCP FROM TXPHISPZS WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QI47", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, LOParId FROM TXPLOHisP WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QI48", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI49", "SELECT EmprCod FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI50", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QI51", "SELECT EmprCod FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 15);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 6);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(28);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 1);
               ((short[]) buf[31])[0] = rslt.getShort(32);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[15])[0] = rslt.getShort(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 8);
               ((String[]) buf[17])[0] = rslt.getString(18, 10);
               ((byte[]) buf[18])[0] = rslt.getByte(19);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((int[]) buf[20])[0] = rslt.getInt(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((short[]) buf[22])[0] = rslt.getShort(23);
               ((String[]) buf[23])[0] = rslt.getString(24, 15);
               ((String[]) buf[24])[0] = rslt.getString(25, 3);
               ((int[]) buf[25])[0] = rslt.getInt(26);
               ((String[]) buf[26])[0] = rslt.getString(27, 6);
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(28);
               ((int[]) buf[28])[0] = rslt.getInt(29);
               ((byte[]) buf[29])[0] = rslt.getByte(30);
               ((String[]) buf[30])[0] = rslt.getString(31, 1);
               ((short[]) buf[31])[0] = rslt.getShort(32);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 10 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               ((byte[]) buf[13])[0] = rslt.getByte(14);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(16,2);
               ((short[]) buf[16])[0] = rslt.getShort(17);
               ((String[]) buf[17])[0] = rslt.getString(18, 8);
               ((String[]) buf[18])[0] = rslt.getString(19, 10);
               ((byte[]) buf[19])[0] = rslt.getByte(20);
               ((byte[]) buf[20])[0] = rslt.getByte(21);
               ((int[]) buf[21])[0] = rslt.getInt(22);
               ((int[]) buf[22])[0] = rslt.getInt(23);
               ((short[]) buf[23])[0] = rslt.getShort(24);
               ((String[]) buf[24])[0] = rslt.getString(25, 1);
               ((String[]) buf[25])[0] = rslt.getString(26, 15);
               ((String[]) buf[26])[0] = rslt.getString(27, 3);
               ((int[]) buf[27])[0] = rslt.getInt(28);
               ((String[]) buf[28])[0] = rslt.getString(29, 6);
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDate(30);
               ((int[]) buf[30])[0] = rslt.getInt(31);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((byte[]) buf[32])[0] = rslt.getByte(32);
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getString(33, 1);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(34);
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[38])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[39])[0] = rslt.getBigDecimal(36,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 15 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 18 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 21 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 27 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 29 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 39 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 4 :
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
            case 5 :
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setDate(6, (java.util.Date)parms[6]);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               return;
            case 8 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setDate(6, (java.util.Date)parms[6]);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               return;
            case 9 :
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
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
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
            case 13 :
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
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
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
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 17 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setDate(6, (java.util.Date)parms[6]);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               return;
            case 18 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setDate(6, (java.util.Date)parms[6]);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 6);
               }
               stmt.setString(8, (String)parms[9], 3);
               stmt.setInt(9, ((Number) parms[10]).intValue());
               stmt.setDate(10, (java.util.Date)parms[11]);
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[6], 6);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 6);
               }
               stmt.setString(8, (String)parms[9], 3);
               stmt.setInt(9, ((Number) parms[10]).intValue());
               stmt.setDate(10, (java.util.Date)parms[11]);
               return;
            case 22 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 1);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setBigDecimal(15, (java.math.BigDecimal)parms[14], 2);
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setString(17, (String)parms[16], 8);
               stmt.setString(18, (String)parms[17], 10);
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setByte(20, ((Number) parms[19]).byteValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setString(24, (String)parms[23], 15);
               stmt.setString(25, (String)parms[24], 3);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[27], 6);
               }
               stmt.setDate(28, (java.util.Date)parms[28]);
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(29, ((Number) parms[30]).intValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(31, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(32, ((Number) parms[36]).shortValue());
               }
               return;
            case 23 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setByte(12, ((Number) parms[11]).byteValue());
               stmt.setBigDecimal(13, (java.math.BigDecimal)parms[12], 2);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[13], 2);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setString(16, (String)parms[15], 8);
               stmt.setString(17, (String)parms[16], 10);
               stmt.setByte(18, ((Number) parms[17]).byteValue());
               stmt.setByte(19, ((Number) parms[18]).byteValue());
               stmt.setInt(20, ((Number) parms[19]).intValue());
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setString(23, (String)parms[22], 15);
               stmt.setInt(24, ((Number) parms[23]).intValue());
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(25, ((Number) parms[25]).intValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(26, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(27, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(28, ((Number) parms[31]).shortValue());
               }
               stmt.setString(29, (String)parms[32], 3);
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(30, (String)parms[34], 6);
               }
               stmt.setDate(31, (java.util.Date)parms[35]);
               stmt.setInt(32, ((Number) parms[36]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 25 :
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
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 27 :
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
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setDate(6, (java.util.Date)parms[6]);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[5], 6);
               }
               stmt.setDate(6, (java.util.Date)parms[6]);
               stmt.setInt(7, ((Number) parms[7]).intValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 39 :
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

