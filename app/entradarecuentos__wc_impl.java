package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradarecuentos__wc_impl extends GXWebComponent
{
   public entradarecuentos__wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradarecuentos__wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradarecuentos__wc_impl.class ));
   }

   public entradarecuentos__wc_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
               AV7Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
               AV8RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7Emprcod,AV8RecFec});
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
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
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
      AV16FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV8RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV27ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV28TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV29TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV30TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV31TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV32TFRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo"), ".") ;
      AV33TFRecExiTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo_To"), ".") ;
      AV68Pgmname = httpContext.GetPar( "Pgmname") ;
      AV14OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV15OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV7Emprcod = httpContext.GetPar( "Emprcod") ;
      AV41Station = httpContext.GetPar( "Station") ;
      AV51FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
      AV50FlagCcs = (short)(GXutil.lval( httpContext.GetPar( "FlagCcs"))) ;
      AV52FlagCColor = GXutil.lval( httpContext.GetPar( "FlagCColor")) ;
      AV48Nalmcc = (short)(GXutil.lval( httpContext.GetPar( "Nalmcc"))) ;
      AV44Val_stk = (short)(GXutil.lval( httpContext.GetPar( "Val_stk"))) ;
      A808RecExiTcc = CommonUtil.decimalVal( httpContext.GetPar( "RecExiTcc"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV16FilterFullText, AV8RecFec, A396EmprCod, AV27ManageFiltersExecutionStep, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFPrdNom, AV31TFPrdNom_Sel, AV32TFRecExiTeo, AV33TFRecExiTeo_To, AV68Pgmname, AV14OrderedBy, AV15OrderedDsc, AV7Emprcod, AV41Station, AV51FlagPreMed, AV50FlagCcs, AV52FlagCColor, AV48Nalmcc, AV44Val_stk, A808RecExiTcc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1S72( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Entrada Recuento", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entradarecuentos__wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV8RecFec))}, new String[] {"Emprcod","RecFec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITCC", getSecureSignedToken( sPrefix, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV50FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV52FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44Val_stk), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaRecuentos__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("entradarecuentos__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV16FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV25ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV25ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV40DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Emprcod", GXutil.rtrim( wcpOAV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8RecFec", localUtil.dtoc( wcpOAV8RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV27ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV28TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV29TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV30TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV31TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV32TFRecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITEO_TO", GXutil.ltrim( localUtil.ntoc( AV33TFRecExiTeo_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV14OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV15OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV8RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLOT", GXutil.rtrim( A12285RecLot));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV12GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV12GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECEXIRCC", GXutil.ltrim( localUtil.ntoc( AV19RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFECHR", localUtil.ttoc( AV53Recfechr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV43UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV41Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV51FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITCC", getSecureSignedToken( sPrefix, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECUBIC", GXutil.rtrim( AV55RecUbic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV50FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV50FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKHOR", GXutil.rtrim( AV59CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV52FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV52FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNALMCC", GXutil.ltrim( localUtil.ntoc( AV48Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV44Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44Val_stk), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Title", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Result", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Result", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Result));
   }

   public void renderHtmlCloseForm1S72( )
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
      return "EntradaRecuentos__WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Recuento", "") ;
   }

   public void wb1S70( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.entradarecuentos__wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentos__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111s71_client"+"'", TempTags, "", 2, "HLP_EntradaRecuentos__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentos__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1S72( true) ;
      }
      else
      {
         wb_table1_23_1S72( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1S72e( boolean wbgen )
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmemorizarcantreal_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Memorizar Cant Real?", ""), bttBtnmemorizarcantreal_Jsonclick, 7, httpContext.getMessage( "Memorizar Cant Real?", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121s71_client"+"'", TempTags, "", 2, "HLP_EntradaRecuentos__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e131s71_client"+"'", TempTags, "", 2, "HLP_EntradaRecuentos__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs col-sm-3 hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar2", ""), bttBtnconfirmar2_Jsonclick, 7, httpContext.getMessage( "Confirmar2", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e141s71_client"+"'", TempTags, "", 2, "HLP_EntradaRecuentos__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntradaRecuentos__WC.htm");
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV68Pgmname), GXutil.rtrim( localUtil.format( AV68Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EntradaRecuentos__WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV40DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         wb_table2_70_1S72( true) ;
      }
      else
      {
         wb_table2_70_1S72( false) ;
      }
      return  ;
   }

   public void wb_table2_70_1S72e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_75_1S72( true) ;
      }
      else
      {
         wb_table3_75_1S72( false) ;
      }
      return  ;
   }

   public void wb_table3_75_1S72e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_80_1S72( true) ;
      }
      else
      {
         wb_table4_80_1S72( false) ;
      }
      return  ;
   }

   public void wb_table4_80_1S72e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
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

   public void start1S72( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Recuento", ""), (short)(0)) ;
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
            strup1S70( ) ;
         }
      }
   }

   public void ws1S72( )
   {
      start1S72( ) ;
      evt1S72( ) ;
   }

   public void evt1S72( )
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
                              strup1S70( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151S72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161S72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171S72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR2.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e181S72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e191S72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e201S72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e211S72 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavRecexirea_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           AV69Entradarecuentos__wcds_1_filterfulltext = AV16FilterFullText ;
                           AV70Entradarecuentos__wcds_2_tfprdnum = AV28TFPrdNum ;
                           AV71Entradarecuentos__wcds_3_tfprdnum_sel = AV29TFPrdNum_Sel ;
                           AV72Entradarecuentos__wcds_4_tfprdnom = AV30TFPrdNom ;
                           AV73Entradarecuentos__wcds_5_tfprdnom_sel = AV31TFPrdNom_Sel ;
                           AV74Entradarecuentos__wcds_6_tfrecexiteo = AV32TFRecExiTeo ;
                           AV75Entradarecuentos__wcds_7_tfrecexiteo_to = AV33TFRecExiTeo_To ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1S70( ) ;
                           }
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
                              GX_FocusControl = edtavRecexirea_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV17RecExiRea = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV17RecExiRea, 12, 4));
                           }
                           else
                           {
                              AV17RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV17RecExiRea, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
                              GX_FocusControl = edtavDifer_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV18Difer = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV18Difer, 12, 4));
                           }
                           else
                           {
                              AV18Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV18Difer, 12, 4));
                           }
                           AV21RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV21RecLot);
                           A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
                           A13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavRecexirea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e221S72 ();
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
                                       GX_FocusControl = edtavRecexirea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e231S72 ();
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
                                       GX_FocusControl = edtavRecexirea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e241S72 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV16FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strup1S70( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavRecexirea_Internalname ;
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

   public void we1S72( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1S72( ) ;
         }
      }
   }

   public void pa1S72( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV16FilterFullText ,
                                 java.util.Date AV8RecFec ,
                                 String A396EmprCod ,
                                 byte AV27ManageFiltersExecutionStep ,
                                 String AV28TFPrdNum ,
                                 String AV29TFPrdNum_Sel ,
                                 String AV30TFPrdNom ,
                                 String AV31TFPrdNom_Sel ,
                                 java.math.BigDecimal AV32TFRecExiTeo ,
                                 java.math.BigDecimal AV33TFRecExiTeo_To ,
                                 String AV68Pgmname ,
                                 short AV14OrderedBy ,
                                 boolean AV15OrderedDsc ,
                                 String AV7Emprcod ,
                                 String AV41Station ,
                                 short AV51FlagPreMed ,
                                 short AV50FlagCcs ,
                                 long AV52FlagCColor ,
                                 short AV48Nalmcc ,
                                 short AV44Val_stk ,
                                 java.math.BigDecimal A808RecExiTcc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e231S72 ();
      GRID_nCurrentRecord = 0 ;
      rf1S72( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaRecuentos__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("entradarecuentos__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITEO", getSecureSignedToken( sPrefix, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITEO", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1S72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV68Pgmname = "EntradaRecuentos__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV69Entradarecuentos__wcds_1_filterfulltext = AV16FilterFullText ;
      AV70Entradarecuentos__wcds_2_tfprdnum = AV28TFPrdNum ;
      AV71Entradarecuentos__wcds_3_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV72Entradarecuentos__wcds_4_tfprdnom = AV30TFPrdNom ;
      AV73Entradarecuentos__wcds_5_tfprdnom_sel = AV31TFPrdNom_Sel ;
      AV74Entradarecuentos__wcds_6_tfrecexiteo = AV32TFRecExiTeo ;
      AV75Entradarecuentos__wcds_7_tfrecexiteo_to = AV33TFRecExiTeo_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV69Entradarecuentos__wcds_1_filterfulltext ,
                                           AV71Entradarecuentos__wcds_3_tfprdnum_sel ,
                                           AV70Entradarecuentos__wcds_2_tfprdnum ,
                                           AV73Entradarecuentos__wcds_5_tfprdnom_sel ,
                                           AV72Entradarecuentos__wcds_4_tfprdnom ,
                                           AV74Entradarecuentos__wcds_6_tfrecexiteo ,
                                           AV75Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           Short.valueOf(AV14OrderedBy) ,
                                           Boolean.valueOf(AV15OrderedDsc) ,
                                           A727PrdRec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           A396EmprCod ,
                                           AV8RecFec ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                           }
      });
      lV69Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV69Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV69Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
      lV70Entradarecuentos__wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Entradarecuentos__wcds_2_tfprdnum), 6, "%") ;
      lV72Entradarecuentos__wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Entradarecuentos__wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor H01S72 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV8RecFec, lV69Entradarecuentos__wcds_1_filterfulltext, lV69Entradarecuentos__wcds_1_filterfulltext, lV69Entradarecuentos__wcds_1_filterfulltext, lV70Entradarecuentos__wcds_2_tfprdnum, AV71Entradarecuentos__wcds_3_tfprdnum_sel, lV72Entradarecuentos__wcds_4_tfprdnom, AV73Entradarecuentos__wcds_5_tfprdnom_sel, AV74Entradarecuentos__wcds_6_tfrecexiteo, AV75Entradarecuentos__wcds_7_tfrecexiteo_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = H01S72_A810RecFec[0] ;
         A12285RecLot = H01S72_A12285RecLot[0] ;
         A724PrdPreAct = H01S72_A724PrdPreAct[0] ;
         A726PrdPreMed = H01S72_A726PrdPreMed[0] ;
         A808RecExiTcc = H01S72_A808RecExiTcc[0] ;
         A13416RecEstInv = H01S72_A13416RecEstInv[0] ;
         A727PrdRec = H01S72_A727PrdRec[0] ;
         A809RecExiTeo = H01S72_A809RecExiTeo[0] ;
         A718PrdNom = H01S72_A718PrdNom[0] ;
         A719PrdNum = H01S72_A719PrdNum[0] ;
         A724PrdPreAct = H01S72_A724PrdPreAct[0] ;
         A726PrdPreMed = H01S72_A726PrdPreMed[0] ;
         A727PrdRec = H01S72_A727PrdRec[0] ;
         A718PrdNom = H01S72_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1S72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      /* Execute user event: Refresh */
      e231S72 ();
      nGXsfl_52_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
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
         subsflControlProps_522( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV69Entradarecuentos__wcds_1_filterfulltext ,
                                              AV71Entradarecuentos__wcds_3_tfprdnum_sel ,
                                              AV70Entradarecuentos__wcds_2_tfprdnum ,
                                              AV73Entradarecuentos__wcds_5_tfprdnom_sel ,
                                              AV72Entradarecuentos__wcds_4_tfprdnom ,
                                              AV74Entradarecuentos__wcds_6_tfrecexiteo ,
                                              AV75Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A809RecExiTeo ,
                                              Short.valueOf(AV14OrderedBy) ,
                                              Boolean.valueOf(AV15OrderedDsc) ,
                                              A727PrdRec ,
                                              Byte.valueOf(A13416RecEstInv) ,
                                              A396EmprCod ,
                                              AV8RecFec ,
                                              A810RecFec } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE
                                              }
         });
         lV69Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
         lV69Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
         lV69Entradarecuentos__wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV69Entradarecuentos__wcds_1_filterfulltext), "%", "") ;
         lV70Entradarecuentos__wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Entradarecuentos__wcds_2_tfprdnum), 6, "%") ;
         lV72Entradarecuentos__wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Entradarecuentos__wcds_4_tfprdnom), 26, "%") ;
         /* Using cursor H01S73 */
         pr_default.execute(1, new Object[] {A396EmprCod, AV8RecFec, lV69Entradarecuentos__wcds_1_filterfulltext, lV69Entradarecuentos__wcds_1_filterfulltext, lV69Entradarecuentos__wcds_1_filterfulltext, lV70Entradarecuentos__wcds_2_tfprdnum, AV71Entradarecuentos__wcds_3_tfprdnum_sel, lV72Entradarecuentos__wcds_4_tfprdnom, AV73Entradarecuentos__wcds_5_tfprdnom_sel, AV74Entradarecuentos__wcds_6_tfrecexiteo, AV75Entradarecuentos__wcds_7_tfrecexiteo_to});
         nGXsfl_52_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A810RecFec = H01S73_A810RecFec[0] ;
            A12285RecLot = H01S73_A12285RecLot[0] ;
            A724PrdPreAct = H01S73_A724PrdPreAct[0] ;
            A726PrdPreMed = H01S73_A726PrdPreMed[0] ;
            A808RecExiTcc = H01S73_A808RecExiTcc[0] ;
            A13416RecEstInv = H01S73_A13416RecEstInv[0] ;
            A727PrdRec = H01S73_A727PrdRec[0] ;
            A809RecExiTeo = H01S73_A809RecExiTeo[0] ;
            A718PrdNom = H01S73_A718PrdNom[0] ;
            A719PrdNum = H01S73_A719PrdNum[0] ;
            A724PrdPreAct = H01S73_A724PrdPreAct[0] ;
            A726PrdPreMed = H01S73_A726PrdPreMed[0] ;
            A727PrdRec = H01S73_A727PrdRec[0] ;
            A718PrdNom = H01S73_A718PrdNom[0] ;
            if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
            {
               e241S72 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(52) ;
         wb1S70( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1S72( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV41Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV51FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITEO"+"_"+sGXsfl_52_idx, getSecureSignedToken( sPrefix+sGXsfl_52_idx, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITCC", getSecureSignedToken( sPrefix, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV50FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV50FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV52FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV52FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNALMCC", GXutil.ltrim( localUtil.ntoc( AV48Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV44Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44Val_stk), "ZZZ9")));
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
      AV69Entradarecuentos__wcds_1_filterfulltext = AV16FilterFullText ;
      AV70Entradarecuentos__wcds_2_tfprdnum = AV28TFPrdNum ;
      AV71Entradarecuentos__wcds_3_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV72Entradarecuentos__wcds_4_tfprdnom = AV30TFPrdNom ;
      AV73Entradarecuentos__wcds_5_tfprdnom_sel = AV31TFPrdNom_Sel ;
      AV74Entradarecuentos__wcds_6_tfrecexiteo = AV32TFRecExiTeo ;
      AV75Entradarecuentos__wcds_7_tfrecexiteo_to = AV33TFRecExiTeo_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV16FilterFullText, AV8RecFec, A396EmprCod, AV27ManageFiltersExecutionStep, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFPrdNom, AV31TFPrdNom_Sel, AV32TFRecExiTeo, AV33TFRecExiTeo_To, AV68Pgmname, AV14OrderedBy, AV15OrderedDsc, AV7Emprcod, AV41Station, AV51FlagPreMed, AV50FlagCcs, AV52FlagCColor, AV48Nalmcc, AV44Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV69Entradarecuentos__wcds_1_filterfulltext = AV16FilterFullText ;
      AV70Entradarecuentos__wcds_2_tfprdnum = AV28TFPrdNum ;
      AV71Entradarecuentos__wcds_3_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV72Entradarecuentos__wcds_4_tfprdnom = AV30TFPrdNom ;
      AV73Entradarecuentos__wcds_5_tfprdnom_sel = AV31TFPrdNom_Sel ;
      AV74Entradarecuentos__wcds_6_tfrecexiteo = AV32TFRecExiTeo ;
      AV75Entradarecuentos__wcds_7_tfrecexiteo_to = AV33TFRecExiTeo_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV16FilterFullText, AV8RecFec, A396EmprCod, AV27ManageFiltersExecutionStep, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFPrdNom, AV31TFPrdNom_Sel, AV32TFRecExiTeo, AV33TFRecExiTeo_To, AV68Pgmname, AV14OrderedBy, AV15OrderedDsc, AV7Emprcod, AV41Station, AV51FlagPreMed, AV50FlagCcs, AV52FlagCColor, AV48Nalmcc, AV44Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV69Entradarecuentos__wcds_1_filterfulltext = AV16FilterFullText ;
      AV70Entradarecuentos__wcds_2_tfprdnum = AV28TFPrdNum ;
      AV71Entradarecuentos__wcds_3_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV72Entradarecuentos__wcds_4_tfprdnom = AV30TFPrdNom ;
      AV73Entradarecuentos__wcds_5_tfprdnom_sel = AV31TFPrdNom_Sel ;
      AV74Entradarecuentos__wcds_6_tfrecexiteo = AV32TFRecExiTeo ;
      AV75Entradarecuentos__wcds_7_tfrecexiteo_to = AV33TFRecExiTeo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16FilterFullText, AV8RecFec, A396EmprCod, AV27ManageFiltersExecutionStep, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFPrdNom, AV31TFPrdNom_Sel, AV32TFRecExiTeo, AV33TFRecExiTeo_To, AV68Pgmname, AV14OrderedBy, AV15OrderedDsc, AV7Emprcod, AV41Station, AV51FlagPreMed, AV50FlagCcs, AV52FlagCColor, AV48Nalmcc, AV44Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV69Entradarecuentos__wcds_1_filterfulltext = AV16FilterFullText ;
      AV70Entradarecuentos__wcds_2_tfprdnum = AV28TFPrdNum ;
      AV71Entradarecuentos__wcds_3_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV72Entradarecuentos__wcds_4_tfprdnom = AV30TFPrdNom ;
      AV73Entradarecuentos__wcds_5_tfprdnom_sel = AV31TFPrdNom_Sel ;
      AV74Entradarecuentos__wcds_6_tfrecexiteo = AV32TFRecExiTeo ;
      AV75Entradarecuentos__wcds_7_tfrecexiteo_to = AV33TFRecExiTeo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16FilterFullText, AV8RecFec, A396EmprCod, AV27ManageFiltersExecutionStep, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFPrdNom, AV31TFPrdNom_Sel, AV32TFRecExiTeo, AV33TFRecExiTeo_To, AV68Pgmname, AV14OrderedBy, AV15OrderedDsc, AV7Emprcod, AV41Station, AV51FlagPreMed, AV50FlagCcs, AV52FlagCColor, AV48Nalmcc, AV44Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV69Entradarecuentos__wcds_1_filterfulltext = AV16FilterFullText ;
      AV70Entradarecuentos__wcds_2_tfprdnum = AV28TFPrdNum ;
      AV71Entradarecuentos__wcds_3_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV72Entradarecuentos__wcds_4_tfprdnom = AV30TFPrdNom ;
      AV73Entradarecuentos__wcds_5_tfprdnom_sel = AV31TFPrdNom_Sel ;
      AV74Entradarecuentos__wcds_6_tfrecexiteo = AV32TFRecExiTeo ;
      AV75Entradarecuentos__wcds_7_tfrecexiteo_to = AV33TFRecExiTeo_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV16FilterFullText, AV8RecFec, A396EmprCod, AV27ManageFiltersExecutionStep, AV28TFPrdNum, AV29TFPrdNum_Sel, AV30TFPrdNom, AV31TFPrdNom_Sel, AV32TFRecExiTeo, AV33TFRecExiTeo_To, AV68Pgmname, AV14OrderedBy, AV15OrderedDsc, AV7Emprcod, AV41Station, AV51FlagPreMed, AV50FlagCcs, AV52FlagCColor, AV48Nalmcc, AV44Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV68Pgmname = "EntradaRecuentos__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1S70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e221S72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV25ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV40DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
         wcpOAV8RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8RecFec"), 0) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Title") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Confirmationtext") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar2_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Title") ;
         Dvelop_confirmpanel_btnconfirmar2_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar2_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Result") ;
         Dvelop_confirmpanel_btnconfirmar2_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Result") ;
         /* Read variables values. */
         AV16FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
         AV68Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaRecuentos__WC");
         AV68Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68Pgmname", AV68Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV68Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("entradarecuentos__wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV16FilterFullText) != 0 )
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
      e221S72 ();
      if (returnInSub) return;
   }

   public void e221S72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV41Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradarecuentos__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV41Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Station", AV41Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradarecuentos__wc_impl.this.A396EmprCod = GXv_char2[0] ;
      entradarecuentos__wc_impl.this.AV42EmprNom = GXv_char3[0] ;
      entradarecuentos__wc_impl.this.AV43UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43UsurCod", AV43UsurCod);
      AV7Emprcod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      GXt_int5 = (byte)(AV44Val_stk) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int6) ;
      entradarecuentos__wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV44Val_stk = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Val_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Val_stk), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44Val_stk), "ZZZ9")));
      GXt_int7 = AV45Precio_stk ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int8) ;
      entradarecuentos__wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV45Precio_stk = (short)(GXt_int7) ;
      GXt_int5 = (byte)(AV46Artextil) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      entradarecuentos__wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV46Artextil = GXt_int5 ;
      GXt_int5 = (byte)(AV47Intexco) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
      entradarecuentos__wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV47Intexco = GXt_int5 ;
      GXt_int5 = (byte)(AV48Nalmcc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      entradarecuentos__wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV48Nalmcc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48Nalmcc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48Nalmcc), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV48Nalmcc), "ZZZ9")));
      GXt_int5 = (byte)(AV49Ubicacion) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LOCPRD", ""), GXv_int6) ;
      entradarecuentos__wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV49Ubicacion = GXt_int5 ;
      GXv_int6[0] = (byte)(AV50FlagCcs) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      entradarecuentos__wc_impl.this.AV50FlagCcs = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50FlagCcs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50FlagCcs), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV50FlagCcs), "ZZZ9")));
      GXt_int5 = (byte)(AV51FlagPreMed) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      entradarecuentos__wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV51FlagPreMed = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51FlagPreMed), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV51FlagPreMed), "ZZZ9")));
      GXt_int5 = (byte)(AV52FlagCColor) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "10002E", ""), GXv_int6) ;
      entradarecuentos__wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV52FlagCColor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52FlagCColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52FlagCColor), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV52FlagCColor), "ZZZZZZZZZ9")));
      GXt_char1 = AV41Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      entradarecuentos__wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV41Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41Station", AV41Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV41Station, ""))));
      GXv_char4[0] = AV7Emprcod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char2[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV41Station, GXv_char4, GXv_char3, GXv_char2) ;
      entradarecuentos__wc_impl.this.AV7Emprcod = GXv_char4[0] ;
      entradarecuentos__wc_impl.this.AV42EmprNom = GXv_char3[0] ;
      entradarecuentos__wc_impl.this.AV43UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43UsurCod", AV43UsurCod);
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV14OrderedBy < 1 )
      {
         AV14OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV40DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV40DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      /* Execute user subroutine: 'LASTRECUEN' */
      S152 ();
      if (returnInSub) return;
   }

   public void e231S72( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV27ManageFiltersExecutionStep == 1 )
      {
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV27ManageFiltersExecutionStep == 2 )
      {
         AV27ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      AV69Entradarecuentos__wcds_1_filterfulltext = AV16FilterFullText ;
      AV70Entradarecuentos__wcds_2_tfprdnum = AV28TFPrdNum ;
      AV71Entradarecuentos__wcds_3_tfprdnum_sel = AV29TFPrdNum_Sel ;
      AV72Entradarecuentos__wcds_4_tfprdnom = AV30TFPrdNom ;
      AV73Entradarecuentos__wcds_5_tfprdnom_sel = AV31TFPrdNom_Sel ;
      AV74Entradarecuentos__wcds_6_tfrecexiteo = AV32TFRecExiTeo ;
      AV75Entradarecuentos__wcds_7_tfrecexiteo_to = AV33TFRecExiTeo_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e161S72( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV14OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
         AV15OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV28TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrdNum", AV28TFPrdNum);
            AV29TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV30TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrdNom", AV30TFPrdNom);
            AV31TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrdNom_Sel", AV31TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTeo") == 0 )
         {
            AV32TFRecExiTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecExiTeo", GXutil.ltrimstr( AV32TFRecExiTeo, 12, 4));
            AV33TFRecExiTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFRecExiTeo_To", GXutil.ltrimstr( AV33TFRecExiTeo_To, 12, 4));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e241S72( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV17RecExiRea = A809RecExiTeo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV17RecExiRea, 12, 4));
         edtavRecexirea_Backcolor = GXutil.getColor( 255, 0, 0) ;
         edtavRecexirea_Forecolor = GXutil.getColor( 0, 0, 0) ;
         AV18Difer = A809RecExiTeo.subtract(AV17RecExiRea) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV18Difer, 12, 4));
         edtavDifer_Backcolor = GXutil.getColor( 0, 255, 0) ;
         edtavDifer_Forecolor = GXutil.getColor( 0, 0, 0) ;
         AV21RecLot = A12285RecLot ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV21RecLot);
         edtavReclot_Backcolor = GXutil.getColor( 255, 0, 0) ;
         edtavReclot_Forecolor = GXutil.getColor( 0, 0, 0) ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(52) ;
         }
         sendrow_522( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
      {
         httpContext.doAjaxLoad(52, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151S72( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S162 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("EntradaRecuentos__WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV68Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("EntradaRecuentos__WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV27ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27ManageFiltersExecutionStep", GXutil.str( AV27ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV26ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "EntradaRecuentos__WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         entradarecuentos__wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV26ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV26ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV68Pgmname+"GridState", AV26ManageFiltersXml) ;
            AV12GridState.fromxml(AV26ManageFiltersXml, null, null);
            AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
            AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
   }

   public void e171S72( )
   {
      /* Dvelop_confirmpanel_btnmemorizarcantreal_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnmemorizarcantreal_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'MEMORIZARCANTREAL' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ManageFiltersData", AV25ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12GridState", AV12GridState);
   }

   public void e181S72( )
   {
      /* Dvelop_confirmpanel_btnconfirmar2_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar2_Result, "Yes") == 0 )
      {
         AV54inc_obs = httpContext.getMessage( "Inicio Actualizacion RECUENTO", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV7Emprcod, GXutil.substring( AV68Pgmname, 1, 10), AV43UsurCod, AV41Station, AV54inc_obs, 99999999, (byte)(0), " ") ;
         /* Start For Each Line */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_52_fel_idx = 0 ;
         while ( nGXsfl_52_fel_idx < nRC_GXsfl_52 )
         {
            nGXsfl_52_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_fel_idx+1) ;
            sGXsfl_52_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_522( ) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
               GX_FocusControl = edtavRecexirea_Internalname ;
               wbErr = true ;
               AV17RecExiRea = DecimalUtil.ZERO ;
            }
            else
            {
               AV17RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
               GX_FocusControl = edtavDifer_Internalname ;
               wbErr = true ;
               AV18Difer = DecimalUtil.ZERO ;
            }
            else
            {
               AV18Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
            }
            AV21RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
            A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
            A13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV60Precio_mov = ((AV51FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
            AV61TotDet = (short)(0) ;
            AV18Difer = A809RecExiTeo.subtract(AV17RecExiRea) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV18Difer, 12, 4));
            AV20DiferCC = A808RecExiTcc.subtract(AV19RecExiRcc) ;
            if ( AV18Difer.doubleValue() != 0 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = A719PrdNum ;
               GXv_decimal12[0] = AV18Difer ;
               GXv_date13[0] = AV8RecFec ;
               new app.pmodrem(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal12, GXv_date13) ;
               entradarecuentos__wc_impl.this.A396EmprCod = GXv_char4[0] ;
               entradarecuentos__wc_impl.this.A719PrdNum = GXv_char3[0] ;
               entradarecuentos__wc_impl.this.AV18Difer = GXv_decimal12[0] ;
               entradarecuentos__wc_impl.this.AV8RecFec = GXv_date13[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV18Difer, 12, 4));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
            }
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_date13[0] = AV8RecFec ;
            GXv_decimal12[0] = AV17RecExiRea ;
            GXv_decimal14[0] = AV19RecExiRcc ;
            GXv_decimal15[0] = AV60Precio_mov ;
            GXv_dtime16[0] = AV53Recfechr ;
            GXv_char2[0] = " " ;
            GXv_char17[0] = AV21RecLot ;
            GXv_char18[0] = AV55RecUbic ;
            new app.pmodexi2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date13, GXv_decimal12, GXv_decimal14, GXv_decimal15, GXv_dtime16, GXv_char2, GXv_char17, GXv_char18) ;
            entradarecuentos__wc_impl.this.A396EmprCod = GXv_char4[0] ;
            entradarecuentos__wc_impl.this.A719PrdNum = GXv_char3[0] ;
            entradarecuentos__wc_impl.this.AV8RecFec = GXv_date13[0] ;
            entradarecuentos__wc_impl.this.AV17RecExiRea = GXv_decimal12[0] ;
            entradarecuentos__wc_impl.this.AV19RecExiRcc = GXv_decimal14[0] ;
            entradarecuentos__wc_impl.this.AV60Precio_mov = GXv_decimal15[0] ;
            entradarecuentos__wc_impl.this.AV53Recfechr = GXv_dtime16[0] ;
            entradarecuentos__wc_impl.this.AV21RecLot = GXv_char17[0] ;
            entradarecuentos__wc_impl.this.AV55RecUbic = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV17RecExiRea, 12, 4));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19RecExiRcc", GXutil.ltrimstr( AV19RecExiRcc, 12, 4));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Recfechr", localUtil.ttoc( AV53Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV21RecLot);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55RecUbic", AV55RecUbic);
            if ( AV50FlagCcs == 1 )
            {
               AV56Fecha = GXutil.today( ) ;
               if ( AV18Difer.doubleValue() < 0 )
               {
                  AV57CCStkCanE = AV18Difer.negate() ;
                  AV58CCStkCanS = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  AV57CCStkCanE = DecimalUtil.doubleToDec(0) ;
                  AV58CCStkCanS = AV18Difer ;
               }
               GXv_char18[0] = A396EmprCod ;
               GXv_char17[0] = A719PrdNum ;
               GXv_decimal15[0] = AV57CCStkCanE ;
               GXv_decimal14[0] = AV58CCStkCanS ;
               GXv_char4[0] = httpContext.getMessage( "SR", "") ;
               GXv_char3[0] = "1" ;
               GXv_decimal12[0] = AV60Precio_mov ;
               GXv_int8[0] = 0 ;
               GXv_int6[0] = (byte)(0) ;
               GXv_char2[0] = " " ;
               GXv_int19[0] = 0 ;
               GXv_char20[0] = " " ;
               GXv_char21[0] = AV43UsurCod ;
               GXv_char22[0] = httpContext.getMessage( "Recuento de Almacen", "") ;
               GXv_int23[0] = (short)(0) ;
               GXv_decimal24[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal25[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date13[0] = AV8RecFec ;
               GXv_char26[0] = AV21RecLot ;
               GXv_char27[0] = AV59CCStkHor ;
               new app.precccstks(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_decimal15, GXv_decimal14, GXv_char4, GXv_char3, GXv_decimal12, GXv_int8, GXv_int6, GXv_char2, GXv_int19, GXv_char20, GXv_char21, GXv_char22, GXv_int23, GXv_decimal24, GXv_decimal25, GXv_date13, GXv_char26, GXv_char27) ;
               entradarecuentos__wc_impl.this.A396EmprCod = GXv_char18[0] ;
               entradarecuentos__wc_impl.this.A719PrdNum = GXv_char17[0] ;
               entradarecuentos__wc_impl.this.AV57CCStkCanE = GXv_decimal15[0] ;
               entradarecuentos__wc_impl.this.AV58CCStkCanS = GXv_decimal14[0] ;
               entradarecuentos__wc_impl.this.AV60Precio_mov = GXv_decimal12[0] ;
               entradarecuentos__wc_impl.this.AV43UsurCod = GXv_char21[0] ;
               entradarecuentos__wc_impl.this.AV8RecFec = GXv_date13[0] ;
               entradarecuentos__wc_impl.this.AV21RecLot = GXv_char26[0] ;
               entradarecuentos__wc_impl.this.AV59CCStkHor = GXv_char27[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43UsurCod", AV43UsurCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV21RecLot);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59CCStkHor", AV59CCStkHor);
               if ( AV52FlagCColor == 1 )
               {
                  if ( AV20DiferCC.doubleValue() < 0 )
                  {
                     AV57CCStkCanE = AV20DiferCC.negate() ;
                     AV58CCStkCanS = DecimalUtil.doubleToDec(0) ;
                  }
                  else
                  {
                     AV57CCStkCanE = DecimalUtil.doubleToDec(0) ;
                     AV58CCStkCanS = AV20DiferCC ;
                  }
                  GXv_char27[0] = A396EmprCod ;
                  GXv_char26[0] = A719PrdNum ;
                  GXv_decimal25[0] = AV57CCStkCanE ;
                  GXv_decimal24[0] = AV58CCStkCanS ;
                  GXv_char22[0] = httpContext.getMessage( "SR", "") ;
                  GXv_char21[0] = "1" ;
                  GXv_decimal15[0] = AV60Precio_mov ;
                  GXv_int19[0] = 0 ;
                  GXv_int6[0] = (byte)(0) ;
                  GXv_char20[0] = " " ;
                  GXv_int8[0] = 0 ;
                  GXv_char18[0] = " " ;
                  GXv_char17[0] = AV43UsurCod ;
                  GXv_char4[0] = httpContext.getMessage( "Recuento de CC", "") ;
                  GXv_int23[0] = (short)(0) ;
                  GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date13[0] = AV8RecFec ;
                  GXv_char3[0] = AV21RecLot ;
                  GXv_char2[0] = AV59CCStkHor ;
                  new app.precccstks(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_decimal24, GXv_char22, GXv_char21, GXv_decimal15, GXv_int19, GXv_int6, GXv_char20, GXv_int8, GXv_char18, GXv_char17, GXv_char4, GXv_int23, GXv_decimal14, GXv_decimal12, GXv_date13, GXv_char3, GXv_char2) ;
                  entradarecuentos__wc_impl.this.A396EmprCod = GXv_char27[0] ;
                  entradarecuentos__wc_impl.this.A719PrdNum = GXv_char26[0] ;
                  entradarecuentos__wc_impl.this.AV57CCStkCanE = GXv_decimal25[0] ;
                  entradarecuentos__wc_impl.this.AV58CCStkCanS = GXv_decimal24[0] ;
                  entradarecuentos__wc_impl.this.AV60Precio_mov = GXv_decimal15[0] ;
                  entradarecuentos__wc_impl.this.AV43UsurCod = GXv_char17[0] ;
                  entradarecuentos__wc_impl.this.AV8RecFec = GXv_date13[0] ;
                  entradarecuentos__wc_impl.this.AV21RecLot = GXv_char3[0] ;
                  entradarecuentos__wc_impl.this.AV59CCStkHor = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43UsurCod", AV43UsurCod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV21RecLot);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59CCStkHor", AV59CCStkHor);
                  if ( AV48Nalmcc == 1 )
                  {
                     GXv_char27[0] = A396EmprCod ;
                     GXv_char26[0] = A719PrdNum ;
                     GXv_decimal25[0] = AV19RecExiRcc ;
                     GXv_char22[0] = httpContext.getMessage( "SR", "") ;
                     GXv_decimal24[0] = AV60Precio_mov ;
                     GXv_char21[0] = AV43UsurCod ;
                     GXv_char20[0] = httpContext.getMessage( "Recuento de CC p/Almacenes", "") ;
                     GXv_date13[0] = AV8RecFec ;
                     GXv_dtime16[0] = AV53Recfechr ;
                     new app.pccalm1(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_char22, GXv_decimal24, GXv_char21, GXv_char20, GXv_date13, GXv_dtime16) ;
                     entradarecuentos__wc_impl.this.A396EmprCod = GXv_char27[0] ;
                     entradarecuentos__wc_impl.this.A719PrdNum = GXv_char26[0] ;
                     entradarecuentos__wc_impl.this.AV19RecExiRcc = GXv_decimal25[0] ;
                     entradarecuentos__wc_impl.this.AV60Precio_mov = GXv_decimal24[0] ;
                     entradarecuentos__wc_impl.this.AV43UsurCod = GXv_char21[0] ;
                     entradarecuentos__wc_impl.this.AV8RecFec = GXv_date13[0] ;
                     entradarecuentos__wc_impl.this.AV53Recfechr = GXv_dtime16[0] ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19RecExiRcc", GXutil.ltrimstr( AV19RecExiRcc, 12, 4));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43UsurCod", AV43UsurCod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Recfechr", localUtil.ttoc( AV53Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  }
               }
            }
            if ( AV44Val_stk == 0 )
            {
               GXv_char27[0] = A396EmprCod ;
               GXv_char26[0] = A719PrdNum ;
               new app.pstm017(remoteHandle, context).execute( GXv_char27, GXv_char26) ;
               entradarecuentos__wc_impl.this.A396EmprCod = GXv_char27[0] ;
               entradarecuentos__wc_impl.this.A719PrdNum = GXv_char26[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            }
            else
            {
               GXv_char27[0] = A396EmprCod ;
               GXv_char26[0] = A719PrdNum ;
               GXv_decimal25[0] = AV17RecExiRea ;
               GXv_decimal24[0] = AV60Precio_mov ;
               new app.pvalstksr(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_decimal24) ;
               entradarecuentos__wc_impl.this.A396EmprCod = GXv_char27[0] ;
               entradarecuentos__wc_impl.this.A719PrdNum = GXv_char26[0] ;
               entradarecuentos__wc_impl.this.AV17RecExiRea = GXv_decimal25[0] ;
               entradarecuentos__wc_impl.this.AV60Precio_mov = GXv_decimal24[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV17RecExiRea, 12, 4));
            }
            /* End For Each Line */
         }
         if ( nGXsfl_52_fel_idx == 0 )
         {
            nGXsfl_52_idx = 1 ;
            sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_522( ) ;
         }
         nGXsfl_52_fel_idx = 1 ;
         AV54inc_obs = httpContext.getMessage( "Fin Actualizacion RECUENTO", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV7Emprcod, GXutil.substring( AV68Pgmname, 1, 10), AV43UsurCod, AV41Station, AV54inc_obs, 99999999, (byte)(0), " ") ;
         GXv_char27[0] = AV7Emprcod ;
         new app.pinvprd(remoteHandle, context).execute( GXv_char27) ;
         entradarecuentos__wc_impl.this.AV7Emprcod = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
         httpContext.GX_msglist.addItem(AV54inc_obs);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e191S72( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e201S72( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char27[0] = AV22ExcelFilename ;
      GXv_char26[0] = AV23ErrorMessage ;
      new app.entradarecuentos__wcexport(remoteHandle, context).execute( GXv_char27, GXv_char26) ;
      entradarecuentos__wc_impl.this.AV22ExcelFilename = GXv_char27[0] ;
      entradarecuentos__wc_impl.this.AV23ErrorMessage = GXv_char26[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
   }

   public void e211S72( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.entradarecuentos__wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV14OrderedBy, 4, 0))+":"+(AV15OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 = AV25ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "EntradaRecuentos__WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29[0] ;
      AV25ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV16FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
      AV28TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrdNum", AV28TFPrdNum);
      AV29TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
      AV30TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrdNom", AV30TFPrdNom);
      AV31TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrdNom_Sel", AV31TFPrdNom_Sel);
      AV32TFRecExiTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecExiTeo", GXutil.ltrimstr( AV32TFRecExiTeo, 12, 4));
      AV33TFRecExiTeo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFRecExiTeo_To", GXutil.ltrimstr( AV33TFRecExiTeo_To, 12, 4));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV24Session.getValue(AV68Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV68Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV24Session.getValue(AV68Pgmname+"GridState"), null, null);
      }
      AV14OrderedBy = AV12GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV14OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14OrderedBy), 4, 0));
      AV15OrderedDsc = AV12GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15OrderedDsc", AV15OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV77GXV1 = 1 ;
      while ( AV77GXV1 <= AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV77GXV1));
         if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV16FilterFullText = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16FilterFullText", AV16FilterFullText);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV28TFPrdNum = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28TFPrdNum", AV28TFPrdNum);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV29TFPrdNum_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29TFPrdNum_Sel", AV29TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV30TFPrdNom = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30TFPrdNom", AV30TFPrdNom);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV31TFPrdNom_Sel = AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFPrdNom_Sel", AV31TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV32TFRecExiTeo = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFRecExiTeo", GXutil.ltrimstr( AV32TFRecExiTeo, 12, 4));
            AV33TFRecExiTeo_To = CommonUtil.decimalVal( AV13GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFRecExiTeo_To", GXutil.ltrimstr( AV33TFRecExiTeo_To, 12, 4));
         }
         AV77GXV1 = (int)(AV77GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char27[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFPrdNum_Sel)==0), AV29TFPrdNum_Sel, GXv_char27) ;
      entradarecuentos__wc_impl.this.GXt_char1 = GXv_char27[0] ;
      GXt_char30 = "" ;
      GXv_char26[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFPrdNom_Sel)==0), AV31TFPrdNom_Sel, GXv_char26) ;
      entradarecuentos__wc_impl.this.GXt_char30 = GXv_char26[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char30+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char30 = "" ;
      GXv_char27[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrdNum)==0), AV28TFPrdNum, GXv_char27) ;
      entradarecuentos__wc_impl.this.GXt_char30 = GXv_char27[0] ;
      GXt_char1 = "" ;
      GXv_char26[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFPrdNom)==0), AV30TFPrdNom, GXv_char26) ;
      entradarecuentos__wc_impl.this.GXt_char1 = GXv_char26[0] ;
      Ddo_grid_Filteredtext_set = GXt_char30+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFRecExiTeo)==0) ? "" : GXutil.str( AV32TFRecExiTeo, 12, 4)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFRecExiTeo_To)==0) ? "" : GXutil.str( AV33TFRecExiTeo_To, 12, 4)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S162( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV24Session.getValue(AV68Pgmname+"GridState"), null, null);
      AV12GridState.setgxTv_SdtWWPGridState_Orderedby( AV14OrderedBy );
      AV12GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV15OrderedDsc );
      AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState31[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV16FilterFullText)==0), (short)(0), AV16FilterFullText, "") ;
      AV12GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFPRDNUM", "", !(GXutil.strcmp("", AV28TFPrdNum)==0), (short)(0), AV28TFPrdNum, "", !(GXutil.strcmp("", AV29TFPrdNum_Sel)==0), AV29TFPrdNum_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFPRDNOM", "", !(GXutil.strcmp("", AV30TFPrdNom)==0), (short)(0), AV30TFPrdNom, "", !(GXutil.strcmp("", AV31TFPrdNom_Sel)==0), AV31TFPrdNom_Sel, "") ;
      AV12GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV12GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFRECEXITEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV32TFRecExiTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV33TFRecExiTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV32TFRecExiTeo, 12, 4)), GXutil.trim( GXutil.str( AV33TFRecExiTeo_To, 12, 4))) ;
      AV12GridState = GXv_SdtWWPGridState31[0] ;
      if ( ! (GXutil.strcmp("", AV7Emprcod)==0) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Emprcod );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8RecFec)) )
      {
         AV13GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECFEC" );
         AV13GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV8RecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV12GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV13GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV68Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV10TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV68Pgmname );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV9HTTPRequest.getScriptName()+"?"+AV9HTTPRequest.getQuerystring() );
      AV10TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.RECUEN_TRN" );
      AV24Session.setValue("TrnContext", AV10TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S192( )
   {
      /* 'MEMORIZARCANTREAL' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_52_fel_idx = 0 ;
      while ( nGXsfl_52_fel_idx < nRC_GXsfl_52 )
      {
         nGXsfl_52_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_fel_idx+1) ;
         sGXsfl_52_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_522( ) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
            GX_FocusControl = edtavRecexirea_Internalname ;
            wbErr = true ;
            AV17RecExiRea = DecimalUtil.ZERO ;
         }
         else
         {
            AV17RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
            GX_FocusControl = edtavDifer_Internalname ;
            wbErr = true ;
            AV18Difer = DecimalUtil.ZERO ;
         }
         else
         {
            AV18Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
         }
         AV21RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
         A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
         A13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GXv_char27[0] = A396EmprCod ;
         GXv_char26[0] = A719PrdNum ;
         GXv_date13[0] = AV8RecFec ;
         GXv_decimal25[0] = AV17RecExiRea ;
         GXv_decimal24[0] = AV19RecExiRcc ;
         GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime16[0] = AV53Recfechr ;
         GXv_char22[0] = " " ;
         new app.pmemocant(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_date13, GXv_decimal25, GXv_decimal24, GXv_decimal15, GXv_dtime16, GXv_char22) ;
         entradarecuentos__wc_impl.this.A396EmprCod = GXv_char27[0] ;
         entradarecuentos__wc_impl.this.A719PrdNum = GXv_char26[0] ;
         entradarecuentos__wc_impl.this.AV8RecFec = GXv_date13[0] ;
         entradarecuentos__wc_impl.this.AV17RecExiRea = GXv_decimal25[0] ;
         entradarecuentos__wc_impl.this.AV19RecExiRcc = GXv_decimal24[0] ;
         entradarecuentos__wc_impl.this.AV53Recfechr = GXv_dtime16[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV17RecExiRea, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19RecExiRcc", GXutil.ltrimstr( AV19RecExiRcc, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Recfechr", localUtil.ttoc( AV53Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* End For Each Line */
      }
      if ( nGXsfl_52_fel_idx == 0 )
      {
         nGXsfl_52_idx = 1 ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      nGXsfl_52_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S152( )
   {
      /* 'LASTRECUEN' Routine */
      returnInSub = false ;
      AV62Recfec_last = GXutil.nullDate() ;
      AV63RecHora = GXutil.resetTime( GXutil.nullDate() );
      AV64Diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor H01S74 */
      pr_default.execute(2, new Object[] {AV7Emprcod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A810RecFec = H01S74_A810RecFec[0] ;
         A13416RecEstInv = H01S74_A13416RecEstInv[0] ;
         A13455Rechora = H01S74_A13455Rechora[0] ;
         AV62Recfec_last = A810RecFec ;
         AV63RecHora = A13455Rechora ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV65Invprd = (short)(0) ;
      /* Using cursor H01S75 */
      pr_default.execute(3, new Object[] {AV7Emprcod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A8577RecFecHr = H01S75_A8577RecFecHr[0] ;
         AV53Recfechr = A8577RecFecHr ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Recfechr", localUtil.ttoc( AV53Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV65Invprd = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV59CCStkHor = (GXutil.dateCompare(GXutil.nullDate(), AV63RecHora) ? localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.ttoc( AV63RecHora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59CCStkHor", AV59CCStkHor);
   }

   public void wb_table4_80_1S72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar2_Internalname, tblTabledvelop_confirmpanel_btnconfirmar2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("Title", Dvelop_confirmpanel_btnconfirmar2_Title);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar2_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar2_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar2.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar2_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2Container"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_80_1S72e( true) ;
      }
      else
      {
         wb_table4_80_1S72e( false) ;
      }
   }

   public void wb_table3_75_1S72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_75_1S72e( true) ;
      }
      else
      {
         wb_table3_75_1S72e( false) ;
      }
   }

   public void wb_table2_70_1S72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnmemorizarcantreal_Internalname, tblTabledvelop_confirmpanel_btnmemorizarcantreal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("Title", Dvelop_confirmpanel_btnmemorizarcantreal_Title);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("ConfirmationText", Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("ConfirmType", Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype);
         ucDvelop_confirmpanel_btnmemorizarcantreal.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnmemorizarcantreal_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_70_1S72e( true) ;
      }
      else
      {
         wb_table2_70_1S72e( false) ;
      }
   }

   public void wb_table1_23_1S72( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV25ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_28_1S72( true) ;
      }
      else
      {
         wb_table5_28_1S72( false) ;
      }
      return  ;
   }

   public void wb_table5_28_1S72e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1S72e( true) ;
      }
      else
      {
         wb_table1_23_1S72e( false) ;
      }
   }

   public void wb_table5_28_1S72( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV16FilterFullText, GXutil.rtrim( localUtil.format( AV16FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_EntradaRecuentos__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_28_1S72e( true) ;
      }
      else
      {
         wb_table5_28_1S72e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      AV8RecFec = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
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
      pa1S72( ) ;
      ws1S72( ) ;
      we1S72( ) ;
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
      sCtrlAV7Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8RecFec = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1S72( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "entradarecuentos__wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1S72( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
         AV8RecFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
      }
      wcpOAV7Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV7Emprcod") ;
      wcpOAV8RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8RecFec"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7Emprcod, wcpOAV7Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV8RecFec), GXutil.resetTime(wcpOAV8RecFec)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV7Emprcod = AV7Emprcod ;
      wcpOAV8RecFec = AV8RecFec ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV7Emprcod) > 0 )
      {
         AV7Emprcod = httpContext.cgiGet( sCtrlAV7Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Emprcod", AV7Emprcod);
      }
      else
      {
         AV7Emprcod = httpContext.cgiGet( sPrefix+"AV7Emprcod_PARM") ;
      }
      sCtrlAV8RecFec = httpContext.cgiGet( sPrefix+"AV8RecFec_CTRL") ;
      if ( GXutil.len( sCtrlAV8RecFec) > 0 )
      {
         AV8RecFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8RecFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8RecFec", localUtil.format(AV8RecFec, "99/99/99"));
      }
      else
      {
         AV8RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8RecFec_PARM"), 0) ;
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
      pa1S72( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1S72( ) ;
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
      ws1S72( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_PARM", GXutil.rtrim( AV7Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Emprcod_CTRL", GXutil.rtrim( sCtrlAV7Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8RecFec_PARM", localUtil.dtoc( AV8RecFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8RecFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8RecFec_CTRL", GXutil.rtrim( sCtrlAV8RecFec));
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
      we1S72( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115555183", true, true);
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
      httpContext.AddJavascriptSource("entradarecuentos__wc.js", "?202682115555183", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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

   public void subsflControlProps_522( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_52_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_52_idx ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO_"+sGXsfl_52_idx ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA_"+sGXsfl_52_idx ;
      edtavDifer_Internalname = sPrefix+"vDIFER_"+sGXsfl_52_idx ;
      edtavReclot_Internalname = sPrefix+"vRECLOT_"+sGXsfl_52_idx ;
      edtPrdRec_Internalname = sPrefix+"PRDREC_"+sGXsfl_52_idx ;
      edtRecEstInv_Internalname = sPrefix+"RECESTINV_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_522( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_52_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_52_fel_idx ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO_"+sGXsfl_52_fel_idx ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA_"+sGXsfl_52_fel_idx ;
      edtavDifer_Internalname = sPrefix+"vDIFER_"+sGXsfl_52_fel_idx ;
      edtavReclot_Internalname = sPrefix+"vRECLOT_"+sGXsfl_52_fel_idx ;
      edtPrdRec_Internalname = sPrefix+"PRDREC_"+sGXsfl_52_fel_idx ;
      edtRecEstInv_Internalname = sPrefix+"RECESTINV_"+sGXsfl_52_fel_idx ;
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wb1S70( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_52_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_52_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavRecexirea_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'"+sPrefix+"',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecexirea_Internalname,GXutil.ltrim( localUtil.ntoc( AV17RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV17RecExiRea, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,56);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecexirea_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavRecexirea_Forecolor)+";"+((edtavRecexirea_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavRecexirea_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavDifer_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'"+sPrefix+"',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifer_Internalname,GXutil.ltrim( localUtil.ntoc( AV18Difer, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifer_Enabled!=0) ? localUtil.format( AV18Difer, "ZZZZZZ9.9999") : localUtil.format( AV18Difer, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,57);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDifer_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavDifer_Forecolor)+";"+((edtavDifer_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavDifer_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDifer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavReclot_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'"+sPrefix+"',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavReclot_Internalname,GXutil.rtrim( AV21RecLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavReclot_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavReclot_Forecolor)+";"+((edtavReclot_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavReclot_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRec_Internalname,GXutil.rtrim( A727PrdRec),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstInv_Internalname,GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13416RecEstInv), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecEstInv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1S72( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"52\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant. Teo.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant. Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV17RecExiRea, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavRecexirea_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavRecexirea_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV18Difer, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavDifer_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavDifer_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV21RecLot));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavReclot_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavReclot_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A727PrdRec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnmemorizarcantreal_Internalname = sPrefix+"BTNMEMORIZARCANTREAL" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtnconfirmar2_Internalname = sPrefix+"BTNCONFIRMAR2" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO" ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA" ;
      edtavDifer_Internalname = sPrefix+"vDIFER" ;
      edtavReclot_Internalname = sPrefix+"vRECLOT" ;
      edtPrdRec_Internalname = sPrefix+"PRDREC" ;
      edtRecEstInv_Internalname = sPrefix+"RECESTINV" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL" ;
      tblTabledvelop_confirmpanel_btnmemorizarcantreal_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      Dvelop_confirmpanel_btnconfirmar2_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2" ;
      tblTabledvelop_confirmpanel_btnconfirmar2_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR2" ;
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
      edtRecEstInv_Jsonclick = "" ;
      edtPrdRec_Jsonclick = "" ;
      edtavReclot_Jsonclick = "" ;
      edtavReclot_Forecolor = (int)(0x000000) ;
      edtavReclot_Visible = -1 ;
      edtavReclot_Enabled = 1 ;
      edtavReclot_Backcolor = -1 ;
      edtavDifer_Jsonclick = "" ;
      edtavDifer_Forecolor = (int)(0x000000) ;
      edtavDifer_Visible = -1 ;
      edtavDifer_Enabled = 1 ;
      edtavDifer_Backcolor = -1 ;
      edtavRecexirea_Jsonclick = "" ;
      edtavRecexirea_Forecolor = (int)(0x000000) ;
      edtavRecexirea_Visible = -1 ;
      edtavRecexirea_Enabled = 1 ;
      edtavRecexirea_Backcolor = -1 ;
      edtRecExiTeo_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_btnconfirmar2_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar2_Confirmationtext = "¿SEGUNDO MENSAJE?" ;
      Dvelop_confirmpanel_btnconfirmar2_Title = "" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma el Inventario introducido?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext = "¿Desea memorirar la cantidad real?" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Title = "" ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "EntradaRecuentos__WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|" ;
      Ddo_grid_Includedatalist = "T|T|" ;
      Ddo_grid_Filterisrange = "||T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3" ;
      Ddo_grid_Columnids = "0:PrdNum|1:PrdNom|2:RecExiTeo" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      /* End function init_web_controls */
   }

   public void valid_Prdnum( )
   {
      /* Using cursor H01S76 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_inex", new Object[] {"PRODUC"}), 1, "PRDNUM");
      }
      A724PrdPreAct = H01S76_A724PrdPreAct[0] ;
      A726PrdPreMed = H01S76_A726PrdPreMed[0] ;
      A727PrdRec = H01S76_A727PrdRec[0] ;
      A718PrdNom = H01S76_A718PrdNom[0] ;
      pr_default.close(4);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A727PrdRec", GXutil.rtrim( A727PrdRec));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8RecFec',fld:'vRECFEC',pic:''},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e161S72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV8RecFec',fld:'vRECFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e241S72',iparms:[{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A12285RecLot',fld:'RECLOT',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV17RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'edtavRecexirea_Backcolor',ctrl:'vRECEXIREA',prop:'Backcolor'},{av:'edtavRecexirea_Forecolor',ctrl:'vRECEXIREA',prop:'Forecolor'},{av:'AV18Difer',fld:'vDIFER',pic:'ZZZZZZ9.9999'},{av:'edtavDifer_Backcolor',ctrl:'vDIFER',prop:'Backcolor'},{av:'edtavDifer_Forecolor',ctrl:'vDIFER',prop:'Forecolor'},{av:'AV21RecLot',fld:'vRECLOT',pic:''},{av:'edtavReclot_Backcolor',ctrl:'vRECLOT',prop:'Backcolor'},{av:'edtavReclot_Forecolor',ctrl:'vRECLOT',prop:'Forecolor'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e151S72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV8RecFec',fld:'vRECFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOMEMORIZARCANTREAL'","{handler:'e121S71',iparms:[]");
      setEventMetadata("'DOMEMORIZARCANTREAL'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL.CLOSE","{handler:'e171S72',iparms:[{av:'Dvelop_confirmpanel_btnmemorizarcantreal_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV8RecFec',fld:'vRECFEC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'A719PrdNum',fld:'PRDNUM',grid:52,pic:''},{av:'nRC_GXsfl_52',ctrl:'GRID',grid:52,prop:'GridRC',grid:52},{av:'AV17RecExiRea',fld:'vRECEXIREA',grid:52,pic:'ZZZZZZ9.9999'},{av:'AV19RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV53Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL.CLOSE",",oparms:[{av:'AV53Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV19RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV17RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV8RecFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e131S71',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("'DOCONFIRMAR2'","{handler:'e141S71',iparms:[]");
      setEventMetadata("'DOCONFIRMAR2'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR2.CLOSE","{handler:'e181S72',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar2_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR2',prop:'Result'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A809RecExiTeo',fld:'RECEXITEO',grid:52,pic:'ZZZZZZ9.9999',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_52',ctrl:'GRID',grid:52,prop:'GridRC',grid:52},{av:'AV17RecExiRea',fld:'vRECEXIREA',grid:52,pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV19RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',grid:52,pic:''},{av:'AV8RecFec',fld:'vRECFEC',pic:''},{av:'AV53Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV21RecLot',fld:'vRECLOT',grid:52,pic:''},{av:'AV55RecUbic',fld:'vRECUBIC',pic:''},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV59CCStkHor',fld:'vCCSTKHOR',pic:''},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR2.CLOSE",",oparms:[{av:'AV18Difer',fld:'vDIFER',pic:'ZZZZZZ9.9999'},{av:'AV8RecFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV55RecUbic',fld:'vRECUBIC',pic:''},{av:'AV21RecLot',fld:'vRECLOT',pic:''},{av:'AV53Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV19RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV17RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV59CCStkHor',fld:'vCCSTKHOR',pic:''},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e191S72',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e201S72',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e111S71',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e211S72',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8RecFec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8RecFec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8RecFec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV41Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV51FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV50FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV52FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV48Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV44Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV28TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV29TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV30TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV31TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV33TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV68Pgmname',fld:'vPGMNAME',pic:''},{av:'AV14OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV15OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8RecFec',fld:'vRECFEC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV27ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV12GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("VALID_PRDREC","{handler:'valid_Prdrec',iparms:[]");
      setEventMetadata("VALID_PRDREC",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Recestinv',iparms:[]");
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
      pr_default.close(4);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV7Emprcod = "" ;
      wcpOAV8RecFec = GXutil.nullDate() ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Result = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      Dvelop_confirmpanel_btnconfirmar2_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7Emprcod = "" ;
      AV8RecFec = GXutil.nullDate() ;
      AV16FilterFullText = "" ;
      A396EmprCod = "" ;
      AV28TFPrdNum = "" ;
      AV29TFPrdNum_Sel = "" ;
      AV30TFPrdNom = "" ;
      AV31TFPrdNom_Sel = "" ;
      AV32TFRecExiTeo = DecimalUtil.ZERO ;
      AV33TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV68Pgmname = "" ;
      AV41Station = "" ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV25ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV40DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A12285RecLot = "" ;
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19RecExiRcc = DecimalUtil.ZERO ;
      AV53Recfechr = GXutil.resetTime( GXutil.nullDate() );
      AV43UsurCod = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV55RecUbic = "" ;
      AV59CCStkHor = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnmemorizarcantreal_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnconfirmar2_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV69Entradarecuentos__wcds_1_filterfulltext = "" ;
      AV70Entradarecuentos__wcds_2_tfprdnum = "" ;
      AV71Entradarecuentos__wcds_3_tfprdnum_sel = "" ;
      AV72Entradarecuentos__wcds_4_tfprdnom = "" ;
      AV73Entradarecuentos__wcds_5_tfprdnom_sel = "" ;
      AV74Entradarecuentos__wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV75Entradarecuentos__wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      AV17RecExiRea = DecimalUtil.ZERO ;
      AV18Difer = DecimalUtil.ZERO ;
      AV21RecLot = "" ;
      A727PrdRec = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV69Entradarecuentos__wcds_1_filterfulltext = "" ;
      lV70Entradarecuentos__wcds_2_tfprdnum = "" ;
      lV72Entradarecuentos__wcds_4_tfprdnom = "" ;
      A810RecFec = GXutil.nullDate() ;
      H01S72_A396EmprCod = new String[] {""} ;
      H01S72_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01S72_A12285RecLot = new String[] {""} ;
      H01S72_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S72_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S72_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S72_A13416RecEstInv = new byte[1] ;
      H01S72_A727PrdRec = new String[] {""} ;
      H01S72_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S72_A718PrdNom = new String[] {""} ;
      H01S72_A719PrdNum = new String[] {""} ;
      H01S73_A396EmprCod = new String[] {""} ;
      H01S73_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01S73_A12285RecLot = new String[] {""} ;
      H01S73_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S73_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S73_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S73_A13416RecEstInv = new byte[1] ;
      H01S73_A727PrdRec = new String[] {""} ;
      H01S73_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S73_A718PrdNom = new String[] {""} ;
      H01S73_A719PrdNum = new String[] {""} ;
      hsh = "" ;
      AV42EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV26ManageFiltersXml = "" ;
      AV54inc_obs = "" ;
      AV60Precio_mov = DecimalUtil.ZERO ;
      AV20DiferCC = DecimalUtil.ZERO ;
      AV56Fecha = GXutil.nullDate() ;
      AV57CCStkCanE = DecimalUtil.ZERO ;
      AV58CCStkCanS = DecimalUtil.ZERO ;
      GXv_int19 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int8 = new int[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int23 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char20 = new String[1] ;
      AV22ExcelFilename = "" ;
      AV23ErrorMessage = "" ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29 = new GXBaseCollection[1] ;
      AV24Session = httpContext.getWebSession();
      AV13GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char30 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState31 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV9HTTPRequest = httpContext.getHttpRequest();
      GXv_char27 = new String[1] ;
      GXv_char26 = new String[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_dtime16 = new java.util.Date[1] ;
      GXv_char22 = new String[1] ;
      AV62Recfec_last = GXutil.nullDate() ;
      AV63RecHora = GXutil.resetTime( GXutil.nullDate() );
      AV64Diahora = GXutil.resetTime( GXutil.nullDate() );
      H01S74_A719PrdNum = new String[] {""} ;
      H01S74_A396EmprCod = new String[] {""} ;
      H01S74_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01S74_A13416RecEstInv = new byte[1] ;
      H01S74_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      H01S75_A719PrdNum = new String[] {""} ;
      H01S75_A396EmprCod = new String[] {""} ;
      H01S75_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      ucDvelop_confirmpanel_btnconfirmar2 = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btnmemorizarcantreal = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7Emprcod = "" ;
      sCtrlAV8RecFec = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      H01S76_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S76_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01S76_A727PrdRec = new String[] {""} ;
      H01S76_A718PrdNom = new String[] {""} ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z718PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entradarecuentos__wc__default(),
         new Object[] {
             new Object[] {
            H01S72_A396EmprCod, H01S72_A810RecFec, H01S72_A12285RecLot, H01S72_A724PrdPreAct, H01S72_A726PrdPreMed, H01S72_A808RecExiTcc, H01S72_A13416RecEstInv, H01S72_A727PrdRec, H01S72_A809RecExiTeo, H01S72_A718PrdNom,
            H01S72_A719PrdNum
            }
            , new Object[] {
            H01S73_A396EmprCod, H01S73_A810RecFec, H01S73_A12285RecLot, H01S73_A724PrdPreAct, H01S73_A726PrdPreMed, H01S73_A808RecExiTcc, H01S73_A13416RecEstInv, H01S73_A727PrdRec, H01S73_A809RecExiTeo, H01S73_A718PrdNom,
            H01S73_A719PrdNum
            }
            , new Object[] {
            H01S74_A719PrdNum, H01S74_A396EmprCod, H01S74_A810RecFec, H01S74_A13416RecEstInv, H01S74_A13455Rechora
            }
            , new Object[] {
            H01S75_A719PrdNum, H01S75_A396EmprCod, H01S75_A8577RecFecHr
            }
            , new Object[] {
            H01S76_A724PrdPreAct, H01S76_A726PrdPreMed, H01S76_A727PrdRec, H01S76_A718PrdNom
            }
         }
      );
      AV68Pgmname = "EntradaRecuentos__WC" ;
      /* GeneXus formulas. */
      AV68Pgmname = "EntradaRecuentos__WC" ;
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV27ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A13416RecEstInv ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV14OrderedBy ;
   private short AV51FlagPreMed ;
   private short AV50FlagCcs ;
   private short AV48Nalmcc ;
   private short AV44Val_stk ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV45Precio_stk ;
   private short AV46Artextil ;
   private short AV47Intexco ;
   private short AV49Ubicacion ;
   private short AV61TotDet ;
   private short GXv_int23[] ;
   private short AV65Invprd ;
   private int nRC_GXsfl_52 ;
   private int subGrid_Rows ;
   private int nGXsfl_52_idx=1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDifer_Enabled ;
   private int GXt_int7 ;
   private int edtavRecexirea_Backcolor ;
   private int edtavRecexirea_Forecolor ;
   private int edtavDifer_Backcolor ;
   private int edtavDifer_Forecolor ;
   private int edtavReclot_Backcolor ;
   private int edtavReclot_Forecolor ;
   private int nGXsfl_52_fel_idx=1 ;
   private int GXv_int19[] ;
   private int GXv_int8[] ;
   private int AV77GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavRecexirea_Enabled ;
   private int edtavRecexirea_Visible ;
   private int edtavDifer_Visible ;
   private int edtavReclot_Enabled ;
   private int edtavReclot_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52FlagCColor ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV32TFRecExiTeo ;
   private java.math.BigDecimal AV33TFRecExiTeo_To ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal AV19RecExiRcc ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV74Entradarecuentos__wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV75Entradarecuentos__wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal AV17RecExiRea ;
   private java.math.BigDecimal AV18Difer ;
   private java.math.BigDecimal AV60Precio_mov ;
   private java.math.BigDecimal AV20DiferCC ;
   private java.math.BigDecimal AV57CCStkCanE ;
   private java.math.BigDecimal AV58CCStkCanS ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private String wcpOAV7Emprcod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Result ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String Dvelop_confirmpanel_btnconfirmar2_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7Emprcod ;
   private String sGXsfl_52_idx="0001" ;
   private String A396EmprCod ;
   private String AV28TFPrdNum ;
   private String AV29TFPrdNum_Sel ;
   private String AV30TFPrdNom ;
   private String AV31TFPrdNom_Sel ;
   private String AV68Pgmname ;
   private String AV41Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A12285RecLot ;
   private String AV43UsurCod ;
   private String AV55RecUbic ;
   private String AV59CCStkHor ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Title ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Dvelop_confirmpanel_btnconfirmar2_Title ;
   private String Dvelop_confirmpanel_btnconfirmar2_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar2_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnmemorizarcantreal_Internalname ;
   private String bttBtnmemorizarcantreal_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnconfirmar2_Internalname ;
   private String bttBtnconfirmar2_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavRecexirea_Internalname ;
   private String AV70Entradarecuentos__wcds_2_tfprdnum ;
   private String AV71Entradarecuentos__wcds_3_tfprdnum_sel ;
   private String AV72Entradarecuentos__wcds_4_tfprdnom ;
   private String AV73Entradarecuentos__wcds_5_tfprdnom_sel ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtRecExiTeo_Internalname ;
   private String edtavDifer_Internalname ;
   private String AV21RecLot ;
   private String edtavReclot_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Internalname ;
   private String edtRecEstInv_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV70Entradarecuentos__wcds_2_tfprdnum ;
   private String lV72Entradarecuentos__wcds_4_tfprdnom ;
   private String hsh ;
   private String AV42EmprNom ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private String GXt_char30 ;
   private String GXt_char1 ;
   private String GXv_char27[] ;
   private String GXv_char26[] ;
   private String GXv_char22[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar2_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar2_Internalname ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_btnmemorizarcantreal_Internalname ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV7Emprcod ;
   private String sCtrlAV8RecFec ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtavRecexirea_Jsonclick ;
   private String edtavDifer_Jsonclick ;
   private String edtavReclot_Jsonclick ;
   private String edtPrdRec_Jsonclick ;
   private String edtRecEstInv_Jsonclick ;
   private String subGrid_Header ;
   private String Z727PrdRec ;
   private String Z718PrdNom ;
   private java.util.Date AV53Recfechr ;
   private java.util.Date GXv_dtime16[] ;
   private java.util.Date AV63RecHora ;
   private java.util.Date AV64Diahora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date A8577RecFecHr ;
   private java.util.Date wcpOAV8RecFec ;
   private java.util.Date AV8RecFec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV56Fecha ;
   private java.util.Date GXv_date13[] ;
   private java.util.Date AV62Recfec_last ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV15OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV26ManageFiltersXml ;
   private String AV16FilterFullText ;
   private String AV69Entradarecuentos__wcds_1_filterfulltext ;
   private String lV69Entradarecuentos__wcds_1_filterfulltext ;
   private String AV54inc_obs ;
   private String AV22ExcelFilename ;
   private String AV23ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV9HTTPRequest ;
   private com.genexus.webpanels.WebSession AV24Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnmemorizarcantreal ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01S72_A396EmprCod ;
   private java.util.Date[] H01S72_A810RecFec ;
   private String[] H01S72_A12285RecLot ;
   private java.math.BigDecimal[] H01S72_A724PrdPreAct ;
   private java.math.BigDecimal[] H01S72_A726PrdPreMed ;
   private java.math.BigDecimal[] H01S72_A808RecExiTcc ;
   private byte[] H01S72_A13416RecEstInv ;
   private String[] H01S72_A727PrdRec ;
   private java.math.BigDecimal[] H01S72_A809RecExiTeo ;
   private String[] H01S72_A718PrdNom ;
   private String[] H01S72_A719PrdNum ;
   private String[] H01S73_A396EmprCod ;
   private java.util.Date[] H01S73_A810RecFec ;
   private String[] H01S73_A12285RecLot ;
   private java.math.BigDecimal[] H01S73_A724PrdPreAct ;
   private java.math.BigDecimal[] H01S73_A726PrdPreMed ;
   private java.math.BigDecimal[] H01S73_A808RecExiTcc ;
   private byte[] H01S73_A13416RecEstInv ;
   private String[] H01S73_A727PrdRec ;
   private java.math.BigDecimal[] H01S73_A809RecExiTeo ;
   private String[] H01S73_A718PrdNom ;
   private String[] H01S73_A719PrdNum ;
   private String[] H01S74_A719PrdNum ;
   private String[] H01S74_A396EmprCod ;
   private java.util.Date[] H01S74_A810RecFec ;
   private byte[] H01S74_A13416RecEstInv ;
   private java.util.Date[] H01S74_A13455Rechora ;
   private String[] H01S75_A719PrdNum ;
   private String[] H01S75_A396EmprCod ;
   private java.util.Date[] H01S75_A8577RecFecHr ;
   private java.math.BigDecimal[] H01S76_A724PrdPreAct ;
   private java.math.BigDecimal[] H01S76_A726PrdPreMed ;
   private String[] H01S76_A727PrdRec ;
   private String[] H01S76_A718PrdNom ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV25ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV40DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState31[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV13GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class entradarecuentos__wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01S72( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Entradarecuentos__wcds_1_filterfulltext ,
                                          String AV71Entradarecuentos__wcds_3_tfprdnum_sel ,
                                          String AV70Entradarecuentos__wcds_2_tfprdnum ,
                                          String AV73Entradarecuentos__wcds_5_tfprdnom_sel ,
                                          String AV72Entradarecuentos__wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV74Entradarecuentos__wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV75Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String A396EmprCod ,
                                          java.util.Date AV8RecFec ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[11];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.EmprCod, T1.RecFec, T1.RecLot, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc, T1.RecEstInv, T2.PrdRec, T1.RecExiTeo, T2.PrdNom, T1.PrdNum" ;
      scmdbuf += " FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV69Entradarecuentos__wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int32[2] = (byte)(1) ;
         GXv_int32[3] = (byte)(1) ;
         GXv_int32[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Entradarecuentos__wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Entradarecuentos__wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Entradarecuentos__wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Entradarecuentos__wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Entradarecuentos__wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Entradarecuentos__wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Entradarecuentos__wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Entradarecuentos__wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_H01S73( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV69Entradarecuentos__wcds_1_filterfulltext ,
                                          String AV71Entradarecuentos__wcds_3_tfprdnum_sel ,
                                          String AV70Entradarecuentos__wcds_2_tfprdnum ,
                                          String AV73Entradarecuentos__wcds_5_tfprdnom_sel ,
                                          String AV72Entradarecuentos__wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV74Entradarecuentos__wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV75Entradarecuentos__wcds_7_tfrecexiteo_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          short AV14OrderedBy ,
                                          boolean AV15OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String A396EmprCod ,
                                          java.util.Date AV8RecFec ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[11];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.EmprCod, T1.RecFec, T1.RecLot, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc, T1.RecEstInv, T2.PrdRec, T1.RecExiTeo, T2.PrdNom, T1.PrdNum" ;
      scmdbuf += " FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV69Entradarecuentos__wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
         GXv_int34[3] = (byte)(1) ;
         GXv_int34[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Entradarecuentos__wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Entradarecuentos__wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Entradarecuentos__wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Entradarecuentos__wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Entradarecuentos__wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Entradarecuentos__wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Entradarecuentos__wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Entradarecuentos__wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int34[10] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV14OrderedBy == 1 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV14OrderedBy == 1 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV14OrderedBy == 2 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ! AV15OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV14OrderedBy == 3 ) && ( AV15OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
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
                  return conditional_H01S72(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] );
            case 1 :
                  return conditional_H01S73(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , ((Number) dynConstraints[10]).shortValue() , ((Boolean) dynConstraints[11]).booleanValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).byteValue() , (String)dynConstraints[14] , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01S72", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01S73", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01S74", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PrdNum, EmprCod, RecFec, RecEstInv, Rechora FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01S75", "SELECT * FROM (SELECT PrdNum, EmprCod, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? ORDER BY EmprCod, RecFecHr DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H01S76", "SELECT PrdPreAct, PrdPreMed, PrdRec, PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((String[]) buf[9])[0] = rslt.getString(10, 26);
               ((String[]) buf[10])[0] = rslt.getString(11, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
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
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[11], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[13], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

