package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdevgen_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action36") == 0 )
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
         xc_36_0P31( A396EmprCod, A323DevGenCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action37") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A44AlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "AlbRecCod"))) ;
         n44AlbRecCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         AV22AlbRUni = httpContext.GetPar( "AlbRUni") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22AlbRUni", AV22AlbRUni);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_37_0P31( A396EmprCod, A44AlbRecCod, AV22AlbRUni) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV81Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81Pgmname", AV81Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV33Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
         AV75Texto_ii = httpContext.GetPar( "Texto_ii") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Texto_ii", AV75Texto_ii);
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_42_0P31( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV81Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81Pgmname", AV81Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV33Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
         AV75Texto_ii = httpContext.GetPar( "Texto_ii") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Texto_ii", AV75Texto_ii);
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_43_0P31( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action44") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         AV81Pgmname = httpContext.GetPar( "Pgmname") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81Pgmname", AV81Pgmname);
         AV17UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
         AV33Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
         AV75Texto_ii = httpContext.GetPar( "Texto_ii") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV75Texto_ii", AV75Texto_ii);
         A323DevGenCod = (int)(GXutil.lval( httpContext.GetPar( "DevGenCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_44_0P31( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action45") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A325DevGenFec = localUtil.parseDateParm( httpContext.GetPar( "DevGenFec")) ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_45_0P31( A396EmprCod, A325DevGenFec) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel17"+"_"+"DEVHORSAL") == 0 )
      {
         A325DevGenFec = localUtil.parseDateParm( httpContext.GetPar( "DevGenFec")) ;
         n325DevGenFec = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx17asadevhorsal0P31( A325DevGenFec, Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_50") == 0 )
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
         gxload_50( A396EmprCod, A44AlbRecCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_51") == 0 )
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
         gxload_51( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_52") == 0 )
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
         gxload_52( A396EmprCod, A327DevGenTrn) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtdevgen_level1item") == 0 )
      {
         gxnrgridtdevgen_level1item_newrow_invoke( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion de Entradas Almacen v 01", ""), (short)(0)) ;
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

   public void gxnrgridtdevgen_level1item_newrow_invoke( )
   {
      nRC_GXsfl_169 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_169"))) ;
      nGXsfl_169_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_169_idx"))) ;
      sGXsfl_169_idx = httpContext.GetPar( "sGXsfl_169_idx") ;
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
      gxnrgridtdevgen_level1item_newrow( ) ;
      /* End function gxnrGridtdevgen_level1item_newrow_invoke */
   }

   public tdevgen_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdevgen_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdevgen_impl.class ));
   }

   public tdevgen_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
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
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "Container FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, httpContext.getMessage( "Devolucion de Entradas Almacen v 01", ""), "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVGEN.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", httpContext.getMessage( "GX_BtnFirst", ""), bttBtn_first_Jsonclick, 5, httpContext.getMessage( "GX_BtnFirst", ""), "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", httpContext.getMessage( "GX_BtnPrevious", ""), bttBtn_previous_Jsonclick, 5, httpContext.getMessage( "GX_BtnPrevious", ""), "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", httpContext.getMessage( "GX_BtnNext", ""), bttBtn_next_Jsonclick, 5, httpContext.getMessage( "GX_BtnNext", ""), "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", httpContext.getMessage( "GX_BtnLast", ""), bttBtn_last_Jsonclick, 5, httpContext.getMessage( "GX_BtnLast", ""), "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", httpContext.getMessage( "GX_BtnSelect", ""), bttBtn_select_Jsonclick, 5, httpContext.getMessage( "GX_BtnSelect", ""), "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "", 2, "HLP_TDEVGEN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenCod_Internalname, GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A323DevGenCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRecCod_Internalname, GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRecCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRecCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRef_Internalname, GXutil.rtrim( A45AlbRef), GXutil.rtrim( localUtil.format( A45AlbRef, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRef_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRef_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevGenFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenFec_Internalname, localUtil.format(A325DevGenFec, "99/99/99"), localUtil.format( A325DevGenFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenFec_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevGenFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevGenFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVGEN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevHorSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevHorSal_Internalname, httpContext.getMessage( "Hora Salida", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevHorSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevHorSal_Internalname, localUtil.ttoc( A5348DevHorSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A5348DevHorSal, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevHorSal_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevHorSal_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevHorSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevHorSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVGEN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenUni_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenUni_Internalname, httpContext.getMessage( "Unidades Dev", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenUni_Internalname, GXutil.ltrim( localUtil.ntoc( A328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenUni_Enabled!=0) ? localUtil.format( A328DevGenUni, "ZZZZZ9.99") : localUtil.format( A328DevGenUni, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenUni_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenUni_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbAlbRUni, cmbAlbRUni.getInternalname(), GXutil.rtrim( A56AlbRUni), 1, cmbAlbRUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbAlbRUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", "", "", true, (byte)(0), "HLP_TDEVGEN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenPie_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenPie_Internalname, httpContext.getMessage( "Piezas Dev", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenPie_Internalname, GXutil.ltrim( localUtil.ntoc( A326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenPie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A326DevGenPie), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenPie_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenPie_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenTrn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenTrn_Internalname, httpContext.getMessage( "Transportista", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenTrn_Internalname, GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenTrn_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A327DevGenTrn), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A327DevGenTrn), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtDevGenTrn_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenTrn_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevTrnNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevTrnNom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevTrnNom_Internalname, GXutil.rtrim( A329DevTrnNom), GXutil.rtrim( localUtil.format( A329DevTrnNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevTrnNom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevTrnNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevMatric_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevMatric_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevMatric_Internalname, GXutil.rtrim( A5347DevMatric), GXutil.rtrim( localUtil.format( A5347DevMatric, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevMatric_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevMatric_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenDom_Internalname, GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGenDom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9") : localUtil.format( DecimalUtil.doubleToDec(A6288DevGenDom), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenDom_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenDom_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniDis_Internalname, GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniDis_Enabled!=0) ? localUtil.format( A57AlbRUniDis, "ZZZZZ9.99") : localUtil.format( A57AlbRUniDis, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniDis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieDis_Internalname, GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieDis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A51AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieDis_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieDis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniUti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniUti_Internalname, GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniUti_Enabled!=0) ? localUtil.format( A60AlbRUniUti, "ZZZZZ9.99") : localUtil.format( A60AlbRUniUti, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniUti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniUti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieUti_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieUti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieUti_Internalname, GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieUti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A54AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieUti_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieUti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRPieEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRPieEnt_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRPieEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRPieEnt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A52AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRPieEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRPieEnt_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbRUniEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbRUniEnt_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbRUniEnt_Internalname, GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbRUniEnt_Enabled!=0) ? localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( A58AlbRUniEnt, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbRUniEnt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtAlbRUniEnt_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevFmd_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevFmd_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevFmd_Internalname, GXutil.rtrim( A10071DevFmd), "", "", (short)(0), 1, edtDevFmd_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevFmdD_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevFmdD_Internalname, httpContext.getMessage( "Desc HASH", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevFmdD_Internalname, GXutil.rtrim( A10072DevFmdD), "", "", (short)(0), 1, edtDevFmdD_Enabled, 0, 80, "chr", 4, "row", (byte)(0), StyleString, ClassString, "", "", "300", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevFHh_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevFHh_Internalname, httpContext.getMessage( "Data System Hash", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevFHh_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevFHh_Internalname, localUtil.ttoc( A10073DevFHh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10073DevFHh, "99/99/99 99:99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevFHh_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevFHh_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevFHh_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevFHh_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TDEVGEN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGrossT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGrossT_Internalname, httpContext.getMessage( "Gross Total", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10074DevGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevGrossT_Enabled!=0) ? localUtil.format( A10074DevGrossT, "ZZZZZZZZZ9.99") : localUtil.format( A10074DevGrossT, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGrossT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGrossT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevStt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevStt_Internalname, httpContext.getMessage( "Status ", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevStt_Internalname, GXutil.rtrim( A10075DevStt), GXutil.rtrim( localUtil.format( A10075DevStt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevStt_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevStt_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevEnvAT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevEnvAT_Internalname, httpContext.getMessage( "Estado envio AT", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevEnvAT_Internalname, GXutil.ltrim( localUtil.ntoc( A10736DevEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevEnvAT_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10736DevEnvAT), "9") : localUtil.format( DecimalUtil.doubleToDec(A10736DevEnvAT), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevEnvAT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevEnvAT_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevATCodeI_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevATCodeI_Internalname, httpContext.getMessage( "ATDocCodeID", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevATCodeI_Internalname, GXutil.rtrim( A10737DevATCodeI), GXutil.rtrim( localUtil.format( A10737DevATCodeI, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevATCodeI_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevATCodeI_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevGenAT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevGenAT_Internalname, httpContext.getMessage( "Manual o Automatico", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevGenAT_Internalname, GXutil.rtrim( A10766DevGenAT), GXutil.rtrim( localUtil.format( A10766DevGenAT, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevGenAT_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevGenAT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevDiscli_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevDiscli_Internalname, httpContext.getMessage( "Disp Cli origen", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevDiscli_Internalname, GXutil.rtrim( A10361DevDiscli), GXutil.rtrim( localUtil.format( A10361DevDiscli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevDiscli_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevDiscli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevMdl_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevMdl_Internalname, httpContext.getMessage( "Modelo", ""), "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevMdl_Internalname, GXutil.rtrim( A10362DevMdl), GXutil.rtrim( localUtil.format( A10362DevMdl, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevMdl_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtDevMdl_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTitlelevel1_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTitlelevel1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3", "left", "top", "", "", "div");
      gxdraw_gridtdevgen_level1item( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 176,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDEVGEN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridtdevgen_level1item( )
   {
      /*  Grid Control  */
      startgridcontrol169( ) ;
      nGXsfl_169_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount192 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_192 = (short)(1) ;
            scanStart0P192( ) ;
            while ( RcdFound192 != 0 )
            {
               init_level_properties192( ) ;
               getByPrimaryKey0P192( ) ;
               addRow0P192( ) ;
               scanNext0P192( ) ;
            }
            scanEnd0P192( ) ;
            nBlankRcdCount192 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B1304DevUlin = A1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         B328DevGenUni = A328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         B326DevGenPie = A326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         B54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         B60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         standaloneNotModal0P192( ) ;
         standaloneModal0P192( ) ;
         sMode192 = Gx_mode ;
         while ( nGXsfl_169_idx < nRC_GXsfl_169 )
         {
            bGXsfl_169_Refreshing = true ;
            readRow0P192( ) ;
            edtDevLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVLIN_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            edtDevObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVOBS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevObs_Enabled), 5, 0), !bGXsfl_169_Refreshing);
            if ( ( nRcdExists_192 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0P192( ) ;
            }
            sendRow0P192( ) ;
            bGXsfl_169_Refreshing = false ;
         }
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A1304DevUlin = B1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         A328DevGenUni = B328DevGenUni ;
         n328DevGenUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A326DevGenPie = B326DevGenPie ;
         n326DevGenPie = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A54AlbRPieUti = B54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A60AlbRUniUti = B60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount192 = (short)(5) ;
         nRcdExists_192 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart0P192( ) ;
            while ( RcdFound192 != 0 )
            {
               sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_169192( ) ;
               init_level_properties192( ) ;
               standaloneNotModal0P192( ) ;
               getByPrimaryKey0P192( ) ;
               standaloneModal0P192( ) ;
               addRow0P192( ) ;
               scanNext0P192( ) ;
            }
            scanEnd0P192( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode192 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_169192( ) ;
      initAll0P192( ) ;
      init_level_properties192( ) ;
      B1304DevUlin = A1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      B328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      B326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      B54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      B60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      nRcdExists_192 = (short)(0) ;
      nIsMod_192 = (short)(0) ;
      nRcdDeleted_192 = (short)(0) ;
      nBlankRcdCount192 = (short)(nBlankRcdUsr192+nBlankRcdCount192) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount192 > 0 )
      {
         standaloneNotModal0P192( ) ;
         standaloneModal0P192( ) ;
         addRow0P192( ) ;
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
      A328DevGenUni = B328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      A326DevGenPie = B326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A54AlbRPieUti = B54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A60AlbRUniUti = B60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridtdevgen_level1itemContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridtdevgen_level1item", Gridtdevgen_level1itemContainer, subGridtdevgen_level1item_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdevgen_level1itemContainerData", Gridtdevgen_level1itemContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridtdevgen_level1itemContainerData"+"V", Gridtdevgen_level1itemContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtdevgen_level1itemContainerData"+"V"+"\" value='"+Gridtdevgen_level1itemContainer.GridValuesHidden()+"'/>") ;
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
      e110P2 ();
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
            Z5348DevHorSal = localUtil.ctot( httpContext.cgiGet( "Z5348DevHorSal"), 0) ;
            Z325DevGenFec = localUtil.ctod( httpContext.cgiGet( "Z325DevGenFec"), 0) ;
            Z328DevGenUni = localUtil.ctond( httpContext.cgiGet( "Z328DevGenUni")) ;
            Z326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( "Z326DevGenPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z5347DevMatric = httpContext.cgiGet( "Z5347DevMatric") ;
            Z6288DevGenDom = (byte)(localUtil.ctol( httpContext.cgiGet( "Z6288DevGenDom"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z324DevGenEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10071DevFmd = httpContext.cgiGet( "Z10071DevFmd") ;
            Z10072DevFmdD = httpContext.cgiGet( "Z10072DevFmdD") ;
            Z10073DevFHh = localUtil.ctot( httpContext.cgiGet( "Z10073DevFHh"), 0) ;
            Z10074DevGrossT = localUtil.ctond( httpContext.cgiGet( "Z10074DevGrossT")) ;
            Z10075DevStt = httpContext.cgiGet( "Z10075DevStt") ;
            Z10736DevEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10736DevEnvAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10737DevATCodeI = httpContext.cgiGet( "Z10737DevATCodeI") ;
            Z10766DevGenAT = httpContext.cgiGet( "Z10766DevGenAT") ;
            Z10361DevDiscli = httpContext.cgiGet( "Z10361DevDiscli") ;
            Z10362DevMdl = httpContext.cgiGet( "Z10362DevMdl") ;
            Z12883DevAlbRecC = (int)(localUtil.ctol( httpContext.cgiGet( "Z12883DevAlbRecC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14193DevGenATCU = httpContext.cgiGet( "Z14193DevGenATCU") ;
            Z14194DevGenSerA = httpContext.cgiGet( "Z14194DevGenSerA") ;
            Z14195DevGenTipA = httpContext.cgiGet( "Z14195DevGenTipA") ;
            Z44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z44AlbRecCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z327DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( "Z327DevGenTrn"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z45AlbRef = httpContext.cgiGet( "Z45AlbRef") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z56AlbRUni = httpContext.cgiGet( "Z56AlbRUni") ;
            Z52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( "Z52AlbRPieEnt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( "Z58AlbRUniEnt")) ;
            Z3359AlbRDisCli = httpContext.cgiGet( "Z3359AlbRDisCli") ;
            Z4602AlbRMdlCod = httpContext.cgiGet( "Z4602AlbRMdlCod") ;
            A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z324DevGenEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n324DevGenEst = false ;
            A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n1304DevUlin = false ;
            A12883DevAlbRecC = (int)(localUtil.ctol( httpContext.cgiGet( "Z12883DevAlbRecC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n12883DevAlbRecC = false ;
            A14193DevGenATCU = httpContext.cgiGet( "Z14193DevGenATCU") ;
            n14193DevGenATCU = false ;
            A14194DevGenSerA = httpContext.cgiGet( "Z14194DevGenSerA") ;
            n14194DevGenSerA = false ;
            A14195DevGenTipA = httpContext.cgiGet( "Z14195DevGenTipA") ;
            n14195DevGenTipA = false ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z47AlbREst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3359AlbRDisCli = httpContext.cgiGet( "Z3359AlbRDisCli") ;
            A4602AlbRMdlCod = httpContext.cgiGet( "Z4602AlbRMdlCod") ;
            O1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "O1304DevUlin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O328DevGenUni = localUtil.ctond( httpContext.cgiGet( "O328DevGenUni")) ;
            O326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( "O326DevGenPie"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( "O54AlbRPieUti"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( "O60AlbRUniUti")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_169 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_169"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Modo = httpContext.cgiGet( "MODO") ;
            AV18AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPIEDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV19AlbRUniDis = localUtil.ctond( httpContext.cgiGet( "vALBRUNIDIS")) ;
            A47AlbREst = (byte)(localUtil.ctol( httpContext.cgiGet( "ALBREST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Modo = httpContext.cgiGet( "vMODO") ;
            AV28Piezas = (short)(localUtil.ctol( httpContext.cgiGet( "vPIEZAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25PieAnt = (short)(localUtil.ctol( httpContext.cgiGet( "vPIEANT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV73OldUni = localUtil.ctond( httpContext.cgiGet( "vOLDUNI")) ;
            AV74OldPzas = (short)(localUtil.ctol( httpContext.cgiGet( "vOLDPZAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV75Texto_ii = httpContext.cgiGet( "vTEXTO_II") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A3359AlbRDisCli = httpContext.cgiGet( "ALBRDISCLI") ;
            A4602AlbRMdlCod = httpContext.cgiGet( "ALBRMDLCOD") ;
            AV26Kilos = localUtil.ctond( httpContext.cgiGet( "vKILOS")) ;
            AV27Metros = localUtil.ctond( httpContext.cgiGet( "vMETROS")) ;
            AV23KilAnt = localUtil.ctond( httpContext.cgiGet( "vKILANT")) ;
            AV24MetAnt = localUtil.ctond( httpContext.cgiGet( "vMETANT")) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV22AlbRUni = httpContext.cgiGet( "vALBRUNI") ;
            AV20AlbRPDis = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRPDIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21AlbRUDis = localUtil.ctond( httpContext.cgiGet( "vALBRUDIS")) ;
            AV71FirmaD = (byte)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV81Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            AV17UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            AV33Station = httpContext.cgiGet( "vSTATION") ;
            AV79msg_control = httpContext.cgiGet( "vMSG_CONTROL") ;
            A324DevGenEst = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVGENEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1304DevUlin = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVULIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A12883DevAlbRecC = (int)(localUtil.ctol( httpContext.cgiGet( "DEVALBRECC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14193DevGenATCU = httpContext.cgiGet( "DEVGENATCU") ;
            A14194DevGenSerA = httpContext.cgiGet( "DEVGENSERA") ;
            A14195DevGenTipA = httpContext.cgiGet( "DEVGENTIPA") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
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
            A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
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
            if ( localUtil.vcdtime( httpContext.cgiGet( edtDevHorSal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "DEVHORSAL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevHorSal_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A5348DevHorSal = GXutil.resetTime( GXutil.nullDate() );
               n5348DevHorSal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            else
            {
               A5348DevHorSal = localUtil.ctot( httpContext.cgiGet( edtDevHorSal_Internalname)) ;
               n5348DevHorSal = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDevGenUni_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDevGenUni_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVGENUNI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenUni_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A328DevGenUni = DecimalUtil.ZERO ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            }
            else
            {
               A328DevGenUni = localUtil.ctond( httpContext.cgiGet( edtDevGenUni_Internalname)) ;
               n328DevGenUni = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
            }
            cmbAlbRUni.setName( cmbAlbRUni.getInternalname() );
            cmbAlbRUni.setValue( httpContext.cgiGet( cmbAlbRUni.getInternalname()) );
            A56AlbRUni = httpContext.cgiGet( cmbAlbRUni.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVGENPIE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenPie_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A326DevGenPie = (short)(0) ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
            }
            else
            {
               A326DevGenPie = (short)(localUtil.ctol( httpContext.cgiGet( edtDevGenPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n326DevGenPie = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevGenTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVGENTRN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevGenTrn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A327DevGenTrn = (short)(0) ;
               n327DevGenTrn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
            }
            else
            {
               A327DevGenTrn = (short)(localUtil.ctol( httpContext.cgiGet( edtDevGenTrn_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n327DevGenTrn = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
            }
            A329DevTrnNom = httpContext.cgiGet( edtDevTrnNom_Internalname) ;
            n329DevTrnNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
            A5347DevMatric = httpContext.cgiGet( edtDevMatric_Internalname) ;
            n5347DevMatric = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5347DevMatric", A5347DevMatric);
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
            A57AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtAlbRUniDis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
            A51AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieDis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
            A60AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtAlbRUniUti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            A54AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieUti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
            A52AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRPieEnt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
            A58AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtAlbRUniEnt_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
            A10071DevFmd = httpContext.cgiGet( edtDevFmd_Internalname) ;
            n10071DevFmd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10071DevFmd", A10071DevFmd);
            A10072DevFmdD = httpContext.cgiGet( edtDevFmdD_Internalname) ;
            n10072DevFmdD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10072DevFmdD", A10072DevFmdD);
            A10073DevFHh = localUtil.ctot( httpContext.cgiGet( edtDevFHh_Internalname)) ;
            n10073DevFHh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10073DevFHh", localUtil.ttoc( A10073DevFHh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A10074DevGrossT = localUtil.ctond( httpContext.cgiGet( edtDevGrossT_Internalname)) ;
            n10074DevGrossT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10074DevGrossT", GXutil.ltrimstr( A10074DevGrossT, 13, 2));
            A10075DevStt = httpContext.cgiGet( edtDevStt_Internalname) ;
            n10075DevStt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10075DevStt", A10075DevStt);
            A10736DevEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevEnvAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10736DevEnvAT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10736DevEnvAT", GXutil.str( A10736DevEnvAT, 1, 0));
            A10737DevATCodeI = httpContext.cgiGet( edtDevATCodeI_Internalname) ;
            n10737DevATCodeI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10737DevATCodeI", A10737DevATCodeI);
            A10766DevGenAT = httpContext.cgiGet( edtDevGenAT_Internalname) ;
            n10766DevGenAT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10766DevGenAT", A10766DevGenAT);
            A10361DevDiscli = httpContext.cgiGet( edtDevDiscli_Internalname) ;
            n10361DevDiscli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10361DevDiscli", A10361DevDiscli);
            A10362DevMdl = httpContext.cgiGet( edtDevMdl_Internalname) ;
            n10362DevMdl = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10362DevMdl", A10362DevMdl);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDEVGEN");
            A10071DevFmd = httpContext.cgiGet( edtDevFmd_Internalname) ;
            n10071DevFmd = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10071DevFmd", A10071DevFmd);
            forbiddenHiddens.add("DevFmd", GXutil.rtrim( localUtil.format( A10071DevFmd, "")));
            forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV29Modo, "")));
            forbiddenHiddens.add("DevGenEst", localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"));
            A10072DevFmdD = httpContext.cgiGet( edtDevFmdD_Internalname) ;
            n10072DevFmdD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10072DevFmdD", A10072DevFmdD);
            forbiddenHiddens.add("DevFmdD", GXutil.rtrim( localUtil.format( A10072DevFmdD, "")));
            A10073DevFHh = localUtil.ctot( httpContext.cgiGet( edtDevFHh_Internalname)) ;
            n10073DevFHh = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10073DevFHh", localUtil.ttoc( A10073DevFHh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("DevFHh", localUtil.format( A10073DevFHh, "99/99/99 99:99:99"));
            A10074DevGrossT = localUtil.ctond( httpContext.cgiGet( edtDevGrossT_Internalname)) ;
            n10074DevGrossT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10074DevGrossT", GXutil.ltrimstr( A10074DevGrossT, 13, 2));
            forbiddenHiddens.add("DevGrossT", localUtil.format( A10074DevGrossT, "ZZZZZZZZZ9.99"));
            A10075DevStt = httpContext.cgiGet( edtDevStt_Internalname) ;
            n10075DevStt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10075DevStt", A10075DevStt);
            forbiddenHiddens.add("DevStt", GXutil.rtrim( localUtil.format( A10075DevStt, "")));
            A10736DevEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( edtDevEnvAT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n10736DevEnvAT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10736DevEnvAT", GXutil.str( A10736DevEnvAT, 1, 0));
            forbiddenHiddens.add("DevEnvAT", localUtil.format( DecimalUtil.doubleToDec(A10736DevEnvAT), "9"));
            A10737DevATCodeI = httpContext.cgiGet( edtDevATCodeI_Internalname) ;
            n10737DevATCodeI = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10737DevATCodeI", A10737DevATCodeI);
            forbiddenHiddens.add("DevATCodeI", GXutil.rtrim( localUtil.format( A10737DevATCodeI, "")));
            A10766DevGenAT = httpContext.cgiGet( edtDevGenAT_Internalname) ;
            n10766DevGenAT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10766DevGenAT", A10766DevGenAT);
            forbiddenHiddens.add("DevGenAT", GXutil.rtrim( localUtil.format( A10766DevGenAT, "")));
            forbiddenHiddens.add("DevAlbRecC", localUtil.format( DecimalUtil.doubleToDec(A12883DevAlbRecC), "ZZZZZZZ9"));
            forbiddenHiddens.add("DevGenATCU", GXutil.rtrim( localUtil.format( A14193DevGenATCU, "")));
            forbiddenHiddens.add("DevGenSerA", GXutil.rtrim( localUtil.format( A14194DevGenSerA, "")));
            forbiddenHiddens.add("DevGenTipA", GXutil.rtrim( localUtil.format( A14195DevGenTipA, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A323DevGenCod != Z323DevGenCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdevgen:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
                        e110P2 ();
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
            initAll0P31( ) ;
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
      disableAttributes0P31( ) ;
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

   public void confirm_0P192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      nGXsfl_169_idx = 0 ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         readRow0P192( ) ;
         if ( ( nRcdExists_192 != 0 ) || ( nIsMod_192 != 0 ) )
         {
            getKey0P192( ) ;
            if ( ( nRcdExists_192 == 0 ) && ( nRcdDeleted_192 == 0 ) )
            {
               if ( RcdFound192 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0P192( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0P192( ) ;
                     closeExtendedTableCursors0P192( ) ;
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
                  GXCCtl = "DEVLIN_" + sGXsfl_169_idx ;
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
                     getByPrimaryKey0P192( ) ;
                     load0P192( ) ;
                     beforeValidate0P192( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0P192( ) ;
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
                        beforeValidate0P192( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0P192( ) ;
                           closeExtendedTableCursors0P192( ) ;
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
                     GXCCtl = "DEVLIN_" + sGXsfl_169_idx ;
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
         httpContext.changePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_169_idx, GXutil.rtrim( Z1303DevObs)) ;
         httpContext.changePostValue( "nRcdDeleted_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_192 != 0 )
         {
            httpContext.changePostValue( "DEVLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVOBS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O1304DevUlin = s1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0P0( )
   {
   }

   public void e110P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdevgen_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdevgen_impl.this.A396EmprCod = GXv_char2[0] ;
      tdevgen_impl.this.AV16EmprNom = GXv_char3[0] ;
      tdevgen_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void zm0P31( int GX_JID )
   {
      if ( ( GX_JID == 48 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5348DevHorSal = T000P5_A5348DevHorSal[0] ;
            Z325DevGenFec = T000P5_A325DevGenFec[0] ;
            Z328DevGenUni = T000P5_A328DevGenUni[0] ;
            Z326DevGenPie = T000P5_A326DevGenPie[0] ;
            Z5347DevMatric = T000P5_A5347DevMatric[0] ;
            Z6288DevGenDom = T000P5_A6288DevGenDom[0] ;
            Z324DevGenEst = T000P5_A324DevGenEst[0] ;
            Z1304DevUlin = T000P5_A1304DevUlin[0] ;
            Z10071DevFmd = T000P5_A10071DevFmd[0] ;
            Z10072DevFmdD = T000P5_A10072DevFmdD[0] ;
            Z10073DevFHh = T000P5_A10073DevFHh[0] ;
            Z10074DevGrossT = T000P5_A10074DevGrossT[0] ;
            Z10075DevStt = T000P5_A10075DevStt[0] ;
            Z10736DevEnvAT = T000P5_A10736DevEnvAT[0] ;
            Z10737DevATCodeI = T000P5_A10737DevATCodeI[0] ;
            Z10766DevGenAT = T000P5_A10766DevGenAT[0] ;
            Z10361DevDiscli = T000P5_A10361DevDiscli[0] ;
            Z10362DevMdl = T000P5_A10362DevMdl[0] ;
            Z12883DevAlbRecC = T000P5_A12883DevAlbRecC[0] ;
            Z14193DevGenATCU = T000P5_A14193DevGenATCU[0] ;
            Z14194DevGenSerA = T000P5_A14194DevGenSerA[0] ;
            Z14195DevGenTipA = T000P5_A14195DevGenTipA[0] ;
            Z44AlbRecCod = T000P5_A44AlbRecCod[0] ;
            Z327DevGenTrn = T000P5_A327DevGenTrn[0] ;
         }
         else
         {
            Z5348DevHorSal = A5348DevHorSal ;
            Z325DevGenFec = A325DevGenFec ;
            Z328DevGenUni = A328DevGenUni ;
            Z326DevGenPie = A326DevGenPie ;
            Z5347DevMatric = A5347DevMatric ;
            Z6288DevGenDom = A6288DevGenDom ;
            Z324DevGenEst = A324DevGenEst ;
            Z1304DevUlin = A1304DevUlin ;
            Z10071DevFmd = A10071DevFmd ;
            Z10072DevFmdD = A10072DevFmdD ;
            Z10073DevFHh = A10073DevFHh ;
            Z10074DevGrossT = A10074DevGrossT ;
            Z10075DevStt = A10075DevStt ;
            Z10736DevEnvAT = A10736DevEnvAT ;
            Z10737DevATCodeI = A10737DevATCodeI ;
            Z10766DevGenAT = A10766DevGenAT ;
            Z10361DevDiscli = A10361DevDiscli ;
            Z10362DevMdl = A10362DevMdl ;
            Z12883DevAlbRecC = A12883DevAlbRecC ;
            Z14193DevGenATCU = A14193DevGenATCU ;
            Z14194DevGenSerA = A14194DevGenSerA ;
            Z14195DevGenTipA = A14195DevGenTipA ;
            Z44AlbRecCod = A44AlbRecCod ;
            Z327DevGenTrn = A327DevGenTrn ;
         }
      }
      if ( ( GX_JID == 50 ) || ( GX_JID == 0 ) )
      {
         Z47AlbREst = T000P8_A47AlbREst[0] ;
         Z45AlbRef = T000P8_A45AlbRef[0] ;
         Z252CliCod = T000P8_A252CliCod[0] ;
         Z56AlbRUni = T000P8_A56AlbRUni[0] ;
         Z52AlbRPieEnt = T000P8_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T000P8_A58AlbRUniEnt[0] ;
         Z3359AlbRDisCli = T000P8_A3359AlbRDisCli[0] ;
         Z4602AlbRMdlCod = T000P8_A4602AlbRMdlCod[0] ;
      }
      if ( GX_JID == -48 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z5348DevHorSal = A5348DevHorSal ;
         Z252CliCod = A252CliCod ;
         Z325DevGenFec = A325DevGenFec ;
         Z328DevGenUni = A328DevGenUni ;
         Z326DevGenPie = A326DevGenPie ;
         Z5347DevMatric = A5347DevMatric ;
         Z6288DevGenDom = A6288DevGenDom ;
         Z324DevGenEst = A324DevGenEst ;
         Z1304DevUlin = A1304DevUlin ;
         Z10071DevFmd = A10071DevFmd ;
         Z10072DevFmdD = A10072DevFmdD ;
         Z10073DevFHh = A10073DevFHh ;
         Z10074DevGrossT = A10074DevGrossT ;
         Z10075DevStt = A10075DevStt ;
         Z10736DevEnvAT = A10736DevEnvAT ;
         Z10737DevATCodeI = A10737DevATCodeI ;
         Z10766DevGenAT = A10766DevGenAT ;
         Z10361DevDiscli = A10361DevDiscli ;
         Z10362DevMdl = A10362DevMdl ;
         Z12883DevAlbRecC = A12883DevAlbRecC ;
         Z14193DevGenATCU = A14193DevGenATCU ;
         Z14194DevGenSerA = A14194DevGenSerA ;
         Z14195DevGenTipA = A14195DevGenTipA ;
         Z396EmprCod = A396EmprCod ;
         Z44AlbRecCod = A44AlbRecCod ;
         Z327DevGenTrn = A327DevGenTrn ;
         Z407EmprNom = A407EmprNom ;
         Z47AlbREst = A47AlbREst ;
         Z60AlbRUniUti = A60AlbRUniUti ;
         Z54AlbRPieUti = A54AlbRPieUti ;
         Z45AlbRef = A45AlbRef ;
         Z56AlbRUni = A56AlbRUni ;
         Z52AlbRPieEnt = A52AlbRPieEnt ;
         Z58AlbRUniEnt = A58AlbRUniEnt ;
         Z3359AlbRDisCli = A3359AlbRDisCli ;
         Z4602AlbRMdlCod = A4602AlbRMdlCod ;
         Z279CliNom = A279CliNom ;
         Z329DevTrnNom = A329DevTrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDevFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFmd_Enabled), 5, 0), true);
      edtDevFmdD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFmdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFmdD_Enabled), 5, 0), true);
      edtDevFHh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFHh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFHh_Enabled), 5, 0), true);
      edtDevGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGrossT_Enabled), 5, 0), true);
      edtDevStt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevStt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevStt_Enabled), 5, 0), true);
      edtDevEnvAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEnvAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEnvAT_Enabled), 5, 0), true);
      edtDevATCodeI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevATCodeI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevATCodeI_Enabled), 5, 0), true);
      edtDevGenAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenAT_Enabled), 5, 0), true);
      AV81Pgmname = "TDEVGEN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81Pgmname", AV81Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDevFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFmd_Enabled), 5, 0), true);
      edtDevFmdD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFmdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFmdD_Enabled), 5, 0), true);
      edtDevFHh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFHh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFHh_Enabled), 5, 0), true);
      edtDevGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGrossT_Enabled), 5, 0), true);
      edtDevStt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevStt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevStt_Enabled), 5, 0), true);
      edtDevEnvAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEnvAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEnvAT_Enabled), 5, 0), true);
      edtDevATCodeI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevATCodeI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevATCodeI_Enabled), 5, 0), true);
      edtDevGenAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenAT_Enabled), 5, 0), true);
      /* Using cursor T000P6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T000P6_A407EmprNom[0] ;
      n407EmprNom = T000P6_n407EmprNom[0] ;
      pr_default.close(4);
   }

   public void standaloneModal( )
   {
      if ( isIns( )  )
      {
         AV29Modo = httpContext.getMessage( httpContext.getMessage( "INS", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Modo", AV29Modo);
      }
      else
      {
         if ( isDlt( )  )
         {
            AV29Modo = httpContext.getMessage( httpContext.getMessage( "DEL", ""), "") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Modo", AV29Modo);
         }
         else
         {
            if ( isUpd( )  )
            {
               AV29Modo = httpContext.getMessage( httpContext.getMessage( "UPD", ""), "") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29Modo", AV29Modo);
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
      if ( isIns( )  && (GXutil.strcmp("", A10075DevStt)==0) && ( Gx_BScreen == 0 ) )
      {
         A10075DevStt = " " ;
         n10075DevStt = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10075DevStt", A10075DevStt);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10737DevATCodeI)==0) && ( Gx_BScreen == 0 ) )
      {
         A10737DevATCodeI = " " ;
         n10737DevATCodeI = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10737DevATCodeI", A10737DevATCodeI);
      }
      if ( isIns( )  && (0==A10736DevEnvAT) && ( Gx_BScreen == 0 ) )
      {
         A10736DevEnvAT = (byte)(0) ;
         n10736DevEnvAT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10736DevEnvAT", GXutil.str( A10736DevEnvAT, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A10766DevGenAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10766DevGenAT = " " ;
         n10766DevGenAT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10766DevGenAT", A10766DevGenAT);
      }
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
      }
   }

   public void load0P31( )
   {
      /* Using cursor T000P11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A47AlbREst = T000P11_A47AlbREst[0] ;
         A5348DevHorSal = T000P11_A5348DevHorSal[0] ;
         n5348DevHorSal = T000P11_n5348DevHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A60AlbRUniUti = T000P11_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A54AlbRPieUti = T000P11_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A407EmprNom = T000P11_A407EmprNom[0] ;
         n407EmprNom = T000P11_n407EmprNom[0] ;
         A45AlbRef = T000P11_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A252CliCod = T000P11_A252CliCod[0] ;
         n252CliCod = T000P11_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T000P11_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A325DevGenFec = T000P11_A325DevGenFec[0] ;
         n325DevGenFec = T000P11_n325DevGenFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         A328DevGenUni = T000P11_A328DevGenUni[0] ;
         n328DevGenUni = T000P11_n328DevGenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A56AlbRUni = T000P11_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A326DevGenPie = T000P11_A326DevGenPie[0] ;
         n326DevGenPie = T000P11_n326DevGenPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A329DevTrnNom = T000P11_A329DevTrnNom[0] ;
         n329DevTrnNom = T000P11_n329DevTrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
         A5347DevMatric = T000P11_A5347DevMatric[0] ;
         n5347DevMatric = T000P11_n5347DevMatric[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5347DevMatric", A5347DevMatric);
         A6288DevGenDom = T000P11_A6288DevGenDom[0] ;
         n6288DevGenDom = T000P11_n6288DevGenDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         A52AlbRPieEnt = T000P11_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A58AlbRUniEnt = T000P11_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A324DevGenEst = T000P11_A324DevGenEst[0] ;
         n324DevGenEst = T000P11_n324DevGenEst[0] ;
         A1304DevUlin = T000P11_A1304DevUlin[0] ;
         n1304DevUlin = T000P11_n1304DevUlin[0] ;
         A10071DevFmd = T000P11_A10071DevFmd[0] ;
         n10071DevFmd = T000P11_n10071DevFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10071DevFmd", A10071DevFmd);
         A10072DevFmdD = T000P11_A10072DevFmdD[0] ;
         n10072DevFmdD = T000P11_n10072DevFmdD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10072DevFmdD", A10072DevFmdD);
         A10073DevFHh = T000P11_A10073DevFHh[0] ;
         n10073DevFHh = T000P11_n10073DevFHh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10073DevFHh", localUtil.ttoc( A10073DevFHh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10074DevGrossT = T000P11_A10074DevGrossT[0] ;
         n10074DevGrossT = T000P11_n10074DevGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10074DevGrossT", GXutil.ltrimstr( A10074DevGrossT, 13, 2));
         A10075DevStt = T000P11_A10075DevStt[0] ;
         n10075DevStt = T000P11_n10075DevStt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10075DevStt", A10075DevStt);
         A10736DevEnvAT = T000P11_A10736DevEnvAT[0] ;
         n10736DevEnvAT = T000P11_n10736DevEnvAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10736DevEnvAT", GXutil.str( A10736DevEnvAT, 1, 0));
         A10737DevATCodeI = T000P11_A10737DevATCodeI[0] ;
         n10737DevATCodeI = T000P11_n10737DevATCodeI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10737DevATCodeI", A10737DevATCodeI);
         A10766DevGenAT = T000P11_A10766DevGenAT[0] ;
         n10766DevGenAT = T000P11_n10766DevGenAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10766DevGenAT", A10766DevGenAT);
         A10361DevDiscli = T000P11_A10361DevDiscli[0] ;
         n10361DevDiscli = T000P11_n10361DevDiscli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10361DevDiscli", A10361DevDiscli);
         A10362DevMdl = T000P11_A10362DevMdl[0] ;
         n10362DevMdl = T000P11_n10362DevMdl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10362DevMdl", A10362DevMdl);
         A3359AlbRDisCli = T000P11_A3359AlbRDisCli[0] ;
         A4602AlbRMdlCod = T000P11_A4602AlbRMdlCod[0] ;
         A12883DevAlbRecC = T000P11_A12883DevAlbRecC[0] ;
         n12883DevAlbRecC = T000P11_n12883DevAlbRecC[0] ;
         A14193DevGenATCU = T000P11_A14193DevGenATCU[0] ;
         n14193DevGenATCU = T000P11_n14193DevGenATCU[0] ;
         A14194DevGenSerA = T000P11_A14194DevGenSerA[0] ;
         n14194DevGenSerA = T000P11_n14194DevGenSerA[0] ;
         A14195DevGenTipA = T000P11_A14195DevGenTipA[0] ;
         n14195DevGenTipA = T000P11_n14195DevGenTipA[0] ;
         A44AlbRecCod = T000P11_A44AlbRecCod[0] ;
         n44AlbRecCod = T000P11_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A327DevGenTrn = T000P11_A327DevGenTrn[0] ;
         n327DevGenTrn = T000P11_n327DevGenTrn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
         zm0P31( -48) ;
      }
      pr_default.close(9);
      onLoadActions0P31( ) ;
   }

   public void onLoadActions0P31( )
   {
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      if ( isDlt( )  && true /* Level */ )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(A328DevGenUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A328DevGenUni).subtract(O328DevGenUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-A326DevGenPie) ;
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A5348DevHorSal) && true /* After */ )
      {
         GXt_dtime5 = A5348DevHorSal ;
         GXv_dtime6[0] = GXt_dtime5 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime6) ;
         tdevgen_impl.this.GXt_dtime5 = GXv_dtime6[0] ;
         A5348DevHorSal = GXt_dtime5 ;
         n5348DevHorSal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true )
      {
         AV19AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV19AlbRUniDis = AV21AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
         }
      }
      AV73OldUni = O328DevGenUni ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73OldUni", GXutil.ltrimstr( AV73OldUni, 9, 2));
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV26Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Kilos", GXutil.ltrimstr( AV26Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV27Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Metros", GXutil.ltrimstr( AV27Metros, 9, 2));
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV23KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23KilAnt", GXutil.ltrimstr( AV23KilAnt, 9, 2));
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV24MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24MetAnt", GXutil.ltrimstr( AV24MetAnt, 9, 2));
      }
      if ( true )
      {
         AV18AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV18AlbRPieDis = AV20AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
         }
      }
      AV28Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Piezas), 4, 0));
      AV25PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PieAnt), 4, 0));
      AV74OldPzas = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74OldPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74OldPzas), 4, 0));
      if ( isIns( )  && (GXutil.strcmp("", A10361DevDiscli)==0) && ( Gx_BScreen == 0 ) )
      {
         A10361DevDiscli = A3359AlbRDisCli ;
         n10361DevDiscli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10361DevDiscli", A10361DevDiscli);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10362DevMdl)==0) && ( Gx_BScreen == 0 ) )
      {
         A10362DevMdl = A4602AlbRMdlCod ;
         n10362DevMdl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10362DevMdl", A10362DevMdl);
      }
   }

   public void checkExtendedTable0P31( )
   {
      nIsDirty_31 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T000P8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A47AlbREst = T000P8_A47AlbREst[0] ;
      A60AlbRUniUti = T000P8_A60AlbRUniUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = T000P8_A54AlbRPieUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A45AlbRef = T000P8_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A252CliCod = T000P8_A252CliCod[0] ;
      n252CliCod = T000P8_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A56AlbRUni = T000P8_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A52AlbRPieEnt = T000P8_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = T000P8_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A3359AlbRDisCli = T000P8_A3359AlbRDisCli[0] ;
      A4602AlbRMdlCod = T000P8_A4602AlbRMdlCod[0] ;
      nIsDirty_31 = (short)(1) ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      nIsDirty_31 = (short)(1) ;
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      pr_default.close(6);
      if ( isDlt( )  && true /* Level */ )
      {
         nIsDirty_31 = (short)(1) ;
         A60AlbRUniUti = O60AlbRUniUti.subtract(A328DevGenUni) ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            nIsDirty_31 = (short)(1) ;
            A60AlbRUniUti = O60AlbRUniUti.add(A328DevGenUni).subtract(O328DevGenUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         nIsDirty_31 = (short)(1) ;
         A54AlbRPieUti = (int)(O54AlbRPieUti-A326DevGenPie) ;
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
      /* Using cursor T000P9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T000P9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(7);
      /* Using cursor T000P10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(8) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevGenTrn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A329DevTrnNom = T000P10_A329DevTrnNom[0] ;
      n329DevTrnNom = T000P10_n329DevTrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
      pr_default.close(8);
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int7[0] = A44AlbRecCod ;
         GXv_int8[0] = AV18AlbRPieDis ;
         GXv_decimal9[0] = AV19AlbRUniDis ;
         GXv_int10[0] = AV20AlbRPDis ;
         GXv_decimal11[0] = AV21AlbRUDis ;
         GXv_char3[0] = AV22AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_decimal9, GXv_int10, GXv_decimal11, GXv_char3) ;
         tdevgen_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevgen_impl.this.A44AlbRecCod = GXv_int7[0] ;
         tdevgen_impl.this.AV18AlbRPieDis = GXv_int8[0] ;
         tdevgen_impl.this.AV19AlbRUniDis = GXv_decimal9[0] ;
         tdevgen_impl.this.AV20AlbRPDis = GXv_int10[0] ;
         tdevgen_impl.this.AV21AlbRUDis = GXv_decimal11[0] ;
         tdevgen_impl.this.AV22AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV20AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21AlbRUDis", GXutil.ltrimstr( AV21AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22AlbRUni", AV22AlbRUni);
      }
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A5348DevHorSal) && true /* After */ )
      {
         nIsDirty_31 = (short)(1) ;
         GXt_dtime5 = A5348DevHorSal ;
         GXv_dtime6[0] = GXt_dtime5 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime6) ;
         tdevgen_impl.this.GXt_dtime5 = GXv_dtime6[0] ;
         A5348DevHorSal = GXt_dtime5 ;
         n5348DevHorSal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV79msg_control ;
         new app.pcthashgendev(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         tdevgen_impl.this.A396EmprCod = GXv_char4[0] ;
         tdevgen_impl.this.AV79msg_control = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV79msg_control", AV79msg_control);
      }
      if ( true )
      {
         AV19AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV19AlbRUniDis = AV21AlbRUDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
         }
      }
      AV73OldUni = O328DevGenUni ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73OldUni", GXutil.ltrimstr( AV73OldUni, 9, 2));
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV26Kilos = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Kilos", GXutil.ltrimstr( AV26Kilos, 9, 2));
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV27Metros = A328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Metros", GXutil.ltrimstr( AV27Metros, 9, 2));
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV23KilAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23KilAnt", GXutil.ltrimstr( AV23KilAnt, 9, 2));
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV24MetAnt = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24MetAnt", GXutil.ltrimstr( AV24MetAnt, 9, 2));
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, "DEVGENUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenUni_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true )
      {
         AV18AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV18AlbRPieDis = AV20AlbRPDis ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
         }
      }
      AV28Piezas = A326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Piezas), 4, 0));
      AV25PieAnt = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PieAnt), 4, 0));
      AV74OldPzas = O326DevGenPie ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74OldPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74OldPzas), 4, 0));
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 1, "DEVGENPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenPie_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10361DevDiscli)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_31 = (short)(1) ;
         A10361DevDiscli = A3359AlbRDisCli ;
         n10361DevDiscli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10361DevDiscli", A10361DevDiscli);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10362DevMdl)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_31 = (short)(1) ;
         A10362DevMdl = A4602AlbRMdlCod ;
         n10362DevMdl = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A10362DevMdl", A10362DevMdl);
      }
   }

   public void closeExtendedTableCursors0P31( )
   {
      pr_default.close(5);
      pr_default.close(7);
      pr_default.close(8);
   }

   public void enableDisable( )
   {
   }

   public void gxload_50( String A396EmprCod ,
                          int A44AlbRecCod )
   {
      /* Using cursor T000P8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A47AlbREst = T000P8_A47AlbREst[0] ;
      A60AlbRUniUti = T000P8_A60AlbRUniUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = T000P8_A54AlbRPieUti[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      A45AlbRef = T000P8_A45AlbRef[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A252CliCod = T000P8_A252CliCod[0] ;
      n252CliCod = T000P8_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A56AlbRUni = T000P8_A56AlbRUni[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A52AlbRPieEnt = T000P8_A52AlbRPieEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = T000P8_A58AlbRUniEnt[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A3359AlbRDisCli = T000P8_A3359AlbRDisCli[0] ;
      A4602AlbRMdlCod = T000P8_A4602AlbRMdlCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A45AlbRef))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A56AlbRUni))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A3359AlbRDisCli))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4602AlbRMdlCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_51( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T000P12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(10) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T000P12_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(10) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(10);
   }

   public void gxload_52( String A396EmprCod ,
                          short A327DevGenTrn )
   {
      /* Using cursor T000P13 */
      pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevGenTrn_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A329DevTrnNom = T000P13_A329DevTrnNom[0] ;
      n329DevTrnNom = T000P13_n329DevTrnNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A329DevTrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(11) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(11);
   }

   public void getKey0P31( )
   {
      /* Using cursor T000P14 */
      pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(12);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000P5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T000P5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0P31( 48) ;
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T000P5_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
         A5348DevHorSal = T000P5_A5348DevHorSal[0] ;
         n5348DevHorSal = T000P5_n5348DevHorSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A325DevGenFec = T000P5_A325DevGenFec[0] ;
         n325DevGenFec = T000P5_n325DevGenFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
         A328DevGenUni = T000P5_A328DevGenUni[0] ;
         n328DevGenUni = T000P5_n328DevGenUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
         A326DevGenPie = T000P5_A326DevGenPie[0] ;
         n326DevGenPie = T000P5_n326DevGenPie[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
         A5347DevMatric = T000P5_A5347DevMatric[0] ;
         n5347DevMatric = T000P5_n5347DevMatric[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5347DevMatric", A5347DevMatric);
         A6288DevGenDom = T000P5_A6288DevGenDom[0] ;
         n6288DevGenDom = T000P5_n6288DevGenDom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
         A324DevGenEst = T000P5_A324DevGenEst[0] ;
         n324DevGenEst = T000P5_n324DevGenEst[0] ;
         A1304DevUlin = T000P5_A1304DevUlin[0] ;
         n1304DevUlin = T000P5_n1304DevUlin[0] ;
         A10071DevFmd = T000P5_A10071DevFmd[0] ;
         n10071DevFmd = T000P5_n10071DevFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10071DevFmd", A10071DevFmd);
         A10072DevFmdD = T000P5_A10072DevFmdD[0] ;
         n10072DevFmdD = T000P5_n10072DevFmdD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10072DevFmdD", A10072DevFmdD);
         A10073DevFHh = T000P5_A10073DevFHh[0] ;
         n10073DevFHh = T000P5_n10073DevFHh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10073DevFHh", localUtil.ttoc( A10073DevFHh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A10074DevGrossT = T000P5_A10074DevGrossT[0] ;
         n10074DevGrossT = T000P5_n10074DevGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10074DevGrossT", GXutil.ltrimstr( A10074DevGrossT, 13, 2));
         A10075DevStt = T000P5_A10075DevStt[0] ;
         n10075DevStt = T000P5_n10075DevStt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10075DevStt", A10075DevStt);
         A10736DevEnvAT = T000P5_A10736DevEnvAT[0] ;
         n10736DevEnvAT = T000P5_n10736DevEnvAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10736DevEnvAT", GXutil.str( A10736DevEnvAT, 1, 0));
         A10737DevATCodeI = T000P5_A10737DevATCodeI[0] ;
         n10737DevATCodeI = T000P5_n10737DevATCodeI[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10737DevATCodeI", A10737DevATCodeI);
         A10766DevGenAT = T000P5_A10766DevGenAT[0] ;
         n10766DevGenAT = T000P5_n10766DevGenAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10766DevGenAT", A10766DevGenAT);
         A10361DevDiscli = T000P5_A10361DevDiscli[0] ;
         n10361DevDiscli = T000P5_n10361DevDiscli[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10361DevDiscli", A10361DevDiscli);
         A10362DevMdl = T000P5_A10362DevMdl[0] ;
         n10362DevMdl = T000P5_n10362DevMdl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10362DevMdl", A10362DevMdl);
         A12883DevAlbRecC = T000P5_A12883DevAlbRecC[0] ;
         n12883DevAlbRecC = T000P5_n12883DevAlbRecC[0] ;
         A14193DevGenATCU = T000P5_A14193DevGenATCU[0] ;
         n14193DevGenATCU = T000P5_n14193DevGenATCU[0] ;
         A14194DevGenSerA = T000P5_A14194DevGenSerA[0] ;
         n14194DevGenSerA = T000P5_n14194DevGenSerA[0] ;
         A14195DevGenTipA = T000P5_A14195DevGenTipA[0] ;
         n14195DevGenTipA = T000P5_n14195DevGenTipA[0] ;
         A44AlbRecCod = T000P5_A44AlbRecCod[0] ;
         n44AlbRecCod = T000P5_n44AlbRecCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         A327DevGenTrn = T000P5_A327DevGenTrn[0] ;
         n327DevGenTrn = T000P5_n327DevGenTrn[0] ;
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
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0P31( ) ;
         if ( AnyError == 1 )
         {
            RcdFound31 = (short)(0) ;
            initializeNonKey0P31( ) ;
         }
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound31 = (short)(0) ;
         initializeNonKey0P31( ) ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode31 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey0P31( ) ;
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
      /* Using cursor T000P15 */
      pr_default.execute(13, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      if ( (pr_default.getStatus(13) != 101) )
      {
         while ( (pr_default.getStatus(13) != 101) && ( ( T000P15_A323DevGenCod[0] < A323DevGenCod ) ) && ( GXutil.strcmp(T000P15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(13);
         }
         if ( (pr_default.getStatus(13) != 101) && ( ( T000P15_A323DevGenCod[0] > A323DevGenCod ) ) && ( GXutil.strcmp(T000P15_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A323DevGenCod = T000P15_A323DevGenCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(13);
   }

   public void move_previous( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T000P16 */
      pr_default.execute(14, new Object[] {Integer.valueOf(A323DevGenCod), A396EmprCod});
      if ( (pr_default.getStatus(14) != 101) )
      {
         while ( (pr_default.getStatus(14) != 101) && ( ( T000P16_A323DevGenCod[0] > A323DevGenCod ) ) && ( GXutil.strcmp(T000P16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(14);
         }
         if ( (pr_default.getStatus(14) != 101) && ( ( T000P16_A323DevGenCod[0] < A323DevGenCod ) ) && ( GXutil.strcmp(T000P16_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A323DevGenCod = T000P16_A323DevGenCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(14);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0P31( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A1304DevUlin = O1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
         GX_FocusControl = edtDevGenCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0P31( ) ;
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
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               update0P31( ) ;
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
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               GX_FocusControl = edtDevGenCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0P31( ) ;
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
                  A1304DevUlin = O1304DevUlin ;
                  n1304DevUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
                  GX_FocusControl = edtDevGenCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0P31( ) ;
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
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart0P31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0P31( ) ;
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
      GX_FocusControl = edtAlbRecCod_Internalname ;
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
      GX_FocusControl = edtAlbRecCod_Internalname ;
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
      scanStart0P31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound31 != 0 )
         {
            scanNext0P31( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtAlbRecCod_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0P31( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0P31( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000P4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(2) == 101) || !( GXutil.dateCompare(Z5348DevHorSal, T000P4_A5348DevHorSal[0]) ) || !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(T000P4_A325DevGenFec[0])) ) || ( DecimalUtil.compareTo(Z328DevGenUni, T000P4_A328DevGenUni[0]) != 0 ) || ( Z326DevGenPie != T000P4_A326DevGenPie[0] ) || ( GXutil.strcmp(Z5347DevMatric, T000P4_A5347DevMatric[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z6288DevGenDom != T000P4_A6288DevGenDom[0] ) || ( Z324DevGenEst != T000P4_A324DevGenEst[0] ) || ( Z1304DevUlin != T000P4_A1304DevUlin[0] ) || ( GXutil.strcmp(Z10071DevFmd, T000P4_A10071DevFmd[0]) != 0 ) || ( GXutil.strcmp(Z10072DevFmdD, T000P4_A10072DevFmdD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10073DevFHh, T000P4_A10073DevFHh[0]) ) || ( DecimalUtil.compareTo(Z10074DevGrossT, T000P4_A10074DevGrossT[0]) != 0 ) || ( GXutil.strcmp(Z10075DevStt, T000P4_A10075DevStt[0]) != 0 ) || ( Z10736DevEnvAT != T000P4_A10736DevEnvAT[0] ) || ( GXutil.strcmp(Z10737DevATCodeI, T000P4_A10737DevATCodeI[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10766DevGenAT, T000P4_A10766DevGenAT[0]) != 0 ) || ( GXutil.strcmp(Z10361DevDiscli, T000P4_A10361DevDiscli[0]) != 0 ) || ( GXutil.strcmp(Z10362DevMdl, T000P4_A10362DevMdl[0]) != 0 ) || ( Z12883DevAlbRecC != T000P4_A12883DevAlbRecC[0] ) || ( GXutil.strcmp(Z14193DevGenATCU, T000P4_A14193DevGenATCU[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14194DevGenSerA, T000P4_A14194DevGenSerA[0]) != 0 ) || ( GXutil.strcmp(Z14195DevGenTipA, T000P4_A14195DevGenTipA[0]) != 0 ) || ( Z44AlbRecCod != T000P4_A44AlbRecCod[0] ) || ( Z327DevGenTrn != T000P4_A327DevGenTrn[0] ) )
         {
            if ( !( GXutil.dateCompare(Z5348DevHorSal, T000P4_A5348DevHorSal[0]) ) )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevHorSal");
               GXutil.writeLogRaw("Old: ",Z5348DevHorSal);
               GXutil.writeLogRaw("Current: ",T000P4_A5348DevHorSal[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z325DevGenFec), GXutil.resetTime(T000P4_A325DevGenFec[0])) ) )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenFec");
               GXutil.writeLogRaw("Old: ",Z325DevGenFec);
               GXutil.writeLogRaw("Current: ",T000P4_A325DevGenFec[0]);
            }
            if ( DecimalUtil.compareTo(Z328DevGenUni, T000P4_A328DevGenUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenUni");
               GXutil.writeLogRaw("Old: ",Z328DevGenUni);
               GXutil.writeLogRaw("Current: ",T000P4_A328DevGenUni[0]);
            }
            if ( Z326DevGenPie != T000P4_A326DevGenPie[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenPie");
               GXutil.writeLogRaw("Old: ",Z326DevGenPie);
               GXutil.writeLogRaw("Current: ",T000P4_A326DevGenPie[0]);
            }
            if ( GXutil.strcmp(Z5347DevMatric, T000P4_A5347DevMatric[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevMatric");
               GXutil.writeLogRaw("Old: ",Z5347DevMatric);
               GXutil.writeLogRaw("Current: ",T000P4_A5347DevMatric[0]);
            }
            if ( Z6288DevGenDom != T000P4_A6288DevGenDom[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenDom");
               GXutil.writeLogRaw("Old: ",Z6288DevGenDom);
               GXutil.writeLogRaw("Current: ",T000P4_A6288DevGenDom[0]);
            }
            if ( Z324DevGenEst != T000P4_A324DevGenEst[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenEst");
               GXutil.writeLogRaw("Old: ",Z324DevGenEst);
               GXutil.writeLogRaw("Current: ",T000P4_A324DevGenEst[0]);
            }
            if ( Z1304DevUlin != T000P4_A1304DevUlin[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevUlin");
               GXutil.writeLogRaw("Old: ",Z1304DevUlin);
               GXutil.writeLogRaw("Current: ",T000P4_A1304DevUlin[0]);
            }
            if ( GXutil.strcmp(Z10071DevFmd, T000P4_A10071DevFmd[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevFmd");
               GXutil.writeLogRaw("Old: ",Z10071DevFmd);
               GXutil.writeLogRaw("Current: ",T000P4_A10071DevFmd[0]);
            }
            if ( GXutil.strcmp(Z10072DevFmdD, T000P4_A10072DevFmdD[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevFmdD");
               GXutil.writeLogRaw("Old: ",Z10072DevFmdD);
               GXutil.writeLogRaw("Current: ",T000P4_A10072DevFmdD[0]);
            }
            if ( !( GXutil.dateCompare(Z10073DevFHh, T000P4_A10073DevFHh[0]) ) )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevFHh");
               GXutil.writeLogRaw("Old: ",Z10073DevFHh);
               GXutil.writeLogRaw("Current: ",T000P4_A10073DevFHh[0]);
            }
            if ( DecimalUtil.compareTo(Z10074DevGrossT, T000P4_A10074DevGrossT[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGrossT");
               GXutil.writeLogRaw("Old: ",Z10074DevGrossT);
               GXutil.writeLogRaw("Current: ",T000P4_A10074DevGrossT[0]);
            }
            if ( GXutil.strcmp(Z10075DevStt, T000P4_A10075DevStt[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevStt");
               GXutil.writeLogRaw("Old: ",Z10075DevStt);
               GXutil.writeLogRaw("Current: ",T000P4_A10075DevStt[0]);
            }
            if ( Z10736DevEnvAT != T000P4_A10736DevEnvAT[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevEnvAT");
               GXutil.writeLogRaw("Old: ",Z10736DevEnvAT);
               GXutil.writeLogRaw("Current: ",T000P4_A10736DevEnvAT[0]);
            }
            if ( GXutil.strcmp(Z10737DevATCodeI, T000P4_A10737DevATCodeI[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevATCodeI");
               GXutil.writeLogRaw("Old: ",Z10737DevATCodeI);
               GXutil.writeLogRaw("Current: ",T000P4_A10737DevATCodeI[0]);
            }
            if ( GXutil.strcmp(Z10766DevGenAT, T000P4_A10766DevGenAT[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenAT");
               GXutil.writeLogRaw("Old: ",Z10766DevGenAT);
               GXutil.writeLogRaw("Current: ",T000P4_A10766DevGenAT[0]);
            }
            if ( GXutil.strcmp(Z10361DevDiscli, T000P4_A10361DevDiscli[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevDiscli");
               GXutil.writeLogRaw("Old: ",Z10361DevDiscli);
               GXutil.writeLogRaw("Current: ",T000P4_A10361DevDiscli[0]);
            }
            if ( GXutil.strcmp(Z10362DevMdl, T000P4_A10362DevMdl[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevMdl");
               GXutil.writeLogRaw("Old: ",Z10362DevMdl);
               GXutil.writeLogRaw("Current: ",T000P4_A10362DevMdl[0]);
            }
            if ( Z12883DevAlbRecC != T000P4_A12883DevAlbRecC[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevAlbRecC");
               GXutil.writeLogRaw("Old: ",Z12883DevAlbRecC);
               GXutil.writeLogRaw("Current: ",T000P4_A12883DevAlbRecC[0]);
            }
            if ( GXutil.strcmp(Z14193DevGenATCU, T000P4_A14193DevGenATCU[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenATCU");
               GXutil.writeLogRaw("Old: ",Z14193DevGenATCU);
               GXutil.writeLogRaw("Current: ",T000P4_A14193DevGenATCU[0]);
            }
            if ( GXutil.strcmp(Z14194DevGenSerA, T000P4_A14194DevGenSerA[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenSerA");
               GXutil.writeLogRaw("Old: ",Z14194DevGenSerA);
               GXutil.writeLogRaw("Current: ",T000P4_A14194DevGenSerA[0]);
            }
            if ( GXutil.strcmp(Z14195DevGenTipA, T000P4_A14195DevGenTipA[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenTipA");
               GXutil.writeLogRaw("Old: ",Z14195DevGenTipA);
               GXutil.writeLogRaw("Current: ",T000P4_A14195DevGenTipA[0]);
            }
            if ( Z44AlbRecCod != T000P4_A44AlbRecCod[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"AlbRecCod");
               GXutil.writeLogRaw("Old: ",Z44AlbRecCod);
               GXutil.writeLogRaw("Current: ",T000P4_A44AlbRecCod[0]);
            }
            if ( Z327DevGenTrn != T000P4_A327DevGenTrn[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevGenTrn");
               GXutil.writeLogRaw("Old: ",Z327DevGenTrn);
               GXutil.writeLogRaw("Current: ",T000P4_A327DevGenTrn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVGEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
      /* Using cursor T000P17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      if ( (pr_default.getStatus(15) == 103) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPALBREC"}), "RecordIsLocked", 1, "");
         AnyError = (short)(1) ;
         return  ;
      }
      if ( ! isIns( ) )
      {
         Gx_longc = false ;
         if ( false || ( Z47AlbREst != T000P17_A47AlbREst[0] ) || ( GXutil.strcmp(Z45AlbRef, T000P17_A45AlbRef[0]) != 0 ) || ( Z252CliCod != T000P17_A252CliCod[0] ) || ( GXutil.strcmp(Z56AlbRUni, T000P17_A56AlbRUni[0]) != 0 ) || ( Z52AlbRPieEnt != T000P17_A52AlbRPieEnt[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( DecimalUtil.compareTo(Z58AlbRUniEnt, T000P17_A58AlbRUniEnt[0]) != 0 ) || ( GXutil.strcmp(Z3359AlbRDisCli, T000P17_A3359AlbRDisCli[0]) != 0 ) || ( GXutil.strcmp(Z4602AlbRMdlCod, T000P17_A4602AlbRMdlCod[0]) != 0 ) )
         {
            if ( Z47AlbREst != T000P17_A47AlbREst[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"AlbREst");
               GXutil.writeLogRaw("Old: ",Z47AlbREst);
               GXutil.writeLogRaw("Current: ",T000P17_A47AlbREst[0]);
            }
            if ( GXutil.strcmp(Z45AlbRef, T000P17_A45AlbRef[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"AlbRef");
               GXutil.writeLogRaw("Old: ",Z45AlbRef);
               GXutil.writeLogRaw("Current: ",T000P17_A45AlbRef[0]);
            }
            if ( Z252CliCod != T000P17_A252CliCod[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T000P17_A252CliCod[0]);
            }
            if ( GXutil.strcmp(Z56AlbRUni, T000P17_A56AlbRUni[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"AlbRUni");
               GXutil.writeLogRaw("Old: ",Z56AlbRUni);
               GXutil.writeLogRaw("Current: ",T000P17_A56AlbRUni[0]);
            }
            if ( Z52AlbRPieEnt != T000P17_A52AlbRPieEnt[0] )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"AlbRPieEnt");
               GXutil.writeLogRaw("Old: ",Z52AlbRPieEnt);
               GXutil.writeLogRaw("Current: ",T000P17_A52AlbRPieEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z58AlbRUniEnt, T000P17_A58AlbRUniEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"AlbRUniEnt");
               GXutil.writeLogRaw("Old: ",Z58AlbRUniEnt);
               GXutil.writeLogRaw("Current: ",T000P17_A58AlbRUniEnt[0]);
            }
            if ( GXutil.strcmp(Z3359AlbRDisCli, T000P17_A3359AlbRDisCli[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"AlbRDisCli");
               GXutil.writeLogRaw("Old: ",Z3359AlbRDisCli);
               GXutil.writeLogRaw("Current: ",T000P17_A3359AlbRDisCli[0]);
            }
            if ( GXutil.strcmp(Z4602AlbRMdlCod, T000P17_A4602AlbRMdlCod[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"AlbRMdlCod");
               GXutil.writeLogRaw("Old: ",Z4602AlbRMdlCod);
               GXutil.writeLogRaw("Current: ",T000P17_A4602AlbRMdlCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPALBREC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0P31( )
   {
      beforeValidate0P31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P31( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0P31( 0) ;
         checkOptimisticConcurrency0P31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P31( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0P31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P18 */
                  pr_default.execute(16, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Integer.valueOf(A323DevGenCod), Boolean.valueOf(n5348DevHorSal), A5348DevHorSal, Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n5347DevMatric), A5347DevMatric, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n10071DevFmd), A10071DevFmd, Boolean.valueOf(n10072DevFmdD), A10072DevFmdD, Boolean.valueOf(n10073DevFHh), A10073DevFHh, Boolean.valueOf(n10074DevGrossT), A10074DevGrossT, Boolean.valueOf(n10075DevStt), A10075DevStt, Boolean.valueOf(n10736DevEnvAT), Byte.valueOf(A10736DevEnvAT), Boolean.valueOf(n10737DevATCodeI), A10737DevATCodeI, Boolean.valueOf(n10766DevGenAT), A10766DevGenAT, Boolean.valueOf(n10361DevDiscli), A10361DevDiscli, Boolean.valueOf(n10362DevMdl), A10362DevMdl, Boolean.valueOf(n12883DevAlbRecC), Integer.valueOf(A12883DevAlbRecC), Boolean.valueOf(n14193DevGenATCU), A14193DevGenATCU, Boolean.valueOf(n14194DevGenSerA), A14194DevGenSerA, Boolean.valueOf(n14195DevGenTipA), A14195DevGenTipA, A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(16) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     updateTablesN10P31( ) ;
                     /* Start of After( Insert) rules */
                     if ( true /* After */ )
                     {
                        AV75Texto_ii = httpContext.getMessage( httpContext.getMessage( "TDEVGEN-Alta Registro,DevGenCod=", ""), "") + GXutil.trim( GXutil.str( A323DevGenCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + httpContext.getMessage( httpContext.getMessage( " NRecepcion=", ""), "") + GXutil.str( A44AlbRecCod, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Uni Ent=", ""), "") + GXutil.str( A58AlbRUniEnt, 9, 2) + " " + httpContext.getMessage( httpContext.getMessage( "Uni Dev=", ""), "") + GXutil.str( A328DevGenUni, 9, 2) + " " + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Pzs Ent=", ""), "") + GXutil.str( A52AlbRPieEnt, 6, 0) + httpContext.getMessage( httpContext.getMessage( "Pzs Dev=", ""), "") + GXutil.str( A326DevGenPie, 6, 0) + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV75Texto_ii", AV75Texto_ii);
                     }
                     if ( true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod, (byte)(0), "@") ;
                     }
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0P31( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption0P0( ) ;
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
            load0P31( ) ;
         }
         endLevel0P31( ) ;
      }
      closeExtendedTableCursors0P31( ) ;
   }

   public void update0P31( )
   {
      beforeValidate0P31( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P31( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P31( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P31( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0P31( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P19 */
                  pr_default.execute(17, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Boolean.valueOf(n5348DevHorSal), A5348DevHorSal, Boolean.valueOf(n325DevGenFec), A325DevGenFec, Boolean.valueOf(n328DevGenUni), A328DevGenUni, Boolean.valueOf(n326DevGenPie), Short.valueOf(A326DevGenPie), Boolean.valueOf(n5347DevMatric), A5347DevMatric, Boolean.valueOf(n6288DevGenDom), Byte.valueOf(A6288DevGenDom), Boolean.valueOf(n324DevGenEst), Byte.valueOf(A324DevGenEst), Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), Boolean.valueOf(n10071DevFmd), A10071DevFmd, Boolean.valueOf(n10072DevFmdD), A10072DevFmdD, Boolean.valueOf(n10073DevFHh), A10073DevFHh, Boolean.valueOf(n10074DevGrossT), A10074DevGrossT, Boolean.valueOf(n10075DevStt), A10075DevStt, Boolean.valueOf(n10736DevEnvAT), Byte.valueOf(A10736DevEnvAT), Boolean.valueOf(n10737DevATCodeI), A10737DevATCodeI, Boolean.valueOf(n10766DevGenAT), A10766DevGenAT, Boolean.valueOf(n10361DevDiscli), A10361DevDiscli, Boolean.valueOf(n10362DevMdl), A10362DevMdl, Boolean.valueOf(n12883DevAlbRecC), Integer.valueOf(A12883DevAlbRecC), Boolean.valueOf(n14193DevGenATCU), A14193DevGenATCU, Boolean.valueOf(n14194DevGenSerA), A14194DevGenSerA, Boolean.valueOf(n14195DevGenTipA), A14195DevGenTipA, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod), Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn), A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( (pr_default.getStatus(17) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVGEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0P31( ) ;
                  if ( AnyError == 0 )
                  {
                     updateTablesN10P31( ) ;
                     /* Start of After( update) rules */
                     if ( true /* After */ )
                     {
                        AV75Texto_ii = httpContext.getMessage( httpContext.getMessage( "TDEVGEN-Modificacion Registro,DevGenCod=", ""), "") + GXutil.trim( GXutil.str( A323DevGenCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + httpContext.getMessage( httpContext.getMessage( " NRecepcion=", ""), "") + GXutil.str( A44AlbRecCod, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Uni Dev Old=", ""), "") + GXutil.str( AV73OldUni, 9, 2) + httpContext.getMessage( httpContext.getMessage( "Pzs Dev old=", ""), "") + GXutil.str( AV74OldPzas, 6, 0) + " " + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Uni Dev New=", ""), "") + GXutil.str( A328DevGenUni, 9, 2) + httpContext.getMessage( httpContext.getMessage( "Pzs Dev New=", ""), "") + GXutil.str( A326DevGenPie, 6, 0) + " " + GXutil.newLine( ) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV75Texto_ii", AV75Texto_ii);
                     }
                     else
                     {
                        if ( true /* After */ )
                        {
                           AV75Texto_ii = httpContext.getMessage( httpContext.getMessage( "TDEVGEN-Eliminacion Registro,DevGenCod=", ""), "") + GXutil.trim( GXutil.str( A323DevGenCod, 8, 0)) + httpContext.getMessage( httpContext.getMessage( " Cliente=", ""), "") + GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + " " + GXutil.trim( A279CliNom) + httpContext.getMessage( httpContext.getMessage( " Articulo=", ""), "") + GXutil.trim( A45AlbRef) + httpContext.getMessage( httpContext.getMessage( " NRecepcion=", ""), "") + GXutil.str( A44AlbRecCod, 8, 0) + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Uni Dev Old=", ""), "") + GXutil.str( AV73OldUni, 9, 2) + httpContext.getMessage( httpContext.getMessage( "Pzs Dev old=", ""), "") + GXutil.str( AV74OldPzas, 6, 0) + " " + GXutil.newLine( ) + httpContext.getMessage( httpContext.getMessage( "Uni Dev New=", ""), "") + GXutil.str( A328DevGenUni, 9, 2) + httpContext.getMessage( httpContext.getMessage( "Pzs Dev New=", ""), "") + GXutil.str( A326DevGenPie, 6, 0) + " " + GXutil.newLine( ) ;
                           httpContext.ajax_rsp_assign_attri("", false, "AV75Texto_ii", AV75Texto_ii);
                        }
                     }
                     if ( true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod, (byte)(0), "@") ;
                     }
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0P31( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaption0P0( ) ;
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
         endLevel0P31( ) ;
      }
      closeExtendedTableCursors0P31( ) ;
   }

   public void deferredUpdate0P31( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0P31( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P31( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0P31( ) ;
         afterConfirm0P31( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0P31( ) ;
            if ( AnyError == 0 )
            {
               A1304DevUlin = O1304DevUlin ;
               n1304DevUlin = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               scanStart0P192( ) ;
               while ( RcdFound192 != 0 )
               {
                  getByPrimaryKey0P192( ) ;
                  delete0P192( ) ;
                  scanNext0P192( ) ;
                  O1304DevUlin = A1304DevUlin ;
                  n1304DevUlin = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
               }
               scanEnd0P192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P20 */
                  pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
                  if ( AnyError == 0 )
                  {
                     updateTablesN10P31( ) ;
                     /* Start of After( delete) rules */
                     if ( true /* After */ )
                     {
                        new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod, (byte)(0), "@") ;
                     }
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound31 == 0 )
                        {
                           initAll0P31( ) ;
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
                        resetCaption0P0( ) ;
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
      endLevel0P31( ) ;
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0P31( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000P21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
         Z47AlbREst = T000P21_A47AlbREst[0] ;
         Z45AlbRef = T000P21_A45AlbRef[0] ;
         Z252CliCod = T000P21_A252CliCod[0] ;
         Z56AlbRUni = T000P21_A56AlbRUni[0] ;
         Z52AlbRPieEnt = T000P21_A52AlbRPieEnt[0] ;
         Z58AlbRUniEnt = T000P21_A58AlbRUniEnt[0] ;
         Z3359AlbRDisCli = T000P21_A3359AlbRDisCli[0] ;
         Z4602AlbRMdlCod = T000P21_A4602AlbRMdlCod[0] ;
         A47AlbREst = T000P21_A47AlbREst[0] ;
         A60AlbRUniUti = T000P21_A60AlbRUniUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         A54AlbRPieUti = T000P21_A54AlbRPieUti[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         A45AlbRef = T000P21_A45AlbRef[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
         A252CliCod = T000P21_A252CliCod[0] ;
         n252CliCod = T000P21_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A56AlbRUni = T000P21_A56AlbRUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
         A52AlbRPieEnt = T000P21_A52AlbRPieEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
         A58AlbRUniEnt = T000P21_A58AlbRUniEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
         A3359AlbRDisCli = T000P21_A3359AlbRDisCli[0] ;
         A4602AlbRMdlCod = T000P21_A4602AlbRMdlCod[0] ;
         O54AlbRPieUti = A54AlbRPieUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
         O60AlbRUniUti = A60AlbRUniUti ;
         httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         pr_default.close(19);
         /* Using cursor T000P22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         A279CliNom = T000P22_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         pr_default.close(20);
         if ( true )
         {
            AV19AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
         }
         else
         {
            if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
            {
               AV19AlbRUniDis = AV21AlbRUDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
            }
         }
         if ( isDlt( )  && true /* Level */ )
         {
            A60AlbRUniUti = O60AlbRUniUti.subtract(A328DevGenUni) ;
            httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
         }
         else
         {
            if ( isIns( )  || isUpd( )  || isDlt( )  )
            {
               A60AlbRUniUti = O60AlbRUniUti.add(A328DevGenUni).subtract(O328DevGenUni) ;
               httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
            }
         }
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
         AV73OldUni = O328DevGenUni ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73OldUni", GXutil.ltrimstr( AV73OldUni, 9, 2));
         if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV26Kilos = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26Kilos", GXutil.ltrimstr( AV26Kilos, 9, 2));
         }
         if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV27Metros = A328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Metros", GXutil.ltrimstr( AV27Metros, 9, 2));
         }
         if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
         {
            AV23KilAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23KilAnt", GXutil.ltrimstr( AV23KilAnt, 9, 2));
         }
         if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
         {
            AV24MetAnt = O328DevGenUni ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24MetAnt", GXutil.ltrimstr( AV24MetAnt, 9, 2));
         }
         if ( true )
         {
            AV18AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
         }
         else
         {
            if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
            {
               AV18AlbRPieDis = AV20AlbRPDis ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
            }
         }
         AV28Piezas = A326DevGenPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Piezas), 4, 0));
         AV25PieAnt = O326DevGenPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PieAnt), 4, 0));
         if ( isDlt( )  && true /* Level */ )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti-A326DevGenPie) ;
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
         AV74OldPzas = O326DevGenPie ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74OldPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74OldPzas), 4, 0));
         /* Using cursor T000P23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
         A329DevTrnNom = T000P23_A329DevTrnNom[0] ;
         n329DevTrnNom = T000P23_n329DevTrnNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
         pr_default.close(21);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000P24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas devueltas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
      }
   }

   public void processNestedLevel0P192( )
   {
      s1304DevUlin = O1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      nGXsfl_169_idx = 0 ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         readRow0P192( ) ;
         if ( ( nRcdExists_192 != 0 ) || ( nIsMod_192 != 0 ) )
         {
            standaloneNotModal0P192( ) ;
            getKey0P192( ) ;
            if ( ( nRcdExists_192 == 0 ) && ( nRcdDeleted_192 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0P192( ) ;
            }
            else
            {
               if ( RcdFound192 != 0 )
               {
                  if ( ( nRcdDeleted_192 != 0 ) && ( nRcdExists_192 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0P192( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_192 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0P192( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_192 == 0 )
                  {
                     GXCCtl = "DEVLIN_" + sGXsfl_169_idx ;
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
         httpContext.changePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_169_idx, GXutil.rtrim( Z1303DevObs)) ;
         httpContext.changePostValue( "nRcdDeleted_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_192_"+sGXsfl_169_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_192 != 0 )
         {
            httpContext.changePostValue( "DEVLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DEVOBS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0P192( ) ;
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

   public void processLevel0P31( )
   {
      /* Save parent mode. */
      sMode31 = Gx_mode ;
      processNestedLevel0P192( ) ;
      if ( AnyError != 0 )
      {
         O1304DevUlin = s1304DevUlin ;
         n1304DevUlin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode31 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T000P25 */
      pr_default.execute(23, new Object[] {Boolean.valueOf(n1304DevUlin), Byte.valueOf(A1304DevUlin), A396EmprCod, Integer.valueOf(A323DevGenCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVGEN");
   }

   public void updateTablesN10P31( )
   {
      /* Using cursor T000P26 */
      pr_default.execute(24, new Object[] {Byte.valueOf(A47AlbREst), A60AlbRUniUti, Integer.valueOf(A54AlbRPieUti), A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPALBREC");
   }

   public void endLevel0P31( )
   {
      pr_default.close(2);
      pr_default.close(15);
      if ( AnyError == 0 )
      {
         beforeComplete0P31( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdevgen");
         if ( AnyError == 0 )
         {
            confirmValues0P0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdevgen");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0P31( )
   {
      /* Scan By routine */
      /* Using cursor T000P27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T000P27_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0P31( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A323DevGenCod = T000P27_A323DevGenCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
   }

   public void scanEnd0P31( )
   {
      pr_default.close(25);
   }

   public void afterConfirm0P31( )
   {
      /* After Confirm Rules */
      if ( (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         GXv_int10[0] = A323DevGenCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int10) ;
         tdevgen_impl.this.A323DevGenCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      }
   }

   public void beforeInsert0P31( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0P31( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0P31( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0P31( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0P31( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0P31( )
   {
      edtDevGenCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenCod_Enabled), 5, 0), true);
      edtAlbRecCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      edtAlbRef_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRef_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtDevGenFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenFec_Enabled), 5, 0), true);
      edtDevHorSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevHorSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevHorSal_Enabled), 5, 0), true);
      edtDevGenUni_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenUni_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenUni_Enabled), 5, 0), true);
      cmbAlbRUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbAlbRUni.getEnabled(), 5, 0), true);
      edtDevGenPie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenPie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenPie_Enabled), 5, 0), true);
      edtDevGenTrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenTrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenTrn_Enabled), 5, 0), true);
      edtDevTrnNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevTrnNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevTrnNom_Enabled), 5, 0), true);
      edtDevMatric_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevMatric_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevMatric_Enabled), 5, 0), true);
      edtDevGenDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenDom_Enabled), 5, 0), true);
      edtAlbRUniDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniDis_Enabled), 5, 0), true);
      edtAlbRPieDis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieDis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieDis_Enabled), 5, 0), true);
      edtAlbRUniUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniUti_Enabled), 5, 0), true);
      edtAlbRPieUti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieUti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieUti_Enabled), 5, 0), true);
      edtAlbRPieEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRPieEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRPieEnt_Enabled), 5, 0), true);
      edtAlbRUniEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRUniEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRUniEnt_Enabled), 5, 0), true);
      edtDevFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFmd_Enabled), 5, 0), true);
      edtDevFmdD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFmdD_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFmdD_Enabled), 5, 0), true);
      edtDevFHh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFHh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFHh_Enabled), 5, 0), true);
      edtDevGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGrossT_Enabled), 5, 0), true);
      edtDevStt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevStt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevStt_Enabled), 5, 0), true);
      edtDevEnvAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevEnvAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevEnvAT_Enabled), 5, 0), true);
      edtDevATCodeI_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevATCodeI_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevATCodeI_Enabled), 5, 0), true);
      edtDevGenAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevGenAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevGenAT_Enabled), 5, 0), true);
      edtDevDiscli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevDiscli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevDiscli_Enabled), 5, 0), true);
      edtDevMdl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevMdl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevMdl_Enabled), 5, 0), true);
   }

   public void zm0P192( int GX_JID )
   {
      if ( ( GX_JID == 53 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1303DevObs = T000P3_A1303DevObs[0] ;
         }
         else
         {
            Z1303DevObs = A1303DevObs ;
         }
      }
      if ( GX_JID == -53 )
      {
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         Z1303DevObs = A1303DevObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal0P192( )
   {
   }

   public void standaloneModal0P192( )
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
         httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      }
      else
      {
         edtDevLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      }
   }

   public void load0P192( )
   {
      /* Using cursor T000P28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1303DevObs = T000P28_A1303DevObs[0] ;
         zm0P192( -53) ;
      }
      pr_default.close(26);
      onLoadActions0P192( ) ;
   }

   public void onLoadActions0P192( )
   {
   }

   public void checkExtendedTable0P192( )
   {
      nIsDirty_192 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal0P192( ) ;
   }

   public void closeExtendedTableCursors0P192( )
   {
   }

   public void enableDisable0P192( )
   {
   }

   public void getKey0P192( )
   {
      /* Using cursor T000P29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound192 = (short)(1) ;
      }
      else
      {
         RcdFound192 = (short)(0) ;
      }
      pr_default.close(27);
   }

   public void getByPrimaryKey0P192( )
   {
      /* Using cursor T000P3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T000P3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0P192( 53) ;
         RcdFound192 = (short)(1) ;
         initializeNonKey0P192( ) ;
         A1302DevLin = T000P3_A1302DevLin[0] ;
         A1303DevObs = T000P3_A1303DevObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z323DevGenCod = A323DevGenCod ;
         Z1302DevLin = A1302DevLin ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0P192( ) ;
         load0P192( ) ;
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound192 = (short)(0) ;
         initializeNonKey0P192( ) ;
         sMode192 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0P192( ) ;
         Gx_mode = sMode192 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes0P192( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0P192( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000P2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1303DevObs, T000P2_A1303DevObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1303DevObs, T000P2_A1303DevObs[0]) != 0 )
            {
               GXutil.writeLogln("tdevgen:[seudo value changed for attri]"+"DevObs");
               GXutil.writeLogRaw("Old: ",Z1303DevObs);
               GXutil.writeLogRaw("Current: ",T000P2_A1303DevObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVOBS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0P192( )
   {
      beforeValidate0P192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P192( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0P192( 0) ;
         checkOptimisticConcurrency0P192( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P192( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0P192( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P30 */
                  pr_default.execute(28, new Object[] {Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin), A1303DevObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                  if ( (pr_default.getStatus(28) == 1) )
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
            load0P192( ) ;
         }
         endLevel0P192( ) ;
      }
      closeExtendedTableCursors0P192( ) ;
   }

   public void update0P192( )
   {
      beforeValidate0P192( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P192( ) ;
      }
      if ( ( nIsMod_192 != 0 ) || ( nIsDirty_192 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency0P192( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm0P192( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate0P192( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T000P31 */
                     pr_default.execute(29, new Object[] {A1303DevObs, A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVOBS");
                     if ( (pr_default.getStatus(29) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVOBS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate0P192( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey0P192( ) ;
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
            endLevel0P192( ) ;
         }
      }
      closeExtendedTableCursors0P192( ) ;
   }

   public void deferredUpdate0P192( )
   {
   }

   public void delete0P192( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0P192( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P192( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0P192( ) ;
         afterConfirm0P192( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0P192( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000P32 */
               pr_default.execute(30, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod), Byte.valueOf(A1302DevLin)});
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
      endLevel0P192( ) ;
      Gx_mode = sMode192 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0P192( )
   {
      standaloneModal0P192( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0P192( )
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

   public void scanStart0P192( )
   {
      /* Scan By routine */
      /* Using cursor T000P33 */
      pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A323DevGenCod)});
      RcdFound192 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = T000P33_A1302DevLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0P192( )
   {
      /* Scan next routine */
      pr_default.readNext(31);
      RcdFound192 = (short)(0) ;
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound192 = (short)(1) ;
         A1302DevLin = T000P33_A1302DevLin[0] ;
      }
   }

   public void scanEnd0P192( )
   {
      pr_default.close(31);
   }

   public void afterConfirm0P192( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0P192( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0P192( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0P192( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0P192( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0P192( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0P192( )
   {
      edtDevLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
      edtDevObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevObs_Enabled), 5, 0), !bGXsfl_169_Refreshing);
   }

   public void send_integrity_lvl_hashes0P192( )
   {
   }

   public void send_integrity_lvl_hashes0P31( )
   {
   }

   public void subsflControlProps_169192( )
   {
      edtDevLin_Internalname = "DEVLIN_"+sGXsfl_169_idx ;
      edtDevObs_Internalname = "DEVOBS_"+sGXsfl_169_idx ;
   }

   public void subsflControlProps_fel_169192( )
   {
      edtDevLin_Internalname = "DEVLIN_"+sGXsfl_169_fel_idx ;
      edtDevObs_Internalname = "DEVOBS_"+sGXsfl_169_fel_idx ;
   }

   public void addRow0P192( )
   {
      nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_169192( ) ;
      sendRow0P192( ) ;
   }

   public void sendRow0P192( )
   {
      Gridtdevgen_level1itemRow = GXWebRow.GetNew(context) ;
      if ( subGridtdevgen_level1item_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtdevgen_level1item_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtdevgen_level1item_Class, "") != 0 )
         {
            subGridtdevgen_level1item_Linesclass = subGridtdevgen_level1item_Class+"Odd" ;
         }
      }
      else if ( subGridtdevgen_level1item_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtdevgen_level1item_Backstyle = (byte)(0) ;
         subGridtdevgen_level1item_Backcolor = subGridtdevgen_level1item_Allbackcolor ;
         if ( GXutil.strcmp(subGridtdevgen_level1item_Class, "") != 0 )
         {
            subGridtdevgen_level1item_Linesclass = subGridtdevgen_level1item_Class+"Uniform" ;
         }
      }
      else if ( subGridtdevgen_level1item_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtdevgen_level1item_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtdevgen_level1item_Class, "") != 0 )
         {
            subGridtdevgen_level1item_Linesclass = subGridtdevgen_level1item_Class+"Odd" ;
         }
         subGridtdevgen_level1item_Backcolor = (int)(0x0) ;
      }
      else if ( subGridtdevgen_level1item_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtdevgen_level1item_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_169_idx) % (2))) == 0 )
         {
            subGridtdevgen_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdevgen_level1item_Class, "") != 0 )
            {
               subGridtdevgen_level1item_Linesclass = subGridtdevgen_level1item_Class+"Even" ;
            }
         }
         else
         {
            subGridtdevgen_level1item_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtdevgen_level1item_Class, "") != 0 )
            {
               subGridtdevgen_level1item_Linesclass = subGridtdevgen_level1item_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_192_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 170,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridtdevgen_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevLin_Internalname,GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1302DevLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_192_" + sGXsfl_169_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 171,'',false,'" + sGXsfl_169_idx + "',169)\"" ;
      ROClassString = "Attribute" ;
      Gridtdevgen_level1itemRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevObs_Internalname,GXutil.rtrim( A1303DevObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,171);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(-1),Integer.valueOf(edtDevObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(169),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridtdevgen_level1itemRow);
      send_integrity_lvl_hashes0P192( ) ;
      GXCCtl = "Z1302DevLin_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1302DevLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z1303DevObs_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1303DevObs));
      GXCCtl = "nRcdDeleted_192_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_192_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_192_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_192, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_169_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVLIN_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVOBS_"+sGXsfl_169_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtdevgen_level1itemContainer.AddRow(Gridtdevgen_level1itemRow);
   }

   public void readRow0P192( )
   {
      nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_169192( ) ;
      edtDevLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVLIN_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDevObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DEVOBS_"+sGXsfl_169_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "DEVLIN_" + sGXsfl_169_idx ;
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
      GXCCtl = "Z1302DevLin_" + sGXsfl_169_idx ;
      Z1302DevLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z1303DevObs_" + sGXsfl_169_idx ;
      Z1303DevObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_192_" + sGXsfl_169_idx ;
      nRcdDeleted_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_192_" + sGXsfl_169_idx ;
      nRcdExists_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_192_" + sGXsfl_169_idx ;
      nIsMod_192 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDevLin_Enabled = edtDevLin_Enabled ;
   }

   public void confirmValues0P0( )
   {
      nGXsfl_169_idx = 0 ;
      sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_169192( ) ;
      while ( nGXsfl_169_idx < nRC_GXsfl_169 )
      {
         nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
         sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_169192( ) ;
         httpContext.changePostValue( "Z1302DevLin_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z1302DevLin_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1302DevLin_"+sGXsfl_169_idx) ;
         httpContext.changePostValue( "Z1303DevObs_"+sGXsfl_169_idx, httpContext.cgiGet( "ZT_"+"Z1303DevObs_"+sGXsfl_169_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1303DevObs_"+sGXsfl_169_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdevgen", new String[] {}, new String[] {}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDEVGEN");
      forbiddenHiddens.add("DevFmd", GXutil.rtrim( localUtil.format( A10071DevFmd, "")));
      forbiddenHiddens.add("Modo", GXutil.rtrim( localUtil.format( AV29Modo, "")));
      forbiddenHiddens.add("DevGenEst", localUtil.format( DecimalUtil.doubleToDec(A324DevGenEst), "9"));
      forbiddenHiddens.add("DevFmdD", GXutil.rtrim( localUtil.format( A10072DevFmdD, "")));
      forbiddenHiddens.add("DevFHh", localUtil.format( A10073DevFHh, "99/99/99 99:99:99"));
      forbiddenHiddens.add("DevGrossT", localUtil.format( A10074DevGrossT, "ZZZZZZZZZ9.99"));
      forbiddenHiddens.add("DevStt", GXutil.rtrim( localUtil.format( A10075DevStt, "")));
      forbiddenHiddens.add("DevEnvAT", localUtil.format( DecimalUtil.doubleToDec(A10736DevEnvAT), "9"));
      forbiddenHiddens.add("DevATCodeI", GXutil.rtrim( localUtil.format( A10737DevATCodeI, "")));
      forbiddenHiddens.add("DevGenAT", GXutil.rtrim( localUtil.format( A10766DevGenAT, "")));
      forbiddenHiddens.add("DevAlbRecC", localUtil.format( DecimalUtil.doubleToDec(A12883DevAlbRecC), "ZZZZZZZ9"));
      forbiddenHiddens.add("DevGenATCU", GXutil.rtrim( localUtil.format( A14193DevGenATCU, "")));
      forbiddenHiddens.add("DevGenSerA", GXutil.rtrim( localUtil.format( A14194DevGenSerA, "")));
      forbiddenHiddens.add("DevGenTipA", GXutil.rtrim( localUtil.format( A14195DevGenTipA, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdevgen:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z323DevGenCod", GXutil.ltrim( localUtil.ntoc( Z323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5348DevHorSal", localUtil.ttoc( Z5348DevHorSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z325DevGenFec", localUtil.dtoc( Z325DevGenFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z328DevGenUni", GXutil.ltrim( localUtil.ntoc( Z328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z326DevGenPie", GXutil.ltrim( localUtil.ntoc( Z326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5347DevMatric", GXutil.rtrim( Z5347DevMatric));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6288DevGenDom", GXutil.ltrim( localUtil.ntoc( Z6288DevGenDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z324DevGenEst", GXutil.ltrim( localUtil.ntoc( Z324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1304DevUlin", GXutil.ltrim( localUtil.ntoc( Z1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10071DevFmd", GXutil.rtrim( Z10071DevFmd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10072DevFmdD", GXutil.rtrim( Z10072DevFmdD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10073DevFHh", localUtil.ttoc( Z10073DevFHh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10074DevGrossT", GXutil.ltrim( localUtil.ntoc( Z10074DevGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10075DevStt", GXutil.rtrim( Z10075DevStt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10736DevEnvAT", GXutil.ltrim( localUtil.ntoc( Z10736DevEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10737DevATCodeI", GXutil.rtrim( Z10737DevATCodeI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10766DevGenAT", GXutil.rtrim( Z10766DevGenAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10361DevDiscli", GXutil.rtrim( Z10361DevDiscli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10362DevMdl", GXutil.rtrim( Z10362DevMdl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12883DevAlbRecC", GXutil.ltrim( localUtil.ntoc( Z12883DevAlbRecC, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14193DevGenATCU", GXutil.rtrim( Z14193DevGenATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14194DevGenSerA", GXutil.rtrim( Z14194DevGenSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14195DevGenTipA", GXutil.rtrim( Z14195DevGenTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z327DevGenTrn", GXutil.ltrim( localUtil.ntoc( Z327DevGenTrn, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3359AlbRDisCli", GXutil.rtrim( Z3359AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "O1304DevUlin", GXutil.ltrim( localUtil.ntoc( O1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O328DevGenUni", GXutil.ltrim( localUtil.ntoc( O328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O326DevGenPie", GXutil.ltrim( localUtil.ntoc( O326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_169", GXutil.ltrim( localUtil.ntoc( nGXsfl_169_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MODO", GXutil.rtrim( AV29Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPIEDIS", GXutil.ltrim( localUtil.ntoc( AV18AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNIDIS", GXutil.ltrim( localUtil.ntoc( AV19AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBREST", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODO", GXutil.rtrim( AV29Modo));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEZAS", GXutil.ltrim( localUtil.ntoc( AV28Piezas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPIEANT", GXutil.ltrim( localUtil.ntoc( AV25PieAnt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDUNI", GXutil.ltrim( localUtil.ntoc( AV73OldUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDPZAS", GXutil.ltrim( localUtil.ntoc( AV74OldPzas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO_II", AV75Texto_ii);
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRDISCLI", GXutil.rtrim( A3359AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRMDLCOD", GXutil.rtrim( A4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILOS", GXutil.ltrim( localUtil.ntoc( AV26Kilos, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETROS", GXutil.ltrim( localUtil.ntoc( AV27Metros, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vKILANT", GXutil.ltrim( localUtil.ntoc( AV23KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMETANT", GXutil.ltrim( localUtil.ntoc( AV24MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUNI", GXutil.rtrim( AV22AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRPDIS", GXutil.ltrim( localUtil.ntoc( AV20AlbRPDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRUDIS", GXutil.ltrim( localUtil.ntoc( AV21AlbRUDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV71FirmaD, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV81Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV33Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSG_CONTROL", AV79msg_control);
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENEST", GXutil.ltrim( localUtil.ntoc( A324DevGenEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVULIN", GXutil.ltrim( localUtil.ntoc( A1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVALBRECC", GXutil.ltrim( localUtil.ntoc( A12883DevAlbRecC, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENATCU", GXutil.rtrim( A14193DevGenATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENSERA", GXutil.rtrim( A14194DevGenSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENTIPA", GXutil.rtrim( A14195DevGenTipA));
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
      return formatLink("app.tdevgen", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TDEVGEN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion de Entradas Almacen v 01", "") ;
   }

   public void initializeNonKey0P31( )
   {
      AV18AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
      AV19AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
      AV22AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22AlbRUni", AV22AlbRUni);
      AV20AlbRPDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbRPDis), 6, 0));
      AV21AlbRUDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbRUDis", GXutil.ltrimstr( AV21AlbRUDis, 9, 2));
      A47AlbREst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.str( A47AlbREst, 1, 0));
      AV29Modo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Modo", AV29Modo);
      AV28Piezas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Piezas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Piezas), 4, 0));
      AV25PieAnt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25PieAnt), 4, 0));
      A5348DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      n5348DevHorSal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A60AlbRUniUti = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      A54AlbRPieUti = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      AV73OldUni = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73OldUni", GXutil.ltrimstr( AV73OldUni, 9, 2));
      AV74OldPzas = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74OldPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74OldPzas), 4, 0));
      AV75Texto_ii = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75Texto_ii", AV75Texto_ii);
      AV79msg_control = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79msg_control", AV79msg_control);
      A51AlbRPieDis = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(A51AlbRPieDis), 6, 0));
      A57AlbRUniDis = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrimstr( A57AlbRUniDis, 9, 2));
      AV71FirmaD = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71FirmaD", GXutil.str( AV71FirmaD, 1, 0));
      A44AlbRecCod = 0 ;
      n44AlbRecCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
      A45AlbRef = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", A45AlbRef);
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A328DevGenUni = DecimalUtil.ZERO ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      A56AlbRUni = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", A56AlbRUni);
      A326DevGenPie = (short)(0) ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      A327DevGenTrn = (short)(0) ;
      n327DevGenTrn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrimstr( DecimalUtil.doubleToDec(A327DevGenTrn), 4, 0));
      A329DevTrnNom = "" ;
      n329DevTrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", A329DevTrnNom);
      A5347DevMatric = "" ;
      n5347DevMatric = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5347DevMatric", A5347DevMatric);
      A6288DevGenDom = (byte)(0) ;
      n6288DevGenDom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.str( A6288DevGenDom, 1, 0));
      A52AlbRPieEnt = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A52AlbRPieEnt), 6, 0));
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrimstr( A58AlbRUniEnt, 9, 2));
      A324DevGenEst = (byte)(0) ;
      n324DevGenEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A324DevGenEst", GXutil.str( A324DevGenEst, 1, 0));
      A1304DevUlin = (byte)(0) ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      A10071DevFmd = "" ;
      n10071DevFmd = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10071DevFmd", A10071DevFmd);
      A10072DevFmdD = "" ;
      n10072DevFmdD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10072DevFmdD", A10072DevFmdD);
      A10073DevFHh = GXutil.resetTime( GXutil.nullDate() );
      n10073DevFHh = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10073DevFHh", localUtil.ttoc( A10073DevFHh, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A10074DevGrossT = DecimalUtil.ZERO ;
      n10074DevGrossT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10074DevGrossT", GXutil.ltrimstr( A10074DevGrossT, 13, 2));
      A3359AlbRDisCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", A3359AlbRDisCli);
      A4602AlbRMdlCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", A4602AlbRMdlCod);
      A12883DevAlbRecC = 0 ;
      n12883DevAlbRecC = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12883DevAlbRecC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12883DevAlbRecC), 8, 0));
      A14193DevGenATCU = "" ;
      n14193DevGenATCU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14193DevGenATCU", A14193DevGenATCU);
      A14194DevGenSerA = "" ;
      n14194DevGenSerA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14194DevGenSerA", A14194DevGenSerA);
      A14195DevGenTipA = "" ;
      n14195DevGenTipA = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14195DevGenTipA", A14195DevGenTipA);
      AV26Kilos = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Kilos", GXutil.ltrimstr( AV26Kilos, 9, 2));
      AV27Metros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Metros", GXutil.ltrimstr( AV27Metros, 9, 2));
      AV23KilAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23KilAnt", GXutil.ltrimstr( AV23KilAnt, 9, 2));
      AV24MetAnt = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24MetAnt", GXutil.ltrimstr( AV24MetAnt, 9, 2));
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      A10075DevStt = " " ;
      n10075DevStt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10075DevStt", A10075DevStt);
      A10736DevEnvAT = (byte)(0) ;
      n10736DevEnvAT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10736DevEnvAT", GXutil.str( A10736DevEnvAT, 1, 0));
      A10737DevATCodeI = " " ;
      n10737DevATCodeI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10737DevATCodeI", A10737DevATCodeI);
      A10766DevGenAT = " " ;
      n10766DevGenAT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10766DevGenAT", A10766DevGenAT);
      A10361DevDiscli = "" ;
      n10361DevDiscli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10361DevDiscli", A10361DevDiscli);
      A10362DevMdl = "" ;
      n10362DevMdl = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10362DevMdl", A10362DevMdl);
      O1304DevUlin = A1304DevUlin ;
      n1304DevUlin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1304DevUlin), 2, 0));
      O328DevGenUni = A328DevGenUni ;
      n328DevGenUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrimstr( A328DevGenUni, 9, 2));
      O326DevGenPie = A326DevGenPie ;
      n326DevGenPie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A326DevGenPie), 4, 0));
      O54AlbRPieUti = A54AlbRPieUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(A54AlbRPieUti), 6, 0));
      O60AlbRUniUti = A60AlbRUniUti ;
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrimstr( A60AlbRUniUti, 9, 2));
      Z5348DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      Z325DevGenFec = GXutil.nullDate() ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z326DevGenPie = (short)(0) ;
      Z5347DevMatric = "" ;
      Z6288DevGenDom = (byte)(0) ;
      Z324DevGenEst = (byte)(0) ;
      Z1304DevUlin = (byte)(0) ;
      Z10071DevFmd = "" ;
      Z10072DevFmdD = "" ;
      Z10073DevFHh = GXutil.resetTime( GXutil.nullDate() );
      Z10074DevGrossT = DecimalUtil.ZERO ;
      Z10075DevStt = "" ;
      Z10736DevEnvAT = (byte)(0) ;
      Z10737DevATCodeI = "" ;
      Z10766DevGenAT = "" ;
      Z10361DevDiscli = "" ;
      Z10362DevMdl = "" ;
      Z12883DevAlbRecC = 0 ;
      Z14193DevGenATCU = "" ;
      Z14194DevGenSerA = "" ;
      Z14195DevGenTipA = "" ;
      Z44AlbRecCod = 0 ;
      Z327DevGenTrn = (short)(0) ;
      Z47AlbREst = (byte)(0) ;
      Z45AlbRef = "" ;
      Z252CliCod = 0 ;
      Z56AlbRUni = "" ;
      Z52AlbRPieEnt = 0 ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z3359AlbRDisCli = "" ;
      Z4602AlbRMdlCod = "" ;
   }

   public void initAll0P31( )
   {
      A323DevGenCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A323DevGenCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A323DevGenCod), 8, 0));
      initializeNonKey0P31( ) ;
   }

   public void standaloneModalInsert( )
   {
      AV29Modo = iV29Modo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Modo", AV29Modo);
      A325DevGenFec = i325DevGenFec ;
      n325DevGenFec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      A10075DevStt = i10075DevStt ;
      n10075DevStt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10075DevStt", A10075DevStt);
      A10737DevATCodeI = i10737DevATCodeI ;
      n10737DevATCodeI = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10737DevATCodeI", A10737DevATCodeI);
      A10736DevEnvAT = i10736DevEnvAT ;
      n10736DevEnvAT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10736DevEnvAT", GXutil.str( A10736DevEnvAT, 1, 0));
      A10766DevGenAT = i10766DevGenAT ;
      n10766DevGenAT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10766DevGenAT", A10766DevGenAT);
   }

   public void initializeNonKey0P192( )
   {
      A1303DevObs = "" ;
      Z1303DevObs = "" ;
   }

   public void initAll0P192( )
   {
      A1302DevLin = (byte)(0) ;
      initializeNonKey0P192( ) ;
   }

   public void standaloneModalInsert0P192( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682414594254", true, true);
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
      httpContext.AddJavascriptSource("tdevgen.js", "?202682414594254", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties192( )
   {
      edtDevLin_Enabled = defedtDevLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevLin_Enabled), 5, 0), !bGXsfl_169_Refreshing);
   }

   public void startgridcontrol169( )
   {
      Gridtdevgen_level1itemContainer.AddObjectProperty("GridName", "Gridtdevgen_level1item");
      Gridtdevgen_level1itemContainer.AddObjectProperty("Header", subGridtdevgen_level1item_Header);
      Gridtdevgen_level1itemContainer.AddObjectProperty("Class", "WorkWith");
      Gridtdevgen_level1itemContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtdevgen_level1item_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("CmpContext", "");
      Gridtdevgen_level1itemContainer.AddObjectProperty("InMasterPage", "false");
      Gridtdevgen_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevgen_level1itemColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1302DevLin, (byte)(2), (byte)(0), ".", "")));
      Gridtdevgen_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddColumnProperties(Gridtdevgen_level1itemColumn);
      Gridtdevgen_level1itemColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridtdevgen_level1itemColumn.AddObjectProperty("Value", GXutil.rtrim( A1303DevObs));
      Gridtdevgen_level1itemColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDevObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddColumnProperties(Gridtdevgen_level1itemColumn);
      Gridtdevgen_level1itemContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridtdevgen_level1item_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtdevgen_level1item_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtdevgen_level1item_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtdevgen_level1item_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtdevgen_level1item_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtdevgen_level1item_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridtdevgen_level1itemContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtdevgen_level1item_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtDevGenFec_Internalname = "DEVGENFEC" ;
      edtDevHorSal_Internalname = "DEVHORSAL" ;
      edtDevGenUni_Internalname = "DEVGENUNI" ;
      cmbAlbRUni.setInternalname( "ALBRUNI" );
      edtDevGenPie_Internalname = "DEVGENPIE" ;
      edtDevGenTrn_Internalname = "DEVGENTRN" ;
      edtDevTrnNom_Internalname = "DEVTRNNOM" ;
      edtDevMatric_Internalname = "DEVMATRIC" ;
      edtDevGenDom_Internalname = "DEVGENDOM" ;
      edtAlbRUniDis_Internalname = "ALBRUNIDIS" ;
      edtAlbRPieDis_Internalname = "ALBRPIEDIS" ;
      edtAlbRUniUti_Internalname = "ALBRUNIUTI" ;
      edtAlbRPieUti_Internalname = "ALBRPIEUTI" ;
      edtAlbRPieEnt_Internalname = "ALBRPIEENT" ;
      edtAlbRUniEnt_Internalname = "ALBRUNIENT" ;
      edtDevFmd_Internalname = "DEVFMD" ;
      edtDevFmdD_Internalname = "DEVFMDD" ;
      edtDevFHh_Internalname = "DEVFHH" ;
      edtDevGrossT_Internalname = "DEVGROSST" ;
      edtDevStt_Internalname = "DEVSTT" ;
      edtDevEnvAT_Internalname = "DEVENVAT" ;
      edtDevATCodeI_Internalname = "DEVATCODEI" ;
      edtDevGenAT_Internalname = "DEVGENAT" ;
      edtDevDiscli_Internalname = "DEVDISCLI" ;
      edtDevMdl_Internalname = "DEVMDL" ;
      lblTitlelevel1_Internalname = "TITLELEVEL1" ;
      edtDevLin_Internalname = "DEVLIN" ;
      edtDevObs_Internalname = "DEVOBS" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Form.setInternalname( "FORM" );
      subGridtdevgen_level1item_Internalname = "GRIDTDEVGEN_LEVEL1ITEM" ;
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
      subGridtdevgen_level1item_Allowcollapsing = (byte)(0) ;
      subGridtdevgen_level1item_Allowselection = (byte)(0) ;
      subGridtdevgen_level1item_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Devolucion de Entradas Almacen v 01", "") );
      edtDevObs_Jsonclick = "" ;
      edtDevLin_Jsonclick = "" ;
      subGridtdevgen_level1item_Class = "WorkWith" ;
      subGridtdevgen_level1item_Backcolorstyle = (byte)(0) ;
      edtDevObs_Enabled = 1 ;
      edtDevLin_Enabled = 1 ;
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtDevMdl_Jsonclick = "" ;
      edtDevMdl_Enabled = 1 ;
      edtDevDiscli_Jsonclick = "" ;
      edtDevDiscli_Enabled = 1 ;
      edtDevGenAT_Jsonclick = "" ;
      edtDevGenAT_Enabled = 0 ;
      edtDevATCodeI_Jsonclick = "" ;
      edtDevATCodeI_Enabled = 0 ;
      edtDevEnvAT_Jsonclick = "" ;
      edtDevEnvAT_Enabled = 0 ;
      edtDevStt_Jsonclick = "" ;
      edtDevStt_Enabled = 0 ;
      edtDevGrossT_Jsonclick = "" ;
      edtDevGrossT_Enabled = 0 ;
      edtDevFHh_Jsonclick = "" ;
      edtDevFHh_Enabled = 0 ;
      edtDevFmdD_Enabled = 0 ;
      edtDevFmd_Enabled = 0 ;
      edtAlbRUniEnt_Jsonclick = "" ;
      edtAlbRUniEnt_Enabled = 0 ;
      edtAlbRPieEnt_Jsonclick = "" ;
      edtAlbRPieEnt_Enabled = 0 ;
      edtAlbRPieUti_Jsonclick = "" ;
      edtAlbRPieUti_Enabled = 0 ;
      edtAlbRUniUti_Jsonclick = "" ;
      edtAlbRUniUti_Enabled = 0 ;
      edtAlbRPieDis_Jsonclick = "" ;
      edtAlbRPieDis_Enabled = 0 ;
      edtAlbRUniDis_Jsonclick = "" ;
      edtAlbRUniDis_Enabled = 0 ;
      edtDevGenDom_Jsonclick = "" ;
      edtDevGenDom_Enabled = 1 ;
      edtDevMatric_Jsonclick = "" ;
      edtDevMatric_Enabled = 1 ;
      edtDevTrnNom_Jsonclick = "" ;
      edtDevTrnNom_Enabled = 0 ;
      edtDevGenTrn_Jsonclick = "" ;
      edtDevGenTrn_Enabled = 1 ;
      edtDevGenPie_Jsonclick = "" ;
      edtDevGenPie_Enabled = 1 ;
      cmbAlbRUni.setJsonclick( "" );
      cmbAlbRUni.setEnabled( 0 );
      edtDevGenUni_Jsonclick = "" ;
      edtDevGenUni_Enabled = 1 ;
      edtDevHorSal_Jsonclick = "" ;
      edtDevHorSal_Enabled = 1 ;
      edtDevGenFec_Jsonclick = "" ;
      edtDevGenFec_Enabled = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRef_Enabled = 0 ;
      edtAlbRecCod_Jsonclick = "" ;
      edtAlbRecCod_Enabled = 1 ;
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

   public void gx17asadevhorsal0P31( java.util.Date A325DevGenFec ,
                                     String Gx_mode ,
                                     String A396EmprCod )
   {
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A5348DevHorSal) && true /* After */ )
      {
         GXt_dtime5 = A5348DevHorSal ;
         GXv_dtime6[0] = GXt_dtime5 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime6) ;
         tdevgen_impl.this.GXt_dtime5 = GXv_dtime6[0] ;
         A5348DevHorSal = GXt_dtime5 ;
         n5348DevHorSal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.ttoc( A5348DevHorSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_36_0P31( String A396EmprCod ,
                           int A323DevGenCod ,
                           int A44AlbRecCod )
   {
      if ( (0==A323DevGenCod) && true /* After */ && true /* Level */ )
      {
         GXv_int10[0] = A323DevGenCod ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int10) ;
         A323DevGenCod = GXv_int10[0] ;
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

   public void xc_37_0P31( String A396EmprCod ,
                           int A44AlbRecCod ,
                           String AV22AlbRUni )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int8[0] = AV18AlbRPieDis ;
         GXv_decimal11[0] = AV19AlbRUniDis ;
         GXv_int7[0] = AV20AlbRPDis ;
         GXv_decimal9[0] = AV21AlbRUDis ;
         GXv_char3[0] = AV22AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8, GXv_decimal11, GXv_int7, GXv_decimal9, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         A44AlbRecCod = GXv_int10[0] ;
         AV18AlbRPieDis = GXv_int8[0] ;
         AV19AlbRUniDis = GXv_decimal11[0] ;
         AV20AlbRPDis = GXv_int7[0] ;
         AV21AlbRUDis = GXv_decimal9[0] ;
         AV22AlbRUni = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A44AlbRecCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18AlbRPieDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrimstr( AV19AlbRUniDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV20AlbRPDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbRPDis), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV21AlbRUDis", GXutil.ltrimstr( AV21AlbRUDis, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV22AlbRUni", AV22AlbRUni);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV18AlbRPieDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV19AlbRUniDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV20AlbRPDis, (byte)(6), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV21AlbRUDis, (byte)(9), (byte)(2), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV22AlbRUni))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_42_0P31( String A396EmprCod ,
                           String AV81Pgmname ,
                           String AV17UsurCod ,
                           String AV33Station ,
                           String AV75Texto_ii ,
                           int A323DevGenCod )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod, (byte)(0), "@") ;
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

   public void xc_43_0P31( String A396EmprCod ,
                           String AV81Pgmname ,
                           String AV17UsurCod ,
                           String AV33Station ,
                           String AV75Texto_ii ,
                           int A323DevGenCod )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod, (byte)(0), "@") ;
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

   public void xc_44_0P31( String A396EmprCod ,
                           String AV81Pgmname ,
                           String AV17UsurCod ,
                           String AV33Station ,
                           String AV75Texto_ii ,
                           int A323DevGenCod )
   {
      if ( true /* After */ )
      {
         new app.pctrinc(remoteHandle, context).execute( A396EmprCod, AV81Pgmname, AV17UsurCod, AV33Station, AV75Texto_ii, A323DevGenCod, (byte)(0), "@") ;
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

   public void xc_45_0P31( String A396EmprCod ,
                           java.util.Date A325DevGenFec )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV79msg_control ;
         new app.pcthashgendev(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         A396EmprCod = GXv_char4[0] ;
         AV79msg_control = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV79msg_control", AV79msg_control);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( AV79msg_control)+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridtdevgen_level1item_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_169192( ) ;
      while ( nGXsfl_169_idx <= nRC_GXsfl_169 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0P192( ) ;
         standaloneModal0P192( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow0P192( ) ;
         nGXsfl_169_idx = (int)(nGXsfl_169_idx+1) ;
         sGXsfl_169_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_169_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_169192( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridtdevgen_level1itemContainer)) ;
      /* End function gxnrGridtdevgen_level1item_newrow */
   }

   public void init_web_controls( )
   {
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
      /* Using cursor T000P34 */
      pr_default.execute(32, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T000P34_A407EmprNom[0] ;
      n407EmprNom = T000P34_n407EmprNom[0] ;
      pr_default.close(32);
      GX_FocusControl = edtAlbRecCod_Internalname ;
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
      n14195DevGenTipA = false ;
      n14194DevGenSerA = false ;
      n14193DevGenATCU = false ;
      n12883DevAlbRecC = false ;
      n10074DevGrossT = false ;
      n10073DevFHh = false ;
      n10072DevFmdD = false ;
      n324DevGenEst = false ;
      n10071DevFmd = false ;
      n1304DevUlin = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      n10075DevStt = false ;
      n325DevGenFec = false ;
      n10737DevATCodeI = false ;
      n10736DevEnvAT = false ;
      n10766DevGenAT = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A325DevGenFec", localUtil.format(A325DevGenFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "A328DevGenUni", GXutil.ltrim( localUtil.ntoc( A328DevGenUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A326DevGenPie", GXutil.ltrim( localUtil.ntoc( A326DevGenPie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A327DevGenTrn", GXutil.ltrim( localUtil.ntoc( A327DevGenTrn, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5347DevMatric", GXutil.rtrim( A5347DevMatric));
      httpContext.ajax_rsp_assign_attri("", false, "A6288DevGenDom", GXutil.ltrim( localUtil.ntoc( A6288DevGenDom, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A324DevGenEst", GXutil.ltrim( localUtil.ntoc( A324DevGenEst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A1304DevUlin", GXutil.ltrim( localUtil.ntoc( A1304DevUlin, (byte)(2), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10071DevFmd", GXutil.rtrim( A10071DevFmd));
      httpContext.ajax_rsp_assign_attri("", false, "A10072DevFmdD", GXutil.rtrim( A10072DevFmdD));
      httpContext.ajax_rsp_assign_attri("", false, "A10073DevFHh", localUtil.ttoc( A10073DevFHh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A10074DevGrossT", GXutil.ltrim( localUtil.ntoc( A10074DevGrossT, (byte)(13), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10075DevStt", GXutil.rtrim( A10075DevStt));
      httpContext.ajax_rsp_assign_attri("", false, "A10736DevEnvAT", GXutil.ltrim( localUtil.ntoc( A10736DevEnvAT, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10737DevATCodeI", GXutil.rtrim( A10737DevATCodeI));
      httpContext.ajax_rsp_assign_attri("", false, "A10766DevGenAT", GXutil.rtrim( A10766DevGenAT));
      httpContext.ajax_rsp_assign_attri("", false, "A12883DevAlbRecC", GXutil.ltrim( localUtil.ntoc( A12883DevAlbRecC, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A14193DevGenATCU", GXutil.rtrim( A14193DevGenATCU));
      httpContext.ajax_rsp_assign_attri("", false, "A14194DevGenSerA", GXutil.rtrim( A14194DevGenSerA));
      httpContext.ajax_rsp_assign_attri("", false, "A14195DevGenTipA", GXutil.rtrim( A14195DevGenTipA));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", GXutil.rtrim( A3359AlbRDisCli));
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", GXutil.rtrim( A4602AlbRMdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", GXutil.rtrim( A329DevTrnNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV22AlbRUni", GXutil.rtrim( AV22AlbRUni));
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV18AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV19AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbRPDis", GXutil.ltrim( localUtil.ntoc( AV20AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbRUDis", GXutil.ltrim( localUtil.ntoc( AV21AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV79msg_control", AV79msg_control);
      httpContext.ajax_rsp_assign_attri("", false, "AV73OldUni", GXutil.ltrim( localUtil.ntoc( AV73OldUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Kilos", GXutil.ltrim( localUtil.ntoc( AV26Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Metros", GXutil.ltrim( localUtil.ntoc( AV27Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV23KilAnt", GXutil.ltrim( localUtil.ntoc( AV23KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV24MetAnt", GXutil.ltrim( localUtil.ntoc( AV24MetAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Piezas", GXutil.ltrim( localUtil.ntoc( AV28Piezas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV25PieAnt", GXutil.ltrim( localUtil.ntoc( AV25PieAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV74OldPzas", GXutil.ltrim( localUtil.ntoc( AV74OldPzas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A10361DevDiscli", GXutil.rtrim( A10361DevDiscli));
      httpContext.ajax_rsp_assign_attri("", false, "A10362DevMdl", GXutil.rtrim( A10362DevMdl));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z323DevGenCod", GXutil.ltrim( localUtil.ntoc( Z323DevGenCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z44AlbRecCod", GXutil.ltrim( localUtil.ntoc( Z44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z325DevGenFec", localUtil.format(Z325DevGenFec, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z328DevGenUni", GXutil.ltrim( localUtil.ntoc( Z328DevGenUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z326DevGenPie", GXutil.ltrim( localUtil.ntoc( Z326DevGenPie, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z327DevGenTrn", GXutil.ltrim( localUtil.ntoc( Z327DevGenTrn, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5347DevMatric", GXutil.rtrim( Z5347DevMatric));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6288DevGenDom", GXutil.ltrim( localUtil.ntoc( Z6288DevGenDom, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z324DevGenEst", GXutil.ltrim( localUtil.ntoc( Z324DevGenEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1304DevUlin", GXutil.ltrim( localUtil.ntoc( Z1304DevUlin, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10071DevFmd", GXutil.rtrim( Z10071DevFmd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10072DevFmdD", GXutil.rtrim( Z10072DevFmdD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10073DevFHh", localUtil.ttoc( Z10073DevFHh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10074DevGrossT", GXutil.ltrim( localUtil.ntoc( Z10074DevGrossT, (byte)(13), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10075DevStt", GXutil.rtrim( Z10075DevStt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10736DevEnvAT", GXutil.ltrim( localUtil.ntoc( Z10736DevEnvAT, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10737DevATCodeI", GXutil.rtrim( Z10737DevATCodeI));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10766DevGenAT", GXutil.rtrim( Z10766DevGenAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12883DevAlbRecC", GXutil.ltrim( localUtil.ntoc( Z12883DevAlbRecC, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14193DevGenATCU", GXutil.rtrim( Z14193DevGenATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14194DevGenSerA", GXutil.rtrim( Z14194DevGenSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14195DevGenTipA", GXutil.rtrim( Z14195DevGenTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z47AlbREst", GXutil.ltrim( localUtil.ntoc( Z47AlbREst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( Z60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( Z54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z45AlbRef", GXutil.rtrim( Z45AlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z56AlbRUni", GXutil.rtrim( Z56AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( Z52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( Z58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3359AlbRDisCli", GXutil.rtrim( Z3359AlbRDisCli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4602AlbRMdlCod", GXutil.rtrim( Z4602AlbRMdlCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( Z51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( Z57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z329DevTrnNom", GXutil.rtrim( Z329DevTrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV22AlbRUni", GXutil.rtrim( ZV22AlbRUni));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV18AlbRPieDis", GXutil.ltrim( localUtil.ntoc( ZV18AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV19AlbRUniDis", GXutil.ltrim( localUtil.ntoc( ZV19AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV20AlbRPDis", GXutil.ltrim( localUtil.ntoc( ZV20AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV21AlbRUDis", GXutil.ltrim( localUtil.ntoc( ZV21AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5348DevHorSal", localUtil.ttoc( Z5348DevHorSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV79msg_control", ZV79msg_control);
      app.GxWebStd.gx_hidden_field( httpContext, "ZV73OldUni", GXutil.ltrim( localUtil.ntoc( ZV73OldUni, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV26Kilos", GXutil.ltrim( localUtil.ntoc( ZV26Kilos, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV27Metros", GXutil.ltrim( localUtil.ntoc( ZV27Metros, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV23KilAnt", GXutil.ltrim( localUtil.ntoc( ZV23KilAnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV24MetAnt", GXutil.ltrim( localUtil.ntoc( ZV24MetAnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV28Piezas", GXutil.ltrim( localUtil.ntoc( ZV28Piezas, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV25PieAnt", GXutil.ltrim( localUtil.ntoc( ZV25PieAnt, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ZV74OldPzas", GXutil.ltrim( localUtil.ntoc( ZV74OldPzas, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10361DevDiscli", GXutil.rtrim( Z10361DevDiscli));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10362DevMdl", GXutil.rtrim( Z10362DevMdl));
      httpContext.ajax_rsp_assign_attri("", false, "O1304DevUlin", GXutil.ltrim( localUtil.ntoc( O1304DevUlin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O328DevGenUni", GXutil.ltrim( localUtil.ntoc( O328DevGenUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O326DevGenPie", GXutil.ltrim( localUtil.ntoc( O326DevGenPie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( O54AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_attri("", false, "O60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( O60AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      httpContext.ajax_rsp_assign_prop("", false, edtAlbRecCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Albreccod( )
   {
      n44AlbRecCod = false ;
      n252CliCod = false ;
      A56AlbRUni = cmbAlbRUni.getValue() ;
      cmbAlbRUni.setValue( A56AlbRUni );
      n10361DevDiscli = false ;
      n10362DevMdl = false ;
      /* Using cursor T000P21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n44AlbRecCod), Integer.valueOf(A44AlbRecCod)});
      Z47AlbREst = T000P21_A47AlbREst[0] ;
      Z45AlbRef = T000P21_A45AlbRef[0] ;
      Z252CliCod = T000P21_A252CliCod[0] ;
      Z56AlbRUni = T000P21_A56AlbRUni[0] ;
      Z52AlbRPieEnt = T000P21_A52AlbRPieEnt[0] ;
      Z58AlbRUniEnt = T000P21_A58AlbRUniEnt[0] ;
      Z3359AlbRDisCli = T000P21_A3359AlbRDisCli[0] ;
      Z4602AlbRMdlCod = T000P21_A4602AlbRMdlCod[0] ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "ALBREC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "ALBRECCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbRecCod_Internalname ;
      }
      A47AlbREst = T000P21_A47AlbREst[0] ;
      A60AlbRUniUti = T000P21_A60AlbRUniUti[0] ;
      A54AlbRPieUti = T000P21_A54AlbRPieUti[0] ;
      A45AlbRef = T000P21_A45AlbRef[0] ;
      A252CliCod = T000P21_A252CliCod[0] ;
      n252CliCod = T000P21_n252CliCod[0] ;
      A56AlbRUni = T000P21_A56AlbRUni[0] ;
      cmbAlbRUni.setValue( A56AlbRUni );
      A52AlbRPieEnt = T000P21_A52AlbRPieEnt[0] ;
      A58AlbRUniEnt = T000P21_A58AlbRUniEnt[0] ;
      A3359AlbRDisCli = T000P21_A3359AlbRDisCli[0] ;
      A4602AlbRMdlCod = T000P21_A4602AlbRMdlCod[0] ;
      O54AlbRPieUti = A54AlbRPieUti ;
      O60AlbRUniUti = A60AlbRUniUti ;
      pr_default.close(19);
      /* Using cursor T000P22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
      }
      A279CliNom = T000P22_A279CliNom[0] ;
      pr_default.close(20);
      if ( isIns( )  && (GXutil.strcmp("", A10361DevDiscli)==0) && ( Gx_BScreen == 0 ) )
      {
         A10361DevDiscli = A3359AlbRDisCli ;
         n10361DevDiscli = false ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A10362DevMdl)==0) && ( Gx_BScreen == 0 ) )
      {
         A10362DevMdl = A4602AlbRMdlCod ;
         n10362DevMdl = false ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A44AlbRecCod ;
         GXv_int8[0] = AV18AlbRPieDis ;
         GXv_decimal11[0] = AV19AlbRUniDis ;
         GXv_int7[0] = AV20AlbRPDis ;
         GXv_decimal9[0] = AV21AlbRUDis ;
         GXv_char3[0] = AV22AlbRUni ;
         new app.pdisdev(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8, GXv_decimal11, GXv_int7, GXv_decimal9, GXv_char3) ;
         tdevgen_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevgen_impl.this.A44AlbRecCod = GXv_int10[0] ;
         A44AlbRecCod = this.A44AlbRecCod ;
         tdevgen_impl.this.AV18AlbRPieDis = GXv_int8[0] ;
         AV18AlbRPieDis = this.AV18AlbRPieDis ;
         tdevgen_impl.this.AV19AlbRUniDis = GXv_decimal11[0] ;
         AV19AlbRUniDis = this.AV19AlbRUniDis ;
         tdevgen_impl.this.AV20AlbRPDis = GXv_int7[0] ;
         AV20AlbRPDis = this.AV20AlbRPDis ;
         tdevgen_impl.this.AV21AlbRUDis = GXv_decimal9[0] ;
         AV21AlbRUDis = this.AV21AlbRUDis ;
         tdevgen_impl.this.AV22AlbRUni = GXv_char3[0] ;
         AV22AlbRUni = this.AV22AlbRUni ;
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
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A45AlbRef", GXutil.rtrim( A45AlbRef));
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A56AlbRUni", GXutil.rtrim( A56AlbRUni));
      cmbAlbRUni.setValue( GXutil.rtrim( A56AlbRUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbRUni.getInternalname(), "Values", cmbAlbRUni.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_attri("", false, "A52AlbRPieEnt", GXutil.ltrim( localUtil.ntoc( A52AlbRPieEnt, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A58AlbRUniEnt", GXutil.ltrim( localUtil.ntoc( A58AlbRUniEnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A3359AlbRDisCli", GXutil.rtrim( A3359AlbRDisCli));
      httpContext.ajax_rsp_assign_attri("", false, "A4602AlbRMdlCod", GXutil.rtrim( A4602AlbRMdlCod));
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "A10361DevDiscli", GXutil.rtrim( A10361DevDiscli));
      httpContext.ajax_rsp_assign_attri("", false, "A10362DevMdl", GXutil.rtrim( A10362DevMdl));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A44AlbRecCod", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV18AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV19AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbRPDis", GXutil.ltrim( localUtil.ntoc( AV20AlbRPDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbRUDis", GXutil.ltrim( localUtil.ntoc( AV21AlbRUDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV22AlbRUni", GXutil.rtrim( AV22AlbRUni));
   }

   public void valid_Devgenfec( )
   {
      n325DevGenFec = false ;
      n5348DevHorSal = false ;
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A5348DevHorSal) && true /* After */ )
      {
         GXt_dtime5 = A5348DevHorSal ;
         GXv_dtime6[0] = GXt_dtime5 ;
         new app.stocksquimicos.ptrz001(remoteHandle, context).execute( A396EmprCod, GXv_dtime6) ;
         tdevgen_impl.this.GXt_dtime5 = GXv_dtime6[0] ;
         A5348DevHorSal = GXt_dtime5 ;
         n5348DevHorSal = false ;
      }
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = AV79msg_control ;
         new app.pcthashgendev(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
         tdevgen_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tdevgen_impl.this.AV79msg_control = GXv_char3[0] ;
         AV79msg_control = this.AV79msg_control ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A5348DevHorSal", localUtil.ttoc( A5348DevHorSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "AV79msg_control", AV79msg_control);
   }

   public void valid_Devgenuni( )
   {
      n328DevGenUni = false ;
      if ( true )
      {
         AV19AlbRUniDis = A58AlbRUniEnt.subtract(A60AlbRUniUti) ;
      }
      else
      {
         if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
         {
            AV19AlbRUniDis = AV21AlbRUDis ;
         }
      }
      if ( isDlt( )  && true /* Level */ )
      {
         A60AlbRUniUti = O60AlbRUniUti.subtract(A328DevGenUni) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A60AlbRUniUti = O60AlbRUniUti.add(A328DevGenUni).subtract(O328DevGenUni) ;
         }
      }
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
      AV73OldUni = O328DevGenUni ;
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV26Kilos = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV27Metros = A328DevGenUni ;
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "K", ""), "")) == 0 ) && true /* After */ )
      {
         AV23KilAnt = O328DevGenUni ;
      }
      if ( ( GXutil.strcmp(AV22AlbRUni, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) == 0 ) && true /* After */ )
      {
         AV24MetAnt = O328DevGenUni ;
      }
      if ( ( A57AlbRUniDis.doubleValue() < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de unidades a devolver superior a la disponible", ""), 1, "DEVGENUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenUni_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV19AlbRUniDis", GXutil.ltrim( localUtil.ntoc( AV19AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A60AlbRUniUti", GXutil.ltrim( localUtil.ntoc( A60AlbRUniUti, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A57AlbRUniDis", GXutil.ltrim( localUtil.ntoc( A57AlbRUniDis, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV73OldUni", GXutil.ltrim( localUtil.ntoc( AV73OldUni, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Kilos", GXutil.ltrim( localUtil.ntoc( AV26Kilos, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Metros", GXutil.ltrim( localUtil.ntoc( AV27Metros, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV23KilAnt", GXutil.ltrim( localUtil.ntoc( AV23KilAnt, (byte)(9), (byte)(2), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV24MetAnt", GXutil.ltrim( localUtil.ntoc( AV24MetAnt, (byte)(9), (byte)(2), ".", "")));
   }

   public void valid_Devgenpie( )
   {
      n326DevGenPie = false ;
      if ( true )
      {
         AV18AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
      }
      else
      {
         if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
         {
            AV18AlbRPieDis = AV20AlbRPDis ;
         }
      }
      AV28Piezas = A326DevGenPie ;
      AV25PieAnt = O326DevGenPie ;
      if ( isDlt( )  && true /* Level */ )
      {
         A54AlbRPieUti = (int)(O54AlbRPieUti-A326DevGenPie) ;
      }
      else
      {
         if ( isIns( )  || isUpd( )  || isDlt( )  )
         {
            A54AlbRPieUti = (int)(O54AlbRPieUti+A326DevGenPie-O326DevGenPie) ;
         }
      }
      A51AlbRPieDis = (int)(A52AlbRPieEnt-A54AlbRPieUti) ;
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
      AV74OldPzas = O326DevGenPie ;
      if ( ( A51AlbRPieDis < 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error. Cantidad de piezas a devolver superior a la disponible", ""), 1, "DEVGENPIE");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevGenPie_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbRPieDis", GXutil.ltrim( localUtil.ntoc( AV18AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Piezas", GXutil.ltrim( localUtil.ntoc( AV28Piezas, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV25PieAnt", GXutil.ltrim( localUtil.ntoc( AV25PieAnt, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A54AlbRPieUti", GXutil.ltrim( localUtil.ntoc( A54AlbRPieUti, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A51AlbRPieDis", GXutil.ltrim( localUtil.ntoc( A51AlbRPieDis, (byte)(6), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A47AlbREst", GXutil.ltrim( localUtil.ntoc( A47AlbREst, (byte)(1), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV74OldPzas", GXutil.ltrim( localUtil.ntoc( AV74OldPzas, (byte)(4), (byte)(0), ".", "")));
   }

   public void valid_Devgentrn( )
   {
      n327DevGenTrn = false ;
      n329DevTrnNom = false ;
      /* Using cursor T000P23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n327DevGenTrn), Short.valueOf(A327DevGenTrn)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A327DevGenTrn) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "DevGen", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "DEVGENTRN");
            AnyError = (short)(1) ;
            GX_FocusControl = edtDevGenTrn_Internalname ;
         }
      }
      A329DevTrnNom = T000P23_A329DevTrnNom[0] ;
      n329DevTrnNom = T000P23_n329DevTrnNom[0] ;
      pr_default.close(21);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A329DevTrnNom", GXutil.rtrim( A329DevTrnNom));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A10071DevFmd',fld:'DEVFMD',pic:''},{av:'AV29Modo',fld:'vMODO',pic:''},{av:'A324DevGenEst',fld:'DEVGENEST',pic:'9'},{av:'A10072DevFmdD',fld:'DEVFMDD',pic:''},{av:'A10073DevFHh',fld:'DEVFHH',pic:'99/99/99 99:99:99'},{av:'A10074DevGrossT',fld:'DEVGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A10075DevStt',fld:'DEVSTT',pic:''},{av:'A10736DevEnvAT',fld:'DEVENVAT',pic:'9'},{av:'A10737DevATCodeI',fld:'DEVATCODEI',pic:''},{av:'A10766DevGenAT',fld:'DEVGENAT',pic:''},{av:'A12883DevAlbRecC',fld:'DEVALBRECC',pic:'ZZZZZZZ9'},{av:'A14193DevGenATCU',fld:'DEVGENATCU',pic:''},{av:'A14194DevGenSerA',fld:'DEVGENSERA',pic:''},{av:'A14195DevGenTipA',fld:'DEVGENTIPA',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_DEVGENCOD","{handler:'valid_Devgencod',iparms:[{av:'A14195DevGenTipA',fld:'DEVGENTIPA',pic:''},{av:'A14194DevGenSerA',fld:'DEVGENSERA',pic:''},{av:'A14193DevGenATCU',fld:'DEVGENATCU',pic:''},{av:'A12883DevAlbRecC',fld:'DEVALBRECC',pic:'ZZZZZZZ9'},{av:'A10074DevGrossT',fld:'DEVGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A10073DevFHh',fld:'DEVFHH',pic:'99/99/99 99:99:99'},{av:'A10072DevFmdD',fld:'DEVFMDD',pic:''},{av:'A324DevGenEst',fld:'DEVGENEST',pic:'9'},{av:'A10071DevFmd',fld:'DEVFMD',pic:''},{av:'A1304DevUlin',fld:'DEVULIN',pic:'Z9'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV33Station',fld:'vSTATION',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9'},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A10075DevStt',fld:'DEVSTT',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'AV29Modo',fld:'vMODO',pic:''},{av:'A325DevGenFec',fld:'DEVGENFEC',pic:''},{av:'A10737DevATCodeI',fld:'DEVATCODEI',pic:''},{av:'A10736DevEnvAT',fld:'DEVENVAT',pic:'9'},{av:'A10766DevGenAT',fld:'DEVGENAT',pic:''},{av:'AV22AlbRUni',fld:'vALBRUNI',pic:''},{av:'AV18AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV19AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV20AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV21AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV79msg_control',fld:'vMSG_CONTROL',pic:''},{av:'AV73OldUni',fld:'vOLDUNI',pic:'ZZZZZ9.99'},{av:'AV26Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV27Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV23KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV24MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV28Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'AV25PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'AV74OldPzas',fld:'vOLDPZAS',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DEVGENCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A325DevGenFec',fld:'DEVGENFEC',pic:''},{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'A5347DevMatric',fld:'DEVMATRIC',pic:''},{av:'A6288DevGenDom',fld:'DEVGENDOM',pic:'9'},{av:'A324DevGenEst',fld:'DEVGENEST',pic:'9'},{av:'A1304DevUlin',fld:'DEVULIN',pic:'Z9'},{av:'A10071DevFmd',fld:'DEVFMD',pic:''},{av:'A10072DevFmdD',fld:'DEVFMDD',pic:''},{av:'A10073DevFHh',fld:'DEVFHH',pic:'99/99/99 99:99:99'},{av:'A10074DevGrossT',fld:'DEVGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A10075DevStt',fld:'DEVSTT',pic:''},{av:'A10736DevEnvAT',fld:'DEVENVAT',pic:'9'},{av:'A10737DevATCodeI',fld:'DEVATCODEI',pic:''},{av:'A10766DevGenAT',fld:'DEVGENAT',pic:''},{av:'A12883DevAlbRecC',fld:'DEVALBRECC',pic:'ZZZZZZZ9'},{av:'A14193DevGenATCU',fld:'DEVGENATCU',pic:''},{av:'A14194DevGenSerA',fld:'DEVGENSERA',pic:''},{av:'A14195DevGenTipA',fld:'DEVGENTIPA',pic:''},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A3359AlbRDisCli',fld:'ALBRDISCLI',pic:''},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''},{av:'AV22AlbRUni',fld:'vALBRUNI',pic:''},{av:'AV18AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV19AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV20AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV21AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'A5348DevHorSal',fld:'DEVHORSAL',pic:'99/99/99 99:99:99'},{av:'AV79msg_control',fld:'vMSG_CONTROL',pic:''},{av:'AV73OldUni',fld:'vOLDUNI',pic:'ZZZZZ9.99'},{av:'AV26Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV27Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV23KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV24MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV28Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'AV25PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'AV74OldPzas',fld:'vOLDPZAS',pic:'ZZZ9'},{av:'A10361DevDiscli',fld:'DEVDISCLI',pic:''},{av:'A10362DevMdl',fld:'DEVMDL',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z323DevGenCod'},{av:'Z407EmprNom'},{av:'Z44AlbRecCod'},{av:'Z325DevGenFec'},{av:'Z328DevGenUni'},{av:'Z326DevGenPie'},{av:'Z327DevGenTrn'},{av:'Z5347DevMatric'},{av:'Z6288DevGenDom'},{av:'Z324DevGenEst'},{av:'Z1304DevUlin'},{av:'Z10071DevFmd'},{av:'Z10072DevFmdD'},{av:'Z10073DevFHh'},{av:'Z10074DevGrossT'},{av:'Z10075DevStt'},{av:'Z10736DevEnvAT'},{av:'Z10737DevATCodeI'},{av:'Z10766DevGenAT'},{av:'Z12883DevAlbRecC'},{av:'Z14193DevGenATCU'},{av:'Z14194DevGenSerA'},{av:'Z14195DevGenTipA'},{av:'Z47AlbREst'},{av:'Z60AlbRUniUti'},{av:'Z54AlbRPieUti'},{av:'Z45AlbRef'},{av:'Z252CliCod'},{av:'Z56AlbRUni'},{av:'Z52AlbRPieEnt'},{av:'Z58AlbRUniEnt'},{av:'Z3359AlbRDisCli'},{av:'Z4602AlbRMdlCod'},{av:'Z51AlbRPieDis'},{av:'Z57AlbRUniDis'},{av:'Z279CliNom'},{av:'Z329DevTrnNom'},{av:'ZV22AlbRUni'},{av:'ZV18AlbRPieDis'},{av:'ZV19AlbRUniDis'},{av:'ZV20AlbRPDis'},{av:'ZV21AlbRUDis'},{av:'Z5348DevHorSal'},{av:'ZV79msg_control'},{av:'ZV73OldUni'},{av:'ZV26Kilos'},{av:'ZV27Metros'},{av:'ZV23KilAnt'},{av:'ZV24MetAnt'},{av:'ZV28Piezas'},{av:'ZV25PieAnt'},{av:'ZV74OldPzas'},{av:'Z10361DevDiscli'},{av:'Z10362DevMdl'},{av:'O1304DevUlin'},{av:'O328DevGenUni'},{av:'O326DevGenPie'},{av:'O54AlbRPieUti'},{av:'O60AlbRUniUti'},{av:'edtAlbRecCod_Enabled',ctrl:'ALBRECCOD',prop:'Enabled'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A3359AlbRDisCli',fld:'ALBRDISCLI',pic:''},{av:'Gx_BScreen',fld:'vGXBSCREEN',pic:'9'},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10361DevDiscli',fld:'DEVDISCLI',pic:''},{av:'A10362DevMdl',fld:'DEVMDL',pic:''},{av:'AV22AlbRUni',fld:'vALBRUNI',pic:''},{av:'AV18AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV19AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV20AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV21AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[{av:'O60AlbRUniUti'},{av:'O54AlbRPieUti'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A45AlbRef',fld:'ALBREF',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'cmbAlbRUni'},{av:'A56AlbRUni',fld:'ALBRUNI',pic:'@!'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'A3359AlbRDisCli',fld:'ALBRDISCLI',pic:''},{av:'A4602AlbRMdlCod',fld:'ALBRMDLCOD',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A10361DevDiscli',fld:'DEVDISCLI',pic:''},{av:'A10362DevMdl',fld:'DEVMDL',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV18AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV19AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV20AlbRPDis',fld:'vALBRPDIS',pic:'ZZZZZ9'},{av:'AV21AlbRUDis',fld:'vALBRUDIS',pic:'ZZZZZ9.99'},{av:'AV22AlbRUni',fld:'vALBRUNI',pic:''}]}");
      setEventMetadata("VALID_ALBREF","{handler:'valid_Albref',iparms:[]");
      setEventMetadata("VALID_ALBREF",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLINOM","{handler:'valid_Clinom',iparms:[]");
      setEventMetadata("VALID_CLINOM",",oparms:[]}");
      setEventMetadata("VALID_DEVGENFEC","{handler:'valid_Devgenfec',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'A325DevGenFec',fld:'DEVGENFEC',pic:''},{av:'A5348DevHorSal',fld:'DEVHORSAL',pic:'99/99/99 99:99:99'},{av:'AV79msg_control',fld:'vMSG_CONTROL',pic:''}]");
      setEventMetadata("VALID_DEVGENFEC",",oparms:[{av:'A5348DevHorSal',fld:'DEVHORSAL',pic:'99/99/99 99:99:99'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV79msg_control',fld:'vMSG_CONTROL',pic:''}]}");
      setEventMetadata("VALID_DEVGENUNI","{handler:'valid_Devgenuni',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O328DevGenUni'},{av:'O60AlbRUniUti'},{av:'A328DevGenUni',fld:'DEVGENUNI',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A58AlbRUniEnt',fld:'ALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV19AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV73OldUni',fld:'vOLDUNI',pic:'ZZZZZ9.99'},{av:'AV26Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV27Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV23KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV24MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VALID_DEVGENUNI",",oparms:[{av:'AV19AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A60AlbRUniUti',fld:'ALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV73OldUni',fld:'vOLDUNI',pic:'ZZZZZ9.99'},{av:'AV26Kilos',fld:'vKILOS',pic:'ZZZZZ9.99'},{av:'AV27Metros',fld:'vMETROS',pic:'ZZZZZ9.99'},{av:'AV23KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV24MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALID_DEVGENPIE","{handler:'valid_Devgenpie',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O54AlbRPieUti'},{av:'O326DevGenPie'},{av:'A326DevGenPie',fld:'DEVGENPIE',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A52AlbRPieEnt',fld:'ALBRPIEENT',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A57AlbRUniDis',fld:'ALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV18AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV28Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'AV25PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'AV74OldPzas',fld:'vOLDPZAS',pic:'ZZZ9'}]");
      setEventMetadata("VALID_DEVGENPIE",",oparms:[{av:'AV18AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV28Piezas',fld:'vPIEZAS',pic:'ZZZ9'},{av:'AV25PieAnt',fld:'vPIEANT',pic:'ZZZ9'},{av:'A54AlbRPieUti',fld:'ALBRPIEUTI',pic:'ZZZZZ9'},{av:'A51AlbRPieDis',fld:'ALBRPIEDIS',pic:'ZZZZZ9'},{av:'A47AlbREst',fld:'ALBREST',pic:'9'},{av:'AV74OldPzas',fld:'vOLDPZAS',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_DEVGENTRN","{handler:'valid_Devgentrn',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A327DevGenTrn',fld:'DEVGENTRN',pic:'ZZZ9'},{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''}]");
      setEventMetadata("VALID_DEVGENTRN",",oparms:[{av:'A329DevTrnNom',fld:'DEVTRNNOM',pic:''}]}");
      setEventMetadata("VALID_ALBRUNIDIS","{handler:'valid_Albrunidis',iparms:[]");
      setEventMetadata("VALID_ALBRUNIDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEDIS","{handler:'valid_Albrpiedis',iparms:[]");
      setEventMetadata("VALID_ALBRPIEDIS",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIUTI","{handler:'valid_Albruniuti',iparms:[]");
      setEventMetadata("VALID_ALBRUNIUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEUTI","{handler:'valid_Albrpieuti',iparms:[]");
      setEventMetadata("VALID_ALBRPIEUTI",",oparms:[]}");
      setEventMetadata("VALID_ALBRPIEENT","{handler:'valid_Albrpieent',iparms:[]");
      setEventMetadata("VALID_ALBRPIEENT",",oparms:[]}");
      setEventMetadata("VALID_ALBRUNIENT","{handler:'valid_Albrunient',iparms:[]");
      setEventMetadata("VALID_ALBRUNIENT",",oparms:[]}");
      setEventMetadata("VALID_DEVSTT","{handler:'valid_Devstt',iparms:[]");
      setEventMetadata("VALID_DEVSTT",",oparms:[]}");
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
      pr_default.close(19);
      pr_default.close(32);
      pr_default.close(20);
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z5348DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      Z325DevGenFec = GXutil.nullDate() ;
      Z328DevGenUni = DecimalUtil.ZERO ;
      Z5347DevMatric = "" ;
      Z10071DevFmd = "" ;
      Z10072DevFmdD = "" ;
      Z10073DevFHh = GXutil.resetTime( GXutil.nullDate() );
      Z10074DevGrossT = DecimalUtil.ZERO ;
      Z10075DevStt = "" ;
      Z10737DevATCodeI = "" ;
      Z10766DevGenAT = "" ;
      Z10361DevDiscli = "" ;
      Z10362DevMdl = "" ;
      Z14193DevGenATCU = "" ;
      Z14194DevGenSerA = "" ;
      Z14195DevGenTipA = "" ;
      Z45AlbRef = "" ;
      Z56AlbRUni = "" ;
      Z58AlbRUniEnt = DecimalUtil.ZERO ;
      Z3359AlbRDisCli = "" ;
      Z4602AlbRMdlCod = "" ;
      O328DevGenUni = DecimalUtil.ZERO ;
      O60AlbRUniUti = DecimalUtil.ZERO ;
      Z1303DevObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV22AlbRUni = "" ;
      AV81Pgmname = "" ;
      AV17UsurCod = "" ;
      AV33Station = "" ;
      AV75Texto_ii = "" ;
      A325DevGenFec = GXutil.nullDate() ;
      Gx_mode = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
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
      A45AlbRef = "" ;
      A279CliNom = "" ;
      A5348DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      A328DevGenUni = DecimalUtil.ZERO ;
      A329DevTrnNom = "" ;
      A5347DevMatric = "" ;
      A57AlbRUniDis = DecimalUtil.ZERO ;
      A60AlbRUniUti = DecimalUtil.ZERO ;
      A58AlbRUniEnt = DecimalUtil.ZERO ;
      A10071DevFmd = "" ;
      A10072DevFmdD = "" ;
      A10073DevFHh = GXutil.resetTime( GXutil.nullDate() );
      A10074DevGrossT = DecimalUtil.ZERO ;
      A10075DevStt = "" ;
      A10737DevATCodeI = "" ;
      A10766DevGenAT = "" ;
      A10361DevDiscli = "" ;
      A10362DevMdl = "" ;
      lblTitlelevel1_Jsonclick = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gridtdevgen_level1itemContainer = new com.genexus.webpanels.GXWebGrid(context);
      B328DevGenUni = DecimalUtil.ZERO ;
      B60AlbRUniUti = DecimalUtil.ZERO ;
      sMode192 = "" ;
      sStyleString = "" ;
      A14193DevGenATCU = "" ;
      A14194DevGenSerA = "" ;
      A14195DevGenTipA = "" ;
      A3359AlbRDisCli = "" ;
      A4602AlbRMdlCod = "" ;
      AV29Modo = "" ;
      AV19AlbRUniDis = DecimalUtil.ZERO ;
      AV73OldUni = DecimalUtil.ZERO ;
      AV26Kilos = DecimalUtil.ZERO ;
      AV27Metros = DecimalUtil.ZERO ;
      AV23KilAnt = DecimalUtil.ZERO ;
      AV24MetAnt = DecimalUtil.ZERO ;
      AV21AlbRUDis = DecimalUtil.ZERO ;
      AV79msg_control = "" ;
      A407EmprNom = "" ;
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
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      Z407EmprNom = "" ;
      Z60AlbRUniUti = DecimalUtil.ZERO ;
      Z279CliNom = "" ;
      Z329DevTrnNom = "" ;
      T000P6_A407EmprNom = new String[] {""} ;
      T000P6_n407EmprNom = new boolean[] {false} ;
      T000P11_A323DevGenCod = new int[1] ;
      T000P11_A47AlbREst = new byte[1] ;
      T000P11_A5348DevHorSal = new java.util.Date[] {GXutil.nullDate()} ;
      T000P11_n5348DevHorSal = new boolean[] {false} ;
      T000P11_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P11_A54AlbRPieUti = new int[1] ;
      T000P11_A407EmprNom = new String[] {""} ;
      T000P11_n407EmprNom = new boolean[] {false} ;
      T000P11_A45AlbRef = new String[] {""} ;
      T000P11_A252CliCod = new int[1] ;
      T000P11_n252CliCod = new boolean[] {false} ;
      T000P11_A279CliNom = new String[] {""} ;
      T000P11_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T000P11_n325DevGenFec = new boolean[] {false} ;
      T000P11_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P11_n328DevGenUni = new boolean[] {false} ;
      T000P11_A56AlbRUni = new String[] {""} ;
      T000P11_A326DevGenPie = new short[1] ;
      T000P11_n326DevGenPie = new boolean[] {false} ;
      T000P11_A329DevTrnNom = new String[] {""} ;
      T000P11_n329DevTrnNom = new boolean[] {false} ;
      T000P11_A5347DevMatric = new String[] {""} ;
      T000P11_n5347DevMatric = new boolean[] {false} ;
      T000P11_A6288DevGenDom = new byte[1] ;
      T000P11_n6288DevGenDom = new boolean[] {false} ;
      T000P11_A52AlbRPieEnt = new int[1] ;
      T000P11_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P11_A324DevGenEst = new byte[1] ;
      T000P11_n324DevGenEst = new boolean[] {false} ;
      T000P11_A1304DevUlin = new byte[1] ;
      T000P11_n1304DevUlin = new boolean[] {false} ;
      T000P11_A10071DevFmd = new String[] {""} ;
      T000P11_n10071DevFmd = new boolean[] {false} ;
      T000P11_A10072DevFmdD = new String[] {""} ;
      T000P11_n10072DevFmdD = new boolean[] {false} ;
      T000P11_A10073DevFHh = new java.util.Date[] {GXutil.nullDate()} ;
      T000P11_n10073DevFHh = new boolean[] {false} ;
      T000P11_A10074DevGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P11_n10074DevGrossT = new boolean[] {false} ;
      T000P11_A10075DevStt = new String[] {""} ;
      T000P11_n10075DevStt = new boolean[] {false} ;
      T000P11_A10736DevEnvAT = new byte[1] ;
      T000P11_n10736DevEnvAT = new boolean[] {false} ;
      T000P11_A10737DevATCodeI = new String[] {""} ;
      T000P11_n10737DevATCodeI = new boolean[] {false} ;
      T000P11_A10766DevGenAT = new String[] {""} ;
      T000P11_n10766DevGenAT = new boolean[] {false} ;
      T000P11_A10361DevDiscli = new String[] {""} ;
      T000P11_n10361DevDiscli = new boolean[] {false} ;
      T000P11_A10362DevMdl = new String[] {""} ;
      T000P11_n10362DevMdl = new boolean[] {false} ;
      T000P11_A3359AlbRDisCli = new String[] {""} ;
      T000P11_A4602AlbRMdlCod = new String[] {""} ;
      T000P11_A12883DevAlbRecC = new int[1] ;
      T000P11_n12883DevAlbRecC = new boolean[] {false} ;
      T000P11_A14193DevGenATCU = new String[] {""} ;
      T000P11_n14193DevGenATCU = new boolean[] {false} ;
      T000P11_A14194DevGenSerA = new String[] {""} ;
      T000P11_n14194DevGenSerA = new boolean[] {false} ;
      T000P11_A14195DevGenTipA = new String[] {""} ;
      T000P11_n14195DevGenTipA = new boolean[] {false} ;
      T000P11_A396EmprCod = new String[] {""} ;
      T000P11_A44AlbRecCod = new int[1] ;
      T000P11_n44AlbRecCod = new boolean[] {false} ;
      T000P11_A327DevGenTrn = new short[1] ;
      T000P11_n327DevGenTrn = new boolean[] {false} ;
      T000P8_A47AlbREst = new byte[1] ;
      T000P8_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P8_A54AlbRPieUti = new int[1] ;
      T000P8_A45AlbRef = new String[] {""} ;
      T000P8_A252CliCod = new int[1] ;
      T000P8_n252CliCod = new boolean[] {false} ;
      T000P8_A56AlbRUni = new String[] {""} ;
      T000P8_A52AlbRPieEnt = new int[1] ;
      T000P8_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P8_A3359AlbRDisCli = new String[] {""} ;
      T000P8_A4602AlbRMdlCod = new String[] {""} ;
      T000P9_A279CliNom = new String[] {""} ;
      T000P10_A329DevTrnNom = new String[] {""} ;
      T000P10_n329DevTrnNom = new boolean[] {false} ;
      T000P12_A279CliNom = new String[] {""} ;
      T000P13_A329DevTrnNom = new String[] {""} ;
      T000P13_n329DevTrnNom = new boolean[] {false} ;
      T000P14_A396EmprCod = new String[] {""} ;
      T000P14_A323DevGenCod = new int[1] ;
      T000P5_A323DevGenCod = new int[1] ;
      T000P5_A5348DevHorSal = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n5348DevHorSal = new boolean[] {false} ;
      T000P5_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n325DevGenFec = new boolean[] {false} ;
      T000P5_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P5_n328DevGenUni = new boolean[] {false} ;
      T000P5_A326DevGenPie = new short[1] ;
      T000P5_n326DevGenPie = new boolean[] {false} ;
      T000P5_A5347DevMatric = new String[] {""} ;
      T000P5_n5347DevMatric = new boolean[] {false} ;
      T000P5_A6288DevGenDom = new byte[1] ;
      T000P5_n6288DevGenDom = new boolean[] {false} ;
      T000P5_A324DevGenEst = new byte[1] ;
      T000P5_n324DevGenEst = new boolean[] {false} ;
      T000P5_A1304DevUlin = new byte[1] ;
      T000P5_n1304DevUlin = new boolean[] {false} ;
      T000P5_A10071DevFmd = new String[] {""} ;
      T000P5_n10071DevFmd = new boolean[] {false} ;
      T000P5_A10072DevFmdD = new String[] {""} ;
      T000P5_n10072DevFmdD = new boolean[] {false} ;
      T000P5_A10073DevFHh = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n10073DevFHh = new boolean[] {false} ;
      T000P5_A10074DevGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P5_n10074DevGrossT = new boolean[] {false} ;
      T000P5_A10075DevStt = new String[] {""} ;
      T000P5_n10075DevStt = new boolean[] {false} ;
      T000P5_A10736DevEnvAT = new byte[1] ;
      T000P5_n10736DevEnvAT = new boolean[] {false} ;
      T000P5_A10737DevATCodeI = new String[] {""} ;
      T000P5_n10737DevATCodeI = new boolean[] {false} ;
      T000P5_A10766DevGenAT = new String[] {""} ;
      T000P5_n10766DevGenAT = new boolean[] {false} ;
      T000P5_A10361DevDiscli = new String[] {""} ;
      T000P5_n10361DevDiscli = new boolean[] {false} ;
      T000P5_A10362DevMdl = new String[] {""} ;
      T000P5_n10362DevMdl = new boolean[] {false} ;
      T000P5_A12883DevAlbRecC = new int[1] ;
      T000P5_n12883DevAlbRecC = new boolean[] {false} ;
      T000P5_A14193DevGenATCU = new String[] {""} ;
      T000P5_n14193DevGenATCU = new boolean[] {false} ;
      T000P5_A14194DevGenSerA = new String[] {""} ;
      T000P5_n14194DevGenSerA = new boolean[] {false} ;
      T000P5_A14195DevGenTipA = new String[] {""} ;
      T000P5_n14195DevGenTipA = new boolean[] {false} ;
      T000P5_A396EmprCod = new String[] {""} ;
      T000P5_A44AlbRecCod = new int[1] ;
      T000P5_n44AlbRecCod = new boolean[] {false} ;
      T000P5_A327DevGenTrn = new short[1] ;
      T000P5_n327DevGenTrn = new boolean[] {false} ;
      T000P5_A252CliCod = new int[1] ;
      T000P5_n252CliCod = new boolean[] {false} ;
      sMode31 = "" ;
      T000P15_A396EmprCod = new String[] {""} ;
      T000P15_A323DevGenCod = new int[1] ;
      T000P16_A396EmprCod = new String[] {""} ;
      T000P16_A323DevGenCod = new int[1] ;
      T000P4_A323DevGenCod = new int[1] ;
      T000P4_A5348DevHorSal = new java.util.Date[] {GXutil.nullDate()} ;
      T000P4_n5348DevHorSal = new boolean[] {false} ;
      T000P4_A325DevGenFec = new java.util.Date[] {GXutil.nullDate()} ;
      T000P4_n325DevGenFec = new boolean[] {false} ;
      T000P4_A328DevGenUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P4_n328DevGenUni = new boolean[] {false} ;
      T000P4_A326DevGenPie = new short[1] ;
      T000P4_n326DevGenPie = new boolean[] {false} ;
      T000P4_A5347DevMatric = new String[] {""} ;
      T000P4_n5347DevMatric = new boolean[] {false} ;
      T000P4_A6288DevGenDom = new byte[1] ;
      T000P4_n6288DevGenDom = new boolean[] {false} ;
      T000P4_A324DevGenEst = new byte[1] ;
      T000P4_n324DevGenEst = new boolean[] {false} ;
      T000P4_A1304DevUlin = new byte[1] ;
      T000P4_n1304DevUlin = new boolean[] {false} ;
      T000P4_A10071DevFmd = new String[] {""} ;
      T000P4_n10071DevFmd = new boolean[] {false} ;
      T000P4_A10072DevFmdD = new String[] {""} ;
      T000P4_n10072DevFmdD = new boolean[] {false} ;
      T000P4_A10073DevFHh = new java.util.Date[] {GXutil.nullDate()} ;
      T000P4_n10073DevFHh = new boolean[] {false} ;
      T000P4_A10074DevGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P4_n10074DevGrossT = new boolean[] {false} ;
      T000P4_A10075DevStt = new String[] {""} ;
      T000P4_n10075DevStt = new boolean[] {false} ;
      T000P4_A10736DevEnvAT = new byte[1] ;
      T000P4_n10736DevEnvAT = new boolean[] {false} ;
      T000P4_A10737DevATCodeI = new String[] {""} ;
      T000P4_n10737DevATCodeI = new boolean[] {false} ;
      T000P4_A10766DevGenAT = new String[] {""} ;
      T000P4_n10766DevGenAT = new boolean[] {false} ;
      T000P4_A10361DevDiscli = new String[] {""} ;
      T000P4_n10361DevDiscli = new boolean[] {false} ;
      T000P4_A10362DevMdl = new String[] {""} ;
      T000P4_n10362DevMdl = new boolean[] {false} ;
      T000P4_A12883DevAlbRecC = new int[1] ;
      T000P4_n12883DevAlbRecC = new boolean[] {false} ;
      T000P4_A14193DevGenATCU = new String[] {""} ;
      T000P4_n14193DevGenATCU = new boolean[] {false} ;
      T000P4_A14194DevGenSerA = new String[] {""} ;
      T000P4_n14194DevGenSerA = new boolean[] {false} ;
      T000P4_A14195DevGenTipA = new String[] {""} ;
      T000P4_n14195DevGenTipA = new boolean[] {false} ;
      T000P4_A396EmprCod = new String[] {""} ;
      T000P4_A44AlbRecCod = new int[1] ;
      T000P4_n44AlbRecCod = new boolean[] {false} ;
      T000P4_A327DevGenTrn = new short[1] ;
      T000P4_n327DevGenTrn = new boolean[] {false} ;
      T000P4_A252CliCod = new int[1] ;
      T000P4_n252CliCod = new boolean[] {false} ;
      T000P17_A47AlbREst = new byte[1] ;
      T000P17_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P17_A54AlbRPieUti = new int[1] ;
      T000P17_A45AlbRef = new String[] {""} ;
      T000P17_A252CliCod = new int[1] ;
      T000P17_n252CliCod = new boolean[] {false} ;
      T000P17_A56AlbRUni = new String[] {""} ;
      T000P17_A52AlbRPieEnt = new int[1] ;
      T000P17_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P17_A3359AlbRDisCli = new String[] {""} ;
      T000P17_A4602AlbRMdlCod = new String[] {""} ;
      T000P21_A47AlbREst = new byte[1] ;
      T000P21_A60AlbRUniUti = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P21_A54AlbRPieUti = new int[1] ;
      T000P21_A45AlbRef = new String[] {""} ;
      T000P21_A252CliCod = new int[1] ;
      T000P21_n252CliCod = new boolean[] {false} ;
      T000P21_A56AlbRUni = new String[] {""} ;
      T000P21_A52AlbRPieEnt = new int[1] ;
      T000P21_A58AlbRUniEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000P21_A3359AlbRDisCli = new String[] {""} ;
      T000P21_A4602AlbRMdlCod = new String[] {""} ;
      T000P22_A279CliNom = new String[] {""} ;
      T000P23_A329DevTrnNom = new String[] {""} ;
      T000P23_n329DevTrnNom = new boolean[] {false} ;
      T000P24_A396EmprCod = new String[] {""} ;
      T000P24_A323DevGenCod = new int[1] ;
      T000P24_A2159AlbRecPie = new String[] {""} ;
      T000P27_A396EmprCod = new String[] {""} ;
      T000P27_A323DevGenCod = new int[1] ;
      T000P28_A323DevGenCod = new int[1] ;
      T000P28_A1302DevLin = new byte[1] ;
      T000P28_A1303DevObs = new String[] {""} ;
      T000P28_A396EmprCod = new String[] {""} ;
      T000P29_A396EmprCod = new String[] {""} ;
      T000P29_A323DevGenCod = new int[1] ;
      T000P29_A1302DevLin = new byte[1] ;
      T000P3_A323DevGenCod = new int[1] ;
      T000P3_A1302DevLin = new byte[1] ;
      T000P3_A1303DevObs = new String[] {""} ;
      T000P3_A396EmprCod = new String[] {""} ;
      T000P2_A323DevGenCod = new int[1] ;
      T000P2_A1302DevLin = new byte[1] ;
      T000P2_A1303DevObs = new String[] {""} ;
      T000P2_A396EmprCod = new String[] {""} ;
      T000P33_A396EmprCod = new String[] {""} ;
      T000P33_A323DevGenCod = new int[1] ;
      T000P33_A1302DevLin = new byte[1] ;
      Gridtdevgen_level1itemRow = new com.genexus.webpanels.GXWebRow();
      subGridtdevgen_level1item_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      iV29Modo = "" ;
      i325DevGenFec = GXutil.nullDate() ;
      i10075DevStt = "" ;
      i10737DevATCodeI = "" ;
      i10766DevGenAT = "" ;
      Gridtdevgen_level1itemColumn = new com.genexus.webpanels.GXWebColumn();
      T000P34_A407EmprNom = new String[] {""} ;
      T000P34_n407EmprNom = new boolean[] {false} ;
      Z57AlbRUniDis = DecimalUtil.ZERO ;
      ZV22AlbRUni = "" ;
      ZV19AlbRUniDis = DecimalUtil.ZERO ;
      ZV21AlbRUDis = DecimalUtil.ZERO ;
      ZV79msg_control = "" ;
      ZV73OldUni = DecimalUtil.ZERO ;
      ZV26Kilos = DecimalUtil.ZERO ;
      ZV27Metros = DecimalUtil.ZERO ;
      ZV23KilAnt = DecimalUtil.ZERO ;
      ZV24MetAnt = DecimalUtil.ZERO ;
      ZZ396EmprCod = "" ;
      ZZ407EmprNom = "" ;
      ZZ325DevGenFec = GXutil.nullDate() ;
      ZZ328DevGenUni = DecimalUtil.ZERO ;
      ZZ5347DevMatric = "" ;
      ZZ10071DevFmd = "" ;
      ZZ10072DevFmdD = "" ;
      ZZ10073DevFHh = GXutil.resetTime( GXutil.nullDate() );
      ZZ10074DevGrossT = DecimalUtil.ZERO ;
      ZZ10075DevStt = "" ;
      ZZ10737DevATCodeI = "" ;
      ZZ10766DevGenAT = "" ;
      ZZ14193DevGenATCU = "" ;
      ZZ14194DevGenSerA = "" ;
      ZZ14195DevGenTipA = "" ;
      ZZ60AlbRUniUti = DecimalUtil.ZERO ;
      ZZ45AlbRef = "" ;
      ZZ56AlbRUni = "" ;
      ZZ58AlbRUniEnt = DecimalUtil.ZERO ;
      ZZ3359AlbRDisCli = "" ;
      ZZ4602AlbRMdlCod = "" ;
      ZZ57AlbRUniDis = DecimalUtil.ZERO ;
      ZZ279CliNom = "" ;
      ZZ329DevTrnNom = "" ;
      ZZV22AlbRUni = "" ;
      ZZV19AlbRUniDis = DecimalUtil.ZERO ;
      ZZV21AlbRUDis = DecimalUtil.ZERO ;
      ZZ5348DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      ZZV79msg_control = "" ;
      ZZV73OldUni = DecimalUtil.ZERO ;
      ZZV26Kilos = DecimalUtil.ZERO ;
      ZZV27Metros = DecimalUtil.ZERO ;
      ZZV23KilAnt = DecimalUtil.ZERO ;
      ZZV24MetAnt = DecimalUtil.ZERO ;
      ZZ10361DevDiscli = "" ;
      ZZ10362DevMdl = "" ;
      ZO328DevGenUni = DecimalUtil.ZERO ;
      ZO60AlbRUniUti = DecimalUtil.ZERO ;
      GXv_int10 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXt_dtime5 = GXutil.resetTime( GXutil.nullDate() );
      GXv_dtime6 = new java.util.Date[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdevgen__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdevgen__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdevgen__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdevgen__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdevgen__default(),
         new Object[] {
             new Object[] {
            T000P2_A323DevGenCod, T000P2_A1302DevLin, T000P2_A1303DevObs, T000P2_A396EmprCod
            }
            , new Object[] {
            T000P3_A323DevGenCod, T000P3_A1302DevLin, T000P3_A1303DevObs, T000P3_A396EmprCod
            }
            , new Object[] {
            T000P4_A323DevGenCod, T000P4_A5348DevHorSal, T000P4_n5348DevHorSal, T000P4_A325DevGenFec, T000P4_n325DevGenFec, T000P4_A328DevGenUni, T000P4_n328DevGenUni, T000P4_A326DevGenPie, T000P4_n326DevGenPie, T000P4_A5347DevMatric,
            T000P4_n5347DevMatric, T000P4_A6288DevGenDom, T000P4_n6288DevGenDom, T000P4_A324DevGenEst, T000P4_n324DevGenEst, T000P4_A1304DevUlin, T000P4_n1304DevUlin, T000P4_A10071DevFmd, T000P4_n10071DevFmd, T000P4_A10072DevFmdD,
            T000P4_n10072DevFmdD, T000P4_A10073DevFHh, T000P4_n10073DevFHh, T000P4_A10074DevGrossT, T000P4_n10074DevGrossT, T000P4_A10075DevStt, T000P4_n10075DevStt, T000P4_A10736DevEnvAT, T000P4_n10736DevEnvAT, T000P4_A10737DevATCodeI,
            T000P4_n10737DevATCodeI, T000P4_A10766DevGenAT, T000P4_n10766DevGenAT, T000P4_A10361DevDiscli, T000P4_n10361DevDiscli, T000P4_A10362DevMdl, T000P4_n10362DevMdl, T000P4_A12883DevAlbRecC, T000P4_n12883DevAlbRecC, T000P4_A14193DevGenATCU,
            T000P4_n14193DevGenATCU, T000P4_A14194DevGenSerA, T000P4_n14194DevGenSerA, T000P4_A14195DevGenTipA, T000P4_n14195DevGenTipA, T000P4_A396EmprCod, T000P4_A44AlbRecCod, T000P4_n44AlbRecCod, T000P4_A327DevGenTrn, T000P4_n327DevGenTrn,
            T000P4_A252CliCod, T000P4_n252CliCod
            }
            , new Object[] {
            T000P5_A323DevGenCod, T000P5_A5348DevHorSal, T000P5_n5348DevHorSal, T000P5_A325DevGenFec, T000P5_n325DevGenFec, T000P5_A328DevGenUni, T000P5_n328DevGenUni, T000P5_A326DevGenPie, T000P5_n326DevGenPie, T000P5_A5347DevMatric,
            T000P5_n5347DevMatric, T000P5_A6288DevGenDom, T000P5_n6288DevGenDom, T000P5_A324DevGenEst, T000P5_n324DevGenEst, T000P5_A1304DevUlin, T000P5_n1304DevUlin, T000P5_A10071DevFmd, T000P5_n10071DevFmd, T000P5_A10072DevFmdD,
            T000P5_n10072DevFmdD, T000P5_A10073DevFHh, T000P5_n10073DevFHh, T000P5_A10074DevGrossT, T000P5_n10074DevGrossT, T000P5_A10075DevStt, T000P5_n10075DevStt, T000P5_A10736DevEnvAT, T000P5_n10736DevEnvAT, T000P5_A10737DevATCodeI,
            T000P5_n10737DevATCodeI, T000P5_A10766DevGenAT, T000P5_n10766DevGenAT, T000P5_A10361DevDiscli, T000P5_n10361DevDiscli, T000P5_A10362DevMdl, T000P5_n10362DevMdl, T000P5_A12883DevAlbRecC, T000P5_n12883DevAlbRecC, T000P5_A14193DevGenATCU,
            T000P5_n14193DevGenATCU, T000P5_A14194DevGenSerA, T000P5_n14194DevGenSerA, T000P5_A14195DevGenTipA, T000P5_n14195DevGenTipA, T000P5_A396EmprCod, T000P5_A44AlbRecCod, T000P5_n44AlbRecCod, T000P5_A327DevGenTrn, T000P5_n327DevGenTrn,
            T000P5_A252CliCod, T000P5_n252CliCod
            }
            , new Object[] {
            T000P6_A407EmprNom, T000P6_n407EmprNom
            }
            , new Object[] {
            T000P7_A47AlbREst, T000P7_A60AlbRUniUti, T000P7_A54AlbRPieUti, T000P7_A45AlbRef, T000P7_A252CliCod, T000P7_A56AlbRUni, T000P7_A52AlbRPieEnt, T000P7_A58AlbRUniEnt, T000P7_A3359AlbRDisCli, T000P7_A4602AlbRMdlCod
            }
            , new Object[] {
            T000P8_A47AlbREst, T000P8_A60AlbRUniUti, T000P8_A54AlbRPieUti, T000P8_A45AlbRef, T000P8_A252CliCod, T000P8_A56AlbRUni, T000P8_A52AlbRPieEnt, T000P8_A58AlbRUniEnt, T000P8_A3359AlbRDisCli, T000P8_A4602AlbRMdlCod
            }
            , new Object[] {
            T000P9_A279CliNom
            }
            , new Object[] {
            T000P10_A329DevTrnNom, T000P10_n329DevTrnNom
            }
            , new Object[] {
            T000P11_A323DevGenCod, T000P11_A47AlbREst, T000P11_A5348DevHorSal, T000P11_n5348DevHorSal, T000P11_A60AlbRUniUti, T000P11_A54AlbRPieUti, T000P11_A407EmprNom, T000P11_n407EmprNom, T000P11_A45AlbRef, T000P11_A252CliCod,
            T000P11_n252CliCod, T000P11_A279CliNom, T000P11_A325DevGenFec, T000P11_n325DevGenFec, T000P11_A328DevGenUni, T000P11_n328DevGenUni, T000P11_A56AlbRUni, T000P11_A326DevGenPie, T000P11_n326DevGenPie, T000P11_A329DevTrnNom,
            T000P11_n329DevTrnNom, T000P11_A5347DevMatric, T000P11_n5347DevMatric, T000P11_A6288DevGenDom, T000P11_n6288DevGenDom, T000P11_A52AlbRPieEnt, T000P11_A58AlbRUniEnt, T000P11_A324DevGenEst, T000P11_n324DevGenEst, T000P11_A1304DevUlin,
            T000P11_n1304DevUlin, T000P11_A10071DevFmd, T000P11_n10071DevFmd, T000P11_A10072DevFmdD, T000P11_n10072DevFmdD, T000P11_A10073DevFHh, T000P11_n10073DevFHh, T000P11_A10074DevGrossT, T000P11_n10074DevGrossT, T000P11_A10075DevStt,
            T000P11_n10075DevStt, T000P11_A10736DevEnvAT, T000P11_n10736DevEnvAT, T000P11_A10737DevATCodeI, T000P11_n10737DevATCodeI, T000P11_A10766DevGenAT, T000P11_n10766DevGenAT, T000P11_A10361DevDiscli, T000P11_n10361DevDiscli, T000P11_A10362DevMdl,
            T000P11_n10362DevMdl, T000P11_A3359AlbRDisCli, T000P11_A4602AlbRMdlCod, T000P11_A12883DevAlbRecC, T000P11_n12883DevAlbRecC, T000P11_A14193DevGenATCU, T000P11_n14193DevGenATCU, T000P11_A14194DevGenSerA, T000P11_n14194DevGenSerA, T000P11_A14195DevGenTipA,
            T000P11_n14195DevGenTipA, T000P11_A396EmprCod, T000P11_A44AlbRecCod, T000P11_n44AlbRecCod, T000P11_A327DevGenTrn, T000P11_n327DevGenTrn
            }
            , new Object[] {
            T000P12_A279CliNom
            }
            , new Object[] {
            T000P13_A329DevTrnNom, T000P13_n329DevTrnNom
            }
            , new Object[] {
            T000P14_A396EmprCod, T000P14_A323DevGenCod
            }
            , new Object[] {
            T000P15_A396EmprCod, T000P15_A323DevGenCod
            }
            , new Object[] {
            T000P16_A396EmprCod, T000P16_A323DevGenCod
            }
            , new Object[] {
            T000P17_A47AlbREst, T000P17_A60AlbRUniUti, T000P17_A54AlbRPieUti, T000P17_A45AlbRef, T000P17_A252CliCod, T000P17_A56AlbRUni, T000P17_A52AlbRPieEnt, T000P17_A58AlbRUniEnt, T000P17_A3359AlbRDisCli, T000P17_A4602AlbRMdlCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000P21_A47AlbREst, T000P21_A60AlbRUniUti, T000P21_A54AlbRPieUti, T000P21_A45AlbRef, T000P21_A252CliCod, T000P21_A56AlbRUni, T000P21_A52AlbRPieEnt, T000P21_A58AlbRUniEnt, T000P21_A3359AlbRDisCli, T000P21_A4602AlbRMdlCod
            }
            , new Object[] {
            T000P22_A279CliNom
            }
            , new Object[] {
            T000P23_A329DevTrnNom, T000P23_n329DevTrnNom
            }
            , new Object[] {
            T000P24_A396EmprCod, T000P24_A323DevGenCod, T000P24_A2159AlbRecPie
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000P27_A396EmprCod, T000P27_A323DevGenCod
            }
            , new Object[] {
            T000P28_A323DevGenCod, T000P28_A1302DevLin, T000P28_A1303DevObs, T000P28_A396EmprCod
            }
            , new Object[] {
            T000P29_A396EmprCod, T000P29_A323DevGenCod, T000P29_A1302DevLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000P33_A396EmprCod, T000P33_A323DevGenCod, T000P33_A1302DevLin
            }
            , new Object[] {
            T000P34_A407EmprNom, T000P34_n407EmprNom
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV81Pgmname = "TDEVGEN" ;
      Z10766DevGenAT = " " ;
      n10766DevGenAT = false ;
      A10766DevGenAT = " " ;
      n10766DevGenAT = false ;
      i10766DevGenAT = " " ;
      n10766DevGenAT = false ;
      Z10736DevEnvAT = (byte)(0) ;
      n10736DevEnvAT = false ;
      A10736DevEnvAT = (byte)(0) ;
      n10736DevEnvAT = false ;
      i10736DevEnvAT = (byte)(0) ;
      n10736DevEnvAT = false ;
      Z10737DevATCodeI = " " ;
      n10737DevATCodeI = false ;
      A10737DevATCodeI = " " ;
      n10737DevATCodeI = false ;
      i10737DevATCodeI = " " ;
      n10737DevATCodeI = false ;
      Z10362DevMdl = "" ;
      n10362DevMdl = false ;
      A10362DevMdl = "" ;
      n10362DevMdl = false ;
      Z10361DevDiscli = "" ;
      n10361DevDiscli = false ;
      A10361DevDiscli = "" ;
      n10361DevDiscli = false ;
      Z10075DevStt = " " ;
      n10075DevStt = false ;
      A10075DevStt = " " ;
      n10075DevStt = false ;
      i10075DevStt = " " ;
      n10075DevStt = false ;
      Z325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      i325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
      A325DevGenFec = GXutil.today( ) ;
      n325DevGenFec = false ;
   }

   private byte Z6288DevGenDom ;
   private byte Z324DevGenEst ;
   private byte Z1304DevUlin ;
   private byte Z10736DevEnvAT ;
   private byte Z47AlbREst ;
   private byte O1304DevUlin ;
   private byte Z1302DevLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A1304DevUlin ;
   private byte Gx_BScreen ;
   private byte A6288DevGenDom ;
   private byte A10736DevEnvAT ;
   private byte B1304DevUlin ;
   private byte A324DevGenEst ;
   private byte A47AlbREst ;
   private byte AV71FirmaD ;
   private byte s1304DevUlin ;
   private byte A1302DevLin ;
   private byte subGridtdevgen_level1item_Backcolorstyle ;
   private byte subGridtdevgen_level1item_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i10736DevEnvAT ;
   private byte i1304DevUlin ;
   private byte subGridtdevgen_level1item_Allowselection ;
   private byte subGridtdevgen_level1item_Allowhovering ;
   private byte subGridtdevgen_level1item_Allowcollapsing ;
   private byte subGridtdevgen_level1item_Collapsed ;
   private byte ZZ6288DevGenDom ;
   private byte ZZ324DevGenEst ;
   private byte ZZ1304DevUlin ;
   private byte ZZ10736DevEnvAT ;
   private byte ZZ47AlbREst ;
   private byte ZO1304DevUlin ;
   private short Z326DevGenPie ;
   private short Z327DevGenTrn ;
   private short O326DevGenPie ;
   private short nRcdDeleted_192 ;
   private short nRcdExists_192 ;
   private short nIsMod_192 ;
   private short A327DevGenTrn ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A326DevGenPie ;
   private short nBlankRcdCount192 ;
   private short RcdFound192 ;
   private short B326DevGenPie ;
   private short nBlankRcdUsr192 ;
   private short AV28Piezas ;
   private short AV25PieAnt ;
   private short AV74OldPzas ;
   private short RcdFound31 ;
   private short nIsDirty_31 ;
   private short nIsDirty_192 ;
   private short ZV28Piezas ;
   private short ZV25PieAnt ;
   private short ZV74OldPzas ;
   private short ZZ326DevGenPie ;
   private short ZZ327DevGenTrn ;
   private short ZZV28Piezas ;
   private short ZZV25PieAnt ;
   private short ZZV74OldPzas ;
   private short ZO326DevGenPie ;
   private int Z323DevGenCod ;
   private int Z12883DevAlbRecC ;
   private int Z44AlbRecCod ;
   private int Z252CliCod ;
   private int Z52AlbRPieEnt ;
   private int O54AlbRPieUti ;
   private int nRC_GXsfl_169 ;
   private int nGXsfl_169_idx=1 ;
   private int A323DevGenCod ;
   private int A44AlbRecCod ;
   private int A252CliCod ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtDevGenCod_Enabled ;
   private int edtAlbRecCod_Enabled ;
   private int edtAlbRef_Enabled ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtDevGenFec_Enabled ;
   private int edtDevHorSal_Enabled ;
   private int edtDevGenUni_Enabled ;
   private int edtDevGenPie_Enabled ;
   private int edtDevGenTrn_Enabled ;
   private int edtDevTrnNom_Enabled ;
   private int edtDevMatric_Enabled ;
   private int edtDevGenDom_Enabled ;
   private int edtAlbRUniDis_Enabled ;
   private int A51AlbRPieDis ;
   private int edtAlbRPieDis_Enabled ;
   private int edtAlbRUniUti_Enabled ;
   private int A54AlbRPieUti ;
   private int edtAlbRPieUti_Enabled ;
   private int A52AlbRPieEnt ;
   private int edtAlbRPieEnt_Enabled ;
   private int edtAlbRUniEnt_Enabled ;
   private int edtDevFmd_Enabled ;
   private int edtDevFmdD_Enabled ;
   private int edtDevFHh_Enabled ;
   private int edtDevGrossT_Enabled ;
   private int edtDevStt_Enabled ;
   private int edtDevEnvAT_Enabled ;
   private int edtDevATCodeI_Enabled ;
   private int edtDevGenAT_Enabled ;
   private int edtDevDiscli_Enabled ;
   private int edtDevMdl_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int B54AlbRPieUti ;
   private int edtDevLin_Enabled ;
   private int edtDevObs_Enabled ;
   private int fRowAdded ;
   private int A12883DevAlbRecC ;
   private int AV18AlbRPieDis ;
   private int AV20AlbRPDis ;
   private int GX_JID ;
   private int Z54AlbRPieUti ;
   private int subGridtdevgen_level1item_Backcolor ;
   private int subGridtdevgen_level1item_Allbackcolor ;
   private int defedtDevLin_Enabled ;
   private int idxLst ;
   private int subGridtdevgen_level1item_Selectedindex ;
   private int subGridtdevgen_level1item_Selectioncolor ;
   private int subGridtdevgen_level1item_Hoveringcolor ;
   private int Z51AlbRPieDis ;
   private int ZV18AlbRPieDis ;
   private int ZV20AlbRPDis ;
   private int ZZ323DevGenCod ;
   private int ZZ44AlbRecCod ;
   private int ZZ12883DevAlbRecC ;
   private int ZZ54AlbRPieUti ;
   private int ZZ252CliCod ;
   private int ZZ52AlbRPieEnt ;
   private int ZZ51AlbRPieDis ;
   private int ZZV18AlbRPieDis ;
   private int ZZV20AlbRPDis ;
   private int ZO54AlbRPieUti ;
   private int GXv_int10[] ;
   private int GXv_int8[] ;
   private int GXv_int7[] ;
   private long GRIDTDEVGEN_LEVEL1ITEM_nFirstRecordOnPage ;
   private java.math.BigDecimal Z328DevGenUni ;
   private java.math.BigDecimal Z10074DevGrossT ;
   private java.math.BigDecimal Z58AlbRUniEnt ;
   private java.math.BigDecimal O328DevGenUni ;
   private java.math.BigDecimal O60AlbRUniUti ;
   private java.math.BigDecimal A328DevGenUni ;
   private java.math.BigDecimal A57AlbRUniDis ;
   private java.math.BigDecimal A60AlbRUniUti ;
   private java.math.BigDecimal A58AlbRUniEnt ;
   private java.math.BigDecimal A10074DevGrossT ;
   private java.math.BigDecimal B328DevGenUni ;
   private java.math.BigDecimal B60AlbRUniUti ;
   private java.math.BigDecimal AV19AlbRUniDis ;
   private java.math.BigDecimal AV73OldUni ;
   private java.math.BigDecimal AV26Kilos ;
   private java.math.BigDecimal AV27Metros ;
   private java.math.BigDecimal AV23KilAnt ;
   private java.math.BigDecimal AV24MetAnt ;
   private java.math.BigDecimal AV21AlbRUDis ;
   private java.math.BigDecimal Z60AlbRUniUti ;
   private java.math.BigDecimal Z57AlbRUniDis ;
   private java.math.BigDecimal ZV19AlbRUniDis ;
   private java.math.BigDecimal ZV21AlbRUDis ;
   private java.math.BigDecimal ZV73OldUni ;
   private java.math.BigDecimal ZV26Kilos ;
   private java.math.BigDecimal ZV27Metros ;
   private java.math.BigDecimal ZV23KilAnt ;
   private java.math.BigDecimal ZV24MetAnt ;
   private java.math.BigDecimal ZZ328DevGenUni ;
   private java.math.BigDecimal ZZ10074DevGrossT ;
   private java.math.BigDecimal ZZ60AlbRUniUti ;
   private java.math.BigDecimal ZZ58AlbRUniEnt ;
   private java.math.BigDecimal ZZ57AlbRUniDis ;
   private java.math.BigDecimal ZZV19AlbRUniDis ;
   private java.math.BigDecimal ZZV21AlbRUDis ;
   private java.math.BigDecimal ZZV73OldUni ;
   private java.math.BigDecimal ZZV26Kilos ;
   private java.math.BigDecimal ZZV27Metros ;
   private java.math.BigDecimal ZZV23KilAnt ;
   private java.math.BigDecimal ZZV24MetAnt ;
   private java.math.BigDecimal ZO328DevGenUni ;
   private java.math.BigDecimal ZO60AlbRUniUti ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z5347DevMatric ;
   private String Z10071DevFmd ;
   private String Z10072DevFmdD ;
   private String Z10075DevStt ;
   private String Z10737DevATCodeI ;
   private String Z10766DevGenAT ;
   private String Z10361DevDiscli ;
   private String Z10362DevMdl ;
   private String Z14193DevGenATCU ;
   private String Z14194DevGenSerA ;
   private String Z14195DevGenTipA ;
   private String Z45AlbRef ;
   private String Z56AlbRUni ;
   private String Z3359AlbRDisCli ;
   private String Z4602AlbRMdlCod ;
   private String Z1303DevObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV22AlbRUni ;
   private String AV81Pgmname ;
   private String AV17UsurCod ;
   private String AV33Station ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevGenCod_Internalname ;
   private String sGXsfl_169_idx="0001" ;
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
   private String edtAlbRecCod_Internalname ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRef_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String edtDevGenFec_Internalname ;
   private String edtDevGenFec_Jsonclick ;
   private String edtDevHorSal_Internalname ;
   private String edtDevHorSal_Jsonclick ;
   private String edtDevGenUni_Internalname ;
   private String edtDevGenUni_Jsonclick ;
   private String edtDevGenPie_Internalname ;
   private String edtDevGenPie_Jsonclick ;
   private String edtDevGenTrn_Internalname ;
   private String edtDevGenTrn_Jsonclick ;
   private String edtDevTrnNom_Internalname ;
   private String A329DevTrnNom ;
   private String edtDevTrnNom_Jsonclick ;
   private String edtDevMatric_Internalname ;
   private String A5347DevMatric ;
   private String edtDevMatric_Jsonclick ;
   private String edtDevGenDom_Internalname ;
   private String edtDevGenDom_Jsonclick ;
   private String edtAlbRUniDis_Internalname ;
   private String edtAlbRUniDis_Jsonclick ;
   private String edtAlbRPieDis_Internalname ;
   private String edtAlbRPieDis_Jsonclick ;
   private String edtAlbRUniUti_Internalname ;
   private String edtAlbRUniUti_Jsonclick ;
   private String edtAlbRPieUti_Internalname ;
   private String edtAlbRPieUti_Jsonclick ;
   private String edtAlbRPieEnt_Internalname ;
   private String edtAlbRPieEnt_Jsonclick ;
   private String edtAlbRUniEnt_Internalname ;
   private String edtAlbRUniEnt_Jsonclick ;
   private String edtDevFmd_Internalname ;
   private String A10071DevFmd ;
   private String edtDevFmdD_Internalname ;
   private String A10072DevFmdD ;
   private String edtDevFHh_Internalname ;
   private String edtDevFHh_Jsonclick ;
   private String edtDevGrossT_Internalname ;
   private String edtDevGrossT_Jsonclick ;
   private String edtDevStt_Internalname ;
   private String A10075DevStt ;
   private String edtDevStt_Jsonclick ;
   private String edtDevEnvAT_Internalname ;
   private String edtDevEnvAT_Jsonclick ;
   private String edtDevATCodeI_Internalname ;
   private String A10737DevATCodeI ;
   private String edtDevATCodeI_Jsonclick ;
   private String edtDevGenAT_Internalname ;
   private String A10766DevGenAT ;
   private String edtDevGenAT_Jsonclick ;
   private String edtDevDiscli_Internalname ;
   private String A10361DevDiscli ;
   private String edtDevDiscli_Jsonclick ;
   private String edtDevMdl_Internalname ;
   private String A10362DevMdl ;
   private String edtDevMdl_Jsonclick ;
   private String lblTitlelevel1_Internalname ;
   private String lblTitlelevel1_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String sMode192 ;
   private String edtDevLin_Internalname ;
   private String edtDevObs_Internalname ;
   private String sStyleString ;
   private String subGridtdevgen_level1item_Internalname ;
   private String A14193DevGenATCU ;
   private String A14194DevGenSerA ;
   private String A14195DevGenTipA ;
   private String A3359AlbRDisCli ;
   private String A4602AlbRMdlCod ;
   private String AV29Modo ;
   private String A407EmprNom ;
   private String hsh ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1303DevObs ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z329DevTrnNom ;
   private String sMode31 ;
   private String sGXsfl_169_fel_idx="0001" ;
   private String subGridtdevgen_level1item_Class ;
   private String subGridtdevgen_level1item_Linesclass ;
   private String ROClassString ;
   private String edtDevLin_Jsonclick ;
   private String edtDevObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String iV29Modo ;
   private String i10075DevStt ;
   private String i10737DevATCodeI ;
   private String i10766DevGenAT ;
   private String subGridtdevgen_level1item_Header ;
   private String ZV22AlbRUni ;
   private String ZZ396EmprCod ;
   private String ZZ407EmprNom ;
   private String ZZ5347DevMatric ;
   private String ZZ10071DevFmd ;
   private String ZZ10072DevFmdD ;
   private String ZZ10075DevStt ;
   private String ZZ10737DevATCodeI ;
   private String ZZ10766DevGenAT ;
   private String ZZ14193DevGenATCU ;
   private String ZZ14194DevGenSerA ;
   private String ZZ14195DevGenTipA ;
   private String ZZ45AlbRef ;
   private String ZZ56AlbRUni ;
   private String ZZ3359AlbRDisCli ;
   private String ZZ4602AlbRMdlCod ;
   private String ZZ279CliNom ;
   private String ZZ329DevTrnNom ;
   private String ZZV22AlbRUni ;
   private String ZZ10361DevDiscli ;
   private String ZZ10362DevMdl ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private java.util.Date Z5348DevHorSal ;
   private java.util.Date Z10073DevFHh ;
   private java.util.Date A5348DevHorSal ;
   private java.util.Date A10073DevFHh ;
   private java.util.Date ZZ10073DevFHh ;
   private java.util.Date ZZ5348DevHorSal ;
   private java.util.Date GXt_dtime5 ;
   private java.util.Date GXv_dtime6[] ;
   private java.util.Date Z325DevGenFec ;
   private java.util.Date A325DevGenFec ;
   private java.util.Date i325DevGenFec ;
   private java.util.Date ZZ325DevGenFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n44AlbRecCod ;
   private boolean n325DevGenFec ;
   private boolean n252CliCod ;
   private boolean n327DevGenTrn ;
   private boolean wbErr ;
   private boolean n1304DevUlin ;
   private boolean n328DevGenUni ;
   private boolean n326DevGenPie ;
   private boolean bGXsfl_169_Refreshing=false ;
   private boolean n324DevGenEst ;
   private boolean n12883DevAlbRecC ;
   private boolean n14193DevGenATCU ;
   private boolean n14194DevGenSerA ;
   private boolean n14195DevGenTipA ;
   private boolean n407EmprNom ;
   private boolean n5348DevHorSal ;
   private boolean n329DevTrnNom ;
   private boolean n5347DevMatric ;
   private boolean n6288DevGenDom ;
   private boolean n10071DevFmd ;
   private boolean n10072DevFmdD ;
   private boolean n10073DevFHh ;
   private boolean n10074DevGrossT ;
   private boolean n10075DevStt ;
   private boolean n10736DevEnvAT ;
   private boolean n10737DevATCodeI ;
   private boolean n10766DevGenAT ;
   private boolean n10361DevDiscli ;
   private boolean n10362DevMdl ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV75Texto_ii ;
   private String AV79msg_control ;
   private String ZV79msg_control ;
   private String ZZV79msg_control ;
   private com.genexus.webpanels.GXWebGrid Gridtdevgen_level1itemContainer ;
   private com.genexus.webpanels.GXWebRow Gridtdevgen_level1itemRow ;
   private com.genexus.webpanels.GXWebColumn Gridtdevgen_level1itemColumn ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbAlbRUni ;
   private IDataStoreProvider pr_default ;
   private String[] T000P6_A407EmprNom ;
   private boolean[] T000P6_n407EmprNom ;
   private int[] T000P11_A323DevGenCod ;
   private byte[] T000P11_A47AlbREst ;
   private java.util.Date[] T000P11_A5348DevHorSal ;
   private boolean[] T000P11_n5348DevHorSal ;
   private java.math.BigDecimal[] T000P11_A60AlbRUniUti ;
   private int[] T000P11_A54AlbRPieUti ;
   private String[] T000P11_A407EmprNom ;
   private boolean[] T000P11_n407EmprNom ;
   private String[] T000P11_A45AlbRef ;
   private int[] T000P11_A252CliCod ;
   private boolean[] T000P11_n252CliCod ;
   private String[] T000P11_A279CliNom ;
   private java.util.Date[] T000P11_A325DevGenFec ;
   private boolean[] T000P11_n325DevGenFec ;
   private java.math.BigDecimal[] T000P11_A328DevGenUni ;
   private boolean[] T000P11_n328DevGenUni ;
   private String[] T000P11_A56AlbRUni ;
   private short[] T000P11_A326DevGenPie ;
   private boolean[] T000P11_n326DevGenPie ;
   private String[] T000P11_A329DevTrnNom ;
   private boolean[] T000P11_n329DevTrnNom ;
   private String[] T000P11_A5347DevMatric ;
   private boolean[] T000P11_n5347DevMatric ;
   private byte[] T000P11_A6288DevGenDom ;
   private boolean[] T000P11_n6288DevGenDom ;
   private int[] T000P11_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T000P11_A58AlbRUniEnt ;
   private byte[] T000P11_A324DevGenEst ;
   private boolean[] T000P11_n324DevGenEst ;
   private byte[] T000P11_A1304DevUlin ;
   private boolean[] T000P11_n1304DevUlin ;
   private String[] T000P11_A10071DevFmd ;
   private boolean[] T000P11_n10071DevFmd ;
   private String[] T000P11_A10072DevFmdD ;
   private boolean[] T000P11_n10072DevFmdD ;
   private java.util.Date[] T000P11_A10073DevFHh ;
   private boolean[] T000P11_n10073DevFHh ;
   private java.math.BigDecimal[] T000P11_A10074DevGrossT ;
   private boolean[] T000P11_n10074DevGrossT ;
   private String[] T000P11_A10075DevStt ;
   private boolean[] T000P11_n10075DevStt ;
   private byte[] T000P11_A10736DevEnvAT ;
   private boolean[] T000P11_n10736DevEnvAT ;
   private String[] T000P11_A10737DevATCodeI ;
   private boolean[] T000P11_n10737DevATCodeI ;
   private String[] T000P11_A10766DevGenAT ;
   private boolean[] T000P11_n10766DevGenAT ;
   private String[] T000P11_A10361DevDiscli ;
   private boolean[] T000P11_n10361DevDiscli ;
   private String[] T000P11_A10362DevMdl ;
   private boolean[] T000P11_n10362DevMdl ;
   private String[] T000P11_A3359AlbRDisCli ;
   private String[] T000P11_A4602AlbRMdlCod ;
   private int[] T000P11_A12883DevAlbRecC ;
   private boolean[] T000P11_n12883DevAlbRecC ;
   private String[] T000P11_A14193DevGenATCU ;
   private boolean[] T000P11_n14193DevGenATCU ;
   private String[] T000P11_A14194DevGenSerA ;
   private boolean[] T000P11_n14194DevGenSerA ;
   private String[] T000P11_A14195DevGenTipA ;
   private boolean[] T000P11_n14195DevGenTipA ;
   private String[] T000P11_A396EmprCod ;
   private int[] T000P11_A44AlbRecCod ;
   private boolean[] T000P11_n44AlbRecCod ;
   private short[] T000P11_A327DevGenTrn ;
   private boolean[] T000P11_n327DevGenTrn ;
   private byte[] T000P8_A47AlbREst ;
   private java.math.BigDecimal[] T000P8_A60AlbRUniUti ;
   private int[] T000P8_A54AlbRPieUti ;
   private String[] T000P8_A45AlbRef ;
   private int[] T000P8_A252CliCod ;
   private boolean[] T000P8_n252CliCod ;
   private String[] T000P8_A56AlbRUni ;
   private int[] T000P8_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T000P8_A58AlbRUniEnt ;
   private String[] T000P8_A3359AlbRDisCli ;
   private String[] T000P8_A4602AlbRMdlCod ;
   private String[] T000P9_A279CliNom ;
   private String[] T000P10_A329DevTrnNom ;
   private boolean[] T000P10_n329DevTrnNom ;
   private String[] T000P12_A279CliNom ;
   private String[] T000P13_A329DevTrnNom ;
   private boolean[] T000P13_n329DevTrnNom ;
   private String[] T000P14_A396EmprCod ;
   private int[] T000P14_A323DevGenCod ;
   private int[] T000P5_A323DevGenCod ;
   private java.util.Date[] T000P5_A5348DevHorSal ;
   private boolean[] T000P5_n5348DevHorSal ;
   private java.util.Date[] T000P5_A325DevGenFec ;
   private boolean[] T000P5_n325DevGenFec ;
   private java.math.BigDecimal[] T000P5_A328DevGenUni ;
   private boolean[] T000P5_n328DevGenUni ;
   private short[] T000P5_A326DevGenPie ;
   private boolean[] T000P5_n326DevGenPie ;
   private String[] T000P5_A5347DevMatric ;
   private boolean[] T000P5_n5347DevMatric ;
   private byte[] T000P5_A6288DevGenDom ;
   private boolean[] T000P5_n6288DevGenDom ;
   private byte[] T000P5_A324DevGenEst ;
   private boolean[] T000P5_n324DevGenEst ;
   private byte[] T000P5_A1304DevUlin ;
   private boolean[] T000P5_n1304DevUlin ;
   private String[] T000P5_A10071DevFmd ;
   private boolean[] T000P5_n10071DevFmd ;
   private String[] T000P5_A10072DevFmdD ;
   private boolean[] T000P5_n10072DevFmdD ;
   private java.util.Date[] T000P5_A10073DevFHh ;
   private boolean[] T000P5_n10073DevFHh ;
   private java.math.BigDecimal[] T000P5_A10074DevGrossT ;
   private boolean[] T000P5_n10074DevGrossT ;
   private String[] T000P5_A10075DevStt ;
   private boolean[] T000P5_n10075DevStt ;
   private byte[] T000P5_A10736DevEnvAT ;
   private boolean[] T000P5_n10736DevEnvAT ;
   private String[] T000P5_A10737DevATCodeI ;
   private boolean[] T000P5_n10737DevATCodeI ;
   private String[] T000P5_A10766DevGenAT ;
   private boolean[] T000P5_n10766DevGenAT ;
   private String[] T000P5_A10361DevDiscli ;
   private boolean[] T000P5_n10361DevDiscli ;
   private String[] T000P5_A10362DevMdl ;
   private boolean[] T000P5_n10362DevMdl ;
   private int[] T000P5_A12883DevAlbRecC ;
   private boolean[] T000P5_n12883DevAlbRecC ;
   private String[] T000P5_A14193DevGenATCU ;
   private boolean[] T000P5_n14193DevGenATCU ;
   private String[] T000P5_A14194DevGenSerA ;
   private boolean[] T000P5_n14194DevGenSerA ;
   private String[] T000P5_A14195DevGenTipA ;
   private boolean[] T000P5_n14195DevGenTipA ;
   private String[] T000P5_A396EmprCod ;
   private int[] T000P5_A44AlbRecCod ;
   private boolean[] T000P5_n44AlbRecCod ;
   private short[] T000P5_A327DevGenTrn ;
   private boolean[] T000P5_n327DevGenTrn ;
   private int[] T000P5_A252CliCod ;
   private boolean[] T000P5_n252CliCod ;
   private String[] T000P15_A396EmprCod ;
   private int[] T000P15_A323DevGenCod ;
   private String[] T000P16_A396EmprCod ;
   private int[] T000P16_A323DevGenCod ;
   private int[] T000P4_A323DevGenCod ;
   private java.util.Date[] T000P4_A5348DevHorSal ;
   private boolean[] T000P4_n5348DevHorSal ;
   private java.util.Date[] T000P4_A325DevGenFec ;
   private boolean[] T000P4_n325DevGenFec ;
   private java.math.BigDecimal[] T000P4_A328DevGenUni ;
   private boolean[] T000P4_n328DevGenUni ;
   private short[] T000P4_A326DevGenPie ;
   private boolean[] T000P4_n326DevGenPie ;
   private String[] T000P4_A5347DevMatric ;
   private boolean[] T000P4_n5347DevMatric ;
   private byte[] T000P4_A6288DevGenDom ;
   private boolean[] T000P4_n6288DevGenDom ;
   private byte[] T000P4_A324DevGenEst ;
   private boolean[] T000P4_n324DevGenEst ;
   private byte[] T000P4_A1304DevUlin ;
   private boolean[] T000P4_n1304DevUlin ;
   private String[] T000P4_A10071DevFmd ;
   private boolean[] T000P4_n10071DevFmd ;
   private String[] T000P4_A10072DevFmdD ;
   private boolean[] T000P4_n10072DevFmdD ;
   private java.util.Date[] T000P4_A10073DevFHh ;
   private boolean[] T000P4_n10073DevFHh ;
   private java.math.BigDecimal[] T000P4_A10074DevGrossT ;
   private boolean[] T000P4_n10074DevGrossT ;
   private String[] T000P4_A10075DevStt ;
   private boolean[] T000P4_n10075DevStt ;
   private byte[] T000P4_A10736DevEnvAT ;
   private boolean[] T000P4_n10736DevEnvAT ;
   private String[] T000P4_A10737DevATCodeI ;
   private boolean[] T000P4_n10737DevATCodeI ;
   private String[] T000P4_A10766DevGenAT ;
   private boolean[] T000P4_n10766DevGenAT ;
   private String[] T000P4_A10361DevDiscli ;
   private boolean[] T000P4_n10361DevDiscli ;
   private String[] T000P4_A10362DevMdl ;
   private boolean[] T000P4_n10362DevMdl ;
   private int[] T000P4_A12883DevAlbRecC ;
   private boolean[] T000P4_n12883DevAlbRecC ;
   private String[] T000P4_A14193DevGenATCU ;
   private boolean[] T000P4_n14193DevGenATCU ;
   private String[] T000P4_A14194DevGenSerA ;
   private boolean[] T000P4_n14194DevGenSerA ;
   private String[] T000P4_A14195DevGenTipA ;
   private boolean[] T000P4_n14195DevGenTipA ;
   private String[] T000P4_A396EmprCod ;
   private int[] T000P4_A44AlbRecCod ;
   private boolean[] T000P4_n44AlbRecCod ;
   private short[] T000P4_A327DevGenTrn ;
   private boolean[] T000P4_n327DevGenTrn ;
   private int[] T000P4_A252CliCod ;
   private boolean[] T000P4_n252CliCod ;
   private byte[] T000P17_A47AlbREst ;
   private java.math.BigDecimal[] T000P17_A60AlbRUniUti ;
   private int[] T000P17_A54AlbRPieUti ;
   private String[] T000P17_A45AlbRef ;
   private int[] T000P17_A252CliCod ;
   private boolean[] T000P17_n252CliCod ;
   private String[] T000P17_A56AlbRUni ;
   private int[] T000P17_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T000P17_A58AlbRUniEnt ;
   private String[] T000P17_A3359AlbRDisCli ;
   private String[] T000P17_A4602AlbRMdlCod ;
   private byte[] T000P21_A47AlbREst ;
   private java.math.BigDecimal[] T000P21_A60AlbRUniUti ;
   private int[] T000P21_A54AlbRPieUti ;
   private String[] T000P21_A45AlbRef ;
   private int[] T000P21_A252CliCod ;
   private boolean[] T000P21_n252CliCod ;
   private String[] T000P21_A56AlbRUni ;
   private int[] T000P21_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T000P21_A58AlbRUniEnt ;
   private String[] T000P21_A3359AlbRDisCli ;
   private String[] T000P21_A4602AlbRMdlCod ;
   private String[] T000P22_A279CliNom ;
   private String[] T000P23_A329DevTrnNom ;
   private boolean[] T000P23_n329DevTrnNom ;
   private String[] T000P24_A396EmprCod ;
   private int[] T000P24_A323DevGenCod ;
   private String[] T000P24_A2159AlbRecPie ;
   private String[] T000P27_A396EmprCod ;
   private int[] T000P27_A323DevGenCod ;
   private int[] T000P28_A323DevGenCod ;
   private byte[] T000P28_A1302DevLin ;
   private String[] T000P28_A1303DevObs ;
   private String[] T000P28_A396EmprCod ;
   private String[] T000P29_A396EmprCod ;
   private int[] T000P29_A323DevGenCod ;
   private byte[] T000P29_A1302DevLin ;
   private int[] T000P3_A323DevGenCod ;
   private byte[] T000P3_A1302DevLin ;
   private String[] T000P3_A1303DevObs ;
   private String[] T000P3_A396EmprCod ;
   private int[] T000P2_A323DevGenCod ;
   private byte[] T000P2_A1302DevLin ;
   private String[] T000P2_A1303DevObs ;
   private String[] T000P2_A396EmprCod ;
   private String[] T000P33_A396EmprCod ;
   private int[] T000P33_A323DevGenCod ;
   private byte[] T000P33_A1302DevLin ;
   private String[] T000P34_A407EmprNom ;
   private boolean[] T000P34_n407EmprNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private byte[] T000P7_A47AlbREst ;
   private java.math.BigDecimal[] T000P7_A60AlbRUniUti ;
   private int[] T000P7_A54AlbRPieUti ;
   private String[] T000P7_A45AlbRef ;
   private int[] T000P7_A252CliCod ;
   private String[] T000P7_A56AlbRUni ;
   private int[] T000P7_A52AlbRPieEnt ;
   private java.math.BigDecimal[] T000P7_A58AlbRUniEnt ;
   private String[] T000P7_A3359AlbRDisCli ;
   private String[] T000P7_A4602AlbRMdlCod ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tdevgen__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevgen__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevgen__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevgen__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdevgen__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000P2", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?  FOR UPDATE OF DevObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P3", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P4", "SELECT DevGenCod, DevHorSal, DevGenFec, DevGenUni, DevGenPie, DevMatric, DevGenDom, DevGenEst, DevUlin, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevEnvAT, DevATCodeI, DevGenAT, DevDiscli, DevMdl, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ?  FOR UPDATE OF DevHorSal, DevGenFec, DevGenUni, DevGenPie, DevMatric, DevGenDom, DevGenEst, DevUlin, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevEnvAT, DevATCodeI, DevGenAT, DevDiscli, DevMdl, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA, AlbRecCod, DevGenTrn, CliCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P5", "SELECT DevGenCod, DevHorSal, DevGenFec, DevGenUni, DevGenPie, DevMatric, DevGenDom, DevGenEst, DevUlin, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevEnvAT, DevATCodeI, DevGenAT, DevDiscli, DevMdl, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA, EmprCod, AlbRecCod, DevGenTrn, CliCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P7", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, AlbRef, CliCod, AlbRUni, AlbRPieEnt, AlbRUniEnt, AlbRDisCli, AlbRMdlCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREst, AlbRUniUti, AlbRPieUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P8", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, AlbRef, CliCod, AlbRUni, AlbRPieEnt, AlbRUniEnt, AlbRDisCli, AlbRMdlCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P10", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P11", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevGenCod, T3.AlbREst, TM1.DevHorSal, T3.AlbRUniUti, T3.AlbRPieUti, T2.EmprNom, T3.AlbRef, TM1.CliCod, T4.CliNom, TM1.DevGenFec, TM1.DevGenUni, T3.AlbRUni, TM1.DevGenPie, T5.TrnNom AS DevTrnNom, TM1.DevMatric, TM1.DevGenDom, T3.AlbRPieEnt, T3.AlbRUniEnt, TM1.DevGenEst, TM1.DevUlin, TM1.DevFmd, TM1.DevFmdD, TM1.DevFHh, TM1.DevGrossT, TM1.DevStt, TM1.DevEnvAT, TM1.DevATCodeI, TM1.DevGenAT, TM1.DevDiscli, TM1.DevMdl, T3.AlbRDisCli, T3.AlbRMdlCod, TM1.DevAlbRecC, TM1.DevGenATCU, TM1.DevGenSerA, TM1.DevGenTipA, TM1.EmprCod, TM1.AlbRecCod, TM1.DevGenTrn AS DevGenTrn FROM ((((TXPDEVGEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPALBREC T3 ON T3.EmprCod = TM1.EmprCod AND T3.AlbRecCod = TM1.AlbRecCod) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = TM1.EmprCod AND T4.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T5 ON T5.EmprCod = TM1.EmprCod AND T5.TrnCod = TM1.DevGenTrn) WHERE TM1.EmprCod = ? and TM1.DevGenCod = ? ORDER BY TM1.EmprCod, TM1.DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P12", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P13", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P14", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? AND DevGenCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P15", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE ( DevGenCod > ?) and EmprCod = ? ORDER BY EmprCod, DevGenCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000P16", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE ( DevGenCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevGenCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000P17", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, AlbRef, CliCod, AlbRUni, AlbRPieEnt, AlbRUniEnt, AlbRDisCli, AlbRMdlCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ?  FOR UPDATE OF AlbREst, AlbRUniUti, AlbRPieUti NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000P18", "INSERT INTO TXPDEVGEN(CliCod, DevGenCod, DevHorSal, DevGenFec, DevGenUni, DevGenPie, DevMatric, DevGenDom, DevGenEst, DevUlin, DevFmd, DevFmdD, DevFHh, DevGrossT, DevStt, DevEnvAT, DevATCodeI, DevGenAT, DevDiscli, DevMdl, DevAlbRecC, DevGenATCU, DevGenSerA, DevGenTipA, EmprCod, AlbRecCod, DevGenTrn, EmprTrn) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ')", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T000P19", "UPDATE TXPDEVGEN SET CliCod=?, DevHorSal=?, DevGenFec=?, DevGenUni=?, DevGenPie=?, DevMatric=?, DevGenDom=?, DevGenEst=?, DevUlin=?, DevFmd=?, DevFmdD=?, DevFHh=?, DevGrossT=?, DevStt=?, DevEnvAT=?, DevATCodeI=?, DevGenAT=?, DevDiscli=?, DevMdl=?, DevAlbRecC=?, DevGenATCU=?, DevGenSerA=?, DevGenTipA=?, AlbRecCod=?, DevGenTrn=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T000P20", "DELETE FROM TXPDEVGEN  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new ForEachCursor("T000P21", "SELECT AlbREst, AlbRUniUti, AlbRPieUti, AlbRef, CliCod, AlbRUni, AlbRPieEnt, AlbRUniEnt, AlbRDisCli, AlbRMdlCod FROM TXPALBREC WHERE EmprCod = ? AND AlbRecCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P22", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P23", "SELECT TrnNom AS DevTrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P24", "SELECT * FROM (SELECT EmprCod, DevGenCod, AlbRecPie FROM TXPDevPie WHERE EmprCod = ? AND DevGenCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000P25", "UPDATE TXPDEVGEN SET DevUlin=?  WHERE EmprCod = ? AND DevGenCod = ?", GX_NOMASK, "TXPDEVGEN")
         ,new UpdateCursor("T000P26", "UPDATE TXPALBREC SET AlbREst=?, AlbRUniUti=?, AlbRPieUti=?  WHERE EmprCod = ? AND AlbRecCod = ?", GX_NOMASK, "TXPALBREC")
         ,new ForEachCursor("T000P27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevGenCod FROM TXPDEVGEN WHERE EmprCod = ? ORDER BY EmprCod, DevGenCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P28", "SELECT DevGenCod, DevLin, DevObs, EmprCod FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? and DevLin = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P29", "SELECT EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000P30", "INSERT INTO TXPDEVOBS(DevGenCod, DevLin, DevObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("T000P31", "UPDATE TXPDEVOBS SET DevObs=?  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new UpdateCursor("T000P32", "DELETE FROM TXPDEVOBS  WHERE EmprCod = ? AND DevGenCod = ? AND DevLin = ?", GX_NOMASK, "TXPDEVOBS")
         ,new ForEachCursor("T000P33", "SELECT EmprCod, DevGenCod, DevLin FROM TXPDEVOBS WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod, DevLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000P34", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 200);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 300);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((int[]) buf[46])[0] = rslt.getInt(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(27);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 20);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 200);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 300);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[21])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(13,2);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(17, 1);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(18, 20);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getString(19, 13);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((int[]) buf[37])[0] = rslt.getInt(20);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(21, 20);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(23, 4);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(24, 3);
               ((int[]) buf[46])[0] = rslt.getInt(25);
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((short[]) buf[48])[0] = rslt.getShort(26);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((int[]) buf[50])[0] = rslt.getInt(27);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               return;
            case 6 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(7, 16);
               ((int[]) buf[9])[0] = rslt.getInt(8);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(9, 30);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(10);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(11,2);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(12, 1);
               ((short[]) buf[17])[0] = rslt.getShort(13);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(15, 20);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((byte[]) buf[23])[0] = rslt.getByte(16);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((int[]) buf[25])[0] = rslt.getInt(17);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(18,2);
               ((byte[]) buf[27])[0] = rslt.getByte(19);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(20);
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getString(21, 200);
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getString(22, 300);
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(23);
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[37])[0] = rslt.getBigDecimal(24,2);
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getString(25, 1);
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((byte[]) buf[41])[0] = rslt.getByte(26);
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getString(27, 20);
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getString(28, 1);
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getString(29, 20);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(30, 13);
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getString(31, 20);
               ((String[]) buf[52])[0] = rslt.getString(32, 13);
               ((int[]) buf[53])[0] = rslt.getInt(33);
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((String[]) buf[55])[0] = rslt.getString(34, 20);
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((String[]) buf[57])[0] = rslt.getString(35, 20);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(36, 4);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getString(37, 3);
               ((int[]) buf[62])[0] = rslt.getInt(38);
               ((boolean[]) buf[63])[0] = rslt.wasNull();
               ((short[]) buf[64])[0] = rslt.getShort(39);
               ((boolean[]) buf[65])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               return;
            case 19 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 9);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 26 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 32 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 14 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
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
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DATE );
               }
               else
               {
                  stmt.setDate(4, (java.util.Date)parms[6]);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[8], 2);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[12], 20);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[16]).byteValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[18]).byteValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[20], 200);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(12, (String)parms[22], 300);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(14, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[30]).byteValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[32], 20);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[36], 20);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(20, (String)parms[38], 13);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(21, ((Number) parms[40]).intValue());
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[42], 20);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[44], 20);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(24, (String)parms[46], 4);
               }
               stmt.setString(25, (String)parms[47], 3);
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(26, ((Number) parms[49]).intValue());
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[51]).shortValue());
               }
               return;
            case 17 :
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[5]);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 2);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[11], 20);
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
                  stmt.setByte(8, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[17]).byteValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[19], 200);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(11, (String)parms[21], 300);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(13, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(14, (String)parms[27], 1);
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
                  stmt.setString(16, (String)parms[31], 20);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(18, (String)parms[35], 20);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(19, (String)parms[37], 13);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(20, ((Number) parms[39]).intValue());
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(21, (String)parms[41], 20);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(22, (String)parms[43], 20);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(23, (String)parms[45], 4);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(24, ((Number) parms[47]).intValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(25, ((Number) parms[49]).shortValue());
               }
               stmt.setString(26, (String)parms[50], 3);
               stmt.setInt(27, ((Number) parms[51]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
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
            case 20 :
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
            case 21 :
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
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 24 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 28 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

