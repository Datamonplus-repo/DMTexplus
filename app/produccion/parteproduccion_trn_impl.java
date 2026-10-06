package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class parteproduccion_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel1"+"_"+"GRUOPECOD_") == 0 )
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
         gx1asagruopecod_1SB59( A396EmprCod, A503GruOpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"FASE_DSC") == 0 )
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
         gx2asafase_dsc1SB59( A396EmprCod, A461Fase) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
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
         gxload_10( A396EmprCod, A503GruOpeCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
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
         gxload_13( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
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
         gxload_14( A396EmprCod, A656ParCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
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
         gxload_15( A396EmprCod, A361DisCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_18") == 0 )
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
         gxload_18( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.GetPar( "MaqCod") ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A602MaqCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
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
         gxload_12( A396EmprCod, A602MaqCod, A558HisProFec) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
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
         gxload_16( A602MaqCod, A558HisProFec, A561HisProLin, A134BarCodVir, A133BarCodReoV, A131BarCodParV, A195BarOrdLinV) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
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
         gxload_17( A602MaqCod, A558HisProFec, A561HisProLin, A134BarCodVir, A133BarCodReoV, A131BarCodParV, A195BarOrdLinV) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Parte Produccion", ""), (short)(0)) ;
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

   public parteproduccion_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public parteproduccion_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( parteproduccion_trn_impl.class ));
   }

   public parteproduccion_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Parte Produccion", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEmprCod_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqDsc_Internalname, httpContext.getMessage( "Descripcion Maquina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProFec_Internalname, localUtil.format(A558HisProFec, "99/99/99"), localUtil.format( A558HisProFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProLin_Internalname, GXutil.ltrim( localUtil.ntoc( A561HisProLin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A561HisProLin), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProLin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProLin_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGruopecod__Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGruopecod__Internalname, httpContext.getMessage( "Operario", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGruopecod__Internalname, GXutil.rtrim( A14028Gruopecod_), GXutil.rtrim( localUtil.format( A14028Gruopecod_, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGruopecod__Jsonclick, 0, "Attribute", "", "", "", "", 1, edtGruopecod__Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFase_Dsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFase_Dsc_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFase_Dsc_Internalname, GXutil.rtrim( A14027Fase_Dsc), GXutil.rtrim( localUtil.format( A14027Fase_Dsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFase_Dsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtFase_Dsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParCodNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParCodNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtParCodNom_Internalname, GXutil.rtrim( A867ParCodNom), GXutil.rtrim( localUtil.format( A867ParCodNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParCodNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtParCodNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProDR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProDR_Internalname, httpContext.getMessage( "Aplicacion Fase, Derecho-Reves", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProDR_Internalname, GXutil.rtrim( A5522HisProDR), GXutil.rtrim( localUtil.format( A5522HisProDR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProDR_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProDR_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProDi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProDi_Internalname, httpContext.getMessage( "Dia Inicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProDi_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProDi_Internalname, localUtil.format(A5606HisProDi, "99/99/99"), localUtil.format( A5606HisProDi, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProDi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProDi_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProDi_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProDi_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProHi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProHi_Internalname, httpContext.getMessage( "Hora Inicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProHi_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProHi_Internalname, localUtil.ttoc( A5607HisProHi, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5607HisProHi, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProHi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProHi_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProHi_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProHi_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProDf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProDf_Internalname, httpContext.getMessage( "Dia Fin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProDf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProDf_Internalname, localUtil.format(A5608HisProDf, "99/99/99"), localUtil.format( A5608HisProDf, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProDf_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProDf_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProDf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProDf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProHf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProHf_Internalname, httpContext.getMessage( "Hora Fin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProHf_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProHf_Internalname, localUtil.ttoc( A5609HisProHf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5609HisProHf, "99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProHf_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProHf_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProHf_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProHf_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtEstPecas_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtEstPecas_Internalname, httpContext.getMessage( "EstPecas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEstPecas_Internalname, GXutil.rtrim( A6661EstPecas), GXutil.rtrim( localUtil.format( A6661EstPecas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEstPecas_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtEstPecas_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisproTdab_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisproTdab_Internalname, httpContext.getMessage( "Tiempo Analisis DAB", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisproTdab_Internalname, GXutil.ltrim( localUtil.ntoc( A6680HisproTdab, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisproTdab_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6680HisproTdab), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A6680HisproTdab), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisproTdab_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisproTdab_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisproNPd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisproNPd_Internalname, httpContext.getMessage( "Numeropartidas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisproNPd_Internalname, GXutil.ltrim( localUtil.ntoc( A6819HisproNPd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisproNPd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6819HisproNPd), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A6819HisproNPd), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisproNPd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisproNPd_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProCtr_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProCtr_Internalname, httpContext.getMessage( "Control Linea", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProCtr_Internalname, GXutil.rtrim( A7394HisProCtr), GXutil.rtrim( localUtil.format( A7394HisProCtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProCtr_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProCtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisproGf_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisproGf_Internalname, httpContext.getMessage( "Gran familia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisproGf_Internalname, GXutil.ltrim( localUtil.ntoc( A8566HisproGf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisproGf_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8566HisproGf), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A8566HisproGf), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisproGf_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisproGf_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisHhMaq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisHhMaq_Internalname, httpContext.getMessage( "Horas Maquina en Marcha", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisHhMaq_Internalname, GXutil.ltrim( localUtil.ntoc( A4003HisHhMaq, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisHhMaq_Enabled!=0) ? localUtil.format( A4003HisHhMaq, "ZZZZZZ9.99") : localUtil.format( A4003HisHhMaq, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisHhMaq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisHhMaq_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisHhIni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisHhIni_Internalname, httpContext.getMessage( "Horas Iniciales Contador Maq", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisHhIni_Internalname, GXutil.ltrim( localUtil.ntoc( A1060HisHhIni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisHhIni_Enabled!=0) ? localUtil.format( A1060HisHhIni, "ZZZZZZ9.99") : localUtil.format( A1060HisHhIni, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisHhIni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisHhIni_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProMq_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProMq_Internalname, httpContext.getMessage( "Seccion Maquina XXYY", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProMq_Internalname, GXutil.rtrim( A10359HisProMq), GXutil.rtrim( localUtil.format( A10359HisProMq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProMq_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProMq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProFd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProFd_Internalname, httpContext.getMessage( "Fecha Dia Completo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtHisProFd_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProFd_Internalname, localUtil.format(A10360HisProFd, "99/99/99"), localUtil.format( A10360HisProFd, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProFd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProFd_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtHisProFd_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtHisProFd_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProDibC_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProDibC_Internalname, httpContext.getMessage( "Dibujo Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProDibC_Internalname, GXutil.rtrim( A13124HisProDibC), GXutil.rtrim( localUtil.format( A13124HisProDibC, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProDibC_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProDibC_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProDibI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProDibI_Internalname, httpContext.getMessage( "Dibujo Interno", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProDibI_Internalname, GXutil.ltrim( localUtil.ntoc( A13125HisProDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProDibI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13125HisProDibI), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13125HisProDibI), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProDibI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProDibI_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProCom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProCom_Internalname, httpContext.getMessage( "Combinacion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProCom_Internalname, GXutil.rtrim( A13126HisProCom), GXutil.rtrim( localUtil.format( A13126HisProCom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProCom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProCom_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProFon_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProFon_Internalname, httpContext.getMessage( "Fondo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProFon_Internalname, GXutil.rtrim( A13127HisProFon), GXutil.rtrim( localUtil.format( A13127HisProFon, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProFon_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProFon_Enabled, 0, "text", "", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProMtHd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProMtHd_Internalname, httpContext.getMessage( "Mts Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProMtHd_Internalname, GXutil.ltrim( localUtil.ntoc( A13128HisProMtHd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProMtHd_Enabled!=0) ? localUtil.format( A13128HisProMtHd, "ZZZZZ9.99") : localUtil.format( A13128HisProMtHd, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProMtHd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProMtHd_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProKgHd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProKgHd_Internalname, httpContext.getMessage( "Kgs Hdr", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProKgHd_Internalname, GXutil.ltrim( localUtil.ntoc( A13129HisProKgHd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProKgHd_Enabled!=0) ? localUtil.format( A13129HisProKgHd, "ZZZZZ9.99") : localUtil.format( A13129HisProKgHd, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProKgHd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProKgHd_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProPzHd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProPzHd_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProPzHd_Internalname, GXutil.ltrim( localUtil.ntoc( A13130HisProPzHd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProPzHd_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A13130HisProPzHd), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A13130HisProPzHd), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProPzHd_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProPzHd_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisprosec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisprosec_Internalname, httpContext.getMessage( "Hisprosec", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisprosec_Internalname, GXutil.ltrim( localUtil.ntoc( A14020Hisprosec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisprosec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14020Hisprosec), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14020Hisprosec), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisprosec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisprosec_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisproMtsI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisproMtsI_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisproMtsI_Internalname, GXutil.ltrim( localUtil.ntoc( A14021HisproMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisproMtsI_Enabled!=0) ? localUtil.format( A14021HisproMtsI, "ZZZZZ9.99") : localUtil.format( A14021HisproMtsI, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisproMtsI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisproMtsI_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProAncI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProAncI_Internalname, httpContext.getMessage( "Inicio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProAncI_Internalname, GXutil.ltrim( localUtil.ntoc( A14022HisProAncI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProAncI_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14022HisProAncI), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14022HisProAncI), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProAncI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProAncI_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProMtsF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProMtsF_Internalname, httpContext.getMessage( "Fin", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProMtsF_Internalname, GXutil.ltrim( localUtil.ntoc( A14023HisProMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProMtsF_Enabled!=0) ? localUtil.format( A14023HisProMtsF, "ZZZZZ9.99") : localUtil.format( A14023HisProMtsF, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProMtsF_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProMtsF_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProAncF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProAncF_Internalname, httpContext.getMessage( "Final", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProAncF_Internalname, GXutil.ltrim( localUtil.ntoc( A14024HisProAncF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProAncF_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14024HisProAncF), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14024HisProAncF), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProAncF_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProAncF_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProResi_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProResi_Internalname, httpContext.getMessage( "Resina", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProResi_Internalname, GXutil.rtrim( A14025HisProResi), GXutil.rtrim( localUtil.format( A14025HisProResi, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProResi_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProResi_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtHisProResA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtHisProResA_Internalname, httpContext.getMessage( "como consumida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtHisProResA_Internalname, GXutil.ltrim( localUtil.ntoc( A14026HisProResA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtHisProResA_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14026HisProResA), "9") : localUtil.format( DecimalUtil.doubleToDec(A14026HisProResA), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtHisProResA_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtHisProResA_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\ParteProduccion_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 216,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ParteProduccion_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 218,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Produccion\\ParteProduccion_TRN.htm");
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
         Z5522HisProDR = httpContext.cgiGet( "Z5522HisProDR") ;
         Z5606HisProDi = localUtil.ctod( httpContext.cgiGet( "Z5606HisProDi"), 0) ;
         Z5607HisProHi = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5607HisProHi"), 0)) ;
         Z5608HisProDf = localUtil.ctod( httpContext.cgiGet( "Z5608HisProDf"), 0) ;
         Z5609HisProHf = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( "Z5609HisProHf"), 0)) ;
         Z6661EstPecas = httpContext.cgiGet( "Z6661EstPecas") ;
         Z6680HisproTdab = (short)(localUtil.ctol( httpContext.cgiGet( "Z6680HisproTdab"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z6819HisproNPd = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6819HisproNPd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z7394HisProCtr = httpContext.cgiGet( "Z7394HisProCtr") ;
         Z8566HisproGf = (short)(localUtil.ctol( httpContext.cgiGet( "Z8566HisproGf"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z4003HisHhMaq = localUtil.ctond( httpContext.cgiGet( "Z4003HisHhMaq")) ;
         Z1060HisHhIni = localUtil.ctond( httpContext.cgiGet( "Z1060HisHhIni")) ;
         Z10359HisProMq = httpContext.cgiGet( "Z10359HisProMq") ;
         Z10360HisProFd = localUtil.ctod( httpContext.cgiGet( "Z10360HisProFd"), 0) ;
         Z13124HisProDibC = httpContext.cgiGet( "Z13124HisProDibC") ;
         Z13125HisProDibI = (int)(localUtil.ctol( httpContext.cgiGet( "Z13125HisProDibI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z13126HisProCom = httpContext.cgiGet( "Z13126HisProCom") ;
         Z13127HisProFon = httpContext.cgiGet( "Z13127HisProFon") ;
         Z13128HisProMtHd = localUtil.ctond( httpContext.cgiGet( "Z13128HisProMtHd")) ;
         Z13129HisProKgHd = localUtil.ctond( httpContext.cgiGet( "Z13129HisProKgHd")) ;
         Z13130HisProPzHd = (int)(localUtil.ctol( httpContext.cgiGet( "Z13130HisProPzHd"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14020Hisprosec = (short)(localUtil.ctol( httpContext.cgiGet( "Z14020Hisprosec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14021HisproMtsI = localUtil.ctond( httpContext.cgiGet( "Z14021HisproMtsI")) ;
         Z14022HisProAncI = (short)(localUtil.ctol( httpContext.cgiGet( "Z14022HisProAncI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14023HisProMtsF = localUtil.ctond( httpContext.cgiGet( "Z14023HisProMtsF")) ;
         Z14024HisProAncF = (short)(localUtil.ctol( httpContext.cgiGet( "Z14024HisProAncF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14025HisProResi = httpContext.cgiGet( "Z14025HisProResi") ;
         Z14026HisProResA = (byte)(localUtil.ctol( httpContext.cgiGet( "Z14026HisProResA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14197HisProNFus = (int)(localUtil.ctol( httpContext.cgiGet( "Z14197HisProNFus"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14205HisproFuso = (int)(localUtil.ctol( httpContext.cgiGet( "Z14205HisproFuso"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14206HisProNSup = (int)(localUtil.ctol( httpContext.cgiGet( "Z14206HisProNSup"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14207HisProPsop = localUtil.ctond( httpContext.cgiGet( "Z14207HisProPsop")) ;
         Z14208HisProTipC = (short)(localUtil.ctol( httpContext.cgiGet( "Z14208HisProTipC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z14209HisproTara = localUtil.ctond( httpContext.cgiGet( "Z14209HisproTara")) ;
         Z503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z503GruOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Z130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         Z656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z656ParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z194BarOrdLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A461Fase = httpContext.cgiGet( "Z461Fase") ;
         A568HisProUni = localUtil.ctond( httpContext.cgiGet( "Z568HisProUni")) ;
         A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( "Z566HisProTur"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A560HisProHin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z560HisProHin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A563HisProMin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z563HisProMin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A559HisProHfi = (byte)(localUtil.ctol( httpContext.cgiGet( "Z559HisProHfi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A562HisProMfi = (byte)(localUtil.ctol( httpContext.cgiGet( "Z562HisProMfi"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A557HisProF = httpContext.cgiGet( "Z557HisProF") ;
         A565HisProTte = (short)(localUtil.ctol( httpContext.cgiGet( "Z565HisProTte"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A543HisBarTip = (byte)(localUtil.ctol( httpContext.cgiGet( "Z543HisBarTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A556HisProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z556HisProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( "Z1525HisProKgr")) ;
         A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( "Z1526HisProMtr")) ;
         A2247HisProTip = (short)(localUtil.ctol( httpContext.cgiGet( "Z2247HisProTip"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2504HisProCod = httpContext.cgiGet( "Z2504HisProCod") ;
         A3610HisProLot = httpContext.cgiGet( "Z3610HisProLot") ;
         A3611HisProTc = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3611HisProTc"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3612HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z3612HisProReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4439HisProBot = (int)(localUtil.ctol( httpContext.cgiGet( "Z4439HisProBot"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4704HisProNPar = (int)(localUtil.ctol( httpContext.cgiGet( "Z4704HisProNPar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( "Z4714HisProNpzs"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5339HisProBan = httpContext.cgiGet( "Z5339HisProBan") ;
         A14197HisProNFus = (int)(localUtil.ctol( httpContext.cgiGet( "Z14197HisProNFus"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14205HisproFuso = (int)(localUtil.ctol( httpContext.cgiGet( "Z14205HisproFuso"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14206HisProNSup = (int)(localUtil.ctol( httpContext.cgiGet( "Z14206HisProNSup"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14207HisProPsop = localUtil.ctond( httpContext.cgiGet( "Z14207HisProPsop")) ;
         A14208HisProTipC = (short)(localUtil.ctol( httpContext.cgiGet( "Z14208HisProTipC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14209HisproTara = localUtil.ctond( httpContext.cgiGet( "Z14209HisproTara")) ;
         A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z503GruOpeCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n129BarCod = false ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "Z132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n132BarCodReo = false ;
         A130BarCodPar = httpContext.cgiGet( "Z130BarCodPar") ;
         n130BarCodPar = false ;
         A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z656ParCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n656ParCod = false ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         A503GruOpeCod = (int)(localUtil.ctol( httpContext.cgiGet( "GRUOPECOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A461Fase = httpContext.cgiGet( "FASE") ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "BARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A134BarCodVir = (int)(localUtil.ctol( httpContext.cgiGet( "BARCODVIR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A133BarCodReoV = (byte)(localUtil.ctol( httpContext.cgiGet( "BARCODREOV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( "BARCODPAR") ;
         A131BarCodParV = httpContext.cgiGet( "BARCODPARV") ;
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( "BARORDLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A195BarOrdLinV = (short)(localUtil.ctol( httpContext.cgiGet( "BARORDLINV"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A559HisProHfi = (byte)(localUtil.ctol( httpContext.cgiGet( "HISPROHFI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A562HisProMfi = (byte)(localUtil.ctol( httpContext.cgiGet( "HISPROMFI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A560HisProHin = (byte)(localUtil.ctol( httpContext.cgiGet( "HISPROHIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A563HisProMin = (byte)(localUtil.ctol( httpContext.cgiGet( "HISPROMIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A564HisProTre = (short)(localUtil.ctol( httpContext.cgiGet( "HISPROTRE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A568HisProUni = localUtil.ctond( httpContext.cgiGet( "HISPROUNI")) ;
         A566HisProTur = (byte)(localUtil.ctol( httpContext.cgiGet( "HISPROTUR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A557HisProF = httpContext.cgiGet( "HISPROF") ;
         A565HisProTte = (short)(localUtil.ctol( httpContext.cgiGet( "HISPROTTE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A543HisBarTip = (byte)(localUtil.ctol( httpContext.cgiGet( "HISBARTIP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A556HisProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "HISPROEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1525HisProKgr = localUtil.ctond( httpContext.cgiGet( "HISPROKGR")) ;
         A1526HisProMtr = localUtil.ctond( httpContext.cgiGet( "HISPROMTR")) ;
         A2247HisProTip = (short)(localUtil.ctol( httpContext.cgiGet( "HISPROTIP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A2504HisProCod = httpContext.cgiGet( "HISPROCOD") ;
         A3610HisProLot = httpContext.cgiGet( "HISPROLOT") ;
         A3611HisProTc = (byte)(localUtil.ctol( httpContext.cgiGet( "HISPROTC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3612HisProReo = (byte)(localUtil.ctol( httpContext.cgiGet( "HISPROREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4439HisProBot = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROBOT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4704HisProNPar = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONPAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A4714HisProNpzs = (short)(localUtil.ctol( httpContext.cgiGet( "HISPRONPZS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5339HisProBan = httpContext.cgiGet( "HISPROBAN") ;
         A14197HisProNFus = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONFUS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14205HisproFuso = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROFUSO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14206HisProNSup = (int)(localUtil.ctol( httpContext.cgiGet( "HISPRONSUP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14207HisProPsop = localUtil.ctond( httpContext.cgiGet( "HISPROPSOP")) ;
         A14208HisProTipC = (short)(localUtil.ctol( httpContext.cgiGet( "HISPROTIPC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A14209HisproTara = localUtil.ctond( httpContext.cgiGet( "HISPROTARA")) ;
         A656ParCod = (short)(localUtil.ctol( httpContext.cgiGet( "PARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
         n407EmprNom = false ;
         A567HisProULin = (int)(localUtil.ctol( httpContext.cgiGet( "HISPROULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n567HisProULin = false ;
         A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "DISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A392DisUniMed = httpContext.cgiGet( "DISUNIMED") ;
         A307CodFas = httpContext.cgiGet( "CODFAS") ;
         n307CodFas = false ;
         A462FasEst = (byte)(localUtil.ctol( httpContext.cgiGet( "FASEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n462FasEst = false ;
         A1280BarMla = localUtil.ctond( httpContext.cgiGet( "BARMLA")) ;
         A1279BarKla = localUtil.ctond( httpContext.cgiGet( "BARKLA")) ;
         /* Read variables values. */
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
         n606MaqDsc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
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
         A14028Gruopecod_ = httpContext.cgiGet( edtGruopecod__Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14028Gruopecod_", A14028Gruopecod_);
         A14027Fase_Dsc = httpContext.cgiGet( edtFase_Dsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14027Fase_Dsc", A14027Fase_Dsc);
         A867ParCodNom = httpContext.cgiGet( edtParCodNom_Internalname) ;
         n867ParCodNom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
         A5522HisProDR = httpContext.cgiGet( edtHisProDR_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5522HisProDR", A5522HisProDR);
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisProDi_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HISPRODI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProDi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5606HisProDi = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A5606HisProDi", localUtil.format(A5606HisProDi, "99/99/99"));
         }
         else
         {
            A5606HisProDi = localUtil.ctod( httpContext.cgiGet( edtHisProDi_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5606HisProDi", localUtil.format(A5606HisProDi, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisProHi_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "HISPROHI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProHi_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A5607HisProHi", localUtil.ttoc( A5607HisProHi, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A5607HisProHi = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtHisProHi_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5607HisProHi", localUtil.ttoc( A5607HisProHi, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisProDf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HISPRODF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProDf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5608HisProDf = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A5608HisProDf", localUtil.format(A5608HisProDf, "99/99/99"));
         }
         else
         {
            A5608HisProDf = localUtil.ctod( httpContext.cgiGet( edtHisProDf_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5608HisProDf", localUtil.format(A5608HisProDf, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisProHf_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, "HISPROHF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProHf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "A5609HisProHf", localUtil.ttoc( A5609HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            A5609HisProHf = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtHisProHf_Internalname))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5609HisProHf", localUtil.ttoc( A5609HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         A6661EstPecas = httpContext.cgiGet( edtEstPecas_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6661EstPecas", A6661EstPecas);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisproTdab_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisproTdab_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROTDAB");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisproTdab_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6680HisproTdab = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6680HisproTdab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6680HisproTdab), 4, 0));
         }
         else
         {
            A6680HisproTdab = (short)(localUtil.ctol( httpContext.cgiGet( edtHisproTdab_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6680HisproTdab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6680HisproTdab), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisproNPd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisproNPd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPRONPD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisproNPd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A6819HisproNPd = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6819HisproNPd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6819HisproNPd), 2, 0));
         }
         else
         {
            A6819HisproNPd = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisproNPd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6819HisproNPd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6819HisproNPd), 2, 0));
         }
         A7394HisProCtr = httpContext.cgiGet( edtHisProCtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7394HisProCtr", A7394HisProCtr);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisproGf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisproGf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROGF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisproGf_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A8566HisproGf = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8566HisproGf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8566HisproGf), 4, 0));
         }
         else
         {
            A8566HisproGf = (short)(localUtil.ctol( httpContext.cgiGet( edtHisproGf_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8566HisproGf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8566HisproGf), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisHhMaq_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisHhMaq_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISHHMAQ");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisHhMaq_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A4003HisHhMaq = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A4003HisHhMaq", GXutil.ltrimstr( A4003HisHhMaq, 10, 2));
         }
         else
         {
            A4003HisHhMaq = localUtil.ctond( httpContext.cgiGet( edtHisHhMaq_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4003HisHhMaq", GXutil.ltrimstr( A4003HisHhMaq, 10, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisHhIni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisHhIni_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISHHINI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisHhIni_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1060HisHhIni = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A1060HisHhIni", GXutil.ltrimstr( A1060HisHhIni, 10, 2));
         }
         else
         {
            A1060HisHhIni = localUtil.ctond( httpContext.cgiGet( edtHisHhIni_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1060HisHhIni", GXutil.ltrimstr( A1060HisHhIni, 10, 2));
         }
         A10359HisProMq = httpContext.cgiGet( edtHisProMq_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10359HisProMq", A10359HisProMq);
         if ( localUtil.vcdate( httpContext.cgiGet( edtHisProFd_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "HISPROFD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProFd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A10360HisProFd = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "A10360HisProFd", localUtil.format(A10360HisProFd, "99/99/99"));
         }
         else
         {
            A10360HisProFd = localUtil.ctod( httpContext.cgiGet( edtHisProFd_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10360HisProFd", localUtil.format(A10360HisProFd, "99/99/99"));
         }
         A13124HisProDibC = httpContext.cgiGet( edtHisProDibC_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13124HisProDibC", A13124HisProDibC);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPRODIBI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProDibI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13125HisProDibI = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13125HisProDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13125HisProDibI), 8, 0));
         }
         else
         {
            A13125HisProDibI = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProDibI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13125HisProDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13125HisProDibI), 8, 0));
         }
         A13126HisProCom = httpContext.cgiGet( edtHisProCom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13126HisProCom", A13126HisProCom);
         A13127HisProFon = httpContext.cgiGet( edtHisProFon_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13127HisProFon", A13127HisProFon);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProMtHd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProMtHd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROMTHD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProMtHd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13128HisProMtHd = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A13128HisProMtHd", GXutil.ltrimstr( A13128HisProMtHd, 9, 2));
         }
         else
         {
            A13128HisProMtHd = localUtil.ctond( httpContext.cgiGet( edtHisProMtHd_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13128HisProMtHd", GXutil.ltrimstr( A13128HisProMtHd, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProKgHd_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProKgHd_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROKGHD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProKgHd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13129HisProKgHd = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A13129HisProKgHd", GXutil.ltrimstr( A13129HisProKgHd, 9, 2));
         }
         else
         {
            A13129HisProKgHd = localUtil.ctond( httpContext.cgiGet( edtHisProKgHd_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13129HisProKgHd", GXutil.ltrimstr( A13129HisProKgHd, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProPzHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProPzHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROPZHD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProPzHd_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A13130HisProPzHd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A13130HisProPzHd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13130HisProPzHd), 6, 0));
         }
         else
         {
            A13130HisProPzHd = (int)(localUtil.ctol( httpContext.cgiGet( edtHisProPzHd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13130HisProPzHd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13130HisProPzHd), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisprosec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisprosec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROSEC");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisprosec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14020Hisprosec = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14020Hisprosec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14020Hisprosec), 4, 0));
         }
         else
         {
            A14020Hisprosec = (short)(localUtil.ctol( httpContext.cgiGet( edtHisprosec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14020Hisprosec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14020Hisprosec), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisproMtsI_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisproMtsI_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROMTSI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisproMtsI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14021HisproMtsI = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A14021HisproMtsI", GXutil.ltrimstr( A14021HisproMtsI, 9, 2));
         }
         else
         {
            A14021HisproMtsI = localUtil.ctond( httpContext.cgiGet( edtHisproMtsI_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14021HisproMtsI", GXutil.ltrimstr( A14021HisproMtsI, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProAncI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProAncI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROANCI");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProAncI_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14022HisProAncI = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14022HisProAncI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14022HisProAncI), 4, 0));
         }
         else
         {
            A14022HisProAncI = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProAncI_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14022HisProAncI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14022HisProAncI), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtHisProMtsF_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtHisProMtsF_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROMTSF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProMtsF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14023HisProMtsF = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "A14023HisProMtsF", GXutil.ltrimstr( A14023HisProMtsF, 9, 2));
         }
         else
         {
            A14023HisProMtsF = localUtil.ctond( httpContext.cgiGet( edtHisProMtsF_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14023HisProMtsF", GXutil.ltrimstr( A14023HisProMtsF, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProAncF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProAncF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPROANCF");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProAncF_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14024HisProAncF = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14024HisProAncF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14024HisProAncF), 4, 0));
         }
         else
         {
            A14024HisProAncF = (short)(localUtil.ctol( httpContext.cgiGet( edtHisProAncF_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14024HisProAncF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14024HisProAncF), 4, 0));
         }
         A14025HisProResi = httpContext.cgiGet( edtHisProResi_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14025HisProResi", A14025HisProResi);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtHisProResA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtHisProResA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "HISPRORESA");
            AnyError = (short)(1) ;
            GX_FocusControl = edtHisProResA_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A14026HisProResA = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14026HisProResA", GXutil.str( A14026HisProResA, 1, 0));
         }
         else
         {
            A14026HisProResA = (byte)(localUtil.ctol( httpContext.cgiGet( edtHisProResA_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14026HisProResA", GXutil.str( A14026HisProResA, 1, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ParteProduccion_TRN");
         forbiddenHiddens.add("HisProTre", localUtil.format( DecimalUtil.doubleToDec(A564HisProTre), "ZZZ9"));
         forbiddenHiddens.add("BarOrdLinV", localUtil.format( DecimalUtil.doubleToDec(A195BarOrdLinV), "ZZZ9"));
         forbiddenHiddens.add("BarCodParV", GXutil.rtrim( localUtil.format( A131BarCodParV, "")));
         forbiddenHiddens.add("BarCodReoV", localUtil.format( DecimalUtil.doubleToDec(A133BarCodReoV), "9"));
         forbiddenHiddens.add("BarCodVir", localUtil.format( DecimalUtil.doubleToDec(A134BarCodVir), "ZZZZZZZZ9"));
         forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
         forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
         forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
         forbiddenHiddens.add("GruOpeCod", localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"));
         forbiddenHiddens.add("BarOrdLin", localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"));
         forbiddenHiddens.add("Fase", GXutil.rtrim( localUtil.format( A461Fase, "")));
         forbiddenHiddens.add("HisProUni", localUtil.format( A568HisProUni, "ZZZZZ9.99"));
         forbiddenHiddens.add("HisProTur", localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"));
         forbiddenHiddens.add("HisProHin", localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9"));
         forbiddenHiddens.add("HisProMin", localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99"));
         forbiddenHiddens.add("HisProHfi", localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9"));
         forbiddenHiddens.add("HisProMfi", localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99"));
         forbiddenHiddens.add("HisProF", GXutil.rtrim( localUtil.format( A557HisProF, "@!")));
         forbiddenHiddens.add("ParCod", localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9"));
         forbiddenHiddens.add("HisProTte", localUtil.format( DecimalUtil.doubleToDec(A565HisProTte), "ZZZ9"));
         forbiddenHiddens.add("HisBarTip", localUtil.format( DecimalUtil.doubleToDec(A543HisBarTip), "9"));
         forbiddenHiddens.add("HisProEst", localUtil.format( DecimalUtil.doubleToDec(A556HisProEst), "9"));
         forbiddenHiddens.add("HisProKgr", localUtil.format( A1525HisProKgr, "ZZZZZ9.99"));
         forbiddenHiddens.add("HisProMtr", localUtil.format( A1526HisProMtr, "ZZZZZ9.99"));
         forbiddenHiddens.add("HisProTip", localUtil.format( DecimalUtil.doubleToDec(A2247HisProTip), "ZZZ9"));
         forbiddenHiddens.add("HisProCod", GXutil.rtrim( localUtil.format( A2504HisProCod, "")));
         forbiddenHiddens.add("HisProLot", GXutil.rtrim( localUtil.format( A3610HisProLot, "")));
         forbiddenHiddens.add("HisProTc", localUtil.format( DecimalUtil.doubleToDec(A3611HisProTc), "Z9"));
         forbiddenHiddens.add("HisProReo", localUtil.format( DecimalUtil.doubleToDec(A3612HisProReo), "9"));
         forbiddenHiddens.add("HisProBot", localUtil.format( DecimalUtil.doubleToDec(A4439HisProBot), "ZZZZZ9"));
         forbiddenHiddens.add("HisProNPar", localUtil.format( DecimalUtil.doubleToDec(A4704HisProNPar), "ZZZZZ9"));
         forbiddenHiddens.add("HisProNpzs", localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9"));
         forbiddenHiddens.add("HisProBan", GXutil.rtrim( localUtil.format( A5339HisProBan, "")));
         forbiddenHiddens.add("HisProNFus", localUtil.format( DecimalUtil.doubleToDec(A14197HisProNFus), "ZZZZZ9"));
         forbiddenHiddens.add("HisproFuso", localUtil.format( DecimalUtil.doubleToDec(A14205HisproFuso), "ZZZZZ9"));
         forbiddenHiddens.add("HisProNSup", localUtil.format( DecimalUtil.doubleToDec(A14206HisProNSup), "ZZZZZ9"));
         forbiddenHiddens.add("HisProPsop", localUtil.format( A14207HisProPsop, "ZZZZZ9.99"));
         forbiddenHiddens.add("HisProTipC", localUtil.format( DecimalUtil.doubleToDec(A14208HisProTipC), "ZZZ9"));
         forbiddenHiddens.add("HisproTara", localUtil.format( A14209HisproTara, "ZZ9.9999"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A558HisProFec), GXutil.resetTime(Z558HisProFec)) ) || ( A561HisProLin != Z561HisProLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\parteproduccion_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
            initAll1SB59( ) ;
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
      disableAttributes1SB59( ) ;
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

   public void resetCaption1SB0( )
   {
   }

   public void zm1SB59( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z194BarOrdLin = T01SB3_A194BarOrdLin[0] ;
            Z461Fase = T01SB3_A461Fase[0] ;
            Z568HisProUni = T01SB3_A568HisProUni[0] ;
            Z566HisProTur = T01SB3_A566HisProTur[0] ;
            Z560HisProHin = T01SB3_A560HisProHin[0] ;
            Z563HisProMin = T01SB3_A563HisProMin[0] ;
            Z559HisProHfi = T01SB3_A559HisProHfi[0] ;
            Z562HisProMfi = T01SB3_A562HisProMfi[0] ;
            Z557HisProF = T01SB3_A557HisProF[0] ;
            Z565HisProTte = T01SB3_A565HisProTte[0] ;
            Z543HisBarTip = T01SB3_A543HisBarTip[0] ;
            Z556HisProEst = T01SB3_A556HisProEst[0] ;
            Z1525HisProKgr = T01SB3_A1525HisProKgr[0] ;
            Z1526HisProMtr = T01SB3_A1526HisProMtr[0] ;
            Z2247HisProTip = T01SB3_A2247HisProTip[0] ;
            Z2504HisProCod = T01SB3_A2504HisProCod[0] ;
            Z3610HisProLot = T01SB3_A3610HisProLot[0] ;
            Z3611HisProTc = T01SB3_A3611HisProTc[0] ;
            Z3612HisProReo = T01SB3_A3612HisProReo[0] ;
            Z4439HisProBot = T01SB3_A4439HisProBot[0] ;
            Z4704HisProNPar = T01SB3_A4704HisProNPar[0] ;
            Z4714HisProNpzs = T01SB3_A4714HisProNpzs[0] ;
            Z5339HisProBan = T01SB3_A5339HisProBan[0] ;
            Z5522HisProDR = T01SB3_A5522HisProDR[0] ;
            Z5606HisProDi = T01SB3_A5606HisProDi[0] ;
            Z5607HisProHi = T01SB3_A5607HisProHi[0] ;
            Z5608HisProDf = T01SB3_A5608HisProDf[0] ;
            Z5609HisProHf = T01SB3_A5609HisProHf[0] ;
            Z6661EstPecas = T01SB3_A6661EstPecas[0] ;
            Z6680HisproTdab = T01SB3_A6680HisproTdab[0] ;
            Z6819HisproNPd = T01SB3_A6819HisproNPd[0] ;
            Z7394HisProCtr = T01SB3_A7394HisProCtr[0] ;
            Z8566HisproGf = T01SB3_A8566HisproGf[0] ;
            Z4003HisHhMaq = T01SB3_A4003HisHhMaq[0] ;
            Z1060HisHhIni = T01SB3_A1060HisHhIni[0] ;
            Z10359HisProMq = T01SB3_A10359HisProMq[0] ;
            Z10360HisProFd = T01SB3_A10360HisProFd[0] ;
            Z13124HisProDibC = T01SB3_A13124HisProDibC[0] ;
            Z13125HisProDibI = T01SB3_A13125HisProDibI[0] ;
            Z13126HisProCom = T01SB3_A13126HisProCom[0] ;
            Z13127HisProFon = T01SB3_A13127HisProFon[0] ;
            Z13128HisProMtHd = T01SB3_A13128HisProMtHd[0] ;
            Z13129HisProKgHd = T01SB3_A13129HisProKgHd[0] ;
            Z13130HisProPzHd = T01SB3_A13130HisProPzHd[0] ;
            Z14020Hisprosec = T01SB3_A14020Hisprosec[0] ;
            Z14021HisproMtsI = T01SB3_A14021HisproMtsI[0] ;
            Z14022HisProAncI = T01SB3_A14022HisProAncI[0] ;
            Z14023HisProMtsF = T01SB3_A14023HisProMtsF[0] ;
            Z14024HisProAncF = T01SB3_A14024HisProAncF[0] ;
            Z14025HisProResi = T01SB3_A14025HisProResi[0] ;
            Z14026HisProResA = T01SB3_A14026HisProResA[0] ;
            Z14197HisProNFus = T01SB3_A14197HisProNFus[0] ;
            Z14205HisproFuso = T01SB3_A14205HisproFuso[0] ;
            Z14206HisProNSup = T01SB3_A14206HisProNSup[0] ;
            Z14207HisProPsop = T01SB3_A14207HisProPsop[0] ;
            Z14208HisProTipC = T01SB3_A14208HisProTipC[0] ;
            Z14209HisproTara = T01SB3_A14209HisproTara[0] ;
            Z503GruOpeCod = T01SB3_A503GruOpeCod[0] ;
            Z129BarCod = T01SB3_A129BarCod[0] ;
            Z132BarCodReo = T01SB3_A132BarCodReo[0] ;
            Z130BarCodPar = T01SB3_A130BarCodPar[0] ;
            Z656ParCod = T01SB3_A656ParCod[0] ;
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
            Z5522HisProDR = A5522HisProDR ;
            Z5606HisProDi = A5606HisProDi ;
            Z5607HisProHi = A5607HisProHi ;
            Z5608HisProDf = A5608HisProDf ;
            Z5609HisProHf = A5609HisProHf ;
            Z6661EstPecas = A6661EstPecas ;
            Z6680HisproTdab = A6680HisproTdab ;
            Z6819HisproNPd = A6819HisproNPd ;
            Z7394HisProCtr = A7394HisProCtr ;
            Z8566HisproGf = A8566HisproGf ;
            Z4003HisHhMaq = A4003HisHhMaq ;
            Z1060HisHhIni = A1060HisHhIni ;
            Z10359HisProMq = A10359HisProMq ;
            Z10360HisProFd = A10360HisProFd ;
            Z13124HisProDibC = A13124HisProDibC ;
            Z13125HisProDibI = A13125HisProDibI ;
            Z13126HisProCom = A13126HisProCom ;
            Z13127HisProFon = A13127HisProFon ;
            Z13128HisProMtHd = A13128HisProMtHd ;
            Z13129HisProKgHd = A13129HisProKgHd ;
            Z13130HisProPzHd = A13130HisProPzHd ;
            Z14020Hisprosec = A14020Hisprosec ;
            Z14021HisproMtsI = A14021HisproMtsI ;
            Z14022HisProAncI = A14022HisProAncI ;
            Z14023HisProMtsF = A14023HisProMtsF ;
            Z14024HisProAncF = A14024HisProAncF ;
            Z14025HisProResi = A14025HisProResi ;
            Z14026HisProResA = A14026HisProResA ;
            Z14197HisProNFus = A14197HisProNFus ;
            Z14205HisproFuso = A14205HisproFuso ;
            Z14206HisProNSup = A14206HisProNSup ;
            Z14207HisProPsop = A14207HisProPsop ;
            Z14208HisProTipC = A14208HisProTipC ;
            Z14209HisproTara = A14209HisproTara ;
            Z503GruOpeCod = A503GruOpeCod ;
            Z129BarCod = A129BarCod ;
            Z132BarCodReo = A132BarCodReo ;
            Z130BarCodPar = A130BarCodPar ;
            Z656ParCod = A656ParCod ;
         }
      }
      if ( GX_JID == -8 )
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
         Z5522HisProDR = A5522HisProDR ;
         Z5606HisProDi = A5606HisProDi ;
         Z5607HisProHi = A5607HisProHi ;
         Z5608HisProDf = A5608HisProDf ;
         Z5609HisProHf = A5609HisProHf ;
         Z6661EstPecas = A6661EstPecas ;
         Z6680HisproTdab = A6680HisproTdab ;
         Z6819HisproNPd = A6819HisproNPd ;
         Z7394HisProCtr = A7394HisProCtr ;
         Z8566HisproGf = A8566HisproGf ;
         Z4003HisHhMaq = A4003HisHhMaq ;
         Z1060HisHhIni = A1060HisHhIni ;
         Z10359HisProMq = A10359HisProMq ;
         Z10360HisProFd = A10360HisProFd ;
         Z13124HisProDibC = A13124HisProDibC ;
         Z13125HisProDibI = A13125HisProDibI ;
         Z13126HisProCom = A13126HisProCom ;
         Z13127HisProFon = A13127HisProFon ;
         Z13128HisProMtHd = A13128HisProMtHd ;
         Z13129HisProKgHd = A13129HisProKgHd ;
         Z13130HisProPzHd = A13130HisProPzHd ;
         Z14020Hisprosec = A14020Hisprosec ;
         Z14021HisproMtsI = A14021HisproMtsI ;
         Z14022HisProAncI = A14022HisProAncI ;
         Z14023HisProMtsF = A14023HisProMtsF ;
         Z14024HisProAncF = A14024HisProAncF ;
         Z14025HisProResi = A14025HisProResi ;
         Z14026HisProResA = A14026HisProResA ;
         Z14197HisProNFus = A14197HisProNFus ;
         Z14205HisproFuso = A14205HisproFuso ;
         Z14206HisProNSup = A14206HisProNSup ;
         Z14207HisProPsop = A14207HisProPsop ;
         Z14208HisProTipC = A14208HisProTipC ;
         Z14209HisproTara = A14209HisproTara ;
         Z396EmprCod = A396EmprCod ;
         Z503GruOpeCod = A503GruOpeCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z129BarCod = A129BarCod ;
         Z132BarCodReo = A132BarCodReo ;
         Z130BarCodPar = A130BarCodPar ;
         Z656ParCod = A656ParCod ;
         Z407EmprNom = A407EmprNom ;
         Z361DisCod = A361DisCod ;
         Z867ParCodNom = A867ParCodNom ;
         Z392DisUniMed = A392DisUniMed ;
         Z1280BarMla = A1280BarMla ;
         Z1279BarKla = A1279BarKla ;
         Z606MaqDsc = A606MaqDsc ;
         Z567HisProULin = A567HisProULin ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      A195BarOrdLinV = A194BarOrdLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrimstr( DecimalUtil.doubleToDec(A195BarOrdLinV), 4, 0));
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
      A134BarCodVir = A129BarCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrimstr( DecimalUtil.doubleToDec(A134BarCodVir), 9, 0));
      A133BarCodReoV = A132BarCodReo ;
      httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.str( A133BarCodReoV, 1, 0));
      A131BarCodParV = A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", A131BarCodParV);
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

   public void load1SB59( )
   {
      /* Using cursor T01SB18 */
      pr_default.execute(12, new Object[] {Integer.valueOf(A561HisProLin), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A361DisCod = T01SB18_A361DisCod[0] ;
         A606MaqDsc = T01SB18_A606MaqDsc[0] ;
         n606MaqDsc = T01SB18_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         A567HisProULin = T01SB18_A567HisProULin[0] ;
         n567HisProULin = T01SB18_n567HisProULin[0] ;
         A407EmprNom = T01SB18_A407EmprNom[0] ;
         n407EmprNom = T01SB18_n407EmprNom[0] ;
         A194BarOrdLin = T01SB18_A194BarOrdLin[0] ;
         A461Fase = T01SB18_A461Fase[0] ;
         A568HisProUni = T01SB18_A568HisProUni[0] ;
         A566HisProTur = T01SB18_A566HisProTur[0] ;
         A560HisProHin = T01SB18_A560HisProHin[0] ;
         A563HisProMin = T01SB18_A563HisProMin[0] ;
         A559HisProHfi = T01SB18_A559HisProHfi[0] ;
         A562HisProMfi = T01SB18_A562HisProMfi[0] ;
         A557HisProF = T01SB18_A557HisProF[0] ;
         A867ParCodNom = T01SB18_A867ParCodNom[0] ;
         n867ParCodNom = T01SB18_n867ParCodNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
         A565HisProTte = T01SB18_A565HisProTte[0] ;
         A543HisBarTip = T01SB18_A543HisBarTip[0] ;
         A556HisProEst = T01SB18_A556HisProEst[0] ;
         A1525HisProKgr = T01SB18_A1525HisProKgr[0] ;
         A1526HisProMtr = T01SB18_A1526HisProMtr[0] ;
         A2247HisProTip = T01SB18_A2247HisProTip[0] ;
         A2504HisProCod = T01SB18_A2504HisProCod[0] ;
         A3610HisProLot = T01SB18_A3610HisProLot[0] ;
         A3611HisProTc = T01SB18_A3611HisProTc[0] ;
         A3612HisProReo = T01SB18_A3612HisProReo[0] ;
         A4439HisProBot = T01SB18_A4439HisProBot[0] ;
         A4704HisProNPar = T01SB18_A4704HisProNPar[0] ;
         A4714HisProNpzs = T01SB18_A4714HisProNpzs[0] ;
         A392DisUniMed = T01SB18_A392DisUniMed[0] ;
         A5339HisProBan = T01SB18_A5339HisProBan[0] ;
         A5522HisProDR = T01SB18_A5522HisProDR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5522HisProDR", A5522HisProDR);
         A5606HisProDi = T01SB18_A5606HisProDi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5606HisProDi", localUtil.format(A5606HisProDi, "99/99/99"));
         A5607HisProHi = T01SB18_A5607HisProHi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5607HisProHi", localUtil.ttoc( A5607HisProHi, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5608HisProDf = T01SB18_A5608HisProDf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5608HisProDf", localUtil.format(A5608HisProDf, "99/99/99"));
         A5609HisProHf = T01SB18_A5609HisProHf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5609HisProHf", localUtil.ttoc( A5609HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6661EstPecas = T01SB18_A6661EstPecas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6661EstPecas", A6661EstPecas);
         A6680HisproTdab = T01SB18_A6680HisproTdab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6680HisproTdab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6680HisproTdab), 4, 0));
         A6819HisproNPd = T01SB18_A6819HisproNPd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6819HisproNPd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6819HisproNPd), 2, 0));
         A7394HisProCtr = T01SB18_A7394HisProCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7394HisProCtr", A7394HisProCtr);
         A8566HisproGf = T01SB18_A8566HisproGf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8566HisproGf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8566HisproGf), 4, 0));
         A4003HisHhMaq = T01SB18_A4003HisHhMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4003HisHhMaq", GXutil.ltrimstr( A4003HisHhMaq, 10, 2));
         A1060HisHhIni = T01SB18_A1060HisHhIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1060HisHhIni", GXutil.ltrimstr( A1060HisHhIni, 10, 2));
         A10359HisProMq = T01SB18_A10359HisProMq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10359HisProMq", A10359HisProMq);
         A10360HisProFd = T01SB18_A10360HisProFd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10360HisProFd", localUtil.format(A10360HisProFd, "99/99/99"));
         A13124HisProDibC = T01SB18_A13124HisProDibC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13124HisProDibC", A13124HisProDibC);
         A13125HisProDibI = T01SB18_A13125HisProDibI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13125HisProDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13125HisProDibI), 8, 0));
         A13126HisProCom = T01SB18_A13126HisProCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13126HisProCom", A13126HisProCom);
         A13127HisProFon = T01SB18_A13127HisProFon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13127HisProFon", A13127HisProFon);
         A13128HisProMtHd = T01SB18_A13128HisProMtHd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13128HisProMtHd", GXutil.ltrimstr( A13128HisProMtHd, 9, 2));
         A13129HisProKgHd = T01SB18_A13129HisProKgHd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13129HisProKgHd", GXutil.ltrimstr( A13129HisProKgHd, 9, 2));
         A13130HisProPzHd = T01SB18_A13130HisProPzHd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13130HisProPzHd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13130HisProPzHd), 6, 0));
         A14020Hisprosec = T01SB18_A14020Hisprosec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14020Hisprosec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14020Hisprosec), 4, 0));
         A14021HisproMtsI = T01SB18_A14021HisproMtsI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14021HisproMtsI", GXutil.ltrimstr( A14021HisproMtsI, 9, 2));
         A14022HisProAncI = T01SB18_A14022HisProAncI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14022HisProAncI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14022HisProAncI), 4, 0));
         A14023HisProMtsF = T01SB18_A14023HisProMtsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14023HisProMtsF", GXutil.ltrimstr( A14023HisProMtsF, 9, 2));
         A14024HisProAncF = T01SB18_A14024HisProAncF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14024HisProAncF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14024HisProAncF), 4, 0));
         A14025HisProResi = T01SB18_A14025HisProResi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14025HisProResi", A14025HisProResi);
         A14026HisProResA = T01SB18_A14026HisProResA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14026HisProResA", GXutil.str( A14026HisProResA, 1, 0));
         A14197HisProNFus = T01SB18_A14197HisProNFus[0] ;
         A14205HisproFuso = T01SB18_A14205HisproFuso[0] ;
         A14206HisProNSup = T01SB18_A14206HisProNSup[0] ;
         A14207HisProPsop = T01SB18_A14207HisProPsop[0] ;
         A14208HisProTipC = T01SB18_A14208HisProTipC[0] ;
         A14209HisproTara = T01SB18_A14209HisproTara[0] ;
         A503GruOpeCod = T01SB18_A503GruOpeCod[0] ;
         A129BarCod = T01SB18_A129BarCod[0] ;
         n129BarCod = T01SB18_n129BarCod[0] ;
         A132BarCodReo = T01SB18_A132BarCodReo[0] ;
         n132BarCodReo = T01SB18_n132BarCodReo[0] ;
         A130BarCodPar = T01SB18_A130BarCodPar[0] ;
         n130BarCodPar = T01SB18_n130BarCodPar[0] ;
         A656ParCod = T01SB18_A656ParCod[0] ;
         n656ParCod = T01SB18_n656ParCod[0] ;
         A1280BarMla = T01SB18_A1280BarMla[0] ;
         A1279BarKla = T01SB18_A1279BarKla[0] ;
         zm1SB59( -8) ;
      }
      pr_default.close(12);
      onLoadActions1SB59( ) ;
   }

   public void onLoadActions1SB59( )
   {
      GXt_char1 = A14028Gruopecod_ ;
      GXv_char2[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
      parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14028Gruopecod_ = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14028Gruopecod_", A14028Gruopecod_);
      GXt_char1 = A14027Fase_Dsc ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
      parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14027Fase_Dsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14027Fase_Dsc", A14027Fase_Dsc);
      /* Using cursor T01SB12 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A307CodFas = T01SB12_A307CodFas[0] ;
         n307CodFas = T01SB12_n307CodFas[0] ;
      }
      else
      {
         A307CodFas = "" ;
         n307CodFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      }
      pr_default.close(9);
      /* Using cursor T01SB14 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A462FasEst = T01SB14_A462FasEst[0] ;
         n462FasEst = T01SB14_n462FasEst[0] ;
      }
      else
      {
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      }
      pr_default.close(10);
   }

   public void checkExtendedTable1SB59( )
   {
      nIsDirty_59 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SB4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SB4_A407EmprNom[0] ;
      n407EmprNom = T01SB4_n407EmprNom[0] ;
      pr_default.close(2);
      /* Using cursor T01SB5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      /* Using cursor T01SB8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01SB8_A361DisCod[0] ;
      pr_default.close(6);
      /* Using cursor T01SB9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A867ParCodNom = T01SB9_A867ParCodNom[0] ;
      n867ParCodNom = T01SB9_n867ParCodNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
      pr_default.close(7);
      /* Using cursor T01SB10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T01SB10_A392DisUniMed[0] ;
      pr_default.close(8);
      /* Using cursor T01SB16 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(11) != 101) )
      {
         A1280BarMla = T01SB16_A1280BarMla[0] ;
         A1279BarKla = T01SB16_A1279BarKla[0] ;
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
      pr_default.close(11);
      nIsDirty_59 = (short)(1) ;
      GXt_char1 = A14028Gruopecod_ ;
      GXv_char2[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
      parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14028Gruopecod_ = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14028Gruopecod_", A14028Gruopecod_);
      nIsDirty_59 = (short)(1) ;
      GXt_char1 = A14027Fase_Dsc ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
      parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14027Fase_Dsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14027Fase_Dsc", A14027Fase_Dsc);
      /* Using cursor T01SB6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01SB6_A606MaqDsc[0] ;
      n606MaqDsc = T01SB6_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(4);
      /* Using cursor T01SB7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A567HisProULin = T01SB7_A567HisProULin[0] ;
      n567HisProULin = T01SB7_n567HisProULin[0] ;
      pr_default.close(5);
      /* Using cursor T01SB12 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         A307CodFas = T01SB12_A307CodFas[0] ;
         n307CodFas = T01SB12_n307CodFas[0] ;
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A307CodFas = "" ;
         n307CodFas = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
      }
      pr_default.close(9);
      /* Using cursor T01SB14 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         A462FasEst = T01SB14_A462FasEst[0] ;
         n462FasEst = T01SB14_n462FasEst[0] ;
      }
      else
      {
         nIsDirty_59 = (short)(1) ;
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
      }
      pr_default.close(10);
   }

   public void closeExtendedTableCursors1SB59( )
   {
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(6);
      pr_default.close(7);
      pr_default.close(8);
      pr_default.close(11);
      pr_default.close(4);
      pr_default.close(5);
      pr_default.close(9);
      pr_default.close(10);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A396EmprCod )
   {
      /* Using cursor T01SB19 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SB19_A407EmprNom[0] ;
      n407EmprNom = T01SB19_n407EmprNom[0] ;
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

   public void gxload_10( String A396EmprCod ,
                          int A503GruOpeCod )
   {
      /* Using cursor T01SB20 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void gxload_13( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01SB21 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A361DisCod = T01SB21_A361DisCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_14( String A396EmprCod ,
                          short A656ParCod )
   {
      /* Using cursor T01SB22 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A867ParCodNom = T01SB22_A867ParCodNom[0] ;
      n867ParCodNom = T01SB22_n867ParCodNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A867ParCodNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_15( String A396EmprCod ,
                          int A361DisCod )
   {
      /* Using cursor T01SB23 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(17) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A392DisUniMed = T01SB23_A392DisUniMed[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A392DisUniMed))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void gxload_18( String A396EmprCod ,
                          int A129BarCod ,
                          byte A132BarCodReo ,
                          String A130BarCodPar )
   {
      /* Using cursor T01SB25 */
      pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(18) != 101) )
      {
         A1280BarMla = T01SB25_A1280BarMla[0] ;
         A1279BarKla = T01SB25_A1279BarKla[0] ;
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
      if ( (pr_default.getStatus(18) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(18);
   }

   public void gxload_11( String A396EmprCod ,
                          String A602MaqCod )
   {
      /* Using cursor T01SB26 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01SB26_A606MaqDsc[0] ;
      n606MaqDsc = T01SB26_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A606MaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void gxload_12( String A396EmprCod ,
                          String A602MaqCod ,
                          java.util.Date A558HisProFec )
   {
      /* Using cursor T01SB27 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A567HisProULin = T01SB27_A567HisProULin[0] ;
      n567HisProULin = T01SB27_n567HisProULin[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A567HisProULin, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void gxload_16( String A602MaqCod ,
                          java.util.Date A558HisProFec ,
                          int A561HisProLin ,
                          int A134BarCodVir ,
                          byte A133BarCodReoV ,
                          String A131BarCodParV ,
                          short A195BarOrdLinV )
   {
      /* Using cursor T01SB29 */
      pr_default.execute(21, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         A307CodFas = T01SB29_A307CodFas[0] ;
         n307CodFas = T01SB29_n307CodFas[0] ;
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
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void gxload_17( String A602MaqCod ,
                          java.util.Date A558HisProFec ,
                          int A561HisProLin ,
                          int A134BarCodVir ,
                          byte A133BarCodReoV ,
                          String A131BarCodParV ,
                          short A195BarOrdLinV )
   {
      /* Using cursor T01SB31 */
      pr_default.execute(22, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         A462FasEst = T01SB31_A462FasEst[0] ;
         n462FasEst = T01SB31_n462FasEst[0] ;
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
      if ( (pr_default.getStatus(22) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(22);
   }

   public void getKey1SB59( )
   {
      /* Using cursor T01SB32 */
      pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(23) != 101) )
      {
         RcdFound59 = (short)(1) ;
      }
      else
      {
         RcdFound59 = (short)(0) ;
      }
      pr_default.close(23);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SB59( 8) ;
         RcdFound59 = (short)(1) ;
         A561HisProLin = T01SB3_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
         A194BarOrdLin = T01SB3_A194BarOrdLin[0] ;
         A461Fase = T01SB3_A461Fase[0] ;
         A568HisProUni = T01SB3_A568HisProUni[0] ;
         A566HisProTur = T01SB3_A566HisProTur[0] ;
         A560HisProHin = T01SB3_A560HisProHin[0] ;
         A563HisProMin = T01SB3_A563HisProMin[0] ;
         A559HisProHfi = T01SB3_A559HisProHfi[0] ;
         A562HisProMfi = T01SB3_A562HisProMfi[0] ;
         A557HisProF = T01SB3_A557HisProF[0] ;
         A565HisProTte = T01SB3_A565HisProTte[0] ;
         A543HisBarTip = T01SB3_A543HisBarTip[0] ;
         A556HisProEst = T01SB3_A556HisProEst[0] ;
         A1525HisProKgr = T01SB3_A1525HisProKgr[0] ;
         A1526HisProMtr = T01SB3_A1526HisProMtr[0] ;
         A2247HisProTip = T01SB3_A2247HisProTip[0] ;
         A2504HisProCod = T01SB3_A2504HisProCod[0] ;
         A3610HisProLot = T01SB3_A3610HisProLot[0] ;
         A3611HisProTc = T01SB3_A3611HisProTc[0] ;
         A3612HisProReo = T01SB3_A3612HisProReo[0] ;
         A4439HisProBot = T01SB3_A4439HisProBot[0] ;
         A4704HisProNPar = T01SB3_A4704HisProNPar[0] ;
         A4714HisProNpzs = T01SB3_A4714HisProNpzs[0] ;
         A5339HisProBan = T01SB3_A5339HisProBan[0] ;
         A5522HisProDR = T01SB3_A5522HisProDR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5522HisProDR", A5522HisProDR);
         A5606HisProDi = T01SB3_A5606HisProDi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5606HisProDi", localUtil.format(A5606HisProDi, "99/99/99"));
         A5607HisProHi = T01SB3_A5607HisProHi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5607HisProHi", localUtil.ttoc( A5607HisProHi, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A5608HisProDf = T01SB3_A5608HisProDf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5608HisProDf", localUtil.format(A5608HisProDf, "99/99/99"));
         A5609HisProHf = T01SB3_A5609HisProHf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5609HisProHf", localUtil.ttoc( A5609HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A6661EstPecas = T01SB3_A6661EstPecas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6661EstPecas", A6661EstPecas);
         A6680HisproTdab = T01SB3_A6680HisproTdab[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6680HisproTdab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6680HisproTdab), 4, 0));
         A6819HisproNPd = T01SB3_A6819HisproNPd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6819HisproNPd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6819HisproNPd), 2, 0));
         A7394HisProCtr = T01SB3_A7394HisProCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7394HisProCtr", A7394HisProCtr);
         A8566HisproGf = T01SB3_A8566HisproGf[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8566HisproGf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8566HisproGf), 4, 0));
         A4003HisHhMaq = T01SB3_A4003HisHhMaq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4003HisHhMaq", GXutil.ltrimstr( A4003HisHhMaq, 10, 2));
         A1060HisHhIni = T01SB3_A1060HisHhIni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1060HisHhIni", GXutil.ltrimstr( A1060HisHhIni, 10, 2));
         A10359HisProMq = T01SB3_A10359HisProMq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10359HisProMq", A10359HisProMq);
         A10360HisProFd = T01SB3_A10360HisProFd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10360HisProFd", localUtil.format(A10360HisProFd, "99/99/99"));
         A13124HisProDibC = T01SB3_A13124HisProDibC[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13124HisProDibC", A13124HisProDibC);
         A13125HisProDibI = T01SB3_A13125HisProDibI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13125HisProDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13125HisProDibI), 8, 0));
         A13126HisProCom = T01SB3_A13126HisProCom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13126HisProCom", A13126HisProCom);
         A13127HisProFon = T01SB3_A13127HisProFon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13127HisProFon", A13127HisProFon);
         A13128HisProMtHd = T01SB3_A13128HisProMtHd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13128HisProMtHd", GXutil.ltrimstr( A13128HisProMtHd, 9, 2));
         A13129HisProKgHd = T01SB3_A13129HisProKgHd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13129HisProKgHd", GXutil.ltrimstr( A13129HisProKgHd, 9, 2));
         A13130HisProPzHd = T01SB3_A13130HisProPzHd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13130HisProPzHd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13130HisProPzHd), 6, 0));
         A14020Hisprosec = T01SB3_A14020Hisprosec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14020Hisprosec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14020Hisprosec), 4, 0));
         A14021HisproMtsI = T01SB3_A14021HisproMtsI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14021HisproMtsI", GXutil.ltrimstr( A14021HisproMtsI, 9, 2));
         A14022HisProAncI = T01SB3_A14022HisProAncI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14022HisProAncI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14022HisProAncI), 4, 0));
         A14023HisProMtsF = T01SB3_A14023HisProMtsF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14023HisProMtsF", GXutil.ltrimstr( A14023HisProMtsF, 9, 2));
         A14024HisProAncF = T01SB3_A14024HisProAncF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14024HisProAncF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14024HisProAncF), 4, 0));
         A14025HisProResi = T01SB3_A14025HisProResi[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14025HisProResi", A14025HisProResi);
         A14026HisProResA = T01SB3_A14026HisProResA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14026HisProResA", GXutil.str( A14026HisProResA, 1, 0));
         A14197HisProNFus = T01SB3_A14197HisProNFus[0] ;
         A14205HisproFuso = T01SB3_A14205HisproFuso[0] ;
         A14206HisProNSup = T01SB3_A14206HisProNSup[0] ;
         A14207HisProPsop = T01SB3_A14207HisProPsop[0] ;
         A14208HisProTipC = T01SB3_A14208HisProTipC[0] ;
         A14209HisproTara = T01SB3_A14209HisproTara[0] ;
         A396EmprCod = T01SB3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A503GruOpeCod = T01SB3_A503GruOpeCod[0] ;
         A602MaqCod = T01SB3_A602MaqCod[0] ;
         n602MaqCod = T01SB3_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T01SB3_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A129BarCod = T01SB3_A129BarCod[0] ;
         n129BarCod = T01SB3_n129BarCod[0] ;
         A132BarCodReo = T01SB3_A132BarCodReo[0] ;
         n132BarCodReo = T01SB3_n132BarCodReo[0] ;
         A130BarCodPar = T01SB3_A130BarCodPar[0] ;
         n130BarCodPar = T01SB3_n130BarCodPar[0] ;
         A656ParCod = T01SB3_A656ParCod[0] ;
         n656ParCod = T01SB3_n656ParCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z558HisProFec = A558HisProFec ;
         Z561HisProLin = A561HisProLin ;
         sMode59 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1SB59( ) ;
         if ( AnyError == 1 )
         {
            RcdFound59 = (short)(0) ;
            initializeNonKey1SB59( ) ;
         }
         Gx_mode = sMode59 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound59 = (short)(0) ;
         initializeNonKey1SB59( ) ;
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
      getKey1SB59( ) ;
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
      /* Using cursor T01SB33 */
      pr_default.execute(24, new Object[] {Integer.valueOf(A561HisProLin), Integer.valueOf(A561HisProLin), A396EmprCod, A396EmprCod, Integer.valueOf(A561HisProLin), Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod, Integer.valueOf(A561HisProLin), A558HisProFec});
      if ( (pr_default.getStatus(24) != 101) )
      {
         while ( (pr_default.getStatus(24) != 101) && ( ( T01SB33_A561HisProLin[0] < A561HisProLin ) || ( T01SB33_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01SB33_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SB33_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SB33_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01SB33_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01SB33_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01SB33_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SB33_A561HisProLin[0] == A561HisProLin ) && GXutil.resetTime(T01SB33_A558HisProFec[0]).before( GXutil.resetTime( A558HisProFec )) ) )
         {
            pr_default.readNext(24);
         }
         if ( (pr_default.getStatus(24) != 101) && ( ( T01SB33_A561HisProLin[0] > A561HisProLin ) || ( T01SB33_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01SB33_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SB33_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SB33_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01SB33_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01SB33_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01SB33_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SB33_A561HisProLin[0] == A561HisProLin ) && GXutil.resetTime(T01SB33_A558HisProFec[0]).after( GXutil.resetTime( A558HisProFec )) ) )
         {
            A561HisProLin = T01SB33_A561HisProLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            A396EmprCod = T01SB33_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01SB33_A602MaqCod[0] ;
            n602MaqCod = T01SB33_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = T01SB33_A558HisProFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            RcdFound59 = (short)(1) ;
         }
      }
      pr_default.close(24);
   }

   public void move_previous( )
   {
      RcdFound59 = (short)(0) ;
      /* Using cursor T01SB34 */
      pr_default.execute(25, new Object[] {Integer.valueOf(A561HisProLin), Integer.valueOf(A561HisProLin), A396EmprCod, A396EmprCod, Integer.valueOf(A561HisProLin), Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod, Integer.valueOf(A561HisProLin), A558HisProFec});
      if ( (pr_default.getStatus(25) != 101) )
      {
         while ( (pr_default.getStatus(25) != 101) && ( ( T01SB34_A561HisProLin[0] > A561HisProLin ) || ( T01SB34_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01SB34_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SB34_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SB34_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01SB34_A602MaqCod[0], A602MaqCod) > 0 ) || ( GXutil.strcmp(T01SB34_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01SB34_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SB34_A561HisProLin[0] == A561HisProLin ) && GXutil.resetTime(T01SB34_A558HisProFec[0]).after( GXutil.resetTime( A558HisProFec )) ) )
         {
            pr_default.readNext(25);
         }
         if ( (pr_default.getStatus(25) != 101) && ( ( T01SB34_A561HisProLin[0] < A561HisProLin ) || ( T01SB34_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01SB34_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SB34_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SB34_A561HisProLin[0] == A561HisProLin ) && ( GXutil.strcmp(T01SB34_A602MaqCod[0], A602MaqCod) < 0 ) || ( GXutil.strcmp(T01SB34_A602MaqCod[0], A602MaqCod) == 0 ) && ( GXutil.strcmp(T01SB34_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SB34_A561HisProLin[0] == A561HisProLin ) && GXutil.resetTime(T01SB34_A558HisProFec[0]).before( GXutil.resetTime( A558HisProFec )) ) )
         {
            A561HisProLin = T01SB34_A561HisProLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
            A396EmprCod = T01SB34_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A602MaqCod = T01SB34_A602MaqCod[0] ;
            n602MaqCod = T01SB34_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A558HisProFec = T01SB34_A558HisProFec[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
            RcdFound59 = (short)(1) ;
         }
      }
      pr_default.close(25);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SB59( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SB59( ) ;
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
               update1SB59( ) ;
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
               insert1SB59( ) ;
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
                  insert1SB59( ) ;
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
      GX_FocusControl = edtHisProDR_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1SB59( ) ;
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisProDR_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SB59( ) ;
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
      GX_FocusControl = edtHisProDR_Internalname ;
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
      GX_FocusControl = edtHisProDR_Internalname ;
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
      scanStart1SB59( ) ;
      if ( RcdFound59 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound59 != 0 )
         {
            scanNext1SB59( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtHisProDR_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1SB59( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1SB59( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z194BarOrdLin != T01SB2_A194BarOrdLin[0] ) || ( GXutil.strcmp(Z461Fase, T01SB2_A461Fase[0]) != 0 ) || ( DecimalUtil.compareTo(Z568HisProUni, T01SB2_A568HisProUni[0]) != 0 ) || ( Z566HisProTur != T01SB2_A566HisProTur[0] ) || ( Z560HisProHin != T01SB2_A560HisProHin[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z563HisProMin != T01SB2_A563HisProMin[0] ) || ( Z559HisProHfi != T01SB2_A559HisProHfi[0] ) || ( Z562HisProMfi != T01SB2_A562HisProMfi[0] ) || ( GXutil.strcmp(Z557HisProF, T01SB2_A557HisProF[0]) != 0 ) || ( Z565HisProTte != T01SB2_A565HisProTte[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z543HisBarTip != T01SB2_A543HisBarTip[0] ) || ( Z556HisProEst != T01SB2_A556HisProEst[0] ) || ( DecimalUtil.compareTo(Z1525HisProKgr, T01SB2_A1525HisProKgr[0]) != 0 ) || ( DecimalUtil.compareTo(Z1526HisProMtr, T01SB2_A1526HisProMtr[0]) != 0 ) || ( Z2247HisProTip != T01SB2_A2247HisProTip[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2504HisProCod, T01SB2_A2504HisProCod[0]) != 0 ) || ( GXutil.strcmp(Z3610HisProLot, T01SB2_A3610HisProLot[0]) != 0 ) || ( Z3611HisProTc != T01SB2_A3611HisProTc[0] ) || ( Z3612HisProReo != T01SB2_A3612HisProReo[0] ) || ( Z4439HisProBot != T01SB2_A4439HisProBot[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z4704HisProNPar != T01SB2_A4704HisProNPar[0] ) || ( Z4714HisProNpzs != T01SB2_A4714HisProNpzs[0] ) || ( GXutil.strcmp(Z5339HisProBan, T01SB2_A5339HisProBan[0]) != 0 ) || ( GXutil.strcmp(Z5522HisProDR, T01SB2_A5522HisProDR[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z5606HisProDi), GXutil.resetTime(T01SB2_A5606HisProDi[0])) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z5607HisProHi, T01SB2_A5607HisProHi[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z5608HisProDf), GXutil.resetTime(T01SB2_A5608HisProDf[0])) ) || !( GXutil.dateCompare(Z5609HisProHf, T01SB2_A5609HisProHf[0]) ) || ( GXutil.strcmp(Z6661EstPecas, T01SB2_A6661EstPecas[0]) != 0 ) || ( Z6680HisproTdab != T01SB2_A6680HisproTdab[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6819HisproNPd != T01SB2_A6819HisproNPd[0] ) || ( GXutil.strcmp(Z7394HisProCtr, T01SB2_A7394HisProCtr[0]) != 0 ) || ( Z8566HisproGf != T01SB2_A8566HisproGf[0] ) || ( DecimalUtil.compareTo(Z4003HisHhMaq, T01SB2_A4003HisHhMaq[0]) != 0 ) || ( DecimalUtil.compareTo(Z1060HisHhIni, T01SB2_A1060HisHhIni[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10359HisProMq, T01SB2_A10359HisProMq[0]) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(Z10360HisProFd), GXutil.resetTime(T01SB2_A10360HisProFd[0])) ) || ( GXutil.strcmp(Z13124HisProDibC, T01SB2_A13124HisProDibC[0]) != 0 ) || ( Z13125HisProDibI != T01SB2_A13125HisProDibI[0] ) || ( GXutil.strcmp(Z13126HisProCom, T01SB2_A13126HisProCom[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13127HisProFon, T01SB2_A13127HisProFon[0]) != 0 ) || ( DecimalUtil.compareTo(Z13128HisProMtHd, T01SB2_A13128HisProMtHd[0]) != 0 ) || ( DecimalUtil.compareTo(Z13129HisProKgHd, T01SB2_A13129HisProKgHd[0]) != 0 ) || ( Z13130HisProPzHd != T01SB2_A13130HisProPzHd[0] ) || ( Z14020Hisprosec != T01SB2_A14020Hisprosec[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z14021HisproMtsI, T01SB2_A14021HisproMtsI[0]) != 0 ) || ( Z14022HisProAncI != T01SB2_A14022HisProAncI[0] ) || ( DecimalUtil.compareTo(Z14023HisProMtsF, T01SB2_A14023HisProMtsF[0]) != 0 ) || ( Z14024HisProAncF != T01SB2_A14024HisProAncF[0] ) || ( GXutil.strcmp(Z14025HisProResi, T01SB2_A14025HisProResi[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14026HisProResA != T01SB2_A14026HisProResA[0] ) || ( Z14197HisProNFus != T01SB2_A14197HisProNFus[0] ) || ( Z14205HisproFuso != T01SB2_A14205HisproFuso[0] ) || ( Z14206HisProNSup != T01SB2_A14206HisProNSup[0] ) || ( DecimalUtil.compareTo(Z14207HisProPsop, T01SB2_A14207HisProPsop[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z14208HisProTipC != T01SB2_A14208HisProTipC[0] ) || ( DecimalUtil.compareTo(Z14209HisproTara, T01SB2_A14209HisproTara[0]) != 0 ) || ( Z503GruOpeCod != T01SB2_A503GruOpeCod[0] ) || ( Z129BarCod != T01SB2_A129BarCod[0] ) || ( Z132BarCodReo != T01SB2_A132BarCodReo[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z130BarCodPar, T01SB2_A130BarCodPar[0]) != 0 ) || ( Z656ParCod != T01SB2_A656ParCod[0] ) )
         {
            if ( Z194BarOrdLin != T01SB2_A194BarOrdLin[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"BarOrdLin");
               GXutil.writeLogRaw("Old: ",Z194BarOrdLin);
               GXutil.writeLogRaw("Current: ",T01SB2_A194BarOrdLin[0]);
            }
            if ( GXutil.strcmp(Z461Fase, T01SB2_A461Fase[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"Fase");
               GXutil.writeLogRaw("Old: ",Z461Fase);
               GXutil.writeLogRaw("Current: ",T01SB2_A461Fase[0]);
            }
            if ( DecimalUtil.compareTo(Z568HisProUni, T01SB2_A568HisProUni[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProUni");
               GXutil.writeLogRaw("Old: ",Z568HisProUni);
               GXutil.writeLogRaw("Current: ",T01SB2_A568HisProUni[0]);
            }
            if ( Z566HisProTur != T01SB2_A566HisProTur[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProTur");
               GXutil.writeLogRaw("Old: ",Z566HisProTur);
               GXutil.writeLogRaw("Current: ",T01SB2_A566HisProTur[0]);
            }
            if ( Z560HisProHin != T01SB2_A560HisProHin[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProHin");
               GXutil.writeLogRaw("Old: ",Z560HisProHin);
               GXutil.writeLogRaw("Current: ",T01SB2_A560HisProHin[0]);
            }
            if ( Z563HisProMin != T01SB2_A563HisProMin[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProMin");
               GXutil.writeLogRaw("Old: ",Z563HisProMin);
               GXutil.writeLogRaw("Current: ",T01SB2_A563HisProMin[0]);
            }
            if ( Z559HisProHfi != T01SB2_A559HisProHfi[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProHfi");
               GXutil.writeLogRaw("Old: ",Z559HisProHfi);
               GXutil.writeLogRaw("Current: ",T01SB2_A559HisProHfi[0]);
            }
            if ( Z562HisProMfi != T01SB2_A562HisProMfi[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProMfi");
               GXutil.writeLogRaw("Old: ",Z562HisProMfi);
               GXutil.writeLogRaw("Current: ",T01SB2_A562HisProMfi[0]);
            }
            if ( GXutil.strcmp(Z557HisProF, T01SB2_A557HisProF[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProF");
               GXutil.writeLogRaw("Old: ",Z557HisProF);
               GXutil.writeLogRaw("Current: ",T01SB2_A557HisProF[0]);
            }
            if ( Z565HisProTte != T01SB2_A565HisProTte[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProTte");
               GXutil.writeLogRaw("Old: ",Z565HisProTte);
               GXutil.writeLogRaw("Current: ",T01SB2_A565HisProTte[0]);
            }
            if ( Z543HisBarTip != T01SB2_A543HisBarTip[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisBarTip");
               GXutil.writeLogRaw("Old: ",Z543HisBarTip);
               GXutil.writeLogRaw("Current: ",T01SB2_A543HisBarTip[0]);
            }
            if ( Z556HisProEst != T01SB2_A556HisProEst[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProEst");
               GXutil.writeLogRaw("Old: ",Z556HisProEst);
               GXutil.writeLogRaw("Current: ",T01SB2_A556HisProEst[0]);
            }
            if ( DecimalUtil.compareTo(Z1525HisProKgr, T01SB2_A1525HisProKgr[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProKgr");
               GXutil.writeLogRaw("Old: ",Z1525HisProKgr);
               GXutil.writeLogRaw("Current: ",T01SB2_A1525HisProKgr[0]);
            }
            if ( DecimalUtil.compareTo(Z1526HisProMtr, T01SB2_A1526HisProMtr[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProMtr");
               GXutil.writeLogRaw("Old: ",Z1526HisProMtr);
               GXutil.writeLogRaw("Current: ",T01SB2_A1526HisProMtr[0]);
            }
            if ( Z2247HisProTip != T01SB2_A2247HisProTip[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProTip");
               GXutil.writeLogRaw("Old: ",Z2247HisProTip);
               GXutil.writeLogRaw("Current: ",T01SB2_A2247HisProTip[0]);
            }
            if ( GXutil.strcmp(Z2504HisProCod, T01SB2_A2504HisProCod[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProCod");
               GXutil.writeLogRaw("Old: ",Z2504HisProCod);
               GXutil.writeLogRaw("Current: ",T01SB2_A2504HisProCod[0]);
            }
            if ( GXutil.strcmp(Z3610HisProLot, T01SB2_A3610HisProLot[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProLot");
               GXutil.writeLogRaw("Old: ",Z3610HisProLot);
               GXutil.writeLogRaw("Current: ",T01SB2_A3610HisProLot[0]);
            }
            if ( Z3611HisProTc != T01SB2_A3611HisProTc[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProTc");
               GXutil.writeLogRaw("Old: ",Z3611HisProTc);
               GXutil.writeLogRaw("Current: ",T01SB2_A3611HisProTc[0]);
            }
            if ( Z3612HisProReo != T01SB2_A3612HisProReo[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProReo");
               GXutil.writeLogRaw("Old: ",Z3612HisProReo);
               GXutil.writeLogRaw("Current: ",T01SB2_A3612HisProReo[0]);
            }
            if ( Z4439HisProBot != T01SB2_A4439HisProBot[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProBot");
               GXutil.writeLogRaw("Old: ",Z4439HisProBot);
               GXutil.writeLogRaw("Current: ",T01SB2_A4439HisProBot[0]);
            }
            if ( Z4704HisProNPar != T01SB2_A4704HisProNPar[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProNPar");
               GXutil.writeLogRaw("Old: ",Z4704HisProNPar);
               GXutil.writeLogRaw("Current: ",T01SB2_A4704HisProNPar[0]);
            }
            if ( Z4714HisProNpzs != T01SB2_A4714HisProNpzs[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProNpzs");
               GXutil.writeLogRaw("Old: ",Z4714HisProNpzs);
               GXutil.writeLogRaw("Current: ",T01SB2_A4714HisProNpzs[0]);
            }
            if ( GXutil.strcmp(Z5339HisProBan, T01SB2_A5339HisProBan[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProBan");
               GXutil.writeLogRaw("Old: ",Z5339HisProBan);
               GXutil.writeLogRaw("Current: ",T01SB2_A5339HisProBan[0]);
            }
            if ( GXutil.strcmp(Z5522HisProDR, T01SB2_A5522HisProDR[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProDR");
               GXutil.writeLogRaw("Old: ",Z5522HisProDR);
               GXutil.writeLogRaw("Current: ",T01SB2_A5522HisProDR[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5606HisProDi), GXutil.resetTime(T01SB2_A5606HisProDi[0])) ) )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProDi");
               GXutil.writeLogRaw("Old: ",Z5606HisProDi);
               GXutil.writeLogRaw("Current: ",T01SB2_A5606HisProDi[0]);
            }
            if ( !( GXutil.dateCompare(Z5607HisProHi, T01SB2_A5607HisProHi[0]) ) )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProHi");
               GXutil.writeLogRaw("Old: ",Z5607HisProHi);
               GXutil.writeLogRaw("Current: ",T01SB2_A5607HisProHi[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z5608HisProDf), GXutil.resetTime(T01SB2_A5608HisProDf[0])) ) )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProDf");
               GXutil.writeLogRaw("Old: ",Z5608HisProDf);
               GXutil.writeLogRaw("Current: ",T01SB2_A5608HisProDf[0]);
            }
            if ( !( GXutil.dateCompare(Z5609HisProHf, T01SB2_A5609HisProHf[0]) ) )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProHf");
               GXutil.writeLogRaw("Old: ",Z5609HisProHf);
               GXutil.writeLogRaw("Current: ",T01SB2_A5609HisProHf[0]);
            }
            if ( GXutil.strcmp(Z6661EstPecas, T01SB2_A6661EstPecas[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"EstPecas");
               GXutil.writeLogRaw("Old: ",Z6661EstPecas);
               GXutil.writeLogRaw("Current: ",T01SB2_A6661EstPecas[0]);
            }
            if ( Z6680HisproTdab != T01SB2_A6680HisproTdab[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisproTdab");
               GXutil.writeLogRaw("Old: ",Z6680HisproTdab);
               GXutil.writeLogRaw("Current: ",T01SB2_A6680HisproTdab[0]);
            }
            if ( Z6819HisproNPd != T01SB2_A6819HisproNPd[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisproNPd");
               GXutil.writeLogRaw("Old: ",Z6819HisproNPd);
               GXutil.writeLogRaw("Current: ",T01SB2_A6819HisproNPd[0]);
            }
            if ( GXutil.strcmp(Z7394HisProCtr, T01SB2_A7394HisProCtr[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProCtr");
               GXutil.writeLogRaw("Old: ",Z7394HisProCtr);
               GXutil.writeLogRaw("Current: ",T01SB2_A7394HisProCtr[0]);
            }
            if ( Z8566HisproGf != T01SB2_A8566HisproGf[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisproGf");
               GXutil.writeLogRaw("Old: ",Z8566HisproGf);
               GXutil.writeLogRaw("Current: ",T01SB2_A8566HisproGf[0]);
            }
            if ( DecimalUtil.compareTo(Z4003HisHhMaq, T01SB2_A4003HisHhMaq[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisHhMaq");
               GXutil.writeLogRaw("Old: ",Z4003HisHhMaq);
               GXutil.writeLogRaw("Current: ",T01SB2_A4003HisHhMaq[0]);
            }
            if ( DecimalUtil.compareTo(Z1060HisHhIni, T01SB2_A1060HisHhIni[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisHhIni");
               GXutil.writeLogRaw("Old: ",Z1060HisHhIni);
               GXutil.writeLogRaw("Current: ",T01SB2_A1060HisHhIni[0]);
            }
            if ( GXutil.strcmp(Z10359HisProMq, T01SB2_A10359HisProMq[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProMq");
               GXutil.writeLogRaw("Old: ",Z10359HisProMq);
               GXutil.writeLogRaw("Current: ",T01SB2_A10359HisProMq[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z10360HisProFd), GXutil.resetTime(T01SB2_A10360HisProFd[0])) ) )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProFd");
               GXutil.writeLogRaw("Old: ",Z10360HisProFd);
               GXutil.writeLogRaw("Current: ",T01SB2_A10360HisProFd[0]);
            }
            if ( GXutil.strcmp(Z13124HisProDibC, T01SB2_A13124HisProDibC[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProDibC");
               GXutil.writeLogRaw("Old: ",Z13124HisProDibC);
               GXutil.writeLogRaw("Current: ",T01SB2_A13124HisProDibC[0]);
            }
            if ( Z13125HisProDibI != T01SB2_A13125HisProDibI[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProDibI");
               GXutil.writeLogRaw("Old: ",Z13125HisProDibI);
               GXutil.writeLogRaw("Current: ",T01SB2_A13125HisProDibI[0]);
            }
            if ( GXutil.strcmp(Z13126HisProCom, T01SB2_A13126HisProCom[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProCom");
               GXutil.writeLogRaw("Old: ",Z13126HisProCom);
               GXutil.writeLogRaw("Current: ",T01SB2_A13126HisProCom[0]);
            }
            if ( GXutil.strcmp(Z13127HisProFon, T01SB2_A13127HisProFon[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProFon");
               GXutil.writeLogRaw("Old: ",Z13127HisProFon);
               GXutil.writeLogRaw("Current: ",T01SB2_A13127HisProFon[0]);
            }
            if ( DecimalUtil.compareTo(Z13128HisProMtHd, T01SB2_A13128HisProMtHd[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProMtHd");
               GXutil.writeLogRaw("Old: ",Z13128HisProMtHd);
               GXutil.writeLogRaw("Current: ",T01SB2_A13128HisProMtHd[0]);
            }
            if ( DecimalUtil.compareTo(Z13129HisProKgHd, T01SB2_A13129HisProKgHd[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProKgHd");
               GXutil.writeLogRaw("Old: ",Z13129HisProKgHd);
               GXutil.writeLogRaw("Current: ",T01SB2_A13129HisProKgHd[0]);
            }
            if ( Z13130HisProPzHd != T01SB2_A13130HisProPzHd[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProPzHd");
               GXutil.writeLogRaw("Old: ",Z13130HisProPzHd);
               GXutil.writeLogRaw("Current: ",T01SB2_A13130HisProPzHd[0]);
            }
            if ( Z14020Hisprosec != T01SB2_A14020Hisprosec[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"Hisprosec");
               GXutil.writeLogRaw("Old: ",Z14020Hisprosec);
               GXutil.writeLogRaw("Current: ",T01SB2_A14020Hisprosec[0]);
            }
            if ( DecimalUtil.compareTo(Z14021HisproMtsI, T01SB2_A14021HisproMtsI[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisproMtsI");
               GXutil.writeLogRaw("Old: ",Z14021HisproMtsI);
               GXutil.writeLogRaw("Current: ",T01SB2_A14021HisproMtsI[0]);
            }
            if ( Z14022HisProAncI != T01SB2_A14022HisProAncI[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProAncI");
               GXutil.writeLogRaw("Old: ",Z14022HisProAncI);
               GXutil.writeLogRaw("Current: ",T01SB2_A14022HisProAncI[0]);
            }
            if ( DecimalUtil.compareTo(Z14023HisProMtsF, T01SB2_A14023HisProMtsF[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProMtsF");
               GXutil.writeLogRaw("Old: ",Z14023HisProMtsF);
               GXutil.writeLogRaw("Current: ",T01SB2_A14023HisProMtsF[0]);
            }
            if ( Z14024HisProAncF != T01SB2_A14024HisProAncF[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProAncF");
               GXutil.writeLogRaw("Old: ",Z14024HisProAncF);
               GXutil.writeLogRaw("Current: ",T01SB2_A14024HisProAncF[0]);
            }
            if ( GXutil.strcmp(Z14025HisProResi, T01SB2_A14025HisProResi[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProResi");
               GXutil.writeLogRaw("Old: ",Z14025HisProResi);
               GXutil.writeLogRaw("Current: ",T01SB2_A14025HisProResi[0]);
            }
            if ( Z14026HisProResA != T01SB2_A14026HisProResA[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProResA");
               GXutil.writeLogRaw("Old: ",Z14026HisProResA);
               GXutil.writeLogRaw("Current: ",T01SB2_A14026HisProResA[0]);
            }
            if ( Z14197HisProNFus != T01SB2_A14197HisProNFus[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProNFus");
               GXutil.writeLogRaw("Old: ",Z14197HisProNFus);
               GXutil.writeLogRaw("Current: ",T01SB2_A14197HisProNFus[0]);
            }
            if ( Z14205HisproFuso != T01SB2_A14205HisproFuso[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisproFuso");
               GXutil.writeLogRaw("Old: ",Z14205HisproFuso);
               GXutil.writeLogRaw("Current: ",T01SB2_A14205HisproFuso[0]);
            }
            if ( Z14206HisProNSup != T01SB2_A14206HisProNSup[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProNSup");
               GXutil.writeLogRaw("Old: ",Z14206HisProNSup);
               GXutil.writeLogRaw("Current: ",T01SB2_A14206HisProNSup[0]);
            }
            if ( DecimalUtil.compareTo(Z14207HisProPsop, T01SB2_A14207HisProPsop[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProPsop");
               GXutil.writeLogRaw("Old: ",Z14207HisProPsop);
               GXutil.writeLogRaw("Current: ",T01SB2_A14207HisProPsop[0]);
            }
            if ( Z14208HisProTipC != T01SB2_A14208HisProTipC[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisProTipC");
               GXutil.writeLogRaw("Old: ",Z14208HisProTipC);
               GXutil.writeLogRaw("Current: ",T01SB2_A14208HisProTipC[0]);
            }
            if ( DecimalUtil.compareTo(Z14209HisproTara, T01SB2_A14209HisproTara[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"HisproTara");
               GXutil.writeLogRaw("Old: ",Z14209HisproTara);
               GXutil.writeLogRaw("Current: ",T01SB2_A14209HisproTara[0]);
            }
            if ( Z503GruOpeCod != T01SB2_A503GruOpeCod[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"GruOpeCod");
               GXutil.writeLogRaw("Old: ",Z503GruOpeCod);
               GXutil.writeLogRaw("Current: ",T01SB2_A503GruOpeCod[0]);
            }
            if ( Z129BarCod != T01SB2_A129BarCod[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"BarCod");
               GXutil.writeLogRaw("Old: ",Z129BarCod);
               GXutil.writeLogRaw("Current: ",T01SB2_A129BarCod[0]);
            }
            if ( Z132BarCodReo != T01SB2_A132BarCodReo[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"BarCodReo");
               GXutil.writeLogRaw("Old: ",Z132BarCodReo);
               GXutil.writeLogRaw("Current: ",T01SB2_A132BarCodReo[0]);
            }
            if ( GXutil.strcmp(Z130BarCodPar, T01SB2_A130BarCodPar[0]) != 0 )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"BarCodPar");
               GXutil.writeLogRaw("Old: ",Z130BarCodPar);
               GXutil.writeLogRaw("Current: ",T01SB2_A130BarCodPar[0]);
            }
            if ( Z656ParCod != T01SB2_A656ParCod[0] )
            {
               GXutil.writeLogln("produccion.parteproduccion_trn:[seudo value changed for attri]"+"ParCod");
               GXutil.writeLogRaw("Old: ",Z656ParCod);
               GXutil.writeLogRaw("Current: ",T01SB2_A656ParCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLHIPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SB59( )
   {
      beforeValidate1SB59( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SB59( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SB59( 0) ;
         checkOptimisticConcurrency1SB59( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SB59( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SB59( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SB35 */
                  pr_default.execute(26, new Object[] {Integer.valueOf(A561HisProLin), Short.valueOf(A194BarOrdLin), A461Fase, A568HisProUni, Byte.valueOf(A566HisProTur), Byte.valueOf(A560HisProHin), Byte.valueOf(A563HisProMin), Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), A557HisProF, Short.valueOf(A565HisProTte), Byte.valueOf(A543HisBarTip), Byte.valueOf(A556HisProEst), A1525HisProKgr, A1526HisProMtr, Short.valueOf(A2247HisProTip), A2504HisProCod, A3610HisProLot, Byte.valueOf(A3611HisProTc), Byte.valueOf(A3612HisProReo), Integer.valueOf(A4439HisProBot), Integer.valueOf(A4704HisProNPar), Short.valueOf(A4714HisProNpzs), A5339HisProBan, A5522HisProDR, A5606HisProDi, A5607HisProHi, A5608HisProDf, A5609HisProHf, A6661EstPecas, Short.valueOf(A6680HisproTdab), Byte.valueOf(A6819HisproNPd), A7394HisProCtr, Short.valueOf(A8566HisproGf), A4003HisHhMaq, A1060HisHhIni, A10359HisProMq, A10360HisProFd, A13124HisProDibC, Integer.valueOf(A13125HisProDibI), A13126HisProCom, A13127HisProFon, A13128HisProMtHd, A13129HisProKgHd, Integer.valueOf(A13130HisProPzHd), Short.valueOf(A14020Hisprosec), A14021HisproMtsI, Short.valueOf(A14022HisProAncI), A14023HisProMtsF, Short.valueOf(A14024HisProAncF), A14025HisProResi, Byte.valueOf(A14026HisProResA), Integer.valueOf(A14197HisProNFus), Integer.valueOf(A14205HisproFuso), Integer.valueOf(A14206HisProNSup), A14207HisProPsop, Short.valueOf(A14208HisProTipC), A14209HisproTara, A396EmprCod, Integer.valueOf(A503GruOpeCod), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
                  if ( (pr_default.getStatus(26) == 1) )
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
                        resetCaption1SB0( ) ;
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
            load1SB59( ) ;
         }
         endLevel1SB59( ) ;
      }
      closeExtendedTableCursors1SB59( ) ;
   }

   public void update1SB59( )
   {
      beforeValidate1SB59( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SB59( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SB59( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SB59( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SB59( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SB36 */
                  pr_default.execute(27, new Object[] {Short.valueOf(A194BarOrdLin), A461Fase, A568HisProUni, Byte.valueOf(A566HisProTur), Byte.valueOf(A560HisProHin), Byte.valueOf(A563HisProMin), Byte.valueOf(A559HisProHfi), Byte.valueOf(A562HisProMfi), A557HisProF, Short.valueOf(A565HisProTte), Byte.valueOf(A543HisBarTip), Byte.valueOf(A556HisProEst), A1525HisProKgr, A1526HisProMtr, Short.valueOf(A2247HisProTip), A2504HisProCod, A3610HisProLot, Byte.valueOf(A3611HisProTc), Byte.valueOf(A3612HisProReo), Integer.valueOf(A4439HisProBot), Integer.valueOf(A4704HisProNPar), Short.valueOf(A4714HisProNpzs), A5339HisProBan, A5522HisProDR, A5606HisProDi, A5607HisProHi, A5608HisProDf, A5609HisProHf, A6661EstPecas, Short.valueOf(A6680HisproTdab), Byte.valueOf(A6819HisproNPd), A7394HisProCtr, Short.valueOf(A8566HisproGf), A4003HisHhMaq, A1060HisHhIni, A10359HisProMq, A10360HisProFd, A13124HisProDibC, Integer.valueOf(A13125HisProDibI), A13126HisProCom, A13127HisProFon, A13128HisProMtHd, A13129HisProKgHd, Integer.valueOf(A13130HisProPzHd), Short.valueOf(A14020Hisprosec), A14021HisproMtsI, Short.valueOf(A14022HisProAncI), A14023HisProMtsF, Short.valueOf(A14024HisProAncF), A14025HisProResi, Byte.valueOf(A14026HisProResA), Integer.valueOf(A14197HisProNFus), Integer.valueOf(A14205HisproFuso), Integer.valueOf(A14206HisProNSup), A14207HisProPsop, Short.valueOf(A14208HisProTipC), A14209HisproTara, Integer.valueOf(A503GruOpeCod), Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod), A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLHIPRO");
                  if ( (pr_default.getStatus(27) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLHIPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SB59( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption1SB0( ) ;
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
         endLevel1SB59( ) ;
      }
      closeExtendedTableCursors1SB59( ) ;
   }

   public void deferredUpdate1SB59( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1SB59( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SB59( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SB59( ) ;
         afterConfirm1SB59( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SB59( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SB37 */
               pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
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
                        initAll1SB59( ) ;
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
                     resetCaption1SB0( ) ;
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
      endLevel1SB59( ) ;
      Gx_mode = sMode59 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SB59( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SB38 */
         pr_default.execute(29, new Object[] {A396EmprCod});
         A407EmprNom = T01SB38_A407EmprNom[0] ;
         n407EmprNom = T01SB38_n407EmprNom[0] ;
         pr_default.close(29);
         /* Using cursor T01SB39 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         A606MaqDsc = T01SB39_A606MaqDsc[0] ;
         n606MaqDsc = T01SB39_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         pr_default.close(30);
         /* Using cursor T01SB40 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
         A567HisProULin = T01SB40_A567HisProULin[0] ;
         n567HisProULin = T01SB40_n567HisProULin[0] ;
         pr_default.close(31);
         GXt_char1 = A14027Fase_Dsc ;
         GXv_char2[0] = GXt_char1 ;
         new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
         parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         A14027Fase_Dsc = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14027Fase_Dsc", A14027Fase_Dsc);
         GXt_char1 = A14028Gruopecod_ ;
         GXv_char2[0] = GXt_char1 ;
         new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
         parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
         A14028Gruopecod_ = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14028Gruopecod_", A14028Gruopecod_);
         /* Using cursor T01SB41 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         A361DisCod = T01SB41_A361DisCod[0] ;
         pr_default.close(32);
         /* Using cursor T01SB42 */
         pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         A392DisUniMed = T01SB42_A392DisUniMed[0] ;
         pr_default.close(33);
         /* Using cursor T01SB44 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
         if ( (pr_default.getStatus(34) != 101) )
         {
            A1280BarMla = T01SB44_A1280BarMla[0] ;
            A1279BarKla = T01SB44_A1279BarKla[0] ;
         }
         else
         {
            A1280BarMla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
            A1279BarKla = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
         }
         pr_default.close(34);
         /* Using cursor T01SB45 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
         A867ParCodNom = T01SB45_A867ParCodNom[0] ;
         n867ParCodNom = T01SB45_n867ParCodNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
         pr_default.close(35);
         /* Using cursor T01SB47 */
         pr_default.execute(36, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            A307CodFas = T01SB47_A307CodFas[0] ;
            n307CodFas = T01SB47_n307CodFas[0] ;
         }
         else
         {
            A307CodFas = "" ;
            n307CodFas = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", A307CodFas);
         }
         pr_default.close(36);
         /* Using cursor T01SB49 */
         pr_default.execute(37, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            A462FasEst = T01SB49_A462FasEst[0] ;
            n462FasEst = T01SB49_n462FasEst[0] ;
         }
         else
         {
            A462FasEst = (byte)(3) ;
            n462FasEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.str( A462FasEst, 1, 0));
         }
         pr_default.close(37);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SB50 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURAR PARAMETROS PERCHAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01SB51 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA PARAMETROS EMPAQUETAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01SB52 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA PARAMETROS CALANDRAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01SB53 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPTURA DATOS ABRIR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01SB54 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISPZS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01SB55 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Histórico de parámetros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
      }
   }

   public void endLevel1SB59( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SB59( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "produccion.parteproduccion_trn");
         if ( AnyError == 0 )
         {
            confirmValues1SB0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "produccion.parteproduccion_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SB59( )
   {
      /* Using cursor T01SB56 */
      pr_default.execute(44);
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A396EmprCod = T01SB56_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01SB56_A602MaqCod[0] ;
         n602MaqCod = T01SB56_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T01SB56_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = T01SB56_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SB59( )
   {
      /* Scan next routine */
      pr_default.readNext(44);
      RcdFound59 = (short)(0) ;
      if ( (pr_default.getStatus(44) != 101) )
      {
         RcdFound59 = (short)(1) ;
         A396EmprCod = T01SB56_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A602MaqCod = T01SB56_A602MaqCod[0] ;
         n602MaqCod = T01SB56_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A558HisProFec = T01SB56_A558HisProFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558HisProFec", localUtil.format(A558HisProFec, "99/99/99"));
         A561HisProLin = T01SB56_A561HisProLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561HisProLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A561HisProLin), 8, 0));
      }
   }

   public void scanEnd1SB59( )
   {
      pr_default.close(44);
   }

   public void afterConfirm1SB59( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SB59( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SB59( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SB59( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SB59( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SB59( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SB59( )
   {
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      edtHisProFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFec_Enabled), 5, 0), true);
      edtHisProLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProLin_Enabled), 5, 0), true);
      edtGruopecod__Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGruopecod__Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGruopecod__Enabled), 5, 0), true);
      edtFase_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFase_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFase_Dsc_Enabled), 5, 0), true);
      edtParCodNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParCodNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParCodNom_Enabled), 5, 0), true);
      edtHisProDR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProDR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDR_Enabled), 5, 0), true);
      edtHisProDi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProDi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDi_Enabled), 5, 0), true);
      edtHisProHi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProHi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProHi_Enabled), 5, 0), true);
      edtHisProDf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProDf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDf_Enabled), 5, 0), true);
      edtHisProHf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProHf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProHf_Enabled), 5, 0), true);
      edtEstPecas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEstPecas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEstPecas_Enabled), 5, 0), true);
      edtHisproTdab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisproTdab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisproTdab_Enabled), 5, 0), true);
      edtHisproNPd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisproNPd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisproNPd_Enabled), 5, 0), true);
      edtHisProCtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProCtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCtr_Enabled), 5, 0), true);
      edtHisproGf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisproGf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisproGf_Enabled), 5, 0), true);
      edtHisHhMaq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisHhMaq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisHhMaq_Enabled), 5, 0), true);
      edtHisHhIni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisHhIni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisHhIni_Enabled), 5, 0), true);
      edtHisProMq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMq_Enabled), 5, 0), true);
      edtHisProFd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProFd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFd_Enabled), 5, 0), true);
      edtHisProDibC_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProDibC_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDibC_Enabled), 5, 0), true);
      edtHisProDibI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProDibI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProDibI_Enabled), 5, 0), true);
      edtHisProCom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProCom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProCom_Enabled), 5, 0), true);
      edtHisProFon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProFon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProFon_Enabled), 5, 0), true);
      edtHisProMtHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMtHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtHd_Enabled), 5, 0), true);
      edtHisProKgHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProKgHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProKgHd_Enabled), 5, 0), true);
      edtHisProPzHd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProPzHd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProPzHd_Enabled), 5, 0), true);
      edtHisprosec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisprosec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisprosec_Enabled), 5, 0), true);
      edtHisproMtsI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisproMtsI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisproMtsI_Enabled), 5, 0), true);
      edtHisProAncI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProAncI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProAncI_Enabled), 5, 0), true);
      edtHisProMtsF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProMtsF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProMtsF_Enabled), 5, 0), true);
      edtHisProAncF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProAncF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProAncF_Enabled), 5, 0), true);
      edtHisProResi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProResi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProResi_Enabled), 5, 0), true);
      edtHisProResA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtHisProResA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHisProResA_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SB59( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SB0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.parteproduccion_trn", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ParteProduccion_TRN");
      forbiddenHiddens.add("HisProTre", localUtil.format( DecimalUtil.doubleToDec(A564HisProTre), "ZZZ9"));
      forbiddenHiddens.add("BarOrdLinV", localUtil.format( DecimalUtil.doubleToDec(A195BarOrdLinV), "ZZZ9"));
      forbiddenHiddens.add("BarCodParV", GXutil.rtrim( localUtil.format( A131BarCodParV, "")));
      forbiddenHiddens.add("BarCodReoV", localUtil.format( DecimalUtil.doubleToDec(A133BarCodReoV), "9"));
      forbiddenHiddens.add("BarCodVir", localUtil.format( DecimalUtil.doubleToDec(A134BarCodVir), "ZZZZZZZZ9"));
      forbiddenHiddens.add("BarCod", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"));
      forbiddenHiddens.add("BarCodReo", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"));
      forbiddenHiddens.add("BarCodPar", GXutil.rtrim( localUtil.format( A130BarCodPar, "")));
      forbiddenHiddens.add("GruOpeCod", localUtil.format( DecimalUtil.doubleToDec(A503GruOpeCod), "ZZZZZ9"));
      forbiddenHiddens.add("BarOrdLin", localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"));
      forbiddenHiddens.add("Fase", GXutil.rtrim( localUtil.format( A461Fase, "")));
      forbiddenHiddens.add("HisProUni", localUtil.format( A568HisProUni, "ZZZZZ9.99"));
      forbiddenHiddens.add("HisProTur", localUtil.format( DecimalUtil.doubleToDec(A566HisProTur), "9"));
      forbiddenHiddens.add("HisProHin", localUtil.format( DecimalUtil.doubleToDec(A560HisProHin), "Z9"));
      forbiddenHiddens.add("HisProMin", localUtil.format( DecimalUtil.doubleToDec(A563HisProMin), "99"));
      forbiddenHiddens.add("HisProHfi", localUtil.format( DecimalUtil.doubleToDec(A559HisProHfi), "Z9"));
      forbiddenHiddens.add("HisProMfi", localUtil.format( DecimalUtil.doubleToDec(A562HisProMfi), "99"));
      forbiddenHiddens.add("HisProF", GXutil.rtrim( localUtil.format( A557HisProF, "@!")));
      forbiddenHiddens.add("ParCod", localUtil.format( DecimalUtil.doubleToDec(A656ParCod), "ZZZ9"));
      forbiddenHiddens.add("HisProTte", localUtil.format( DecimalUtil.doubleToDec(A565HisProTte), "ZZZ9"));
      forbiddenHiddens.add("HisBarTip", localUtil.format( DecimalUtil.doubleToDec(A543HisBarTip), "9"));
      forbiddenHiddens.add("HisProEst", localUtil.format( DecimalUtil.doubleToDec(A556HisProEst), "9"));
      forbiddenHiddens.add("HisProKgr", localUtil.format( A1525HisProKgr, "ZZZZZ9.99"));
      forbiddenHiddens.add("HisProMtr", localUtil.format( A1526HisProMtr, "ZZZZZ9.99"));
      forbiddenHiddens.add("HisProTip", localUtil.format( DecimalUtil.doubleToDec(A2247HisProTip), "ZZZ9"));
      forbiddenHiddens.add("HisProCod", GXutil.rtrim( localUtil.format( A2504HisProCod, "")));
      forbiddenHiddens.add("HisProLot", GXutil.rtrim( localUtil.format( A3610HisProLot, "")));
      forbiddenHiddens.add("HisProTc", localUtil.format( DecimalUtil.doubleToDec(A3611HisProTc), "Z9"));
      forbiddenHiddens.add("HisProReo", localUtil.format( DecimalUtil.doubleToDec(A3612HisProReo), "9"));
      forbiddenHiddens.add("HisProBot", localUtil.format( DecimalUtil.doubleToDec(A4439HisProBot), "ZZZZZ9"));
      forbiddenHiddens.add("HisProNPar", localUtil.format( DecimalUtil.doubleToDec(A4704HisProNPar), "ZZZZZ9"));
      forbiddenHiddens.add("HisProNpzs", localUtil.format( DecimalUtil.doubleToDec(A4714HisProNpzs), "ZZZ9"));
      forbiddenHiddens.add("HisProBan", GXutil.rtrim( localUtil.format( A5339HisProBan, "")));
      forbiddenHiddens.add("HisProNFus", localUtil.format( DecimalUtil.doubleToDec(A14197HisProNFus), "ZZZZZ9"));
      forbiddenHiddens.add("HisproFuso", localUtil.format( DecimalUtil.doubleToDec(A14205HisproFuso), "ZZZZZ9"));
      forbiddenHiddens.add("HisProNSup", localUtil.format( DecimalUtil.doubleToDec(A14206HisProNSup), "ZZZZZ9"));
      forbiddenHiddens.add("HisProPsop", localUtil.format( A14207HisProPsop, "ZZZZZ9.99"));
      forbiddenHiddens.add("HisProTipC", localUtil.format( DecimalUtil.doubleToDec(A14208HisProTipC), "ZZZ9"));
      forbiddenHiddens.add("HisproTara", localUtil.format( A14209HisproTara, "ZZ9.9999"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\parteproduccion_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5522HisProDR", GXutil.rtrim( Z5522HisProDR));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5606HisProDi", localUtil.dtoc( Z5606HisProDi, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5607HisProHi", localUtil.ttoc( Z5607HisProHi, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5608HisProDf", localUtil.dtoc( Z5608HisProDf, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5609HisProHf", localUtil.ttoc( Z5609HisProHf, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6661EstPecas", GXutil.rtrim( Z6661EstPecas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6680HisproTdab", GXutil.ltrim( localUtil.ntoc( Z6680HisproTdab, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6819HisproNPd", GXutil.ltrim( localUtil.ntoc( Z6819HisproNPd, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7394HisProCtr", GXutil.rtrim( Z7394HisProCtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8566HisproGf", GXutil.ltrim( localUtil.ntoc( Z8566HisproGf, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4003HisHhMaq", GXutil.ltrim( localUtil.ntoc( Z4003HisHhMaq, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1060HisHhIni", GXutil.ltrim( localUtil.ntoc( Z1060HisHhIni, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10359HisProMq", GXutil.rtrim( Z10359HisProMq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10360HisProFd", localUtil.dtoc( Z10360HisProFd, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13124HisProDibC", GXutil.rtrim( Z13124HisProDibC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13125HisProDibI", GXutil.ltrim( localUtil.ntoc( Z13125HisProDibI, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13126HisProCom", GXutil.rtrim( Z13126HisProCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13127HisProFon", GXutil.rtrim( Z13127HisProFon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13128HisProMtHd", GXutil.ltrim( localUtil.ntoc( Z13128HisProMtHd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13129HisProKgHd", GXutil.ltrim( localUtil.ntoc( Z13129HisProKgHd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13130HisProPzHd", GXutil.ltrim( localUtil.ntoc( Z13130HisProPzHd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14020Hisprosec", GXutil.ltrim( localUtil.ntoc( Z14020Hisprosec, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14021HisproMtsI", GXutil.ltrim( localUtil.ntoc( Z14021HisproMtsI, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14022HisProAncI", GXutil.ltrim( localUtil.ntoc( Z14022HisProAncI, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14023HisProMtsF", GXutil.ltrim( localUtil.ntoc( Z14023HisProMtsF, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14024HisProAncF", GXutil.ltrim( localUtil.ntoc( Z14024HisProAncF, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14025HisProResi", GXutil.rtrim( Z14025HisProResi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14026HisProResA", GXutil.ltrim( localUtil.ntoc( Z14026HisProResA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14197HisProNFus", GXutil.ltrim( localUtil.ntoc( Z14197HisProNFus, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14205HisproFuso", GXutil.ltrim( localUtil.ntoc( Z14205HisproFuso, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14206HisProNSup", GXutil.ltrim( localUtil.ntoc( Z14206HisProNSup, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14207HisProPsop", GXutil.ltrim( localUtil.ntoc( Z14207HisProPsop, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14208HisProTipC", GXutil.ltrim( localUtil.ntoc( Z14208HisProTipC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14209HisproTara", GXutil.ltrim( localUtil.ntoc( Z14209HisproTara, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z503GruOpeCod", GXutil.ltrim( localUtil.ntoc( Z503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z129BarCod", GXutil.ltrim( localUtil.ntoc( Z129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z132BarCodReo", GXutil.ltrim( localUtil.ntoc( Z132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z130BarCodPar", GXutil.rtrim( Z130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "Z656ParCod", GXutil.ltrim( localUtil.ntoc( Z656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "GRUOPECOD", GXutil.ltrim( localUtil.ntoc( A503GruOpeCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASE", GXutil.rtrim( A461Fase));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODVIR", GXutil.ltrim( localUtil.ntoc( A134BarCodVir, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREOV", GXutil.ltrim( localUtil.ntoc( A133BarCodReoV, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPARV", GXutil.rtrim( A131BarCodParV));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLINV", GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROHFI", GXutil.ltrim( localUtil.ntoc( A559HisProHfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMFI", GXutil.ltrim( localUtil.ntoc( A562HisProMfi, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROHIN", GXutil.ltrim( localUtil.ntoc( A560HisProHin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMIN", GXutil.ltrim( localUtil.ntoc( A563HisProMin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTRE", GXutil.ltrim( localUtil.ntoc( A564HisProTre, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROUNI", GXutil.ltrim( localUtil.ntoc( A568HisProUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTUR", GXutil.ltrim( localUtil.ntoc( A566HisProTur, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROF", GXutil.rtrim( A557HisProF));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTTE", GXutil.ltrim( localUtil.ntoc( A565HisProTte, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISBARTIP", GXutil.ltrim( localUtil.ntoc( A543HisBarTip, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROEST", GXutil.ltrim( localUtil.ntoc( A556HisProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROKGR", GXutil.ltrim( localUtil.ntoc( A1525HisProKgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROMTR", GXutil.ltrim( localUtil.ntoc( A1526HisProMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTIP", GXutil.ltrim( localUtil.ntoc( A2247HisProTip, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROCOD", GXutil.rtrim( A2504HisProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROLOT", GXutil.rtrim( A3610HisProLot));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTC", GXutil.ltrim( localUtil.ntoc( A3611HisProTc, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROREO", GXutil.ltrim( localUtil.ntoc( A3612HisProReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROBOT", GXutil.ltrim( localUtil.ntoc( A4439HisProBot, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRONPAR", GXutil.ltrim( localUtil.ntoc( A4704HisProNPar, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRONPZS", GXutil.ltrim( localUtil.ntoc( A4714HisProNpzs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROBAN", GXutil.rtrim( A5339HisProBan));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRONFUS", GXutil.ltrim( localUtil.ntoc( A14197HisProNFus, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROFUSO", GXutil.ltrim( localUtil.ntoc( A14205HisproFuso, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPRONSUP", GXutil.ltrim( localUtil.ntoc( A14206HisProNSup, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROPSOP", GXutil.ltrim( localUtil.ntoc( A14207HisProPsop, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTIPC", GXutil.ltrim( localUtil.ntoc( A14208HisProTipC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROTARA", GXutil.ltrim( localUtil.ntoc( A14209HisproTara, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCOD", GXutil.ltrim( localUtil.ntoc( A656ParCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "HISPROULIN", GXutil.ltrim( localUtil.ntoc( A567HisProULin, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISUNIMED", GXutil.rtrim( A392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "CODFAS", GXutil.rtrim( A307CodFas));
      app.GxWebStd.gx_hidden_field( httpContext, "FASEST", GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMLA", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKLA", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.produccion.parteproduccion_trn", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.ParteProduccion_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Parte Produccion", "") ;
   }

   public void initializeNonKey1SB59( )
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
      A14027Fase_Dsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14027Fase_Dsc", A14027Fase_Dsc);
      A14028Gruopecod_ = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14028Gruopecod_", A14028Gruopecod_);
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      A567HisProULin = 0 ;
      n567HisProULin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A567HisProULin), 8, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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
      A867ParCodNom = "" ;
      n867ParCodNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", A867ParCodNom);
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
      A5522HisProDR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5522HisProDR", A5522HisProDR);
      A5606HisProDi = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5606HisProDi", localUtil.format(A5606HisProDi, "99/99/99"));
      A5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5607HisProHi", localUtil.ttoc( A5607HisProHi, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A5608HisProDf = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A5608HisProDf", localUtil.format(A5608HisProDf, "99/99/99"));
      A5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A5609HisProHf", localUtil.ttoc( A5609HisProHf, 0, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A6661EstPecas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6661EstPecas", A6661EstPecas);
      A6680HisproTdab = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6680HisproTdab", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6680HisproTdab), 4, 0));
      A6819HisproNPd = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6819HisproNPd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6819HisproNPd), 2, 0));
      A7394HisProCtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7394HisProCtr", A7394HisProCtr);
      A8566HisproGf = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8566HisproGf", GXutil.ltrimstr( DecimalUtil.doubleToDec(A8566HisproGf), 4, 0));
      A4003HisHhMaq = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A4003HisHhMaq", GXutil.ltrimstr( A4003HisHhMaq, 10, 2));
      A1060HisHhIni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1060HisHhIni", GXutil.ltrimstr( A1060HisHhIni, 10, 2));
      A10359HisProMq = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10359HisProMq", A10359HisProMq);
      A10360HisProFd = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A10360HisProFd", localUtil.format(A10360HisProFd, "99/99/99"));
      A13124HisProDibC = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13124HisProDibC", A13124HisProDibC);
      A13125HisProDibI = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13125HisProDibI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13125HisProDibI), 8, 0));
      A13126HisProCom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13126HisProCom", A13126HisProCom);
      A13127HisProFon = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13127HisProFon", A13127HisProFon);
      A13128HisProMtHd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13128HisProMtHd", GXutil.ltrimstr( A13128HisProMtHd, 9, 2));
      A13129HisProKgHd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13129HisProKgHd", GXutil.ltrimstr( A13129HisProKgHd, 9, 2));
      A13130HisProPzHd = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A13130HisProPzHd", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13130HisProPzHd), 6, 0));
      A14020Hisprosec = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14020Hisprosec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14020Hisprosec), 4, 0));
      A14021HisproMtsI = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14021HisproMtsI", GXutil.ltrimstr( A14021HisproMtsI, 9, 2));
      A14022HisProAncI = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14022HisProAncI", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14022HisProAncI), 4, 0));
      A14023HisProMtsF = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14023HisProMtsF", GXutil.ltrimstr( A14023HisProMtsF, 9, 2));
      A14024HisProAncF = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14024HisProAncF", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14024HisProAncF), 4, 0));
      A14025HisProResi = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14025HisProResi", A14025HisProResi);
      A14026HisProResA = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14026HisProResA", GXutil.str( A14026HisProResA, 1, 0));
      A1280BarMla = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrimstr( A1280BarMla, 9, 2));
      A1279BarKla = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrimstr( A1279BarKla, 9, 2));
      A14197HisProNFus = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14197HisProNFus", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14197HisProNFus), 6, 0));
      A14205HisproFuso = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14205HisproFuso", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14205HisproFuso), 6, 0));
      A14206HisProNSup = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14206HisProNSup", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14206HisProNSup), 6, 0));
      A14207HisProPsop = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14207HisProPsop", GXutil.ltrimstr( A14207HisProPsop, 9, 2));
      A14208HisProTipC = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14208HisProTipC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14208HisProTipC), 4, 0));
      A14209HisproTara = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14209HisproTara", GXutil.ltrimstr( A14209HisproTara, 8, 4));
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
      Z5522HisProDR = "" ;
      Z5606HisProDi = GXutil.nullDate() ;
      Z5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
      Z5608HisProDf = GXutil.nullDate() ;
      Z5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      Z6661EstPecas = "" ;
      Z6680HisproTdab = (short)(0) ;
      Z6819HisproNPd = (byte)(0) ;
      Z7394HisProCtr = "" ;
      Z8566HisproGf = (short)(0) ;
      Z4003HisHhMaq = DecimalUtil.ZERO ;
      Z1060HisHhIni = DecimalUtil.ZERO ;
      Z10359HisProMq = "" ;
      Z10360HisProFd = GXutil.nullDate() ;
      Z13124HisProDibC = "" ;
      Z13125HisProDibI = 0 ;
      Z13126HisProCom = "" ;
      Z13127HisProFon = "" ;
      Z13128HisProMtHd = DecimalUtil.ZERO ;
      Z13129HisProKgHd = DecimalUtil.ZERO ;
      Z13130HisProPzHd = 0 ;
      Z14020Hisprosec = (short)(0) ;
      Z14021HisproMtsI = DecimalUtil.ZERO ;
      Z14022HisProAncI = (short)(0) ;
      Z14023HisProMtsF = DecimalUtil.ZERO ;
      Z14024HisProAncF = (short)(0) ;
      Z14025HisProResi = "" ;
      Z14026HisProResA = (byte)(0) ;
      Z14197HisProNFus = 0 ;
      Z14205HisproFuso = 0 ;
      Z14206HisProNSup = 0 ;
      Z14207HisProPsop = DecimalUtil.ZERO ;
      Z14208HisProTipC = (short)(0) ;
      Z14209HisproTara = DecimalUtil.ZERO ;
      Z503GruOpeCod = 0 ;
      Z129BarCod = 0 ;
      Z132BarCodReo = (byte)(0) ;
      Z130BarCodPar = "" ;
      Z656ParCod = (short)(0) ;
   }

   public void initAll1SB59( )
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
      initializeNonKey1SB59( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241512122", true, true);
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
      httpContext.AddJavascriptSource("produccion/parteproduccion_trn.js", "?20268241512122", false, true);
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
      edtMaqDsc_Internalname = "MAQDSC" ;
      edtHisProFec_Internalname = "HISPROFEC" ;
      edtHisProLin_Internalname = "HISPROLIN" ;
      edtGruopecod__Internalname = "GRUOPECOD_" ;
      edtFase_Dsc_Internalname = "FASE_DSC" ;
      edtParCodNom_Internalname = "PARCODNOM" ;
      edtHisProDR_Internalname = "HISPRODR" ;
      edtHisProDi_Internalname = "HISPRODI" ;
      edtHisProHi_Internalname = "HISPROHI" ;
      edtHisProDf_Internalname = "HISPRODF" ;
      edtHisProHf_Internalname = "HISPROHF" ;
      edtEstPecas_Internalname = "ESTPECAS" ;
      edtHisproTdab_Internalname = "HISPROTDAB" ;
      edtHisproNPd_Internalname = "HISPRONPD" ;
      edtHisProCtr_Internalname = "HISPROCTR" ;
      edtHisproGf_Internalname = "HISPROGF" ;
      edtHisHhMaq_Internalname = "HISHHMAQ" ;
      edtHisHhIni_Internalname = "HISHHINI" ;
      edtHisProMq_Internalname = "HISPROMQ" ;
      edtHisProFd_Internalname = "HISPROFD" ;
      edtHisProDibC_Internalname = "HISPRODIBC" ;
      edtHisProDibI_Internalname = "HISPRODIBI" ;
      edtHisProCom_Internalname = "HISPROCOM" ;
      edtHisProFon_Internalname = "HISPROFON" ;
      edtHisProMtHd_Internalname = "HISPROMTHD" ;
      edtHisProKgHd_Internalname = "HISPROKGHD" ;
      edtHisProPzHd_Internalname = "HISPROPZHD" ;
      edtHisprosec_Internalname = "HISPROSEC" ;
      edtHisproMtsI_Internalname = "HISPROMTSI" ;
      edtHisProAncI_Internalname = "HISPROANCI" ;
      edtHisProMtsF_Internalname = "HISPROMTSF" ;
      edtHisProAncF_Internalname = "HISPROANCF" ;
      edtHisProResi_Internalname = "HISPRORESI" ;
      edtHisProResA_Internalname = "HISPRORESA" ;
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
      Form.setCaption( httpContext.getMessage( "Parte Produccion", "") );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtHisProResA_Jsonclick = "" ;
      edtHisProResA_Enabled = 1 ;
      edtHisProResi_Jsonclick = "" ;
      edtHisProResi_Enabled = 1 ;
      edtHisProAncF_Jsonclick = "" ;
      edtHisProAncF_Enabled = 1 ;
      edtHisProMtsF_Jsonclick = "" ;
      edtHisProMtsF_Enabled = 1 ;
      edtHisProAncI_Jsonclick = "" ;
      edtHisProAncI_Enabled = 1 ;
      edtHisproMtsI_Jsonclick = "" ;
      edtHisproMtsI_Enabled = 1 ;
      edtHisprosec_Jsonclick = "" ;
      edtHisprosec_Enabled = 1 ;
      edtHisProPzHd_Jsonclick = "" ;
      edtHisProPzHd_Enabled = 1 ;
      edtHisProKgHd_Jsonclick = "" ;
      edtHisProKgHd_Enabled = 1 ;
      edtHisProMtHd_Jsonclick = "" ;
      edtHisProMtHd_Enabled = 1 ;
      edtHisProFon_Jsonclick = "" ;
      edtHisProFon_Enabled = 1 ;
      edtHisProCom_Jsonclick = "" ;
      edtHisProCom_Enabled = 1 ;
      edtHisProDibI_Jsonclick = "" ;
      edtHisProDibI_Enabled = 1 ;
      edtHisProDibC_Jsonclick = "" ;
      edtHisProDibC_Enabled = 1 ;
      edtHisProFd_Jsonclick = "" ;
      edtHisProFd_Enabled = 1 ;
      edtHisProMq_Jsonclick = "" ;
      edtHisProMq_Enabled = 1 ;
      edtHisHhIni_Jsonclick = "" ;
      edtHisHhIni_Enabled = 1 ;
      edtHisHhMaq_Jsonclick = "" ;
      edtHisHhMaq_Enabled = 1 ;
      edtHisproGf_Jsonclick = "" ;
      edtHisproGf_Enabled = 1 ;
      edtHisProCtr_Jsonclick = "" ;
      edtHisProCtr_Enabled = 1 ;
      edtHisproNPd_Jsonclick = "" ;
      edtHisproNPd_Enabled = 1 ;
      edtHisproTdab_Jsonclick = "" ;
      edtHisproTdab_Enabled = 1 ;
      edtEstPecas_Jsonclick = "" ;
      edtEstPecas_Enabled = 1 ;
      edtHisProHf_Jsonclick = "" ;
      edtHisProHf_Enabled = 1 ;
      edtHisProDf_Jsonclick = "" ;
      edtHisProDf_Enabled = 1 ;
      edtHisProHi_Jsonclick = "" ;
      edtHisProHi_Enabled = 1 ;
      edtHisProDi_Jsonclick = "" ;
      edtHisProDi_Enabled = 1 ;
      edtHisProDR_Jsonclick = "" ;
      edtHisProDR_Enabled = 1 ;
      edtParCodNom_Jsonclick = "" ;
      edtParCodNom_Enabled = 0 ;
      edtFase_Dsc_Jsonclick = "" ;
      edtFase_Dsc_Enabled = 0 ;
      edtGruopecod__Jsonclick = "" ;
      edtGruopecod__Enabled = 0 ;
      edtHisProLin_Jsonclick = "" ;
      edtHisProLin_Enabled = 1 ;
      edtHisProFec_Jsonclick = "" ;
      edtHisProFec_Enabled = 1 ;
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Enabled = 0 ;
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

   public void gx1asagruopecod_1SB59( String A396EmprCod ,
                                      int A503GruOpeCod )
   {
      GXt_char1 = A14028Gruopecod_ ;
      GXv_char2[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
      parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14028Gruopecod_ = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14028Gruopecod_", A14028Gruopecod_);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14028Gruopecod_))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx2asafase_dsc1SB59( String A396EmprCod ,
                                    String A461Fase )
   {
      GXt_char1 = A14027Fase_Dsc ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
      parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14027Fase_Dsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14027Fase_Dsc", A14027Fase_Dsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14027Fase_Dsc))+"\"") ;
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
      /* Using cursor T01SB38 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SB38_A407EmprNom[0] ;
      n407EmprNom = T01SB38_n407EmprNom[0] ;
      pr_default.close(29);
      /* Using cursor T01SB39 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A606MaqDsc = T01SB39_A606MaqDsc[0] ;
      n606MaqDsc = T01SB39_n606MaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      pr_default.close(30);
      /* Using cursor T01SB40 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A567HisProULin = T01SB40_A567HisProULin[0] ;
      n567HisProULin = T01SB40_n567HisProULin[0] ;
      pr_default.close(31);
      GX_FocusControl = edtHisProDR_Internalname ;
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
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      n656ParCod = false ;
      n407EmprNom = false ;
      n867ParCodNom = false ;
      /* Using cursor T01SB38 */
      pr_default.execute(29, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(29) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01SB38_A407EmprNom[0] ;
      n407EmprNom = T01SB38_n407EmprNom[0] ;
      pr_default.close(29);
      /* Using cursor T01SB57 */
      pr_default.execute(45, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
      if ( (pr_default.getStatus(45) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CGRUOP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRUOPECOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      pr_default.close(45);
      /* Using cursor T01SB41 */
      pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TXPBARCAD", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "BARCODPAR");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A361DisCod = T01SB41_A361DisCod[0] ;
      pr_default.close(32);
      /* Using cursor T01SB45 */
      pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n656ParCod), Short.valueOf(A656ParCod)});
      if ( (pr_default.getStatus(35) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A656ParCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CODPAR", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtEmprCod_Internalname ;
         }
      }
      A867ParCodNom = T01SB45_A867ParCodNom[0] ;
      n867ParCodNom = T01SB45_n867ParCodNom[0] ;
      pr_default.close(35);
      /* Using cursor T01SB42 */
      pr_default.execute(33, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(33) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DISPOS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DISCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A392DisUniMed = T01SB42_A392DisUniMed[0] ;
      pr_default.close(33);
      /* Using cursor T01SB44 */
      pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n129BarCod), Integer.valueOf(A129BarCod), Boolean.valueOf(n132BarCodReo), Byte.valueOf(A132BarCodReo), Boolean.valueOf(n130BarCodPar), A130BarCodPar});
      if ( (pr_default.getStatus(34) != 101) )
      {
         A1280BarMla = T01SB44_A1280BarMla[0] ;
         A1279BarKla = T01SB44_A1279BarKla[0] ;
      }
      else
      {
         A1280BarMla = DecimalUtil.doubleToDec(0) ;
         A1279BarKla = DecimalUtil.doubleToDec(0) ;
      }
      pr_default.close(34);
      GXt_char1 = A14028Gruopecod_ ;
      GXv_char2[0] = GXt_char1 ;
      new app.popenom(remoteHandle, context).execute( A396EmprCod, A503GruOpeCod, GXv_char2) ;
      parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14028Gruopecod_ = GXt_char1 ;
      GXt_char1 = A14027Fase_Dsc ;
      GXv_char2[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A461Fase, GXv_char2) ;
      parteproduccion_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      A14027Fase_Dsc = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", GXutil.rtrim( A867ParCodNom));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14028Gruopecod_", GXutil.rtrim( A14028Gruopecod_));
      httpContext.ajax_rsp_assign_attri("", false, "A14027Fase_Dsc", GXutil.rtrim( A14027Fase_Dsc));
   }

   public void valid_Maqcod( )
   {
      n602MaqCod = false ;
      n606MaqDsc = false ;
      /* Using cursor T01SB39 */
      pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MAQUIN", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A606MaqDsc = T01SB39_A606MaqDsc[0] ;
      n606MaqDsc = T01SB39_n606MaqDsc[0] ;
      pr_default.close(30);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
   }

   public void valid_Hisprofec( )
   {
      n602MaqCod = false ;
      n567HisProULin = false ;
      /* Using cursor T01SB40 */
      pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec});
      if ( (pr_default.getStatus(31) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CHIPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "HISPROFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A567HisProULin = T01SB40_A567HisProULin[0] ;
      n567HisProULin = T01SB40_n567HisProULin[0] ;
      pr_default.close(31);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrim( localUtil.ntoc( A567HisProULin, (byte)(8), (byte)(0), ".", "")));
   }

   public void valid_Hisprolin( )
   {
      n656ParCod = false ;
      n602MaqCod = false ;
      n129BarCod = false ;
      n132BarCodReo = false ;
      n130BarCodPar = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01SB47 */
      pr_default.execute(36, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(36) != 101) )
      {
         A307CodFas = T01SB47_A307CodFas[0] ;
         n307CodFas = T01SB47_n307CodFas[0] ;
      }
      else
      {
         A307CodFas = "" ;
         n307CodFas = false ;
      }
      pr_default.close(36);
      /* Using cursor T01SB49 */
      pr_default.execute(37, new Object[] {Integer.valueOf(A134BarCodVir), Byte.valueOf(A133BarCodReoV), A131BarCodParV, Short.valueOf(A195BarOrdLinV), Boolean.valueOf(n602MaqCod), A602MaqCod, A558HisProFec, Integer.valueOf(A561HisProLin)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         A462FasEst = T01SB49_A462FasEst[0] ;
         n462FasEst = T01SB49_n462FasEst[0] ;
      }
      else
      {
         A462FasEst = (byte)(3) ;
         n462FasEst = false ;
      }
      pr_default.close(37);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A564HisProTre", GXutil.ltrim( localUtil.ntoc( A564HisProTre, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A195BarOrdLinV", GXutil.ltrim( localUtil.ntoc( A195BarOrdLinV, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A131BarCodParV", GXutil.rtrim( A131BarCodParV));
      httpContext.ajax_rsp_assign_attri("", false, "A133BarCodReoV", GXutil.ltrim( localUtil.ntoc( A133BarCodReoV, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A134BarCodVir", GXutil.ltrim( localUtil.ntoc( A134BarCodVir, (byte)(9), (byte)(0), ".", "")));
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
      httpContext.ajax_rsp_assign_attri("", false, "A5522HisProDR", GXutil.rtrim( A5522HisProDR));
      httpContext.ajax_rsp_assign_attri("", false, "A5606HisProDi", localUtil.format(A5606HisProDi, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5607HisProHi", localUtil.ttoc( A5607HisProHi, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A5608HisProDf", localUtil.format(A5608HisProDf, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A5609HisProHf", localUtil.ttoc( A5609HisProHf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A6661EstPecas", GXutil.rtrim( A6661EstPecas));
      httpContext.ajax_rsp_assign_attri("", false, "A6680HisproTdab", GXutil.ltrim( localUtil.ntoc( A6680HisproTdab, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6819HisproNPd", GXutil.ltrim( localUtil.ntoc( A6819HisproNPd, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A7394HisProCtr", GXutil.rtrim( A7394HisProCtr));
      httpContext.ajax_rsp_assign_attri("", false, "A8566HisproGf", GXutil.ltrim( localUtil.ntoc( A8566HisproGf, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4003HisHhMaq", GXutil.ltrim( localUtil.ntoc( A4003HisHhMaq, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1060HisHhIni", GXutil.ltrim( localUtil.ntoc( A1060HisHhIni, (byte)(10), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10359HisProMq", GXutil.rtrim( A10359HisProMq));
      httpContext.ajax_rsp_assign_attri("", false, "A10360HisProFd", localUtil.format(A10360HisProFd, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A13124HisProDibC", GXutil.rtrim( A13124HisProDibC));
      httpContext.ajax_rsp_assign_attri("", false, "A13125HisProDibI", GXutil.ltrim( localUtil.ntoc( A13125HisProDibI, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13126HisProCom", GXutil.rtrim( A13126HisProCom));
      httpContext.ajax_rsp_assign_attri("", false, "A13127HisProFon", GXutil.rtrim( A13127HisProFon));
      httpContext.ajax_rsp_assign_attri("", false, "A13128HisProMtHd", GXutil.ltrim( localUtil.ntoc( A13128HisProMtHd, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13129HisProKgHd", GXutil.ltrim( localUtil.ntoc( A13129HisProKgHd, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13130HisProPzHd", GXutil.ltrim( localUtil.ntoc( A13130HisProPzHd, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14020Hisprosec", GXutil.ltrim( localUtil.ntoc( A14020Hisprosec, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14021HisproMtsI", GXutil.ltrim( localUtil.ntoc( A14021HisproMtsI, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14022HisProAncI", GXutil.ltrim( localUtil.ntoc( A14022HisProAncI, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14023HisProMtsF", GXutil.ltrim( localUtil.ntoc( A14023HisProMtsF, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14024HisProAncF", GXutil.ltrim( localUtil.ntoc( A14024HisProAncF, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14025HisProResi", GXutil.rtrim( A14025HisProResi));
      httpContext.ajax_rsp_assign_attri("", false, "A14026HisProResA", GXutil.ltrim( localUtil.ntoc( A14026HisProResA, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14197HisProNFus", GXutil.ltrim( localUtil.ntoc( A14197HisProNFus, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14205HisproFuso", GXutil.ltrim( localUtil.ntoc( A14205HisproFuso, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14206HisProNSup", GXutil.ltrim( localUtil.ntoc( A14206HisProNSup, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14207HisProPsop", GXutil.ltrim( localUtil.ntoc( A14207HisProPsop, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14208HisProTipC", GXutil.ltrim( localUtil.ntoc( A14208HisProTipC, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14209HisproTara", GXutil.ltrim( localUtil.ntoc( A14209HisproTara, (byte)(8), (byte)(4), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A867ParCodNom", GXutil.rtrim( A867ParCodNom));
      httpContext.ajax_rsp_assign_attri("", false, "A392DisUniMed", GXutil.rtrim( A392DisUniMed));
      httpContext.ajax_rsp_assign_attri("", false, "A1280BarMla", GXutil.ltrim( localUtil.ntoc( A1280BarMla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1279BarKla", GXutil.ltrim( localUtil.ntoc( A1279BarKla, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14028Gruopecod_", GXutil.rtrim( A14028Gruopecod_));
      httpContext.ajax_rsp_assign_attri("", false, "A14027Fase_Dsc", GXutil.rtrim( A14027Fase_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", GXutil.rtrim( A606MaqDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A567HisProULin", GXutil.ltrim( localUtil.ntoc( A567HisProULin, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A307CodFas", GXutil.rtrim( A307CodFas));
      httpContext.ajax_rsp_assign_attri("", false, "A462FasEst", GXutil.ltrim( localUtil.ntoc( A462FasEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z558HisProFec", localUtil.format(Z558HisProFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z561HisProLin", GXutil.ltrim( localUtil.ntoc( Z561HisProLin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z564HisProTre", GXutil.ltrim( localUtil.ntoc( Z564HisProTre, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z195BarOrdLinV", GXutil.ltrim( localUtil.ntoc( Z195BarOrdLinV, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z131BarCodParV", GXutil.rtrim( Z131BarCodParV));
      app.GxWebStd.gx_hidden_field( httpContext, "Z133BarCodReoV", GXutil.ltrim( localUtil.ntoc( Z133BarCodReoV, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z134BarCodVir", GXutil.ltrim( localUtil.ntoc( Z134BarCodVir, (byte)(9), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5522HisProDR", GXutil.rtrim( Z5522HisProDR));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5606HisProDi", localUtil.format(Z5606HisProDi, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5607HisProHi", localUtil.ttoc( Z5607HisProHi, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5608HisProDf", localUtil.format(Z5608HisProDf, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5609HisProHf", localUtil.ttoc( Z5609HisProHf, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6661EstPecas", GXutil.rtrim( Z6661EstPecas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6680HisproTdab", GXutil.ltrim( localUtil.ntoc( Z6680HisproTdab, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6819HisproNPd", GXutil.ltrim( localUtil.ntoc( Z6819HisproNPd, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7394HisProCtr", GXutil.rtrim( Z7394HisProCtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8566HisproGf", GXutil.ltrim( localUtil.ntoc( Z8566HisproGf, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4003HisHhMaq", GXutil.ltrim( localUtil.ntoc( Z4003HisHhMaq, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1060HisHhIni", GXutil.ltrim( localUtil.ntoc( Z1060HisHhIni, (byte)(10), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10359HisProMq", GXutil.rtrim( Z10359HisProMq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10360HisProFd", localUtil.format(Z10360HisProFd, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13124HisProDibC", GXutil.rtrim( Z13124HisProDibC));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13125HisProDibI", GXutil.ltrim( localUtil.ntoc( Z13125HisProDibI, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13126HisProCom", GXutil.rtrim( Z13126HisProCom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13127HisProFon", GXutil.rtrim( Z13127HisProFon));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13128HisProMtHd", GXutil.ltrim( localUtil.ntoc( Z13128HisProMtHd, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13129HisProKgHd", GXutil.ltrim( localUtil.ntoc( Z13129HisProKgHd, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13130HisProPzHd", GXutil.ltrim( localUtil.ntoc( Z13130HisProPzHd, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14020Hisprosec", GXutil.ltrim( localUtil.ntoc( Z14020Hisprosec, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14021HisproMtsI", GXutil.ltrim( localUtil.ntoc( Z14021HisproMtsI, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14022HisProAncI", GXutil.ltrim( localUtil.ntoc( Z14022HisProAncI, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14023HisProMtsF", GXutil.ltrim( localUtil.ntoc( Z14023HisProMtsF, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14024HisProAncF", GXutil.ltrim( localUtil.ntoc( Z14024HisProAncF, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14025HisProResi", GXutil.rtrim( Z14025HisProResi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14026HisProResA", GXutil.ltrim( localUtil.ntoc( Z14026HisProResA, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14197HisProNFus", GXutil.ltrim( localUtil.ntoc( Z14197HisProNFus, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14205HisproFuso", GXutil.ltrim( localUtil.ntoc( Z14205HisproFuso, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14206HisProNSup", GXutil.ltrim( localUtil.ntoc( Z14206HisProNSup, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14207HisProPsop", GXutil.ltrim( localUtil.ntoc( Z14207HisProPsop, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14208HisProTipC", GXutil.ltrim( localUtil.ntoc( Z14208HisProTipC, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14209HisproTara", GXutil.ltrim( localUtil.ntoc( Z14209HisproTara, (byte)(8), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z867ParCodNom", GXutil.rtrim( Z867ParCodNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z392DisUniMed", GXutil.rtrim( Z392DisUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1280BarMla", GXutil.ltrim( localUtil.ntoc( Z1280BarMla, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1279BarKla", GXutil.ltrim( localUtil.ntoc( Z1279BarKla, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14028Gruopecod_", GXutil.rtrim( Z14028Gruopecod_));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14027Fase_Dsc", GXutil.rtrim( Z14027Fase_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z567HisProULin", GXutil.ltrim( localUtil.ntoc( Z567HisProULin, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z307CodFas", GXutil.rtrim( Z307CodFas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z462FasEst", GXutil.ltrim( localUtil.ntoc( Z462FasEst, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A564HisProTre',fld:'HISPROTRE',pic:'ZZZ9'},{av:'A195BarOrdLinV',fld:'BARORDLINV',pic:'ZZZ9'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''},{av:'A133BarCodReoV',fld:'BARCODREOV',pic:'9'},{av:'A134BarCodVir',fld:'BARCODVIR',pic:'ZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A568HisProUni',fld:'HISPROUNI',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A560HisProHin',fld:'HISPROHIN',pic:'Z9'},{av:'A563HisProMin',fld:'HISPROMIN',pic:'99'},{av:'A559HisProHfi',fld:'HISPROHFI',pic:'Z9'},{av:'A562HisProMfi',fld:'HISPROMFI',pic:'99'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A565HisProTte',fld:'HISPROTTE',pic:'ZZZ9'},{av:'A543HisBarTip',fld:'HISBARTIP',pic:'9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A2504HisProCod',fld:'HISPROCOD',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A4439HisProBot',fld:'HISPROBOT',pic:'ZZZZZ9'},{av:'A4704HisProNPar',fld:'HISPRONPAR',pic:'ZZZZZ9'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A5339HisProBan',fld:'HISPROBAN',pic:''},{av:'A14197HisProNFus',fld:'HISPRONFUS',pic:'ZZZZZ9'},{av:'A14205HisproFuso',fld:'HISPROFUSO',pic:'ZZZZZ9'},{av:'A14206HisProNSup',fld:'HISPRONSUP',pic:'ZZZZZ9'},{av:'A14207HisProPsop',fld:'HISPROPSOP',pic:'ZZZZZ9.99'},{av:'A14208HisProTipC',fld:'HISPROTIPC',pic:'ZZZ9'},{av:'A14209HisproTara',fld:'HISPROTARA',pic:'ZZ9.9999'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A14028Gruopecod_',fld:'GRUOPECOD_',pic:''},{av:'A14027Fase_Dsc',fld:'FASE_DSC',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A14028Gruopecod_',fld:'GRUOPECOD_',pic:''},{av:'A14027Fase_Dsc',fld:'FASE_DSC',pic:''}]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("VALID_MAQCOD",",oparms:[{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]}");
      setEventMetadata("VALID_HISPROFEC","{handler:'valid_Hisprofec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A567HisProULin',fld:'HISPROULIN',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VALID_HISPROFEC",",oparms:[{av:'A567HisProULin',fld:'HISPROULIN',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("VALID_HISPROLIN","{handler:'valid_Hisprolin',iparms:[{av:'A14209HisproTara',fld:'HISPROTARA',pic:'ZZ9.9999'},{av:'A14208HisProTipC',fld:'HISPROTIPC',pic:'ZZZ9'},{av:'A14207HisProPsop',fld:'HISPROPSOP',pic:'ZZZZZ9.99'},{av:'A14206HisProNSup',fld:'HISPRONSUP',pic:'ZZZZZ9'},{av:'A14205HisproFuso',fld:'HISPROFUSO',pic:'ZZZZZ9'},{av:'A14197HisProNFus',fld:'HISPRONFUS',pic:'ZZZZZ9'},{av:'A5339HisProBan',fld:'HISPROBAN',pic:''},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A4704HisProNPar',fld:'HISPRONPAR',pic:'ZZZZZ9'},{av:'A4439HisProBot',fld:'HISPROBOT',pic:'ZZZZZ9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A2504HisProCod',fld:'HISPROCOD',pic:''},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A543HisBarTip',fld:'HISBARTIP',pic:'9'},{av:'A565HisProTte',fld:'HISPROTTE',pic:'ZZZ9'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A568HisProUni',fld:'HISPROUNI',pic:'ZZZZZ9.99'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A564HisProTre',fld:'HISPROTRE',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A558HisProFec',fld:'HISPROFEC',pic:''},{av:'A561HisProLin',fld:'HISPROLIN',pic:'ZZZZZZZ9'},{av:'A134BarCodVir',fld:'BARCODVIR',pic:'ZZZZZZZZ9'},{av:'A133BarCodReoV',fld:'BARCODREOV',pic:'9'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''},{av:'A195BarOrdLinV',fld:'BARORDLINV',pic:'ZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A559HisProHfi',fld:'HISPROHFI',pic:'Z9'},{av:'A562HisProMfi',fld:'HISPROMFI',pic:'99'},{av:'A560HisProHin',fld:'HISPROHIN',pic:'Z9'},{av:'A563HisProMin',fld:'HISPROMIN',pic:'99'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_HISPROLIN",",oparms:[{av:'A564HisProTre',fld:'HISPROTRE',pic:'ZZZ9'},{av:'A195BarOrdLinV',fld:'BARORDLINV',pic:'ZZZ9'},{av:'A131BarCodParV',fld:'BARCODPARV',pic:''},{av:'A133BarCodReoV',fld:'BARCODREOV',pic:'9'},{av:'A134BarCodVir',fld:'BARCODVIR',pic:'ZZZZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A503GruOpeCod',fld:'GRUOPECOD',pic:'ZZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A461Fase',fld:'FASE',pic:''},{av:'A568HisProUni',fld:'HISPROUNI',pic:'ZZZZZ9.99'},{av:'A566HisProTur',fld:'HISPROTUR',pic:'9'},{av:'A560HisProHin',fld:'HISPROHIN',pic:'Z9'},{av:'A563HisProMin',fld:'HISPROMIN',pic:'99'},{av:'A559HisProHfi',fld:'HISPROHFI',pic:'Z9'},{av:'A562HisProMfi',fld:'HISPROMFI',pic:'99'},{av:'A557HisProF',fld:'HISPROF',pic:'@!'},{av:'A656ParCod',fld:'PARCOD',pic:'ZZZ9'},{av:'A565HisProTte',fld:'HISPROTTE',pic:'ZZZ9'},{av:'A543HisBarTip',fld:'HISBARTIP',pic:'9'},{av:'A556HisProEst',fld:'HISPROEST',pic:'9'},{av:'A1525HisProKgr',fld:'HISPROKGR',pic:'ZZZZZ9.99'},{av:'A1526HisProMtr',fld:'HISPROMTR',pic:'ZZZZZ9.99'},{av:'A2247HisProTip',fld:'HISPROTIP',pic:'ZZZ9'},{av:'A2504HisProCod',fld:'HISPROCOD',pic:''},{av:'A3610HisProLot',fld:'HISPROLOT',pic:''},{av:'A3611HisProTc',fld:'HISPROTC',pic:'Z9'},{av:'A3612HisProReo',fld:'HISPROREO',pic:'9'},{av:'A4439HisProBot',fld:'HISPROBOT',pic:'ZZZZZ9'},{av:'A4704HisProNPar',fld:'HISPRONPAR',pic:'ZZZZZ9'},{av:'A4714HisProNpzs',fld:'HISPRONPZS',pic:'ZZZ9'},{av:'A5339HisProBan',fld:'HISPROBAN',pic:''},{av:'A5522HisProDR',fld:'HISPRODR',pic:''},{av:'A5606HisProDi',fld:'HISPRODI',pic:''},{av:'A5607HisProHi',fld:'HISPROHI',pic:'99:99'},{av:'A5608HisProDf',fld:'HISPRODF',pic:''},{av:'A5609HisProHf',fld:'HISPROHF',pic:'99:99'},{av:'A6661EstPecas',fld:'ESTPECAS',pic:''},{av:'A6680HisproTdab',fld:'HISPROTDAB',pic:'ZZZ9'},{av:'A6819HisproNPd',fld:'HISPRONPD',pic:'Z9'},{av:'A7394HisProCtr',fld:'HISPROCTR',pic:''},{av:'A8566HisproGf',fld:'HISPROGF',pic:'ZZZ9'},{av:'A4003HisHhMaq',fld:'HISHHMAQ',pic:'ZZZZZZ9.99'},{av:'A1060HisHhIni',fld:'HISHHINI',pic:'ZZZZZZ9.99'},{av:'A10359HisProMq',fld:'HISPROMQ',pic:''},{av:'A10360HisProFd',fld:'HISPROFD',pic:''},{av:'A13124HisProDibC',fld:'HISPRODIBC',pic:''},{av:'A13125HisProDibI',fld:'HISPRODIBI',pic:'ZZZZZZZ9'},{av:'A13126HisProCom',fld:'HISPROCOM',pic:''},{av:'A13127HisProFon',fld:'HISPROFON',pic:''},{av:'A13128HisProMtHd',fld:'HISPROMTHD',pic:'ZZZZZ9.99'},{av:'A13129HisProKgHd',fld:'HISPROKGHD',pic:'ZZZZZ9.99'},{av:'A13130HisProPzHd',fld:'HISPROPZHD',pic:'ZZZZZ9'},{av:'A14020Hisprosec',fld:'HISPROSEC',pic:'ZZZ9'},{av:'A14021HisproMtsI',fld:'HISPROMTSI',pic:'ZZZZZ9.99'},{av:'A14022HisProAncI',fld:'HISPROANCI',pic:'ZZZ9'},{av:'A14023HisProMtsF',fld:'HISPROMTSF',pic:'ZZZZZ9.99'},{av:'A14024HisProAncF',fld:'HISPROANCF',pic:'ZZZ9'},{av:'A14025HisProResi',fld:'HISPRORESI',pic:''},{av:'A14026HisProResA',fld:'HISPRORESA',pic:'9'},{av:'A14197HisProNFus',fld:'HISPRONFUS',pic:'ZZZZZ9'},{av:'A14205HisproFuso',fld:'HISPROFUSO',pic:'ZZZZZ9'},{av:'A14206HisProNSup',fld:'HISPRONSUP',pic:'ZZZZZ9'},{av:'A14207HisProPsop',fld:'HISPROPSOP',pic:'ZZZZZ9.99'},{av:'A14208HisProTipC',fld:'HISPROTIPC',pic:'ZZZ9'},{av:'A14209HisproTara',fld:'HISPROTARA',pic:'ZZ9.9999'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A361DisCod',fld:'DISCOD',pic:'ZZZZZZZ9'},{av:'A867ParCodNom',fld:'PARCODNOM',pic:''},{av:'A392DisUniMed',fld:'DISUNIMED',pic:'@!'},{av:'A1280BarMla',fld:'BARMLA',pic:'ZZZZZ9.99'},{av:'A1279BarKla',fld:'BARKLA',pic:'ZZZZZ9.99'},{av:'A14028Gruopecod_',fld:'GRUOPECOD_',pic:''},{av:'A14027Fase_Dsc',fld:'FASE_DSC',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''},{av:'A567HisProULin',fld:'HISPROULIN',pic:'ZZZZZZZ9'},{av:'A307CodFas',fld:'CODFAS',pic:''},{av:'A462FasEst',fld:'FASEST',pic:'9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z602MaqCod'},{av:'Z558HisProFec'},{av:'Z561HisProLin'},{av:'Z564HisProTre'},{av:'Z195BarOrdLinV'},{av:'Z131BarCodParV'},{av:'Z133BarCodReoV'},{av:'Z134BarCodVir'},{av:'Z129BarCod'},{av:'Z132BarCodReo'},{av:'Z130BarCodPar'},{av:'Z503GruOpeCod'},{av:'Z194BarOrdLin'},{av:'Z461Fase'},{av:'Z568HisProUni'},{av:'Z566HisProTur'},{av:'Z560HisProHin'},{av:'Z563HisProMin'},{av:'Z559HisProHfi'},{av:'Z562HisProMfi'},{av:'Z557HisProF'},{av:'Z656ParCod'},{av:'Z565HisProTte'},{av:'Z543HisBarTip'},{av:'Z556HisProEst'},{av:'Z1525HisProKgr'},{av:'Z1526HisProMtr'},{av:'Z2247HisProTip'},{av:'Z2504HisProCod'},{av:'Z3610HisProLot'},{av:'Z3611HisProTc'},{av:'Z3612HisProReo'},{av:'Z4439HisProBot'},{av:'Z4704HisProNPar'},{av:'Z4714HisProNpzs'},{av:'Z5339HisProBan'},{av:'Z5522HisProDR'},{av:'Z5606HisProDi'},{av:'Z5607HisProHi'},{av:'Z5608HisProDf'},{av:'Z5609HisProHf'},{av:'Z6661EstPecas'},{av:'Z6680HisproTdab'},{av:'Z6819HisproNPd'},{av:'Z7394HisProCtr'},{av:'Z8566HisproGf'},{av:'Z4003HisHhMaq'},{av:'Z1060HisHhIni'},{av:'Z10359HisProMq'},{av:'Z10360HisProFd'},{av:'Z13124HisProDibC'},{av:'Z13125HisProDibI'},{av:'Z13126HisProCom'},{av:'Z13127HisProFon'},{av:'Z13128HisProMtHd'},{av:'Z13129HisProKgHd'},{av:'Z13130HisProPzHd'},{av:'Z14020Hisprosec'},{av:'Z14021HisproMtsI'},{av:'Z14022HisProAncI'},{av:'Z14023HisProMtsF'},{av:'Z14024HisProAncF'},{av:'Z14025HisProResi'},{av:'Z14026HisProResA'},{av:'Z14197HisProNFus'},{av:'Z14205HisproFuso'},{av:'Z14206HisProNSup'},{av:'Z14207HisProPsop'},{av:'Z14208HisProTipC'},{av:'Z14209HisproTara'},{av:'Z407EmprNom'},{av:'Z361DisCod'},{av:'Z867ParCodNom'},{av:'Z392DisUniMed'},{av:'Z1280BarMla'},{av:'Z1279BarKla'},{av:'Z14028Gruopecod_'},{av:'Z14027Fase_Dsc'},{av:'Z606MaqDsc'},{av:'Z567HisProULin'},{av:'Z307CodFas'},{av:'Z462FasEst'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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
      pr_default.close(29);
      pr_default.close(45);
      pr_default.close(31);
      pr_default.close(30);
      pr_default.close(32);
      pr_default.close(35);
      pr_default.close(33);
      pr_default.close(36);
      pr_default.close(37);
      pr_default.close(34);
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
      Z5522HisProDR = "" ;
      Z5606HisProDi = GXutil.nullDate() ;
      Z5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
      Z5608HisProDf = GXutil.nullDate() ;
      Z5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      Z6661EstPecas = "" ;
      Z7394HisProCtr = "" ;
      Z4003HisHhMaq = DecimalUtil.ZERO ;
      Z1060HisHhIni = DecimalUtil.ZERO ;
      Z10359HisProMq = "" ;
      Z10360HisProFd = GXutil.nullDate() ;
      Z13124HisProDibC = "" ;
      Z13126HisProCom = "" ;
      Z13127HisProFon = "" ;
      Z13128HisProMtHd = DecimalUtil.ZERO ;
      Z13129HisProKgHd = DecimalUtil.ZERO ;
      Z14021HisproMtsI = DecimalUtil.ZERO ;
      Z14023HisProMtsF = DecimalUtil.ZERO ;
      Z14025HisProResi = "" ;
      Z14207HisProPsop = DecimalUtil.ZERO ;
      Z14209HisproTara = DecimalUtil.ZERO ;
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
      A606MaqDsc = "" ;
      A14028Gruopecod_ = "" ;
      A14027Fase_Dsc = "" ;
      A867ParCodNom = "" ;
      A5522HisProDR = "" ;
      A5606HisProDi = GXutil.nullDate() ;
      A5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
      A5608HisProDf = GXutil.nullDate() ;
      A5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      A6661EstPecas = "" ;
      A7394HisProCtr = "" ;
      A4003HisHhMaq = DecimalUtil.ZERO ;
      A1060HisHhIni = DecimalUtil.ZERO ;
      A10359HisProMq = "" ;
      A10360HisProFd = GXutil.nullDate() ;
      A13124HisProDibC = "" ;
      A13126HisProCom = "" ;
      A13127HisProFon = "" ;
      A13128HisProMtHd = DecimalUtil.ZERO ;
      A13129HisProKgHd = DecimalUtil.ZERO ;
      A14021HisproMtsI = DecimalUtil.ZERO ;
      A14023HisProMtsF = DecimalUtil.ZERO ;
      A14025HisProResi = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      A568HisProUni = DecimalUtil.ZERO ;
      A557HisProF = "" ;
      A1525HisProKgr = DecimalUtil.ZERO ;
      A1526HisProMtr = DecimalUtil.ZERO ;
      A2504HisProCod = "" ;
      A3610HisProLot = "" ;
      A5339HisProBan = "" ;
      A14207HisProPsop = DecimalUtil.ZERO ;
      A14209HisproTara = DecimalUtil.ZERO ;
      Gx_mode = "" ;
      A407EmprNom = "" ;
      A392DisUniMed = "" ;
      A307CodFas = "" ;
      A1280BarMla = DecimalUtil.ZERO ;
      A1279BarKla = DecimalUtil.ZERO ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z407EmprNom = "" ;
      Z867ParCodNom = "" ;
      Z392DisUniMed = "" ;
      Z1280BarMla = DecimalUtil.ZERO ;
      Z1279BarKla = DecimalUtil.ZERO ;
      Z606MaqDsc = "" ;
      T01SB18_A361DisCod = new int[1] ;
      T01SB18_A561HisProLin = new int[1] ;
      T01SB18_A606MaqDsc = new String[] {""} ;
      T01SB18_n606MaqDsc = new boolean[] {false} ;
      T01SB18_A567HisProULin = new int[1] ;
      T01SB18_n567HisProULin = new boolean[] {false} ;
      T01SB18_A407EmprNom = new String[] {""} ;
      T01SB18_n407EmprNom = new boolean[] {false} ;
      T01SB18_A194BarOrdLin = new short[1] ;
      T01SB18_A461Fase = new String[] {""} ;
      T01SB18_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A566HisProTur = new byte[1] ;
      T01SB18_A560HisProHin = new byte[1] ;
      T01SB18_A563HisProMin = new byte[1] ;
      T01SB18_A559HisProHfi = new byte[1] ;
      T01SB18_A562HisProMfi = new byte[1] ;
      T01SB18_A557HisProF = new String[] {""} ;
      T01SB18_A867ParCodNom = new String[] {""} ;
      T01SB18_n867ParCodNom = new boolean[] {false} ;
      T01SB18_A565HisProTte = new short[1] ;
      T01SB18_A543HisBarTip = new byte[1] ;
      T01SB18_A556HisProEst = new byte[1] ;
      T01SB18_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A2247HisProTip = new short[1] ;
      T01SB18_A2504HisProCod = new String[] {""} ;
      T01SB18_A3610HisProLot = new String[] {""} ;
      T01SB18_A3611HisProTc = new byte[1] ;
      T01SB18_A3612HisProReo = new byte[1] ;
      T01SB18_A4439HisProBot = new int[1] ;
      T01SB18_A4704HisProNPar = new int[1] ;
      T01SB18_A4714HisProNpzs = new short[1] ;
      T01SB18_A392DisUniMed = new String[] {""} ;
      T01SB18_A5339HisProBan = new String[] {""} ;
      T01SB18_A5522HisProDR = new String[] {""} ;
      T01SB18_A5606HisProDi = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB18_A5607HisProHi = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB18_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB18_A5609HisProHf = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB18_A6661EstPecas = new String[] {""} ;
      T01SB18_A6680HisproTdab = new short[1] ;
      T01SB18_A6819HisproNPd = new byte[1] ;
      T01SB18_A7394HisProCtr = new String[] {""} ;
      T01SB18_A8566HisproGf = new short[1] ;
      T01SB18_A4003HisHhMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A1060HisHhIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A10359HisProMq = new String[] {""} ;
      T01SB18_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB18_A13124HisProDibC = new String[] {""} ;
      T01SB18_A13125HisProDibI = new int[1] ;
      T01SB18_A13126HisProCom = new String[] {""} ;
      T01SB18_A13127HisProFon = new String[] {""} ;
      T01SB18_A13128HisProMtHd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A13129HisProKgHd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A13130HisProPzHd = new int[1] ;
      T01SB18_A14020Hisprosec = new short[1] ;
      T01SB18_A14021HisproMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A14022HisProAncI = new short[1] ;
      T01SB18_A14023HisProMtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A14024HisProAncF = new short[1] ;
      T01SB18_A14025HisProResi = new String[] {""} ;
      T01SB18_A14026HisProResA = new byte[1] ;
      T01SB18_A14197HisProNFus = new int[1] ;
      T01SB18_A14205HisproFuso = new int[1] ;
      T01SB18_A14206HisProNSup = new int[1] ;
      T01SB18_A14207HisProPsop = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A14208HisProTipC = new short[1] ;
      T01SB18_A14209HisproTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A396EmprCod = new String[] {""} ;
      T01SB18_A503GruOpeCod = new int[1] ;
      T01SB18_A602MaqCod = new String[] {""} ;
      T01SB18_n602MaqCod = new boolean[] {false} ;
      T01SB18_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB18_A129BarCod = new int[1] ;
      T01SB18_n129BarCod = new boolean[] {false} ;
      T01SB18_A132BarCodReo = new byte[1] ;
      T01SB18_n132BarCodReo = new boolean[] {false} ;
      T01SB18_A130BarCodPar = new String[] {""} ;
      T01SB18_n130BarCodPar = new boolean[] {false} ;
      T01SB18_A656ParCod = new short[1] ;
      T01SB18_n656ParCod = new boolean[] {false} ;
      T01SB18_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB18_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB12_A307CodFas = new String[] {""} ;
      T01SB12_n307CodFas = new boolean[] {false} ;
      T01SB14_A462FasEst = new byte[1] ;
      T01SB14_n462FasEst = new boolean[] {false} ;
      T01SB4_A407EmprNom = new String[] {""} ;
      T01SB4_n407EmprNom = new boolean[] {false} ;
      T01SB5_A396EmprCod = new String[] {""} ;
      T01SB8_A361DisCod = new int[1] ;
      T01SB9_A867ParCodNom = new String[] {""} ;
      T01SB9_n867ParCodNom = new boolean[] {false} ;
      T01SB10_A392DisUniMed = new String[] {""} ;
      T01SB16_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB16_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB6_A606MaqDsc = new String[] {""} ;
      T01SB6_n606MaqDsc = new boolean[] {false} ;
      T01SB7_A567HisProULin = new int[1] ;
      T01SB7_n567HisProULin = new boolean[] {false} ;
      T01SB19_A407EmprNom = new String[] {""} ;
      T01SB19_n407EmprNom = new boolean[] {false} ;
      T01SB20_A396EmprCod = new String[] {""} ;
      T01SB21_A361DisCod = new int[1] ;
      T01SB22_A867ParCodNom = new String[] {""} ;
      T01SB22_n867ParCodNom = new boolean[] {false} ;
      T01SB23_A392DisUniMed = new String[] {""} ;
      T01SB25_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB25_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB26_A606MaqDsc = new String[] {""} ;
      T01SB26_n606MaqDsc = new boolean[] {false} ;
      T01SB27_A567HisProULin = new int[1] ;
      T01SB27_n567HisProULin = new boolean[] {false} ;
      T01SB29_A307CodFas = new String[] {""} ;
      T01SB29_n307CodFas = new boolean[] {false} ;
      T01SB31_A462FasEst = new byte[1] ;
      T01SB31_n462FasEst = new boolean[] {false} ;
      T01SB32_A396EmprCod = new String[] {""} ;
      T01SB32_A602MaqCod = new String[] {""} ;
      T01SB32_n602MaqCod = new boolean[] {false} ;
      T01SB32_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB32_A561HisProLin = new int[1] ;
      T01SB3_A561HisProLin = new int[1] ;
      T01SB3_A194BarOrdLin = new short[1] ;
      T01SB3_A461Fase = new String[] {""} ;
      T01SB3_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A566HisProTur = new byte[1] ;
      T01SB3_A560HisProHin = new byte[1] ;
      T01SB3_A563HisProMin = new byte[1] ;
      T01SB3_A559HisProHfi = new byte[1] ;
      T01SB3_A562HisProMfi = new byte[1] ;
      T01SB3_A557HisProF = new String[] {""} ;
      T01SB3_A565HisProTte = new short[1] ;
      T01SB3_A543HisBarTip = new byte[1] ;
      T01SB3_A556HisProEst = new byte[1] ;
      T01SB3_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A2247HisProTip = new short[1] ;
      T01SB3_A2504HisProCod = new String[] {""} ;
      T01SB3_A3610HisProLot = new String[] {""} ;
      T01SB3_A3611HisProTc = new byte[1] ;
      T01SB3_A3612HisProReo = new byte[1] ;
      T01SB3_A4439HisProBot = new int[1] ;
      T01SB3_A4704HisProNPar = new int[1] ;
      T01SB3_A4714HisProNpzs = new short[1] ;
      T01SB3_A5339HisProBan = new String[] {""} ;
      T01SB3_A5522HisProDR = new String[] {""} ;
      T01SB3_A5606HisProDi = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB3_A5607HisProHi = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB3_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB3_A5609HisProHf = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB3_A6661EstPecas = new String[] {""} ;
      T01SB3_A6680HisproTdab = new short[1] ;
      T01SB3_A6819HisproNPd = new byte[1] ;
      T01SB3_A7394HisProCtr = new String[] {""} ;
      T01SB3_A8566HisproGf = new short[1] ;
      T01SB3_A4003HisHhMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A1060HisHhIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A10359HisProMq = new String[] {""} ;
      T01SB3_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB3_A13124HisProDibC = new String[] {""} ;
      T01SB3_A13125HisProDibI = new int[1] ;
      T01SB3_A13126HisProCom = new String[] {""} ;
      T01SB3_A13127HisProFon = new String[] {""} ;
      T01SB3_A13128HisProMtHd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A13129HisProKgHd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A13130HisProPzHd = new int[1] ;
      T01SB3_A14020Hisprosec = new short[1] ;
      T01SB3_A14021HisproMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A14022HisProAncI = new short[1] ;
      T01SB3_A14023HisProMtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A14024HisProAncF = new short[1] ;
      T01SB3_A14025HisProResi = new String[] {""} ;
      T01SB3_A14026HisProResA = new byte[1] ;
      T01SB3_A14197HisProNFus = new int[1] ;
      T01SB3_A14205HisproFuso = new int[1] ;
      T01SB3_A14206HisProNSup = new int[1] ;
      T01SB3_A14207HisProPsop = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A14208HisProTipC = new short[1] ;
      T01SB3_A14209HisproTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB3_A396EmprCod = new String[] {""} ;
      T01SB3_A503GruOpeCod = new int[1] ;
      T01SB3_A602MaqCod = new String[] {""} ;
      T01SB3_n602MaqCod = new boolean[] {false} ;
      T01SB3_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB3_A129BarCod = new int[1] ;
      T01SB3_n129BarCod = new boolean[] {false} ;
      T01SB3_A132BarCodReo = new byte[1] ;
      T01SB3_n132BarCodReo = new boolean[] {false} ;
      T01SB3_A130BarCodPar = new String[] {""} ;
      T01SB3_n130BarCodPar = new boolean[] {false} ;
      T01SB3_A656ParCod = new short[1] ;
      T01SB3_n656ParCod = new boolean[] {false} ;
      sMode59 = "" ;
      T01SB33_A561HisProLin = new int[1] ;
      T01SB33_A396EmprCod = new String[] {""} ;
      T01SB33_A602MaqCod = new String[] {""} ;
      T01SB33_n602MaqCod = new boolean[] {false} ;
      T01SB33_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB34_A561HisProLin = new int[1] ;
      T01SB34_A396EmprCod = new String[] {""} ;
      T01SB34_A602MaqCod = new String[] {""} ;
      T01SB34_n602MaqCod = new boolean[] {false} ;
      T01SB34_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB2_A561HisProLin = new int[1] ;
      T01SB2_A194BarOrdLin = new short[1] ;
      T01SB2_A461Fase = new String[] {""} ;
      T01SB2_A568HisProUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A566HisProTur = new byte[1] ;
      T01SB2_A560HisProHin = new byte[1] ;
      T01SB2_A563HisProMin = new byte[1] ;
      T01SB2_A559HisProHfi = new byte[1] ;
      T01SB2_A562HisProMfi = new byte[1] ;
      T01SB2_A557HisProF = new String[] {""} ;
      T01SB2_A565HisProTte = new short[1] ;
      T01SB2_A543HisBarTip = new byte[1] ;
      T01SB2_A556HisProEst = new byte[1] ;
      T01SB2_A1525HisProKgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A1526HisProMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A2247HisProTip = new short[1] ;
      T01SB2_A2504HisProCod = new String[] {""} ;
      T01SB2_A3610HisProLot = new String[] {""} ;
      T01SB2_A3611HisProTc = new byte[1] ;
      T01SB2_A3612HisProReo = new byte[1] ;
      T01SB2_A4439HisProBot = new int[1] ;
      T01SB2_A4704HisProNPar = new int[1] ;
      T01SB2_A4714HisProNpzs = new short[1] ;
      T01SB2_A5339HisProBan = new String[] {""} ;
      T01SB2_A5522HisProDR = new String[] {""} ;
      T01SB2_A5606HisProDi = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB2_A5607HisProHi = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB2_A5608HisProDf = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB2_A5609HisProHf = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB2_A6661EstPecas = new String[] {""} ;
      T01SB2_A6680HisproTdab = new short[1] ;
      T01SB2_A6819HisproNPd = new byte[1] ;
      T01SB2_A7394HisProCtr = new String[] {""} ;
      T01SB2_A8566HisproGf = new short[1] ;
      T01SB2_A4003HisHhMaq = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A1060HisHhIni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A10359HisProMq = new String[] {""} ;
      T01SB2_A10360HisProFd = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB2_A13124HisProDibC = new String[] {""} ;
      T01SB2_A13125HisProDibI = new int[1] ;
      T01SB2_A13126HisProCom = new String[] {""} ;
      T01SB2_A13127HisProFon = new String[] {""} ;
      T01SB2_A13128HisProMtHd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A13129HisProKgHd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A13130HisProPzHd = new int[1] ;
      T01SB2_A14020Hisprosec = new short[1] ;
      T01SB2_A14021HisproMtsI = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A14022HisProAncI = new short[1] ;
      T01SB2_A14023HisProMtsF = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A14024HisProAncF = new short[1] ;
      T01SB2_A14025HisProResi = new String[] {""} ;
      T01SB2_A14026HisProResA = new byte[1] ;
      T01SB2_A14197HisProNFus = new int[1] ;
      T01SB2_A14205HisproFuso = new int[1] ;
      T01SB2_A14206HisProNSup = new int[1] ;
      T01SB2_A14207HisProPsop = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A14208HisProTipC = new short[1] ;
      T01SB2_A14209HisproTara = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB2_A396EmprCod = new String[] {""} ;
      T01SB2_A503GruOpeCod = new int[1] ;
      T01SB2_A602MaqCod = new String[] {""} ;
      T01SB2_n602MaqCod = new boolean[] {false} ;
      T01SB2_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB2_A129BarCod = new int[1] ;
      T01SB2_n129BarCod = new boolean[] {false} ;
      T01SB2_A132BarCodReo = new byte[1] ;
      T01SB2_n132BarCodReo = new boolean[] {false} ;
      T01SB2_A130BarCodPar = new String[] {""} ;
      T01SB2_n130BarCodPar = new boolean[] {false} ;
      T01SB2_A656ParCod = new short[1] ;
      T01SB2_n656ParCod = new boolean[] {false} ;
      T01SB38_A407EmprNom = new String[] {""} ;
      T01SB38_n407EmprNom = new boolean[] {false} ;
      T01SB39_A606MaqDsc = new String[] {""} ;
      T01SB39_n606MaqDsc = new boolean[] {false} ;
      T01SB40_A567HisProULin = new int[1] ;
      T01SB40_n567HisProULin = new boolean[] {false} ;
      T01SB41_A361DisCod = new int[1] ;
      T01SB42_A392DisUniMed = new String[] {""} ;
      T01SB44_A1280BarMla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB44_A1279BarKla = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01SB45_A867ParCodNom = new String[] {""} ;
      T01SB45_n867ParCodNom = new boolean[] {false} ;
      T01SB47_A307CodFas = new String[] {""} ;
      T01SB47_n307CodFas = new boolean[] {false} ;
      T01SB49_A462FasEst = new byte[1] ;
      T01SB49_n462FasEst = new boolean[] {false} ;
      T01SB50_A396EmprCod = new String[] {""} ;
      T01SB50_A602MaqCod = new String[] {""} ;
      T01SB50_n602MaqCod = new boolean[] {false} ;
      T01SB50_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB50_A561HisProLin = new int[1] ;
      T01SB50_A10501Peh_cod = new String[] {""} ;
      T01SB51_A396EmprCod = new String[] {""} ;
      T01SB51_A602MaqCod = new String[] {""} ;
      T01SB51_n602MaqCod = new boolean[] {false} ;
      T01SB51_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB51_A561HisProLin = new int[1] ;
      T01SB51_A10495Emh_cod = new String[] {""} ;
      T01SB52_A396EmprCod = new String[] {""} ;
      T01SB52_A602MaqCod = new String[] {""} ;
      T01SB52_n602MaqCod = new boolean[] {false} ;
      T01SB52_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB52_A561HisProLin = new int[1] ;
      T01SB52_A10487Cah_cod = new String[] {""} ;
      T01SB53_A396EmprCod = new String[] {""} ;
      T01SB53_A602MaqCod = new String[] {""} ;
      T01SB53_n602MaqCod = new boolean[] {false} ;
      T01SB53_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB53_A561HisProLin = new int[1] ;
      T01SB53_A10486Abh_cod = new String[] {""} ;
      T01SB54_A396EmprCod = new String[] {""} ;
      T01SB54_A602MaqCod = new String[] {""} ;
      T01SB54_n602MaqCod = new boolean[] {false} ;
      T01SB54_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB54_A561HisProLin = new int[1] ;
      T01SB54_A10090HisProCP = new String[] {""} ;
      T01SB55_A396EmprCod = new String[] {""} ;
      T01SB55_A602MaqCod = new String[] {""} ;
      T01SB55_n602MaqCod = new boolean[] {false} ;
      T01SB55_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB55_A561HisProLin = new int[1] ;
      T01SB55_A3047LOParId = new String[] {""} ;
      T01SB56_A396EmprCod = new String[] {""} ;
      T01SB56_A602MaqCod = new String[] {""} ;
      T01SB56_n602MaqCod = new boolean[] {false} ;
      T01SB56_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01SB56_A561HisProLin = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Z131BarCodParV = "" ;
      Z14028Gruopecod_ = "" ;
      Z14027Fase_Dsc = "" ;
      Z307CodFas = "" ;
      T01SB57_A396EmprCod = new String[] {""} ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      ZZ396EmprCod = "" ;
      ZZ602MaqCod = "" ;
      ZZ558HisProFec = GXutil.nullDate() ;
      ZZ131BarCodParV = "" ;
      ZZ130BarCodPar = "" ;
      ZZ461Fase = "" ;
      ZZ568HisProUni = DecimalUtil.ZERO ;
      ZZ557HisProF = "" ;
      ZZ1525HisProKgr = DecimalUtil.ZERO ;
      ZZ1526HisProMtr = DecimalUtil.ZERO ;
      ZZ2504HisProCod = "" ;
      ZZ3610HisProLot = "" ;
      ZZ5339HisProBan = "" ;
      ZZ5522HisProDR = "" ;
      ZZ5606HisProDi = GXutil.nullDate() ;
      ZZ5607HisProHi = GXutil.resetTime( GXutil.nullDate() );
      ZZ5608HisProDf = GXutil.nullDate() ;
      ZZ5609HisProHf = GXutil.resetTime( GXutil.nullDate() );
      ZZ6661EstPecas = "" ;
      ZZ7394HisProCtr = "" ;
      ZZ4003HisHhMaq = DecimalUtil.ZERO ;
      ZZ1060HisHhIni = DecimalUtil.ZERO ;
      ZZ10359HisProMq = "" ;
      ZZ10360HisProFd = GXutil.nullDate() ;
      ZZ13124HisProDibC = "" ;
      ZZ13126HisProCom = "" ;
      ZZ13127HisProFon = "" ;
      ZZ13128HisProMtHd = DecimalUtil.ZERO ;
      ZZ13129HisProKgHd = DecimalUtil.ZERO ;
      ZZ14021HisproMtsI = DecimalUtil.ZERO ;
      ZZ14023HisProMtsF = DecimalUtil.ZERO ;
      ZZ14025HisProResi = "" ;
      ZZ14207HisProPsop = DecimalUtil.ZERO ;
      ZZ14209HisproTara = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ867ParCodNom = "" ;
      ZZ392DisUniMed = "" ;
      ZZ1280BarMla = DecimalUtil.ZERO ;
      ZZ1279BarKla = DecimalUtil.ZERO ;
      ZZ14028Gruopecod_ = "" ;
      ZZ14027Fase_Dsc = "" ;
      ZZ606MaqDsc = "" ;
      ZZ307CodFas = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.produccion.parteproduccion_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.produccion.parteproduccion_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.produccion.parteproduccion_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.produccion.parteproduccion_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.parteproduccion_trn__default(),
         new Object[] {
             new Object[] {
            T01SB2_A561HisProLin, T01SB2_A194BarOrdLin, T01SB2_A461Fase, T01SB2_A568HisProUni, T01SB2_A566HisProTur, T01SB2_A560HisProHin, T01SB2_A563HisProMin, T01SB2_A559HisProHfi, T01SB2_A562HisProMfi, T01SB2_A557HisProF,
            T01SB2_A565HisProTte, T01SB2_A543HisBarTip, T01SB2_A556HisProEst, T01SB2_A1525HisProKgr, T01SB2_A1526HisProMtr, T01SB2_A2247HisProTip, T01SB2_A2504HisProCod, T01SB2_A3610HisProLot, T01SB2_A3611HisProTc, T01SB2_A3612HisProReo,
            T01SB2_A4439HisProBot, T01SB2_A4704HisProNPar, T01SB2_A4714HisProNpzs, T01SB2_A5339HisProBan, T01SB2_A5522HisProDR, T01SB2_A5606HisProDi, T01SB2_A5607HisProHi, T01SB2_A5608HisProDf, T01SB2_A5609HisProHf, T01SB2_A6661EstPecas,
            T01SB2_A6680HisproTdab, T01SB2_A6819HisproNPd, T01SB2_A7394HisProCtr, T01SB2_A8566HisproGf, T01SB2_A4003HisHhMaq, T01SB2_A1060HisHhIni, T01SB2_A10359HisProMq, T01SB2_A10360HisProFd, T01SB2_A13124HisProDibC, T01SB2_A13125HisProDibI,
            T01SB2_A13126HisProCom, T01SB2_A13127HisProFon, T01SB2_A13128HisProMtHd, T01SB2_A13129HisProKgHd, T01SB2_A13130HisProPzHd, T01SB2_A14020Hisprosec, T01SB2_A14021HisproMtsI, T01SB2_A14022HisProAncI, T01SB2_A14023HisProMtsF, T01SB2_A14024HisProAncF,
            T01SB2_A14025HisProResi, T01SB2_A14026HisProResA, T01SB2_A14197HisProNFus, T01SB2_A14205HisproFuso, T01SB2_A14206HisProNSup, T01SB2_A14207HisProPsop, T01SB2_A14208HisProTipC, T01SB2_A14209HisproTara, T01SB2_A396EmprCod, T01SB2_A503GruOpeCod,
            T01SB2_A602MaqCod, T01SB2_A558HisProFec, T01SB2_A129BarCod, T01SB2_A132BarCodReo, T01SB2_A130BarCodPar, T01SB2_A656ParCod, T01SB2_n656ParCod
            }
            , new Object[] {
            T01SB3_A561HisProLin, T01SB3_A194BarOrdLin, T01SB3_A461Fase, T01SB3_A568HisProUni, T01SB3_A566HisProTur, T01SB3_A560HisProHin, T01SB3_A563HisProMin, T01SB3_A559HisProHfi, T01SB3_A562HisProMfi, T01SB3_A557HisProF,
            T01SB3_A565HisProTte, T01SB3_A543HisBarTip, T01SB3_A556HisProEst, T01SB3_A1525HisProKgr, T01SB3_A1526HisProMtr, T01SB3_A2247HisProTip, T01SB3_A2504HisProCod, T01SB3_A3610HisProLot, T01SB3_A3611HisProTc, T01SB3_A3612HisProReo,
            T01SB3_A4439HisProBot, T01SB3_A4704HisProNPar, T01SB3_A4714HisProNpzs, T01SB3_A5339HisProBan, T01SB3_A5522HisProDR, T01SB3_A5606HisProDi, T01SB3_A5607HisProHi, T01SB3_A5608HisProDf, T01SB3_A5609HisProHf, T01SB3_A6661EstPecas,
            T01SB3_A6680HisproTdab, T01SB3_A6819HisproNPd, T01SB3_A7394HisProCtr, T01SB3_A8566HisproGf, T01SB3_A4003HisHhMaq, T01SB3_A1060HisHhIni, T01SB3_A10359HisProMq, T01SB3_A10360HisProFd, T01SB3_A13124HisProDibC, T01SB3_A13125HisProDibI,
            T01SB3_A13126HisProCom, T01SB3_A13127HisProFon, T01SB3_A13128HisProMtHd, T01SB3_A13129HisProKgHd, T01SB3_A13130HisProPzHd, T01SB3_A14020Hisprosec, T01SB3_A14021HisproMtsI, T01SB3_A14022HisProAncI, T01SB3_A14023HisProMtsF, T01SB3_A14024HisProAncF,
            T01SB3_A14025HisProResi, T01SB3_A14026HisProResA, T01SB3_A14197HisProNFus, T01SB3_A14205HisproFuso, T01SB3_A14206HisProNSup, T01SB3_A14207HisProPsop, T01SB3_A14208HisProTipC, T01SB3_A14209HisproTara, T01SB3_A396EmprCod, T01SB3_A503GruOpeCod,
            T01SB3_A602MaqCod, T01SB3_A558HisProFec, T01SB3_A129BarCod, T01SB3_A132BarCodReo, T01SB3_A130BarCodPar, T01SB3_A656ParCod, T01SB3_n656ParCod
            }
            , new Object[] {
            T01SB4_A407EmprNom, T01SB4_n407EmprNom
            }
            , new Object[] {
            T01SB5_A396EmprCod
            }
            , new Object[] {
            T01SB6_A606MaqDsc, T01SB6_n606MaqDsc
            }
            , new Object[] {
            T01SB7_A567HisProULin, T01SB7_n567HisProULin
            }
            , new Object[] {
            T01SB8_A361DisCod
            }
            , new Object[] {
            T01SB9_A867ParCodNom, T01SB9_n867ParCodNom
            }
            , new Object[] {
            T01SB10_A392DisUniMed
            }
            , new Object[] {
            T01SB12_A307CodFas, T01SB12_n307CodFas
            }
            , new Object[] {
            T01SB14_A462FasEst, T01SB14_n462FasEst
            }
            , new Object[] {
            T01SB16_A1280BarMla, T01SB16_A1279BarKla
            }
            , new Object[] {
            T01SB18_A361DisCod, T01SB18_A561HisProLin, T01SB18_A606MaqDsc, T01SB18_n606MaqDsc, T01SB18_A567HisProULin, T01SB18_n567HisProULin, T01SB18_A407EmprNom, T01SB18_n407EmprNom, T01SB18_A194BarOrdLin, T01SB18_A461Fase,
            T01SB18_A568HisProUni, T01SB18_A566HisProTur, T01SB18_A560HisProHin, T01SB18_A563HisProMin, T01SB18_A559HisProHfi, T01SB18_A562HisProMfi, T01SB18_A557HisProF, T01SB18_A867ParCodNom, T01SB18_n867ParCodNom, T01SB18_A565HisProTte,
            T01SB18_A543HisBarTip, T01SB18_A556HisProEst, T01SB18_A1525HisProKgr, T01SB18_A1526HisProMtr, T01SB18_A2247HisProTip, T01SB18_A2504HisProCod, T01SB18_A3610HisProLot, T01SB18_A3611HisProTc, T01SB18_A3612HisProReo, T01SB18_A4439HisProBot,
            T01SB18_A4704HisProNPar, T01SB18_A4714HisProNpzs, T01SB18_A392DisUniMed, T01SB18_A5339HisProBan, T01SB18_A5522HisProDR, T01SB18_A5606HisProDi, T01SB18_A5607HisProHi, T01SB18_A5608HisProDf, T01SB18_A5609HisProHf, T01SB18_A6661EstPecas,
            T01SB18_A6680HisproTdab, T01SB18_A6819HisproNPd, T01SB18_A7394HisProCtr, T01SB18_A8566HisproGf, T01SB18_A4003HisHhMaq, T01SB18_A1060HisHhIni, T01SB18_A10359HisProMq, T01SB18_A10360HisProFd, T01SB18_A13124HisProDibC, T01SB18_A13125HisProDibI,
            T01SB18_A13126HisProCom, T01SB18_A13127HisProFon, T01SB18_A13128HisProMtHd, T01SB18_A13129HisProKgHd, T01SB18_A13130HisProPzHd, T01SB18_A14020Hisprosec, T01SB18_A14021HisproMtsI, T01SB18_A14022HisProAncI, T01SB18_A14023HisProMtsF, T01SB18_A14024HisProAncF,
            T01SB18_A14025HisProResi, T01SB18_A14026HisProResA, T01SB18_A14197HisProNFus, T01SB18_A14205HisproFuso, T01SB18_A14206HisProNSup, T01SB18_A14207HisProPsop, T01SB18_A14208HisProTipC, T01SB18_A14209HisproTara, T01SB18_A396EmprCod, T01SB18_A503GruOpeCod,
            T01SB18_A602MaqCod, T01SB18_A558HisProFec, T01SB18_A129BarCod, T01SB18_n129BarCod, T01SB18_A132BarCodReo, T01SB18_n132BarCodReo, T01SB18_A130BarCodPar, T01SB18_n130BarCodPar, T01SB18_A656ParCod, T01SB18_n656ParCod,
            T01SB18_A1280BarMla, T01SB18_A1279BarKla
            }
            , new Object[] {
            T01SB19_A407EmprNom, T01SB19_n407EmprNom
            }
            , new Object[] {
            T01SB20_A396EmprCod
            }
            , new Object[] {
            T01SB21_A361DisCod
            }
            , new Object[] {
            T01SB22_A867ParCodNom, T01SB22_n867ParCodNom
            }
            , new Object[] {
            T01SB23_A392DisUniMed
            }
            , new Object[] {
            T01SB25_A1280BarMla, T01SB25_A1279BarKla
            }
            , new Object[] {
            T01SB26_A606MaqDsc, T01SB26_n606MaqDsc
            }
            , new Object[] {
            T01SB27_A567HisProULin, T01SB27_n567HisProULin
            }
            , new Object[] {
            T01SB29_A307CodFas, T01SB29_n307CodFas
            }
            , new Object[] {
            T01SB31_A462FasEst, T01SB31_n462FasEst
            }
            , new Object[] {
            T01SB32_A396EmprCod, T01SB32_A602MaqCod, T01SB32_A558HisProFec, T01SB32_A561HisProLin
            }
            , new Object[] {
            T01SB33_A561HisProLin, T01SB33_A396EmprCod, T01SB33_A602MaqCod, T01SB33_A558HisProFec
            }
            , new Object[] {
            T01SB34_A561HisProLin, T01SB34_A396EmprCod, T01SB34_A602MaqCod, T01SB34_A558HisProFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SB38_A407EmprNom, T01SB38_n407EmprNom
            }
            , new Object[] {
            T01SB39_A606MaqDsc, T01SB39_n606MaqDsc
            }
            , new Object[] {
            T01SB40_A567HisProULin, T01SB40_n567HisProULin
            }
            , new Object[] {
            T01SB41_A361DisCod
            }
            , new Object[] {
            T01SB42_A392DisUniMed
            }
            , new Object[] {
            T01SB44_A1280BarMla, T01SB44_A1279BarKla
            }
            , new Object[] {
            T01SB45_A867ParCodNom, T01SB45_n867ParCodNom
            }
            , new Object[] {
            T01SB47_A307CodFas, T01SB47_n307CodFas
            }
            , new Object[] {
            T01SB49_A462FasEst, T01SB49_n462FasEst
            }
            , new Object[] {
            T01SB50_A396EmprCod, T01SB50_A602MaqCod, T01SB50_A558HisProFec, T01SB50_A561HisProLin, T01SB50_A10501Peh_cod
            }
            , new Object[] {
            T01SB51_A396EmprCod, T01SB51_A602MaqCod, T01SB51_A558HisProFec, T01SB51_A561HisProLin, T01SB51_A10495Emh_cod
            }
            , new Object[] {
            T01SB52_A396EmprCod, T01SB52_A602MaqCod, T01SB52_A558HisProFec, T01SB52_A561HisProLin, T01SB52_A10487Cah_cod
            }
            , new Object[] {
            T01SB53_A396EmprCod, T01SB53_A602MaqCod, T01SB53_A558HisProFec, T01SB53_A561HisProLin, T01SB53_A10486Abh_cod
            }
            , new Object[] {
            T01SB54_A396EmprCod, T01SB54_A602MaqCod, T01SB54_A558HisProFec, T01SB54_A561HisProLin, T01SB54_A10090HisProCP
            }
            , new Object[] {
            T01SB55_A396EmprCod, T01SB55_A602MaqCod, T01SB55_A558HisProFec, T01SB55_A561HisProLin, T01SB55_A3047LOParId
            }
            , new Object[] {
            T01SB56_A396EmprCod, T01SB56_A602MaqCod, T01SB56_A558HisProFec, T01SB56_A561HisProLin
            }
            , new Object[] {
            T01SB57_A396EmprCod
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
   private byte Z6819HisproNPd ;
   private byte Z14026HisProResA ;
   private byte Z132BarCodReo ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A133BarCodReoV ;
   private byte nKeyPressed ;
   private byte A6819HisproNPd ;
   private byte A14026HisProResA ;
   private byte A566HisProTur ;
   private byte A560HisProHin ;
   private byte A563HisProMin ;
   private byte A559HisProHfi ;
   private byte A562HisProMfi ;
   private byte A543HisBarTip ;
   private byte A556HisProEst ;
   private byte A3611HisProTc ;
   private byte A3612HisProReo ;
   private byte A462FasEst ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte Z133BarCodReoV ;
   private byte Z462FasEst ;
   private byte ZZ133BarCodReoV ;
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
   private byte ZZ6819HisproNPd ;
   private byte ZZ14026HisProResA ;
   private byte ZZ462FasEst ;
   private short Z194BarOrdLin ;
   private short Z565HisProTte ;
   private short Z2247HisProTip ;
   private short Z4714HisProNpzs ;
   private short Z6680HisproTdab ;
   private short Z8566HisproGf ;
   private short Z14020Hisprosec ;
   private short Z14022HisProAncI ;
   private short Z14024HisProAncF ;
   private short Z14208HisProTipC ;
   private short Z656ParCod ;
   private short A656ParCod ;
   private short A195BarOrdLinV ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A6680HisproTdab ;
   private short A8566HisproGf ;
   private short A14020Hisprosec ;
   private short A14022HisProAncI ;
   private short A14024HisProAncF ;
   private short A194BarOrdLin ;
   private short A565HisProTte ;
   private short A2247HisProTip ;
   private short A4714HisProNpzs ;
   private short A14208HisProTipC ;
   private short A564HisProTre ;
   private short RcdFound59 ;
   private short nIsDirty_59 ;
   private short Z564HisProTre ;
   private short Z195BarOrdLinV ;
   private short ZZ564HisProTre ;
   private short ZZ195BarOrdLinV ;
   private short ZZ194BarOrdLin ;
   private short ZZ656ParCod ;
   private short ZZ565HisProTte ;
   private short ZZ2247HisProTip ;
   private short ZZ4714HisProNpzs ;
   private short ZZ6680HisproTdab ;
   private short ZZ8566HisproGf ;
   private short ZZ14020Hisprosec ;
   private short ZZ14022HisProAncI ;
   private short ZZ14024HisProAncF ;
   private short ZZ14208HisProTipC ;
   private int Z561HisProLin ;
   private int Z4439HisProBot ;
   private int Z4704HisProNPar ;
   private int Z13125HisProDibI ;
   private int Z13130HisProPzHd ;
   private int Z14197HisProNFus ;
   private int Z14205HisproFuso ;
   private int Z14206HisProNSup ;
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
   private int edtMaqDsc_Enabled ;
   private int edtHisProFec_Enabled ;
   private int edtHisProLin_Enabled ;
   private int edtGruopecod__Enabled ;
   private int edtFase_Dsc_Enabled ;
   private int edtParCodNom_Enabled ;
   private int edtHisProDR_Enabled ;
   private int edtHisProDi_Enabled ;
   private int edtHisProHi_Enabled ;
   private int edtHisProDf_Enabled ;
   private int edtHisProHf_Enabled ;
   private int edtEstPecas_Enabled ;
   private int edtHisproTdab_Enabled ;
   private int edtHisproNPd_Enabled ;
   private int edtHisProCtr_Enabled ;
   private int edtHisproGf_Enabled ;
   private int edtHisHhMaq_Enabled ;
   private int edtHisHhIni_Enabled ;
   private int edtHisProMq_Enabled ;
   private int edtHisProFd_Enabled ;
   private int edtHisProDibC_Enabled ;
   private int A13125HisProDibI ;
   private int edtHisProDibI_Enabled ;
   private int edtHisProCom_Enabled ;
   private int edtHisProFon_Enabled ;
   private int edtHisProMtHd_Enabled ;
   private int edtHisProKgHd_Enabled ;
   private int A13130HisProPzHd ;
   private int edtHisProPzHd_Enabled ;
   private int edtHisprosec_Enabled ;
   private int edtHisproMtsI_Enabled ;
   private int edtHisProAncI_Enabled ;
   private int edtHisProMtsF_Enabled ;
   private int edtHisProAncF_Enabled ;
   private int edtHisProResi_Enabled ;
   private int edtHisProResA_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int A4439HisProBot ;
   private int A4704HisProNPar ;
   private int A14197HisProNFus ;
   private int A14205HisproFuso ;
   private int A14206HisProNSup ;
   private int A567HisProULin ;
   private int GX_JID ;
   private int Z361DisCod ;
   private int Z567HisProULin ;
   private int idxLst ;
   private int Z134BarCodVir ;
   private int ZZ561HisProLin ;
   private int ZZ134BarCodVir ;
   private int ZZ129BarCod ;
   private int ZZ503GruOpeCod ;
   private int ZZ4439HisProBot ;
   private int ZZ4704HisProNPar ;
   private int ZZ13125HisProDibI ;
   private int ZZ13130HisProPzHd ;
   private int ZZ14197HisProNFus ;
   private int ZZ14205HisproFuso ;
   private int ZZ14206HisProNSup ;
   private int ZZ361DisCod ;
   private int ZZ567HisProULin ;
   private java.math.BigDecimal Z568HisProUni ;
   private java.math.BigDecimal Z1525HisProKgr ;
   private java.math.BigDecimal Z1526HisProMtr ;
   private java.math.BigDecimal Z4003HisHhMaq ;
   private java.math.BigDecimal Z1060HisHhIni ;
   private java.math.BigDecimal Z13128HisProMtHd ;
   private java.math.BigDecimal Z13129HisProKgHd ;
   private java.math.BigDecimal Z14021HisproMtsI ;
   private java.math.BigDecimal Z14023HisProMtsF ;
   private java.math.BigDecimal Z14207HisProPsop ;
   private java.math.BigDecimal Z14209HisproTara ;
   private java.math.BigDecimal A4003HisHhMaq ;
   private java.math.BigDecimal A1060HisHhIni ;
   private java.math.BigDecimal A13128HisProMtHd ;
   private java.math.BigDecimal A13129HisProKgHd ;
   private java.math.BigDecimal A14021HisproMtsI ;
   private java.math.BigDecimal A14023HisProMtsF ;
   private java.math.BigDecimal A568HisProUni ;
   private java.math.BigDecimal A1525HisProKgr ;
   private java.math.BigDecimal A1526HisProMtr ;
   private java.math.BigDecimal A14207HisProPsop ;
   private java.math.BigDecimal A14209HisproTara ;
   private java.math.BigDecimal A1280BarMla ;
   private java.math.BigDecimal A1279BarKla ;
   private java.math.BigDecimal Z1280BarMla ;
   private java.math.BigDecimal Z1279BarKla ;
   private java.math.BigDecimal ZZ568HisProUni ;
   private java.math.BigDecimal ZZ1525HisProKgr ;
   private java.math.BigDecimal ZZ1526HisProMtr ;
   private java.math.BigDecimal ZZ4003HisHhMaq ;
   private java.math.BigDecimal ZZ1060HisHhIni ;
   private java.math.BigDecimal ZZ13128HisProMtHd ;
   private java.math.BigDecimal ZZ13129HisProKgHd ;
   private java.math.BigDecimal ZZ14021HisproMtsI ;
   private java.math.BigDecimal ZZ14023HisProMtsF ;
   private java.math.BigDecimal ZZ14207HisProPsop ;
   private java.math.BigDecimal ZZ14209HisproTara ;
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
   private String Z5522HisProDR ;
   private String Z6661EstPecas ;
   private String Z7394HisProCtr ;
   private String Z10359HisProMq ;
   private String Z13124HisProDibC ;
   private String Z13126HisProCom ;
   private String Z13127HisProFon ;
   private String Z14025HisProResi ;
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
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String edtHisProFec_Internalname ;
   private String edtHisProFec_Jsonclick ;
   private String edtHisProLin_Internalname ;
   private String edtHisProLin_Jsonclick ;
   private String edtGruopecod__Internalname ;
   private String A14028Gruopecod_ ;
   private String edtGruopecod__Jsonclick ;
   private String edtFase_Dsc_Internalname ;
   private String A14027Fase_Dsc ;
   private String edtFase_Dsc_Jsonclick ;
   private String edtParCodNom_Internalname ;
   private String A867ParCodNom ;
   private String edtParCodNom_Jsonclick ;
   private String edtHisProDR_Internalname ;
   private String A5522HisProDR ;
   private String edtHisProDR_Jsonclick ;
   private String edtHisProDi_Internalname ;
   private String edtHisProDi_Jsonclick ;
   private String edtHisProHi_Internalname ;
   private String edtHisProHi_Jsonclick ;
   private String edtHisProDf_Internalname ;
   private String edtHisProDf_Jsonclick ;
   private String edtHisProHf_Internalname ;
   private String edtHisProHf_Jsonclick ;
   private String edtEstPecas_Internalname ;
   private String A6661EstPecas ;
   private String edtEstPecas_Jsonclick ;
   private String edtHisproTdab_Internalname ;
   private String edtHisproTdab_Jsonclick ;
   private String edtHisproNPd_Internalname ;
   private String edtHisproNPd_Jsonclick ;
   private String edtHisProCtr_Internalname ;
   private String A7394HisProCtr ;
   private String edtHisProCtr_Jsonclick ;
   private String edtHisproGf_Internalname ;
   private String edtHisproGf_Jsonclick ;
   private String edtHisHhMaq_Internalname ;
   private String edtHisHhMaq_Jsonclick ;
   private String edtHisHhIni_Internalname ;
   private String edtHisHhIni_Jsonclick ;
   private String edtHisProMq_Internalname ;
   private String A10359HisProMq ;
   private String edtHisProMq_Jsonclick ;
   private String edtHisProFd_Internalname ;
   private String edtHisProFd_Jsonclick ;
   private String edtHisProDibC_Internalname ;
   private String A13124HisProDibC ;
   private String edtHisProDibC_Jsonclick ;
   private String edtHisProDibI_Internalname ;
   private String edtHisProDibI_Jsonclick ;
   private String edtHisProCom_Internalname ;
   private String A13126HisProCom ;
   private String edtHisProCom_Jsonclick ;
   private String edtHisProFon_Internalname ;
   private String A13127HisProFon ;
   private String edtHisProFon_Jsonclick ;
   private String edtHisProMtHd_Internalname ;
   private String edtHisProMtHd_Jsonclick ;
   private String edtHisProKgHd_Internalname ;
   private String edtHisProKgHd_Jsonclick ;
   private String edtHisProPzHd_Internalname ;
   private String edtHisProPzHd_Jsonclick ;
   private String edtHisprosec_Internalname ;
   private String edtHisprosec_Jsonclick ;
   private String edtHisproMtsI_Internalname ;
   private String edtHisproMtsI_Jsonclick ;
   private String edtHisProAncI_Internalname ;
   private String edtHisProAncI_Jsonclick ;
   private String edtHisProMtsF_Internalname ;
   private String edtHisProMtsF_Jsonclick ;
   private String edtHisProAncF_Internalname ;
   private String edtHisProAncF_Jsonclick ;
   private String edtHisProResi_Internalname ;
   private String A14025HisProResi ;
   private String edtHisProResi_Jsonclick ;
   private String edtHisProResA_Internalname ;
   private String edtHisProResA_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String A557HisProF ;
   private String A2504HisProCod ;
   private String A3610HisProLot ;
   private String A5339HisProBan ;
   private String Gx_mode ;
   private String A407EmprNom ;
   private String A392DisUniMed ;
   private String A307CodFas ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String Z407EmprNom ;
   private String Z867ParCodNom ;
   private String Z392DisUniMed ;
   private String Z606MaqDsc ;
   private String sMode59 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String Z131BarCodParV ;
   private String Z14028Gruopecod_ ;
   private String Z14027Fase_Dsc ;
   private String Z307CodFas ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZZ396EmprCod ;
   private String ZZ602MaqCod ;
   private String ZZ131BarCodParV ;
   private String ZZ130BarCodPar ;
   private String ZZ461Fase ;
   private String ZZ557HisProF ;
   private String ZZ2504HisProCod ;
   private String ZZ3610HisProLot ;
   private String ZZ5339HisProBan ;
   private String ZZ5522HisProDR ;
   private String ZZ6661EstPecas ;
   private String ZZ7394HisProCtr ;
   private String ZZ10359HisProMq ;
   private String ZZ13124HisProDibC ;
   private String ZZ13126HisProCom ;
   private String ZZ13127HisProFon ;
   private String ZZ14025HisProResi ;
   private String ZZ407EmprNom ;
   private String ZZ867ParCodNom ;
   private String ZZ392DisUniMed ;
   private String ZZ14028Gruopecod_ ;
   private String ZZ14027Fase_Dsc ;
   private String ZZ606MaqDsc ;
   private String ZZ307CodFas ;
   private java.util.Date Z5607HisProHi ;
   private java.util.Date Z5609HisProHf ;
   private java.util.Date A5607HisProHi ;
   private java.util.Date A5609HisProHf ;
   private java.util.Date ZZ5607HisProHi ;
   private java.util.Date ZZ5609HisProHf ;
   private java.util.Date Z558HisProFec ;
   private java.util.Date Z5606HisProDi ;
   private java.util.Date Z5608HisProDf ;
   private java.util.Date Z10360HisProFd ;
   private java.util.Date A558HisProFec ;
   private java.util.Date A5606HisProDi ;
   private java.util.Date A5608HisProDf ;
   private java.util.Date A10360HisProFd ;
   private java.util.Date ZZ558HisProFec ;
   private java.util.Date ZZ5606HisProDi ;
   private java.util.Date ZZ5608HisProDf ;
   private java.util.Date ZZ10360HisProFd ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n129BarCod ;
   private boolean n132BarCodReo ;
   private boolean n130BarCodPar ;
   private boolean n656ParCod ;
   private boolean n602MaqCod ;
   private boolean wbErr ;
   private boolean n407EmprNom ;
   private boolean n567HisProULin ;
   private boolean n307CodFas ;
   private boolean n462FasEst ;
   private boolean n606MaqDsc ;
   private boolean n867ParCodNom ;
   private boolean Gx_longc ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] T01SB18_A361DisCod ;
   private int[] T01SB18_A561HisProLin ;
   private String[] T01SB18_A606MaqDsc ;
   private boolean[] T01SB18_n606MaqDsc ;
   private int[] T01SB18_A567HisProULin ;
   private boolean[] T01SB18_n567HisProULin ;
   private String[] T01SB18_A407EmprNom ;
   private boolean[] T01SB18_n407EmprNom ;
   private short[] T01SB18_A194BarOrdLin ;
   private String[] T01SB18_A461Fase ;
   private java.math.BigDecimal[] T01SB18_A568HisProUni ;
   private byte[] T01SB18_A566HisProTur ;
   private byte[] T01SB18_A560HisProHin ;
   private byte[] T01SB18_A563HisProMin ;
   private byte[] T01SB18_A559HisProHfi ;
   private byte[] T01SB18_A562HisProMfi ;
   private String[] T01SB18_A557HisProF ;
   private String[] T01SB18_A867ParCodNom ;
   private boolean[] T01SB18_n867ParCodNom ;
   private short[] T01SB18_A565HisProTte ;
   private byte[] T01SB18_A543HisBarTip ;
   private byte[] T01SB18_A556HisProEst ;
   private java.math.BigDecimal[] T01SB18_A1525HisProKgr ;
   private java.math.BigDecimal[] T01SB18_A1526HisProMtr ;
   private short[] T01SB18_A2247HisProTip ;
   private String[] T01SB18_A2504HisProCod ;
   private String[] T01SB18_A3610HisProLot ;
   private byte[] T01SB18_A3611HisProTc ;
   private byte[] T01SB18_A3612HisProReo ;
   private int[] T01SB18_A4439HisProBot ;
   private int[] T01SB18_A4704HisProNPar ;
   private short[] T01SB18_A4714HisProNpzs ;
   private String[] T01SB18_A392DisUniMed ;
   private String[] T01SB18_A5339HisProBan ;
   private String[] T01SB18_A5522HisProDR ;
   private java.util.Date[] T01SB18_A5606HisProDi ;
   private java.util.Date[] T01SB18_A5607HisProHi ;
   private java.util.Date[] T01SB18_A5608HisProDf ;
   private java.util.Date[] T01SB18_A5609HisProHf ;
   private String[] T01SB18_A6661EstPecas ;
   private short[] T01SB18_A6680HisproTdab ;
   private byte[] T01SB18_A6819HisproNPd ;
   private String[] T01SB18_A7394HisProCtr ;
   private short[] T01SB18_A8566HisproGf ;
   private java.math.BigDecimal[] T01SB18_A4003HisHhMaq ;
   private java.math.BigDecimal[] T01SB18_A1060HisHhIni ;
   private String[] T01SB18_A10359HisProMq ;
   private java.util.Date[] T01SB18_A10360HisProFd ;
   private String[] T01SB18_A13124HisProDibC ;
   private int[] T01SB18_A13125HisProDibI ;
   private String[] T01SB18_A13126HisProCom ;
   private String[] T01SB18_A13127HisProFon ;
   private java.math.BigDecimal[] T01SB18_A13128HisProMtHd ;
   private java.math.BigDecimal[] T01SB18_A13129HisProKgHd ;
   private int[] T01SB18_A13130HisProPzHd ;
   private short[] T01SB18_A14020Hisprosec ;
   private java.math.BigDecimal[] T01SB18_A14021HisproMtsI ;
   private short[] T01SB18_A14022HisProAncI ;
   private java.math.BigDecimal[] T01SB18_A14023HisProMtsF ;
   private short[] T01SB18_A14024HisProAncF ;
   private String[] T01SB18_A14025HisProResi ;
   private byte[] T01SB18_A14026HisProResA ;
   private int[] T01SB18_A14197HisProNFus ;
   private int[] T01SB18_A14205HisproFuso ;
   private int[] T01SB18_A14206HisProNSup ;
   private java.math.BigDecimal[] T01SB18_A14207HisProPsop ;
   private short[] T01SB18_A14208HisProTipC ;
   private java.math.BigDecimal[] T01SB18_A14209HisproTara ;
   private String[] T01SB18_A396EmprCod ;
   private int[] T01SB18_A503GruOpeCod ;
   private String[] T01SB18_A602MaqCod ;
   private boolean[] T01SB18_n602MaqCod ;
   private java.util.Date[] T01SB18_A558HisProFec ;
   private int[] T01SB18_A129BarCod ;
   private boolean[] T01SB18_n129BarCod ;
   private byte[] T01SB18_A132BarCodReo ;
   private boolean[] T01SB18_n132BarCodReo ;
   private String[] T01SB18_A130BarCodPar ;
   private boolean[] T01SB18_n130BarCodPar ;
   private short[] T01SB18_A656ParCod ;
   private boolean[] T01SB18_n656ParCod ;
   private java.math.BigDecimal[] T01SB18_A1280BarMla ;
   private java.math.BigDecimal[] T01SB18_A1279BarKla ;
   private String[] T01SB12_A307CodFas ;
   private boolean[] T01SB12_n307CodFas ;
   private byte[] T01SB14_A462FasEst ;
   private boolean[] T01SB14_n462FasEst ;
   private String[] T01SB4_A407EmprNom ;
   private boolean[] T01SB4_n407EmprNom ;
   private String[] T01SB5_A396EmprCod ;
   private int[] T01SB8_A361DisCod ;
   private String[] T01SB9_A867ParCodNom ;
   private boolean[] T01SB9_n867ParCodNom ;
   private String[] T01SB10_A392DisUniMed ;
   private java.math.BigDecimal[] T01SB16_A1280BarMla ;
   private java.math.BigDecimal[] T01SB16_A1279BarKla ;
   private String[] T01SB6_A606MaqDsc ;
   private boolean[] T01SB6_n606MaqDsc ;
   private int[] T01SB7_A567HisProULin ;
   private boolean[] T01SB7_n567HisProULin ;
   private String[] T01SB19_A407EmprNom ;
   private boolean[] T01SB19_n407EmprNom ;
   private String[] T01SB20_A396EmprCod ;
   private int[] T01SB21_A361DisCod ;
   private String[] T01SB22_A867ParCodNom ;
   private boolean[] T01SB22_n867ParCodNom ;
   private String[] T01SB23_A392DisUniMed ;
   private java.math.BigDecimal[] T01SB25_A1280BarMla ;
   private java.math.BigDecimal[] T01SB25_A1279BarKla ;
   private String[] T01SB26_A606MaqDsc ;
   private boolean[] T01SB26_n606MaqDsc ;
   private int[] T01SB27_A567HisProULin ;
   private boolean[] T01SB27_n567HisProULin ;
   private String[] T01SB29_A307CodFas ;
   private boolean[] T01SB29_n307CodFas ;
   private byte[] T01SB31_A462FasEst ;
   private boolean[] T01SB31_n462FasEst ;
   private String[] T01SB32_A396EmprCod ;
   private String[] T01SB32_A602MaqCod ;
   private boolean[] T01SB32_n602MaqCod ;
   private java.util.Date[] T01SB32_A558HisProFec ;
   private int[] T01SB32_A561HisProLin ;
   private int[] T01SB3_A561HisProLin ;
   private short[] T01SB3_A194BarOrdLin ;
   private String[] T01SB3_A461Fase ;
   private java.math.BigDecimal[] T01SB3_A568HisProUni ;
   private byte[] T01SB3_A566HisProTur ;
   private byte[] T01SB3_A560HisProHin ;
   private byte[] T01SB3_A563HisProMin ;
   private byte[] T01SB3_A559HisProHfi ;
   private byte[] T01SB3_A562HisProMfi ;
   private String[] T01SB3_A557HisProF ;
   private short[] T01SB3_A565HisProTte ;
   private byte[] T01SB3_A543HisBarTip ;
   private byte[] T01SB3_A556HisProEst ;
   private java.math.BigDecimal[] T01SB3_A1525HisProKgr ;
   private java.math.BigDecimal[] T01SB3_A1526HisProMtr ;
   private short[] T01SB3_A2247HisProTip ;
   private String[] T01SB3_A2504HisProCod ;
   private String[] T01SB3_A3610HisProLot ;
   private byte[] T01SB3_A3611HisProTc ;
   private byte[] T01SB3_A3612HisProReo ;
   private int[] T01SB3_A4439HisProBot ;
   private int[] T01SB3_A4704HisProNPar ;
   private short[] T01SB3_A4714HisProNpzs ;
   private String[] T01SB3_A5339HisProBan ;
   private String[] T01SB3_A5522HisProDR ;
   private java.util.Date[] T01SB3_A5606HisProDi ;
   private java.util.Date[] T01SB3_A5607HisProHi ;
   private java.util.Date[] T01SB3_A5608HisProDf ;
   private java.util.Date[] T01SB3_A5609HisProHf ;
   private String[] T01SB3_A6661EstPecas ;
   private short[] T01SB3_A6680HisproTdab ;
   private byte[] T01SB3_A6819HisproNPd ;
   private String[] T01SB3_A7394HisProCtr ;
   private short[] T01SB3_A8566HisproGf ;
   private java.math.BigDecimal[] T01SB3_A4003HisHhMaq ;
   private java.math.BigDecimal[] T01SB3_A1060HisHhIni ;
   private String[] T01SB3_A10359HisProMq ;
   private java.util.Date[] T01SB3_A10360HisProFd ;
   private String[] T01SB3_A13124HisProDibC ;
   private int[] T01SB3_A13125HisProDibI ;
   private String[] T01SB3_A13126HisProCom ;
   private String[] T01SB3_A13127HisProFon ;
   private java.math.BigDecimal[] T01SB3_A13128HisProMtHd ;
   private java.math.BigDecimal[] T01SB3_A13129HisProKgHd ;
   private int[] T01SB3_A13130HisProPzHd ;
   private short[] T01SB3_A14020Hisprosec ;
   private java.math.BigDecimal[] T01SB3_A14021HisproMtsI ;
   private short[] T01SB3_A14022HisProAncI ;
   private java.math.BigDecimal[] T01SB3_A14023HisProMtsF ;
   private short[] T01SB3_A14024HisProAncF ;
   private String[] T01SB3_A14025HisProResi ;
   private byte[] T01SB3_A14026HisProResA ;
   private int[] T01SB3_A14197HisProNFus ;
   private int[] T01SB3_A14205HisproFuso ;
   private int[] T01SB3_A14206HisProNSup ;
   private java.math.BigDecimal[] T01SB3_A14207HisProPsop ;
   private short[] T01SB3_A14208HisProTipC ;
   private java.math.BigDecimal[] T01SB3_A14209HisproTara ;
   private String[] T01SB3_A396EmprCod ;
   private int[] T01SB3_A503GruOpeCod ;
   private String[] T01SB3_A602MaqCod ;
   private boolean[] T01SB3_n602MaqCod ;
   private java.util.Date[] T01SB3_A558HisProFec ;
   private int[] T01SB3_A129BarCod ;
   private boolean[] T01SB3_n129BarCod ;
   private byte[] T01SB3_A132BarCodReo ;
   private boolean[] T01SB3_n132BarCodReo ;
   private String[] T01SB3_A130BarCodPar ;
   private boolean[] T01SB3_n130BarCodPar ;
   private short[] T01SB3_A656ParCod ;
   private boolean[] T01SB3_n656ParCod ;
   private int[] T01SB33_A561HisProLin ;
   private String[] T01SB33_A396EmprCod ;
   private String[] T01SB33_A602MaqCod ;
   private boolean[] T01SB33_n602MaqCod ;
   private java.util.Date[] T01SB33_A558HisProFec ;
   private int[] T01SB34_A561HisProLin ;
   private String[] T01SB34_A396EmprCod ;
   private String[] T01SB34_A602MaqCod ;
   private boolean[] T01SB34_n602MaqCod ;
   private java.util.Date[] T01SB34_A558HisProFec ;
   private int[] T01SB2_A561HisProLin ;
   private short[] T01SB2_A194BarOrdLin ;
   private String[] T01SB2_A461Fase ;
   private java.math.BigDecimal[] T01SB2_A568HisProUni ;
   private byte[] T01SB2_A566HisProTur ;
   private byte[] T01SB2_A560HisProHin ;
   private byte[] T01SB2_A563HisProMin ;
   private byte[] T01SB2_A559HisProHfi ;
   private byte[] T01SB2_A562HisProMfi ;
   private String[] T01SB2_A557HisProF ;
   private short[] T01SB2_A565HisProTte ;
   private byte[] T01SB2_A543HisBarTip ;
   private byte[] T01SB2_A556HisProEst ;
   private java.math.BigDecimal[] T01SB2_A1525HisProKgr ;
   private java.math.BigDecimal[] T01SB2_A1526HisProMtr ;
   private short[] T01SB2_A2247HisProTip ;
   private String[] T01SB2_A2504HisProCod ;
   private String[] T01SB2_A3610HisProLot ;
   private byte[] T01SB2_A3611HisProTc ;
   private byte[] T01SB2_A3612HisProReo ;
   private int[] T01SB2_A4439HisProBot ;
   private int[] T01SB2_A4704HisProNPar ;
   private short[] T01SB2_A4714HisProNpzs ;
   private String[] T01SB2_A5339HisProBan ;
   private String[] T01SB2_A5522HisProDR ;
   private java.util.Date[] T01SB2_A5606HisProDi ;
   private java.util.Date[] T01SB2_A5607HisProHi ;
   private java.util.Date[] T01SB2_A5608HisProDf ;
   private java.util.Date[] T01SB2_A5609HisProHf ;
   private String[] T01SB2_A6661EstPecas ;
   private short[] T01SB2_A6680HisproTdab ;
   private byte[] T01SB2_A6819HisproNPd ;
   private String[] T01SB2_A7394HisProCtr ;
   private short[] T01SB2_A8566HisproGf ;
   private java.math.BigDecimal[] T01SB2_A4003HisHhMaq ;
   private java.math.BigDecimal[] T01SB2_A1060HisHhIni ;
   private String[] T01SB2_A10359HisProMq ;
   private java.util.Date[] T01SB2_A10360HisProFd ;
   private String[] T01SB2_A13124HisProDibC ;
   private int[] T01SB2_A13125HisProDibI ;
   private String[] T01SB2_A13126HisProCom ;
   private String[] T01SB2_A13127HisProFon ;
   private java.math.BigDecimal[] T01SB2_A13128HisProMtHd ;
   private java.math.BigDecimal[] T01SB2_A13129HisProKgHd ;
   private int[] T01SB2_A13130HisProPzHd ;
   private short[] T01SB2_A14020Hisprosec ;
   private java.math.BigDecimal[] T01SB2_A14021HisproMtsI ;
   private short[] T01SB2_A14022HisProAncI ;
   private java.math.BigDecimal[] T01SB2_A14023HisProMtsF ;
   private short[] T01SB2_A14024HisProAncF ;
   private String[] T01SB2_A14025HisProResi ;
   private byte[] T01SB2_A14026HisProResA ;
   private int[] T01SB2_A14197HisProNFus ;
   private int[] T01SB2_A14205HisproFuso ;
   private int[] T01SB2_A14206HisProNSup ;
   private java.math.BigDecimal[] T01SB2_A14207HisProPsop ;
   private short[] T01SB2_A14208HisProTipC ;
   private java.math.BigDecimal[] T01SB2_A14209HisproTara ;
   private String[] T01SB2_A396EmprCod ;
   private int[] T01SB2_A503GruOpeCod ;
   private String[] T01SB2_A602MaqCod ;
   private boolean[] T01SB2_n602MaqCod ;
   private java.util.Date[] T01SB2_A558HisProFec ;
   private int[] T01SB2_A129BarCod ;
   private boolean[] T01SB2_n129BarCod ;
   private byte[] T01SB2_A132BarCodReo ;
   private boolean[] T01SB2_n132BarCodReo ;
   private String[] T01SB2_A130BarCodPar ;
   private boolean[] T01SB2_n130BarCodPar ;
   private short[] T01SB2_A656ParCod ;
   private boolean[] T01SB2_n656ParCod ;
   private String[] T01SB38_A407EmprNom ;
   private boolean[] T01SB38_n407EmprNom ;
   private String[] T01SB39_A606MaqDsc ;
   private boolean[] T01SB39_n606MaqDsc ;
   private int[] T01SB40_A567HisProULin ;
   private boolean[] T01SB40_n567HisProULin ;
   private int[] T01SB41_A361DisCod ;
   private String[] T01SB42_A392DisUniMed ;
   private java.math.BigDecimal[] T01SB44_A1280BarMla ;
   private java.math.BigDecimal[] T01SB44_A1279BarKla ;
   private String[] T01SB45_A867ParCodNom ;
   private boolean[] T01SB45_n867ParCodNom ;
   private String[] T01SB47_A307CodFas ;
   private boolean[] T01SB47_n307CodFas ;
   private byte[] T01SB49_A462FasEst ;
   private boolean[] T01SB49_n462FasEst ;
   private String[] T01SB50_A396EmprCod ;
   private String[] T01SB50_A602MaqCod ;
   private boolean[] T01SB50_n602MaqCod ;
   private java.util.Date[] T01SB50_A558HisProFec ;
   private int[] T01SB50_A561HisProLin ;
   private String[] T01SB50_A10501Peh_cod ;
   private String[] T01SB51_A396EmprCod ;
   private String[] T01SB51_A602MaqCod ;
   private boolean[] T01SB51_n602MaqCod ;
   private java.util.Date[] T01SB51_A558HisProFec ;
   private int[] T01SB51_A561HisProLin ;
   private String[] T01SB51_A10495Emh_cod ;
   private String[] T01SB52_A396EmprCod ;
   private String[] T01SB52_A602MaqCod ;
   private boolean[] T01SB52_n602MaqCod ;
   private java.util.Date[] T01SB52_A558HisProFec ;
   private int[] T01SB52_A561HisProLin ;
   private String[] T01SB52_A10487Cah_cod ;
   private String[] T01SB53_A396EmprCod ;
   private String[] T01SB53_A602MaqCod ;
   private boolean[] T01SB53_n602MaqCod ;
   private java.util.Date[] T01SB53_A558HisProFec ;
   private int[] T01SB53_A561HisProLin ;
   private String[] T01SB53_A10486Abh_cod ;
   private String[] T01SB54_A396EmprCod ;
   private String[] T01SB54_A602MaqCod ;
   private boolean[] T01SB54_n602MaqCod ;
   private java.util.Date[] T01SB54_A558HisProFec ;
   private int[] T01SB54_A561HisProLin ;
   private String[] T01SB54_A10090HisProCP ;
   private String[] T01SB55_A396EmprCod ;
   private String[] T01SB55_A602MaqCod ;
   private boolean[] T01SB55_n602MaqCod ;
   private java.util.Date[] T01SB55_A558HisProFec ;
   private int[] T01SB55_A561HisProLin ;
   private String[] T01SB55_A3047LOParId ;
   private String[] T01SB56_A396EmprCod ;
   private String[] T01SB56_A602MaqCod ;
   private boolean[] T01SB56_n602MaqCod ;
   private java.util.Date[] T01SB56_A558HisProFec ;
   private int[] T01SB56_A561HisProLin ;
   private String[] T01SB57_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class parteproduccion_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class parteproduccion_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class parteproduccion_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class parteproduccion_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class parteproduccion_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SB2", "SELECT HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, HisProDR, HisProDi, HisProHi, HisProDf, HisProHf, EstPecas, HisproTdab, HisproNPd, HisProCtr, HisproGf, HisHhMaq, HisHhIni, HisProMq, HisProFd, HisProDibC, HisProDibI, HisProCom, HisProFon, HisProMtHd, HisProKgHd, HisProPzHd, Hisprosec, HisproMtsI, HisProAncI, HisProMtsF, HisProAncF, HisProResi, HisProResA, HisProNFus, HisproFuso, HisProNSup, HisProPsop, HisProTipC, HisproTara, EmprCod, GruOpeCod, MaqCod, HisProFec, BarCod, BarCodReo, BarCodPar, ParCod FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?  FOR UPDATE OF BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, HisProDR, HisProDi, HisProHi, HisProDf, HisProHf, EstPecas, HisproTdab, HisproNPd, HisProCtr, HisproGf, HisHhMaq, HisHhIni, HisProMq, HisProFd, HisProDibC, HisProDibI, HisProCom, HisProFon, HisProMtHd, HisProKgHd, HisProPzHd, Hisprosec, HisproMtsI, HisProAncI, HisProMtsF, HisProAncF, HisProResi, HisProResA, HisProNFus, HisproFuso, HisProNSup, HisProPsop, HisProTipC, HisproTara, GruOpeCod, BarCod, BarCodReo, BarCodPar, ParCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB3", "SELECT HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, HisProDR, HisProDi, HisProHi, HisProDf, HisProHf, EstPecas, HisproTdab, HisproNPd, HisProCtr, HisproGf, HisHhMaq, HisHhIni, HisProMq, HisProFd, HisProDibC, HisProDibI, HisProCom, HisProFon, HisProMtHd, HisProKgHd, HisProPzHd, Hisprosec, HisproMtsI, HisProAncI, HisProMtsF, HisProAncF, HisProResi, HisProResA, HisProNFus, HisproFuso, HisProNSup, HisProPsop, HisProTipC, HisproTara, EmprCod, GruOpeCod, MaqCod, HisProFec, BarCod, BarCodReo, BarCodPar, ParCod FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB5", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB6", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB7", "SELECT HisProULin FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB8", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB9", "SELECT ParCodNom FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB10", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB12", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM ((TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) LEFT JOIN TXPCHIPRO T4 ON T4.EmprCod = T2.EmprCod AND T4.MaqCod = T2.MaqCod AND T4.HisProFec = T3.HisProFec) WHERE (T2.EmprCod = T4.EmprCod) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB14", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod, T4.HisProFec, T4.HisProLin FROM (((TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) LEFT JOIN TXPLHIPRO T4 ON T4.MaqCod = T3.MaqCod) LEFT JOIN TXPCHIPRO T5 ON T5.EmprCod = T2.EmprCod AND T5.MaqCod = T3.MaqCod AND T5.HisProFec = T4.HisProFec) WHERE (T2.EmprCod = T5.EmprCod) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod, T4.HisProFec, T4.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB16", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB18", "SELECT /*+ FIRST_ROWS(100) */ T3.DisCod, TM1.HisProLin, T7.MaqDsc, T8.HisProULin, T2.EmprNom, TM1.BarOrdLin, TM1.Fase, TM1.HisProUni, TM1.HisProTur, TM1.HisProHin, TM1.HisProMin, TM1.HisProHfi, TM1.HisProMfi, TM1.HisProF, T4.ParCodNom, TM1.HisProTte, TM1.HisBarTip, TM1.HisProEst, TM1.HisProKgr, TM1.HisProMtr, TM1.HisProTip, TM1.HisProCod, TM1.HisProLot, TM1.HisProTc, TM1.HisProReo, TM1.HisProBot, TM1.HisProNPar, TM1.HisProNpzs, T5.DisUniMed, TM1.HisProBan, TM1.HisProDR, TM1.HisProDi, TM1.HisProHi, TM1.HisProDf, TM1.HisProHf, TM1.EstPecas, TM1.HisproTdab, TM1.HisproNPd, TM1.HisProCtr, TM1.HisproGf, TM1.HisHhMaq, TM1.HisHhIni, TM1.HisProMq, TM1.HisProFd, TM1.HisProDibC, TM1.HisProDibI, TM1.HisProCom, TM1.HisProFon, TM1.HisProMtHd, TM1.HisProKgHd, TM1.HisProPzHd, TM1.Hisprosec, TM1.HisproMtsI, TM1.HisProAncI, TM1.HisProMtsF, TM1.HisProAncF, TM1.HisProResi, TM1.HisProResA, TM1.HisProNFus, TM1.HisproFuso, TM1.HisProNSup, TM1.HisProPsop, TM1.HisProTipC, TM1.HisproTara, TM1.EmprCod, TM1.GruOpeCod, TM1.MaqCod, TM1.HisProFec, TM1.BarCod, TM1.BarCodReo, TM1.BarCodPar, TM1.ParCod, COALESCE( T6.BarMla, 0) AS BarMla, COALESCE( T6.BarKla, 0) AS BarKla FROM (((((((TXPLHIPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPBARCAD T3 ON T3.EmprCod = TM1.EmprCod AND T3.BarCod = TM1.BarCod AND T3.BarCodReo = TM1.BarCodReo AND T3.BarCodPar = TM1.BarCodPar) LEFT JOIN TXPDISPOS T5 ON T5.EmprCod = TM1.EmprCod AND T5.DisCod = T3.DisCod) LEFT JOIN TXPCODPAR T4 ON T4.EmprCod = TM1.EmprCod AND T4.ParCod = TM1.ParCod) LEFT JOIN (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = TM1.EmprCod AND T6.BarCod = TM1.BarCod AND T6.BarCodReo = TM1.BarCodReo AND T6.BarCodPar = TM1.BarCodPar) INNER JOIN TXPMAQUIN T7 ON T7.EmprCod = TM1.EmprCod AND T7.MaqCod = TM1.MaqCod) INNER JOIN TXPCHIPRO T8 ON T8.EmprCod = TM1.EmprCod AND T8.MaqCod = TM1.MaqCod AND T8.HisProFec = TM1.HisProFec) WHERE TM1.HisProLin = ? and TM1.EmprCod = ? and TM1.MaqCod = ? and TM1.HisProFec = ? ORDER BY TM1.EmprCod, TM1.MaqCod, TM1.HisProFec, TM1.HisProLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB19", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB20", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB21", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB22", "SELECT ParCodNom FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB23", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB25", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB26", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB27", "SELECT HisProULin FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB29", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM ((TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) LEFT JOIN TXPCHIPRO T4 ON T4.EmprCod = T2.EmprCod AND T4.MaqCod = T2.MaqCod AND T4.HisProFec = T3.HisProFec) WHERE (T2.EmprCod = T4.EmprCod) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB31", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod, T4.HisProFec, T4.HisProLin FROM (((TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) LEFT JOIN TXPLHIPRO T4 ON T4.MaqCod = T3.MaqCod) LEFT JOIN TXPCHIPRO T5 ON T5.EmprCod = T2.EmprCod AND T5.MaqCod = T3.MaqCod AND T5.HisProFec = T4.HisProFec) WHERE (T2.EmprCod = T5.EmprCod) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod, T4.HisProFec, T4.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB32", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB33", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ HisProLin, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE ( HisProLin > ? or HisProLin = ? and EmprCod > ? or EmprCod = ? and HisProLin = ? and MaqCod > ? or MaqCod = ? and EmprCod = ? and HisProLin = ? and HisProFec > ?) ORDER BY EmprCod, MaqCod, HisProFec, HisProLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SB34", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ HisProLin, EmprCod, MaqCod, HisProFec FROM TXPLHIPRO WHERE ( HisProLin < ? or HisProLin = ? and EmprCod < ? or EmprCod = ? and HisProLin = ? and MaqCod < ? or MaqCod = ? and EmprCod = ? and HisProLin = ? and HisProFec < ?) ORDER BY EmprCod DESC, MaqCod DESC, HisProFec DESC, HisProLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SB35", "INSERT INTO TXPLHIPRO(HisProLin, BarOrdLin, Fase, HisProUni, HisProTur, HisProHin, HisProMin, HisProHfi, HisProMfi, HisProF, HisProTte, HisBarTip, HisProEst, HisProKgr, HisProMtr, HisProTip, HisProCod, HisProLot, HisProTc, HisProReo, HisProBot, HisProNPar, HisProNpzs, HisProBan, HisProDR, HisProDi, HisProHi, HisProDf, HisProHf, EstPecas, HisproTdab, HisproNPd, HisProCtr, HisproGf, HisHhMaq, HisHhIni, HisProMq, HisProFd, HisProDibC, HisProDibI, HisProCom, HisProFon, HisProMtHd, HisProKgHd, HisProPzHd, Hisprosec, HisproMtsI, HisProAncI, HisProMtsF, HisProAncF, HisProResi, HisProResA, HisProNFus, HisproFuso, HisProNSup, HisProPsop, HisProTipC, HisproTara, EmprCod, GruOpeCod, MaqCod, HisProFec, BarCod, BarCodReo, BarCodPar, ParCod, HisProDTI, HisProDTF) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPLHIPRO")
         ,new UpdateCursor("T01SB36", "UPDATE TXPLHIPRO SET BarOrdLin=?, Fase=?, HisProUni=?, HisProTur=?, HisProHin=?, HisProMin=?, HisProHfi=?, HisProMfi=?, HisProF=?, HisProTte=?, HisBarTip=?, HisProEst=?, HisProKgr=?, HisProMtr=?, HisProTip=?, HisProCod=?, HisProLot=?, HisProTc=?, HisProReo=?, HisProBot=?, HisProNPar=?, HisProNpzs=?, HisProBan=?, HisProDR=?, HisProDi=?, HisProHi=?, HisProDf=?, HisProHf=?, EstPecas=?, HisproTdab=?, HisproNPd=?, HisProCtr=?, HisproGf=?, HisHhMaq=?, HisHhIni=?, HisProMq=?, HisProFd=?, HisProDibC=?, HisProDibI=?, HisProCom=?, HisProFon=?, HisProMtHd=?, HisProKgHd=?, HisProPzHd=?, Hisprosec=?, HisproMtsI=?, HisProAncI=?, HisProMtsF=?, HisProAncF=?, HisProResi=?, HisProResA=?, HisProNFus=?, HisproFuso=?, HisProNSup=?, HisProPsop=?, HisProTipC=?, HisproTara=?, GruOpeCod=?, BarCod=?, BarCodReo=?, BarCodPar=?, ParCod=?  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK, "TXPLHIPRO")
         ,new UpdateCursor("T01SB37", "DELETE FROM TXPLHIPRO  WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?", GX_NOMASK, "TXPLHIPRO")
         ,new ForEachCursor("T01SB38", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB39", "SELECT MaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB40", "SELECT HisProULin FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB41", "SELECT DisCod FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB42", "SELECT DisUniMed FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB44", "SELECT COALESCE( T1.BarMla, 0) AS BarMla, COALESCE( T1.BarKla, 0) AS BarKla FROM (SELECT SUM(BarMetLan) AS BarMla, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarKilLan) AS BarKla FROM TXPBARPIE WHERE BarPieEst = 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB45", "SELECT ParCodNom FROM TXPCODPAR WHERE EmprCod = ? AND ParCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB47", "SELECT COALESCE( T1.CodFas, '') AS CodFas FROM (SELECT MIN(T2.FasCod) AS CodFas, T2.MaqCod, T3.HisProFec, T3.HisProLin FROM ((TXPFASPRO T2 LEFT JOIN TXPLHIPRO T3 ON T3.MaqCod = T2.MaqCod) LEFT JOIN TXPCHIPRO T4 ON T4.EmprCod = T2.EmprCod AND T4.MaqCod = T2.MaqCod AND T4.HisProFec = T3.HisProFec) WHERE (T2.EmprCod = T4.EmprCod) AND (T3.BarCod = ?) AND (T3.BarCodReo = ?) AND (T3.BarCodPar = ?) AND (T3.BarOrdLin = ?) GROUP BY T2.MaqCod, T3.HisProFec, T3.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB49", "SELECT COALESCE( T1.FasEst, 3) AS FasEst FROM (SELECT MIN(T2.BarFasEst) AS FasEst, T3.MaqCod, T4.HisProFec, T4.HisProLin FROM (((TXPBARFAS T2 INNER JOIN TXPFASPRO T3 ON T3.EmprCod = T2.EmprCod AND T3.FasCod = T2.FasCod) LEFT JOIN TXPLHIPRO T4 ON T4.MaqCod = T3.MaqCod) LEFT JOIN TXPCHIPRO T5 ON T5.EmprCod = T2.EmprCod AND T5.MaqCod = T3.MaqCod AND T5.HisProFec = T4.HisProFec) WHERE (T2.EmprCod = T5.EmprCod) AND (T2.BarCod = ?) AND (T2.BarCodReo = ?) AND (T2.BarCodPar = ?) AND (T2.BarOrdLin = ?) GROUP BY T3.MaqCod, T4.HisProFec, T4.HisProLin ) T1 WHERE T1.MaqCod = ? AND T1.HisProFec = ? AND T1.HisProLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB50", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Peh_cod FROM TXPCAPE00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SB51", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Emh_cod FROM TXPCAEM00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SB52", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Cah_cod FROM TXPCALA00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SB53", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, Abh_cod FROM TXPCAAB00 WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SB54", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, HisProCP FROM TXPHISPZS WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SB55", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec, HisProLin, LOParId FROM TXPLOHisP WHERE EmprCod = ? AND MaqCod = ? AND HisProFec = ? AND HisProLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SB56", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod, HisProFec, HisProLin FROM TXPLHIPRO ORDER BY EmprCod, MaqCod, HisProFec, HisProLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SB57", "SELECT EmprCod FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[24])[0] = rslt.getString(25, 1);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(26);
               ((java.util.Date[]) buf[26])[0] = GXutil.resetDate(rslt.getGXDateTime(27));
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(28);
               ((java.util.Date[]) buf[28])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((String[]) buf[29])[0] = rslt.getString(30, 1);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((byte[]) buf[31])[0] = rslt.getByte(32);
               ((String[]) buf[32])[0] = rslt.getString(33, 100);
               ((short[]) buf[33])[0] = rslt.getShort(34);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(36,2);
               ((String[]) buf[36])[0] = rslt.getString(37, 6);
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(38);
               ((String[]) buf[38])[0] = rslt.getString(39, 16);
               ((int[]) buf[39])[0] = rslt.getInt(40);
               ((String[]) buf[40])[0] = rslt.getString(41, 12);
               ((String[]) buf[41])[0] = rslt.getString(42, 12);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((int[]) buf[44])[0] = rslt.getInt(45);
               ((short[]) buf[45])[0] = rslt.getShort(46);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((short[]) buf[47])[0] = rslt.getShort(48);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(49,2);
               ((short[]) buf[49])[0] = rslt.getShort(50);
               ((String[]) buf[50])[0] = rslt.getString(51, 6);
               ((byte[]) buf[51])[0] = rslt.getByte(52);
               ((int[]) buf[52])[0] = rslt.getInt(53);
               ((int[]) buf[53])[0] = rslt.getInt(54);
               ((int[]) buf[54])[0] = rslt.getInt(55);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(56,2);
               ((short[]) buf[56])[0] = rslt.getShort(57);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(58,4);
               ((String[]) buf[58])[0] = rslt.getString(59, 3);
               ((int[]) buf[59])[0] = rslt.getInt(60);
               ((String[]) buf[60])[0] = rslt.getString(61, 6);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(62);
               ((int[]) buf[62])[0] = rslt.getInt(63);
               ((byte[]) buf[63])[0] = rslt.getByte(64);
               ((String[]) buf[64])[0] = rslt.getString(65, 1);
               ((short[]) buf[65])[0] = rslt.getShort(66);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
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
               ((String[]) buf[24])[0] = rslt.getString(25, 1);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDate(26);
               ((java.util.Date[]) buf[26])[0] = GXutil.resetDate(rslt.getGXDateTime(27));
               ((java.util.Date[]) buf[27])[0] = rslt.getGXDate(28);
               ((java.util.Date[]) buf[28])[0] = GXutil.resetDate(rslt.getGXDateTime(29));
               ((String[]) buf[29])[0] = rslt.getString(30, 1);
               ((short[]) buf[30])[0] = rslt.getShort(31);
               ((byte[]) buf[31])[0] = rslt.getByte(32);
               ((String[]) buf[32])[0] = rslt.getString(33, 100);
               ((short[]) buf[33])[0] = rslt.getShort(34);
               ((java.math.BigDecimal[]) buf[34])[0] = rslt.getBigDecimal(35,2);
               ((java.math.BigDecimal[]) buf[35])[0] = rslt.getBigDecimal(36,2);
               ((String[]) buf[36])[0] = rslt.getString(37, 6);
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(38);
               ((String[]) buf[38])[0] = rslt.getString(39, 16);
               ((int[]) buf[39])[0] = rslt.getInt(40);
               ((String[]) buf[40])[0] = rslt.getString(41, 12);
               ((String[]) buf[41])[0] = rslt.getString(42, 12);
               ((java.math.BigDecimal[]) buf[42])[0] = rslt.getBigDecimal(43,2);
               ((java.math.BigDecimal[]) buf[43])[0] = rslt.getBigDecimal(44,2);
               ((int[]) buf[44])[0] = rslt.getInt(45);
               ((short[]) buf[45])[0] = rslt.getShort(46);
               ((java.math.BigDecimal[]) buf[46])[0] = rslt.getBigDecimal(47,2);
               ((short[]) buf[47])[0] = rslt.getShort(48);
               ((java.math.BigDecimal[]) buf[48])[0] = rslt.getBigDecimal(49,2);
               ((short[]) buf[49])[0] = rslt.getShort(50);
               ((String[]) buf[50])[0] = rslt.getString(51, 6);
               ((byte[]) buf[51])[0] = rslt.getByte(52);
               ((int[]) buf[52])[0] = rslt.getInt(53);
               ((int[]) buf[53])[0] = rslt.getInt(54);
               ((int[]) buf[54])[0] = rslt.getInt(55);
               ((java.math.BigDecimal[]) buf[55])[0] = rslt.getBigDecimal(56,2);
               ((short[]) buf[56])[0] = rslt.getShort(57);
               ((java.math.BigDecimal[]) buf[57])[0] = rslt.getBigDecimal(58,4);
               ((String[]) buf[58])[0] = rslt.getString(59, 3);
               ((int[]) buf[59])[0] = rslt.getInt(60);
               ((String[]) buf[60])[0] = rslt.getString(61, 6);
               ((java.util.Date[]) buf[61])[0] = rslt.getGXDate(62);
               ((int[]) buf[62])[0] = rslt.getInt(63);
               ((byte[]) buf[63])[0] = rslt.getByte(64);
               ((String[]) buf[64])[0] = rslt.getString(65, 1);
               ((short[]) buf[65])[0] = rslt.getShort(66);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 11 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 12 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((String[]) buf[9])[0] = rslt.getString(7, 8);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,2);
               ((byte[]) buf[11])[0] = rslt.getByte(9);
               ((byte[]) buf[12])[0] = rslt.getByte(10);
               ((byte[]) buf[13])[0] = rslt.getByte(11);
               ((byte[]) buf[14])[0] = rslt.getByte(12);
               ((byte[]) buf[15])[0] = rslt.getByte(13);
               ((String[]) buf[16])[0] = rslt.getString(14, 1);
               ((String[]) buf[17])[0] = rslt.getString(15, 30);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((short[]) buf[19])[0] = rslt.getShort(16);
               ((byte[]) buf[20])[0] = rslt.getByte(17);
               ((byte[]) buf[21])[0] = rslt.getByte(18);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(19,2);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(20,2);
               ((short[]) buf[24])[0] = rslt.getShort(21);
               ((String[]) buf[25])[0] = rslt.getString(22, 8);
               ((String[]) buf[26])[0] = rslt.getString(23, 10);
               ((byte[]) buf[27])[0] = rslt.getByte(24);
               ((byte[]) buf[28])[0] = rslt.getByte(25);
               ((int[]) buf[29])[0] = rslt.getInt(26);
               ((int[]) buf[30])[0] = rslt.getInt(27);
               ((short[]) buf[31])[0] = rslt.getShort(28);
               ((String[]) buf[32])[0] = rslt.getString(29, 1);
               ((String[]) buf[33])[0] = rslt.getString(30, 15);
               ((String[]) buf[34])[0] = rslt.getString(31, 1);
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDate(32);
               ((java.util.Date[]) buf[36])[0] = GXutil.resetDate(rslt.getGXDateTime(33));
               ((java.util.Date[]) buf[37])[0] = rslt.getGXDate(34);
               ((java.util.Date[]) buf[38])[0] = GXutil.resetDate(rslt.getGXDateTime(35));
               ((String[]) buf[39])[0] = rslt.getString(36, 1);
               ((short[]) buf[40])[0] = rslt.getShort(37);
               ((byte[]) buf[41])[0] = rslt.getByte(38);
               ((String[]) buf[42])[0] = rslt.getString(39, 100);
               ((short[]) buf[43])[0] = rslt.getShort(40);
               ((java.math.BigDecimal[]) buf[44])[0] = rslt.getBigDecimal(41,2);
               ((java.math.BigDecimal[]) buf[45])[0] = rslt.getBigDecimal(42,2);
               ((String[]) buf[46])[0] = rslt.getString(43, 6);
               ((java.util.Date[]) buf[47])[0] = rslt.getGXDate(44);
               ((String[]) buf[48])[0] = rslt.getString(45, 16);
               ((int[]) buf[49])[0] = rslt.getInt(46);
               ((String[]) buf[50])[0] = rslt.getString(47, 12);
               ((String[]) buf[51])[0] = rslt.getString(48, 12);
               ((java.math.BigDecimal[]) buf[52])[0] = rslt.getBigDecimal(49,2);
               ((java.math.BigDecimal[]) buf[53])[0] = rslt.getBigDecimal(50,2);
               ((int[]) buf[54])[0] = rslt.getInt(51);
               ((short[]) buf[55])[0] = rslt.getShort(52);
               ((java.math.BigDecimal[]) buf[56])[0] = rslt.getBigDecimal(53,2);
               ((short[]) buf[57])[0] = rslt.getShort(54);
               ((java.math.BigDecimal[]) buf[58])[0] = rslt.getBigDecimal(55,2);
               ((short[]) buf[59])[0] = rslt.getShort(56);
               ((String[]) buf[60])[0] = rslt.getString(57, 6);
               ((byte[]) buf[61])[0] = rslt.getByte(58);
               ((int[]) buf[62])[0] = rslt.getInt(59);
               ((int[]) buf[63])[0] = rslt.getInt(60);
               ((int[]) buf[64])[0] = rslt.getInt(61);
               ((java.math.BigDecimal[]) buf[65])[0] = rslt.getBigDecimal(62,2);
               ((short[]) buf[66])[0] = rslt.getShort(63);
               ((java.math.BigDecimal[]) buf[67])[0] = rslt.getBigDecimal(64,4);
               ((String[]) buf[68])[0] = rslt.getString(65, 3);
               ((int[]) buf[69])[0] = rslt.getInt(66);
               ((String[]) buf[70])[0] = rslt.getString(67, 6);
               ((java.util.Date[]) buf[71])[0] = rslt.getGXDate(68);
               ((int[]) buf[72])[0] = rslt.getInt(69);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((byte[]) buf[74])[0] = rslt.getByte(70);
               ((boolean[]) buf[75])[0] = rslt.wasNull();
               ((String[]) buf[76])[0] = rslt.getString(71, 1);
               ((boolean[]) buf[77])[0] = rslt.wasNull();
               ((short[]) buf[78])[0] = rslt.getShort(72);
               ((boolean[]) buf[79])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[80])[0] = rslt.getBigDecimal(73,2);
               ((java.math.BigDecimal[]) buf[81])[0] = rslt.getBigDecimal(74,2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 15 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 18 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 24 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 25 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 31 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               return;
            case 34 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 37 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 9);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 45 :
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
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 6 :
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
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
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
            case 10 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
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
               return;
            case 20 :
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
            case 21 :
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
            case 22 :
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
            case 23 :
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
            case 24 :
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
            case 25 :
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
            case 26 :
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
               stmt.setString(25, (String)parms[24], 1);
               stmt.setDate(26, (java.util.Date)parms[25]);
               stmt.setDateTime(27, (java.util.Date)parms[26], true);
               stmt.setDate(28, (java.util.Date)parms[27]);
               stmt.setDateTime(29, (java.util.Date)parms[28], true);
               stmt.setString(30, (String)parms[29], 1);
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setByte(32, ((Number) parms[31]).byteValue());
               stmt.setString(33, (String)parms[32], 100);
               stmt.setShort(34, ((Number) parms[33]).shortValue());
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 2);
               stmt.setBigDecimal(36, (java.math.BigDecimal)parms[35], 2);
               stmt.setString(37, (String)parms[36], 6);
               stmt.setDate(38, (java.util.Date)parms[37]);
               stmt.setString(39, (String)parms[38], 16);
               stmt.setInt(40, ((Number) parms[39]).intValue());
               stmt.setString(41, (String)parms[40], 12);
               stmt.setString(42, (String)parms[41], 12);
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[42], 2);
               stmt.setBigDecimal(44, (java.math.BigDecimal)parms[43], 2);
               stmt.setInt(45, ((Number) parms[44]).intValue());
               stmt.setShort(46, ((Number) parms[45]).shortValue());
               stmt.setBigDecimal(47, (java.math.BigDecimal)parms[46], 2);
               stmt.setShort(48, ((Number) parms[47]).shortValue());
               stmt.setBigDecimal(49, (java.math.BigDecimal)parms[48], 2);
               stmt.setShort(50, ((Number) parms[49]).shortValue());
               stmt.setString(51, (String)parms[50], 6);
               stmt.setByte(52, ((Number) parms[51]).byteValue());
               stmt.setInt(53, ((Number) parms[52]).intValue());
               stmt.setInt(54, ((Number) parms[53]).intValue());
               stmt.setInt(55, ((Number) parms[54]).intValue());
               stmt.setBigDecimal(56, (java.math.BigDecimal)parms[55], 2);
               stmt.setShort(57, ((Number) parms[56]).shortValue());
               stmt.setBigDecimal(58, (java.math.BigDecimal)parms[57], 4);
               stmt.setString(59, (String)parms[58], 3);
               stmt.setInt(60, ((Number) parms[59]).intValue());
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[61], 6);
               }
               stmt.setDate(62, (java.util.Date)parms[62]);
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 63 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(63, ((Number) parms[64]).intValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(64, ((Number) parms[66]).byteValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 65 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(65, (String)parms[68], 1);
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 66 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(66, ((Number) parms[70]).shortValue());
               }
               return;
            case 27 :
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
               stmt.setString(24, (String)parms[23], 1);
               stmt.setDate(25, (java.util.Date)parms[24]);
               stmt.setDateTime(26, (java.util.Date)parms[25], true);
               stmt.setDate(27, (java.util.Date)parms[26]);
               stmt.setDateTime(28, (java.util.Date)parms[27], true);
               stmt.setString(29, (String)parms[28], 1);
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setByte(31, ((Number) parms[30]).byteValue());
               stmt.setString(32, (String)parms[31], 100);
               stmt.setShort(33, ((Number) parms[32]).shortValue());
               stmt.setBigDecimal(34, (java.math.BigDecimal)parms[33], 2);
               stmt.setBigDecimal(35, (java.math.BigDecimal)parms[34], 2);
               stmt.setString(36, (String)parms[35], 6);
               stmt.setDate(37, (java.util.Date)parms[36]);
               stmt.setString(38, (String)parms[37], 16);
               stmt.setInt(39, ((Number) parms[38]).intValue());
               stmt.setString(40, (String)parms[39], 12);
               stmt.setString(41, (String)parms[40], 12);
               stmt.setBigDecimal(42, (java.math.BigDecimal)parms[41], 2);
               stmt.setBigDecimal(43, (java.math.BigDecimal)parms[42], 2);
               stmt.setInt(44, ((Number) parms[43]).intValue());
               stmt.setShort(45, ((Number) parms[44]).shortValue());
               stmt.setBigDecimal(46, (java.math.BigDecimal)parms[45], 2);
               stmt.setShort(47, ((Number) parms[46]).shortValue());
               stmt.setBigDecimal(48, (java.math.BigDecimal)parms[47], 2);
               stmt.setShort(49, ((Number) parms[48]).shortValue());
               stmt.setString(50, (String)parms[49], 6);
               stmt.setByte(51, ((Number) parms[50]).byteValue());
               stmt.setInt(52, ((Number) parms[51]).intValue());
               stmt.setInt(53, ((Number) parms[52]).intValue());
               stmt.setInt(54, ((Number) parms[53]).intValue());
               stmt.setBigDecimal(55, (java.math.BigDecimal)parms[54], 2);
               stmt.setShort(56, ((Number) parms[55]).shortValue());
               stmt.setBigDecimal(57, (java.math.BigDecimal)parms[56], 4);
               stmt.setInt(58, ((Number) parms[57]).intValue());
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 59 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(59, ((Number) parms[59]).intValue());
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 60 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(60, ((Number) parms[61]).byteValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 61 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(61, (String)parms[63], 1);
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 62 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(62, ((Number) parms[65]).shortValue());
               }
               stmt.setString(63, (String)parms[66], 3);
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 64 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(64, (String)parms[68], 6);
               }
               stmt.setDate(65, (java.util.Date)parms[69]);
               stmt.setInt(66, ((Number) parms[70]).intValue());
               return;
            case 28 :
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
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 32 :
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
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 34 :
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
            case 37 :
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
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
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

