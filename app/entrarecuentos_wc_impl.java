package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entrarecuentos_wc_impl extends GXWebComponent
{
   public entrarecuentos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entrarecuentos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entrarecuentos_wc_impl.class ));
   }

   public entrarecuentos_wc_impl( int remoteHandle ,
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
               AV26EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
               AV47recFec = localUtil.parseDateParm( httpContext.GetPar( "recFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV26EmprCod,AV47recFec});
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
      nRC_GXsfl_40 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_40"))) ;
      nGXsfl_40_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_40_idx"))) ;
      sGXsfl_40_idx = httpContext.GetPar( "sGXsfl_40_idx") ;
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
      AV30FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV47recFec = localUtil.parseDateParm( httpContext.GetPar( "recFec")) ;
      AV38ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV54TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV55TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV52TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV53TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV62TFRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo"), ".") ;
      AV63TFRecExiTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo_To"), ".") ;
      AV60TFRecExiTcc = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTcc"), ".") ;
      AV61TFRecExiTcc_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTcc_To"), ".") ;
      AV89Pgmname = httpContext.GetPar( "Pgmname") ;
      AV40OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV42OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV16Station = httpContext.GetPar( "Station") ;
      AV73FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
      AV72FlagCcs = (short)(GXutil.lval( httpContext.GetPar( "FlagCcs"))) ;
      AV9FlagCColor = GXutil.lval( httpContext.GetPar( "FlagCColor")) ;
      AV74Nalmcc = (short)(GXutil.lval( httpContext.GetPar( "Nalmcc"))) ;
      AV77Val_stk = (short)(GXutil.lval( httpContext.GetPar( "Val_stk"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV30FilterFullText, AV47recFec, AV38ManageFiltersExecutionStep, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV62TFRecExiTeo, AV63TFRecExiTeo_To, AV60TFRecExiTcc, AV61TFRecExiTcc_To, AV89Pgmname, AV40OrderedBy, AV42OrderedDsc, AV16Station, AV73FlagPreMed, AV72FlagCcs, AV9FlagCColor, AV74Nalmcc, AV77Val_stk, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1M52( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla RECUEN", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.entrarecuentos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(AV47recFec))}, new String[] {"EmprCod","recFec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV16Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV72FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV9FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77Val_stk), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV30FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_40", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_40, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV37ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV37ManageFiltersData);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV26EmprCod", GXutil.rtrim( wcpOAV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV47recFec", localUtil.dtoc( wcpOAV47recFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV38ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV54TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV55TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV52TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV53TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV62TFRecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITEO_TO", GXutil.ltrim( localUtil.ntoc( AV63TFRecExiTeo_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITCC", GXutil.ltrim( localUtil.ntoc( AV60TFRecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITCC_TO", GXutil.ltrim( localUtil.ntoc( AV61TFRecExiTcc_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV89Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV40OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV42OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXIRCC", GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLOT", GXutil.rtrim( A12285RecLot));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV33GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV33GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV17UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV16Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV16Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV73FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV47recFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFECHR", localUtil.ttoc( AV13Recfechr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECUBIC", GXutil.rtrim( AV15RecUbic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV72FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV72FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFECREC", localUtil.dtoc( AV29FecRec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKHOR", GXutil.rtrim( AV7CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV9FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV9FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNALMCC", GXutil.ltrim( localUtil.ntoc( AV74Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV77Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77Val_stk), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDREC", GXutil.rtrim( A727PrdRec));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
   }

   public void renderHtmlCloseForm1M52( )
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
      return "EntraRecuentos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla RECUEN", "") ;
   }

   public void wb1M50( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.entrarecuentos_wc");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_13_1M52( true) ;
      }
      else
      {
         wb_table1_13_1M52( false) ;
      }
      return  ;
   }

   public void wb_table1_13_1M52e( boolean wbgen )
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
         wb_table2_27_1M52( true) ;
      }
      else
      {
         wb_table2_27_1M52( false) ;
      }
      return  ;
   }

   public void wb_table2_27_1M52e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol40( ) ;
      }
      if ( wbEnd == 40 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_40 = (int)(nGXsfl_40_idx-1) ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
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
      if ( wbEnd == 40 )
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

   public void start1M52( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla RECUEN", ""), (short)(0)) ;
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
            strup1M50( ) ;
         }
      }
   }

   public void ws1M52( )
   {
      start1M52( ) ;
      evt1M52( ) ;
   }

   public void evt1M52( )
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
                              strup1M50( ) ;
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
                              strup1M50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111M52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121M52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFIRMAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoConfirmar' */
                                 e131M52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMEMORIACANTREAL'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M50( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoMemoriaCantReal' */
                                 e141M52 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1M50( ) ;
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
                              strup1M50( ) ;
                           }
                           AV80Entrarecuentos_wcds_1_filterfulltext = AV30FilterFullText ;
                           AV81Entrarecuentos_wcds_2_tfprdnum = AV54TFPrdNum ;
                           AV82Entrarecuentos_wcds_3_tfprdnum_sel = AV55TFPrdNum_Sel ;
                           AV83Entrarecuentos_wcds_4_tfprdnom = AV52TFPrdNom ;
                           AV84Entrarecuentos_wcds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
                           AV85Entrarecuentos_wcds_6_tfrecexiteo = AV62TFRecExiTeo ;
                           AV86Entrarecuentos_wcds_7_tfrecexiteo_to = AV63TFRecExiTeo_To ;
                           AV87Entrarecuentos_wcds_8_tfrecexitcc = AV60TFRecExiTcc ;
                           AV88Entrarecuentos_wcds_9_tfrecexitcc_to = AV61TFRecExiTcc_To ;
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
                              strup1M50( ) ;
                           }
                           nGXsfl_40_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_402( ) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A807RecExiRea = localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)) ;
                           A11624RecMemCant = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
                              GX_FocusControl = edtavRecexirea_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV12RecExiRea = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV12RecExiRea, 12, 4));
                           }
                           else
                           {
                              AV12RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV12RecExiRea, 12, 4));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
                              GX_FocusControl = edtavDifer_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV24Difer = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Difer), 4, 0));
                           }
                           else
                           {
                              AV24Difer = (short)(localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Difer), 4, 0));
                           }
                           A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
                              GX_FocusControl = edtavRecexircc_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV11RecExiRcc = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV11RecExiRcc, 12, 4));
                           }
                           else
                           {
                              AV11RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV11RecExiRcc, 12, 4));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
                              GX_FocusControl = edtavDifercc_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25DiferCC = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifercc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DiferCC), 4, 0));
                           }
                           else
                           {
                              AV25DiferCC = (short)(localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifercc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DiferCC), 4, 0));
                           }
                           AV14RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV14RecLot);
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
                                       e151M52 ();
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
                                       e161M52 ();
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
                                       e171M52 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV30FilterFullText) != 0 )
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
                                    strup1M50( ) ;
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

   public void we1M52( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1M52( ) ;
         }
      }
   }

   public void pa1M52( )
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
      subsflControlProps_402( ) ;
      while ( nGXsfl_40_idx <= nRC_GXsfl_40 )
      {
         sendrow_402( ) ;
         nGXsfl_40_idx = ((subGrid_Islastpage==1)&&(nGXsfl_40_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV30FilterFullText ,
                                 java.util.Date AV47recFec ,
                                 byte AV38ManageFiltersExecutionStep ,
                                 String AV54TFPrdNum ,
                                 String AV55TFPrdNum_Sel ,
                                 String AV52TFPrdNom ,
                                 String AV53TFPrdNom_Sel ,
                                 java.math.BigDecimal AV62TFRecExiTeo ,
                                 java.math.BigDecimal AV63TFRecExiTeo_To ,
                                 java.math.BigDecimal AV60TFRecExiTcc ,
                                 java.math.BigDecimal AV61TFRecExiTcc_To ,
                                 String AV89Pgmname ,
                                 short AV40OrderedBy ,
                                 boolean AV42OrderedDsc ,
                                 String AV16Station ,
                                 short AV73FlagPreMed ,
                                 short AV72FlagCcs ,
                                 long AV9FlagCColor ,
                                 short AV74Nalmcc ,
                                 short AV77Val_stk ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e161M52 ();
      GRID_nCurrentRecord = 0 ;
      rf1M52( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITEO", getSecureSignedToken( sPrefix, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITEO", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITCC", getSecureSignedToken( sPrefix, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1M52( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV89Pgmname = "EntraRecuentos_WC" ;
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavDifercc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifercc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV80Entrarecuentos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Entrarecuentos_wcds_2_tfprdnum = AV54TFPrdNum ;
      AV82Entrarecuentos_wcds_3_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV83Entrarecuentos_wcds_4_tfprdnom = AV52TFPrdNom ;
      AV84Entrarecuentos_wcds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV85Entrarecuentos_wcds_6_tfrecexiteo = AV62TFRecExiTeo ;
      AV86Entrarecuentos_wcds_7_tfrecexiteo_to = AV63TFRecExiTeo_To ;
      AV87Entrarecuentos_wcds_8_tfrecexitcc = AV60TFRecExiTcc ;
      AV88Entrarecuentos_wcds_9_tfrecexitcc_to = AV61TFRecExiTcc_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV80Entrarecuentos_wcds_1_filterfulltext ,
                                           AV82Entrarecuentos_wcds_3_tfprdnum_sel ,
                                           AV81Entrarecuentos_wcds_2_tfprdnum ,
                                           AV84Entrarecuentos_wcds_5_tfprdnom_sel ,
                                           AV83Entrarecuentos_wcds_4_tfprdnom ,
                                           AV85Entrarecuentos_wcds_6_tfrecexiteo ,
                                           AV86Entrarecuentos_wcds_7_tfrecexiteo_to ,
                                           AV87Entrarecuentos_wcds_8_tfrecexitcc ,
                                           AV88Entrarecuentos_wcds_9_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           Short.valueOf(AV40OrderedBy) ,
                                           Boolean.valueOf(AV42OrderedDsc) ,
                                           A810RecFec ,
                                           AV47recFec ,
                                           A727PrdRec ,
                                           Byte.valueOf(A13416RecEstInv) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE
                                           }
      });
      lV80Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV80Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV80Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV80Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
      lV81Entrarecuentos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV81Entrarecuentos_wcds_2_tfprdnum), 6, "%") ;
      lV83Entrarecuentos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV83Entrarecuentos_wcds_4_tfprdnom), 26, "%") ;
      /* Using cursor H01M52 */
      pr_default.execute(0, new Object[] {AV47recFec, lV80Entrarecuentos_wcds_1_filterfulltext, lV80Entrarecuentos_wcds_1_filterfulltext, lV80Entrarecuentos_wcds_1_filterfulltext, lV80Entrarecuentos_wcds_1_filterfulltext, lV81Entrarecuentos_wcds_2_tfprdnum, AV82Entrarecuentos_wcds_3_tfprdnum_sel, lV83Entrarecuentos_wcds_4_tfprdnom, AV84Entrarecuentos_wcds_5_tfprdnom_sel, AV85Entrarecuentos_wcds_6_tfrecexiteo, AV86Entrarecuentos_wcds_7_tfrecexiteo_to, AV87Entrarecuentos_wcds_8_tfrecexitcc, AV88Entrarecuentos_wcds_9_tfrecexitcc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = H01M52_A810RecFec[0] ;
         A727PrdRec = H01M52_A727PrdRec[0] ;
         A13416RecEstInv = H01M52_A13416RecEstInv[0] ;
         A806RecExiRcc = H01M52_A806RecExiRcc[0] ;
         A12285RecLot = H01M52_A12285RecLot[0] ;
         A724PrdPreAct = H01M52_A724PrdPreAct[0] ;
         A726PrdPreMed = H01M52_A726PrdPreMed[0] ;
         A808RecExiTcc = H01M52_A808RecExiTcc[0] ;
         A809RecExiTeo = H01M52_A809RecExiTeo[0] ;
         A11624RecMemCant = H01M52_A11624RecMemCant[0] ;
         A807RecExiRea = H01M52_A807RecExiRea[0] ;
         A718PrdNom = H01M52_A718PrdNom[0] ;
         A719PrdNum = H01M52_A719PrdNum[0] ;
         A396EmprCod = H01M52_A396EmprCod[0] ;
         A727PrdRec = H01M52_A727PrdRec[0] ;
         A724PrdPreAct = H01M52_A724PrdPreAct[0] ;
         A726PrdPreMed = H01M52_A726PrdPreMed[0] ;
         A718PrdNom = H01M52_A718PrdNom[0] ;
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

   public void rf1M52( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(40) ;
      /* Execute user event: Refresh */
      e161M52 ();
      nGXsfl_40_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_402( ) ;
      bGXsfl_40_Refreshing = true ;
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
         subsflControlProps_402( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV80Entrarecuentos_wcds_1_filterfulltext ,
                                              AV82Entrarecuentos_wcds_3_tfprdnum_sel ,
                                              AV81Entrarecuentos_wcds_2_tfprdnum ,
                                              AV84Entrarecuentos_wcds_5_tfprdnom_sel ,
                                              AV83Entrarecuentos_wcds_4_tfprdnom ,
                                              AV85Entrarecuentos_wcds_6_tfrecexiteo ,
                                              AV86Entrarecuentos_wcds_7_tfrecexiteo_to ,
                                              AV87Entrarecuentos_wcds_8_tfrecexitcc ,
                                              AV88Entrarecuentos_wcds_9_tfrecexitcc_to ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A809RecExiTeo ,
                                              A808RecExiTcc ,
                                              Short.valueOf(AV40OrderedBy) ,
                                              Boolean.valueOf(AV42OrderedDsc) ,
                                              A810RecFec ,
                                              AV47recFec ,
                                              A727PrdRec ,
                                              Byte.valueOf(A13416RecEstInv) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BYTE
                                              }
         });
         lV80Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
         lV80Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
         lV80Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
         lV80Entrarecuentos_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV80Entrarecuentos_wcds_1_filterfulltext), "%", "") ;
         lV81Entrarecuentos_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV81Entrarecuentos_wcds_2_tfprdnum), 6, "%") ;
         lV83Entrarecuentos_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV83Entrarecuentos_wcds_4_tfprdnom), 26, "%") ;
         /* Using cursor H01M53 */
         pr_default.execute(1, new Object[] {AV47recFec, lV80Entrarecuentos_wcds_1_filterfulltext, lV80Entrarecuentos_wcds_1_filterfulltext, lV80Entrarecuentos_wcds_1_filterfulltext, lV80Entrarecuentos_wcds_1_filterfulltext, lV81Entrarecuentos_wcds_2_tfprdnum, AV82Entrarecuentos_wcds_3_tfprdnum_sel, lV83Entrarecuentos_wcds_4_tfprdnom, AV84Entrarecuentos_wcds_5_tfprdnom_sel, AV85Entrarecuentos_wcds_6_tfrecexiteo, AV86Entrarecuentos_wcds_7_tfrecexiteo_to, AV87Entrarecuentos_wcds_8_tfrecexitcc, AV88Entrarecuentos_wcds_9_tfrecexitcc_to});
         nGXsfl_40_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A810RecFec = H01M53_A810RecFec[0] ;
            A727PrdRec = H01M53_A727PrdRec[0] ;
            A13416RecEstInv = H01M53_A13416RecEstInv[0] ;
            A806RecExiRcc = H01M53_A806RecExiRcc[0] ;
            A12285RecLot = H01M53_A12285RecLot[0] ;
            A724PrdPreAct = H01M53_A724PrdPreAct[0] ;
            A726PrdPreMed = H01M53_A726PrdPreMed[0] ;
            A808RecExiTcc = H01M53_A808RecExiTcc[0] ;
            A809RecExiTeo = H01M53_A809RecExiTeo[0] ;
            A11624RecMemCant = H01M53_A11624RecMemCant[0] ;
            A807RecExiRea = H01M53_A807RecExiRea[0] ;
            A718PrdNom = H01M53_A718PrdNom[0] ;
            A719PrdNum = H01M53_A719PrdNum[0] ;
            A396EmprCod = H01M53_A396EmprCod[0] ;
            A727PrdRec = H01M53_A727PrdRec[0] ;
            A724PrdPreAct = H01M53_A724PrdPreAct[0] ;
            A726PrdPreMed = H01M53_A726PrdPreMed[0] ;
            A718PrdNom = H01M53_A718PrdNom[0] ;
            if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
            {
               e171M52 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(40) ;
         wb1M50( ) ;
      }
      bGXsfl_40_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1M52( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV89Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV89Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV16Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV16Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV73FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV73FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITEO"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITCC"+"_"+sGXsfl_40_idx, getSecureSignedToken( sPrefix+sGXsfl_40_idx, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV72FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV72FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV9FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV9FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNALMCC", GXutil.ltrim( localUtil.ntoc( AV74Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV74Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV77Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77Val_stk), "ZZZ9")));
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
      AV80Entrarecuentos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Entrarecuentos_wcds_2_tfprdnum = AV54TFPrdNum ;
      AV82Entrarecuentos_wcds_3_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV83Entrarecuentos_wcds_4_tfprdnom = AV52TFPrdNom ;
      AV84Entrarecuentos_wcds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV85Entrarecuentos_wcds_6_tfrecexiteo = AV62TFRecExiTeo ;
      AV86Entrarecuentos_wcds_7_tfrecexiteo_to = AV63TFRecExiTeo_To ;
      AV87Entrarecuentos_wcds_8_tfrecexitcc = AV60TFRecExiTcc ;
      AV88Entrarecuentos_wcds_9_tfrecexitcc_to = AV61TFRecExiTcc_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV30FilterFullText, AV47recFec, AV38ManageFiltersExecutionStep, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV62TFRecExiTeo, AV63TFRecExiTeo_To, AV60TFRecExiTcc, AV61TFRecExiTcc_To, AV89Pgmname, AV40OrderedBy, AV42OrderedDsc, AV16Station, AV73FlagPreMed, AV72FlagCcs, AV9FlagCColor, AV74Nalmcc, AV77Val_stk, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV80Entrarecuentos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Entrarecuentos_wcds_2_tfprdnum = AV54TFPrdNum ;
      AV82Entrarecuentos_wcds_3_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV83Entrarecuentos_wcds_4_tfprdnom = AV52TFPrdNom ;
      AV84Entrarecuentos_wcds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV85Entrarecuentos_wcds_6_tfrecexiteo = AV62TFRecExiTeo ;
      AV86Entrarecuentos_wcds_7_tfrecexiteo_to = AV63TFRecExiTeo_To ;
      AV87Entrarecuentos_wcds_8_tfrecexitcc = AV60TFRecExiTcc ;
      AV88Entrarecuentos_wcds_9_tfrecexitcc_to = AV61TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30FilterFullText, AV47recFec, AV38ManageFiltersExecutionStep, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV62TFRecExiTeo, AV63TFRecExiTeo_To, AV60TFRecExiTcc, AV61TFRecExiTcc_To, AV89Pgmname, AV40OrderedBy, AV42OrderedDsc, AV16Station, AV73FlagPreMed, AV72FlagCcs, AV9FlagCColor, AV74Nalmcc, AV77Val_stk, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV80Entrarecuentos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Entrarecuentos_wcds_2_tfprdnum = AV54TFPrdNum ;
      AV82Entrarecuentos_wcds_3_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV83Entrarecuentos_wcds_4_tfprdnom = AV52TFPrdNom ;
      AV84Entrarecuentos_wcds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV85Entrarecuentos_wcds_6_tfrecexiteo = AV62TFRecExiTeo ;
      AV86Entrarecuentos_wcds_7_tfrecexiteo_to = AV63TFRecExiTeo_To ;
      AV87Entrarecuentos_wcds_8_tfrecexitcc = AV60TFRecExiTcc ;
      AV88Entrarecuentos_wcds_9_tfrecexitcc_to = AV61TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30FilterFullText, AV47recFec, AV38ManageFiltersExecutionStep, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV62TFRecExiTeo, AV63TFRecExiTeo_To, AV60TFRecExiTcc, AV61TFRecExiTcc_To, AV89Pgmname, AV40OrderedBy, AV42OrderedDsc, AV16Station, AV73FlagPreMed, AV72FlagCcs, AV9FlagCColor, AV74Nalmcc, AV77Val_stk, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV80Entrarecuentos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Entrarecuentos_wcds_2_tfprdnum = AV54TFPrdNum ;
      AV82Entrarecuentos_wcds_3_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV83Entrarecuentos_wcds_4_tfprdnom = AV52TFPrdNom ;
      AV84Entrarecuentos_wcds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV85Entrarecuentos_wcds_6_tfrecexiteo = AV62TFRecExiTeo ;
      AV86Entrarecuentos_wcds_7_tfrecexiteo_to = AV63TFRecExiTeo_To ;
      AV87Entrarecuentos_wcds_8_tfrecexitcc = AV60TFRecExiTcc ;
      AV88Entrarecuentos_wcds_9_tfrecexitcc_to = AV61TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30FilterFullText, AV47recFec, AV38ManageFiltersExecutionStep, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV62TFRecExiTeo, AV63TFRecExiTeo_To, AV60TFRecExiTcc, AV61TFRecExiTcc_To, AV89Pgmname, AV40OrderedBy, AV42OrderedDsc, AV16Station, AV73FlagPreMed, AV72FlagCcs, AV9FlagCColor, AV74Nalmcc, AV77Val_stk, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV80Entrarecuentos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Entrarecuentos_wcds_2_tfprdnum = AV54TFPrdNum ;
      AV82Entrarecuentos_wcds_3_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV83Entrarecuentos_wcds_4_tfprdnom = AV52TFPrdNom ;
      AV84Entrarecuentos_wcds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV85Entrarecuentos_wcds_6_tfrecexiteo = AV62TFRecExiTeo ;
      AV86Entrarecuentos_wcds_7_tfrecexiteo_to = AV63TFRecExiTeo_To ;
      AV87Entrarecuentos_wcds_8_tfrecexitcc = AV60TFRecExiTcc ;
      AV88Entrarecuentos_wcds_9_tfrecexitcc_to = AV61TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV30FilterFullText, AV47recFec, AV38ManageFiltersExecutionStep, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV62TFRecExiTeo, AV63TFRecExiTeo_To, AV60TFRecExiTcc, AV61TFRecExiTcc_To, AV89Pgmname, AV40OrderedBy, AV42OrderedDsc, AV16Station, AV73FlagPreMed, AV72FlagCcs, AV9FlagCColor, AV74Nalmcc, AV77Val_stk, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV89Pgmname = "EntraRecuentos_WC" ;
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      edtavDifercc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifercc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Enabled), 5, 0), !bGXsfl_40_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1M50( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151M52 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV37ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV26EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV26EmprCod") ;
         wcpOAV47recFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV47recFec"), 0) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         /* Read variables values. */
         AV30FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FilterFullText", AV30FilterFullText);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV30FilterFullText) != 0 )
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
      e151M52 ();
      if (returnInSub) return;
   }

   public void e151M52( )
   {
      /* Start Routine */
      returnInSub = false ;
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
      if ( AV40OrderedBy < 1 )
      {
         AV40OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1;
   }

   public void e161M52( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext3[0] = AV71WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext3) ;
      AV71WWPContext = GXv_SdtWWPContext3[0] ;
      if ( AV38ManageFiltersExecutionStep == 1 )
      {
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV38ManageFiltersExecutionStep == 2 )
      {
         AV38ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV80Entrarecuentos_wcds_1_filterfulltext = AV30FilterFullText ;
      AV81Entrarecuentos_wcds_2_tfprdnum = AV54TFPrdNum ;
      AV82Entrarecuentos_wcds_3_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV83Entrarecuentos_wcds_4_tfprdnom = AV52TFPrdNom ;
      AV84Entrarecuentos_wcds_5_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV85Entrarecuentos_wcds_6_tfrecexiteo = AV62TFRecExiTeo ;
      AV86Entrarecuentos_wcds_7_tfrecexiteo_to = AV63TFRecExiTeo_To ;
      AV87Entrarecuentos_wcds_8_tfrecexitcc = AV60TFRecExiTcc ;
      AV88Entrarecuentos_wcds_9_tfrecexitcc_to = AV61TFRecExiTcc_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33GridState", AV33GridState);
   }

   public void e121M52( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV40OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40OrderedBy), 4, 0));
         AV42OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42OrderedDsc", AV42OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV54TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrdNum", AV54TFPrdNum);
            AV55TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrdNum_Sel", AV55TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV52TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrdNom", AV52TFPrdNom);
            AV53TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrdNom_Sel", AV53TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTeo") == 0 )
         {
            AV62TFRecExiTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFRecExiTeo", GXutil.ltrimstr( AV62TFRecExiTeo, 12, 4));
            AV63TFRecExiTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFRecExiTeo_To", GXutil.ltrimstr( AV63TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTcc") == 0 )
         {
            AV60TFRecExiTcc = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFRecExiTcc", GXutil.ltrimstr( AV60TFRecExiTcc, 12, 4));
            AV61TFRecExiTcc_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFRecExiTcc_To", GXutil.ltrimstr( AV61TFRecExiTcc_To, 12, 4));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e171M52( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         edtPrdNom_Link = formatLink("app.tnprovprdview", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"EmprCod","PrdNum","TabCode"})  ;
         AV12RecExiRea = ((A11624RecMemCant==1) ? A807RecExiRea : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A807RecExiRea)==0) ? A809RecExiTeo : A807RecExiRea)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV12RecExiRea, 12, 4));
         edtavRecexirea_Forecolor = GXutil.getColor( 0, 0, 255) ;
         AV24Difer = (short)(DecimalUtil.decToDouble(A809RecExiTeo.subtract(AV12RecExiRea))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Difer), 4, 0));
         edtavDifer_Forecolor = GXutil.getColor( 255, 0, 0) ;
         AV11RecExiRcc = ((A11624RecMemCant==1) ? A806RecExiRcc : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A806RecExiRcc)==0) ? A808RecExiTcc : A806RecExiRcc)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV11RecExiRcc, 12, 4));
         edtavRecexircc_Forecolor = GXutil.getColor( 0, 0, 255) ;
         AV25DiferCC = (short)(DecimalUtil.decToDouble(A808RecExiTcc.subtract(AV11RecExiRcc))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifercc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DiferCC), 4, 0));
         edtavDifercc_Forecolor = GXutil.getColor( 255, 0, 0) ;
         AV14RecLot = A12285RecLot ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV14RecLot);
         edtavReclot_Forecolor = GXutil.getColor( 0, 0, 255) ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(40) ;
         }
         sendrow_402( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_40_Refreshing )
      {
         httpContext.doAjaxLoad(40, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e111M52( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("EntraRecuentos_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV89Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("EntraRecuentos_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV38ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38ManageFiltersExecutionStep", GXutil.str( AV38ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char4 = AV39ManageFiltersXml ;
         GXv_char5[0] = GXt_char4 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "EntraRecuentos_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char5) ;
         entrarecuentos_wc_impl.this.GXt_char4 = GXv_char5[0] ;
         AV39ManageFiltersXml = GXt_char4 ;
         if ( (GXutil.strcmp("", AV39ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV89Pgmname+"GridState", AV39ManageFiltersXml) ;
            AV33GridState.fromxml(AV39ManageFiltersXml, null, null);
            AV40OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40OrderedBy), 4, 0));
            AV42OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42OrderedDsc", AV42OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33GridState", AV33GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
   }

   public void e131M52( )
   {
      /* 'DoConfirmar' Routine */
      returnInSub = false ;
      AV10Inc_obs = httpContext.getMessage( "Inicio Actualizacion RECUENTO", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV26EmprCod, GXutil.substring( AV89Pgmname, 1, 10), AV17UsurCod, AV16Station, AV10Inc_obs, 99999999, (byte)(0), " ") ;
      /* Start For Each Line */
      nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_40_fel_idx = 0 ;
      while ( nGXsfl_40_fel_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_40_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_40_fel_idx+1) ;
         sGXsfl_40_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_402( ) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A807RecExiRea = localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)) ;
         A11624RecMemCant = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
            GX_FocusControl = edtavRecexirea_Internalname ;
            wbErr = true ;
            AV12RecExiRea = DecimalUtil.ZERO ;
         }
         else
         {
            AV12RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
            GX_FocusControl = edtavDifer_Internalname ;
            wbErr = true ;
            AV24Difer = (short)(0) ;
         }
         else
         {
            AV24Difer = (short)(localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
            GX_FocusControl = edtavRecexircc_Internalname ;
            wbErr = true ;
            AV11RecExiRcc = DecimalUtil.ZERO ;
         }
         else
         {
            AV11RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
            GX_FocusControl = edtavDifercc_Internalname ;
            wbErr = true ;
            AV25DiferCC = (short)(0) ;
         }
         else
         {
            AV25DiferCC = (short)(localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV14RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
         AV75Precio_mov = ((AV73FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
         AV76TotDet = DecimalUtil.doubleToDec(0) ;
         AV24Difer = (short)(DecimalUtil.decToDouble(A809RecExiTeo.subtract(AV12RecExiRea))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Difer), 4, 0));
         AV25DiferCC = (short)(DecimalUtil.decToDouble(A808RecExiTcc.subtract(AV11RecExiRcc))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifercc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DiferCC), 4, 0));
         if ( AV24Difer != 0 )
         {
            GXv_char5[0] = A396EmprCod ;
            GXv_char6[0] = A719PrdNum ;
            GXv_decimal7[0] = DecimalUtil.doubleToDec(AV24Difer) ;
            GXv_date8[0] = AV47recFec ;
            new app.pmodrem(remoteHandle, context).execute( GXv_char5, GXv_char6, GXv_decimal7, GXv_date8) ;
            entrarecuentos_wc_impl.this.A396EmprCod = GXv_char5[0] ;
            entrarecuentos_wc_impl.this.A719PrdNum = GXv_char6[0] ;
            entrarecuentos_wc_impl.this.AV24Difer = (short)(DecimalUtil.decToDouble(GXv_decimal7[0])) ;
            entrarecuentos_wc_impl.this.AV47recFec = GXv_date8[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Difer), 4, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
         }
         GXv_char6[0] = A396EmprCod ;
         GXv_char5[0] = A719PrdNum ;
         GXv_date8[0] = AV47recFec ;
         GXv_decimal7[0] = AV12RecExiRea ;
         GXv_decimal9[0] = AV11RecExiRcc ;
         GXv_decimal10[0] = AV75Precio_mov ;
         GXv_dtime11[0] = AV13Recfechr ;
         GXv_char12[0] = " " ;
         GXv_char13[0] = AV14RecLot ;
         GXv_char14[0] = AV15RecUbic ;
         new app.pmodexi2(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_date8, GXv_decimal7, GXv_decimal9, GXv_decimal10, GXv_dtime11, GXv_char12, GXv_char13, GXv_char14) ;
         entrarecuentos_wc_impl.this.A396EmprCod = GXv_char6[0] ;
         entrarecuentos_wc_impl.this.A719PrdNum = GXv_char5[0] ;
         entrarecuentos_wc_impl.this.AV47recFec = GXv_date8[0] ;
         entrarecuentos_wc_impl.this.AV12RecExiRea = GXv_decimal7[0] ;
         entrarecuentos_wc_impl.this.AV11RecExiRcc = GXv_decimal9[0] ;
         entrarecuentos_wc_impl.this.AV75Precio_mov = GXv_decimal10[0] ;
         entrarecuentos_wc_impl.this.AV13Recfechr = GXv_dtime11[0] ;
         entrarecuentos_wc_impl.this.AV14RecLot = GXv_char13[0] ;
         entrarecuentos_wc_impl.this.AV15RecUbic = GXv_char14[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV12RecExiRea, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV11RecExiRcc, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Recfechr", localUtil.ttoc( AV13Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV14RecLot);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15RecUbic", AV15RecUbic);
         if ( AV72FlagCcs == 1 )
         {
            AV8Fecha = GXutil.today( ) ;
            if ( AV24Difer < 0 )
            {
               AV5CCStkCanE = DecimalUtil.doubleToDec(-AV24Difer) ;
               AV6CCStkCanS = DecimalUtil.doubleToDec(0) ;
            }
            else
            {
               AV5CCStkCanE = DecimalUtil.doubleToDec(0) ;
               AV6CCStkCanS = DecimalUtil.doubleToDec(AV24Difer) ;
            }
            GXv_char14[0] = A396EmprCod ;
            GXv_char13[0] = A719PrdNum ;
            GXv_decimal10[0] = AV5CCStkCanE ;
            GXv_decimal9[0] = AV6CCStkCanS ;
            GXv_char12[0] = httpContext.getMessage( "SR", "") ;
            GXv_char6[0] = "1" ;
            GXv_decimal7[0] = AV75Precio_mov ;
            GXv_int15[0] = 0 ;
            GXv_int16[0] = (byte)(0) ;
            GXv_char5[0] = " " ;
            GXv_int17[0] = 0 ;
            GXv_char18[0] = " " ;
            GXv_char19[0] = AV17UsurCod ;
            GXv_char20[0] = httpContext.getMessage( "Recuento de Almacen", "") ;
            GXv_int21[0] = (short)(0) ;
            GXv_decimal22[0] = DecimalUtil.doubleToDec(0) ;
            GXv_decimal23[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date8[0] = AV29FecRec ;
            GXv_char24[0] = AV14RecLot ;
            GXv_char25[0] = AV7CCStkHor ;
            new app.precccstks(remoteHandle, context).execute( GXv_char14, GXv_char13, GXv_decimal10, GXv_decimal9, GXv_char12, GXv_char6, GXv_decimal7, GXv_int15, GXv_int16, GXv_char5, GXv_int17, GXv_char18, GXv_char19, GXv_char20, GXv_int21, GXv_decimal22, GXv_decimal23, GXv_date8, GXv_char24, GXv_char25) ;
            entrarecuentos_wc_impl.this.A396EmprCod = GXv_char14[0] ;
            entrarecuentos_wc_impl.this.A719PrdNum = GXv_char13[0] ;
            entrarecuentos_wc_impl.this.AV5CCStkCanE = GXv_decimal10[0] ;
            entrarecuentos_wc_impl.this.AV6CCStkCanS = GXv_decimal9[0] ;
            entrarecuentos_wc_impl.this.AV75Precio_mov = GXv_decimal7[0] ;
            entrarecuentos_wc_impl.this.AV17UsurCod = GXv_char19[0] ;
            entrarecuentos_wc_impl.this.AV29FecRec = GXv_date8[0] ;
            entrarecuentos_wc_impl.this.AV14RecLot = GXv_char24[0] ;
            entrarecuentos_wc_impl.this.AV7CCStkHor = GXv_char25[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17UsurCod", AV17UsurCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FecRec", localUtil.format(AV29FecRec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV14RecLot);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CCStkHor", AV7CCStkHor);
            if ( AV9FlagCColor == 1 )
            {
               if ( AV25DiferCC < 0 )
               {
                  AV5CCStkCanE = DecimalUtil.doubleToDec(-AV25DiferCC) ;
                  AV6CCStkCanS = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  AV5CCStkCanE = DecimalUtil.doubleToDec(0) ;
                  AV6CCStkCanS = DecimalUtil.doubleToDec(AV25DiferCC) ;
               }
               GXv_char25[0] = A396EmprCod ;
               GXv_char24[0] = A719PrdNum ;
               GXv_decimal23[0] = AV5CCStkCanE ;
               GXv_decimal22[0] = AV6CCStkCanS ;
               GXv_char20[0] = httpContext.getMessage( "SR", "") ;
               GXv_char19[0] = "1" ;
               GXv_decimal10[0] = AV75Precio_mov ;
               GXv_int17[0] = 0 ;
               GXv_int16[0] = (byte)(0) ;
               GXv_char18[0] = " " ;
               GXv_int15[0] = 0 ;
               GXv_char14[0] = " " ;
               GXv_char13[0] = AV17UsurCod ;
               GXv_char12[0] = httpContext.getMessage( "Recuento de CC", "") ;
               GXv_int21[0] = (short)(0) ;
               GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal7[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date8[0] = AV47recFec ;
               GXv_char6[0] = AV14RecLot ;
               GXv_char5[0] = AV7CCStkHor ;
               new app.precccstks(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_decimal23, GXv_decimal22, GXv_char20, GXv_char19, GXv_decimal10, GXv_int17, GXv_int16, GXv_char18, GXv_int15, GXv_char14, GXv_char13, GXv_char12, GXv_int21, GXv_decimal9, GXv_decimal7, GXv_date8, GXv_char6, GXv_char5) ;
               entrarecuentos_wc_impl.this.A396EmprCod = GXv_char25[0] ;
               entrarecuentos_wc_impl.this.A719PrdNum = GXv_char24[0] ;
               entrarecuentos_wc_impl.this.AV5CCStkCanE = GXv_decimal23[0] ;
               entrarecuentos_wc_impl.this.AV6CCStkCanS = GXv_decimal22[0] ;
               entrarecuentos_wc_impl.this.AV75Precio_mov = GXv_decimal10[0] ;
               entrarecuentos_wc_impl.this.AV17UsurCod = GXv_char13[0] ;
               entrarecuentos_wc_impl.this.AV47recFec = GXv_date8[0] ;
               entrarecuentos_wc_impl.this.AV14RecLot = GXv_char6[0] ;
               entrarecuentos_wc_impl.this.AV7CCStkHor = GXv_char5[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17UsurCod", AV17UsurCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV14RecLot);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CCStkHor", AV7CCStkHor);
               if ( AV74Nalmcc == 1 )
               {
                  GXv_char25[0] = A396EmprCod ;
                  GXv_char24[0] = A719PrdNum ;
                  GXv_decimal23[0] = AV11RecExiRcc ;
                  GXv_char20[0] = httpContext.getMessage( "SR", "") ;
                  GXv_decimal22[0] = AV75Precio_mov ;
                  GXv_char19[0] = AV17UsurCod ;
                  GXv_char18[0] = httpContext.getMessage( "Recuento de CC p/Almacenes", "") ;
                  GXv_date8[0] = AV47recFec ;
                  GXv_dtime11[0] = AV13Recfechr ;
                  new app.pccalm1(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_decimal23, GXv_char20, GXv_decimal22, GXv_char19, GXv_char18, GXv_date8, GXv_dtime11) ;
                  entrarecuentos_wc_impl.this.A396EmprCod = GXv_char25[0] ;
                  entrarecuentos_wc_impl.this.A719PrdNum = GXv_char24[0] ;
                  entrarecuentos_wc_impl.this.AV11RecExiRcc = GXv_decimal23[0] ;
                  entrarecuentos_wc_impl.this.AV75Precio_mov = GXv_decimal22[0] ;
                  entrarecuentos_wc_impl.this.AV17UsurCod = GXv_char19[0] ;
                  entrarecuentos_wc_impl.this.AV47recFec = GXv_date8[0] ;
                  entrarecuentos_wc_impl.this.AV13Recfechr = GXv_dtime11[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV11RecExiRcc, 12, 4));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17UsurCod", AV17UsurCod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Recfechr", localUtil.ttoc( AV13Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               }
            }
         }
         if ( AV77Val_stk == 0 )
         {
            GXv_char25[0] = A396EmprCod ;
            GXv_char24[0] = A719PrdNum ;
            new app.pstm017(remoteHandle, context).execute( GXv_char25, GXv_char24) ;
            entrarecuentos_wc_impl.this.A396EmprCod = GXv_char25[0] ;
            entrarecuentos_wc_impl.this.A719PrdNum = GXv_char24[0] ;
         }
         else
         {
            GXv_char25[0] = A396EmprCod ;
            GXv_char24[0] = A719PrdNum ;
            GXv_decimal23[0] = AV12RecExiRea ;
            GXv_decimal22[0] = AV75Precio_mov ;
            new app.pvalstksr(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_decimal23, GXv_decimal22) ;
            entrarecuentos_wc_impl.this.A396EmprCod = GXv_char25[0] ;
            entrarecuentos_wc_impl.this.A719PrdNum = GXv_char24[0] ;
            entrarecuentos_wc_impl.this.AV12RecExiRea = GXv_decimal23[0] ;
            entrarecuentos_wc_impl.this.AV75Precio_mov = GXv_decimal22[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV12RecExiRea, 12, 4));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_40_fel_idx == 0 )
      {
         nGXsfl_40_idx = 1 ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
      }
      nGXsfl_40_fel_idx = 1 ;
      AV10Inc_obs = httpContext.getMessage( "Fin Actualizacion RECUENTO", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV26EmprCod, GXutil.substring( AV89Pgmname, 1, 10), AV17UsurCod, AV16Station, AV10Inc_obs, 99999999, (byte)(0), " ") ;
      GXv_char25[0] = AV26EmprCod ;
      new app.pinvprd(remoteHandle, context).execute( GXv_char25) ;
      entrarecuentos_wc_impl.this.AV26EmprCod = GXv_char25[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_40_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid_refresh( subGrid_Rows, AV30FilterFullText, AV47recFec, AV38ManageFiltersExecutionStep, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV62TFRecExiTeo, AV63TFRecExiTeo_To, AV60TFRecExiTcc, AV61TFRecExiTcc_To, AV89Pgmname, AV40OrderedBy, AV42OrderedDsc, AV16Station, AV73FlagPreMed, AV72FlagCcs, AV9FlagCColor, AV74Nalmcc, AV77Val_stk, sPrefix) ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33GridState", AV33GridState);
   }

   public void e141M52( )
   {
      /* 'DoMemoriaCantReal' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_40 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_40"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_40_fel_idx = 0 ;
      while ( nGXsfl_40_fel_idx < nRC_GXsfl_40 )
      {
         nGXsfl_40_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_40_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_40_fel_idx+1) ;
         sGXsfl_40_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_402( ) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A807RecExiRea = localUtil.ctond( httpContext.cgiGet( edtRecExiRea_Internalname)) ;
         A11624RecMemCant = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecMemCant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
            GX_FocusControl = edtavRecexirea_Internalname ;
            wbErr = true ;
            AV12RecExiRea = DecimalUtil.ZERO ;
         }
         else
         {
            AV12RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
            GX_FocusControl = edtavDifer_Internalname ;
            wbErr = true ;
            AV24Difer = (short)(0) ;
         }
         else
         {
            AV24Difer = (short)(localUtil.ctol( httpContext.cgiGet( edtavDifer_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
            GX_FocusControl = edtavRecexircc_Internalname ;
            wbErr = true ;
            AV11RecExiRcc = DecimalUtil.ZERO ;
         }
         else
         {
            AV11RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
            GX_FocusControl = edtavDifercc_Internalname ;
            wbErr = true ;
            AV25DiferCC = (short)(0) ;
         }
         else
         {
            AV25DiferCC = (short)(localUtil.ctol( httpContext.cgiGet( edtavDifercc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV14RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
         GXv_char25[0] = A396EmprCod ;
         GXv_char24[0] = A719PrdNum ;
         GXv_date8[0] = AV47recFec ;
         GXv_decimal23[0] = AV12RecExiRea ;
         GXv_decimal22[0] = AV11RecExiRcc ;
         GXv_decimal10[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime11[0] = AV13Recfechr ;
         GXv_char20[0] = " " ;
         new app.pmemocant(remoteHandle, context).execute( GXv_char25, GXv_char24, GXv_date8, GXv_decimal23, GXv_decimal22, GXv_decimal10, GXv_dtime11, GXv_char20) ;
         entrarecuentos_wc_impl.this.A396EmprCod = GXv_char25[0] ;
         entrarecuentos_wc_impl.this.A719PrdNum = GXv_char24[0] ;
         entrarecuentos_wc_impl.this.AV47recFec = GXv_date8[0] ;
         entrarecuentos_wc_impl.this.AV12RecExiRea = GXv_decimal23[0] ;
         entrarecuentos_wc_impl.this.AV11RecExiRcc = GXv_decimal22[0] ;
         entrarecuentos_wc_impl.this.AV13Recfechr = GXv_dtime11[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV12RecExiRea, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV11RecExiRcc, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13Recfechr", localUtil.ttoc( AV13Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* End For Each Line */
      }
      if ( nGXsfl_40_fel_idx == 0 )
      {
         nGXsfl_40_idx = 1 ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
      }
      nGXsfl_40_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV37ManageFiltersData", AV37ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV33GridState", AV33GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV40OrderedBy, 4, 0))+":"+(AV42OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item26 = AV37ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item27[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item26 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "EntraRecuentos_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item27) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item26 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item27[0] ;
      AV37ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item26 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV30FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FilterFullText", AV30FilterFullText);
      AV54TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrdNum", AV54TFPrdNum);
      AV55TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrdNum_Sel", AV55TFPrdNum_Sel);
      AV52TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrdNom", AV52TFPrdNom);
      AV53TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrdNom_Sel", AV53TFPrdNom_Sel);
      AV62TFRecExiTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFRecExiTeo", GXutil.ltrimstr( AV62TFRecExiTeo, 12, 4));
      AV63TFRecExiTeo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFRecExiTeo_To", GXutil.ltrimstr( AV63TFRecExiTeo_To, 12, 4));
      AV60TFRecExiTcc = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFRecExiTcc", GXutil.ltrimstr( AV60TFRecExiTcc, 12, 4));
      AV61TFRecExiTcc_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFRecExiTcc_To", GXutil.ltrimstr( AV61TFRecExiTcc_To, 12, 4));
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
      if ( GXutil.strcmp(AV49Session.getValue(AV89Pgmname+"GridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV89Pgmname+"GridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV49Session.getValue(AV89Pgmname+"GridState"), null, null);
      }
      AV40OrderedBy = AV33GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40OrderedBy), 4, 0));
      AV42OrderedDsc = AV33GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42OrderedDsc", AV42OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV92GXV1 = 1 ;
      while ( AV92GXV1 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV92GXV1));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV30FilterFullText = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FilterFullText", AV30FilterFullText);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV54TFPrdNum = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrdNum", AV54TFPrdNum);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV55TFPrdNum_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrdNum_Sel", AV55TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV52TFPrdNom = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrdNom", AV52TFPrdNom);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV53TFPrdNom_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrdNom_Sel", AV53TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV62TFRecExiTeo = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFRecExiTeo", GXutil.ltrimstr( AV62TFRecExiTeo, 12, 4));
            AV63TFRecExiTeo_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFRecExiTeo_To", GXutil.ltrimstr( AV63TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITCC") == 0 )
         {
            AV60TFRecExiTcc = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFRecExiTcc", GXutil.ltrimstr( AV60TFRecExiTcc, 12, 4));
            AV61TFRecExiTcc_To = CommonUtil.decimalVal( AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFRecExiTcc_To", GXutil.ltrimstr( AV61TFRecExiTcc_To, 12, 4));
         }
         AV92GXV1 = (int)(AV92GXV1+1) ;
      }
      GXt_char4 = "" ;
      GXv_char25[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFPrdNum_Sel)==0), AV55TFPrdNum_Sel, GXv_char25) ;
      entrarecuentos_wc_impl.this.GXt_char4 = GXv_char25[0] ;
      GXt_char28 = "" ;
      GXv_char24[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFPrdNom_Sel)==0), AV53TFPrdNom_Sel, GXv_char24) ;
      entrarecuentos_wc_impl.this.GXt_char28 = GXv_char24[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char4+"|"+GXt_char28+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char28 = "" ;
      GXv_char25[0] = GXt_char28 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFPrdNum)==0), AV54TFPrdNum, GXv_char25) ;
      entrarecuentos_wc_impl.this.GXt_char28 = GXv_char25[0] ;
      GXt_char4 = "" ;
      GXv_char24[0] = GXt_char4 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFPrdNom)==0), AV52TFPrdNom, GXv_char24) ;
      entrarecuentos_wc_impl.this.GXt_char4 = GXv_char24[0] ;
      Ddo_grid_Filteredtext_set = GXt_char28+"|"+GXt_char4+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFRecExiTeo)==0) ? "" : GXutil.str( AV62TFRecExiTeo, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFRecExiTcc)==0) ? "" : GXutil.str( AV60TFRecExiTcc, 12, 4)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFRecExiTeo_To)==0) ? "" : GXutil.str( AV63TFRecExiTeo_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFRecExiTcc_To)==0) ? "" : GXutil.str( AV61TFRecExiTcc_To, 12, 4)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV33GridState.fromxml(AV49Session.getValue(AV89Pgmname+"GridState"), null, null);
      AV33GridState.setgxTv_SdtWWPGridState_Orderedby( AV40OrderedBy );
      AV33GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV42OrderedDsc );
      AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState29[0] = AV33GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV30FilterFullText)==0), (short)(0), AV30FilterFullText, "") ;
      AV33GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV33GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFPRDNUM", "", !(GXutil.strcmp("", AV54TFPrdNum)==0), (short)(0), AV54TFPrdNum, "", !(GXutil.strcmp("", AV55TFPrdNum_Sel)==0), AV55TFPrdNum_Sel, "") ;
      AV33GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV33GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFPRDNOM", "", !(GXutil.strcmp("", AV52TFPrdNom)==0), (short)(0), AV52TFPrdNom, "", !(GXutil.strcmp("", AV53TFPrdNom_Sel)==0), AV53TFPrdNom_Sel, "") ;
      AV33GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV33GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFRECEXITEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV62TFRecExiTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV63TFRecExiTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV62TFRecExiTeo, 12, 4)), GXutil.trim( GXutil.str( AV63TFRecExiTeo_To, 12, 4))) ;
      AV33GridState = GXv_SdtWWPGridState29[0] ;
      GXv_SdtWWPGridState29[0] = AV33GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState29, "TFRECEXITCC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFRecExiTcc)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFRecExiTcc_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV60TFRecExiTcc, 12, 4)), GXutil.trim( GXutil.str( AV61TFRecExiTcc_To, 12, 4))) ;
      AV33GridState = GXv_SdtWWPGridState29[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV89Pgmname+"GridState", AV33GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV68TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV68TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV89Pgmname );
      AV68TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV68TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV35HTTPRequest.getScriptName()+"?"+AV35HTTPRequest.getQuerystring() );
      AV68TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "RECUEN" );
      AV49Session.setValue("TrnContext", AV68TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table2_27_1M52( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "Ver Resultados", ""), bttBtnconfirmar_Jsonclick, 5, httpContext.getMessage( "Ver Resultados", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCONFIRMAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntraRecuentos_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e181m51_client"+"'", TempTags, "", 2, "HLP_EntraRecuentos_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmemoriacantreal_Internalname, "gx.evt.setGridEvt("+GXutil.str( 40, 2, 0)+","+"null"+");", httpContext.getMessage( "Memoria Cantidad Real", ""), bttBtnmemoriacantreal_Jsonclick, 5, httpContext.getMessage( "Memoria Cantidad Real", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOMEMORIACANTREAL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EntraRecuentos_WC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_27_1M52e( true) ;
      }
      else
      {
         wb_table2_27_1M52e( false) ;
      }
   }

   public void wb_table1_13_1M52( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV37ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_18_1M52( true) ;
      }
      else
      {
         wb_table3_18_1M52( false) ;
      }
      return  ;
   }

   public void wb_table3_18_1M52e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_13_1M52e( true) ;
      }
      else
      {
         wb_table1_13_1M52e( false) ;
      }
   }

   public void wb_table3_18_1M52( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'" + sPrefix + "',false,'" + sGXsfl_40_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV30FilterFullText, GXutil.rtrim( localUtil.format( AV30FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_EntraRecuentos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_18_1M52e( true) ;
      }
      else
      {
         wb_table3_18_1M52e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV26EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
      AV47recFec = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
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
      pa1M52( ) ;
      ws1M52( ) ;
      we1M52( ) ;
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
      sCtrlAV26EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV47recFec = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1M52( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "entrarecuentos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1M52( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV26EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
         AV47recFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
      }
      wcpOAV26EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV26EmprCod") ;
      wcpOAV47recFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV47recFec"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV26EmprCod, wcpOAV26EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV47recFec), GXutil.resetTime(wcpOAV47recFec)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV26EmprCod = AV26EmprCod ;
      wcpOAV47recFec = AV47recFec ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV26EmprCod = httpContext.cgiGet( sPrefix+"AV26EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV26EmprCod) > 0 )
      {
         AV26EmprCod = httpContext.cgiGet( sCtrlAV26EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV26EmprCod", AV26EmprCod);
      }
      else
      {
         AV26EmprCod = httpContext.cgiGet( sPrefix+"AV26EmprCod_PARM") ;
      }
      sCtrlAV47recFec = httpContext.cgiGet( sPrefix+"AV47recFec_CTRL") ;
      if ( GXutil.len( sCtrlAV47recFec) > 0 )
      {
         AV47recFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV47recFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47recFec", localUtil.format(AV47recFec, "99/99/99"));
      }
      else
      {
         AV47recFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV47recFec_PARM"), 0) ;
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
      pa1M52( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1M52( ) ;
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
      ws1M52( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26EmprCod_PARM", GXutil.rtrim( AV26EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV26EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV26EmprCod_CTRL", GXutil.rtrim( sCtrlAV26EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47recFec_PARM", localUtil.dtoc( AV47recFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV47recFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV47recFec_CTRL", GXutil.rtrim( sCtrlAV47recFec));
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
      we1M52( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556620", true, true);
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
      httpContext.AddJavascriptSource("entrarecuentos_wc.js", "?20268211556620", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_402( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_40_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_40_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_40_idx ;
      edtRecExiRea_Internalname = sPrefix+"RECEXIREA_"+sGXsfl_40_idx ;
      edtRecMemCant_Internalname = sPrefix+"RECMEMCANT_"+sGXsfl_40_idx ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO_"+sGXsfl_40_idx ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA_"+sGXsfl_40_idx ;
      edtavDifer_Internalname = sPrefix+"vDIFER_"+sGXsfl_40_idx ;
      edtRecExiTcc_Internalname = sPrefix+"RECEXITCC_"+sGXsfl_40_idx ;
      edtavRecexircc_Internalname = sPrefix+"vRECEXIRCC_"+sGXsfl_40_idx ;
      edtavDifercc_Internalname = sPrefix+"vDIFERCC_"+sGXsfl_40_idx ;
      edtavReclot_Internalname = sPrefix+"vRECLOT_"+sGXsfl_40_idx ;
   }

   public void subsflControlProps_fel_402( )
   {
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_40_fel_idx ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_40_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_40_fel_idx ;
      edtRecExiRea_Internalname = sPrefix+"RECEXIREA_"+sGXsfl_40_fel_idx ;
      edtRecMemCant_Internalname = sPrefix+"RECMEMCANT_"+sGXsfl_40_fel_idx ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO_"+sGXsfl_40_fel_idx ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA_"+sGXsfl_40_fel_idx ;
      edtavDifer_Internalname = sPrefix+"vDIFER_"+sGXsfl_40_fel_idx ;
      edtRecExiTcc_Internalname = sPrefix+"RECEXITCC_"+sGXsfl_40_fel_idx ;
      edtavRecexircc_Internalname = sPrefix+"vRECEXIRCC_"+sGXsfl_40_fel_idx ;
      edtavDifercc_Internalname = sPrefix+"vDIFERCC_"+sGXsfl_40_fel_idx ;
      edtavReclot_Internalname = sPrefix+"vRECLOT_"+sGXsfl_40_fel_idx ;
   }

   public void sendrow_402( )
   {
      subsflControlProps_402( ) ;
      wb1M50( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_40_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_40_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_40_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'",edtPrdNom_Link,"","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiRea_Internalname,GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A807RecExiRea, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecExiRea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecMemCant_Internalname,GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11624RecMemCant), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecMemCant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 47,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecexirea_Internalname,GXutil.ltrim( localUtil.ntoc( AV12RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV12RecExiRea, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,47);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecexirea_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavRecexirea_Forecolor)+";",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifer_Internalname,GXutil.ltrim( localUtil.ntoc( AV24Difer, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifer_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24Difer), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24Difer), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDifer_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavDifer_Forecolor)+";",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDifer_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTcc_Internalname,GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecexircc_Enabled!=0)&&(edtavRecexircc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecexircc_Internalname,GXutil.ltrim( localUtil.ntoc( AV11RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV11RecExiRcc, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavRecexircc_Enabled!=0)&&(edtavRecexircc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,50);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecexircc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavRecexircc_Forecolor)+";",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifercc_Enabled!=0)&&(edtavDifercc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifercc_Internalname,GXutil.ltrim( localUtil.ntoc( AV25DiferCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifercc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25DiferCC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25DiferCC), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavDifercc_Enabled!=0)&&(edtavDifercc_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDifercc_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavDifercc_Forecolor)+";",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDifercc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'"+sPrefix+"',false,'"+sGXsfl_40_idx+"',40)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavReclot_Internalname,GXutil.rtrim( AV14RecLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavReclot_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavReclot_Forecolor)+";",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1M52( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_40_idx = ((subGrid_Islastpage==1)&&(nGXsfl_40_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_40_idx+1) ;
         sGXsfl_40_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_40_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_402( ) ;
      }
      /* End function sendrow_402 */
   }

   public void startgridcontrol40( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"40\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencia Real Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Memorizo Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis.Teorica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis. Real ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis.Teo.Cuarto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Exis.Real.Cuarto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Difer.CC.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtPrdNom_Link));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV12RecExiRea, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavRecexirea_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV24Difer, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavDifer_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11RecExiRcc, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavRecexircc_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25DiferCC, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavDifercc_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifercc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV14RecLot));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavReclot_Forecolor, (byte)(9), (byte)(0), ".", "")));
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
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      bttBtnmemoriacantreal_Internalname = sPrefix+"BTNMEMORIACANTREAL" ;
      tblUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtRecExiRea_Internalname = sPrefix+"RECEXIREA" ;
      edtRecMemCant_Internalname = sPrefix+"RECMEMCANT" ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO" ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA" ;
      edtavDifer_Internalname = sPrefix+"vDIFER" ;
      edtRecExiTcc_Internalname = sPrefix+"RECEXITCC" ;
      edtavRecexircc_Internalname = sPrefix+"vRECEXIRCC" ;
      edtavDifercc_Internalname = sPrefix+"vDIFERCC" ;
      edtavReclot_Internalname = sPrefix+"vRECLOT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      edtavReclot_Jsonclick = "" ;
      edtavReclot_Forecolor = (int)(0x000000) ;
      edtavReclot_Visible = -1 ;
      edtavReclot_Enabled = 1 ;
      edtavDifercc_Jsonclick = "" ;
      edtavDifercc_Forecolor = (int)(0x000000) ;
      edtavDifercc_Visible = -1 ;
      edtavDifercc_Enabled = 1 ;
      edtavRecexircc_Jsonclick = "" ;
      edtavRecexircc_Forecolor = (int)(0x000000) ;
      edtavRecexircc_Visible = -1 ;
      edtavRecexircc_Enabled = 1 ;
      edtRecExiTcc_Jsonclick = "" ;
      edtavDifer_Jsonclick = "" ;
      edtavDifer_Forecolor = (int)(0x000000) ;
      edtavDifer_Visible = -1 ;
      edtavDifer_Enabled = 1 ;
      edtavRecexirea_Jsonclick = "" ;
      edtavRecexirea_Forecolor = (int)(0x000000) ;
      edtavRecexirea_Visible = -1 ;
      edtavRecexirea_Enabled = 1 ;
      edtRecExiTeo_Jsonclick = "" ;
      edtRecMemCant_Jsonclick = "" ;
      edtRecExiRea_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Link = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_grid_Datalistproc = "EntraRecuentos_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||" ;
      Ddo_grid_Includedatalist = "T|T||" ;
      Ddo_grid_Filterisrange = "||T|T" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|1|4" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom|5:RecExiTeo|8:RecExiTcc" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'sPrefix'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121M52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e171M52',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A11624RecMemCant',fld:'RECMEMCANT',pic:'9'},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'A12285RecLot',fld:'RECLOT',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'edtPrdNom_Link',ctrl:'PRDNOM',prop:'Link'},{av:'AV12RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'edtavRecexirea_Forecolor',ctrl:'vRECEXIREA',prop:'Forecolor'},{av:'AV24Difer',fld:'vDIFER',pic:'ZZZ9'},{av:'edtavDifer_Forecolor',ctrl:'vDIFER',prop:'Forecolor'},{av:'AV11RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'edtavRecexircc_Forecolor',ctrl:'vRECEXIRCC',prop:'Forecolor'},{av:'AV25DiferCC',fld:'vDIFERCC',pic:'ZZZ9'},{av:'edtavDifercc_Forecolor',ctrl:'vDIFERCC',prop:'Forecolor'},{av:'AV14RecLot',fld:'vRECLOT',pic:''},{av:'edtavReclot_Forecolor',ctrl:'vRECLOT',prop:'Forecolor'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111M52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e131M52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A809RecExiTeo',fld:'RECEXITEO',grid:40,pic:'ZZZZZZ9.9999',hsh:true},{av:'nRC_GXsfl_40',ctrl:'GRID',grid:40,prop:'GridRC',grid:40},{av:'AV12RecExiRea',fld:'vRECEXIREA',grid:40,pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',grid:40,pic:'ZZZZZZ9.9999',hsh:true},{av:'AV11RecExiRcc',fld:'vRECEXIRCC',grid:40,pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',grid:40,pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',grid:40,pic:''},{av:'AV13Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV14RecLot',fld:'vRECLOT',grid:40,pic:''},{av:'AV15RecUbic',fld:'vRECUBIC',pic:''},{av:'AV29FecRec',fld:'vFECREC',pic:''},{av:'AV7CCStkHor',fld:'vCCSTKHOR',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV24Difer',fld:'vDIFER',pic:'ZZZ9'},{av:'AV25DiferCC',fld:'vDIFERCC',pic:'ZZZ9'},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV15RecUbic',fld:'vRECUBIC',pic:''},{av:'AV14RecLot',fld:'vRECLOT',pic:''},{av:'AV13Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV11RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV12RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV7CCStkHor',fld:'vCCSTKHOR',pic:''},{av:'AV29FecRec',fld:'vFECREC',pic:''},{av:'AV17UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e181M51',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOMEMORIACANTREAL'","{handler:'e141M52',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',grid:40,pic:'@!'},{av:'nRC_GXsfl_40',ctrl:'GRID',grid:40,prop:'GridRC',grid:40},{av:'A719PrdNum',fld:'PRDNUM',grid:40,pic:''},{av:'AV12RecExiRea',fld:'vRECEXIREA',grid:40,pic:'ZZZZZZ9.9999'},{av:'AV11RecExiRcc',fld:'vRECEXIRCC',grid:40,pic:'ZZZZZZ9.9999'},{av:'AV13Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOMEMORIACANTREAL'",",oparms:[{av:'AV13Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV11RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV12RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47recFec',fld:'vRECFEC',pic:''},{av:'AV16Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV73FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV72FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV9FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV74Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV77Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'sPrefix'},{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV30FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV62TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV63TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV89Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV40OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV42OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV38ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV37ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV33GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Reclot',iparms:[]");
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
      wcpOAV26EmprCod = "" ;
      wcpOAV47recFec = GXutil.nullDate() ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV26EmprCod = "" ;
      AV47recFec = GXutil.nullDate() ;
      AV30FilterFullText = "" ;
      AV54TFPrdNum = "" ;
      AV55TFPrdNum_Sel = "" ;
      AV52TFPrdNom = "" ;
      AV53TFPrdNom_Sel = "" ;
      AV62TFRecExiTeo = DecimalUtil.ZERO ;
      AV63TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV60TFRecExiTcc = DecimalUtil.ZERO ;
      AV61TFRecExiTcc_To = DecimalUtil.ZERO ;
      AV89Pgmname = "" ;
      AV16Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV37ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A806RecExiRcc = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV17UsurCod = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV13Recfechr = GXutil.resetTime( GXutil.nullDate() );
      AV15RecUbic = "" ;
      AV29FecRec = GXutil.nullDate() ;
      AV7CCStkHor = "" ;
      A727PrdRec = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV80Entrarecuentos_wcds_1_filterfulltext = "" ;
      AV81Entrarecuentos_wcds_2_tfprdnum = "" ;
      AV82Entrarecuentos_wcds_3_tfprdnum_sel = "" ;
      AV83Entrarecuentos_wcds_4_tfprdnom = "" ;
      AV84Entrarecuentos_wcds_5_tfprdnom_sel = "" ;
      AV85Entrarecuentos_wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV86Entrarecuentos_wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV87Entrarecuentos_wcds_8_tfrecexitcc = DecimalUtil.ZERO ;
      AV88Entrarecuentos_wcds_9_tfrecexitcc_to = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A807RecExiRea = DecimalUtil.ZERO ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      AV12RecExiRea = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      AV11RecExiRcc = DecimalUtil.ZERO ;
      AV14RecLot = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV80Entrarecuentos_wcds_1_filterfulltext = "" ;
      lV81Entrarecuentos_wcds_2_tfprdnum = "" ;
      lV83Entrarecuentos_wcds_4_tfprdnom = "" ;
      A810RecFec = GXutil.nullDate() ;
      H01M52_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01M52_A727PrdRec = new String[] {""} ;
      H01M52_A13416RecEstInv = new byte[1] ;
      H01M52_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M52_A12285RecLot = new String[] {""} ;
      H01M52_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M52_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M52_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M52_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M52_A11624RecMemCant = new byte[1] ;
      H01M52_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M52_A718PrdNom = new String[] {""} ;
      H01M52_A719PrdNum = new String[] {""} ;
      H01M52_A396EmprCod = new String[] {""} ;
      H01M53_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01M53_A727PrdRec = new String[] {""} ;
      H01M53_A13416RecEstInv = new byte[1] ;
      H01M53_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M53_A12285RecLot = new String[] {""} ;
      H01M53_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M53_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M53_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M53_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M53_A11624RecMemCant = new byte[1] ;
      H01M53_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01M53_A718PrdNom = new String[] {""} ;
      H01M53_A719PrdNum = new String[] {""} ;
      H01M53_A396EmprCod = new String[] {""} ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV71WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext3 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV39ManageFiltersXml = "" ;
      AV10Inc_obs = "" ;
      AV75Precio_mov = DecimalUtil.ZERO ;
      AV76TotDet = DecimalUtil.ZERO ;
      AV8Fecha = GXutil.nullDate() ;
      AV5CCStkCanE = DecimalUtil.ZERO ;
      AV6CCStkCanS = DecimalUtil.ZERO ;
      GXv_int17 = new int[1] ;
      GXv_int16 = new byte[1] ;
      GXv_int15 = new int[1] ;
      GXv_char14 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_int21 = new short[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char19 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_decimal23 = new java.math.BigDecimal[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_dtime11 = new java.util.Date[1] ;
      GXv_char20 = new String[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item26 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item27 = new GXBaseCollection[1] ;
      AV49Session = httpContext.getWebSession();
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char28 = "" ;
      GXv_char25 = new String[1] ;
      GXt_char4 = "" ;
      GXv_char24 = new String[1] ;
      GXv_SdtWWPGridState29 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV68TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV35HTTPRequest = httpContext.getHttpRequest();
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      bttBtnmemoriacantreal_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV26EmprCod = "" ;
      sCtrlAV47recFec = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.entrarecuentos_wc__default(),
         new Object[] {
             new Object[] {
            H01M52_A810RecFec, H01M52_A727PrdRec, H01M52_A13416RecEstInv, H01M52_A806RecExiRcc, H01M52_A12285RecLot, H01M52_A724PrdPreAct, H01M52_A726PrdPreMed, H01M52_A808RecExiTcc, H01M52_A809RecExiTeo, H01M52_A11624RecMemCant,
            H01M52_A807RecExiRea, H01M52_A718PrdNom, H01M52_A719PrdNum, H01M52_A396EmprCod
            }
            , new Object[] {
            H01M53_A810RecFec, H01M53_A727PrdRec, H01M53_A13416RecEstInv, H01M53_A806RecExiRcc, H01M53_A12285RecLot, H01M53_A724PrdPreAct, H01M53_A726PrdPreMed, H01M53_A808RecExiTcc, H01M53_A809RecExiTeo, H01M53_A11624RecMemCant,
            H01M53_A807RecExiRea, H01M53_A718PrdNom, H01M53_A719PrdNum, H01M53_A396EmprCod
            }
         }
      );
      AV89Pgmname = "EntraRecuentos_WC" ;
      /* GeneXus formulas. */
      AV89Pgmname = "EntraRecuentos_WC" ;
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      edtavDifercc_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV38ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A11624RecMemCant ;
   private byte nDonePA ;
   private byte A13416RecEstInv ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXv_int16[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV40OrderedBy ;
   private short AV73FlagPreMed ;
   private short AV72FlagCcs ;
   private short AV74Nalmcc ;
   private short AV77Val_stk ;
   private short wbEnd ;
   private short wbStart ;
   private short AV24Difer ;
   private short AV25DiferCC ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int21[] ;
   private int nRC_GXsfl_40 ;
   private int subGrid_Rows ;
   private int nGXsfl_40_idx=1 ;
   private int subGrid_Islastpage ;
   private int edtavDifer_Enabled ;
   private int edtavDifercc_Enabled ;
   private int edtavRecexirea_Forecolor ;
   private int edtavDifer_Forecolor ;
   private int edtavRecexircc_Forecolor ;
   private int edtavDifercc_Forecolor ;
   private int edtavReclot_Forecolor ;
   private int nGXsfl_40_fel_idx=1 ;
   private int GXv_int17[] ;
   private int GXv_int15[] ;
   private int AV92GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavRecexirea_Enabled ;
   private int edtavRecexirea_Visible ;
   private int edtavDifer_Visible ;
   private int edtavRecexircc_Enabled ;
   private int edtavRecexircc_Visible ;
   private int edtavDifercc_Visible ;
   private int edtavReclot_Enabled ;
   private int edtavReclot_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV9FlagCColor ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV62TFRecExiTeo ;
   private java.math.BigDecimal AV63TFRecExiTeo_To ;
   private java.math.BigDecimal AV60TFRecExiTcc ;
   private java.math.BigDecimal AV61TFRecExiTcc_To ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV85Entrarecuentos_wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV86Entrarecuentos_wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV87Entrarecuentos_wcds_8_tfrecexitcc ;
   private java.math.BigDecimal AV88Entrarecuentos_wcds_9_tfrecexitcc_to ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal AV12RecExiRea ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal AV11RecExiRcc ;
   private java.math.BigDecimal AV75Precio_mov ;
   private java.math.BigDecimal AV76TotDet ;
   private java.math.BigDecimal AV5CCStkCanE ;
   private java.math.BigDecimal AV6CCStkCanS ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal23[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private String wcpOAV26EmprCod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV26EmprCod ;
   private String sGXsfl_40_idx="0001" ;
   private String AV54TFPrdNum ;
   private String AV55TFPrdNum_Sel ;
   private String AV52TFPrdNom ;
   private String AV53TFPrdNom_Sel ;
   private String AV89Pgmname ;
   private String AV16Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A12285RecLot ;
   private String AV17UsurCod ;
   private String AV15RecUbic ;
   private String AV7CCStkHor ;
   private String A727PrdRec ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavRecexirea_Internalname ;
   private String AV81Entrarecuentos_wcds_2_tfprdnum ;
   private String AV82Entrarecuentos_wcds_3_tfprdnum_sel ;
   private String AV83Entrarecuentos_wcds_4_tfprdnom ;
   private String AV84Entrarecuentos_wcds_5_tfprdnom_sel ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtRecExiRea_Internalname ;
   private String edtRecMemCant_Internalname ;
   private String edtRecExiTeo_Internalname ;
   private String edtavDifer_Internalname ;
   private String edtRecExiTcc_Internalname ;
   private String edtavRecexircc_Internalname ;
   private String edtavDifercc_Internalname ;
   private String AV14RecLot ;
   private String edtavReclot_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV81Entrarecuentos_wcds_2_tfprdnum ;
   private String lV83Entrarecuentos_wcds_4_tfprdnom ;
   private String edtPrdNom_Link ;
   private String sGXsfl_40_fel_idx="0001" ;
   private String GXv_char14[] ;
   private String GXv_char13[] ;
   private String GXv_char12[] ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char19[] ;
   private String GXv_char18[] ;
   private String GXv_char20[] ;
   private String GXt_char28 ;
   private String GXv_char25[] ;
   private String GXt_char4 ;
   private String GXv_char24[] ;
   private String tblUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String bttBtnmemoriacantreal_Internalname ;
   private String bttBtnmemoriacantreal_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV26EmprCod ;
   private String sCtrlAV47recFec ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtRecExiRea_Jsonclick ;
   private String edtRecMemCant_Jsonclick ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtavRecexirea_Jsonclick ;
   private String edtavDifer_Jsonclick ;
   private String edtRecExiTcc_Jsonclick ;
   private String edtavRecexircc_Jsonclick ;
   private String edtavDifercc_Jsonclick ;
   private String edtavReclot_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV13Recfechr ;
   private java.util.Date GXv_dtime11[] ;
   private java.util.Date wcpOAV47recFec ;
   private java.util.Date AV47recFec ;
   private java.util.Date AV29FecRec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV8Fecha ;
   private java.util.Date GXv_date8[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV42OrderedDsc ;
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
   private boolean bGXsfl_40_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV39ManageFiltersXml ;
   private String AV30FilterFullText ;
   private String AV80Entrarecuentos_wcds_1_filterfulltext ;
   private String lV80Entrarecuentos_wcds_1_filterfulltext ;
   private String AV10Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV35HTTPRequest ;
   private com.genexus.webpanels.WebSession AV49Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01M52_A810RecFec ;
   private String[] H01M52_A727PrdRec ;
   private byte[] H01M52_A13416RecEstInv ;
   private java.math.BigDecimal[] H01M52_A806RecExiRcc ;
   private String[] H01M52_A12285RecLot ;
   private java.math.BigDecimal[] H01M52_A724PrdPreAct ;
   private java.math.BigDecimal[] H01M52_A726PrdPreMed ;
   private java.math.BigDecimal[] H01M52_A808RecExiTcc ;
   private java.math.BigDecimal[] H01M52_A809RecExiTeo ;
   private byte[] H01M52_A11624RecMemCant ;
   private java.math.BigDecimal[] H01M52_A807RecExiRea ;
   private String[] H01M52_A718PrdNom ;
   private String[] H01M52_A719PrdNum ;
   private String[] H01M52_A396EmprCod ;
   private java.util.Date[] H01M53_A810RecFec ;
   private String[] H01M53_A727PrdRec ;
   private byte[] H01M53_A13416RecEstInv ;
   private java.math.BigDecimal[] H01M53_A806RecExiRcc ;
   private String[] H01M53_A12285RecLot ;
   private java.math.BigDecimal[] H01M53_A724PrdPreAct ;
   private java.math.BigDecimal[] H01M53_A726PrdPreMed ;
   private java.math.BigDecimal[] H01M53_A808RecExiTcc ;
   private java.math.BigDecimal[] H01M53_A809RecExiTeo ;
   private byte[] H01M53_A11624RecMemCant ;
   private java.math.BigDecimal[] H01M53_A807RecExiRea ;
   private String[] H01M53_A718PrdNom ;
   private String[] H01M53_A719PrdNum ;
   private String[] H01M53_A396EmprCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV37ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item26 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item27[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons1 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons2[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState29[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV68TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV71WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext3[] ;
}

final  class entrarecuentos_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01M52( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Entrarecuentos_wcds_1_filterfulltext ,
                                          String AV82Entrarecuentos_wcds_3_tfprdnum_sel ,
                                          String AV81Entrarecuentos_wcds_2_tfprdnum ,
                                          String AV84Entrarecuentos_wcds_5_tfprdnom_sel ,
                                          String AV83Entrarecuentos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV85Entrarecuentos_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV86Entrarecuentos_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV87Entrarecuentos_wcds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV88Entrarecuentos_wcds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          short AV40OrderedBy ,
                                          boolean AV42OrderedDsc ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV47recFec ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[13];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.RecFec, T2.PrdRec, T1.RecEstInv, T1.RecExiRcc, T1.RecLot, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc, T1.RecExiTeo, T1.RecMemCant," ;
      scmdbuf += " T1.RecExiRea, T2.PrdNom, T1.PrdNum, T1.EmprCod FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV80Entrarecuentos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int30[1] = (byte)(1) ;
         GXv_int30[2] = (byte)(1) ;
         GXv_int30[3] = (byte)(1) ;
         GXv_int30[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Entrarecuentos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV81Entrarecuentos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Entrarecuentos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int30[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Entrarecuentos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Entrarecuentos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Entrarecuentos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int30[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Entrarecuentos_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int30[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Entrarecuentos_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int30[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Entrarecuentos_wcds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Entrarecuentos_wcds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV40OrderedBy == 1 ) && ! AV42OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV40OrderedBy == 1 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV40OrderedBy == 2 ) && ! AV42OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV40OrderedBy == 2 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV40OrderedBy == 3 ) && ! AV42OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV40OrderedBy == 3 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV40OrderedBy == 4 ) && ! AV42OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc" ;
      }
      else if ( ( AV40OrderedBy == 4 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc DESC" ;
      }
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
   }

   protected Object[] conditional_H01M53( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV80Entrarecuentos_wcds_1_filterfulltext ,
                                          String AV82Entrarecuentos_wcds_3_tfprdnum_sel ,
                                          String AV81Entrarecuentos_wcds_2_tfprdnum ,
                                          String AV84Entrarecuentos_wcds_5_tfprdnom_sel ,
                                          String AV83Entrarecuentos_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV85Entrarecuentos_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV86Entrarecuentos_wcds_7_tfrecexiteo_to ,
                                          java.math.BigDecimal AV87Entrarecuentos_wcds_8_tfrecexitcc ,
                                          java.math.BigDecimal AV88Entrarecuentos_wcds_9_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          short AV40OrderedBy ,
                                          boolean AV42OrderedDsc ,
                                          java.util.Date A810RecFec ,
                                          java.util.Date AV47recFec ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[13];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.RecFec, T2.PrdRec, T1.RecEstInv, T1.RecExiRcc, T1.RecLot, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc, T1.RecExiTeo, T1.RecMemCant," ;
      scmdbuf += " T1.RecExiRea, T2.PrdNom, T1.PrdNum, T1.EmprCod FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( ! (GXutil.strcmp("", AV80Entrarecuentos_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.RecExiTcc,'9999990.9999'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int32[1] = (byte)(1) ;
         GXv_int32[2] = (byte)(1) ;
         GXv_int32[3] = (byte)(1) ;
         GXv_int32[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV82Entrarecuentos_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV81Entrarecuentos_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82Entrarecuentos_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Entrarecuentos_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV83Entrarecuentos_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Entrarecuentos_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Entrarecuentos_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV86Entrarecuentos_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int32[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Entrarecuentos_wcds_8_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int32[11] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Entrarecuentos_wcds_9_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int32[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV40OrderedBy == 1 ) && ! AV42OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV40OrderedBy == 1 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV40OrderedBy == 2 ) && ! AV42OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV40OrderedBy == 2 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV40OrderedBy == 3 ) && ! AV42OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV40OrderedBy == 3 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV40OrderedBy == 4 ) && ! AV42OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc" ;
      }
      else if ( ( AV40OrderedBy == 4 ) && ( AV42OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc DESC" ;
      }
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
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
                  return conditional_H01M52(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() );
            case 1 :
                  return conditional_H01M53(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (java.util.Date)dynConstraints[15] , (java.util.Date)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01M52", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01M53", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,4);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
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
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               return;
      }
   }

}

