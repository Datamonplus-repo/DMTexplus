package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class historicoderecetas_wc_impl extends GXWebComponent
{
   public historicoderecetas_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public historicoderecetas_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( historicoderecetas_wc_impl.class ));
   }

   public historicoderecetas_wc_impl( int remoteHandle ,
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
               AV7EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
               AV8HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreBarCod), 8, 0));
               AV9HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreBarReo", GXutil.str( AV9HreBarReo, 1, 0));
               AV10HreBarPar = httpContext.GetPar( "HreBarPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreBarPar", AV10HreBarPar);
               AV11Hremaqcod = httpContext.GetPar( "Hremaqcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Hremaqcod", AV11Hremaqcod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV7EmprCod,Integer.valueOf(AV8HreBarCod),Byte.valueOf(AV9HreBarReo),AV10HreBarPar,AV11Hremaqcod});
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV20FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV7EmprCod = httpContext.GetPar( "EmprCod") ;
      AV8HreBarCod = (int)(GXutil.lval( httpContext.GetPar( "HreBarCod"))) ;
      AV9HreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "HreBarReo"))) ;
      AV10HreBarPar = httpContext.GetPar( "HreBarPar") ;
      AV11Hremaqcod = httpContext.GetPar( "Hremaqcod") ;
      AV30ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV25ColumnsSelector);
      AV31TFHreMaqCod = httpContext.GetPar( "TFHreMaqCod") ;
      AV32TFHreMaqCod_Sel = httpContext.GetPar( "TFHreMaqCod_Sel") ;
      AV33TFHreVolPrd = (int)(GXutil.lval( httpContext.GetPar( "TFHreVolPrd"))) ;
      AV34TFHreVolPrd_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreVolPrd_To"))) ;
      AV35TFHreNumCie = (byte)(GXutil.lval( httpContext.GetPar( "TFHreNumCie"))) ;
      AV36TFHreNumCie_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHreNumCie_To"))) ;
      AV37TFHreLinMaq = (short)(GXutil.lval( httpContext.GetPar( "TFHreLinMaq"))) ;
      AV38TFHreLinMaq_To = (short)(GXutil.lval( httpContext.GetPar( "TFHreLinMaq_To"))) ;
      AV52TFHreBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFHreBarCod"))) ;
      AV53TFHreBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFHreBarCod_To"))) ;
      AV54TFHreBarReo = (byte)(GXutil.lval( httpContext.GetPar( "TFHreBarReo"))) ;
      AV55TFHreBarReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFHreBarReo_To"))) ;
      AV56TFHreBarPar = httpContext.GetPar( "TFHreBarPar") ;
      AV57TFHreBarPar_Sel = httpContext.GetPar( "TFHreBarPar_Sel") ;
      AV58TFEmprCod = httpContext.GetPar( "TFEmprCod") ;
      AV59TFEmprCod_Sel = httpContext.GetPar( "TFEmprCod_Sel") ;
      AV82Pgmname = httpContext.GetPar( "Pgmname") ;
      AV17OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV18OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV44Receta = (short)(GXutil.lval( httpContext.GetPar( "Receta"))) ;
      AV45PwdGrl = (short)(GXutil.lval( httpContext.GetPar( "PwdGrl"))) ;
      AV46ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV7EmprCod, AV8HreBarCod, AV9HreBarReo, AV10HreBarPar, AV11Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV31TFHreMaqCod, AV32TFHreMaqCod_Sel, AV33TFHreVolPrd, AV34TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV37TFHreLinMaq, AV38TFHreLinMaq_To, AV52TFHreBarCod, AV53TFHreBarCod_To, AV54TFHreBarReo, AV55TFHreBarReo_To, AV56TFHreBarPar, AV57TFHreBarPar_Sel, AV58TFEmprCod, AV59TFEmprCod_Sel, AV82Pgmname, AV17OrderedBy, AV18OrderedDsc, AV44Receta, AV45PwdGrl, AV46ContVal, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1FU2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Historico de Recetas", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.historicoderecetas_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10HreBarPar)),GXutil.URLEncode(GXutil.rtrim(AV11Hremaqcod))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","Hremaqcod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV82Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV45PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV46ContVal), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV20FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV28ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV41GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV42GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV39DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV25ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV25ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7EmprCod", GXutil.rtrim( wcpOAV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8HreBarCod", GXutil.ltrim( localUtil.ntoc( wcpOAV8HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9HreBarReo", GXutil.ltrim( localUtil.ntoc( wcpOAV9HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10HreBarPar", GXutil.rtrim( wcpOAV10HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV11Hremaqcod", GXutil.rtrim( wcpOAV11Hremaqcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV30ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREMAQCOD", GXutil.rtrim( AV31TFHreMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREMAQCOD_SEL", GXutil.rtrim( AV32TFHreMaqCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREVOLPRD", GXutil.ltrim( localUtil.ntoc( AV33TFHreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREVOLPRD_TO", GXutil.ltrim( localUtil.ntoc( AV34TFHreVolPrd_To, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRENUMCIE", GXutil.ltrim( localUtil.ntoc( AV35TFHreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRENUMCIE_TO", GXutil.ltrim( localUtil.ntoc( AV36TFHreNumCie_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELINMAQ", GXutil.ltrim( localUtil.ntoc( AV37TFHreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHRELINMAQ_TO", GXutil.ltrim( localUtil.ntoc( AV38TFHreLinMaq_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV52TFHreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV53TFHreBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARREO", GXutil.ltrim( localUtil.ntoc( AV54TFHreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARREO_TO", GXutil.ltrim( localUtil.ntoc( AV55TFHreBarReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARPAR", GXutil.rtrim( AV56TFHreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFHREBARPAR_SEL", GXutil.rtrim( AV57TFHreBarPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFEMPRCOD", GXutil.rtrim( AV58TFEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFEMPRCOD_SEL", GXutil.rtrim( AV59TFEmprCod_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV82Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV82Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV17OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV18OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARCOD", GXutil.ltrim( localUtil.ntoc( AV8HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARREO", GXutil.ltrim( localUtil.ntoc( AV9HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREBARPAR", GXutil.rtrim( AV10HreBarPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHREMAQCOD", GXutil.rtrim( AV11Hremaqcod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV15GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV15GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECETA", GXutil.ltrim( localUtil.ntoc( AV44Receta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV45PwdGrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV45PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV46ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV46ContVal), "ZZZZZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm1FU2( )
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
         if ( ! ( WebComp_Grid_dwc == null ) )
         {
            WebComp_Grid_dwc.componentjscripts();
         }
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
      return "HistoricodeRecetas_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Historico de Recetas", "") ;
   }

   public void wb1FU0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.historicoderecetas_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecetahistorico_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Receta Historico (PDF)", ""), bttBtnrecetahistorico_Jsonclick, 5, httpContext.getMessage( "Receta Historico (PDF)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DORECETAHISTORICO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HistoricodeRecetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecetacostes_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Receta Costes (PDF)", ""), bttBtnrecetacostes_Jsonclick, 5, httpContext.getMessage( "Receta Costes (PDF)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DORECETACOSTES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HistoricodeRecetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnrecetaconnormas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "Receta con Normas (PDF)", ""), bttBtnrecetaconnormas_Jsonclick, 5, httpContext.getMessage( "Receta con Normas (PDF)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DORECETACONNORMAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HistoricodeRecetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_HistoricodeRecetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1FU2( true) ;
      }
      else
      {
         wb_table1_25_1FU2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1FU2e( boolean wbgen )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         ucGridpaginationbar.setProperty("CurrentPage", AV41GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV42GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"W0058"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+sPrefix+"gxHTMLWrpW0058"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_43_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp(sPrefix+"gxHTMLWrpW0058"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspEndCmp();
                  }
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV25ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void start1FU2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Historico de Recetas", ""), (short)(0)) ;
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
            strup1FU0( ) ;
         }
      }
   }

   public void ws1FU2( )
   {
      start1FU2( ) ;
      evt1FU2( ) ;
   }

   public void evt1FU2( )
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
                              strup1FU0( ) ;
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
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111FU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121FU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131FU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141FU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151FU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORECETACOSTES'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoRecetaCostes' */
                                 e161FU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORECETACONNORMAS'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoRecetaconNormas' */
                                 e171FU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DORECETAHISTORICO'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoRecetaHistorico' */
                                 e181FU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1FU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
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
                              strup1FU0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           AV50DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV50DetailWebComponent);
                           A4546HreMaqCod = httpContext.cgiGet( edtHreMaqCod_Internalname) ;
                           n4546HreMaqCod = false ;
                           A4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n4547HreVolPrd = false ;
                           A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e191FU2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e201FU2 ();
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
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211FU2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV20FilterFullText) != 0 )
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
                                    strup1FU0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDetailwebcomponent_Internalname ;
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 58 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( sPrefix+"W0058") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess(sPrefix+"W0058", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1FU2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1FU2( ) ;
         }
      }
   }

   public void pa1FU2( )
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV20FilterFullText ,
                                 String AV7EmprCod ,
                                 int AV8HreBarCod ,
                                 byte AV9HreBarReo ,
                                 String AV10HreBarPar ,
                                 String AV11Hremaqcod ,
                                 byte AV30ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ,
                                 String AV31TFHreMaqCod ,
                                 String AV32TFHreMaqCod_Sel ,
                                 int AV33TFHreVolPrd ,
                                 int AV34TFHreVolPrd_To ,
                                 byte AV35TFHreNumCie ,
                                 byte AV36TFHreNumCie_To ,
                                 short AV37TFHreLinMaq ,
                                 short AV38TFHreLinMaq_To ,
                                 int AV52TFHreBarCod ,
                                 int AV53TFHreBarCod_To ,
                                 byte AV54TFHreBarReo ,
                                 byte AV55TFHreBarReo_To ,
                                 String AV56TFHreBarPar ,
                                 String AV57TFHreBarPar_Sel ,
                                 String AV58TFEmprCod ,
                                 String AV59TFEmprCod_Sel ,
                                 String AV82Pgmname ,
                                 short AV17OrderedBy ,
                                 boolean AV18OrderedDsc ,
                                 short AV44Receta ,
                                 short AV45PwdGrl ,
                                 int AV46ContVal ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201FU2 ();
      GRID_nCurrentRecord = 0 ;
      rf1FU2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      send_integrity_hashes( ) ;
      rf1FU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV82Pgmname = "HistoricodeRecetas_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
   }

   public void rf1FU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e201FU2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV65Historicoderecetas_wcds_1_filterfulltext ,
                                              AV67Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                              AV66Historicoderecetas_wcds_2_tfhremaqcod ,
                                              Integer.valueOf(AV68Historicoderecetas_wcds_4_tfhrevolprd) ,
                                              Integer.valueOf(AV69Historicoderecetas_wcds_5_tfhrevolprd_to) ,
                                              Byte.valueOf(AV70Historicoderecetas_wcds_6_tfhrenumcie) ,
                                              Byte.valueOf(AV71Historicoderecetas_wcds_7_tfhrenumcie_to) ,
                                              Short.valueOf(AV72Historicoderecetas_wcds_8_tfhrelinmaq) ,
                                              Short.valueOf(AV73Historicoderecetas_wcds_9_tfhrelinmaq_to) ,
                                              Integer.valueOf(AV74Historicoderecetas_wcds_10_tfhrebarcod) ,
                                              Integer.valueOf(AV75Historicoderecetas_wcds_11_tfhrebarcod_to) ,
                                              Byte.valueOf(AV76Historicoderecetas_wcds_12_tfhrebarreo) ,
                                              Byte.valueOf(AV77Historicoderecetas_wcds_13_tfhrebarreo_to) ,
                                              AV79Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                              AV78Historicoderecetas_wcds_14_tfhrebarpar ,
                                              AV81Historicoderecetas_wcds_17_tfemprcod_sel ,
                                              AV80Historicoderecetas_wcds_16_tfemprcod ,
                                              A4546HreMaqCod ,
                                              Integer.valueOf(A4547HreVolPrd) ,
                                              Byte.valueOf(A4495HreNumCie) ,
                                              Short.valueOf(A4545HreLinMaq) ,
                                              Integer.valueOf(A4492HreBarCod) ,
                                              Byte.valueOf(A4493HreBarReo) ,
                                              A4494HreBarPar ,
                                              A396EmprCod ,
                                              Short.valueOf(AV17OrderedBy) ,
                                              Boolean.valueOf(AV18OrderedDsc) ,
                                              AV11Hremaqcod ,
                                              AV7EmprCod ,
                                              Integer.valueOf(AV8HreBarCod) ,
                                              Byte.valueOf(AV9HreBarReo) ,
                                              AV10HreBarPar } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                              TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                              }
         });
         lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
         lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
         lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
         lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
         lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
         lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
         lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
         lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
         lV66Historicoderecetas_wcds_2_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV66Historicoderecetas_wcds_2_tfhremaqcod), 6, "%") ;
         lV78Historicoderecetas_wcds_14_tfhrebarpar = GXutil.padr( GXutil.rtrim( AV78Historicoderecetas_wcds_14_tfhrebarpar), 1, "%") ;
         lV80Historicoderecetas_wcds_16_tfemprcod = GXutil.padr( GXutil.rtrim( AV80Historicoderecetas_wcds_16_tfemprcod), 3, "%") ;
         /* Using cursor H01FU2 */
         pr_default.execute(0, new Object[] {AV7EmprCod, Integer.valueOf(AV8HreBarCod), Byte.valueOf(AV9HreBarReo), AV10HreBarPar, AV11Hremaqcod, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV66Historicoderecetas_wcds_2_tfhremaqcod, AV67Historicoderecetas_wcds_3_tfhremaqcod_sel, Integer.valueOf(AV68Historicoderecetas_wcds_4_tfhrevolprd), Integer.valueOf(AV69Historicoderecetas_wcds_5_tfhrevolprd_to), Byte.valueOf(AV70Historicoderecetas_wcds_6_tfhrenumcie), Byte.valueOf(AV71Historicoderecetas_wcds_7_tfhrenumcie_to), Short.valueOf(AV72Historicoderecetas_wcds_8_tfhrelinmaq), Short.valueOf(AV73Historicoderecetas_wcds_9_tfhrelinmaq_to), Integer.valueOf(AV74Historicoderecetas_wcds_10_tfhrebarcod), Integer.valueOf(AV75Historicoderecetas_wcds_11_tfhrebarcod_to), Byte.valueOf(AV76Historicoderecetas_wcds_12_tfhrebarreo), Byte.valueOf(AV77Historicoderecetas_wcds_13_tfhrebarreo_to), lV78Historicoderecetas_wcds_14_tfhrebarpar, AV79Historicoderecetas_wcds_15_tfhrebarpar_sel, lV80Historicoderecetas_wcds_16_tfemprcod, AV81Historicoderecetas_wcds_17_tfemprcod_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01FU2_A396EmprCod[0] ;
            A4494HreBarPar = H01FU2_A4494HreBarPar[0] ;
            A4493HreBarReo = H01FU2_A4493HreBarReo[0] ;
            A4492HreBarCod = H01FU2_A4492HreBarCod[0] ;
            A4545HreLinMaq = H01FU2_A4545HreLinMaq[0] ;
            A4495HreNumCie = H01FU2_A4495HreNumCie[0] ;
            A4547HreVolPrd = H01FU2_A4547HreVolPrd[0] ;
            n4547HreVolPrd = H01FU2_n4547HreVolPrd[0] ;
            A4546HreMaqCod = H01FU2_A4546HreMaqCod[0] ;
            n4546HreMaqCod = H01FU2_n4546HreMaqCod[0] ;
            e211FU2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb1FU0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1FU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV82Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV82Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECETA", GXutil.ltrim( localUtil.ntoc( AV44Receta, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44Receta), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV45PwdGrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV45PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV46ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV46ContVal), "ZZZZZZZ9")));
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
      AV65Historicoderecetas_wcds_1_filterfulltext = AV20FilterFullText ;
      AV66Historicoderecetas_wcds_2_tfhremaqcod = AV31TFHreMaqCod ;
      AV67Historicoderecetas_wcds_3_tfhremaqcod_sel = AV32TFHreMaqCod_Sel ;
      AV68Historicoderecetas_wcds_4_tfhrevolprd = AV33TFHreVolPrd ;
      AV69Historicoderecetas_wcds_5_tfhrevolprd_to = AV34TFHreVolPrd_To ;
      AV70Historicoderecetas_wcds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Historicoderecetas_wcds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Historicoderecetas_wcds_8_tfhrelinmaq = AV37TFHreLinMaq ;
      AV73Historicoderecetas_wcds_9_tfhrelinmaq_to = AV38TFHreLinMaq_To ;
      AV74Historicoderecetas_wcds_10_tfhrebarcod = AV52TFHreBarCod ;
      AV75Historicoderecetas_wcds_11_tfhrebarcod_to = AV53TFHreBarCod_To ;
      AV76Historicoderecetas_wcds_12_tfhrebarreo = AV54TFHreBarReo ;
      AV77Historicoderecetas_wcds_13_tfhrebarreo_to = AV55TFHreBarReo_To ;
      AV78Historicoderecetas_wcds_14_tfhrebarpar = AV56TFHreBarPar ;
      AV79Historicoderecetas_wcds_15_tfhrebarpar_sel = AV57TFHreBarPar_Sel ;
      AV80Historicoderecetas_wcds_16_tfemprcod = AV58TFEmprCod ;
      AV81Historicoderecetas_wcds_17_tfemprcod_sel = AV59TFEmprCod_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV65Historicoderecetas_wcds_1_filterfulltext ,
                                           AV67Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                           AV66Historicoderecetas_wcds_2_tfhremaqcod ,
                                           Integer.valueOf(AV68Historicoderecetas_wcds_4_tfhrevolprd) ,
                                           Integer.valueOf(AV69Historicoderecetas_wcds_5_tfhrevolprd_to) ,
                                           Byte.valueOf(AV70Historicoderecetas_wcds_6_tfhrenumcie) ,
                                           Byte.valueOf(AV71Historicoderecetas_wcds_7_tfhrenumcie_to) ,
                                           Short.valueOf(AV72Historicoderecetas_wcds_8_tfhrelinmaq) ,
                                           Short.valueOf(AV73Historicoderecetas_wcds_9_tfhrelinmaq_to) ,
                                           Integer.valueOf(AV74Historicoderecetas_wcds_10_tfhrebarcod) ,
                                           Integer.valueOf(AV75Historicoderecetas_wcds_11_tfhrebarcod_to) ,
                                           Byte.valueOf(AV76Historicoderecetas_wcds_12_tfhrebarreo) ,
                                           Byte.valueOf(AV77Historicoderecetas_wcds_13_tfhrebarreo_to) ,
                                           AV79Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                           AV78Historicoderecetas_wcds_14_tfhrebarpar ,
                                           AV81Historicoderecetas_wcds_17_tfemprcod_sel ,
                                           AV80Historicoderecetas_wcds_16_tfemprcod ,
                                           A4546HreMaqCod ,
                                           Integer.valueOf(A4547HreVolPrd) ,
                                           Byte.valueOf(A4495HreNumCie) ,
                                           Short.valueOf(A4545HreLinMaq) ,
                                           Integer.valueOf(A4492HreBarCod) ,
                                           Byte.valueOf(A4493HreBarReo) ,
                                           A4494HreBarPar ,
                                           A396EmprCod ,
                                           Short.valueOf(AV17OrderedBy) ,
                                           Boolean.valueOf(AV18OrderedDsc) ,
                                           AV11Hremaqcod ,
                                           AV7EmprCod ,
                                           Integer.valueOf(AV8HreBarCod) ,
                                           Byte.valueOf(AV9HreBarReo) ,
                                           AV10HreBarPar } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.INT,
                                           TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING
                                           }
      });
      lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV65Historicoderecetas_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV65Historicoderecetas_wcds_1_filterfulltext), "%", "") ;
      lV66Historicoderecetas_wcds_2_tfhremaqcod = GXutil.padr( GXutil.rtrim( AV66Historicoderecetas_wcds_2_tfhremaqcod), 6, "%") ;
      lV78Historicoderecetas_wcds_14_tfhrebarpar = GXutil.padr( GXutil.rtrim( AV78Historicoderecetas_wcds_14_tfhrebarpar), 1, "%") ;
      lV80Historicoderecetas_wcds_16_tfemprcod = GXutil.padr( GXutil.rtrim( AV80Historicoderecetas_wcds_16_tfemprcod), 3, "%") ;
      /* Using cursor H01FU3 */
      pr_default.execute(1, new Object[] {AV7EmprCod, Integer.valueOf(AV8HreBarCod), Byte.valueOf(AV9HreBarReo), AV10HreBarPar, AV11Hremaqcod, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV65Historicoderecetas_wcds_1_filterfulltext, lV66Historicoderecetas_wcds_2_tfhremaqcod, AV67Historicoderecetas_wcds_3_tfhremaqcod_sel, Integer.valueOf(AV68Historicoderecetas_wcds_4_tfhrevolprd), Integer.valueOf(AV69Historicoderecetas_wcds_5_tfhrevolprd_to), Byte.valueOf(AV70Historicoderecetas_wcds_6_tfhrenumcie), Byte.valueOf(AV71Historicoderecetas_wcds_7_tfhrenumcie_to), Short.valueOf(AV72Historicoderecetas_wcds_8_tfhrelinmaq), Short.valueOf(AV73Historicoderecetas_wcds_9_tfhrelinmaq_to), Integer.valueOf(AV74Historicoderecetas_wcds_10_tfhrebarcod), Integer.valueOf(AV75Historicoderecetas_wcds_11_tfhrebarcod_to), Byte.valueOf(AV76Historicoderecetas_wcds_12_tfhrebarreo), Byte.valueOf(AV77Historicoderecetas_wcds_13_tfhrebarreo_to), lV78Historicoderecetas_wcds_14_tfhrebarpar, AV79Historicoderecetas_wcds_15_tfhrebarpar_sel, lV80Historicoderecetas_wcds_16_tfemprcod, AV81Historicoderecetas_wcds_17_tfemprcod_sel});
      GRID_nRecordCount = H01FU3_AGRID_nRecordCount[0] ;
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
      AV65Historicoderecetas_wcds_1_filterfulltext = AV20FilterFullText ;
      AV66Historicoderecetas_wcds_2_tfhremaqcod = AV31TFHreMaqCod ;
      AV67Historicoderecetas_wcds_3_tfhremaqcod_sel = AV32TFHreMaqCod_Sel ;
      AV68Historicoderecetas_wcds_4_tfhrevolprd = AV33TFHreVolPrd ;
      AV69Historicoderecetas_wcds_5_tfhrevolprd_to = AV34TFHreVolPrd_To ;
      AV70Historicoderecetas_wcds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Historicoderecetas_wcds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Historicoderecetas_wcds_8_tfhrelinmaq = AV37TFHreLinMaq ;
      AV73Historicoderecetas_wcds_9_tfhrelinmaq_to = AV38TFHreLinMaq_To ;
      AV74Historicoderecetas_wcds_10_tfhrebarcod = AV52TFHreBarCod ;
      AV75Historicoderecetas_wcds_11_tfhrebarcod_to = AV53TFHreBarCod_To ;
      AV76Historicoderecetas_wcds_12_tfhrebarreo = AV54TFHreBarReo ;
      AV77Historicoderecetas_wcds_13_tfhrebarreo_to = AV55TFHreBarReo_To ;
      AV78Historicoderecetas_wcds_14_tfhrebarpar = AV56TFHreBarPar ;
      AV79Historicoderecetas_wcds_15_tfhrebarpar_sel = AV57TFHreBarPar_Sel ;
      AV80Historicoderecetas_wcds_16_tfemprcod = AV58TFEmprCod ;
      AV81Historicoderecetas_wcds_17_tfemprcod_sel = AV59TFEmprCod_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV7EmprCod, AV8HreBarCod, AV9HreBarReo, AV10HreBarPar, AV11Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV31TFHreMaqCod, AV32TFHreMaqCod_Sel, AV33TFHreVolPrd, AV34TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV37TFHreLinMaq, AV38TFHreLinMaq_To, AV52TFHreBarCod, AV53TFHreBarCod_To, AV54TFHreBarReo, AV55TFHreBarReo_To, AV56TFHreBarPar, AV57TFHreBarPar_Sel, AV58TFEmprCod, AV59TFEmprCod_Sel, AV82Pgmname, AV17OrderedBy, AV18OrderedDsc, AV44Receta, AV45PwdGrl, AV46ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV65Historicoderecetas_wcds_1_filterfulltext = AV20FilterFullText ;
      AV66Historicoderecetas_wcds_2_tfhremaqcod = AV31TFHreMaqCod ;
      AV67Historicoderecetas_wcds_3_tfhremaqcod_sel = AV32TFHreMaqCod_Sel ;
      AV68Historicoderecetas_wcds_4_tfhrevolprd = AV33TFHreVolPrd ;
      AV69Historicoderecetas_wcds_5_tfhrevolprd_to = AV34TFHreVolPrd_To ;
      AV70Historicoderecetas_wcds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Historicoderecetas_wcds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Historicoderecetas_wcds_8_tfhrelinmaq = AV37TFHreLinMaq ;
      AV73Historicoderecetas_wcds_9_tfhrelinmaq_to = AV38TFHreLinMaq_To ;
      AV74Historicoderecetas_wcds_10_tfhrebarcod = AV52TFHreBarCod ;
      AV75Historicoderecetas_wcds_11_tfhrebarcod_to = AV53TFHreBarCod_To ;
      AV76Historicoderecetas_wcds_12_tfhrebarreo = AV54TFHreBarReo ;
      AV77Historicoderecetas_wcds_13_tfhrebarreo_to = AV55TFHreBarReo_To ;
      AV78Historicoderecetas_wcds_14_tfhrebarpar = AV56TFHreBarPar ;
      AV79Historicoderecetas_wcds_15_tfhrebarpar_sel = AV57TFHreBarPar_Sel ;
      AV80Historicoderecetas_wcds_16_tfemprcod = AV58TFEmprCod ;
      AV81Historicoderecetas_wcds_17_tfemprcod_sel = AV59TFEmprCod_Sel ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV7EmprCod, AV8HreBarCod, AV9HreBarReo, AV10HreBarPar, AV11Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV31TFHreMaqCod, AV32TFHreMaqCod_Sel, AV33TFHreVolPrd, AV34TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV37TFHreLinMaq, AV38TFHreLinMaq_To, AV52TFHreBarCod, AV53TFHreBarCod_To, AV54TFHreBarReo, AV55TFHreBarReo_To, AV56TFHreBarPar, AV57TFHreBarPar_Sel, AV58TFEmprCod, AV59TFEmprCod_Sel, AV82Pgmname, AV17OrderedBy, AV18OrderedDsc, AV44Receta, AV45PwdGrl, AV46ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV65Historicoderecetas_wcds_1_filterfulltext = AV20FilterFullText ;
      AV66Historicoderecetas_wcds_2_tfhremaqcod = AV31TFHreMaqCod ;
      AV67Historicoderecetas_wcds_3_tfhremaqcod_sel = AV32TFHreMaqCod_Sel ;
      AV68Historicoderecetas_wcds_4_tfhrevolprd = AV33TFHreVolPrd ;
      AV69Historicoderecetas_wcds_5_tfhrevolprd_to = AV34TFHreVolPrd_To ;
      AV70Historicoderecetas_wcds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Historicoderecetas_wcds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Historicoderecetas_wcds_8_tfhrelinmaq = AV37TFHreLinMaq ;
      AV73Historicoderecetas_wcds_9_tfhrelinmaq_to = AV38TFHreLinMaq_To ;
      AV74Historicoderecetas_wcds_10_tfhrebarcod = AV52TFHreBarCod ;
      AV75Historicoderecetas_wcds_11_tfhrebarcod_to = AV53TFHreBarCod_To ;
      AV76Historicoderecetas_wcds_12_tfhrebarreo = AV54TFHreBarReo ;
      AV77Historicoderecetas_wcds_13_tfhrebarreo_to = AV55TFHreBarReo_To ;
      AV78Historicoderecetas_wcds_14_tfhrebarpar = AV56TFHreBarPar ;
      AV79Historicoderecetas_wcds_15_tfhrebarpar_sel = AV57TFHreBarPar_Sel ;
      AV80Historicoderecetas_wcds_16_tfemprcod = AV58TFEmprCod ;
      AV81Historicoderecetas_wcds_17_tfemprcod_sel = AV59TFEmprCod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV7EmprCod, AV8HreBarCod, AV9HreBarReo, AV10HreBarPar, AV11Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV31TFHreMaqCod, AV32TFHreMaqCod_Sel, AV33TFHreVolPrd, AV34TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV37TFHreLinMaq, AV38TFHreLinMaq_To, AV52TFHreBarCod, AV53TFHreBarCod_To, AV54TFHreBarReo, AV55TFHreBarReo_To, AV56TFHreBarPar, AV57TFHreBarPar_Sel, AV58TFEmprCod, AV59TFEmprCod_Sel, AV82Pgmname, AV17OrderedBy, AV18OrderedDsc, AV44Receta, AV45PwdGrl, AV46ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV65Historicoderecetas_wcds_1_filterfulltext = AV20FilterFullText ;
      AV66Historicoderecetas_wcds_2_tfhremaqcod = AV31TFHreMaqCod ;
      AV67Historicoderecetas_wcds_3_tfhremaqcod_sel = AV32TFHreMaqCod_Sel ;
      AV68Historicoderecetas_wcds_4_tfhrevolprd = AV33TFHreVolPrd ;
      AV69Historicoderecetas_wcds_5_tfhrevolprd_to = AV34TFHreVolPrd_To ;
      AV70Historicoderecetas_wcds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Historicoderecetas_wcds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Historicoderecetas_wcds_8_tfhrelinmaq = AV37TFHreLinMaq ;
      AV73Historicoderecetas_wcds_9_tfhrelinmaq_to = AV38TFHreLinMaq_To ;
      AV74Historicoderecetas_wcds_10_tfhrebarcod = AV52TFHreBarCod ;
      AV75Historicoderecetas_wcds_11_tfhrebarcod_to = AV53TFHreBarCod_To ;
      AV76Historicoderecetas_wcds_12_tfhrebarreo = AV54TFHreBarReo ;
      AV77Historicoderecetas_wcds_13_tfhrebarreo_to = AV55TFHreBarReo_To ;
      AV78Historicoderecetas_wcds_14_tfhrebarpar = AV56TFHreBarPar ;
      AV79Historicoderecetas_wcds_15_tfhrebarpar_sel = AV57TFHreBarPar_Sel ;
      AV80Historicoderecetas_wcds_16_tfemprcod = AV58TFEmprCod ;
      AV81Historicoderecetas_wcds_17_tfemprcod_sel = AV59TFEmprCod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV7EmprCod, AV8HreBarCod, AV9HreBarReo, AV10HreBarPar, AV11Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV31TFHreMaqCod, AV32TFHreMaqCod_Sel, AV33TFHreVolPrd, AV34TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV37TFHreLinMaq, AV38TFHreLinMaq_To, AV52TFHreBarCod, AV53TFHreBarCod_To, AV54TFHreBarReo, AV55TFHreBarReo_To, AV56TFHreBarPar, AV57TFHreBarPar_Sel, AV58TFEmprCod, AV59TFEmprCod_Sel, AV82Pgmname, AV17OrderedBy, AV18OrderedDsc, AV44Receta, AV45PwdGrl, AV46ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV65Historicoderecetas_wcds_1_filterfulltext = AV20FilterFullText ;
      AV66Historicoderecetas_wcds_2_tfhremaqcod = AV31TFHreMaqCod ;
      AV67Historicoderecetas_wcds_3_tfhremaqcod_sel = AV32TFHreMaqCod_Sel ;
      AV68Historicoderecetas_wcds_4_tfhrevolprd = AV33TFHreVolPrd ;
      AV69Historicoderecetas_wcds_5_tfhrevolprd_to = AV34TFHreVolPrd_To ;
      AV70Historicoderecetas_wcds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Historicoderecetas_wcds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Historicoderecetas_wcds_8_tfhrelinmaq = AV37TFHreLinMaq ;
      AV73Historicoderecetas_wcds_9_tfhrelinmaq_to = AV38TFHreLinMaq_To ;
      AV74Historicoderecetas_wcds_10_tfhrebarcod = AV52TFHreBarCod ;
      AV75Historicoderecetas_wcds_11_tfhrebarcod_to = AV53TFHreBarCod_To ;
      AV76Historicoderecetas_wcds_12_tfhrebarreo = AV54TFHreBarReo ;
      AV77Historicoderecetas_wcds_13_tfhrebarreo_to = AV55TFHreBarReo_To ;
      AV78Historicoderecetas_wcds_14_tfhrebarpar = AV56TFHreBarPar ;
      AV79Historicoderecetas_wcds_15_tfhrebarpar_sel = AV57TFHreBarPar_Sel ;
      AV80Historicoderecetas_wcds_16_tfemprcod = AV58TFEmprCod ;
      AV81Historicoderecetas_wcds_17_tfemprcod_sel = AV59TFEmprCod_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV20FilterFullText, AV7EmprCod, AV8HreBarCod, AV9HreBarReo, AV10HreBarPar, AV11Hremaqcod, AV30ManageFiltersExecutionStep, AV25ColumnsSelector, AV31TFHreMaqCod, AV32TFHreMaqCod_Sel, AV33TFHreVolPrd, AV34TFHreVolPrd_To, AV35TFHreNumCie, AV36TFHreNumCie_To, AV37TFHreLinMaq, AV38TFHreLinMaq_To, AV52TFHreBarCod, AV53TFHreBarCod_To, AV54TFHreBarReo, AV55TFHreBarReo_To, AV56TFHreBarPar, AV57TFHreBarPar_Sel, AV58TFEmprCod, AV59TFEmprCod_Sel, AV82Pgmname, AV17OrderedBy, AV18OrderedDsc, AV44Receta, AV45PwdGrl, AV46ContVal, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV82Pgmname = "HistoricodeRecetas_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_43_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1FU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191FU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV28ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV39DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV25ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV41GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV42GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV7EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV7EmprCod") ;
         wcpOAV8HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV10HreBarPar") ;
         wcpOAV11Hremaqcod = httpContext.cgiGet( sPrefix+"wcpOAV11Hremaqcod") ;
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
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV20FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FilterFullText", AV20FilterFullText);
         /* Read subfile selected row values. */
         nGXsfl_43_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         if ( nGXsfl_43_idx > 0 )
         {
            AV50DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV50DetailWebComponent);
            A4546HreMaqCod = httpContext.cgiGet( edtHreMaqCod_Internalname) ;
            n4546HreMaqCod = false ;
            A4547HreVolPrd = (int)(localUtil.ctol( httpContext.cgiGet( edtHreVolPrd_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4547HreVolPrd = false ;
            A4495HreNumCie = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreNumCie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4545HreLinMaq = (short)(localUtil.ctol( httpContext.cgiGet( edtHreLinMaq_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4492HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtHreBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4493HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtHreBarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4494HreBarPar = httpContext.cgiGet( edtHreBarPar_Internalname) ;
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV20FilterFullText) != 0 )
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
      e191FU2 ();
      if (returnInSub) return;
   }

   public void e191FU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV44Receta) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "HRRECE", ""), GXv_int2) ;
      historicoderecetas_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV44Receta = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV44Receta", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44Receta), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vRECETA", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV44Receta), "ZZZ9")));
      GXt_int3 = AV46ContVal ;
      GXv_int4[0] = GXt_int3 ;
      new app.pbuscon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PWDHHR", ""), GXv_int4) ;
      historicoderecetas_wc_impl.this.GXt_int3 = GXv_int4[0] ;
      AV46ContVal = GXt_int3 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCONTVAL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV46ContVal), "ZZZZZZZ9")));
      GXt_int1 = (byte)(AV45PwdGrl) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "PWDHHR", ""), GXv_int2) ;
      historicoderecetas_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV45PwdGrl = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45PwdGrl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45PwdGrl), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPWDGRL", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV45PwdGrl), "ZZZ9")));
      GXt_int1 = (byte)(AV47anahuac) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "ANAHUA", ""), GXv_int2) ;
      historicoderecetas_wc_impl.this.GXt_int1 = GXv_int2[0] ;
      AV47anahuac = GXt_int1 ;
      GXt_char5 = AV62Station ;
      GXv_char6[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      historicoderecetas_wc_impl.this.GXt_char5 = GXv_char6[0] ;
      AV62Station = GXt_char5 ;
      GXv_char6[0] = AV7EmprCod ;
      GXv_char7[0] = AV63Emprnom ;
      GXv_char8[0] = AV64Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char6, GXv_char7, GXv_char8) ;
      historicoderecetas_wc_impl.this.AV7EmprCod = GXv_char6[0] ;
      historicoderecetas_wc_impl.this.AV63Emprnom = GXv_char7[0] ;
      historicoderecetas_wc_impl.this.AV64Usurcod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
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
      if ( AV17OrderedBy < 1 )
      {
         AV17OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV39DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV39DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201FU2( )
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
      if ( AV30ManageFiltersExecutionStep == 1 )
      {
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV30ManageFiltersExecutionStep == 2 )
      {
         AV30ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV27Session.getValue("HistoricodeRecetas_WCColumnsSelector"), "") != 0 )
      {
         AV23ColumnsSelectorXML = AV27Session.getValue("HistoricodeRecetas_WCColumnsSelector") ;
         AV25ColumnsSelector.fromxml(AV23ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtHreMaqCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreMaqCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtHreVolPrd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreVolPrd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreVolPrd_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtHreNumCie_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreNumCie_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreNumCie_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtHreLinMaq_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreLinMaq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreLinMaq_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtHreBarCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreBarCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtHreBarReo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreBarReo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarReo_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtHreBarPar_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtHreBarPar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtHreBarPar_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtEmprCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV25ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      AV41GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridCurrentPage), 10, 0));
      AV42GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42GridPageCount), 10, 0));
      AV65Historicoderecetas_wcds_1_filterfulltext = AV20FilterFullText ;
      AV66Historicoderecetas_wcds_2_tfhremaqcod = AV31TFHreMaqCod ;
      AV67Historicoderecetas_wcds_3_tfhremaqcod_sel = AV32TFHreMaqCod_Sel ;
      AV68Historicoderecetas_wcds_4_tfhrevolprd = AV33TFHreVolPrd ;
      AV69Historicoderecetas_wcds_5_tfhrevolprd_to = AV34TFHreVolPrd_To ;
      AV70Historicoderecetas_wcds_6_tfhrenumcie = AV35TFHreNumCie ;
      AV71Historicoderecetas_wcds_7_tfhrenumcie_to = AV36TFHreNumCie_To ;
      AV72Historicoderecetas_wcds_8_tfhrelinmaq = AV37TFHreLinMaq ;
      AV73Historicoderecetas_wcds_9_tfhrelinmaq_to = AV38TFHreLinMaq_To ;
      AV74Historicoderecetas_wcds_10_tfhrebarcod = AV52TFHreBarCod ;
      AV75Historicoderecetas_wcds_11_tfhrebarcod_to = AV53TFHreBarCod_To ;
      AV76Historicoderecetas_wcds_12_tfhrebarreo = AV54TFHreBarReo ;
      AV77Historicoderecetas_wcds_13_tfhrebarreo_to = AV55TFHreBarReo_To ;
      AV78Historicoderecetas_wcds_14_tfhrebarpar = AV56TFHreBarPar ;
      AV79Historicoderecetas_wcds_15_tfhrebarpar_sel = AV57TFHreBarPar_Sel ;
      AV80Historicoderecetas_wcds_16_tfemprcod = AV58TFEmprCod ;
      AV81Historicoderecetas_wcds_17_tfemprcod_sel = AV59TFEmprCod_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e121FU2( )
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
         AV40PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV40PageToGo) ;
      }
   }

   public void e131FU2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141FU2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV17OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
         AV18OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreMaqCod") == 0 )
         {
            AV31TFHreMaqCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFHreMaqCod", AV31TFHreMaqCod);
            AV32TFHreMaqCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFHreMaqCod_Sel", AV32TFHreMaqCod_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreVolPrd") == 0 )
         {
            AV33TFHreVolPrd = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFHreVolPrd), 5, 0));
            AV34TFHreVolPrd_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreNumCie") == 0 )
         {
            AV35TFHreNumCie = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFHreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreNumCie), 2, 0));
            AV36TFHreNumCie_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFHreNumCie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreNumCie_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreLinMaq") == 0 )
         {
            AV37TFHreLinMaq = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFHreLinMaq), 4, 0));
            AV38TFHreLinMaq_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHreLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFHreLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreBarCod") == 0 )
         {
            AV52TFHreBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFHreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFHreBarCod), 8, 0));
            AV53TFHreBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFHreBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFHreBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreBarReo") == 0 )
         {
            AV54TFHreBarReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFHreBarReo", GXutil.str( AV54TFHreBarReo, 1, 0));
            AV55TFHreBarReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHreBarReo_To", GXutil.str( AV55TFHreBarReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "HreBarPar") == 0 )
         {
            AV56TFHreBarPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHreBarPar", AV56TFHreBarPar);
            AV57TFHreBarPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHreBarPar_Sel", AV57TFHreBarPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "EmprCod") == 0 )
         {
            AV58TFEmprCod = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFEmprCod", AV58TFEmprCod);
            AV59TFEmprCod_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFEmprCod_Sel", AV59TFEmprCod_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211FU2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV50DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDetailwebcomponent_Internalname, AV50DetailWebComponent);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151FU2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV23ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV25ColumnsSelector.fromJSonString(AV23ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_WCColumnsSelector", ((GXutil.strcmp("", AV23ColumnsSelectorXML)==0) ? "" : AV25ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void e111FU2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("HistoricodeRecetas_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV82Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("HistoricodeRecetas_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV30ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30ManageFiltersExecutionStep", GXutil.str( AV30ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char5 = AV29ManageFiltersXml ;
         GXv_char8[0] = GXt_char5 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "HistoricodeRecetas_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char8) ;
         historicoderecetas_wc_impl.this.GXt_char5 = GXv_char8[0] ;
         AV29ManageFiltersXml = GXt_char5 ;
         if ( (GXutil.strcmp("", AV29ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV82Pgmname+"GridState", AV29ManageFiltersXml) ;
            AV15GridState.fromxml(AV29ManageFiltersXml, null, null);
            AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
            AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
   }

   public void e181FU2( )
   {
      /* 'DoRecetaHistorico' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.prctinhistorico", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","HreBarCod","HreBarReo","HreBarPar","HreNumCie","Output"}) , new Object[] {"AV7EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
      /*  Sending Event outputs  */
   }

   public void e161FU2( )
   {
      /* 'DoRecetaCostes' Routine */
      returnInSub = false ;
      if ( AV44Receta == 1 )
      {
         httpContext.popup(formatLink("app.rhrhr021", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","HRENUMCIE","Output"}) , new Object[] {"AV7EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
      }
      else
      {
         AV43ClaveConfirmada = true ;
         if ( AV45PwdGrl == 1 )
         {
            AV43ClaveConfirmada = false ;
            AV48WebSession.setValue("ValidarWebWPwdGrl", GXutil.str( AV46ContVal, 8, 0));
            /* Window Datatype Object Property */
            AV49Window.setUrl( formatLink("app.webwpwdgrl", new String[] {GXutil.URLEncode(GXutil.booltostr(AV43ClaveConfirmada))}, new String[] {"PwdBo"})  );
            AV49Window.setReturnParms(new Object[] {"AV43ClaveConfirmada",});
            httpContext.newWindow(AV49Window);
         }
         if ( AV43ClaveConfirmada )
         {
            httpContext.popup(formatLink("app.rhrhr02", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","HRENUMCIE","Output"}) , new Object[] {"AV7EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4495HreNumCie",""});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e171FU2( )
   {
      /* 'DoRecetaconNormas' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.prctccporhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4492HreBarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A4493HreBarReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A4494HreBarPar)),GXutil.URLEncode(GXutil.ltrimstr(A4545HreLinMaq,4,0)),GXutil.URLEncode(GXutil.ltrimstr(A4495HreNumCie,2,0))}, new String[] {"EmprCod","Barcod","Barcodreo","Barcodpar","Reclinmaq","HreNumCie"}) , new Object[] {"A396EmprCod","A4492HreBarCod","A4493HreBarReo","A4494HreBarPar","A4545HreLinMaq","A4495HreNumCie"});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV25ColumnsSelector", AV25ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV28ManageFiltersData", AV28ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV15GridState", AV15GridState);
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV17OrderedBy, 4, 0))+":"+(AV18OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV25ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HreMaqCod", "", "Maquina", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HreVolPrd", "", "Volumen", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HreNumCie", "", "#", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HreLinMaq", "", "##", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HreBarCod", "", "Hdr", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HreBarReo", "", "R", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "HreBarPar", "", "P", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV25ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "EmprCod", "", "Empresa", true, "") ;
      AV25ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char5 = AV24UserCustomValue ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "HistoricodeRecetas_WCColumnsSelector", GXv_char8) ;
      historicoderecetas_wc_impl.this.GXt_char5 = GXv_char8[0] ;
      AV24UserCustomValue = GXt_char5 ;
      if ( ! ( (GXutil.strcmp("", AV24UserCustomValue)==0) ) )
      {
         AV26ColumnsSelectorAux.fromxml(AV24UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV25ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV26ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV25ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV28ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "HistoricodeRecetas_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV28ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV20FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FilterFullText", AV20FilterFullText);
      AV31TFHreMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFHreMaqCod", AV31TFHreMaqCod);
      AV32TFHreMaqCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFHreMaqCod_Sel", AV32TFHreMaqCod_Sel);
      AV33TFHreVolPrd = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFHreVolPrd), 5, 0));
      AV34TFHreVolPrd_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreVolPrd_To), 5, 0));
      AV35TFHreNumCie = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFHreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreNumCie), 2, 0));
      AV36TFHreNumCie_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFHreNumCie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreNumCie_To), 2, 0));
      AV37TFHreLinMaq = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFHreLinMaq), 4, 0));
      AV38TFHreLinMaq_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHreLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFHreLinMaq_To), 4, 0));
      AV52TFHreBarCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFHreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFHreBarCod), 8, 0));
      AV53TFHreBarCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFHreBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFHreBarCod_To), 8, 0));
      AV54TFHreBarReo = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFHreBarReo", GXutil.str( AV54TFHreBarReo, 1, 0));
      AV55TFHreBarReo_To = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHreBarReo_To", GXutil.str( AV55TFHreBarReo_To, 1, 0));
      AV56TFHreBarPar = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHreBarPar", AV56TFHreBarPar);
      AV57TFHreBarPar_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHreBarPar_Sel", AV57TFHreBarPar_Sel);
      AV58TFEmprCod = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFEmprCod", AV58TFEmprCod);
      AV59TFEmprCod_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFEmprCod_Sel", AV59TFEmprCod_Sel);
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
      if ( GXutil.strcmp(AV27Session.getValue(AV82Pgmname+"GridState"), "") == 0 )
      {
         AV15GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV82Pgmname+"GridState"), null, null);
      }
      else
      {
         AV15GridState.fromxml(AV27Session.getValue(AV82Pgmname+"GridState"), null, null);
      }
      AV17OrderedBy = AV15GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17OrderedBy), 4, 0));
      AV18OrderedDsc = AV15GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedDsc", AV18OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV15GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV15GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV15GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV83GXV1 = 1 ;
      while ( AV83GXV1 <= AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV83GXV1));
         if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV20FilterFullText = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV20FilterFullText", AV20FilterFullText);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD") == 0 )
         {
            AV31TFHreMaqCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31TFHreMaqCod", AV31TFHreMaqCod);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREMAQCOD_SEL") == 0 )
         {
            AV32TFHreMaqCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFHreMaqCod_Sel", AV32TFHreMaqCod_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREVOLPRD") == 0 )
         {
            AV33TFHreVolPrd = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFHreVolPrd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFHreVolPrd), 5, 0));
            AV34TFHreVolPrd_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFHreVolPrd_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFHreVolPrd_To), 5, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRENUMCIE") == 0 )
         {
            AV35TFHreNumCie = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFHreNumCie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFHreNumCie), 2, 0));
            AV36TFHreNumCie_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFHreNumCie_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFHreNumCie_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHRELINMAQ") == 0 )
         {
            AV37TFHreLinMaq = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFHreLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFHreLinMaq), 4, 0));
            AV38TFHreLinMaq_To = (short)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFHreLinMaq_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFHreLinMaq_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARCOD") == 0 )
         {
            AV52TFHreBarCod = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFHreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFHreBarCod), 8, 0));
            AV53TFHreBarCod_To = (int)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFHreBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53TFHreBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARREO") == 0 )
         {
            AV54TFHreBarReo = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFHreBarReo", GXutil.str( AV54TFHreBarReo, 1, 0));
            AV55TFHreBarReo_To = (byte)(GXutil.lval( AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFHreBarReo_To", GXutil.str( AV55TFHreBarReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARPAR") == 0 )
         {
            AV56TFHreBarPar = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFHreBarPar", AV56TFHreBarPar);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFHREBARPAR_SEL") == 0 )
         {
            AV57TFHreBarPar_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFHreBarPar_Sel", AV57TFHreBarPar_Sel);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD") == 0 )
         {
            AV58TFEmprCod = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFEmprCod", AV58TFEmprCod);
         }
         else if ( GXutil.strcmp(AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFEMPRCOD_SEL") == 0 )
         {
            AV59TFEmprCod_Sel = AV16GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFEmprCod_Sel", AV59TFEmprCod_Sel);
         }
         AV83GXV1 = (int)(AV83GXV1+1) ;
      }
      GXt_char5 = "" ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFHreMaqCod_Sel)==0), AV32TFHreMaqCod_Sel, GXv_char8) ;
      historicoderecetas_wc_impl.this.GXt_char5 = GXv_char8[0] ;
      GXt_char16 = "" ;
      GXv_char7[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFHreBarPar_Sel)==0), AV57TFHreBarPar_Sel, GXv_char7) ;
      historicoderecetas_wc_impl.this.GXt_char16 = GXv_char7[0] ;
      GXt_char17 = "" ;
      GXv_char6[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFEmprCod_Sel)==0), AV59TFEmprCod_Sel, GXv_char6) ;
      historicoderecetas_wc_impl.this.GXt_char17 = GXv_char6[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char5+"||||||"+GXt_char16+"|"+GXt_char17 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char17 = "" ;
      GXv_char8[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFHreMaqCod)==0), AV31TFHreMaqCod, GXv_char8) ;
      historicoderecetas_wc_impl.this.GXt_char17 = GXv_char8[0] ;
      GXt_char16 = "" ;
      GXv_char7[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFHreBarPar)==0), AV56TFHreBarPar, GXv_char7) ;
      historicoderecetas_wc_impl.this.GXt_char16 = GXv_char7[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFEmprCod)==0), AV58TFEmprCod, GXv_char6) ;
      historicoderecetas_wc_impl.this.GXt_char5 = GXv_char6[0] ;
      Ddo_grid_Filteredtext_set = GXt_char17+"|"+((0==AV33TFHreVolPrd) ? "" : GXutil.str( AV33TFHreVolPrd, 5, 0))+"|"+((0==AV35TFHreNumCie) ? "" : GXutil.str( AV35TFHreNumCie, 2, 0))+"|"+((0==AV37TFHreLinMaq) ? "" : GXutil.str( AV37TFHreLinMaq, 4, 0))+"|"+((0==AV52TFHreBarCod) ? "" : GXutil.str( AV52TFHreBarCod, 8, 0))+"|"+((0==AV54TFHreBarReo) ? "" : GXutil.str( AV54TFHreBarReo, 1, 0))+"|"+GXt_char16+"|"+GXt_char5 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "|"+((0==AV34TFHreVolPrd_To) ? "" : GXutil.str( AV34TFHreVolPrd_To, 5, 0))+"|"+((0==AV36TFHreNumCie_To) ? "" : GXutil.str( AV36TFHreNumCie_To, 2, 0))+"|"+((0==AV38TFHreLinMaq_To) ? "" : GXutil.str( AV38TFHreLinMaq_To, 4, 0))+"|"+((0==AV53TFHreBarCod_To) ? "" : GXutil.str( AV53TFHreBarCod_To, 8, 0))+"|"+((0==AV55TFHreBarReo_To) ? "" : GXutil.str( AV55TFHreBarReo_To, 1, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV15GridState.fromxml(AV27Session.getValue(AV82Pgmname+"GridState"), null, null);
      AV15GridState.setgxTv_SdtWWPGridState_Orderedby( AV17OrderedBy );
      AV15GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV18OrderedDsc );
      AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV20FilterFullText)==0), (short)(0), AV20FilterFullText, "") ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHREMAQCOD", "", !(GXutil.strcmp("", AV31TFHreMaqCod)==0), (short)(0), AV31TFHreMaqCod, "", !(GXutil.strcmp("", AV32TFHreMaqCod_Sel)==0), AV32TFHreMaqCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHREVOLPRD", "", !((0==AV33TFHreVolPrd)&&(0==AV34TFHreVolPrd_To)), (short)(0), GXutil.trim( GXutil.str( AV33TFHreVolPrd, 5, 0)), GXutil.trim( GXutil.str( AV34TFHreVolPrd_To, 5, 0))) ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHRENUMCIE", "", !((0==AV35TFHreNumCie)&&(0==AV36TFHreNumCie_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFHreNumCie, 2, 0)), GXutil.trim( GXutil.str( AV36TFHreNumCie_To, 2, 0))) ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHRELINMAQ", "", !((0==AV37TFHreLinMaq)&&(0==AV38TFHreLinMaq_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFHreLinMaq, 4, 0)), GXutil.trim( GXutil.str( AV38TFHreLinMaq_To, 4, 0))) ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHREBARCOD", "", !((0==AV52TFHreBarCod)&&(0==AV53TFHreBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV52TFHreBarCod, 8, 0)), GXutil.trim( GXutil.str( AV53TFHreBarCod_To, 8, 0))) ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHREBARREO", "", !((0==AV54TFHreBarReo)&&(0==AV55TFHreBarReo_To)), (short)(0), GXutil.trim( GXutil.str( AV54TFHreBarReo, 1, 0)), GXutil.trim( GXutil.str( AV55TFHreBarReo_To, 1, 0))) ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFHREBARPAR", "", !(GXutil.strcmp("", AV56TFHreBarPar)==0), (short)(0), AV56TFHreBarPar, "", !(GXutil.strcmp("", AV57TFHreBarPar_Sel)==0), AV57TFHreBarPar_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      GXv_SdtWWPGridState18[0] = AV15GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState18, "TFEMPRCOD", "", !(GXutil.strcmp("", AV58TFEmprCod)==0), (short)(0), AV58TFEmprCod, "", !(GXutil.strcmp("", AV59TFEmprCod_Sel)==0), AV59TFEmprCod_Sel, "") ;
      AV15GridState = GXv_SdtWWPGridState18[0] ;
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7EmprCod );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV8HreBarCod) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8HreBarCod, 8, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (0==AV9HreBarReo) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARREO" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9HreBarReo, 1, 0) );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV10HreBarPar)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREBARPAR" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV10HreBarPar );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV11Hremaqcod)==0) )
      {
         AV16GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&HREMAQCOD" );
         AV16GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV11Hremaqcod );
         AV15GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV16GridStateFilterValue, 0);
      }
      AV15GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV15GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV82Pgmname+"GridState", AV15GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV13TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV82Pgmname );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV12HTTPRequest.getScriptName()+"?"+AV12HTTPRequest.getQuerystring() );
      AV13TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "HISREM" );
      AV27Session.setValue("TrnContext", AV13TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_25_1FU2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV28ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_30_1FU2( true) ;
      }
      else
      {
         wb_table2_30_1FU2( false) ;
      }
      return  ;
   }

   public void wb_table2_30_1FU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1FU2e( true) ;
      }
      else
      {
         wb_table1_25_1FU2e( false) ;
      }
   }

   public void wb_table2_30_1FU2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV20FilterFullText, GXutil.rtrim( localUtil.format( AV20FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_HistoricodeRecetas_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_30_1FU2e( true) ;
      }
      else
      {
         wb_table2_30_1FU2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV7EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      AV8HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreBarCod), 8, 0));
      AV9HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreBarReo", GXutil.str( AV9HreBarReo, 1, 0));
      AV10HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreBarPar", AV10HreBarPar);
      AV11Hremaqcod = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Hremaqcod", AV11Hremaqcod);
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
      pa1FU2( ) ;
      ws1FU2( ) ;
      we1FU2( ) ;
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
      sCtrlAV7EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8HreBarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV9HreBarReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV10HreBarPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV11Hremaqcod = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1FU2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "historicoderecetas_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1FU2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV7EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
         AV8HreBarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreBarCod), 8, 0));
         AV9HreBarReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreBarReo", GXutil.str( AV9HreBarReo, 1, 0));
         AV10HreBarPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreBarPar", AV10HreBarPar);
         AV11Hremaqcod = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Hremaqcod", AV11Hremaqcod);
      }
      wcpOAV7EmprCod = httpContext.cgiGet( sPrefix+"wcpOAV7EmprCod") ;
      wcpOAV8HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8HreBarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9HreBarReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10HreBarPar = httpContext.cgiGet( sPrefix+"wcpOAV10HreBarPar") ;
      wcpOAV11Hremaqcod = httpContext.cgiGet( sPrefix+"wcpOAV11Hremaqcod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV7EmprCod, wcpOAV7EmprCod) != 0 ) || ( AV8HreBarCod != wcpOAV8HreBarCod ) || ( AV9HreBarReo != wcpOAV9HreBarReo ) || ( GXutil.strcmp(AV10HreBarPar, wcpOAV10HreBarPar) != 0 ) || ( GXutil.strcmp(AV11Hremaqcod, wcpOAV11Hremaqcod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV7EmprCod = AV7EmprCod ;
      wcpOAV8HreBarCod = AV8HreBarCod ;
      wcpOAV9HreBarReo = AV9HreBarReo ;
      wcpOAV10HreBarPar = AV10HreBarPar ;
      wcpOAV11Hremaqcod = AV11Hremaqcod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV7EmprCod = httpContext.cgiGet( sPrefix+"AV7EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlAV7EmprCod) > 0 )
      {
         AV7EmprCod = httpContext.cgiGet( sCtrlAV7EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EmprCod", AV7EmprCod);
      }
      else
      {
         AV7EmprCod = httpContext.cgiGet( sPrefix+"AV7EmprCod_PARM") ;
      }
      sCtrlAV8HreBarCod = httpContext.cgiGet( sPrefix+"AV8HreBarCod_CTRL") ;
      if ( GXutil.len( sCtrlAV8HreBarCod) > 0 )
      {
         AV8HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8HreBarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8HreBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8HreBarCod), 8, 0));
      }
      else
      {
         AV8HreBarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8HreBarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV9HreBarReo = httpContext.cgiGet( sPrefix+"AV9HreBarReo_CTRL") ;
      if ( GXutil.len( sCtrlAV9HreBarReo) > 0 )
      {
         AV9HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9HreBarReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9HreBarReo", GXutil.str( AV9HreBarReo, 1, 0));
      }
      else
      {
         AV9HreBarReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9HreBarReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10HreBarPar = httpContext.cgiGet( sPrefix+"AV10HreBarPar_CTRL") ;
      if ( GXutil.len( sCtrlAV10HreBarPar) > 0 )
      {
         AV10HreBarPar = httpContext.cgiGet( sCtrlAV10HreBarPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10HreBarPar", AV10HreBarPar);
      }
      else
      {
         AV10HreBarPar = httpContext.cgiGet( sPrefix+"AV10HreBarPar_PARM") ;
      }
      sCtrlAV11Hremaqcod = httpContext.cgiGet( sPrefix+"AV11Hremaqcod_CTRL") ;
      if ( GXutil.len( sCtrlAV11Hremaqcod) > 0 )
      {
         AV11Hremaqcod = httpContext.cgiGet( sCtrlAV11Hremaqcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11Hremaqcod", AV11Hremaqcod);
      }
      else
      {
         AV11Hremaqcod = httpContext.cgiGet( sPrefix+"AV11Hremaqcod_PARM") ;
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
      pa1FU2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1FU2( ) ;
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
      ws1FU2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7EmprCod_PARM", GXutil.rtrim( AV7EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7EmprCod_CTRL", GXutil.rtrim( sCtrlAV7EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HreBarCod_PARM", GXutil.ltrim( localUtil.ntoc( AV8HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8HreBarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8HreBarCod_CTRL", GXutil.rtrim( sCtrlAV8HreBarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HreBarReo_PARM", GXutil.ltrim( localUtil.ntoc( AV9HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9HreBarReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9HreBarReo_CTRL", GXutil.rtrim( sCtrlAV9HreBarReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HreBarPar_PARM", GXutil.rtrim( AV10HreBarPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10HreBarPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10HreBarPar_CTRL", GXutil.rtrim( sCtrlAV10HreBarPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Hremaqcod_PARM", GXutil.rtrim( AV11Hremaqcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV11Hremaqcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV11Hremaqcod_CTRL", GXutil.rtrim( sCtrlAV11Hremaqcod));
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
      we1FU2( ) ;
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
      }
   }

   public void componentthemes( )
   {
      define_styles( ) ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
         }
      }
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211556987", true, true);
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
      httpContext.AddJavascriptSource("historicoderecetas_wc.js", "?20268211556988", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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

   public void subsflControlProps_432( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_idx ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD_"+sGXsfl_43_idx ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD_"+sGXsfl_43_idx ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE_"+sGXsfl_43_idx ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ_"+sGXsfl_43_idx ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD_"+sGXsfl_43_idx ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO_"+sGXsfl_43_idx ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR_"+sGXsfl_43_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT_"+sGXsfl_43_fel_idx ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD_"+sGXsfl_43_fel_idx ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD_"+sGXsfl_43_fel_idx ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE_"+sGXsfl_43_fel_idx ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ_"+sGXsfl_43_fel_idx ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD_"+sGXsfl_43_fel_idx ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO_"+sGXsfl_43_fel_idx ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR_"+sGXsfl_43_fel_idx ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb1FU0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_43_idx+"',43)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV50DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+"e221fu2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreMaqCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreMaqCod_Internalname,GXutil.rtrim( A4546HreMaqCod),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(edtHreMaqCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreVolPrd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreVolPrd_Internalname,GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4547HreVolPrd), "ZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreVolPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtHreVolPrd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreNumCie_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreNumCie_Internalname,GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4495HreNumCie), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreNumCie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtHreNumCie_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreLinMaq_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreLinMaq_Internalname,GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4545HreLinMaq), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreLinMaq_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn hidden-xs","",Integer.valueOf(edtHreLinMaq_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreBarCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4492HreBarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreBarCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtHreBarReo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4493HreBarReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreBarReo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtHreBarPar_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtHreBarPar_Internalname,GXutil.rtrim( A4494HreBarPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtHreBarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtHreBarPar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtEmprCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1FU2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreMaqCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreVolPrd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Volumen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreNumCie_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreLinMaq_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "##") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreBarCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreBarReo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtHreBarPar_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtEmprCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV50DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4546HreMaqCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreMaqCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4547HreVolPrd, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreVolPrd_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4495HreNumCie, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreNumCie_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4545HreLinMaq, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreLinMaq_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4492HreBarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreBarCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4493HreBarReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreBarReo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4494HreBarPar));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtHreBarPar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtEmprCod_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnrecetahistorico_Internalname = sPrefix+"BTNRECETAHISTORICO" ;
      bttBtnrecetacostes_Internalname = sPrefix+"BTNRECETACOSTES" ;
      bttBtnrecetaconnormas_Internalname = sPrefix+"BTNRECETACONNORMAS" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = sPrefix+"vDETAILWEBCOMPONENT" ;
      edtHreMaqCod_Internalname = sPrefix+"HREMAQCOD" ;
      edtHreVolPrd_Internalname = sPrefix+"HREVOLPRD" ;
      edtHreNumCie_Internalname = sPrefix+"HRENUMCIE" ;
      edtHreLinMaq_Internalname = sPrefix+"HRELINMAQ" ;
      edtHreBarCod_Internalname = sPrefix+"HREBARCOD" ;
      edtHreBarReo_Internalname = sPrefix+"HREBARREO" ;
      edtHreBarPar_Internalname = sPrefix+"HREBARPAR" ;
      edtEmprCod_Internalname = sPrefix+"EMPRCOD" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = sPrefix+"CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtEmprCod_Jsonclick = "" ;
      edtHreBarPar_Jsonclick = "" ;
      edtHreBarReo_Jsonclick = "" ;
      edtHreBarCod_Jsonclick = "" ;
      edtHreLinMaq_Jsonclick = "" ;
      edtHreNumCie_Jsonclick = "" ;
      edtHreVolPrd_Jsonclick = "" ;
      edtHreMaqCod_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtEmprCod_Visible = -1 ;
      edtHreBarPar_Visible = -1 ;
      edtHreBarReo_Visible = -1 ;
      edtHreBarCod_Visible = -1 ;
      edtHreLinMaq_Visible = -1 ;
      edtHreNumCie_Visible = -1 ;
      edtHreVolPrd_Visible = -1 ;
      edtHreMaqCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "HistoricodeRecetas_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic||||||Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T||||||T|T" ;
      Ddo_grid_Filterisrange = "|T|T|T|T|T||" ;
      Ddo_grid_Filtertype = "Character|Numeric|Numeric|Numeric|Numeric|Numeric|Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "1:HreMaqCod|2:HreVolPrd|3:HreNumCie|4:HreLinMaq|5:HreBarCod|6:HreBarReo|7:HreBarPar|8:EmprCod" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_tableheader_Cls = "PanelNoHeader" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
      subGrid_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV9HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV10HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV11Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV45PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV46ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtHreNumCie_Visible',ctrl:'HRENUMCIE',prop:'Visible'},{av:'edtHreLinMaq_Visible',ctrl:'HRELINMAQ',prop:'Visible'},{av:'edtHreBarCod_Visible',ctrl:'HREBARCOD',prop:'Visible'},{av:'edtHreBarReo_Visible',ctrl:'HREBARREO',prop:'Visible'},{av:'edtHreBarPar_Visible',ctrl:'HREBARPAR',prop:'Visible'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121FU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV9HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV10HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV11Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV45PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV46ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131FU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV9HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV10HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV11Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV45PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV46ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141FU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV9HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV10HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV11Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV45PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV46ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211FU2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV50DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151FU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV9HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV10HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV11Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV45PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV46ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtHreNumCie_Visible',ctrl:'HRENUMCIE',prop:'Visible'},{av:'edtHreLinMaq_Visible',ctrl:'HRELINMAQ',prop:'Visible'},{av:'edtHreBarCod_Visible',ctrl:'HREBARCOD',prop:'Visible'},{av:'edtHreBarReo_Visible',ctrl:'HREBARREO',prop:'Visible'},{av:'edtHreBarPar_Visible',ctrl:'HREBARPAR',prop:'Visible'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111FU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV9HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV10HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV11Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV45PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV46ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtHreNumCie_Visible',ctrl:'HRENUMCIE',prop:'Visible'},{av:'edtHreLinMaq_Visible',ctrl:'HRELINMAQ',prop:'Visible'},{av:'edtHreBarCod_Visible',ctrl:'HREBARCOD',prop:'Visible'},{av:'edtHreBarReo_Visible',ctrl:'HREBARREO',prop:'Visible'},{av:'edtHreBarPar_Visible',ctrl:'HREBARPAR',prop:'Visible'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DORECETAHISTORICO'","{handler:'e181FU2',iparms:[{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("'DORECETAHISTORICO'",",oparms:[{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORECETACOSTES'","{handler:'e161FU2',iparms:[{av:'AV44Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'AV45PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV46ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DORECETACOSTES'",",oparms:[{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DORECETACONNORMAS'","{handler:'e171FU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV20FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8HreBarCod',fld:'vHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV9HreBarReo',fld:'vHREBARREO',pic:'9'},{av:'AV10HreBarPar',fld:'vHREBARPAR',pic:''},{av:'AV11Hremaqcod',fld:'vHREMAQCOD',pic:''},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31TFHreMaqCod',fld:'vTFHREMAQCOD',pic:''},{av:'AV32TFHreMaqCod_Sel',fld:'vTFHREMAQCOD_SEL',pic:''},{av:'AV33TFHreVolPrd',fld:'vTFHREVOLPRD',pic:'ZZZZ9'},{av:'AV34TFHreVolPrd_To',fld:'vTFHREVOLPRD_TO',pic:'ZZZZ9'},{av:'AV35TFHreNumCie',fld:'vTFHRENUMCIE',pic:'Z9'},{av:'AV36TFHreNumCie_To',fld:'vTFHRENUMCIE_TO',pic:'Z9'},{av:'AV37TFHreLinMaq',fld:'vTFHRELINMAQ',pic:'ZZZ9'},{av:'AV38TFHreLinMaq_To',fld:'vTFHRELINMAQ_TO',pic:'ZZZ9'},{av:'AV52TFHreBarCod',fld:'vTFHREBARCOD',pic:'ZZZZZZZ9'},{av:'AV53TFHreBarCod_To',fld:'vTFHREBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV54TFHreBarReo',fld:'vTFHREBARREO',pic:'9'},{av:'AV55TFHreBarReo_To',fld:'vTFHREBARREO_TO',pic:'9'},{av:'AV56TFHreBarPar',fld:'vTFHREBARPAR',pic:''},{av:'AV57TFHreBarPar_Sel',fld:'vTFHREBARPAR_SEL',pic:''},{av:'AV58TFEmprCod',fld:'vTFEMPRCOD',pic:'@!'},{av:'AV59TFEmprCod_Sel',fld:'vTFEMPRCOD_SEL',pic:'@!'},{av:'AV82Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV17OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV18OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV44Receta',fld:'vRECETA',pic:'ZZZ9',hsh:true},{av:'AV45PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV46ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'sPrefix'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("'DORECETACONNORMAS'",",oparms:[{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV30ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV25ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtHreMaqCod_Visible',ctrl:'HREMAQCOD',prop:'Visible'},{av:'edtHreVolPrd_Visible',ctrl:'HREVOLPRD',prop:'Visible'},{av:'edtHreNumCie_Visible',ctrl:'HRENUMCIE',prop:'Visible'},{av:'edtHreLinMaq_Visible',ctrl:'HRELINMAQ',prop:'Visible'},{av:'edtHreBarCod_Visible',ctrl:'HREBARCOD',prop:'Visible'},{av:'edtHreBarReo_Visible',ctrl:'HREBARREO',prop:'Visible'},{av:'edtHreBarPar_Visible',ctrl:'HREBARPAR',prop:'Visible'},{av:'edtEmprCod_Visible',ctrl:'EMPRCOD',prop:'Visible'},{av:'AV41GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV42GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV28ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV15GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e221FU2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4492HreBarCod',fld:'HREBARCOD',pic:'ZZZZZZZ9'},{av:'A4493HreBarReo',fld:'HREBARREO',pic:'9'},{av:'A4494HreBarPar',fld:'HREBARPAR',pic:''},{av:'A4545HreLinMaq',fld:'HRELINMAQ',pic:'ZZZ9'},{av:'A4495HreNumCie',fld:'HRENUMCIE',pic:'Z9'}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("NULL","{handler:'valid_Emprcod',iparms:[]");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV10HreBarPar = "" ;
      wcpOAV11Hremaqcod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV7EmprCod = "" ;
      AV10HreBarPar = "" ;
      AV11Hremaqcod = "" ;
      AV20FilterFullText = "" ;
      AV25ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV31TFHreMaqCod = "" ;
      AV32TFHreMaqCod_Sel = "" ;
      AV56TFHreBarPar = "" ;
      AV57TFHreBarPar_Sel = "" ;
      AV58TFEmprCod = "" ;
      AV59TFEmprCod_Sel = "" ;
      AV82Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV28ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV39DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV15GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnrecetahistorico_Jsonclick = "" ;
      bttBtnrecetacostes_Jsonclick = "" ;
      bttBtnrecetaconnormas_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV50DetailWebComponent = "" ;
      A4546HreMaqCod = "" ;
      A4494HreBarPar = "" ;
      A396EmprCod = "" ;
      scmdbuf = "" ;
      lV65Historicoderecetas_wcds_1_filterfulltext = "" ;
      lV66Historicoderecetas_wcds_2_tfhremaqcod = "" ;
      lV78Historicoderecetas_wcds_14_tfhrebarpar = "" ;
      lV80Historicoderecetas_wcds_16_tfemprcod = "" ;
      AV65Historicoderecetas_wcds_1_filterfulltext = "" ;
      AV67Historicoderecetas_wcds_3_tfhremaqcod_sel = "" ;
      AV66Historicoderecetas_wcds_2_tfhremaqcod = "" ;
      AV79Historicoderecetas_wcds_15_tfhrebarpar_sel = "" ;
      AV78Historicoderecetas_wcds_14_tfhrebarpar = "" ;
      AV81Historicoderecetas_wcds_17_tfemprcod_sel = "" ;
      AV80Historicoderecetas_wcds_16_tfemprcod = "" ;
      H01FU2_A396EmprCod = new String[] {""} ;
      H01FU2_A4494HreBarPar = new String[] {""} ;
      H01FU2_A4493HreBarReo = new byte[1] ;
      H01FU2_A4492HreBarCod = new int[1] ;
      H01FU2_A4545HreLinMaq = new short[1] ;
      H01FU2_A4495HreNumCie = new byte[1] ;
      H01FU2_A4547HreVolPrd = new int[1] ;
      H01FU2_n4547HreVolPrd = new boolean[] {false} ;
      H01FU2_A4546HreMaqCod = new String[] {""} ;
      H01FU2_n4546HreMaqCod = new boolean[] {false} ;
      H01FU3_AGRID_nRecordCount = new long[1] ;
      GXv_int4 = new int[1] ;
      GXv_int2 = new byte[1] ;
      AV62Station = "" ;
      AV63Emprnom = "" ;
      AV64Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV27Session = httpContext.getWebSession();
      AV23ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV29ManageFiltersXml = "" ;
      AV48WebSession = httpContext.getWebSession();
      AV49Window = new com.genexus.webpanels.GXWindow();
      AV24UserCustomValue = "" ;
      AV26ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV16GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char17 = "" ;
      GXv_char8 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char7 = new String[1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      GXv_SdtWWPGridState18 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV13TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV7EmprCod = "" ;
      sCtrlAV8HreBarCod = "" ;
      sCtrlAV9HreBarReo = "" ;
      sCtrlAV10HreBarPar = "" ;
      sCtrlAV11Hremaqcod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.historicoderecetas_wc__default(),
         new Object[] {
             new Object[] {
            H01FU2_A396EmprCod, H01FU2_A4494HreBarPar, H01FU2_A4493HreBarReo, H01FU2_A4492HreBarCod, H01FU2_A4545HreLinMaq, H01FU2_A4495HreNumCie, H01FU2_A4547HreVolPrd, H01FU2_n4547HreVolPrd, H01FU2_A4546HreMaqCod, H01FU2_n4546HreMaqCod
            }
            , new Object[] {
            H01FU3_AGRID_nRecordCount
            }
         }
      );
      AV82Pgmname = "HistoricodeRecetas_WC" ;
      /* GeneXus formulas. */
      AV82Pgmname = "HistoricodeRecetas_WC" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV9HreBarReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV9HreBarReo ;
   private byte AV30ManageFiltersExecutionStep ;
   private byte AV35TFHreNumCie ;
   private byte AV36TFHreNumCie_To ;
   private byte AV54TFHreBarReo ;
   private byte AV55TFHreBarReo_To ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A4495HreNumCie ;
   private byte A4493HreBarReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV70Historicoderecetas_wcds_6_tfhrenumcie ;
   private byte AV71Historicoderecetas_wcds_7_tfhrenumcie_to ;
   private byte AV76Historicoderecetas_wcds_12_tfhrebarreo ;
   private byte AV77Historicoderecetas_wcds_13_tfhrebarreo_to ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV37TFHreLinMaq ;
   private short AV38TFHreLinMaq_To ;
   private short AV17OrderedBy ;
   private short AV44Receta ;
   private short AV45PwdGrl ;
   private short wbEnd ;
   private short wbStart ;
   private short A4545HreLinMaq ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV72Historicoderecetas_wcds_8_tfhrelinmaq ;
   private short AV73Historicoderecetas_wcds_9_tfhrelinmaq_to ;
   private short AV47anahuac ;
   private int wcpOAV8HreBarCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV8HreBarCod ;
   private int nGXsfl_43_idx=1 ;
   private int AV33TFHreVolPrd ;
   private int AV34TFHreVolPrd_To ;
   private int AV52TFHreBarCod ;
   private int AV53TFHreBarCod_To ;
   private int AV46ContVal ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A4547HreVolPrd ;
   private int A4492HreBarCod ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV68Historicoderecetas_wcds_4_tfhrevolprd ;
   private int AV69Historicoderecetas_wcds_5_tfhrevolprd_to ;
   private int AV74Historicoderecetas_wcds_10_tfhrebarcod ;
   private int AV75Historicoderecetas_wcds_11_tfhrebarcod_to ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int edtHreMaqCod_Visible ;
   private int edtHreVolPrd_Visible ;
   private int edtHreNumCie_Visible ;
   private int edtHreLinMaq_Visible ;
   private int edtHreBarCod_Visible ;
   private int edtHreBarReo_Visible ;
   private int edtHreBarPar_Visible ;
   private int edtEmprCod_Visible ;
   private int AV40PageToGo ;
   private int AV83GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV41GridCurrentPage ;
   private long AV42GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV10HreBarPar ;
   private String wcpOAV11Hremaqcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV7EmprCod ;
   private String AV10HreBarPar ;
   private String AV11Hremaqcod ;
   private String sGXsfl_43_idx="0001" ;
   private String AV31TFHreMaqCod ;
   private String AV32TFHreMaqCod_Sel ;
   private String AV56TFHreBarPar ;
   private String AV57TFHreBarPar_Sel ;
   private String AV58TFEmprCod ;
   private String AV59TFEmprCod_Sel ;
   private String AV82Pgmname ;
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
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnrecetahistorico_Internalname ;
   private String bttBtnrecetahistorico_Jsonclick ;
   private String bttBtnrecetacostes_Internalname ;
   private String bttBtnrecetacostes_Jsonclick ;
   private String bttBtnrecetaconnormas_Internalname ;
   private String bttBtnrecetaconnormas_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDetailwebcomponent_Internalname ;
   private String AV50DetailWebComponent ;
   private String A4546HreMaqCod ;
   private String edtHreMaqCod_Internalname ;
   private String edtHreVolPrd_Internalname ;
   private String edtHreNumCie_Internalname ;
   private String edtHreLinMaq_Internalname ;
   private String edtHreBarCod_Internalname ;
   private String edtHreBarReo_Internalname ;
   private String A4494HreBarPar ;
   private String edtHreBarPar_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV66Historicoderecetas_wcds_2_tfhremaqcod ;
   private String lV78Historicoderecetas_wcds_14_tfhrebarpar ;
   private String lV80Historicoderecetas_wcds_16_tfemprcod ;
   private String AV67Historicoderecetas_wcds_3_tfhremaqcod_sel ;
   private String AV66Historicoderecetas_wcds_2_tfhremaqcod ;
   private String AV79Historicoderecetas_wcds_15_tfhrebarpar_sel ;
   private String AV78Historicoderecetas_wcds_14_tfhrebarpar ;
   private String AV81Historicoderecetas_wcds_17_tfemprcod_sel ;
   private String AV80Historicoderecetas_wcds_16_tfemprcod ;
   private String AV62Station ;
   private String AV63Emprnom ;
   private String AV64Usurcod ;
   private String GXt_char17 ;
   private String GXv_char8[] ;
   private String GXt_char16 ;
   private String GXv_char7[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV7EmprCod ;
   private String sCtrlAV8HreBarCod ;
   private String sCtrlAV9HreBarReo ;
   private String sCtrlAV10HreBarPar ;
   private String sCtrlAV11Hremaqcod ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtHreMaqCod_Jsonclick ;
   private String edtHreVolPrd_Jsonclick ;
   private String edtHreNumCie_Jsonclick ;
   private String edtHreLinMaq_Jsonclick ;
   private String edtHreBarCod_Jsonclick ;
   private String edtHreBarReo_Jsonclick ;
   private String edtHreBarPar_Jsonclick ;
   private String edtEmprCod_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV18OrderedDsc ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4546HreMaqCod ;
   private boolean n4547HreVolPrd ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV43ClaveConfirmada ;
   private String AV23ColumnsSelectorXML ;
   private String AV29ManageFiltersXml ;
   private String AV24UserCustomValue ;
   private String AV20FilterFullText ;
   private String lV65Historicoderecetas_wcds_1_filterfulltext ;
   private String AV65Historicoderecetas_wcds_1_filterfulltext ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.GXWindow AV49Window ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV12HTTPRequest ;
   private com.genexus.webpanels.WebSession AV27Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01FU2_A396EmprCod ;
   private String[] H01FU2_A4494HreBarPar ;
   private byte[] H01FU2_A4493HreBarReo ;
   private int[] H01FU2_A4492HreBarCod ;
   private short[] H01FU2_A4545HreLinMaq ;
   private byte[] H01FU2_A4495HreNumCie ;
   private int[] H01FU2_A4547HreVolPrd ;
   private boolean[] H01FU2_n4547HreVolPrd ;
   private String[] H01FU2_A4546HreMaqCod ;
   private boolean[] H01FU2_n4546HreMaqCod ;
   private long[] H01FU3_AGRID_nRecordCount ;
   private com.genexus.webpanels.WebSession AV48WebSession ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV28ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV13TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV15GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState18[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV16GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV25ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV39DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
}

final  class historicoderecetas_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01FU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Historicoderecetas_wcds_1_filterfulltext ,
                                          String AV67Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                          String AV66Historicoderecetas_wcds_2_tfhremaqcod ,
                                          int AV68Historicoderecetas_wcds_4_tfhrevolprd ,
                                          int AV69Historicoderecetas_wcds_5_tfhrevolprd_to ,
                                          byte AV70Historicoderecetas_wcds_6_tfhrenumcie ,
                                          byte AV71Historicoderecetas_wcds_7_tfhrenumcie_to ,
                                          short AV72Historicoderecetas_wcds_8_tfhrelinmaq ,
                                          short AV73Historicoderecetas_wcds_9_tfhrelinmaq_to ,
                                          int AV74Historicoderecetas_wcds_10_tfhrebarcod ,
                                          int AV75Historicoderecetas_wcds_11_tfhrebarcod_to ,
                                          byte AV76Historicoderecetas_wcds_12_tfhrebarreo ,
                                          byte AV77Historicoderecetas_wcds_13_tfhrebarreo_to ,
                                          String AV79Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                          String AV78Historicoderecetas_wcds_14_tfhrebarpar ,
                                          String AV81Historicoderecetas_wcds_17_tfemprcod_sel ,
                                          String AV80Historicoderecetas_wcds_16_tfemprcod ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          String A396EmprCod ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV11Hremaqcod ,
                                          String AV7EmprCod ,
                                          int AV8HreBarCod ,
                                          byte AV9HreBarReo ,
                                          String AV10HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[34];
      Object[] GXv_Object20 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, HreBarPar, HreBarReo, HreBarCod, HreLinMaq, HreNumCie, HreVolPrd, HreMaqCod" ;
      sFromString = " FROM TXPHISREM" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?)");
      addWhere(sWhereString, "(HreMaqCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Historicoderecetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(HreMaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreNumCie,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarReo,'90'), 2) like '%' || ?) or ( UPPER(HreBarPar) like '%' || UPPER(?)) or ( UPPER(EmprCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
         GXv_int19[8] = (byte)(1) ;
         GXv_int19[9] = (byte)(1) ;
         GXv_int19[10] = (byte)(1) ;
         GXv_int19[11] = (byte)(1) ;
         GXv_int19[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Historicoderecetas_wcds_2_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(HreMaqCod = ?)");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (0==AV68Historicoderecetas_wcds_4_tfhrevolprd) )
      {
         addWhere(sWhereString, "(HreVolPrd >= ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (0==AV69Historicoderecetas_wcds_5_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(HreVolPrd <= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (0==AV70Historicoderecetas_wcds_6_tfhrenumcie) )
      {
         addWhere(sWhereString, "(HreNumCie >= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Historicoderecetas_wcds_7_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(HreNumCie <= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Historicoderecetas_wcds_8_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(HreLinMaq >= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_wcds_9_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(HreLinMaq <= ?)");
      }
      else
      {
         GXv_int19[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_wcds_10_tfhrebarcod) )
      {
         addWhere(sWhereString, "(HreBarCod >= ?)");
      }
      else
      {
         GXv_int19[21] = (byte)(1) ;
      }
      if ( ! (0==AV75Historicoderecetas_wcds_11_tfhrebarcod_to) )
      {
         addWhere(sWhereString, "(HreBarCod <= ?)");
      }
      else
      {
         GXv_int19[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Historicoderecetas_wcds_12_tfhrebarreo) )
      {
         addWhere(sWhereString, "(HreBarReo >= ?)");
      }
      else
      {
         GXv_int19[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Historicoderecetas_wcds_13_tfhrebarreo_to) )
      {
         addWhere(sWhereString, "(HreBarReo <= ?)");
      }
      else
      {
         GXv_int19[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) && ( ! (GXutil.strcmp("", AV78Historicoderecetas_wcds_14_tfhrebarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreBarPar = ?)");
      }
      else
      {
         GXv_int19[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Historicoderecetas_wcds_17_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Historicoderecetas_wcds_16_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Historicoderecetas_wcds_17_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int19[28] = (byte)(1) ;
      }
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY HreMaqCod" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreMaqCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY HreVolPrd" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreVolPrd DESC" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY HreNumCie" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreNumCie DESC" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY HreLinMaq" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreLinMaq DESC" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY HreBarCod" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreBarCod DESC" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY HreBarReo" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreBarReo DESC" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY HreBarPar" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY HreBarPar DESC" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         sOrderString += " ORDER BY EmprCod" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         sOrderString += " ORDER BY EmprCod DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
   }

   protected Object[] conditional_H01FU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV65Historicoderecetas_wcds_1_filterfulltext ,
                                          String AV67Historicoderecetas_wcds_3_tfhremaqcod_sel ,
                                          String AV66Historicoderecetas_wcds_2_tfhremaqcod ,
                                          int AV68Historicoderecetas_wcds_4_tfhrevolprd ,
                                          int AV69Historicoderecetas_wcds_5_tfhrevolprd_to ,
                                          byte AV70Historicoderecetas_wcds_6_tfhrenumcie ,
                                          byte AV71Historicoderecetas_wcds_7_tfhrenumcie_to ,
                                          short AV72Historicoderecetas_wcds_8_tfhrelinmaq ,
                                          short AV73Historicoderecetas_wcds_9_tfhrelinmaq_to ,
                                          int AV74Historicoderecetas_wcds_10_tfhrebarcod ,
                                          int AV75Historicoderecetas_wcds_11_tfhrebarcod_to ,
                                          byte AV76Historicoderecetas_wcds_12_tfhrebarreo ,
                                          byte AV77Historicoderecetas_wcds_13_tfhrebarreo_to ,
                                          String AV79Historicoderecetas_wcds_15_tfhrebarpar_sel ,
                                          String AV78Historicoderecetas_wcds_14_tfhrebarpar ,
                                          String AV81Historicoderecetas_wcds_17_tfemprcod_sel ,
                                          String AV80Historicoderecetas_wcds_16_tfemprcod ,
                                          String A4546HreMaqCod ,
                                          int A4547HreVolPrd ,
                                          byte A4495HreNumCie ,
                                          short A4545HreLinMaq ,
                                          int A4492HreBarCod ,
                                          byte A4493HreBarReo ,
                                          String A4494HreBarPar ,
                                          String A396EmprCod ,
                                          short AV17OrderedBy ,
                                          boolean AV18OrderedDsc ,
                                          String AV11Hremaqcod ,
                                          String AV7EmprCod ,
                                          int AV8HreBarCod ,
                                          byte AV9HreBarReo ,
                                          String AV10HreBarPar )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[29];
      Object[] GXv_Object22 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPHISREM" ;
      addWhere(sWhereString, "(EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ?)");
      addWhere(sWhereString, "(HreMaqCod = ?)");
      if ( ! (GXutil.strcmp("", AV65Historicoderecetas_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(HreMaqCod) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(HreVolPrd,'99990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreNumCie,'90'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreLinMaq,'9990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarCod,'99999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(HreBarReo,'90'), 2) like '%' || ?) or ( UPPER(HreBarPar) like '%' || UPPER(?)) or ( UPPER(EmprCod) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
         GXv_int21[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV67Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) && ( ! (GXutil.strcmp("", AV66Historicoderecetas_wcds_2_tfhremaqcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreMaqCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67Historicoderecetas_wcds_3_tfhremaqcod_sel)==0) )
      {
         addWhere(sWhereString, "(HreMaqCod = ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (0==AV68Historicoderecetas_wcds_4_tfhrevolprd) )
      {
         addWhere(sWhereString, "(HreVolPrd >= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( ! (0==AV69Historicoderecetas_wcds_5_tfhrevolprd_to) )
      {
         addWhere(sWhereString, "(HreVolPrd <= ?)");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (0==AV70Historicoderecetas_wcds_6_tfhrenumcie) )
      {
         addWhere(sWhereString, "(HreNumCie >= ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (0==AV71Historicoderecetas_wcds_7_tfhrenumcie_to) )
      {
         addWhere(sWhereString, "(HreNumCie <= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (0==AV72Historicoderecetas_wcds_8_tfhrelinmaq) )
      {
         addWhere(sWhereString, "(HreLinMaq >= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (0==AV73Historicoderecetas_wcds_9_tfhrelinmaq_to) )
      {
         addWhere(sWhereString, "(HreLinMaq <= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (0==AV74Historicoderecetas_wcds_10_tfhrebarcod) )
      {
         addWhere(sWhereString, "(HreBarCod >= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( ! (0==AV75Historicoderecetas_wcds_11_tfhrebarcod_to) )
      {
         addWhere(sWhereString, "(HreBarCod <= ?)");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (0==AV76Historicoderecetas_wcds_12_tfhrebarreo) )
      {
         addWhere(sWhereString, "(HreBarReo >= ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( ! (0==AV77Historicoderecetas_wcds_13_tfhrebarreo_to) )
      {
         addWhere(sWhereString, "(HreBarReo <= ?)");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) && ( ! (GXutil.strcmp("", AV78Historicoderecetas_wcds_14_tfhrebarpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(HreBarPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Historicoderecetas_wcds_15_tfhrebarpar_sel)==0) )
      {
         addWhere(sWhereString, "(HreBarPar = ?)");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Historicoderecetas_wcds_17_tfemprcod_sel)==0) && ( ! (GXutil.strcmp("", AV80Historicoderecetas_wcds_16_tfemprcod)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(EmprCod) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Historicoderecetas_wcds_17_tfemprcod_sel)==0) )
      {
         addWhere(sWhereString, "(EmprCod = ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV17OrderedBy == 1 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 1 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 2 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 3 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 4 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 5 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 6 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 7 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ! AV18OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV17OrderedBy == 8 ) && ( AV18OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
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
                  return conditional_H01FU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
            case 1 :
                  return conditional_H01FU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , ((Number) dynConstraints[3]).intValue() , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).byteValue() , ((Number) dynConstraints[6]).byteValue() , ((Number) dynConstraints[7]).shortValue() , ((Number) dynConstraints[8]).shortValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , ((Number) dynConstraints[11]).byteValue() , ((Number) dynConstraints[12]).byteValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).byteValue() , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Number) dynConstraints[25]).shortValue() , ((Boolean) dynConstraints[26]).booleanValue() , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).intValue() , ((Number) dynConstraints[30]).byteValue() , (String)dynConstraints[31] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01FU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01FU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[34], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[36]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[51]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[53]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[54]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[57]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[58]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 3);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[63]).intValue());
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[64]).intValue());
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[65]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 6);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 6);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[46]).byteValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[47]).byteValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[48]).shortValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[52]).byteValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[53]).byteValue());
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 1);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 1);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 3);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 3);
               }
               return;
      }
   }

}

