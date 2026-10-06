package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevpiecopy1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_20_1OU31( A396EmprCod, A323DevGenCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action21") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_21_1OU31( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV13AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_22_1OU31( A396EmprCod, A44AlbRecCod, AV13AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A6288DevGenDom = (byte)(GXutil.lval( httpContext.GetPar( "DevGenDom"))) ;
         n6288DevGenDom = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         AV65Err_att = httpContext.GetPar( "Err_att") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", AV65Err_att);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_25_1OU31( A396EmprCod, A252CliCod, A6288DevGenDom, AV65Err_att) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxCallCrl"+"_"+"DEVGENTRN") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxdladevgentrn1OU31( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_60") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_60( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_61") == 0 )
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
         gxload_61( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_62") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A327DevGenTrn = (short)(GXutil.lval( httpContext.GetPar( "DevGenTrn"))) ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_62( A396EmprCod, A327DevGenTrn) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_63") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_63( A396EmprCod, A323DevGenCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_65") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A2159AlbRecPie = httpContext.GetPar( "AlbRecPie") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_65( A396EmprCod, A44AlbRecCod, A2159AlbRecPie) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtdevpiecopy1_level1item") == 0 )
      {
         gxnrgridtdevpiecopy1_level1item_newrow_invoke( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtdevpiecopy1_level2item") == 0 )
      {
         gxnrgridtdevpiecopy1_level2item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion Piezas Copy", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridtdevpiecopy1_level1item_newrow_invoke( )
   {
      nRC_GXsfl_94 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_94"))) ;
      nGXsfl_94_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_94_idx"))) ;
      sGXsfl_94_idx = httpContext.GetPar( "sGXsfl_94_idx") ;
      A326DevGenPie = (short)(GXutil.lval( httpContext.GetPar( "DevGenPie"))) ;
      n326DevGenPie = false ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A51AlbRPieDis = (int)(GXutil.lval( httpContext.GetPar( "AlbRPieDis"))) ;
      A57AlbRUniDis = CommonUtil.decimalVal( httpContext.GetPar( "AlbRUniDis"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtdevpiecopy1_level1item_newrow( ) ;
      /* End function gxnrGridtdevpiecopy1_level1item_newrow_invoke */
   }

   public void gxnrgridtdevpiecopy1_level2item_newrow_invoke( )
   {
      nRC_GXsfl_112 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_112"))) ;
      nGXsfl_112_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_112_idx"))) ;
      sGXsfl_112_idx = httpContext.GetPar( "sGXsfl_112_idx") ;
      A1304DevUlin = (byte)(GXutil.lval( httpContext.GetPar( "DevUlin"))) ;
      n1304DevUlin = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridtdevpiecopy1_level2item_newrow( ) ;
      /* End function gxnrGridtdevpiecopy1_level2item_newrow_invoke */
   }

   public tdevpiecopy1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevpiecopy1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevpiecopy1_impl.class ));
   }

   public tdevpiecopy1_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      dynDevGenTrn = new HTMLChoice();
      cmbAlbRUni = new HTMLChoice();
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
      if ( dynDevGenTrn.getItemCount() > 0 )
      {
         A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValidValue(GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0))))) ;
         n327DevGenTrn = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynDevGenTrn.setValue( GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Values", dynDevGenTrn.ToJavascriptSource(), true);
      }
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Devolucion Piezas Copy", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenCod_Internalname, httpContext.getMessage( "N Devolucion ID", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenCod_Internalname, GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenFec_Internalname, httpContext.getMessage( "Fecha de Devolucion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevGenFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenFec_Internalname, localUtil.format(A325DevGenFec, "99/99/99"), localUtil.format( A325DevGenFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevGenFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevGenFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDevPieCopy1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRecCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRecCod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenDom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenDom_Internalname, httpContext.getMessage( "Domicilio Envio", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenDom_Internalname, GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenDom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9") : localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenDom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenDom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRef_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRef_Internalname, httpContext.getMessage( "Codigo Referencia", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynDevGenTrn.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynDevGenTrn.getInternalname(), httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynDevGenTrn, dynDevGenTrn.getInternalname(), GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0)), 1, dynDevGenTrn.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", httpContext.getMessage( "Codigo Transportista", ""), 1, dynDevGenTrn.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "", true, (byte)(0), "HLP_TDevPieCopy1.htm");
      dynDevGenTrn.setValue( GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Values", dynDevGenTrn.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenUni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenUni_Internalname, httpContext.getMessage( "Unidades Dev", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenUni_Internalname, GXutil.ltrim( localUtil.ntoc( A328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenUni_Enabled!=0) ? localUtil.format( A328DevGenUni, "ZZZZZ9.99") : localUtil.format( A328DevGenUni, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenUni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbAlbRUni.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbAlbRUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_TDevPieCopy1.htm");
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniDis_Internalname, httpContext.getMessage( "Unidades Disponibles", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenPie_Internalname, httpContext.getMessage( "Piezas Dev", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenPie_Internalname, GXutil.ltrim( localUtil.ntoc( A326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieDis_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieDis_Internalname, httpContext.getMessage( "Piezas Disponibles", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Piezas", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      gxdraw_gridtdevpiecopy1_level1item( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTable1_Internalname, tblTable1_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttSeleccionarpiezas_Internalname, "", httpContext.getMessage( "Seleccionar PIEZAS", ""), bttSeleccionarpiezas_Jsonclick, 5, httpContext.getMessage( "Seleccionar PIEZAS", ""), "", StyleString, ClassString, bttSeleccionarpiezas_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'SELECCIONAR PIEZAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPieCopy1.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel2_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTitlelevel2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      gxdraw_gridtdevpiecopy1_level2item( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDevPieCopy1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtdevpiecopy1_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol94( ) ;
      nGXsfl_94_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount451 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_451 = (short)(1) ;
            scanStart1OU451( ) ;
            while ( RcdFound451 != 0 )
            {
               init_level_properties451( ) ;
               getByPrimaryKey1OU451( ) ;
               addRow1OU451( ) ;
               scanNext1OU451( ) ;
            }
            scanEnd1OU451( ) ;
            nBlankRcdCount451 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         B326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         B328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         B54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         B60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         B3066AlbDevPUni = A3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         B5278AlbDevPPie = A5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         B325DevGenFec = A325DevGenFec ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         standaloneNotModal1OU451( ) ;
         standaloneModal1OU451( ) ;
         sMode451 = Gx_mode ;
         while ( nGXsfl_94_idx < nRC_GXsfl_94 )
         {
            bGXsfl_94_Refreshing = true ;
            readRow1OU451( ) ;
            edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_94_Refreshing);
            edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_94_Refreshing);
            edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_94_Refreshing);
            edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_94_Refreshing);
            edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_94_Refreshing);
            edtDevPieUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVPIEUNI_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevPieUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevPieUni_Enabled), 5, 0), !bGXsfl_94_Refreshing);
            if ( ( nRcdExists_451 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OU451( ) ;
            }
            sendRow1OU451( ) ;
            bGXsfl_94_Refreshing = false ;
         }
         Gx_mode = sMode451 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1304DevUlin = B1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         A326DevGenPie = B326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = B328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A54AlbRPieUti = B54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = B60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A3066AlbDevPUni = B3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = B5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         A325DevGenFec = B325DevGenFec ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount451 = (short)(5) ;
         nRcdExists_451 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OU451( ) ;
            while ( RcdFound451 != 0 )
            {
               sGXsfl_94_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_94_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_94451( ) ;
               init_level_properties451( ) ;
               standaloneNotModal1OU451( ) ;
               getByPrimaryKey1OU451( ) ;
               standaloneModal1OU451( ) ;
               addRow1OU451( ) ;
               scanNext1OU451( ) ;
            }
            scanEnd1OU451( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode451 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_94_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_94_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_94451( ) ;
      initAll1OU451( ) ;
      init_level_properties451( ) ;
      B1304DevUlin = A1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      B326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      B328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      B54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      B60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      B3066AlbDevPUni = A3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      B5278AlbDevPPie = A5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      B325DevGenFec = A325DevGenFec ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      nRcdExists_451 = (short)(0) ;
      nIsMod_451 = (short)(0) ;
      nRcdDeleted_451 = (short)(0) ;
      nBlankRcdCount451 = (short)(nBlankRcdUsr451+nBlankRcdCount451) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount451 > 0 )
      {
         standaloneNotModal1OU451( ) ;
         standaloneModal1OU451( ) ;
         addRow1OU451( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtAlbRecPie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount451 = (short)(nBlankRcdCount451-1) ;
      }
      Gx_mode = sMode451 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1304DevUlin = B1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      A326DevGenPie = B326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A328DevGenUni = B328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      A54AlbRPieUti = B54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A60AlbRUniUti = B60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A3066AlbDevPUni = B3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      A5278AlbDevPPie = B5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      A325DevGenFec = B325DevGenFec ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtdevpiecopy1_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtdevpiecopy1_level1item", Gridtdevpiecopy1_level1itemContainer, subGridtdevpiecopy1_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdevpiecopy1_level1itemContainerData", Gridtdevpiecopy1_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdevpiecopy1_level1itemContainerData"+"V", Gridtdevpiecopy1_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtdevpiecopy1_level1itemContainerData"+"V"+"\" value='"+Gridtdevpiecopy1_level1itemContainer.GridValuesHidden()+"'/>") ;
      }
   }

   public void gxdraw_gridtdevpiecopy1_level2item( )
   {
      /*  Grid Control  */
      startgridcontrol112( ) ;
      nGXsfl_112_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount192 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_192 = (short)(1) ;
            scanStart1OU192( ) ;
            while ( RcdFound192 != 0 )
            {
               init_level_properties192( ) ;
               getByPrimaryKey1OU192( ) ;
               addRow1OU192( ) ;
               scanNext1OU192( ) ;
            }
            scanEnd1OU192( ) ;
            nBlankRcdCount192 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         B326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         B328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         B54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         B60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         B3066AlbDevPUni = A3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         B5278AlbDevPPie = A5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         B325DevGenFec = A325DevGenFec ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         standaloneNotModal1OU192( ) ;
         standaloneModal1OU192( ) ;
         sMode192 = Gx_mode ;
         while ( nGXsfl_112_idx < nRC_GXsfl_112 )
         {
            bGXsfl_112_Refreshing = true ;
            readRow1OU192( ) ;
            edtDevLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVLIN_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            edtDevObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVOBS_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevObs_Enabled), 5, 0), !bGXsfl_112_Refreshing);
            if ( ( nRcdExists_192 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OU192( ) ;
            }
            sendRow1OU192( ) ;
            bGXsfl_112_Refreshing = false ;
         }
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1304DevUlin = B1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         A326DevGenPie = B326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = B328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A54AlbRPieUti = B54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = B60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A3066AlbDevPUni = B3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = B5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         A325DevGenFec = B325DevGenFec ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount192 = (short)(5) ;
         nRcdExists_192 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OU192( ) ;
            while ( RcdFound192 != 0 )
            {
               sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_112192( ) ;
               init_level_properties192( ) ;
               standaloneNotModal1OU192( ) ;
               getByPrimaryKey1OU192( ) ;
               standaloneModal1OU192( ) ;
               addRow1OU192( ) ;
               scanNext1OU192( ) ;
            }
            scanEnd1OU192( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode192 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_112192( ) ;
      initAll1OU192( ) ;
      init_level_properties192( ) ;
      B1304DevUlin = A1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      B326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      B328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      B54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      B60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      B3066AlbDevPUni = A3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      B5278AlbDevPPie = A5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      B325DevGenFec = A325DevGenFec ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      nRcdExists_192 = (short)(0) ;
      nIsMod_192 = (short)(0) ;
      nRcdDeleted_192 = (short)(0) ;
      nBlankRcdCount192 = (short)(nBlankRcdUsr192+nBlankRcdCount192) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount192 > 0 )
      {
         standaloneNotModal1OU192( ) ;
         standaloneModal1OU192( ) ;
         addRow1OU192( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtDevLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount192 = (short)(nBlankRcdCount192-1) ;
      }
      Gx_mode = sMode192 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      A1304DevUlin = B1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      A326DevGenPie = B326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A328DevGenUni = B328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      A54AlbRPieUti = B54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A60AlbRUniUti = B60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A3066AlbDevPUni = B3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      A5278AlbDevPPie = B5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      A325DevGenFec = B325DevGenFec ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtdevpiecopy1_level2itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtdevpiecopy1_level2item", Gridtdevpiecopy1_level2itemContainer, subGridtdevpiecopy1_level2item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdevpiecopy1_level2itemContainerData", Gridtdevpiecopy1_level2itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdevpiecopy1_level2itemContainerData"+"V", Gridtdevpiecopy1_level2itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtdevpiecopy1_level2itemContainerData"+"V"+"\" value='"+Gridtdevpiecopy1_level2itemContainer.GridValuesHidden()+"'/>") ;
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
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e111OU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z323DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z323DevGenCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z328DevGenUni = localUtil.ctond( httpContext.cgiGet( "Z328DevGenUni")) ;
            Z326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z326DevGenPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z325DevGenFec = localUtil.ctod( httpContext.cgiGet( "Z325DevGenFec"), 0) ;
            Z6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6288DevGenDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z324DevGenEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z327DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( "Z327DevGenTrn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z324DevGenEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n324DevGenEst = false ;
            A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1304DevUlin = false ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "Z60AlbRUniUti")) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            O1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "O1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( "O326DevGenPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O328DevGenUni = localUtil.ctond( httpContext.cgiGet( "O328DevGenUni")) ;
            O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "O54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "O60AlbRUniUti")) ;
            O3066AlbDevPUni = localUtil.ctond( httpContext.cgiGet( "O3066AlbDevPUni")) ;
            O5278AlbDevPPie = (short)(localUtil.ctol( httpContext.cgiGet( "O5278AlbDevPPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O325DevGenFec = localUtil.ctod( httpContext.cgiGet( "O325DevGenFec"), 0) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_94 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_94"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            nRC_GXsfl_112 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_112"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Modo = httpContext.cgiGet( "MODO") ;
            AV10AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "ALBRUNIDIS")) ;
            AV14KilAnt = localUtil.ctond( httpContext.cgiGet( "KILANT")) ;
            AV15MetAnt = localUtil.ctond( httpContext.cgiGet( "METANT")) ;
            AV17Kilos = localUtil.ctond( httpContext.cgiGet( "KILOS")) ;
            AV18Metros = localUtil.ctond( httpContext.cgiGet( "METROS")) ;
            AV9AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV16PieAnt = (short)(localUtil.ctol( httpContext.cgiGet( "PIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19Piezas = (short)(localUtil.ctol( httpContext.cgiGet( "PIEZAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "ALBRUNIENT")) ;
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "ALBRUNIUTI")) ;
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEENT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRPIEUTI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV20Modo = httpContext.cgiGet( "vMODO") ;
            AV9AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "vALBRUNIDIS")) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV14KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV15MetAnt = localUtil.ctond( httpContext.cgiGet( "vMETANT")) ;
            AV16PieAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Kilos = localUtil.ctond( httpContext.cgiGet( "vKILOS")) ;
            AV18Metros = localUtil.ctond( httpContext.cgiGet( "vMETROS")) ;
            AV19Piezas = (short)(localUtil.ctol( httpContext.cgiGet( "vPIEZAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV61oldDevGenFec = localUtil.ctod( httpContext.cgiGet( "vOLDDEVGENFEC"), 0) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV13AlbRUni = httpContext.cgiGet( "vALBRUNI") ;
            AV11AlbRPDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12AlbRUDis = localUtil.ctond( httpContext.cgiGet( "vALBRUDIS")) ;
            AV65Err_att = httpContext.cgiGet( "vERR_ATT") ;
            A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVGENEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A329DevTrnNom = httpContext.cgiGet( "DEVTRNNOM") ;
            n329DevTrnNom = false ;
            A3066AlbDevPUni = localUtil.ctond( httpContext.cgiGet( "ALBDEVPUNI")) ;
            A5278AlbDevPPie = (short)(localUtil.ctol( httpContext.cgiGet( "ALBDEVPPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV63oldUni = localUtil.ctond( httpContext.cgiGet( "vOLDUNI")) ;
            A4795AlRPieCal = httpContext.cgiGet( "ALRPIECAL") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVGENCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A323DevGenCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            }
            else
            {
               A323DevGenCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDevGenCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtDevGenFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVGENFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A325DevGenFec = GXutil.nullDate() ;
               n325DevGenFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
            }
            else
            {
               A325DevGenFec = localUtil.ctod( httpContext.cgiGet( edtDevGenFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               n325DevGenFec = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBRECCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbRecCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44AlbRecCod = 0 ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            else
            {
               A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n44AlbRecCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVGENDOM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenDom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A6288DevGenDom = (byte)(0) ;
               n6288DevGenDom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
            }
            else
            {
               A6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevGenDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n6288DevGenDom = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
            }
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            dynDevGenTrn.setName( dynDevGenTrn.getInternalname() );
            dynDevGenTrn.setValue( httpContext.cgiGet( dynDevGenTrn.getInternalname()) );
            A327DevGenTrn = (short)(GXutil.lval( httpContext.cgiGet( dynDevGenTrn.getInternalname()))) ;
            n327DevGenTrn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
            A328DevGenUni = localUtil.ctond( httpContext.cgiGet( edtDevGenUni_Internalname)) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            A326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDevGenPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n326DevGenPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDevPieCopy1");
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV20Modo, "")));
            forbiddenHiddens.add("DevGenEst", localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A323DevGenCod != Z323DevGenCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdevpiecopy1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
               A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
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
                     if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111OU2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'SELECCIONAR PIEZAS'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'Seleccionar PIEZAS' */
                        e121OU2 ();
                        nKeyPressed = (byte)(3) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1OU31( ) ;
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
      disableAttributes1OU31( ) ;
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

   public void confirm_1OU192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      nGXsfl_112_idx = 0 ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         readRow1OU192( ) ;
         if ( ( nRcdExists_192 != 0 ) || ( nIsMod_192 != 0 ) )
         {
            getKey1OU192( ) ;
            if ( ( nRcdExists_192 == 0 ) && ( nRcdDeleted_192 == 0 ) )
            {
               if ( RcdFound192 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OU192( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OU192( ) ;
                     closeExtendedTableCursors1OU192( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O1304DevUlin = A1304DevUlin ;
                     n1304DevUlin = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "DEVLIN_" + sGXsfl_112_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound192 != 0 )
               {
                  if ( nRcdDeleted_192 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OU192( ) ;
                     load1OU192( ) ;
                     beforeValidate1OU192( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OU192( ) ;
                        O1304DevUlin = A1304DevUlin ;
                        n1304DevUlin = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_192 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OU192( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OU192( ) ;
                           closeExtendedTableCursors1OU192( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O1304DevUlin = A1304DevUlin ;
                           n1304DevUlin = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_192 == 0 )
                  {
                     GXCCtl = "DEVLIN_" + sGXsfl_112_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDevLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevObs_Internalname, GXutil.rtrim( A1303DevObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_112_idx, GXutil.rtrim( Z1303DevObs)) ;
         httpContext.changePostValue( "nRcdDeleted_192_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_192_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_192_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_192 != 0 )
         {
            httpContext.changePostValue( "DEVLIN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVOBS_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1304DevUlin = s1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void confirm_1OU451( )
   {
      s326DevGenPie = O326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      s328DevGenUni = O328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s3066AlbDevPUni = O3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      s5278AlbDevPPie = O5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      sV14KilAnt = OV14KilAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      sV15MetAnt = OV15MetAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      sV16PieAnt = OV16PieAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      sV17Kilos = OV17Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      sV18Metros = OV18Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      sV19Piezas = OV19Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      sV9AlbRPieDis = OV9AlbRPieDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      sV10AlbRUniDis = OV10AlbRUniDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      s47AlbREst = O47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      nGXsfl_94_idx = 0 ;
      while ( nGXsfl_94_idx < nRC_GXsfl_94 )
      {
         readRow1OU451( ) ;
         if ( ( nRcdExists_451 != 0 ) || ( nIsMod_451 != 0 ) )
         {
            getKey1OU451( ) ;
            if ( ( nRcdExists_451 == 0 ) && ( nRcdDeleted_451 == 0 ) )
            {
               if ( RcdFound451 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OU451( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OU451( ) ;
                     closeExtendedTableCursors1OU451( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O326DevGenPie = A326DevGenPie ;
                     n326DevGenPie = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                     O328DevGenUni = A328DevGenUni ;
                     n328DevGenUni = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                     O54AlbRPieUti = A54AlbRPieUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                     O60AlbRUniUti = A60AlbRUniUti ;
                     httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                     O3066AlbDevPUni = A3066AlbDevPUni ;
                     httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                     O5278AlbDevPPie = A5278AlbDevPPie ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                     OV14KilAnt = AV14KilAnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                     OV15MetAnt = AV15MetAnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                     OV16PieAnt = AV16PieAnt ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                     OV17Kilos = AV17Kilos ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                     OV18Metros = AV18Metros ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                     OV19Piezas = AV19Piezas ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                     OV9AlbRPieDis = AV9AlbRPieDis ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                     OV10AlbRUniDis = AV10AlbRUniDis ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                     O47AlbREst = A47AlbREst ;
                     httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBRECPIE_" + sGXsfl_94_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbRecPie_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound451 != 0 )
               {
                  if ( nRcdDeleted_451 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OU451( ) ;
                     load1OU451( ) ;
                     beforeValidate1OU451( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OU451( ) ;
                        O326DevGenPie = A326DevGenPie ;
                        n326DevGenPie = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                        O328DevGenUni = A328DevGenUni ;
                        n328DevGenUni = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                        O54AlbRPieUti = A54AlbRPieUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                        O60AlbRUniUti = A60AlbRUniUti ;
                        httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                        O3066AlbDevPUni = A3066AlbDevPUni ;
                        httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                        O5278AlbDevPPie = A5278AlbDevPPie ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                        OV14KilAnt = AV14KilAnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                        OV15MetAnt = AV15MetAnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                        OV16PieAnt = AV16PieAnt ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                        OV17Kilos = AV17Kilos ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                        OV18Metros = AV18Metros ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                        OV19Piezas = AV19Piezas ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                        OV9AlbRPieDis = AV9AlbRPieDis ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                        OV10AlbRUniDis = AV10AlbRUniDis ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                        O47AlbREst = A47AlbREst ;
                        httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_451 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OU451( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OU451( ) ;
                           closeExtendedTableCursors1OU451( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O326DevGenPie = A326DevGenPie ;
                           n326DevGenPie = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                           O328DevGenUni = A328DevGenUni ;
                           n328DevGenUni = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                           O54AlbRPieUti = A54AlbRPieUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                           O60AlbRUniUti = A60AlbRUniUti ;
                           httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                           O3066AlbDevPUni = A3066AlbDevPUni ;
                           httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                           O5278AlbDevPPie = A5278AlbDevPPie ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                           OV14KilAnt = AV14KilAnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                           OV15MetAnt = AV15MetAnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                           OV16PieAnt = AV16PieAnt ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                           OV17Kilos = AV17Kilos ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                           OV18Metros = AV18Metros ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                           OV19Piezas = AV19Piezas ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                           OV9AlbRPieDis = AV9AlbRPieDis ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                           OV10AlbRUniDis = AV10AlbRUniDis ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                           O47AlbREst = A47AlbREst ;
                           httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_451 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_94_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevPieUni_Internalname, GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_94_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z3067DevPieUni_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( Z3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_94_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3067DevPieUni_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( O3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2156AlbRecKgmU_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( O2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2158AlbRecMtrU_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( O2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_451_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_451_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_451_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_451 != 0 )
         {
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVPIEUNI_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevPieUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O326DevGenPie = s326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      O328DevGenUni = s328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      O54AlbRPieUti = s54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = s60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O3066AlbDevPUni = s3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      O5278AlbDevPPie = s5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      OV14KilAnt = sV14KilAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      OV15MetAnt = sV15MetAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      OV16PieAnt = sV16PieAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      OV17Kilos = sV17Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      OV18Metros = sV18Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      OV19Piezas = sV19Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      OV9AlbRPieDis = sV9AlbRPieDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      OV10AlbRUniDis = sV10AlbRUniDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      O47AlbREst = s47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      /* Start of After( level) rules */
      if ( ( DecimalUtil.compareTo(A328DevGenUni, A3066AlbDevPUni) != 0 ) && ( A3066AlbDevPUni.doubleValue() != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma las unidades", ""), 0, "");
      }
      if ( ( A326DevGenPie != A5278AlbDevPPie ) && ( A5278AlbDevPPie != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma la cantidad de piezas", ""), 0, "");
      }
      /* End of After( level) rules */
   }

   public void resetCaption1OU0( )
   {
   }

   public void e111OU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevpiecopy1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV7EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevpiecopy1_impl.this.A396EmprCod = GXv_char2[0] ;
      tdevpiecopy1_impl.this.AV7EmprNom = GXv_char3[0] ;
      tdevpiecopy1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprNom", AV7EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
   }

   public void e121OU2( )
   {
      /* 'Seleccionar PIEZAS' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.webwdetpie", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.rtrim(A2159AlbRecPie)),GXutil.URLEncode(DecimalUtil.decToString(A2155AlbRecKgm)),GXutil.URLEncode(DecimalUtil.decToString(A2157AlbRecMtr)),GXutil.URLEncode(GXutil.ltrimstr(AV58AlbRecAnh,3,0))}, new String[] {"EmprCod","AlbRecCod","AlbRecPie","DisPieKil","DisPieMet","DisPieAnc"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /*  Sending Event outputs  */
   }

   public void zm1OU31( int GX_JID )
   {
      if ( ( GX_JID == 58 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z328DevGenUni = T01OU9_A328DevGenUni[0] ;
            Z326DevGenPie = T01OU9_A326DevGenPie[0] ;
            Z325DevGenFec = T01OU9_A325DevGenFec[0] ;
            Z6288DevGenDom = T01OU9_A6288DevGenDom[0] ;
            Z324DevGenEst = T01OU9_A324DevGenEst[0] ;
            Z1304DevUlin = T01OU9_A1304DevUlin[0] ;
            Z44AlbRecCod = T01OU9_A44AlbRecCod[0] ;
            Z327DevGenTrn = T01OU9_A327DevGenTrn[0] ;
         }
         else
         {
            Z328DevGenUni = A328DevGenUni ;
            Z326DevGenPie = A326DevGenPie ;
            Z325DevGenFec = A325DevGenFec ;
            Z6288DevGenDom = A6288DevGenDom ;
            Z324DevGenEst = A324DevGenEst ;
            Z1304DevUlin = A1304DevUlin ;
            Z44AlbRecCod = A44AlbRecCod ;
            Z327DevGenTrn = A327DevGenTrn ;
         }
      }
      if ( ( GX_JID == 60 ) || ( GX_JID == 0 ) )
      {
         Z60AlbRUniUti = T01OU12_A60AlbRUniUti[0] ;
         Z47AlbREst = T01OU12_A47AlbREst[0] ;
         Z252CliCod = T01OU12_A252CliCod[0] ;
         Z45AlbRef = T01OU12_A45AlbRef[0] ;
         Z56AlbRUni = T01OU12_A56AlbRUni[0] ;
         Z52AlbRPieEnt = T01OU12_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T01OU12_A58AlbRUniEnt[0] ;
      }
      if ( GX_JID == -58 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z325DevGenFec = A325DevGenFec ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z252CliCod = A252CliCod ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z407EmprNom = A407EmprNom ;
         Z3066AlbDevPUni = A3066AlbDevPUni ;
         Z5278AlbDevPPie = A5278AlbDevPPie ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z47AlbREst = A47AlbREst ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z279CliNom = A279CliNom ;
         Z329DevTrnNom = A329DevTrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      /* Using cursor T01OU10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OU10_A407EmprNom[0] ;
      n407EmprNom = T01OU10_n407EmprNom[0] ;
      pr_default.close(8);
      gxadevgentrn_html1OU31( A396EmprCod) ;
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         AV20Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      }
      else
      {
         if ( isDlt( )  )
         {
            AV20Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
         }
         else
         {
            if ( isUpd( )  )
            {
               AV20Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
            }
         }
      }
      if ( isUpd( )  )
      {
         edtAlbRecCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A325DevGenFec)) && ( Gx_BScreen == 0 ) )
      {
         A325DevGenFec = GXutil.today( ) ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( true )
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         }
      }
      AV16PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV19Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         AV61oldDevGenFec = O325DevGenFec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61oldDevGenFec", localUtil.format(AV61oldDevGenFec, "99/99/99"));
         /* Using cursor T01OU14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = T01OU14_A329DevTrnNom[0] ;
         n329DevTrnNom = T01OU14_n329DevTrnNom[0] ;
         pr_default.close(12);
      }
   }

   public void load1OU31( )
   {
      /* Using cursor T01OU18 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A328DevGenUni = T01OU18_A328DevGenUni[0] ;
         n328DevGenUni = T01OU18_n328DevGenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A326DevGenPie = T01OU18_A326DevGenPie[0] ;
         n326DevGenPie = T01OU18_n326DevGenPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A60AlbRUniUti = T01OU18_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01OU18_A54AlbRPieUti[0] ;
         A47AlbREst = T01OU18_A47AlbREst[0] ;
         A407EmprNom = T01OU18_A407EmprNom[0] ;
         n407EmprNom = T01OU18_n407EmprNom[0] ;
         A325DevGenFec = T01OU18_A325DevGenFec[0] ;
         n325DevGenFec = T01OU18_n325DevGenFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         A6288DevGenDom = T01OU18_A6288DevGenDom[0] ;
         n6288DevGenDom = T01OU18_n6288DevGenDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         A252CliCod = T01OU18_A252CliCod[0] ;
         n252CliCod = T01OU18_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T01OU18_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A45AlbRef = T01OU18_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A329DevTrnNom = T01OU18_A329DevTrnNom[0] ;
         n329DevTrnNom = T01OU18_n329DevTrnNom[0] ;
         A56AlbRUni = T01OU18_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A52AlbRPieEnt = T01OU18_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T01OU18_A58AlbRUniEnt[0] ;
         A324DevGenEst = T01OU18_A324DevGenEst[0] ;
         n324DevGenEst = T01OU18_n324DevGenEst[0] ;
         A1304DevUlin = T01OU18_A1304DevUlin[0] ;
         n1304DevUlin = T01OU18_n1304DevUlin[0] ;
         A44AlbRecCod = T01OU18_A44AlbRecCod[0] ;
         n44AlbRecCod = T01OU18_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A327DevGenTrn = T01OU18_A327DevGenTrn[0] ;
         n327DevGenTrn = T01OU18_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         A3066AlbDevPUni = T01OU18_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01OU18_A5278AlbDevPPie[0] ;
         zm1OU31( -58) ;
      }
      pr_default.close(14);
      onLoadActions1OU31( ) ;
   }

   public void onLoadActions1OU31( )
   {
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O3066AlbDevPUni = A3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      O5278AlbDevPPie = A5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      AV61oldDevGenFec = O325DevGenFec ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61oldDevGenFec", localUtil.format(AV61oldDevGenFec, "99/99/99"));
   }

   public void checkExtendedTable1OU31( )
   {
      nIsDirty_31 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01OU12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01OU12_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01OU12_A54AlbRPieUti[0] ;
      A47AlbREst = T01OU12_A47AlbREst[0] ;
      A252CliCod = T01OU12_A252CliCod[0] ;
      n252CliCod = T01OU12_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A45AlbRef = T01OU12_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A56AlbRUni = T01OU12_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A52AlbRPieEnt = T01OU12_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01OU12_A58AlbRUniEnt[0] ;
      nIsDirty_31 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      nIsDirty_31 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      pr_default.close(10);
      if ( isDlt( )  )
      {
         nIsDirty_31 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_31 = (short)(1) ;
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
      }
      nIsDirty_31 = (short)(1) ;
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         nIsDirty_31 = (short)(1) ;
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            nIsDirty_31 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            nIsDirty_31 = (short)(1) ;
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         nIsDirty_31 = (short)(1) ;
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            nIsDirty_31 = (short)(1) ;
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
      /* Using cursor T01OU13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01OU13_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(11);
      /* Using cursor T01OU14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = dynDevGenTrn.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A329DevTrnNom = T01OU14_A329DevTrnNom[0] ;
      n329DevTrnNom = T01OU14_n329DevTrnNom[0] ;
      pr_default.close(12);
      /* Using cursor T01OU16 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         A3066AlbDevPUni = T01OU16_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01OU16_A5278AlbDevPPie[0] ;
      }
      else
      {
         nIsDirty_31 = (short)(1) ;
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         nIsDirty_31 = (short)(1) ;
         A5278AlbDevPPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      pr_default.close(13);
      AV61oldDevGenFec = O325DevGenFec ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61oldDevGenFec", localUtil.format(AV61oldDevGenFec, "99/99/99"));
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A44AlbRecCod ;
         GXv_int6[0] = AV9AlbRPieDis ;
         GXv_decimal7[0] = AV10AlbRUniDis ;
         GXv_int8[0] = AV11AlbRPDis ;
         GXv_decimal9[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_decimal7, GXv_int8, GXv_decimal9, GXv_char3) ;
         tdevpiecopy1_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevpiecopy1_impl.this.A44AlbRecCod = GXv_int5[0] ;
         tdevpiecopy1_impl.this.AV9AlbRPieDis = GXv_int6[0] ;
         tdevpiecopy1_impl.this.AV10AlbRUniDis = GXv_decimal7[0] ;
         tdevpiecopy1_impl.this.AV11AlbRPDis = GXv_int8[0] ;
         tdevpiecopy1_impl.this.AV12AlbRUDis = GXv_decimal9[0] ;
         tdevpiecopy1_impl.this.AV13AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int10[0] = A6288DevGenDom ;
         GXv_char3[0] = AV65Err_att ;
         new app.pexdomenvio(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int10, GXv_char3) ;
         tdevpiecopy1_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevpiecopy1_impl.this.A252CliCod = GXv_int8[0] ;
         tdevpiecopy1_impl.this.A6288DevGenDom = GXv_int10[0] ;
         tdevpiecopy1_impl.this.AV65Err_att = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", AV65Err_att);
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ && ( GXutil.strcmp(AV65Err_att, "") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV65Err_att, 1, "DEVGENDOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenDom_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1OU31( )
   {
      pr_default.close(9);
      pr_default.close(11);
      pr_default.close(12);
      pr_default.close(13);
   }

   public void enableDisable( )
   {
   }

   public void gxload_60( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T01OU12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A60AlbRUniUti = T01OU12_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01OU12_A54AlbRPieUti[0] ;
      A47AlbREst = T01OU12_A47AlbREst[0] ;
      A252CliCod = T01OU12_A252CliCod[0] ;
      n252CliCod = T01OU12_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A45AlbRef = T01OU12_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A56AlbRUni = T01OU12_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A52AlbRPieEnt = T01OU12_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01OU12_A58AlbRUniEnt[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_61( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01OU19 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01OU19_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(15) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(15);
   }

   public void gxload_62( String A396EmprCod ,
                          short A327DevGenTrn )
   {
      /* Using cursor T01OU20 */
      pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = dynDevGenTrn.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A329DevTrnNom = T01OU20_A329DevTrnNom[0] ;
      n329DevTrnNom = T01OU20_n329DevTrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A329DevTrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void gxload_63( String A396EmprCod ,
                          int A323DevGenCod )
   {
      /* Using cursor T01OU22 */
      pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         A3066AlbDevPUni = T01OU22_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01OU22_A5278AlbDevPPie[0] ;
      }
      else
      {
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(17) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(17);
   }

   public void getKey1OU31( )
   {
      /* Using cursor T01OU23 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(18);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OU9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01OU9_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OU31( 58) ;
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01OU9_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         A328DevGenUni = T01OU9_A328DevGenUni[0] ;
         n328DevGenUni = T01OU9_n328DevGenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A326DevGenPie = T01OU9_A326DevGenPie[0] ;
         n326DevGenPie = T01OU9_n326DevGenPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A325DevGenFec = T01OU9_A325DevGenFec[0] ;
         n325DevGenFec = T01OU9_n325DevGenFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         A6288DevGenDom = T01OU9_A6288DevGenDom[0] ;
         n6288DevGenDom = T01OU9_n6288DevGenDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         A324DevGenEst = T01OU9_A324DevGenEst[0] ;
         n324DevGenEst = T01OU9_n324DevGenEst[0] ;
         A1304DevUlin = T01OU9_A1304DevUlin[0] ;
         n1304DevUlin = T01OU9_n1304DevUlin[0] ;
         A44AlbRecCod = T01OU9_A44AlbRecCod[0] ;
         n44AlbRecCod = T01OU9_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A327DevGenTrn = T01OU9_A327DevGenTrn[0] ;
         n327DevGenTrn = T01OU9_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         O1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         O328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         O326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         O325DevGenFec = A325DevGenFec ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1OU31( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey1OU31( ) ;
         }
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey1OU31( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(7);
   }

   public void getEqualNoModal( )
   {
      getKey1OU31( ) ;
      if ( RcdFound31 == 0 )
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
      RcdFound31 = (short)(0) ;
      /* Using cursor T01OU24 */
      pr_default.execute(19, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      if ( (pr_default.getStatus(19) != 101) )
      {
         while ( (pr_default.getStatus(19) != 101) && ( ( T01OU24_A323DevGenCod[0] < A323DevGenCod ) ) && ( GXutil.strcmp(T01OU24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(19);
         }
         if ( (pr_default.getStatus(19) != 101) && ( ( T01OU24_A323DevGenCod[0] > A323DevGenCod ) ) && ( GXutil.strcmp(T01OU24_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A323DevGenCod = T01OU24_A323DevGenCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(19);
   }

   public void move_previous( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T01OU25 */
      pr_default.execute(20, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      if ( (pr_default.getStatus(20) != 101) )
      {
         while ( (pr_default.getStatus(20) != 101) && ( ( T01OU25_A323DevGenCod[0] > A323DevGenCod ) ) && ( GXutil.strcmp(T01OU25_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(20);
         }
         if ( (pr_default.getStatus(20) != 101) && ( ( T01OU25_A323DevGenCod[0] < A323DevGenCod ) ) && ( GXutil.strcmp(T01OU25_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A323DevGenCod = T01OU25_A323DevGenCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(20);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OU31( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A326DevGenPie = O326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = O328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A3066AlbDevPUni = O3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = O5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         AV14KilAnt = OV14KilAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         AV15MetAnt = OV15MetAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         AV16PieAnt = OV16PieAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         AV17Kilos = OV17Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         AV18Metros = OV18Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         AV19Piezas = OV19Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         AV9AlbRPieDis = OV9AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         AV10AlbRUniDis = OV10AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         A47AlbREst = O47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A1304DevUlin = O1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1OU31( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound31 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
            {
               A323DevGenCod = Z323DevGenCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEVGENCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A3066AlbDevPUni = O3066AlbDevPUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               AV14KilAnt = OV14KilAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
               AV15MetAnt = OV15MetAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
               AV16PieAnt = OV16PieAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
               AV17Kilos = OV17Kilos ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
               AV18Metros = OV18Metros ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
               AV19Piezas = OV19Piezas ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
               AV9AlbRPieDis = OV9AlbRPieDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
               AV10AlbRUniDis = OV10AlbRUniDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A3066AlbDevPUni = O3066AlbDevPUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               AV14KilAnt = OV14KilAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
               AV15MetAnt = OV15MetAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
               AV16PieAnt = OV16PieAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
               AV17Kilos = OV17Kilos ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
               AV18Metros = OV18Metros ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
               AV19Piezas = OV19Piezas ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
               AV9AlbRPieDis = OV9AlbRPieDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
               AV10AlbRUniDis = OV10AlbRUniDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               update1OU31( ) ;
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A3066AlbDevPUni = O3066AlbDevPUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               AV14KilAnt = OV14KilAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
               AV15MetAnt = OV15MetAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
               AV16PieAnt = OV16PieAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
               AV17Kilos = OV17Kilos ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
               AV18Metros = OV18Metros ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
               AV19Piezas = OV19Piezas ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
               AV9AlbRPieDis = OV9AlbRPieDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
               AV10AlbRUniDis = OV10AlbRUniDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1OU31( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEVGENCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevGenCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  A326DevGenPie = O326DevGenPie ;
                  n326DevGenPie = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                  A328DevGenUni = O328DevGenUni ;
                  n328DevGenUni = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                  A54AlbRPieUti = O54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  A60AlbRUniUti = O60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  A3066AlbDevPUni = O3066AlbDevPUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                  A5278AlbDevPPie = O5278AlbDevPPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                  AV14KilAnt = OV14KilAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                  AV15MetAnt = OV15MetAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                  AV16PieAnt = OV16PieAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                  AV17Kilos = OV17Kilos ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                  AV18Metros = OV18Metros ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                  AV19Piezas = OV19Piezas ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                  AV9AlbRPieDis = OV9AlbRPieDis ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                  AV10AlbRUniDis = OV10AlbRUniDis ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                  A47AlbREst = O47AlbREst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
                  A1304DevUlin = O1304DevUlin ;
                  n1304DevUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                  GX_FocusControl = edtDevGenCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1OU31( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A323DevGenCod != Z323DevGenCod ) )
      {
         A323DevGenCod = Z323DevGenCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEVGENCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A326DevGenPie = O326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A328DevGenUni = O328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A54AlbRPieUti = O54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = O60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A3066AlbDevPUni = O3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = O5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         AV14KilAnt = OV14KilAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         AV15MetAnt = OV15MetAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         AV16PieAnt = OV16PieAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         AV17Kilos = OV17Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         AV18Metros = OV18Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         AV19Piezas = OV19Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         AV9AlbRPieDis = OV9AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         AV10AlbRUniDis = OV10AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         A47AlbREst = O47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         A1304DevUlin = O1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDevGenCod_Internalname ;
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
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "DEVGENCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtDevGenFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart1OU31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevGenFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OU31( ) ;
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
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevGenFec_Internalname ;
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
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevGenFec_Internalname ;
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
      scanStart1OU31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound31 != 0 )
         {
            scanNext1OU31( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtDevGenFec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1OU31( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1OU31( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OU8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(6) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(6) == 101) || ( DecimalUtil.compareTo(Z328DevGenUni, T01OU8_A328DevGenUni[0]) != 0 ) || ( Z326DevGenPie != T01OU8_A326DevGenPie[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(T01OU8_A325DevGenFec[0])) ) || ( Z6288DevGenDom != T01OU8_A6288DevGenDom[0] ) || ( Z324DevGenEst != T01OU8_A324DevGenEst[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z1304DevUlin != T01OU8_A1304DevUlin[0] ) || ( Z44AlbRecCod != T01OU8_A44AlbRecCod[0] ) || ( Z327DevGenTrn != T01OU8_A327DevGenTrn[0] ) )
         {
            if ( DecimalUtil.compareTo(Z328DevGenUni, T01OU8_A328DevGenUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevGenUni");
               GXutil.writeLogRaw("Old: ",Z328DevGenUni);
               GXutil.writeLogRaw("Current: ",T01OU8_A328DevGenUni[0]);
            }
            if ( Z326DevGenPie != T01OU8_A326DevGenPie[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevGenPie");
               GXutil.writeLogRaw("Old: ",Z326DevGenPie);
               GXutil.writeLogRaw("Current: ",T01OU8_A326DevGenPie[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(T01OU8_A325DevGenFec[0])) ) )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevGenFec");
               GXutil.writeLogRaw("Old: ",Z325DevGenFec);
               GXutil.writeLogRaw("Current: ",T01OU8_A325DevGenFec[0]);
            }
            if ( Z6288DevGenDom != T01OU8_A6288DevGenDom[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevGenDom");
               GXutil.writeLogRaw("Old: ",Z6288DevGenDom);
               GXutil.writeLogRaw("Current: ",T01OU8_A6288DevGenDom[0]);
            }
            if ( Z324DevGenEst != T01OU8_A324DevGenEst[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevGenEst");
               GXutil.writeLogRaw("Old: ",Z324DevGenEst);
               GXutil.writeLogRaw("Current: ",T01OU8_A324DevGenEst[0]);
            }
            if ( Z1304DevUlin != T01OU8_A1304DevUlin[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevUlin");
               GXutil.writeLogRaw("Old: ",Z1304DevUlin);
               GXutil.writeLogRaw("Current: ",T01OU8_A1304DevUlin[0]);
            }
            if ( Z44AlbRecCod != T01OU8_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T01OU8_A44AlbRecCod[0]);
            }
            if ( Z327DevGenTrn != T01OU8_A327DevGenTrn[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevGenTrn");
               GXutil.writeLogRaw("Old: ",Z327DevGenTrn);
               GXutil.writeLogRaw("Current: ",T01OU8_A327DevGenTrn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01OU26 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(21) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( DecimalUtil.compareTo(Z60AlbRUniUti, T01OU26_A60AlbRUniUti[0]) != 0 ) || ( Z47AlbREst != T01OU26_A47AlbREst[0] ) || ( Z252CliCod != T01OU26_A252CliCod[0] ) || ( GXutil.strcmp(Z45AlbRef, T01OU26_A45AlbRef[0]) != 0 ) || ( GXutil.strcmp(Z56AlbRUni, T01OU26_A56AlbRUni[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z52AlbRPieEnt != T01OU26_A52AlbRPieEnt[0] ) || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01OU26_A58AlbRUniEnt[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z60AlbRUniUti, T01OU26_A60AlbRUniUti[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbRUniUti");
               GXutil.writeLogRaw("Old: ",Z60AlbRUniUti);
               GXutil.writeLogRaw("Current: ",T01OU26_A60AlbRUniUti[0]);
            }
            if ( Z47AlbREst != T01OU26_A47AlbREst[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T01OU26_A47AlbREst[0]);
            }
            if ( Z252CliCod != T01OU26_A252CliCod[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01OU26_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T01OU26_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T01OU26_A45AlbRef[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T01OU26_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T01OU26_A56AlbRUni[0]);
            }
            if ( Z52AlbRPieEnt != T01OU26_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T01OU26_A52AlbRPieEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T01OU26_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T01OU26_A58AlbRUniEnt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OU31( )
   {
      beforeValidate1OU31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU31( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OU31( 0) ;
         checkOptimisticConcurrency1OU31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU31( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OU31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OU27 */
                  pr_default.execute(22, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A323DevGenCod), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(22) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11OU31( ) ;
                     /* Start of After( Insert) rules */
                     if ( ! (0==A323DevGenCod) && true /* After */ && true /* Level */ )
                     {
                        httpContext.wjLoc = formatLink("app.webwdevpza", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(A328DevGenUni)),GXutil.URLEncode(GXutil.ltrimstr(A326DevGenPie,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A60AlbRUniUti)),GXutil.URLEncode(GXutil.ltrimstr(A54AlbRPieUti,6,0))}, new String[] {"EmprCod","ALbRecCod","DevGenCod","DevGenUni","DevGenPie","AlbRUniUti","AlbRPieUti"})  ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OU31( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1OU0( ) ;
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
            load1OU31( ) ;
         }
         endLevel1OU31( ) ;
      }
      closeExtendedTableCursors1OU31( ) ;
   }

   public void update1OU31( )
   {
      beforeValidate1OU31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU31( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU31( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OU31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OU28 */
                  pr_default.execute(23, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn), A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(23) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1OU31( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN11OU31( ) ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OU31( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption1OU0( ) ;
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
         endLevel1OU31( ) ;
      }
      closeExtendedTableCursors1OU31( ) ;
   }

   public void deferredUpdate1OU31( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OU31( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU31( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OU31( ) ;
         afterConfirm1OU31( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OU31( ) ;
            if ( AnyError == 0 )
            {
               A326DevGenPie = O326DevGenPie ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
               A328DevGenUni = O328DevGenUni ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
               A54AlbRPieUti = O54AlbRPieUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
               A60AlbRUniUti = O60AlbRUniUti ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
               A3066AlbDevPUni = O3066AlbDevPUni ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               AV14KilAnt = OV14KilAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
               AV15MetAnt = OV15MetAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
               AV16PieAnt = OV16PieAnt ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
               AV17Kilos = OV17Kilos ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
               AV18Metros = OV18Metros ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
               AV19Piezas = OV19Piezas ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
               AV9AlbRPieDis = OV9AlbRPieDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
               AV10AlbRUniDis = OV10AlbRUniDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
               A47AlbREst = O47AlbREst ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               scanStart1OU451( ) ;
               while ( RcdFound451 != 0 )
               {
                  getByPrimaryKey1OU451( ) ;
                  delete1OU451( ) ;
                  scanNext1OU451( ) ;
                  O326DevGenPie = A326DevGenPie ;
                  n326DevGenPie = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
                  O328DevGenUni = A328DevGenUni ;
                  n328DevGenUni = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
                  O54AlbRPieUti = A54AlbRPieUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
                  O60AlbRUniUti = A60AlbRUniUti ;
                  httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
                  O3066AlbDevPUni = A3066AlbDevPUni ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
                  O5278AlbDevPPie = A5278AlbDevPPie ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
                  OV14KilAnt = AV14KilAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
                  OV15MetAnt = AV15MetAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
                  OV16PieAnt = AV16PieAnt ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
                  OV17Kilos = AV17Kilos ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
                  OV18Metros = AV18Metros ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
                  OV19Piezas = AV19Piezas ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
                  OV9AlbRPieDis = AV9AlbRPieDis ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
                  OV10AlbRUniDis = AV10AlbRUniDis ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
                  O47AlbREst = A47AlbREst ;
                  httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
               }
               scanEnd1OU451( ) ;
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               scanStart1OU192( ) ;
               while ( RcdFound192 != 0 )
               {
                  getByPrimaryKey1OU192( ) ;
                  delete1OU192( ) ;
                  scanNext1OU192( ) ;
                  O1304DevUlin = A1304DevUlin ;
                  n1304DevUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               }
               scanEnd1OU192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OU29 */
                  pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( AnyError == 0 )
                  {
                     updateTablesN11OU31( ) ;
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound31 == 0 )
                        {
                           initAll1OU31( ) ;
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
                        resetCaption1OU0( ) ;
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
      sMode31 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OU31( ) ;
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OU31( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01OU31 */
         pr_default.execute(25, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            A3066AlbDevPUni = T01OU31_A3066AlbDevPUni[0] ;
            A5278AlbDevPPie = T01OU31_A5278AlbDevPPie[0] ;
         }
         else
         {
            A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            A5278AlbDevPPie = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         pr_default.close(25);
         AV61oldDevGenFec = O325DevGenFec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61oldDevGenFec", localUtil.format(AV61oldDevGenFec, "99/99/99"));
         /* Using cursor T01OU32 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         Z60AlbRUniUti = T01OU32_A60AlbRUniUti[0] ;
         Z47AlbREst = T01OU32_A47AlbREst[0] ;
         Z252CliCod = T01OU32_A252CliCod[0] ;
         Z45AlbRef = T01OU32_A45AlbRef[0] ;
         Z56AlbRUni = T01OU32_A56AlbRUni[0] ;
         Z52AlbRPieEnt = T01OU32_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T01OU32_A58AlbRUniEnt[0] ;
         A60AlbRUniUti = T01OU32_A60AlbRUniUti[0] ;
         A54AlbRPieUti = T01OU32_A54AlbRPieUti[0] ;
         A47AlbREst = T01OU32_A47AlbREst[0] ;
         A252CliCod = T01OU32_A252CliCod[0] ;
         n252CliCod = T01OU32_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A45AlbRef = T01OU32_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A56AlbRUni = T01OU32_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A52AlbRPieEnt = T01OU32_A52AlbRPieEnt[0] ;
         A58AlbRUniEnt = T01OU32_A58AlbRUniEnt[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         pr_default.close(26);
         /* Using cursor T01OU33 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T01OU33_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(27);
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
         {
            A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
         }
         else
         {
            if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
            else
            {
               A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            }
         }
         /* Using cursor T01OU34 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = T01OU34_A329DevTrnNom[0] ;
         n329DevTrnNom = T01OU34_n329DevTrnNom[0] ;
         pr_default.close(28);
         if ( isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
               httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            }
         }
         A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
         if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
         {
            A47AlbREst = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         else
         {
            if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
            {
               A47AlbREst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
            }
         }
      }
   }

   public void processNestedLevel1OU451( )
   {
      s326DevGenPie = O326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      s328DevGenUni = O328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      s54AlbRPieUti = O54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      s60AlbRUniUti = O60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      s3066AlbDevPUni = O3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      s5278AlbDevPPie = O5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      sV14KilAnt = OV14KilAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      sV15MetAnt = OV15MetAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      sV16PieAnt = OV16PieAnt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      sV17Kilos = OV17Kilos ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      sV18Metros = OV18Metros ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      sV19Piezas = OV19Piezas ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      sV9AlbRPieDis = OV9AlbRPieDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      sV10AlbRUniDis = OV10AlbRUniDis ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      s47AlbREst = O47AlbREst ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      nGXsfl_94_idx = 0 ;
      while ( nGXsfl_94_idx < nRC_GXsfl_94 )
      {
         readRow1OU451( ) ;
         if ( ( nRcdExists_451 != 0 ) || ( nIsMod_451 != 0 ) )
         {
            standaloneNotModal1OU451( ) ;
            getKey1OU451( ) ;
            if ( ( nRcdExists_451 == 0 ) && ( nRcdDeleted_451 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OU451( ) ;
            }
            else
            {
               if ( RcdFound451 != 0 )
               {
                  if ( ( nRcdDeleted_451 != 0 ) && ( nRcdExists_451 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OU451( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_451 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OU451( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_451 == 0 )
                  {
                     GXCCtl = "ALBRECPIE_" + sGXsfl_94_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbRecPie_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O326DevGenPie = A326DevGenPie ;
            n326DevGenPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
            O328DevGenUni = A328DevGenUni ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            O54AlbRPieUti = A54AlbRPieUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            O60AlbRUniUti = A60AlbRUniUti ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            O3066AlbDevPUni = A3066AlbDevPUni ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            O5278AlbDevPPie = A5278AlbDevPPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
            OV14KilAnt = AV14KilAnt ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
            OV15MetAnt = AV15MetAnt ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
            OV16PieAnt = AV16PieAnt ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
            OV17Kilos = AV17Kilos ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
            OV18Metros = AV18Metros ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
            OV19Piezas = AV19Piezas ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
            OV9AlbRPieDis = AV9AlbRPieDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
            OV10AlbRUniDis = AV10AlbRUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
            O47AlbREst = A47AlbREst ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
         httpContext.changePostValue( edtAlbRecPie_Internalname, GXutil.rtrim( A2159AlbRecPie)) ;
         httpContext.changePostValue( edtAlbRecKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecKgmU_Internalname, GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbRecMtrU_Internalname, GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevPieUni_Internalname, GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_94_idx, GXutil.rtrim( Z2159AlbRecPie)) ;
         httpContext.changePostValue( "ZT_"+"Z3067DevPieUni_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( Z3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_94_idx, GXutil.rtrim( Z4795AlRPieCal)) ;
         httpContext.changePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T3067DevPieUni_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( O3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2156AlbRecKgmU_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( O2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "T2158AlbRecMtrU_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( O2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_451_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_451_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_451_"+sGXsfl_94_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_451 != 0 )
         {
            httpContext.changePostValue( "ALBRECPIE_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGM_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTR_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECKGMU_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBRECMTRU_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVPIEUNI_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevPieUni_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      if ( ( DecimalUtil.compareTo(A328DevGenUni, A3066AlbDevPUni) != 0 ) && ( A3066AlbDevPUni.doubleValue() != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma las unidades", ""), 0, "");
      }
      if ( ( A326DevGenPie != A5278AlbDevPPie ) && ( A5278AlbDevPPie != 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No suma la cantidad de piezas", ""), 0, "");
      }
      /* End of After( level) rules */
      initAll1OU451( ) ;
      if ( AnyError != 0 )
      {
         O326DevGenPie = s326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         O328DevGenUni = s328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O3066AlbDevPUni = s3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         O5278AlbDevPPie = s5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         OV14KilAnt = sV14KilAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         OV15MetAnt = sV15MetAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         OV16PieAnt = sV16PieAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         OV17Kilos = sV17Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         OV18Metros = sV18Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         OV19Piezas = sV19Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         OV9AlbRPieDis = sV9AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         OV10AlbRUniDis = sV10AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         O47AlbREst = s47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      nRcdExists_451 = (short)(0) ;
      nIsMod_451 = (short)(0) ;
      nRcdDeleted_451 = (short)(0) ;
   }

   public void processNestedLevel1OU192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      nGXsfl_112_idx = 0 ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         readRow1OU192( ) ;
         if ( ( nRcdExists_192 != 0 ) || ( nIsMod_192 != 0 ) )
         {
            standaloneNotModal1OU192( ) ;
            getKey1OU192( ) ;
            if ( ( nRcdExists_192 == 0 ) && ( nRcdDeleted_192 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OU192( ) ;
            }
            else
            {
               if ( RcdFound192 != 0 )
               {
                  if ( ( nRcdDeleted_192 != 0 ) && ( nRcdExists_192 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OU192( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_192 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OU192( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_192 == 0 )
                  {
                     GXCCtl = "DEVLIN_" + sGXsfl_112_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O1304DevUlin = A1304DevUlin ;
            n1304DevUlin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         }
         httpContext.changePostValue( edtDevLin_Internalname, GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDevObs_Internalname, GXutil.rtrim( A1303DevObs)) ;
         httpContext.changePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_112_idx, GXutil.rtrim( Z1303DevObs)) ;
         httpContext.changePostValue( "nRcdDeleted_192_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_192_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_192_"+sGXsfl_112_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_192 != 0 )
         {
            httpContext.changePostValue( "DEVLIN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVOBS_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OU192( ) ;
      if ( AnyError != 0 )
      {
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      }
      nRcdExists_192 = (short)(0) ;
      nIsMod_192 = (short)(0) ;
      nRcdDeleted_192 = (short)(0) ;
   }

   public void processLevel1OU31( )
   {
      /* Save parent mode. */
      sMode31 = Gx_mode ;
      processNestedLevel1OU451( ) ;
      processNestedLevel1OU192( ) ;
      if ( AnyError != 0 )
      {
         O326DevGenPie = s326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         O328DevGenUni = s328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         O54AlbRPieUti = s54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = s60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         O3066AlbDevPUni = s3066AlbDevPUni ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         O5278AlbDevPPie = s5278AlbDevPPie ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         OV14KilAnt = sV14KilAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         OV15MetAnt = sV15MetAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         OV16PieAnt = sV16PieAnt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
         OV17Kilos = sV17Kilos ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         OV18Metros = sV18Metros ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         OV19Piezas = sV19Piezas ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
         OV9AlbRPieDis = sV9AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         OV10AlbRUniDis = sV10AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         O47AlbREst = s47AlbREst ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01OU35 */
      pr_default.execute(29, new Object[] {Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n328DevGenUni), A328DevGenUni, A396EmprCod, Integer.valueOf(A323DevGenCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
      /* Using cursor T01OU36 */
      pr_default.execute(30, new Object[] {A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void updateTablesN11OU31( )
   {
      /* Using cursor T01OU37 */
      pr_default.execute(31, new Object[] {Integer.valueOf(A54AlbRPieUti), Byte.valueOf(A47AlbREst), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel1OU31( )
   {
      pr_default.close(6);
      pr_default.close(21);
      if ( AnyError == 0 )
      {
         beforeComplete1OU31( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdevpiecopy1");
         if ( AnyError == 0 )
         {
            confirmValues1OU0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevpiecopy1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OU31( )
   {
      /* Scan By routine */
      /* Using cursor T01OU38 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01OU38_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OU31( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T01OU38_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
   }

   public void scanEnd1OU31( )
   {
      pr_default.close(32);
   }

   public void afterConfirm1OU31( )
   {
      /* After Confirm Rules */
      if ( (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         GXv_int8[0] = A323DevGenCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         tdevpiecopy1_impl.this.A323DevGenCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
   }

   public void beforeInsert1OU31( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OU31( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OU31( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OU31( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OU31( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OU31( )
   {
      edtDevGenCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      edtDevGenFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenFec_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtDevGenDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenDom_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      dynDevGenTrn.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Enabled", GXutil.ltrimstr( dynDevGenTrn.getEnabled(), 5, 0), true);
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
   }

   public void zm1OU451( int GX_JID )
   {
      if ( ( GX_JID == 64 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3067DevPieUni = T01OU5_A3067DevPieUni[0] ;
         }
         else
         {
            Z3067DevPieUni = A3067DevPieUni ;
         }
      }
      if ( ( GX_JID == 65 ) || ( GX_JID == 0 ) )
      {
         Z4795AlRPieCal = T01OU7_A4795AlRPieCal[0] ;
         Z2155AlbRecKgm = T01OU7_A2155AlbRecKgm[0] ;
         Z2157AlbRecMtr = T01OU7_A2157AlbRecMtr[0] ;
      }
      if ( GX_JID == -64 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z3067DevPieUni = A3067DevPieUni ;
         Z396EmprCod = A396EmprCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         Z4795AlRPieCal = A4795AlRPieCal ;
         Z2158AlbRecMtrU = A2158AlbRecMtrU ;
         Z2156AlbRecKgmU = A2156AlbRecKgmU ;
         Z2155AlbRecKgm = A2155AlbRecKgm ;
         Z2157AlbRecMtr = A2157AlbRecMtr ;
         Z44AlbRecCod = A44AlbRecCod ;
      }
   }

   public void standaloneNotModal1OU451( )
   {
      edtAlbRecMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtAlbRecKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
         }
      }
   }

   public void standaloneModal1OU451( )
   {
      if ( true /* Level */ && isIns( )  )
      {
         A326DevGenPie = (short)(O326DevGenPie+1) ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      }
      else
      {
         if ( true /* Level */ && isDlt( )  )
         {
            A326DevGenPie = (short)(O326DevGenPie-1) ;
            n326DevGenPie = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         }
      }
      if ( isIns( )  || isUpd( )  || isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      }
      AV16PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV19Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      if ( true )
      {
         AV9AlbRPieDis = A51AlbRPieDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV9AlbRPieDis = AV11AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         }
      }
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 0, "");
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbRecPie_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      }
      else
      {
         edtAlbRecPie_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      }
   }

   public void load1OU451( )
   {
      /* Using cursor T01OU39 */
      pr_default.execute(33, new Object[] {Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Integer.valueOf(A323DevGenCod), A396EmprCod, A2159AlbRecPie});
      if ( (pr_default.getStatus(33) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A4795AlRPieCal = T01OU39_A4795AlRPieCal[0] ;
         A3067DevPieUni = T01OU39_A3067DevPieUni[0] ;
         A2158AlbRecMtrU = T01OU39_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T01OU39_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = T01OU39_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = T01OU39_A2157AlbRecMtr[0] ;
         zm1OU451( -64) ;
      }
      pr_default.close(33);
      onLoadActions1OU451( ) ;
   }

   public void onLoadActions1OU451( )
   {
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) >= 0 ) )
      {
         A3067DevPieUni = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      }
      else
      {
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) >= 0 ) )
         {
            A3067DevPieUni = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         }
      }
      if ( isIns( )  )
      {
         A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            A5278AlbDevPPie = O5278AlbDevPPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            }
         }
      }
      if ( isDlt( )  )
      {
         A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
      }
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
      {
         A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
               {
                  A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrimstr( AV63oldUni, 9, 2));
      }
   }

   public void checkExtendedTable1OU451( )
   {
      nIsDirty_451 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1OU451( ) ;
      /* Using cursor T01OU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_94_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBDET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4795AlRPieCal = T01OU7_A4795AlRPieCal[0] ;
      A2158AlbRecMtrU = T01OU7_A2158AlbRecMtrU[0] ;
      A2156AlbRecKgmU = T01OU7_A2156AlbRecKgmU[0] ;
      A2155AlbRecKgm = T01OU7_A2155AlbRecKgm[0] ;
      A2157AlbRecMtr = T01OU7_A2157AlbRecMtr[0] ;
      nIsDirty_451 = (short)(1) ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      nIsDirty_451 = (short)(1) ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      pr_default.close(5);
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) >= 0 ) )
      {
         nIsDirty_451 = (short)(1) ;
         A3067DevPieUni = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      }
      else
      {
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) >= 0 ) )
         {
            nIsDirty_451 = (short)(1) ;
            A3067DevPieUni = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A5278AlbDevPPie = O5278AlbDevPPie ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_451 = (short)(1) ;
               A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
            }
         }
      }
      if ( isIns( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      }
      else
      {
         if ( isUpd( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         }
         else
         {
            if ( isDlt( )  )
            {
               nIsDirty_451 = (short)(1) ;
               A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            }
         }
      }
      if ( isDlt( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      if ( isDlt( )  )
      {
         nIsDirty_451 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_451 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
      {
         nIsDirty_451 = (short)(1) ;
         A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
         {
            nIsDirty_451 = (short)(1) ;
            A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
            {
               nIsDirty_451 = (short)(1) ;
               A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
               {
                  nIsDirty_451 = (short)(1) ;
                  A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de kilos no suficientes", ""), 0, "");
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         nIsDirty_451 = (short)(1) ;
         A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            nIsDirty_451 = (short)(1) ;
            A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               nIsDirty_451 = (short)(1) ;
               A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  nIsDirty_451 = (short)(1) ;
                  A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de metros no suficientes", ""), 0, "");
      }
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrimstr( AV63oldUni, 9, 2));
      }
   }

   public void closeExtendedTableCursors1OU451( )
   {
      pr_default.close(4);
   }

   public void enableDisable1OU451( )
   {
   }

   public void gxload_65( String A396EmprCod ,
                          int A44AlbRecCod ,
                          String A2159AlbRecPie )
   {
      /* Using cursor T01OU7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(5) == 101) )
      {
         GXCCtl = "ALBRECPIE_" + sGXsfl_94_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBDET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4795AlRPieCal = T01OU7_A4795AlRPieCal[0] ;
      A2158AlbRecMtrU = T01OU7_A2158AlbRecMtrU[0] ;
      A2156AlbRecKgmU = T01OU7_A2156AlbRecKgmU[0] ;
      A2155AlbRecKgm = T01OU7_A2155AlbRecKgm[0] ;
      A2157AlbRecMtr = T01OU7_A2157AlbRecMtr[0] ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4795AlRPieCal))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1OU451( )
   {
      /* Using cursor T01OU40 */
      pr_default.execute(34, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(34) != 101) )
      {
         RcdFound451 = (short)(1) ;
      }
      else
      {
         RcdFound451 = (short)(0) ;
      }
      pr_default.close(34);
   }

   public void getByPrimaryKey1OU451( )
   {
      /* Using cursor T01OU5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01OU5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OU451( 64) ;
         RcdFound451 = (short)(1) ;
         initializeNonKey1OU451( ) ;
         A3067DevPieUni = T01OU5_A3067DevPieUni[0] ;
         A2159AlbRecPie = T01OU5_A2159AlbRecPie[0] ;
         O3067DevPieUni = A3067DevPieUni ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z2159AlbRecPie = A2159AlbRecPie ;
         sMode451 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OU451( ) ;
         load1OU451( ) ;
         Gx_mode = sMode451 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound451 = (short)(0) ;
         initializeNonKey1OU451( ) ;
         sMode451 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OU451( ) ;
         Gx_mode = sMode451 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OU451( ) ;
      }
      pr_default.close(3);
   }

   public void checkOptimisticConcurrency1OU451( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OU4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDevPie"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( DecimalUtil.compareTo(Z3067DevPieUni, T01OU4_A3067DevPieUni[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z3067DevPieUni, T01OU4_A3067DevPieUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevPieUni");
               GXutil.writeLogRaw("Old: ",Z3067DevPieUni);
               GXutil.writeLogRaw("Current: ",T01OU4_A3067DevPieUni[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDevPie"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T01OU41 */
      pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      if ( (pr_default.getStatus(35) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBDET"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         if ( false || ( GXutil.strcmp(Z4795AlRPieCal, T01OU41_A4795AlRPieCal[0]) != 0 ) || ( DecimalUtil.compareTo(Z2155AlbRecKgm, T01OU41_A2155AlbRecKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z2157AlbRecMtr, T01OU41_A2157AlbRecMtr[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4795AlRPieCal, T01OU41_A4795AlRPieCal[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlRPieCal");
               GXutil.writeLogRaw("Old: ",Z4795AlRPieCal);
               GXutil.writeLogRaw("Current: ",T01OU41_A4795AlRPieCal[0]);
            }
            if ( DecimalUtil.compareTo(Z2155AlbRecKgm, T01OU41_A2155AlbRecKgm[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbRecKgm");
               GXutil.writeLogRaw("Old: ",Z2155AlbRecKgm);
               GXutil.writeLogRaw("Current: ",T01OU41_A2155AlbRecKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z2157AlbRecMtr, T01OU41_A2157AlbRecMtr[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"AlbRecMtr");
               GXutil.writeLogRaw("Old: ",Z2157AlbRecMtr);
               GXutil.writeLogRaw("Current: ",T01OU41_A2157AlbRecMtr[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBDET"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OU451( )
   {
      beforeValidate1OU451( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU451( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OU451( 0) ;
         checkOptimisticConcurrency1OU451( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU451( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OU451( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OU42 */
                  pr_default.execute(36, new Object[] {Integer.valueOf(A323DevGenCod), A3067DevPieUni, A396EmprCod, A2159AlbRecPie});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
                  if ( (pr_default.getStatus(36) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN11OU451( ) ;
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
            load1OU451( ) ;
         }
         endLevel1OU451( ) ;
      }
      closeExtendedTableCursors1OU451( ) ;
   }

   public void update1OU451( )
   {
      beforeValidate1OU451( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU451( ) ;
      }
      if ( ( nIsMod_451 != 0 ) || ( nIsDirty_451 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OU451( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OU451( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OU451( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OU43 */
                     pr_default.execute(37, new Object[] {A3067DevPieUni, A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
                     if ( (pr_default.getStatus(37) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDevPie"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OU451( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           updateTablesN11OU451( ) ;
                           getByPrimaryKey1OU451( ) ;
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
            endLevel1OU451( ) ;
         }
      }
      closeExtendedTableCursors1OU451( ) ;
   }

   public void deferredUpdate1OU451( )
   {
   }

   public void delete1OU451( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OU451( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU451( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OU451( ) ;
         afterConfirm1OU451( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OU451( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OU44 */
               pr_default.execute(38, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), A2159AlbRecPie});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDevPie");
               if ( AnyError == 0 )
               {
                  updateTablesN11OU451( ) ;
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
      sMode451 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OU451( ) ;
      Gx_mode = sMode451 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OU451( )
   {
      standaloneModal1OU451( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01OU45 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
         Z4795AlRPieCal = T01OU45_A4795AlRPieCal[0] ;
         Z2155AlbRecKgm = T01OU45_A2155AlbRecKgm[0] ;
         Z2157AlbRecMtr = T01OU45_A2157AlbRecMtr[0] ;
         A4795AlRPieCal = T01OU45_A4795AlRPieCal[0] ;
         A2158AlbRecMtrU = T01OU45_A2158AlbRecMtrU[0] ;
         A2156AlbRecKgmU = T01OU45_A2156AlbRecKgmU[0] ;
         A2155AlbRecKgm = T01OU45_A2155AlbRecKgm[0] ;
         A2157AlbRecMtr = T01OU45_A2157AlbRecMtr[0] ;
         O2156AlbRecKgmU = A2156AlbRecKgmU ;
         O2158AlbRecMtrU = A2158AlbRecMtrU ;
         pr_default.close(39);
         if ( isIns( )  )
         {
            A5278AlbDevPPie = (short)(O5278AlbDevPPie+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
         }
         else
         {
            if ( isUpd( )  )
            {
               A5278AlbDevPPie = O5278AlbDevPPie ;
               httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A5278AlbDevPPie = (short)(O5278AlbDevPPie-1) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
               }
            }
         }
         if ( isIns( )  )
         {
            A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         }
         else
         {
            if ( isUpd( )  )
            {
               A3066AlbDevPUni = O3066AlbDevPUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
            }
            else
            {
               if ( isDlt( )  )
               {
                  A3066AlbDevPUni = O3066AlbDevPUni.subtract(O3067DevPieUni) ;
                  httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
               }
            }
         }
         if ( isDlt( )  )
         {
            A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            }
         }
         if ( true )
         {
            AV14KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
            {
               AV14KilAnt = O328DevGenUni ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
            }
         }
         if ( true )
         {
            AV15MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
         }
         else
         {
            if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
            {
               AV15MetAnt = O328DevGenUni ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
            }
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV17Kilos = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
         }
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV18Metros = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
         }
         if ( true )
         {
            AV10AlbRUniDis = A57AlbRUniDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         }
         else
         {
            if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
            {
               AV10AlbRUniDis = AV12AlbRUDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
            }
         }
         if ( isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
         }
         if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
            }
            else
            {
               if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
               {
                  A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
                  {
                     A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
                  }
               }
            }
         }
         if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
            }
            else
            {
               if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
               }
               else
               {
                  if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
                  {
                     A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
                  }
               }
            }
         }
         if ( true /* Level */ )
         {
            AV63oldUni = O3067DevPieUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrimstr( AV63oldUni, 9, 2));
         }
      }
   }

   public void updateTablesN11OU451( )
   {
      /* Using cursor T01OU46 */
      pr_default.execute(40, new Object[] {A2158AlbRecMtrU, A2156AlbRecKgmU, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBDET");
   }

   public void endLevel1OU451( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      pr_default.close(35);
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OU451( )
   {
      /* Scan By routine */
      /* Using cursor T01OU47 */
      pr_default.execute(41, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      RcdFound451 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A2159AlbRecPie = T01OU47_A2159AlbRecPie[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OU451( )
   {
      /* Scan next routine */
      pr_default.readNext(41);
      RcdFound451 = (short)(0) ;
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound451 = (short)(1) ;
         A2159AlbRecPie = T01OU47_A2159AlbRecPie[0] ;
      }
   }

   public void scanEnd1OU451( )
   {
      pr_default.close(41);
   }

   public void afterConfirm1OU451( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OU451( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OU451( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OU451( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OU451( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OU451( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OU451( )
   {
      edtAlbRecPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtAlbRecKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgm_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtAlbRecMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtr_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtAlbRecKgmU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtAlbRecMtrU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtDevPieUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevPieUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevPieUni_Enabled), 5, 0), !bGXsfl_94_Refreshing);
   }

   public void send_integrity_lvl_hashes1OU451( )
   {
   }

   public void zm1OU192( int GX_JID )
   {
      if ( ( GX_JID == 66 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1303DevObs = T01OU3_A1303DevObs[0] ;
         }
         else
         {
            Z1303DevObs = A1303DevObs ;
         }
      }
      if ( GX_JID == -66 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         Z1303DevObs = A1303DevObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1OU192( )
   {
   }

   public void standaloneModal1OU192( )
   {
      if ( isIns( )  )
      {
         A1304DevUlin = (byte)(O1304DevUlin+1) ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A1302DevLin = A1304DevUlin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDevLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      }
      else
      {
         edtDevLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      }
   }

   public void load1OU192( )
   {
      /* Using cursor T01OU48 */
      pr_default.execute(42, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1303DevObs = T01OU48_A1303DevObs[0] ;
         zm1OU192( -66) ;
      }
      pr_default.close(42);
      onLoadActions1OU192( ) ;
   }

   public void onLoadActions1OU192( )
   {
   }

   public void checkExtendedTable1OU192( )
   {
      nIsDirty_192 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1OU192( ) ;
   }

   public void closeExtendedTableCursors1OU192( )
   {
   }

   public void enableDisable1OU192( )
   {
   }

   public void getKey1OU192( )
   {
      /* Using cursor T01OU49 */
      pr_default.execute(43, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(43) != 101) )
      {
         RcdFound192 = (short)(1) ;
      }
      else
      {
         RcdFound192 = (short)(0) ;
      }
      pr_default.close(43);
   }

   public void getByPrimaryKey1OU192( )
   {
      /* Using cursor T01OU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01OU3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1OU192( 66) ;
         RcdFound192 = (short)(1) ;
         initializeNonKey1OU192( ) ;
         A1302DevLin = T01OU3_A1302DevLin[0] ;
         A1303DevObs = T01OU3_A1303DevObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OU192( ) ;
         load1OU192( ) ;
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound192 = (short)(0) ;
         initializeNonKey1OU192( ) ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OU192( ) ;
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OU192( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1OU192( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1303DevObs, T01OU2_A1303DevObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1303DevObs, T01OU2_A1303DevObs[0]) != 0 )
            {
               GXutil.writeLogln("tdevpiecopy1:[seudo value changed for attri]"+"DevObs");
               GXutil.writeLogRaw("Old: ",Z1303DevObs);
               GXutil.writeLogRaw("Current: ",T01OU2_A1303DevObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVOBS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OU192( )
   {
      beforeValidate1OU192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU192( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OU192( 0) ;
         checkOptimisticConcurrency1OU192( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OU192( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OU192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OU50 */
                  pr_default.execute(44, new Object[] {Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin), A1303DevObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                  if ( (pr_default.getStatus(44) == 1) )
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
            load1OU192( ) ;
         }
         endLevel1OU192( ) ;
      }
      closeExtendedTableCursors1OU192( ) ;
   }

   public void update1OU192( )
   {
      beforeValidate1OU192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OU192( ) ;
      }
      if ( ( nIsMod_192 != 0 ) || ( nIsDirty_192 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OU192( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OU192( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OU192( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OU51 */
                     pr_default.execute(45, new Object[] {A1303DevObs, A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                     if ( (pr_default.getStatus(45) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OU192( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1OU192( ) ;
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
            endLevel1OU192( ) ;
         }
      }
      closeExtendedTableCursors1OU192( ) ;
   }

   public void deferredUpdate1OU192( )
   {
   }

   public void delete1OU192( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OU192( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OU192( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OU192( ) ;
         afterConfirm1OU192( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OU192( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OU52 */
               pr_default.execute(46, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
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
      sMode192 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OU192( ) ;
      Gx_mode = sMode192 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OU192( )
   {
      standaloneModal1OU192( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1OU192( )
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

   public void scanStart1OU192( )
   {
      /* Scan By routine */
      /* Using cursor T01OU53 */
      pr_default.execute(47, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      RcdFound192 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = T01OU53_A1302DevLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OU192( )
   {
      /* Scan next routine */
      pr_default.readNext(47);
      RcdFound192 = (short)(0) ;
      if ( (pr_default.getStatus(47) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = T01OU53_A1302DevLin[0] ;
      }
   }

   public void scanEnd1OU192( )
   {
      pr_default.close(47);
   }

   public void afterConfirm1OU192( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OU192( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OU192( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OU192( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OU192( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OU192( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OU192( )
   {
      edtDevLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
      edtDevObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevObs_Enabled), 5, 0), !bGXsfl_112_Refreshing);
   }

   public void send_integrity_lvl_hashes1OU192( )
   {
   }

   public void send_integrity_lvl_hashes1OU31( )
   {
   }

   public void subsflControlProps_94451( )
   {
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_94_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_94_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_94_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_94_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_94_idx ;
      edtDevPieUni_Internalname = "DEVPIEUNI_"+sGXsfl_94_idx ;
   }

   public void subsflControlProps_fel_94451( )
   {
      edtAlbRecPie_Internalname = "ALBRECPIE_"+sGXsfl_94_fel_idx ;
      edtAlbRecKgm_Internalname = "ALBRECKGM_"+sGXsfl_94_fel_idx ;
      edtAlbRecMtr_Internalname = "ALBRECMTR_"+sGXsfl_94_fel_idx ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU_"+sGXsfl_94_fel_idx ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU_"+sGXsfl_94_fel_idx ;
      edtDevPieUni_Internalname = "DEVPIEUNI_"+sGXsfl_94_fel_idx ;
   }

   public void addRow1OU451( )
   {
      nGXsfl_94_idx = (int)(nGXsfl_94_idx+1) ;
      sGXsfl_94_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_94_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_94451( ) ;
      sendRow1OU451( ) ;
   }

   public void sendRow1OU451( )
   {
      Gridtdevpiecopy1_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtdevpiecopy1_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtdevpiecopy1_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtdevpiecopy1_level1item_Class, "") != 0 )
         {
            subGridtdevpiecopy1_level1item_Linesclass = subGridtdevpiecopy1_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtdevpiecopy1_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtdevpiecopy1_level1item_Backstyle = (byte)(0) ;
         subGridtdevpiecopy1_level1item_Backcolor = subGridtdevpiecopy1_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtdevpiecopy1_level1item_Class, "") != 0 )
         {
            subGridtdevpiecopy1_level1item_Linesclass = subGridtdevpiecopy1_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtdevpiecopy1_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtdevpiecopy1_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtdevpiecopy1_level1item_Class, "") != 0 )
         {
            subGridtdevpiecopy1_level1item_Linesclass = subGridtdevpiecopy1_level1item_Class+"Odd" ;
         }
         subGridtdevpiecopy1_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtdevpiecopy1_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtdevpiecopy1_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_94_idx) % (2))) == 0 )
         {
            subGridtdevpiecopy1_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdevpiecopy1_level1item_Class, "") != 0 )
            {
               subGridtdevpiecopy1_level1item_Linesclass = subGridtdevpiecopy1_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtdevpiecopy1_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdevpiecopy1_level1item_Class, "") != 0 )
            {
               subGridtdevpiecopy1_level1item_Linesclass = subGridtdevpiecopy1_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_451_" + sGXsfl_94_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_94_idx + "',94)\"" ;
      ROClassString = "Attribute" ;
      Gridtdevpiecopy1_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecPie_Internalname,GXutil.rtrim( A2159AlbRecPie),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecPie_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(94),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdevpiecopy1_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgm_Enabled!=0) ? localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99") : localUtil.format( A2155AlbRecKgm, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(94),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdevpiecopy1_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtr_Enabled!=0) ? localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99") : localUtil.format( A2157AlbRecMtr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(94),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdevpiecopy1_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecKgmU_Internalname,GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecKgmU_Enabled!=0) ? localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99") : localUtil.format( A2156AlbRecKgmU, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecKgmU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecKgmU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(94),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridtdevpiecopy1_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecMtrU_Internalname,GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtAlbRecMtrU_Enabled!=0) ? localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99") : localUtil.format( A2158AlbRecMtrU, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecMtrU_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtAlbRecMtrU_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(94),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_451_" + sGXsfl_94_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_94_idx + "',94)\"" ;
      ROClassString = "Attribute" ;
      Gridtdevpiecopy1_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevPieUni_Internalname,GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtDevPieUni_Enabled!=0) ? localUtil.format( A3067DevPieUni, "ZZZZZ9.99") : localUtil.format( A3067DevPieUni, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevPieUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevPieUni_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(94),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridtdevpiecopy1_level1itemRow);
      send_integrity_lvl_hashes1OU451( ) ;
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2159AlbRecPie));
      GXCCtl = "Z3067DevPieUni_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4795AlRPieCal));
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2155AlbRecKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z2157AlbRecMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O3067DevPieUni_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O3067DevPieUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2156AlbRecKgmU_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "O2158AlbRecMtrU_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_451_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_451_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_451_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_451, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_94_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECPIE_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGM_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTR_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECKGMU_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECMTRU_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVPIEUNI_"+sGXsfl_94_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevPieUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtdevpiecopy1_level1itemContainer.AddRow(Gridtdevpiecopy1_level1itemRow);
   }

   public void readRow1OU451( )
   {
      nGXsfl_94_idx = (int)(nGXsfl_94_idx+1) ;
      sGXsfl_94_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_94_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_94451( ) ;
      edtAlbRecPie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECPIE_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGM_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTR_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecKgmU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECKGMU_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbRecMtrU_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBRECMTRU_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevPieUni_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVPIEUNI_"+sGXsfl_94_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A2159AlbRecPie = httpContext.cgiGet( edtAlbRecPie_Internalname) ;
      A2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgm_Internalname)) ;
      A2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtr_Internalname)) ;
      A2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( edtAlbRecKgmU_Internalname)) ;
      A2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( edtAlbRecMtrU_Internalname)) ;
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevPieUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevPieUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
      {
         GXCCtl = "DEVPIEUNI_" + sGXsfl_94_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevPieUni_Internalname ;
         wbErr = true ;
         A3067DevPieUni = DecimalUtil.ZERO ;
      }
      else
      {
         A3067DevPieUni = localUtil.ctond( httpContext.cgiGet( edtDevPieUni_Internalname)) ;
      }
      GXCCtl = "Z2159AlbRecPie_" + sGXsfl_94_idx ;
      Z2159AlbRecPie = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z3067DevPieUni_" + sGXsfl_94_idx ;
      Z3067DevPieUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_94_idx ;
      Z4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2155AlbRecKgm_" + sGXsfl_94_idx ;
      Z2155AlbRecKgm = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z2157AlbRecMtr_" + sGXsfl_94_idx ;
      Z2157AlbRecMtr = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z4795AlRPieCal_" + sGXsfl_94_idx ;
      A4795AlRPieCal = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O3067DevPieUni_" + sGXsfl_94_idx ;
      O3067DevPieUni = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2156AlbRecKgmU_" + sGXsfl_94_idx ;
      O2156AlbRecKgmU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "O2158AlbRecMtrU_" + sGXsfl_94_idx ;
      O2158AlbRecMtrU = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_451_" + sGXsfl_94_idx ;
      nRcdDeleted_451 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_451_" + sGXsfl_94_idx ;
      nRcdExists_451 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_451_" + sGXsfl_94_idx ;
      nIsMod_451 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void subsflControlProps_112192( )
   {
      edtDevLin_Internalname = "DEVLIN_"+sGXsfl_112_idx ;
      edtDevObs_Internalname = "DEVOBS_"+sGXsfl_112_idx ;
   }

   public void subsflControlProps_fel_112192( )
   {
      edtDevLin_Internalname = "DEVLIN_"+sGXsfl_112_fel_idx ;
      edtDevObs_Internalname = "DEVOBS_"+sGXsfl_112_fel_idx ;
   }

   public void addRow1OU192( )
   {
      nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_112192( ) ;
      sendRow1OU192( ) ;
   }

   public void sendRow1OU192( )
   {
      Gridtdevpiecopy1_level2itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtdevpiecopy1_level2item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtdevpiecopy1_level2item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtdevpiecopy1_level2item_Class, "") != 0 )
         {
            subGridtdevpiecopy1_level2item_Linesclass = subGridtdevpiecopy1_level2item_Class+"Odd" ;
         }
      }
      else if ( subGridtdevpiecopy1_level2item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtdevpiecopy1_level2item_Backstyle = (byte)(0) ;
         subGridtdevpiecopy1_level2item_Backcolor = subGridtdevpiecopy1_level2item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtdevpiecopy1_level2item_Class, "") != 0 )
         {
            subGridtdevpiecopy1_level2item_Linesclass = subGridtdevpiecopy1_level2item_Class+"Uniform" ;
         }
      }
      else if ( subGridtdevpiecopy1_level2item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtdevpiecopy1_level2item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtdevpiecopy1_level2item_Class, "") != 0 )
         {
            subGridtdevpiecopy1_level2item_Linesclass = subGridtdevpiecopy1_level2item_Class+"Odd" ;
         }
         subGridtdevpiecopy1_level2item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtdevpiecopy1_level2item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtdevpiecopy1_level2item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_112_idx) % (2))) == 0 )
         {
            subGridtdevpiecopy1_level2item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdevpiecopy1_level2item_Class, "") != 0 )
            {
               subGridtdevpiecopy1_level2item_Linesclass = subGridtdevpiecopy1_level2item_Class+"Even" ;
            }
         }
         else
         {
            subGridtdevpiecopy1_level2item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdevpiecopy1_level2item_Class, "") != 0 )
            {
               subGridtdevpiecopy1_level2item_Linesclass = subGridtdevpiecopy1_level2item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_192_" + sGXsfl_112_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 113,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Gridtdevpiecopy1_level2itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1302DevLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,113);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_192_" + sGXsfl_112_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_112_idx + "',112)\"" ;
      ROClassString = "Attribute" ;
      Gridtdevpiecopy1_level2itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevObs_Internalname,GXutil.rtrim( A1303DevObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(112),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtdevpiecopy1_level2itemRow);
      send_integrity_lvl_hashes1OU192( ) ;
      GXCCtl = "Z1302DevLin_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1303DevObs_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1303DevObs));
      GXCCtl = "nRcdDeleted_192_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_192_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_192_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_112_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVLIN_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVOBS_"+sGXsfl_112_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtdevpiecopy1_level2itemContainer.AddRow(Gridtdevpiecopy1_level2itemRow);
   }

   public void readRow1OU192( )
   {
      nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_112192( ) ;
      edtDevLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVLIN_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVOBS_"+sGXsfl_112_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DEVLIN_" + sGXsfl_112_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevLin_Internalname ;
         wbErr = true ;
         A1302DevLin = (byte)(0) ;
      }
      else
      {
         A1302DevLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1303DevObs = httpContext.cgiGet( edtDevObs_Internalname) ;
      GXCCtl = "Z1302DevLin_" + sGXsfl_112_idx ;
      Z1302DevLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1303DevObs_" + sGXsfl_112_idx ;
      Z1303DevObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_192_" + sGXsfl_112_idx ;
      nRcdDeleted_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_192_" + sGXsfl_112_idx ;
      nRcdExists_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_192_" + sGXsfl_112_idx ;
      nIsMod_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDevLin_Enabled = edtDevLin_Enabled ;
      defedtAlbRecMtrU_Enabled = edtAlbRecMtrU_Enabled ;
      defedtAlbRecKgmU_Enabled = edtAlbRecKgmU_Enabled ;
      defedtAlbRecPie_Enabled = edtAlbRecPie_Enabled ;
   }

   public void confirmValues1OU0( )
   {
      nGXsfl_94_idx = 0 ;
      sGXsfl_94_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_94_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_94451( ) ;
      while ( nGXsfl_94_idx < nRC_GXsfl_94 )
      {
         nGXsfl_94_idx = (int)(nGXsfl_94_idx+1) ;
         sGXsfl_94_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_94_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_94451( ) ;
         httpContext.changePostValue( "Z2159AlbRecPie_"+sGXsfl_94_idx, httpContext.cgiGet( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_94_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2159AlbRecPie_"+sGXsfl_94_idx) ;
         httpContext.changePostValue( "Z3067DevPieUni_"+sGXsfl_94_idx, httpContext.cgiGet( "ZT_"+"Z3067DevPieUni_"+sGXsfl_94_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z3067DevPieUni_"+sGXsfl_94_idx) ;
         httpContext.changePostValue( "Z4795AlRPieCal_"+sGXsfl_94_idx, httpContext.cgiGet( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_94_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4795AlRPieCal_"+sGXsfl_94_idx) ;
         httpContext.changePostValue( "Z2155AlbRecKgm_"+sGXsfl_94_idx, httpContext.cgiGet( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_94_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2155AlbRecKgm_"+sGXsfl_94_idx) ;
         httpContext.changePostValue( "Z2157AlbRecMtr_"+sGXsfl_94_idx, httpContext.cgiGet( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_94_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2157AlbRecMtr_"+sGXsfl_94_idx) ;
      }
      nGXsfl_112_idx = 0 ;
      sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_112192( ) ;
      while ( nGXsfl_112_idx < nRC_GXsfl_112 )
      {
         nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
         sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_112192( ) ;
         httpContext.changePostValue( "Z1302DevLin_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z1302DevLin_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_112_idx) ;
         httpContext.changePostValue( "Z1303DevObs_"+sGXsfl_112_idx, httpContext.cgiGet( "ZT_"+"Z1303DevObs_"+sGXsfl_112_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_112_idx) ;
      }
      httpContext.changePostValue( "O3067DevPieUni", httpContext.cgiGet( "T3067DevPieUni")) ;
      httpContext.deletePostValue( "T3067DevPieUni") ;
      httpContext.changePostValue( "O2156AlbRecKgmU", httpContext.cgiGet( "T2156AlbRecKgmU")) ;
      httpContext.deletePostValue( "T2156AlbRecKgmU") ;
      httpContext.changePostValue( "O2158AlbRecMtrU", httpContext.cgiGet( "T2158AlbRecMtrU")) ;
      httpContext.deletePostValue( "T2158AlbRecMtrU") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdevpiecopy1", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDevPieCopy1");
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV20Modo, "")));
      forbiddenHiddens.add("DevGenEst", localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdevpiecopy1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z323DevGenCod", GXutil.ltrim( localUtil.ntoc( Z323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z328DevGenUni", GXutil.ltrim( localUtil.ntoc( Z328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z326DevGenPie", GXutil.ltrim( localUtil.ntoc( Z326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z325DevGenFec", localUtil.dtoc( Z325DevGenFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6288DevGenDom", GXutil.ltrim( localUtil.ntoc( Z6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z324DevGenEst", GXutil.ltrim( localUtil.ntoc( Z324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1304DevUlin", GXutil.ltrim( localUtil.ntoc( Z1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z327DevGenTrn", GXutil.ltrim( localUtil.ntoc( Z327DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O1304DevUlin", GXutil.ltrim( localUtil.ntoc( O1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O326DevGenPie", GXutil.ltrim( localUtil.ntoc( O326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O328DevGenUni", GXutil.ltrim( localUtil.ntoc( O328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O3066AlbDevPUni", GXutil.ltrim( localUtil.ntoc( O3066AlbDevPUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5278AlbDevPPie", GXutil.ltrim( localUtil.ntoc( O5278AlbDevPPie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O325DevGenFec", localUtil.dtoc( O325DevGenFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_94", GXutil.ltrim( localUtil.ntoc( nGXsfl_94_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_112", GXutil.ltrim( localUtil.ntoc( nGXsfl_112_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV20Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "KILANT", GXutil.ltrim( localUtil.ntoc( AV14KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METANT", GXutil.ltrim( localUtil.ntoc( AV15MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "KILOS", GXutil.ltrim( localUtil.ntoc( AV17Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "METROS", GXutil.ltrim( localUtil.ntoc( AV18Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEANT", GXutil.ltrim( localUtil.ntoc( AV16PieAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PIEZAS", GXutil.ltrim( localUtil.ntoc( AV19Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIENT", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRUNIUTI", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEENT", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRPIEUTI", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV20Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV14KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETANT", GXutil.ltrim( localUtil.ntoc( AV15MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEANT", GXutil.ltrim( localUtil.ntoc( AV16PieAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV17Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV18Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEZAS", GXutil.ltrim( localUtil.ntoc( AV19Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDDEVGENFEC", localUtil.dtoc( AV61oldDevGenFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNI", GXutil.rtrim( AV13AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPDIS", GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUDIS", GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_ATT", GXutil.rtrim( AV65Err_att));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENEST", GXutil.ltrim( localUtil.ntoc( A324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVULIN", GXutil.ltrim( localUtil.ntoc( A1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVTRNNOM", GXutil.rtrim( A329DevTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDEVPUNI", GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBDEVPPIE", GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDUNI", GXutil.ltrim( localUtil.ntoc( AV63oldUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALRPIECAL", GXutil.rtrim( A4795AlRPieCal));
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
      return formatLink("app.tdevpiecopy1", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDevPieCopy1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion Piezas Copy", "") ;
   }

   public void initializeNonKey1OU31( )
   {
      AV20Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      AV9AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
      A328DevGenUni = DecimalUtil.ZERO ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      A326DevGenPie = (short)(0) ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      AV13AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      AV11AlbRPDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
      AV12AlbRUDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      AV14KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrimstr( AV14KilAnt, 9, 2));
      AV15MetAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrimstr( AV15MetAnt, 9, 2));
      AV16PieAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16PieAnt), 4, 0));
      AV17Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrimstr( AV17Kilos, 9, 2));
      AV18Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrimstr( AV18Metros, 9, 2));
      AV19Piezas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Piezas), 4, 0));
      AV61oldDevGenFec = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61oldDevGenFec", localUtil.format(AV61oldDevGenFec, "99/99/99"));
      AV65Err_att = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", AV65Err_att);
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A6288DevGenDom = (byte)(0) ;
      n6288DevGenDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A327DevGenTrn = (short)(0) ;
      n327DevGenTrn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
      A329DevTrnNom = "" ;
      n329DevTrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A324DevGenEst = (byte)(0) ;
      n324DevGenEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A324DevGenEst", GXutil.str( A324DevGenEst, 1, 0));
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      A5278AlbDevPPie = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      A1304DevUlin = (byte)(0) ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      O1304DevUlin = A1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      O3066AlbDevPUni = A3066AlbDevPUni ;
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
      O5278AlbDevPPie = A5278AlbDevPPie ;
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      O325DevGenFec = A325DevGenFec ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z326DevGenPie = (short)(0) ;
      Z325DevGenFec = GXutil.nullDate() ;
      Z6288DevGenDom = (byte)(0) ;
      Z324DevGenEst = (byte)(0) ;
      Z1304DevUlin = (byte)(0) ;
      Z44AlbRecCod = 0 ;
      Z327DevGenTrn = (short)(0) ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z47AlbREst = (byte)(0) ;
      Z252CliCod = 0 ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
   }

   public void initAll1OU31( )
   {
      A323DevGenCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      initializeNonKey1OU31( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV20Modo = iV20Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Modo", AV20Modo);
      A325DevGenFec = i325DevGenFec ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
   }

   public void initializeNonKey1OU451( )
   {
      A3067DevPieUni = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      AV63oldUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrimstr( AV63oldUni, 9, 2));
      A4795AlRPieCal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", A4795AlRPieCal);
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      O3067DevPieUni = A3067DevPieUni ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      Z3067DevPieUni = DecimalUtil.ZERO ;
      Z4795AlRPieCal = "" ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
   }

   public void initAll1OU451( )
   {
      A2159AlbRecPie = "" ;
      initializeNonKey1OU451( ) ;
   }

   public void standaloneModalInsert1OU451( )
   {
      A326DevGenPie = i326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A54AlbRPieUti = i54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
   }

   public void initializeNonKey1OU192( )
   {
      A1303DevObs = "" ;
      Z1303DevObs = "" ;
   }

   public void initAll1OU192( )
   {
      A1302DevLin = (byte)(0) ;
      initializeNonKey1OU192( ) ;
   }

   public void standaloneModalInsert1OU192( )
   {
      A1304DevUlin = i1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415105159", true, true);
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
      httpContext.AddJavascriptSource("tdevpiecopy1.js", "?202682415105159", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties451( )
   {
      edtAlbRecMtrU_Enabled = defedtAlbRecMtrU_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecMtrU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecMtrU_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtAlbRecKgmU_Enabled = defedtAlbRecKgmU_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecKgmU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecKgmU_Enabled), 5, 0), !bGXsfl_94_Refreshing);
      edtAlbRecPie_Enabled = defedtAlbRecPie_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecPie_Enabled), 5, 0), !bGXsfl_94_Refreshing);
   }

   public void init_level_properties192( )
   {
      edtDevLin_Enabled = defedtDevLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_112_Refreshing);
   }

   public void startgridcontrol94( )
   {
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("GridName", "Gridtdevpiecopy1_level1item");
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Header", subGridtdevpiecopy1_level1item_Header);
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Class", "WorkWith");
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtdevpiecopy1_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A2159AlbRecPie));
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecPie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddColumnProperties(Gridtdevpiecopy1_level1itemColumn);
      Gridtdevpiecopy1_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddColumnProperties(Gridtdevpiecopy1_level1itemColumn);
      Gridtdevpiecopy1_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddColumnProperties(Gridtdevpiecopy1_level1itemColumn);
      Gridtdevpiecopy1_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecKgmU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddColumnProperties(Gridtdevpiecopy1_level1itemColumn);
      Gridtdevpiecopy1_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbRecMtrU_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddColumnProperties(Gridtdevpiecopy1_level1itemColumn);
      Gridtdevpiecopy1_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), ".", "")));
      Gridtdevpiecopy1_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevPieUni_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddColumnProperties(Gridtdevpiecopy1_level1itemColumn);
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void startgridcontrol112( )
   {
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("GridName", "Gridtdevpiecopy1_level2item");
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Header", subGridtdevpiecopy1_level2item_Header);
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Class", "WorkWith");
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level2item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("CmpContext", "");
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtdevpiecopy1_level2itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevpiecopy1_level2itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddColumnProperties(Gridtdevpiecopy1_level2itemColumn);
      Gridtdevpiecopy1_level2itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevpiecopy1_level2itemColumn.AddObjectProperty("Value", GXutil.rtrim( A1303DevObs));
      Gridtdevpiecopy1_level2itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddColumnProperties(Gridtdevpiecopy1_level2itemColumn);
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level2item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level2item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level2item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level2item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level2item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level2item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtdevpiecopy1_level2itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtdevpiecopy1_level2item_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      edtDevGenCod_Internalname = "DEVGENCOD" ;
      edtDevGenFec_Internalname = "DEVGENFEC" ;
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtDevGenDom_Internalname = "DEVGENDOM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtAlbRef_Internalname = "ALBREF" ;
      dynDevGenTrn.setInternalname( "DEVGENTRN" );
      edtDevGenUni_Internalname = "DEVGENUNI" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtDevGenPie_Internalname = "DEVGENPIE" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtAlbRecPie_Internalname = "ALBRECPIE" ;
      edtAlbRecKgm_Internalname = "ALBRECKGM" ;
      edtAlbRecMtr_Internalname = "ALBRECMTR" ;
      edtAlbRecKgmU_Internalname = "ALBRECKGMU" ;
      edtAlbRecMtrU_Internalname = "ALBRECMTRU" ;
      edtDevPieUni_Internalname = "DEVPIEUNI" ;
      bttSeleccionarpiezas_Internalname = "SELECCIONARPIEZAS" ;
      tblTable1_Internalname = "TABLE1" ;
      lblTitlelevel2_Internalname = "TITLELEVEL2" ;
      edtDevLin_Internalname = "DEVLIN" ;
      edtDevObs_Internalname = "DEVOBS" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Form.setInternalname( "FORM" );
      subGridtdevpiecopy1_level1item_Internalname = "GRIDTDEVPIECOPY1_LEVEL1ITEM" ;
      subGridtdevpiecopy1_level2item_Internalname = "GRIDTDEVPIECOPY1_LEVEL2ITEM" ;
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
      subGridtdevpiecopy1_level2item_Allowcollapsing = (byte)(0) ;
      subGridtdevpiecopy1_level2item_Allowselection = (byte)(0) ;
      subGridtdevpiecopy1_level2item_Header = "" ;
      subGridtdevpiecopy1_level1item_Allowcollapsing = (byte)(0) ;
      subGridtdevpiecopy1_level1item_Allowselection = (byte)(0) ;
      subGridtdevpiecopy1_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Devolucion Piezas Copy", "") );
      edtDevObs_Jsonclick = "" ;
      edtDevLin_Jsonclick = "" ;
      subGridtdevpiecopy1_level2item_Class = "WorkWith" ;
      subGridtdevpiecopy1_level2item_Backcolorstyle = (byte)(0) ;
      edtDevPieUni_Jsonclick = "" ;
      edtAlbRecMtrU_Jsonclick = "" ;
      edtAlbRecKgmU_Jsonclick = "" ;
      edtAlbRecMtr_Jsonclick = "" ;
      edtAlbRecKgm_Jsonclick = "" ;
      edtAlbRecPie_Jsonclick = "" ;
      subGridtdevpiecopy1_level1item_Class = "WorkWith" ;
      subGridtdevpiecopy1_level1item_Backcolorstyle = (byte)(0) ;
      edtDevObs_Enabled = 1 ;
      edtDevLin_Enabled = 1 ;
      edtDevPieUni_Enabled = 1 ;
      edtAlbRecMtrU_Enabled = 0 ;
      edtAlbRecKgmU_Enabled = 0 ;
      edtAlbRecMtr_Enabled = 0 ;
      edtAlbRecKgm_Enabled = 0 ;
      edtAlbRecPie_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      bttSeleccionarpiezas_Visible = 1 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtDevGenPie_Jsonclick = "" ;
      edtDevGenPie_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtDevGenUni_Jsonclick = "" ;
      edtDevGenUni_Enabled = 0 ;
      dynDevGenTrn.setJsonclick( "" );
      dynDevGenTrn.setEnabled( 1 );
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtDevGenDom_Jsonclick = "" ;
      edtDevGenDom_Enabled = 1 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
      edtDevGenFec_Jsonclick = "" ;
      edtDevGenFec_Enabled = 1 ;
      edtDevGenCod_Jsonclick = "" ;
      edtDevGenCod_Enabled = 1 ;
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

   public void gxdladevgentrn1OU31( String A396EmprCod )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdladevgentrn_data1OU31( A396EmprCod) ;
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

   public void gxadevgentrn_html1OU31( String A396EmprCod )
   {
      short gxdynajaxvalue;
      gxdladevgentrn_data1OU31( A396EmprCod) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynDevGenTrn.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = (short)(GXutil.lval( gxdynajaxctrlcodr.item(gxdynajaxindex))) ;
         dynDevGenTrn.addItem(GXutil.trim( GXutil.str( gxdynajaxvalue, 4, 0)), gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdladevgentrn_data1OU31( String A396EmprCod )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      gxdynajaxctrlcodr.add(GXutil.ltrimstr( DecimalUtil.doubleToDec(0), 9, 0));
      gxdynajaxctrldescr.add(httpContext.getMessage( "{{Transportistas}}", ""));
      /* Using cursor T01OU54 */
      pr_default.execute(48, new Object[] {A396EmprCod});
      while ( (pr_default.getStatus(48) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.ltrim( localUtil.ntoc( T01OU54_A327DevGenTrn[0], (byte)(4), (byte)(0), ".", "")));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01OU54_A329DevTrnNom[0]));
         pr_default.readNext(48);
      }
      pr_default.close(48);
   }

   public void xc_20_1OU31( String A396EmprCod ,
                            int A323DevGenCod ,
                            int A44AlbRecCod )
   {
      if ( (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         GXv_int8[0] = A323DevGenCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         A323DevGenCod = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_21_1OU31( )
   {
      if ( ! (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         httpContext.wjLoc = formatLink("app.webwdevpza", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A44AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A323DevGenCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(A328DevGenUni)),GXutil.URLEncode(GXutil.ltrimstr(A326DevGenPie,4,0)),GXutil.URLEncode(DecimalUtil.decToString(A60AlbRUniUti)),GXutil.URLEncode(GXutil.ltrimstr(A54AlbRPieUti,6,0))}, new String[] {"EmprCod","ALbRecCod","DevGenCod","DevGenUni","DevGenPie","AlbRUniUti","AlbRPieUti"})  ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_22_1OU31( String A396EmprCod ,
                            int A44AlbRecCod ,
                            String AV13AlbRUni )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_int6[0] = AV9AlbRPieDis ;
         GXv_decimal9[0] = AV10AlbRUniDis ;
         GXv_int5[0] = AV11AlbRPDis ;
         GXv_decimal7[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_decimal9, GXv_int5, GXv_decimal7, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int8[0] ;
         AV9AlbRPieDis = GXv_int6[0] ;
         AV10AlbRUniDis = GXv_decimal9[0] ;
         AV11AlbRPDis = GXv_int5[0] ;
         AV12AlbRUDis = GXv_decimal7[0] ;
         AV13AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrimstr( AV10AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrimstr( AV12AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", AV13AlbRUni);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV13AlbRUni))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_25_1OU31( String A396EmprCod ,
                            int A252CliCod ,
                            byte A6288DevGenDom ,
                            String AV65Err_att )
   {
      if ( ( A6288DevGenDom > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int10[0] = A6288DevGenDom ;
         GXv_char3[0] = AV65Err_att ;
         new app.pexdomenvio(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int10, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A252CliCod = GXv_int8[0] ;
         A6288DevGenDom = GXv_int10[0] ;
         AV65Err_att = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", AV65Err_att);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV65Err_att))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridtdevpiecopy1_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_94451( ) ;
      while ( nGXsfl_94_idx <= nRC_GXsfl_94 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OU451( ) ;
         standaloneModal1OU451( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OU451( ) ;
         nGXsfl_94_idx = (int)(nGXsfl_94_idx+1) ;
         sGXsfl_94_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_94_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_94451( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtdevpiecopy1_level1itemContainer)) ;
      /* End function gxnrGridtdevpiecopy1_level1item_newrow */
   }

   public void gxnrgridtdevpiecopy1_level2item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_112192( ) ;
      while ( nGXsfl_112_idx <= nRC_GXsfl_112 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OU192( ) ;
         standaloneModal1OU192( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OU192( ) ;
         nGXsfl_112_idx = (int)(nGXsfl_112_idx+1) ;
         sGXsfl_112_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_112_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_112192( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtdevpiecopy1_level2itemContainer)) ;
      /* End function gxnrGridtdevpiecopy1_level2item_newrow */
   }

   public void init_web_controls( )
   {
      dynDevGenTrn.setName( "DEVGENTRN" );
      dynDevGenTrn.setWebtags( "" );
      cmbAlbRUni.setName( "ALBRUNI" );
      cmbAlbRUni.setWebtags( "" );
      cmbAlbRUni.addItem("K", httpContext.getMessage( "K", ""), (short)(0));
      cmbAlbRUni.addItem("M", httpContext.getMessage( "M", ""), (short)(0));
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      }
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T01OU55 */
      pr_default.execute(49, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(49) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OU55_A407EmprNom[0] ;
      n407EmprNom = T01OU55_n407EmprNom[0] ;
      pr_default.close(49);
      /* Using cursor T01OU57 */
      pr_default.execute(50, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(50) != 101) )
      {
         A3066AlbDevPUni = T01OU57_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01OU57_A5278AlbDevPPie[0] ;
      }
      else
      {
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrimstr( A3066AlbDevPUni, 9, 2));
         A5278AlbDevPPie = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5278AlbDevPPie), 3, 0));
      }
      pr_default.close(50);
      GX_FocusControl = edtDevGenFec_Internalname ;
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

   public void valid_Devgencod( )
   {
      n324DevGenEst = false ;
      n1304DevUlin = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      n328DevGenUni = false ;
      n326DevGenPie = false ;
      n325DevGenFec = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T01OU59 */
      pr_default.execute(51, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(51) != 101) )
      {
         A3066AlbDevPUni = T01OU59_A3066AlbDevPUni[0] ;
         A5278AlbDevPPie = T01OU59_A5278AlbDevPPie[0] ;
      }
      else
      {
         A3066AlbDevPUni = DecimalUtil.doubleToDec(0) ;
         A5278AlbDevPPie = (short)(0) ;
      }
      pr_default.close(51);
      dynload_actions( ) ;
      if ( dynDevGenTrn.getItemCount() > 0 )
      {
         A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValidValue(GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0))))) ;
         n327DevGenTrn = false ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynDevGenTrn.setValue( GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0)) );
      }
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrim( localUtil.ntoc( A328DevGenUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrim( localUtil.ntoc( A326DevGenPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), ".", "")));
      dynDevGenTrn.setValue( GXutil.trim( GXutil.str( A327DevGenTrn, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, dynDevGenTrn.getInternalname(), "Values", dynDevGenTrn.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A324DevGenEst", GXutil.ltrim( localUtil.ntoc( A324DevGenEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrim( localUtil.ntoc( A1304DevUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", GXutil.rtrim( A329DevTrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "A3066AlbDevPUni", GXutil.ltrim( localUtil.ntoc( A3066AlbDevPUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5278AlbDevPPie", GXutil.ltrim( localUtil.ntoc( A5278AlbDevPPie, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV61oldDevGenFec", localUtil.format(AV61oldDevGenFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", GXutil.rtrim( AV13AlbRUni));
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", GXutil.rtrim( AV65Err_att));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z323DevGenCod", GXutil.ltrim( localUtil.ntoc( Z323DevGenCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z328DevGenUni", GXutil.ltrim( localUtil.ntoc( Z328DevGenUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z326DevGenPie", GXutil.ltrim( localUtil.ntoc( Z326DevGenPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z325DevGenFec", localUtil.format(Z325DevGenFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6288DevGenDom", GXutil.ltrim( localUtil.ntoc( Z6288DevGenDom, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z327DevGenTrn", GXutil.ltrim( localUtil.ntoc( Z327DevGenTrn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z324DevGenEst", GXutil.ltrim( localUtil.ntoc( Z324DevGenEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1304DevUlin", GXutil.ltrim( localUtil.ntoc( Z1304DevUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z329DevTrnNom", GXutil.rtrim( Z329DevTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3066AlbDevPUni", GXutil.ltrim( localUtil.ntoc( Z3066AlbDevPUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5278AlbDevPPie", GXutil.ltrim( localUtil.ntoc( Z5278AlbDevPPie, (byte)(3), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV61oldDevGenFec", localUtil.format(ZV61oldDevGenFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV13AlbRUni", GXutil.rtrim( ZV13AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV9AlbRPieDis", GXutil.ltrim( localUtil.ntoc( ZV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( ZV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV11AlbRPDis", GXutil.ltrim( localUtil.ntoc( ZV11AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV12AlbRUDis", GXutil.ltrim( localUtil.ntoc( ZV12AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV65Err_att", GXutil.rtrim( ZV65Err_att));
      httpContext.ajax_rsp_assign_attri("", false, "O1304DevUlin", GXutil.ltrim( localUtil.ntoc( O1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O326DevGenPie", GXutil.ltrim( localUtil.ntoc( O326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O328DevGenUni", GXutil.ltrim( localUtil.ntoc( O328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O3066AlbDevPUni", GXutil.ltrim( localUtil.ntoc( O3066AlbDevPUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O5278AlbDevPPie", GXutil.ltrim( localUtil.ntoc( O5278AlbDevPPie, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O325DevGenFec", localUtil.dtoc( O325DevGenFec, 0, "/"));
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Devgenfec( )
   {
      n325DevGenFec = false ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      AV61oldDevGenFec = O325DevGenFec ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV61oldDevGenFec", localUtil.format(AV61oldDevGenFec, "99/99/99"));
   }

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      n326DevGenPie = false ;
      n252CliCod = false ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      /* Using cursor T01OU60 */
      pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Z60AlbRUniUti = T01OU60_A60AlbRUniUti[0] ;
      Z47AlbREst = T01OU60_A47AlbREst[0] ;
      Z252CliCod = T01OU60_A252CliCod[0] ;
      Z45AlbRef = T01OU60_A45AlbRef[0] ;
      Z56AlbRUni = T01OU60_A56AlbRUni[0] ;
      Z52AlbRPieEnt = T01OU60_A52AlbRPieEnt[0] ;
      Z58AlbRUniEnt = T01OU60_A58AlbRUniEnt[0] ;
      if ( (pr_default.getStatus(52) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A60AlbRUniUti = T01OU60_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T01OU60_A54AlbRPieUti[0] ;
      A47AlbREst = T01OU60_A47AlbREst[0] ;
      A252CliCod = T01OU60_A252CliCod[0] ;
      n252CliCod = T01OU60_n252CliCod[0] ;
      A45AlbRef = T01OU60_A45AlbRef[0] ;
      A56AlbRUni = T01OU60_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A52AlbRPieEnt = T01OU60_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T01OU60_A58AlbRUniEnt[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(52);
      if ( isDlt( )  )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-O326DevGenPie) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
         }
      }
      /* Using cursor T01OU61 */
      pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(53) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T01OU61_A279CliNom[0] ;
      pr_default.close(53);
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() >= 0 )
      {
         A57AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( (A58AlbRUniEnt.subtract(A60AlbRUniUti)).doubleValue() < 0 )
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
         else
         {
            A57AlbRUniDis = DecimalUtil.doubleToDec(0) ;
         }
      }
      if ( ( A51AlbRPieDis == 0 ) && ( A57AlbRUniDis.doubleValue() == 0 ) )
      {
         A47AlbREst = (byte)(1) ;
      }
      else
      {
         if ( ( A51AlbRPieDis != 0 ) && ( A57AlbRUniDis.doubleValue() != 0 ) )
         {
            A47AlbREst = (byte)(0) ;
         }
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A44AlbRecCod ;
         GXv_int6[0] = AV9AlbRPieDis ;
         GXv_decimal9[0] = AV10AlbRUniDis ;
         GXv_int5[0] = AV11AlbRPDis ;
         GXv_decimal7[0] = AV12AlbRUDis ;
         GXv_char3[0] = AV13AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_decimal9, GXv_int5, GXv_decimal7, GXv_char3) ;
         tdevpiecopy1_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevpiecopy1_impl.this.A44AlbRecCod = GXv_int8[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         tdevpiecopy1_impl.this.AV9AlbRPieDis = GXv_int6[0] ;
         AV9AlbRPieDis = this.AV9AlbRPieDis ;
         tdevpiecopy1_impl.this.AV10AlbRUniDis = GXv_decimal9[0] ;
         AV10AlbRUniDis = this.AV10AlbRUniDis ;
         tdevpiecopy1_impl.this.AV11AlbRPDis = GXv_int5[0] ;
         AV11AlbRPDis = this.AV11AlbRPDis ;
         tdevpiecopy1_impl.this.AV12AlbRUDis = GXv_decimal7[0] ;
         AV12AlbRUDis = this.AV12AlbRUDis ;
         tdevpiecopy1_impl.this.AV13AlbRUni = GXv_char3[0] ;
         AV13AlbRUni = this.AV13AlbRUni ;
      }
      dynload_actions( ) ;
      if ( cmbAlbRUni.getItemCount() > 0 )
      {
         A56AlbRUni = cmbAlbRUni.getValidValue(A56AlbRUni) ;
         cmbAlbRUni.setValue( A56AlbRUni );
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV9AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPDis", GXutil.ltrim( localUtil.ntoc( AV11AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRUDis", GXutil.ltrim( localUtil.ntoc( AV12AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUni", GXutil.rtrim( AV13AlbRUni));
   }

   public void valid_Devgendom( )
   {
      n252CliCod = false ;
      n6288DevGenDom = false ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      if ( ( A6288DevGenDom > 0 ) && true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_int10[0] = A6288DevGenDom ;
         GXv_char3[0] = AV65Err_att ;
         new app.pexdomenvio(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int10, GXv_char3) ;
         tdevpiecopy1_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevpiecopy1_impl.this.A252CliCod = GXv_int8[0] ;
         A252CliCod = this.A252CliCod ;
         tdevpiecopy1_impl.this.A6288DevGenDom = GXv_int10[0] ;
         A6288DevGenDom = this.A6288DevGenDom ;
         tdevpiecopy1_impl.this.AV65Err_att = GXv_char3[0] ;
         AV65Err_att = this.AV65Err_att ;
      }
      if ( ( A6288DevGenDom > 0 ) && true /* After */ && ( GXutil.strcmp(AV65Err_att, "") != 0 ) )
      {
         httpContext.GX_msglist.addItem(AV65Err_att, 1, "DEVGENDOM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenDom_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV65Err_att", GXutil.rtrim( AV65Err_att));
   }

   public void valid_Devgentrn( )
   {
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      n329DevTrnNom = false ;
      /* Using cursor T01OU62 */
      pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(54) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = dynDevGenTrn.getInternalname() ;
         }
      }
      A329DevTrnNom = T01OU62_A329DevTrnNom[0] ;
      n329DevTrnNom = T01OU62_n329DevTrnNom[0] ;
      pr_default.close(54);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", GXutil.rtrim( A329DevTrnNom));
   }

   public void valid_Albrecpie( )
   {
      n44AlbRecCod = false ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      /* Using cursor T01OU45 */
      pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), A2159AlbRecPie});
      Z4795AlRPieCal = T01OU45_A4795AlRPieCal[0] ;
      Z2155AlbRecKgm = T01OU45_A2155AlbRecKgm[0] ;
      Z2157AlbRecMtr = T01OU45_A2157AlbRecMtr[0] ;
      if ( (pr_default.getStatus(39) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBDET", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecPie_Internalname ;
      }
      A4795AlRPieCal = T01OU45_A4795AlRPieCal[0] ;
      A2158AlbRecMtrU = T01OU45_A2158AlbRecMtrU[0] ;
      A2156AlbRecKgmU = T01OU45_A2156AlbRecKgmU[0] ;
      A2155AlbRecKgm = T01OU45_A2155AlbRecKgm[0] ;
      A2157AlbRecMtr = T01OU45_A2157AlbRecMtr[0] ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      pr_default.close(39);
      if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2155AlbRecKgm, A2156AlbRecKgmU) >= 0 ) )
      {
         A3067DevPieUni = A2155AlbRecKgm.subtract(A2156AlbRecKgmU) ;
      }
      else
      {
         if ( isIns( )  && true /* After */ && ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && ( DecimalUtil.compareTo(A2157AlbRecMtr, A2158AlbRecMtrU) >= 0 ) )
         {
            A3067DevPieUni = A2157AlbRecMtr.subtract(A2158AlbRecMtrU) ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "O2158AlbRecMtrU", GXutil.ltrim( localUtil.ntoc( O2158AlbRecMtrU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O2156AlbRecKgmU", GXutil.ltrim( localUtil.ntoc( O2156AlbRecKgmU, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "A4795AlRPieCal", GXutil.rtrim( A4795AlRPieCal));
      httpContext.ajax_rsp_assign_attri("", false, "A2158AlbRecMtrU", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2156AlbRecKgmU", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2155AlbRecKgm", GXutil.ltrim( localUtil.ntoc( A2155AlbRecKgm, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2157AlbRecMtr", GXutil.ltrim( localUtil.ntoc( A2157AlbRecMtr, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3067DevPieUni", GXutil.ltrim( localUtil.ntoc( A3067DevPieUni, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Devpieuni( )
   {
      n326DevGenPie = false ;
      n328DevGenUni = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      n327DevGenTrn = false ;
      A327DevGenTrn = (short)(GXutil.lval( dynDevGenTrn.getValue())) ;
      n327DevGenTrn = false ;
      if ( isDlt( )  )
      {
         A328DevGenUni = O328DevGenUni.subtract(O3067DevPieUni) ;
         n328DevGenUni = false ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A328DevGenUni = O328DevGenUni.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
            n328DevGenUni = false ;
         }
      }
      if ( true )
      {
         AV14KilAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV14KilAnt = O328DevGenUni ;
         }
      }
      if ( true )
      {
         AV15MetAnt = O328DevGenUni ;
      }
      else
      {
         if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV15MetAnt = O328DevGenUni ;
         }
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV17Kilos = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV18Metros = A328DevGenUni ;
      }
      if ( true )
      {
         AV10AlbRUniDis = A57AlbRUniDis ;
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV10AlbRUniDis = AV12AlbRUDis ;
         }
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 0, "");
      }
      if ( isDlt( )  )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
         }
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
      {
         A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
         {
            A2158AlbRecMtrU = O2158AlbRecMtrU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
            {
               A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) ) )
               {
                  A2158AlbRecMtrU = O2158AlbRecMtrU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( DecimalUtil.compareTo(A2158AlbRecMtrU, A2157AlbRecMtr) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de kilos no suficientes", ""), 0, "");
      }
      if ( isDlt( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
      {
         A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
      }
      else
      {
         if ( isUpd( )  && ! ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
         {
            A2156AlbRecKgmU = O2156AlbRecKgmU.subtract(O3067DevPieUni) ;
         }
         else
         {
            if ( isUpd( )  && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) && ! ( ( GXutil.strcmp(O56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
            {
               A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni) ;
            }
            else
            {
               if ( ( isIns( )  || isUpd( )  || isDlt( )  ) && ( ( GXutil.strcmp(A56AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) ) )
               {
                  A2156AlbRecKgmU = O2156AlbRecKgmU.add(A3067DevPieUni).subtract(O3067DevPieUni) ;
               }
            }
         }
      }
      if ( DecimalUtil.compareTo(A2156AlbRecKgmU, A2155AlbRecKgm) > 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad de metros no suficientes", ""), 0, "");
      }
      if ( true /* Level */ )
      {
         AV63oldUni = O3067DevPieUni ;
      }
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O3067DevPieUni = A3067DevPieUni ;
      O2156AlbRecKgmU = A2156AlbRecKgmU ;
      O56AlbRUni = A56AlbRUni ;
      O2158AlbRecMtrU = A2158AlbRecMtrU ;
      O60AlbRUniUti = A60AlbRUniUti ;
      O3066AlbDevPUni = A3066AlbDevPUni ;
      O5278AlbDevPPie = A5278AlbDevPPie ;
      OV14KilAnt = AV14KilAnt ;
      OV15MetAnt = AV15MetAnt ;
      OV16PieAnt = AV16PieAnt ;
      OV17Kilos = AV17Kilos ;
      OV18Metros = AV18Metros ;
      OV19Piezas = AV19Piezas ;
      OV9AlbRPieDis = AV9AlbRPieDis ;
      OV10AlbRUniDis = AV10AlbRUniDis ;
      O47AlbREst = A47AlbREst ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV14KilAnt", GXutil.ltrim( localUtil.ntoc( AV14KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV15MetAnt", GXutil.ltrim( localUtil.ntoc( AV15MetAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV17Kilos", GXutil.ltrim( localUtil.ntoc( AV17Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18Metros", GXutil.ltrim( localUtil.ntoc( AV18Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV10AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2158AlbRecMtrU", GXutil.ltrim( localUtil.ntoc( A2158AlbRecMtrU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A2156AlbRecKgmU", GXutil.ltrim( localUtil.ntoc( A2156AlbRecKgmU, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV63oldUni", GXutil.ltrim( localUtil.ntoc( AV63oldUni, (byte)(9), (byte)(2), ".", "")));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV20Modo',fld:'vMODO',pic:''},{av:'A324DevGenEst',fld:'DEVGENEST',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'SELECCIONAR PIEZAS'","{handler:'e121OU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'SELECCIONAR PIEZAS'",",oparms:[{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALID_DEVGENCOD","{handler:'valid_Devgencod',iparms:[{av:'A324DevGenEst',fld:'DEVGENEST',pic:'9'},{av:'A1304DevUlin',fld:'DEVULIN',pic:'Z9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV20Modo',fld:'vMODO',pic:''},{av:'A325DevGenFec',fld:'DEVGENFEC',pic:''},{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV16PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'AV19Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'AV61oldDevGenFec',fld:'vOLDDEVGENFEC',pic:''},{av:'AV13AlbRUni',fld:'vALBRUNI',pic:''},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV11AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV12AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV65Err_att',fld:'vERR_ATT',pic:''}]");
      setEventMetadata("VALID_DEVGENCOD",",oparms:[{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A325DevGenFec',fld:'DEVGENFEC',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A6288DevGenDom',fld:'DEVGENDOM',pic:'9'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'A324DevGenEst',fld:'DEVGENEST',pic:'9'},{av:'A1304DevUlin',fld:'DEVULIN',pic:'Z9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''},{av:'A3066AlbDevPUni',fld:'ALBDEVPUNI',pic:'ZZZZZ9.99'},{av:'A5278AlbDevPPie',fld:'ALBDEVPPIE',pic:'ZZ9'},{av:'AV61oldDevGenFec',fld:'vOLDDEVGENFEC',pic:''},{av:'AV13AlbRUni',fld:'vALBRUNI',pic:''},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV11AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV12AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV65Err_att',fld:'vERR_ATT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z323DevGenCod'},{av:'Z328DevGenUni'},{av:'Z326DevGenPie'},{av:'Z407EmprNom'},{av:'Z325DevGenFec'},{av:'Z44AlbRecCod'},{av:'Z6288DevGenDom'},{av:'Z327DevGenTrn'},{av:'Z324DevGenEst'},{av:'Z1304DevUlin'},{av:'Z60AlbRUniUti'},{av:'Z54AlbRPieUti'},{av:'Z47AlbREst'},{av:'Z252CliCod'},{av:'Z45AlbRef'},{av:'Z56AlbRUni'},{av:'Z52AlbRPieEnt'},{av:'Z58AlbRUniEnt'},{av:'Z51AlbRPieDis'},{av:'Z57AlbRUniDis'},{av:'Z279CliNom'},{av:'Z329DevTrnNom'},{av:'Z3066AlbDevPUni'},{av:'Z5278AlbDevPPie'},{av:'ZV61oldDevGenFec'},{av:'ZV13AlbRUni'},{av:'ZV9AlbRPieDis'},{av:'ZV10AlbRUniDis'},{av:'ZV11AlbRPDis'},{av:'ZV12AlbRUDis'},{av:'ZV65Err_att'},{av:'O1304DevUlin'},{av:'O326DevGenPie'},{av:'O328DevGenUni'},{av:'O54AlbRPieUti'},{av:'O60AlbRUniUti'},{av:'O3066AlbDevPUni'},{av:'O5278AlbDevPPie'},{av:'O325DevGenFec'},{av:'edtAlbRecCod_Enabled',ctrl:'ALBRECCOD',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_DEVGENFEC","{handler:'valid_Devgenfec',iparms:[{av:'O325DevGenFec'},{av:'A325DevGenFec',fld:'DEVGENFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'AV61oldDevGenFec',fld:'vOLDDEVGENFEC',pic:''}]");
      setEventMetadata("VALID_DEVGENFEC",",oparms:[{av:'AV61oldDevGenFec',fld:'vOLDDEVGENFEC',pic:''}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O326DevGenPie'},{av:'O54AlbRPieUti'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV13AlbRUni',fld:'vALBRUNI',pic:''},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV11AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV12AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV11AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV12AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV13AlbRUni',fld:'vALBRUNI',pic:''}]}");
      setEventMetadata("VALID_DEVGENDOM","{handler:'valid_Devgendom',iparms:[{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6288DevGenDom',fld:'DEVGENDOM',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'AV65Err_att',fld:'vERR_ATT',pic:''}]");
      setEventMetadata("VALID_DEVGENDOM",",oparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A6288DevGenDom',fld:'DEVGENDOM',pic:'9'},{av:'AV65Err_att',fld:'vERR_ATT',pic:''}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_DEVGENTRN","{handler:'valid_Devgentrn',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''}]");
      setEventMetadata("VALID_DEVGENTRN",",oparms:[{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''}]}");
      setEventMetadata("VALID_DEVGENUNI","{handler:'valid_Devgenuni',iparms:[]");
      setEventMetadata("VALID_DEVGENUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNI","{handler:'valid_Albruni',iparms:[]");
      setEventMetadata("VALID_ALBRUNI",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_DEVGENPIE","{handler:'valid_Devgenpie',iparms:[]");
      setEventMetadata("VALID_DEVGENPIE",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRECPIE","{handler:'valid_Albrecpie',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A2159AlbRecPie',fld:'ALBRECPIE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99'},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A3067DevPieUni',fld:'DEVPIEUNI',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ALBRECPIE",",oparms:[{av:'O2158AlbRecMtrU'},{av:'O2156AlbRecKgmU'},{av:'A4795AlRPieCal',fld:'ALRPIECAL',pic:''},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99'},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A3067DevPieUni',fld:'DEVPIEUNI',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_ALBRECKGM","{handler:'valid_Albreckgm',iparms:[]");
      setEventMetadata("VALID_ALBRECKGM",",oparms:[]}");
      setEventMetadata("VALID_ALBRECMTR","{handler:'valid_Albrecmtr',iparms:[]");
      setEventMetadata("VALID_ALBRECMTR",",oparms:[]}");
      setEventMetadata("VALID_ALBRECKGMU","{handler:'valid_Albreckgmu',iparms:[]");
      setEventMetadata("VALID_ALBRECKGMU",",oparms:[]}");
      setEventMetadata("VALID_ALBRECMTRU","{handler:'valid_Albrecmtru',iparms:[]");
      setEventMetadata("VALID_ALBRECMTRU",",oparms:[]}");
      setEventMetadata("VALID_DEVPIEUNI","{handler:'valid_Devpieuni',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV9AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV19Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'AV16PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'A5278AlbDevPPie',fld:'ALBDEVPPIE',pic:'ZZ9'},{av:'A3066AlbDevPUni',fld:'ALBDEVPUNI',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'O2156AlbRecKgmU'},{av:'O56AlbRUni'},{av:'O2158AlbRecMtrU'},{av:'O60AlbRUniUti'},{av:'O328DevGenUni'},{av:'O3067DevPieUni'},{av:'O3066AlbDevPUni'},{av:'O5278AlbDevPPie'},{av:'A3067DevPieUni',fld:'DEVPIEUNI',pic:'ZZZZZ9.99'},{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A2157AlbRecMtr',fld:'ALBRECMTR',pic:'ZZZZZ9.99'},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99'},{av:'A2155AlbRecKgm',fld:'ALBRECKGM',pic:'ZZZZZ9.99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'dynDevGenTrn'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV63oldUni',fld:'vOLDUNI',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_DEVPIEUNI",",oparms:[{av:'AV14KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV15MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV17Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV18Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV10AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A2158AlbRecMtrU',fld:'ALBRECMTRU',pic:'ZZZZZ9.99'},{av:'A2156AlbRecKgmU',fld:'ALBRECKGMU',pic:'ZZZZZ9.99'},{av:'AV63oldUni',fld:'vOLDUNI',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_DEVLIN","{handler:'valid_Devlin',iparms:[]");
      setEventMetadata("VALID_DEVLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Devobs',iparms:[]");
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
      pr_default.close(39);
      pr_default.close(52);
      pr_default.close(26);
      pr_default.close(49);
      pr_default.close(53);
      pr_default.close(27);
      pr_default.close(54);
      pr_default.close(28);
      pr_default.close(51);
      pr_default.close(50);
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z325DevGenFec = GXutil.nullDate() ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      O328DevGenUni = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      O3066AlbDevPUni = DecimalUtil.ZERO ;
      O325DevGenFec = GXutil.nullDate() ;
      Z2159AlbRecPie = "" ;
      Z3067DevPieUni = DecimalUtil.ZERO ;
      Z4795AlRPieCal = "" ;
      Z2155AlbRecKgm = DecimalUtil.ZERO ;
      Z2157AlbRecMtr = DecimalUtil.ZERO ;
      O3067DevPieUni = DecimalUtil.ZERO ;
      O2156AlbRecKgmU = DecimalUtil.ZERO ;
      O2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z1303DevObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV13AlbRUni = "" ;
      AV65Err_att = "" ;
      A2159AlbRecPie = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      Gx_mode = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A56AlbRUni = "" ;
      lblTitle_Jsonclick = "" ;
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      A279CliNom = "" ;
      A45AlbRef = "" ;
      A328DevGenUni = DecimalUtil.ZERO ;
      lblTitlelevel1_Jsonclick = "" ;
      sStyleString = "" ;
      bttSeleccionarpiezas_Jsonclick = "" ;
      lblTitlelevel2_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtdevpiecopy1_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      B328DevGenUni = DecimalUtil.ZERO ;
      B60AlbRUniUti = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      B3066AlbDevPUni = DecimalUtil.ZERO ;
      A3066AlbDevPUni = DecimalUtil.ZERO ;
      B325DevGenFec = GXutil.nullDate() ;
      sMode451 = "" ;
      Gridtdevpiecopy1_level2itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode192 = "" ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      AV20Modo = "" ;
      AV10AlbRUniDis = DecimalUtil.ZERO ;
      AV14KilAnt = DecimalUtil.ZERO ;
      AV15MetAnt = DecimalUtil.ZERO ;
      AV17Kilos = DecimalUtil.ZERO ;
      AV18Metros = DecimalUtil.ZERO ;
      AV61oldDevGenFec = GXutil.nullDate() ;
      AV12AlbRUDis = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      A329DevTrnNom = "" ;
      AV63oldUni = DecimalUtil.ZERO ;
      A4795AlRPieCal = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A1303DevObs = "" ;
      s328DevGenUni = DecimalUtil.ZERO ;
      s60AlbRUniUti = DecimalUtil.ZERO ;
      s3066AlbDevPUni = DecimalUtil.ZERO ;
      sV14KilAnt = DecimalUtil.ZERO ;
      OV14KilAnt = DecimalUtil.ZERO ;
      sV15MetAnt = DecimalUtil.ZERO ;
      OV15MetAnt = DecimalUtil.ZERO ;
      sV17Kilos = DecimalUtil.ZERO ;
      OV17Kilos = DecimalUtil.ZERO ;
      sV18Metros = DecimalUtil.ZERO ;
      OV18Metros = DecimalUtil.ZERO ;
      sV10AlbRUniDis = DecimalUtil.ZERO ;
      OV10AlbRUniDis = DecimalUtil.ZERO ;
      A2155AlbRecKgm = DecimalUtil.ZERO ;
      A2157AlbRecMtr = DecimalUtil.ZERO ;
      A2156AlbRecKgmU = DecimalUtil.ZERO ;
      A2158AlbRecMtrU = DecimalUtil.ZERO ;
      A3067DevPieUni = DecimalUtil.ZERO ;
      T3067DevPieUni = DecimalUtil.ZERO ;
      T2156AlbRecKgmU = DecimalUtil.ZERO ;
      T2158AlbRecMtrU = DecimalUtil.ZERO ;
      AV24Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV7EmprNom = "" ;
      AV8UsurCod = "" ;
      Z407EmprNom = "" ;
      Z3066AlbDevPUni = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z329DevTrnNom = "" ;
      T01OU10_A407EmprNom = new String[] {""} ;
      T01OU10_n407EmprNom = new boolean[] {false} ;
      T01OU14_A329DevTrnNom = new String[] {""} ;
      T01OU14_n329DevTrnNom = new boolean[] {false} ;
      T01OU18_A323DevGenCod = new int[1] ;
      T01OU18_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU18_n328DevGenUni = new boolean[] {false} ;
      T01OU18_A326DevGenPie = new short[1] ;
      T01OU18_n326DevGenPie = new boolean[] {false} ;
      T01OU18_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU18_A54AlbRPieUti = new int[1] ;
      T01OU18_A47AlbREst = new byte[1] ;
      T01OU18_A407EmprNom = new String[] {""} ;
      T01OU18_n407EmprNom = new boolean[] {false} ;
      T01OU18_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OU18_n325DevGenFec = new boolean[] {false} ;
      T01OU18_A6288DevGenDom = new byte[1] ;
      T01OU18_n6288DevGenDom = new boolean[] {false} ;
      T01OU18_A252CliCod = new int[1] ;
      T01OU18_n252CliCod = new boolean[] {false} ;
      T01OU18_A279CliNom = new String[] {""} ;
      T01OU18_A45AlbRef = new String[] {""} ;
      T01OU18_A329DevTrnNom = new String[] {""} ;
      T01OU18_n329DevTrnNom = new boolean[] {false} ;
      T01OU18_A56AlbRUni = new String[] {""} ;
      T01OU18_A52AlbRPieEnt = new int[1] ;
      T01OU18_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU18_A324DevGenEst = new byte[1] ;
      T01OU18_n324DevGenEst = new boolean[] {false} ;
      T01OU18_A1304DevUlin = new byte[1] ;
      T01OU18_n1304DevUlin = new boolean[] {false} ;
      T01OU18_A396EmprCod = new String[] {""} ;
      T01OU18_A44AlbRecCod = new int[1] ;
      T01OU18_n44AlbRecCod = new boolean[] {false} ;
      T01OU18_A327DevGenTrn = new short[1] ;
      T01OU18_n327DevGenTrn = new boolean[] {false} ;
      T01OU18_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU18_A5278AlbDevPPie = new short[1] ;
      T01OU12_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU12_A54AlbRPieUti = new int[1] ;
      T01OU12_A47AlbREst = new byte[1] ;
      T01OU12_A252CliCod = new int[1] ;
      T01OU12_n252CliCod = new boolean[] {false} ;
      T01OU12_A45AlbRef = new String[] {""} ;
      T01OU12_A56AlbRUni = new String[] {""} ;
      T01OU12_A52AlbRPieEnt = new int[1] ;
      T01OU12_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU13_A279CliNom = new String[] {""} ;
      T01OU16_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU16_A5278AlbDevPPie = new short[1] ;
      T01OU19_A279CliNom = new String[] {""} ;
      T01OU20_A329DevTrnNom = new String[] {""} ;
      T01OU20_n329DevTrnNom = new boolean[] {false} ;
      T01OU22_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU22_A5278AlbDevPPie = new short[1] ;
      T01OU23_A396EmprCod = new String[] {""} ;
      T01OU23_A323DevGenCod = new int[1] ;
      T01OU9_A323DevGenCod = new int[1] ;
      T01OU9_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU9_n328DevGenUni = new boolean[] {false} ;
      T01OU9_A326DevGenPie = new short[1] ;
      T01OU9_n326DevGenPie = new boolean[] {false} ;
      T01OU9_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OU9_n325DevGenFec = new boolean[] {false} ;
      T01OU9_A6288DevGenDom = new byte[1] ;
      T01OU9_n6288DevGenDom = new boolean[] {false} ;
      T01OU9_A324DevGenEst = new byte[1] ;
      T01OU9_n324DevGenEst = new boolean[] {false} ;
      T01OU9_A1304DevUlin = new byte[1] ;
      T01OU9_n1304DevUlin = new boolean[] {false} ;
      T01OU9_A396EmprCod = new String[] {""} ;
      T01OU9_A44AlbRecCod = new int[1] ;
      T01OU9_n44AlbRecCod = new boolean[] {false} ;
      T01OU9_A327DevGenTrn = new short[1] ;
      T01OU9_n327DevGenTrn = new boolean[] {false} ;
      T01OU9_A252CliCod = new int[1] ;
      T01OU9_n252CliCod = new boolean[] {false} ;
      sMode31 = "" ;
      T01OU24_A396EmprCod = new String[] {""} ;
      T01OU24_A323DevGenCod = new int[1] ;
      T01OU25_A396EmprCod = new String[] {""} ;
      T01OU25_A323DevGenCod = new int[1] ;
      T01OU8_A323DevGenCod = new int[1] ;
      T01OU8_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU8_n328DevGenUni = new boolean[] {false} ;
      T01OU8_A326DevGenPie = new short[1] ;
      T01OU8_n326DevGenPie = new boolean[] {false} ;
      T01OU8_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01OU8_n325DevGenFec = new boolean[] {false} ;
      T01OU8_A6288DevGenDom = new byte[1] ;
      T01OU8_n6288DevGenDom = new boolean[] {false} ;
      T01OU8_A324DevGenEst = new byte[1] ;
      T01OU8_n324DevGenEst = new boolean[] {false} ;
      T01OU8_A1304DevUlin = new byte[1] ;
      T01OU8_n1304DevUlin = new boolean[] {false} ;
      T01OU8_A396EmprCod = new String[] {""} ;
      T01OU8_A44AlbRecCod = new int[1] ;
      T01OU8_n44AlbRecCod = new boolean[] {false} ;
      T01OU8_A327DevGenTrn = new short[1] ;
      T01OU8_n327DevGenTrn = new boolean[] {false} ;
      T01OU8_A252CliCod = new int[1] ;
      T01OU8_n252CliCod = new boolean[] {false} ;
      T01OU26_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU26_A54AlbRPieUti = new int[1] ;
      T01OU26_A47AlbREst = new byte[1] ;
      T01OU26_A252CliCod = new int[1] ;
      T01OU26_n252CliCod = new boolean[] {false} ;
      T01OU26_A45AlbRef = new String[] {""} ;
      T01OU26_A56AlbRUni = new String[] {""} ;
      T01OU26_A52AlbRPieEnt = new int[1] ;
      T01OU26_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU31_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU31_A5278AlbDevPPie = new short[1] ;
      T01OU32_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU32_A54AlbRPieUti = new int[1] ;
      T01OU32_A47AlbREst = new byte[1] ;
      T01OU32_A252CliCod = new int[1] ;
      T01OU32_n252CliCod = new boolean[] {false} ;
      T01OU32_A45AlbRef = new String[] {""} ;
      T01OU32_A56AlbRUni = new String[] {""} ;
      T01OU32_A52AlbRPieEnt = new int[1] ;
      T01OU32_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU33_A279CliNom = new String[] {""} ;
      T01OU34_A329DevTrnNom = new String[] {""} ;
      T01OU34_n329DevTrnNom = new boolean[] {false} ;
      T01OU38_A396EmprCod = new String[] {""} ;
      T01OU38_A323DevGenCod = new int[1] ;
      Z2158AlbRecMtrU = DecimalUtil.ZERO ;
      Z2156AlbRecKgmU = DecimalUtil.ZERO ;
      T01OU39_A4795AlRPieCal = new String[] {""} ;
      T01OU39_A323DevGenCod = new int[1] ;
      T01OU39_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU39_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU39_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU39_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU39_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU39_A396EmprCod = new String[] {""} ;
      T01OU39_A2159AlbRecPie = new String[] {""} ;
      T01OU39_A44AlbRecCod = new int[1] ;
      T01OU39_n44AlbRecCod = new boolean[] {false} ;
      O56AlbRUni = "" ;
      T01OU7_A4795AlRPieCal = new String[] {""} ;
      T01OU7_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU7_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU7_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU7_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU7_A44AlbRecCod = new int[1] ;
      T01OU7_n44AlbRecCod = new boolean[] {false} ;
      T01OU40_A396EmprCod = new String[] {""} ;
      T01OU40_A323DevGenCod = new int[1] ;
      T01OU40_A2159AlbRecPie = new String[] {""} ;
      T01OU5_A323DevGenCod = new int[1] ;
      T01OU5_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU5_A396EmprCod = new String[] {""} ;
      T01OU5_A2159AlbRecPie = new String[] {""} ;
      T01OU4_A323DevGenCod = new int[1] ;
      T01OU4_A3067DevPieUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU4_A396EmprCod = new String[] {""} ;
      T01OU4_A2159AlbRecPie = new String[] {""} ;
      T01OU41_A4795AlRPieCal = new String[] {""} ;
      T01OU41_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU41_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU41_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU41_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU41_A44AlbRecCod = new int[1] ;
      T01OU41_n44AlbRecCod = new boolean[] {false} ;
      T01OU45_A4795AlRPieCal = new String[] {""} ;
      T01OU45_A2158AlbRecMtrU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU45_A2156AlbRecKgmU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU45_A2155AlbRecKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU45_A2157AlbRecMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU47_A396EmprCod = new String[] {""} ;
      T01OU47_A323DevGenCod = new int[1] ;
      T01OU47_A2159AlbRecPie = new String[] {""} ;
      T01OU48_A323DevGenCod = new int[1] ;
      T01OU48_A1302DevLin = new byte[1] ;
      T01OU48_A1303DevObs = new String[] {""} ;
      T01OU48_A396EmprCod = new String[] {""} ;
      T01OU49_A396EmprCod = new String[] {""} ;
      T01OU49_A323DevGenCod = new int[1] ;
      T01OU49_A1302DevLin = new byte[1] ;
      T01OU3_A323DevGenCod = new int[1] ;
      T01OU3_A1302DevLin = new byte[1] ;
      T01OU3_A1303DevObs = new String[] {""} ;
      T01OU3_A396EmprCod = new String[] {""} ;
      T01OU2_A323DevGenCod = new int[1] ;
      T01OU2_A1302DevLin = new byte[1] ;
      T01OU2_A1303DevObs = new String[] {""} ;
      T01OU2_A396EmprCod = new String[] {""} ;
      T01OU53_A396EmprCod = new String[] {""} ;
      T01OU53_A323DevGenCod = new int[1] ;
      T01OU53_A1302DevLin = new byte[1] ;
      Gridtdevpiecopy1_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtdevpiecopy1_level1item_Linesclass = "" ;
      ROClassString = "" ;
      Gridtdevpiecopy1_level2itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtdevpiecopy1_level2item_Linesclass = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV20Modo = "" ;
      i325DevGenFec = GXutil.nullDate() ;
      Gridtdevpiecopy1_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      Gridtdevpiecopy1_level2itemColumn = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T01OU54_A396EmprCod = new String[] {""} ;
      T01OU54_A327DevGenTrn = new short[1] ;
      T01OU54_n327DevGenTrn = new boolean[] {false} ;
      T01OU54_A329DevTrnNom = new String[] {""} ;
      T01OU54_n329DevTrnNom = new boolean[] {false} ;
      T01OU55_A407EmprNom = new String[] {""} ;
      T01OU55_n407EmprNom = new boolean[] {false} ;
      T01OU57_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU57_A5278AlbDevPPie = new short[1] ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV61oldDevGenFec = GXutil.nullDate() ;
      ZV13AlbRUni = "" ;
      ZV10AlbRUniDis = DecimalUtil.ZERO ;
      ZV12AlbRUDis = DecimalUtil.ZERO ;
      ZV65Err_att = "" ;
      T01OU59_A3066AlbDevPUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU59_A5278AlbDevPPie = new short[1] ;
      ZZ396EmprCod = "" ;
      ZZ328DevGenUni = DecimalUtil.ZERO ;
      ZZ407EmprNom = "" ;
      ZZ325DevGenFec = GXutil.nullDate() ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ45AlbRef = "" ;
      ZZ56AlbRUni = "" ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ279CliNom = "" ;
      ZZ329DevTrnNom = "" ;
      ZZ3066AlbDevPUni = DecimalUtil.ZERO ;
      ZZV61oldDevGenFec = GXutil.nullDate() ;
      ZZV13AlbRUni = "" ;
      ZZV10AlbRUniDis = DecimalUtil.ZERO ;
      ZZV12AlbRUDis = DecimalUtil.ZERO ;
      ZZV65Err_att = "" ;
      ZO328DevGenUni = DecimalUtil.ZERO ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      ZO3066AlbDevPUni = DecimalUtil.ZERO ;
      ZO325DevGenFec = GXutil.nullDate() ;
      T01OU60_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU60_A54AlbRPieUti = new int[1] ;
      T01OU60_A47AlbREst = new byte[1] ;
      T01OU60_A252CliCod = new int[1] ;
      T01OU60_n252CliCod = new boolean[] {false} ;
      T01OU60_A45AlbRef = new String[] {""} ;
      T01OU60_A56AlbRUni = new String[] {""} ;
      T01OU60_A52AlbRPieEnt = new int[1] ;
      T01OU60_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01OU61_A279CliNom = new String[] {""} ;
      GXv_int6 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int5 = new int[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char3 = new String[1] ;
      T01OU62_A329DevTrnNom = new String[] {""} ;
      T01OU62_n329DevTrnNom = new boolean[] {false} ;
      ZO2158AlbRecMtrU = DecimalUtil.ZERO ;
      ZO2156AlbRecKgmU = DecimalUtil.ZERO ;
      ZV14KilAnt = DecimalUtil.ZERO ;
      ZV15MetAnt = DecimalUtil.ZERO ;
      ZV17Kilos = DecimalUtil.ZERO ;
      ZV18Metros = DecimalUtil.ZERO ;
      ZV63oldUni = DecimalUtil.ZERO ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevpiecopy1__default(),
         new Object[] {
             new Object[] {
            T01OU2_A323DevGenCod, T01OU2_A1302DevLin, T01OU2_A1303DevObs, T01OU2_A396EmprCod
            }
            , new Object[] {
            T01OU3_A323DevGenCod, T01OU3_A1302DevLin, T01OU3_A1303DevObs, T01OU3_A396EmprCod
            }
            , new Object[] {
            T01OU4_A323DevGenCod, T01OU4_A3067DevPieUni, T01OU4_A396EmprCod, T01OU4_A2159AlbRecPie
            }
            , new Object[] {
            T01OU5_A323DevGenCod, T01OU5_A3067DevPieUni, T01OU5_A396EmprCod, T01OU5_A2159AlbRecPie
            }
            , new Object[] {
            T01OU6_A4795AlRPieCal, T01OU6_A2158AlbRecMtrU, T01OU6_A2156AlbRecKgmU, T01OU6_A2155AlbRecKgm, T01OU6_A2157AlbRecMtr, T01OU6_A44AlbRecCod
            }
            , new Object[] {
            T01OU7_A4795AlRPieCal, T01OU7_A2158AlbRecMtrU, T01OU7_A2156AlbRecKgmU, T01OU7_A2155AlbRecKgm, T01OU7_A2157AlbRecMtr, T01OU7_A44AlbRecCod
            }
            , new Object[] {
            T01OU8_A323DevGenCod, T01OU8_A328DevGenUni, T01OU8_n328DevGenUni, T01OU8_A326DevGenPie, T01OU8_n326DevGenPie, T01OU8_A325DevGenFec, T01OU8_n325DevGenFec, T01OU8_A6288DevGenDom, T01OU8_n6288DevGenDom, T01OU8_A324DevGenEst,
            T01OU8_n324DevGenEst, T01OU8_A1304DevUlin, T01OU8_n1304DevUlin, T01OU8_A396EmprCod, T01OU8_A44AlbRecCod, T01OU8_n44AlbRecCod, T01OU8_A327DevGenTrn, T01OU8_n327DevGenTrn, T01OU8_A252CliCod, T01OU8_n252CliCod
            }
            , new Object[] {
            T01OU9_A323DevGenCod, T01OU9_A328DevGenUni, T01OU9_n328DevGenUni, T01OU9_A326DevGenPie, T01OU9_n326DevGenPie, T01OU9_A325DevGenFec, T01OU9_n325DevGenFec, T01OU9_A6288DevGenDom, T01OU9_n6288DevGenDom, T01OU9_A324DevGenEst,
            T01OU9_n324DevGenEst, T01OU9_A1304DevUlin, T01OU9_n1304DevUlin, T01OU9_A396EmprCod, T01OU9_A44AlbRecCod, T01OU9_n44AlbRecCod, T01OU9_A327DevGenTrn, T01OU9_n327DevGenTrn, T01OU9_A252CliCod, T01OU9_n252CliCod
            }
            , new Object[] {
            T01OU10_A407EmprNom, T01OU10_n407EmprNom
            }
            , new Object[] {
            T01OU11_A60AlbRUniUti, T01OU11_A54AlbRPieUti, T01OU11_A47AlbREst, T01OU11_A252CliCod, T01OU11_A45AlbRef, T01OU11_A56AlbRUni, T01OU11_A52AlbRPieEnt, T01OU11_A58AlbRUniEnt
            }
            , new Object[] {
            T01OU12_A60AlbRUniUti, T01OU12_A54AlbRPieUti, T01OU12_A47AlbREst, T01OU12_A252CliCod, T01OU12_A45AlbRef, T01OU12_A56AlbRUni, T01OU12_A52AlbRPieEnt, T01OU12_A58AlbRUniEnt
            }
            , new Object[] {
            T01OU13_A279CliNom
            }
            , new Object[] {
            T01OU14_A329DevTrnNom, T01OU14_n329DevTrnNom
            }
            , new Object[] {
            T01OU16_A3066AlbDevPUni, T01OU16_A5278AlbDevPPie
            }
            , new Object[] {
            T01OU18_A323DevGenCod, T01OU18_A328DevGenUni, T01OU18_n328DevGenUni, T01OU18_A326DevGenPie, T01OU18_n326DevGenPie, T01OU18_A60AlbRUniUti, T01OU18_A54AlbRPieUti, T01OU18_A47AlbREst, T01OU18_A407EmprNom, T01OU18_n407EmprNom,
            T01OU18_A325DevGenFec, T01OU18_n325DevGenFec, T01OU18_A6288DevGenDom, T01OU18_n6288DevGenDom, T01OU18_A252CliCod, T01OU18_n252CliCod, T01OU18_A279CliNom, T01OU18_A45AlbRef, T01OU18_A329DevTrnNom, T01OU18_n329DevTrnNom,
            T01OU18_A56AlbRUni, T01OU18_A52AlbRPieEnt, T01OU18_A58AlbRUniEnt, T01OU18_A324DevGenEst, T01OU18_n324DevGenEst, T01OU18_A1304DevUlin, T01OU18_n1304DevUlin, T01OU18_A396EmprCod, T01OU18_A44AlbRecCod, T01OU18_n44AlbRecCod,
            T01OU18_A327DevGenTrn, T01OU18_n327DevGenTrn, T01OU18_A3066AlbDevPUni, T01OU18_A5278AlbDevPPie
            }
            , new Object[] {
            T01OU19_A279CliNom
            }
            , new Object[] {
            T01OU20_A329DevTrnNom, T01OU20_n329DevTrnNom
            }
            , new Object[] {
            T01OU22_A3066AlbDevPUni, T01OU22_A5278AlbDevPPie
            }
            , new Object[] {
            T01OU23_A396EmprCod, T01OU23_A323DevGenCod
            }
            , new Object[] {
            T01OU24_A396EmprCod, T01OU24_A323DevGenCod
            }
            , new Object[] {
            T01OU25_A396EmprCod, T01OU25_A323DevGenCod
            }
            , new Object[] {
            T01OU26_A60AlbRUniUti, T01OU26_A54AlbRPieUti, T01OU26_A47AlbREst, T01OU26_A252CliCod, T01OU26_A45AlbRef, T01OU26_A56AlbRUni, T01OU26_A52AlbRPieEnt, T01OU26_A58AlbRUniEnt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OU31_A3066AlbDevPUni, T01OU31_A5278AlbDevPPie
            }
            , new Object[] {
            T01OU32_A60AlbRUniUti, T01OU32_A54AlbRPieUti, T01OU32_A47AlbREst, T01OU32_A252CliCod, T01OU32_A45AlbRef, T01OU32_A56AlbRUni, T01OU32_A52AlbRPieEnt, T01OU32_A58AlbRUniEnt
            }
            , new Object[] {
            T01OU33_A279CliNom
            }
            , new Object[] {
            T01OU34_A329DevTrnNom, T01OU34_n329DevTrnNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OU38_A396EmprCod, T01OU38_A323DevGenCod
            }
            , new Object[] {
            T01OU39_A4795AlRPieCal, T01OU39_A323DevGenCod, T01OU39_A3067DevPieUni, T01OU39_A2158AlbRecMtrU, T01OU39_A2156AlbRecKgmU, T01OU39_A2155AlbRecKgm, T01OU39_A2157AlbRecMtr, T01OU39_A396EmprCod, T01OU39_A2159AlbRecPie, T01OU39_A44AlbRecCod
            }
            , new Object[] {
            T01OU40_A396EmprCod, T01OU40_A323DevGenCod, T01OU40_A2159AlbRecPie
            }
            , new Object[] {
            T01OU41_A4795AlRPieCal, T01OU41_A2158AlbRecMtrU, T01OU41_A2156AlbRecKgmU, T01OU41_A2155AlbRecKgm, T01OU41_A2157AlbRecMtr, T01OU41_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OU45_A4795AlRPieCal, T01OU45_A2158AlbRecMtrU, T01OU45_A2156AlbRecKgmU, T01OU45_A2155AlbRecKgm, T01OU45_A2157AlbRecMtr
            }
            , new Object[] {
            }
            , new Object[] {
            T01OU47_A396EmprCod, T01OU47_A323DevGenCod, T01OU47_A2159AlbRecPie
            }
            , new Object[] {
            T01OU48_A323DevGenCod, T01OU48_A1302DevLin, T01OU48_A1303DevObs, T01OU48_A396EmprCod
            }
            , new Object[] {
            T01OU49_A396EmprCod, T01OU49_A323DevGenCod, T01OU49_A1302DevLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OU53_A396EmprCod, T01OU53_A323DevGenCod, T01OU53_A1302DevLin
            }
            , new Object[] {
            T01OU54_A396EmprCod, T01OU54_A327DevGenTrn, T01OU54_A329DevTrnNom, T01OU54_n329DevTrnNom
            }
            , new Object[] {
            T01OU55_A407EmprNom, T01OU55_n407EmprNom
            }
            , new Object[] {
            T01OU57_A3066AlbDevPUni, T01OU57_A5278AlbDevPPie
            }
            , new Object[] {
            T01OU59_A3066AlbDevPUni, T01OU59_A5278AlbDevPPie
            }
            , new Object[] {
            T01OU60_A60AlbRUniUti, T01OU60_A54AlbRPieUti, T01OU60_A47AlbREst, T01OU60_A252CliCod, T01OU60_A45AlbRef, T01OU60_A56AlbRUni, T01OU60_A52AlbRPieEnt, T01OU60_A58AlbRUniEnt
            }
            , new Object[] {
            T01OU61_A279CliNom
            }
            , new Object[] {
            T01OU62_A329DevTrnNom, T01OU62_n329DevTrnNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      O325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      i325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
   }

   private byte Z6288DevGenDom ;
   private byte Z324DevGenEst ;
   private byte Z1304DevUlin ;
   private byte Z47AlbREst ;
   private byte O1304DevUlin ;
   private byte Z1302DevLin ;
   private byte GxWebError ;
   private byte A6288DevGenDom ;
   private byte nKeyPressed ;
   private byte A1304DevUlin ;
   private byte Gx_BScreen ;
   private byte B1304DevUlin ;
   private byte A324DevGenEst ;
   private byte A47AlbREst ;
   private byte s1304DevUlin ;
   private byte A1302DevLin ;
   private byte s47AlbREst ;
   private byte O47AlbREst ;
   private byte subGridtdevpiecopy1_level1item_Backcolorstyle ;
   private byte subGridtdevpiecopy1_level1item_Backstyle ;
   private byte subGridtdevpiecopy1_level2item_Backcolorstyle ;
   private byte subGridtdevpiecopy1_level2item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i1304DevUlin ;
   private byte subGridtdevpiecopy1_level1item_Allowselection ;
   private byte subGridtdevpiecopy1_level1item_Allowhovering ;
   private byte subGridtdevpiecopy1_level1item_Allowcollapsing ;
   private byte subGridtdevpiecopy1_level1item_Collapsed ;
   private byte subGridtdevpiecopy1_level2item_Allowselection ;
   private byte subGridtdevpiecopy1_level2item_Allowhovering ;
   private byte subGridtdevpiecopy1_level2item_Allowcollapsing ;
   private byte subGridtdevpiecopy1_level2item_Collapsed ;
   private byte ZZ6288DevGenDom ;
   private byte ZZ324DevGenEst ;
   private byte ZZ1304DevUlin ;
   private byte ZZ47AlbREst ;
   private byte ZO1304DevUlin ;
   private byte GXv_int10[] ;
   private short Z326DevGenPie ;
   private short Z327DevGenTrn ;
   private short O326DevGenPie ;
   private short O5278AlbDevPPie ;
   private short nRcdDeleted_451 ;
   private short nRcdExists_451 ;
   private short nIsMod_451 ;
   private short nRcdDeleted_192 ;
   private short nRcdExists_192 ;
   private short nIsMod_192 ;
   private short A327DevGenTrn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A326DevGenPie ;
   private short nBlankRcdCount451 ;
   private short RcdFound451 ;
   private short B326DevGenPie ;
   private short B5278AlbDevPPie ;
   private short A5278AlbDevPPie ;
   private short nBlankRcdUsr451 ;
   private short nBlankRcdCount192 ;
   private short RcdFound192 ;
   private short nBlankRcdUsr192 ;
   private short AV16PieAnt ;
   private short AV19Piezas ;
   private short s326DevGenPie ;
   private short s5278AlbDevPPie ;
   private short sV16PieAnt ;
   private short OV16PieAnt ;
   private short sV19Piezas ;
   private short OV19Piezas ;
   private short AV58AlbRecAnh ;
   private short Z5278AlbDevPPie ;
   private short RcdFound31 ;
   private short nIsDirty_31 ;
   private short nIsDirty_451 ;
   private short nIsDirty_192 ;
   private short i326DevGenPie ;
   private short ZZ326DevGenPie ;
   private short ZZ327DevGenTrn ;
   private short ZZ5278AlbDevPPie ;
   private short ZO326DevGenPie ;
   private short ZO5278AlbDevPPie ;
   private int Z323DevGenCod ;
   private int Z44AlbRecCod ;
   private int Z252CliCod ;
   private int Z52AlbRPieEnt ;
   private int O54AlbRPieUti ;
   private int nRC_GXsfl_94 ;
   private int nGXsfl_94_idx=1 ;
   private int nRC_GXsfl_112 ;
   private int nGXsfl_112_idx=1 ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int A51AlbRPieDis ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDevGenCod_Enabled ;
   private int edtDevGenFec_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtDevGenDom_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtDevGenUni_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int edtDevGenPie_Enabled ;
   private int edtAlbRPieDis_Enabled ;
   private int bttSeleccionarpiezas_Visible ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int B54AlbRPieUti ;
   private int A54AlbRPieUti ;
   private int edtAlbRecPie_Enabled ;
   private int edtAlbRecKgm_Enabled ;
   private int edtAlbRecMtr_Enabled ;
   private int edtAlbRecKgmU_Enabled ;
   private int edtAlbRecMtrU_Enabled ;
   private int edtDevPieUni_Enabled ;
   private int fRowAdded ;
   private int edtDevLin_Enabled ;
   private int edtDevObs_Enabled ;
   private int A52AlbRPieEnt ;
   private int AV9AlbRPieDis ;
   private int AV11AlbRPDis ;
   private int s54AlbRPieUti ;
   private int sV9AlbRPieDis ;
   private int OV9AlbRPieDis ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int subGridtdevpiecopy1_level1item_Backcolor ;
   private int subGridtdevpiecopy1_level1item_Allbackcolor ;
   private int subGridtdevpiecopy1_level2item_Backcolor ;
   private int subGridtdevpiecopy1_level2item_Allbackcolor ;
   private int defedtDevLin_Enabled ;
   private int defedtAlbRecMtrU_Enabled ;
   private int defedtAlbRecKgmU_Enabled ;
   private int defedtAlbRecPie_Enabled ;
   private int i54AlbRPieUti ;
   private int idxLst ;
   private int subGridtdevpiecopy1_level1item_Selectedindex ;
   private int subGridtdevpiecopy1_level1item_Selectioncolor ;
   private int subGridtdevpiecopy1_level1item_Hoveringcolor ;
   private int subGridtdevpiecopy1_level2item_Selectedindex ;
   private int subGridtdevpiecopy1_level2item_Selectioncolor ;
   private int subGridtdevpiecopy1_level2item_Hoveringcolor ;
   private int gxdynajaxindex ;
   private int Z51AlbRPieDis ;
   private int ZV9AlbRPieDis ;
   private int ZV11AlbRPDis ;
   private int ZZ323DevGenCod ;
   private int ZZ44AlbRecCod ;
   private int ZZ54AlbRPieUti ;
   private int ZZ252CliCod ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ51AlbRPieDis ;
   private int ZZV9AlbRPieDis ;
   private int ZZV11AlbRPDis ;
   private int ZO54AlbRPieUti ;
   private int GXv_int6[] ;
   private int GXv_int5[] ;
   private int GXv_int8[] ;
   private long GRIDTDEVPIECOPY1_LEVEL1ITEM_nFirstRecordOnPage ;
   private long GRIDTDEVPIECOPY1_LEVEL2ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z328DevGenUni ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O328DevGenUni ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal O3066AlbDevPUni ;
   private java.math.BigDecimal Z3067DevPieUni ;
   private java.math.BigDecimal Z2155AlbRecKgm ;
   private java.math.BigDecimal Z2157AlbRecMtr ;
   private java.math.BigDecimal O3067DevPieUni ;
   private java.math.BigDecimal O2156AlbRecKgmU ;
   private java.math.BigDecimal O2158AlbRecMtrU ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal B328DevGenUni ;
   private java.math.BigDecimal B60AlbRUniUti ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal B3066AlbDevPUni ;
   private java.math.BigDecimal A3066AlbDevPUni ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal AV10AlbRUniDis ;
   private java.math.BigDecimal AV14KilAnt ;
   private java.math.BigDecimal AV15MetAnt ;
   private java.math.BigDecimal AV17Kilos ;
   private java.math.BigDecimal AV18Metros ;
   private java.math.BigDecimal AV12AlbRUDis ;
   private java.math.BigDecimal AV63oldUni ;
   private java.math.BigDecimal s328DevGenUni ;
   private java.math.BigDecimal s60AlbRUniUti ;
   private java.math.BigDecimal s3066AlbDevPUni ;
   private java.math.BigDecimal sV14KilAnt ;
   private java.math.BigDecimal OV14KilAnt ;
   private java.math.BigDecimal sV15MetAnt ;
   private java.math.BigDecimal OV15MetAnt ;
   private java.math.BigDecimal sV17Kilos ;
   private java.math.BigDecimal OV17Kilos ;
   private java.math.BigDecimal sV18Metros ;
   private java.math.BigDecimal OV18Metros ;
   private java.math.BigDecimal sV10AlbRUniDis ;
   private java.math.BigDecimal OV10AlbRUniDis ;
   private java.math.BigDecimal A2155AlbRecKgm ;
   private java.math.BigDecimal A2157AlbRecMtr ;
   private java.math.BigDecimal A2156AlbRecKgmU ;
   private java.math.BigDecimal A2158AlbRecMtrU ;
   private java.math.BigDecimal A3067DevPieUni ;
   private java.math.BigDecimal T3067DevPieUni ;
   private java.math.BigDecimal T2156AlbRecKgmU ;
   private java.math.BigDecimal T2158AlbRecMtrU ;
   private java.math.BigDecimal Z3066AlbDevPUni ;
   private java.math.BigDecimal Z2158AlbRecMtrU ;
   private java.math.BigDecimal Z2156AlbRecKgmU ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZV10AlbRUniDis ;
   private java.math.BigDecimal ZV12AlbRUDis ;
   private java.math.BigDecimal ZZ328DevGenUni ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private java.math.BigDecimal ZZ3066AlbDevPUni ;
   private java.math.BigDecimal ZZV10AlbRUniDis ;
   private java.math.BigDecimal ZZV12AlbRUDis ;
   private java.math.BigDecimal ZO328DevGenUni ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private java.math.BigDecimal ZO3066AlbDevPUni ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal ZO2158AlbRecMtrU ;
   private java.math.BigDecimal ZO2156AlbRecKgmU ;
   private java.math.BigDecimal ZV14KilAnt ;
   private java.math.BigDecimal ZV15MetAnt ;
   private java.math.BigDecimal ZV17Kilos ;
   private java.math.BigDecimal ZV18Metros ;
   private java.math.BigDecimal ZV63oldUni ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z45AlbRef ;
   private String Z56AlbRUni ;
   private String Z2159AlbRecPie ;
   private String Z4795AlRPieCal ;
   private String Z1303DevObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV13AlbRUni ;
   private String AV65Err_att ;
   private String A2159AlbRecPie ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevGenCod_Internalname ;
   private String sGXsfl_94_idx="0001" ;
   private String Gx_mode ;
   private String sGXsfl_112_idx="0001" ;
   private String A56AlbRUni ;
   private String divTablemain_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
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
   private String edtDevGenCod_Jsonclick ;
   private String edtDevGenFec_Internalname ;
   private String edtDevGenFec_Jsonclick ;
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtDevGenDom_Internalname ;
   private String edtDevGenDom_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String edtDevGenUni_Internalname ;
   private String edtDevGenUni_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtDevGenPie_Internalname ;
   private String edtDevGenPie_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String sStyleString ;
   private String tblTable1_Internalname ;
   private String bttSeleccionarpiezas_Internalname ;
   private String bttSeleccionarpiezas_Jsonclick ;
   private String lblTitlelevel2_Internalname ;
   private String lblTitlelevel2_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode451 ;
   private String edtAlbRecPie_Internalname ;
   private String edtAlbRecKgm_Internalname ;
   private String edtAlbRecMtr_Internalname ;
   private String edtAlbRecKgmU_Internalname ;
   private String edtAlbRecMtrU_Internalname ;
   private String edtDevPieUni_Internalname ;
   private String subGridtdevpiecopy1_level1item_Internalname ;
   private String sMode192 ;
   private String edtDevLin_Internalname ;
   private String edtDevObs_Internalname ;
   private String subGridtdevpiecopy1_level2item_Internalname ;
   private String AV20Modo ;
   private String A407EmprNom ;
   private String A329DevTrnNom ;
   private String A4795AlRPieCal ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1303DevObs ;
   private String AV24Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV7EmprNom ;
   private String AV8UsurCod ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z329DevTrnNom ;
   private String sMode31 ;
   private String O56AlbRUni ;
   private String sGXsfl_94_fel_idx="0001" ;
   private String subGridtdevpiecopy1_level1item_Class ;
   private String subGridtdevpiecopy1_level1item_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecPie_Jsonclick ;
   private String edtAlbRecKgm_Jsonclick ;
   private String edtAlbRecMtr_Jsonclick ;
   private String edtAlbRecKgmU_Jsonclick ;
   private String edtAlbRecMtrU_Jsonclick ;
   private String edtDevPieUni_Jsonclick ;
   private String sGXsfl_112_fel_idx="0001" ;
   private String subGridtdevpiecopy1_level2item_Class ;
   private String subGridtdevpiecopy1_level2item_Linesclass ;
   private String edtDevLin_Jsonclick ;
   private String edtDevObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV20Modo ;
   private String subGridtdevpiecopy1_level1item_Header ;
   private String subGridtdevpiecopy1_level2item_Header ;
   private String gxwrpcisep ;
   private String ZV13AlbRUni ;
   private String ZV65Err_att ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ45AlbRef ;
   private String ZZ56AlbRUni ;
   private String ZZ279CliNom ;
   private String ZZ329DevTrnNom ;
   private String ZZV13AlbRUni ;
   private String ZZV65Err_att ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z325DevGenFec ;
   private java.util.Date O325DevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date B325DevGenFec ;
   private java.util.Date AV61oldDevGenFec ;
   private java.util.Date i325DevGenFec ;
   private java.util.Date ZV61oldDevGenFec ;
   private java.util.Date ZZ325DevGenFec ;
   private java.util.Date ZZV61oldDevGenFec ;
   private java.util.Date ZO325DevGenFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n252CliCod ;
   private boolean n6288DevGenDom ;
   private boolean n327DevGenTrn ;
   private boolean wbErr ;
   private boolean n326DevGenPie ;
   private boolean n1304DevUlin ;
   private boolean n328DevGenUni ;
   private boolean n325DevGenFec ;
   private boolean bGXsfl_94_Refreshing=false ;
   private boolean bGXsfl_112_Refreshing=false ;
   private boolean n324DevGenEst ;
   private boolean n407EmprNom ;
   private boolean n329DevTrnNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean gxdyncontrolsrefreshing ;
   private com.genexus.webpanels.GXWebGrid Gridtdevpiecopy1_level1itemContainer ;
   private com.genexus.webpanels.GXWebGrid Gridtdevpiecopy1_level2itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtdevpiecopy1_level1itemRow ;
   private com.genexus.webpanels.GXWebRow Gridtdevpiecopy1_level2itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtdevpiecopy1_level1itemColumn ;
   private com.genexus.webpanels.GXWebColumn Gridtdevpiecopy1_level2itemColumn ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice dynDevGenTrn ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] T01OU10_A407EmprNom ;
   private boolean[] T01OU10_n407EmprNom ;
   private String[] T01OU14_A329DevTrnNom ;
   private boolean[] T01OU14_n329DevTrnNom ;
   private int[] T01OU18_A323DevGenCod ;
   private java.math.BigDecimal[] T01OU18_A328DevGenUni ;
   private boolean[] T01OU18_n328DevGenUni ;
   private short[] T01OU18_A326DevGenPie ;
   private boolean[] T01OU18_n326DevGenPie ;
   private java.math.BigDecimal[] T01OU18_A60AlbRUniUti ;
   private int[] T01OU18_A54AlbRPieUti ;
   private byte[] T01OU18_A47AlbREst ;
   private String[] T01OU18_A407EmprNom ;
   private boolean[] T01OU18_n407EmprNom ;
   private java.util.Date[] T01OU18_A325DevGenFec ;
   private boolean[] T01OU18_n325DevGenFec ;
   private byte[] T01OU18_A6288DevGenDom ;
   private boolean[] T01OU18_n6288DevGenDom ;
   private int[] T01OU18_A252CliCod ;
   private boolean[] T01OU18_n252CliCod ;
   private String[] T01OU18_A279CliNom ;
   private String[] T01OU18_A45AlbRef ;
   private String[] T01OU18_A329DevTrnNom ;
   private boolean[] T01OU18_n329DevTrnNom ;
   private String[] T01OU18_A56AlbRUni ;
   private int[] T01OU18_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01OU18_A58AlbRUniEnt ;
   private byte[] T01OU18_A324DevGenEst ;
   private boolean[] T01OU18_n324DevGenEst ;
   private byte[] T01OU18_A1304DevUlin ;
   private boolean[] T01OU18_n1304DevUlin ;
   private String[] T01OU18_A396EmprCod ;
   private int[] T01OU18_A44AlbRecCod ;
   private boolean[] T01OU18_n44AlbRecCod ;
   private short[] T01OU18_A327DevGenTrn ;
   private boolean[] T01OU18_n327DevGenTrn ;
   private java.math.BigDecimal[] T01OU18_A3066AlbDevPUni ;
   private short[] T01OU18_A5278AlbDevPPie ;
   private java.math.BigDecimal[] T01OU12_A60AlbRUniUti ;
   private int[] T01OU12_A54AlbRPieUti ;
   private byte[] T01OU12_A47AlbREst ;
   private int[] T01OU12_A252CliCod ;
   private boolean[] T01OU12_n252CliCod ;
   private String[] T01OU12_A45AlbRef ;
   private String[] T01OU12_A56AlbRUni ;
   private int[] T01OU12_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01OU12_A58AlbRUniEnt ;
   private String[] T01OU13_A279CliNom ;
   private java.math.BigDecimal[] T01OU16_A3066AlbDevPUni ;
   private short[] T01OU16_A5278AlbDevPPie ;
   private String[] T01OU19_A279CliNom ;
   private String[] T01OU20_A329DevTrnNom ;
   private boolean[] T01OU20_n329DevTrnNom ;
   private java.math.BigDecimal[] T01OU22_A3066AlbDevPUni ;
   private short[] T01OU22_A5278AlbDevPPie ;
   private String[] T01OU23_A396EmprCod ;
   private int[] T01OU23_A323DevGenCod ;
   private int[] T01OU9_A323DevGenCod ;
   private java.math.BigDecimal[] T01OU9_A328DevGenUni ;
   private boolean[] T01OU9_n328DevGenUni ;
   private short[] T01OU9_A326DevGenPie ;
   private boolean[] T01OU9_n326DevGenPie ;
   private java.util.Date[] T01OU9_A325DevGenFec ;
   private boolean[] T01OU9_n325DevGenFec ;
   private byte[] T01OU9_A6288DevGenDom ;
   private boolean[] T01OU9_n6288DevGenDom ;
   private byte[] T01OU9_A324DevGenEst ;
   private boolean[] T01OU9_n324DevGenEst ;
   private byte[] T01OU9_A1304DevUlin ;
   private boolean[] T01OU9_n1304DevUlin ;
   private String[] T01OU9_A396EmprCod ;
   private int[] T01OU9_A44AlbRecCod ;
   private boolean[] T01OU9_n44AlbRecCod ;
   private short[] T01OU9_A327DevGenTrn ;
   private boolean[] T01OU9_n327DevGenTrn ;
   private int[] T01OU9_A252CliCod ;
   private boolean[] T01OU9_n252CliCod ;
   private String[] T01OU24_A396EmprCod ;
   private int[] T01OU24_A323DevGenCod ;
   private String[] T01OU25_A396EmprCod ;
   private int[] T01OU25_A323DevGenCod ;
   private int[] T01OU8_A323DevGenCod ;
   private java.math.BigDecimal[] T01OU8_A328DevGenUni ;
   private boolean[] T01OU8_n328DevGenUni ;
   private short[] T01OU8_A326DevGenPie ;
   private boolean[] T01OU8_n326DevGenPie ;
   private java.util.Date[] T01OU8_A325DevGenFec ;
   private boolean[] T01OU8_n325DevGenFec ;
   private byte[] T01OU8_A6288DevGenDom ;
   private boolean[] T01OU8_n6288DevGenDom ;
   private byte[] T01OU8_A324DevGenEst ;
   private boolean[] T01OU8_n324DevGenEst ;
   private byte[] T01OU8_A1304DevUlin ;
   private boolean[] T01OU8_n1304DevUlin ;
   private String[] T01OU8_A396EmprCod ;
   private int[] T01OU8_A44AlbRecCod ;
   private boolean[] T01OU8_n44AlbRecCod ;
   private short[] T01OU8_A327DevGenTrn ;
   private boolean[] T01OU8_n327DevGenTrn ;
   private int[] T01OU8_A252CliCod ;
   private boolean[] T01OU8_n252CliCod ;
   private java.math.BigDecimal[] T01OU26_A60AlbRUniUti ;
   private int[] T01OU26_A54AlbRPieUti ;
   private byte[] T01OU26_A47AlbREst ;
   private int[] T01OU26_A252CliCod ;
   private boolean[] T01OU26_n252CliCod ;
   private String[] T01OU26_A45AlbRef ;
   private String[] T01OU26_A56AlbRUni ;
   private int[] T01OU26_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01OU26_A58AlbRUniEnt ;
   private java.math.BigDecimal[] T01OU31_A3066AlbDevPUni ;
   private short[] T01OU31_A5278AlbDevPPie ;
   private java.math.BigDecimal[] T01OU32_A60AlbRUniUti ;
   private int[] T01OU32_A54AlbRPieUti ;
   private byte[] T01OU32_A47AlbREst ;
   private int[] T01OU32_A252CliCod ;
   private boolean[] T01OU32_n252CliCod ;
   private String[] T01OU32_A45AlbRef ;
   private String[] T01OU32_A56AlbRUni ;
   private int[] T01OU32_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01OU32_A58AlbRUniEnt ;
   private String[] T01OU33_A279CliNom ;
   private String[] T01OU34_A329DevTrnNom ;
   private boolean[] T01OU34_n329DevTrnNom ;
   private String[] T01OU38_A396EmprCod ;
   private int[] T01OU38_A323DevGenCod ;
   private String[] T01OU39_A4795AlRPieCal ;
   private int[] T01OU39_A323DevGenCod ;
   private java.math.BigDecimal[] T01OU39_A3067DevPieUni ;
   private java.math.BigDecimal[] T01OU39_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01OU39_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01OU39_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01OU39_A2157AlbRecMtr ;
   private String[] T01OU39_A396EmprCod ;
   private String[] T01OU39_A2159AlbRecPie ;
   private int[] T01OU39_A44AlbRecCod ;
   private boolean[] T01OU39_n44AlbRecCod ;
   private String[] T01OU7_A4795AlRPieCal ;
   private java.math.BigDecimal[] T01OU7_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01OU7_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01OU7_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01OU7_A2157AlbRecMtr ;
   private int[] T01OU7_A44AlbRecCod ;
   private boolean[] T01OU7_n44AlbRecCod ;
   private String[] T01OU40_A396EmprCod ;
   private int[] T01OU40_A323DevGenCod ;
   private String[] T01OU40_A2159AlbRecPie ;
   private int[] T01OU5_A323DevGenCod ;
   private java.math.BigDecimal[] T01OU5_A3067DevPieUni ;
   private String[] T01OU5_A396EmprCod ;
   private String[] T01OU5_A2159AlbRecPie ;
   private int[] T01OU4_A323DevGenCod ;
   private java.math.BigDecimal[] T01OU4_A3067DevPieUni ;
   private String[] T01OU4_A396EmprCod ;
   private String[] T01OU4_A2159AlbRecPie ;
   private String[] T01OU41_A4795AlRPieCal ;
   private java.math.BigDecimal[] T01OU41_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01OU41_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01OU41_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01OU41_A2157AlbRecMtr ;
   private int[] T01OU41_A44AlbRecCod ;
   private boolean[] T01OU41_n44AlbRecCod ;
   private String[] T01OU45_A4795AlRPieCal ;
   private java.math.BigDecimal[] T01OU45_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01OU45_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01OU45_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01OU45_A2157AlbRecMtr ;
   private String[] T01OU47_A396EmprCod ;
   private int[] T01OU47_A323DevGenCod ;
   private String[] T01OU47_A2159AlbRecPie ;
   private int[] T01OU48_A323DevGenCod ;
   private byte[] T01OU48_A1302DevLin ;
   private String[] T01OU48_A1303DevObs ;
   private String[] T01OU48_A396EmprCod ;
   private String[] T01OU49_A396EmprCod ;
   private int[] T01OU49_A323DevGenCod ;
   private byte[] T01OU49_A1302DevLin ;
   private int[] T01OU3_A323DevGenCod ;
   private byte[] T01OU3_A1302DevLin ;
   private String[] T01OU3_A1303DevObs ;
   private String[] T01OU3_A396EmprCod ;
   private int[] T01OU2_A323DevGenCod ;
   private byte[] T01OU2_A1302DevLin ;
   private String[] T01OU2_A1303DevObs ;
   private String[] T01OU2_A396EmprCod ;
   private String[] T01OU53_A396EmprCod ;
   private int[] T01OU53_A323DevGenCod ;
   private byte[] T01OU53_A1302DevLin ;
   private String[] T01OU54_A396EmprCod ;
   private short[] T01OU54_A327DevGenTrn ;
   private boolean[] T01OU54_n327DevGenTrn ;
   private String[] T01OU54_A329DevTrnNom ;
   private boolean[] T01OU54_n329DevTrnNom ;
   private String[] T01OU55_A407EmprNom ;
   private boolean[] T01OU55_n407EmprNom ;
   private java.math.BigDecimal[] T01OU57_A3066AlbDevPUni ;
   private short[] T01OU57_A5278AlbDevPPie ;
   private java.math.BigDecimal[] T01OU59_A3066AlbDevPUni ;
   private short[] T01OU59_A5278AlbDevPPie ;
   private java.math.BigDecimal[] T01OU60_A60AlbRUniUti ;
   private int[] T01OU60_A54AlbRPieUti ;
   private byte[] T01OU60_A47AlbREst ;
   private int[] T01OU60_A252CliCod ;
   private boolean[] T01OU60_n252CliCod ;
   private String[] T01OU60_A45AlbRef ;
   private String[] T01OU60_A56AlbRUni ;
   private int[] T01OU60_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01OU60_A58AlbRUniEnt ;
   private String[] T01OU61_A279CliNom ;
   private String[] T01OU62_A329DevTrnNom ;
   private boolean[] T01OU62_n329DevTrnNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private String[] T01OU6_A4795AlRPieCal ;
   private java.math.BigDecimal[] T01OU6_A2158AlbRecMtrU ;
   private java.math.BigDecimal[] T01OU6_A2156AlbRecKgmU ;
   private java.math.BigDecimal[] T01OU6_A2155AlbRecKgm ;
   private java.math.BigDecimal[] T01OU6_A2157AlbRecMtr ;
   private int[] T01OU6_A44AlbRecCod ;
   private java.math.BigDecimal[] T01OU11_A60AlbRUniUti ;
   private int[] T01OU11_A54AlbRPieUti ;
   private byte[] T01OU11_A47AlbREst ;
   private int[] T01OU11_A252CliCod ;
   private String[] T01OU11_A45AlbRef ;
   private String[] T01OU11_A56AlbRUni ;
   private int[] T01OU11_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T01OU11_A58AlbRUniEnt ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdevpiecopy1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpiecopy1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpiecopy1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpiecopy1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevpiecopy1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OU2", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?  FOR UPDATE OF DevObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU3", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU4", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?  FOR UPDATE OF DevPieUni NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU5", "SELECT DevGenCod, DevPieUni, EmprCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU6", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU7", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU8", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU9", "SELECT DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU11", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbREst, AlbRUniUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU12", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU13", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU14", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU16", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU18", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, TM1.DevGenUni, TM1.DevGenPie, T4.AlbRUniUti, T4.AlbRPieUti, T4.AlbREst, T2.EmprNom, TM1.DevGenFec, TM1.DevGenDom, TM1.CliCod, T5.CliNom, T4.AlbRef, T6.TrnNom AS DevTrnNom, T4.AlbRUni, T4.AlbRPieEnt, T4.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn, COALESCE( T3.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T3.AlbDevPPie, 0) AS AlbDevPPie FROM (((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.DevGenCod = TM1.DevGenCod) LEFT JOIN TXPALBREC T4 ON T4.EmprCod = TM1.EmprCod AND T4.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T5 ON T5.EmprCod = TM1.EmprCod AND T5.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T6 ON T6.EmprCod = TM1.EmprCod AND T6.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU19", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU20", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU22", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU23", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU24", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE ( DevGenCod > ?) and EmprCod = ? ORDER BY EmprCod, DevGenCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OU25", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE ( DevGenCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevGenCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OU26", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbRPieUti, AlbREst, AlbRUniUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OU27", "INSERT INTO TXPDEVGEN(CliCod, DevGenCod, DevGenUni, DevGenPie, DevGenFec, DevGenDom, DevGenEst, DevUlin, EmprCod, AlbRecCod, DevGenTrn, EmprTrn, DevMatric, DevHorSal, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevDiscli, DevMdl, DevEnvAT, DevATCodeI, DevGenAT, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ')", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01OU28", "UPDATE TXPDEVGEN SET CliCod=?, DevGenUni=?, DevGenPie=?, DevGenFec=?, DevGenDom=?, DevGenEst=?, DevUlin=?, AlbRecCod=?, DevGenTrn=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01OU29", "DELETE FROM TXPDEVGEN  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new ForEachCursor("T01OU31", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU32", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU33", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU34", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OU35", "UPDATE TXPDEVGEN SET DevUlin=?, DevGenPie=?, DevGenUni=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T01OU36", "UPDATE TXPALBREC SET AlbRUniUti=?, AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new UpdateCursor("T01OU37", "UPDATE TXPALBREC SET AlbRPieUti=?, AlbREst=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T01OU38", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? ORDER BY EmprCod, DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU39", "SELECT T2.AlRPieCal, T1.DevGenCod, T1.DevPieUni, T2.AlbRecMtrU, T2.AlbRecKgmU, T2.AlbRecKgm, T2.AlbRecMtr, T1.EmprCod, T1.AlbRecPie, T2.AlbRecCod FROM (TXPDevPie T1 LEFT JOIN TXPALBDET T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = ? AND T2.AlbRecPie = T1.AlbRecPie) WHERE T1.DevGenCod = ? and T1.EmprCod = ? and T1.AlbRecPie = ? ORDER BY T1.EmprCod, T1.DevGenCod, T1.AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU40", "SELECT EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU41", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr, AlbRecCod FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?  FOR UPDATE OF AlbRecMtrU, AlbRecKgmU NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OU42", "INSERT INTO TXPDevPie(DevGenCod, DevPieUni, EmprCod, AlbRecPie) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDevPie")
         ,new UpdateCursor("T01OU43", "UPDATE TXPDevPie SET DevPieUni=?  WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPDevPie")
         ,new UpdateCursor("T01OU44", "DELETE FROM TXPDevPie  WHERE EmprCod = ? AND DevGenCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPDevPie")
         ,new ForEachCursor("T01OU45", "SELECT AlRPieCal, AlbRecMtrU, AlbRecKgmU, AlbRecKgm, AlbRecMtr FROM TXPALBDET WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OU46", "UPDATE TXPALBDET SET AlbRecMtrU=?, AlbRecKgmU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND AlbRecPie = ?", GX_NOMASK, "TXPALBDET")
         ,new ForEachCursor("T01OU47", "SELECT EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE DevGenCod = ? and EmprCod = ? ORDER BY EmprCod, DevGenCod, AlbRecPie ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU48", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? and DevLin = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU49", "SELECT EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OU50", "INSERT INTO TXPDEVOBS(DevGenCod, DevLin, DevObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("T01OU51", "UPDATE TXPDEVOBS SET DevObs=?  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("T01OU52", "DELETE FROM TXPDEVOBS  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new ForEachCursor("T01OU53", "SELECT EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU54", "SELECT EmprCod, TrnCod AS DevGenTrn, TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? ORDER BY TrnNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU55", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU57", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU59", "SELECT COALESCE( T1.AlbDevPUni, 0) AS AlbDevPUni, COALESCE( T1.AlbDevPPie, 0) AS AlbDevPPie FROM (SELECT SUM(DevPieUni) AS AlbDevPUni, EmprCod, DevGenCod, COUNT(*) AS AlbDevPPie FROM TXPDevPie GROUP BY EmprCod, DevGenCod ) T1 WHERE T1.EmprCod = ? AND T1.DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU60", "SELECT AlbRUniUti, AlbRPieUti, AlbREst, CliCod, AlbRef, AlbRUni, AlbRPieEnt, AlbRUniEnt FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU61", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OU62", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 9);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 7 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((byte[]) buf[9])[0] = rslt.getByte(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((int[]) buf[14])[0] = rslt.getInt(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((int[]) buf[18])[0] = rslt.getInt(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 10 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((String[]) buf[8])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((byte[]) buf[12])[0] = rslt.getByte(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((int[]) buf[14])[0] = rslt.getInt(10);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 30);
               ((String[]) buf[17])[0] = rslt.getString(12, 16);
               ((String[]) buf[18])[0] = rslt.getString(13, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(14, 1);
               ((int[]) buf[21])[0] = rslt.getInt(15);
               ((java.math.BigDecimal[]) buf[22])[0] = rslt.getBigDecimal(16,2);
               ((byte[]) buf[23])[0] = rslt.getByte(17);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((byte[]) buf[25])[0] = rslt.getByte(18);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(19, 3);
               ((int[]) buf[28])[0] = rslt.getInt(20);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(21);
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[32])[0] = rslt.getBigDecimal(22,2);
               ((short[]) buf[33])[0] = rslt.getShort(23);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 21 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 25 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 26 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,2);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 42 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 50 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 51 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 52 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
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
               stmt.setString(3, (String)parms[3], 9);
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
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 10 :
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
               return;
            case 12 :
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
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 20 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 21 :
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
            case 22 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[4], 2);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DATE );
               }
               else
               {
                  stmt.setDate(5, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[10]).byteValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               stmt.setString(9, (String)parms[15], 3);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[19]).shortValue());
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(5, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(8, ((Number) parms[15]).intValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
               }
               stmt.setString(10, (String)parms[18], 3);
               stmt.setInt(11, ((Number) parms[19]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 26 :
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
               return;
            case 28 :
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
            case 29 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(3, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setString(4, (String)parms[6], 3);
               stmt.setInt(5, ((Number) parms[7]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(5, ((Number) parms[5]).intValue());
               }
               return;
            case 31 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 33 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 9);
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 36 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 37 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 9);
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 9);
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 9);
               return;
            case 40 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[4]).intValue());
               }
               stmt.setString(5, (String)parms[5], 9);
               return;
            case 41 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 44 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 52 :
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
            case 53 :
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
            case 54 :
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

