package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail_wkp_impl extends GXDataArea
{
   public trabajoexterno_detail_wkp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_detail_wkp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail_wkp_impl.class ));
   }

   public trabajoexterno_detail_wkp_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      chkavOkin = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
         if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
         {
            AV70Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV71SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
               AV90SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV90SalExtFec", localUtil.format(AV90SalExtFec, "99/99/99"));
               AV91SalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "SalFhh")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV91SalFhh", localUtil.ttoc( AV91SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV68ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV68ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ManCod), 4, 0));
               AV69ManNom = httpContext.GetPar( "ManNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV69ManNom", AV69ManNom);
               AV93SalCodeID = httpContext.GetPar( "SalCodeID") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV93SalCodeID", AV93SalCodeID);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALCODEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93SalCodeID, ""))));
               AV94SalEnvAT = (byte)(GXutil.lval( httpContext.GetPar( "SalEnvAT"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV94SalEnvAT", GXutil.str( AV94SalEnvAT, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALENVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV94SalEnvAT), "9")));
               AV96HashIN = httpContext.GetPar( "HashIN") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV96HashIN", AV96HashIN);
               AV97OkIN = GXutil.strtobool( httpContext.GetPar( "OkIN")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV97OkIN", AV97OkIN);
               AV95Messages_jsonIN = httpContext.GetPar( "Messages_jsonIN") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV95Messages_jsonIN", AV95Messages_jsonIN);
            }
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
      nRC_GXsfl_146 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_146"))) ;
      nGXsfl_146_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_146_idx"))) ;
      sGXsfl_146_idx = httpContext.GetPar( "sGXsfl_146_idx") ;
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
      AV70Emprcod = httpContext.GetPar( "Emprcod") ;
      AV71SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
      AV26TFSalExNln = (short)(GXutil.lval( httpContext.GetPar( "TFSalExNln"))) ;
      AV27TFSalExNln_To = (short)(GXutil.lval( httpContext.GetPar( "TFSalExNln_To"))) ;
      AV28TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV29TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV30TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV31TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV32TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV33TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV34TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV35TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV36TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV37TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV38TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV39TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV40TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV41TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV42TFFasCodn = httpContext.GetPar( "TFFasCodn") ;
      AV43TFFasCodn_Sel = httpContext.GetPar( "TFFasCodn_Sel") ;
      AV44TFOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFOrdLin"))) ;
      AV45TFOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFOrdLin_To"))) ;
      AV46TFSalExCoE = (int)(GXutil.lval( httpContext.GetPar( "TFSalExCoE"))) ;
      AV47TFSalExCoE_To = (int)(GXutil.lval( httpContext.GetPar( "TFSalExCoE_To"))) ;
      AV48TFSalExKgE = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExKgE"), ".") ;
      AV49TFSalExKgE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExKgE_To"), ".") ;
      AV50TFSalExMtE = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExMtE"), ".") ;
      AV51TFSalExMtE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExMtE_To"), ".") ;
      AV52TFSalExObs = httpContext.GetPar( "TFSalExObs") ;
      AV53TFSalExObs_Sel = httpContext.GetPar( "TFSalExObs_Sel") ;
      AV102Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV97OkIN = GXutil.strtobool( httpContext.GetPar( "OkIN")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
      AV93SalCodeID = httpContext.GetPar( "SalCodeID") ;
      AV94SalEnvAT = (byte)(GXutil.lval( httpContext.GetPar( "SalEnvAT"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71SalExtAlb, AV26TFSalExNln, AV27TFSalExNln_To, AV28TFBarCod, AV29TFBarCod_To, AV30TFBarCodReo, AV31TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV34TFCliCod, AV35TFCliCod_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFFasCodn, AV43TFFasCodn_Sel, AV44TFOrdLin, AV45TFOrdLin_To, AV46TFSalExCoE, AV47TFSalExCoE_To, AV48TFSalExKgE, AV49TFSalExKgE_To, AV50TFSalExMtE, AV51TFSalExMtE_To, AV52TFSalExObs, AV53TFSalExObs_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97OkIN, A396EmprCod, A2253SalExtAlb, AV93SalCodeID, AV94SalEnvAT) ;
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
      pa2772( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2772( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_detail_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV71SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV90SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV91SalFhh)),GXutil.URLEncode(GXutil.ltrimstr(AV68ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV69ManNom)),GXutil.URLEncode(GXutil.rtrim(AV93SalCodeID)),GXutil.URLEncode(GXutil.ltrimstr(AV94SalEnvAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV96HashIN)),GXutil.URLEncode(GXutil.booltostr(AV97OkIN)),GXutil.URLEncode(GXutil.rtrim(AV95Messages_jsonIN))}, new String[] {"Emprcod","SalExtAlb","SalExtFec","SalFhh","ManCod","ManNom","SalCodeID","SalEnvAT","HashIN","OkIN","Messages_jsonIN"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALCODEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93SalCodeID, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALENVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV94SalEnvAT), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Detail_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_detail_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_146", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_146, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV56GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV57GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV54DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV54DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV70Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXNLN", GXutil.ltrim( localUtil.ntoc( AV26TFSalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXNLN_TO", GXutil.ltrim( localUtil.ntoc( AV27TFSalExNln_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV28TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV30TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV31TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODPAR", GXutil.rtrim( AV32TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODPAR_SEL", GXutil.rtrim( AV33TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV34TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV35TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV36TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV37TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV38TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV39TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI", GXutil.rtrim( AV40TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI_SEL", GXutil.rtrim( AV41TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCODN", GXutil.rtrim( AV42TFFasCodn));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFASCODN_SEL", GXutil.rtrim( AV43TFFasCodn_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFORDLIN", GXutil.ltrim( localUtil.ntoc( AV44TFOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV45TFOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXCOE", GXutil.ltrim( localUtil.ntoc( AV46TFSalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXCOE_TO", GXutil.ltrim( localUtil.ntoc( AV47TFSalExCoE_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXKGE", GXutil.ltrim( localUtil.ntoc( AV48TFSalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXKGE_TO", GXutil.ltrim( localUtil.ntoc( AV49TFSalExKgE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXMTE", GXutil.ltrim( localUtil.ntoc( AV50TFSalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXMTE_TO", GXutil.ltrim( localUtil.ntoc( AV51TFSalExMtE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXOBS", GXutil.rtrim( AV52TFSalExObs));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSALEXOBS_SEL", GXutil.rtrim( AV53TFSalExObs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTFEC", localUtil.dtoc( AV90SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vMSGERR", GXutil.rtrim( AV77msgerr));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGHDR", GXutil.ltrim( localUtil.ntoc( AV76flaghdr, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALFHH", localUtil.ttoc( AV91SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV87Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV89Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we2772( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2772( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_detail_wkp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV71SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV90SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV91SalFhh)),GXutil.URLEncode(GXutil.ltrimstr(AV68ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV69ManNom)),GXutil.URLEncode(GXutil.rtrim(AV93SalCodeID)),GXutil.URLEncode(GXutil.ltrimstr(AV94SalEnvAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV96HashIN)),GXutil.URLEncode(GXutil.booltostr(AV97OkIN)),GXutil.URLEncode(GXutil.rtrim(AV95Messages_jsonIN))}, new String[] {"Emprcod","SalExtAlb","SalExtFec","SalFhh","ManCod","ManNom","SalCodeID","SalEnvAT","HashIN","OkIN","Messages_jsonIN"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Detail_WKP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Trabajo Externo (Detail)", "") ;
   }

   public void wb2770( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMain", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
         ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
         ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
         ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
         ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
         ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
         ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
         ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
         ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
         ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalextalb_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalextalb_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalextalb_Internalname, GXutil.ltrim( localUtil.ntoc( AV71SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalextalb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV71SalExtAlb), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV71SalExtAlb), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalextalb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalextalb_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMancod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMancod_Internalname, httpContext.getMessage( "Manufacturador", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMancod_Internalname, GXutil.ltrim( localUtil.ntoc( AV68ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMancod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV68ManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV68ManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMancod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMancod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMannom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMannom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMannom_Internalname, GXutil.rtrim( AV69ManNom), GXutil.rtrim( localUtil.format( AV69ManNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMannom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMannom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalcodeid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalcodeid_Internalname, httpContext.getMessage( "ATDocCodeID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalcodeid_Internalname, GXutil.rtrim( AV93SalCodeID), GXutil.rtrim( localUtil.format( AV93SalCodeID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalcodeid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalcodeid_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalenvat_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalenvat_Internalname, httpContext.getMessage( "Envio AT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalenvat_Internalname, GXutil.ltrim( localUtil.ntoc( AV94SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalenvat_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV94SalEnvAT), "9") : localUtil.format( DecimalUtil.doubleToDec(AV94SalEnvAT), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalenvat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalenvat_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, divTableheader_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexnln_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexnln_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexnln_Internalname, GXutil.ltrim( localUtil.ntoc( AV59SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexnln_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV59SalExNln), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV59SalExNln), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexnln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexnln_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV60BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV60BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+imgavPrompt_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Active Bitmap Variable */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV75Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV75Prompt)==0)&&(GXutil.strcmp("", AV103Prompt_GXI)==0))||!(GXutil.strcmp("", AV75Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV75Prompt)==0) ? AV103Prompt_GXI : httpContext.getResourceRelative(AV75Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 5, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"EVPROMPT.CLICK."+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV75Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV61BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV61BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV61BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV62BarCodPar), GXutil.rtrim( localUtil.format( AV62BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFascodn_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFascodn_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFascodn_Internalname, GXutil.rtrim( AV63FasCodn), GXutil.rtrim( localUtil.format( AV63FasCodn, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFascodn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFascodn_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavOrdlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavOrdlin_Internalname, httpContext.getMessage( "Orden", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavOrdlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV64OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavOrdlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV64OrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV64OrdLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavOrdlin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavOrdlin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexcoe_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexcoe_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexcoe_Internalname, GXutil.ltrim( localUtil.ntoc( AV65SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexcoe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV65SalExCoE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV65SalExCoE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexcoe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexcoe_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexkge_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexkge_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexkge_Internalname, GXutil.ltrim( localUtil.ntoc( AV66SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexkge_Enabled!=0) ? localUtil.format( AV66SalExKgE, "ZZZZZ9.99") : localUtil.format( AV66SalExKgE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexkge_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexkge_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexmte_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexmte_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexmte_Internalname, GXutil.ltrim( localUtil.ntoc( AV67SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexmte_Enabled!=0) ? localUtil.format( AV67SalExMtE, "ZZZZZ9.99") : localUtil.format( AV67SalExMtE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexmte_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexmte_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnfase1_Internalname, "gx.evt.setGridEvt("+GXutil.str( 146, 3, 0)+","+"null"+");", httpContext.getMessage( "1 Fase", ""), bttBtnfase1_Jsonclick, 5, httpContext.getMessage( "1 Fase", ""), "", StyleString, ClassString, 1, bttBtnfase1_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOFASE1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnnfases_Internalname, "gx.evt.setGridEvt("+GXutil.str( 146, 3, 0)+","+"null"+");", httpContext.getMessage( "n Fases", ""), bttBtnnfases_Jsonclick, 5, httpContext.getMessage( "n Fases", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DONFASES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexobs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexobs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexobs_Internalname, GXutil.rtrim( AV79SalExObs), GXutil.rtrim( localUtil.format( AV79SalExObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexobs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexobs_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV82CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV82CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV82CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,108);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV83BarSer), GXutil.rtrim( localUtil.format( AV83BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,112);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV80BarColNom), GXutil.rtrim( localUtil.format( AV80BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,116);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Color Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV81BarNomCli), GXutil.rtrim( localUtil.format( AV81BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,120);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarunimed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarunimed_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'" + sGXsfl_146_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarunimed_Internalname, GXutil.rtrim( AV99BarUniMed), GXutil.rtrim( localUtil.format( AV99BarUniMed, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarunimed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarunimed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_126_2772( true) ;
      }
      else
      {
         wb_table1_126_2772( false) ;
      }
      return  ;
   }

   public void wb_table1_126_2772e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 146, 3, 0)+","+"null"+");", httpContext.getMessage( "Agregar", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Agregar", ""), "", StyleString, ClassString, 1, bttBtnconfirmar_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnhashycomunicarat_Internalname, "gx.evt.setGridEvt("+GXutil.str( 146, 3, 0)+","+"null"+");", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtnhashycomunicarat_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, bttBtnhashycomunicarat_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOHASHYCOMUNICARAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 140,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 146, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol146( ) ;
      }
      if ( wbEnd == 146 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_146 = (int)(nGXsfl_146_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV56GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV57GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV102Pgmname), GXutil.rtrim( localUtil.format( AV102Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMessages_jsonin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMessages_jsonin_Internalname, httpContext.getMessage( "Message", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavMessages_jsonin_Internalname, AV95Messages_jsonIN, "", "", (short)(0), 1, edtavMessages_jsonin_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHashin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHashin_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavHashin_Internalname, AV96HashIN, "", "", (short)(0), 1, edtavHashin_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternos\\TrabajoExterno_Detail_WKP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOkin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOkin.getInternalname(), httpContext.getMessage( "Hash Correcto?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOkin.getInternalname(), GXutil.booltostr( AV97OkIN), "", httpContext.getMessage( "Hash Correcto?", ""), 1, chkavOkin.getEnabled(), "true", "", StyleString, ClassString, "", "", "");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV54DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_199_2772( true) ;
      }
      else
      {
         wb_table2_199_2772( false) ;
      }
      return  ;
   }

   public void wb_table2_199_2772e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_204_2772( true) ;
      }
      else
      {
         wb_table3_204_2772( false) ;
      }
      return  ;
   }

   public void wb_table3_204_2772e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 146 )
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

   public void start2772( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Trabajo Externo (Detail)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2770( ) ;
   }

   public void ws2772( )
   {
      start2772( ) ;
      evt2772( ) ;
   }

   public void evt2772( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConfirmar' */
                           e162772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOHASHYCOMUNICARAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoHashyComunicarAT' */
                           e172772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e182772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOFASE1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoFase1' */
                           e192772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DONFASES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DonFases' */
                           e202772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPROMPT.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e212772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e222772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e232772 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           nGXsfl_146_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_146_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_146_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1462( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV58GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActions), 4, 0));
                           A6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A6558FasCodn = GXutil.upper( httpContext.cgiGet( edtFasCodn_Internalname)) ;
                           AV98FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV98FasDsc);
                           A654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A6256SalExKgE = localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)) ;
                           A6258SalExMtE = localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)) ;
                           A6249SalExObs = httpContext.cgiGet( edtSalExObs_Internalname) ;
                           A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n2265BarExt = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e242772 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e252772 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e262772 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e272772 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
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

   public void we2772( )
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

   public void pa2772( )
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
            GX_FocusControl = edtavSalexnln_Internalname ;
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
      subsflControlProps_1462( ) ;
      while ( nGXsfl_146_idx <= nRC_GXsfl_146 )
      {
         sendrow_1462( ) ;
         nGXsfl_146_idx = ((subGrid_Islastpage==1)&&(nGXsfl_146_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_146_idx+1) ;
         sGXsfl_146_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_146_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1462( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV70Emprcod ,
                                 int AV71SalExtAlb ,
                                 short AV26TFSalExNln ,
                                 short AV27TFSalExNln_To ,
                                 int AV28TFBarCod ,
                                 int AV29TFBarCod_To ,
                                 byte AV30TFBarCodReo ,
                                 byte AV31TFBarCodReo_To ,
                                 String AV32TFBarCodPar ,
                                 String AV33TFBarCodPar_Sel ,
                                 int AV34TFCliCod ,
                                 int AV35TFCliCod_To ,
                                 String AV36TFBarSer ,
                                 String AV37TFBarSer_Sel ,
                                 String AV38TFBarColNom ,
                                 String AV39TFBarColNom_Sel ,
                                 String AV40TFBarNomCli ,
                                 String AV41TFBarNomCli_Sel ,
                                 String AV42TFFasCodn ,
                                 String AV43TFFasCodn_Sel ,
                                 short AV44TFOrdLin ,
                                 short AV45TFOrdLin_To ,
                                 int AV46TFSalExCoE ,
                                 int AV47TFSalExCoE_To ,
                                 java.math.BigDecimal AV48TFSalExKgE ,
                                 java.math.BigDecimal AV49TFSalExKgE_To ,
                                 java.math.BigDecimal AV50TFSalExMtE ,
                                 java.math.BigDecimal AV51TFSalExMtE_To ,
                                 String AV52TFSalExObs ,
                                 String AV53TFSalExObs_Sel ,
                                 String AV102Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 boolean AV97OkIN ,
                                 String A396EmprCod ,
                                 int A2253SalExtAlb ,
                                 String AV93SalCodeID ,
                                 byte AV94SalEnvAT )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e252772 ();
      GRID_nCurrentRecord = 0 ;
      rf2772( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Detail_WKP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_detail_wkp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
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
      AV97OkIN = GXutil.strtobool( GXutil.booltostr( AV97OkIN)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97OkIN", AV97OkIN);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2772( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV102Pgmname = "TrabajosExternos.TrabajoExterno_Detail_WKP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102Pgmname", AV102Pgmname);
      Gx_err = (short)(0) ;
      edtavSalextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextalb_Enabled), 5, 0), true);
      edtavMancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancod_Enabled), 5, 0), true);
      edtavMannom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMannom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMannom_Enabled), 5, 0), true);
      edtavSalcodeid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalcodeid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalcodeid_Enabled), 5, 0), true);
      edtavSalenvat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalenvat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalenvat_Enabled), 5, 0), true);
      edtavSalexnln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalexnln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalexnln_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_146_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavMessages_jsonin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMessages_jsonin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMessages_jsonin_Enabled), 5, 0), true);
      edtavHashin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHashin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHashin_Enabled), 5, 0), true);
      chkavOkin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavOkin.getInternalname(), "Enabled", GXutil.ltrimstr( chkavOkin.getEnabled(), 5, 0), true);
   }

   public void rf2772( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(146) ;
      /* Execute user event: Refresh */
      e252772 ();
      nGXsfl_146_idx = 1 ;
      sGXsfl_146_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_146_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1462( ) ;
      bGXsfl_146_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_1462( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) ,
                                              Short.valueOf(AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) ,
                                              Integer.valueOf(AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) ,
                                              Integer.valueOf(AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) ,
                                              Byte.valueOf(AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) ,
                                              Byte.valueOf(AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) ,
                                              AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                              AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                              Integer.valueOf(AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) ,
                                              Integer.valueOf(AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) ,
                                              AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                              AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                              AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                              AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                              AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                              AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                              AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                              AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                              Short.valueOf(AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) ,
                                              Short.valueOf(AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) ,
                                              Integer.valueOf(AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) ,
                                              Integer.valueOf(AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) ,
                                              AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                              AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                              AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                              AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                              AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                              AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                              Short.valueOf(A6248SalExNln) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Integer.valueOf(A252CliCod) ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              A1234BarNomCli ,
                                              A6558FasCodn ,
                                              Short.valueOf(A654OrdLin) ,
                                              Integer.valueOf(A6257SalExCoE) ,
                                              A6256SalExKgE ,
                                              A6258SalExMtE ,
                                              A6249SalExObs ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV70Emprcod ,
                                              Integer.valueOf(AV71SalExtAlb) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A2253SalExtAlb) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar), 1, "%") ;
         lV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser), 16, "%") ;
         lV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom), 13, "%") ;
         lV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli), 13, "%") ;
         lV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn), 8, "%") ;
         lV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = GXutil.padr( GXutil.rtrim( AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs), 40, "%") ;
         /* Using cursor H02772 */
         pr_default.execute(0, new Object[] {AV70Emprcod, Integer.valueOf(AV71SalExtAlb), Short.valueOf(AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln), Short.valueOf(AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to), Integer.valueOf(AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod), Integer.valueOf(AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to), Byte.valueOf(AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo), Byte.valueOf(AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to), lV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar, AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel, Integer.valueOf(AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod), Integer.valueOf(AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to), lV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser, AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel, lV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom, AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel, lV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli, AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel, lV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn, AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel, Short.valueOf(AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin), Short.valueOf(AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to), Integer.valueOf(AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe), Integer.valueOf(AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to), AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge, AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to, AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte, AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to, lV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs, AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_146_idx = 1 ;
         sGXsfl_146_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_146_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1462( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02772_A396EmprCod[0] ;
            A2253SalExtAlb = H02772_A2253SalExtAlb[0] ;
            A2265BarExt = H02772_A2265BarExt[0] ;
            n2265BarExt = H02772_n2265BarExt[0] ;
            A6249SalExObs = H02772_A6249SalExObs[0] ;
            A6258SalExMtE = H02772_A6258SalExMtE[0] ;
            A6256SalExKgE = H02772_A6256SalExKgE[0] ;
            A6257SalExCoE = H02772_A6257SalExCoE[0] ;
            A654OrdLin = H02772_A654OrdLin[0] ;
            A6558FasCodn = H02772_A6558FasCodn[0] ;
            A1234BarNomCli = H02772_A1234BarNomCli[0] ;
            A135BarColNom = H02772_A135BarColNom[0] ;
            A212BarSer = H02772_A212BarSer[0] ;
            A252CliCod = H02772_A252CliCod[0] ;
            n252CliCod = H02772_n252CliCod[0] ;
            A130BarCodPar = H02772_A130BarCodPar[0] ;
            A132BarCodReo = H02772_A132BarCodReo[0] ;
            A129BarCod = H02772_A129BarCod[0] ;
            A6248SalExNln = H02772_A6248SalExNln[0] ;
            A2265BarExt = H02772_A2265BarExt[0] ;
            n2265BarExt = H02772_n2265BarExt[0] ;
            A1234BarNomCli = H02772_A1234BarNomCli[0] ;
            A135BarColNom = H02772_A135BarColNom[0] ;
            A212BarSer = H02772_A212BarSer[0] ;
            A252CliCod = H02772_A252CliCod[0] ;
            n252CliCod = H02772_n252CliCod[0] ;
            e262772 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(146) ;
         wb2770( ) ;
      }
      bGXsfl_146_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2772( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_SALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
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
      AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV26TFSalExNln ;
      AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV27TFSalExNln_To ;
      AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV28TFBarCod ;
      AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV29TFBarCod_To ;
      AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV30TFBarCodReo ;
      AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV31TFBarCodReo_To ;
      AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV32TFBarCodPar ;
      AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV34TFCliCod ;
      AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV35TFCliCod_To ;
      AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV36TFBarSer ;
      AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV37TFBarSer_Sel ;
      AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV38TFBarColNom ;
      AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV40TFBarNomCli ;
      AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV42TFFasCodn ;
      AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV43TFFasCodn_Sel ;
      AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV44TFOrdLin ;
      AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV45TFOrdLin_To ;
      AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV46TFSalExCoE ;
      AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV47TFSalExCoE_To ;
      AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV48TFSalExKgE ;
      AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV49TFSalExKgE_To ;
      AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV50TFSalExMtE ;
      AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV51TFSalExMtE_To ;
      AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV52TFSalExObs ;
      AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV53TFSalExObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) ,
                                           Short.valueOf(AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) ,
                                           Integer.valueOf(AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) ,
                                           AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                           AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                           Integer.valueOf(AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) ,
                                           Integer.valueOf(AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) ,
                                           AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                           AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                           AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                           AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                           AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                           AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                           AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                           AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                           Short.valueOf(AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) ,
                                           Short.valueOf(AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) ,
                                           Integer.valueOf(AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) ,
                                           Integer.valueOf(AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) ,
                                           AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                           AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                           AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                           AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                           AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                           AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV70Emprcod ,
                                           Integer.valueOf(AV71SalExtAlb) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A2253SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar), 1, "%") ;
      lV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser), 16, "%") ;
      lV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom), 13, "%") ;
      lV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli), 13, "%") ;
      lV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn), 8, "%") ;
      lV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = GXutil.padr( GXutil.rtrim( AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs), 40, "%") ;
      /* Using cursor H02773 */
      pr_default.execute(1, new Object[] {AV70Emprcod, Integer.valueOf(AV71SalExtAlb), Short.valueOf(AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln), Short.valueOf(AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to), Integer.valueOf(AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod), Integer.valueOf(AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to), Byte.valueOf(AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo), Byte.valueOf(AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to), lV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar, AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel, Integer.valueOf(AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod), Integer.valueOf(AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to), lV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser, AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel, lV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom, AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel, lV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli, AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel, lV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn, AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel, Short.valueOf(AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin), Short.valueOf(AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to), Integer.valueOf(AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe), Integer.valueOf(AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to), AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge, AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to, AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte, AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to, lV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs, AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel});
      GRID_nRecordCount = H02773_AGRID_nRecordCount[0] ;
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
      AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV26TFSalExNln ;
      AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV27TFSalExNln_To ;
      AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV28TFBarCod ;
      AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV29TFBarCod_To ;
      AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV30TFBarCodReo ;
      AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV31TFBarCodReo_To ;
      AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV32TFBarCodPar ;
      AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV34TFCliCod ;
      AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV35TFCliCod_To ;
      AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV36TFBarSer ;
      AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV37TFBarSer_Sel ;
      AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV38TFBarColNom ;
      AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV40TFBarNomCli ;
      AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV42TFFasCodn ;
      AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV43TFFasCodn_Sel ;
      AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV44TFOrdLin ;
      AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV45TFOrdLin_To ;
      AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV46TFSalExCoE ;
      AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV47TFSalExCoE_To ;
      AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV48TFSalExKgE ;
      AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV49TFSalExKgE_To ;
      AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV50TFSalExMtE ;
      AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV51TFSalExMtE_To ;
      AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV52TFSalExObs ;
      AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV53TFSalExObs_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71SalExtAlb, AV26TFSalExNln, AV27TFSalExNln_To, AV28TFBarCod, AV29TFBarCod_To, AV30TFBarCodReo, AV31TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV34TFCliCod, AV35TFCliCod_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFFasCodn, AV43TFFasCodn_Sel, AV44TFOrdLin, AV45TFOrdLin_To, AV46TFSalExCoE, AV47TFSalExCoE_To, AV48TFSalExKgE, AV49TFSalExKgE_To, AV50TFSalExMtE, AV51TFSalExMtE_To, AV52TFSalExObs, AV53TFSalExObs_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97OkIN, A396EmprCod, A2253SalExtAlb, AV93SalCodeID, AV94SalEnvAT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV26TFSalExNln ;
      AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV27TFSalExNln_To ;
      AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV28TFBarCod ;
      AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV29TFBarCod_To ;
      AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV30TFBarCodReo ;
      AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV31TFBarCodReo_To ;
      AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV32TFBarCodPar ;
      AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV34TFCliCod ;
      AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV35TFCliCod_To ;
      AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV36TFBarSer ;
      AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV37TFBarSer_Sel ;
      AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV38TFBarColNom ;
      AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV40TFBarNomCli ;
      AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV42TFFasCodn ;
      AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV43TFFasCodn_Sel ;
      AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV44TFOrdLin ;
      AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV45TFOrdLin_To ;
      AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV46TFSalExCoE ;
      AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV47TFSalExCoE_To ;
      AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV48TFSalExKgE ;
      AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV49TFSalExKgE_To ;
      AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV50TFSalExMtE ;
      AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV51TFSalExMtE_To ;
      AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV52TFSalExObs ;
      AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV53TFSalExObs_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71SalExtAlb, AV26TFSalExNln, AV27TFSalExNln_To, AV28TFBarCod, AV29TFBarCod_To, AV30TFBarCodReo, AV31TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV34TFCliCod, AV35TFCliCod_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFFasCodn, AV43TFFasCodn_Sel, AV44TFOrdLin, AV45TFOrdLin_To, AV46TFSalExCoE, AV47TFSalExCoE_To, AV48TFSalExKgE, AV49TFSalExKgE_To, AV50TFSalExMtE, AV51TFSalExMtE_To, AV52TFSalExObs, AV53TFSalExObs_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97OkIN, A396EmprCod, A2253SalExtAlb, AV93SalCodeID, AV94SalEnvAT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV26TFSalExNln ;
      AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV27TFSalExNln_To ;
      AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV28TFBarCod ;
      AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV29TFBarCod_To ;
      AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV30TFBarCodReo ;
      AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV31TFBarCodReo_To ;
      AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV32TFBarCodPar ;
      AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV34TFCliCod ;
      AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV35TFCliCod_To ;
      AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV36TFBarSer ;
      AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV37TFBarSer_Sel ;
      AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV38TFBarColNom ;
      AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV40TFBarNomCli ;
      AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV42TFFasCodn ;
      AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV43TFFasCodn_Sel ;
      AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV44TFOrdLin ;
      AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV45TFOrdLin_To ;
      AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV46TFSalExCoE ;
      AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV47TFSalExCoE_To ;
      AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV48TFSalExKgE ;
      AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV49TFSalExKgE_To ;
      AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV50TFSalExMtE ;
      AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV51TFSalExMtE_To ;
      AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV52TFSalExObs ;
      AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV53TFSalExObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71SalExtAlb, AV26TFSalExNln, AV27TFSalExNln_To, AV28TFBarCod, AV29TFBarCod_To, AV30TFBarCodReo, AV31TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV34TFCliCod, AV35TFCliCod_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFFasCodn, AV43TFFasCodn_Sel, AV44TFOrdLin, AV45TFOrdLin_To, AV46TFSalExCoE, AV47TFSalExCoE_To, AV48TFSalExKgE, AV49TFSalExKgE_To, AV50TFSalExMtE, AV51TFSalExMtE_To, AV52TFSalExObs, AV53TFSalExObs_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97OkIN, A396EmprCod, A2253SalExtAlb, AV93SalCodeID, AV94SalEnvAT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV26TFSalExNln ;
      AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV27TFSalExNln_To ;
      AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV28TFBarCod ;
      AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV29TFBarCod_To ;
      AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV30TFBarCodReo ;
      AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV31TFBarCodReo_To ;
      AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV32TFBarCodPar ;
      AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV34TFCliCod ;
      AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV35TFCliCod_To ;
      AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV36TFBarSer ;
      AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV37TFBarSer_Sel ;
      AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV38TFBarColNom ;
      AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV40TFBarNomCli ;
      AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV42TFFasCodn ;
      AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV43TFFasCodn_Sel ;
      AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV44TFOrdLin ;
      AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV45TFOrdLin_To ;
      AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV46TFSalExCoE ;
      AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV47TFSalExCoE_To ;
      AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV48TFSalExKgE ;
      AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV49TFSalExKgE_To ;
      AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV50TFSalExMtE ;
      AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV51TFSalExMtE_To ;
      AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV52TFSalExObs ;
      AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV53TFSalExObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71SalExtAlb, AV26TFSalExNln, AV27TFSalExNln_To, AV28TFBarCod, AV29TFBarCod_To, AV30TFBarCodReo, AV31TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV34TFCliCod, AV35TFCliCod_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFFasCodn, AV43TFFasCodn_Sel, AV44TFOrdLin, AV45TFOrdLin_To, AV46TFSalExCoE, AV47TFSalExCoE_To, AV48TFSalExKgE, AV49TFSalExKgE_To, AV50TFSalExMtE, AV51TFSalExMtE_To, AV52TFSalExObs, AV53TFSalExObs_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97OkIN, A396EmprCod, A2253SalExtAlb, AV93SalCodeID, AV94SalEnvAT) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV26TFSalExNln ;
      AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV27TFSalExNln_To ;
      AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV28TFBarCod ;
      AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV29TFBarCod_To ;
      AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV30TFBarCodReo ;
      AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV31TFBarCodReo_To ;
      AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV32TFBarCodPar ;
      AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV34TFCliCod ;
      AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV35TFCliCod_To ;
      AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV36TFBarSer ;
      AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV37TFBarSer_Sel ;
      AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV38TFBarColNom ;
      AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV40TFBarNomCli ;
      AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV42TFFasCodn ;
      AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV43TFFasCodn_Sel ;
      AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV44TFOrdLin ;
      AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV45TFOrdLin_To ;
      AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV46TFSalExCoE ;
      AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV47TFSalExCoE_To ;
      AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV48TFSalExKgE ;
      AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV49TFSalExKgE_To ;
      AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV50TFSalExMtE ;
      AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV51TFSalExMtE_To ;
      AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV52TFSalExObs ;
      AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV53TFSalExObs_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Emprcod, AV71SalExtAlb, AV26TFSalExNln, AV27TFSalExNln_To, AV28TFBarCod, AV29TFBarCod_To, AV30TFBarCodReo, AV31TFBarCodReo_To, AV32TFBarCodPar, AV33TFBarCodPar_Sel, AV34TFCliCod, AV35TFCliCod_To, AV36TFBarSer, AV37TFBarSer_Sel, AV38TFBarColNom, AV39TFBarColNom_Sel, AV40TFBarNomCli, AV41TFBarNomCli_Sel, AV42TFFasCodn, AV43TFFasCodn_Sel, AV44TFOrdLin, AV45TFOrdLin_To, AV46TFSalExCoE, AV47TFSalExCoE_To, AV48TFSalExKgE, AV49TFSalExKgE_To, AV50TFSalExMtE, AV51TFSalExMtE_To, AV52TFSalExObs, AV53TFSalExObs_Sel, AV102Pgmname, AV12OrderedBy, AV13OrderedDsc, AV97OkIN, A396EmprCod, A2253SalExtAlb, AV93SalCodeID, AV94SalEnvAT) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV102Pgmname = "TrabajosExternos.TrabajoExterno_Detail_WKP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102Pgmname", AV102Pgmname);
      Gx_err = (short)(0) ;
      edtavSalextalb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalextalb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalextalb_Enabled), 5, 0), true);
      edtavMancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMancod_Enabled), 5, 0), true);
      edtavMannom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMannom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMannom_Enabled), 5, 0), true);
      edtavSalcodeid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalcodeid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalcodeid_Enabled), 5, 0), true);
      edtavSalenvat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalenvat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalenvat_Enabled), 5, 0), true);
      edtavSalexnln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalexnln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalexnln_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_146_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavMessages_jsonin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMessages_jsonin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMessages_jsonin_Enabled), 5, 0), true);
      edtavHashin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHashin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHashin_Enabled), 5, 0), true);
      chkavOkin.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavOkin.getInternalname(), "Enabled", GXutil.ltrimstr( chkavOkin.getEnabled(), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2770( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e242772 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV54DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_146 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_146"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV56GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV57GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexnln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexnln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXNLN");
            GX_FocusControl = edtavSalexnln_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV59SalExNln = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59SalExNln), 4, 0));
         }
         else
         {
            AV59SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( edtavSalexnln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59SalExNln), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
         }
         else
         {
            AV60BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
         }
         AV75Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
         }
         else
         {
            AV61BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
         }
         AV62BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
         AV63FasCodn = GXutil.upper( httpContext.cgiGet( edtavFascodn_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63FasCodn", AV63FasCodn);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavOrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavOrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vORDLIN");
            GX_FocusControl = edtavOrdlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV64OrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OrdLin), 4, 0));
         }
         else
         {
            AV64OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavOrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OrdLin), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXCOE");
            GX_FocusControl = edtavSalexcoe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV65SalExCoE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65SalExCoE), 6, 0));
         }
         else
         {
            AV65SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV65SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65SalExCoE), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXKGE");
            GX_FocusControl = edtavSalexkge_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV66SalExKgE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66SalExKgE", GXutil.ltrimstr( AV66SalExKgE, 9, 2));
         }
         else
         {
            AV66SalExKgE = localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66SalExKgE", GXutil.ltrimstr( AV66SalExKgE, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXMTE");
            GX_FocusControl = edtavSalexmte_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV67SalExMtE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67SalExMtE", GXutil.ltrimstr( AV67SalExMtE, 9, 2));
         }
         else
         {
            AV67SalExMtE = localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67SalExMtE", GXutil.ltrimstr( AV67SalExMtE, 9, 2));
         }
         AV79SalExObs = httpContext.cgiGet( edtavSalexobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79SalExObs", AV79SalExObs);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CliCod), 6, 0));
         }
         else
         {
            AV82CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CliCod), 6, 0));
         }
         AV83BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
         AV80BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80BarColNom", AV80BarColNom);
         AV81BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81BarNomCli", AV81BarNomCli);
         AV99BarUniMed = GXutil.upper( httpContext.cgiGet( edtavBarunimed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99BarUniMed", AV99BarUniMed);
         AV102Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102Pgmname", AV102Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_146_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_146_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_146_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1462( ) ;
         if ( nGXsfl_146_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV58GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActions), 4, 0));
            A6248SalExNln = (short)(localUtil.ctol( httpContext.cgiGet( edtSalExNln_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A6558FasCodn = GXutil.upper( httpContext.cgiGet( edtFasCodn_Internalname)) ;
            AV98FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV98FasDsc);
            A654OrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6257SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExCoE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6256SalExKgE = localUtil.ctond( httpContext.cgiGet( edtSalExKgE_Internalname)) ;
            A6258SalExMtE = localUtil.ctond( httpContext.cgiGet( edtSalExMtE_Internalname)) ;
            A6249SalExObs = httpContext.cgiGet( edtSalExObs_Internalname) ;
            A2265BarExt = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarExt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n2265BarExt = false ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Detail_WKP");
         AV102Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102Pgmname", AV102Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV102Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajosexternos\\trabajoexterno_detail_wkp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e242772 ();
      if (returnInSub) return;
   }

   public void e242772( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV72Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Station = GXt_char1 ;
      GXv_char2[0] = AV70Emprcod ;
      GXv_char3[0] = AV73EmprNom ;
      GXv_char4[0] = AV74UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV72Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char2[0] ;
      trabajoexterno_detail_wkp_impl.this.AV73EmprNom = GXv_char3[0] ;
      trabajoexterno_detail_wkp_impl.this.AV74UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Trabajo Externo (Detail)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV54DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV54DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV75Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV75Prompt)==0) ? AV103Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV75Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV75Prompt), true);
      AV103Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV75Prompt)==0) ? AV103Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV75Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV75Prompt), true);
      divTableheader_Visible = ((!(GXutil.strcmp("", AV93SalCodeID)==0)||(AV94SalEnvAT==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divTableheader_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableheader_Visible), 5, 0), true);
      bttBtnconfirmar_Enabled = ((!(GXutil.strcmp("", AV93SalCodeID)==0)||(AV94SalEnvAT==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnconfirmar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnconfirmar_Enabled), 5, 0), true);
      bttBtnhashycomunicarat_Enabled = ((!(GXutil.strcmp("", AV93SalCodeID)==0)||(AV94SalEnvAT==3) ? false : true) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnhashycomunicarat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnhashycomunicarat_Enabled), 5, 0), true);
   }

   public void e252772( )
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
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV56GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56GridCurrentPage), 10, 0));
      AV57GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57GridPageCount), 10, 0));
      GXt_int8 = AV59SalExNln ;
      GXv_int9[0] = GXt_int8 ;
      new app.trabajosexternos.trabajoexterno_prxid(remoteHandle, context).execute( AV70Emprcod, AV71SalExtAlb, GXv_int9) ;
      trabajoexterno_detail_wkp_impl.this.GXt_int8 = GXv_int9[0] ;
      AV59SalExNln = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59SalExNln), 4, 0));
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "InvertGridMenu", "", new Object[] {httpContext.getMessage( ".dropdown-menu", "")});
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln = AV26TFSalExNln ;
      AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to = AV27TFSalExNln_To ;
      AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod = AV28TFBarCod ;
      AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to = AV29TFBarCod_To ;
      AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo = AV30TFBarCodReo ;
      AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to = AV31TFBarCodReo_To ;
      AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = AV32TFBarCodPar ;
      AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = AV33TFBarCodPar_Sel ;
      AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod = AV34TFCliCod ;
      AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to = AV35TFCliCod_To ;
      AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = AV36TFBarSer ;
      AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = AV37TFBarSer_Sel ;
      AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = AV38TFBarColNom ;
      AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = AV39TFBarColNom_Sel ;
      AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = AV40TFBarNomCli ;
      AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = AV41TFBarNomCli_Sel ;
      AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = AV42TFFasCodn ;
      AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = AV43TFFasCodn_Sel ;
      AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin = AV44TFOrdLin ;
      AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to = AV45TFOrdLin_To ;
      AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe = AV46TFSalExCoE ;
      AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to = AV47TFSalExCoE_To ;
      AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = AV48TFSalExKgE ;
      AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = AV49TFSalExKgE_To ;
      AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = AV50TFSalExMtE ;
      AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = AV51TFSalExMtE_To ;
      AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = AV52TFSalExObs ;
      AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = AV53TFSalExObs_Sel ;
      /*  Sending Event outputs  */
   }

   public void e112772( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV55PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV55PageToGo) ;
      }
   }

   public void e122772( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132772( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExNln") == 0 )
         {
            AV26TFSalExNln = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFSalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFSalExNln), 4, 0));
            AV27TFSalExNln_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFSalExNln_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFSalExNln_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV28TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFBarCod), 8, 0));
            AV29TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV30TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarCodReo", GXutil.str( AV30TFBarCodReo, 1, 0));
            AV31TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarCodReo_To", GXutil.str( AV31TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV32TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarCodPar", AV32TFBarCodPar);
            AV33TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarCodPar_Sel", AV33TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFCliCod), 6, 0));
            AV35TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV36TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarSer", AV36TFBarSer);
            AV37TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarSer_Sel", AV37TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV38TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarColNom", AV38TFBarColNom);
            AV39TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFBarColNom_Sel", AV39TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV40TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFBarNomCli", AV40TFBarNomCli);
            AV41TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFBarNomCli_Sel", AV41TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCodn") == 0 )
         {
            AV42TFFasCodn = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFFasCodn", AV42TFFasCodn);
            AV43TFFasCodn_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFFasCodn_Sel", AV43TFFasCodn_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OrdLin") == 0 )
         {
            AV44TFOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFOrdLin), 4, 0));
            AV45TFOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExCoE") == 0 )
         {
            AV46TFSalExCoE = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFSalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFSalExCoE), 6, 0));
            AV47TFSalExCoE_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFSalExCoE_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFSalExCoE_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExKgE") == 0 )
         {
            AV48TFSalExKgE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFSalExKgE", GXutil.ltrimstr( AV48TFSalExKgE, 9, 2));
            AV49TFSalExKgE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFSalExKgE_To", GXutil.ltrimstr( AV49TFSalExKgE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExMtE") == 0 )
         {
            AV50TFSalExMtE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFSalExMtE", GXutil.ltrimstr( AV50TFSalExMtE, 9, 2));
            AV51TFSalExMtE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFSalExMtE_To", GXutil.ltrimstr( AV51TFSalExMtE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExObs") == 0 )
         {
            AV52TFSalExObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFSalExObs", AV52TFSalExObs);
            AV53TFSalExObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFSalExObs_Sel", AV53TFSalExObs_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e262772( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      GXt_char1 = AV98FasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A6558FasCodn, GXv_char4) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV98FasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavFasdsc_Internalname, AV98FasDsc);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(146) ;
      }
      sendrow_1462( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_146_Refreshing )
      {
         httpContext.doAjaxLoad(146, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV58GridActions, 4, 0)) );
   }

   public void e272772( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV58GridActions == 1 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV58GridActions == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINARLINEA' */
         S162 ();
         if (returnInSub) return;
      }
      AV58GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV58GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e142772( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e162772( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      if ( (0==AV59SalExNln) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "El numero de linea (#) no tiene valor", ""));
      }
      else
      {
         if ( (0==AV60BarCod) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Nº Hdr", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (0==AV64OrdLin) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Orden", ""));
               GX_FocusControl = edtavOrdlin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (GXutil.strcmp("", AV63FasCodn)==0) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fase", ""));
                  GX_FocusControl = edtavFascodn_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  GXv_char4[0] = AV70Emprcod ;
                  GXv_int10[0] = AV60BarCod ;
                  GXv_int11[0] = AV61BarCodReo ;
                  GXv_char3[0] = AV62BarCodPar ;
                  GXv_char2[0] = AV63FasCodn ;
                  GXv_char12[0] = AV77msgerr ;
                  new app.pfasanx(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_char3, GXv_char2, GXv_char12) ;
                  trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char4[0] ;
                  trabajoexterno_detail_wkp_impl.this.AV60BarCod = GXv_int10[0] ;
                  trabajoexterno_detail_wkp_impl.this.AV61BarCodReo = GXv_int11[0] ;
                  trabajoexterno_detail_wkp_impl.this.AV62BarCodPar = GXv_char3[0] ;
                  trabajoexterno_detail_wkp_impl.this.AV63FasCodn = GXv_char2[0] ;
                  trabajoexterno_detail_wkp_impl.this.AV77msgerr = GXv_char12[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
                  httpContext.ajax_rsp_assign_attri("", false, "AV63FasCodn", AV63FasCodn);
                  httpContext.ajax_rsp_assign_attri("", false, "AV77msgerr", AV77msgerr);
                  if ( ! (GXutil.strcmp("", AV77msgerr)==0) )
                  {
                     httpContext.GX_msglist.addItem(AV77msgerr);
                     GX_FocusControl = edtavFascodn_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     GXv_char12[0] = AV70Emprcod ;
                     GXv_int10[0] = AV60BarCod ;
                     GXv_int11[0] = AV61BarCodReo ;
                     GXv_char4[0] = AV62BarCodPar ;
                     GXv_int13[0] = (byte)(AV76flaghdr) ;
                     new app.pexihdr(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int11, GXv_char4, GXv_int13) ;
                     trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
                     trabajoexterno_detail_wkp_impl.this.AV60BarCod = GXv_int10[0] ;
                     trabajoexterno_detail_wkp_impl.this.AV61BarCodReo = GXv_int11[0] ;
                     trabajoexterno_detail_wkp_impl.this.AV62BarCodPar = GXv_char4[0] ;
                     trabajoexterno_detail_wkp_impl.this.AV76flaghdr = GXv_int13[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
                     httpContext.ajax_rsp_assign_attri("", false, "AV76flaghdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76flaghdr), 4, 0));
                     if ( (0==AV76flaghdr) )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº Hdr", ""));
                        GX_FocusControl = edtavBarcod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        GXv_char12[0] = AV70Emprcod ;
                        GXv_int10[0] = AV60BarCod ;
                        GXv_int13[0] = AV61BarCodReo ;
                        GXv_char4[0] = AV62BarCodPar ;
                        GXv_int9[0] = AV64OrdLin ;
                        GXv_char3[0] = AV77msgerr ;
                        new app.trabajosexternos.pexorden(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int13, GXv_char4, GXv_int9, GXv_char3) ;
                        trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
                        trabajoexterno_detail_wkp_impl.this.AV60BarCod = GXv_int10[0] ;
                        trabajoexterno_detail_wkp_impl.this.AV61BarCodReo = GXv_int13[0] ;
                        trabajoexterno_detail_wkp_impl.this.AV62BarCodPar = GXv_char4[0] ;
                        trabajoexterno_detail_wkp_impl.this.AV64OrdLin = GXv_int9[0] ;
                        trabajoexterno_detail_wkp_impl.this.AV77msgerr = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
                        httpContext.ajax_rsp_assign_attri("", false, "AV64OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OrdLin), 4, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV77msgerr", AV77msgerr);
                        if ( ! (GXutil.strcmp("", AV77msgerr)==0) )
                        {
                           httpContext.GX_msglist.addItem(AV77msgerr);
                           GX_FocusControl = edtavBarcod_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           GXv_int13[0] = AV78BarSit ;
                           new app.phdrsituacion(remoteHandle, context).execute( AV70Emprcod, AV60BarCod, AV61BarCodReo, AV62BarCodPar, GXv_int13) ;
                           trabajoexterno_detail_wkp_impl.this.AV78BarSit = GXv_int13[0] ;
                           if ( AV78BarSit >= 9 )
                           {
                              httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Hdr CERRADA", ""));
                              GX_FocusControl = edtavBarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                           }
                           else
                           {
                              this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_CONFIRMARContainer", "Confirm", "", new Object[] {});
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e152772( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e172772( )
   {
      /* 'DoHashyComunicarAT' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_horasalidadocumentoenvioat", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV71SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV90SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV91SalFhh)),GXutil.URLEncode(GXutil.rtrim(AV87Cadena)),GXutil.URLEncode(GXutil.rtrim(AV89Hash))}, new String[] {"Emprcod","AlbProCOD","SalExtFec","AlbProSys","cadena","hash"}) , new Object[] {"AV70Emprcod","AV71SalExtAlb","AV90SalExtFec","AV91SalFhh","AV87Cadena","AV89Hash"});
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e182772( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      GXv_char12[0] = AV70Emprcod ;
      GXv_int10[0] = AV71SalExtAlb ;
      GXv_date14[0] = AV90SalExtFec ;
      GXv_dtime15[0] = AV91SalFhh ;
      GXv_char4[0] = AV87Cadena ;
      GXv_char3[0] = AV88firma ;
      new app.trabajosexternos.trabajoexterno_actualizohash_cadenaparahash(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_date14, GXv_dtime15, GXv_char4, GXv_char3) ;
      trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
      trabajoexterno_detail_wkp_impl.this.AV71SalExtAlb = GXv_int10[0] ;
      trabajoexterno_detail_wkp_impl.this.AV90SalExtFec = GXv_date14[0] ;
      trabajoexterno_detail_wkp_impl.this.AV91SalFhh = GXv_dtime15[0] ;
      trabajoexterno_detail_wkp_impl.this.AV87Cadena = GXv_char4[0] ;
      trabajoexterno_detail_wkp_impl.this.AV88firma = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV90SalExtFec", localUtil.format(AV90SalExtFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV91SalFhh", localUtil.ttoc( AV91SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      httpContext.ajax_rsp_assign_attri("", false, "AV87Cadena", AV87Cadena);
      GXv_char12[0] = AV89Hash ;
      GXv_objcol_SdtMessages_Message16[0] = AV84Messages ;
      GXv_boolean17[0] = AV85ok ;
      new app.hash_obtener(remoteHandle, context).execute( AV87Cadena, GXv_char12, GXv_objcol_SdtMessages_Message16, GXv_boolean17) ;
      trabajoexterno_detail_wkp_impl.this.AV89Hash = GXv_char12[0] ;
      AV84Messages = GXv_objcol_SdtMessages_Message16[0] ;
      trabajoexterno_detail_wkp_impl.this.AV85ok = GXv_boolean17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89Hash", AV89Hash);
      if ( AV85ok )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
         GXv_char12[0] = AV70Emprcod ;
         GXv_int10[0] = AV71SalExtAlb ;
         GXv_char4[0] = AV87Cadena ;
         GXv_char3[0] = AV89Hash ;
         new app.trabajosexternos.trabajoexterno_actualizohash(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_char4, GXv_char3) ;
         trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
         trabajoexterno_detail_wkp_impl.this.AV71SalExtAlb = GXv_int10[0] ;
         trabajoexterno_detail_wkp_impl.this.AV87Cadena = GXv_char4[0] ;
         trabajoexterno_detail_wkp_impl.this.AV89Hash = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV87Cadena", AV87Cadena);
         httpContext.ajax_rsp_assign_attri("", false, "AV89Hash", AV89Hash);
      }
      else
      {
         AV132GXV1 = 1 ;
         while ( AV132GXV1 <= AV84Messages.size() )
         {
            AV86Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV84Messages.elementAt(-1+AV132GXV1));
            httpContext.GX_msglist.addItem(AV86Message.getgxTv_SdtMessages_Message_Description());
            AV132GXV1 = (int)(AV132GXV1+1) ;
         }
      }
      GXv_char12[0] = AV70Emprcod ;
      GXv_int10[0] = AV71SalExtAlb ;
      new app.trabajosexternos.phdrde9(remoteHandle, context).execute( GXv_char12, GXv_int10) ;
      trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
      trabajoexterno_detail_wkp_impl.this.AV71SalExtAlb = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void e192772( )
   {
      /* 'DoFase1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_fase_una", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV60BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV61BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV62BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV64OrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(AV63FasCodn))}, new String[] {"InOutEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InOutBarOrdLin","InOutFascod"}) , new Object[] {"AV70Emprcod","AV60BarCod","AV61BarCodReo","AV62BarCodPar","AV64OrdLin","AV63FasCodn"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e202772( )
   {
      /* 'DonFases' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.trabajosexternos.trabajoexterno_fase_n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV71SalExtAlb,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV68ManCod,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV90SalExtFec)),GXutil.URLEncode(GXutil.ltrimstr(AV60BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV61BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV62BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV99BarUniMed))}, new String[] {"Emprcod","SalExtAlb","Mancod","SalExtFec","Barcod","Barcodreo","Barcodpar","SalExCoEIN","SalExKgEIN","SalExMtEIN","barunimed"}) , new Object[] {});
      AV59SalExNln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59SalExNln), 4, 0));
      AV60BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
      AV61BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
      AV62BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
      AV79SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79SalExObs", AV79SalExObs);
      AV66SalExKgE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66SalExKgE", GXutil.ltrimstr( AV66SalExKgE, 9, 2));
      AV65SalExCoE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65SalExCoE), 6, 0));
      AV67SalExMtE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67SalExMtE", GXutil.ltrimstr( AV67SalExMtE, 9, 2));
      AV63FasCodn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63FasCodn", AV63FasCodn);
      AV64OrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OrdLin), 4, 0));
      AV79SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79SalExObs", AV79SalExObs);
      AV82CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CliCod), 6, 0));
      AV83BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
      AV80BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80BarColNom", AV80BarColNom);
      AV81BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81BarNomCli", AV81BarNomCli);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV93SalCodeID)==0) || ( AV94SalEnvAT == 3 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
         httpContext.doAjaxRefresh();
      }
      else
      {
         callWebObject(formatLink("app.trabajosexternos.trabajoexterno_detail_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A6248SalExNln,4,0))}, new String[] {"Mode","EmprCod","SalExtAlb","SalExNln"}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S162( )
   {
      /* 'DO ELIMINARLINEA' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV93SalCodeID)==0) || ( AV94SalEnvAT == 3 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", ""));
      }
      else
      {
         AV92Flag = (byte)(0) ;
         if ( A2265BarExt < 2 )
         {
            GXv_char12[0] = AV70Emprcod ;
            GXv_int10[0] = AV71SalExtAlb ;
            GXv_int9[0] = A6248SalExNln ;
            GXv_int13[0] = AV92Flag ;
            new app.trabajosexternos.phdrde33(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int9, GXv_int13) ;
            trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
            trabajoexterno_detail_wkp_impl.this.AV71SalExtAlb = GXv_int10[0] ;
            trabajoexterno_detail_wkp_impl.this.A6248SalExNln = GXv_int9[0] ;
            trabajoexterno_detail_wkp_impl.this.AV92Flag = GXv_int13[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
         }
         if ( AV92Flag == 1 )
         {
            Gx_msg = httpContext.getMessage( "Esta Linea ya esta Recepcionada¡¡¡", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            AV134Emprcod_selected = A396EmprCod ;
            AV135Salextalb_selected = A2253SalExtAlb ;
            AV136Salexnln_selected = A6248SalExNln ;
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer", "Confirm", "", new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S172( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char12[0] = AV70Emprcod ;
      GXv_int10[0] = A129BarCod ;
      GXv_int13[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_char3[0] = A6558FasCodn ;
      GXv_date14[0] = AV90SalExtFec ;
      GXv_int11[0] = (byte)(0) ;
      GXv_int18[0] = AV71SalExtAlb ;
      GXv_int9[0] = A6248SalExNln ;
      GXv_char2[0] = httpContext.getMessage( "HDR", "") ;
      new app.trabajosexternos.phdrex9copy1(remoteHandle, context).execute( GXv_char12, GXv_int10, GXv_int13, GXv_char4, GXv_char3, GXv_date14, GXv_int11, GXv_int18, GXv_int9, GXv_char2) ;
      trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
      trabajoexterno_detail_wkp_impl.this.A129BarCod = GXv_int10[0] ;
      trabajoexterno_detail_wkp_impl.this.A132BarCodReo = GXv_int13[0] ;
      trabajoexterno_detail_wkp_impl.this.A130BarCodPar = GXv_char4[0] ;
      trabajoexterno_detail_wkp_impl.this.A6558FasCodn = GXv_char3[0] ;
      trabajoexterno_detail_wkp_impl.this.AV90SalExtFec = GXv_date14[0] ;
      trabajoexterno_detail_wkp_impl.this.AV71SalExtAlb = GXv_int18[0] ;
      trabajoexterno_detail_wkp_impl.this.A6248SalExNln = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV90SalExtFec", localUtil.format(AV90SalExtFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
      GXv_char12[0] = AV70Emprcod ;
      GXv_int9[0] = AV68ManCod ;
      GXv_char4[0] = A6558FasCodn ;
      GXv_char3[0] = httpContext.getMessage( "E", "") ;
      GXv_int18[0] = AV71SalExtAlb ;
      GXv_int10[0] = A129BarCod ;
      GXv_int13[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      new app.trabajosexternos.pbmvhdr(remoteHandle, context).execute( GXv_char12, GXv_int9, GXv_char4, GXv_char3, GXv_int18, GXv_int10, GXv_int13, GXv_char2) ;
      trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
      trabajoexterno_detail_wkp_impl.this.AV68ManCod = GXv_int9[0] ;
      trabajoexterno_detail_wkp_impl.this.A6558FasCodn = GXv_char4[0] ;
      trabajoexterno_detail_wkp_impl.this.AV71SalExtAlb = GXv_int18[0] ;
      trabajoexterno_detail_wkp_impl.this.A129BarCod = GXv_int10[0] ;
      trabajoexterno_detail_wkp_impl.this.A132BarCodReo = GXv_int13[0] ;
      trabajoexterno_detail_wkp_impl.this.A130BarCodPar = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV68ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ManCod), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
      httpContext.doAjaxRefresh();
   }

   public void S182( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      new app.trabajosexternos.trabajoexterno_detail_ins(remoteHandle, context).execute( AV70Emprcod, AV71SalExtAlb, AV59SalExNln, AV60BarCod, AV61BarCodReo, AV62BarCodPar, AV79SalExObs, GXutil.today( ), AV66SalExKgE, AV65SalExCoE, AV67SalExMtE, AV63FasCodn, AV64OrdLin, "") ;
      GXv_char12[0] = AV70Emprcod ;
      GXv_int9[0] = AV68ManCod ;
      GXv_int18[0] = AV71SalExtAlb ;
      GXv_int19[0] = AV59SalExNln ;
      GXv_date14[0] = GXutil.today( ) ;
      GXv_int10[0] = AV60BarCod ;
      GXv_int13[0] = AV61BarCodReo ;
      GXv_char4[0] = AV62BarCodPar ;
      GXv_int20[0] = AV64OrdLin ;
      GXv_char3[0] = AV63FasCodn ;
      GXv_decimal21[0] = AV66SalExKgE ;
      GXv_decimal22[0] = AV67SalExMtE ;
      GXv_int23[0] = AV65SalExCoE ;
      new app.trabajosexternos.pwork01(remoteHandle, context).execute( GXv_char12, GXv_int9, GXv_int18, GXv_int19, GXv_date14, GXv_int10, GXv_int13, GXv_char4, GXv_int20, GXv_char3, GXv_decimal21, GXv_decimal22, GXv_int23) ;
      trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char12[0] ;
      trabajoexterno_detail_wkp_impl.this.AV68ManCod = GXv_int9[0] ;
      trabajoexterno_detail_wkp_impl.this.AV71SalExtAlb = GXv_int18[0] ;
      trabajoexterno_detail_wkp_impl.this.AV59SalExNln = GXv_int19[0] ;
      trabajoexterno_detail_wkp_impl.this.AV60BarCod = GXv_int10[0] ;
      trabajoexterno_detail_wkp_impl.this.AV61BarCodReo = GXv_int13[0] ;
      trabajoexterno_detail_wkp_impl.this.AV62BarCodPar = GXv_char4[0] ;
      trabajoexterno_detail_wkp_impl.this.AV64OrdLin = GXv_int20[0] ;
      trabajoexterno_detail_wkp_impl.this.AV63FasCodn = GXv_char3[0] ;
      trabajoexterno_detail_wkp_impl.this.AV66SalExKgE = GXv_decimal21[0] ;
      trabajoexterno_detail_wkp_impl.this.AV67SalExMtE = GXv_decimal22[0] ;
      trabajoexterno_detail_wkp_impl.this.AV65SalExCoE = GXv_int23[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV68ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ManCod), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV59SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59SalExNln), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV64OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OrdLin), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV63FasCodn", AV63FasCodn);
      httpContext.ajax_rsp_assign_attri("", false, "AV66SalExKgE", GXutil.ltrimstr( AV66SalExKgE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV67SalExMtE", GXutil.ltrimstr( AV67SalExMtE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV65SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65SalExCoE), 6, 0));
      AV59SalExNln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59SalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV59SalExNln), 4, 0));
      AV60BarCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
      AV61BarCodReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
      AV62BarCodPar = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
      AV79SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79SalExObs", AV79SalExObs);
      AV66SalExKgE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66SalExKgE", GXutil.ltrimstr( AV66SalExKgE, 9, 2));
      AV65SalExCoE = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65SalExCoE), 6, 0));
      AV67SalExMtE = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67SalExMtE", GXutil.ltrimstr( AV67SalExMtE, 9, 2));
      AV63FasCodn = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63FasCodn", AV63FasCodn);
      AV64OrdLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64OrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64OrdLin), 4, 0));
      AV79SalExObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV79SalExObs", AV79SalExObs);
      AV82CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CliCod), 6, 0));
      AV83BarSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
      AV80BarColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80BarColNom", AV80BarColNom);
      AV81BarNomCli = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81BarNomCli", AV81BarNomCli);
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV102Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV102Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV102Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV137GXV2 = 1 ;
      while ( AV137GXV2 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV137GXV2));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXNLN") == 0 )
         {
            AV26TFSalExNln = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFSalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26TFSalExNln), 4, 0));
            AV27TFSalExNln_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFSalExNln_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27TFSalExNln_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV28TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFBarCod), 8, 0));
            AV29TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV30TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarCodReo", GXutil.str( AV30TFBarCodReo, 1, 0));
            AV31TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarCodReo_To", GXutil.str( AV31TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV32TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarCodPar", AV32TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV33TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarCodPar_Sel", AV33TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV34TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFCliCod), 6, 0));
            AV35TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV36TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarSer", AV36TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV37TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarSer_Sel", AV37TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV38TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarColNom", AV38TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV39TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFBarColNom_Sel", AV39TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV40TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFBarNomCli", AV40TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV41TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFBarNomCli_Sel", AV41TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODN") == 0 )
         {
            AV42TFFasCodn = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFFasCodn", AV42TFFasCodn);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODN_SEL") == 0 )
         {
            AV43TFFasCodn_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFFasCodn_Sel", AV43TFFasCodn_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFORDLIN") == 0 )
         {
            AV44TFOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44TFOrdLin), 4, 0));
            AV45TFOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45TFOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXCOE") == 0 )
         {
            AV46TFSalExCoE = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46TFSalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46TFSalExCoE), 6, 0));
            AV47TFSalExCoE_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47TFSalExCoE_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47TFSalExCoE_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXKGE") == 0 )
         {
            AV48TFSalExKgE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48TFSalExKgE", GXutil.ltrimstr( AV48TFSalExKgE, 9, 2));
            AV49TFSalExKgE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFSalExKgE_To", GXutil.ltrimstr( AV49TFSalExKgE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXMTE") == 0 )
         {
            AV50TFSalExMtE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFSalExMtE", GXutil.ltrimstr( AV50TFSalExMtE, 9, 2));
            AV51TFSalExMtE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFSalExMtE_To", GXutil.ltrimstr( AV51TFSalExMtE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXOBS") == 0 )
         {
            AV52TFSalExObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFSalExObs", AV52TFSalExObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXOBS_SEL") == 0 )
         {
            AV53TFSalExObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFSalExObs_Sel", AV53TFSalExObs_Sel);
         }
         AV137GXV2 = (int)(AV137GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char12[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarCodPar_Sel)==0), AV33TFBarCodPar_Sel, GXv_char12) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char1 = GXv_char12[0] ;
      GXt_char24 = "" ;
      GXv_char4[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFBarSer_Sel)==0), AV37TFBarSer_Sel, GXv_char4) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char24 = GXv_char4[0] ;
      GXt_char25 = "" ;
      GXv_char3[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFBarColNom_Sel)==0), AV39TFBarColNom_Sel, GXv_char3) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char25 = GXv_char3[0] ;
      GXt_char26 = "" ;
      GXv_char2[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFBarNomCli_Sel)==0), AV41TFBarNomCli_Sel, GXv_char2) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char26 = GXv_char2[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFFasCodn_Sel)==0), AV43TFFasCodn_Sel, GXv_char28) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFSalExObs_Sel)==0), AV53TFSalExObs_Sel, GXv_char30) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char29 = GXv_char30[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"||"+GXt_char24+"|"+GXt_char25+"|"+GXt_char26+"|"+GXt_char27+"|||||"+GXt_char29 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char29 = "" ;
      GXv_char30[0] = GXt_char29 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarCodPar)==0), AV32TFBarCodPar, GXv_char30) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char29 = GXv_char30[0] ;
      GXt_char27 = "" ;
      GXv_char28[0] = GXt_char27 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarSer)==0), AV36TFBarSer, GXv_char28) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char27 = GXv_char28[0] ;
      GXt_char26 = "" ;
      GXv_char12[0] = GXt_char26 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFBarColNom)==0), AV38TFBarColNom, GXv_char12) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char26 = GXv_char12[0] ;
      GXt_char25 = "" ;
      GXv_char4[0] = GXt_char25 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFBarNomCli)==0), AV40TFBarNomCli, GXv_char4) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char25 = GXv_char4[0] ;
      GXt_char24 = "" ;
      GXv_char3[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFFasCodn)==0), AV42TFFasCodn, GXv_char3) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char24 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFSalExObs)==0), AV52TFSalExObs, GXv_char2) ;
      trabajoexterno_detail_wkp_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV26TFSalExNln) ? "" : GXutil.str( AV26TFSalExNln, 4, 0))+"|"+((0==AV28TFBarCod) ? "" : GXutil.str( AV28TFBarCod, 8, 0))+"|"+((0==AV30TFBarCodReo) ? "" : GXutil.str( AV30TFBarCodReo, 1, 0))+"|"+GXt_char29+"|"+((0==AV34TFCliCod) ? "" : GXutil.str( AV34TFCliCod, 6, 0))+"|"+GXt_char27+"|"+GXt_char26+"|"+GXt_char25+"|"+GXt_char24+"|"+((0==AV44TFOrdLin) ? "" : GXutil.str( AV44TFOrdLin, 4, 0))+"|"+((0==AV46TFSalExCoE) ? "" : GXutil.str( AV46TFSalExCoE, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFSalExKgE)==0) ? "" : GXutil.str( AV48TFSalExKgE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFSalExMtE)==0) ? "" : GXutil.str( AV50TFSalExMtE, 9, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV27TFSalExNln_To) ? "" : GXutil.str( AV27TFSalExNln_To, 4, 0))+"|"+((0==AV29TFBarCod_To) ? "" : GXutil.str( AV29TFBarCod_To, 8, 0))+"|"+((0==AV31TFBarCodReo_To) ? "" : GXutil.str( AV31TFBarCodReo_To, 1, 0))+"||"+((0==AV35TFCliCod_To) ? "" : GXutil.str( AV35TFCliCod_To, 6, 0))+"|||||"+((0==AV45TFOrdLin_To) ? "" : GXutil.str( AV45TFOrdLin_To, 4, 0))+"|"+((0==AV47TFSalExCoE_To) ? "" : GXutil.str( AV47TFSalExCoE_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFSalExKgE_To)==0) ? "" : GXutil.str( AV49TFSalExKgE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFSalExMtE_To)==0) ? "" : GXutil.str( AV51TFSalExMtE_To, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV102Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFSALEXNLN", "", !((0==AV26TFSalExNln)&&(0==AV27TFSalExNln_To)), (short)(0), GXutil.trim( GXutil.str( AV26TFSalExNln, 4, 0)), GXutil.trim( GXutil.str( AV27TFSalExNln_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARCOD", "", !((0==AV28TFBarCod)&&(0==AV29TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV29TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARCODREO", "", !((0==AV30TFBarCodReo)&&(0==AV31TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV30TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV31TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARCODPAR", "", !(GXutil.strcmp("", AV32TFBarCodPar)==0), (short)(0), AV32TFBarCodPar, "", !(GXutil.strcmp("", AV33TFBarCodPar_Sel)==0), AV33TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFCLICOD", "", !((0==AV34TFCliCod)&&(0==AV35TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV35TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARSER", "", !(GXutil.strcmp("", AV36TFBarSer)==0), (short)(0), AV36TFBarSer, "", !(GXutil.strcmp("", AV37TFBarSer_Sel)==0), AV37TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV38TFBarColNom)==0), (short)(0), AV38TFBarColNom, "", !(GXutil.strcmp("", AV39TFBarColNom_Sel)==0), AV39TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV40TFBarNomCli)==0), (short)(0), AV40TFBarNomCli, "", !(GXutil.strcmp("", AV41TFBarNomCli_Sel)==0), AV41TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFFASCODN", "", !(GXutil.strcmp("", AV42TFFasCodn)==0), (short)(0), AV42TFFasCodn, "", !(GXutil.strcmp("", AV43TFFasCodn_Sel)==0), AV43TFFasCodn_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFORDLIN", "", !((0==AV44TFOrdLin)&&(0==AV45TFOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV44TFOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV45TFOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFSALEXCOE", "", !((0==AV46TFSalExCoE)&&(0==AV47TFSalExCoE_To)), (short)(0), GXutil.trim( GXutil.str( AV46TFSalExCoE, 6, 0)), GXutil.trim( GXutil.str( AV47TFSalExCoE_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFSALEXKGE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFSalExKgE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFSalExKgE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFSalExKgE, 9, 2)), GXutil.trim( GXutil.str( AV49TFSalExKgE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFSALEXMTE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFSalExMtE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFSalExMtE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFSalExMtE, 9, 2)), GXutil.trim( GXutil.str( AV51TFSalExMtE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFSALEXOBS", "", !(GXutil.strcmp("", AV52TFSalExObs)==0), (short)(0), AV52TFSalExObs, "", !(GXutil.strcmp("", AV53TFSalExObs_Sel)==0), AV53TFSalExObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV102Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV102Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TrabajosExternos.TrabajoExterno_Detail_TRN" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e212772( )
   {
      /* Prompt_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.seleccionhdrprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV70Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV60BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV61BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV62BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.ltrimstr(6,9,0))}, new String[] {"InEmprCod","InOutBarCod","InOutBarCodReo","InOutBarCodPar","InClicod","InBarsit"}) , new Object[] {"AV70Emprcod","AV60BarCod","AV61BarCodReo","AV62BarCodPar","",""});
      GXv_char30[0] = AV80BarColNom ;
      GXv_char28[0] = AV81BarNomCli ;
      GXv_int23[0] = AV82CliCod ;
      GXv_char12[0] = AV83BarSer ;
      GXv_int18[0] = AV65SalExCoE ;
      GXv_decimal22[0] = AV66SalExKgE ;
      GXv_decimal21[0] = AV67SalExMtE ;
      GXv_char4[0] = AV99BarUniMed ;
      new app.trabajosexternos.trabajoexterno_pzs_kgs_mts_masdatos(remoteHandle, context).execute( AV70Emprcod, AV60BarCod, AV61BarCodReo, AV62BarCodPar, GXv_char30, GXv_char28, GXv_int23, GXv_char12, GXv_int18, GXv_decimal22, GXv_decimal21, GXv_char4) ;
      trabajoexterno_detail_wkp_impl.this.AV80BarColNom = GXv_char30[0] ;
      trabajoexterno_detail_wkp_impl.this.AV81BarNomCli = GXv_char28[0] ;
      trabajoexterno_detail_wkp_impl.this.AV82CliCod = GXv_int23[0] ;
      trabajoexterno_detail_wkp_impl.this.AV83BarSer = GXv_char12[0] ;
      trabajoexterno_detail_wkp_impl.this.AV65SalExCoE = GXv_int18[0] ;
      trabajoexterno_detail_wkp_impl.this.AV66SalExKgE = GXv_decimal22[0] ;
      trabajoexterno_detail_wkp_impl.this.AV67SalExMtE = GXv_decimal21[0] ;
      trabajoexterno_detail_wkp_impl.this.AV99BarUniMed = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80BarColNom", AV80BarColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV81BarNomCli", AV81BarNomCli);
      httpContext.ajax_rsp_assign_attri("", false, "AV82CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV65SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65SalExCoE), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV66SalExKgE", GXutil.ltrimstr( AV66SalExKgE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV67SalExMtE", GXutil.ltrimstr( AV67SalExMtE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV99BarUniMed", AV99BarUniMed);
      /*  Sending Event outputs  */
   }

   public void e222772( )
   {
      /* Barcodpar_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV60BarCod > 0 )
      {
         GXv_char30[0] = AV70Emprcod ;
         GXv_int23[0] = AV60BarCod ;
         GXv_int13[0] = AV61BarCodReo ;
         GXv_char28[0] = AV62BarCodPar ;
         GXv_int11[0] = (byte)(AV76flaghdr) ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char30, GXv_int23, GXv_int13, GXv_char28, GXv_int11) ;
         trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char30[0] ;
         trabajoexterno_detail_wkp_impl.this.AV60BarCod = GXv_int23[0] ;
         trabajoexterno_detail_wkp_impl.this.AV61BarCodReo = GXv_int13[0] ;
         trabajoexterno_detail_wkp_impl.this.AV62BarCodPar = GXv_char28[0] ;
         trabajoexterno_detail_wkp_impl.this.AV76flaghdr = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV76flaghdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76flaghdr), 4, 0));
         if ( (0==AV76flaghdr) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº Hdr", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         GXv_int13[0] = AV78BarSit ;
         new app.phdrsituacion(remoteHandle, context).execute( AV70Emprcod, AV60BarCod, AV61BarCodReo, AV62BarCodPar, GXv_int13) ;
         trabajoexterno_detail_wkp_impl.this.AV78BarSit = GXv_int13[0] ;
         if ( AV78BarSit >= 9 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Hdr Cerrada", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         if ( ( AV76flaghdr == 1 ) && ( AV78BarSit < 9 ) )
         {
            GXv_char30[0] = AV80BarColNom ;
            GXv_char28[0] = AV81BarNomCli ;
            GXv_int23[0] = AV82CliCod ;
            GXv_char12[0] = AV83BarSer ;
            GXv_int18[0] = AV65SalExCoE ;
            GXv_decimal22[0] = AV66SalExKgE ;
            GXv_decimal21[0] = AV67SalExMtE ;
            GXv_char4[0] = AV99BarUniMed ;
            new app.trabajosexternos.trabajoexterno_pzs_kgs_mts_masdatos(remoteHandle, context).execute( AV70Emprcod, AV60BarCod, AV61BarCodReo, AV62BarCodPar, GXv_char30, GXv_char28, GXv_int23, GXv_char12, GXv_int18, GXv_decimal22, GXv_decimal21, GXv_char4) ;
            trabajoexterno_detail_wkp_impl.this.AV80BarColNom = GXv_char30[0] ;
            trabajoexterno_detail_wkp_impl.this.AV81BarNomCli = GXv_char28[0] ;
            trabajoexterno_detail_wkp_impl.this.AV82CliCod = GXv_int23[0] ;
            trabajoexterno_detail_wkp_impl.this.AV83BarSer = GXv_char12[0] ;
            trabajoexterno_detail_wkp_impl.this.AV65SalExCoE = GXv_int18[0] ;
            trabajoexterno_detail_wkp_impl.this.AV66SalExKgE = GXv_decimal22[0] ;
            trabajoexterno_detail_wkp_impl.this.AV67SalExMtE = GXv_decimal21[0] ;
            trabajoexterno_detail_wkp_impl.this.AV99BarUniMed = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80BarColNom", AV80BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarNomCli", AV81BarNomCli);
            httpContext.ajax_rsp_assign_attri("", false, "AV82CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
            httpContext.ajax_rsp_assign_attri("", false, "AV65SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65SalExCoE), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV66SalExKgE", GXutil.ltrimstr( AV66SalExKgE, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV67SalExMtE", GXutil.ltrimstr( AV67SalExMtE, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV99BarUniMed", AV99BarUniMed);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e232772( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      if ( AV60BarCod > 0 )
      {
         GXv_char30[0] = AV70Emprcod ;
         GXv_int23[0] = AV60BarCod ;
         GXv_int13[0] = AV61BarCodReo ;
         GXv_char28[0] = AV62BarCodPar ;
         GXv_int11[0] = (byte)(AV76flaghdr) ;
         new app.pexihdr(remoteHandle, context).execute( GXv_char30, GXv_int23, GXv_int13, GXv_char28, GXv_int11) ;
         trabajoexterno_detail_wkp_impl.this.AV70Emprcod = GXv_char30[0] ;
         trabajoexterno_detail_wkp_impl.this.AV60BarCod = GXv_int23[0] ;
         trabajoexterno_detail_wkp_impl.this.AV61BarCodReo = GXv_int13[0] ;
         trabajoexterno_detail_wkp_impl.this.AV62BarCodPar = GXv_char28[0] ;
         trabajoexterno_detail_wkp_impl.this.AV76flaghdr = GXv_int11[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV60BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReo", GXutil.str( AV61BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodPar", AV62BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV76flaghdr", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV76flaghdr), 4, 0));
         if ( (0==AV76flaghdr) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Nº Hdr", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         GXv_int13[0] = AV78BarSit ;
         new app.phdrsituacion(remoteHandle, context).execute( AV70Emprcod, AV60BarCod, AV61BarCodReo, AV62BarCodPar, GXv_int13) ;
         trabajoexterno_detail_wkp_impl.this.AV78BarSit = GXv_int13[0] ;
         if ( AV78BarSit >= 9 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Hdr Cerrada", ""));
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         if ( ( AV76flaghdr == 1 ) && ( AV78BarSit < 9 ) )
         {
            GXv_char30[0] = AV80BarColNom ;
            GXv_char28[0] = AV81BarNomCli ;
            GXv_int23[0] = AV82CliCod ;
            GXv_char12[0] = AV83BarSer ;
            GXv_int18[0] = AV65SalExCoE ;
            GXv_decimal22[0] = AV66SalExKgE ;
            GXv_decimal21[0] = AV67SalExMtE ;
            GXv_char4[0] = AV99BarUniMed ;
            new app.trabajosexternos.trabajoexterno_pzs_kgs_mts_masdatos(remoteHandle, context).execute( AV70Emprcod, AV60BarCod, AV61BarCodReo, AV62BarCodPar, GXv_char30, GXv_char28, GXv_int23, GXv_char12, GXv_int18, GXv_decimal22, GXv_decimal21, GXv_char4) ;
            trabajoexterno_detail_wkp_impl.this.AV80BarColNom = GXv_char30[0] ;
            trabajoexterno_detail_wkp_impl.this.AV81BarNomCli = GXv_char28[0] ;
            trabajoexterno_detail_wkp_impl.this.AV82CliCod = GXv_int23[0] ;
            trabajoexterno_detail_wkp_impl.this.AV83BarSer = GXv_char12[0] ;
            trabajoexterno_detail_wkp_impl.this.AV65SalExCoE = GXv_int18[0] ;
            trabajoexterno_detail_wkp_impl.this.AV66SalExKgE = GXv_decimal22[0] ;
            trabajoexterno_detail_wkp_impl.this.AV67SalExMtE = GXv_decimal21[0] ;
            trabajoexterno_detail_wkp_impl.this.AV99BarUniMed = GXv_char4[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80BarColNom", AV80BarColNom);
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarNomCli", AV81BarNomCli);
            httpContext.ajax_rsp_assign_attri("", false, "AV82CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82CliCod), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV83BarSer", AV83BarSer);
            httpContext.ajax_rsp_assign_attri("", false, "AV65SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65SalExCoE), 6, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV66SalExKgE", GXutil.ltrimstr( AV66SalExKgE, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV67SalExMtE", GXutil.ltrimstr( AV67SalExMtE, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV99BarUniMed", AV99BarUniMed);
         }
      }
      /*  Sending Event outputs  */
   }

   public void wb_table3_204_2772( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_204_2772e( true) ;
      }
      else
      {
         wb_table3_204_2772e( false) ;
      }
   }

   public void wb_table2_199_2772( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarlinea.setProperty("Title", Dvelop_confirmpanel_eliminarlinea_Title);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarlinea_Confirmtype);
         ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_199_2772e( true) ;
      }
      else
      {
         wb_table2_199_2772e( false) ;
      }
   }

   public void wb_table1_126_2772( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_126_2772e( true) ;
      }
      else
      {
         wb_table1_126_2772e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV70Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Emprcod", AV70Emprcod);
      AV71SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71SalExtAlb), 8, 0));
      AV90SalExtFec = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90SalExtFec", localUtil.format(AV90SalExtFec, "99/99/99"));
      AV91SalFhh = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91SalFhh", localUtil.ttoc( AV91SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV68ManCod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68ManCod), 4, 0));
      AV69ManNom = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69ManNom", AV69ManNom);
      AV93SalCodeID = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93SalCodeID", AV93SalCodeID);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALCODEID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93SalCodeID, ""))));
      AV94SalEnvAT = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94SalEnvAT", GXutil.str( AV94SalEnvAT, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALENVAT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV94SalEnvAT), "9")));
      AV96HashIN = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV96HashIN", AV96HashIN);
      AV97OkIN = ((Boolean) getParm(obj,9)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97OkIN", AV97OkIN);
      AV95Messages_jsonIN = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Messages_jsonIN", AV95Messages_jsonIN);
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
      pa2772( ) ;
      ws2772( ) ;
      we2772( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615912", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_detail_wkp.js", "?20268211615913", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1462( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_146_idx );
      edtSalExNln_Internalname = "SALEXNLN_"+sGXsfl_146_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_146_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_146_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_146_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_146_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_146_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_146_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_146_idx ;
      edtFasCodn_Internalname = "FASCODN_"+sGXsfl_146_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_146_idx ;
      edtOrdLin_Internalname = "ORDLIN_"+sGXsfl_146_idx ;
      edtSalExCoE_Internalname = "SALEXCOE_"+sGXsfl_146_idx ;
      edtSalExKgE_Internalname = "SALEXKGE_"+sGXsfl_146_idx ;
      edtSalExMtE_Internalname = "SALEXMTE_"+sGXsfl_146_idx ;
      edtSalExObs_Internalname = "SALEXOBS_"+sGXsfl_146_idx ;
      edtBarExt_Internalname = "BAREXT_"+sGXsfl_146_idx ;
   }

   public void subsflControlProps_fel_1462( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_146_fel_idx );
      edtSalExNln_Internalname = "SALEXNLN_"+sGXsfl_146_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_146_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_146_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_146_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_146_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_146_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_146_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_146_fel_idx ;
      edtFasCodn_Internalname = "FASCODN_"+sGXsfl_146_fel_idx ;
      edtavFasdsc_Internalname = "vFASDSC_"+sGXsfl_146_fel_idx ;
      edtOrdLin_Internalname = "ORDLIN_"+sGXsfl_146_fel_idx ;
      edtSalExCoE_Internalname = "SALEXCOE_"+sGXsfl_146_fel_idx ;
      edtSalExKgE_Internalname = "SALEXKGE_"+sGXsfl_146_fel_idx ;
      edtSalExMtE_Internalname = "SALEXMTE_"+sGXsfl_146_fel_idx ;
      edtSalExObs_Internalname = "SALEXOBS_"+sGXsfl_146_fel_idx ;
      edtBarExt_Internalname = "BAREXT_"+sGXsfl_146_fel_idx ;
   }

   public void sendrow_1462( )
   {
      subsflControlProps_1462( ) ;
      wb2770( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_146_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_146_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_146_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 147,'',false,'"+sGXsfl_146_idx+"',146)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_146_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV58GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV58GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV58GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_146_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,147);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV58GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_146_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExNln_Internalname,GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6248SalExNln), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExNln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCodn_Internalname,GXutil.rtrim( A6558FasCodn),GXutil.rtrim( localUtil.format( A6558FasCodn, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCodn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdsc_Enabled!=0)&&(edtavFasdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 157,'',false,'"+sGXsfl_146_idx+"',146)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsc_Internalname,GXutil.rtrim( AV98FasDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdsc_Enabled!=0)&&(edtavFasdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,157);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExCoE_Internalname,GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExCoE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExKgE_Internalname,GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6256SalExKgE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExKgE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExMtE_Internalname,GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6258SalExMtE, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExMtE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExObs_Internalname,GXutil.rtrim( A6249SalExObs),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSalExObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(146),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2772( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_146_idx = ((subGrid_Islastpage==1)&&(nGXsfl_146_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_146_idx+1) ;
         sGXsfl_146_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_146_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1462( ) ;
      }
      /* End function sendrow_1462 */
   }

   public void startgridcontrol146( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"146\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "KIlos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Control HDR,1=sal/2=env", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV58GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6558FasCodn));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV98FasDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A6249SalExObs));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), ".", "")));
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
      edtavSalextalb_Internalname = "vSALEXTALB" ;
      edtavMancod_Internalname = "vMANCOD" ;
      edtavMannom_Internalname = "vMANNOM" ;
      edtavSalcodeid_Internalname = "vSALCODEID" ;
      edtavSalenvat_Internalname = "vSALENVAT" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavSalexnln_Internalname = "vSALEXNLN" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      imgavPrompt_Internalname = "vPROMPT" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavFascodn_Internalname = "vFASCODN" ;
      edtavOrdlin_Internalname = "vORDLIN" ;
      edtavSalexcoe_Internalname = "vSALEXCOE" ;
      edtavSalexkge_Internalname = "vSALEXKGE" ;
      edtavSalexmte_Internalname = "vSALEXMTE" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      bttBtnfase1_Internalname = "BTNFASE1" ;
      bttBtnnfases_Internalname = "BTNNFASES" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavSalexobs_Internalname = "vSALEXOBS" ;
      edtavClicod_Internalname = "vCLICOD" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      edtavBarunimed_Internalname = "vBARUNIMED" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtnhashycomunicarat_Internalname = "BTNHASHYCOMUNICARAT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtSalExNln_Internalname = "SALEXNLN" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtFasCodn_Internalname = "FASCODN" ;
      edtavFasdsc_Internalname = "vFASDSC" ;
      edtOrdLin_Internalname = "ORDLIN" ;
      edtSalExCoE_Internalname = "SALEXCOE" ;
      edtSalExKgE_Internalname = "SALEXKGE" ;
      edtSalExMtE_Internalname = "SALEXMTE" ;
      edtSalExObs_Internalname = "SALEXOBS" ;
      edtBarExt_Internalname = "BAREXT" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      edtavMessages_jsonin_Internalname = "vMESSAGES_JSONIN" ;
      edtavHashin_Internalname = "vHASHIN" ;
      chkavOkin.setInternalname( "vOKIN" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtBarExt_Jsonclick = "" ;
      edtSalExObs_Jsonclick = "" ;
      edtSalExMtE_Jsonclick = "" ;
      edtSalExKgE_Jsonclick = "" ;
      edtSalExCoE_Jsonclick = "" ;
      edtOrdLin_Jsonclick = "" ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Visible = -1 ;
      edtavFasdsc_Enabled = 1 ;
      edtFasCodn_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtSalExNln_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      chkavOkin.setEnabled( 0 );
      edtavHashin_Enabled = 0 ;
      edtavMessages_jsonin_Enabled = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnhashycomunicarat_Enabled = 1 ;
      bttBtnconfirmar_Enabled = 1 ;
      edtavBarunimed_Jsonclick = "" ;
      edtavBarunimed_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavSalexobs_Jsonclick = "" ;
      edtavSalexobs_Enabled = 1 ;
      bttBtnfase1_Enabled = 1 ;
      edtavSalexmte_Jsonclick = "" ;
      edtavSalexmte_Enabled = 1 ;
      edtavSalexkge_Jsonclick = "" ;
      edtavSalexkge_Enabled = 1 ;
      edtavSalexcoe_Jsonclick = "" ;
      edtavSalexcoe_Enabled = 1 ;
      edtavOrdlin_Jsonclick = "" ;
      edtavOrdlin_Enabled = 1 ;
      edtavFascodn_Jsonclick = "" ;
      edtavFascodn_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      imgavPrompt_Jsonclick = "" ;
      imgavPrompt_gximage = "" ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      edtavSalexnln_Jsonclick = "" ;
      edtavSalexnln_Enabled = 1 ;
      divTableheader_Visible = 1 ;
      edtavSalenvat_Jsonclick = "" ;
      edtavSalenvat_Enabled = 0 ;
      edtavSalcodeid_Jsonclick = "" ;
      edtavSalcodeid_Enabled = 0 ;
      edtavMannom_Jsonclick = "" ;
      edtavMannom_Enabled = 0 ;
      edtavMancod_Jsonclick = "" ;
      edtavMancod_Enabled = 0 ;
      edtavSalextalb_Jsonclick = "" ;
      edtavSalextalb_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma la Linea?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la Linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      Ddo_grid_Datalistproc = "TrabajosExternos.TrabajoExterno_Detail_WKPGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|||||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T||T|T|T|T|||||T" ;
      Ddo_grid_Filterisrange = "T|T|T||T|||||T|T|T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Numeric|Character|Numeric|Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15" ;
      Ddo_grid_Columnids = "1:SalExNln|2:BarCod|3:BarCodReo|4:BarCodPar|5:CliCod|6:BarSer|7:BarColNom|8:BarNomCli|9:FasCodn|11:OrdLin|12:SalExCoE|13:SalExKgE|14:SalExMtE|15:SalExObs" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Control HASH", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "Agregar", "") ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion General", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Trabajo Externo (Detail)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_146_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV58GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV58GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58GridActions), 4, 0));
      }
      chkavOkin.setName( "vOKIN" );
      chkavOkin.setWebtags( "" );
      chkavOkin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOkin.getInternalname(), "TitleCaption", chkavOkin.getCaption(), true);
      chkavOkin.setCheckedValue( "false" );
      AV97OkIN = GXutil.strtobool( GXutil.booltostr( AV97OkIN)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV97OkIN", AV97OkIN);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV59SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e262772',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV58GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV98FasDsc',fld:'vFASDSC',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e272772',iparms:[{av:'cmbavGridactions'},{av:'AV58GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV58GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV59SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e142772',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'AV90SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'AV68ManCod',fld:'vMANCOD',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV90SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV59SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e162772',iparms:[{av:'AV59SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV64OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV63FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV77msgerr',fld:'vMSGERR',pic:''},{av:'AV76flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV77msgerr',fld:'vMSGERR',pic:''},{av:'AV63FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV76flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV64OrdLin',fld:'vORDLIN',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e152772',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'AV59SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV79SalExObs',fld:'vSALEXOBS',pic:''},{av:'AV66SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV65SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV67SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV63FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV64OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV68ManCod',fld:'vMANCOD',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV65SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV67SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV66SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV63FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV64OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV59SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV68ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV79SalExObs',fld:'vSALEXOBS',pic:''},{av:'AV82CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOHASHYCOMUNICARAT'","{handler:'e172772',iparms:[{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV90SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV91SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV87Cadena',fld:'vCADENA',pic:''},{av:'AV89Hash',fld:'vHASH',pic:''}]");
      setEventMetadata("'DOHASHYCOMUNICARAT'",",oparms:[{av:'AV89Hash',fld:'vHASH',pic:''},{av:'AV87Cadena',fld:'vCADENA',pic:''},{av:'AV91SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV90SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e182772',iparms:[{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV90SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV91SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[{av:'AV87Cadena',fld:'vCADENA',pic:''},{av:'AV91SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV90SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV89Hash',fld:'vHASH',pic:''}]}");
      setEventMetadata("'DOFASE1'","{handler:'e192772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV64OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV63FasCodn',fld:'vFASCODN',pic:'@!'}]");
      setEventMetadata("'DOFASE1'",",oparms:[{av:'AV63FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV64OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV59SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'}]}");
      setEventMetadata("'DONFASES'","{handler:'e202772',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV71SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV26TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV27TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV28TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV29TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV30TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV31TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV32TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV33TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV34TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV35TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV36TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV37TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV38TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV39TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV40TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV41TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV42TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV43TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV44TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV45TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV46TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV47TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV48TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV49TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV50TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV51TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV52TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV53TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV102Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV97OkIN',fld:'vOKIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV93SalCodeID',fld:'vSALCODEID',pic:'',hsh:true},{av:'AV94SalEnvAT',fld:'vSALENVAT',pic:'9',hsh:true},{av:'AV68ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV90SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV99BarUniMed',fld:'vBARUNIMED',pic:'@!'}]");
      setEventMetadata("'DONFASES'",",oparms:[{av:'AV59SalExNln',fld:'vSALEXNLN',pic:'ZZZ9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV79SalExObs',fld:'vSALEXOBS',pic:''},{av:'AV66SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV65SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV67SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV63FasCodn',fld:'vFASCODN',pic:'@!'},{av:'AV64OrdLin',fld:'vORDLIN',pic:'ZZZ9'},{av:'AV82CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV56GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV57GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e212772',iparms:[{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV99BarUniMed',fld:'vBARUNIMED',pic:'@!'},{av:'AV67SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV66SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV65SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV82CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''}]}");
      setEventMetadata("VBARCODPAR.CONTROLVALUECHANGED","{handler:'e222772',iparms:[{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV76flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'}]");
      setEventMetadata("VBARCODPAR.CONTROLVALUECHANGED",",oparms:[{av:'AV76flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV99BarUniMed',fld:'vBARUNIMED',pic:'@!'},{av:'AV67SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV66SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV65SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV82CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e232772',iparms:[{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV76flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'AV76flaghdr',fld:'vFLAGHDR',pic:'ZZZ9'},{av:'AV62BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV61BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV60BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV70Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV99BarUniMed',fld:'vBARUNIMED',pic:'@!'},{av:'AV67SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV66SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV65SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV83BarSer',fld:'vBARSER',pic:''},{av:'AV82CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV81BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''}]}");
      setEventMetadata("VALIDV_SALEXTALB","{handler:'validv_Salextalb',iparms:[]");
      setEventMetadata("VALIDV_SALEXTALB",",oparms:[]}");
      setEventMetadata("VALIDV_BARUNIMED","{handler:'validv_Barunimed',iparms:[]");
      setEventMetadata("VALIDV_BARUNIMED",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barext',iparms:[]");
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
      wcpOAV70Emprcod = "" ;
      wcpOAV90SalExtFec = GXutil.nullDate() ;
      wcpOAV91SalFhh = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV69ManNom = "" ;
      wcpOAV93SalCodeID = "" ;
      wcpOAV96HashIN = "" ;
      wcpOAV95Messages_jsonIN = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV70Emprcod = "" ;
      AV90SalExtFec = GXutil.nullDate() ;
      AV91SalFhh = GXutil.resetTime( GXutil.nullDate() );
      AV69ManNom = "" ;
      AV93SalCodeID = "" ;
      AV96HashIN = "" ;
      AV95Messages_jsonIN = "" ;
      AV32TFBarCodPar = "" ;
      AV33TFBarCodPar_Sel = "" ;
      AV36TFBarSer = "" ;
      AV37TFBarSer_Sel = "" ;
      AV38TFBarColNom = "" ;
      AV39TFBarColNom_Sel = "" ;
      AV40TFBarNomCli = "" ;
      AV41TFBarNomCli_Sel = "" ;
      AV42TFFasCodn = "" ;
      AV43TFFasCodn_Sel = "" ;
      AV48TFSalExKgE = DecimalUtil.ZERO ;
      AV49TFSalExKgE_To = DecimalUtil.ZERO ;
      AV50TFSalExMtE = DecimalUtil.ZERO ;
      AV51TFSalExMtE_To = DecimalUtil.ZERO ;
      AV52TFSalExObs = "" ;
      AV53TFSalExObs_Sel = "" ;
      AV102Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV54DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV77msgerr = "" ;
      AV87Cadena = "" ;
      AV89Hash = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV75Prompt = "" ;
      AV103Prompt_GXI = "" ;
      sImgUrl = "" ;
      AV62BarCodPar = "" ;
      AV63FasCodn = "" ;
      AV66SalExKgE = DecimalUtil.ZERO ;
      AV67SalExMtE = DecimalUtil.ZERO ;
      bttBtnfase1_Jsonclick = "" ;
      bttBtnnfases_Jsonclick = "" ;
      AV79SalExObs = "" ;
      AV83BarSer = "" ;
      AV80BarColNom = "" ;
      AV81BarNomCli = "" ;
      AV99BarUniMed = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnhashycomunicarat_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A6558FasCodn = "" ;
      AV98FasDsc = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6249SalExObs = "" ;
      scmdbuf = "" ;
      lV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = "" ;
      lV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = "" ;
      lV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = "" ;
      lV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = "" ;
      lV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = "" ;
      lV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = "" ;
      AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel = "" ;
      AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar = "" ;
      AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel = "" ;
      AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser = "" ;
      AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel = "" ;
      AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom = "" ;
      AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel = "" ;
      AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli = "" ;
      AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel = "" ;
      AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn = "" ;
      AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge = DecimalUtil.ZERO ;
      AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to = DecimalUtil.ZERO ;
      AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte = DecimalUtil.ZERO ;
      AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to = DecimalUtil.ZERO ;
      AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel = "" ;
      AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs = "" ;
      H02772_A396EmprCod = new String[] {""} ;
      H02772_A2253SalExtAlb = new int[1] ;
      H02772_A2265BarExt = new byte[1] ;
      H02772_n2265BarExt = new boolean[] {false} ;
      H02772_A6249SalExObs = new String[] {""} ;
      H02772_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02772_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02772_A6257SalExCoE = new int[1] ;
      H02772_A654OrdLin = new short[1] ;
      H02772_A6558FasCodn = new String[] {""} ;
      H02772_A1234BarNomCli = new String[] {""} ;
      H02772_A135BarColNom = new String[] {""} ;
      H02772_A212BarSer = new String[] {""} ;
      H02772_A252CliCod = new int[1] ;
      H02772_n252CliCod = new boolean[] {false} ;
      H02772_A130BarCodPar = new String[] {""} ;
      H02772_A132BarCodReo = new byte[1] ;
      H02772_A129BarCod = new int[1] ;
      H02772_A6248SalExNln = new short[1] ;
      H02773_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV72Station = "" ;
      AV73EmprNom = "" ;
      AV74UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_dtime15 = new java.util.Date[1] ;
      AV88firma = "" ;
      AV84Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message16 = new GXBaseCollection[1] ;
      GXv_boolean17 = new boolean[1] ;
      AV86Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      Gx_msg = "" ;
      AV134Emprcod_selected = "" ;
      GXv_int9 = new short[1] ;
      GXv_int19 = new short[1] ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_int10 = new int[1] ;
      GXv_int20 = new short[1] ;
      AV22Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char29 = "" ;
      GXt_char27 = "" ;
      GXt_char26 = "" ;
      GXt_char25 = "" ;
      GXt_char24 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState31 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXv_int11 = new byte[1] ;
      GXv_int13 = new byte[1] ;
      GXv_char30 = new String[1] ;
      GXv_char28 = new String[1] ;
      GXv_int23 = new int[1] ;
      GXv_char12 = new String[1] ;
      GXv_int18 = new int[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_decimal21 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_detail_wkp__default(),
         new Object[] {
             new Object[] {
            H02772_A396EmprCod, H02772_A2253SalExtAlb, H02772_A2265BarExt, H02772_n2265BarExt, H02772_A6249SalExObs, H02772_A6258SalExMtE, H02772_A6256SalExKgE, H02772_A6257SalExCoE, H02772_A654OrdLin, H02772_A6558FasCodn,
            H02772_A1234BarNomCli, H02772_A135BarColNom, H02772_A212BarSer, H02772_A252CliCod, H02772_n252CliCod, H02772_A130BarCodPar, H02772_A132BarCodReo, H02772_A129BarCod, H02772_A6248SalExNln
            }
            , new Object[] {
            H02773_AGRID_nRecordCount
            }
         }
      );
      AV102Pgmname = "TrabajosExternos.TrabajoExterno_Detail_WKP" ;
      /* GeneXus formulas. */
      AV102Pgmname = "TrabajosExternos.TrabajoExterno_Detail_WKP" ;
      Gx_err = (short)(0) ;
      edtavSalextalb_Enabled = 0 ;
      edtavMancod_Enabled = 0 ;
      edtavMannom_Enabled = 0 ;
      edtavSalcodeid_Enabled = 0 ;
      edtavSalenvat_Enabled = 0 ;
      edtavSalexnln_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBarunimed_Enabled = 0 ;
      edtavFasdsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      edtavMessages_jsonin_Enabled = 0 ;
      edtavHashin_Enabled = 0 ;
      chkavOkin.setEnabled( 0 );
   }

   private byte wcpOAV94SalEnvAT ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV94SalEnvAT ;
   private byte AV30TFBarCodReo ;
   private byte AV31TFBarCodReo_To ;
   private byte gxajaxcallmode ;
   private byte AV61BarCodReo ;
   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ;
   private byte AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ;
   private byte AV78BarSit ;
   private byte AV92Flag ;
   private byte GXv_int11[] ;
   private byte GXv_int13[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV68ManCod ;
   private short AV68ManCod ;
   private short AV26TFSalExNln ;
   private short AV27TFSalExNln_To ;
   private short AV44TFOrdLin ;
   private short AV45TFOrdLin_To ;
   private short AV12OrderedBy ;
   private short AV76flaghdr ;
   private short wbEnd ;
   private short wbStart ;
   private short AV59SalExNln ;
   private short AV64OrdLin ;
   private short AV58GridActions ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ;
   private short AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ;
   private short AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ;
   private short AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ;
   private short GXt_int8 ;
   private short AV136Salexnln_selected ;
   private short GXv_int9[] ;
   private short GXv_int19[] ;
   private short GXv_int20[] ;
   private int wcpOAV71SalExtAlb ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_146 ;
   private int AV71SalExtAlb ;
   private int nGXsfl_146_idx=1 ;
   private int AV28TFBarCod ;
   private int AV29TFBarCod_To ;
   private int AV34TFCliCod ;
   private int AV35TFCliCod_To ;
   private int AV46TFSalExCoE ;
   private int AV47TFSalExCoE_To ;
   private int A2253SalExtAlb ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavSalextalb_Enabled ;
   private int edtavMancod_Enabled ;
   private int edtavMannom_Enabled ;
   private int edtavSalcodeid_Enabled ;
   private int edtavSalenvat_Enabled ;
   private int divTableheader_Visible ;
   private int edtavSalexnln_Enabled ;
   private int AV60BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavFascodn_Enabled ;
   private int edtavOrdlin_Enabled ;
   private int AV65SalExCoE ;
   private int edtavSalexcoe_Enabled ;
   private int edtavSalexkge_Enabled ;
   private int edtavSalexmte_Enabled ;
   private int bttBtnfase1_Enabled ;
   private int edtavSalexobs_Enabled ;
   private int AV82CliCod ;
   private int edtavClicod_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarunimed_Enabled ;
   private int bttBtnconfirmar_Enabled ;
   private int bttBtnhashycomunicarat_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavMessages_jsonin_Enabled ;
   private int edtavHashin_Enabled ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A6257SalExCoE ;
   private int subGrid_Islastpage ;
   private int edtavFasdsc_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ;
   private int AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ;
   private int AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ;
   private int AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ;
   private int AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ;
   private int AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ;
   private int AV55PageToGo ;
   private int AV132GXV1 ;
   private int AV135Salextalb_selected ;
   private int GXv_int10[] ;
   private int AV137GXV2 ;
   private int GXv_int23[] ;
   private int GXv_int18[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavFasdsc_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV56GridCurrentPage ;
   private long AV57GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV48TFSalExKgE ;
   private java.math.BigDecimal AV49TFSalExKgE_To ;
   private java.math.BigDecimal AV50TFSalExMtE ;
   private java.math.BigDecimal AV51TFSalExMtE_To ;
   private java.math.BigDecimal AV66SalExKgE ;
   private java.math.BigDecimal AV67SalExMtE ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private java.math.BigDecimal AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ;
   private java.math.BigDecimal AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ;
   private java.math.BigDecimal AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ;
   private java.math.BigDecimal AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal21[] ;
   private String wcpOAV70Emprcod ;
   private String wcpOAV69ManNom ;
   private String wcpOAV93SalCodeID ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV70Emprcod ;
   private String AV69ManNom ;
   private String AV93SalCodeID ;
   private String sGXsfl_146_idx="0001" ;
   private String AV32TFBarCodPar ;
   private String AV33TFBarCodPar_Sel ;
   private String AV36TFBarSer ;
   private String AV37TFBarSer_Sel ;
   private String AV38TFBarColNom ;
   private String AV39TFBarColNom_Sel ;
   private String AV40TFBarNomCli ;
   private String AV41TFBarNomCli_Sel ;
   private String AV42TFFasCodn ;
   private String AV43TFFasCodn_Sel ;
   private String AV52TFSalExObs ;
   private String AV53TFSalExObs_Sel ;
   private String AV102Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV77msgerr ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmtype ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtavSalextalb_Internalname ;
   private String edtavSalextalb_Jsonclick ;
   private String edtavMancod_Internalname ;
   private String edtavMancod_Jsonclick ;
   private String edtavMannom_Internalname ;
   private String edtavMannom_Jsonclick ;
   private String edtavSalcodeid_Internalname ;
   private String edtavSalcodeid_Jsonclick ;
   private String edtavSalenvat_Internalname ;
   private String edtavSalenvat_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavSalexnln_Internalname ;
   private String TempTags ;
   private String edtavSalexnln_Jsonclick ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String imgavPrompt_Internalname ;
   private String imgavPrompt_gximage ;
   private String sImgUrl ;
   private String imgavPrompt_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String AV62BarCodPar ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavFascodn_Internalname ;
   private String AV63FasCodn ;
   private String edtavFascodn_Jsonclick ;
   private String edtavOrdlin_Internalname ;
   private String edtavOrdlin_Jsonclick ;
   private String edtavSalexcoe_Internalname ;
   private String edtavSalexcoe_Jsonclick ;
   private String edtavSalexkge_Internalname ;
   private String edtavSalexkge_Jsonclick ;
   private String edtavSalexmte_Internalname ;
   private String edtavSalexmte_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String bttBtnfase1_Internalname ;
   private String bttBtnfase1_Jsonclick ;
   private String bttBtnnfases_Internalname ;
   private String bttBtnnfases_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavSalexobs_Internalname ;
   private String AV79SalExObs ;
   private String edtavSalexobs_Jsonclick ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String AV83BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV80BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarnomcli_Internalname ;
   private String AV81BarNomCli ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarunimed_Internalname ;
   private String AV99BarUniMed ;
   private String edtavBarunimed_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnhashycomunicarat_Internalname ;
   private String bttBtnhashycomunicarat_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavMessages_jsonin_Internalname ;
   private String edtavHashin_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtSalExNln_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String edtCliCod_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String A6558FasCodn ;
   private String edtFasCodn_Internalname ;
   private String AV98FasDsc ;
   private String edtavFasdsc_Internalname ;
   private String edtOrdLin_Internalname ;
   private String edtSalExCoE_Internalname ;
   private String edtSalExKgE_Internalname ;
   private String edtSalExMtE_Internalname ;
   private String A6249SalExObs ;
   private String edtSalExObs_Internalname ;
   private String edtBarExt_Internalname ;
   private String scmdbuf ;
   private String lV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ;
   private String lV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ;
   private String lV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ;
   private String lV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ;
   private String lV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ;
   private String lV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ;
   private String AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ;
   private String AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ;
   private String AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ;
   private String AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ;
   private String AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ;
   private String AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ;
   private String AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ;
   private String AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ;
   private String AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ;
   private String AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ;
   private String AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ;
   private String AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ;
   private String hsh ;
   private String AV72Station ;
   private String AV73EmprNom ;
   private String AV74UsurCod ;
   private String Gx_msg ;
   private String AV134Emprcod_selected ;
   private String GXt_char29 ;
   private String GXt_char27 ;
   private String GXt_char26 ;
   private String GXt_char25 ;
   private String GXt_char24 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char30[] ;
   private String GXv_char28[] ;
   private String GXv_char12[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sGXsfl_146_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtSalExNln_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtFasCodn_Jsonclick ;
   private String edtavFasdsc_Jsonclick ;
   private String edtOrdLin_Jsonclick ;
   private String edtSalExCoE_Jsonclick ;
   private String edtSalExKgE_Jsonclick ;
   private String edtSalExMtE_Jsonclick ;
   private String edtSalExObs_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV91SalFhh ;
   private java.util.Date AV91SalFhh ;
   private java.util.Date GXv_dtime15[] ;
   private java.util.Date wcpOAV90SalExtFec ;
   private java.util.Date AV90SalExtFec ;
   private java.util.Date GXv_date14[] ;
   private boolean wcpOAV97OkIN ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV97OkIN ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean AV75Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n2265BarExt ;
   private boolean bGXsfl_146_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV85ok ;
   private boolean GXv_boolean17[] ;
   private String wcpOAV95Messages_jsonIN ;
   private String AV95Messages_jsonIN ;
   private String wcpOAV96HashIN ;
   private String AV96HashIN ;
   private String AV87Cadena ;
   private String AV89Hash ;
   private String AV103Prompt_GXI ;
   private String AV88firma ;
   private String AV75Prompt ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private ICheckbox chkavOkin ;
   private IDataStoreProvider pr_default ;
   private String[] H02772_A396EmprCod ;
   private int[] H02772_A2253SalExtAlb ;
   private byte[] H02772_A2265BarExt ;
   private boolean[] H02772_n2265BarExt ;
   private String[] H02772_A6249SalExObs ;
   private java.math.BigDecimal[] H02772_A6258SalExMtE ;
   private java.math.BigDecimal[] H02772_A6256SalExKgE ;
   private int[] H02772_A6257SalExCoE ;
   private short[] H02772_A654OrdLin ;
   private String[] H02772_A6558FasCodn ;
   private String[] H02772_A1234BarNomCli ;
   private String[] H02772_A135BarColNom ;
   private String[] H02772_A212BarSer ;
   private int[] H02772_A252CliCod ;
   private boolean[] H02772_n252CliCod ;
   private String[] H02772_A130BarCodPar ;
   private byte[] H02772_A132BarCodReo ;
   private int[] H02772_A129BarCod ;
   private short[] H02772_A6248SalExNln ;
   private long[] H02773_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV84Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message16[] ;
   private com.genexus.SdtMessages_Message AV86Message ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState31[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV54DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class trabajoexterno_detail_wkp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02772( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ,
                                          short AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ,
                                          int AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ,
                                          int AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ,
                                          byte AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ,
                                          byte AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ,
                                          String AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                          String AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                          int AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ,
                                          int AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ,
                                          String AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                          String AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                          String AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                          String AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                          String AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                          String AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                          String AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                          String AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                          short AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ,
                                          short AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ,
                                          int AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ,
                                          int AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                          java.math.BigDecimal AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                          java.math.BigDecimal AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                          String AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                          String AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70Emprcod ,
                                          int AV71SalExtAlb ,
                                          String A396EmprCod ,
                                          int A2253SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[35];
      Object[] GXv_Object33 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.SalExtAlb, T2.BarExt, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasCodn, T2.BarNomCli, T2.BarColNom, T2.BarSer, T2.CliCod," ;
      sSelectString += " T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln" ;
      sFromString = " FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SalExtAlb = ?)");
      if ( ! (0==AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int32[2] = (byte)(1) ;
      }
      if ( ! (0==AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
      }
      if ( ! (0==AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int32[4] = (byte)(1) ;
      }
      if ( ! (0==AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( ! (0==AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( ! (0==AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( ! (0==AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( ! (0==AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int32[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int32[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int32[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int32[19] = (byte)(1) ;
      }
      if ( ! (0==AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int32[20] = (byte)(1) ;
      }
      if ( ! (0==AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int32[21] = (byte)(1) ;
      }
      if ( ! (0==AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int32[22] = (byte)(1) ;
      }
      if ( ! (0==AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int32[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int32[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int32[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int32[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int32[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int32[29] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.SalExtAlb, T1.SalExNln" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExNln" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExNln DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.FasCodn" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasCodn DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.OrdLin" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.OrdLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExCoE" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExCoE DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExKgE" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExKgE DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExMtE" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExMtE DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExObs" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExObs DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.SalExtAlb, T1.SalExNln" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_H02773( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln ,
                                          short AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to ,
                                          int AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod ,
                                          int AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to ,
                                          byte AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo ,
                                          byte AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to ,
                                          String AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel ,
                                          String AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar ,
                                          int AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod ,
                                          int AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to ,
                                          String AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel ,
                                          String AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser ,
                                          String AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel ,
                                          String AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom ,
                                          String AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel ,
                                          String AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli ,
                                          String AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel ,
                                          String AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn ,
                                          short AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin ,
                                          short AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to ,
                                          int AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe ,
                                          int AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to ,
                                          java.math.BigDecimal AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge ,
                                          java.math.BigDecimal AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to ,
                                          java.math.BigDecimal AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte ,
                                          java.math.BigDecimal AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to ,
                                          String AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel ,
                                          String AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV70Emprcod ,
                                          int AV71SalExtAlb ,
                                          String A396EmprCod ,
                                          int A2253SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[30];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SalExtAlb = ?)");
      if ( ! (0==AV104Trabajosexternos_trabajoexterno_detail_wkpds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
      }
      if ( ! (0==AV105Trabajosexternos_trabajoexterno_detail_wkpds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int34[3] = (byte)(1) ;
      }
      if ( ! (0==AV106Trabajosexternos_trabajoexterno_detail_wkpds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int34[4] = (byte)(1) ;
      }
      if ( ! (0==AV107Trabajosexternos_trabajoexterno_detail_wkpds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int34[5] = (byte)(1) ;
      }
      if ( ! (0==AV108Trabajosexternos_trabajoexterno_detail_wkpds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( ! (0==AV109Trabajosexternos_trabajoexterno_detail_wkpds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV110Trabajosexternos_trabajoexterno_detail_wkpds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111Trabajosexternos_trabajoexterno_detail_wkpds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( ! (0==AV112Trabajosexternos_trabajoexterno_detail_wkpds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      if ( ! (0==AV113Trabajosexternos_trabajoexterno_detail_wkpds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int34[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV114Trabajosexternos_trabajoexterno_detail_wkpds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Trabajosexternos_trabajoexterno_detail_wkpds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int34[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV116Trabajosexternos_trabajoexterno_detail_wkpds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Trabajosexternos_trabajoexterno_detail_wkpds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int34[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV118Trabajosexternos_trabajoexterno_detail_wkpds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV119Trabajosexternos_trabajoexterno_detail_wkpds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int34[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV120Trabajosexternos_trabajoexterno_detail_wkpds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Trabajosexternos_trabajoexterno_detail_wkpds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int34[19] = (byte)(1) ;
      }
      if ( ! (0==AV122Trabajosexternos_trabajoexterno_detail_wkpds_19_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int34[20] = (byte)(1) ;
      }
      if ( ! (0==AV123Trabajosexternos_trabajoexterno_detail_wkpds_20_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int34[21] = (byte)(1) ;
      }
      if ( ! (0==AV124Trabajosexternos_trabajoexterno_detail_wkpds_21_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int34[22] = (byte)(1) ;
      }
      if ( ! (0==AV125Trabajosexternos_trabajoexterno_detail_wkpds_22_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int34[23] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Trabajosexternos_trabajoexterno_detail_wkpds_23_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int34[24] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Trabajosexternos_trabajoexterno_detail_wkpds_24_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int34[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Trabajosexternos_trabajoexterno_detail_wkpds_25_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int34[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Trabajosexternos_trabajoexterno_detail_wkpds_26_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int34[27] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV130Trabajosexternos_trabajoexterno_detail_wkpds_27_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[28] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Trabajosexternos_trabajoexterno_detail_wkpds_28_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int34[29] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
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
                  return conditional_H02772(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
            case 1 :
                  return conditional_H02773(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Number) dynConstraints[19]).shortValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.math.BigDecimal)dynConstraints[22] , (java.math.BigDecimal)dynConstraints[23] , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , ((Number) dynConstraints[28]).shortValue() , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , ((Number) dynConstraints[37]).shortValue() , ((Number) dynConstraints[38]).intValue() , (java.math.BigDecimal)dynConstraints[39] , (java.math.BigDecimal)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).shortValue() , ((Boolean) dynConstraints[43]).booleanValue() , (String)dynConstraints[44] , ((Number) dynConstraints[45]).intValue() , (String)dynConstraints[46] , ((Number) dynConstraints[47]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02772", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02773", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 40);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(14, 1);
               ((byte[]) buf[16])[0] = rslt.getByte(15);
               ((int[]) buf[17])[0] = rslt.getInt(16);
               ((short[]) buf[18])[0] = rslt.getShort(17);
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
                  stmt.setString(sIdx, (String)parms[35], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[37]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[38]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[41]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[42]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[56]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[58]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[62], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 40);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[68]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[32]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[33]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[37]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[51]).shortValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[52]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[53]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[54], 2);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[55], 2);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[56], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 40);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 40);
               }
               return;
      }
   }

}

