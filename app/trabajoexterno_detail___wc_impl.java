package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_detail___wc_impl extends GXWebComponent
{
   public trabajoexterno_detail___wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_detail___wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_detail___wc_impl.class ));
   }

   public trabajoexterno_detail___wc_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               AV50EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
               AV56SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56SalExtAlb), 8, 0));
               AV57SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57SalExtFec", localUtil.format(AV57SalExtFec, "99/99/99"));
               AV59SalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "SalFhh")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59SalFhh", localUtil.ttoc( AV59SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV58ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ManCod), 4, 0));
               AV60ManNom = httpContext.GetPar( "ManNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ManNom", AV60ManNom);
               AV53SalCodeID = httpContext.GetPar( "SalCodeID") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53SalCodeID", AV53SalCodeID);
               AV54SalEnvAT = (byte)(GXutil.lval( httpContext.GetPar( "SalEnvAT"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54SalEnvAT", GXutil.str( AV54SalEnvAT, 1, 0));
               AV61HashIN = httpContext.GetPar( "HashIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61HashIN", AV61HashIN);
               AV62okIN = GXutil.strtobool( httpContext.GetPar( "okIN")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62okIN", AV62okIN);
               AV63Messages_jsonIN = httpContext.GetPar( "Messages_jsonIN") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Messages_jsonIN", AV63Messages_jsonIN);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV50EmprCod,Integer.valueOf(AV56SalExtAlb),AV57SalExtFec,AV59SalFhh,Short.valueOf(AV58ManCod),AV60ManNom,AV53SalCodeID,Byte.valueOf(AV54SalEnvAT),AV61HashIN,Boolean.valueOf(AV62okIN),AV63Messages_jsonIN});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_17 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_17"))) ;
      nGXsfl_17_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_17_idx"))) ;
      sGXsfl_17_idx = httpContext.GetPar( "sGXsfl_17_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
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
      AV50EmprCod = httpContext.GetPar( "EmprCod") ;
      AV56SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
      AV16TFSalExNln = (short)(GXutil.lval( httpContext.GetPar( "TFSalExNln"))) ;
      AV17TFSalExNln_To = (short)(GXutil.lval( httpContext.GetPar( "TFSalExNln_To"))) ;
      AV18TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV19TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV20TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV21TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV22TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV23TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV24TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV25TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV26TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV27TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV28TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV29TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV30TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV31TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV32TFFasCodn = httpContext.GetPar( "TFFasCodn") ;
      AV33TFFasCodn_Sel = httpContext.GetPar( "TFFasCodn_Sel") ;
      AV64TFFasDscMn = httpContext.GetPar( "TFFasDscMn") ;
      AV65TFFasDscMn_Sel = httpContext.GetPar( "TFFasDscMn_Sel") ;
      AV34TFOrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFOrdLin"))) ;
      AV35TFOrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFOrdLin_To"))) ;
      AV36TFSalExCoE = (int)(GXutil.lval( httpContext.GetPar( "TFSalExCoE"))) ;
      AV37TFSalExCoE_To = (int)(GXutil.lval( httpContext.GetPar( "TFSalExCoE_To"))) ;
      AV38TFSalExKgE = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExKgE"), ".") ;
      AV39TFSalExKgE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExKgE_To"), ".") ;
      AV40TFSalExMtE = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExMtE"), ".") ;
      AV41TFSalExMtE_To = CommonUtil.decimalVal( httpContext.GetPar( "TFSalExMtE_To"), ".") ;
      AV42TFSalExObs = httpContext.GetPar( "TFSalExObs") ;
      AV43TFSalExObs_Sel = httpContext.GetPar( "TFSalExObs_Sel") ;
      AV68Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV57SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
      AV59SalFhh = localUtil.parseDTimeParm( httpContext.GetPar( "SalFhh")) ;
      AV58ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
      AV60ManNom = httpContext.GetPar( "ManNom") ;
      AV53SalCodeID = httpContext.GetPar( "SalCodeID") ;
      AV54SalEnvAT = (byte)(GXutil.lval( httpContext.GetPar( "SalEnvAT"))) ;
      AV61HashIN = httpContext.GetPar( "HashIN") ;
      AV62okIN = GXutil.strtobool( httpContext.GetPar( "okIN")) ;
      AV63Messages_jsonIN = httpContext.GetPar( "Messages_jsonIN") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV56SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV64TFFasDscMn, AV65TFFasDscMn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV68Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57SalExtFec, AV59SalFhh, AV58ManCod, AV60ManNom, AV53SalCodeID, AV54SalEnvAT, AV61HashIN, AV62okIN, AV63Messages_jsonIN, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa2AC2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( " EXHDPZ", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajoexterno_detail___wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV50EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV56SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV57SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV59SalFhh)),GXutil.URLEncode(GXutil.ltrimstr(AV58ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV60ManNom)),GXutil.URLEncode(GXutil.rtrim(AV53SalCodeID)),GXutil.URLEncode(GXutil.ltrimstr(AV54SalEnvAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV61HashIN)),GXutil.URLEncode(GXutil.booltostr(AV62okIN)),GXutil.URLEncode(GXutil.rtrim(AV63Messages_jsonIN))}, new String[] {"EmprCod","SalExtAlb","SalExtFec","SalFhh","ManCod","ManNom","SalCodeID","SalEnvAT","HashIN","okIN","Messages_jsonIN"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_SALEXTALB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TrabajoExterno_Detail___WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajoexterno_detail___wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50EmprCod", GXutil.rtrim( wcpOAV50EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56SalExtAlb", GXutil.ltrim( localUtil.ntoc( wcpOAV56SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV57SalExtFec", localUtil.dtoc( wcpOAV57SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV59SalFhh", localUtil.ttoc( wcpOAV59SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV58ManCod", GXutil.ltrim( localUtil.ntoc( wcpOAV58ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV60ManNom", GXutil.rtrim( wcpOAV60ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV53SalCodeID", GXutil.rtrim( wcpOAV53SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV54SalEnvAT", GXutil.ltrim( localUtil.ntoc( wcpOAV54SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV61HashIN", wcpOAV61HashIN);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"wcpOAV62okIN", wcpOAV62okIN);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV63Messages_jsonIN", wcpOAV63Messages_jsonIN);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXNLN", GXutil.ltrim( localUtil.ntoc( AV16TFSalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXNLN_TO", GXutil.ltrim( localUtil.ntoc( AV17TFSalExNln_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV18TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV19TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV20TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV21TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR", GXutil.rtrim( AV22TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCODPAR_SEL", GXutil.rtrim( AV23TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV24TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV25TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER", GXutil.rtrim( AV26TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARSER_SEL", GXutil.rtrim( AV27TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM", GXutil.rtrim( AV28TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARCOLNOM_SEL", GXutil.rtrim( AV29TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI", GXutil.rtrim( AV30TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFBARNOMCLI_SEL", GXutil.rtrim( AV31TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCODN", GXutil.rtrim( AV32TFFasCodn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASCODN_SEL", GXutil.rtrim( AV33TFFasCodn_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSCMN", GXutil.rtrim( AV64TFFasDscMn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFFASDSCMN_SEL", GXutil.rtrim( AV65TFFasDscMn_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFORDLIN", GXutil.ltrim( localUtil.ntoc( AV34TFOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFORDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV35TFOrdLin_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXCOE", GXutil.ltrim( localUtil.ntoc( AV36TFSalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXCOE_TO", GXutil.ltrim( localUtil.ntoc( AV37TFSalExCoE_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXKGE", GXutil.ltrim( localUtil.ntoc( AV38TFSalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXKGE_TO", GXutil.ltrim( localUtil.ntoc( AV39TFSalExKgE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXMTE", GXutil.ltrim( localUtil.ntoc( AV40TFSalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXMTE_TO", GXutil.ltrim( localUtil.ntoc( AV41TFSalExMtE_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXOBS", GXutil.rtrim( AV42TFSalExObs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFSALEXOBS_SEL", GXutil.rtrim( AV43TFSalExObs_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV50EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV56SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALEXTFEC", localUtil.dtoc( AV57SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALFHH", localUtil.ttoc( AV59SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANCOD", GXutil.ltrim( localUtil.ntoc( AV58ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANNOM", GXutil.rtrim( AV60ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALCODEID", GXutil.rtrim( AV53SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSALENVAT", GXutil.ltrim( localUtil.ntoc( AV54SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHASHIN", AV61HashIN);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vOKIN", AV62okIN);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMESSAGES_JSONIN", AV63Messages_jsonIN);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_SALEXTALB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
   }

   public void renderHtmlCloseForm2AC2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "TrabajoExterno_Detail___WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " EXHDPZ", "") ;
   }

   public void wb2AC0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.trabajoexterno_detail___wc");
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajoExterno_Detail___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol17( ) ;
      }
      if ( wbEnd == 17 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_17 = (int)(nGXsfl_17_idx-1) ;
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
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV68Pgmname), GXutil.rtrim( localUtil.format( AV68Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajoExterno_Detail___WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_47_2AC2( true) ;
      }
      else
      {
         wb_table1_47_2AC2( false) ;
      }
      return  ;
   }

   public void wb_table1_47_2AC2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 17 )
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
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2AC2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( " EXHDPZ", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strup2AC0( ) ;
         }
      }
   }

   public void ws2AC2( )
   {
      start2AC2( ) ;
      evt2AC2( ) ;
   }

   public void evt2AC2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2AC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2AC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e112AC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2AC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e122AC2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2AC0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactions.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2AC0( ) ;
                           }
                           AV69Trabajoexterno_detail___wcds_1_tfsalexnln = AV16TFSalExNln ;
                           AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
                           AV71Trabajoexterno_detail___wcds_3_tfbarcod = AV18TFBarCod ;
                           AV72Trabajoexterno_detail___wcds_4_tfbarcod_to = AV19TFBarCod_To ;
                           AV73Trabajoexterno_detail___wcds_5_tfbarcodreo = AV20TFBarCodReo ;
                           AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
                           AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = AV22TFBarCodPar ;
                           AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
                           AV77Trabajoexterno_detail___wcds_9_tfclicod = AV24TFCliCod ;
                           AV78Trabajoexterno_detail___wcds_10_tfclicod_to = AV25TFCliCod_To ;
                           AV79Trabajoexterno_detail___wcds_11_tfbarser = AV26TFBarSer ;
                           AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
                           AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = AV28TFBarColNom ;
                           AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
                           AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = AV30TFBarNomCli ;
                           AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
                           AV85Trabajoexterno_detail___wcds_17_tffascodn = AV32TFFasCodn ;
                           AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
                           AV87Trabajoexterno_detail___wcds_19_tffasdscmn = AV64TFFasDscMn ;
                           AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV65TFFasDscMn_Sel ;
                           AV89Trabajoexterno_detail___wcds_21_tfordlin = AV34TFOrdLin ;
                           AV90Trabajoexterno_detail___wcds_22_tfordlin_to = AV35TFOrdLin_To ;
                           AV91Trabajoexterno_detail___wcds_23_tfsalexcoe = AV36TFSalExCoE ;
                           AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV37TFSalExCoE_To ;
                           AV93Trabajoexterno_detail___wcds_25_tfsalexkge = AV38TFSalExKgE ;
                           AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV39TFSalExKgE_To ;
                           AV95Trabajoexterno_detail___wcds_27_tfsalexmte = AV40TFSalExMtE ;
                           AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV41TFSalExMtE_To ;
                           AV97Trabajoexterno_detail___wcds_29_tfsalexobs = AV42TFSalExObs ;
                           AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV43TFSalExObs_Sel ;
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VGRIDACTIONS.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup2AC0( ) ;
                           }
                           nGXsfl_17_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV48GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
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
                           AV14FasDsc = httpContext.cgiGet( edtavFasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsc_Internalname, AV14FasDsc);
                           A14410FasDscMn = httpContext.cgiGet( edtFasDscMn_Internalname) ;
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
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e132AC2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e142AC2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e152AC2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e162AC2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strup2AC0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactions.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
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

   public void we2AC2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm2AC2( ) ;
         }
      }
   }

   public void pa2AC2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
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
      subsflControlProps_172( ) ;
      while ( nGXsfl_17_idx <= nRC_GXsfl_17 )
      {
         sendrow_172( ) ;
         nGXsfl_17_idx = ((subGrid_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV50EmprCod ,
                                 int AV56SalExtAlb ,
                                 short AV16TFSalExNln ,
                                 short AV17TFSalExNln_To ,
                                 int AV18TFBarCod ,
                                 int AV19TFBarCod_To ,
                                 byte AV20TFBarCodReo ,
                                 byte AV21TFBarCodReo_To ,
                                 String AV22TFBarCodPar ,
                                 String AV23TFBarCodPar_Sel ,
                                 int AV24TFCliCod ,
                                 int AV25TFCliCod_To ,
                                 String AV26TFBarSer ,
                                 String AV27TFBarSer_Sel ,
                                 String AV28TFBarColNom ,
                                 String AV29TFBarColNom_Sel ,
                                 String AV30TFBarNomCli ,
                                 String AV31TFBarNomCli_Sel ,
                                 String AV32TFFasCodn ,
                                 String AV33TFFasCodn_Sel ,
                                 String AV64TFFasDscMn ,
                                 String AV65TFFasDscMn_Sel ,
                                 short AV34TFOrdLin ,
                                 short AV35TFOrdLin_To ,
                                 int AV36TFSalExCoE ,
                                 int AV37TFSalExCoE_To ,
                                 java.math.BigDecimal AV38TFSalExKgE ,
                                 java.math.BigDecimal AV39TFSalExKgE_To ,
                                 java.math.BigDecimal AV40TFSalExMtE ,
                                 java.math.BigDecimal AV41TFSalExMtE_To ,
                                 String AV42TFSalExObs ,
                                 String AV43TFSalExObs_Sel ,
                                 String AV68Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.util.Date AV57SalExtFec ,
                                 java.util.Date AV59SalFhh ,
                                 short AV58ManCod ,
                                 String AV60ManNom ,
                                 String AV53SalCodeID ,
                                 byte AV54SalEnvAT ,
                                 String AV61HashIN ,
                                 boolean AV62okIN ,
                                 String AV63Messages_jsonIN ,
                                 String A396EmprCod ,
                                 int A2253SalExtAlb ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e142AC2 ();
      GRID_nCurrentRecord = 0 ;
      rf2AC2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TrabajoExterno_Detail___WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajoexterno_detail___wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
   }

   public void refresh( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_17_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf2AC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV68Pgmname = "TrabajoExterno_Detail___WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
      Gx_err = (short)(0) ;
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2AC2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(17) ;
      /* Execute user event: Refresh */
      e142AC2 ();
      nGXsfl_17_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      bGXsfl_17_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_172( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV69Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                              Short.valueOf(AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                              Integer.valueOf(AV71Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                              Integer.valueOf(AV72Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                              Byte.valueOf(AV73Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                              Byte.valueOf(AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                              AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                              AV75Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                              Integer.valueOf(AV77Trabajoexterno_detail___wcds_9_tfclicod) ,
                                              Integer.valueOf(AV78Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                              AV80Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                              AV79Trabajoexterno_detail___wcds_11_tfbarser ,
                                              AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                              AV81Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                              AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                              AV83Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                              AV86Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                              AV85Trabajoexterno_detail___wcds_17_tffascodn ,
                                              AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                              AV87Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                              Short.valueOf(AV89Trabajoexterno_detail___wcds_21_tfordlin) ,
                                              Short.valueOf(AV90Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                              Integer.valueOf(AV91Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                              Integer.valueOf(AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                              AV93Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                              AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                              AV95Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                              AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                              AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                              AV97Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                              Short.valueOf(A6248SalExNln) ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              Integer.valueOf(A252CliCod) ,
                                              A212BarSer ,
                                              A135BarColNom ,
                                              A1234BarNomCli ,
                                              A6558FasCodn ,
                                              A14410FasDscMn ,
                                              Short.valueOf(A654OrdLin) ,
                                              Integer.valueOf(A6257SalExCoE) ,
                                              A6256SalExKgE ,
                                              A6258SalExMtE ,
                                              A6249SalExObs ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV50EmprCod ,
                                              Integer.valueOf(AV56SalExtAlb) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A2253SalExtAlb) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV75Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
         lV79Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
         lV81Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV81Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
         lV83Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
         lV85Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
         lV87Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
         lV97Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV97Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
         /* Using cursor H02AC2 */
         pr_default.execute(0, new Object[] {AV50EmprCod, Integer.valueOf(AV56SalExtAlb), Short.valueOf(AV69Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV71Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV72Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV73Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV75Trabajoexterno_detail___wcds_7_tfbarcodpar, AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV77Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV78Trabajoexterno_detail___wcds_10_tfclicod_to), lV79Trabajoexterno_detail___wcds_11_tfbarser, AV80Trabajoexterno_detail___wcds_12_tfbarser_sel, lV81Trabajoexterno_detail___wcds_13_tfbarcolnom, AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV83Trabajoexterno_detail___wcds_15_tfbarnomcli, AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV85Trabajoexterno_detail___wcds_17_tffascodn, AV86Trabajoexterno_detail___wcds_18_tffascodn_sel, lV87Trabajoexterno_detail___wcds_19_tffasdscmn, AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV89Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV90Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV91Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV93Trabajoexterno_detail___wcds_25_tfsalexkge, AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV95Trabajoexterno_detail___wcds_27_tfsalexmte, AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV97Trabajoexterno_detail___wcds_29_tfsalexobs, AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_17_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02AC2_A396EmprCod[0] ;
            A2253SalExtAlb = H02AC2_A2253SalExtAlb[0] ;
            A2265BarExt = H02AC2_A2265BarExt[0] ;
            n2265BarExt = H02AC2_n2265BarExt[0] ;
            A6249SalExObs = H02AC2_A6249SalExObs[0] ;
            A6258SalExMtE = H02AC2_A6258SalExMtE[0] ;
            A6256SalExKgE = H02AC2_A6256SalExKgE[0] ;
            A6257SalExCoE = H02AC2_A6257SalExCoE[0] ;
            A654OrdLin = H02AC2_A654OrdLin[0] ;
            A14410FasDscMn = H02AC2_A14410FasDscMn[0] ;
            A6558FasCodn = H02AC2_A6558FasCodn[0] ;
            A1234BarNomCli = H02AC2_A1234BarNomCli[0] ;
            A135BarColNom = H02AC2_A135BarColNom[0] ;
            A212BarSer = H02AC2_A212BarSer[0] ;
            A252CliCod = H02AC2_A252CliCod[0] ;
            n252CliCod = H02AC2_n252CliCod[0] ;
            A130BarCodPar = H02AC2_A130BarCodPar[0] ;
            A132BarCodReo = H02AC2_A132BarCodReo[0] ;
            A129BarCod = H02AC2_A129BarCod[0] ;
            A6248SalExNln = H02AC2_A6248SalExNln[0] ;
            A2265BarExt = H02AC2_A2265BarExt[0] ;
            n2265BarExt = H02AC2_n2265BarExt[0] ;
            A1234BarNomCli = H02AC2_A1234BarNomCli[0] ;
            A135BarColNom = H02AC2_A135BarColNom[0] ;
            A212BarSer = H02AC2_A212BarSer[0] ;
            A252CliCod = H02AC2_A252CliCod[0] ;
            n252CliCod = H02AC2_n252CliCod[0] ;
            e152AC2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(17) ;
         wb2AC0( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2AC2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_EMPRCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_SALEXTALB", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")));
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
      AV69Trabajoexterno_detail___wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV71Trabajoexterno_detail___wcds_3_tfbarcod = AV18TFBarCod ;
      AV72Trabajoexterno_detail___wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV73Trabajoexterno_detail___wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV77Trabajoexterno_detail___wcds_9_tfclicod = AV24TFCliCod ;
      AV78Trabajoexterno_detail___wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV79Trabajoexterno_detail___wcds_11_tfbarser = AV26TFBarSer ;
      AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV85Trabajoexterno_detail___wcds_17_tffascodn = AV32TFFasCodn ;
      AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV87Trabajoexterno_detail___wcds_19_tffasdscmn = AV64TFFasDscMn ;
      AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV65TFFasDscMn_Sel ;
      AV89Trabajoexterno_detail___wcds_21_tfordlin = AV34TFOrdLin ;
      AV90Trabajoexterno_detail___wcds_22_tfordlin_to = AV35TFOrdLin_To ;
      AV91Trabajoexterno_detail___wcds_23_tfsalexcoe = AV36TFSalExCoE ;
      AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV93Trabajoexterno_detail___wcds_25_tfsalexkge = AV38TFSalExKgE ;
      AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV95Trabajoexterno_detail___wcds_27_tfsalexmte = AV40TFSalExMtE ;
      AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV97Trabajoexterno_detail___wcds_29_tfsalexobs = AV42TFSalExObs ;
      AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV69Trabajoexterno_detail___wcds_1_tfsalexnln) ,
                                           Short.valueOf(AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to) ,
                                           Integer.valueOf(AV71Trabajoexterno_detail___wcds_3_tfbarcod) ,
                                           Integer.valueOf(AV72Trabajoexterno_detail___wcds_4_tfbarcod_to) ,
                                           Byte.valueOf(AV73Trabajoexterno_detail___wcds_5_tfbarcodreo) ,
                                           Byte.valueOf(AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to) ,
                                           AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                           AV75Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                           Integer.valueOf(AV77Trabajoexterno_detail___wcds_9_tfclicod) ,
                                           Integer.valueOf(AV78Trabajoexterno_detail___wcds_10_tfclicod_to) ,
                                           AV80Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                           AV79Trabajoexterno_detail___wcds_11_tfbarser ,
                                           AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                           AV81Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                           AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                           AV83Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                           AV86Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                           AV85Trabajoexterno_detail___wcds_17_tffascodn ,
                                           AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                           AV87Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                           Short.valueOf(AV89Trabajoexterno_detail___wcds_21_tfordlin) ,
                                           Short.valueOf(AV90Trabajoexterno_detail___wcds_22_tfordlin_to) ,
                                           Integer.valueOf(AV91Trabajoexterno_detail___wcds_23_tfsalexcoe) ,
                                           Integer.valueOf(AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to) ,
                                           AV93Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                           AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                           AV95Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                           AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                           AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                           AV97Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                           Short.valueOf(A6248SalExNln) ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           Integer.valueOf(A252CliCod) ,
                                           A212BarSer ,
                                           A135BarColNom ,
                                           A1234BarNomCli ,
                                           A6558FasCodn ,
                                           A14410FasDscMn ,
                                           Short.valueOf(A654OrdLin) ,
                                           Integer.valueOf(A6257SalExCoE) ,
                                           A6256SalExKgE ,
                                           A6258SalExMtE ,
                                           A6249SalExObs ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV50EmprCod ,
                                           Integer.valueOf(AV56SalExtAlb) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A2253SalExtAlb) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV75Trabajoexterno_detail___wcds_7_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV75Trabajoexterno_detail___wcds_7_tfbarcodpar), 1, "%") ;
      lV79Trabajoexterno_detail___wcds_11_tfbarser = GXutil.padr( GXutil.rtrim( AV79Trabajoexterno_detail___wcds_11_tfbarser), 16, "%") ;
      lV81Trabajoexterno_detail___wcds_13_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV81Trabajoexterno_detail___wcds_13_tfbarcolnom), 13, "%") ;
      lV83Trabajoexterno_detail___wcds_15_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV83Trabajoexterno_detail___wcds_15_tfbarnomcli), 13, "%") ;
      lV85Trabajoexterno_detail___wcds_17_tffascodn = GXutil.padr( GXutil.rtrim( AV85Trabajoexterno_detail___wcds_17_tffascodn), 8, "%") ;
      lV87Trabajoexterno_detail___wcds_19_tffasdscmn = GXutil.padr( GXutil.rtrim( AV87Trabajoexterno_detail___wcds_19_tffasdscmn), 30, "%") ;
      lV97Trabajoexterno_detail___wcds_29_tfsalexobs = GXutil.padr( GXutil.rtrim( AV97Trabajoexterno_detail___wcds_29_tfsalexobs), 40, "%") ;
      /* Using cursor H02AC3 */
      pr_default.execute(1, new Object[] {AV50EmprCod, Integer.valueOf(AV56SalExtAlb), Short.valueOf(AV69Trabajoexterno_detail___wcds_1_tfsalexnln), Short.valueOf(AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to), Integer.valueOf(AV71Trabajoexterno_detail___wcds_3_tfbarcod), Integer.valueOf(AV72Trabajoexterno_detail___wcds_4_tfbarcod_to), Byte.valueOf(AV73Trabajoexterno_detail___wcds_5_tfbarcodreo), Byte.valueOf(AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to), lV75Trabajoexterno_detail___wcds_7_tfbarcodpar, AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel, Integer.valueOf(AV77Trabajoexterno_detail___wcds_9_tfclicod), Integer.valueOf(AV78Trabajoexterno_detail___wcds_10_tfclicod_to), lV79Trabajoexterno_detail___wcds_11_tfbarser, AV80Trabajoexterno_detail___wcds_12_tfbarser_sel, lV81Trabajoexterno_detail___wcds_13_tfbarcolnom, AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel, lV83Trabajoexterno_detail___wcds_15_tfbarnomcli, AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel, lV85Trabajoexterno_detail___wcds_17_tffascodn, AV86Trabajoexterno_detail___wcds_18_tffascodn_sel, lV87Trabajoexterno_detail___wcds_19_tffasdscmn, AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel, Short.valueOf(AV89Trabajoexterno_detail___wcds_21_tfordlin), Short.valueOf(AV90Trabajoexterno_detail___wcds_22_tfordlin_to), Integer.valueOf(AV91Trabajoexterno_detail___wcds_23_tfsalexcoe), Integer.valueOf(AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to), AV93Trabajoexterno_detail___wcds_25_tfsalexkge, AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to, AV95Trabajoexterno_detail___wcds_27_tfsalexmte, AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to, lV97Trabajoexterno_detail___wcds_29_tfsalexobs, AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel});
      GRID_nRecordCount = H02AC3_AGRID_nRecordCount[0] ;
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
      AV69Trabajoexterno_detail___wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV71Trabajoexterno_detail___wcds_3_tfbarcod = AV18TFBarCod ;
      AV72Trabajoexterno_detail___wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV73Trabajoexterno_detail___wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV77Trabajoexterno_detail___wcds_9_tfclicod = AV24TFCliCod ;
      AV78Trabajoexterno_detail___wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV79Trabajoexterno_detail___wcds_11_tfbarser = AV26TFBarSer ;
      AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV85Trabajoexterno_detail___wcds_17_tffascodn = AV32TFFasCodn ;
      AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV87Trabajoexterno_detail___wcds_19_tffasdscmn = AV64TFFasDscMn ;
      AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV65TFFasDscMn_Sel ;
      AV89Trabajoexterno_detail___wcds_21_tfordlin = AV34TFOrdLin ;
      AV90Trabajoexterno_detail___wcds_22_tfordlin_to = AV35TFOrdLin_To ;
      AV91Trabajoexterno_detail___wcds_23_tfsalexcoe = AV36TFSalExCoE ;
      AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV93Trabajoexterno_detail___wcds_25_tfsalexkge = AV38TFSalExKgE ;
      AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV95Trabajoexterno_detail___wcds_27_tfsalexmte = AV40TFSalExMtE ;
      AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV97Trabajoexterno_detail___wcds_29_tfsalexobs = AV42TFSalExObs ;
      AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV56SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV64TFFasDscMn, AV65TFFasDscMn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV68Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57SalExtFec, AV59SalFhh, AV58ManCod, AV60ManNom, AV53SalCodeID, AV54SalEnvAT, AV61HashIN, AV62okIN, AV63Messages_jsonIN, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV69Trabajoexterno_detail___wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV71Trabajoexterno_detail___wcds_3_tfbarcod = AV18TFBarCod ;
      AV72Trabajoexterno_detail___wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV73Trabajoexterno_detail___wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV77Trabajoexterno_detail___wcds_9_tfclicod = AV24TFCliCod ;
      AV78Trabajoexterno_detail___wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV79Trabajoexterno_detail___wcds_11_tfbarser = AV26TFBarSer ;
      AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV85Trabajoexterno_detail___wcds_17_tffascodn = AV32TFFasCodn ;
      AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV87Trabajoexterno_detail___wcds_19_tffasdscmn = AV64TFFasDscMn ;
      AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV65TFFasDscMn_Sel ;
      AV89Trabajoexterno_detail___wcds_21_tfordlin = AV34TFOrdLin ;
      AV90Trabajoexterno_detail___wcds_22_tfordlin_to = AV35TFOrdLin_To ;
      AV91Trabajoexterno_detail___wcds_23_tfsalexcoe = AV36TFSalExCoE ;
      AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV93Trabajoexterno_detail___wcds_25_tfsalexkge = AV38TFSalExKgE ;
      AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV95Trabajoexterno_detail___wcds_27_tfsalexmte = AV40TFSalExMtE ;
      AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV97Trabajoexterno_detail___wcds_29_tfsalexobs = AV42TFSalExObs ;
      AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV43TFSalExObs_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV56SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV64TFFasDscMn, AV65TFFasDscMn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV68Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57SalExtFec, AV59SalFhh, AV58ManCod, AV60ManNom, AV53SalCodeID, AV54SalEnvAT, AV61HashIN, AV62okIN, AV63Messages_jsonIN, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV69Trabajoexterno_detail___wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV71Trabajoexterno_detail___wcds_3_tfbarcod = AV18TFBarCod ;
      AV72Trabajoexterno_detail___wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV73Trabajoexterno_detail___wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV77Trabajoexterno_detail___wcds_9_tfclicod = AV24TFCliCod ;
      AV78Trabajoexterno_detail___wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV79Trabajoexterno_detail___wcds_11_tfbarser = AV26TFBarSer ;
      AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV85Trabajoexterno_detail___wcds_17_tffascodn = AV32TFFasCodn ;
      AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV87Trabajoexterno_detail___wcds_19_tffasdscmn = AV64TFFasDscMn ;
      AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV65TFFasDscMn_Sel ;
      AV89Trabajoexterno_detail___wcds_21_tfordlin = AV34TFOrdLin ;
      AV90Trabajoexterno_detail___wcds_22_tfordlin_to = AV35TFOrdLin_To ;
      AV91Trabajoexterno_detail___wcds_23_tfsalexcoe = AV36TFSalExCoE ;
      AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV93Trabajoexterno_detail___wcds_25_tfsalexkge = AV38TFSalExKgE ;
      AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV95Trabajoexterno_detail___wcds_27_tfsalexmte = AV40TFSalExMtE ;
      AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV97Trabajoexterno_detail___wcds_29_tfsalexobs = AV42TFSalExObs ;
      AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      if ( GRID_nFirstRecordOnPage >= subgrid_fnc_recordsperpage( ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage-subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV56SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV64TFFasDscMn, AV65TFFasDscMn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV68Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57SalExtFec, AV59SalFhh, AV58ManCod, AV60ManNom, AV53SalCodeID, AV54SalEnvAT, AV61HashIN, AV62okIN, AV63Messages_jsonIN, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV69Trabajoexterno_detail___wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV71Trabajoexterno_detail___wcds_3_tfbarcod = AV18TFBarCod ;
      AV72Trabajoexterno_detail___wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV73Trabajoexterno_detail___wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV77Trabajoexterno_detail___wcds_9_tfclicod = AV24TFCliCod ;
      AV78Trabajoexterno_detail___wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV79Trabajoexterno_detail___wcds_11_tfbarser = AV26TFBarSer ;
      AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV85Trabajoexterno_detail___wcds_17_tffascodn = AV32TFFasCodn ;
      AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV87Trabajoexterno_detail___wcds_19_tffasdscmn = AV64TFFasDscMn ;
      AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV65TFFasDscMn_Sel ;
      AV89Trabajoexterno_detail___wcds_21_tfordlin = AV34TFOrdLin ;
      AV90Trabajoexterno_detail___wcds_22_tfordlin_to = AV35TFOrdLin_To ;
      AV91Trabajoexterno_detail___wcds_23_tfsalexcoe = AV36TFSalExCoE ;
      AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV93Trabajoexterno_detail___wcds_25_tfsalexkge = AV38TFSalExKgE ;
      AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV95Trabajoexterno_detail___wcds_27_tfsalexmte = AV40TFSalExMtE ;
      AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV97Trabajoexterno_detail___wcds_29_tfsalexobs = AV42TFSalExObs ;
      AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV43TFSalExObs_Sel ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV56SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV64TFFasDscMn, AV65TFFasDscMn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV68Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57SalExtFec, AV59SalFhh, AV58ManCod, AV60ManNom, AV53SalCodeID, AV54SalEnvAT, AV61HashIN, AV62okIN, AV63Messages_jsonIN, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV69Trabajoexterno_detail___wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV71Trabajoexterno_detail___wcds_3_tfbarcod = AV18TFBarCod ;
      AV72Trabajoexterno_detail___wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV73Trabajoexterno_detail___wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV77Trabajoexterno_detail___wcds_9_tfclicod = AV24TFCliCod ;
      AV78Trabajoexterno_detail___wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV79Trabajoexterno_detail___wcds_11_tfbarser = AV26TFBarSer ;
      AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV85Trabajoexterno_detail___wcds_17_tffascodn = AV32TFFasCodn ;
      AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV87Trabajoexterno_detail___wcds_19_tffasdscmn = AV64TFFasDscMn ;
      AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV65TFFasDscMn_Sel ;
      AV89Trabajoexterno_detail___wcds_21_tfordlin = AV34TFOrdLin ;
      AV90Trabajoexterno_detail___wcds_22_tfordlin_to = AV35TFOrdLin_To ;
      AV91Trabajoexterno_detail___wcds_23_tfsalexcoe = AV36TFSalExCoE ;
      AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV93Trabajoexterno_detail___wcds_25_tfsalexkge = AV38TFSalExKgE ;
      AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV95Trabajoexterno_detail___wcds_27_tfsalexmte = AV40TFSalExMtE ;
      AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV97Trabajoexterno_detail___wcds_29_tfsalexobs = AV42TFSalExObs ;
      AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV43TFSalExObs_Sel ;
      if ( nPageNo > 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV50EmprCod, AV56SalExtAlb, AV16TFSalExNln, AV17TFSalExNln_To, AV18TFBarCod, AV19TFBarCod_To, AV20TFBarCodReo, AV21TFBarCodReo_To, AV22TFBarCodPar, AV23TFBarCodPar_Sel, AV24TFCliCod, AV25TFCliCod_To, AV26TFBarSer, AV27TFBarSer_Sel, AV28TFBarColNom, AV29TFBarColNom_Sel, AV30TFBarNomCli, AV31TFBarNomCli_Sel, AV32TFFasCodn, AV33TFFasCodn_Sel, AV64TFFasDscMn, AV65TFFasDscMn_Sel, AV34TFOrdLin, AV35TFOrdLin_To, AV36TFSalExCoE, AV37TFSalExCoE_To, AV38TFSalExKgE, AV39TFSalExKgE_To, AV40TFSalExMtE, AV41TFSalExMtE_To, AV42TFSalExObs, AV43TFSalExObs_Sel, AV68Pgmname, AV12OrderedBy, AV13OrderedDsc, AV57SalExtFec, AV59SalFhh, AV58ManCod, AV60ManNom, AV53SalCodeID, AV54SalEnvAT, AV61HashIN, AV62okIN, AV63Messages_jsonIN, A396EmprCod, A2253SalExtAlb, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV68Pgmname = "TrabajoExterno_Detail___WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
      Gx_err = (short)(0) ;
      edtavFasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavFasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFasdsc_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2AC0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132AC2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_17 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_17"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV50EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV50EmprCod") ;
         wcpOAV56SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV57SalExtFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV57SalExtFec"), 0) ;
         wcpOAV59SalFhh = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV59SalFhh"), 0) ;
         wcpOAV58ManCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV60ManNom = httpContext.cgiGet( sPrefix+"wcpOAV60ManNom") ;
         wcpOAV53SalCodeID = httpContext.cgiGet( sPrefix+"wcpOAV53SalCodeID") ;
         wcpOAV54SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54SalEnvAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV61HashIN = httpContext.cgiGet( sPrefix+"wcpOAV61HashIN") ;
         wcpOAV62okIN = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV62okIN")) ;
         wcpOAV63Messages_jsonIN = httpContext.cgiGet( sPrefix+"wcpOAV63Messages_jsonIN") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Fixedcolumns") ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
         /* Read variables values. */
         AV68Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"TrabajoExterno_Detail___WC");
         AV68Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajoexterno_detail___wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e132AC2 ();
      if (returnInSub) return;
   }

   public void e132AC2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV49Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_detail___wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV49Station = GXt_char1 ;
      GXv_char2[0] = AV50EmprCod ;
      GXv_char3[0] = AV51EmprNom ;
      GXv_char4[0] = AV52UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV49Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_detail___wc_impl.this.AV50EmprCod = GXv_char2[0] ;
      trabajoexterno_detail___wc_impl.this.AV51EmprNom = GXv_char3[0] ;
      trabajoexterno_detail___wc_impl.this.AV52UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
   }

   public void e142AC2( )
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
      AV69Trabajoexterno_detail___wcds_1_tfsalexnln = AV16TFSalExNln ;
      AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to = AV17TFSalExNln_To ;
      AV71Trabajoexterno_detail___wcds_3_tfbarcod = AV18TFBarCod ;
      AV72Trabajoexterno_detail___wcds_4_tfbarcod_to = AV19TFBarCod_To ;
      AV73Trabajoexterno_detail___wcds_5_tfbarcodreo = AV20TFBarCodReo ;
      AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to = AV21TFBarCodReo_To ;
      AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = AV22TFBarCodPar ;
      AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = AV23TFBarCodPar_Sel ;
      AV77Trabajoexterno_detail___wcds_9_tfclicod = AV24TFCliCod ;
      AV78Trabajoexterno_detail___wcds_10_tfclicod_to = AV25TFCliCod_To ;
      AV79Trabajoexterno_detail___wcds_11_tfbarser = AV26TFBarSer ;
      AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = AV27TFBarSer_Sel ;
      AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = AV28TFBarColNom ;
      AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = AV29TFBarColNom_Sel ;
      AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = AV30TFBarNomCli ;
      AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = AV31TFBarNomCli_Sel ;
      AV85Trabajoexterno_detail___wcds_17_tffascodn = AV32TFFasCodn ;
      AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = AV33TFFasCodn_Sel ;
      AV87Trabajoexterno_detail___wcds_19_tffasdscmn = AV64TFFasDscMn ;
      AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = AV65TFFasDscMn_Sel ;
      AV89Trabajoexterno_detail___wcds_21_tfordlin = AV34TFOrdLin ;
      AV90Trabajoexterno_detail___wcds_22_tfordlin_to = AV35TFOrdLin_To ;
      AV91Trabajoexterno_detail___wcds_23_tfsalexcoe = AV36TFSalExCoE ;
      AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to = AV37TFSalExCoE_To ;
      AV93Trabajoexterno_detail___wcds_25_tfsalexkge = AV38TFSalExKgE ;
      AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = AV39TFSalExKgE_To ;
      AV95Trabajoexterno_detail___wcds_27_tfsalexmte = AV40TFSalExMtE ;
      AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = AV41TFSalExMtE_To ;
      AV97Trabajoexterno_detail___wcds_29_tfsalexobs = AV42TFSalExObs ;
      AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = AV43TFSalExObs_Sel ;
   }

   public void e112AC2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExNln") == 0 )
         {
            AV16TFSalExNln = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFSalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFSalExNln), 4, 0));
            AV17TFSalExNln_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFSalExNln_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFSalExNln_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV18TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18TFBarCod), 8, 0));
            AV19TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV20TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFBarCodReo", GXutil.str( AV20TFBarCodReo, 1, 0));
            AV21TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFBarCodReo_To", GXutil.str( AV21TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV22TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarCodPar", AV22TFBarCodPar);
            AV23TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarCodPar_Sel", AV23TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV24TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFCliCod), 6, 0));
            AV25TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV26TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarSer", AV26TFBarSer);
            AV27TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarSer_Sel", AV27TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV28TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarColNom", AV28TFBarColNom);
            AV29TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarColNom_Sel", AV29TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV30TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNomCli", AV30TFBarNomCli);
            AV31TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarNomCli_Sel", AV31TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasCodn") == 0 )
         {
            AV32TFFasCodn = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasCodn", AV32TFFasCodn);
            AV33TFFasCodn_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFFasCodn_Sel", AV33TFFasCodn_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "FasDscMn") == 0 )
         {
            AV64TFFasDscMn = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFFasDscMn", AV64TFFasDscMn);
            AV65TFFasDscMn_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFFasDscMn_Sel", AV65TFFasDscMn_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "OrdLin") == 0 )
         {
            AV34TFOrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFOrdLin), 4, 0));
            AV35TFOrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExCoE") == 0 )
         {
            AV36TFSalExCoE = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFSalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFSalExCoE), 6, 0));
            AV37TFSalExCoE_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFSalExCoE_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFSalExCoE_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExKgE") == 0 )
         {
            AV38TFSalExKgE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFSalExKgE", GXutil.ltrimstr( AV38TFSalExKgE, 9, 2));
            AV39TFSalExKgE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFSalExKgE_To", GXutil.ltrimstr( AV39TFSalExKgE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExMtE") == 0 )
         {
            AV40TFSalExMtE = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFSalExMtE", GXutil.ltrimstr( AV40TFSalExMtE, 9, 2));
            AV41TFSalExMtE_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFSalExMtE_To", GXutil.ltrimstr( AV41TFSalExMtE_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SalExObs") == 0 )
         {
            AV42TFSalExObs = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFSalExObs", AV42TFSalExObs);
            AV43TFSalExObs_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFSalExObs_Sel", AV43TFSalExObs_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e152AC2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      GXt_char1 = AV14FasDsc ;
      GXv_char4[0] = GXt_char1 ;
      new app.pfasdsc(remoteHandle, context).execute( A396EmprCod, A6558FasCodn, GXv_char4) ;
      trabajoexterno_detail___wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV14FasDsc = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavFasdsc_Internalname, AV14FasDsc);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(17) ;
      }
      sendrow_172( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_17_Refreshing )
      {
         httpContext.doAjaxLoad(17, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
   }

   public void e162AC2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV48GridActions == 1 )
      {
         /* Execute user subroutine: 'DO ELIMINARLINEA' */
         S152 ();
         if (returnInSub) return;
      }
      AV48GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
   }

   public void e122AC2( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ELIMINARLINEA' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ! (GXutil.strcmp("", AV53SalCodeID)==0) || ( AV54SalEnvAT == 3 ) )
      {
         httpContext.doAjaxRefreshCmp(sPrefix);
         lblTbmessage_Caption = httpContext.getMessage( "Atenção.Este guia foi enviado para AT ¡¡¡¡", "") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         AV55flag = (byte)(0) ;
         if ( A2265BarExt < 2 )
         {
            GXv_char4[0] = AV50EmprCod ;
            GXv_int8[0] = AV56SalExtAlb ;
            GXv_int9[0] = A6248SalExNln ;
            GXv_int10[0] = AV55flag ;
            new app.trabajosexternos.phdrde33(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int9, GXv_int10) ;
            trabajoexterno_detail___wc_impl.this.AV50EmprCod = GXv_char4[0] ;
            trabajoexterno_detail___wc_impl.this.AV56SalExtAlb = GXv_int8[0] ;
            trabajoexterno_detail___wc_impl.this.A6248SalExNln = GXv_int9[0] ;
            trabajoexterno_detail___wc_impl.this.AV55flag = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56SalExtAlb), 8, 0));
         }
         if ( AV55flag == 1 )
         {
            httpContext.doAjaxRefreshCmp(sPrefix);
            lblTbmessage_Caption = httpContext.getMessage( "Esta Linea ya esta Recepcionada¡¡¡", "") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         else
         {
            AV99Emprcod_selected = A396EmprCod ;
            AV100Salextalb_selected = A2253SalExtAlb ;
            AV101Salexnln_selected = A6248SalExNln ;
            this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer", "Confirm", "", new Object[] {});
         }
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S162( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV50EmprCod ;
      GXv_int8[0] = A129BarCod ;
      GXv_int10[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A6558FasCodn ;
      GXv_date11[0] = AV57SalExtFec ;
      GXv_int12[0] = (byte)(0) ;
      GXv_int13[0] = AV56SalExtAlb ;
      GXv_int9[0] = A6248SalExNln ;
      GXv_char14[0] = httpContext.getMessage( "HDR", "") ;
      new app.trabajosexternos.phdrex9copy1(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int10, GXv_char3, GXv_char2, GXv_date11, GXv_int12, GXv_int13, GXv_int9, GXv_char14) ;
      trabajoexterno_detail___wc_impl.this.AV50EmprCod = GXv_char4[0] ;
      trabajoexterno_detail___wc_impl.this.A129BarCod = GXv_int8[0] ;
      trabajoexterno_detail___wc_impl.this.A132BarCodReo = GXv_int10[0] ;
      trabajoexterno_detail___wc_impl.this.A130BarCodPar = GXv_char3[0] ;
      trabajoexterno_detail___wc_impl.this.A6558FasCodn = GXv_char2[0] ;
      trabajoexterno_detail___wc_impl.this.AV57SalExtFec = GXv_date11[0] ;
      trabajoexterno_detail___wc_impl.this.AV56SalExtAlb = GXv_int13[0] ;
      trabajoexterno_detail___wc_impl.this.A6248SalExNln = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57SalExtFec", localUtil.format(AV57SalExtFec, "99/99/99"));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56SalExtAlb), 8, 0));
      GXv_char14[0] = AV50EmprCod ;
      GXv_int9[0] = AV58ManCod ;
      GXv_char4[0] = A6558FasCodn ;
      GXv_char3[0] = httpContext.getMessage( "E", "") ;
      GXv_int13[0] = AV56SalExtAlb ;
      GXv_int8[0] = A129BarCod ;
      GXv_int12[0] = A132BarCodReo ;
      GXv_char2[0] = A130BarCodPar ;
      new app.trabajosexternos.pbmvhdr(remoteHandle, context).execute( GXv_char14, GXv_int9, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_int12, GXv_char2) ;
      trabajoexterno_detail___wc_impl.this.AV50EmprCod = GXv_char14[0] ;
      trabajoexterno_detail___wc_impl.this.AV58ManCod = GXv_int9[0] ;
      trabajoexterno_detail___wc_impl.this.A6558FasCodn = GXv_char4[0] ;
      trabajoexterno_detail___wc_impl.this.AV56SalExtAlb = GXv_int13[0] ;
      trabajoexterno_detail___wc_impl.this.A129BarCod = GXv_int8[0] ;
      trabajoexterno_detail___wc_impl.this.A132BarCodReo = GXv_int12[0] ;
      trabajoexterno_detail___wc_impl.this.A130BarCodPar = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ManCod), 4, 0));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56SalExtAlb), 8, 0));
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV15Session.getValue(AV68Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV68Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV15Session.getValue(AV68Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV102GXV1 = 1 ;
      while ( AV102GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV102GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXNLN") == 0 )
         {
            AV16TFSalExNln = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16TFSalExNln", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFSalExNln), 4, 0));
            AV17TFSalExNln_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17TFSalExNln_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFSalExNln_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV18TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18TFBarCod), 8, 0));
            AV19TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV20TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20TFBarCodReo", GXutil.str( AV20TFBarCodReo, 1, 0));
            AV21TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21TFBarCodReo_To", GXutil.str( AV21TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV22TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22TFBarCodPar", AV22TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV23TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23TFBarCodPar_Sel", AV23TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV24TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFCliCod), 6, 0));
            AV25TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV26TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26TFBarSer", AV26TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV27TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27TFBarSer_Sel", AV27TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV28TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFBarColNom", AV28TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV29TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFBarColNom_Sel", AV29TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV30TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFBarNomCli", AV30TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV31TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFBarNomCli_Sel", AV31TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODN") == 0 )
         {
            AV32TFFasCodn = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFFasCodn", AV32TFFasCodn);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASCODN_SEL") == 0 )
         {
            AV33TFFasCodn_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFFasCodn_Sel", AV33TFFasCodn_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSCMN") == 0 )
         {
            AV64TFFasDscMn = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFFasDscMn", AV64TFFasDscMn);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFASDSCMN_SEL") == 0 )
         {
            AV65TFFasDscMn_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFFasDscMn_Sel", AV65TFFasDscMn_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFORDLIN") == 0 )
         {
            AV34TFOrdLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFOrdLin), 4, 0));
            AV35TFOrdLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFOrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFOrdLin_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXCOE") == 0 )
         {
            AV36TFSalExCoE = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFSalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFSalExCoE), 6, 0));
            AV37TFSalExCoE_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFSalExCoE_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFSalExCoE_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXKGE") == 0 )
         {
            AV38TFSalExKgE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFSalExKgE", GXutil.ltrimstr( AV38TFSalExKgE, 9, 2));
            AV39TFSalExKgE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFSalExKgE_To", GXutil.ltrimstr( AV39TFSalExKgE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXMTE") == 0 )
         {
            AV40TFSalExMtE = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFSalExMtE", GXutil.ltrimstr( AV40TFSalExMtE, 9, 2));
            AV41TFSalExMtE_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFSalExMtE_To", GXutil.ltrimstr( AV41TFSalExMtE_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXOBS") == 0 )
         {
            AV42TFSalExObs = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42TFSalExObs", AV42TFSalExObs);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSALEXOBS_SEL") == 0 )
         {
            AV43TFSalExObs_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43TFSalExObs_Sel", AV43TFSalExObs_Sel);
         }
         AV102GXV1 = (int)(AV102GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char14[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV23TFBarCodPar_Sel)==0), AV23TFBarCodPar_Sel, GXv_char14) ;
      trabajoexterno_detail___wc_impl.this.GXt_char1 = GXv_char14[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFBarSer_Sel)==0), AV27TFBarSer_Sel, GXv_char4) ;
      trabajoexterno_detail___wc_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFBarColNom_Sel)==0), AV29TFBarColNom_Sel, GXv_char3) ;
      trabajoexterno_detail___wc_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarNomCli_Sel)==0), AV31TFBarNomCli_Sel, GXv_char2) ;
      trabajoexterno_detail___wc_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFFasCodn_Sel)==0), AV33TFFasCodn_Sel, GXv_char19) ;
      trabajoexterno_detail___wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFFasDscMn_Sel)==0), AV65TFFasDscMn_Sel, GXv_char21) ;
      trabajoexterno_detail___wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFSalExObs_Sel)==0), AV43TFSalExObs_Sel, GXv_char23) ;
      trabajoexterno_detail___wc_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "|||"+GXt_char1+"||"+GXt_char15+"|"+GXt_char16+"|"+GXt_char17+"|"+GXt_char18+"|"+GXt_char20+"|||||"+GXt_char22 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFBarCodPar)==0), AV22TFBarCodPar, GXv_char23) ;
      trabajoexterno_detail___wc_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFBarSer)==0), AV26TFBarSer, GXv_char21) ;
      trabajoexterno_detail___wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFBarColNom)==0), AV28TFBarColNom, GXv_char19) ;
      trabajoexterno_detail___wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char14[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarNomCli)==0), AV30TFBarNomCli, GXv_char14) ;
      trabajoexterno_detail___wc_impl.this.GXt_char17 = GXv_char14[0] ;
      GXt_char16 = "" ;
      GXv_char4[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFFasCodn)==0), AV32TFFasCodn, GXv_char4) ;
      trabajoexterno_detail___wc_impl.this.GXt_char16 = GXv_char4[0] ;
      GXt_char15 = "" ;
      GXv_char3[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFFasDscMn)==0), AV64TFFasDscMn, GXv_char3) ;
      trabajoexterno_detail___wc_impl.this.GXt_char15 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFSalExObs)==0), AV42TFSalExObs, GXv_char2) ;
      trabajoexterno_detail___wc_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV16TFSalExNln) ? "" : GXutil.str( AV16TFSalExNln, 4, 0))+"|"+((0==AV18TFBarCod) ? "" : GXutil.str( AV18TFBarCod, 8, 0))+"|"+((0==AV20TFBarCodReo) ? "" : GXutil.str( AV20TFBarCodReo, 1, 0))+"|"+GXt_char22+"|"+((0==AV24TFCliCod) ? "" : GXutil.str( AV24TFCliCod, 6, 0))+"|"+GXt_char20+"|"+GXt_char18+"|"+GXt_char17+"|"+GXt_char16+"|"+GXt_char15+"|"+((0==AV34TFOrdLin) ? "" : GXutil.str( AV34TFOrdLin, 4, 0))+"|"+((0==AV36TFSalExCoE) ? "" : GXutil.str( AV36TFSalExCoE, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFSalExKgE)==0) ? "" : GXutil.str( AV38TFSalExKgE, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFSalExMtE)==0) ? "" : GXutil.str( AV40TFSalExMtE, 9, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV17TFSalExNln_To) ? "" : GXutil.str( AV17TFSalExNln_To, 4, 0))+"|"+((0==AV19TFBarCod_To) ? "" : GXutil.str( AV19TFBarCod_To, 8, 0))+"|"+((0==AV21TFBarCodReo_To) ? "" : GXutil.str( AV21TFBarCodReo_To, 1, 0))+"||"+((0==AV25TFCliCod_To) ? "" : GXutil.str( AV25TFCliCod_To, 6, 0))+"||||||"+((0==AV35TFOrdLin_To) ? "" : GXutil.str( AV35TFOrdLin_To, 4, 0))+"|"+((0==AV37TFSalExCoE_To) ? "" : GXutil.str( AV37TFSalExCoE_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFSalExKgE_To)==0) ? "" : GXutil.str( AV39TFSalExKgE_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFSalExMtE_To)==0) ? "" : GXutil.str( AV41TFSalExMtE_To, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV15Session.getValue(AV68Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFSALEXNLN", "", !((0==AV16TFSalExNln)&&(0==AV17TFSalExNln_To)), (short)(0), GXutil.trim( GXutil.str( AV16TFSalExNln, 4, 0)), GXutil.trim( GXutil.str( AV17TFSalExNln_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOD", "", !((0==AV18TFBarCod)&&(0==AV19TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV18TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV19TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCODREO", "", !((0==AV20TFBarCodReo)&&(0==AV21TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV20TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV21TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCODPAR", "", !(GXutil.strcmp("", AV22TFBarCodPar)==0), (short)(0), AV22TFBarCodPar, "", !(GXutil.strcmp("", AV23TFBarCodPar_Sel)==0), AV23TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICOD", "", !((0==AV24TFCliCod)&&(0==AV25TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV24TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV25TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSER", "", !(GXutil.strcmp("", AV26TFBarSer)==0), (short)(0), AV26TFBarSer, "", !(GXutil.strcmp("", AV27TFBarSer_Sel)==0), AV27TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV28TFBarColNom)==0), (short)(0), AV28TFBarColNom, "", !(GXutil.strcmp("", AV29TFBarColNom_Sel)==0), AV29TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV30TFBarNomCli)==0), (short)(0), AV30TFBarNomCli, "", !(GXutil.strcmp("", AV31TFBarNomCli_Sel)==0), AV31TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFFASCODN", "", !(GXutil.strcmp("", AV32TFFasCodn)==0), (short)(0), AV32TFFasCodn, "", !(GXutil.strcmp("", AV33TFFasCodn_Sel)==0), AV33TFFasCodn_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFFASDSCMN", "", !(GXutil.strcmp("", AV64TFFasDscMn)==0), (short)(0), AV64TFFasDscMn, "", !(GXutil.strcmp("", AV65TFFasDscMn_Sel)==0), AV65TFFasDscMn_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFORDLIN", "", !((0==AV34TFOrdLin)&&(0==AV35TFOrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV34TFOrdLin, 4, 0)), GXutil.trim( GXutil.str( AV35TFOrdLin_To, 4, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFSALEXCOE", "", !((0==AV36TFSalExCoE)&&(0==AV37TFSalExCoE_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFSalExCoE, 6, 0)), GXutil.trim( GXutil.str( AV37TFSalExCoE_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFSALEXKGE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFSalExKgE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFSalExKgE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFSalExKgE, 9, 2)), GXutil.trim( GXutil.str( AV39TFSalExKgE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFSALEXMTE", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFSalExMtE)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFSalExMtE_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFSalExMtE, 9, 2)), GXutil.trim( GXutil.str( AV41TFSalExMtE_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFSALEXOBS", "", !(GXutil.strcmp("", AV42TFSalExObs)==0), (short)(0), AV42TFSalExObs, "", !(GXutil.strcmp("", AV43TFSalExObs_Sel)==0), AV43TFSalExObs_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      if ( ! (GXutil.strcmp("", AV50EmprCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50EmprCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV56SalExtAlb) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALEXTALB" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV56SalExtAlb, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV57SalExtFec)) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALEXTFEC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV57SalExtFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV59SalFhh) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALFHH" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.ttoc( AV59SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV58ManCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MANCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV58ManCod, 4, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV60ManNom)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MANNOM" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV60ManNom );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV53SalCodeID)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALCODEID" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV53SalCodeID );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV54SalEnvAT) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&SALENVAT" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV54SalEnvAT, 1, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV61HashIN)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HASHIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV61HashIN );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (false==AV62okIN) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OKIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.booltostr( AV62okIN) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV63Messages_jsonIN)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&MESSAGES_JSONIN" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV63Messages_jsonIN );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV68Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV68Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "EXHDPZ" );
      AV15Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_47_2AC2( boolean wbgen )
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
         ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_47_2AC2e( true) ;
      }
      else
      {
         wb_table1_47_2AC2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV50EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
      AV56SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56SalExtAlb), 8, 0));
      AV57SalExtFec = (java.util.Date)getParm(obj,2,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57SalExtFec", localUtil.format(AV57SalExtFec, "99/99/99"));
      AV59SalFhh = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59SalFhh", localUtil.ttoc( AV59SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV58ManCod = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ManCod), 4, 0));
      AV60ManNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ManNom", AV60ManNom);
      AV53SalCodeID = (String)getParm(obj,6,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53SalCodeID", AV53SalCodeID);
      AV54SalEnvAT = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54SalEnvAT", GXutil.str( AV54SalEnvAT, 1, 0));
      AV61HashIN = (String)getParm(obj,8,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61HashIN", AV61HashIN);
      AV62okIN = ((Boolean) getParm(obj,9,TypeConstants.BOOLEAN)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62okIN", AV62okIN);
      AV63Messages_jsonIN = (String)getParm(obj,10,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Messages_jsonIN", AV63Messages_jsonIN);
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
      pa2AC2( ) ;
      ws2AC2( ) ;
      we2AC2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlAV50EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV56SalExtAlb = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV57SalExtFec = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV59SalFhh = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV58ManCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV60ManNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV53SalCodeID = (String)getParm(obj,6,TypeConstants.STRING) ;
      sCtrlAV54SalEnvAT = (String)getParm(obj,7,TypeConstants.STRING) ;
      sCtrlAV61HashIN = (String)getParm(obj,8,TypeConstants.STRING) ;
      sCtrlAV62okIN = (String)getParm(obj,9,TypeConstants.STRING) ;
      sCtrlAV63Messages_jsonIN = (String)getParm(obj,10,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa2AC2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "trabajoexterno_detail___wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa2AC2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV50EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
         AV56SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56SalExtAlb), 8, 0));
         AV57SalExtFec = (java.util.Date)getParm(obj,4,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57SalExtFec", localUtil.format(AV57SalExtFec, "99/99/99"));
         AV59SalFhh = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59SalFhh", localUtil.ttoc( AV59SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV58ManCod = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ManCod), 4, 0));
         AV60ManNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ManNom", AV60ManNom);
         AV53SalCodeID = (String)getParm(obj,8,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53SalCodeID", AV53SalCodeID);
         AV54SalEnvAT = ((Number) GXutil.testNumericType( getParm(obj,9,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54SalEnvAT", GXutil.str( AV54SalEnvAT, 1, 0));
         AV61HashIN = (String)getParm(obj,10,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61HashIN", AV61HashIN);
         AV62okIN = ((Boolean) getParm(obj,11,TypeConstants.BOOLEAN)).booleanValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62okIN", AV62okIN);
         AV63Messages_jsonIN = (String)getParm(obj,12,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Messages_jsonIN", AV63Messages_jsonIN);
      }
      wcpOAV50EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV50EmprCod") ;
      wcpOAV56SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV57SalExtFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV57SalExtFec"), 0) ;
      wcpOAV59SalFhh = localUtil.ctot( httpContext.cgiGet( sPrefix+"wcpOAV59SalFhh"), 0) ;
      wcpOAV58ManCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV58ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV60ManNom = httpContext.cgiGet( sPrefix+"wcpOAV60ManNom") ;
      wcpOAV53SalCodeID = httpContext.cgiGet( sPrefix+"wcpOAV53SalCodeID") ;
      wcpOAV54SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV54SalEnvAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV61HashIN = httpContext.cgiGet( sPrefix+"wcpOAV61HashIN") ;
      wcpOAV62okIN = GXutil.strtobool( httpContext.cgiGet( sPrefix+"wcpOAV62okIN")) ;
      wcpOAV63Messages_jsonIN = httpContext.cgiGet( sPrefix+"wcpOAV63Messages_jsonIN") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV50EmprCod, wcpOAV50EmprCod) != 0 ) || ( AV56SalExtAlb != wcpOAV56SalExtAlb ) || !( GXutil.dateCompare(GXutil.resetTime(AV57SalExtFec), GXutil.resetTime(wcpOAV57SalExtFec)) ) || !( GXutil.dateCompare(AV59SalFhh, wcpOAV59SalFhh) ) || ( AV58ManCod != wcpOAV58ManCod ) || ( GXutil.strcmp(AV60ManNom, wcpOAV60ManNom) != 0 ) || ( GXutil.strcmp(AV53SalCodeID, wcpOAV53SalCodeID) != 0 ) || ( AV54SalEnvAT != wcpOAV54SalEnvAT ) || ( GXutil.strcmp(AV61HashIN, wcpOAV61HashIN) != 0 ) || ( AV62okIN != wcpOAV62okIN ) || ( GXutil.strcmp(AV63Messages_jsonIN, wcpOAV63Messages_jsonIN) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV50EmprCod = AV50EmprCod ;
      wcpOAV56SalExtAlb = AV56SalExtAlb ;
      wcpOAV57SalExtFec = AV57SalExtFec ;
      wcpOAV59SalFhh = AV59SalFhh ;
      wcpOAV58ManCod = AV58ManCod ;
      wcpOAV60ManNom = AV60ManNom ;
      wcpOAV53SalCodeID = AV53SalCodeID ;
      wcpOAV54SalEnvAT = AV54SalEnvAT ;
      wcpOAV61HashIN = AV61HashIN ;
      wcpOAV62okIN = AV62okIN ;
      wcpOAV63Messages_jsonIN = AV63Messages_jsonIN ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV50EmprCod = httpContext.cgiGet( sPrefix+"AV50EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV50EmprCod) > 0 )
      {
         AV50EmprCod = httpContext.cgiGet( sCtrlAV50EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50EmprCod", AV50EmprCod);
      }
      else
      {
         AV50EmprCod = httpContext.cgiGet( sPrefix+"AV50EmprCod_PARM") ;
      }
      sCtrlAV56SalExtAlb = httpContext.cgiGet( sPrefix+"AV56SalExtAlb_CTRL") ;
      if ( GXutil.len( sCtrlAV56SalExtAlb) > 0 )
      {
         AV56SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV56SalExtAlb), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56SalExtAlb), 8, 0));
      }
      else
      {
         AV56SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV56SalExtAlb_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV57SalExtFec = httpContext.cgiGet( sPrefix+"AV57SalExtFec_CTRL") ;
      if ( GXutil.len( sCtrlAV57SalExtFec) > 0 )
      {
         AV57SalExtFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV57SalExtFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57SalExtFec", localUtil.format(AV57SalExtFec, "99/99/99"));
      }
      else
      {
         AV57SalExtFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV57SalExtFec_PARM"), 0) ;
      }
      sCtrlAV59SalFhh = httpContext.cgiGet( sPrefix+"AV59SalFhh_CTRL") ;
      if ( GXutil.len( sCtrlAV59SalFhh) > 0 )
      {
         AV59SalFhh = localUtil.ctot( httpContext.cgiGet( sCtrlAV59SalFhh), 0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59SalFhh", localUtil.ttoc( AV59SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      else
      {
         AV59SalFhh = localUtil.ctot( httpContext.cgiGet( sPrefix+"AV59SalFhh_PARM"), 0) ;
      }
      sCtrlAV58ManCod = httpContext.cgiGet( sPrefix+"AV58ManCod_CTRL") ;
      if ( GXutil.len( sCtrlAV58ManCod) > 0 )
      {
         AV58ManCod = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV58ManCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58ManCod), 4, 0));
      }
      else
      {
         AV58ManCod = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV58ManCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV60ManNom = httpContext.cgiGet( sPrefix+"AV60ManNom_CTRL") ;
      if ( GXutil.len( sCtrlAV60ManNom) > 0 )
      {
         AV60ManNom = httpContext.cgiGet( sCtrlAV60ManNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60ManNom", AV60ManNom);
      }
      else
      {
         AV60ManNom = httpContext.cgiGet( sPrefix+"AV60ManNom_PARM") ;
      }
      sCtrlAV53SalCodeID = httpContext.cgiGet( sPrefix+"AV53SalCodeID_CTRL") ;
      if ( GXutil.len( sCtrlAV53SalCodeID) > 0 )
      {
         AV53SalCodeID = httpContext.cgiGet( sCtrlAV53SalCodeID) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53SalCodeID", AV53SalCodeID);
      }
      else
      {
         AV53SalCodeID = httpContext.cgiGet( sPrefix+"AV53SalCodeID_PARM") ;
      }
      sCtrlAV54SalEnvAT = httpContext.cgiGet( sPrefix+"AV54SalEnvAT_CTRL") ;
      if ( GXutil.len( sCtrlAV54SalEnvAT) > 0 )
      {
         AV54SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV54SalEnvAT), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54SalEnvAT", GXutil.str( AV54SalEnvAT, 1, 0));
      }
      else
      {
         AV54SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV54SalEnvAT_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV61HashIN = httpContext.cgiGet( sPrefix+"AV61HashIN_CTRL") ;
      if ( GXutil.len( sCtrlAV61HashIN) > 0 )
      {
         AV61HashIN = httpContext.cgiGet( sCtrlAV61HashIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61HashIN", AV61HashIN);
      }
      else
      {
         AV61HashIN = httpContext.cgiGet( sPrefix+"AV61HashIN_PARM") ;
      }
      sCtrlAV62okIN = httpContext.cgiGet( sPrefix+"AV62okIN_CTRL") ;
      if ( GXutil.len( sCtrlAV62okIN) > 0 )
      {
         AV62okIN = GXutil.strtobool( httpContext.cgiGet( sCtrlAV62okIN)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62okIN", AV62okIN);
      }
      else
      {
         AV62okIN = GXutil.strtobool( httpContext.cgiGet( sPrefix+"AV62okIN_PARM")) ;
      }
      sCtrlAV63Messages_jsonIN = httpContext.cgiGet( sPrefix+"AV63Messages_jsonIN_CTRL") ;
      if ( GXutil.len( sCtrlAV63Messages_jsonIN) > 0 )
      {
         AV63Messages_jsonIN = httpContext.cgiGet( sCtrlAV63Messages_jsonIN) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63Messages_jsonIN", AV63Messages_jsonIN);
      }
      else
      {
         AV63Messages_jsonIN = httpContext.cgiGet( sPrefix+"AV63Messages_jsonIN_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      pa2AC2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws2AC2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      ws2AC2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50EmprCod_PARM", GXutil.rtrim( AV50EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50EmprCod_CTRL", GXutil.rtrim( sCtrlAV50EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56SalExtAlb_PARM", GXutil.ltrim( localUtil.ntoc( AV56SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56SalExtAlb)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56SalExtAlb_CTRL", GXutil.rtrim( sCtrlAV56SalExtAlb));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57SalExtFec_PARM", localUtil.dtoc( AV57SalExtFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV57SalExtFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV57SalExtFec_CTRL", GXutil.rtrim( sCtrlAV57SalExtFec));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59SalFhh_PARM", localUtil.ttoc( AV59SalFhh, 10, 8, 0, 0, "/", ":", " "));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV59SalFhh)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV59SalFhh_CTRL", GXutil.rtrim( sCtrlAV59SalFhh));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58ManCod_PARM", GXutil.ltrim( localUtil.ntoc( AV58ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV58ManCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV58ManCod_CTRL", GXutil.rtrim( sCtrlAV58ManCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60ManNom_PARM", GXutil.rtrim( AV60ManNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV60ManNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV60ManNom_CTRL", GXutil.rtrim( sCtrlAV60ManNom));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53SalCodeID_PARM", GXutil.rtrim( AV53SalCodeID));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV53SalCodeID)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV53SalCodeID_CTRL", GXutil.rtrim( sCtrlAV53SalCodeID));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54SalEnvAT_PARM", GXutil.ltrim( localUtil.ntoc( AV54SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV54SalEnvAT)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV54SalEnvAT_CTRL", GXutil.rtrim( sCtrlAV54SalEnvAT));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61HashIN_PARM", AV61HashIN);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV61HashIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV61HashIN_CTRL", GXutil.rtrim( sCtrlAV61HashIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62okIN_PARM", GXutil.booltostr( AV62okIN));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV62okIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV62okIN_CTRL", GXutil.rtrim( sCtrlAV62okIN));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Messages_jsonIN_PARM", AV63Messages_jsonIN);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV63Messages_jsonIN)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV63Messages_jsonIN_CTRL", GXutil.rtrim( sCtrlAV63Messages_jsonIN));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      we2AC2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115552736", true, true);
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
      httpContext.AddJavascriptSource("trabajoexterno_detail___wc.js", "?202682115552736", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_172( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_17_idx );
      edtSalExNln_Internalname = sPrefix+"SALEXNLN_"+sGXsfl_17_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_17_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_17_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_17_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_17_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_17_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_17_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_17_idx ;
      edtFasCodn_Internalname = sPrefix+"FASCODN_"+sGXsfl_17_idx ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC_"+sGXsfl_17_idx ;
      edtFasDscMn_Internalname = sPrefix+"FASDSCMN_"+sGXsfl_17_idx ;
      edtOrdLin_Internalname = sPrefix+"ORDLIN_"+sGXsfl_17_idx ;
      edtSalExCoE_Internalname = sPrefix+"SALEXCOE_"+sGXsfl_17_idx ;
      edtSalExKgE_Internalname = sPrefix+"SALEXKGE_"+sGXsfl_17_idx ;
      edtSalExMtE_Internalname = sPrefix+"SALEXMTE_"+sGXsfl_17_idx ;
      edtSalExObs_Internalname = sPrefix+"SALEXOBS_"+sGXsfl_17_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS_"+sGXsfl_17_fel_idx );
      edtSalExNln_Internalname = sPrefix+"SALEXNLN_"+sGXsfl_17_fel_idx ;
      edtBarCod_Internalname = sPrefix+"BARCOD_"+sGXsfl_17_fel_idx ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO_"+sGXsfl_17_fel_idx ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR_"+sGXsfl_17_fel_idx ;
      edtCliCod_Internalname = sPrefix+"CLICOD_"+sGXsfl_17_fel_idx ;
      edtBarSer_Internalname = sPrefix+"BARSER_"+sGXsfl_17_fel_idx ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM_"+sGXsfl_17_fel_idx ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI_"+sGXsfl_17_fel_idx ;
      edtFasCodn_Internalname = sPrefix+"FASCODN_"+sGXsfl_17_fel_idx ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC_"+sGXsfl_17_fel_idx ;
      edtFasDscMn_Internalname = sPrefix+"FASDSCMN_"+sGXsfl_17_fel_idx ;
      edtOrdLin_Internalname = sPrefix+"ORDLIN_"+sGXsfl_17_fel_idx ;
      edtSalExCoE_Internalname = sPrefix+"SALEXCOE_"+sGXsfl_17_fel_idx ;
      edtSalExKgE_Internalname = sPrefix+"SALEXKGE_"+sGXsfl_17_fel_idx ;
      edtSalExMtE_Internalname = sPrefix+"SALEXMTE_"+sGXsfl_17_fel_idx ;
      edtSalExObs_Internalname = sPrefix+"SALEXOBS_"+sGXsfl_17_fel_idx ;
      edtBarExt_Internalname = sPrefix+"BAREXT_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wb2AC0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_17_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_17_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_17_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 18,'"+sPrefix+"',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_17_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV48GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV48GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV48GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONS.CLICK."+sGXsfl_17_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,18);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV48GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_17_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExNln_Internalname,GXutil.ltrim( localUtil.ntoc( A6248SalExNln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6248SalExNln), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExNln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCodn_Internalname,GXutil.rtrim( A6558FasCodn),GXutil.rtrim( localUtil.format( A6558FasCodn, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasCodn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavFasdsc_Enabled!=0)&&(edtavFasdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 28,'"+sPrefix+"',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFasdsc_Internalname,GXutil.rtrim( AV14FasDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavFasdsc_Enabled!=0)&&(edtavFasdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,28);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavFasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDscMn_Internalname,GXutil.rtrim( A14410FasDscMn),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtFasDscMn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A654OrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A654OrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExCoE_Internalname,GXutil.ltrim( localUtil.ntoc( A6257SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6257SalExCoE), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExCoE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExKgE_Internalname,GXutil.ltrim( localUtil.ntoc( A6256SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6256SalExKgE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExKgE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExMtE_Internalname,GXutil.ltrim( localUtil.ntoc( A6258SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A6258SalExMtE, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExMtE_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSalExObs_Internalname,GXutil.rtrim( A6249SalExObs),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtSalExObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarExt_Internalname,GXutil.ltrim( localUtil.ntoc( A2265BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2265BarExt), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarExt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2AC2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_17_idx = ((subGrid_Islastpage==1)&&(nGXsfl_17_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      /* End function sendrow_172 */
   }

   public void startgridcontrol17( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"17\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV48GridActions, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV14FasDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14410FasDscMn));
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
      lblTbmessage_Internalname = sPrefix+"TBMESSAGE" ;
      cmbavGridactions.setInternalname( sPrefix+"vGRIDACTIONS" );
      edtSalExNln_Internalname = sPrefix+"SALEXNLN" ;
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtFasCodn_Internalname = sPrefix+"FASCODN" ;
      edtavFasdsc_Internalname = sPrefix+"vFASDSC" ;
      edtFasDscMn_Internalname = sPrefix+"FASDSCMN" ;
      edtOrdLin_Internalname = sPrefix+"ORDLIN" ;
      edtSalExCoE_Internalname = sPrefix+"SALEXCOE" ;
      edtSalExKgE_Internalname = sPrefix+"SALEXKGE" ;
      edtSalExMtE_Internalname = sPrefix+"SALEXMTE" ;
      edtSalExObs_Internalname = sPrefix+"SALEXOBS" ;
      edtBarExt_Internalname = sPrefix+"BAREXT" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtBarExt_Jsonclick = "" ;
      edtSalExObs_Jsonclick = "" ;
      edtSalExMtE_Jsonclick = "" ;
      edtSalExKgE_Jsonclick = "" ;
      edtSalExCoE_Jsonclick = "" ;
      edtOrdLin_Jsonclick = "" ;
      edtFasDscMn_Jsonclick = "" ;
      edtavFasdsc_Jsonclick = "" ;
      edtavFasdsc_Visible = 0 ;
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
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la Linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      Ddo_grid_Datalistproc = "TrabajoExterno_Detail___WCGetFilterData" ;
      Ddo_grid_Datalisttype = "|||Dynamic||Dynamic|Dynamic|Dynamic|Dynamic|Dynamic|||||Dynamic" ;
      Ddo_grid_Includedatalist = "|||T||T|T|T|T|T|||||T" ;
      Ddo_grid_Filterisrange = "T|T|T||T||||||T|T|T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Numeric|Character|Numeric|Character|Character|Character|Character|Character|Numeric|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16" ;
      Ddo_grid_Columnids = "1:SalExNln|2:BarCod|3:BarCodReo|4:BarCodPar|5:CliCod|6:BarSer|7:BarColNom|8:BarNomCli|9:FasCodn|11:FasDscMn|12:OrdLin|13:SalExCoE|14:SalExKgE|15:SalExMtE|16:SalExObs" ;
      Ddo_grid_Gridinternalname = "" ;
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_17_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV59SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV60ManNom',fld:'vMANNOM',pic:''},{av:'AV53SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV54SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV61HashIN',fld:'vHASHIN',pic:''},{av:'AV62okIN',fld:'vOKIN',pic:''},{av:'AV63Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e112AC2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV59SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV60ManNom',fld:'vMANNOM',pic:''},{av:'AV53SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV54SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV61HashIN',fld:'vHASHIN',pic:''},{av:'AV62okIN',fld:'vOKIN',pic:''},{av:'AV63Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e152AC2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV14FasDsc',fld:'vFASDSC',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e162AC2',iparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV59SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV60ManNom',fld:'vMANNOM',pic:''},{av:'AV53SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV54SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV61HashIN',fld:'vHASHIN',pic:''},{av:'AV62okIN',fld:'vOKIN',pic:''},{av:'AV63Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A2265BarExt',fld:'BAREXT',pic:'9'},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV48GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e122AC2',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV59SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV60ManNom',fld:'vMANNOM',pic:''},{av:'AV53SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV54SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV61HashIN',fld:'vHASHIN',pic:''},{av:'AV62okIN',fld:'vOKIN',pic:''},{av:'AV63Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A6248SalExNln',fld:'SALEXNLN',pic:'ZZZ9'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'A6558FasCodn',fld:'FASCODN',pic:'@!'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV59SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV60ManNom',fld:'vMANNOM',pic:''},{av:'AV53SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV54SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV61HashIN',fld:'vHASHIN',pic:''},{av:'AV62okIN',fld:'vOKIN',pic:''},{av:'AV63Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV59SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV60ManNom',fld:'vMANNOM',pic:''},{av:'AV53SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV54SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV61HashIN',fld:'vHASHIN',pic:''},{av:'AV62okIN',fld:'vOKIN',pic:''},{av:'AV63Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV59SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV60ManNom',fld:'vMANNOM',pic:''},{av:'AV53SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV54SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV61HashIN',fld:'vHASHIN',pic:''},{av:'AV62okIN',fld:'vOKIN',pic:''},{av:'AV63Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'AV16TFSalExNln',fld:'vTFSALEXNLN',pic:'ZZZ9'},{av:'AV17TFSalExNln_To',fld:'vTFSALEXNLN_TO',pic:'ZZZ9'},{av:'AV18TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV19TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV20TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV21TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV22TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV23TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV24TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV25TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV26TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV27TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV28TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV29TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV30TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV31TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV32TFFasCodn',fld:'vTFFASCODN',pic:'@!'},{av:'AV33TFFasCodn_Sel',fld:'vTFFASCODN_SEL',pic:'@!'},{av:'AV64TFFasDscMn',fld:'vTFFASDSCMN',pic:''},{av:'AV65TFFasDscMn_Sel',fld:'vTFFASDSCMN_SEL',pic:''},{av:'AV34TFOrdLin',fld:'vTFORDLIN',pic:'ZZZ9'},{av:'AV35TFOrdLin_To',fld:'vTFORDLIN_TO',pic:'ZZZ9'},{av:'AV36TFSalExCoE',fld:'vTFSALEXCOE',pic:'ZZZZZ9'},{av:'AV37TFSalExCoE_To',fld:'vTFSALEXCOE_TO',pic:'ZZZZZ9'},{av:'AV38TFSalExKgE',fld:'vTFSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV39TFSalExKgE_To',fld:'vTFSALEXKGE_TO',pic:'ZZZZZ9.99'},{av:'AV40TFSalExMtE',fld:'vTFSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV41TFSalExMtE_To',fld:'vTFSALEXMTE_TO',pic:'ZZZZZ9.99'},{av:'AV42TFSalExObs',fld:'vTFSALEXOBS',pic:''},{av:'AV43TFSalExObs_Sel',fld:'vTFSALEXOBS_SEL',pic:''},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV50EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV57SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV59SalFhh',fld:'vSALFHH',pic:'99/99/99 99:99'},{av:'AV58ManCod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV60ManNom',fld:'vMANNOM',pic:''},{av:'AV53SalCodeID',fld:'vSALCODEID',pic:''},{av:'AV54SalEnvAT',fld:'vSALENVAT',pic:'9'},{av:'AV61HashIN',fld:'vHASHIN',pic:''},{av:'AV62okIN',fld:'vOKIN',pic:''},{av:'AV63Messages_jsonIN',fld:'vMESSAGES_JSONIN',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
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
      wcpOAV50EmprCod = "" ;
      wcpOAV57SalExtFec = GXutil.nullDate() ;
      wcpOAV59SalFhh = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV60ManNom = "" ;
      wcpOAV53SalCodeID = "" ;
      wcpOAV61HashIN = "" ;
      wcpOAV63Messages_jsonIN = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV50EmprCod = "" ;
      AV57SalExtFec = GXutil.nullDate() ;
      AV59SalFhh = GXutil.resetTime( GXutil.nullDate() );
      AV60ManNom = "" ;
      AV53SalCodeID = "" ;
      AV61HashIN = "" ;
      AV63Messages_jsonIN = "" ;
      AV22TFBarCodPar = "" ;
      AV23TFBarCodPar_Sel = "" ;
      AV26TFBarSer = "" ;
      AV27TFBarSer_Sel = "" ;
      AV28TFBarColNom = "" ;
      AV29TFBarColNom_Sel = "" ;
      AV30TFBarNomCli = "" ;
      AV31TFBarNomCli_Sel = "" ;
      AV32TFFasCodn = "" ;
      AV33TFFasCodn_Sel = "" ;
      AV64TFFasDscMn = "" ;
      AV65TFFasDscMn_Sel = "" ;
      AV38TFSalExKgE = DecimalUtil.ZERO ;
      AV39TFSalExKgE_To = DecimalUtil.ZERO ;
      AV40TFSalExMtE = DecimalUtil.ZERO ;
      AV41TFSalExMtE_To = DecimalUtil.ZERO ;
      AV42TFSalExObs = "" ;
      AV43TFSalExObs_Sel = "" ;
      AV68Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTbmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV75Trabajoexterno_detail___wcds_7_tfbarcodpar = "" ;
      AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel = "" ;
      AV79Trabajoexterno_detail___wcds_11_tfbarser = "" ;
      AV80Trabajoexterno_detail___wcds_12_tfbarser_sel = "" ;
      AV81Trabajoexterno_detail___wcds_13_tfbarcolnom = "" ;
      AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel = "" ;
      AV83Trabajoexterno_detail___wcds_15_tfbarnomcli = "" ;
      AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel = "" ;
      AV85Trabajoexterno_detail___wcds_17_tffascodn = "" ;
      AV86Trabajoexterno_detail___wcds_18_tffascodn_sel = "" ;
      AV87Trabajoexterno_detail___wcds_19_tffasdscmn = "" ;
      AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel = "" ;
      AV93Trabajoexterno_detail___wcds_25_tfsalexkge = DecimalUtil.ZERO ;
      AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to = DecimalUtil.ZERO ;
      AV95Trabajoexterno_detail___wcds_27_tfsalexmte = DecimalUtil.ZERO ;
      AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to = DecimalUtil.ZERO ;
      AV97Trabajoexterno_detail___wcds_29_tfsalexobs = "" ;
      AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel = "" ;
      A130BarCodPar = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A6558FasCodn = "" ;
      AV14FasDsc = "" ;
      A14410FasDscMn = "" ;
      A6256SalExKgE = DecimalUtil.ZERO ;
      A6258SalExMtE = DecimalUtil.ZERO ;
      A6249SalExObs = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV75Trabajoexterno_detail___wcds_7_tfbarcodpar = "" ;
      lV79Trabajoexterno_detail___wcds_11_tfbarser = "" ;
      lV81Trabajoexterno_detail___wcds_13_tfbarcolnom = "" ;
      lV83Trabajoexterno_detail___wcds_15_tfbarnomcli = "" ;
      lV85Trabajoexterno_detail___wcds_17_tffascodn = "" ;
      lV87Trabajoexterno_detail___wcds_19_tffasdscmn = "" ;
      lV97Trabajoexterno_detail___wcds_29_tfsalexobs = "" ;
      H02AC2_A396EmprCod = new String[] {""} ;
      H02AC2_A2253SalExtAlb = new int[1] ;
      H02AC2_A2265BarExt = new byte[1] ;
      H02AC2_n2265BarExt = new boolean[] {false} ;
      H02AC2_A6249SalExObs = new String[] {""} ;
      H02AC2_A6258SalExMtE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AC2_A6256SalExKgE = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02AC2_A6257SalExCoE = new int[1] ;
      H02AC2_A654OrdLin = new short[1] ;
      H02AC2_A14410FasDscMn = new String[] {""} ;
      H02AC2_A6558FasCodn = new String[] {""} ;
      H02AC2_A1234BarNomCli = new String[] {""} ;
      H02AC2_A135BarColNom = new String[] {""} ;
      H02AC2_A212BarSer = new String[] {""} ;
      H02AC2_A252CliCod = new int[1] ;
      H02AC2_n252CliCod = new boolean[] {false} ;
      H02AC2_A130BarCodPar = new String[] {""} ;
      H02AC2_A132BarCodReo = new byte[1] ;
      H02AC2_A129BarCod = new int[1] ;
      H02AC2_A6248SalExNln = new short[1] ;
      H02AC3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV49Station = "" ;
      AV51EmprNom = "" ;
      AV52UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV99Emprcod_selected = "" ;
      GXv_int10 = new byte[1] ;
      GXv_date11 = new java.util.Date[1] ;
      GXv_int9 = new short[1] ;
      GXv_int13 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int12 = new byte[1] ;
      AV15Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV50EmprCod = "" ;
      sCtrlAV56SalExtAlb = "" ;
      sCtrlAV57SalExtFec = "" ;
      sCtrlAV59SalFhh = "" ;
      sCtrlAV58ManCod = "" ;
      sCtrlAV60ManNom = "" ;
      sCtrlAV53SalCodeID = "" ;
      sCtrlAV54SalEnvAT = "" ;
      sCtrlAV61HashIN = "" ;
      sCtrlAV62okIN = "" ;
      sCtrlAV63Messages_jsonIN = "" ;
      subGrid_Linesclass = "" ;
      TempTags = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajoexterno_detail___wc__default(),
         new Object[] {
             new Object[] {
            H02AC2_A396EmprCod, H02AC2_A2253SalExtAlb, H02AC2_A2265BarExt, H02AC2_n2265BarExt, H02AC2_A6249SalExObs, H02AC2_A6258SalExMtE, H02AC2_A6256SalExKgE, H02AC2_A6257SalExCoE, H02AC2_A654OrdLin, H02AC2_A14410FasDscMn,
            H02AC2_A6558FasCodn, H02AC2_A1234BarNomCli, H02AC2_A135BarColNom, H02AC2_A212BarSer, H02AC2_A252CliCod, H02AC2_n252CliCod, H02AC2_A130BarCodPar, H02AC2_A132BarCodReo, H02AC2_A129BarCod, H02AC2_A6248SalExNln
            }
            , new Object[] {
            H02AC3_AGRID_nRecordCount
            }
         }
      );
      AV68Pgmname = "TrabajoExterno_Detail___WC" ;
      /* GeneXus formulas. */
      AV68Pgmname = "TrabajoExterno_Detail___WC" ;
      Gx_err = (short)(0) ;
      edtavFasdsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV54SalEnvAT ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV54SalEnvAT ;
   private byte AV20TFBarCodReo ;
   private byte AV21TFBarCodReo_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV73Trabajoexterno_detail___wcds_5_tfbarcodreo ;
   private byte AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to ;
   private byte A132BarCodReo ;
   private byte A2265BarExt ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV55flag ;
   private byte GXv_int10[] ;
   private byte GXv_int12[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV58ManCod ;
   private short AV58ManCod ;
   private short AV16TFSalExNln ;
   private short AV17TFSalExNln_To ;
   private short AV34TFOrdLin ;
   private short AV35TFOrdLin_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV69Trabajoexterno_detail___wcds_1_tfsalexnln ;
   private short AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to ;
   private short AV89Trabajoexterno_detail___wcds_21_tfordlin ;
   private short AV90Trabajoexterno_detail___wcds_22_tfordlin_to ;
   private short AV48GridActions ;
   private short A6248SalExNln ;
   private short A654OrdLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV101Salexnln_selected ;
   private short GXv_int9[] ;
   private int wcpOAV56SalExtAlb ;
   private int nRC_GXsfl_17 ;
   private int AV56SalExtAlb ;
   private int subGrid_Rows ;
   private int nGXsfl_17_idx=1 ;
   private int AV18TFBarCod ;
   private int AV19TFBarCod_To ;
   private int AV24TFCliCod ;
   private int AV25TFCliCod_To ;
   private int AV36TFSalExCoE ;
   private int AV37TFSalExCoE_To ;
   private int A2253SalExtAlb ;
   private int edtavPgmname_Enabled ;
   private int AV71Trabajoexterno_detail___wcds_3_tfbarcod ;
   private int AV72Trabajoexterno_detail___wcds_4_tfbarcod_to ;
   private int AV77Trabajoexterno_detail___wcds_9_tfclicod ;
   private int AV78Trabajoexterno_detail___wcds_10_tfclicod_to ;
   private int AV91Trabajoexterno_detail___wcds_23_tfsalexcoe ;
   private int AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A6257SalExCoE ;
   private int subGrid_Islastpage ;
   private int edtavFasdsc_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV100Salextalb_selected ;
   private int GXv_int13[] ;
   private int GXv_int8[] ;
   private int AV102GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavFasdsc_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV38TFSalExKgE ;
   private java.math.BigDecimal AV39TFSalExKgE_To ;
   private java.math.BigDecimal AV40TFSalExMtE ;
   private java.math.BigDecimal AV41TFSalExMtE_To ;
   private java.math.BigDecimal AV93Trabajoexterno_detail___wcds_25_tfsalexkge ;
   private java.math.BigDecimal AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to ;
   private java.math.BigDecimal AV95Trabajoexterno_detail___wcds_27_tfsalexmte ;
   private java.math.BigDecimal AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to ;
   private java.math.BigDecimal A6256SalExKgE ;
   private java.math.BigDecimal A6258SalExMtE ;
   private String wcpOAV50EmprCod ;
   private String wcpOAV60ManNom ;
   private String wcpOAV53SalCodeID ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV50EmprCod ;
   private String AV60ManNom ;
   private String AV53SalCodeID ;
   private String sGXsfl_17_idx="0001" ;
   private String AV22TFBarCodPar ;
   private String AV23TFBarCodPar_Sel ;
   private String AV26TFBarSer ;
   private String AV27TFBarSer_Sel ;
   private String AV28TFBarColNom ;
   private String AV29TFBarColNom_Sel ;
   private String AV30TFBarNomCli ;
   private String AV31TFBarNomCli_Sel ;
   private String AV32TFFasCodn ;
   private String AV33TFFasCodn_Sel ;
   private String AV64TFFasDscMn ;
   private String AV65TFFasDscMn_Sel ;
   private String AV42TFSalExObs ;
   private String AV43TFSalExObs_Sel ;
   private String AV68Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV75Trabajoexterno_detail___wcds_7_tfbarcodpar ;
   private String AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ;
   private String AV79Trabajoexterno_detail___wcds_11_tfbarser ;
   private String AV80Trabajoexterno_detail___wcds_12_tfbarser_sel ;
   private String AV81Trabajoexterno_detail___wcds_13_tfbarcolnom ;
   private String AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ;
   private String AV83Trabajoexterno_detail___wcds_15_tfbarnomcli ;
   private String AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ;
   private String AV85Trabajoexterno_detail___wcds_17_tffascodn ;
   private String AV86Trabajoexterno_detail___wcds_18_tffascodn_sel ;
   private String AV87Trabajoexterno_detail___wcds_19_tffasdscmn ;
   private String AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel ;
   private String AV97Trabajoexterno_detail___wcds_29_tfsalexobs ;
   private String AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel ;
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
   private String AV14FasDsc ;
   private String edtavFasdsc_Internalname ;
   private String A14410FasDscMn ;
   private String edtFasDscMn_Internalname ;
   private String edtOrdLin_Internalname ;
   private String edtSalExCoE_Internalname ;
   private String edtSalExKgE_Internalname ;
   private String edtSalExMtE_Internalname ;
   private String A6249SalExObs ;
   private String edtSalExObs_Internalname ;
   private String edtBarExt_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV75Trabajoexterno_detail___wcds_7_tfbarcodpar ;
   private String lV79Trabajoexterno_detail___wcds_11_tfbarser ;
   private String lV81Trabajoexterno_detail___wcds_13_tfbarcolnom ;
   private String lV83Trabajoexterno_detail___wcds_15_tfbarnomcli ;
   private String lV85Trabajoexterno_detail___wcds_17_tffascodn ;
   private String lV87Trabajoexterno_detail___wcds_19_tffasdscmn ;
   private String lV97Trabajoexterno_detail___wcds_29_tfsalexobs ;
   private String hsh ;
   private String AV49Station ;
   private String AV51EmprNom ;
   private String AV52UsurCod ;
   private String AV99Emprcod_selected ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char14[] ;
   private String GXt_char16 ;
   private String GXv_char4[] ;
   private String GXt_char15 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String sCtrlAV50EmprCod ;
   private String sCtrlAV56SalExtAlb ;
   private String sCtrlAV57SalExtFec ;
   private String sCtrlAV59SalFhh ;
   private String sCtrlAV58ManCod ;
   private String sCtrlAV60ManNom ;
   private String sCtrlAV53SalCodeID ;
   private String sCtrlAV54SalEnvAT ;
   private String sCtrlAV61HashIN ;
   private String sCtrlAV62okIN ;
   private String sCtrlAV63Messages_jsonIN ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String TempTags ;
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
   private String edtFasDscMn_Jsonclick ;
   private String edtOrdLin_Jsonclick ;
   private String edtSalExCoE_Jsonclick ;
   private String edtSalExKgE_Jsonclick ;
   private String edtSalExMtE_Jsonclick ;
   private String edtSalExObs_Jsonclick ;
   private String edtBarExt_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV59SalFhh ;
   private java.util.Date AV59SalFhh ;
   private java.util.Date wcpOAV57SalExtFec ;
   private java.util.Date AV57SalExtFec ;
   private java.util.Date GXv_date11[] ;
   private boolean wcpOAV62okIN ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV62okIN ;
   private boolean AV13OrderedDsc ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n2265BarExt ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String wcpOAV63Messages_jsonIN ;
   private String AV63Messages_jsonIN ;
   private String wcpOAV61HashIN ;
   private String AV61HashIN ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV15Session ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H02AC2_A396EmprCod ;
   private int[] H02AC2_A2253SalExtAlb ;
   private byte[] H02AC2_A2265BarExt ;
   private boolean[] H02AC2_n2265BarExt ;
   private String[] H02AC2_A6249SalExObs ;
   private java.math.BigDecimal[] H02AC2_A6258SalExMtE ;
   private java.math.BigDecimal[] H02AC2_A6256SalExKgE ;
   private int[] H02AC2_A6257SalExCoE ;
   private short[] H02AC2_A654OrdLin ;
   private String[] H02AC2_A14410FasDscMn ;
   private String[] H02AC2_A6558FasCodn ;
   private String[] H02AC2_A1234BarNomCli ;
   private String[] H02AC2_A135BarColNom ;
   private String[] H02AC2_A212BarSer ;
   private int[] H02AC2_A252CliCod ;
   private boolean[] H02AC2_n252CliCod ;
   private String[] H02AC2_A130BarCodPar ;
   private byte[] H02AC2_A132BarCodReo ;
   private int[] H02AC2_A129BarCod ;
   private short[] H02AC2_A6248SalExNln ;
   private long[] H02AC3_AGRID_nRecordCount ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class trabajoexterno_detail___wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02AC2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV69Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV71Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV72Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV73Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV75Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV77Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV78Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV80Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV79Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV81Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV83Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV86Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV85Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV87Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV89Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV90Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV91Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV93Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV95Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV97Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV50EmprCod ,
                                          int AV56SalExtAlb ,
                                          String A396EmprCod ,
                                          int A2253SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[37];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.EmprCod, T1.SalExtAlb, T2.BarExt, T1.SalExObs, T1.SalExMtE, T1.SalExKgE, T1.SalExCoE, T1.OrdLin, T1.FasDscMn, T1.FasCodn, T2.BarNomCli," ;
      sSelectString += " T2.BarColNom, T2.BarSer, T2.CliCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.SalExNln" ;
      sFromString = " FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SalExtAlb = ?)");
      if ( ! (0==AV69Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (0==AV73Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (0==AV91Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (0==AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV97Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
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
         sOrderString += " ORDER BY T1.FasDscMn" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.FasDscMn DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.OrdLin" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.OrdLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExCoE" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExCoE DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExKgE" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExKgE DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExMtE" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExMtE DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.SalExObs" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.SalExObs DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.SalExtAlb, T1.SalExNln" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H02AC3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV69Trabajoexterno_detail___wcds_1_tfsalexnln ,
                                          short AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to ,
                                          int AV71Trabajoexterno_detail___wcds_3_tfbarcod ,
                                          int AV72Trabajoexterno_detail___wcds_4_tfbarcod_to ,
                                          byte AV73Trabajoexterno_detail___wcds_5_tfbarcodreo ,
                                          byte AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to ,
                                          String AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel ,
                                          String AV75Trabajoexterno_detail___wcds_7_tfbarcodpar ,
                                          int AV77Trabajoexterno_detail___wcds_9_tfclicod ,
                                          int AV78Trabajoexterno_detail___wcds_10_tfclicod_to ,
                                          String AV80Trabajoexterno_detail___wcds_12_tfbarser_sel ,
                                          String AV79Trabajoexterno_detail___wcds_11_tfbarser ,
                                          String AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel ,
                                          String AV81Trabajoexterno_detail___wcds_13_tfbarcolnom ,
                                          String AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel ,
                                          String AV83Trabajoexterno_detail___wcds_15_tfbarnomcli ,
                                          String AV86Trabajoexterno_detail___wcds_18_tffascodn_sel ,
                                          String AV85Trabajoexterno_detail___wcds_17_tffascodn ,
                                          String AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel ,
                                          String AV87Trabajoexterno_detail___wcds_19_tffasdscmn ,
                                          short AV89Trabajoexterno_detail___wcds_21_tfordlin ,
                                          short AV90Trabajoexterno_detail___wcds_22_tfordlin_to ,
                                          int AV91Trabajoexterno_detail___wcds_23_tfsalexcoe ,
                                          int AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to ,
                                          java.math.BigDecimal AV93Trabajoexterno_detail___wcds_25_tfsalexkge ,
                                          java.math.BigDecimal AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to ,
                                          java.math.BigDecimal AV95Trabajoexterno_detail___wcds_27_tfsalexmte ,
                                          java.math.BigDecimal AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to ,
                                          String AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel ,
                                          String AV97Trabajoexterno_detail___wcds_29_tfsalexobs ,
                                          short A6248SalExNln ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          int A252CliCod ,
                                          String A212BarSer ,
                                          String A135BarColNom ,
                                          String A1234BarNomCli ,
                                          String A6558FasCodn ,
                                          String A14410FasDscMn ,
                                          short A654OrdLin ,
                                          int A6257SalExCoE ,
                                          java.math.BigDecimal A6256SalExKgE ,
                                          java.math.BigDecimal A6258SalExMtE ,
                                          String A6249SalExObs ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV50EmprCod ,
                                          int AV56SalExtAlb ,
                                          String A396EmprCod ,
                                          int A2253SalExtAlb )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[32];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPEXHDPZ T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar" ;
      scmdbuf += " = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.SalExtAlb = ?)");
      if ( ! (0==AV69Trabajoexterno_detail___wcds_1_tfsalexnln) )
      {
         addWhere(sWhereString, "(T1.SalExNln >= ?)");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
      }
      if ( ! (0==AV70Trabajoexterno_detail___wcds_2_tfsalexnln_to) )
      {
         addWhere(sWhereString, "(T1.SalExNln <= ?)");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( ! (0==AV71Trabajoexterno_detail___wcds_3_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( ! (0==AV72Trabajoexterno_detail___wcds_4_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (0==AV73Trabajoexterno_detail___wcds_5_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! (0==AV74Trabajoexterno_detail___wcds_6_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV75Trabajoexterno_detail___wcds_7_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV76Trabajoexterno_detail___wcds_8_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! (0==AV77Trabajoexterno_detail___wcds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T2.CliCod >= ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (0==AV78Trabajoexterno_detail___wcds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T2.CliCod <= ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV79Trabajoexterno_detail___wcds_11_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80Trabajoexterno_detail___wcds_12_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarSer = ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV81Trabajoexterno_detail___wcds_13_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Trabajoexterno_detail___wcds_14_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarColNom = ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV83Trabajoexterno_detail___wcds_15_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Trabajoexterno_detail___wcds_16_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T2.BarNomCli = ?)");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) && ( ! (GXutil.strcmp("", AV85Trabajoexterno_detail___wcds_17_tffascodn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasCodn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Trabajoexterno_detail___wcds_18_tffascodn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasCodn = ?)");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) && ( ! (GXutil.strcmp("", AV87Trabajoexterno_detail___wcds_19_tffasdscmn)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.FasDscMn) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Trabajoexterno_detail___wcds_20_tffasdscmn_sel)==0) )
      {
         addWhere(sWhereString, "(T1.FasDscMn = ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! (0==AV89Trabajoexterno_detail___wcds_21_tfordlin) )
      {
         addWhere(sWhereString, "(T1.OrdLin >= ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( ! (0==AV90Trabajoexterno_detail___wcds_22_tfordlin_to) )
      {
         addWhere(sWhereString, "(T1.OrdLin <= ?)");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (0==AV91Trabajoexterno_detail___wcds_23_tfsalexcoe) )
      {
         addWhere(sWhereString, "(T1.SalExCoE >= ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (0==AV92Trabajoexterno_detail___wcds_24_tfsalexcoe_to) )
      {
         addWhere(sWhereString, "(T1.SalExCoE <= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Trabajoexterno_detail___wcds_25_tfsalexkge)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE >= ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Trabajoexterno_detail___wcds_26_tfsalexkge_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExKgE <= ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Trabajoexterno_detail___wcds_27_tfsalexmte)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE >= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Trabajoexterno_detail___wcds_28_tfsalexmte_to)==0) )
      {
         addWhere(sWhereString, "(T1.SalExMtE <= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) && ( ! (GXutil.strcmp("", AV97Trabajoexterno_detail___wcds_29_tfsalexobs)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.SalExObs) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Trabajoexterno_detail___wcds_30_tfsalexobs_sel)==0) )
      {
         addWhere(sWhereString, "(T1.SalExObs = ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
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
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_H02AC2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() );
            case 1 :
                  return conditional_H02AC3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).intValue() , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).byteValue() , ((Number) dynConstraints[5]).byteValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Number) dynConstraints[22]).intValue() , ((Number) dynConstraints[23]).intValue() , (java.math.BigDecimal)dynConstraints[24] , (java.math.BigDecimal)dynConstraints[25] , (java.math.BigDecimal)dynConstraints[26] , (java.math.BigDecimal)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] , ((Number) dynConstraints[30]).shortValue() , ((Number) dynConstraints[31]).intValue() , ((Number) dynConstraints[32]).byteValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , ((Number) dynConstraints[40]).shortValue() , ((Number) dynConstraints[41]).intValue() , (java.math.BigDecimal)dynConstraints[42] , (java.math.BigDecimal)dynConstraints[43] , (String)dynConstraints[44] , ((Number) dynConstraints[45]).shortValue() , ((Boolean) dynConstraints[46]).booleanValue() , (String)dynConstraints[47] , ((Number) dynConstraints[48]).intValue() , (String)dynConstraints[49] , ((Number) dynConstraints[50]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02AC2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02AC3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[9])[0] = rslt.getString(9, 30);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((String[]) buf[13])[0] = rslt.getString(13, 16);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(15, 1);
               ((byte[]) buf[17])[0] = rslt.getByte(16);
               ((int[]) buf[18])[0] = rslt.getInt(17);
               ((short[]) buf[19])[0] = rslt.getShort(18);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[39]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[40]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[43]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[44]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[59]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[60]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[61]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[62]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[63], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[64], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 40);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[34]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[38]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[39]).byteValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 13);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 13);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 13);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 13);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[50], 8);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 8);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 30);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 30);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[55]).shortValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[57]).intValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[59], 2);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
      }
   }

}

