package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpincidencias2_impl extends GXDataArea
{
   public wpincidencias2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpincidencias2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpincidencias2_impl.class ));
   }

   public wpincidencias2_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      cmbavDynamicfiltersselector1 = new HTMLChoice();
      cmbavDynamicfiltersoperator1 = new HTMLChoice();
      cmbavDynamicfiltersselector2 = new HTMLChoice();
      cmbavDynamicfiltersoperator2 = new HTMLChoice();
      cmbavDynamicfiltersselector3 = new HTMLChoice();
      cmbavDynamicfiltersoperator3 = new HTMLChoice();
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid") == 0 )
         {
            gxnrgrid_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid") == 0 )
         {
            gxgrgrid_refresh_invoke( ) ;
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
      }
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_114 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_114"))) ;
      nGXsfl_114_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_114_idx"))) ;
      sGXsfl_114_idx = httpContext.GetPar( "sGXsfl_114_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid_newrow( ) ;
      /* End function gxnrGrid_newrow_invoke */
   }

   public void gxgrgrid_refresh_invoke( )
   {
      subGrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid_Rows"))) ;
      cmbavDynamicfiltersselector1.fromJSonString( httpContext.GetNextPar( ));
      AV16DynamicFiltersSelector1 = httpContext.GetPar( "DynamicFiltersSelector1") ;
      cmbavDynamicfiltersoperator1.fromJSonString( httpContext.GetNextPar( ));
      AV17DynamicFiltersOperator1 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator1"))) ;
      AV18Inc_Num_ult1 = GXutil.lval( httpContext.GetPar( "Inc_Num_ult1")) ;
      AV19EmprNom1 = httpContext.GetPar( "EmprNom1") ;
      cmbavDynamicfiltersselector2.fromJSonString( httpContext.GetNextPar( ));
      AV21DynamicFiltersSelector2 = httpContext.GetPar( "DynamicFiltersSelector2") ;
      cmbavDynamicfiltersoperator2.fromJSonString( httpContext.GetNextPar( ));
      AV22DynamicFiltersOperator2 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator2"))) ;
      AV23Inc_Num_ult2 = GXutil.lval( httpContext.GetPar( "Inc_Num_ult2")) ;
      AV24EmprNom2 = httpContext.GetPar( "EmprNom2") ;
      cmbavDynamicfiltersselector3.fromJSonString( httpContext.GetNextPar( ));
      AV26DynamicFiltersSelector3 = httpContext.GetPar( "DynamicFiltersSelector3") ;
      cmbavDynamicfiltersoperator3.fromJSonString( httpContext.GetNextPar( ));
      AV27DynamicFiltersOperator3 = (short)(GXutil.lval( httpContext.GetPar( "DynamicFiltersOperator3"))) ;
      AV28Inc_Num_ult3 = GXutil.lval( httpContext.GetPar( "Inc_Num_ult3")) ;
      AV29EmprNom3 = httpContext.GetPar( "EmprNom3") ;
      AV41ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV20DynamicFiltersEnabled2 = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersEnabled2")) ;
      AV25DynamicFiltersEnabled3 = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersEnabled3")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV36ColumnsSelector);
      AV78Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV73FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV43TFInc_Dia = localUtil.parseDateParm( httpContext.GetPar( "TFInc_Dia")) ;
      AV48TFInc_Linea = GXutil.lval( httpContext.GetPar( "TFInc_Linea")) ;
      AV49TFInc_Linea_To = GXutil.lval( httpContext.GetPar( "TFInc_Linea_To")) ;
      AV51TFInc_Hora = GXutil.resetDate(localUtil.parseDTimeParm( httpContext.GetPar( "TFInc_Hora"))) ;
      AV56TFInc_Prog = httpContext.GetPar( "TFInc_Prog") ;
      AV57TFInc_Prog_Sel = httpContext.GetPar( "TFInc_Prog_Sel") ;
      AV59TFInc_Terminal = httpContext.GetPar( "TFInc_Terminal") ;
      AV60TFInc_Terminal_Sel = httpContext.GetPar( "TFInc_Terminal_Sel") ;
      AV62TFInc_Usuario = httpContext.GetPar( "TFInc_Usuario") ;
      AV63TFInc_Usuario_Sel = httpContext.GetPar( "TFInc_Usuario_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10GridState);
      AV31DynamicFiltersIgnoreFirst = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersIgnoreFirst")) ;
      AV30DynamicFiltersRemoving = GXutil.strtobool( httpContext.GetPar( "DynamicFiltersRemoving")) ;
      A4936Inc_Obs = httpContext.GetPar( "Inc_Obs") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
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

   public byte executeStartEvent( )
   {
      paFM2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startFM2( ) ;
      }
      return gxajaxcallmode ;
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
      if ( nGXWrapped != 1 )
      {
         MasterPageObj.master_styles();
      }
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      if ( nGXWrapped == 0 )
      {
         bodyStyle += "-moz-opacity:0;opacity:0;" ;
      }
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wpincidencias2", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WPIncidencias2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wpincidencias2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR1", AV16DynamicFiltersSelector1);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR1", GXutil.ltrim( localUtil.ntoc( AV17DynamicFiltersOperator1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_NUM_ULT1", GXutil.ltrim( localUtil.ntoc( AV18Inc_Num_ult1, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vEMPRNOM1", GXutil.rtrim( AV19EmprNom1));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR2", AV21DynamicFiltersSelector2);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR2", GXutil.ltrim( localUtil.ntoc( AV22DynamicFiltersOperator2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_NUM_ULT2", GXutil.ltrim( localUtil.ntoc( AV23Inc_Num_ult2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vEMPRNOM2", GXutil.rtrim( AV24EmprNom2));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSSELECTOR3", AV26DynamicFiltersSelector3);
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vDYNAMICFILTERSOPERATOR3", GXutil.ltrim( localUtil.ntoc( AV27DynamicFiltersOperator3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vINC_NUM_ULT3", GXutil.ltrim( localUtil.ntoc( AV28Inc_Num_ult3, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vEMPRNOM3", GXutil.rtrim( AV29EmprNom3));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_114", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_114, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV65DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV65DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV36ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV41ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSENABLED2", AV20DynamicFiltersEnabled2);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSENABLED3", AV25DynamicFiltersEnabled3);
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_DIA", localUtil.dtoc( AV43TFInc_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_LINEA", GXutil.ltrim( localUtil.ntoc( AV48TFInc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_LINEA_TO", GXutil.ltrim( localUtil.ntoc( AV49TFInc_Linea_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_HORA", localUtil.ttoc( AV51TFInc_Hora, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_PROG", GXutil.rtrim( AV56TFInc_Prog));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_PROG_SEL", GXutil.rtrim( AV57TFInc_Prog_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_TERMINAL", GXutil.rtrim( AV59TFInc_Terminal));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_TERMINAL_SEL", GXutil.rtrim( AV60TFInc_Terminal_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_USUARIO", GXutil.rtrim( AV62TFInc_Usuario));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFINC_USUARIO_SEL", GXutil.rtrim( AV63TFInc_Usuario_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSIGNOREFIRST", AV31DynamicFiltersIgnoreFirst);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vDYNAMICFILTERSREMOVING", AV30DynamicFiltersRemoving);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
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

   public void renderHtmlContent( )
   {
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         weFM2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtFM2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.wpincidencias2", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WPIncidencias2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Control de Incidencias", "") ;
   }

   public void wbFM0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( nGXWrapped == 1 )
         {
            renderHtmlHeaders( ) ;
            renderHtmlOpenForm( ) ;
         }
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tableheader.setProperty("Width", Dvpanel_tableheader_Width);
         ucDvpanel_tableheader.setProperty("AutoWidth", Dvpanel_tableheader_Autowidth);
         ucDvpanel_tableheader.setProperty("AutoHeight", Dvpanel_tableheader_Autoheight);
         ucDvpanel_tableheader.setProperty("Cls", Dvpanel_tableheader_Cls);
         ucDvpanel_tableheader.setProperty("Title", Dvpanel_tableheader_Title);
         ucDvpanel_tableheader.setProperty("Collapsible", Dvpanel_tableheader_Collapsible);
         ucDvpanel_tableheader.setProperty("Collapsed", Dvpanel_tableheader_Collapsed);
         ucDvpanel_tableheader.setProperty("ShowCollapseIcon", Dvpanel_tableheader_Showcollapseicon);
         ucDvpanel_tableheader.setProperty("IconPosition", Dvpanel_tableheader_Iconposition);
         ucDvpanel_tableheader.setProperty("AutoScroll", Dvpanel_tableheader_Autoscroll);
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, "DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 114, 3, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_FM2( true) ;
      }
      else
      {
         wb_table1_23_FM2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_FM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol114( ) ;
      }
      if ( wbEnd == 114 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_114 = (int)(nGXsfl_114_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV78Pgmname), GXutil.rtrim( localUtil.format( AV78Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblJsdynamicfilters_Internalname, lblJsdynamicfilters_Caption, "", "", lblJsdynamicfilters_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "", 0, "", 1, 1, 0, (short)(1), "HLP_WPIncidencias2.htm");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV65DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV65DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV36ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_inc_diaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_inc_diaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_inc_diaauxdate_Internalname, localUtil.format(AV45DDO_Inc_DiaAuxDate, "99/99/99"), localUtil.format( AV45DDO_Inc_DiaAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,137);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_inc_diaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_inc_diaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPIncidencias2.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_inc_horaauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_inc_horaauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_inc_horaauxdate_Internalname, localUtil.format(AV53DDO_Inc_HoraAuxDate, "99/99/99"), localUtil.format( AV53DDO_Inc_HoraAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_inc_horaauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_inc_horaauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WPIncidencias2.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 114 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startFM2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
         }
         Form.getMeta().addItem("description", httpContext.getMessage( " Control de Incidencias", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupFM0( ) ;
   }

   public void wsFM2( )
   {
      startFM2( ) ;
      evtFM2( ) ;
   }

   public void evtFM2( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
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
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters1' */
                           e14FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters2' */
                           e15FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'REMOVEDYNAMICFILTERS3'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'RemoveDynamicFilters3' */
                           e16FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e17FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e18FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ADDDYNAMICFILTERS1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AddDynamicFilters1' */
                           e19FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR1.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e20FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'ADDDYNAMICFILTERS2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'AddDynamicFilters2' */
                           e21FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR2.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e22FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDYNAMICFILTERSSELECTOR3.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e23FM2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_114_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1142( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV74GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridActions), 4, 0));
                           A4929Inc_Dia = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtInc_Dia_Internalname), 0)) ;
                           A4931Inc_Linea = localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A4932Inc_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtInc_Hora_Internalname), 0)) ;
                           A4935Inc_Prog = httpContext.cgiGet( edtInc_Prog_Internalname) ;
                           A4934Inc_Termin = httpContext.cgiGet( edtInc_Termin_Internalname) ;
                           A4933Inc_Usuari = GXutil.upper( httpContext.cgiGet( edtInc_Usuari_Internalname)) ;
                           AV66Inc_obsTxt = httpContext.cgiGet( edtavInc_obstxt_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInc_obstxt_Internalname, AV66Inc_obsTxt);
                           AV69Inc_Hdr = httpContext.cgiGet( edtavInc_hdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavInc_hdr_Internalname, AV69Inc_Hdr);
                           A4936Inc_Obs = httpContext.cgiGet( edtInc_Obs_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e24FM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e25FM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e26FM2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Dynamicfiltersselector1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR1"), AV16DynamicFiltersSelector1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator1 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV17DynamicFiltersOperator1 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_num_ult1 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vINC_NUM_ULT1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV18Inc_Num_ult1 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Emprnom1 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vEMPRNOM1"), AV19EmprNom1) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR2"), AV21DynamicFiltersSelector2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator2 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV22DynamicFiltersOperator2 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_num_ult2 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vINC_NUM_ULT2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23Inc_Num_ult2 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Emprnom2 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vEMPRNOM2"), AV24EmprNom2) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersselector3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR3"), AV26DynamicFiltersSelector3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Dynamicfiltersoperator3 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV27DynamicFiltersOperator3 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Inc_num_ult3 Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vINC_NUM_ULT3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV28Inc_Num_ult3 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Emprnom3 Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vEMPRNOM3"), AV29EmprNom3) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                           }
                           else
                           {
                           }
                        }
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weFM2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            if ( nGXWrapped == 1 )
            {
               renderHtmlCloseForm( ) ;
            }
         }
      }
   }

   public void paFM2( )
   {
      if ( nDonePA == 0 )
      {
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
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1142( ) ;
      while ( nGXsfl_114_idx <= nRC_GXsfl_114 )
      {
         sendrow_1142( ) ;
         nGXsfl_114_idx = ((subGrid_Islastpage==1)&&(nGXsfl_114_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_114_idx+1) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1142( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV16DynamicFiltersSelector1 ,
                                 short AV17DynamicFiltersOperator1 ,
                                 long AV18Inc_Num_ult1 ,
                                 String AV19EmprNom1 ,
                                 String AV21DynamicFiltersSelector2 ,
                                 short AV22DynamicFiltersOperator2 ,
                                 long AV23Inc_Num_ult2 ,
                                 String AV24EmprNom2 ,
                                 String AV26DynamicFiltersSelector3 ,
                                 short AV27DynamicFiltersOperator3 ,
                                 long AV28Inc_Num_ult3 ,
                                 String AV29EmprNom3 ,
                                 byte AV41ManageFiltersExecutionStep ,
                                 boolean AV20DynamicFiltersEnabled2 ,
                                 boolean AV25DynamicFiltersEnabled3 ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ,
                                 String AV78Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String AV73FilterFullText ,
                                 java.util.Date AV43TFInc_Dia ,
                                 long AV48TFInc_Linea ,
                                 long AV49TFInc_Linea_To ,
                                 java.util.Date AV51TFInc_Hora ,
                                 String AV56TFInc_Prog ,
                                 String AV57TFInc_Prog_Sel ,
                                 String AV59TFInc_Terminal ,
                                 String AV60TFInc_Terminal_Sel ,
                                 String AV62TFInc_Usuario ,
                                 String AV63TFInc_Usuario_Sel ,
                                 app.wwpbaseobjects.SdtWWPGridState AV10GridState ,
                                 boolean AV31DynamicFiltersIgnoreFirst ,
                                 boolean AV30DynamicFiltersRemoving ,
                                 String A4936Inc_Obs ,
                                 String A396EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e25FM2 ();
      GRID_nCurrentRecord = 0 ;
      rfFM2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WPIncidencias2");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wpincidencias2:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_DIA", getSecureSignedToken( "", A4929Inc_Dia));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_DIA", localUtil.format(A4929Inc_Dia, "99/99/99"));
   }

   public void clear_multi_value_controls( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         dynload_actions( ) ;
         before_start_formulas( ) ;
      }
   }

   public void fix_multi_value_controls( )
   {
      if ( cmbavDynamicfiltersselector1.getItemCount() > 0 )
      {
         AV16DynamicFiltersSelector1 = cmbavDynamicfiltersselector1.getValidValue(AV16DynamicFiltersSelector1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator1.getItemCount() > 0 )
      {
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( cmbavDynamicfiltersoperator1.getValidValue(GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersselector2.getItemCount() > 0 )
      {
         AV21DynamicFiltersSelector2 = cmbavDynamicfiltersselector2.getValidValue(AV21DynamicFiltersSelector2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersSelector2", AV21DynamicFiltersSelector2);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV21DynamicFiltersSelector2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator2.getItemCount() > 0 )
      {
         AV22DynamicFiltersOperator2 = (short)(GXutil.lval( cmbavDynamicfiltersoperator2.getValidValue(GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DynamicFiltersOperator2), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersselector3.getItemCount() > 0 )
      {
         AV26DynamicFiltersSelector3 = cmbavDynamicfiltersselector3.getValidValue(AV26DynamicFiltersSelector3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersSelector3", AV26DynamicFiltersSelector3);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV26DynamicFiltersSelector3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      }
      if ( cmbavDynamicfiltersoperator3.getItemCount() > 0 )
      {
         AV27DynamicFiltersOperator3 = (short)(GXutil.lval( cmbavDynamicfiltersoperator3.getValidValue(GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DynamicFiltersOperator3), 4, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_114_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfFM2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV78Pgmname = "WPIncidencias2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavInc_obstxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_obstxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_obstxt_Enabled), 5, 0), !bGXsfl_114_Refreshing);
      edtavInc_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr_Enabled), 5, 0), !bGXsfl_114_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rfFM2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(114) ;
      /* Execute user event: Refresh */
      e25FM2 ();
      nGXsfl_114_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1142( ) ;
      bGXsfl_114_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_1142( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV16DynamicFiltersSelector1 ,
                                              Short.valueOf(AV17DynamicFiltersOperator1) ,
                                              Long.valueOf(AV18Inc_Num_ult1) ,
                                              AV19EmprNom1 ,
                                              Boolean.valueOf(AV20DynamicFiltersEnabled2) ,
                                              AV21DynamicFiltersSelector2 ,
                                              Short.valueOf(AV22DynamicFiltersOperator2) ,
                                              Long.valueOf(AV23Inc_Num_ult2) ,
                                              AV24EmprNom2 ,
                                              Boolean.valueOf(AV25DynamicFiltersEnabled3) ,
                                              AV26DynamicFiltersSelector3 ,
                                              Short.valueOf(AV27DynamicFiltersOperator3) ,
                                              Long.valueOf(AV28Inc_Num_ult3) ,
                                              AV29EmprNom3 ,
                                              AV43TFInc_Dia ,
                                              Long.valueOf(A4930Inc_Num_ul) ,
                                              A407EmprNom ,
                                              A4929Inc_Dia ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV19EmprNom1 = GXutil.padr( GXutil.rtrim( AV19EmprNom1), 30, "%") ;
         lV19EmprNom1 = GXutil.padr( GXutil.rtrim( AV19EmprNom1), 30, "%") ;
         lV24EmprNom2 = GXutil.padr( GXutil.rtrim( AV24EmprNom2), 30, "%") ;
         lV24EmprNom2 = GXutil.padr( GXutil.rtrim( AV24EmprNom2), 30, "%") ;
         lV29EmprNom3 = GXutil.padr( GXutil.rtrim( AV29EmprNom3), 30, "%") ;
         lV29EmprNom3 = GXutil.padr( GXutil.rtrim( AV29EmprNom3), 30, "%") ;
         /* Using cursor H00FM2 */
         pr_default.execute(0, new Object[] {Long.valueOf(AV18Inc_Num_ult1), Long.valueOf(AV18Inc_Num_ult1), Long.valueOf(AV18Inc_Num_ult1), lV19EmprNom1, lV19EmprNom1, Long.valueOf(AV23Inc_Num_ult2), Long.valueOf(AV23Inc_Num_ult2), Long.valueOf(AV23Inc_Num_ult2), lV24EmprNom2, lV24EmprNom2, Long.valueOf(AV28Inc_Num_ult3), Long.valueOf(AV28Inc_Num_ult3), Long.valueOf(AV28Inc_Num_ult3), lV29EmprNom3, lV29EmprNom3, AV43TFInc_Dia, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_114_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1142( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A407EmprNom = H00FM2_A407EmprNom[0] ;
            n407EmprNom = H00FM2_n407EmprNom[0] ;
            A4930Inc_Num_ul = H00FM2_A4930Inc_Num_ul[0] ;
            n4930Inc_Num_ul = H00FM2_n4930Inc_Num_ul[0] ;
            A396EmprCod = H00FM2_A396EmprCod[0] ;
            A4929Inc_Dia = H00FM2_A4929Inc_Dia[0] ;
            A407EmprNom = H00FM2_A407EmprNom[0] ;
            n407EmprNom = H00FM2_n407EmprNom[0] ;
            e26FM2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(114) ;
         wbFM0( ) ;
      }
      bGXsfl_114_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesFM2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_INC_DIA"+"_"+sGXsfl_114_idx, getSecureSignedToken( sGXsfl_114_idx, A4929Inc_Dia));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV16DynamicFiltersSelector1 ,
                                           Short.valueOf(AV17DynamicFiltersOperator1) ,
                                           Long.valueOf(AV18Inc_Num_ult1) ,
                                           AV19EmprNom1 ,
                                           Boolean.valueOf(AV20DynamicFiltersEnabled2) ,
                                           AV21DynamicFiltersSelector2 ,
                                           Short.valueOf(AV22DynamicFiltersOperator2) ,
                                           Long.valueOf(AV23Inc_Num_ult2) ,
                                           AV24EmprNom2 ,
                                           Boolean.valueOf(AV25DynamicFiltersEnabled3) ,
                                           AV26DynamicFiltersSelector3 ,
                                           Short.valueOf(AV27DynamicFiltersOperator3) ,
                                           Long.valueOf(AV28Inc_Num_ult3) ,
                                           AV29EmprNom3 ,
                                           AV43TFInc_Dia ,
                                           Long.valueOf(A4930Inc_Num_ul) ,
                                           A407EmprNom ,
                                           A4929Inc_Dia ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV19EmprNom1 = GXutil.padr( GXutil.rtrim( AV19EmprNom1), 30, "%") ;
      lV19EmprNom1 = GXutil.padr( GXutil.rtrim( AV19EmprNom1), 30, "%") ;
      lV24EmprNom2 = GXutil.padr( GXutil.rtrim( AV24EmprNom2), 30, "%") ;
      lV24EmprNom2 = GXutil.padr( GXutil.rtrim( AV24EmprNom2), 30, "%") ;
      lV29EmprNom3 = GXutil.padr( GXutil.rtrim( AV29EmprNom3), 30, "%") ;
      lV29EmprNom3 = GXutil.padr( GXutil.rtrim( AV29EmprNom3), 30, "%") ;
      /* Using cursor H00FM3 */
      pr_default.execute(1, new Object[] {Long.valueOf(AV18Inc_Num_ult1), Long.valueOf(AV18Inc_Num_ult1), Long.valueOf(AV18Inc_Num_ult1), lV19EmprNom1, lV19EmprNom1, Long.valueOf(AV23Inc_Num_ult2), Long.valueOf(AV23Inc_Num_ult2), Long.valueOf(AV23Inc_Num_ult2), lV24EmprNom2, lV24EmprNom2, Long.valueOf(AV28Inc_Num_ult3), Long.valueOf(AV28Inc_Num_ult3), Long.valueOf(AV28Inc_Num_ult3), lV29EmprNom3, lV29EmprNom3, AV43TFInc_Dia});
      GRID_nRecordCount = H00FM3_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
   }

   public int subgrid_fnc_recordsperpage( )
   {
      if ( subGrid_Rows > 0 )
      {
         return subGrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV78Pgmname = "WPIncidencias2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV78Pgmname", AV78Pgmname);
      Gx_err = (short)(0) ;
      edtavInc_obstxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_obstxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_obstxt_Enabled), 5, 0), !bGXsfl_114_Refreshing);
      edtavInc_hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr_Enabled), 5, 0), !bGXsfl_114_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupFM0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e24FM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV65DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV36ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_114 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_114"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( "DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( "DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( "DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEHEADER_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV73FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73FilterFullText", AV73FilterFullText);
         cmbavDynamicfiltersselector1.setName( cmbavDynamicfiltersselector1.getInternalname() );
         cmbavDynamicfiltersselector1.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector1.getInternalname()) );
         AV16DynamicFiltersSelector1 = httpContext.cgiGet( cmbavDynamicfiltersselector1.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
         cmbavDynamicfiltersoperator1.setName( cmbavDynamicfiltersoperator1.getInternalname() );
         cmbavDynamicfiltersoperator1.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator1.getInternalname()) );
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator1.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINC_NUM_ULT1");
            GX_FocusControl = edtavInc_num_ult1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18Inc_Num_ult1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Inc_Num_ult1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Inc_Num_ult1), 10, 0));
         }
         else
         {
            AV18Inc_Num_ult1 = localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Inc_Num_ult1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Inc_Num_ult1), 10, 0));
         }
         AV19EmprNom1 = httpContext.cgiGet( edtavEmprnom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom1", AV19EmprNom1);
         cmbavDynamicfiltersselector2.setName( cmbavDynamicfiltersselector2.getInternalname() );
         cmbavDynamicfiltersselector2.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector2.getInternalname()) );
         AV21DynamicFiltersSelector2 = httpContext.cgiGet( cmbavDynamicfiltersselector2.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersSelector2", AV21DynamicFiltersSelector2);
         cmbavDynamicfiltersoperator2.setName( cmbavDynamicfiltersoperator2.getInternalname() );
         cmbavDynamicfiltersoperator2.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator2.getInternalname()) );
         AV22DynamicFiltersOperator2 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator2.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DynamicFiltersOperator2), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINC_NUM_ULT2");
            GX_FocusControl = edtavInc_num_ult2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23Inc_Num_ult2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Inc_Num_ult2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Inc_Num_ult2), 10, 0));
         }
         else
         {
            AV23Inc_Num_ult2 = localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Inc_Num_ult2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Inc_Num_ult2), 10, 0));
         }
         AV24EmprNom2 = httpContext.cgiGet( edtavEmprnom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24EmprNom2", AV24EmprNom2);
         cmbavDynamicfiltersselector3.setName( cmbavDynamicfiltersselector3.getInternalname() );
         cmbavDynamicfiltersselector3.setValue( httpContext.cgiGet( cmbavDynamicfiltersselector3.getInternalname()) );
         AV26DynamicFiltersSelector3 = httpContext.cgiGet( cmbavDynamicfiltersselector3.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersSelector3", AV26DynamicFiltersSelector3);
         cmbavDynamicfiltersoperator3.setName( cmbavDynamicfiltersoperator3.getInternalname() );
         cmbavDynamicfiltersoperator3.setValue( httpContext.cgiGet( cmbavDynamicfiltersoperator3.getInternalname()) );
         AV27DynamicFiltersOperator3 = (short)(GXutil.lval( httpContext.cgiGet( cmbavDynamicfiltersoperator3.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DynamicFiltersOperator3), 4, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINC_NUM_ULT3");
            GX_FocusControl = edtavInc_num_ult3_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28Inc_Num_ult3 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Inc_Num_ult3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Inc_Num_ult3), 10, 0));
         }
         else
         {
            AV28Inc_Num_ult3 = localUtil.ctol( httpContext.cgiGet( edtavInc_num_ult3_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Inc_Num_ult3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Inc_Num_ult3), 10, 0));
         }
         AV29EmprNom3 = httpContext.cgiGet( edtavEmprnom3_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29EmprNom3", AV29EmprNom3);
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Pgmname", AV78Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_inc_diaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_INC_DIAAUXDATE");
            GX_FocusControl = edtavDdo_inc_diaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV45DDO_Inc_DiaAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45DDO_Inc_DiaAuxDate", localUtil.format(AV45DDO_Inc_DiaAuxDate, "99/99/99"));
         }
         else
         {
            AV45DDO_Inc_DiaAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_inc_diaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45DDO_Inc_DiaAuxDate", localUtil.format(AV45DDO_Inc_DiaAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_inc_horaauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_INC_HORAAUXDATE");
            GX_FocusControl = edtavDdo_inc_horaauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV53DDO_Inc_HoraAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53DDO_Inc_HoraAuxDate", localUtil.format(AV53DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         else
         {
            AV53DDO_Inc_HoraAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_inc_horaauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53DDO_Inc_HoraAuxDate", localUtil.format(AV53DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WPIncidencias2");
         AV78Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV78Pgmname", AV78Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV78Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wpincidencias2:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR1"), AV16DynamicFiltersSelector1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV17DynamicFiltersOperator1 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vINC_NUM_ULT1"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV18Inc_Num_ult1 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vEMPRNOM1"), AV19EmprNom1) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR2"), AV21DynamicFiltersSelector2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV22DynamicFiltersOperator2 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vINC_NUM_ULT2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23Inc_Num_ult2 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vEMPRNOM2"), AV24EmprNom2) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vDYNAMICFILTERSSELECTOR3"), AV26DynamicFiltersSelector3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vDYNAMICFILTERSOPERATOR3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV27DynamicFiltersOperator3 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vINC_NUM_ULT3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV28Inc_Num_ult3 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vEMPRNOM3"), AV29EmprNom3) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e24FM2 ();
      if (returnInSub) return;
   }

   public void e24FM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpincidencias2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = AV80Emprcod ;
      GXv_char3[0] = AV81Emprnom ;
      GXv_char4[0] = AV82Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpincidencias2_impl.this.AV80Emprcod = GXv_char2[0] ;
      wpincidencias2_impl.this.AV81Emprnom = GXv_char3[0] ;
      wpincidencias2_impl.this.AV82Usurcod = GXv_char4[0] ;
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      lblJsdynamicfilters_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
      AV16DynamicFiltersSelector1 = "INC_NUM_ULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if (returnInSub) return;
      AV21DynamicFiltersSelector2 = "INC_NUM_ULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersSelector2", AV21DynamicFiltersSelector2);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if (returnInSub) return;
      AV26DynamicFiltersSelector3 = "INC_NUM_ULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersSelector3", AV26DynamicFiltersSelector3);
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if (returnInSub) return;
      imgAdddynamicfilters1_Jsonclick = GXutil.format( "WWPDynFilterShow_AL('%1', 2, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Jsonclick", imgAdddynamicfilters1_Jsonclick, true);
      imgRemovedynamicfilters1_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Jsonclick", imgRemovedynamicfilters1_Jsonclick, true);
      imgAdddynamicfilters2_Jsonclick = GXutil.format( "WWPDynFilterShow_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Jsonclick", imgAdddynamicfilters2_Jsonclick, true);
      imgRemovedynamicfilters2_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Jsonclick", imgRemovedynamicfilters2_Jsonclick, true);
      imgRemovedynamicfilters3_Jsonclick = GXutil.format( "WWPDynFilterHideLast_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters3_Internalname, "Jsonclick", imgRemovedynamicfilters3_Jsonclick, true);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Control de Incidencias", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV65DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV65DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e25FM2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      if ( AV41ManageFiltersExecutionStep == 1 )
      {
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV41ManageFiltersExecutionStep == 2 )
      {
         AV41ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      cmbavDynamicfiltersoperator1.removeAllItems();
      if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 )
      {
         cmbavDynamicfiltersoperator1.addItem("0", "<", (short)(0));
         cmbavDynamicfiltersoperator1.addItem("1", "=", (short)(0));
         cmbavDynamicfiltersoperator1.addItem("2", ">", (short)(0));
      }
      else if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "EMPRNOM") == 0 )
      {
         cmbavDynamicfiltersoperator1.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
         cmbavDynamicfiltersoperator1.addItem("1", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
      }
      if ( AV20DynamicFiltersEnabled2 )
      {
         cmbavDynamicfiltersoperator2.removeAllItems();
         if ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 )
         {
            cmbavDynamicfiltersoperator2.addItem("0", "<", (short)(0));
            cmbavDynamicfiltersoperator2.addItem("1", "=", (short)(0));
            cmbavDynamicfiltersoperator2.addItem("2", ">", (short)(0));
         }
         else if ( GXutil.strcmp(AV21DynamicFiltersSelector2, "EMPRNOM") == 0 )
         {
            cmbavDynamicfiltersoperator2.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
            cmbavDynamicfiltersoperator2.addItem("1", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
         }
         if ( AV25DynamicFiltersEnabled3 )
         {
            cmbavDynamicfiltersoperator3.removeAllItems();
            if ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 )
            {
               cmbavDynamicfiltersoperator3.addItem("0", "<", (short)(0));
               cmbavDynamicfiltersoperator3.addItem("1", "=", (short)(0));
               cmbavDynamicfiltersoperator3.addItem("2", ">", (short)(0));
            }
            else if ( GXutil.strcmp(AV26DynamicFiltersSelector3, "EMPRNOM") == 0 )
            {
               cmbavDynamicfiltersoperator3.addItem("0", httpContext.getMessage( "WWP_FilterContains", ""), (short)(0));
               cmbavDynamicfiltersoperator3.addItem("1", httpContext.getMessage( "WWP_FilterLike", ""), (short)(0));
            }
         }
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV38Session.getValue("WPIncidencias2ColumnsSelector"), "") != 0 )
      {
         AV34ColumnsSelectorXML = AV38Session.getValue("WPIncidencias2ColumnsSelector") ;
         AV36ColumnsSelector.fromxml(AV34ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S192 ();
         if (returnInSub) return;
      }
      edtInc_Dia_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Dia_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Dia_Visible), 5, 0), !bGXsfl_114_Refreshing);
      edtInc_Linea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Visible), 5, 0), !bGXsfl_114_Refreshing);
      edtInc_Hora_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hora_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hora_Visible), 5, 0), !bGXsfl_114_Refreshing);
      edtInc_Prog_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Prog_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Prog_Visible), 5, 0), !bGXsfl_114_Refreshing);
      edtInc_Termin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Termin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Termin_Visible), 5, 0), !bGXsfl_114_Refreshing);
      edtInc_Usuari_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Usuari_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Usuari_Visible), 5, 0), !bGXsfl_114_Refreshing);
      edtavInc_obstxt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_obstxt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_obstxt_Visible), 5, 0), !bGXsfl_114_Refreshing);
      edtavInc_hdr_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_hdr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_hdr_Visible), 5, 0), !bGXsfl_114_Refreshing);
      edtInc_Obs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV36ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Obs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Obs_Visible), 5, 0), !bGXsfl_114_Refreshing);
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e12FM2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Dia") == 0 )
         {
            AV43TFInc_Dia = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFInc_Dia", localUtil.format(AV43TFInc_Dia, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Linea") == 0 )
         {
            AV48TFInc_Linea = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFInc_Linea), 10, 0));
            AV49TFInc_Linea_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFInc_Linea_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Hora") == 0 )
         {
            AV51TFInc_Hora = GXutil.resetDate(localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Hora", localUtil.ttoc( AV51TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Prog") == 0 )
         {
            AV56TFInc_Prog = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFInc_Prog", AV56TFInc_Prog);
            AV57TFInc_Prog_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFInc_Prog_Sel", AV57TFInc_Prog_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Terminal") == 0 )
         {
            AV59TFInc_Terminal = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Terminal", AV59TFInc_Terminal);
            AV60TFInc_Terminal_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Terminal_Sel", AV60TFInc_Terminal_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Inc_Usuario") == 0 )
         {
            AV62TFInc_Usuario = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Usuario", AV62TFInc_Usuario);
            AV63TFInc_Usuario_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Usuario_Sel", AV63TFInc_Usuario_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e26FM2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      AV67Nlin = (short)(GXutil.gxmlines( A4936Inc_Obs, (short)(60))) ;
      AV75i = (short)(1) ;
      AV66Inc_obsTxt = " " ;
      httpContext.ajax_rsp_assign_attri("", false, edtavInc_obstxt_Internalname, AV66Inc_obsTxt);
      while ( AV75i <= AV67Nlin )
      {
         AV66Inc_obsTxt += GXutil.gxgetmli( A4936Inc_Obs, AV75i, (short)(60)) + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavInc_obstxt_Internalname, AV66Inc_obsTxt);
         AV75i = (short)(AV75i+1) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(114) ;
      }
      sendrow_1142( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_114_Refreshing )
      {
         httpContext.doAjaxLoad(114, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV74GridActions, 4, 0)) );
   }

   public void e13FM2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV34ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV36ColumnsSelector.fromJSonString(AV34ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WPIncidencias2ColumnsSelector", ((GXutil.strcmp("", AV34ColumnsSelectorXML)==0) ? "" : AV36ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e19FM2( )
   {
      /* 'AddDynamicFilters1' Routine */
      returnInSub = false ;
      AV20DynamicFiltersEnabled2 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersEnabled2", AV20DynamicFiltersEnabled2);
      imgAdddynamicfilters1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
      imgRemovedynamicfilters1_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_114_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e14FM2( )
   {
      /* 'RemoveDynamicFilters1' Routine */
      returnInSub = false ;
      AV30DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersRemoving", AV30DynamicFiltersRemoving);
      AV31DynamicFiltersIgnoreFirst = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31DynamicFiltersIgnoreFirst", AV31DynamicFiltersIgnoreFirst);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      AV30DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersRemoving", AV30DynamicFiltersRemoving);
      AV31DynamicFiltersIgnoreFirst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31DynamicFiltersIgnoreFirst", AV31DynamicFiltersIgnoreFirst);
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_114_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV21DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV26DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e20FM2( )
   {
      /* Dynamicfiltersselector1_Click Routine */
      returnInSub = false ;
      AV17DynamicFiltersOperator1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
   }

   public void e21FM2( )
   {
      /* 'AddDynamicFilters2' Routine */
      returnInSub = false ;
      AV25DynamicFiltersEnabled3 = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersEnabled3", AV25DynamicFiltersEnabled3);
      imgAdddynamicfilters2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
      imgRemovedynamicfilters2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_114_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e15FM2( )
   {
      /* 'RemoveDynamicFilters2' Routine */
      returnInSub = false ;
      AV30DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersRemoving", AV30DynamicFiltersRemoving);
      AV20DynamicFiltersEnabled2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersEnabled2", AV20DynamicFiltersEnabled2);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      AV30DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersRemoving", AV30DynamicFiltersRemoving);
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_114_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV21DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV26DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e22FM2( )
   {
      /* Dynamicfiltersselector2_Click Routine */
      returnInSub = false ;
      AV22DynamicFiltersOperator2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DynamicFiltersOperator2), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
   }

   public void e16FM2( )
   {
      /* 'RemoveDynamicFilters3' Routine */
      returnInSub = false ;
      AV30DynamicFiltersRemoving = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersRemoving", AV30DynamicFiltersRemoving);
      AV25DynamicFiltersEnabled3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersEnabled3", AV25DynamicFiltersEnabled3);
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
      AV30DynamicFiltersRemoving = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30DynamicFiltersRemoving", AV30DynamicFiltersRemoving);
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_114_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid_refresh( subGrid_Rows, AV16DynamicFiltersSelector1, AV17DynamicFiltersOperator1, AV18Inc_Num_ult1, AV19EmprNom1, AV21DynamicFiltersSelector2, AV22DynamicFiltersOperator2, AV23Inc_Num_ult2, AV24EmprNom2, AV26DynamicFiltersSelector3, AV27DynamicFiltersOperator3, AV28Inc_Num_ult3, AV29EmprNom3, AV41ManageFiltersExecutionStep, AV20DynamicFiltersEnabled2, AV25DynamicFiltersEnabled3, AV36ColumnsSelector, AV78Pgmname, AV13OrderedBy, AV14OrderedDsc, AV73FilterFullText, AV43TFInc_Dia, AV48TFInc_Linea, AV49TFInc_Linea_To, AV51TFInc_Hora, AV56TFInc_Prog, AV57TFInc_Prog_Sel, AV59TFInc_Terminal, AV60TFInc_Terminal_Sel, AV62TFInc_Usuario, AV63TFInc_Usuario_Sel, AV10GridState, AV31DynamicFiltersIgnoreFirst, AV30DynamicFiltersRemoving, A4936Inc_Obs, A396EmprCod) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV21DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV26DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e23FM2( )
   {
      /* Dynamicfiltersselector3_Click Routine */
      returnInSub = false ;
      AV27DynamicFiltersOperator3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DynamicFiltersOperator3), 4, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e11FM2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S232 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S182 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WPIncidencias2Filters")),GXutil.URLEncode(GXutil.rtrim(AV78Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WPIncidencias2Filters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV41ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41ManageFiltersExecutionStep", GXutil.str( AV41ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV40ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WPIncidencias2Filters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wpincidencias2_impl.this.GXt_char1 = GXv_char4[0] ;
         AV40ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV40ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S232 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV40ManageFiltersXml) ;
            AV10GridState.fromxml(AV40ManageFiltersXml, null, null);
            AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
            AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S172 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S242 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
            S222 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV21DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV26DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ColumnsSelector", AV36ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e17FM2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      GXv_char4[0] = AV32ExcelFilename ;
      GXv_char3[0] = AV33ErrorMessage ;
      new app.wpincidencias2export(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wpincidencias2_impl.this.AV32ExcelFilename = GXv_char4[0] ;
      wpincidencias2_impl.this.AV33ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV32ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV32ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV33ErrorMessage);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV21DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV26DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void e18FM2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.wpincidencias2exportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
      cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV21DynamicFiltersSelector2) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
      cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV26DynamicFiltersSelector3) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
      cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
   }

   public void S172( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S192( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV36ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Dia", "", "Dia", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Linea", "", "#", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Hora", "", "Hora", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Prog", "", "Programa", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Terminal", "", "Terminal", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Usuario", "", "Usuario", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Inc_obsTxt", "", "Texto Obs", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "&Inc_Hdr", "", "Hdr", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV36ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "Inc_Obs", "", "Observación", true, "") ;
      AV36ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV35UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WPIncidencias2ColumnsSelector", GXv_char4) ;
      wpincidencias2_impl.this.GXt_char1 = GXv_char4[0] ;
      AV35UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV35UserCustomValue)==0) ) )
      {
         AV37ColumnsSelectorAux.fromxml(AV35UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV37ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV36ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV37ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV36ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S122( )
   {
      /* 'ENABLEDYNAMICFILTERS1' Routine */
      returnInSub = false ;
      edtavInc_num_ult1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_num_ult1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_num_ult1_Visible), 5, 0), true);
      edtavEmprnom1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom1_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator1.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 )
      {
         edtavInc_num_ult1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_num_ult1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_num_ult1_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "EMPRNOM") == 0 )
      {
         edtavEmprnom1_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom1_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator1.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator1.getVisible(), 5, 0), true);
      }
   }

   public void S132( )
   {
      /* 'ENABLEDYNAMICFILTERS2' Routine */
      returnInSub = false ;
      edtavInc_num_ult2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_num_ult2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_num_ult2_Visible), 5, 0), true);
      edtavEmprnom2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom2_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator2.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 )
      {
         edtavInc_num_ult2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_num_ult2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_num_ult2_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV21DynamicFiltersSelector2, "EMPRNOM") == 0 )
      {
         edtavEmprnom2_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom2_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator2.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator2.getVisible(), 5, 0), true);
      }
   }

   public void S142( )
   {
      /* 'ENABLEDYNAMICFILTERS3' Routine */
      returnInSub = false ;
      edtavInc_num_ult3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInc_num_ult3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_num_ult3_Visible), 5, 0), true);
      edtavEmprnom3_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom3_Visible), 5, 0), true);
      cmbavDynamicfiltersoperator3.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      if ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 )
      {
         edtavInc_num_ult3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavInc_num_ult3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInc_num_ult3_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      }
      else if ( GXutil.strcmp(AV26DynamicFiltersSelector3, "EMPRNOM") == 0 )
      {
         edtavEmprnom3_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavEmprnom3_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEmprnom3_Visible), 5, 0), true);
         cmbavDynamicfiltersoperator3.setVisible( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Visible", GXutil.ltrimstr( cmbavDynamicfiltersoperator3.getVisible(), 5, 0), true);
      }
   }

   public void S212( )
   {
      /* 'RESETDYNFILTERS' Routine */
      returnInSub = false ;
      AV20DynamicFiltersEnabled2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersEnabled2", AV20DynamicFiltersEnabled2);
      AV21DynamicFiltersSelector2 = "INC_NUM_ULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersSelector2", AV21DynamicFiltersSelector2);
      AV22DynamicFiltersOperator2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DynamicFiltersOperator2), 4, 0));
      AV23Inc_Num_ult2 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Inc_Num_ult2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Inc_Num_ult2), 10, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
      S132 ();
      if (returnInSub) return;
      AV25DynamicFiltersEnabled3 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersEnabled3", AV25DynamicFiltersEnabled3);
      AV26DynamicFiltersSelector3 = "INC_NUM_ULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersSelector3", AV26DynamicFiltersSelector3);
      AV27DynamicFiltersOperator3 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DynamicFiltersOperator3), 4, 0));
      AV28Inc_Num_ult3 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Inc_Num_ult3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Inc_Num_ult3), 10, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
      S142 ();
      if (returnInSub) return;
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV39ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WPIncidencias2Filters", "WWPDynFilterHideAll_AL('%1', 3, 0)", divTabledynamicfilters_Internalname, false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S232( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV73FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73FilterFullText", AV73FilterFullText);
      AV43TFInc_Dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43TFInc_Dia", localUtil.format(AV43TFInc_Dia, "99/99/99"));
      AV48TFInc_Linea = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFInc_Linea), 10, 0));
      AV49TFInc_Linea_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFInc_Linea_To), 10, 0));
      AV51TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Hora", localUtil.ttoc( AV51TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV56TFInc_Prog = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56TFInc_Prog", AV56TFInc_Prog);
      AV57TFInc_Prog_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TFInc_Prog_Sel", AV57TFInc_Prog_Sel);
      AV59TFInc_Terminal = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Terminal", AV59TFInc_Terminal);
      AV60TFInc_Terminal_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Terminal_Sel", AV60TFInc_Terminal_Sel);
      AV62TFInc_Usuario = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Usuario", AV62TFInc_Usuario);
      AV63TFInc_Usuario_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Usuario_Sel", AV63TFInc_Usuario_Sel);
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      AV16DynamicFiltersSelector1 = "INC_NUM_ULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      AV17DynamicFiltersOperator1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      AV18Inc_Num_ult1 = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Inc_Num_ult1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Inc_Num_ult1), 10, 0));
      /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'RESETDYNFILTERS' */
      S212 ();
      if (returnInSub) return;
      AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().clear();
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
   }

   public void S252( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tcrtinc", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(A4929Inc_Dia))}, new String[] {"Mode","EmprCod","Inc_Dia"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S262( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tcrtinc", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(A4929Inc_Dia))}, new String[] {"Mode","EmprCod","Inc_Dia"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S162( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV38Session.getValue(AV78Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV78Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV38Session.getValue(AV78Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S172 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S242 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADDYNFILTERSSTATE' */
      S222 ();
      if (returnInSub) return;
   }

   public void S242( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV73FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73FilterFullText", AV73FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_DIA") == 0 )
         {
            AV43TFInc_Dia = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFInc_Dia", localUtil.format(AV43TFInc_Dia, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_LINEA") == 0 )
         {
            AV48TFInc_Linea = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFInc_Linea", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFInc_Linea), 10, 0));
            AV49TFInc_Linea_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFInc_Linea_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFInc_Linea_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_HORA") == 0 )
         {
            AV51TFInc_Hora = GXutil.resetDate(localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFInc_Hora", localUtil.ttoc( AV51TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV53DDO_Inc_HoraAuxDate = GXutil.resetTime(AV51TFInc_Hora) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53DDO_Inc_HoraAuxDate", localUtil.format(AV53DDO_Inc_HoraAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG") == 0 )
         {
            AV56TFInc_Prog = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFInc_Prog", AV56TFInc_Prog);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_PROG_SEL") == 0 )
         {
            AV57TFInc_Prog_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFInc_Prog_Sel", AV57TFInc_Prog_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL") == 0 )
         {
            AV59TFInc_Terminal = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFInc_Terminal", AV59TFInc_Terminal);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_TERMINAL_SEL") == 0 )
         {
            AV60TFInc_Terminal_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFInc_Terminal_Sel", AV60TFInc_Terminal_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO") == 0 )
         {
            AV62TFInc_Usuario = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFInc_Usuario", AV62TFInc_Usuario);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFINC_USUARIO_SEL") == 0 )
         {
            AV63TFInc_Usuario_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFInc_Usuario_Sel", AV63TFInc_Usuario_Sel);
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFInc_Prog_Sel)==0), AV57TFInc_Prog_Sel, GXv_char4) ;
      wpincidencias2_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFInc_Terminal_Sel)==0), AV60TFInc_Terminal_Sel, GXv_char3) ;
      wpincidencias2_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFInc_Usuario_Sel)==0), AV63TFInc_Usuario_Sel, GXv_char2) ;
      wpincidencias2_impl.this.GXt_char13 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFInc_Prog)==0), AV56TFInc_Prog, GXv_char4) ;
      wpincidencias2_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFInc_Terminal)==0), AV59TFInc_Terminal, GXv_char3) ;
      wpincidencias2_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFInc_Usuario)==0), AV62TFInc_Usuario, GXv_char2) ;
      wpincidencias2_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFInc_Dia)) ? "" : localUtil.dtoc( AV43TFInc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV48TFInc_Linea) ? "" : GXutil.str( AV48TFInc_Linea, 10, 0))+"|"+(GXutil.dateCompare(GXutil.nullDate(), AV51TFInc_Hora) ? "" : localUtil.dtoc( AV53DDO_Inc_HoraAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV49TFInc_Linea_To) ? "" : GXutil.str( AV49TFInc_Linea_To, 10, 0))+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S222( )
   {
      /* 'LOADDYNFILTERSSTATE' Routine */
      returnInSub = false ;
      imgAdddynamicfilters1_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
      imgRemovedynamicfilters1_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
      imgAdddynamicfilters2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
      imgRemovedynamicfilters2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
      if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 1 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+1));
         AV16DynamicFiltersSelector1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
         if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 )
         {
            AV17DynamicFiltersOperator1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
            AV18Inc_Num_ult1 = GXutil.lval( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Inc_Num_ult1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Inc_Num_ult1), 10, 0));
         }
         else if ( GXutil.strcmp(AV16DynamicFiltersSelector1, "EMPRNOM") == 0 )
         {
            AV17DynamicFiltersOperator1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
            AV19EmprNom1 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19EmprNom1", AV19EmprNom1);
         }
         /* Execute user subroutine: 'ENABLEDYNAMICFILTERS1' */
         S122 ();
         if (returnInSub) return;
         if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 2 )
         {
            lblJsdynamicfilters_Caption = "<script type=\"text/javascript\">$(document).ready(function() {" ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
            lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+GXutil.format( "WWPDynFilterShow_AL('%1', 2, 0);", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
            imgAdddynamicfilters1_Visible = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters1_Visible), 5, 0), true);
            imgRemovedynamicfilters1_Visible = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters1_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters1_Visible), 5, 0), true);
            AV20DynamicFiltersEnabled2 = true ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20DynamicFiltersEnabled2", AV20DynamicFiltersEnabled2);
            AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+2));
            AV21DynamicFiltersSelector2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersSelector2", AV21DynamicFiltersSelector2);
            if ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 )
            {
               AV22DynamicFiltersOperator2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DynamicFiltersOperator2), 4, 0));
               AV23Inc_Num_ult2 = GXutil.lval( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23Inc_Num_ult2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Inc_Num_ult2), 10, 0));
            }
            else if ( GXutil.strcmp(AV21DynamicFiltersSelector2, "EMPRNOM") == 0 )
            {
               AV22DynamicFiltersOperator2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DynamicFiltersOperator2), 4, 0));
               AV24EmprNom2 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24EmprNom2", AV24EmprNom2);
            }
            /* Execute user subroutine: 'ENABLEDYNAMICFILTERS2' */
            S132 ();
            if (returnInSub) return;
            if ( AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().size() >= 3 )
            {
               lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+GXutil.format( "WWPDynFilterShow_AL('%1', 3, 0);", divTabledynamicfilters_Internalname, "", "", "", "", "", "", "", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
               imgAdddynamicfilters2_Visible = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, imgAdddynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgAdddynamicfilters2_Visible), 5, 0), true);
               imgRemovedynamicfilters2_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, imgRemovedynamicfilters2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(imgRemovedynamicfilters2_Visible), 5, 0), true);
               AV25DynamicFiltersEnabled3 = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25DynamicFiltersEnabled3", AV25DynamicFiltersEnabled3);
               AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)((app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().elementAt(-1+3));
               AV26DynamicFiltersSelector3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Selected() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersSelector3", AV26DynamicFiltersSelector3);
               if ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 )
               {
                  AV27DynamicFiltersOperator3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DynamicFiltersOperator3), 4, 0));
                  AV28Inc_Num_ult3 = GXutil.lval( AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value()) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28Inc_Num_ult3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Inc_Num_ult3), 10, 0));
               }
               else if ( GXutil.strcmp(AV26DynamicFiltersSelector3, "EMPRNOM") == 0 )
               {
                  AV27DynamicFiltersOperator3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Operator() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DynamicFiltersOperator3), 4, 0));
                  AV29EmprNom3 = AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value() ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV29EmprNom3", AV29EmprNom3);
               }
               /* Execute user subroutine: 'ENABLEDYNAMICFILTERS3' */
               S142 ();
               if (returnInSub) return;
            }
            lblJsdynamicfilters_Caption = lblJsdynamicfilters_Caption+"});</script>" ;
            httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
         }
      }
      if ( AV30DynamicFiltersRemoving )
      {
         lblJsdynamicfilters_Caption = "" ;
         httpContext.ajax_rsp_assign_prop("", false, lblJsdynamicfilters_Internalname, "Caption", lblJsdynamicfilters_Caption, true);
      }
   }

   public void S182( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV38Session.getValue(AV78Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV73FilterFullText)==0), (short)(0), AV73FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFINC_DIA", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFInc_Dia)), (short)(0), GXutil.trim( localUtil.dtoc( AV43TFInc_Dia, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFINC_LINEA", "", !((0==AV48TFInc_Linea)&&(0==AV49TFInc_Linea_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFInc_Linea, 10, 0)), GXutil.trim( GXutil.str( AV49TFInc_Linea_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFINC_HORA", "", !GXutil.dateCompare(GXutil.nullDate(), AV51TFInc_Hora), (short)(0), GXutil.trim( localUtil.ttoc( AV51TFInc_Hora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFINC_PROG", "", !(GXutil.strcmp("", AV56TFInc_Prog)==0), (short)(0), AV56TFInc_Prog, "", !(GXutil.strcmp("", AV57TFInc_Prog_Sel)==0), AV57TFInc_Prog_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFINC_TERMINAL", "", !(GXutil.strcmp("", AV59TFInc_Terminal)==0), (short)(0), AV59TFInc_Terminal, "", !(GXutil.strcmp("", AV60TFInc_Terminal_Sel)==0), AV60TFInc_Terminal_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFINC_USUARIO", "", !(GXutil.strcmp("", AV62TFInc_Usuario)==0), (short)(0), AV62TFInc_Usuario, "", !(GXutil.strcmp("", AV63TFInc_Usuario_Sel)==0), AV63TFInc_Usuario_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      /* Execute user subroutine: 'SAVEDYNFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV78Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S202( )
   {
      /* 'SAVEDYNFILTERSSTATE' Routine */
      returnInSub = false ;
      AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().clear();
      if ( ! AV31DynamicFiltersIgnoreFirst )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV16DynamicFiltersSelector1 );
         if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ! (0==AV18Inc_Num_ult1) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( GXutil.str( AV18Inc_Num_ult1, 10, 0) );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV17DynamicFiltersOperator1 );
         }
         else if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ! (GXutil.strcmp("", AV19EmprNom1)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV19EmprNom1 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV17DynamicFiltersOperator1 );
         }
         if ( AV30DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
      if ( AV20DynamicFiltersEnabled2 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV21DynamicFiltersSelector2 );
         if ( ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ! (0==AV23Inc_Num_ult2) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( GXutil.str( AV23Inc_Num_ult2, 10, 0) );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV22DynamicFiltersOperator2 );
         }
         else if ( ( GXutil.strcmp(AV21DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ! (GXutil.strcmp("", AV24EmprNom2)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV24EmprNom2 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV22DynamicFiltersOperator2 );
         }
         if ( AV30DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
      if ( AV25DynamicFiltersEnabled3 )
      {
         AV12GridStateDynamicFilter = (app.wwpbaseobjects.SdtWWPGridState_DynamicFilter)new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
         AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Selected( AV26DynamicFiltersSelector3 );
         if ( ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ! (0==AV28Inc_Num_ult3) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( GXutil.str( AV28Inc_Num_ult3, 10, 0) );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV27DynamicFiltersOperator3 );
         }
         else if ( ( GXutil.strcmp(AV26DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ! (GXutil.strcmp("", AV29EmprNom3)==0) )
         {
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Value( AV29EmprNom3 );
            AV12GridStateDynamicFilter.setgxTv_SdtWWPGridState_DynamicFilter_Operator( AV27DynamicFiltersOperator3 );
         }
         if ( AV30DynamicFiltersRemoving || ! (GXutil.strcmp("", AV12GridStateDynamicFilter.getgxTv_SdtWWPGridState_DynamicFilter_Value())==0) )
         {
            AV10GridState.getgxTv_SdtWWPGridState_Dynamicfilters().add(AV12GridStateDynamicFilter, 0);
         }
      }
   }

   public void S152( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV78Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TCRTINC" );
      AV38Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_FM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV39ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_FM2( true) ;
      }
      else
      {
         wb_table2_28_FM2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_FM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_FM2e( true) ;
      }
      else
      {
         wb_table1_23_FM2e( false) ;
      }
   }

   public void wb_table2_28_FM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV73FilterFullText, GXutil.rtrim( localUtil.format( AV73FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfilters_Internalname, 1, 0, "px", 0, "px", "TableDynamicFilters", "left", "top", " "+"data-gx-flex"+" ", "flex-direction:column;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DynRowVisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix1_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector1.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector1, cmbavDynamicfiltersselector1.getInternalname(), GXutil.rtrim( AV16DynamicFiltersSelector1), 1, cmbavDynamicfiltersselector1.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR1.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "", true, (byte)(0), "HLP_WPIncidencias2.htm");
         cmbavDynamicfiltersselector1.setValue( GXutil.rtrim( AV16DynamicFiltersSelector1) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector1.getInternalname(), "Values", cmbavDynamicfiltersselector1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle1_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         wb_table3_46_FM2( true) ;
      }
      else
      {
         wb_table3_46_FM2( false) ;
      }
      return  ;
   }

   public void wb_table3_46_FM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix2_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector2.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector2, cmbavDynamicfiltersselector2.getInternalname(), GXutil.rtrim( AV21DynamicFiltersSelector2), 1, cmbavDynamicfiltersselector2.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR2.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "", true, (byte)(0), "HLP_WPIncidencias2.htm");
         cmbavDynamicfiltersselector2.setValue( GXutil.rtrim( AV21DynamicFiltersSelector2) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector2.getInternalname(), "Values", cmbavDynamicfiltersselector2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle2_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         wb_table4_71_FM2( true) ;
      }
      else
      {
         wb_table4_71_FM2( false) ;
      }
      return  ;
   }

   public void wb_table4_71_FM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledynamicfiltersrow3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersprefix3_Internalname, httpContext.getMessage( "WWP_DynFilterPrefix", ""), "", "", lblDynamicfiltersprefix3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescriptionPrefix", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersselector3.getInternalname(), httpContext.getMessage( "Dynamic Filters Selector3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersselector3, cmbavDynamicfiltersselector3.getInternalname(), GXutil.rtrim( AV26DynamicFiltersSelector3), 1, cmbavDynamicfiltersselector3.getJsonclick(), 5, "'"+""+"'"+",false,"+"'"+"EVDYNAMICFILTERSSELECTOR3.CLICK."+"'", "svchar", "", 1, cmbavDynamicfiltersselector3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,92);\"", "", true, (byte)(0), "HLP_WPIncidencias2.htm");
         cmbavDynamicfiltersselector3.setValue( GXutil.rtrim( AV26DynamicFiltersSelector3) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersselector3.getInternalname(), "Values", cmbavDynamicfiltersselector3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblDynamicfiltersmiddle3_Internalname, httpContext.getMessage( "WWP_DynFilterMiddle", ""), "", "", lblDynamicfiltersmiddle3_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "flex-grow:1;", "div");
         wb_table5_96_FM2( true) ;
      }
      else
      {
         wb_table5_96_FM2( false) ;
      }
      return  ;
   }

   public void wb_table5_96_FM2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_FM2e( true) ;
      }
      else
      {
         wb_table2_28_FM2e( false) ;
      }
   }

   public void wb_table5_96_FM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters3_Internalname, tblTablemergeddynamicfilters3_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator3.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator3, cmbavDynamicfiltersoperator3.getInternalname(), GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)), 1, cmbavDynamicfiltersoperator3.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator3.getVisible(), cmbavDynamicfiltersoperator3.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,100);\"", "", true, (byte)(0), "HLP_WPIncidencias2.htm");
         cmbavDynamicfiltersoperator3.setValue( GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator3.getInternalname(), "Values", cmbavDynamicfiltersoperator3.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_num_ult3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_num_ult3_Internalname, httpContext.getMessage( "Inc_Num_ult3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_num_ult3_Internalname, GXutil.ltrim( localUtil.ntoc( AV28Inc_Num_ult3, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavInc_num_ult3_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28Inc_Num_ult3), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28Inc_Num_ult3), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_num_ult3_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_num_ult3_Visible, edtavInc_num_ult3_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_emprnom3_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprnom3_Internalname, httpContext.getMessage( "Empr Nom3", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprnom3_Internalname, GXutil.rtrim( AV29EmprNom3), GXutil.rtrim( localUtil.format( AV29EmprNom3, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprnom3_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprnom3_Visible, edtavEmprnom3_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter3_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters3_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters3_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters3_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters3_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS3\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias2.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_96_FM2e( true) ;
      }
      else
      {
         wb_table5_96_FM2e( false) ;
      }
   }

   public void wb_table4_71_FM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters2_Internalname, tblTablemergeddynamicfilters2_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator2.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator2, cmbavDynamicfiltersoperator2.getInternalname(), GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)), 1, cmbavDynamicfiltersoperator2.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator2.getVisible(), cmbavDynamicfiltersoperator2.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,75);\"", "", true, (byte)(0), "HLP_WPIncidencias2.htm");
         cmbavDynamicfiltersoperator2.setValue( GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator2.getInternalname(), "Values", cmbavDynamicfiltersoperator2.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_num_ult2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_num_ult2_Internalname, httpContext.getMessage( "Inc_Num_ult2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_num_ult2_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Inc_Num_ult2, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavInc_num_ult2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23Inc_Num_ult2), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23Inc_Num_ult2), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_num_ult2_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_num_ult2_Visible, edtavInc_num_ult2_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_emprnom2_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprnom2_Internalname, httpContext.getMessage( "Empr Nom2", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprnom2_Internalname, GXutil.rtrim( AV24EmprNom2), GXutil.rtrim( localUtil.format( AV24EmprNom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprnom2_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprnom2_Visible, edtavEmprnom2_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_addfilter2_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgAdddynamicfilters2_gximage, "")==0) ? "GX_Image_ActionNewDynamicFilter_Class" : "GX_Image_"+imgAdddynamicfilters2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "27283ea5-332f-423b-b880-64b762622df3", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgAdddynamicfilters2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAdddynamicfilters2_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterAddTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgAdddynamicfilters2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ADDDYNAMICFILTERS2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias2.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter2_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 85,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters2_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters2_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters2_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgRemovedynamicfilters2_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters2_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS2\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias2.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_71_FM2e( true) ;
      }
      else
      {
         wb_table4_71_FM2e( false) ;
      }
   }

   public void wb_table3_46_FM2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergeddynamicfilters1_Internalname, tblTablemergeddynamicfilters1_Internalname, "", "Table", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavDynamicfiltersoperator1.getInternalname(), httpContext.getMessage( "Dynamic Filters Operator1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavDynamicfiltersoperator1, cmbavDynamicfiltersoperator1.getInternalname(), GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)), 1, cmbavDynamicfiltersoperator1.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavDynamicfiltersoperator1.getVisible(), cmbavDynamicfiltersoperator1.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "", true, (byte)(0), "HLP_WPIncidencias2.htm");
         cmbavDynamicfiltersoperator1.setValue( GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavDynamicfiltersoperator1.getInternalname(), "Values", cmbavDynamicfiltersoperator1.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_inc_num_ult1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInc_num_ult1_Internalname, httpContext.getMessage( "Inc_Num_ult1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInc_num_ult1_Internalname, GXutil.ltrim( localUtil.ntoc( AV18Inc_Num_ult1, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavInc_num_ult1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18Inc_Num_ult1), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18Inc_Num_ult1), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInc_num_ult1_Jsonclick, 0, "Attribute", "", "", "", "", edtavInc_num_ult1_Visible, edtavInc_num_ult1_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellFilter_emprnom1_cell_Internalname+"\"  class=''>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavEmprnom1_Internalname, httpContext.getMessage( "Empr Nom1", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'" + sGXsfl_114_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavEmprnom1_Internalname, GXutil.rtrim( AV19EmprNom1), GXutil.rtrim( localUtil.format( AV19EmprNom1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavEmprnom1_Jsonclick, 0, "Attribute", "", "", "", "", edtavEmprnom1_Visible, edtavEmprnom1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WPIncidencias2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_addfilter1_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgAdddynamicfilters1_gximage, "")==0) ? "GX_Image_ActionNewDynamicFilter_Class" : "GX_Image_"+imgAdddynamicfilters1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "27283ea5-332f-423b-b880-64b762622df3", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgAdddynamicfilters1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgAdddynamicfilters1_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterAddTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgAdddynamicfilters1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'ADDDYNAMICFILTERS1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias2.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td id=\""+cellDynamicfilters_removefilter1_cell_Internalname+"\"  class=''>") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "Image" + " " + ((GXutil.strcmp(imgRemovedynamicfilters1_gximage, "")==0) ? "GX_Image_ActionRemoveDynamicFilter_Class" : "GX_Image_"+imgRemovedynamicfilters1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "11a6ef14-1a5a-4077-91a2-f41ed9a3a662", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgRemovedynamicfilters1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), imgRemovedynamicfilters1_Visible, 1, "", httpContext.getMessage( "WWP_DynFilterRemoveTooltip", ""), 0, 0, 0, "px", 0, "px", 0, 0, 5, imgRemovedynamicfilters1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'REMOVEDYNAMICFILTERS1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_WPIncidencias2.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_46_FM2e( true) ;
      }
      else
      {
         wb_table3_46_FM2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
   }

   public String getresponse( String sGXDynURL )
   {
      initialize_properties( ) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      sDynURL = sGXDynURL ;
      nGotPars = 1 ;
      nGXWrapped = 1 ;
      httpContext.setWrapped(true);
      paFM2( ) ;
      wsFM2( ) ;
      weFM2( ) ;
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
      httpContext.setWrapped(false);
      httpContext.GX_msglist = BackMsgLst ;
      String response = "";
      try
      {
         response = ((java.io.ByteArrayOutputStream) httpContext.getOutputStream()).toString("UTF8");
      }
      catch (java.io.UnsupportedEncodingException e)
      {
         Application.printWarning(e.getMessage(), e);
      }
      finally
      {
         httpContext.closeOutputStream();
      }
      return response;
   }

   public void responsestatic( String sGXDynURL )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116115855", true, true);
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
      httpContext.AddJavascriptSource("wpincidencias2.js", "?202682116115856", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1142( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_114_idx );
      edtInc_Dia_Internalname = "INC_DIA_"+sGXsfl_114_idx ;
      edtInc_Linea_Internalname = "INC_LINEA_"+sGXsfl_114_idx ;
      edtInc_Hora_Internalname = "INC_HORA_"+sGXsfl_114_idx ;
      edtInc_Prog_Internalname = "INC_PROG_"+sGXsfl_114_idx ;
      edtInc_Termin_Internalname = "INC_TERMIN_"+sGXsfl_114_idx ;
      edtInc_Usuari_Internalname = "INC_USUARI_"+sGXsfl_114_idx ;
      edtavInc_obstxt_Internalname = "vINC_OBSTXT_"+sGXsfl_114_idx ;
      edtavInc_hdr_Internalname = "vINC_HDR_"+sGXsfl_114_idx ;
      edtInc_Obs_Internalname = "INC_OBS_"+sGXsfl_114_idx ;
   }

   public void subsflControlProps_fel_1142( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_114_fel_idx );
      edtInc_Dia_Internalname = "INC_DIA_"+sGXsfl_114_fel_idx ;
      edtInc_Linea_Internalname = "INC_LINEA_"+sGXsfl_114_fel_idx ;
      edtInc_Hora_Internalname = "INC_HORA_"+sGXsfl_114_fel_idx ;
      edtInc_Prog_Internalname = "INC_PROG_"+sGXsfl_114_fel_idx ;
      edtInc_Termin_Internalname = "INC_TERMIN_"+sGXsfl_114_fel_idx ;
      edtInc_Usuari_Internalname = "INC_USUARI_"+sGXsfl_114_fel_idx ;
      edtavInc_obstxt_Internalname = "vINC_OBSTXT_"+sGXsfl_114_fel_idx ;
      edtavInc_hdr_Internalname = "vINC_HDR_"+sGXsfl_114_fel_idx ;
      edtInc_Obs_Internalname = "INC_OBS_"+sGXsfl_114_fel_idx ;
   }

   public void sendrow_1142( )
   {
      subsflControlProps_1142( ) ;
      wbFM0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_114_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
      {
         GridRow = GXWebRow.GetNew(context,GridContainer) ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid_Backstyle = (byte)(0) ;
            subGrid_Backcolor = subGrid_Allbackcolor ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Uniform" ;
            }
         }
         else if ( subGrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid_Class, "") != 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Odd" ;
            }
            subGrid_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_114_idx) % (2))) == 0 )
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Even" ;
               }
            }
            else
            {
               subGrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid_Class, "") != 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Odd" ;
               }
            }
         }
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_114_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 115,'',false,'"+sGXsfl_114_idx+"',114)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_114_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV74GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV74GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV74GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e27fm2_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,115);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV74GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_114_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Dia_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Dia_Internalname,localUtil.format(A4929Inc_Dia, "99/99/99"),localUtil.format( A4929Inc_Dia, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Dia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Dia_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Linea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Linea_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtInc_Hora_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Hora_Internalname,localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4932Inc_Hora, "99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Hora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Hora_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Prog_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Prog_Internalname,GXutil.rtrim( A4935Inc_Prog),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Prog_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Prog_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Termin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Termin_Internalname,GXutil.rtrim( A4934Inc_Termin),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Termin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Termin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Usuari_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Usuari_Internalname,GXutil.rtrim( A4933Inc_Usuari),GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Usuari_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Usuari_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInc_obstxt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavInc_obstxt_Enabled!=0)&&(edtavInc_obstxt_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 122,'',false,'"+sGXsfl_114_idx+"',114)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInc_obstxt_Internalname,AV66Inc_obsTxt,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInc_obstxt_Enabled!=0)&&(edtavInc_obstxt_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,122);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavInc_obstxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInc_obstxt_Visible),Integer.valueOf(edtavInc_obstxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavInc_hdr_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavInc_hdr_Enabled!=0)&&(edtavInc_hdr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 123,'',false,'"+sGXsfl_114_idx+"',114)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavInc_hdr_Internalname,GXutil.rtrim( AV69Inc_Hdr),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavInc_hdr_Enabled!=0)&&(edtavInc_hdr_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,123);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavInc_hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavInc_hdr_Visible),Integer.valueOf(edtavInc_hdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtInc_Obs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Obs_Internalname,A4936Inc_Obs,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtInc_Obs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(114),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesFM2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_114_idx = ((subGrid_Islastpage==1)&&(nGXsfl_114_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_114_idx+1) ;
         sGXsfl_114_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_114_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1142( ) ;
      }
      /* End function sendrow_1142 */
   }

   public void startgridcontrol114( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"114\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid_Backcolorstyle == 0 )
         {
            subGrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid_Class) > 0 )
            {
               subGrid_Linesclass = subGrid_Class+"Title" ;
            }
         }
         else
         {
            subGrid_Titlebackstyle = (byte)(1) ;
            if ( subGrid_Backcolorstyle == 1 )
            {
               subGrid_Titlebackcolor = subGrid_Allbackcolor ;
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid_Class) > 0 )
               {
                  subGrid_Linesclass = subGrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Dia_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Linea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Hora_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Prog_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Programa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Termin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Terminal", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Usuari_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInc_obstxt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Texto Obs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavInc_hdr_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtInc_Obs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observación", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV74GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A4929Inc_Dia, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Dia_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Linea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Hora_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4935Inc_Prog));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Prog_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4934Inc_Termin));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Termin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4933Inc_Usuari));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Usuari_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV66Inc_obsTxt);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInc_obstxt_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInc_obstxt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV69Inc_Hdr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavInc_hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavInc_hdr_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A4936Inc_Obs);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtInc_Obs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      lblDynamicfiltersprefix1_Internalname = "DYNAMICFILTERSPREFIX1" ;
      cmbavDynamicfiltersselector1.setInternalname( "vDYNAMICFILTERSSELECTOR1" );
      lblDynamicfiltersmiddle1_Internalname = "DYNAMICFILTERSMIDDLE1" ;
      cmbavDynamicfiltersoperator1.setInternalname( "vDYNAMICFILTERSOPERATOR1" );
      edtavInc_num_ult1_Internalname = "vINC_NUM_ULT1" ;
      cellFilter_inc_num_ult1_cell_Internalname = "FILTER_INC_NUM_ULT1_CELL" ;
      edtavEmprnom1_Internalname = "vEMPRNOM1" ;
      cellFilter_emprnom1_cell_Internalname = "FILTER_EMPRNOM1_CELL" ;
      imgAdddynamicfilters1_Internalname = "ADDDYNAMICFILTERS1" ;
      cellDynamicfilters_addfilter1_cell_Internalname = "DYNAMICFILTERS_ADDFILTER1_CELL" ;
      imgRemovedynamicfilters1_Internalname = "REMOVEDYNAMICFILTERS1" ;
      cellDynamicfilters_removefilter1_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER1_CELL" ;
      tblTablemergeddynamicfilters1_Internalname = "TABLEMERGEDDYNAMICFILTERS1" ;
      divTabledynamicfiltersrow1_Internalname = "TABLEDYNAMICFILTERSROW1" ;
      lblDynamicfiltersprefix2_Internalname = "DYNAMICFILTERSPREFIX2" ;
      cmbavDynamicfiltersselector2.setInternalname( "vDYNAMICFILTERSSELECTOR2" );
      lblDynamicfiltersmiddle2_Internalname = "DYNAMICFILTERSMIDDLE2" ;
      cmbavDynamicfiltersoperator2.setInternalname( "vDYNAMICFILTERSOPERATOR2" );
      edtavInc_num_ult2_Internalname = "vINC_NUM_ULT2" ;
      cellFilter_inc_num_ult2_cell_Internalname = "FILTER_INC_NUM_ULT2_CELL" ;
      edtavEmprnom2_Internalname = "vEMPRNOM2" ;
      cellFilter_emprnom2_cell_Internalname = "FILTER_EMPRNOM2_CELL" ;
      imgAdddynamicfilters2_Internalname = "ADDDYNAMICFILTERS2" ;
      cellDynamicfilters_addfilter2_cell_Internalname = "DYNAMICFILTERS_ADDFILTER2_CELL" ;
      imgRemovedynamicfilters2_Internalname = "REMOVEDYNAMICFILTERS2" ;
      cellDynamicfilters_removefilter2_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER2_CELL" ;
      tblTablemergeddynamicfilters2_Internalname = "TABLEMERGEDDYNAMICFILTERS2" ;
      divTabledynamicfiltersrow2_Internalname = "TABLEDYNAMICFILTERSROW2" ;
      lblDynamicfiltersprefix3_Internalname = "DYNAMICFILTERSPREFIX3" ;
      cmbavDynamicfiltersselector3.setInternalname( "vDYNAMICFILTERSSELECTOR3" );
      lblDynamicfiltersmiddle3_Internalname = "DYNAMICFILTERSMIDDLE3" ;
      cmbavDynamicfiltersoperator3.setInternalname( "vDYNAMICFILTERSOPERATOR3" );
      edtavInc_num_ult3_Internalname = "vINC_NUM_ULT3" ;
      cellFilter_inc_num_ult3_cell_Internalname = "FILTER_INC_NUM_ULT3_CELL" ;
      edtavEmprnom3_Internalname = "vEMPRNOM3" ;
      cellFilter_emprnom3_cell_Internalname = "FILTER_EMPRNOM3_CELL" ;
      imgRemovedynamicfilters3_Internalname = "REMOVEDYNAMICFILTERS3" ;
      cellDynamicfilters_removefilter3_cell_Internalname = "DYNAMICFILTERS_REMOVEFILTER3_CELL" ;
      tblTablemergeddynamicfilters3_Internalname = "TABLEMERGEDDYNAMICFILTERS3" ;
      divTabledynamicfiltersrow3_Internalname = "TABLEDYNAMICFILTERSROW3" ;
      divTabledynamicfilters_Internalname = "TABLEDYNAMICFILTERS" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtInc_Dia_Internalname = "INC_DIA" ;
      edtInc_Linea_Internalname = "INC_LINEA" ;
      edtInc_Hora_Internalname = "INC_HORA" ;
      edtInc_Prog_Internalname = "INC_PROG" ;
      edtInc_Termin_Internalname = "INC_TERMIN" ;
      edtInc_Usuari_Internalname = "INC_USUARI" ;
      edtavInc_obstxt_Internalname = "vINC_OBSTXT" ;
      edtavInc_hdr_Internalname = "vINC_HDR" ;
      edtInc_Obs_Internalname = "INC_OBS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      lblJsdynamicfilters_Internalname = "JSDYNAMICFILTERS" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_inc_diaauxdate_Internalname = "vDDO_INC_DIAAUXDATE" ;
      divDdo_inc_diaauxdates_Internalname = "DDO_INC_DIAAUXDATES" ;
      edtavDdo_inc_horaauxdate_Internalname = "vDDO_INC_HORAAUXDATE" ;
      divDdo_inc_horaauxdates_Internalname = "DDO_INC_HORAAUXDATES" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid_Internalname = "GRID" ;
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
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtInc_Obs_Jsonclick = "" ;
      edtavInc_hdr_Jsonclick = "" ;
      edtavInc_hdr_Enabled = 1 ;
      edtavInc_obstxt_Jsonclick = "" ;
      edtavInc_obstxt_Enabled = 1 ;
      edtInc_Usuari_Jsonclick = "" ;
      edtInc_Termin_Jsonclick = "" ;
      edtInc_Prog_Jsonclick = "" ;
      edtInc_Hora_Jsonclick = "" ;
      edtInc_Linea_Jsonclick = "" ;
      edtInc_Dia_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgRemovedynamicfilters1_Visible = 1 ;
      imgAdddynamicfilters1_Visible = 1 ;
      edtavEmprnom1_Jsonclick = "" ;
      edtavEmprnom1_Enabled = 1 ;
      edtavInc_num_ult1_Jsonclick = "" ;
      edtavInc_num_ult1_Enabled = 1 ;
      cmbavDynamicfiltersoperator1.setJsonclick( "" );
      cmbavDynamicfiltersoperator1.setEnabled( 1 );
      imgRemovedynamicfilters2_Visible = 1 ;
      imgAdddynamicfilters2_Visible = 1 ;
      edtavEmprnom2_Jsonclick = "" ;
      edtavEmprnom2_Enabled = 1 ;
      edtavInc_num_ult2_Jsonclick = "" ;
      edtavInc_num_ult2_Enabled = 1 ;
      cmbavDynamicfiltersoperator2.setJsonclick( "" );
      cmbavDynamicfiltersoperator2.setEnabled( 1 );
      edtavEmprnom3_Jsonclick = "" ;
      edtavEmprnom3_Enabled = 1 ;
      edtavInc_num_ult3_Jsonclick = "" ;
      edtavInc_num_ult3_Enabled = 1 ;
      cmbavDynamicfiltersoperator3.setJsonclick( "" );
      cmbavDynamicfiltersoperator3.setEnabled( 1 );
      cmbavDynamicfiltersselector3.setJsonclick( "" );
      cmbavDynamicfiltersselector3.setEnabled( 1 );
      cmbavDynamicfiltersselector2.setJsonclick( "" );
      cmbavDynamicfiltersselector2.setEnabled( 1 );
      cmbavDynamicfiltersselector1.setJsonclick( "" );
      cmbavDynamicfiltersselector1.setEnabled( 1 );
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      cmbavDynamicfiltersoperator3.setVisible( 1 );
      edtavEmprnom3_Visible = 1 ;
      edtavInc_num_ult3_Visible = 1 ;
      cmbavDynamicfiltersoperator2.setVisible( 1 );
      edtavEmprnom2_Visible = 1 ;
      edtavInc_num_ult2_Visible = 1 ;
      cmbavDynamicfiltersoperator1.setVisible( 1 );
      edtavEmprnom1_Visible = 1 ;
      edtavInc_num_ult1_Visible = 1 ;
      edtInc_Obs_Visible = -1 ;
      edtavInc_hdr_Visible = -1 ;
      edtavInc_obstxt_Visible = -1 ;
      edtInc_Usuari_Visible = -1 ;
      edtInc_Termin_Visible = -1 ;
      edtInc_Prog_Visible = -1 ;
      edtInc_Hora_Visible = -1 ;
      edtInc_Linea_Visible = -1 ;
      edtInc_Dia_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_inc_horaauxdate_Jsonclick = "" ;
      edtavDdo_inc_diaauxdate_Jsonclick = "" ;
      lblJsdynamicfilters_Caption = httpContext.getMessage( "JSDynamicFilters", "") ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WPIncidencias2GetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic|Dynamic|Dynamic|||" ;
      Ddo_grid_Includedatalist = "|||T|T|T|||" ;
      Ddo_grid_Filterisrange = "|T|||||||" ;
      Ddo_grid_Filtertype = "Date|Numeric|Date|Character|Character|Character|||" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|||" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|||" ;
      Ddo_grid_Columnids = "1:Inc_Dia|2:Inc_Linea|3:Inc_Hora|4:Inc_Prog|5:Inc_Terminal|6:Inc_Usuario|7:Inc_obsTxt|8:Inc_Hdr|9:Inc_Obs" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Control de Incidencias", "") );
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavDynamicfiltersselector1.setName( "vDYNAMICFILTERSSELECTOR1" );
      cmbavDynamicfiltersselector1.setWebtags( "" );
      cmbavDynamicfiltersselector1.addItem("INC_NUM_ULT", httpContext.getMessage( "Ultimo Numero", ""), (short)(0));
      cmbavDynamicfiltersselector1.addItem("EMPRNOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      if ( cmbavDynamicfiltersselector1.getItemCount() > 0 )
      {
         AV16DynamicFiltersSelector1 = cmbavDynamicfiltersselector1.getValidValue(AV16DynamicFiltersSelector1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DynamicFiltersSelector1", AV16DynamicFiltersSelector1);
      }
      cmbavDynamicfiltersoperator1.setName( "vDYNAMICFILTERSOPERATOR1" );
      cmbavDynamicfiltersoperator1.setWebtags( "" );
      cmbavDynamicfiltersoperator1.addItem("0", "<", (short)(0));
      cmbavDynamicfiltersoperator1.addItem("1", "=", (short)(0));
      cmbavDynamicfiltersoperator1.addItem("2", ">", (short)(0));
      if ( cmbavDynamicfiltersoperator1.getItemCount() > 0 )
      {
         AV17DynamicFiltersOperator1 = (short)(GXutil.lval( cmbavDynamicfiltersoperator1.getValidValue(GXutil.trim( GXutil.str( AV17DynamicFiltersOperator1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17DynamicFiltersOperator1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DynamicFiltersOperator1), 4, 0));
      }
      cmbavDynamicfiltersselector2.setName( "vDYNAMICFILTERSSELECTOR2" );
      cmbavDynamicfiltersselector2.setWebtags( "" );
      cmbavDynamicfiltersselector2.addItem("INC_NUM_ULT", httpContext.getMessage( "Ultimo Numero", ""), (short)(0));
      cmbavDynamicfiltersselector2.addItem("EMPRNOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      if ( cmbavDynamicfiltersselector2.getItemCount() > 0 )
      {
         AV21DynamicFiltersSelector2 = cmbavDynamicfiltersselector2.getValidValue(AV21DynamicFiltersSelector2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DynamicFiltersSelector2", AV21DynamicFiltersSelector2);
      }
      cmbavDynamicfiltersoperator2.setName( "vDYNAMICFILTERSOPERATOR2" );
      cmbavDynamicfiltersoperator2.setWebtags( "" );
      cmbavDynamicfiltersoperator2.addItem("0", "<", (short)(0));
      cmbavDynamicfiltersoperator2.addItem("1", "=", (short)(0));
      cmbavDynamicfiltersoperator2.addItem("2", ">", (short)(0));
      if ( cmbavDynamicfiltersoperator2.getItemCount() > 0 )
      {
         AV22DynamicFiltersOperator2 = (short)(GXutil.lval( cmbavDynamicfiltersoperator2.getValidValue(GXutil.trim( GXutil.str( AV22DynamicFiltersOperator2, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22DynamicFiltersOperator2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22DynamicFiltersOperator2), 4, 0));
      }
      cmbavDynamicfiltersselector3.setName( "vDYNAMICFILTERSSELECTOR3" );
      cmbavDynamicfiltersselector3.setWebtags( "" );
      cmbavDynamicfiltersselector3.addItem("INC_NUM_ULT", httpContext.getMessage( "Ultimo Numero", ""), (short)(0));
      cmbavDynamicfiltersselector3.addItem("EMPRNOM", httpContext.getMessage( "Nombre", ""), (short)(0));
      if ( cmbavDynamicfiltersselector3.getItemCount() > 0 )
      {
         AV26DynamicFiltersSelector3 = cmbavDynamicfiltersselector3.getValidValue(AV26DynamicFiltersSelector3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26DynamicFiltersSelector3", AV26DynamicFiltersSelector3);
      }
      cmbavDynamicfiltersoperator3.setName( "vDYNAMICFILTERSOPERATOR3" );
      cmbavDynamicfiltersoperator3.setWebtags( "" );
      cmbavDynamicfiltersoperator3.addItem("0", "<", (short)(0));
      cmbavDynamicfiltersoperator3.addItem("1", "=", (short)(0));
      cmbavDynamicfiltersoperator3.addItem("2", ">", (short)(0));
      if ( cmbavDynamicfiltersoperator3.getItemCount() > 0 )
      {
         AV27DynamicFiltersOperator3 = (short)(GXutil.lval( cmbavDynamicfiltersoperator3.getValidValue(GXutil.trim( GXutil.str( AV27DynamicFiltersOperator3, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27DynamicFiltersOperator3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27DynamicFiltersOperator3), 4, 0));
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_114_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV74GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV74GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74GridActions), 4, 0));
      }
      /* End function init_web_controls */
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e12FM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e26FM2',iparms:[{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV74GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV66Inc_obsTxt',fld:'vINC_OBSTXT',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e13FM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'ADDDYNAMICFILTERS1'","{handler:'e19FM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'ADDDYNAMICFILTERS1'",",oparms:[{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS1'","{handler:'e14FM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS1'",",oparms:[{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'edtavInc_num_ult2_Visible',ctrl:'vINC_NUM_ULT2',prop:'Visible'},{av:'edtavEmprnom2_Visible',ctrl:'vEMPRNOM2',prop:'Visible'},{av:'edtavInc_num_ult3_Visible',ctrl:'vINC_NUM_ULT3',prop:'Visible'},{av:'edtavEmprnom3_Visible',ctrl:'vEMPRNOM3',prop:'Visible'},{av:'edtavInc_num_ult1_Visible',ctrl:'vINC_NUM_ULT1',prop:'Visible'},{av:'edtavEmprnom1_Visible',ctrl:'vEMPRNOM1',prop:'Visible'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR1.CLICK","{handler:'e20FM2',iparms:[{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR1.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'edtavInc_num_ult1_Visible',ctrl:'vINC_NUM_ULT1',prop:'Visible'},{av:'edtavEmprnom1_Visible',ctrl:'vEMPRNOM1',prop:'Visible'}]}");
      setEventMetadata("'ADDDYNAMICFILTERS2'","{handler:'e21FM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'ADDDYNAMICFILTERS2'",",oparms:[{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS2'","{handler:'e15FM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS2'",",oparms:[{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'edtavInc_num_ult2_Visible',ctrl:'vINC_NUM_ULT2',prop:'Visible'},{av:'edtavEmprnom2_Visible',ctrl:'vEMPRNOM2',prop:'Visible'},{av:'edtavInc_num_ult3_Visible',ctrl:'vINC_NUM_ULT3',prop:'Visible'},{av:'edtavEmprnom3_Visible',ctrl:'vEMPRNOM3',prop:'Visible'},{av:'edtavInc_num_ult1_Visible',ctrl:'vINC_NUM_ULT1',prop:'Visible'},{av:'edtavEmprnom1_Visible',ctrl:'vEMPRNOM1',prop:'Visible'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR2.CLICK","{handler:'e22FM2',iparms:[{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR2.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'edtavInc_num_ult2_Visible',ctrl:'vINC_NUM_ULT2',prop:'Visible'},{av:'edtavEmprnom2_Visible',ctrl:'vEMPRNOM2',prop:'Visible'}]}");
      setEventMetadata("'REMOVEDYNAMICFILTERS3'","{handler:'e16FM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("'REMOVEDYNAMICFILTERS3'",",oparms:[{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'edtavInc_num_ult2_Visible',ctrl:'vINC_NUM_ULT2',prop:'Visible'},{av:'edtavEmprnom2_Visible',ctrl:'vEMPRNOM2',prop:'Visible'},{av:'edtavInc_num_ult3_Visible',ctrl:'vINC_NUM_ULT3',prop:'Visible'},{av:'edtavEmprnom3_Visible',ctrl:'vEMPRNOM3',prop:'Visible'},{av:'edtavInc_num_ult1_Visible',ctrl:'vINC_NUM_ULT1',prop:'Visible'},{av:'edtavEmprnom1_Visible',ctrl:'vEMPRNOM1',prop:'Visible'},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VDYNAMICFILTERSSELECTOR3.CLICK","{handler:'e23FM2',iparms:[{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("VDYNAMICFILTERSSELECTOR3.CLICK",",oparms:[{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'edtavInc_num_ult3_Visible',ctrl:'vINC_NUM_ULT3',prop:'Visible'},{av:'edtavEmprnom3_Visible',ctrl:'vEMPRNOM3',prop:'Visible'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e11FM2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'edtavInc_num_ult1_Visible',ctrl:'vINC_NUM_ULT1',prop:'Visible'},{av:'edtavEmprnom1_Visible',ctrl:'vEMPRNOM1',prop:'Visible'},{av:'edtavInc_num_ult2_Visible',ctrl:'vINC_NUM_ULT2',prop:'Visible'},{av:'edtavEmprnom2_Visible',ctrl:'vEMPRNOM2',prop:'Visible'},{av:'edtavInc_num_ult3_Visible',ctrl:'vINC_NUM_ULT3',prop:'Visible'},{av:'edtavEmprnom3_Visible',ctrl:'vEMPRNOM3',prop:'Visible'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e27FM2',iparms:[{av:'cmbavGridactions'},{av:'AV74GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A4929Inc_Dia',fld:'INC_DIA',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV74GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e17FM2',iparms:[{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'edtavInc_num_ult1_Visible',ctrl:'vINC_NUM_ULT1',prop:'Visible'},{av:'edtavEmprnom1_Visible',ctrl:'vEMPRNOM1',prop:'Visible'},{av:'edtavInc_num_ult2_Visible',ctrl:'vINC_NUM_ULT2',prop:'Visible'},{av:'edtavEmprnom2_Visible',ctrl:'vEMPRNOM2',prop:'Visible'},{av:'edtavInc_num_ult3_Visible',ctrl:'vINC_NUM_ULT3',prop:'Visible'},{av:'edtavEmprnom3_Visible',ctrl:'vEMPRNOM3',prop:'Visible'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e18FM2',iparms:[{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV53DDO_Inc_HoraAuxDate',fld:'vDDO_INC_HORAAUXDATE',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'imgAdddynamicfilters1_Visible',ctrl:'ADDDYNAMICFILTERS1',prop:'Visible'},{av:'imgRemovedynamicfilters1_Visible',ctrl:'REMOVEDYNAMICFILTERS1',prop:'Visible'},{av:'imgAdddynamicfilters2_Visible',ctrl:'ADDDYNAMICFILTERS2',prop:'Visible'},{av:'imgRemovedynamicfilters2_Visible',ctrl:'REMOVEDYNAMICFILTERS2',prop:'Visible'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'lblJsdynamicfilters_Caption',ctrl:'JSDYNAMICFILTERS',prop:'Caption'},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''},{av:'edtavInc_num_ult1_Visible',ctrl:'vINC_NUM_ULT1',prop:'Visible'},{av:'edtavEmprnom1_Visible',ctrl:'vEMPRNOM1',prop:'Visible'},{av:'edtavInc_num_ult2_Visible',ctrl:'vINC_NUM_ULT2',prop:'Visible'},{av:'edtavEmprnom2_Visible',ctrl:'vEMPRNOM2',prop:'Visible'},{av:'edtavInc_num_ult3_Visible',ctrl:'vINC_NUM_ULT3',prop:'Visible'},{av:'edtavEmprnom3_Visible',ctrl:'vEMPRNOM3',prop:'Visible'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A4936Inc_Obs',fld:'INC_OBS',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersselector1'},{av:'AV16DynamicFiltersSelector1',fld:'vDYNAMICFILTERSSELECTOR1',pic:''},{av:'AV20DynamicFiltersEnabled2',fld:'vDYNAMICFILTERSENABLED2',pic:''},{av:'cmbavDynamicfiltersselector2'},{av:'AV21DynamicFiltersSelector2',fld:'vDYNAMICFILTERSSELECTOR2',pic:''},{av:'AV25DynamicFiltersEnabled3',fld:'vDYNAMICFILTERSENABLED3',pic:''},{av:'cmbavDynamicfiltersselector3'},{av:'AV26DynamicFiltersSelector3',fld:'vDYNAMICFILTERSSELECTOR3',pic:''},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV78Pgmname',fld:'vPGMNAME',pic:''},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV73FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV43TFInc_Dia',fld:'vTFINC_DIA',pic:''},{av:'AV48TFInc_Linea',fld:'vTFINC_LINEA',pic:'ZZZZZZZZZ9'},{av:'AV49TFInc_Linea_To',fld:'vTFINC_LINEA_TO',pic:'ZZZZZZZZZ9'},{av:'AV51TFInc_Hora',fld:'vTFINC_HORA',pic:'99:99:99'},{av:'AV56TFInc_Prog',fld:'vTFINC_PROG',pic:''},{av:'AV57TFInc_Prog_Sel',fld:'vTFINC_PROG_SEL',pic:''},{av:'AV59TFInc_Terminal',fld:'vTFINC_TERMINAL',pic:''},{av:'AV60TFInc_Terminal_Sel',fld:'vTFINC_TERMINAL_SEL',pic:''},{av:'AV62TFInc_Usuario',fld:'vTFINC_USUARIO',pic:'@!'},{av:'AV63TFInc_Usuario_Sel',fld:'vTFINC_USUARIO_SEL',pic:'@!'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV31DynamicFiltersIgnoreFirst',fld:'vDYNAMICFILTERSIGNOREFIRST',pic:''},{av:'AV18Inc_Num_ult1',fld:'vINC_NUM_ULT1',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'AV19EmprNom1',fld:'vEMPRNOM1',pic:''},{av:'AV30DynamicFiltersRemoving',fld:'vDYNAMICFILTERSREMOVING',pic:''},{av:'AV23Inc_Num_ult2',fld:'vINC_NUM_ULT2',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'AV24EmprNom2',fld:'vEMPRNOM2',pic:''},{av:'AV28Inc_Num_ult3',fld:'vINC_NUM_ULT3',pic:'ZZZZZZZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV29EmprNom3',fld:'vEMPRNOM3',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV41ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'cmbavDynamicfiltersoperator1'},{av:'AV17DynamicFiltersOperator1',fld:'vDYNAMICFILTERSOPERATOR1',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator2'},{av:'AV22DynamicFiltersOperator2',fld:'vDYNAMICFILTERSOPERATOR2',pic:'ZZZ9'},{av:'cmbavDynamicfiltersoperator3'},{av:'AV27DynamicFiltersOperator3',fld:'vDYNAMICFILTERSOPERATOR3',pic:'ZZZ9'},{av:'AV36ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtInc_Dia_Visible',ctrl:'INC_DIA',prop:'Visible'},{av:'edtInc_Linea_Visible',ctrl:'INC_LINEA',prop:'Visible'},{av:'edtInc_Hora_Visible',ctrl:'INC_HORA',prop:'Visible'},{av:'edtInc_Prog_Visible',ctrl:'INC_PROG',prop:'Visible'},{av:'edtInc_Termin_Visible',ctrl:'INC_TERMIN',prop:'Visible'},{av:'edtInc_Usuari_Visible',ctrl:'INC_USUARI',prop:'Visible'},{av:'edtavInc_obstxt_Visible',ctrl:'vINC_OBSTXT',prop:'Visible'},{av:'edtavInc_hdr_Visible',ctrl:'vINC_HDR',prop:'Visible'},{av:'edtInc_Obs_Visible',ctrl:'INC_OBS',prop:'Visible'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Inc_obs',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV16DynamicFiltersSelector1 = "" ;
      AV19EmprNom1 = "" ;
      AV21DynamicFiltersSelector2 = "" ;
      AV24EmprNom2 = "" ;
      AV26DynamicFiltersSelector3 = "" ;
      AV29EmprNom3 = "" ;
      AV36ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV78Pgmname = "" ;
      AV73FilterFullText = "" ;
      AV43TFInc_Dia = GXutil.nullDate() ;
      AV51TFInc_Hora = GXutil.resetTime( GXutil.nullDate() );
      AV56TFInc_Prog = "" ;
      AV57TFInc_Prog_Sel = "" ;
      AV59TFInc_Terminal = "" ;
      AV60TFInc_Terminal_Sel = "" ;
      AV62TFInc_Usuario = "" ;
      AV63TFInc_Usuario_Sel = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A4936Inc_Obs = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV65DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      lblJsdynamicfilters_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV45DDO_Inc_DiaAuxDate = GXutil.nullDate() ;
      AV53DDO_Inc_HoraAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4935Inc_Prog = "" ;
      A4934Inc_Termin = "" ;
      A4933Inc_Usuari = "" ;
      AV66Inc_obsTxt = "" ;
      AV69Inc_Hdr = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV19EmprNom1 = "" ;
      lV24EmprNom2 = "" ;
      lV29EmprNom3 = "" ;
      A407EmprNom = "" ;
      H00FM2_A407EmprNom = new String[] {""} ;
      H00FM2_n407EmprNom = new boolean[] {false} ;
      H00FM2_A4930Inc_Num_ul = new long[1] ;
      H00FM2_n4930Inc_Num_ul = new boolean[] {false} ;
      H00FM2_A396EmprCod = new String[] {""} ;
      H00FM2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      H00FM3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV79Station = "" ;
      AV80Emprcod = "" ;
      AV81Emprnom = "" ;
      AV82Usurcod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      imgAdddynamicfilters1_Jsonclick = "" ;
      imgRemovedynamicfilters1_Jsonclick = "" ;
      imgAdddynamicfilters2_Jsonclick = "" ;
      imgRemovedynamicfilters2_Jsonclick = "" ;
      imgRemovedynamicfilters3_Jsonclick = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV38Session = httpContext.getWebSession();
      AV34ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV40ManageFiltersXml = "" ;
      AV32ExcelFilename = "" ;
      AV33ErrorMessage = "" ;
      AV35UserCustomValue = "" ;
      AV37ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV12GridStateDynamicFilter = new app.wwpbaseobjects.SdtWWPGridState_DynamicFilter(remoteHandle, context);
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      lblDynamicfiltersprefix1_Jsonclick = "" ;
      lblDynamicfiltersmiddle1_Jsonclick = "" ;
      lblDynamicfiltersprefix2_Jsonclick = "" ;
      lblDynamicfiltersmiddle2_Jsonclick = "" ;
      lblDynamicfiltersprefix3_Jsonclick = "" ;
      lblDynamicfiltersmiddle3_Jsonclick = "" ;
      imgRemovedynamicfilters3_gximage = "" ;
      sImgUrl = "" ;
      imgAdddynamicfilters2_gximage = "" ;
      imgRemovedynamicfilters2_gximage = "" ;
      imgAdddynamicfilters1_gximage = "" ;
      imgRemovedynamicfilters1_gximage = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpincidencias2__default(),
         new Object[] {
             new Object[] {
            H00FM2_A407EmprNom, H00FM2_n407EmprNom, H00FM2_A4930Inc_Num_ul, H00FM2_n4930Inc_Num_ul, H00FM2_A396EmprCod, H00FM2_A4929Inc_Dia
            }
            , new Object[] {
            H00FM3_AGRID_nRecordCount
            }
         }
      );
      AV78Pgmname = "WPIncidencias2" ;
      /* GeneXus formulas. */
      AV78Pgmname = "WPIncidencias2" ;
      Gx_err = (short)(0) ;
      edtavInc_obstxt_Enabled = 0 ;
      edtavInc_hdr_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GRID_nEOF ;
   private byte GxWebError ;
   private byte AV41ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV17DynamicFiltersOperator1 ;
   private short AV22DynamicFiltersOperator2 ;
   private short AV27DynamicFiltersOperator3 ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV74GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV67Nlin ;
   private short AV75i ;
   private int nRC_GXsfl_114 ;
   private int subGrid_Rows ;
   private int nGXsfl_114_idx=1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavInc_obstxt_Enabled ;
   private int edtavInc_hdr_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtInc_Dia_Visible ;
   private int edtInc_Linea_Visible ;
   private int edtInc_Hora_Visible ;
   private int edtInc_Prog_Visible ;
   private int edtInc_Termin_Visible ;
   private int edtInc_Usuari_Visible ;
   private int edtavInc_obstxt_Visible ;
   private int edtavInc_hdr_Visible ;
   private int edtInc_Obs_Visible ;
   private int imgAdddynamicfilters1_Visible ;
   private int imgRemovedynamicfilters1_Visible ;
   private int imgAdddynamicfilters2_Visible ;
   private int imgRemovedynamicfilters2_Visible ;
   private int edtavInc_num_ult1_Visible ;
   private int edtavEmprnom1_Visible ;
   private int edtavInc_num_ult2_Visible ;
   private int edtavEmprnom2_Visible ;
   private int edtavInc_num_ult3_Visible ;
   private int edtavEmprnom3_Visible ;
   private int AV83GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int edtavInc_num_ult3_Enabled ;
   private int edtavEmprnom3_Enabled ;
   private int edtavInc_num_ult2_Enabled ;
   private int edtavEmprnom2_Enabled ;
   private int edtavInc_num_ult1_Enabled ;
   private int edtavEmprnom1_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV18Inc_Num_ult1 ;
   private long AV23Inc_Num_ult2 ;
   private long AV28Inc_Num_ult3 ;
   private long AV48TFInc_Linea ;
   private long AV49TFInc_Linea_To ;
   private long A4931Inc_Linea ;
   private long GRID_nCurrentRecord ;
   private long A4930Inc_Num_ul ;
   private long GRID_nRecordCount ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_114_idx="0001" ;
   private String AV19EmprNom1 ;
   private String AV24EmprNom2 ;
   private String AV29EmprNom3 ;
   private String AV78Pgmname ;
   private String AV56TFInc_Prog ;
   private String AV57TFInc_Prog_Sel ;
   private String AV59TFInc_Terminal ;
   private String AV60TFInc_Terminal_Sel ;
   private String AV62TFInc_Usuario ;
   private String AV63TFInc_Usuario_Sel ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String lblJsdynamicfilters_Internalname ;
   private String lblJsdynamicfilters_Caption ;
   private String lblJsdynamicfilters_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_inc_diaauxdates_Internalname ;
   private String edtavDdo_inc_diaauxdate_Internalname ;
   private String edtavDdo_inc_diaauxdate_Jsonclick ;
   private String divDdo_inc_horaauxdates_Internalname ;
   private String edtavDdo_inc_horaauxdate_Internalname ;
   private String edtavDdo_inc_horaauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtInc_Dia_Internalname ;
   private String edtInc_Linea_Internalname ;
   private String edtInc_Hora_Internalname ;
   private String A4935Inc_Prog ;
   private String edtInc_Prog_Internalname ;
   private String A4934Inc_Termin ;
   private String edtInc_Termin_Internalname ;
   private String A4933Inc_Usuari ;
   private String edtInc_Usuari_Internalname ;
   private String edtavInc_obstxt_Internalname ;
   private String AV69Inc_Hdr ;
   private String edtavInc_hdr_Internalname ;
   private String edtInc_Obs_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV19EmprNom1 ;
   private String lV24EmprNom2 ;
   private String lV29EmprNom3 ;
   private String A407EmprNom ;
   private String edtavInc_num_ult1_Internalname ;
   private String edtavEmprnom1_Internalname ;
   private String edtavInc_num_ult2_Internalname ;
   private String edtavEmprnom2_Internalname ;
   private String edtavInc_num_ult3_Internalname ;
   private String edtavEmprnom3_Internalname ;
   private String hsh ;
   private String AV79Station ;
   private String AV80Emprcod ;
   private String AV81Emprnom ;
   private String AV82Usurcod ;
   private String imgAdddynamicfilters1_Jsonclick ;
   private String divTabledynamicfilters_Internalname ;
   private String imgAdddynamicfilters1_Internalname ;
   private String imgRemovedynamicfilters1_Jsonclick ;
   private String imgRemovedynamicfilters1_Internalname ;
   private String imgAdddynamicfilters2_Jsonclick ;
   private String imgAdddynamicfilters2_Internalname ;
   private String imgRemovedynamicfilters2_Jsonclick ;
   private String imgRemovedynamicfilters2_Internalname ;
   private String imgRemovedynamicfilters3_Jsonclick ;
   private String imgRemovedynamicfilters3_Internalname ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String divTabledynamicfiltersrow1_Internalname ;
   private String lblDynamicfiltersprefix1_Internalname ;
   private String lblDynamicfiltersprefix1_Jsonclick ;
   private String lblDynamicfiltersmiddle1_Internalname ;
   private String lblDynamicfiltersmiddle1_Jsonclick ;
   private String divTabledynamicfiltersrow2_Internalname ;
   private String lblDynamicfiltersprefix2_Internalname ;
   private String lblDynamicfiltersprefix2_Jsonclick ;
   private String lblDynamicfiltersmiddle2_Internalname ;
   private String lblDynamicfiltersmiddle2_Jsonclick ;
   private String divTabledynamicfiltersrow3_Internalname ;
   private String lblDynamicfiltersprefix3_Internalname ;
   private String lblDynamicfiltersprefix3_Jsonclick ;
   private String lblDynamicfiltersmiddle3_Internalname ;
   private String lblDynamicfiltersmiddle3_Jsonclick ;
   private String tblTablemergeddynamicfilters3_Internalname ;
   private String cellFilter_inc_num_ult3_cell_Internalname ;
   private String edtavInc_num_ult3_Jsonclick ;
   private String cellFilter_emprnom3_cell_Internalname ;
   private String edtavEmprnom3_Jsonclick ;
   private String cellDynamicfilters_removefilter3_cell_Internalname ;
   private String imgRemovedynamicfilters3_gximage ;
   private String sImgUrl ;
   private String tblTablemergeddynamicfilters2_Internalname ;
   private String cellFilter_inc_num_ult2_cell_Internalname ;
   private String edtavInc_num_ult2_Jsonclick ;
   private String cellFilter_emprnom2_cell_Internalname ;
   private String edtavEmprnom2_Jsonclick ;
   private String cellDynamicfilters_addfilter2_cell_Internalname ;
   private String imgAdddynamicfilters2_gximage ;
   private String cellDynamicfilters_removefilter2_cell_Internalname ;
   private String imgRemovedynamicfilters2_gximage ;
   private String tblTablemergeddynamicfilters1_Internalname ;
   private String cellFilter_inc_num_ult1_cell_Internalname ;
   private String edtavInc_num_ult1_Jsonclick ;
   private String cellFilter_emprnom1_cell_Internalname ;
   private String edtavEmprnom1_Jsonclick ;
   private String cellDynamicfilters_addfilter1_cell_Internalname ;
   private String imgAdddynamicfilters1_gximage ;
   private String cellDynamicfilters_removefilter1_cell_Internalname ;
   private String imgRemovedynamicfilters1_gximage ;
   private String sGXsfl_114_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtInc_Dia_Jsonclick ;
   private String edtInc_Linea_Jsonclick ;
   private String edtInc_Hora_Jsonclick ;
   private String edtInc_Prog_Jsonclick ;
   private String edtInc_Termin_Jsonclick ;
   private String edtInc_Usuari_Jsonclick ;
   private String edtavInc_obstxt_Jsonclick ;
   private String edtavInc_hdr_Jsonclick ;
   private String edtInc_Obs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV51TFInc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date AV43TFInc_Dia ;
   private java.util.Date AV45DDO_Inc_DiaAuxDate ;
   private java.util.Date AV53DDO_Inc_HoraAuxDate ;
   private java.util.Date A4929Inc_Dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV20DynamicFiltersEnabled2 ;
   private boolean AV25DynamicFiltersEnabled3 ;
   private boolean AV14OrderedDsc ;
   private boolean AV31DynamicFiltersIgnoreFirst ;
   private boolean AV30DynamicFiltersRemoving ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_114_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n407EmprNom ;
   private boolean n4930Inc_Num_ul ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV34ColumnsSelectorXML ;
   private String AV40ManageFiltersXml ;
   private String AV35UserCustomValue ;
   private String AV16DynamicFiltersSelector1 ;
   private String AV21DynamicFiltersSelector2 ;
   private String AV26DynamicFiltersSelector3 ;
   private String AV73FilterFullText ;
   private String A4936Inc_Obs ;
   private String AV66Inc_obsTxt ;
   private String AV32ExcelFilename ;
   private String AV33ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV38Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavDynamicfiltersselector1 ;
   private HTMLChoice cmbavDynamicfiltersoperator1 ;
   private HTMLChoice cmbavDynamicfiltersselector2 ;
   private HTMLChoice cmbavDynamicfiltersoperator2 ;
   private HTMLChoice cmbavDynamicfiltersselector3 ;
   private HTMLChoice cmbavDynamicfiltersoperator3 ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H00FM2_A407EmprNom ;
   private boolean[] H00FM2_n407EmprNom ;
   private long[] H00FM2_A4930Inc_Num_ul ;
   private boolean[] H00FM2_n4930Inc_Num_ul ;
   private String[] H00FM2_A396EmprCod ;
   private java.util.Date[] H00FM2_A4929Inc_Dia ;
   private long[] H00FM3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV36ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV37ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV65DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPGridState_DynamicFilter AV12GridStateDynamicFilter ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wpincidencias2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00FM2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV16DynamicFiltersSelector1 ,
                                          short AV17DynamicFiltersOperator1 ,
                                          long AV18Inc_Num_ult1 ,
                                          String AV19EmprNom1 ,
                                          boolean AV20DynamicFiltersEnabled2 ,
                                          String AV21DynamicFiltersSelector2 ,
                                          short AV22DynamicFiltersOperator2 ,
                                          long AV23Inc_Num_ult2 ,
                                          String AV24EmprNom2 ,
                                          boolean AV25DynamicFiltersEnabled3 ,
                                          String AV26DynamicFiltersSelector3 ,
                                          short AV27DynamicFiltersOperator3 ,
                                          long AV28Inc_Num_ult3 ,
                                          String AV29EmprNom3 ,
                                          java.util.Date AV43TFInc_Dia ,
                                          long A4930Inc_Num_ul ,
                                          String A407EmprNom ,
                                          java.util.Date A4929Inc_Dia ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[21];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T2.EmprNom, T1.Inc_Num_ul, T1.EmprCod, T1.Inc_Dia" ;
      sFromString = " FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      sOrderString = "" ;
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV17DynamicFiltersOperator1 == 0 ) && ( ! (0==AV18Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int15[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV17DynamicFiltersOperator1 == 1 ) && ( ! (0==AV18Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int15[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV17DynamicFiltersOperator1 == 2 ) && ( ! (0==AV18Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV17DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV19EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int15[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV17DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV19EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int15[4] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV22DynamicFiltersOperator2 == 0 ) && ( ! (0==AV23Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int15[5] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV22DynamicFiltersOperator2 == 1 ) && ( ! (0==AV23Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int15[6] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV22DynamicFiltersOperator2 == 2 ) && ( ! (0==AV23Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int15[7] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV22DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV24EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV22DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV24EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV27DynamicFiltersOperator3 == 0 ) && ( ! (0==AV28Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV27DynamicFiltersOperator3 == 1 ) && ( ! (0==AV28Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV27DynamicFiltersOperator3 == 2 ) && ( ! (0==AV28Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV27DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV29EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV27DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV29EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFInc_Dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( AV13OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.Inc_Num_ul" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         sOrderString += " ORDER BY T1.Inc_Dia" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.Inc_Dia DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         sOrderString += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         sOrderString += "" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.Inc_Dia" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H00FM3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV16DynamicFiltersSelector1 ,
                                          short AV17DynamicFiltersOperator1 ,
                                          long AV18Inc_Num_ult1 ,
                                          String AV19EmprNom1 ,
                                          boolean AV20DynamicFiltersEnabled2 ,
                                          String AV21DynamicFiltersSelector2 ,
                                          short AV22DynamicFiltersOperator2 ,
                                          long AV23Inc_Num_ult2 ,
                                          String AV24EmprNom2 ,
                                          boolean AV25DynamicFiltersEnabled3 ,
                                          String AV26DynamicFiltersSelector3 ,
                                          short AV27DynamicFiltersOperator3 ,
                                          long AV28Inc_Num_ult3 ,
                                          String AV29EmprNom3 ,
                                          java.util.Date AV43TFInc_Dia ,
                                          long A4930Inc_Num_ul ,
                                          String A407EmprNom ,
                                          java.util.Date A4929Inc_Dia ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[16];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCRTINC T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod)" ;
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV17DynamicFiltersOperator1 == 0 ) && ( ! (0==AV18Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int17[0] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV17DynamicFiltersOperator1 == 1 ) && ( ! (0==AV18Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int17[1] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "INC_NUM_ULT") == 0 ) && ( AV17DynamicFiltersOperator1 == 2 ) && ( ! (0==AV18Inc_Num_ult1) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV17DynamicFiltersOperator1 == 0 ) && ( ! (GXutil.strcmp("", AV19EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int17[3] = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(AV16DynamicFiltersSelector1, "EMPRNOM") == 0 ) && ( AV17DynamicFiltersOperator1 == 1 ) && ( ! (GXutil.strcmp("", AV19EmprNom1)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int17[4] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV22DynamicFiltersOperator2 == 0 ) && ( ! (0==AV23Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int17[5] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV22DynamicFiltersOperator2 == 1 ) && ( ! (0==AV23Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int17[6] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "INC_NUM_ULT") == 0 ) && ( AV22DynamicFiltersOperator2 == 2 ) && ( ! (0==AV23Inc_Num_ult2) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int17[7] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV22DynamicFiltersOperator2 == 0 ) && ( ! (GXutil.strcmp("", AV24EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( AV20DynamicFiltersEnabled2 && ( GXutil.strcmp(AV21DynamicFiltersSelector2, "EMPRNOM") == 0 ) && ( AV22DynamicFiltersOperator2 == 1 ) && ( ! (GXutil.strcmp("", AV24EmprNom2)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV27DynamicFiltersOperator3 == 0 ) && ( ! (0==AV28Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul < ?)");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV27DynamicFiltersOperator3 == 1 ) && ( ! (0==AV28Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "INC_NUM_ULT") == 0 ) && ( AV27DynamicFiltersOperator3 == 2 ) && ( ! (0==AV28Inc_Num_ult3) ) )
      {
         addWhere(sWhereString, "(T1.Inc_Num_ul > ?)");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV27DynamicFiltersOperator3 == 0 ) && ( ! (GXutil.strcmp("", AV29EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like '%' || ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( AV25DynamicFiltersEnabled3 && ( GXutil.strcmp(AV26DynamicFiltersSelector3, "EMPRNOM") == 0 ) && ( AV27DynamicFiltersOperator3 == 1 ) && ( ! (GXutil.strcmp("", AV29EmprNom3)==0) ) )
      {
         addWhere(sWhereString, "(T2.EmprNom like ?)");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFInc_Dia)) )
      {
         addWhere(sWhereString, "(T1.Inc_Dia >= ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV13OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 5 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 6 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ! AV14OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV13OrderedBy == 7 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H00FM2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , ((Boolean) dynConstraints[9]).booleanValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).longValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() );
            case 1 :
                  return conditional_H00FM3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).longValue() , (String)dynConstraints[3] , ((Boolean) dynConstraints[4]).booleanValue() , (String)dynConstraints[5] , ((Number) dynConstraints[6]).shortValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , ((Boolean) dynConstraints[9]).booleanValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Number) dynConstraints[12]).longValue() , (String)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).longValue() , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00FM2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00FM3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((long[]) buf[2])[0] = rslt.getLong(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(4);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[27]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[32]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[36]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[16]).longValue());
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[17]).longValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[18]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 30);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[22]).longValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[23]).longValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[27]).longValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[31]);
               }
               return;
      }
   }

}

